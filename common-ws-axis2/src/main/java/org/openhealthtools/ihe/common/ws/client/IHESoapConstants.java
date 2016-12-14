/*******************************************************************************
 * Copyright (c) 2009 Sage Software, Inc. and its affiliated entities.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sage - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.common.ws.client;

/**
 * @author <a href="mailto:venkataraman.sethuraman@sage.com">Venkataraman Sethuraman</a>
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public class IHESoapConstants 
{
	
	/**
	 * Indicator that the SOAP Fault has occurred.
	 * 	 */
	public static final String SOAP_FAULT = "SOAP FAULT";
	
	/**
	 * Indicator that no SOAP Message was returned to the client
	 */
	public static final String NULL_SOAP = "NO REPLY SOAP MESSAGE WAS RECIEVED";
	
	/**
	 * Indicator that the SOAP Message returnd to the client had a null SOAP part
	 */
	public static final String NULL_SOAP_PART = "NULL SOAP PART";
	
	/**
	 * Indicator that the SOAP Message returnd to the client had a null SOAP envelope
	 */
	public static final String NULL_SOAP_ENVELOPE = "NULL SOAP ENVELOPE";
	
	/**
	 * Indicator that the SOAP Message returnd to the client had a null SOAP body
	 */
	public static final String NULL_SOAP_BODY = "NULL SOAP BODY";
	
	/**
	 * Indicator that the SOAP Message returnd to the client had no payload within the SOAP Body
	 */
	public static final String EMPTY_RESPONSE = "NO PAYLOAD WITHIN SOAP BODY. EMPTY RESPONSE.";
	
}
