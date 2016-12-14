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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.ParsingOptions;
import org.eclipse.ohf.hl7v2.core.message.formats.Formats;
import org.eclipse.ohf.hl7v2.core.message.formats.VerticalBarComposer;
import org.eclipse.ohf.hl7v2.core.message.model.Cell;
import org.eclipse.ohf.hl7v2.core.message.model.ComponentList;
import org.eclipse.ohf.hl7v2.core.message.model.Field;
import org.eclipse.ohf.hl7v2.core.message.model.Message;
import org.eclipse.ohf.hl7v2.core.message.model.Segment;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;

public class PixPdqMessageUtilities {


	/**
	 * Write message object to verticalbar string.
	 * @param msg
	 * @return message data in verticalbar format string
	 * @throws PixPdqMessageException
	 */
	public static String msgToString(Message msg) throws PixPdqMessageException {
		
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();	
		String strMessage = null;
		
		MessageManager globalFactory = MessageManager.getFactory();
		try {
			globalFactory.save(outStream, msg);
			strMessage = outStream.toString();
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException(e);
		}
		return strMessage;
	}
	
	/**
	 * Write verticalbar string to message object.
	 * @param hl7 - hl7v2 message
	 * @return Message
	 * @throws PixPdqMessageException
	 */
	public static Message stringToMsg(String hl7) throws PixPdqMessageException {

    	ByteArrayInputStream inStream = new ByteArrayInputStream(hl7.getBytes());
    	ParsingOptions pOptions = new ParsingOptions();
    	Message msgMessage = null;
     	MessageManager globalFactory = MessageManager.getFactory();   	
		try {
			msgMessage = globalFactory.createMessage();
			pOptions.setFormat(Formats.hfVerticalBar);
			globalFactory.load(inStream, msgMessage, pOptions);
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException(e);
		}
		return msgMessage;
	}
	
	/**
	 * Generate standard formatted date/time.
	 * @return current date/time in YYYYMMDDHHMMSS.TZ
	 */
    public static String getCurrentDateTimeString() {
    	
        Date now = new Date();
        //SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmmss.zzz");
        // MAD:  For Connectathon 2007, updating for compatibility problems with
        //       3rd-party PIX/PDQ servers
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmmssZ");
        return format.format(now);
    } 
	
	/**
	 * Generate random numbers for message object fields.
	 * @param length
	 * @return random numeric string
	 */
	public static String getRandomFieldValue(int length) {
		
		int r;
		StringBuffer random = new StringBuffer();
		
		Random generator = new Random();
		for (int i=1; i < length; i++) {
			r = generator.nextInt(10);           
			random.append(String.valueOf(r));
		}
		return random.toString();
	}	
	
	
	/**
	 * Display segment as HL7 "|" delimited string.
	 * 
	 * Sample code returns the 1st MSH segment:
	 * Segment seg = msg.getSegments().getByCodeAndIndex("MSH", 1);
	 * String hl7 = ClientUtilities.getHL7Segment(seg);
	 * 
	 * @param seg
	 * @return hl7 "|" delimited string
	 */
	public static String getHL7Segment(Segment seg) {
		
		VerticalBarComposer comp;
		ByteArrayOutputStream out;
		OutputStream outStream;
		
		try {
			out = new ByteArrayOutputStream();	
			comp = new VerticalBarComposer(out);
			comp.compose(seg);
			outStream = comp.getStream();
		} catch (IOException e) {
			return null;
		} catch (HL7V2Exception e) {
			return null;
		}	
		return outStream.toString();
	}
	
	
	/**
	 * Display field as HL7 "|" delimited string.
	 * 
	 * Sample code returns the 3rd field (SendingApplication) in the 1st MSH segment:
	 * Field fld = msg.getSegments().getByCodeAndIndex("MSA", 1).forceField(2);
	 * String hl7 = ClientUtilities.getHL7Field(fld);
	 * 
	 * @param fld
	 * @return hl7 "|" delimited string
	 */
	public static String getHL7Field(Field fld) {
		
		VerticalBarComposer comp;
		ByteArrayOutputStream out;
		OutputStream outStream;
		
		try {
			out = new ByteArrayOutputStream();	
			comp = new VerticalBarComposer(out);
			comp.compose(fld);
			outStream = comp.getStream();
		} catch (IOException e) {
			return null;
		} catch (HL7V2Exception e) {
			return null;
		}	
		return outStream.toString();
	}
	
	
	/**
	 * Generic call retrieving all components in a field.
	 * If the field has repeats, returns primary repeat (index 0).
	 * Use getFieldComponentsInRepeat() instead to specify a particular repeat to return.
	 * 
	 * @param seg - Segment (ex Segment seg = msg.getSegments().getByCodeAndIndex("MSH", 1))
	 * @param fieldIndex - int (ex 2 to access "MSH-3")
	 * @return String array with all components in field
	 * @throws PixPdqMessageException
	 */
	public static String[] getFieldComponents(Segment seg, int fieldIndex) throws PixPdqMessageException {

		return getFieldComponentsInRepeat(seg, fieldIndex, 0);
	}
	
