/*******************************************************************************
 * Copyright (c) 2008,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds;

import org.openhealthtools.ihe.xds.response.XDSQueryResponseType;
import org.w3c.dom.Element;

/**
 * Interface that represents metadata handlers for XDS Query request
 * and response processing.  
 * @see org.openhealthtools.ihe.xds.XDSMetadataHandler
 */
public interface XDSQueryMetadataHandler
{
	/**
	 * Processes an outgoing XDS transaction's request body instance into a DOM element
	 * representing the payload of the request.
	 * 
	 * @param requestBody Transaction-specific instance for the XDS request
	 * @param refOnly Whether to return references only in the response
	 * @return DOM element representing the the transaction's SOAP body
	 * @throws Exception
	 */
	public Element processRequest(Object requestBody, boolean refOnly) throws Exception;
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.XDSMetadataHandler#processResponse(org.w3c.dom.Element)
	 */
	public XDSQueryResponseType processResponse(XDSQueryResponseType xdsResponse, String sqUUID, Element responsePayload) throws Exception;
}
