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

package org.openhealthtools.ihe.common.hl7v2.message;

import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.eclipse.ohf.hl7v2.core.message.model.Field;
import org.eclipse.ohf.hl7v2.core.message.model.Message;
import org.eclipse.ohf.hl7v2.core.message.model.Segment;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.common.hl7v2.mllpclient.ClientException;


public abstract class PixPdqMessage extends Message implements HL7_Constants {
  
	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * Debug,Info,Error,Fatal log 
	 */
    private static Logger logger = Logger.getLogger(PixPdqMessage.class);
	
    
	////////////////////
	// PUBLIC METHODS //
	////////////////////
    
	/**
	 * MSH-3 Sending Application
	 * This field uniquely identifies the sending application among all other 
	 * applications within the network enterprise. The network enterprise consists
	 * of all those applications that participate in the exchange of HL7 messages 
	 * within the enterprise. Entirely site-defined.
	 * 
	 * @return Sending Application (HD) 3 components
	 *         String[0] - NamespaceId
	 *         String[1] - UniversalId
	 *         String[2] - UniversalIdType
	 * @throws PixPdqMessageException
	 */
	public String[] getSendingApplication() throws PixPdqMessageException {
		
		Segment seg = getSegments().getByCodeAndIndex(MSH, 1);
		int fieldIndex = 2;
		return PixPdqMessageUtilities.getFieldComponents(seg, fieldIndex);
	}
	
