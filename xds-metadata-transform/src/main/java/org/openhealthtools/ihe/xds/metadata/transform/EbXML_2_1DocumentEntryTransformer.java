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
import org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimFactory;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType;
import org.openhealthtools.ihe.common.hl7v2.CX;
import org.openhealthtools.ihe.common.hl7v2.SourcePatientInfoType;
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
import org.openhealthtools.ihe.xds.metadata.constants.DocumentEntryConstants;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;


/**
 * Class containing utility methods to transform XDS document entry
 * metadata to ebRIM 2.1 element.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_2_1DocumentEntryTransformer implements DocumentEntryTransformer {
	
	/** Descriptor for Transformer */
	public static final String DESCRIPTOR = "EBXML_DE_XFRMR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_2_1DocumentEntryTransformer.class);
	
	/** Max number of characters for a value in a Slot */
	private static final int MAX_SLOT_LENGTH = 128;
	
	/**
	 * Extrinsic Object for document entry metadata
	 */
	private ExtrinsicObjectType docData;
	/**
	 * Association for parent document metadata, if applicable
	 */
	private AssociationType1 parentData;
	
	/**
	 * Creates the transformer.
	 */
	public EbXML_2_1DocumentEntryTransformer() {
		this.docData = null;
		this.parentData = null;
	}
	
	
	/**
	 * Returns the ExtrinsicObjectType containing the document entry metadata values. 
	 * Returns null if the
	 * transformation has not been executed, or had failed.
	 * @return the extrinsic object
	 */
	public ExtrinsicObjectType getExtrinsicObject() {
		return this.docData;
	}

	/**
	 * Returns the AssociationType1 containing the document entry metadata values pertinant
	 * to the parent document, if present
	 * Returns null if the
	 * transformation has not been executed, has failed, or no parent exists.
	 * @return the parent document association, if present
	 */
	public AssociationType1 getAssociation() {
		return this.parentData;
	}


	/** 
	 * Renders an ExtrinsicObjectType and, if applicable, an AssociationType1 
	 * containing the document entry metadata values of the parameter, formatted in ebXML
	 * @throws MetadataTransformationException
	 * @see org.openhealthtools.ihe.xds.metadata.transform.DocumentEntryTransformer#transform(org.openhealthtools.ihe.xds.metadata.DocumentEntryType)
	 */
	public void transform(DocumentEntryType docEntry) throws MetadataTransformationException{
		if (docEntry == null) {
			logger.error("DocumentEntry is null, cannot execute transformation.");
			throw new MetadataTransformationException(
					"DocumentEntry is null, cannot execute transformation.");
		}
		this.docData = RimFactory.eINSTANCE.createExtrinsicObjectType();
		
		// set Extrinsic object attributes from  metadata data members
		if(logger.isDebugEnabled()){
			logger.debug("Setting attributes on the Extrinsic Object.");
		}
		setExtrinsicObjectAttributes(docEntry);
		
		// set the ExtrinsicObject/Name from title
		if(logger.isDebugEnabled()){
			logger.debug("Setting Name on the Extrinsic Object.");
		}
		docData.setName(copy(docEntry.getTitle()));
		
		// set the ExtrinsicObject/Description from title
		if(logger.isDebugEnabled()){
			logger.debug("Setting Description on the Extrinsic Object.");
		}
		docData.setDescription(copy(docEntry.getComments()));

		
		// process ExtrinsicObject slots
		if(logger.isDebugEnabled()){
			logger.debug("Setting Slots on the Extrinsic Object.");
		}
		setExtrinsicObjectSlots(docEntry);
		
		// set ExtrinsicObject classifications from metadata codes
		if(logger.isDebugEnabled()){
			logger.debug("Setting Classifications on the Extrinsic Object.");
		}
		setExtrinsicObjectClassifications(docEntry);
		
		// set ExtrinsicObject external identifiers from metadata
		if(logger.isDebugEnabled()){
			logger.debug("Setting ExternalIdentifiers on the Extrinsic Object.");
		}
		setExtringsicObjectExternalIdentifiers(docEntry);
		
		if(docEntry.getParentDocument() != null){
			this.parentData = RimFactory.eINSTANCE.createAssociationType1();
			// id
			if(docEntry.getParentDocument().getParentDocumentId() !=null){
				this.parentData.setTargetObject(docEntry.getParentDocument().getParentDocumentId());
			}
			// relationship
			if(docEntry.getParentDocument().getParentDocumentRelationship() != null){
				this.parentData.setAssociationType(docEntry.getParentDocument().getParentDocumentRelationship().getName());
			}
			//code
			if(docEntry.getParentDocument().getParentDocumentRelationshipCode() != null){
				// get list of classifications
				EList classifications = this.parentData.getClassification();
				ClassificationType c = RimFactory.eINSTANCE.createClassificationType();
				EList slots = c.getSlot();
				SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
				ValueListType list = RimFactory.eINSTANCE.createValueListType();
				
				// FIXME probably should generate a UUID for internal assoc id
				String associationId = "ThisAssociation";
				this.parentData.setId(associationId);

				// set internal uuid
				c.setClassificationScheme(UUIDs.DOC_ENTRY_PARENT_DOCUMENT_RELATIONSHIP_CODE);
				// set classifiedObject (this association)
				c.setClassifiedObject(associationId);

				// set classCode code value
				c.setNodeRepresentation(docEntry.getParentDocument().getParentDocumentRelationshipCode().getCode());
				// set classCode diaplay name
				c.setName(copy(docEntry.getParentDocument().getParentDocumentRelationshipCode().getDisplayName()));
				// set coding scheme name in slot
				if(docEntry.getClassCode().getSchemeName() != null){
					slot.setValueList(list);
					slot.setName(DocumentEntryConstants.CODING_SCHEME);
					slot.getValueList().getValue().add(docEntry.getParentDocument().getParentDocumentRelationshipCode().getSchemeName());
					slots.add(slot);
				}

				classifications.add(c);
			}
			
			this.parentData.setSourceObject(docEntry.getEntryUUID());
		}
		else if(logger.isDebugEnabled()){
			logger.debug("No parentDocumentID for "+ docEntry.getEntryUUID() + ".");
		}
	}
	
	/**
	 * Sets the ExtrinsicObject attributes that correspond to XDSDocumentEntry metadata.
	 * Will set the 
	 * ExtrinsicObject/@id and Classification/@classifiedObject 
	 * from the entryUUID metadata. This could cause issues if this entryUUID did not come 
	 * come from the Registry. Also sets ExtrinsicObject/@objectType to 
	 * "urn:uuid:7edca82f-054d-47f2-a032-9b2a5b5186c1", indicating that this ExtrinsicObject
	 * represents an XDSDocumentEntry.
	 */
	private void setExtrinsicObjectAttributes(DocumentEntryType docEntry) {
		//Set the entryUUID ... should make sure still registry issued.
		docData.setId(docEntry.getEntryUUID());
		
		// set objectType
		docData.setObjectType(UUIDs.DOC_ENTRY_OBJECT);
		
		// set availiablityStatus
		if (docEntry.isSetAvailabilityStatus()) {
			if (docEntry.getAvailabilityStatus().equals(AvailabilityStatusType.APPROVED_LITERAL)) {
				docData.setStatus(StatusType.APPROVED_LITERAL);
			} else if (docEntry.getAvailabilityStatus().equals(AvailabilityStatusType.DEPRECATED_LITERAL)) {
				docData.setStatus(StatusType.DEPRECATED_LITERAL);
			} else if (docEntry.getAvailabilityStatus().equals(AvailabilityStatusType.SUBMITTED_LITERAL)) {
				docData.setStatus(StatusType.SUBMITTED_LITERAL);
			} else if (docEntry.getAvailabilityStatus().equals(AvailabilityStatusType.WITHDRAWN_LITERAL)) {
				docData.setStatus(StatusType.WITHDRAWN_LITERAL);
			}
		}
		// set mimeType
		docData.setMimeType(docEntry.getMimeType());
	}
	
	
	/**
	 * Sets the metadata values in the slots of the ExtrinsicObject
	 */
	private void setExtrinsicObjectSlots( DocumentEntryType docEntry){
		EList slots = docData.getSlot();
		SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
		ValueListType list = RimFactory.eINSTANCE.createValueListType();
		
		// creationTime
		if(docEntry.getCreationTime() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.CREATION_TIME);
			slot.getValueList().getValue().add(docEntry.getCreationTime());
			slots.add(slot);
		}
		
		// hash
		if(docEntry.getHash() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.HASH);
			slot.getValueList().getValue().add(docEntry.getHash());
			slots.add(slot);
		}
		
		// metadata extensions (if any)
		if(docEntry.getExtension() != null){
			if(docEntry.getExtension().size() > 0){
				Iterator i = docEntry.getExtension().iterator();
				while(i.hasNext()){
					ExtensionType extension = (ExtensionType)i.next();
					if(extension.getName() != null){
						if(extension.getValue() != null){
							if(extension.getValue().size() > 0){
								slot = RimFactory.eINSTANCE.createSlotType1();
								list = RimFactory.eINSTANCE.createValueListType();
								slot.setValueList(list);
								slot.setName(extension.getName());
								Iterator j = extension.getValue().iterator();
								while(j.hasNext()){
									slot.getValueList().getValue().add(j.next());
								}
								slots.add(slot);
							}
						}
					}
				}
			}
		}
		
		//	languageCode
		if(docEntry.getLanguageCode() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.LANGUAGE_CODE);
			slot.getValueList().getValue().add(docEntry.getLanguageCode());
			slots.add(slot);
		}
		
		// legal Authenticators
		if(docEntry.getLegalAuthenticator() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.LEGAL_AUTHENTICATOR);
			slot.getValueList().getValue().add(HL7V2MessageFormat.toMessageString(docEntry.getLegalAuthenticator(),
					MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT));
			slots.add(slot);
		}
		
		// repositoryUniqueId (should be in XDS.b, EbXML 3.0 only
		if(docEntry.getRepositoryUniqueId() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.REPOSITORY_UNIQUE_ID);
			slot.getValueList().getValue().add(docEntry.getRepositoryUniqueId());
			slots.add(slot);
		}
		
		// serviceStartTime
		if(docEntry.getServiceStartTime() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.SERVICE_START_TIME);
			slot.getValueList().getValue().add(docEntry.getServiceStartTime());
			slots.add(slot);
		}
		// serviceStopTime
		if(docEntry.getServiceStopTime() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.SERVICE_STOP_TIME);
			slot.getValueList().getValue().add(docEntry.getServiceStopTime());
			slots.add(slot);
		}
		// size
		if(docEntry.getSize() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.SIZE);
			slot.getValueList().getValue().add(docEntry.getSize());
			slots.add(slot);
		}
		
		// URI / LONG-URI
		if(docEntry.getUri() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.URI);
			
			// when length is < 128 chars
			if(docEntry.getUri().length() <= MAX_SLOT_LENGTH){
				slot.getValueList().getValue().add(docEntry.getUri());
			}
			else{
				// break uri into chunks, add as slot values
				int piece = 1;
				int start = 0;
				while (start < docEntry.getUri().length()){
					// compute next chunk not to exceed MAX chars in length,
					// including separator notation
					int end = start + MAX_SLOT_LENGTH - ((piece + "|").length());
					if(end > docEntry.getUri().length()){
						end = docEntry.getUri().length();
					}
					// FIXME have constant for the delimiter
					slot.getValueList().getValue().add(piece+ "|" + docEntry.getUri().substring(start, end));
					start = end;
					piece++;
				}
			}
			// add either the URI or the LONG-URI slot
			slots.add(slot);
		}
		
		// sourcePatientId
		if(docEntry.getSourcePatientId() != null){
			slot = RimFactory.eINSTANCE.createSlotType1();
			list = RimFactory.eINSTANCE.createValueListType();
			slot.setValueList(list);
			slot.setName(DocumentEntryConstants.SOURCE_PATIENT_ID);
			slot.getValueList().getValue().add(HL7V2MessageFormat.toMessageString(
					docEntry.getSourcePatientId(),
					MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
			slots.add(slot);
		}
		
		// sourcePatientInfo
		slot = RimFactory.eINSTANCE.createSlotType1();
		list = RimFactory.eINSTANCE.createValueListType();
		slot.setValueList(list);
		slot.setName(DocumentEntryConstants.SOURCE_PATIENT_INFO);
		SourcePatientInfoType pid = docEntry.getSourcePatientInfo();
		if(pid == null){
			// done adding slots
			return;
		}
		
		Iterator i = pid.getPatientIdentifier().iterator();
		while(i.hasNext()){
			String s = HL7V2MessageFormat.toMessageString((CX)i.next(), MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
			if(s.length() > 0){
				slot.getValueList().getValue().add(DocumentEntryConstants.PID3_ID + MessageDelimiters.FIELD + s);
			}
		}
		i = pid.getPatientName().iterator();
		while(i.hasNext()){
			String s = HL7V2MessageFormat.toMessageString((XPN)i.next(), MessageDelimiters.COMPONENT);
			if(s.length() > 0){
				slot.getValueList().getValue().add(DocumentEntryConstants.PID5_ID + MessageDelimiters.FIELD + s);
			}
		}
		
		String s = pid.getPatientDateOfBirth();
		if(s != null){
			if (s.length() > 0){
				slot.getValueList().getValue().add(DocumentEntryConstants.PID7_ID + MessageDelimiters.FIELD + s);
			}
		}
		
		s = pid.getPatientSex();
		if(s != null){
			if(s.length() > 0){
				slot.getValueList().getValue().add(DocumentEntryConstants.PID8_ID + MessageDelimiters.FIELD + s);
			}
		}
		
		s = HL7V2MessageFormat.toMessageString(pid.getPatientAddress(), MessageDelimiters.COMPONENT);
		if(s.length() > 0){
			slot.getValueList().getValue().add(DocumentEntryConstants.PID11_ID + MessageDelimiters.FIELD + s);
		}
		
		s = HL7V2MessageFormat.toMessageString(pid.getPatientPhoneHome(), MessageDelimiters.COMPONENT);
		if(s.length() >0){
			slot.getValueList().getValue().add(DocumentEntryConstants.PID13_ID + MessageDelimiters.FIELD + s);
		}
		
		s = HL7V2MessageFormat.toMessageString(pid.getPatientPhoneBusiness(), MessageDelimiters.COMPONENT);
		if(s.length() > 0){
			slot.getValueList().getValue().add(DocumentEntryConstants.PID14_ID + MessageDelimiters.FIELD + s);
		}
		
		// finally add the PID slot, if any values set
		if(slot.getValueList().getValue().size() > 0){
			slots.add(slot); 
		}
	}// end setExtrinsicObjectSlots
	
	
	/**
	 * Sets the metadata values in the Classifications of the ExtrinsicObject
	 */
	private void setExtrinsicObjectClassifications(DocumentEntryType docEntry) {
		// get list of classifications
		EList classifications = docData.getClassification();
		ClassificationType c = RimFactory.eINSTANCE.createClassificationType();
		EList slots = c.getSlot();
		SlotType1 slot = RimFactory.eINSTANCE.createSlotType1();
		ValueListType list = RimFactory.eINSTANCE.createValueListType();
		
		// classCode ////////////////////////////////////////////////////////////
		if(docEntry.getClassCode() != null){
			// set classCode internal uuid
			c.setClassificationScheme(UUIDs.DOC_ENTRY_CLASS_CODE);
			// set classifiedObject
			c.setClassifiedObject(docEntry.getEntryUUID());
			
			// set classCode code value
			c.setNodeRepresentation(docEntry.getClassCode().getCode());
			// set classCode diaplay name
			c.setName(copy(docEntry.getClassCode().getDisplayName()));
			
			// set coding scheme name in slot
			if(docEntry.getClassCode().getSchemeName() != null){
				slot.setValueList(list);
				slot.setName(DocumentEntryConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(docEntry.getClassCode().getSchemeName());
				slots.add(slot);
			}
			
			classifications.add(c);
		}
		
		//	confidentialityCode ////////////////////////////////////////////////////////////
		Iterator i = docEntry.getConfidentialityCode().iterator();
		while(i.hasNext()){
			c = RimFactory.eINSTANCE.createClassificationType();
			// set confidentialityCode internal uuid
			c.setClassificationScheme(UUIDs.DOC_ENTRY_CONFIDENTIALITY_CODE);
			// set classifiedObject
			c.setClassifiedObject(docEntry.getEntryUUID());
			
			CodedMetadataType conf = (CodedMetadataType)i.next();
			// set confidentialityCode code value
			c.setNodeRepresentation(conf.getCode());
			// set classCode diaplay name
			c.setName(copy(conf.getDisplayName()));
			
			// set coding scheme name in slot
			if(conf.getSchemeName() != null){
				slots = c.getSlot();
				slot = RimFactory.eINSTANCE.createSlotType1();
				list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(DocumentEntryConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(conf.getSchemeName());
				slots.add(slot);
			}
			classifications.add(c);
		}

		
		// eventCodeList ////////////////////////////////////////////////////////////
		i = docEntry.getEventCode().iterator();
		while(i.hasNext()){
			c = RimFactory.eINSTANCE.createClassificationType();
			// set eventCode internal uuid
			c.setClassificationScheme(UUIDs.DOC_ENTRY_EVENT_CODE);
			//	set classifiedObject
			c.setClassifiedObject(docEntry.getEntryUUID());
			
			CodedMetadataType event = (CodedMetadataType)i.next();
			if(event != null){
				// set eventCode code value
				c.setNodeRepresentation(event.getCode());
				// set classCode diaplay name
				c.setName(copy(event.getDisplayName()));
				
				// set coding scheme name in slot
				if(event.getSchemeName() != null){
					slots = c.getSlot();
					slot = RimFactory.eINSTANCE.createSlotType1();
					list = RimFactory.eINSTANCE.createValueListType();
					slot.setValueList(list);
					slot.setName(DocumentEntryConstants.CODING_SCHEME);
					slot.getValueList().getValue().add(event.getSchemeName());
					slots.add(slot);
				}
			}
			classifications.add(c);
		}
		
		//	formatCode ////////////////////////////////////////////////////////////
		if(docEntry.getFormatCode() != null){
			c = RimFactory.eINSTANCE.createClassificationType();
			// set formatCode internal uuid
			c.setClassificationScheme(UUIDs.DOC_ENTRY_FORMAT_CODE);
			//	set classifiedObject
			c.setClassifiedObject(docEntry.getEntryUUID());
			
			// set formatCode code value
			c.setNodeRepresentation(docEntry.getFormatCode().getCode());
			// set classCode diaplay name
			c.setName(copy(docEntry.getFormatCode().getDisplayName()));
			
			// set coding scheme name in slot
			if(docEntry.getFormatCode().getSchemeName() != null){
				slots = c.getSlot();
				slot = RimFactory.eINSTANCE.createSlotType1();
				list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(DocumentEntryConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(docEntry.getFormatCode().getSchemeName());
				slots.add(slot);
			}
			classifications.add(c);
		}

		
		//	healthCareFacilityTypeCode ////////////////////////////////////////////////////////////
		if(docEntry.getHealthCareFacilityTypeCode() != null){
			c = RimFactory.eINSTANCE.createClassificationType();
			// set healthCareFacilityTypeCode internal uuid
			c.setClassificationScheme(UUIDs.DOC_ENTRY_HEALTH_CARE_FACILITY_CODE);
			// set classifiedObject
			c.setClassifiedObject(docEntry.getEntryUUID());
			
			// set healthCareFacilityTypeCode code value
			c.setNodeRepresentation(docEntry.getHealthCareFacilityTypeCode().getCode());
			// set classCode diaplay name
			c.setName(copy(docEntry.getHealthCareFacilityTypeCode().getDisplayName()));
			
			// set coding scheme name in slot
			if(docEntry.getHealthCareFacilityTypeCode().getSchemeName() != null){
				slots = c.getSlot();
				slot = RimFactory.eINSTANCE.createSlotType1();
				list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(DocumentEntryConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(docEntry.getHealthCareFacilityTypeCode().getSchemeName());
				slots.add(slot);
			}
			classifications.add(c);
		}

		
		//	practiceSettingCode ////////////////////////////////////////////////////////////
		if(docEntry.getPracticeSettingCode() != null){
			c = RimFactory.eINSTANCE.createClassificationType();
			// set practiceSettingCode internal uuid
			c.setClassificationScheme(UUIDs.DOC_ENTRY_PRACTICE_SETTING_CODE);
			// set classifiedObject
			c.setClassifiedObject(docEntry.getEntryUUID());
			
			// set practiceSettingCode code value
			c.setNodeRepresentation(docEntry.getPracticeSettingCode().getCode());
			// set classCode diaplay name
			c.setName(copy(docEntry.getPracticeSettingCode().getDisplayName()));
			
			// set coding scheme name in slot
			if(docEntry.getPracticeSettingCode().getSchemeName() != null){
				slots = c.getSlot();
				slot = RimFactory.eINSTANCE.createSlotType1();
				list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(DocumentEntryConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(docEntry.getPracticeSettingCode().getSchemeName());
				slots.add(slot);
			}
			classifications.add(c);
		}

		
		//	typeCode ////////////////////////////////////////////////////////////		
		if(docEntry.getTypeCode() != null){
			c = RimFactory.eINSTANCE.createClassificationType();
			// set typeCode internal uuid
			c.setClassificationScheme(UUIDs.DOC_ENTRY_TYPE_CODE);
			// set classifiedObject
			c.setClassifiedObject(docEntry.getEntryUUID());
			
			// set typeCode code value
			c.setNodeRepresentation(docEntry.getTypeCode().getCode());
			// set classCode diaplay name
			c.setName(copy(docEntry.getTypeCode().getDisplayName()));
			
			// set coding scheme name in slot
			if(docEntry.getTypeCode().getSchemeName() != null){
				slots = c.getSlot();
				slot = RimFactory.eINSTANCE.createSlotType1();
				list = RimFactory.eINSTANCE.createValueListType();
				slot.setValueList(list);
				slot.setName(DocumentEntryConstants.CODING_SCHEME);
				slot.getValueList().getValue().add(docEntry.getTypeCode().getSchemeName());
				slots.add(slot);
			}
			
			classifications.add(c);
		}

		
		// author //////////////////////////////////////////////////////////////////////////
		AuthorType author = null;
		if (docEntry.getAuthors() != null) {
			i = docEntry.getAuthors().iterator();
			while (i.hasNext()) {
				// create classification for this author
				c = RimFactory.eINSTANCE.createClassificationType();
				// set contentTypeCode internal uuid
				c.setClassificationScheme(UUIDs.DOC_ENTRY_AUTHOR);
				// set classifiedObject
				c.setClassifiedObject(docEntry.getEntryUUID());
				// set nodeRepresentation -- required for external
				// classifications
				c.setNodeRepresentation("");// intentionally left blank, per IHE
											// (see discussion on Issue 15)

				// begin to set author data
				slots = c.getSlot();
				slot = RimFactory.eINSTANCE.createSlotType1();
				list = RimFactory.eINSTANCE.createValueListType();
				author = (AuthorType)i.next();

				// author institution
				if (author.getAuthorInstitution() != null) {
					if (author.getAuthorInstitution().size() > 0) {
						slot.setValueList(list);
						slot.setName(DocumentEntryConstants.AUTHOR_INSTITUTION);
						Iterator j = author
								.getAuthorInstitution().iterator();
						while (j.hasNext()) {
							slot.getValueList()
									.getValue()
									.add(HL7V2MessageFormat.toMessageString(
											(XON) j.next(),
											MessageDelimiters.COMPONENT,
											MessageDelimiters.SUBCOMPONENT));
						}
						slots.add(slot);
					}
				}

				// authorPerson
				if (author.getAuthorPerson() != null) {
					slot = RimFactory.eINSTANCE.createSlotType1();
					list = RimFactory.eINSTANCE.createValueListType();
					slot.setValueList(list);
					slot.setName(DocumentEntryConstants.AUTHOR_PERSON);
					slot.getValueList()
							.getValue()
							.add(HL7V2MessageFormat.toMessageString(author.getAuthorPerson(),
									MessageDelimiters.COMPONENT,
									MessageDelimiters.SUBCOMPONENT));
					slots.add(slot);
				}

				// authorRole
				if (author.getAuthorRole() != null) {
					if (author.getAuthorRole().size() > 0) {
						slot = RimFactory.eINSTANCE.createSlotType1();
						list = RimFactory.eINSTANCE.createValueListType();
						slot.setValueList(list);
						slot.setName(DocumentEntryConstants.AUTHOR_ROLE);
						Iterator j = author.getAuthorRole()
								.iterator();
						while (j.hasNext()) {
							slot.getValueList().getValue()
									.add((String) j.next());
						}
						slots.add(slot);
					}
				}

				// authorSpecialty
				if (author.getAuthorSpeciality() != null) {
					if (author.getAuthorSpeciality().size() > 0) {
						slot = RimFactory.eINSTANCE.createSlotType1();
						list = RimFactory.eINSTANCE.createValueListType();
						slot.setValueList(list);
						slot.setName(DocumentEntryConstants.AUTHOR_SPECIALITY);
						Iterator j = author.getAuthorSpeciality()
								.iterator();
						while (j.hasNext()) {
							slot.getValueList().getValue()
									.add((String) j.next());
						}
						slots.add(slot);
					}
				}
				//Added by CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
				// authorTelecommunication
				if (author.getAuthorTelecommunication() != null){
					if (!author.getAuthorTelecommunication().isEmpty()) {
						slot = RimFactory.eINSTANCE.createSlotType1();
						list = RimFactory.eINSTANCE.createValueListType();
						slot.setValueList(list);
						slot.setName(DocumentEntryConstants.AUTHOR_TELECOMMUNICATION);
						Iterator j = author
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
				classifications.add(c);
			}// end author iterator
		}// end if
	}

	/**
	 * Sets the metadata values in the ExternalIdentifiers of the
	 * ExtrinsicObject
	 */
	private void setExtringsicObjectExternalIdentifiers( DocumentEntryType docEntry) {
		EList externalIdentifiers = docData.getExternalIdentifier();
		LocalizedStringType idName = RimFactory.eINSTANCE.createLocalizedStringType();
		InternationalStringType exIDName = RimFactory.eINSTANCE.createInternationalStringType();
		
		// patientId /////////////////////////////////////////////////////
		ExternalIdentifierType exID = RimFactory.eINSTANCE.createExternalIdentifierType();
		if(docEntry.getPatientId() != null){
			exID.setValue(HL7V2MessageFormat.toMessageString(docEntry.getPatientId(),MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
			// set "XDSDocumentEntry.patientId" to be the name of this ExternalIdentifier
			idName.setValue(DocumentEntryConstants.PATIENT_ID);
			exIDName.getLocalizedString().add(idName);
			exID.setName(exIDName);	
			//set identificaitonScheme
			exID.setIdentificationScheme(UUIDs.DOC_ENTRY_PATIENT_IDENTIFICATION_SCHEME);
			// add to ExtrinsicObject/ExternalIdentifier 
			externalIdentifiers.add(exID);
		}
		
		// uniqueId /////////////////////////////////////////////////////
		if (docEntry.getUniqueId() != null){
			exID = RimFactory.eINSTANCE.createExternalIdentifierType();
			idName = RimFactory.eINSTANCE.createLocalizedStringType();
			exIDName = RimFactory.eINSTANCE.createInternationalStringType();
			// set id in ExternalIdentifier
			exID.setValue(docEntry.getUniqueId());
			// set "XDSDocumentEntry.uniqueId" to be the name of this ExternalIdentifier
			idName = RimFactory.eINSTANCE.createLocalizedStringType();
			idName.setValue(DocumentEntryConstants.UNIQUE_ID);
			exIDName = RimFactory.eINSTANCE.createInternationalStringType();
			exIDName.getLocalizedString().add(idName);
			exID.setName(exIDName);	
			//set identificaitonScheme
			exID.setIdentificationScheme(UUIDs.DOC_ENTRY_UNIQUE_IDENTIFICATION_SCHEME);
			// add to ExtrinsicObject/ExternalIdentifier 
			externalIdentifiers.add(exID);
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
