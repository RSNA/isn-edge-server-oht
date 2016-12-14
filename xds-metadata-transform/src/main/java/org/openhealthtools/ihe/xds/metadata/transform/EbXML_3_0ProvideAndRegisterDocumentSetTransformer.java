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

/**
 * 
 */
package org.openhealthtools.ihe.xds.metadata.transform;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType;
import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;
import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;



/**
 * Class containing utility methods to transform complete XDS
 * metadata to ebRIM 3.0 element.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0ProvideAndRegisterDocumentSetTransformer implements
		ProvideAndRegisterDocumentSetTransformer {
	
	/** Descriptor for Transformer */
	public static final String DESCRIPTOR = "EBXML_3_0_PRDS_XFRMR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0ProvideAndRegisterDocumentSetTransformer.class);
	
	/** submitReq for all of metadata */
	private SubmitObjectsRequestType submitReq;
	

	/**
	 * Creates the transformer.
	 */
	public EbXML_3_0ProvideAndRegisterDocumentSetTransformer() {
		this.submitReq = null;
	}

	/**
	 * Returns the SubmitObjectsRequestType containing the all metadata values. 
	 * Returns null if the
	 * transformation has not been executed, or had failed.
	 * @return the submitReq
	 */
	public SubmitObjectsRequestType getSubmitReq() {
		return submitReq;
	}

	/** 
	 * Renders a SubmitObjectsRequestType containing the metadata values of the parameter, formatted in ebXML
	 * @throws MetadataTransformationException
	 * @see org.openhealthtools.ihe.xds.metadata.transform.ProvideAndRegisterDocumentSetTransformer#transform(org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType)
	 */
	public void transform(ProvideAndRegisterDocumentSetType docSet) throws MetadataTransformationException{
		if(docSet.getSubmissionSet() == null){
			logger.error("SubmissionSet metadata is null.Cannot proceed with transformation.");
			throw new MetadataTransformationException("SubmissionSet metadata is null.Cannot proceed with transformation.");
		}
		else if(docSet.getSubmissionSet().getEntryUUID() == null){
			logger.error("SubmissionSet entryUUID is null. Cannot proceed with transformation.");
			throw new MetadataTransformationException("SubmissionSet entryUUID is null. Cannot proceed with transformation.");
		}
		
		// Create the ebXML from the data we have
		// connect to the Repository and send the transaction.
		this.submitReq = LCMFactory.eINSTANCE.createSubmitObjectsRequestType();
		this.submitReq.setRegistryObjectList(RimFactory.eINSTANCE.createRegistryObjectListType());
		
		// stick in the rim:ObjectRef entries
		setObjectRefs(docSet);
		
		// ----------------------------------
		// Submission Set metadata of the submission
		setSubmissionSet(docSet);
		
		// set the classification of this thing to declare it is a
		// submission set
		ClassificationType classification = RimFactory.eINSTANCE.createClassificationType();
		// set id (required in ebXML 3.0 (and not in 2.1)
		classification.setId(EbXML_3_0TransformerUtils.getRandomId("cl", 0));
		classification.setClassifiedObject(docSet.getSubmissionSet().getEntryUUID());
		classification.setClassificationNode(UUIDs.SUBMISSON_SET_OBJECT);
		// set nodeRepresentation -- required for external classifications
		classification.setNodeRepresentation("");//intentionally left blank, per IHE (see discussion on Issue 15) 
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION,classification);

		
		// ----------------------------------
		// Document Section of the submission
		// Add each of the document entries to the extrinsic object under the root leafRegistry Object
		if(docSet.getDocumentEntry().isEmpty()){
			logger.info("Submission set contains no documents.");
		}
		else{
			if (logger.isDebugEnabled()) {
				logger.debug("Adding document metadata to submission set.  There are " 
						+ docSet.getDocumentEntry().size() + " documents to add.");
			}
			setDocumentEntries(docSet);
		}

		
		// ----------------------------------
		// Folders section of the submission
		if(docSet.getFolder().isEmpty()){
			logger.info("Submission set contains no folders.");
		}
		else{
			if (logger.isDebugEnabled()) {
				logger.debug("Adding folder metadata to submission set.  There are " 
						+ docSet.getFolder().size() + " folders to add.");
			}
			setFolders(docSet);
		}
		
		// --------------------------------------------------------------
		// Figure out if we are referencing any additional existing document entries
		// or existing folders among the lists of associated documents and
		// associated folders listed with the submission set that we have not captured thus far.
		if (logger.isDebugEnabled()) {
			logger.debug("Verifying Submission Set associated documents and associated folders.");
		}
		validateAssociations(docSet);

	}


	/** support function that sets the necessary ObjectReferences for the ebXML metadata structure */
	private void setObjectRefs(ProvideAndRegisterDocumentSetType docSet){
		ObjectRefType oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_OBJECT);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_AUTHOR);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_CLASS_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_CONFIDENTIALITY_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_EVENT_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_FORMAT_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_HEALTH_CARE_FACILITY_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_PRACTICE_SETTING_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_TYPE_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_UNIQUE_IDENTIFICATION_SCHEME);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.DOC_ENTRY_PATIENT_IDENTIFICATION_SCHEME);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.SUBMISSON_SET_AUTHOR);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.SUBMISSION_SET_CONTENT_TYPE_CODE);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.SUBMISSION_SET_SOURCE_IDENTIFICATION_SCHEME);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.SUBMISSION_SET_UNIQUE_IDENTIFICATION_SCHEME);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.SUBMISSION_SET_PATIENT_IDENTIFICATION_SCHEME);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		//
		if (!docSet.getFolder().isEmpty()){
			// fix for issue tracker : artf3485 - only add object refs when there are folders
			oRef = RimFactory.eINSTANCE.createObjectRefType();
			oRef.setId(UUIDs.FOLDER_CODE);
			submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
			//
			oRef = RimFactory.eINSTANCE.createObjectRefType();
			oRef.setId(UUIDs.FOLDER_UNIQUE_IDENTIFICATION_SCHEME);
			submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
			//
			oRef = RimFactory.eINSTANCE.createObjectRefType();
			oRef.setId(UUIDs.FOLDER_PATIENT_IDENTIFICATION_SCHEME);
			submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
			//
			oRef = RimFactory.eINSTANCE.createObjectRefType();
			oRef.setId(UUIDs.FOLDER_OBJECT);
			submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
		}
		//
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.SUBMISSON_SET_OBJECT);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
	
		// TODO RGD - do we need to add HAS_MEMBER
		oRef = RimFactory.eINSTANCE.createObjectRefType();
		oRef.setId(UUIDs.HAS_MEMBER_UUID);
		submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,oRef);
	}
	
	/** support method to generate all the document entry metadata */
	private void setDocumentEntries(ProvideAndRegisterDocumentSetType docSet) throws MetadataTransformationException{
		
		Iterator i = docSet.getDocumentEntry().iterator();
		EbXML_3_0DocumentEntryTransformer deTransformer = new EbXML_3_0DocumentEntryTransformer();
		while(i.hasNext()){
			DocumentEntryType de = (DocumentEntryType)i.next();
			
			// check for null document entry uuid
			if(de.getEntryUUID() == null){
				logger.error("DocumentEntry.entryUUID is null. This DocumentEntry will not be included in the transformation.");
				continue;
			}
			
			// check if this document entry is existing
			if(de.isExisting()){
				if (logger.isDebugEnabled()) {
					logger.debug("Found an existing Document Entry: " + de.getEntryUUID());
				}
				ObjectRefType docRef = RimFactory.eINSTANCE.createObjectRefType();
				docRef.setId(de.getEntryUUID());
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,docRef);
			}
			//	else this is a "new" document
			else{
				deTransformer.transform(de);
				
				// set document entry metadata
				if(deTransformer.getExtrinsicObject() == null){
					logger.error("Null Extrinsic Object produced for "+ de.getEntryUUID() +
							" . This DocumentEntry will not be included in the transformation.");
					continue;
				}
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT,deTransformer.getExtrinsicObject());
				
				// set association with parent document
				if(deTransformer.getAssociation() != null){
					this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,deTransformer.getAssociation());
					ObjectRefType parentRef = RimFactory.eINSTANCE.createObjectRefType();
					parentRef.setId(deTransformer.getAssociation().getTargetObject());
					this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,parentRef);
				}
			}
			
			// associate document entry with submission set
			
			// TODO - SEK .... may have to heed this note ... from previous implementation ===================
			// RGD SEK 12/15/2005 - the associations and the extrinsic object lists inside leadRegistryobject
			// appear to be tied together under the covers.  The following code has been modified to defer
			// adding of the new association until after the loop over extrinsic objects, because doing it 
			// in the loop resulted in the iterator throwing a ConcurrentAccess violation.
			// ================================================================================================
			
			AssociationType1 association = RimFactory.eINSTANCE.createAssociationType1();
			// set id (required in ebXML 3.0 (and not in 2.1)
			association.setId(EbXML_3_0TransformerUtils.getRandomId("a", 0));
			association.setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
			association.setSourceObject(docSet.getSubmissionSet().getEntryUUID());
			association.setTargetObject(de.getEntryUUID());
			
			
			// Create a slot, and a value list, and a value to set the SubmissionSetStatus element
			SlotType1 submissionSetStatusSlot = RimFactory.eINSTANCE.createSlotType1();
			submissionSetStatusSlot.setName("SubmissionSetStatus");
			submissionSetStatusSlot.setValueList(RimFactory.eINSTANCE.createValueListType());
			ValueListType submissionSetStatusSlotValueList = submissionSetStatusSlot.getValueList();
			// TODO RGD SEK - set the value of the list element, here can either be Original or Reference. See
			// XDS vol 2. pg 92 pp 2195.     Since currently the source is submitting the actual metadata object
			// for the document, this is then set to Original.  From the XDS document, there is another mode where
			// it appears that the submission part with the DocumentEntry metadata would not actually hold the data,             // but instead be a reference to existing DocumentEntry data in the respository. This would then be
			// encoded as "Reference".
			if(de.isExisting()){
				submissionSetStatusSlotValueList.getValue().add("Reference");
			}
			else{
				submissionSetStatusSlotValueList.getValue().add("Original");
			}
			association.getSlot().add(submissionSetStatusSlot);

			//add the assocation
			this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,association);
			
		} // end document entry loop
		
		if (logger.isDebugEnabled()) logger.debug("All document metadata added to submission set.");
	}

	
	/** support method to generate all the submission set metadata */
	private void setSubmissionSet(ProvideAndRegisterDocumentSetType docSet) throws MetadataTransformationException{
		EbXML_3_0SubmissionSetTransformer ssTransformer = new EbXML_3_0SubmissionSetTransformer();
		ssTransformer.transform(docSet.getSubmissionSet());
		
		// set submission set metadata  
		if(ssTransformer.getRegistryPackage() == null){
			logger.error("Null RegistryPackage produced for submission set metadata.");
			throw new MetadataTransformationException("Null RegistryPackage produced for submission set metadata.");
		}
		this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE,ssTransformer.getRegistryPackage());
		
		// NOTE: we need to wait until the rest of the transforms have taken place before we 
		// examine the list of submission set associated docuemtns and folders and verify that
		// everything made it across the transformation
		if (logger.isDebugEnabled()) logger.debug("All submission set metadata added.");
	}
	
	/** support method to generate all the folder metadata */
	private void setFolders(ProvideAndRegisterDocumentSetType docSet) throws MetadataTransformationException{
		
		Iterator i = docSet.getFolder().iterator();
		EbXML_3_0FolderTransformer fTransformer = new EbXML_3_0FolderTransformer();
		while(i.hasNext()){
			FolderType fol = (FolderType)i.next();
			
			// check for null folder entryUUID
			if(fol.getEntryUUID() == null){
				logger.error("Folder.entryUUID is null. This Folder will not be included in the transformation.");
				continue;
			}
			// transform folder
			fTransformer.transform(fol);
			
			// check if this document entry is existing
			if(fol.isExisting()){
				if (logger.isDebugEnabled()) {
					logger.debug("Found an existing Folder: " + fol.getEntryUUID());
				}
				ObjectRefType folRef = RimFactory.eINSTANCE.createObjectRefType();
				folRef.setId(fol.getEntryUUID());
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,folRef);
			}
			// else this is a "new" folder
			else{
				//set folder metadata
				if(fTransformer.getRegistryPackage() == null){
					logger.error("Null RegistryPackage produced for "+ fol.getEntryUUID() +". This Folder will not be included in the transformation.");
					continue;
				}
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE,fTransformer.getRegistryPackage());
				
				// set the classification type for the folder (ie. declare - this is
				// a folder)
				ClassificationType classification = RimFactory.eINSTANCE.createClassificationType();
				// set id (required in ebXML 3.0 (and not in 2.1)
				classification.setId(EbXML_3_0TransformerUtils.getRandomId("cf", 0));
				classification.setClassifiedObject(fol.getEntryUUID());
				classification.setClassificationNode(UUIDs.FOLDER_OBJECT);
				// set nodeRepresentation -- required for external classifications
				classification.setNodeRepresentation("");//intentionally left blank, per IHE (see discussion on Issue 15) 
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION,classification);
			}
			
			// set associations of documents in folder
			if(fTransformer.getAssociatedDocuments() != null){
				for(int j = 0; j < fTransformer.getAssociatedDocuments().length; j ++){
					this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,fTransformer.getAssociatedDocuments()[j]);
				
					// CP 237/278 for IHE 2007-2008: Link this association (above) to the submission set.
					AssociationType1 association = RimFactory.eINSTANCE.createAssociationType1();
					// set id (required in ebXML 3.0 (and not in 2.1)
					association.setId(EbXML_3_0TransformerUtils.getRandomId("a", 0));
					association.setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
					association.setSourceObject(docSet.getSubmissionSet().getEntryUUID());
					association.setTargetObject(fTransformer.getAssociatedDocuments()[j].getId());
					this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,association);
				}
			}
			
			// associate folder with submission set
			// Setup the association of the folder with the submissions set
			AssociationType1 association = RimFactory.eINSTANCE.createAssociationType1();
			// set id (required in ebXML 3.0 (and not in 2.1)
			association.setId(EbXML_3_0TransformerUtils.getRandomId("a", 0));
			association.setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
			association.setSourceObject(docSet.getSubmissionSet().getEntryUUID());
			association.setTargetObject(fol.getEntryUUID());
			this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,association);
		} // end folders loop
		
		if (logger.isDebugEnabled()) logger.debug("All folder metadata added to submission set.");
	}
	
	/** support method that goes through the lists of associated documents and 
	 * associated folders on the SubmissionSet object of this ProvideAndRegisterDocumentSet
	 * and checks to see if any existing documents and folders have been "forgotten". DocumentEntries
	 * and Folders have the potential to be "forgotten" if there does not exist a 
	 * DocumentEntry (where existing=true) or Folder (where existing=true) object representing
	 * this information in the ProvideAndRegisterDocumentSet. NOTE: documents and folders of this
	 * "forgotten" nature are ASSUMED to be existing not newly created.
	 * @param docSet
	 */
	private void validateAssociations(ProvideAndRegisterDocumentSetType docSet) {
		if (logger.isDebugEnabled()) {
			logger.debug("Verifying associated documents");
		}
		Iterator i = docSet.getSubmissionSet().getAssociatedDocuments().iterator();
		Iterator j = this.submitReq.getRegistryObjectList().getIdentifiable().iterator();
		boolean found = false;
		int numMissing = 0;
		while(i.hasNext()){
			String docUUID = (String)i.next();
			while(j.hasNext() && !found){
				Object o = j.next();
				if(o instanceof AssociationType1){
					AssociationType1 assoc = (AssociationType1)o;
					if(assoc.getAssociationType().equals(EbXML_3_0TransformerConstants.HAS_MEMBER) && 
							assoc.getSourceObject().equals(docSet.getSubmissionSet().getEntryUUID())){
						if(docUUID.equals(assoc.getTargetObject())){
							found = true;
							break;
						}
					}
				}
			}
			if(!found){
				logger.info("Found an associated document that is not represented as an AssocationType1: " + docUUID +
						". Adding this document as an existing document to the metadata.");
				// add obj ref
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,docUUID);
				
				// association
				AssociationType1 association = RimFactory.eINSTANCE.createAssociationType1();
				// set id (required in ebXML 3.0 (and not in 2.1)
				association.setId(EbXML_3_0TransformerUtils.getRandomId("a", 0));
				association.setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
				association.setSourceObject(docSet.getSubmissionSet().getEntryUUID());
				association.setTargetObject(docUUID);
				
				// Create a slot, and a value list, and a value to set the SubmissionSetStatus element
				SlotType1 submissionSetStatusSlot = RimFactory.eINSTANCE.createSlotType1();
				submissionSetStatusSlot.setName("SubmissionSetStatus");
				submissionSetStatusSlot.setValueList(RimFactory.eINSTANCE.createValueListType());
				ValueListType submissionSetStatusSlotValueList = submissionSetStatusSlot.getValueList();
				submissionSetStatusSlotValueList.getValue().add("Reference");
				association.getSlot().add(submissionSetStatusSlot);

				//add the assocation
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,association);
				numMissing++;
			}
		} // end documents loop
		if (logger.isDebugEnabled()) {
			logger.debug("Number of \"forgotten\" submission set existing associated documents: " + numMissing);
		}
		
	
		if (logger.isDebugEnabled()) {
			logger.debug("Verifying associated folders");
		}
		i = docSet.getSubmissionSet().getAssociatedFolders().iterator();
		j = this.submitReq.getRegistryObjectList().getIdentifiable().iterator();
		found = false;
		numMissing = 0;
		while(i.hasNext()){
			String folUUID = (String)i.next();
			while(j.hasNext() && !found){
				Object o = j.next();
				if(o instanceof AssociationType1){
					AssociationType1 assoc = (AssociationType1)o;
					if(assoc.getAssociationType().equals(EbXML_3_0TransformerConstants.HAS_MEMBER) && 
							assoc.getSourceObject().equals(docSet.getSubmissionSet().getEntryUUID())){
						if(folUUID.equals(assoc.getTargetObject())){
							found = true;
							break;
						}
					}
				}
			}
			if(!found){
				logger.info("Found an associated folder that is not represented as an AssocationType1: " + folUUID +
						". Adding this document as an existing document to the metadata.");
				// add obj ref
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF,folUUID);
				
				// association
				AssociationType1 association = RimFactory.eINSTANCE.createAssociationType1();
				// set id (required in ebXML 3.0 (and not in 2.1)
				association.setId(EbXML_3_0TransformerUtils.getRandomId("a", 0));
				association.setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
				association.setSourceObject(docSet.getSubmissionSet().getEntryUUID());
				association.setTargetObject(folUUID);
	
				//add the assocation
				this.submitReq.getRegistryObjectList().getIdentifiableGroup().add(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,association);
				numMissing++;
			} // end folders loop
		} 	
		if (logger.isDebugEnabled()) {
			logger.debug("Number of \"forgotten\" submission set existing associated folders: " + numMissing);
		}
	}
}