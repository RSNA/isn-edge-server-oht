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
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType;
import org.openhealthtools.ihe.common.hl7v2.format.HL7V2MessageFormat;
import org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters;
import org.openhealthtools.ihe.utils.UUID;
import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.CodedMetadataType;
import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.metadata.constants.FolderConstants;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;

/**
 * Class containing utility methods to transform XDS folder
 * metadata to ebRIM 3.0 element.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0FolderTransformer implements FolderTransformer {
	
	/** Descriptor for Transformer */
	public static final String DESCRIPTOR = "EBXML_3_0_FOL_XFRMR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0FolderTransformer.class);
	
	/** RegistryPackage for folder metadata */
	private RegistryPackageType folderData;
	
	/** Associations representing the documents placed in this folder */
	private AssociationType1[] documentsInFolder;
	
	
	/**
	 * Creates the transformer.
	 */
	public EbXML_3_0FolderTransformer() {
		this.documentsInFolder = null;
		this.folderData = null;
	}
	
	
	/** Returns a list AssociationType1 containing the entryUUIDs of the documents indicated
	 * to be placed within this folder, if any
	 * Returns null if the
	 * transformation has not been executed, has failed, or no documents are in this folder.
	 * @return the documentsInFolder
	 */
	public AssociationType1[] getAssociatedDocuments() {
		return documentsInFolder;
	}


	/**
	 * Returns the RegistryPackageType containing the folder metadata values. 
	 * Returns null if the
	 * transformation has not been executed, or had failed.
	 * @return the folderData
	 */
	public RegistryPackageType getRegistryPackage() {
		return folderData;
	}


	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.metadata.transform.FolderTransformer#transform(org.openhealthtools.ihe.xds.metadata.FolderType)
	 */
	public void transform(FolderType folder) throws MetadataTransformationException{
		if(folder == null){
			logger.error("Folder is null, cannot execute transformation.");
			throw new MetadataTransformationException(
					"Folder is null, cannot execute transformation.");
		}
		
		this.folderData = RimFactory.eINSTANCE.createRegistryPackageType();
		
		// set attributes
		if(logger.isDebugEnabled()){
			logger.debug("Setting attributes on the Registry Package.");
		}
		setRegistryPackageAttributes(folder);
		
		// set RegistryPackage.Name
		if(logger.isDebugEnabled()){
			logger.debug("Setting Name on the Registry Package.");
		}
		folderData.setName(copy(folder.getTitle()));
		
		// set RegistryPackage.Description
		if(logger.isDebugEnabled()){
			logger.debug("Setting Description on the Registry Package.");
		}
		folderData.setDescription(copy(folder.getComments()));

		// set RegistryPackage slot (only one, lastUpdateTime)
		if(logger.isDebugEnabled()){
			logger.debug("Setting Slots on the Registry Package.");
		}
		setRegistryPackageSlots(folder);
		
		// set RegistryPacage classifications
		if(logger.isDebugEnabled()){
			logger.debug("Setting Classifications on the Registry Package.");
		}
		setRegistryPackageClassifications(folder);


		// set RegistryPackage external Identifiers
		if(logger.isDebugEnabled()){
			logger.debug("Setting External Identifiers on the Registry Package.");
		}
		setRegistryPackageExternalIdentifiers(folderData, folder);
		
		// setting documents in folder, if any
		if(folder.getAssociatedDocuments() != null){
			if(!folder.getAssociatedDocuments().isEmpty()){
				if(logger.isDebugEnabled()){
					logger.debug("Setting associated documents to the AssociationType1[].");
				}
				setAssociatedDocuments(folder);
			}
		}
	}
	
	
	/** sets the attributes on the Registry package **/
	private void setRegistryPackageAttributes(FolderType folder){
		// set RegistryPackage/@id
		folderData.setId(folder.getEntryUUID());
		
		// set RegistryPackage/@status
		if (folder.isSetAvailabilityStatus()) {
			if (folder.getAvailabilityStatus().equals(AvailabilityStatusType.APPROVED_LITERAL)) {
				folderData.setStatus(EbXML_3_0TransformerConstants.APPROVED_STATUS);
			} else if (folder.getAvailabilityStatus().equals(AvailabilityStatusType.DEPRECATED_LITERAL)) {
				folderData.setStatus(EbXML_3_0TransformerConstants.DEPRECATED_STATUS);
			} else if (folder.getAvailabilityStatus().equals(AvailabilityStatusType.SUBMITTED_LITERAL)) {
				folderData.setStatus(EbXML_3_0TransformerConstants.SUBMITTED_STATUS);
			} else if (folder.getAvailabilityStatus().equals(AvailabilityStatusType.WITHDRAWN_LITERAL)) {
				folderData.setStatus(EbXML_3_0TransformerConstants.WITHDRAWN_STATUS);
			}
		}
	}
	
	/** sets the slots on the Registry package*/
	private void setRegistryPackageSlots(FolderType folder){
		EList slots = this.folderData.getSlot();
		
		// lastUpdateTime 
		if(folder.getLastUpdateTime() != null){
			SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
			ValueListType list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(FolderConstants.LAST_UPDATE_TIME);
			slot.getValueList().getValue().add(folder.getLastUpdateTime());
			slots.add(slot);
		}
	}
	
	/** sets classifications */
	private void setRegistryPackageClassifications(FolderType folder){
		EList folderCodes = folder.getCode();
		if(folderCodes == null){
			if(logger.isDebugEnabled()){
				logger.debug("Folder Code list contains no codes.");
			}
			return;
		}

		int count = 1;
		for(int i = 0; i < folderCodes.size(); i++){
			// code List  ////////////////////////////////////////////////////////////
			ClassificationType c = RimFactory.eINSTANCE.createClassificationType();
			CodedMetadataType cm = (CodedMetadataType)folderCodes.get(i);
			// set code internal uuid
			c.setClassificationScheme(UUIDs.FOLDER_CODE);
			
			// set id (required in ebXML 3.0 (and not in 2.1)
			c.setId(EbXML_3_0TransformerUtils.getRandomId("cf", count));
			count++;
			// set code  code value
			c.setNodeRepresentation(cm.getCode());
			//set classifiedObject (made available from parameter)
			c.setClassifiedObject(folder.getEntryUUID());
			// set code  diaplay name
			c.setName(copy(cm.getDisplayName()));
			
			// set coding scheme name in slot
			if(cm.getSchemeName() != null){
				EList slots = c.getSlot();
				SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
				ValueListType list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(FolderConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(cm.getSchemeName());
				slots.add(slot);
			}
			this.folderData.getClassification().add(c);
		}
	}
	
	/**
	 * Sets the metadata values in the ExternalIdentifiers of the
	 * RegistryPackage
	 */
	private void setRegistryPackageExternalIdentifiers(RegistryPackageType folderData,
			 FolderType folder) {
		EList externalIdentifiers = folderData.getExternalIdentifier();
		LocalizedStringType idName = RimFactory.eINSTANCE.createLocalizedStringType();
		InternationalStringType exIDName = RimFactory.eINSTANCE.createInternationalStringType();
		
		// patientId /////////////////////////////////////////////////////
		ExternalIdentifierType exID = RimFactory.eINSTANCE.createExternalIdentifierType();
		if(folder.getPatientId() != null){
			// set id and registryObject (required in ebXML 3.0 (and not in 2.1)
			exID.setId(EbXML_3_0TransformerUtils.getRandomId("i", 1));
			exID.setRegistryObject(folder.getEntryUUID());
			// set patient id
			exID.setValue(HL7V2MessageFormat.toMessageString(folder.getPatientId(),MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
			// set "XDSFolder.patientId" to be the name of this ExternalIdentifier
			idName.setValue(FolderConstants.PATIENT_ID);
			exIDName.getLocalizedString().add(idName);
			exID.setName(exIDName);	
			//set identificaitonScheme
			exID.setIdentificationScheme(UUIDs.FOLDER_PATIENT_IDENTIFICATION_SCHEME);
			// add to RegistryPackage/ExternalIdentifier 
			externalIdentifiers.add(exID);
		}
		
		// uniqueId /////////////////////////////////////////////////////
		if (folder.getUniqueId() != null){
			exID = RimFactory.eINSTANCE.createExternalIdentifierType();
			idName = RimFactory.eINSTANCE.createLocalizedStringType();
			exIDName = RimFactory.eINSTANCE.createInternationalStringType();
			// set id and registryObject (required in ebXML 3.0 (and not in 2.1)
			exID.setId(EbXML_3_0TransformerUtils.getRandomId("i", 2));
			exID.setRegistryObject(folder.getEntryUUID());
			// set unique id in ExternalIdentifier
			exID.setValue(folder.getUniqueId());
			// set "XDSFolder.uniqueId" to be the name of this ExternalIdentifier
			idName.setValue(FolderConstants.UNIQUE_ID);
			exIDName.getLocalizedString().add(idName);
			exID.setName(exIDName);	
			//set identificaitonScheme
			exID.setIdentificationScheme(UUIDs.FOLDER_UNIQUE_IDENTIFICATION_SCHEME);
			// add to RegistryPackage/ExternalIdentifier 
			externalIdentifiers.add(exID);
		}
	}
	
	/**
	 * Sets the document entry entryUUIDs form the AssociationType1[]
	 * that represent documents to be placed within this folder.
	 * @param folder
	 */
	private void setAssociatedDocuments(FolderType folder) {
		this.documentsInFolder = new AssociationType1[folder.getAssociatedDocuments().size()];
		for(int i = 0; i<folder.getAssociatedDocuments().size(); i++){
			this.documentsInFolder[i] = RimFactory.eINSTANCE.createAssociationType1();
			//	CP 237 for IHE 2007-2008: Need Link this association to the submission set, so must set the id
			this.documentsInFolder[i].setId(UUID.generateURN());
			this.documentsInFolder[i].setTargetObject((String)folder.getAssociatedDocuments().get(i));
			this.documentsInFolder[i].setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
			this.documentsInFolder[i].setSourceObject(folder.getEntryUUID());
		}
	}
	
	/**
	 * private utility to aid in copying InternationalStrings in metadata
	 * to those in ebXML.
	 */
	private static InternationalStringType copy(org.openhealthtools.ihe.xds.metadata.InternationalStringType ist){
		InternationalStringType result = RimFactory.eINSTANCE.createInternationalStringType();
		if(ist != null){
			Iterator i = ist.getLocalizedString().iterator();
			while (i.hasNext()) {
				LocalizedStringType lst = RimFactory.eINSTANCE
						.createLocalizedStringType();
				org.openhealthtools.ihe.xds.metadata.LocalizedStringType original = (org.openhealthtools.ihe.xds.metadata.LocalizedStringType) i
						.next();
				lst.setCharset(original.getCharset());
				lst.setLang(original.getLang());
				lst.setValue(original.getValue());
				result.getLocalizedString().add(lst);
			}
		}
		return result;
	}
}
