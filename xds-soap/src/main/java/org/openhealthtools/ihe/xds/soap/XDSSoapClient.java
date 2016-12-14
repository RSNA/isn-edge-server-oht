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

import java.net.URI;
import java.util.List;

import org.apache.axiom.soap.SOAPEnvelope;
import org.openhealthtools.ihe.common.ws.client.IHEAsyncCallbackExt;
import org.openhealthtools.ihe.common.ws.client.IHESOAPResponsePayload;
import org.openhealthtools.ihe.common.ws.client.IHESoapClient;
import org.openhealthtools.ihe.xds.document.XDSDocument;
import org.w3c.dom.Element;


/**
 * Simplifed SOAP sender interface for XDS client side: Document Source and Document Consumer.
 * Designed to support  Transaction ITI-15: Provide and Register Document Set, 
 * Transaction ITI-16: Query Registry and Transaction ITI-17: Retrieve Document and ITI-18: Stored Query
 * Designed to encapsulate the SOAP implementation so that it can be independently
 * determined.
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public interface XDSSoapClient extends IHESoapClient
{
	/**
	 * Constructs the SOAPMessage from the parameters in support of XDS transactions
	 * 
	 * @throws Exception
	 */
    public XDSSOAPResponsePayload send(URI uri, Element request, String action) throws Exception;
	
    // FIXME SEK - don't think this send is needed, given the other two
	public XDSSOAPResponsePayload send(URI uri, Element request, List<XDSDocument> attachments) throws Exception;
	
	public XDSSOAPResponsePayload send(URI uri, Element request, List<XDSDocument> attachments, String action) throws Exception;

	public XDSSOAPResponsePayload processSOAPResponse(XDSAsyncCallback asyncCallback) throws Exception;
	
	public XDSSOAPResponsePayload processSOAPResponse(SOAPEnvelope soapEnvelope) throws Exception;
	
	public XDSAsyncCallback sendAsync(URI uri, Element request, String action) throws Exception;
	
	public XDSAsyncCallback sendAsync(URI uri, Element request, List<XDSDocument> attachments, String action) throws Exception;
}