	/**
	 * Generic call retrieving the number of nonempty repeats in a field.
	 * 
	 * @param seg - Segment (ex Segment seg = msg.getSegments().getByCodeAndIndex("MSH", 1))
	 * @param fieldIndex - int (ex 2 to access "MSH-3")
	 * @return String array with all components in field
	 * @throws PixPdqMessageException
	 */
	public static int getRepeatCount(Segment seg, int fieldIndex) throws PixPdqMessageException {
		
		try {
			return seg.getFields().item(fieldIndex).getNonEmptyCount();
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException(e);
		}
	}
	
	
	/**
	 * Generic call retrieving all components in a field for a specified repeat.
	 * 
	 * 
	 * @param seg - Segment (ex Segment seg = msg.getSegments().getByCodeAndIndex("MSH", 1))
	 * @param fieldIndex
	 * @param repeatIndex
	 * @return String
	 * @throws PixPdqMessageException
	 */
	public static String[] getFieldComponentsInRepeat(Segment seg, int fieldIndex, int repeatIndex) throws PixPdqMessageException {

		try {
			if ((seg == null) || (fieldIndex < 0) || (fieldIndex > seg.getFields().size()) ||(repeatIndex > seg.getFields().item(fieldIndex).getNonEmptyCount())) {
				throw new PixPdqMessageException("ClientUtilities: getFieldComponentsInRepeat - invalid parameters");
			}

			Field fld = seg.getFields().item(fieldIndex).getRepeat(repeatIndex);

			if (fld == null) {
				throw new PixPdqMessageException("ClientUtilities: getFieldComponentsInRepeat - field " + (fieldIndex+1) + " not found.");
			}

			ComponentList compList = fld.getComponents();
			int numComponents = compList.size();
			String values[] = new String[numComponents];

			for (int i=0; i < numComponents; i++) {
				try {
					values[i] = compList.item(i).getAsString();
				} catch (HL7V2Exception e) {
					throw new PixPdqMessageException("ClientUtilities: getFieldComponentsInRepeat - HL7V2Exception on component at index " + i);
				}
			}
			return values;
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException("");
		}
	}
	
	//segment count
	//repetition count
	
	/**
	 * Test HD datatype input valid.
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @return boolean
	 */
	public static boolean isHDParamValid(String namespaceId, String universalId, String universalIdType) {
		
		//need to specify a) namespaceId only
		//                b) both universalId and universalIdType 
		//                c) all 3
		
		boolean str0 = false;
		boolean str1 = false;
		boolean str2 = false;
		
		if ((namespaceId != null) && (namespaceId.length() > 0)) {
			str0 = true;
		}
		if ((universalId != null) && (universalId.length() > 0)) {
			str1 = true;
		}
		if ((universalIdType != null) && (universalIdType.length() > 0)) {
			str2 = true;
		}
		
		if ((str0 && !str1 && !str2) || (str1 && str2) || (str0 && str1 && str2)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Test HD datatype input exists.
	 * 
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @return boolean
	 */
	public static boolean isHDParamEmpty(String namespaceId, String universalId, String universalIdType) {
		
		if ((namespaceId != null) && (namespaceId.length() > 0)) {
			return false;
		}
		if ((universalId != null) && (universalId.length() > 0)) {
			return false;
		}
		if ((universalIdType != null) && (universalIdType.length() > 0)) {
			return false;
		}

		return true;
	}
	
	/**
	 * 
	 * @return auditUser
	 */
	public static String getAuditUser() {
		return "";
		//return AtnaAgentFactory.getAtnaAgent().getInitiatingUser();
	}
	
	/**
	 * 
	 * @param msg
	 * @return
	 * @throws PixPdqMessageException
	 */
    public static String getPixSourceMessageType(Message msg) throws PixPdqMessageException {
    	
		String messageType = null;
		
		try {
			Cell cell = msg.getElement(HL7_Constants.MSH_9_2);
			messageType = cell.getAsString();
		} catch (HL7V2Exception e) {
			throw new PixPdqMessageException(e);
		}
    	
		if (messageType != null) {
			if (messageType.contains(HL7_Constants.MSH_9_2_PIXS_A01)) {
				return HL7_Constants.MSH_9_2_PIXS_A01;
			} else if (messageType.contains(HL7_Constants.MSH_9_2_PIXS_A04)) {
				return HL7_Constants.MSH_9_2_PIXS_A04;
			} else if (messageType.contains(HL7_Constants.MSH_9_2_PIXS_A05)) {
				return HL7_Constants.MSH_9_2_PIXS_A05;
			} else if (messageType.contains(HL7_Constants.MSH_9_2_PIXS_A08)) {
				return HL7_Constants.MSH_9_2_PIXS_A08;
			} else if (messageType.contains(HL7_Constants.MSH_9_2_PIXS_A40)) {
				return HL7_Constants.MSH_9_2_PIXS_A40;
			}
		}
		throw new PixPdqMessageException("Message type " + messageType + " is not a valid PIX Source message type.");
    }
	
}