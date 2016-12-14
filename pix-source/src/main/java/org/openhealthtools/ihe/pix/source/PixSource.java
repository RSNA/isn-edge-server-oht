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

package org.openhealthtools.ihe.pix.source;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.ohf.hl7v2.core.message.ParsingOptions;
import org.eclipse.ohf.hl7v2.core.message.formats.Formats;
import org.eclipse.ohf.hl7v2.core.message.model.Message;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.atna.auditor.PIXSourceAuditor;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;
import org.openhealthtools.ihe.common.hl7v2.mllpclient.Client;
import org.openhealthtools.ihe.common.hl7v2.mllpclient.ClientException;

/**
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
 * <p>See IT Infrastructure Technical Framework Vol 2 > IHE Transactions > Patient Identity Feed</p>
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */


public class PixSource extends Client {

	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(PixSource.class);
    
    /**
    * MSH Control ID Field Path
    */
   private static final String MSH_CONTROL_ID = "MSH-10";
   
	
	//////////////////
	// CONSTRUCTORS //
	//////////////////
    
    /**
     * Constructs a PIX Source Client object.
     */
    public PixSource() throws ClientException {
    	super(PIXSourceAuditor.getAuditor());
    }
        
    /**
     * Constructs a PIX Source Client object.
     * @param conformanceProfile - XML file (ex. resources > conf > ADT-A04(register outpatient).XML)
     * @throws ClientException
     */
   public PixSource(InputStream conformanceProfile) throws ClientException {
    	super(conformanceProfile, PIXSourceAuditor.getAuditor());
    }
   
    
	////////////////////
	// PUBLIC METHODS //
	////////////////////
    
    /**
     * ADT_A01 Admit Inpatient - create message
     * 
     * @param patientId
     * @return PixMsgAdmitInpatient
     * @throws PixSourceException
     */
    public PixMsgAdmitInpatient admitInpatient(String patientId) throws PixSourceException {
    	
      	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Admit Inpatient A01 message - Entry " + "patientId: " + patientId);
      	}

