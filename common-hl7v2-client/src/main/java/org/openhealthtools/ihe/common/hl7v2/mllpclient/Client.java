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

package org.openhealthtools.ihe.common.hl7v2.mllpclient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.log4j.Logger;
import org.eclipse.ohf.hl7v2.core.conformance.CPDocument;
import org.eclipse.ohf.hl7v2.core.conformance.CPManager;
import org.eclipse.ohf.hl7v2.core.conformance.model.CPConformanceProfile;
import org.eclipse.ohf.hl7v2.core.definitions.DefinitionManager;
import org.eclipse.ohf.hl7v2.core.definitions.model.VersionDefnList;
import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.formats.VerticalBarComposer;
import org.eclipse.ohf.hl7v2.core.message.model.Field;
import org.eclipse.ohf.hl7v2.core.message.model.Message;
import org.eclipse.ohf.hl7v2.core.message.model.Segment;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.eclipse.ohf.hl7v2.core.validators.CPValidator;
import org.eclipse.ohf.hl7v2.core.validators.DefinitionValidator;
import org.eclipse.ohf.hl7v2.core.validators.ValidationItemList;
import org.openhealthtools.ihe.atna.auditor.PDQConsumerAuditor;
import org.openhealthtools.ihe.atna.auditor.PIXAuditor;
import org.openhealthtools.ihe.atna.auditor.PIXConsumerAuditor;
import org.openhealthtools.ihe.atna.auditor.PIXSourceAuditor;
import org.openhealthtools.ihe.atna.auditor.codes.rfc3881.RFC3881EventCodes;
import org.openhealthtools.ihe.common.hl7v2.message.HL7_Constants;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;
import org.openhealthtools.ihe.common.mllp.MLLPDestination;
import org.openhealthtools.ihe.common.mllp.MLLPException;

