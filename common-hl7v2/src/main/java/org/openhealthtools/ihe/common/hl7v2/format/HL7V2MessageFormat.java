/** *****************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ****************************************************************************** */
package org.openhealthtools.ihe.common.hl7v2.format;

import java.util.ArrayList;

import org.openhealthtools.ihe.common.hl7v2.CX;
import org.openhealthtools.ihe.common.hl7v2.CXi;
import org.openhealthtools.ihe.common.hl7v2.Hl7v2Factory;
import org.openhealthtools.ihe.common.hl7v2.XAD;
import org.openhealthtools.ihe.common.hl7v2.XCN;
import org.openhealthtools.ihe.common.hl7v2.XON;
import org.openhealthtools.ihe.common.hl7v2.XPN;
import org.openhealthtools.ihe.common.hl7v2.XTN;

/**
 * Used in place of Jiva HL7v2 stack to support XDSMetadata. Will convert
 * between HL7 v2 formatted, string-based messages and this HL7v2 model. We
 * anticipate this functionality (some day)to be absorbed into the HL7v2 stack
 * provided in org.eclipse.ohf.hl7v2
 *
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class HL7V2MessageFormat
{

	/**
	 * Converts a model instance of the XON type to a HL7v2.5 standard delimited
	 * string.
	 *
	 * @param xon instance of the XON model
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the delimited String
	 */
	public static String toMessageString(XON xon, char componentSeparator, char subComponentSeparator)
	{
		StringBuffer result = new StringBuffer("");
		if (xon == null) {
			return result.toString();
		}
		// XON.1
		if (xon.getOrganizationName() != null) {
			result.append(xon.getOrganizationName());
		}
		// IHE 2009 ITI CP 316
		result.append(componentSeparator);
		// XON.2 - not present
		result.append(componentSeparator);
		// XON.3 - not present
		result.append(componentSeparator);
		// XON.4 - not present
		result.append(componentSeparator);
		// XON.5 - not present
		result.append(componentSeparator);
		// XON.6.1
		if (xon.getAssigningAuthorityName() != null) {
			result.append(xon.getAssigningAuthorityName());
		}
		result.append(subComponentSeparator);
		// XON.6.2
		if (xon.getAssigningAuthorityUniversalId() != null) {
			result.append(xon.getAssigningAuthorityUniversalId());
		}
		result.append(subComponentSeparator);
		// XON.6.3
		if (xon.getAssigningAuthorityUniversalIdType() != null) {
			result.append(xon.getAssigningAuthorityUniversalIdType());
		}
		result.append(componentSeparator);
		// XON.7 - not present
		result.append(componentSeparator);
		// XON.8 - not present
		result.append(componentSeparator);
		// XON.9 - not present
		result.append(componentSeparator);
		// XON.10
		if (xon.getIdNumber() != null) {
			result.append(xon.getIdNumber());
		}

		HL7V2MessageUtils.trimDelimiters(result, componentSeparator, subComponentSeparator);
		return result.toString();
	}

	/**
	 * Constructs a model instance of the XON type from the delimited message
	 * string
	 *
	 * @param msg the delimited message string
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the model instance
	 */
	public static XON buildXONFromMessageString(String msg, char componentSeparator, char subComponentSeparator)
	{
		XON xon = Hl7v2Factory.eINSTANCE.createXON();
		ArrayList comps = HL7V2MessageUtils.parse(msg, componentSeparator);
		if (comps.size() > 0) {
			if (comps.get(0) != null) {
				xon.setOrganizationName((String) comps.get(0));
			}
		}

		// IHE 2009 ITI CP 316
		if (comps.size() > 5) {
			if (comps.get(5) != null) {
				ArrayList subComps = HL7V2MessageUtils.parse((String) comps.get(5), subComponentSeparator);
				if (subComps.size() > 0) {
					if (subComps.get(0) != null) {
						xon.setAssigningAuthorityName((String) subComps.get(0));
					}
				}
				if (subComps.size() > 1) {
					if (subComps.get(1) != null) {
						xon.setAssigningAuthorityUniversalId((String) subComps.get(1));
					}
				}
				if (subComps.size() > 2) {
					if (subComps.get(2) != null) {
						xon.setAssigningAuthorityUniversalIdType((String) subComps.get(2));
					}
				}
			}
		}
		if (comps.size() > 9) {
			if (comps.get(9) != null) {
				xon.setIdNumber((String) comps.get(9));
			}
		}
		return xon;
	}

	/**
	 * Converts a model instance of the XTN type to a HL7v2.5 standard delimited
	 * string.
	 *
	 * @param xtn instance of the XTN model
	 * @param componentSeparator component level separator for message
	 * @return the delimited String
	 */
	public static String toMessageString(XTN xtn, char componentSeparator)
	{
		StringBuffer result = new StringBuffer("");
		if (xtn == null) {
			return result.toString();
		}
		if (xtn.getTelecommunicationAddress() == null && xtn.getTelecommunicationType() == null) {
			return result.toString();
		}
		// XTN.1- not present
		result.append(componentSeparator);
		// XTN.2 - not present
		result.append(componentSeparator);


		// ADDED for CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
		// XTN.3 - telecommunication type
		if (xtn.getTelecommunicationType() != null) {
			result.append(xtn.getTelecommunicationType());
			result.append(componentSeparator);
		}
		else {
			result.append(componentSeparator);
		}
		// XTN.4 - telecommunication address
		if (xtn.getTelecommunicationAddress() != null) {
			result.append(xtn.getTelecommunicationAddress());
		}

		// Removed per CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
		// XTN.5 - not present
		/*result.append(componentSeparator);
		// XTN.6 - not present
		result.append(componentSeparator);
		// XTN.7 - not present
		result.append(componentSeparator);
		// XTN.8 - not present
		result.append(componentSeparator);
		// XTN.9 - not present
		result.append(componentSeparator);
		// XTN.10 - not present
		result.append(componentSeparator);
		// XTN.11 - not present
		result.append(componentSeparator);
		// XTN 12
		result.append(xtn.getUnformattedTelephoneNumber());
		 */
		return result.toString();
	}

	/**
	 * Constructs a model instance of the XTN type from the delimited message
	 * string
	 *
	 * @param msg the delimited message string
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the model instance
	 */
	public static XTN buildXTNFromMessageString(String msg, char componentSeparator)
	{
		XTN xtn = Hl7v2Factory.eINSTANCE.createXTN();
		ArrayList comps = HL7V2MessageUtils.parse(msg, componentSeparator);



		if (comps.size() > 2) {
			if (comps.get(2) != null) {
				xtn.setTelecommunicationType((String) comps.get(2));
			}
		}
		if (comps.size() > 3) {
			if (comps.get(3) != null) {
				xtn.setTelecommunicationAddress((String) comps.get(3));
			}
		}

		// Removed per CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
/*		if(comps.size() > 11){
			if(comps.get(11) != null){
				xtn.setUnformattedTelephoneNumber((String)comps.get(11));
			}
		}*/

		return xtn;
	}

	/**
	 * Converts a model instance of the CX type to a HL7v2.5 standard delimited
	 * string.
	 *
	 * @param cx instance of the CX model
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the delimited String
	 */
	public static String toMessageString(CX cx, char componentSeparator, char subComponentSeparator)
	{
		StringBuffer result = new StringBuffer("");
		if (cx == null) {
			return result.toString();
		}
		// CX.1
		if (cx.getIdNumber() != null) {
			result.append(cx.getIdNumber());
		}
		result.append(componentSeparator);
		// CX.2 - not present
		result.append(componentSeparator);
		// CX.3 - not present
		result.append(componentSeparator);

		// CX.4.1 - Use of this subcomponent is prohibited in XDS, not other profiles
		if (Config.instant().isIncludeCxAssigningAuthorityName()) {
			if (cx.getAssigningAuthorityName() != null) {
				result.append(cx.getAssigningAuthorityName());
			}
		}

		result.append(subComponentSeparator);
		// CX.4.2
		if (cx.getAssigningAuthorityUniversalId() != null) {
			result.append(cx.getAssigningAuthorityUniversalId());
		}
		result.append(subComponentSeparator);
		// CX.4.3
		if (cx.getAssigningAuthorityUniversalIdType() != null) {
			result.append(cx.getAssigningAuthorityUniversalIdType());
		}

		HL7V2MessageUtils.trimDelimiters(result, componentSeparator, subComponentSeparator);
		return result.toString();
	}

	/**
	 * Converts a model instance of the CXi type to a HL7v2.5 standard delimited
	 * string.
	 *
	 * @param cxi instance of the CXi model
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the delimited String
	 * @since 2.0.3
	 */
	public static String toMessageString(CXi cxi, char componentSeparator, char subComponentSeparator)
	{
		StringBuffer result = new StringBuffer("");
		if (cxi == null) {
			return result.toString();
		}
		// CX.1
		if (cxi.getIdNumber() != null) {
			result.append(cxi.getIdNumber());
		}
		result.append(componentSeparator);
		// CX.2 - not present
		result.append(componentSeparator);
		// CX.3 - not present
		result.append(componentSeparator);

		// CX.4.1 - Use of this subcomponent is prohibited in XDS, not other profiles
		if (Config.instant().isIncludeCxAssigningAuthorityName()) {
			if (cxi.getAssigningAuthorityName() != null) {
				result.append(cxi.getAssigningAuthorityName());
			}
		}

		result.append(subComponentSeparator);
		// CX.4.2
		if (cxi.getAssigningAuthorityUniversalId() != null) {
			result.append(cxi.getAssigningAuthorityUniversalId());
		}
		result.append(subComponentSeparator);
		// CX.4.3
		if (cxi.getAssigningAuthorityUniversalIdType() != null) {
			result.append(cxi.getAssigningAuthorityUniversalIdType());
		}

		// CX.5
		if (cxi.getIdentifierTypeCode() != null) {
			result.append(cxi.getIdentifierTypeCode());
		}

		HL7V2MessageUtils.trimDelimiters(result, componentSeparator, subComponentSeparator);
		return result.toString();
	}

	/**
	 * Constructs a model instance of the CX type from the delimited message
	 * string
	 *
	 * @param msg the delimited message string
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the model instance
	 */
	public static CX buildCXFromMessageString(String msg, char componentSeparator, char subComponentSeparator)
	{
		CX cx = Hl7v2Factory.eINSTANCE.createCX();
		ArrayList comps = HL7V2MessageUtils.parse(msg, componentSeparator);
		if (comps.size() > 0) {
			if (comps.get(0) != null) {
				cx.setIdNumber((String) comps.get(0));
			}
		}
		if (comps.size() > 3) {
			if (comps.get(3) != null) {
				ArrayList subComps = HL7V2MessageUtils.parse((String) comps.get(3), subComponentSeparator);
				if (subComps.size() > 0) {
					if (subComps.get(0) != null) {
						cx.setAssigningAuthorityName((String) subComps.get(0));
					}
				}
				if (subComps.size() > 1) {
					if (subComps.get(1) != null) {
						cx.setAssigningAuthorityUniversalId((String) subComps.get(1));
					}
				}
				if (subComps.size() > 2) {
					if (subComps.get(2) != null) {
						cx.setAssigningAuthorityUniversalIdType((String) subComps.get(2));
					}
				}
			}
		}
		return cx;
	}

	/**
	 * Converts a model instance of the XCN type to a HL7v2.5 standard delimited
	 * string.
	 *
	 * @param xcn instance of the XCN model
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the delimited String
	 */
	public static String toMessageString(XCN xcn, char componentSeparator, char subComponentSeparator)
	{
		StringBuffer result = new StringBuffer("");
		if (xcn == null) {
			return result.toString();
		}
		// XCN.1
		if (xcn.getIdNumber() != null) {
			result.append(xcn.getIdNumber());
		}
		result.append(componentSeparator);
		// XCN.2.1
		if (xcn.getFamilyName() != null) {
			result.append(xcn.getFamilyName());
		}
		result.append(componentSeparator);
		// XCN.3
		if (xcn.getGivenName() != null) {
			result.append(xcn.getGivenName());
		}
		result.append(componentSeparator);
		// XCN.4 
		if (xcn.getOtherName() != null) {
			result.append(xcn.getOtherName());
		}
		result.append(componentSeparator);
		// XCN.5  
		if (xcn.getSuffix() != null) {
			result.append(xcn.getSuffix());
		}
		result.append(componentSeparator);
		// XCN.6  
		if (xcn.getPrefix() != null) {
			result.append(xcn.getPrefix());
		}
		result.append(componentSeparator);
		// XCN.7 - not present
		result.append(componentSeparator);
		// XCN.8 - not present
		result.append(componentSeparator);
		// XCN.9.1
		if (xcn.getAssigningAuthorityName() != null) {
			result.append(xcn.getAssigningAuthorityName());
		}
		result.append(subComponentSeparator);
		// XCN.9.2
		if (xcn.getAssigningAuthorityUniversalId() != null) {
			result.append(xcn.getAssigningAuthorityUniversalId());
		}
		result.append(subComponentSeparator);
		// XCN.9.3
		if (xcn.getAssigningAuthorityUniversalIdType() != null) {
			result.append(xcn.getAssigningAuthorityUniversalIdType());
		}
		HL7V2MessageUtils.trimDelimiters(result, componentSeparator, subComponentSeparator);
		return result.toString();
	}

	/**
	 * Constructs a model instance of the XCN type from the delimited message
	 * string
	 *
	 * @param msg the delimited message string
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the model instance
	 */
	public static XCN buildXCNFromMessageString(String msg, char componentSeparator, char subComponentSeparator)
	{
		XCN xcn = Hl7v2Factory.eINSTANCE.createXCN();
		ArrayList comps = HL7V2MessageUtils.parse(msg, componentSeparator);
		if (comps.size() > 0) {
			if (comps.get(0) != null) {
				xcn.setIdNumber((String) comps.get(0));
			}
		}
		if (comps.size() > 1) {
			if (comps.get(1) != null) {
				xcn.setFamilyName((String) comps.get(1));
			}
		}
		if (comps.size() > 2) {
			if (comps.get(2) != null) {
				xcn.setGivenName((String) comps.get(2));
			}
		}
		if (comps.size() > 3) {
			if (comps.get(3) != null) {
				xcn.setOtherName((String) comps.get(3));
			}
		}
		if (comps.size() > 4) {
			if (comps.get(4) != null) {
				xcn.setSuffix((String) comps.get(4));
			}
		}
		if (comps.size() > 5) {
			if (comps.get(5) != null) {
				xcn.setPrefix((String) comps.get(5));
			}
		}
		if (comps.size() > 8) {
			if (comps.get(8) != null) {
				ArrayList subComps = HL7V2MessageUtils.parse((String) comps.get(8), subComponentSeparator);
				if (subComps.size() > 0) {
					if (subComps.get(0) != null) {
						xcn.setAssigningAuthorityName((String) subComps.get(0));
					}
				}
				if (subComps.size() > 1) {
					if (subComps.get(1) != null) {
						xcn.setAssigningAuthorityUniversalId((String) subComps.get(1));
					}
				}
				if (subComps.size() > 2) {
					if (subComps.get(2) != null) {
						xcn.setAssigningAuthorityUniversalIdType((String) subComps.get(2));
					}
				}
			}
		}
		return xcn;
	}

	/**
	 * Converts a model instance of the XPN type to a HL7v2.5 standard delimited
	 * string.
	 *
	 * @param xpn instance of the XPN model
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the delimited String
	 */
	public static String toMessageString(XPN xpn, char componentSeparator)
	{
		StringBuffer result = new StringBuffer("");
		if (xpn == null) {
			return result.toString();
		}
		// XPN.1.1
		if (xpn.getFamilyName() != null) {
			result.append(xpn.getFamilyName());
		}
		result.append(componentSeparator);
		// XPN.2
		if (xpn.getGivenName() != null) {
			result.append(xpn.getGivenName());
		}
		result.append(componentSeparator);
		// XPN.3 
		if (xpn.getOtherName() != null) {
			result.append(xpn.getOtherName());
		}
		result.append(componentSeparator);
		// XPN.4  
		if (xpn.getSuffix() != null) {
			result.append(xpn.getSuffix());
		}
		result.append(componentSeparator);
		// XPN.5  
		if (xpn.getPrefix() != null) {
			result.append(xpn.getPrefix());
		}
		result.append(componentSeparator);

		HL7V2MessageUtils.trimDelimiters(result, componentSeparator);
		return result.toString();
	}

	/**
	 * Constructs a model instance of the XPN type from the delimited message
	 * string
	 *
	 * @param msg the delimited message string
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the model instance
	 */
	public static XPN buildXPNFromMessageString(String msg, char componentSeparator)
	{
		XPN xpn = Hl7v2Factory.eINSTANCE.createXPN();
		ArrayList comps = HL7V2MessageUtils.parse(msg, componentSeparator);
		if (comps.size() > 0) {
			if (comps.get(0) != null) {
				xpn.setFamilyName((String) comps.get(0));
			}
		}
		if (comps.size() > 1) {
			if (comps.get(1) != null) {
				xpn.setGivenName((String) comps.get(1));
			}
		}
		if (comps.size() > 2) {
			if (comps.get(2) != null) {
				xpn.setOtherName((String) comps.get(2));
			}
		}
		if (comps.size() > 3) {
			if (comps.get(3) != null) {
				xpn.setSuffix((String) comps.get(3));
			}
		}
		if (comps.size() > 4) {
			if (comps.get(4) != null) {
				xpn.setPrefix((String) comps.get(4));
			}
		}
		return xpn;
	}

	/**
	 * Converts a model instance of the XAD type to a HL7v2.5 standard delimited
	 * string.
	 *
	 * @param xad instance of the XAD model
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the delimited String
	 */
	public static String toMessageString(XAD xad, char componentSeparator)
	{
		StringBuffer result = new StringBuffer("");
		if (xad == null) {
			return result.toString();
		}
		// XAD.1.1
		if (xad.getStreetAddress() != null) {
			result.append(xad.getStreetAddress());
		}
		result.append(componentSeparator);
		// XAD.2
		if (xad.getOtherDesignation() != null) {
			result.append(xad.getOtherDesignation());
		}
		result.append(componentSeparator);
		// XAD.3
		if (xad.getCity() != null) {
			result.append(xad.getCity());
		}
		result.append(componentSeparator);
		// XAD.4
		if (xad.getStateOrProvince() != null) {
			result.append(xad.getStateOrProvince());
		}
		result.append(componentSeparator);
		// XAD.5 - not present
		if (xad.getZipOrPostalCode() != null) {
			result.append(xad.getZipOrPostalCode());
		}
		result.append(componentSeparator);
		// XAD.6
		if (xad.getCountry() != null) {
			result.append(xad.getCountry());
		}
		result.append(componentSeparator);
		// XAD.7 - not present
		result.append(componentSeparator);
		// XAD.8 - not present
		result.append(componentSeparator);
		// XAD.9
		if (xad.getCountyParishCode() != null) {
			result.append(xad.getCountyParishCode());
		}
		result.append(componentSeparator);

		HL7V2MessageUtils.trimDelimiters(result, componentSeparator);
		return result.toString();
	}

	/**
	 * Constructs a model instance of the XAD type from the delimited message
	 * string
	 *
	 * @param msg the delimited message string
	 * @param componentSeparator component level separator for message
	 * @param subComponentSeparator component level separato for message
	 * @return the model instance
	 */
	public static XAD buildXADFromMessageString(String msg, char componentSeparator)
	{
		XAD xad = Hl7v2Factory.eINSTANCE.createXAD();
		ArrayList comps = HL7V2MessageUtils.parse(msg, componentSeparator);
		if (comps.size() > 0) {
			if (comps.get(0) != null) {
				xad.setStreetAddress((String) comps.get(0));
			}
		}
		if (comps.size() > 1) {
			if (comps.get(1) != null) {
				xad.setOtherDesignation((String) comps.get(1));
			}
		}
		if (comps.size() > 2) {
			if (comps.get(2) != null) {
				xad.setCity((String) comps.get(2));
			}
		}
		if (comps.size() > 3) {
			if (comps.get(3) != null) {
				xad.setStateOrProvince((String) comps.get(3));
			}
		}
		if (comps.size() > 4) {
			if (comps.get(4) != null) {
				xad.setZipOrPostalCode((String) comps.get(4));
			}
		}
		if (comps.size() > 5) {
			if (comps.get(5) != null) {
				xad.setCountry((String) comps.get(5));
			}
		}
		if (comps.size() > 8) {
			if (comps.get(8) != null) {
				xad.setCountyParishCode((String) comps.get(8));
			}
		}
		return xad;
	}

	//////////////////////////////////////////////////////////////////////////////////////
	// SEK July 26, 2006
	// the below are conversions for the OLD model
	/////////////////////////////////////////////////////////////////////////////////////
