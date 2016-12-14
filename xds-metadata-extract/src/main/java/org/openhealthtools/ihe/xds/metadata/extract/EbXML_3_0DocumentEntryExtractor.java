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

import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1;
import org.openhealthtools.ihe.common.hl7v2.CX;
import org.openhealthtools.ihe.common.hl7v2.Hl7v2Factory;
import org.openhealthtools.ihe.common.hl7v2.SourcePatientInfoType;
import org.openhealthtools.ihe.common.hl7v2.XAD;
import org.openhealthtools.ihe.common.hl7v2.XCN;
import org.openhealthtools.ihe.common.hl7v2.XON;
import org.openhealthtools.ihe.common.hl7v2.XPN;
import org.openhealthtools.ihe.common.hl7v2.XTN;
import org.openhealthtools.ihe.common.hl7v2.format.HL7V2MessageFormat;
import org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters;
import org.openhealthtools.ihe.xds.metadata.AuthorType;
import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.CodedMetadataType;
import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;
import org.openhealthtools.ihe.xds.metadata.ExtensionType;
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.ParentDocumentRelationshipType;
import org.openhealthtools.ihe.xds.metadata.ParentDocumentType;
import org.openhealthtools.ihe.xds.metadata.constants.DocumentEntryConstants;
import org.openhealthtools.ihe.xds.metadata.constants.SubmissionSetConstants;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;

