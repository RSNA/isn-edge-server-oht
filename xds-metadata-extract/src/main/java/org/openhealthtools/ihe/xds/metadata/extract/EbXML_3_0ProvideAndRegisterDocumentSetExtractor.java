/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.xds.metadata.extract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimFactory;
import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;
import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.ParentDocumentRelationshipType;
import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;

/**
 * Class to extract complete metadata from ebRIM 3.0 elements.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0ProvideAndRegisterDocumentSetExtractor implements
		ProvideAndRegisterDocumentSetExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_3_0_PRDS_EXTR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0ProvideAndRegisterDocumentSetExtractor.class);
	
	/** EbXML structure for submission transaction metadata */
	private SubmitObjectsRequestType transactionData;
	
	// data members to assist in building the submission data
	/** list of registry pacakges found in the SubmitObjectsRequest */
	private ArrayList registryPackages;
	
	/** list of extrinsic objects found in the SubmitObjectsRequest */
	private ArrayList extrinsicObjects;
	
	/** list of classifications found in the SubmitObjectsRequest */
	private ArrayList classifications;
	
	/** list of associations found in the SubmitObjectsRequest */
	private ArrayList associations;
	
	/**
	 * Loads the ebXML structures containing entire Submission Transaction metadata.
	 * UUIDs for classificationSchemes, identificationSchemes, objectTypes and
	 * associationTypes are expected to conform to those fixed by XDS documentataion.
	 * Minimally must include:
	 * <1>One RegistryPackage for the SubmissionSet metadata and one Classification that identifies this
	 * RegistryPackage as SubmissionSet metadata.This REgistryPacakge must have a populated id attribute.</l>
	 * Including other components is subject to the following:
	 * <1>Each ExtrinsicObject for DocumentEntry metadata must have a populated id attribute.</l>
	 * <1>Each RegistryPackage for the Folder metadata must have a corresponding Classification 
	 * that identifies this RegistryPackage as Folder metadata. This RegistryPacakge must have a 
	 * populated id attribute.</l>
	 * <l> For each DocumentEntry that is contained in a particular folder, an Association
	 * must be present to indicate so. </l>
	 * @see org.openhealthtools.ihe.xds.metadata.constants.UUIDs
	 * @param transactionData SubmitObjectsRequest containing entire metadata
	 * (all document entries, all folders the submission set) and additional classifications 
	 * and associations for a submission transaction.
	 */
	public EbXML_3_0ProvideAndRegisterDocumentSetExtractor(SubmitObjectsRequestType transactionData) {
		this.transactionData = transactionData;
	}

	
	/** 
	 * Builds an ProvideAndRegisterDocumentSetTypeType containing:
	 * <1>One DocumentEntry for each ExtrinsicObject, assumed to be document entries </l>
	 * <l>One Folder for each RegistryPackage identified to be a folder</l>
	 * <l>One SubmissionSet for the (single) RegistryPackage identified to be a submission set</l>
	 * Construction assumes that standard
	 * HL7 V2.5 message delimiters are used. See
	 * {@link org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters}. Length
	 * restrictions are not implemented, presently. 
	 * <br>
	 * IMPORTANT NOTE: IHE 2007-2008 CP 237 to XDS negates the following previous note
	 * <br>
	 * [NOTE: We note that documents and folders with corresponding ExtrinsicObjects/RegistryPackages
	 * (respectively) in the current SubmitObjectRequest will appear on the appropriate associated document and folder
	 * lists for the submission set.  EbXML Associations that represent the linking of existing documents
	 * and existing folders to the current submission set will all appear on it's list of associated documents.
	 * This is because there is no way (currently) in the ebXML to distinguish 
	 * an existing folder from an existing document entry in this context.]
	 * @see org.openhealthtools.ihe.xds.metadata.extract.ProvideAndRegisterDocumentSetExtractor#extract()
	 */
	public ProvideAndRegisterDocumentSetType extract() throws MetadataExtractionException{
		if(this.transactionData.getRegistryObjectList() == null){
			logger.error("RegistryObjectList is null, cannot execute extraction.");
			throw new MetadataExtractionException ("RegistryObjectList is null, cannot execute extraction.");
		}
		if(this.transactionData.getRegistryObjectList().getIdentifiable() == null){
			logger.error("RegistryObjectList has no Identifiable sub-elements, cannot execute extraction.");
			throw new MetadataExtractionException ("RegistryObjectList has no Identifiable sub-elements, cannot execute extraction.");
		}
		// sort out the registry object list content into registry packages, 
		// extrinsic objects, classifications and associations
		this.sortContent(this.transactionData.getRegistryObjectList().getIdentifiable());
		
		if(this.registryPackages == null){
			logger.error("List of RegistryPackage is null, cannot execute extraction.");
			throw new MetadataExtractionException ("List of RegistryPackage is null, cannot execute extraction.");
		}
		if(this.registryPackages.isEmpty()){
			logger.error("List of RegistryPackage is empty, cannot execute extraction.");
			throw new MetadataExtractionException ("List of RegistryPackage is empty, cannot execute extraction.");
		}
		if(this.classifications == null){
			logger.error("List of Classification is null, cannot execute extraction.");
			throw new MetadataExtractionException ("List of Classification is null, cannot execute extraction.");
		}
		if(this.classifications.isEmpty()){
			logger.error("List of Classification is empty, cannot execute extraction.");
			throw new MetadataExtractionException ("List of Classification is empty, cannot execute extraction.");
		}
		// the return object
		ProvideAndRegisterDocumentSetType docSet = MetadataFactory.eINSTANCE.createProvideAndRegisterDocumentSetType();
		
		// extract the submission set
		if(logger.isDebugEnabled()){
			logger.debug("Extracting the Submission Set.");
		}
		extractSubmissionSet(docSet);
		
		// extract document entries
		if(logger.isDebugEnabled()){
			logger.debug("Extracting the Document Entries.");
		}
		extractDocumentEntries(docSet);
		
		// extract folders
		if(logger.isDebugEnabled()){
			logger.debug("Extracting any Folders.");
		}
		extractFolders(docSet);
		
		return docSet;
	}
	/** method to assist in binning the content of the registry object list into: 
	 * extrinsic objects, registry packages, classifications and associations
	 */
	private void sortContent(List list){
		Iterator i = list.iterator();
		while(i.hasNext()){
			IdentifiableType ident = (IdentifiableType)i.next();
			if(ident instanceof RegistryPackageType){
				if(this.registryPackages == null){
					this.registryPackages = new ArrayList();
				}
				this.registryPackages.add(ident);
			}
			else if(ident instanceof ExtrinsicObjectType){
				if(this.extrinsicObjects == null){
					this.extrinsicObjects = new ArrayList();
				}this.extrinsicObjects.add(ident);
			}
			else if(ident instanceof AssociationType1){
				if(this.associations == null){
					this.associations = new ArrayList();
				}this.associations.add(ident);
			}
			else if(ident instanceof ClassificationType){
				if(this.classifications == null){
					this.classifications = new ArrayList();
				}this.classifications.add(ident);
			}
			else {
				logger.warn("SubmitObjectRequest contains unexpected element of type " + ident.getClass()+ ".");
			}
		} /// end loop
	}
	
	/** extract the submission set*/
	private void extractSubmissionSet(ProvideAndRegisterDocumentSetType docSet) throws MetadataExtractionException{
		// find the submission set
		RegistryPackageType setData = findSubmissionSet();
		if(setData == null){
			logger.fatal("Could not find SubmissionSet metadata in the SubmitObjectsRequest. Cannot procede with extraction.");
			throw new MetadataExtractionException("Could not find SubmissionSet metadata in the SubmitObjectsRequest. Cannot procede with extraction.");
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Begin finding present submission set associated documents and present associated folders.");
		}
		// FIXME CP 237 places the target as the subSet
		// and the source as the association ID - making this check possible and backwards
		/// CP278 fixes this, thus this check will filter out *all*
		// links to current documents, links to current folders and links to associations 
		// between existing documents and existing folders with the submission set.
		AssociationType1[] presentAssociations = this.findHasMemberAssociationsWithSource(setData.getId());
		
/*		if(presentAssociations.length == 0){
			logger.info("No submission set associated documents or folders found.");
			EbXML_3_0SubmissionSetExtractor ssExtractor = new EbXML_3_0SubmissionSetExtractor(setData, null, null);
			docSet.setSubmissionSet(ssExtractor.extract());
			return;
		}*/
		
		// find uuids of current (present) folders
		Iterator i = this.classifications.iterator();
		ArrayList folUUIDs = new ArrayList();
		while(i.hasNext()){
			ClassificationType c = (ClassificationType)i.next();
			if(c.getClassificationNode().equals(UUIDs.FOLDER_OBJECT)){
				folUUIDs.add(c.getClassifiedObject());
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("Number current folders found: " + folUUIDs.size());
		}
		
		// find uuids of current (present) documents
	    i = this.extrinsicObjects.iterator();
		ArrayList docEntryUUIDs = new ArrayList();
		while(i.hasNext()){
			docEntryUUIDs.add(((ExtrinsicObjectType)i.next()).getId());
		}
		if(logger.isDebugEnabled()){
			logger.debug("Number current documents found: " + docEntryUUIDs.size());
		}
	
		// partition presentAssociations into present associated documents and present associated folders
		// and associations of existing documents to existing folders
		// using the Folder classification and extrinsic object ids
		ArrayList docs = new ArrayList();
		ArrayList folders = new ArrayList();
		
		//CP-278 IS FIXED: 
		ArrayList folderDocumentAssociationIds = new ArrayList();
		
		for(int j = 0; j < presentAssociations.length; j++){
			boolean foundTarget = false;
			i = folUUIDs.iterator();
			while(i.hasNext()){
				// present (current) folder = target of the association with subSet Id as source
				if(((String)i.next()).equalsIgnoreCase(presentAssociations[j].getTargetObject())){
					folders.add(presentAssociations[j]);
					foundTarget = true;
					break;
				}
			}
			if(foundTarget){
				continue;
			}
			i = docEntryUUIDs.iterator();
			while(i.hasNext()){
				// present (current) document
				if(((String)i.next()).equalsIgnoreCase(presentAssociations[j].getTargetObject())){
					docs.add(presentAssociations[j]);
					foundTarget = true;
					break;
				}
			}
			if(foundTarget){
				continue;
			}
			else{
				// FIXME CP 237 is corrected by CP 278 in having the submission set
				// id as source and the association id linking document and folder as false.
				////////////////////////////////////////////////////////////////////////////
				// we have the ID of an association between a document and a folder
				folderDocumentAssociationIds.add(presentAssociations[j].getTargetObject());
			}

		}
		if(logger.isDebugEnabled()){
			logger.debug("Present (current) associations partitioned into " + docs.size() + " associated documents and "+
					folders.size() +" associated folders.");
		}
		
		// now identify the existing documents and folders and set appropriate constructs
		ArrayList existingDocs = new ArrayList();
		ArrayList existingFolders = new ArrayList();
		
		// FIXME - may have to adjust logic - CP 237 places the target as the subSet
		// and the source as the association ID - making this check possible. 
		// COMMENT OUT WHEN CP 237 IS FIXED:
		/*AssociationType1[] list = findHasMemberAssociationsWithTarget(setData.getId());
		ArrayList folderDocumentAssociationIds = new ArrayList();
		for(int j = 0; j < list.length; j++){
			folderDocumentAssociationIds.add(list[j].getSourceObject());
		}*/
		///////////////////////////////////////////////////////////////////////////////
		
		// search
		i = this.associations.iterator();
		while(i.hasNext()){
			AssociationType1 assoc = (AssociationType1)i.next();
			if(folderDocumentAssociationIds.contains(assoc.getId())){
				// found folder to document association
				
				// check if document doesn't exists in this submission
				if(!docEntryUUIDs.contains(assoc.getTargetObject())){
					// add existing document entry to the set
					DocumentEntryType de = MetadataFactory.eINSTANCE.createDocumentEntryType();
					de.setEntryUUID(assoc.getTargetObject());
					de.setExisting(true);
					docSet.getDocumentEntry().add(de);
					
					// create a temp association to feed into the ssExtractor
					AssociationType1 tempAssoc= RimFactory.eINSTANCE.createAssociationType1();
					tempAssoc.setAssociationType(EbXML_3_0ExtractorConstants.HAS_MEMBER);
					tempAssoc.setSourceObject(setData.getId());
					tempAssoc.setTargetObject(assoc.getTargetObject());
					existingDocs.add(tempAssoc);
				}
				
				// check if folder doesn't exists in this submission
				// this check covers the case when the folder exists and
				// the document is either new or existing. The extractFodlers()
				// method covers the case when the folder exists and the 
				// document is either new or existing.
				if(!folUUIDs.contains(assoc.getSourceObject())){
					// add existing document entry to the set
					FolderType folder = MetadataFactory.eINSTANCE.createFolderType();
					folder.setEntryUUID(assoc.getSourceObject());
					folder.setExisting(true);
					folder.getAssociatedDocuments().add(assoc.getTargetObject());
					docSet.getFolder().add(folder);
					
					// create a temp association to feed into the ssExtractor
					AssociationType1 tempAssoc= RimFactory.eINSTANCE.createAssociationType1();
					tempAssoc.setAssociationType(EbXML_3_0ExtractorConstants.HAS_MEMBER);
					tempAssoc.setSourceObject(setData.getId());
					tempAssoc.setTargetObject(assoc.getTargetObject());
					existingFolders.add(tempAssoc);
				}
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("Found " + existingDocs.size() + " existing documents and "+
					existingFolders.size() +" existing folders.");
		}
		
		
		// add all current and existing documents 
		AssociationType1[] associatedDocs = new AssociationType1[(docs.size() + existingDocs.size())];
		i = docs.iterator();
		int count = 0;
		while(i.hasNext()){
			associatedDocs[count] = (AssociationType1)i.next();
			count++;
		}
		i = existingDocs.iterator();
		while(i.hasNext()){
			associatedDocs[count] = (AssociationType1)i.next();
			count++;
		}
		
		// add all current and existing folders
		AssociationType1[] associatedFols = new AssociationType1[(folders.size() + existingFolders.size())];
		i = folders.iterator();
		count = 0;
		while(i.hasNext()){
			associatedFols[count] = (AssociationType1)i.next();
			count++;
		}
		i = existingFolders.iterator();
		while(i.hasNext()){
			associatedFols[count] = (AssociationType1)i.next();
			count++;
		}
		
		// do the extraction
		EbXML_3_0SubmissionSetExtractor ssExtractor = new EbXML_3_0SubmissionSetExtractor(setData, associatedDocs, associatedFols);
		docSet.setSubmissionSet(ssExtractor.extract());
	}
	
	
	/** private utility that searches for the RegistryPackage representative of the submissions set 
	 * returns null if the submission set cannot be found*/
	private RegistryPackageType findSubmissionSet()throws MetadataExtractionException{

		//first search for external classifications
		Iterator i = this.classifications.iterator();
		String ssEntryUUID = null;
		while(i.hasNext()){
			ClassificationType c = (ClassificationType)i.next();
			if(c.getClassificationNode().equals(UUIDs.SUBMISSON_SET_OBJECT)){
				ssEntryUUID = c.getClassifiedObject();
				break;
			}
		}
		
		i = this.registryPackages.iterator();
		while(i.hasNext()){
			RegistryPackageType reg = (RegistryPackageType)i.next();
			if(reg.getId().equals(ssEntryUUID)){
				return reg;
			}
			else{
				// search the registry package internal classifications for Submission Set classification
				// per 2008-2009 IHE ITI CP 330
				Iterator j = reg.getClassification().iterator();
				while(j.hasNext()){
					ClassificationType c = (ClassificationType)j.next();
					if(c.getClassificationNode().equals(UUIDs.SUBMISSON_SET_OBJECT)){
						return reg;
					}
				}
			}
		}
		return null;
	}
	
	/** extracts document entry metadata */
	private void extractDocumentEntries(ProvideAndRegisterDocumentSetType docSet) throws MetadataExtractionException{
		// see if there are any documents
		if(this.extrinsicObjects == null){
			logger.info("Metadata contains no ExtrinsicObjects");
		}
		else if(this.extrinsicObjects.isEmpty()){
			logger.info("Metadata contains no ExtrinsicObjects");
		}
		else{
			Iterator i = this.extrinsicObjects.iterator();
			while(i.hasNext()){
				ExtrinsicObjectType docData = (ExtrinsicObjectType)i.next();
				if(docData.getId() == null){
					logger.error("ExtrinsicObject found without the id attribute set. This data will not be included in the extraction.");
					continue;
				}
				// see if this doc has a parent
				AssociationType1 parentData = findParent(docData.getId());
				//extract
				EbXML_3_0DocumentEntryExtractor deExtractor = new EbXML_3_0DocumentEntryExtractor(docData, parentData);
				docSet.getDocumentEntry().add(deExtractor.extract());
			}
		}
	}
	
	/** checks to see if this document entry has a parent association, return null if none found */
	private AssociationType1 findParent(String documentEntryUUID){
		Iterator i = this.associations.iterator();
		while(i.hasNext()){
			AssociationType1 assoc = (AssociationType1)i.next();
			if(assoc.getSourceObject().equals(documentEntryUUID)){
				String rel = assoc.getAssociationType();
				if(rel.equals(EbXML_3_0ExtractorConstants.IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.APND_LITERAL.getName()) ||
				   rel.equals(EbXML_3_0ExtractorConstants.IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.RPLC_LITERAL.getName()) ||
				   rel.equals(EbXML_3_0ExtractorConstants.IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.XFRM_LITERAL.getName()) ||
				   rel.equals(EbXML_3_0ExtractorConstants.IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.XFRMRPLC_LITERAL.getName()))
				return assoc;
			}
		}
		return null;
	}
	
	/** extracts folder metadata */
	private void extractFolders(ProvideAndRegisterDocumentSetType docSet) throws MetadataExtractionException{
		// see if there, potentially, are any folders
		if(this.registryPackages.size() <= 1){
			logger.info("Metadata contains no Folders");
			return;
		}
		// find the folders
		RegistryPackageType[] folders = findFolders();
		if(folders == null){
			logger.info("Could not find folder metadata in the SubmitObjectsRequest.");
			return;
		}
		// find documents in each folder and extract folder metadata
		for(int i = 0; i < folders.length; i++){
			if(folders[i].getId() == null){
				logger.error("Folder RegistryPackage found without the id attribute set. This data will not be included in the extraction.");
				continue;
			}
			AssociationType1[] documentsInFolderI = findHasMemberAssociationsWithSource(folders[i].getId());
			EbXML_3_0FolderExtractor folExtractor = new EbXML_3_0FolderExtractor(folders[i],documentsInFolderI);
			docSet.getFolder().add(folExtractor.extract());
		}
	}
	
	/** private utility that searches for the RegistryPackage representative of the folders 
	 * returns null if the folders cannot be found*/
	private RegistryPackageType[] findFolders()throws MetadataExtractionException{
		//first search for external classifications
		Iterator i = this.classifications.iterator();
		ArrayList folEntryUUIDs = new ArrayList();
		while(i.hasNext()){
			ClassificationType c = (ClassificationType)i.next();
			if(c.getClassificationNode().equals(UUIDs.FOLDER_OBJECT)){
				folEntryUUIDs.add(c.getClassifiedObject());
			}
		}
		i = this.registryPackages.iterator();
		ArrayList regs = new ArrayList();
		while(i.hasNext()){
			RegistryPackageType reg = (RegistryPackageType)i.next();
			// try to match external classification with this registry package
			Iterator j = folEntryUUIDs.iterator();
			boolean found = false;
			while(j.hasNext() && !found){
				if(reg.getId().equals((String)j.next())){
					regs.add(reg);
					found = true;
				}
			}
			if(!found){
				// search the registry package internal classifications for Folder classifications
				// per 2008-2009 IHE ITI CP 330
				j = reg.getClassification().iterator();
				while(j.hasNext()){
					ClassificationType c = (ClassificationType)j.next();
					if(UUIDs.FOLDER_OBJECT.equals(c.getClassificationNode())){
						regs.add(reg);
						break;
					}
				}
			}
		}
		if(regs.isEmpty()){
			return null;
		}
		RegistryPackageType[] retVal = new RegistryPackageType[regs.size()];
		i = regs.iterator();
		int count = 0;
		while(i.hasNext()){
			retVal[count] = (RegistryPackageType)i.next();
			count++;
		}
		return retVal;
	}
	
	/** finds all HAS MEMBER associations with the given source object entry UUID, return null if none found */
	private AssociationType1[] findHasMemberAssociationsWithSource(String sourceObjectID){
		Iterator i = this.associations.iterator();
		ArrayList assocs = new ArrayList();
		while(i.hasNext()){
			AssociationType1 assoc = (AssociationType1)i.next();
			if(assoc.getSourceObject().equals(sourceObjectID) && assoc.getAssociationType().equals(EbXML_3_0ExtractorConstants.HAS_MEMBER)){
				assocs.add(assoc);
			}
		}
		if(assocs.isEmpty()){
			return null;
		}
		AssociationType1[] retVal = new AssociationType1[assocs.size()];
		i = assocs.iterator();
		int count = 0;
		while(i.hasNext()){
			retVal[count] = (AssociationType1)i.next();
			count++;
		}
		return retVal;
	}
	
	/** finds all HAS MEMBER associations with the given target object entry UUID, return null if none found */
	private AssociationType1[] findHasMemberAssociationsWithTarget(String targetObjectID){
		Iterator i = this.associations.iterator();
		ArrayList assocs = new ArrayList();
		while(i.hasNext()){
			AssociationType1 assoc = (AssociationType1)i.next();
			if(assoc.getSourceObject().equals(targetObjectID) && assoc.getAssociationType().equals(EbXML_3_0ExtractorConstants.HAS_MEMBER)){
				assocs.add(assoc);
			}
		}
		if(assocs.isEmpty()){
			return null;
		}
		AssociationType1[] retVal = new AssociationType1[assocs.size()];
		i = assocs.iterator();
		int count = 0;
		while(i.hasNext()){
			retVal[count] = (AssociationType1)i.next();
			count++;
		}
		return retVal;
	}
}
