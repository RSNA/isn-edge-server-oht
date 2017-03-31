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

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.ParsingOptions;
import org.eclipse.ohf.hl7v2.core.message.formats.Formats;
import org.eclipse.ohf.hl7v2.core.message.model.Message;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.atna.auditor.PIXConsumerAuditor;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;
import org.openhealthtools.ihe.common.hl7v2.mllpclient.Client;
import org.openhealthtools.ihe.common.hl7v2.mllpclient.ClientException;

/**
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
 * <p>See IT Infrastructure Technical Framework Vol 2 > IHE Transactions > PIX Query</p>
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */


public class PixConsumer extends Client {


	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////

	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(PixConsumer.class);

    /**
     * MSH Control ID Field Path
     */
    private static final String MSH_CONTROL_ID = "MSH-10";
    

	//////////////////
	// CONSTRUCTORS //
	//////////////////

    /**
     * Constructs a PIX Consumer Client object.
     */
    public PixConsumer() throws ClientException {
    	super(PIXConsumerAuditor.getAuditor());
    }

    /**
     * Constructs a PIX Consumer Client object.
     * @param conformanceProfile - XML file (ex. resources > conf > QBP-Q23(get corresponding IDs).XML)
     * @throws ClientException
     */
   public PixConsumer(InputStream conformanceProfile) throws ClientException {
    	super(conformanceProfile, PIXConsumerAuditor.getAuditor());
    }


	////////////////////
	// PUBLIC METHODS //
	////////////////////

    /**
     * QBP_Q23 Get Corresponding IDs Query - create message
     * 
     * @param patientId
     * @return PixConsumerQuery
     * @throws PixConsumerException
     */
    public PixConsumerQuery createQuery(String patientId) throws PixConsumerException {

      	if (logger.isDebugEnabled()) {
      		logger.debug("PixConsumer: createQuery - Entry " + "patientId: " + patientId);
      	}

    	PixConsumerQuery query = new PixConsumerQuery(this.getMessageManager(), this.getCPProfile(), patientId);

    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = query.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixConsumer: createQuery - Exit " + "patientId: " + patientId + " controlId: " + controlId);
      	}
    	return query;
    }

    /**
     * QBP_Q23 Get Corresponding IDs Query - create message
     * 
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @return PixConsumerQuery
     * @throws PixConsumerException
     */
    public PixConsumerQuery createQuery(String patientId, String namespaceId, String universalId, String universalIdType) throws PixConsumerException {

      	if (logger.isDebugEnabled()) {
      		logger.debug("PixConsumer: createQuery - Entry " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType);
      	}

    	PixConsumerQuery query = new PixConsumerQuery(this.getMessageManager(), this.getCPProfile(), patientId, namespaceId, universalId, universalIdType);

    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = query.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixConsumer: createQuery - Exit " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + " controlId: " + controlId);
      	}
    	return query;
    }
    
    /**
     * Processes HL7 messages with optional intermediate verification.
     * @param rawHL7 - hl7v2 message
     * @param verify - false to skip verification, true to run verification
     * @throws PixConsumerException
     */
    public String sendQuery(String rawHL7, boolean verify) throws PixConsumerException {
    	
    	String queryResponse = new String();
    	
      	if (logger.isDebugEnabled()) {
      		logger.debug("PixConsumer: sendQuery - Exit ");
      	}
      	
    	try {
    		queryResponse = sendHL7(rawHL7, verify, Client.ATNA_PIXC_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixConsumerException(e);
    	}
    	
      	if (logger.isDebugEnabled()) {
      		logger.debug("PixConsumer: sendQuery - Exit ");
      	}

    	return queryResponse;
    }
    
    /**
     * Process Message Object message with optional intermediate verification.
     * @param msg - hl7v2 message (org.eclipse.ohf.hl7v2.core)
     * @param verify - false to skip verification, true to run verification
     * @throws PixConsumerException
     */
    public Message sendQuery(Message msg, boolean verify) throws PixConsumerException {
    	
    	Message queryResponse = null;
    	String controlId = null;
    	
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixConsumer: sendQuery - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
      	}
    	
    	try {
    		queryResponse = sendMsg(msg, verify, Client.ATNA_PIXC_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixConsumerException(e);
    	}
    	
      	if (logger.isDebugEnabled()) {
      		logger.debug("PixConsumer: sendQuery - Exit "  + "controlId: " + controlId);
      	}
    	
    	return queryResponse;
    }

    /**
     * Process PixConsumerQuery message with optional intermediate verification.
     * 
     * @param msg - PixConsumerQuery
     * @param verify - false to skip verification, true to run verification
     * @return PixConsumerResponse
     * @throws PixConsumerException
     */
    public PixConsumerResponse sendQuery(PixConsumerQuery msg, boolean verify) throws PixConsumerException {

      	Message msgResponse;
      	PixConsumerResponse queryResponse = new PixConsumerResponse(this.getMessageManager());
      	String hl7;

    	String controlId = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixConsumer: sendQuery - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
      	}

      	try {
      		msgResponse = this.sendMsg((Message) msg, verify, Client.ATNA_PIXC_AUDITSOURCE);
      		hl7 = PixPdqMessageUtilities.msgToString(msgResponse);
      	} catch (ClientException e) {
      		throw new PixConsumerException(e);
      	} catch (PixPdqMessageException e) {
      		throw new PixConsumerException(e);
      	}

    	queryResponse = new PixConsumerResponse(MessageManager.getFactory());

    	ByteArrayInputStream inStream = new ByteArrayInputStream(hl7.getBytes());
    	ParsingOptions pOptions = new ParsingOptions();

		try {
			pOptions.setFormat(Formats.hfVerticalBar);
			if (hl7.compareTo("") == 0) {
				return queryResponse;
			} else {
				MessageManager.getFactory().load(inStream, queryResponse, pOptions);
				queryResponse.init();
			}
		}
		catch (HL7V2Exception e) {
			logger.error("PixConsumer: sendQuery - createQueryResponse HL7V2Exception ", e);
			throw new PixConsumerException(e);
		}

      	if (logger.isDebugEnabled()) {
      		logger.debug("PixConsumer: sendQuery - Exit "  + "controlId: " + controlId);
      	}

      	return queryResponse;
    }
}