	/**
	 * MSH-3 Sending Application
	 * This field uniquely identifies the sending application among all other 
	 * applications within the network enterprise. The network enterprise consists
	 * of all those applications that participate in the exchange of HL7 messages 
	 * within the enterprise. Entirely site-defined.
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @throws PixPdqMessageException
	 */
	public void changeDefaultSendingApplication(String namespaceId, String universalId, String universalIdType) throws PixPdqMessageException {
			
		if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType)) {
			setField(MSH_3_1, namespaceId);
			setField(MSH_3_2, universalId);
			setField(MSH_3_3, universalIdType);
		} else {
			throw new PixPdqMessageException("PixPdqMessage: changeDefaultSendingApplication - "  + namespaceId + ", " + universalId + ", " + universalIdType + " invalid parameter combination ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixPdqMessage: changeDefaultSendingApplication ");
		}
	}
	
	/**
	 * MSH-4 Sending Facility
	 * This field further describes the sending application, MSH-3-sending 
	 * application. With the promotion of this field to an HD data type, the usage
	 * has been broadened to include not just the sending facility but other 
	 * organizational entities such as a) the organizational entity responsible for
	 * sending application; b) the responsible unit; c) a product or vendor's 
	 * identifier, etc. Entirely site-defined.
	 * 
	 * @return Sending Facility (HD) 3 components
	 *         String[0] - NamespaceId
	 *         String[1] - UniversalId
	 *         String[2] - UniversalIdType
	 * @throws PixPdqMessageException
	 */
	public String[] getSendingFacility() throws PixPdqMessageException {
		
		Segment seg = getSegments().getByCodeAndIndex(MSH, 1);
		int fieldIndex = 3;
		return PixPdqMessageUtilities.getFieldComponents(seg, fieldIndex);
	}
	
	/**
	 * MSH-4 Sending Facility
	 * This field further describes the sending application, MSH-3-sending 
	 * application. With the promotion of this field to an HD data type, the usage
	 * has been broadened to include not just the sending facility but other 
	 * organizational entities such as a) the organizational entity responsible for
	 * sending application; b) the responsible unit; c) a product or vendor's 
	 * identifier, etc. Entirely site-defined.
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @throws PixPdqMessageException
	 */
	public void changeDefaultSendingFacility(String namespaceId, String universalId, String universalIdType) throws PixPdqMessageException {
		
		if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType)) {
			setField(MSH_4_1, namespaceId);
			setField(MSH_4_2, universalId);
			setField(MSH_4_3, universalIdType);
		} else {
			throw new PixPdqMessageException("PixPdqMessage: changeDefaultSendingFacility - " + namespaceId + ", " + universalId + ", " + universalIdType + " invalid parameter combination ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixPdqMessage: changeDefaultSendingFacility ");
		}
	}
	
	/**
	 * MSH-5 Receiving Application
	 * This field uniquely identifies the receiving application among all other 
	 * applications within the network enterprise. The network enterprise consists 
	 * of all those applications that participate in the exchange of HL7 messages
	 * within the enterprise. Entirely site-defined.
	 * 
	 * @return Receiving Application (HD) 3 components
	 *         String[0] - NamespaceId
	 *         String[1] - UniversalId
	 *         String[2] - UniversalIdType
	 * @throws PixPdqMessageException
	 */
	public String[] getReceivingApplication() throws PixPdqMessageException {
		
		Segment seg = getSegments().getByCodeAndIndex(MSH, 1);
		int fieldIndex = 4;
		return PixPdqMessageUtilities.getFieldComponents(seg, fieldIndex);
	}
	
	/**
	 * MSH-5 Receiving Application
	 * This field uniquely identifies the receiving application among all other 
	 * applications within the network enterprise. The network enterprise consists 
	 * of all those applications that participate in the exchange of HL7 messages
	 * within the enterprise. Entirely site-defined.
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @throws PixPdqMessageException
	 */
	public void changeDefaultReceivingApplication(String namespaceId, String universalId, String universalIdType) throws PixPdqMessageException {
		
		if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType)) {
			setField(MSH_5_1, namespaceId);
			setField(MSH_5_2, universalId);
			setField(MSH_5_3, universalIdType);
		} else {
			throw new PixPdqMessageException("PixPdqMessage: changeDefaultReceivingApplication - " + namespaceId + ", " + universalId + ", " + universalIdType + " invalid parameter combination ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixPdqMessage: changeDefaultReceivingApplication ");
		}
	}
	
	/**
	 * MSH-6 Receiving Facility
	 * This field identifies the receiving application among multiple identical 
	 * instances of the application running on behalf of different organizations.
	 * 
	 * @return Receiving Facility (HD) 3 components
	 *         String[0] - NamespaceId
	 *         String[1] - UniversalId
	 *         String[2] - UniversalIdType
	 * @throws PixPdqMessageException
	 */
	public String[] getReceivingFacility() throws PixPdqMessageException {

		Segment seg = getSegments().getByCodeAndIndex(MSH, 1);
		int fieldIndex = 5;
		return PixPdqMessageUtilities.getFieldComponents(seg, fieldIndex);
	}
	
	/**
	 * MSH-6 Receiving Facility
	 * This field identifies the receiving application among multiple identical 
	 * instances of the application running on behalf of different organizations.
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @throws PixPdqMessageException
	 */
	public void changeDefaultRecievingFacility(String namespaceId, String universalId, String universalIdType) throws PixPdqMessageException {
		
		if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType)) {
			setField(MSH_6_1, namespaceId);
			setField(MSH_6_2, universalId);
			setField(MSH_6_3, universalIdType);
		} else {
			throw new PixPdqMessageException("PixPdqMessage: changeDefaultReceivingFacility - " + namespaceId + ", " + universalId + ", " + universalIdType + " invalid parameter combination ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixPdqMessage: changeDefaultRecievingFacility ");
		}
	}

	/**
	 * MSH-10 Message Control ID
	 * This field contains a number or other identifier that uniquely identifies
	 * the message. The receiving system echoes this ID back to the sending system
	 * in the Message acknowledgment segment (MSA).
	 * 
	 * @return Message Control ID (ST)
	 * @throws PixPdqMessageException
	 */
	public String getMessageControlID() throws PixPdqMessageException {
		
		Segment seg = getSegments().getByCodeAndIndex(MSH, 1);
		int fieldIndex = 9;
		try {
			return seg.forceField(fieldIndex).getAsString();
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException(e);
		}
	}
	
	/**
	 * MSH-10 Control ID
	 * This field contains a number or other identifier that uniquely identifies
	 * the message. The receiving system echoes this ID back to the sending system
	 * in the Message acknowledgment segment (MSA).
	 * The default is a random generated ID.
	 * 
	 * @param controlId
	 * @throws PixPdqMessageException
	 */
	public void changeDefaultControlId(String controlId) throws PixPdqMessageException {
		
		if ((controlId != null) && (controlId.length() > 0)) {
				setField(MSH_10, controlId);
		} else {
			throw new PixPdqMessageException("PixPdqMessage: changeDefaultControlId - " + controlId + " invalid parameter ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixPdqMessage: changeDefaultControlId ");
		}
	}
	
	/**
	 * MSH-11 Processing ID
	 * This field is used to decide whether to process the message as defined in 
	 * HL7 Application (level 7) Processing rules.
	 * 
	 * @return ProcessID (PT) 2 components
	 *         String[0] - ProcessingId
	 *         String[1] - ProcessingMode
	 * 
	 * @throws PixPdqMessageException
	 */
	public String[] getProcessEnvironment() throws PixPdqMessageException {

		Segment seg = getSegments().getByCodeAndIndex(MSH, 1);
		int fieldIndex = 10;
		return PixPdqMessageUtilities.getFieldComponents(seg, fieldIndex);
	}
	
	/**
	 * MSH-11 Processing ID
	 * This field is used to decide whether to process the message as defined in 
	 * HL7 Application (level 7) Processing rules.
	 * The default is "P" production.
	 * 
	 * @param environment
	 * @throws PixPdqMessageException
	 */
	public void changeDefaultProcessEnvironment(String environment) throws PixPdqMessageException {
		
		if ((environment != null) && (environment.length() > 0)) {
			setField(MSH_11_1, environment);
		} else {
			throw new PixPdqMessageException("PixPdqMessage: changeDefaultProcessEnvironment - " + environment + " invalid parameter ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixPdqMessage: changeDefaultProcessEnvironment ");
		}
	}
	
	/**
	 * MSH-18 Character Set
	 * This field contains the character set for the entire message.
	 * 
	 * @return Character Set (ID)
	 * @throws PixPdqMessageException
	 */
	public String[] getCharacterSet() throws PixPdqMessageException {

		Segment seg = getSegments().getByCodeAndIndex(MSH, 1);
		int fieldIndex = 17;
		
		try {
			int repeats = PixPdqMessageUtilities.getRepeatCount(seg, fieldIndex+1);
			Field fld = seg.getFields().item(fieldIndex);
			String retArray[] = new String[repeats];
			for (int i=0; i < repeats; i++) {
				retArray[i] = fld.getRepeat(i).getComponents().item(0).getAsString();
			}
			return retArray;
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException(e);
		}
	}   
	
	/**
	 * MSH-18 Character Set
	 * This field contains the character set for the entire message.
	 * The default is "ASCII".
	 * 
	 * @param charSet
	 *        see HL7 Table 0211 - Alternate character sets for allowed values
	 * @throws PixPdqMessageException
	 */
	public void changeDefaultCharacterSet(String charSet) throws PixPdqMessageException {
		
		if ((charSet != null) && (charSet.length() > 0)) {
				setField(MSH_18_1, charSet);
		} else {
			throw new PixPdqMessageException("PixPdqMessage: changeDefaultCharacterSet - " + charSet + " invalid parameter ");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixPdqMessage: changeDefaultCharacterSet ");
		}
	}
    
    /**
     * Updates message object structure directly.
     * @param path - segment and field (ex MSH-11 or MSH-9-3)
     * @param data - value for field
     * @throws ClientException 
     * @throws PixSourceException
     */
    public void setField(String path, String data) throws PixPdqMessageException {

        try {
            StringTokenizer stok = new StringTokenizer(path, "-");
            String code = stok.nextToken();
            Segment seg = getSegments().getByCodeAndIndex(code, 1);
            if (seg == null) {
            	if (logger.isDebugEnabled()) {
            		logger.debug("PixMsgADT: setField segment " + code + " was not found in message.");
            	}
            	throw new PixPdqMessageException("PixMsgADT: setField segment " + code + " was not found in message.");
            }
            String fieldIndexBase1 = stok.nextToken();
            int fieldIndex = Integer.parseInt(fieldIndexBase1)-1;
            Field fld = seg.forceField(fieldIndex);
            if (logger.isDebugEnabled()) {
                logger.debug("PixMsgADT: setField " + path + " : " + code + "-" + (fieldIndexBase1));
            }
            if ((fld.getDefinition() == null) || (fld.getDefinition().isRepeatable() == false)) {
                forceElement(path).setAsString(data);
            } else {
                boolean done = false;
                String repeatPath = "1";
                if (stok.hasMoreTokens()) {
                    int len = code.length() + fieldIndexBase1.length() + 2;
                    repeatPath = path.substring(len);
                }
                if (logger.isDebugEnabled()) {
                    logger.debug("  path: " + path + " repeatPath: " + repeatPath);
                }
                for (int i=0; i < fld.getNonEmptyCount(); i++) {
                    String currentValue = null;
                    currentValue = fld.getRepeat(i).forceElement(repeatPath).getAsString();
                    if ((currentValue == null) || (currentValue.length() <= 0)) {
                        fld.getRepeat(i).forceElement(repeatPath).setAsString(data);
                        done = true;
                    }
                }
                if (done == false) {
                    fld.addRepeat(true).forceElement(repeatPath).setAsString(data);
                }
            }
        } catch (HL7V2Exception e) {
            logger.error("PixMsgADT: setField - " + path + " " + data + " caused exception " + e.getLocalizedMessage());
            throw new PixPdqMessageException(e);
        }
    }
    
	/**
	 * If value not found in message, set a value - does not override an existing value.
	 * Use "changeDefault" methods to override existing values.
	 * 
	 * @param alias - segment and field (ex MSH-11 or MSH-9-3)
	 * @param msgDefault - value for field
	 * @throws PdqConsumerException
	 */
	public void setNonNullElement(String alias, String msgDefault) throws PixPdqMessageException {
		
		try {
			if (this.getElement(alias).isNull() == true) {
				setField(alias, msgDefault);
			}
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException(e);
		}
	}
	
	
    /**
     * Reads message object structure directly.
     * @param path - segment and field (ex MSH-11 or MSH-9-3)
     * @throws ClientException 
     * @throws PixSourceException
     */
    public String getField(String path) throws PixPdqMessageException {

        try {
            StringTokenizer stok = new StringTokenizer(path, "-");
            String code = stok.nextToken();
            Segment seg = getSegments().getByCodeAndIndex(code, 1);
            if (seg == null) {
            	if (logger.isDebugEnabled()) {
            		logger.debug("PixMsgADT: getField segment " + code + " was not found in message.");
            	}
            	throw new PixPdqMessageException("PixMsgADT: getField segment " + code + " was not found in message.");
            }
            String fieldIndexBase1 = stok.nextToken();
                 
            if (logger.isDebugEnabled()) {
                logger.debug("PixMsgADT: getField " + path + " : " + code + "-" + (fieldIndexBase1));
            }
            return forceElement(path).getAsString();
   
        } catch (HL7V2Exception e) {
            logger.error("PixMsgADT: getField - " + path + " caused exception " + e.getLocalizedMessage());
            throw new PixPdqMessageException(e);
        }
    }
    
    
    /**
     * Reads message object structure directly.
     * @param segmentIndex - segment index (use when multiple, start with 0 for first segment)
     * @param path - segment and field (ex MSH-11 or MSH-9-3)
     * @throws ClientException 
     * @throws PixSourceException
     */
    public String getField(int segmentIndex, String path) throws PixPdqMessageException {

    	StringTokenizer stok = new StringTokenizer(path, "-");
    	String code = stok.nextToken();
    	Segment seg = getSegments().getByCodeAndIndex(code, segmentIndex+1);
    	if (seg == null) {
    		if (logger.isDebugEnabled()) {
    			logger.debug("PixMsgADT: getField segment " + code + " index " + segmentIndex + " was not found in message.");
    		}
    		throw new PixPdqMessageException("PixMsgADT: getField segment " + code + " index " + segmentIndex + " was not found in message.");
    	}
    	String fieldIndexBase1 = stok.nextToken();

    	if (logger.isDebugEnabled()) {
    		logger.debug("PixMsgADT: getField " + path + " : " + code + "-" + (fieldIndexBase1));
    	}

    	int index = Integer.parseInt(fieldIndexBase1);
    	Field fld = seg.getFields().item(index-1);
    	return PixPdqMessageUtilities.getHL7Field(fld);

    }

}