    	PixMsgAdmitInpatient admitMsg = new PixMsgAdmitInpatient(this.getMessageManager(),this.getCPProfile(), patientId, null, null, null);

      	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = admitMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Admit Inpatient A01 message - Exit " + "patientId: " + patientId + " controlId: " + controlId);
      	}
    	return admitMsg;
    }
    
    /**
     * ADT_A01 Admit Inpatient - create message
     * 
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @return PixMsgAdmitInpatient
     * @throws PixSourceException
     */
    public PixMsgAdmitInpatient admitInpatient(String patientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
    	
      	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Admit Inpatient A01 message - Entry " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType);
      	}
      	
      	PixMsgAdmitInpatient admitMsg = new PixMsgAdmitInpatient(this.getMessageManager(),this.getCPProfile(), patientId, namespaceId, universalId, universalIdType);
    
      	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = admitMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Admit Inpatient A01 message - Exit " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + " controlId: " + controlId);
      	}
    	return admitMsg;
    
    }
    
    /**
     * ADT_A01 Admit Inpatient - send message
     * 
     * @param rawHL7 - hl7v2 message
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public String sendAdmission(String rawHL7, boolean verify) throws PixSourceException {
    	
    	String pixRsp = new String();
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Admit Inpatient A01 message - Entry " + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendHL7(rawHL7, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Admit Inpatient A01 message - Exit ");
      	}
    	
    	return pixRsp;
    }
    
    /**
     * ADT_A01 Admit Inpatient - send message
     * 
     * @param msg - hl7v2 message (org.eclipse.ohf.hl7v2.core)
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public Message sendAdmission(Message msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	Message pixRsp = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Admit Inpatient A01 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendMsg(msg, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Admit Inpatient A01 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A01 Admit Inpatient - send message
     * 
     * @param msg - PixMsgAdmitInpatient
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public PixSourceResponse sendAdmission(PixMsgAdmitInpatient msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Admit Inpatient A01 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	PixSourceResponse pixRsp = sendPixFeed(msg, verify);
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Admit Inpatient A01 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
 
    
    /**
     * ADT_A04 Register Outpatient - create message
     * 
     * @param patientId
     * @return PixMsgRegisterOutpatient
     * @throws PixSourceException
     */
    public PixMsgRegisterOutpatient registerOutpatient(String patientId) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Register Outpatient A04 message - Entry " + "patientId: " + patientId);
      	}
    	
    	PixMsgRegisterOutpatient regMsg = new PixMsgRegisterOutpatient(this.getMessageManager(),this.getCPProfile(), patientId, null, null, null);
    	
      	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = regMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Register Outpatient A04 message - Exit " + "patientId: " + patientId + " controlId: " + controlId);
      	}
    	return regMsg;
    }
    
    /**
     * ADT_A04 Register Outpatient - create message
     * 
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @return PixMsgRegisterOutpatient
     * @throws PixSourceException
     */
    public PixMsgRegisterOutpatient registerOutpatient(String patientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Register Outpatient A04 message - Entry " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType);
      	}
    	
    	PixMsgRegisterOutpatient regMsg = new PixMsgRegisterOutpatient(this.getMessageManager(),this.getCPProfile(), patientId, namespaceId, universalId, universalIdType);
    	
    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = regMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Register Outpatient A04 message - Exit " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + " controlId: " + controlId);
      	}
    	return regMsg;
    }
    
    /**
     * ADT_A04 Register Outpatient - send message
     * 
     * @param rawHL7 - hl7v2 message
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public String sendRegistration(String rawHL7, boolean verify) throws PixSourceException {
    	
    	String pixRsp = new String();
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Register Outpatient A04 message - Entry " + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendHL7(rawHL7, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Register Outpatient A04 message - Exit ");
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A04 Register Outpatient - send message
     * 
     * @param msg - hl7v2 message (org.eclipse.ohf.hl7v2.core)
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public Message sendRegistration(Message msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	Message pixRsp = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Register Outpatient A04 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendMsg(msg, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Register Outpatient A04 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A04 Register Outpatient - send message
     * 
     * @param msg - PixMsgResgisterOutpatient
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public PixSourceResponse sendRegistration(PixMsgRegisterOutpatient msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Register Outpatient A04 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	PixSourceResponse pixRsp = sendPixFeed(msg, verify);
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Register Outpatient A04 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A05 Preadmit Inpatient - create message
     * 
     * @param patientId
     * @return PixMsgPreadmitInpatient
     * @throws PixSourceException
     */
    public PixMsgPreadmitInpatient preadmitInpatient(String patientId) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Preadmit Inpatient A05 message - Entry " + "patientId: " + patientId);
      	}
    	
    	PixMsgPreadmitInpatient preadmitMsg = new PixMsgPreadmitInpatient(this.getMessageManager(),this.getCPProfile(), patientId, null, null, null);
    	
    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = preadmitMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Preadmit Inpatient A05 message - Exit " + "patientId: " + patientId + " controlId: " + controlId);
      	}
    	return preadmitMsg;
    }
    
    /**
     * ADT_A05 Preadmit Inpatient - create message
     * 
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @return PisMsgPreadmitInpatient
     * @throws PixSourceException
     */
    public PixMsgPreadmitInpatient preadmitInpatient(String patientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Preadmit Inpatient A05 message - Entry " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType);
      	}
    	
    	PixMsgPreadmitInpatient preadmitMsg = new PixMsgPreadmitInpatient(this.getMessageManager(),this.getCPProfile(), patientId, namespaceId, universalId, universalIdType);
    	
    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = preadmitMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Preadmit Inpatient A05 message - Exit " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + " controlId: " + controlId);
      	}
    	return preadmitMsg;
    }
    
    /**
     * ADT_A05 Preadmit Inpatient - send message
     * 
     * @param rawHL7 - hl7v2 message
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public String sendPreAdmission(String rawHL7, boolean verify) throws PixSourceException {
    	
    	String pixRsp = new String();
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Preadmit Inpatient A05 message - Entry " + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendHL7(rawHL7, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}

    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Preadmit Inpatient A05 message - Exit ");
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A05 Preadmit Inpatient - send message
     * 
     * @param msg - hl7v2 message (org.eclipse.ohf.hl7v2.core)
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public Message sendPreAdmission(Message msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	Message pixRsp = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Preadmit Inpatient A05 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendMsg(msg, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}

    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Preadmit Inpatient A05 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
       
    /**
     * ADT_A05 Preadmit Inpatient - send message
     * 
     * @param msg - PixMsgPreadmitInpatient
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public PixSourceResponse sendPreAdmission(PixMsgPreadmitInpatient msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Preadmit Inpatient A05 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	PixSourceResponse pixRsp = sendPixFeed(msg, verify);
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Preadmit Inpatient A05 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A08 Update Patient - create message
     * 
     * @param patientId
     * @param patientClass
     * @return PixMsgUpdatePatient
     * @throws PixSourceException
     */
    public PixMsgUpdatePatient updatePatient(String patientId, String patientClass) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Update A08 message - Entry " + "patientId: " + patientId + "class: " + patientClass);
      	}
    	
    	PixMsgUpdatePatient updMsg = new PixMsgUpdatePatient(this.getMessageManager(), this.getCPProfile(), patientId, null, null, null, patientClass);
    	
    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = updMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Update A08 message - Exit " + "patientId: " + patientId + "class: " + patientClass + " controlId: " + controlId);
      	}
    	return updMsg;
    }
    
    /**
     * ADT_A08 Update Patient - create message
     * 
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @param patientClass
     * @return PixMsgUpdatePatient
     * @throws PixSourceException
     */
    public PixMsgUpdatePatient updatePatient(String patientId, String namespaceId, String universalId, String universalIdType, String patientClass) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Update Patient A08 message - Entry " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + " class: " + patientClass);
      	}
    	
    	PixMsgUpdatePatient updMsg = new PixMsgUpdatePatient(this.getMessageManager(), this.getCPProfile(), patientId, namespaceId, universalId, universalIdType, patientClass);
    	
    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = updMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Update Patient A08 message - Exit " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + "class: " + patientClass + " controlId: " + controlId);
      	}
    	return updMsg;
    }
    
    /**
     * ADT_A08 Update Patient - send message
     * 
     * @param rawHL7 - hl7v2 message
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public String sendUpdate(String rawHL7, boolean verify) throws PixSourceException {
    	
    	String pixRsp = new String();
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Update Patient A08 message - Entry " + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendHL7(rawHL7, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}    	
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Update Patient A08 message - Exit ");
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A08 Update Patient - send message
     * 
     * @param msg - hl7v2 message (org.eclipse.ohf.hl7v2.core)
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public Message sendUpdate(Message msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	Message pixRsp = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Update Patient A08 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendMsg(msg, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Update Patient A08 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A08 Update Patient - send message
     * 
     * @param msg - PixMsgUpdatePatient
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public PixSourceResponse sendUpdate(PixMsgUpdatePatient msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Update Patient A08 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	PixSourceResponse pixRsp = sendPixFeed(msg, verify);
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Update Patient A08 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
    /**
     * ADT_A40 Merge Patient - create a message
     * 
     * @param patientId
     * @param patientClass
     * @param priorId
     * @return PixMsgMergePatient
     * @throws PixSourceException
     */
    public PixMsgMergePatient mergePatient(String patientId, String patientClass, String priorId) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Merge A40 message - Entry " + "patientId: " + patientId + " class: " + patientClass + " priorId: " + priorId);
      	}
    	
    	PixMsgMergePatient mergeMsg = new PixMsgMergePatient(this.getMessageManager(), this.getCPProfile(), patientId, null, null, null, patientClass, priorId);
    	
    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = mergeMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Merge A40 message - Exit " + "patientId: " + patientId + "class: " + patientClass + " priorId: " + priorId + " controlId: " + controlId);
      	}
    	return mergeMsg;
    }
    
    /**
     * ADT_A40 Merge Patient - create a message
     * 
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @param patientClass
     * @param priorId 
     * @return PixMsgMergePatient
     * @throws PixSourceException
     */
    public PixMsgMergePatient mergePatient(String patientId, String namespaceId, String universalId, String universalIdType, String patientClass, String priorId) throws PixSourceException {
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: create Merge Patient A40 message - Entry " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + " class: " + patientClass + " priorId: " + priorId);
      	}
    	
    	PixMsgMergePatient mergeMsg = new PixMsgMergePatient(this.getMessageManager(), this.getCPProfile(), patientId, namespaceId, universalId, universalIdType, patientClass, priorId);  
    		
    	if (logger.isDebugEnabled()) {
      		String controlId = null;
      		try {
      			controlId = mergeMsg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: create Merge Patient A40 message - Exit " + "patient: " + patientId + ", " + namespaceId + ", " + universalId + ", " + universalIdType + " class: " + patientClass + " priorId: " + priorId + " controlId: " + controlId);
      	}
    	return mergeMsg;
    }
    
    /**
     * ADT_A40 Merge Patient - send message
     * 
     * @param rawHL7 - hl7v2 message
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public String sendMerge(String rawHL7, boolean verify) throws PixSourceException {
    	
    	String pixRsp = new String();
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Merge Patient A40 message - Entry " + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendHL7(rawHL7, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Merge Patient A40 message - Exit ");
      	}
    	return pixRsp;
    }   
    
    /**
     * ADT_A40 Merge Patient - send message
     * 
     * @param msg - Message (not PixMsgMergePatient!)
     * @param verify - false to skip verification, true to run verification
     * @return Message
     * @throws PixSourceException
     */
    public Message sendMerge(Message msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	Message pixRsp = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Merge Patient A40 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	try {
    		pixRsp = sendMsg(msg, verify, Client.ATNA_PIXS_AUDITSOURCE);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	}
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Merge Patient A40 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }   

    /**
     * ADT_A40 Merge Patient - send message
     * 
     * @param msg - PixMsgMergePatient
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public PixSourceResponse sendMerge(PixMsgMergePatient msg, boolean verify) throws PixSourceException {
    	
    	String controlId = null;
    	if (logger.isDebugEnabled()) {
      		try {
      			controlId = msg.getElement(MSH_CONTROL_ID).getAsString();
      		} catch (HL7V2Exception e) {
      			//nothing
      		}
      		logger.debug("PixSource: send Merge Patient A40 message - Entry " + "controlId: " + controlId + " run verification? " + verify + " user: " + PixPdqMessageUtilities.getAuditUser());
    	}
    	
    	PixSourceResponse pixRsp = sendPixFeed(msg, verify);
    	
    	if (logger.isDebugEnabled()) {
      		logger.debug("PixSource: send Merge Patient A40 message - Exit " + "controlId: " + controlId);
      	}
    	return pixRsp;
    }
    
    /**
     * Utility for bridge to convert v2 strings to PixMsgADT for typing/processing
     * 
     * @param hl7
     * @return PixMsgADT
     * @throws PixSourceException
     */
    public PixMsgADT convertStringToPixMsgADT(String hl7) throws PixSourceException {
    	
    	PixMsgADT message = new PixMsgADT(this.getMessageManager(), this.getCPProfile(), hl7);
    	return message;
    }
    
    /**
     * Utility for bridge to convert Message object to PixSourceResponse
     * @param response
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public PixSourceResponse convertMessageToPixSourceResponse(Message response) throws PixSourceException {
    	
    	String hl7;
    	try {
    		hl7 = PixPdqMessageUtilities.msgToString(response);
    	}
    	catch (PixPdqMessageException e) {
    		throw new PixSourceException(e);
    	}
		return convertStringToPixSourceResponse(hl7);
    }
    
    /**
     * Utility for bridge to convert Message object to PixSourceResponse
     * @param response
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    public PixSourceResponse convertStringToPixSourceResponse(String response) throws PixSourceException {
    	
    	PixSourceResponse feedResponse = new PixSourceResponse(this.getMessageManager());
    	ByteArrayInputStream inStream = new ByteArrayInputStream(response.getBytes());
    	ParsingOptions pOptions = new ParsingOptions();
    	   	
		try {
			pOptions.setFormat(Formats.hfVerticalBar);
			if (response.compareTo("") == 0) {
				return feedResponse;
			} else {
				this.getMessageManager().load(inStream, feedResponse, pOptions);
				feedResponse.init();
			}
		}
		catch (HL7V2Exception e) {
			throw new PixSourceException(e);
		}
		return feedResponse;
    }

    /**
     * Process all PixSource messages with optional intermediate verification.
     * 
     * @param feed - any PixSource message
     * @param verify - false to skip verification, true to run verification
     * @return PixSourceResponse
     * @throws PixSourceException
     */
    private PixSourceResponse sendPixFeed(Message feed, boolean verify) throws PixSourceException {
    	
    	Message msgResponse = null;
    	PixSourceResponse feedResponse = new PixSourceResponse(this.getMessageManager());
    	String hl7;
    	
    	try {
    		msgResponse = sendMsg((Message) feed, verify, Client.ATNA_PIXS_AUDITSOURCE);
    		hl7 = PixPdqMessageUtilities.msgToString(msgResponse);
    	} catch (ClientException e) {
    		throw new PixSourceException(e);
    	} catch (PixPdqMessageException e) {
    		throw new PixSourceException(e);
    	}

    	ByteArrayInputStream inStream = new ByteArrayInputStream(hl7.getBytes());
    	ParsingOptions pOptions = new ParsingOptions();
    	   	
		try {
			pOptions.setFormat(Formats.hfVerticalBar);
			if (hl7.compareTo("") == 0) {
				return feedResponse;
			} else {
				this.getMessageManager().load(inStream, feedResponse, pOptions);
				feedResponse.init();
			}
		}
		catch (HL7V2Exception e) {
			throw new PixSourceException(e);
		}
		return feedResponse;
    }
    
}