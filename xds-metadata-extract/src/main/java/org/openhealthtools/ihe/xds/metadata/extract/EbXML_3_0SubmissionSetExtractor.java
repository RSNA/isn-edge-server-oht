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
import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1;
import org.openhealthtools.ihe.common.hl7v2.CX;
import org.openhealthtools.ihe.common.hl7v2.XCN;
import org.openhealthtools.ihe.common.hl7v2.XON;
import org.openhealthtools.ihe.common.hl7v2.XTN;
import org.openhealthtools.ihe.common.hl7v2.format.HL7V2MessageFormat;
import org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters;
import org.openhealthtools.ihe.xds.metadata.AuthorType;
import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.CodedMetadataType;
import org.openhealthtools.ihe.xds.metadata.IntendedRecipientType;
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;
import org.openhealthtools.ihe.xds.metadata.constants.DocumentEntryConstants;
import org.openhealthtools.ihe.xds.metadata.constants.SubmissionSetConstants;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;



/**
 * Class containing utility methods to extract XDS submission set
 * metadata from ebRIM 3.0 element.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0SubmissionSetExtractor implements SubmissionSetExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_3_0_SS_EXTR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0SubmissionSetExtractor.class);

	/** Registry package for submission set metadata */
	private RegistryPackageType setData;
	
	/** Associations representing the documents to be placed in this folder */
	private AssociationType1[] documentsInSubmissionSet;
	
	/** Associations representing the folders to be placed in this submission set*/
	private AssociationType1[] foldersInSubmissionSet;

	/**
	 * Loads the ebXML structures containing Submission Set metadata.
	 * UUIDs for classificationSchemes, identificationSchemes, objectTypes and
	 * associationTypes are expected to conform to those fixed by XDS documentataion.
	 * @see org.openhealthtools.ihe.xds.metadata.constants.UUIDs
	 * @param setData the Registry pacakage with submission set metadata, cannot be null.
	 * @param documentsInSubmissionSet list of AssociationType1 objects each representing a link 
	 * between the submission set and documents to be placed in it, may be null.
	 * @param foldersInSubmissionSet list of AssociationType1 objects each representing a link 
	 * between the submission set and folders to be placed in it, may be null.
	 * */
	public EbXML_3_0SubmissionSetExtractor(RegistryPackageType setData, 
			AssociationType1[] documentsInSubmissionSet, AssociationType1[] foldersInSubmissionSet) {
		this.setData = setData;
		this.documentsInSubmissionSet = documentsInSubmissionSet;
		this.foldersInSubmissionSet = foldersInSubmissionSet;
	}

	/**
	 * Builds an SubmissionSetType containing XDSSubmissionSet
	 * metadata within the RegistryPackage provided. Only the first non-null
	 * nested Classification will be taken to be the contentTypeCode
	 * for this submission set.
	 * Construction assumes that standard
	 * HL7 V2.5 message delimiters are used. See
	 * {@link org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters}. Length
	 * restrictions are not emented, presently.
	 * @return SubmissionSetType object populated with metadata from parameter.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.SubmissionSetExtractor#extract()
	 */
	public SubmissionSetType extract() throws MetadataExtractionException{
		if(setData == null){
			logger.error("RegistryPackage is null, cannot execute extraction.");
			throw new MetadataExtractionException ("RegistryPackage is null, cannot execute extraction.");
		}
	
		SubmissionSetType subSet = MetadataFactory.eINSTANCE.createSubmissionSetType();
		// extract Registry Package attributes into metadata data members
		if(logger.isDebugEnabled()){
			logger.debug("Extracting attributes from the Registry Package.");
		}
		extractRegistryPackageAttributes(subSet);
		
		// extract the RegistryPackage/Name as title
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Name from the Registry Package.");
		}
		subSet.setTitle(copy(this.setData.getName()));
		
		// extract Description
		if(logger.isDebugEnabled()){
			logger.debug("Extracting description from the Registry Package.");
		}
		subSet.setComments(copy(setData.getDescription()));
		
		// extract Slots
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Slot data from  the Registry Package.");
		}
		extractRegistryPackageSlots(subSet);

		// extract ExternalIdentifiers
		if(logger.isDebugEnabled()){
			logger.debug("Extracting ExternalIdentifier data from the Registry Package.");
		}
		extractRegistryPackageExternalIdentifiers(subSet);
		
		
		// extract Classification
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Classification data from the Registry Package.");
		}
		extractRegistryPackageClassification(subSet);
		
		// extract Document Associations
		extractAssociatedDocuments (subSet);

		
		// extract Folder Associations
		extractAssociatedFolders (subSet);
		
		return subSet;
	}
	
	/**
	 * Extracts the attributes that correspond to XDSSubmissionSet metadata
	 * attributes from the RegistryPackage. Will extract the 
	 * RegistryPackage/@id for the entryUUID metadata, however, this information 
	 * should not be changed by any actor except the registry.
	 */
	private void extractRegistryPackageAttributes(SubmissionSetType subSet) {
		// Extract RegistryPackage/@id for entryUUID 
		subSet.setEntryUUID(this.setData.getId());
		
		if (setData.getStatus() != null) {
			if (setData.getStatus().equals(EbXML_3_0ExtractorConstants.APPROVED_STATUS)) {
				subSet.setAvailabilityStatus(AvailabilityStatusType.APPROVED_LITERAL);
			} else if (setData.getStatus().equals(EbXML_3_0ExtractorConstants.DEPRECATED_STATUS)) {
				subSet.setAvailabilityStatus(AvailabilityStatusType.DEPRECATED_LITERAL);
			} else if (setData.getStatus().equals(EbXML_3_0ExtractorConstants.SUBMITTED_STATUS)) {
				subSet.setAvailabilityStatus(AvailabilityStatusType.SUBMITTED_LITERAL);
			} else if (setData.getStatus().equals(EbXML_3_0ExtractorConstants.WITHDRAWN_STATUS)) {
				subSet.setAvailabilityStatus(AvailabilityStatusType.WITHDRAWN_LITERAL);
			} else {
				logger.error("Unknown Status. Status will not be included in extracted content.");
			}
		}
	}

	
	/**
	 * Extracts metadata values from the slots of the RegistryPackage
	 */
	private void extractRegistryPackageSlots(SubmissionSetType subSet){
		EList slots = setData.getSlot();
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
			if(slotName.equals(SubmissionSetConstants.SUBMISSION_TIME)){
				subSet.setSubmissionTime((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(SubmissionSetConstants.INTENDED_RECIPIENT)){
				Iterator j = slot.getValueList().getValue().iterator();
				while(j.hasNext()){
					String slotValue = (String)j.next();
					IntendedRecipientType recipient = MetadataFactory.eINSTANCE.createIntendedRecipientType();
					StringTokenizer tokenizer = new StringTokenizer(slotValue, "|");
					if(tokenizer.hasMoreTokens()){
						String token = tokenizer.nextToken();
						// organization
						if (token != null){
							if(token.length()>0){
								XON intendedOrganization = HL7V2MessageFormat.buildXONFromMessageString(token,MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
								recipient.setOrganization(intendedOrganization);
							}
							else{ logger.info("Slot: " + slotName + " organzation is empty");}
						}
						// person
						if (tokenizer.hasMoreTokens()){
							token = tokenizer.nextToken();
							if (token != null){
								if(token.length()>0){
									XCN intendedPerson = HL7V2MessageFormat.buildXCNFromMessageString(token, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
									recipient.setPerson(intendedPerson);
								}
								else{ logger.info("Slot: " + slotName + " person is empty");}
						}
						// telcom
						//Added by CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
						if (tokenizer.hasMoreTokens()){
							token = tokenizer.nextToken();
							if (token != null){
								if(token.length()>0){
									XTN intendedPersonTel = HL7V2MessageFormat.buildXTNFromMessageString(token, MessageDelimiters.COMPONENT);
									recipient.setTelecommunication(intendedPersonTel);
								}
								else{ logger.info("Slot: " + slotName + " person telcom is empty");}
							}
						}
						if (recipient.getOrganization() != null || recipient.getPerson() != null || recipient.getTelecommunication() != null)
							subSet.getIntendedRecipient().add(recipient);
						else 
							logger.error("Slot: " + slotName + " has all empty tokens. No intended recipient added.");	
						}
					}
					else {
						logger.error("Slot: " + slotName + " has no tokens.");	
					}	
				}
			}
			else{
				logger.error("Unidentified Slot: " + slotName + ". Slot content will not be included in extracted content.");
			}
		}
	}
	
	
	/**
	 * Extracts metadata values from the ExternalIdentifiers of the
	 * RegisryPackage
	 */
	private void extractRegistryPackageExternalIdentifiers(SubmissionSetType subSet){
		EList externalIdentifiers = setData.getExternalIdentifier();
		for (int i = 0; i < externalIdentifiers.size(); i++) {
			ExternalIdentifierType exID = (ExternalIdentifierType) externalIdentifiers.get(i);
			//	null check
			if(exID == null){continue;}
			
			// extract metadata
			String exUUID = exID.getIdentificationScheme();
			// cannot continue with invalid files.
			if(exUUID == null){
				logger.error("Required ExternalIdentifier/@identificationScheme attribute missing for following id: "
						+ exID.getValue() + ". ID will not be included in extracted content.");
			}
			
			if (exUUID.equals(UUIDs.SUBMISSION_SET_PATIENT_IDENTIFICATION_SCHEME)) {
				String s = exID.getValue();
				CX patientId = HL7V2MessageFormat.buildCXFromMessageString(s,
						MessageDelimiters.COMPONENT,
						MessageDelimiters.SUBCOMPONENT);
				subSet.setPatientId(patientId);
			}
			else if (exUUID.equals(UUIDs.SUBMISSION_SET_SOURCE_IDENTIFICATION_SCHEME)) {
				subSet.setSourceId(exID.getValue());
			} 
			else if (exUUID.equals(UUIDs.SUBMISSION_SET_UNIQUE_IDENTIFICATION_SCHEME)) {
				subSet.setUniqueId(exID.getValue());
			}
			else{
				logger.error("Unidentified ExternalIdentifier/@identificationScheme: " + exUUID + ". " +
						exID.getValue() + " will not be included in extracted content.");
			}
		}// end loop
	}
	
	/**
	 * Extracts metadata values from the Classifications of the RegistryPackage. 
	 * Should be only one Classification (contentTypeCode). The first contentTypeCode
	 * identified will be extracted, the rest will be ignored.
	 */
	private void extractRegistryPackageClassification(SubmissionSetType subSet){
		EList classifications = this.setData.getClassification();
		if(classifications == null){return;}
		
		// begin set list of classifications
		for (int i = 0; i < classifications.size(); i++) {
			ClassificationType classification = (ClassificationType) classifications.get(i);
			// null check
			if(classification == null){ continue;}
			if(classification.getClassificationScheme().equals(UUIDs.SUBMISSON_SET_AUTHOR)){
				// add an author
				AuthorType author = MetadataFactory.eINSTANCE.createAuthorType();
								
				for(int j = 0; j < classification.getSlot().size(); j++){
					SlotType1 slot = (SlotType1)classification.getSlot().get(j);
					
					// null checks
					if(slot == null){continue;}
					if(slot.getName() == null){continue;}
					if(slot.getValueList() == null){ continue;}
					if(slot.getValueList().getValue() == null){continue;}
					if(slot.getValueList().getValue().size() < 1) {continue;}
					else if(slot.getValueList().getValue().get(0) == null){continue;}
					
					String slotName = slot.getName();
					if(slotName.equals(SubmissionSetConstants.AUTHOR_INSTITUTION)){
						// get the XON string
						String s = (String)slot.getValueList().getValue().get(0);
						XON authorInstitution = HL7V2MessageFormat.buildXONFromMessageString(s,MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT);
						author.getAuthorInstitution().add(authorInstitution);
					}
					else if(slotName.equals(SubmissionSetConstants.AUTHOR_PERSON)){
						if(author.getAuthorPerson() != null){
							logger.error("Duplicate Author.authorPerson. Will only use first full name in the extracted content.");
							continue;
						}
						// get the XCN string
						String s = (String)slot.getValueList().getValue().get(0);
						XCN authorPerson = HL7V2MessageFormat.buildXCNFromMessageString(s,MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT);
						author.setAuthorPerson(authorPerson);
					}
					else if(slotName.equals(SubmissionSetConstants.AUTHOR_ROLE)){
						author.getAuthorRole().add((String)slot.getValueList().getValue().get(0));	
					}
					else if(slotName.equals(SubmissionSetConstants.AUTHOR_SPECIALITY)){
						author.getAuthorSpeciality().add((String)slot.getValueList().getValue().get(0));
					}
					//Added by CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
					else if(slotName.equals(DocumentEntryConstants.AUTHOR_TELECOMMUNICATION)){
						// get the XTN string
						String s = (String)slot.getValueList().getValue().get(0);
						// convert
						XTN authorTelecommunication = HL7V2MessageFormat.buildXTNFromMessageString(s,MessageDelimiters.COMPONENT);
						author.getAuthorInstitution().add(authorTelecommunication);
					}
				}// end slot loop
				subSet.setAuthor(author);
			}
			else if (classification.getClassificationScheme().equals(UUIDs.SUBMISSION_SET_CONTENT_TYPE_CODE)){
				if(subSet.getContentTypeCode() != null){
					logger.error("Duplicate SubmissionSet.contentTypeCode. Will only use first code in the extracted content.");
					continue;
				}
				// build code
				CodedMetadataType code = MetadataFactory.eINSTANCE.createCodedMetadataType();
				code.setCode(classification.getNodeRepresentation());
				code.setDisplayName(copy(classification.getName()));
				// null checks on slot, if all good .. set code scheme name
				if(classification.getSlot() != null){
					if(classification.getSlot().size() > 0){
						if(classification.getSlot().get(0) != null){
							SlotType1 cSlot = (SlotType1)classification.getSlot().get(0);
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
				subSet.setContentTypeCode(code);	
		
			}
			// cannot continue with invalid files.
			else if(classification.getClassificationScheme() == null){
				logger.error("Required Classification/@classificationScheme attribute missing. "
							+ "Code or Author will not be included in extracted content.");
			}
			else{
				logger.error("Unidentified Classification/@classificationScheme: " + classification.getClassificationScheme()
						+ ". Code or Author will not be included in extracted content.");
			}
		}
	}
	
	/** Extracts the associated documents, if any */
	private void extractAssociatedDocuments (SubmissionSetType subSet){
		if(this.documentsInSubmissionSet != null){
			if(this.documentsInSubmissionSet.length >0){	
				if(logger.isDebugEnabled()){
					logger.debug("Extracting Submission Set Associated Documents.");
				}
				for(int i = 0; i < this.documentsInSubmissionSet.length; i++){
					// verify the association is for this Submission set
					if(this.documentsInSubmissionSet[i].getSourceObject().equals(subSet.getEntryUUID())){
						subSet.getAssociatedDocuments().add(this.documentsInSubmissionSet[i].getTargetObject());
					}
					else{
						logger.error("Souce Object on " + i +"th Document Association does not match the entryUUID for this Submission Set. " +
								"This Association will not be included in the extraction.");
					}
				}
				return;
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("No Submission Set Associated Documents.");
		}
	}
	
	/** Extracts the associated folders, if any */
	private void extractAssociatedFolders (SubmissionSetType subSet){
		if(this.foldersInSubmissionSet != null){
			if(this.foldersInSubmissionSet.length >0){	
				if(logger.isDebugEnabled()){
					logger.debug("Extracting Submission Set Associated Folders.");
				}
				for(int i = 0; i < this.foldersInSubmissionSet.length; i++){
					// verify the association is for this Submission set
					if(this.foldersInSubmissionSet[i].getSourceObject().equals(subSet.getEntryUUID())){
						subSet.getAssociatedFolders().add(this.foldersInSubmissionSet[i].getTargetObject());
					}
					else{
						logger.error("Souce Object on " + (i+1) +"th Folder Association does not match the entryUUID for this Submission Set. " +
								"This Association will not be included in the extraction.");
					}
				}
				return;
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("No Submission Set Associated Folders.");
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
