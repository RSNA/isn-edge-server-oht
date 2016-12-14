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

import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.w3c.dom.Element;

/**
 * Interface to represent metadata handlers to process outgoing requests
 * and the corresponding inbound responses for IHE XDS transactions.<br />
 * <br />
 * The implementations of this interface are used to handle specific
 * XDS transactions, such as Provide And Register Document Set,
 * Registry Stored Query, Retrieve Document Set, etc.<br />
 * <br />
 * Each metadata handler implementation must perform the following::<br />
 * 
 *  - For outgoing requests, a transaction-specific object will be transformed 
 *    into a DOM element representing the transaction's request payload in ebXML.<br />
 *  - For incoming responses, a DOM element will be processed
 *    and transformed into an transaction-specific instance of XDSResponseType.
 *
 */
public interface XDSMetadataHandler 
{
	/**
	 * Processes an outgoing XDS transaction's request body instance into a DOM element
	 * representing the payload of the request.
	 * 
	 * @param requestBody Transaction-specific instance for the XDS request
	 * @return DOM element representing the the transaction's SOAP body
	 * @throws Exception
	 */
	public Element processRequest(Object requestBody) throws Exception;
	
	/**
	 * Processes an incoming XDS transaction's response body (DOM element from the SOAP Body) 
	 * into a XDS Response instance.
	 * 
	 * @param responsePayload DOM element representing the response's SOAP Body
	 * @return Transaction-specific XDS Response Type instance
	 * @throws Exception
	 */
	public XDSResponseType processResponse(XDSResponseType xdsResponse, Element responsePayload) throws Exception;
}
