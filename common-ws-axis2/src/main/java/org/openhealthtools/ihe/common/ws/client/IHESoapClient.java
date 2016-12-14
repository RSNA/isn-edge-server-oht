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

import java.net.URI;
import java.util.List;

import org.apache.axiom.soap.SOAPEnvelope;
import org.openhealthtools.ihe.common.ws.IHESOAPSender;
import org.w3c.dom.Element;


/**
 * Simplifed SOAP sender interface for IHE client side. Attachments or MTOM support needs to be
 * implemented via extensions to this interface
 * Designed to encapsulate the SOAP implementation so that it can be independently
 * determined.
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public interface IHESoapClient 
{
	/**
	 * Constructs the SOAPMessage from the parameters, sends the 
	 * messages to the designated url and processes the response SOAPMessage. Extensions are necessary to support 
	 * attachments or MTOM.
	 * 
	 * @param uri the end URI destination of the SOAPMessage. This entity is assumed to have a SOAP interface
	 * and is able to generate a SOAPMessage in response.
	 * 
	 * @return It is assumed that the SOAPMessage recieved in response will be contained as part
	 * of the SOAPBody. The contents of the SOAPBody are returned to the Source or Consumer 
	 * as a response element further processing.
	 * 
	 * @throws Exception
	 */
	
    public IHESOAPResponsePayload send(URI uri,  Element request, String action) throws Exception;
	
	public IHESOAPResponsePayload processSOAPResponse(IHEAsyncCallbackExt asyncCallback) throws Exception;
	
	public IHESOAPResponsePayload processSOAPResponse(SOAPEnvelope soapEnvelope) throws Exception;
	
	public IHEAsyncCallbackExt sendAsync(URI uri, Element request, String action) throws Exception;

	public IHESOAPSender getSender();
}