/*	public static String toMessageString(MessageType msg, char segmentSeparator, char fieldSeparator, 
			char componentSeparator, char subComponentSeparator){
		
		return null;
	}*/
 /*	public static String toMessageString(SegmentType seg, char fieldSeparator, 
			char componentSeparator, char subComponentSeparator){
		if(!seg.getField().isEmpty()){
			Iterator i = seg.getField().iterator();
			StringBuffer result = new StringBuffer("");
			while(i.hasNext()){
				FieldType field = (FieldType)i.next();
				result.append(toMessageString(field, componentSeparator, subComponentSeparator));
				result.append(fieldSeparator);
			}
			HL7V2MessageUtils.trimDelimiters(result, fieldSeparator, componentSeparator);
			return result.toString();
		}
		else{
			return "" + fieldSeparator;
		}
	}
	
	public static String toMessageString(FieldType field, char componentSeparator, char subComponentSeparator){
		if(!field.getComponent().isEmpty()){
			Iterator i = field.getComponent().iterator();
			StringBuffer result = new StringBuffer("");
			while(i.hasNext()){
				ComponentType comp = (ComponentType)i.next();
				result.append(toMessageString(comp, subComponentSeparator));
				result.append(componentSeparator);
			}
			HL7V2MessageUtils.trimDelimiters(result, componentSeparator);
			return result.toString();
		}
		else{
			return "" + componentSeparator;
		}
	}
	
	public static String toMessageString(ComponentType comp, char subComponentSeparator){
		if(!comp.getComponent().isEmpty()){
			Iterator i = comp.getComponent().iterator();
			StringBuffer result = new StringBuffer("");
			while(i.hasNext()){
				ComponentType subComp = (ComponentType)i.next();
				if(subComp.getValue() == null){
					result.append("");
				}
				else{
					result.append(subComp.getValue());
				}
				result.append(subComponentSeparator);
			}
			HL7V2MessageUtils.trimDelimiters(result, subComponentSeparator);
			return result.toString();
		}
		else if(comp.getValue() != null){
			return comp.getValue();
		}
		else
			return "";
	}
	 */
	// below is needed for now, but I assume that the jiva hl7v2 stack has a factory that does this
	/*	public static MessageType buildFromMessageString(String msg, char segmentSeparator, char fieldSeparator, 
			char componentSeparator, char subComponentSeparator){
		
		return null;
	}*/
 /*	public static SegmentType buildFromMessageString(String msg, char fieldSeparator, 
			char componentSeparator, char subComponentSeparator){
		SegmentType seg = Hl7v2Factory.eINSTANCE.createSegmentType();
		ArrayList comps = HL7V2MessageUtils.parse(msg, fieldSeparator);
		if(comps.size() > 0){
			Iterator i = comps.iterator();
			while(i.hasNext()){
				seg.getField().add(buildFromMessageString((String)i.next(), componentSeparator, subComponentSeparator));
			}
		}
		return seg;

	}
	
	public static FieldType buildFromMessageString(String msg, char componentSeparator, char subComponentSeparator){
		FieldType field = Hl7v2Factory.eINSTANCE.createFieldType();
		ArrayList comps = HL7V2MessageUtils.parse(msg, componentSeparator);
		System.out.println("COMPS:");{
			for (int j = 0 ; j < comps.size();j++){
				System.out.println(comps.get(j));
			}
		}
		if(comps.size() > 0){
			Iterator i = comps.iterator();
			while(i.hasNext()){
				field.getComponent().add(buildFromMessageString((String)i.next(), subComponentSeparator));
			}
		}
		return field;
	}
	
	public static ComponentType buildFromMessageString(String msg, char subComponentSeparator){
		ComponentType comp = Hl7v2Factory.eINSTANCE.createComponentType();
		ArrayList comps = HL7V2MessageUtils.parse(msg, subComponentSeparator);
		if(comps.size() > 1){
			Iterator i = comps.iterator();
			while(i.hasNext()){
				ComponentType subComp = Hl7v2Factory.eINSTANCE.createComponentType();
				subComp.setValue((String)i.next());
				comp.getComponent().add(subComp);
			}
		}
		else if(comps.size() == 1){
			comp.setValue((String)comps.get(0));
		}
		return comp;
	}*/
}
