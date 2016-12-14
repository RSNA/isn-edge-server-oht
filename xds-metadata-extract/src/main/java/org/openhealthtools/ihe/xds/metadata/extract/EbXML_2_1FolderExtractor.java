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
package org.openhealthtools.ihe.xds.metadata.extract;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType;
import org.openhealthtools.ihe.common.hl7v2.CX;
import org.openhealthtools.ihe.common.hl7v2.format.HL7V2MessageFormat;
import org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters;
import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.CodedMetadataType;
import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.constants.FolderConstants;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;
import org.openhealthtools.ihe.xds.metadata.impl.MetadataFactoryImpl;

/**
 * Class containing utility methods to extract XDS folder
 * metadata from ebRIM 2.1 element.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_2_1FolderExtractor implements FolderExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_FOL_EXTR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_2_1FolderExtractor.class);
	
	/** RegistryPackage with folder metadata */
	private RegistryPackageType folderData;
	
	/** Associations representing the documents to be placed in this folder */
	private AssociationType1[] documentsInFolder;
	
	/**
	 * Loads the ebXML structures containing Folder metadata.
	 * UUIDs for classificationSchemes, identificationSchemes, objectTypes and
	 * associationTypes are expected to conform to those fixed by XDS documentataion.
	 * @see org.openhealthtools.ihe.xds.metadata.constants.UUIDs
	 * @param folderData the RegistryPackage for the folder metadata, cannot be null.
	 * @param documentsInFolder list of AssociationType1 objects each representing a link 
	 * between the folder and documents to be placed in this folder, may be null.
	 */
	public EbXML_2_1FolderExtractor(RegistryPackageType folderData, AssociationType1[] documentsInFolder) {
		this.folderData = folderData;
		this.documentsInFolder = documentsInFolder;
	}
	
	/**
	 * Builds an FolderType containing XDSFolder
	 * metadata within the RegistryPackage provided. Does not populate the list of
	 * documents contained within the folder.
	 * Construction assumes that sandard
	 * HL7 V2.5 message delimiters are used. See
	 * {@link org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters}. Length
	 * restrictions are not implemented, presently.

	 * @return FolderType object populated with metadata from parameters.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.FolderExtractor#extract()
	 */
	public FolderType extract() throws MetadataExtractionException{
		if(this.folderData == null){
			logger.error("RegistryPackage is null, cannot execute extraction.");
			throw new MetadataExtractionException ("RegistryPackage is null, cannot execute extraction.");
		}
		FolderType folder = MetadataFactoryImpl.eINSTANCE.createFolderType();
		
		// extract Registry Package attributes into metadata data members
		if(logger.isDebugEnabled()){
			logger.debug("Extracting attributes from the Registry Package.");
		}
		extractRegistryPackageAttributes(folder);
		
		// extract the RegistryPackage/Name as title
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Name from the Registry Package.");
		}
		folder.setTitle(copy(this.folderData.getName()));
		
		// extract Description
		if(logger.isDebugEnabled()){
			logger.debug("Extracting description from the Registry Package.");
		}
		folder.setComments(copy(this.folderData.getDescription()));
		
		// extract Slots (should be only one slot: lastUpdateTime)
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Slot data from  the Registry Package.");
		}
		extractRegistryPackageSlots(folder);

		// extract ExternalIdentifiers
		if(logger.isDebugEnabled()){
			logger.debug("Extracting ExternalIdentifier data from the Registry Package.");
		}
		extractRegistryPackageExternalIdentifiers(folder);
		
		//extract Classifications
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Classification data from the Registry Package.");
		}
		extractRegistryPackageClassifications(folder);
		
		//extract the document entryUUIDs associated with this folder
		if(this.documentsInFolder != null){
			if(logger.isDebugEnabled()){
				logger.debug("Extracting associated documents from the AssociationType1[].");
			}
			extractAssociatedDocuments(folder);
		}
		return folder;
	}
	
	/**
	 * Extracts the attributes that correspond to XDSSubmissionSet metadata
	 * attributes from the RegistryPackage. Will extract the 
	 * RegistryPackage/@id for the entryUUID metadata, however, this information 
	 * should not be changed by any actor except the registry.
	 */
	private void extractRegistryPackageAttributes(FolderType folder) {
		// Extract RegistryPackage/@id for entryUUID 
		folder.setEntryUUID(this.folderData.getId());
		
		if (this.folderData.getStatus() != null) {
			if (this.folderData.getStatus().equals(StatusType.APPROVED_LITERAL)) {
				folder
						.setAvailabilityStatus(AvailabilityStatusType.APPROVED_LITERAL);
			} else if (this.folderData.getStatus()
					.equals(StatusType.DEPRECATED_LITERAL)) {
				folder
						.setAvailabilityStatus(AvailabilityStatusType.DEPRECATED_LITERAL);
			} else if (this.folderData.getStatus().equals(StatusType.SUBMITTED_LITERAL)) {
				folder
						.setAvailabilityStatus(AvailabilityStatusType.SUBMITTED_LITERAL);
			} else if (this.folderData.getStatus().equals(StatusType.WITHDRAWN_LITERAL)) {
				folder
						.setAvailabilityStatus(AvailabilityStatusType.WITHDRAWN_LITERAL);
			}
		}
	}

	/**
	 * Extracts metadata values from the slots of the RegistryPackage
	 * (should be only one slot: lastUpdateTime) returns first instance of it, incase 
	 * there happen to be multiple ... which would be invalid
	 */
	private void extractRegistryPackageSlots(FolderType folder){
		EList slots = this.folderData.getSlot();
		for(int i = 0; i < slots.size(); i++){
			SlotType1 slot = (SlotType1)slots.get(i);
		
			// null checks
			if(slot == null){continue;}
			if(slot.getName() == null){continue;}
			if(slot.getValueList() == null){ continue;}
			if(slot.getValueList().getValue() == null){continue;}
			if(slot.getValueList().getValue().size() < 1) {continue;}
			else if(slot.getValueList().getValue().get(0) == null){continue;}
			
			String slotName = slot.getName();
			if(slotName.equals(FolderConstants.LAST_UPDATE_TIME)){
				// get the XON string
				String s = (String)slot.getValueList().getValue().get(0);
				folder.setLastUpdateTime(s);
				return;
			}
		}	
	}
	
	/**
	 * Extracts metadata values from the ExternalIdentifiers of the
	 * RegisryPackage
	 */
	private void extractRegistryPackageExternalIdentifiers( FolderType folder){
		
		EList externalIdentifiers = folderData.getExternalIdentifier();
		for (int i = 0; i < externalIdentifiers.size(); i++) {
			ExternalIdentifierType exID = (ExternalIdentifierType) externalIdentifiers.get(i);
			String idScheme = exID.getIdentificationScheme();
			
			// cannot continue with invalid files.
			if(idScheme == null){
				logger.error("Required ExternalIdentifier/@identificationScheme attribute missing for following id: "
						+ exID.getValue() + ". ID will not be included in extracted content.");
			}
			if (idScheme.equals(UUIDs.FOLDER_PATIENT_IDENTIFICATION_SCHEME)) {
				String s = exID.getValue();
				CX patientId = HL7V2MessageFormat.buildCXFromMessageString(s,
						MessageDelimiters.COMPONENT,
						MessageDelimiters.SUBCOMPONENT);
				folder.setPatientId(patientId);
			} 
			else if (idScheme.equals(UUIDs.FOLDER_UNIQUE_IDENTIFICATION_SCHEME)) {
				folder.setUniqueId(exID.getValue());
			}
			else{
				logger.error("Unidentified ExternalIdentifier/@identificationScheme: " + idScheme + ". " +
						exID.getValue() + " will not be included in extracted content.");
			}
		}// end loop
	}
	/**
	 * Extract the codeList codes from the EList of ClassificationType objects
	 * @param codeList list of codes, assumed to contain ONLY ClassificationType objects
	 * @param folder folder to add codes to
	 */
	private void extractRegistryPackageClassifications(FolderType folder){
		EList codeList = this.folderData.getClassification();
		for(int i = 0; i < codeList.size(); i++){
			
			if(! (codeList.get(i) instanceof ClassificationType)){
				continue;
			}
			ClassificationType c = (ClassificationType)codeList.get(i);
			// null check
			if(c == null){ continue;}

			//	extract Classification
			CodedMetadataType code = MetadataFactory.eINSTANCE.createCodedMetadataType();
			code.setCode(c.getNodeRepresentation());
			code.setDisplayName(copy(c.getName()));
			//	null checks on slot, if all good .. set code scheme name
			if(c.getSlot() != null){
				if(c.getSlot().size() > 0){
					if(c.getSlot().get(0) != null){
						SlotType1 cSlot = (SlotType1)c.getSlot().get(0);
						if(cSlot.getValueList() != null){
							if(cSlot.getValueList().getValue() != null){
								if(cSlot.getValueList().getValue().size() > 0){
									code.setSchemeName((String)cSlot.getValueList().getValue().get(0));	
								}
							}
						}
					}
				}
			}
			String codeUUID = c.getClassificationScheme();
			// cannot continue with invalid files.
			if(codeUUID == null){
				logger.error("Required Classification/@classificationScheme attribute missing for following code: "
						+ code.getCode() + ", " + code.getSchemeName() + ". Code will not be included in extracted content.");
			}
			// add code to folder
			else if (codeUUID.equals(UUIDs.FOLDER_CODE)) {
				folder.getCode().add(code);
			}
			else{
				logger.error("Unidentified Classification/@classificationScheme: " + codeUUID
						+ code.getCode() + ", " + code.getSchemeName() + " will not be included in extracted content.");
			}

		}
	}
	
	/**
	 * Extracts the document entry entryUUIDs form the AssociationType1[]
	 * that represent documents to be placed within this folder.
	 * @param folder
	 */
	private void extractAssociatedDocuments(FolderType folder) {
		for(int i = 0; i<this.documentsInFolder.length; i++){
			// verify association type is "has member"
			if(this.documentsInFolder[i].getAssociationType().equals(UUIDs.HAS_MEMBER)){
				folder.getAssociatedDocuments().add(documentsInFolder[i].getTargetObject());
			}
			else{
				logger.error("Unidentified Association/@associationType: " + this.documentsInFolder[i].getAssociationType()
						+ documentsInFolder[i].getTargetObject() + " will not be included in extracted content.");
			}
		}
	}
	
	/**
	 * private utility to aid in copying InternationalStrings in ebXML
	 * to those in metadata.
	 */
	private static org.openhealthtools.ihe.xds.metadata.InternationalStringType copy(InternationalStringType ist){
		org.openhealthtools.ihe.xds.metadata.InternationalStringType result = MetadataFactory.eINSTANCE.createInternationalStringType();
		if (ist != null) {
			Iterator i = ist.getLocalizedString().iterator();
			while (i.hasNext()) {
				org.openhealthtools.ihe.xds.metadata.LocalizedStringType lst = MetadataFactory.eINSTANCE
						.createLocalizedStringType();
				LocalizedStringType original = (LocalizedStringType) i.next();
				lst.setCharset(original.getCharset());
				lst.setLang(original.getLang());
				lst.setValue(original.getValue());
				result.getLocalizedString().add(lst);
			}
		}
		return result;
	}

}
