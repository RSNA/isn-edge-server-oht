/*******************************************************************************
 * Copyright (c) 2006,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds.soap;

import java.util.Map;

import org.openhealthtools.ihe.common.ws.client.IHESOAPResponsePayload;

/**
 * Data wrapper for XDS SOAP response payloads.  Contains 
 * the core elements and the list of document attachments.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class XDSSOAPResponsePayload extends IHESOAPResponsePayload
{
	
	/**
	 * List of attachments received from a response
	 */
	private Map<String,org.openhealthtools.ihe.xds.document.XDSDocument> responseAttachments;
	
	
	/**
	 * @return the responseAttachments
	 */
	public Map<String, org.openhealthtools.ihe.xds.document.XDSDocument> getResponseAttachments() 
	{
		return responseAttachments;
	}
	
	/**
	 * @param responseAttachments the responseAttachments to set
	 */
	public void setResponseAttachments(
			Map<String, org.openhealthtools.ihe.xds.document.XDSDocument> responseAttachments) 
	{
		this.responseAttachments = responseAttachments;
	}
}