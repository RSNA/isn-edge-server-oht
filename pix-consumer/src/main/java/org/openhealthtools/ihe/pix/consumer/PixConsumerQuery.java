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

package org.openhealthtools.ihe.pix.consumer;

import org.apache.log4j.Logger;
import org.eclipse.ohf.hl7v2.core.conformance.model.CPConformanceProfile;
import org.eclipse.ohf.hl7v2.core.definitions.model.VersionDefnList;
import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.model.Field;
import org.eclipse.ohf.hl7v2.core.message.model.Item;
import org.eclipse.ohf.hl7v2.core.utilities.CPMessageBuilder;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessage;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;

/**
 * <p>QBP^Q23 Request for Corresponding Patient Identifiers</p>
 * 
 * <p>IHE HL7 Segments: MSH,QPD,RCP<br>
 * IHE HL7 Standard: HL7 2.5</p>
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class PixConsumerQuery extends PixPdqMessage {
	
	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////

	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(PixConsumerQuery.class);
         
    /**
     * MessageManager
     */
    private MessageManager globalFactory;
    
    /**
     * CPConformanceProfile for validation
     */
    private CPConformanceProfile cpProfile = null;
    
    /**
     * IHE PIX Consumer referenced standard
     */
    private static final int version = VersionDefnList.hv25;
    
    /**
     * IHE PDQ Message Type
     */
	public static final String MSH_9_1_PIXC = "Q23";
	public static final String MSH_9_2_PIXC = "QBP";
	public static final String MSH_9_3_PIXC = "QBP_Q21";
	
	/**
	 * IHE PDQ Query Tag
	 */
	public static final String QPD_1_1_PIXC = "IHE PIX Query";
	public static final String QPD_1_2_PIXC = "";
	public static final String QPD_1_3_PIXC = "";
	
	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
    /**
	 * Constructs a PIX "QBP_Q23" message object.
	 * INTERNAL CONSTRUCTOR ONLY - use PixConsumer.createQuery(patientId);
	 * 
	 * @param globalFactory - message manager from hl7v2.core
	 * @param cpProfile - conformance profile for validation (ex. resources > conf > QBP-Q23(get corresponding IDs).XML)
	 * @param patientId
	 * @throws PixConsumerException
     */
	public PixConsumerQuery(MessageManager globalFactory, CPConformanceProfile cpProfile, String patientId) throws PixConsumerException {
		super();
		nodeType = Item.NODE_TYPE_MESSAGE;
		this.globalFactory = globalFactory;
		this.cpProfile = cpProfile;
		createQueryMsg(patientId, null, null, null, true);
	}
    
    /**
	 * Constructs a PIX "QBP_Q23" message object.
	 * INTERNAL CONSTRUCTOR ONLY - use PixConsumer.createQuery(patientId, namespaceId, universalId, universalIdType); 
	 * 
	 * @param globalFactory - message manager from hl7v2.core
	 * @param cpProfile - conformance profile for validation (ex. resources > conf > QBP-Q23(get corresponding IDs).XML)
	 * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType)
	 * @throws PixConsumerException
     */
	public PixConsumerQuery(MessageManager globalFactory, CPConformanceProfile cpProfile, String patientId, String namespaceId, String universalId, String universalIdType) throws PixConsumerException {
		super();
		nodeType = Item.NODE_TYPE_MESSAGE;
		this.globalFactory = globalFactory;
		this.cpProfile = cpProfile;
		createQueryMsg(patientId, namespaceId, universalId, universalIdType, false);
	}
	
	
	////////////////////
	// PUBLIC METHODS //
	////////////////////
	
	/**
	 * QPD-1 Message Query Name
	 * Query name for this message.
	 * The default is Q23^Get Corresponding IDs^HL7 (ie identifier^text^codingSystem).
	 * 
	 * @param identifier
	 * @param text
	 * @param codingSystem
	 * @param alternateIdentifier
	 * @param alternateText
	 * @param alternateCodingSystem
	 * @throws PdqConsumerException
	 */
	public void changeDefaultMessageQueryName(String identifier, String text, String codingSystem, String alternateIdentifier, String alternateText, String alternateCodingSystem) throws PixConsumerException {
		
		//need to specify identifier
		if ((identifier != null) && (identifier.length() > 0)) {
			try {
				setField(QPD_1_1, identifier);
			} catch (PixPdqMessageException e) {
				throw new PixConsumerException(e);
			}
		} else {
			throw new PixConsumerException("PixConsumerQuery: changeDefaultMessageQueryName - " + identifier + " invalid parameter ");
		}
		try {
			setField(QPD_1_2, text);
			setField(QPD_1_3, codingSystem);
			setField(QPD_1_4, alternateIdentifier);
			setField(QPD_1_5, alternateText);
			setField(QPD_1_6, alternateCodingSystem);
		} catch (PixPdqMessageException e) {
			throw new PixConsumerException(e);
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("PixConsumerQuery: changeDefaultMessageQueryName ");
		}
	}
	
	/**
	 * QPD-2 Query Tag
	 * The initiating system's value to identify the query.
	 * The default is a random generated ID.
	 * 
	 * @param tag
	 * @throws PixConsumerException
	 */
	public void changeDefaultQueryTag(String tag) throws PixConsumerException {
		
		if ((tag != null) && (tag.length() > 0)) {
			try {
				setField(QPD_2, tag);
			} catch (PixPdqMessageException e) {
				throw new PixConsumerException(e);
			}
		} else {
			throw new PixConsumerException("PixConsumerQuery: changeDefaultQueryTag - " + tag + " invalid parameter ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixConsumerQuery: changeDefaultQueryTag ");
		}
	}
	
	/**
	 * QPD-3-4 Person Identifier, Assigning Authority (patient_id^^^namespace&id&idtype)
	 * The initiating system's value to identify the query.
	 * The default is ^^^XREF&&.
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @throws PixConsumerException
	 */
	public void changeDefaultAssigningAuthority(String namespaceId, String universalId, String universalIdType) throws PixConsumerException { 
	
		if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType)) {
			try {
				setField(QPD_3_4_1, namespaceId);
				setField(QPD_3_4_2, universalId);
				setField(QPD_3_4_3, universalIdType);
			} catch (PixPdqMessageException e) {
				throw new PixConsumerException(e);
			}
		} else {
			throw new PixConsumerException("PixConsumerQuery: changeDefaultSendingApplication - "  + namespaceId + ", " + universalId + ", " + universalIdType + " invalid parameter combination ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixConsumerQuery: changeDefaultAssigningAuthority ");
		}
	}
		
	/**
	 * QPD-4-4 What Domains Returned
	 * The list of domains (assigningAuthority) to restrict the query. 
	 * Supports repeats for restricting to multiple domains.
	 * The default is null (no restriction).
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @throws PixConsumerException
	 */
	public void addOptionalDomainRestriction(String namespaceId, String universalId, String universalIdType) throws PixConsumerException {
		
		//QPD "custom" field
		Field field;
		
		try {
			//forceField(3) uses 0 based index to create QPD-{1..4}
			//forceComponent(3) uses 0 based index to create QPD-4-{1..4}
			//forceComponent(2) uses 0 based index to create QPD-4-4-{1..3}
			//repeat field with "~" delimiter sample: (|^^^HIMS2005&1.3.6.1.4.1.21367.2005.1.1&ISO~^^^XREF200&1.3.6.1.4.1.21367.2005.1.2&ISO|)
			getSegments().getByCodeAndIndex(QPD, 1).forceField(3);
			field = getSegments().getByCodeAndIndex(QPD, 1).getFields().item(3).addRepeat(true);
			field.forceComponent(3);
			field.getComponent(3).forceComponent(2);
			field.forceElement("4-1").setAsString(namespaceId);
			field.forceElement("4-2").setAsString(universalId);
			field.forceElement("4-3").setAsString(universalIdType);
		} catch (HL7V2Exception e) {
			logger.error("PixConsumerQuery: addOptionalDomainRestriction - " + namespaceId + "," + universalId + "," + universalIdType + " failed.");
			throw new PixConsumerException("Add request for domain restriction " + namespaceId + "," + universalId + "," + universalIdType + " failed.");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("PixConsumerQuery: addOptionalDomainRestriction ");
		}
	}
	
	
	/////////////////////
	// PRIVATE METHODS //
	/////////////////////
	
	/**
	 * Create PixConsumerQuery message object.
	 * 
	 * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @param useCPAssigningAuthority
	 * @throws PixConsumerException
	 */
	private void createQueryMsg(String patientId, String namespaceId, String universalId, String universalIdType, boolean useCPAssigningAuthority) throws PixConsumerException {
			
		if (logger.isDebugEnabled()) {
			logger.debug("PixConsumerQuery: createQueryMsg - Entry ");
		}
		
		if ((patientId == null) || (patientId.length() <= 0)) {
			logger.error("PixConsumerQuery: createQueryMsg - required patientId empty");
			throw new PixConsumerException("PixConsumerQuery: createQueryMsg - required patientId empty");
		}

		try {
			
			//initialize message object
			clear();
			if (globalFactory != null) {
				setDefinitions(globalFactory.getVersionDefinitions());
			}
			setVersion(version);
			setEvent(MSH_9_1_PIXC);
			setMessageType(MSH_9_2_PIXC);
			setStructId(MSH_9_3_PIXC);
			addMSHFromFields();
			
			//define message segments (MSH added with earlier set statements)
			getSegments().add(QPD);
			getSegments().add(RCP);
			
			//Setup "custom" QPD fields
			//forceField(2) uses 0 based index to create QPD-{1..3}
			//forceComponent(3) uses 0 based index to create QPD-3-{1..4}  
			//forceComponent(2) uses 0 based to create QPD-3-4-{1..3}
			getSegments().getByCodeAndIndex(QPD, 1).forceField(2).forceComponent(3);
			getSegments().getByCodeAndIndex(QPD, 1).forceField(2).getComponents().item(3).forceComponent(2);
			
			//Default constant values from conformance profile as a config file
			if (cpProfile != null) {
				CPMessageBuilder builder = new CPMessageBuilder();
				builder.build(version, cpProfile.getInteractions().itemInteraction(0).getStaticDefinition(), true, this);
				
				// validate assigning authority if coming from conformance profile
				String cpNamespaceId = this.getField(QPD_3_4_1);
				String cpUniversalId = this.getField(QPD_3_4_2);
				String cpUniversalIdType = this.getField(QPD_3_4_3);
				logger.debug("PixFeedMsg: cp assigningAuthority " + cpNamespaceId + ", " + cpUniversalId + ", " + cpUniversalIdType);
				
				if (useCPAssigningAuthority) {
					if (PixPdqMessageUtilities.isHDParamValid(cpNamespaceId, cpUniversalId, cpUniversalIdType) == false) {
						throw new PixConsumerException("PixConsumerQuery: createQueryMsg - patientId cp assigning authority invalid");
					}
					setField(QPD_3_1, patientId);
				}
				
				// support user override of conformance profile
				if (((namespaceId != null) && (namespaceId.length() > 0)) ||
						((universalId != null) && (universalId.length() > 0)) ||
						((universalIdType != null) && (universalIdType.length() > 0))) {
					if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType) == false) {
						throw new PixConsumerException("PixConsumerQuery: createQueryMsg - patientId assigning authority invalid");
					}
					setField(QPD_3_1, patientId);
					setField(QPD_3_4_1, namespaceId);
					setField(QPD_3_4_2, universalId);
					setField(QPD_3_4_3, universalIdType);
					
					logger.debug("PixConsumerQuery: createQueryMsg - patientId cp assigning authority overridden with local parameters");
				}
			} else {
				if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType) == false) {
					throw new PixConsumerException("PixConsumerQuery: createQueryMsg - required patient namespace parameters invalid");
				}
				setField(QPD_3_1, patientId);
				setField(QPD_3_4_1, namespaceId);
				setField(QPD_3_4_2, universalId);
				setField(QPD_3_4_3, universalIdType);				
			}
			
			//field fixed for pix consumer query
			setField(MSH_12, VersionDefnList.display(version));
			setField(RCP_1, RCP_1_IMMEDIATE);  //immediate response

			setField(MSH_7, PixPdqMessageUtilities.getCurrentDateTimeString());
			setNonNullElement(MSH_10, PixPdqMessageUtilities.getRandomFieldValue(20));
			setNonNullElement(MSH_11_1, MSH_11_1_PRODUCTION);
			setNonNullElement(MSH_18_1, MSH_18_1_ASCII);
			setNonNullElement(QPD_1_1, QPD_1_1_PIXC);  //query name - identifier
			setNonNullElement(QPD_1_2, QPD_1_2_PIXC);  //query name - text
			setNonNullElement(QPD_1_3, QPD_1_3_PIXC);
			setNonNullElement(QPD_2, PixPdqMessageUtilities.getRandomFieldValue(32));	
				
		} catch (HL7V2Exception e) {
			logger.error("PixConsumerQuery: createQueryMsg - HL7V2Exception " + e.getLocalizedMessage());
			throw new PixConsumerException(e);
		} catch (PixPdqMessageException e) {
			throw new PixConsumerException(e);
		}
		
		if (logger.isDebugEnabled()) {
			try {
				logger.debug("PixConsumerQuery: createQueryMsg \r" + PixPdqMessageUtilities.msgToString(this));
			} catch (PixPdqMessageException e) {
				logger.debug("PixConsumerQuery: createQueryMsg \r");
			}
		}
	}
	
}