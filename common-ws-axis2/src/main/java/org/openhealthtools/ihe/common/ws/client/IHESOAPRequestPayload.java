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

import java.util.Map;

import org.apache.axiom.soap.SOAPEnvelope;

/**
 * Data wrapper for IHE SOAP request payloads.  Contains 
 * the core elements and the list of document attachments.
 * 
 * @author <a href="mailto:venkataraman.sethuraman@sage.com">Venkataraman Sethuraman</a>
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public class IHESOAPRequestPayload
{
	/**
	 * 
	 */
	protected SOAPEnvelope requestEnvelope;
	
	/**
	 * 
	 */
	protected Map<String,javax.activation.DataHandler> requestAttachments;
	
	/**
	 * @return the requestEnvelope
	 */
	public SOAPEnvelope getRequestEnvelope() 
	{
		return requestEnvelope;
	}
	
	/**
	 * @param requestEnvelope the requestEnvelope to set
	 */
	public void setRequestEnvelope(SOAPEnvelope requestEnvelope) 
	{
		this.requestEnvelope = requestEnvelope;
	}
	
	/**
	 * @return the requestAttachments
	 */
	public Map<String, javax.activation.DataHandler> getRequestAttachments() 
	{
		return requestAttachments;
	}
	
	/**
	 * @param requestAttachments the requestAttachments to set
	 */
	public void setRequestAttachments(
			Map<String, javax.activation.DataHandler> requestAttachments) 
	{
		this.requestAttachments = requestAttachments;
	}
}