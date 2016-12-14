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
import org.openhealthtools.ihe.common.hl7v2.XON;
import org.openhealthtools.ihe.common.hl7v2.XTN;
import org.openhealthtools.ihe.common.hl7v2.format.HL7V2MessageFormat;
import org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters;
import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.IntendedRecipientType;
import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;
import org.openhealthtools.ihe.xds.metadata.constants.DocumentEntryConstants;
import org.openhealthtools.ihe.xds.metadata.constants.SubmissionSetConstants;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;


/**
 * Class containing utility methods to transform XDS submission set
 * metadata to ebRIM 3.0 elements.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0SubmissionSetTransformer implements SubmissionSetTransformer {
	
	/** Descriptor for Transformer */
	public static final String DESCRIPTOR = "EBXML_3_0_SS_XFRMR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0SubmissionSetTransformer.class);

	/** Registry package for submission set metadata */
	private RegistryPackageType setData;
	
	/** Associations representing the documents associated with this submission set */
	private AssociationType1[] documentsInSubmissionSet;
	
	/** Associations representing the folders associated with this submission set */
	private AssociationType1[] foldersInSubmissionSet;

	/**
	 * Creates the transformer.
	 */
	public EbXML_3_0SubmissionSetTransformer() {
		this.setData = null;
		this.documentsInSubmissionSet = null;
		this.foldersInSubmissionSet = null;
	}
		
	/**
	 * Returns the RegistryPackageType containing the submission set metadata values. 
	 * Returns null if the
	 * transformation has not been executed, or had failed.
	 * @return the setData
	 */
	public RegistryPackageType getRegistryPackage() {
		return this.setData;
	}
	
	/** Returns a list AssociationType1 containing the entryUUIDs of the associated with this submission 
	 * set, if any. Returns null if the
	 * transformation has not been executed, has failed, or no documents are in this folder.
	 * @return the documentsInSubmissionSet
	 */
	public AssociationType1[] getAssociatedDocuments() {
		return this.documentsInSubmissionSet;
	}
	
	/** Returns a list AssociationType1 containing the entryUUIDs of the folders associated with this submission 
	 * set, if any. Returns null if the
	 * transformation has not been executed, has failed, or no documents are in this folder.
	 * @return the documentsInSubmissionSet
	 */
	public AssociationType1[] getAssociatedFolders() {
		return this.foldersInSubmissionSet;
	}


	/** 
	 * Renders an RegistryPackageType containing the submission set metadata values 
	 * of the parameter, formatted in ebXML
	 * @throws MetadataTransformationException
	 * @see org.openhealthtools.ihe.xds.metadata.transform.SubmissionSetTransformer#transform(org.openhealthtools.ihe.xds.metadata.SubmissionSetType)
	 */
	public void transform(SubmissionSetType subSet) throws MetadataTransformationException{
		if(subSet == null){
			logger.error("SubmissionSet is null, cannot execute transformation.");
			throw new MetadataTransformationException(
					"SubmissionSet is null, cannot execute transformation.");
		}
		this.setData = RimFactory.eINSTANCE.createRegistryPackageType();
		// set RegistryPackage/@id
		if(logger.isDebugEnabled()){
			logger.debug("Setting attributes on the Registry Package.");
		}
		setRegistryPackageAttributes(subSet);
		
		// set RegistryPackage.Description
		if(logger.isDebugEnabled()){
			logger.debug("Setting Description on the Registry Package.");
		}
		setData.setDescription(copy(subSet.getComments()));
		
		// set RegistryPackage.Name
		if(logger.isDebugEnabled()){
			logger.debug("Setting Name on the Registry Package.");
		}
		setData.setName(copy(subSet.getTitle()));
		
		// set RegistryPackage slots
		if(logger.isDebugEnabled()){
			logger.debug("Setting Slots on the Registry Package.");
		}
		setRegistryPackageSlots(subSet);
		
		// setRegistryPackage classifications
		if(logger.isDebugEnabled()){
			logger.debug("Setting Classifications on the Registry Package.");
		}
		setRegistryPackageClassifications(subSet);
		
		// set RegistryPackage external Identifiers
		if(logger.isDebugEnabled()){
			logger.debug("Setting External Identifiers on the Registry Package.");
		}
		setRegistryPackageExternalIdentifiers(subSet);
		
		// set associated documents
		setAssociatedDocuments(subSet);
		
		// set associated folders
		setAssociatedFolders(subSet);
		
	}
	
	/** sets the attributes on the Registry package **/
	private void setRegistryPackageAttributes(SubmissionSetType subSet){
		// set RegistryPackage/@id
		setData.setId(subSet.getEntryUUID());
		
		// set RegistryPackage/@status
		if (subSet.isSetAvailabilityStatus()) {
			if (subSet.getAvailabilityStatus().equals(AvailabilityStatusType.APPROVED_LITERAL)) {
				setData.setStatus(EbXML_3_0TransformerConstants.SUBMITTED_STATUS);
			} else if (subSet.getAvailabilityStatus().equals(AvailabilityStatusType.DEPRECATED_LITERAL)) {
				setData.setStatus(EbXML_3_0TransformerConstants.DEPRECATED_STATUS);
			} else if (subSet.getAvailabilityStatus().equals(AvailabilityStatusType.SUBMITTED_LITERAL)) {
				setData.setStatus(EbXML_3_0TransformerConstants.SUBMITTED_STATUS);
			} else if (subSet.getAvailabilityStatus().equals(AvailabilityStatusType.WITHDRAWN_LITERAL)) {
				setData.setStatus(EbXML_3_0TransformerConstants.WITHDRAWN_STATUS);
			}
		}
	}
	
	/**
	 * Sets the metadata values in the slots of the ExtrinsicObject
	 */
	private void setRegistryPackageSlots (SubmissionSetType subSet) {
		                                
		EList slots = setData.getSlot();
		
		SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
		ValueListType list = RimFactory.eINSTANCE.createValueListType();
		
		// submissionTime
		if(subSet.getSubmissionTime() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(SubmissionSetConstants.SUBMISSION_TIME);
			slot.getValueList().getValue().add(subSet.getSubmissionTime());
			slots.add(slot);
		}
		// intendedRecipient
		if(subSet.getIntendedRecipient().size() > 0){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(SubmissionSetConstants.INTENDED_RECIPIENT);
			
			Iterator i = subSet.getIntendedRecipient().iterator();
			while(i.hasNext()){
				IntendedRecipientType recipient = (IntendedRecipientType)i.next();
				String slotValue = new String();
				// get organization, if present
				if(recipient.getOrganization() != null){
					slotValue = HL7V2MessageFormat.toMessageString(recipient.getOrganization(), MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
				}
				// get person, if present
				if (recipient.getPerson() != null){
					String person = HL7V2MessageFormat.toMessageString(recipient.getPerson(), MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
					if (person.length() > 0){
						slotValue += MessageDelimiters.FIELD + person;
					}
				}
				//Added by CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
				// get telecommunication, if present
				if (recipient.getTelecommunication() != null){
					String tel = HL7V2MessageFormat.toMessageString(recipient.getTelecommunication(), MessageDelimiters.COMPONENT);
					if (tel.length() > 0){
						slotValue += MessageDelimiters.FIELD + tel;
					}
				}
				// add to the slot if value is present
				if(slotValue.length() > 0){
					slot.getValueList().getValue().add(slotValue);
				}
			}
			slots.add(slot);
		}
	}
	/**
	 * Sets the metadata values in the Classifications of the
	 * RegistryPackage
	 */
	private void setRegistryPackageClassifications(SubmissionSetType subSet){

		// contentTypeCode ////////////////////////////////////////////////////////////
		if(subSet.getContentTypeCode() != null){
			ClassificationType c = RimFactory.eINSTANCE.createClassificationType();
			// set contentTypeCode internal uuid
			c.setClassificationScheme(UUIDs.SUBMISSION_SET_CONTENT_TYPE_CODE);
			// set classifiedObject
			c.setClassifiedObject(subSet.getEntryUUID());
			// set id (required in ebXML 3.0 (and not in 2.1)
			c.setId(EbXML_3_0TransformerUtils.getRandomId("cs", 1));
			
			// set contentTypeCode code value
			c.setNodeRepresentation(subSet.getContentTypeCode().getCode());
			// set contentTypeCode diaplay name
			c.setName(copy(subSet.getContentTypeCode().getDisplayName()));
			
			// set coding scheme name in slot
			if(subSet.getContentTypeCode().getSchemeName() != null){
				EList slots = c.getSlot();
				SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
				ValueListType list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(SubmissionSetConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(subSet.getContentTypeCode().getSchemeName());
				slots.add(slot);
			}
			this.setData.getClassification().add(c);
		}
		
		// author //////////////////////////////////////////////////////////////////////////
		if(subSet.getAuthor() != null){
			// create classification for this author
			ClassificationType c = RimFactory.eINSTANCE.createClassificationType();
			// set contentTypeCode internal uuid
			c.setClassificationScheme(UUIDs.SUBMISSON_SET_AUTHOR);
			// set classifiedObject
			c.setClassifiedObject(subSet.getEntryUUID());
			// set id (required in ebXML 3.0 (and not in 2.1)
			c.setId(EbXML_3_0TransformerUtils.getRandomId("cs", 2));
			// set nodeRepresentation -- required for external classifications
			c.setNodeRepresentation("");//intentionally left blank, per IHE (see discussion on Issue 15) 
			
			
			// begin to set author data
			EList slots = c.getSlot();
			SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
			ValueListType list = RimFactory.eINSTANCE.createValueListType();
			
			// author institution
			if(subSet.getAuthor().getAuthorInstitution() != null){
				if(subSet.getAuthor().getAuthorInstitution().size() > 0){
					slot.setValueList(list);
					slot.setName(SubmissionSetConstants.AUTHOR_INSTITUTION);
					Iterator j = subSet.getAuthor().getAuthorInstitution().iterator();
					while(j.hasNext()){
						slot.getValueList().getValue().add(HL7V2MessageFormat.toMessageString((XON)j.next(),
								MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT));
					}
					slots.add(slot);
				}
			}
			
			// authorPerson
			if(subSet.getAuthor().getAuthorPerson() != null){
				slot = RimFactory.eINSTANCE.createSlotType1();
				list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(SubmissionSetConstants.AUTHOR_PERSON);
					slot.getValueList().getValue().add(HL7V2MessageFormat.toMessageString(subSet.getAuthor().getAuthorPerson(),
							MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT));
				slots.add(slot);
			}

			// authorRole
			if(subSet.getAuthor().getAuthorRole() != null){
				if(subSet.getAuthor().getAuthorRole().size() >0){
					slot = RimFactory.eINSTANCE.createSlotType1();
					list = RimFactory.eINSTANCE.createValueListType();
					slot.setValueList(list);
					slot.setName(SubmissionSetConstants.AUTHOR_ROLE);
					Iterator j = subSet.getAuthor().getAuthorRole().iterator();
					while(j.hasNext()){
						slot.getValueList().getValue().add((String)j.next());
					}
				slots.add(slot);
				}
			}
			
			// authorSpecialty
			if(subSet.getAuthor().getAuthorSpeciality() != null){
				if(subSet.getAuthor().getAuthorSpeciality().size() >0){
					slot = RimFactory.eINSTANCE.createSlotType1();
					list = RimFactory.eINSTANCE.createValueListType();
					slot.setValueList(list);
					slot.setName(SubmissionSetConstants.AUTHOR_SPECIALITY);
					Iterator j = subSet.getAuthor().getAuthorSpeciality().iterator();
					while(j.hasNext()){
						slot.getValueList().getValue().add((String)j.next());
					}
					slots.add(slot);
				}
			}
			//Added by CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
			// authorTelecommunication
			if (subSet.getAuthor().getAuthorTelecommunication() != null){
				if (!subSet.getAuthor().getAuthorTelecommunication().isEmpty()) {
					slot = RimFactory.eINSTANCE.createSlotType1();
					list = RimFactory.eINSTANCE.createValueListType();
					slot.setValueList(list);
					slot.setName(DocumentEntryConstants.AUTHOR_TELECOMMUNICATION);
					Iterator j = subSet.getAuthor()
							.getAuthorTelecommunication().iterator();
					while (j.hasNext()) {
						slot.getValueList()
								.getValue()
								.add(HL7V2MessageFormat.toMessageString(
										(XTN) j.next(),
										MessageDelimiters.COMPONENT));
					}
					slots.add(slot);
				}
			}
			this.setData.getClassification().add(c);
		}// end if
	}
	
	/**
	 * Sets the metadata values in the ExternalIdentifiers of the
	 * RegistryPackage
	 */
	private void setRegistryPackageExternalIdentifiers(SubmissionSetType subSet) {
		EList externalIdentifiers = setData.getExternalIdentifier();
		LocalizedStringType idName = RimFactory.eINSTANCE.createLocalizedStringType();

		InternationalStringType exIDName = RimFactory.eINSTANCE.createInternationalStringType();
	
		// patientId /////////////////////////////////////////////////////
		ExternalIdentifierType exID = RimFactory.eINSTANCE.createExternalIdentifierType();
		if(subSet.getPatientId() != null){
			// set id and registryObject (required in ebXML 3.0 (and not in 2.1)
			exID.setId(EbXML_3_0TransformerUtils.getRandomId("i", 1));
			exID.setRegistryObject(subSet.getEntryUUID());
			// set patient id
			exID.setValue(HL7V2MessageFormat.toMessageString(subSet.getPatientId(),MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
			// set "XDSSubmissionSet.patientId" to be the name of this ExternalIdentifier
			idName.setValue(SubmissionSetConstants.PATIENT_ID);
			exIDName.getLocalizedString().add(idName);
			exID.setName(exIDName);	
			//set identificaitonScheme
			exID.setIdentificationScheme(UUIDs.SUBMISSION_SET_PATIENT_IDENTIFICATION_SCHEME);
			// add to ExtrinsicObject/ExternalIdentifier 
			externalIdentifiers.add(exID);
		}
		
		// sourceId /////////////////////////////////////////////////////
		exID = RimFactory.eINSTANCE.createExternalIdentifierType();
		idName = RimFactory.eINSTANCE.createLocalizedStringType();
		exIDName = RimFactory.eINSTANCE.createInternationalStringType();
		// set id in ExternalIdentifier
		if(subSet.getSourceId() != null){
			// set id and registryObject (required in ebXML 3.0 (and not in 2.1)
			exID.setId(EbXML_3_0TransformerUtils.getRandomId("i", 2));
			exID.setRegistryObject(subSet.getEntryUUID());
			// set unique id
			exID.setValue(subSet.getSourceId());
			// set "XDSSubmissionSet.sourceID" to be the name of this ExternalIdentifier
			idName = RimFactory.eINSTANCE.createLocalizedStringType();
			idName.setValue(SubmissionSetConstants.SOURCE_ID);
			exIDName = RimFactory.eINSTANCE.createInternationalStringType();
			exIDName.getLocalizedString().add(idName);
			exID.setName(exIDName);	
			//set identificaitonScheme
			exID.setIdentificationScheme(UUIDs.SUBMISSION_SET_SOURCE_IDENTIFICATION_SCHEME);
			// add to REgistryPackage/ExternalIdentifier 
			externalIdentifiers.add(exID);
		}
		
		// uniqueId /////////////////////////////////////////////////////
		exID = RimFactory.eINSTANCE.createExternalIdentifierType();
		if(subSet.getUniqueId() != null){
			// set id and RegistryObject (required in ebXML 3.0 (and not in 2.1)
			exID.setId(EbXML_3_0TransformerUtils.getRandomId("i", 3));
			exID.setRegistryObject(subSet.getEntryUUID());
			exID.setValue(subSet.getUniqueId());	
			// set "XDSSubmissionSet.uniqueID" to be the name of this ExternalIdentifier
			idName = RimFactory.eINSTANCE.createLocalizedStringType();
			idName.setValue(SubmissionSetConstants.UNIQUE_ID);
			exIDName = RimFactory.eINSTANCE.createInternationalStringType();
			exIDName.getLocalizedString().add(idName);
			exID.setName(exIDName);	
			//set identificaitonScheme
			exID.setIdentificationScheme(UUIDs.SUBMISSION_SET_UNIQUE_IDENTIFICATION_SCHEME);
			// add to ExtrinsicObject/ExternalIdentifier 
			externalIdentifiers.add(exID);
		}
	}
	
	/** Sets the associated documents, if any */
	private void setAssociatedDocuments(SubmissionSetType subSet) {
		if(subSet.getAssociatedDocuments() != null){
			if(!subSet.getAssociatedDocuments().isEmpty()){
				if(logger.isDebugEnabled()){
					logger.debug("Setting Associated Documents.");
				}
				this.documentsInSubmissionSet = new AssociationType1[subSet.getAssociatedDocuments().size()];
				Iterator i = subSet.getAssociatedDocuments().iterator();
				int count = 0;
				while(i.hasNext()){
					this.documentsInSubmissionSet[count] = RimFactory.eINSTANCE.createAssociationType1();
					// set id (required in ebXML 3.0 (and not in 2.1)
					this.documentsInSubmissionSet[count].setId(EbXML_3_0TransformerUtils.getRandomId("a", count));
					this.documentsInSubmissionSet[count].setTargetObject((String)i.next());
					this.documentsInSubmissionSet[count].setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
					this.documentsInSubmissionSet[count].setSourceObject(subSet.getEntryUUID());
					count++;
				}
				return;
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("No Submission Set Associated Documents.");
		}
	}
	
	
	/** Sets the associated folders, if any */
	private void setAssociatedFolders(SubmissionSetType subSet) {
		if(subSet.getAssociatedFolders() != null){
			if(!subSet.getAssociatedFolders().isEmpty()){
				if(logger.isDebugEnabled()){
					logger.debug("Setting Associated Folders.");
				}
				this.foldersInSubmissionSet = new AssociationType1[subSet.getAssociatedFolders().size()];
				Iterator i = subSet.getAssociatedFolders().iterator();
				int count = 0;
				while(i.hasNext()){
					this.foldersInSubmissionSet[count] = RimFactory.eINSTANCE.createAssociationType1();
					// set id (required in ebXML 3.0 (and not in 2.1)
					this.foldersInSubmissionSet[count].setId(EbXML_3_0TransformerUtils.getRandomId("a", count));
					this.foldersInSubmissionSet[count].setTargetObject((String)i.next());
					this.foldersInSubmissionSet[count].setAssociationType(EbXML_3_0TransformerConstants.HAS_MEMBER);
					this.foldersInSubmissionSet[count].setSourceObject(subSet.getEntryUUID());
					count++;
				}
				return;
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("No Submission Set Associated Folders.");
		}
	}
	
	/**
	 * private utility to aid in copying InternationalStrings in metadata
	 * to those in ebXML.
	 */
	private static InternationalStringType copy(org.openhealthtools.ihe.xds.metadata.InternationalStringType ist){
		InternationalStringType result = RimFactory.eINSTANCE.createInternationalStringType();
		if (ist != null) {
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