/**
 * Class to extract document entry
 * metadata from ebRIM 3.0 elements.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0DocumentEntryExtractor implements DocumentEntryExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_3_0_DE_EXTR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0DocumentEntryExtractor.class);
	
	/**Extrinsic object for document entry, metadata */
	private ExtrinsicObjectType docData;
	
	/** Association for the parent docuemt, if present */
	private AssociationType1 parentData;
	
	
	/**
	 * Loads the ebXML structures containing Document Entry metadata.
	 * UUIDs for classificationSchemes, identificationSchemes, objectTypes and
	 * associationTypes are expected to conform to those fixed by XDS documentataion.
	 * @see org.openhealthtools.ihe.xds.metadata.constants.UUIDs
	 * @param docData the ExtrinsicObject for the document entry metadata. Cannot be null.
	 * @param parentData the Association with the parent of this document. Can be null if
	 * no parent document is referenced.
	 */
	public EbXML_3_0DocumentEntryExtractor(ExtrinsicObjectType docData, AssociationType1 parentData) {
		this.docData = docData;
		this.parentData = parentData;
	}
	
	/**
	 * Builds an DocumentEntryType containing XDSDocumentEntry
	 * metadata, including parent document data, from the 
	 * ExtrinsicObject and Association parameter provided. Will extract the 
	 * ExtrinsicObject/@id for the entryUUID metadata.
	 * Construction assumes that sandard
	 * HL7 V2.5 message delimiters are used. See
	 * {@link org.openhealthtools.ihe.common.hl7v2.format.MessageDelimiters}. Length
	 * restrictions are not implemented, presently.
	 * @return DocumentEntryType object populated with metadata from the extractor.
	 */
	public DocumentEntryType extract() throws MetadataExtractionException{
		// check for null extrinsic object
		if (this.docData == null) {
			logger.error("ExtrinsicObject is null, cannot execute extraction.");
			throw new MetadataExtractionException ("ExtrinsicObject is null, cannot execute extraction.");
		}
		
		// create document entry
		DocumentEntryType docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
		
		// check for parent data
		if(parentData != null){
			// relationship
			String rel = parentData.getAssociationType();
			ParentDocumentType parentDoc = MetadataFactory.eINSTANCE.createParentDocumentType();
			if(rel.equals(EbXML_3_0ExtractorConstants.XFRM)){
				parentDoc.setParentDocumentRelationship(ParentDocumentRelationshipType.XFRM_LITERAL);
			}
			else if(rel.equals(EbXML_3_0ExtractorConstants.APND)){
				parentDoc.setParentDocumentRelationship(ParentDocumentRelationshipType.APND_LITERAL);
			}
			else if(rel.equals(EbXML_3_0ExtractorConstants.RPLC)){
				parentDoc.setParentDocumentRelationship(ParentDocumentRelationshipType.RPLC_LITERAL);
			}
			else if(rel.equals(EbXML_3_0ExtractorConstants.XFRM_RPLC)){
				parentDoc.setParentDocumentRelationship(ParentDocumentRelationshipType.XFRMRPLC_LITERAL);
			}
			else{
				//error
				logger.error("AssociationType for parent document is not among the following: " + 
						ParentDocumentRelationshipType.VALUES.toString());
			}
			
			// id
			if(logger.isDebugEnabled()){
				logger.debug("Extracting parent document id from the Association.");
			}
			if(parentData.getTargetObject() != null){
				parentDoc.setParentDocumentId(parentData.getTargetObject());
			}
			else{
				logger.error("Id for parent document is null");
			}
			
			//code
			if(parentData.getClassification() != null){
				if(!parentData.getClassification().isEmpty()){
					if(logger.isDebugEnabled()){
						logger.debug("Extracting parent document relationship code from the Association.");
					}
					ClassificationType classification = (ClassificationType)parentData.getClassification().get(0);
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
					String codeUUID = classification.getClassificationScheme();
					// cannot continue with invalid files.
					if(codeUUID == null){
						logger.error("Required Classification/@classificationScheme attribute missing for following code: "
								+ code.getCode() + ", " + code.getSchemeName() + ". Code will not be included in extracted content.");
					}
					else if(codeUUID == UUIDs.DOC_ENTRY_PARENT_DOCUMENT_RELATIONSHIP_CODE){
						parentDoc.setParentDocumentRelationshipCode(code);
					} 
					else{
						logger.error("Required Classification/@classificationScheme attribute missing for following code: "
								+ code.getCode() + ", " + code.getSchemeName() + ". Code will not be included in extracted content.");
					}
				}
			}
			docEntry.setParentDocument(parentDoc);
		}
		
		
		// extract Extrinsic object attributes into metadata data members
		if(logger.isDebugEnabled()){
			logger.debug("Extracting attributes from the Extrinsic Object.");
		}
		extractExtrinsicObjectAttributes(docEntry);
		
		// extract the ExtrinsicObject/Name as title
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Name from the Extrinsic Object.");
		}
		docEntry.setTitle(copy(docData.getName()));
		
		// extract Description
		if(logger.isDebugEnabled()){
			logger.debug("Extracting description from the Extrinsic Object.");
		}
		docEntry.setComments(copy(docData.getDescription()));
		
		// process ExtrinsicObject slots
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Slot data from the Extrinsic Object.");
		}
		extractExtrinsicObjectSlots(docEntry);
		
		// process ExtrinsicObject classifications
		if(logger.isDebugEnabled()){
			logger.debug("Extracting Classification data from the Extrinsic Object.");
		}
		extractExtrinsicObjectClassifications(docEntry);
		
		// process ExtrinsicObject external identifiers
		if(logger.isDebugEnabled()){
			logger.debug("Extracting ExternalIdentifier data from the Extrinsic Object.");
		}
		extractExtringsicObjectExternalIdentifiers(docEntry);
		

		return docEntry;
	}
	
	/**
	 * Extracts the attributes that correspond to XDSDocumentEntry metadata
	 * attributes from the ExtrinsicObject. Will extract the 
	 * ExtrinsicObject/@id for the entryUUID metadata, however, this information 
	 * should not be changed by any actor except the registry.
	 */
	private void extractExtrinsicObjectAttributes(DocumentEntryType docEntry) {
		// Extract ExtrinsicObject/@id for entryUUID 
		docEntry.setEntryUUID(docData.getId());
		
		if (docData.getStatus() != null) {
			if (docData.getStatus().equals(EbXML_3_0ExtractorConstants.APPROVED_STATUS)) {
				docEntry.setAvailabilityStatus(AvailabilityStatusType.APPROVED_LITERAL);
			} else if (docData.getStatus().equals(EbXML_3_0ExtractorConstants.DEPRECATED_STATUS)) {
				docEntry.setAvailabilityStatus(AvailabilityStatusType.DEPRECATED_LITERAL);
			} else if (docData.getStatus().equals(EbXML_3_0ExtractorConstants.SUBMITTED_STATUS)) {
				docEntry.setAvailabilityStatus(AvailabilityStatusType.SUBMITTED_LITERAL);
			} else if (docData.getStatus().equals(EbXML_3_0ExtractorConstants.WITHDRAWN_STATUS)) {
				docEntry.setAvailabilityStatus(AvailabilityStatusType.WITHDRAWN_LITERAL);
			} else {
				logger.error("Unknown Status. Status will not be included in extracted content.");
			}
		}
		docEntry.setMimeType(docData.getMimeType());
	}

	/**
	 * Extracts metadata values from the slots of the ExtrinsicObject
	 */
	private void extractExtrinsicObjectSlots(DocumentEntryType docEntry){
		EList slots = docData.getSlot();
		for(int i = 0; i < slots.size(); i++){
			SlotType1 slot = (SlotType1)slots.get(i);
			
			// null checks
			if(slot == null){continue;}
			if(slot.getName() == null){continue;}
			if(slot.getValueList() == null){ continue;}
			if(slot.getValueList().getValue() == null){continue;}
			if(slot.getValueList().getValue().size() < 1) {continue;}
			else if(slot.getValueList().getValue().get(0) == null){continue;}
			
			// all ok ... extract info from the slot
			String slotName = slot.getName();
		
			if(slotName.equals(DocumentEntryConstants.CREATION_TIME)){
				docEntry.setCreationTime((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(DocumentEntryConstants.HASH)){
				docEntry.setHash((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(DocumentEntryConstants.LANGUAGE_CODE)){
				docEntry.setLanguageCode((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(DocumentEntryConstants.LEGAL_AUTHENTICATOR)){
				String s = (String)slot.getValueList().getValue().get(0);
				XCN authenticator = HL7V2MessageFormat.buildXCNFromMessageString(s,MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT);
				docEntry.setLegalAuthenticator(authenticator);
			}
			else if(slotName.equals(DocumentEntryConstants.REPOSITORY_UNIQUE_ID)){
				docEntry.setRepositoryUniqueId((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(DocumentEntryConstants.SERVICE_START_TIME)){
				docEntry.setServiceStartTime((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(DocumentEntryConstants.SERVICE_STOP_TIME)){
				docEntry.setServiceStopTime((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(DocumentEntryConstants.SIZE)){
				docEntry.setSize((String)slot.getValueList().getValue().get(0));	
			}
			else if(slotName.equals(DocumentEntryConstants.SOURCE_PATIENT_ID)){
				// get the FieldType string
				String s = (String)slot.getValueList().getValue().get(0);
				CX sourcePatientId = HL7V2MessageFormat.buildCXFromMessageString(s,MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT);
				docEntry.setSourcePatientId(sourcePatientId);
			}
			else if(slotName.equals(DocumentEntryConstants.SOURCE_PATIENT_INFO)){
				// get the PID segment
				int n = slot.getValueList().getValue().size();
				SourcePatientInfoType sourcePatientInfo = Hl7v2Factory.eINSTANCE.createSourcePatientInfoType();
				for(int j = 0; j < n; j++){
					// get the PID field
					String s = (String)slot.getValueList().getValue().get(j);
					
					// determine the PID field ItenNo set.
					String itemNo = null;
					if(s.startsWith(DocumentEntryConstants.PID10_ID)){
						itemNo = DocumentEntryConstants.PID10_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID11_ID)){
						itemNo = DocumentEntryConstants.PID11_ID;
						if(s.length() > (itemNo.length() + 1)){
							XAD xad = HL7V2MessageFormat.buildXADFromMessageString(
									s.substring(itemNo.length()+1),
									MessageDelimiters.COMPONENT);
							sourcePatientInfo.setPatientAddress(xad);
						}
					}
					else if(s.startsWith(DocumentEntryConstants.PID12_ID)){
						itemNo = DocumentEntryConstants.PID12_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID13_ID)){
						itemNo = DocumentEntryConstants.PID13_ID;
						if(s.length() > (itemNo.length() + 1)){
							XTN xtn = HL7V2MessageFormat.buildXTNFromMessageString(
									s.substring(itemNo.length()+1),
									MessageDelimiters.COMPONENT);
							sourcePatientInfo.setPatientPhoneHome(xtn);
						}
					}
					else if(s.startsWith(DocumentEntryConstants.PID14_ID)){
						itemNo = DocumentEntryConstants.PID14_ID;
						if(s.length() > (itemNo.length() + 1)){
							XTN xtn = HL7V2MessageFormat.buildXTNFromMessageString(
									s.substring(itemNo.length()+1),
									MessageDelimiters.COMPONENT);
							sourcePatientInfo.setPatientPhoneBusiness(xtn);
						}
					}
					else if(s.startsWith(DocumentEntryConstants.PID15_ID)){
						itemNo = DocumentEntryConstants.PID15_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID16_ID)){
						itemNo = DocumentEntryConstants.PID16_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID17_ID)){
						itemNo = DocumentEntryConstants.PID17_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID18_ID)){
						itemNo = DocumentEntryConstants.PID18_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID19_ID)){
						itemNo = DocumentEntryConstants.PID19_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID1_ID)){	
						itemNo = DocumentEntryConstants.PID1_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID20_ID)){
						itemNo = DocumentEntryConstants.PID20_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID21_ID)){
						itemNo = DocumentEntryConstants.PID21_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID22_ID)){
						itemNo = DocumentEntryConstants.PID22_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID23_ID)){
						itemNo = DocumentEntryConstants.PID23_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID24_ID)){
						itemNo = DocumentEntryConstants.PID24_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID25_ID)){
						itemNo = DocumentEntryConstants.PID25_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID26_ID)){
						itemNo = DocumentEntryConstants.PID26_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID27_ID)){
						itemNo = DocumentEntryConstants.PID27_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID28_ID)){
						itemNo = DocumentEntryConstants.PID28_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID29_ID)){
						itemNo = DocumentEntryConstants.PID29_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID2_ID)){
						itemNo = DocumentEntryConstants.PID2_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID30_ID)){
						itemNo = DocumentEntryConstants.PID30_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID31_ID)){
						itemNo = DocumentEntryConstants.PID31_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID32_ID)){
						itemNo = DocumentEntryConstants.PID32_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID33_ID)){
						itemNo = DocumentEntryConstants.PID33_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID34_ID)){
						itemNo = DocumentEntryConstants.PID34_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID35_ID)){
						itemNo = DocumentEntryConstants.PID35_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID36_ID)){
						itemNo = DocumentEntryConstants.PID36_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID37_ID)){
						itemNo = DocumentEntryConstants.PID37_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID38_ID)){
						itemNo = DocumentEntryConstants.PID38_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID39_ID)){
						itemNo = DocumentEntryConstants.PID39_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID3_ID)){						
						itemNo = DocumentEntryConstants.PID3_ID;
						CX cx = HL7V2MessageFormat.buildCXFromMessageString(
								s.substring(itemNo.length()+1),
								MessageDelimiters.COMPONENT, 
								MessageDelimiters.SUBCOMPONENT);
						sourcePatientInfo.getPatientIdentifier().add(cx);
					}
					else if(s.startsWith(DocumentEntryConstants.PID4_ID)){	
						itemNo = DocumentEntryConstants.PID4_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID5_ID)){
						itemNo = DocumentEntryConstants.PID5_ID;
						XPN xpn = HL7V2MessageFormat.buildXPNFromMessageString(
								s.substring(itemNo.length()+1),
								MessageDelimiters.COMPONENT);
						sourcePatientInfo.getPatientName().add(xpn);
					}
					else if(s.startsWith(DocumentEntryConstants.PID6_ID)){
						itemNo = DocumentEntryConstants.PID6_ID;
					}
					else if(s.startsWith(DocumentEntryConstants.PID7_ID)){
						itemNo = DocumentEntryConstants.PID7_ID;
						sourcePatientInfo.setPatientDateOfBirth(s.substring(itemNo.length()+1));
					}
					else if(s.startsWith(DocumentEntryConstants.PID8_ID)){
						itemNo = DocumentEntryConstants.PID8_ID;
						sourcePatientInfo.setPatientSex(s.substring(itemNo.length()+1));
					}
					else if(s.startsWith(DocumentEntryConstants.PID9_ID)){
						itemNo = DocumentEntryConstants.PID9_ID;
					}
					
					// TODO - future processing of additional PID fields, as needed
					
				}// end loop: sourcePatientInfo
				
				docEntry.setSourcePatientInfo(sourcePatientInfo);
			}// end else if
			else if(slotName.equals(DocumentEntryConstants.URI)){
				// load uri pieces into map
				Iterator iter = slot.getValueList().getValue().iterator();
				HashMap m = new HashMap();
				while(iter.hasNext()){
					// TODO have separate constant for long uri delimiter
					String uriPiece =(String)iter.next();
					StringTokenizer st = new StringTokenizer(uriPiece,"|");
					if(st.countTokens() > 1){
						try{
							int k = Integer.parseInt(st.nextToken().trim());
							m.put(new Integer(k), st.nextToken());
						}catch(Exception e){
							logger.error("Mal-formatted URI. Slot content will not be included in extracted content.", e);
						}
					}
					else if (st.countTokens() == 1){
						m.put(new Integer(1), st.nextToken());
						break;
					}
					else { // ZERO TOKENS
						logger.info("No URI found.");
					}
				}
				// reform uri
				StringBuffer longURI = new StringBuffer();
				for (int c = 0; c < m.size(); c++){
					longURI.append(m.get(new Integer((c+1))));
				}
				docEntry.setUri(longURI.toString());
			}
			
			else{
				logger.warn("Unidentified Slot: " + slotName+ ". Slot content is interpreted as 'extension metadata'.");
				
				ExtensionType extension = MetadataFactory.eINSTANCE.createExtensionType();
				// set extension name
				extension.setName(slotName);
				
				// set extension value(s)
				Iterator iter = slot.getValueList().getValue().iterator();
				while (iter.hasNext()){
					extension.getValue().add(iter.next());
				}
				docEntry.getExtension().add(extension);
			}
		}// end Slots loop
	}// end extractExtrinsicObjectSlots
	
	
	/**
	 * Extracts metadata values from the Classifications of the ExtrinsicObject
	 */
	private void extractExtrinsicObjectClassifications(DocumentEntryType docEntry){
		EList eventCodes = docEntry.getEventCode();
		EList classifications = docData.getClassification();
		if(classifications == null){return;}
		
		// begin set list of classifications
		for (int i = 0; i < classifications.size(); i++) {
			ClassificationType classification = (ClassificationType) classifications.get(i);
			// null check
			if(classification == null){ continue;}
			if(classification.getClassificationScheme().equals(UUIDs.DOC_ENTRY_AUTHOR)){
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
					if(slotName.equals(DocumentEntryConstants.AUTHOR_INSTITUTION)){
						// get the XON string
						String s = (String)slot.getValueList().getValue().get(0);
						XON authorInstitution = HL7V2MessageFormat.buildXONFromMessageString(s,MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT);
						author.getAuthorInstitution().add(authorInstitution);
					}
					else if(slotName.equals(DocumentEntryConstants.AUTHOR_PERSON)){
						if(author.getAuthorPerson() != null){
							logger.error("Duplicate Author.authorPerson. Will only use first full name in the extracted content.");
							continue;
						}
						// get the XCN string
						String s = (String)slot.getValueList().getValue().get(0);
						XCN authorPerson = HL7V2MessageFormat.buildXCNFromMessageString(s,MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT);
						author.setAuthorPerson(authorPerson);
					}
					else if(slotName.equals(DocumentEntryConstants.AUTHOR_ROLE)){
						author.getAuthorRole().add((String)slot.getValueList().getValue().get(0));	
					}
					else if(slotName.equals(DocumentEntryConstants.AUTHOR_SPECIALITY)){
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
				docEntry.getAuthors().add(author);
			}
			else {// build code
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
				String codeUUID = classification.getClassificationScheme();
				// cannot continue with invalid files.
				if(codeUUID == null){
					logger.error("Required Classification/@classificationScheme attribute missing for following code: "
							+ code.getCode() + ", " + code.getSchemeName() + ". Code will not be included in extracted content.");
				}
				
				if (codeUUID.equals(UUIDs.DOC_ENTRY_CLASS_CODE)) {
					if(docEntry.getClassCode() != null){
						logger.error("Duplicate DocumentEntry.classCode. Will only use first code found in the extracted content.");
						continue;
					}
					docEntry.setClassCode(code);	
				} 
				else if (codeUUID.equals(UUIDs.DOC_ENTRY_CONFIDENTIALITY_CODE)) {
					docEntry.getConfidentialityCode().add(code);	
				} 
				else if (codeUUID.equals(UUIDs.DOC_ENTRY_EVENT_CODE)) {
					eventCodes.add(code);	
				} 
				else if (codeUUID.equals(UUIDs.DOC_ENTRY_FORMAT_CODE)) {
					if(docEntry.getFormatCode() != null){
						logger.error("Duplicate DocumentEntry.formatCode. Will only use first code found in the extracted content.");
						continue;
					}
					docEntry.setFormatCode(code);
				} 
				else if (codeUUID.equals(UUIDs.DOC_ENTRY_HEALTH_CARE_FACILITY_CODE)) {
					if(docEntry.getHealthCareFacilityTypeCode() != null){
						logger.error("Duplicate DocumentEntry.healthcareFacilityCode. Will only use first code found in the extracted content.");
						continue;
					}
					docEntry.setHealthCareFacilityTypeCode(code);
					
				} 
				else if (codeUUID.equals(UUIDs.DOC_ENTRY_PRACTICE_SETTING_CODE)) {
					if(docEntry.getPracticeSettingCode() != null){
						logger.error("Duplicate DocumentEntry.practiceSettingCode. Will only use first code found in the extracted content.");
						continue;
					}
					docEntry.setPracticeSettingCode(code);
				} 
				else if (codeUUID.equals(UUIDs.DOC_ENTRY_TYPE_CODE)) {
					if(docEntry.getTypeCode() != null){
						logger.error("Duplicate DocumentEntry.typeCode. Will only use first code found in the extracted content.");
						continue;
					}
					docEntry.setTypeCode(code);
				}
				else{
					logger.error("Unidentified Classification/@classificationScheme: " + codeUUID + ". "
							+ code.getCode() + ", " + code.getSchemeName() + " will not be included in extracted content.");
				}
			}
		} // end loop
	}

	/**
	 * Extracts metadata values from the ExternalIdentifiers of the
	 * ExtrinsicObject
	 */
	private void extractExtringsicObjectExternalIdentifiers(DocumentEntryType docEntry){
		EList externalIdentifiers = docData.getExternalIdentifier();
		for (int i = 0; i < externalIdentifiers.size(); i++) {
			ExternalIdentifierType exID = (ExternalIdentifierType) externalIdentifiers.get(i);
			// null check
			if(exID == null){continue;}
			
			// extract metadata
			String exUUID = exID.getIdentificationScheme();
			// cannot continue with invalid files.
			if(exUUID == null){
				logger.error("Required ExternalIdentifier/@identificationScheme attribute missing for following id: "
						+ exID.getValue() + ". ID will not be included in extracted content.");
			}
			
			if (exUUID.equals(UUIDs.DOC_ENTRY_PATIENT_IDENTIFICATION_SCHEME)) {
				String s = exID.getValue();
				CX patientId = HL7V2MessageFormat.buildCXFromMessageString(s,
						MessageDelimiters.COMPONENT,
						MessageDelimiters.SUBCOMPONENT);
				docEntry.setPatientId(patientId);
			} 
			else if (exUUID.equals(UUIDs.DOC_ENTRY_UNIQUE_IDENTIFICATION_SCHEME)) {
				docEntry.setUniqueId(exID.getValue());
			}
			else{
				logger.error("Unidentified ExternalIdentifier/@identificationScheme: " + exUUID + ". " +
						exID.getValue() + " will not be included in extracted content.");
			}

		}// end loop
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