/**
 * <p>This class is shared by PIX/PDQ clients:</p>
 * 
 * <p>This class implements the PIX/PDQ Client Patient Identity Source. This actor's role
 * is in initiating the Patient Identify Feed Transaction. In doing so it provides
 * notification to the Patient Identifier Cross-Reference Manager and Document Registry
 * for patient identification related events including: creation, updates, & merges.</p>
 * 
 * <p>Accepts: ADT-A01,ADT-A04,ADT-A05,ADT-A08,ADT-A40<br>
 * IHE HL7 Segments: MSH,EVN,PID,[MRG],PV1<br>
 * IHE HL7 Standard: HL7 2.3.1</p>
 * 
 * <p>PIXFeedMgr transactions:<br>
 * ADT-A01 - Admission of an inpatient into a facility<br>
 * ADT-A04 - Registration of an outpatient for a visit to the facility<br>
 * ADT-A05 - Pre-admission of an inpatient<br>
 * ADT-A08 - Update patient information<br>
 * ADT-A40 - Merge patient information</p>
 * 
 * <p>This class implements the PIX/PDQ Client Patient Identifier Cross-Reference Consumer.
 * This actor's role is to initiate a request (query) for a list of patient identifiers
 * that correspond to a consumer's patient identifier. The Patient Identifier
 * Cross-Reference Manager immediately returns a list response with no intermediate ACK.</p> 
 * 
 * <p>Accepts: QBP^Q23<br>
 * IHE HL7 Segments: MSH,QPD,RCP<br>
 * IHE HL7 Standard: HL7 2.5</p>
 * 
 * <p>PIXQueryMgr transactions:<br>
 * QBP^Q23 - Get Corresponding Identifiers<br>
 * RSP^K23 - Find Corresponding Identifiers Response</p>
 * 
 * <p>This class implements the PIX/PDQ Client Patient Demographics Query Consumer.
 * This actor's role is to initiate a request (query) for a list of patient identifiers
 * whose demographics match the demographics in the query. The Patient Demographics
 * Supplier Actor immediately returns a list response with no intermediate ACK.</p> 
 * 
 * <p>Accepts: QBP^Q22<br>
 * IHE HL7 Segments: MSH,QPD,RCP<br>
 * IHE HL7 Standard: HL7 2.5</p>
 * 
 * <p>PDQQueryMgr transactions:<br>
 * QBP^Q22 - Find Candidates<br>
 * RSP^K22 - Find Candidates Response</p>
 * 
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a>  
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class Client {

	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(Client.class);
        
    /**
     * Message transcript - output requires doAudit = true
     */
    private final PIXAuditor auditor;
    
    /**
     * MessageManager
     */
    private MessageManager globalFactory;
    
    /**
     * Conformance Profile Document for Message Validation
     */
    private CPDocument cpDoc;
    
    /**
     * Conformance Profile for Message Validation
     */
    private CPConformanceProfile cpProfile;
    
    /**
     * Conformance Profile Validator
     */
    private CPValidator cpVal;
    
    /**
     * Definition Validator
     */
    private DefinitionValidator defVal;
    
    /**
     * Control if verification will be performed as requested based on set-up completed.
     * Setup requires an XML conformance profile.
     */
    private boolean canVerifyConformanceProfile = false;
        
    /**
     * Maximum error the message verification allows before submission is blocked.
     * ITEM_TYPE_INFORMATION = 1;
     * ITEM_TYPE_WARNING = 2;       <<< Default
     * ITEM_TYPE_ERROR = 3;
     * ITEM_TYPE_FATAL = 4;
     */
    private int maxVerifyEvent = CPValidator.ITEM_TYPE_WARNING;
    
    /**
     * Supported destinations, currently only MLLP.
     */
    public static final int SEND_MLLP_DEST = 1;
    
    /**
     * Destination in use
     */
    private int sendMethod;
    
    /**
     * Minimum Lower Layer Protocol destination
     */
    private MLLPDestination dMLLP;
    
    /**
     * ATNA AuditSourceID - Pix Source
     */
    public static final String ATNA_PIXS_AUDITSOURCE = "OHT_PixSource";    
    
    /**
     * ATNA AuditSourceID - Pix Consumer
     */
    public static final String ATNA_PIXC_AUDITSOURCE = "OHT_PixConsumer";
    
    /**
     * ATNA AuditSourceID - Pdq Consumer
     */
    public static final String ATNA_PDQ_AUDITSOURCE = "OHT_PdqConsumer";
    
    /**
     * ATNA AuditSourceID - PDVQ Consumer
     */
    public static final String ATNA_PDVQ_AUDITSOURCE = "OHT_PdqVisitConsumer";   
    
    /**
     * ATNA AuditSourceID - Pam Source
     */
    public static final String ATNA_PAMS_AUDITSOURCE = "OHT_PamSource";  
    
    
	//////////////////
	// CONSTRUCTORS //
	//////////////////
    
    /**
     * Constructs a PIX/PDQ client object with verification support.
     * @throws ClientException
     */
    public Client(PIXAuditor auditor) throws ClientException 
    {
    	this.auditor = auditor;
    	try {
    		VersionDefnList versions = DefinitionManager.createDefinitionFromJavaCode();
    		globalFactory = MessageManager.getFactory();
    		globalFactory.setVersionDefinitions(versions);
    		defVal = new DefinitionValidator();
    		canVerifyConformanceProfile = false;
    	} catch (HL7V2Exception e) {
    		logger.error("Client: constructor - javaCode " + e.getLocalizedMessage(), e);
			throw new ClientException(e);
    	}
    }
    
    /**
     * Constructs a PIX/PDQ client object with verification support.
     * @param conformanceProfile
     * @throws ClientException
     */
    public Client(InputStream conformanceProfile, PIXAuditor auditor) throws ClientException 
    {
    	
    	this.auditor = auditor;
    	try {
    		VersionDefnList versions = DefinitionManager.createDefinitionFromJavaCode();
    		globalFactory = MessageManager.getFactory();
    		globalFactory.setVersionDefinitions(versions);
    		defVal = new DefinitionValidator();
   			if (conformanceProfile != null) {
				cpDoc = CPManager.load(conformanceProfile, CPDocument.DOCUMENT_TYPE_PROFILE);
				cpProfile = cpDoc.getProfile();
				cpVal = new CPValidator(cpProfile);
				canVerifyConformanceProfile = true;
			} else {
				logger.warn("Client: constructor - javaCode w/conformance encountered invalid conformance profile.");
				canVerifyConformanceProfile = false;
			}
    	} catch (HL7V2Exception e) {
    		logger.error("Client: constructor - javaCode w/conformance " + e.getLocalizedMessage(), e);
			throw new ClientException(e);
    	}
    }
    
    
	////////////////////
	// PUBLIC METHODS //
	////////////////////
    
    protected PIXAuditor getAuditor()
    {
    	return auditor;
    }
    
	/**
	 * Returns the doAudit boolean flag. 
	 * @return doAudit
	 */
	public boolean isDoAudit() {
		return getAuditor().getConfig().isAuditorEnabled();
	}

	/**
	 * Turn auditing on and off for ALL your actors
	 * @param doAudit
	 */
	public void setDoAudit(boolean doAudit) {
		getAuditor().getConfig().setAuditorEnabled(doAudit);
	}
	
	/**
	 * Maximum error the message verification allows before submission is blocked.
	 * @return maxVerifyEvent
	 */
	public int getMaxVerifyEvent() {
		return this.maxVerifyEvent;
	}
	
	/**
     * Maximum error the message verification allows before submission is blocked.
     * Constant taken from (org.eclipse.ohf.hl7v2.core.validators.CPValidator).
     * ITEM_TYPE_INFORMATION = 1;
     * ITEM_TYPE_WARNING = 2;    <<< Default
     * ITEM_TYPE_ERROR = 3;
     * ITEM_TYPE_FATAL = 4;
     * 
	 * @param maxVerifyEvent
	 */
	public void setMaxVerifyEvent(int maxVerifyEvent) {
		this.maxVerifyEvent = maxVerifyEvent;
	}
    
	/**
	 * Returns the MLLP destination with TCP settings.
	 * @return dMLLP
	 */
	public MLLPDestination getMLLPDestination() {
		return this.dMLLP;
	}
	
	/**
	 * Set the MLLP destination with TCP settings.
	 * @param MLLP
	 */
	public void setMLLPDestination(MLLPDestination MLLP) {
		this.dMLLP = MLLP;
		this.sendMethod = Client.SEND_MLLP_DEST;
	}	
	
	/**
	 * Returns the AtnaAgent URI Destination.
	 * @return uri
	 */
	public URI getURI() {
		if (sendMethod == SEND_MLLP_DEST) {
			return dMLLP.getURI();
		}
		return null;
	}
		
	/**
	 * Set the local message manager.
	 * @param globalFactory
	 */
	public void setMessageManager(MessageManager globalFactory) {
		this.globalFactory = globalFactory;
	}
	
	/**
	 * Returns the local message manager.
	 * @return globalFactory
	 */
	public MessageManager getMessageManager() {
		return this.globalFactory;
	}
	
	/**
	 * Returns the conformance profile.
	 * @return conformance profile
	 */
	public CPConformanceProfile getCPProfile() {
		return this.cpProfile;
	}
	
	/**
	 * Returns the client ability to verify using a Conformance Profile.
	 * There is no corresponding "set" method because the constructor does
	 * this automatically. Introducing the ability to change here would 
	 * introduce a non-thread safe environment.
	 * 
	 * @return canVerifyConformanceProfile
	 */
	public boolean isCanVerifyConformanceProfile() {
		return canVerifyConformanceProfile;
	}
	
	/**
	 * 
	 * @param msg
	 * @return ValidationItemList
	 * @throws ClientException
	 */
	public ValidationItemList getHL7DefinitionValidationItems(Message msg) throws ClientException {
		
		try {
			defVal.validate(msg);
		} catch (HL7V2Exception e) {
			logger.error("Client: verifyMessage - DefinitionValidator failed ");
			throw new ClientException(e);
		}
		return defVal.getItems();
	}
	
	/**
	 * 
	 * @param msg
	 * @return ValidationItemList
	 * @throws ClientException
	 */
	public ValidationItemList getConformanceProfileValidationItems(Message msg) throws ClientException {
		
		if (canVerifyConformanceProfile == false) {
			return null;
		}
		
		try {
			cpVal.validate(msg);
		} catch (HL7V2Exception e) {
			logger.error("Client: verifyMessage - CPValidator failed ");
			throw new ClientException(e);
		}
		return cpVal.getItems();
	}
	
    /**
     * Processes HL7 messages with optional intermediate verification.
     * @param rawHL7 - hl7v2 message
     * @param verify - false to skip verification, true to run verification
     * @param auditSource - source actor associated with transaction
     * @throws ClientException
     */
    public String sendHL7(String rawHL7, boolean verify, String auditSource) throws ClientException {
    	
    	if(logger.isDebugEnabled()){
    		logger.debug("Client: sendHL7 - Entry ");
    	}
    	
    	if ((rawHL7 == null) || (rawHL7.length() < 1)) {
    		return null;
    	}
    	
    	String response = new String();
    	Message msg;
    	
    	if (verify == true) {
    		
        	if(logger.isDebugEnabled()){
        		logger.debug("Client: sendHL7 - Verify Begin ");
        	}
        	
        	try {
        		msg = PixPdqMessageUtilities.stringToMsg(rawHL7);    
        	} catch (PixPdqMessageException e) {
        		throw new ClientException(e);
        	}
        	verifyMessage(msg);
        	
        	if(logger.isDebugEnabled()){
        		logger.debug("Client: sendHL7 - Verify End ");
        	}
    	}
    	else if (verify == true) {
    		logger.warn("Client: sendHL7 - verification requested but not performed, lacking setup");
    	}
    	
   		response = send(rawHL7, auditSource);
   		
    	if(logger.isDebugEnabled()){
    		logger.debug("Client: sendHL7 - Exit "); 
    	}
    	
    	return response;
    }
    
    /**
     * Process Message Object message with optional intermediate verification.
     * @param msg - hl7v2 message (org.eclipse.ohf.hl7v2.core)
     * @param verify - false to skip verification, true to run verification
     * @param auditSource - source actor associated with transaction
     * @return Returns hl7v2 message response
     * @throws ClientException
     */
	public Message sendMsg(Message msg, boolean verify, String auditSource) throws ClientException {
		
		if(logger.isDebugEnabled()){
			logger.debug("Client: sendMsg -- Entry ");
		}
		
		if (msg == null) {
			logger.error("Client: sendMsg - encountered invalid Message (null)");
			throw new ClientException("Client: sendMsg - encountered invalid Message (null)");
		}
		
		String rawHL7 = new String();
		String response = new String();
		Message responseMsg;

		if (verify == true) {
			if(logger.isDebugEnabled()){
        		logger.debug("Client: sendMsg - Verify Begin ");
        	}
			
			verifyMessage(msg);
			
			if(logger.isDebugEnabled()){
        		logger.debug("Client: sendMsg - Verify End ");
        	}
		}
		
		try {
			rawHL7 = PixPdqMessageUtilities.msgToString(msg);
		} catch (PixPdqMessageException e) {
			throw new ClientException(e);
		}
		
		response = send(rawHL7, auditSource);
		
		try {
			responseMsg = PixPdqMessageUtilities.stringToMsg(response);
		} catch (PixPdqMessageException e) {
			throw new ClientException(e);
		}
	
		if(logger.isDebugEnabled()){
			logger.debug("Client: sendMsg - Exit ");
		}
		return responseMsg;
	}
	
	/**
	 * Set conformance profile to a new profile. This supports a "hot" swap of CPs which can
	 * be used with all clients. It is intended primarily for use with the PIX Source
	 * as the pix source supports 5 events (admit, register, preadmit, update, and merge).
	 * 
	 * @param conformanceProfile - XML file
	 * @throws ClientException
	 */
	public void setConformanceProfile(InputStream conformanceProfile) throws ClientException {
		
		try {
			if (conformanceProfile != null) {
				cpDoc = CPManager.load(conformanceProfile, CPDocument.DOCUMENT_TYPE_PROFILE);
				cpProfile = cpDoc.getProfile();
				cpVal = new CPValidator(cpProfile);
				canVerifyConformanceProfile = true;
			} else {
				logger.warn("Client: setConformanceProfile - encountered invalid conformance profile, no change made.");
			}
		} catch (HL7V2Exception e) {
			logger.error("Client: setConformanceProfile " + e.getLocalizedMessage(), e);
			throw new ClientException(e);
		}
	}
	
	/**
	 * Stops use of existing conformance profile for future transactions within this client.
	 */
	public void setConformanceProfileUseToFalse() {
		cpProfile=null;
		canVerifyConformanceProfile = false;
	}
	
	
	/////////////////////
	// PRIVATE METHODS //
	/////////////////////
	
	/**
	 * Verify Message Object using HL7v2 conformance profile
	 * @param msg - hl7v2 message (org.eclipse.ohf.hl7v2.core)
	 * @throws ClientException
	 */
	private void verifyMessage(Message msg) throws ClientException {
		
		if(logger.isDebugEnabled()){
			logger.debug("Client: verifyMessage - Entry ");
		}
		
		boolean hl7DefsExceeded = false;
		boolean cpExceeded = false;
		
		//round 1 - hl7 definitions file validation check
		hl7DefsExceeded = verifyHL7Defs(msg);
	
		//round 2 - conformance profile validation check
		if (canVerifyConformanceProfile == true) {
			cpExceeded = verifyConformanceProfile(msg);
		}
		
		if ((hl7DefsExceeded) && (cpExceeded)) {
			logger.error("Client: verifyMessage - Exceeded Max Error Level ");
			throw new ClientException("Both Definition and Conformance Profile verification errors blocking transmission ");
		}
		else if (hl7DefsExceeded) {
			logger.error("Client: verifyMessage - Exceeded Max Error Level ");
			throw new ClientException("Definition verification errors blocking transmission ");
		}
		else if (cpExceeded) {
			logger.error("Client: verifyMessage - Exceeded Max Error Level ");
			throw new ClientException("Conformance Profile verification errors blocking transmission ");
		}
			
		if(logger.isDebugEnabled()){
			logger.debug("Client: verifyMessage - Exit ");
		}
	}
	
	private boolean verifyHL7Defs(Message msg) throws ClientException {
		
		try {
			defVal.validate(msg);
		} catch (HL7V2Exception e) {
			logger.error("Client: verifyMessage - DefinitionValidator failed ");
			throw new ClientException(e);
		}
				
		ValidationItemList defItems = defVal.getItems();

		if(logger.isDebugEnabled()){
			logger.debug("Client: verifyMessage - definition validation check complete. There were " + defItems.size() + " events documented ");
		}
		
		boolean maxExceeded = false;
		
		for (int i=0; i < defItems.size(); i++) {
			try {
				logger.info("Client: verifyMessage - level " + defItems.item(i).getType() + " - " + defItems.item(i).getNode().elementName() + " - " + defItems.item(i).getMessage());
			} catch (HL7V2Exception e) {
				throw new ClientException(e);
			}
			if (defItems.item(i).getType() > this.maxVerifyEvent) {
				maxExceeded = true;
			}
		}
		return maxExceeded;
	}
	
	private boolean verifyConformanceProfile(Message msg) throws ClientException {
		
		try {
			cpVal.validate(msg);
		} catch (HL7V2Exception e) {
			logger.error("Client: verifyMessage - CPValidator failed ");
			throw new ClientException(e);
		}

		ValidationItemList cpItems = cpVal.getItems();

		if(logger.isDebugEnabled()){
			logger.debug("Client: verifyMessage - cp validation check complete. There were " + cpItems.size() + " events documented ");
		}

		boolean maxExceeded = false;

		for (int i=0; i < cpItems.size(); i++) {
			if(logger.isDebugEnabled()){
				try {
					logger.info("Client: verifyMessage - level " + cpItems.item(i).getType() + " - " + cpItems.item(i).getNode().elementName() + " - " + cpItems.item(i).getMessage());
				} catch (HL7V2Exception e) {
					throw new ClientException(e);
				}
			}
			if (cpItems.item(i).getType() > this.maxVerifyEvent) {
				maxExceeded = true;
			}
		}
		return maxExceeded;
	}
	
	
	/**
	 * Send string message to specified destination.
	 * @param hl7 - hl7v2 message
     * @param auditSource - source actor associated with transaction
	 * @return Returns hl7 message response
	 * @throws ClientException
	 */
	private String send(String hl7, String auditSource) throws ClientException {
		
		if(logger.isDebugEnabled()){
			logger.debug("Client: send - Entry for audit source " + auditSource);
		}
		
		if (isDoAudit()) {
			
			if ((auditSource != ATNA_PIXS_AUDITSOURCE) && (auditSource != ATNA_PIXC_AUDITSOURCE) && (auditSource != ATNA_PDQ_AUDITSOURCE)
					&& (auditSource != ATNA_PAMS_AUDITSOURCE)) {
				logger.error("Failure in audit log: auditSource " + auditSource + " invalid");
				throw new ClientException("Failure in audit log: auditSource " + auditSource + " invalid");
			}

			getAuditor().auditActorStartEvent(RFC3881EventCodes.RFC3881EventOutcomeCodes.SUCCESS, auditSource, null);

		}
		
		String response = new String();
		
		if (sendMethod == Client.SEND_MLLP_DEST) {
				
			if(logger.isDebugEnabled()){
				logger.debug("Client: send - Enter SEND_MLLP_DEST \r" + hl7);
			}
						
			if (dMLLP != null) {
				try {
					response = dMLLP.sendMessage(hl7);
				} catch (MLLPException e) {
					logger.error("Client: send - MLLP.sendMessage ");
					applicationStopEvent(auditSource);
					throw new ClientException("Message delivery failed ", -1, e);
				}
			}
			else {
				applicationStopEvent(auditSource);
				throw new ClientException("Missing MLLP Destination ");
			}
				
			if(logger.isDebugEnabled()){
				logger.debug("Client: send - Exit SEND_MLLP_DEST ");
			}
		}
		else {
			logger.error("Client: send - unknown sendMethod ");
			applicationStopEvent(auditSource);
			throw new ClientException("Missing ANY Destination ");
		}
		
		if (isDoAudit()) {
			
			RFC3881EventCodes.RFC3881EventOutcomeCodes eventOutcome;
			Message msg = null;
			
			if (response != null) {
				try {
					msg = PixPdqMessageUtilities.stringToMsg(response);
				} catch (PixPdqMessageException e) {
					logger.error("got an exception when getting the message", e);
					eventOutcome = RFC3881EventCodes.RFC3881EventOutcomeCodes.SERIOUS_FAILURE;
				}
                if(logger.isDebugEnabled()){
                    logger.debug("got message: " + msg);
                }
                if(null == msg){
                    throw new IllegalArgumentException("message is null");
                }
			}
			else {
				//no response is unexpected
				eventOutcome = RFC3881EventCodes.RFC3881EventOutcomeCodes.SERIOUS_FAILURE;
			}
			
			try {
				
				Message auditMessage = PixPdqMessageUtilities.stringToMsg(hl7);
				Segment segMSH = auditMessage.getSegments().getByCodeAndIndex(HL7_Constants.MSH, 1);
				if (segMSH == null) {
					logger.error("Message does not contain required MSH segment.  Audit message not sent.");
					throw new ClientException("Message does not contain required MSH segment.  Audit message not sent.");
				}
	
				String sendingFacility = PixPdqMessageUtilities.getHL7Field(segMSH.forceField(2));
				String sendingApp = PixPdqMessageUtilities.getHL7Field(segMSH.forceField(3));
				
				String receivingFacility = PixPdqMessageUtilities.getHL7Field(segMSH.forceField(4));
				String receivingApp = PixPdqMessageUtilities.getHL7Field(segMSH.forceField(5));
	
				String msgControlId = PixPdqMessageUtilities.getHL7Field(segMSH.forceField(9));    //*srr-bugFix86
				
				if ((auditSource == ATNA_PIXC_AUDITSOURCE) || (auditSource == ATNA_PDQ_AUDITSOURCE) || (auditSource == ATNA_PDVQ_AUDITSOURCE)) {

					// query eventOutcome (QAK Segment status - ERR segment optional)
					String queryStatus = null;
	                try {
	                	int fieldIndex = 1;
	                	queryStatus = msg.getSegments().getByCodeAndIndex(HL7_Constants.QAK, fieldIndex).forceField(fieldIndex).getAsString();
	                } catch (Exception e){
	                	logger.error("caught exception trying to get status from QAK for audit logging, will log as a FAILURE");
	                }
	                
	                if (queryStatus == null || queryStatus.equals("AE") || queryStatus.equals("AR")){
	                	eventOutcome = RFC3881EventCodes.RFC3881EventOutcomeCodes.SERIOUS_FAILURE;
	                } else {
	                	eventOutcome = RFC3881EventCodes.RFC3881EventOutcomeCodes.SUCCESS;
	                }	
					
					
					String[] patientIds = null;
					try {
						patientIds = new String[] {getQueryPatientID(hl7)};
					} catch (Exception e) {
						logger.warn("Error getting HL7 query patient ids from message");
					}
					if (auditSource == ATNA_PIXC_AUDITSOURCE) {
						((PIXConsumerAuditor)getAuditor()).auditPIXQueryEvent(
								eventOutcome, 
								getURI().toString(), 
								receivingFacility, receivingApp, 
								sendingFacility, sendingApp, 
								msgControlId, hl7, patientIds);
					} else if (auditSource == ATNA_PDQ_AUDITSOURCE) {
						((PDQConsumerAuditor)getAuditor()).auditPDQQueryEvent(
								eventOutcome, 
								getURI().toString(), 
								receivingFacility, receivingApp, 
								sendingFacility, sendingApp, 
								msgControlId, hl7, patientIds);
					} else if (auditSource == ATNA_PDVQ_AUDITSOURCE) {
						// PDVQ , ITI-22
						((PDQConsumerAuditor)getAuditor()).auditPDVQQueryEvent(
								eventOutcome, 
								getURI().toString(), 
								receivingFacility, receivingApp, 
								sendingFacility, sendingApp, 
								msgControlId, hl7, patientIds);		
					} else {
						// unsupport event
						logger.error("Unsupported audit event attempted");
					}

				} else if ((auditSource == ATNA_PIXS_AUDITSOURCE) || (auditSource == ATNA_PAMS_AUDITSOURCE)) {

					// feed eventOutcome (MSA Segment status - ERR segment may be there without an actual error)
					String feedStatus = null;
	                try {
	                	feedStatus = msg.getSegments().getByCodeAndIndex(HL7_Constants.MSA, 1).forceField(0).getAsString();
	                } catch (Exception e){
	                	logger.error("caught exception trying to get status from MSA for audit logging, will log as a FAILURE");
	                }
	                
	                if (feedStatus == null || feedStatus.equals("AE") || feedStatus.equals("AR")){
	                	eventOutcome = RFC3881EventCodes.RFC3881EventOutcomeCodes.SERIOUS_FAILURE;
	                } else {
	                	eventOutcome = RFC3881EventCodes.RFC3881EventOutcomeCodes.SUCCESS;
	                }				
					
					String msgEventType = auditMessage.getEvent();
					
					String patientId = null;
					try {
						patientId = getExportPatientID(hl7);
					} catch (Exception e) {
						logger.warn("Error getting HL7 export patient ids from message");
					}

					//logger.info("ATNA_PIXS_AUDITSOURCE: " + msgEventType + " : " + participant2 + " : " + participant3);
					
					if (msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A01) || 
							msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A04) ||
							msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A05) ||
							msgEventType.equals(HL7_Constants.MSH_9_2_PAMS_A28)) {
						// Do "Patient Record Create" for A01, A04, A05, A28 messages
						
						((PIXSourceAuditor)getAuditor()).auditCreatePatientRecordEvent(
								eventOutcome, getURI().toString(), 
								receivingFacility, receivingApp, 
								sendingFacility, sendingApp, 
								msgControlId, patientId);
						
						//auditor.auditPatientRecordCreateEvent(eventOutcome, getExportPatientID(hl7));
						
					} else if (msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A08) ||
							msgEventType.equals(HL7_Constants.MSH_9_2_PAMS_A24) ||
							msgEventType.equals(HL7_Constants.MSH_9_2_PAMS_A31) ||
							msgEventType.equals(HL7_Constants.MSH_9_2_PAMS_A37)) {
						// Do "Patient Record Update" for A08, A24, A31, A37 messages
						
						((PIXSourceAuditor)getAuditor()).auditUpdatePatientRecordEvent(
								eventOutcome, getURI().toString(), 
								receivingFacility, receivingApp, 
								sendingFacility, sendingApp, 
								msgControlId, patientId);
						
						//auditor.auditPatientRecordUpdateEvent(eventOutcome, getExportPatientID(hl7));
						
					} else if (msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A40)) {
						// Do "Patient Record Update" and "Patient Record Delete" for A40 messages
						Segment segMRG = auditMessage.getSegments().getByCodeAndIndex(HL7_Constants.MRG, 1);
						if (segMRG == null) {
							logger.error("A40 message does not contain required MRG segment.  Audit message not sent.");
							throw new ClientException("A40 message does not contain required MRG segment.  Audit message not sent.");
						}
						String priorPatientId = PixPdqMessageUtilities.getHL7Field(segMRG.forceField(0));
						
						logger.info("ATNA_PIXS_AUDITSOURCE: " + getExportPatientID(hl7) + " : " + priorPatientId);
						
						((PIXSourceAuditor)getAuditor()).auditUpdatePatientRecordEvent(
								eventOutcome, getURI().toString(), 
								receivingFacility, receivingApp, 
								sendingFacility, sendingApp, 
								msgControlId, patientId);
						
						((PIXSourceAuditor)getAuditor()).auditDeletePatientRecordEvent(
								eventOutcome, getURI().toString(), 
								receivingFacility, receivingApp, 
								sendingFacility, sendingApp, 
								msgControlId, priorPatientId);
						
//						auditor.auditPatientRecordUpdateEvent(eventOutcome, getExportPatientID(hl7));
//						auditor.auditPatientRecordDeleteEvent(eventOutcome, priorPatientId);
						
					} else {
						logger.error("Audting does not support this ADT message type.  Audit message not sent.");
					}
				}

			} catch (HL7V2Exception e) {
				logger.error("Error parsing out message for auditing", e);
				throw new ClientException(e);
			} catch (PixPdqMessageException e) {
				logger.error("Error parsing out message for auditing", e);
				throw new ClientException(e);
			} finally {
				applicationStopEvent(auditSource);
			}
	
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Client: send - Exit ");
		}
		return response;
	}
	
	/**
	 * Create application stop audit event
	 * Decision made to always throw SUCCESS_EVENT_OUTCOME here regardless
	 * of why Stop Actor is executed (ie exception or end of transaction)
	 * because the STOP is successful.
	 * 
     * @param auditSource - source actor associated with transaction
	 */
	private void applicationStopEvent(String auditSource) 
	{	
		getAuditor().auditActorStopEvent(RFC3881EventCodes.RFC3881EventOutcomeCodes.SUCCESS, auditSource, null);
	}
	
	/**
	 * Import audit message - participant object ID
	 * 
	 * @param hl7 - hl7v2 message
	 * @return PID-3 Patient ID array
	 * @throws ClientException
	 */
	private String[] getImportPatientID(String hl7) throws ClientException {
			
		Message query = null;
		int count = 0;
		try {
			query = PixPdqMessageUtilities.stringToMsg(hl7);
			if (logger.isDebugEnabled()) {
				logger.debug("Creating import patientIDs from: " + hl7);
			}
			count = query.getSegments().countByCode("PID");
		} catch (PixPdqMessageException e) {
			throw new ClientException(e);
		}	
		
		if (count < 1) {
			// patient not found or query err'd
			Segment seg = query.getSegments().getByCodeAndIndex("QPD", 1);
			String	patientID[] = new String[1];
			patientID[0] = getFullPID3(seg);
			return patientID;	
		} else {	
			String	patientID[] = new String[count];
			for (int i=0; i < count; i++) {
				Segment seg = query.getSegments().getByCodeAndIndex("PID", i+1);
				patientID[i] = getFullPID3(seg);
			}
			return patientID;
		}
	}
	
	/**
	 * Export audit message - participant object ID
	 * 
	 * @param hl7 - hl7v2 message
	 * @return PID-3 Patient ID
	 * @throws ClientException
	 */
	private String getExportPatientID(String hl7) throws ClientException {
		
		String patientID = null;
		try {
			Message pixFeed = PixPdqMessageUtilities.stringToMsg(hl7);
			if (logger.isDebugEnabled()) {
				logger.debug("Creating export patientID from: " + hl7);
			}
			Segment seg = pixFeed.getSegments().getByCodeAndIndex("PID", 1);
			patientID = getFullPID3(seg);
		} catch (PixPdqMessageException e) {
			throw new ClientException(e);
		}
		return patientID;
	}
	
	private String getQueryPatientID(String hl7) throws ClientException {
		
		String patientID = null;
		try {
			Message pixFeed = PixPdqMessageUtilities.stringToMsg(hl7);
			if (logger.isDebugEnabled()) {
				logger.debug("Creating export patientID from: " + hl7);
			}
			Segment seg = pixFeed.getSegments().getByCodeAndIndex("QPD", 1);
			patientID = getFullPID3(seg);
		} catch (PixPdqMessageException e) {
			throw new ClientException(e);
		}
		return patientID;
	}	
	
	/**
	 * Retrieve full Patient ID in HL7 delimited format
	 * 
	 * @param seg - hl7v2 message PID segment
	 * @return PID-3 Patient ID or QPD-3 Patient ID
	 */
	private String getFullPID3(Segment seg) throws ClientException {
		
		VerticalBarComposer composer = null;
		ByteArrayOutputStream out = null;
		OutputStream outStream = null;
		
		if (seg == null) {
			return null;
		}
		
		try {
			Field fld = seg.getFields().item(2);
			if (fld.hasRepeats()) {
				fld = fld.getRepeats().item(0);
			}
			out = new ByteArrayOutputStream();	
			composer = new VerticalBarComposer(out);
			composer.compose(fld);
			outStream = composer.getStream();
		} catch (IOException e) {
			throw new ClientException(e);
		} catch (HL7V2Exception e) {
			throw new ClientException(e);
		} 
		
		return outStream.toString();
	}
	
}
