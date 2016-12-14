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

import org.apache.axiom.om.OMElement;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFault;
import org.apache.axis2.util.XMLUtils;
import org.apache.log4j.Logger;
import org.openhealthtools.ihe.common.ws.IHESOAP12Sender;
import org.openhealthtools.ihe.common.ws.IHESOAPAttachmentSender;
import org.openhealthtools.ihe.common.ws.IHESOAPSender;
import org.w3c.dom.Element;

/**
 * @author <a href="mailto:venkataraman.sethuraman@sage.com">Venkataraman Sethuraman</a>
 *
 */
public abstract class AbstractIHESoapClient implements IHESoapClient 
{
	/**
	 * 
	 */
	private static final Logger logger = Logger.getLogger(AbstractIHESoapClient.class);

	/**
	 * 
	 */
	protected IHESOAPSender sender;
	
	/**
	 * @param sender
	 */
	public AbstractIHESoapClient(IHESOAPSender sender) 
	{
		this.sender = sender;
	}
	
	protected boolean doSendAction()
	{
		return (sender instanceof IHESOAP12Sender);
	}
	
	public IHESOAPSender getSender()
	{
		return sender;
	}

	public IHESOAPRequestPayload processSOAPRequest(Element request) throws Exception //Sage PIX PDQ V3 Mods
	{
		IHESOAPRequestPayload payload = new IHESOAPRequestPayload();
		// Set the body of the SOAP Message
		OMElement bodyOMElement = XMLUtils.toOM(request);

		// Create SOAP Envelope
		SOAPEnvelope requestEnvelope = sender.createEnvelope();

		// Finalize body for send
		SOAPBody requestBody = requestEnvelope.getBody();
		requestBody.addChild(bodyOMElement);

		if (logger.isDebugEnabled()) {
			logger.debug("SOAP Envelope Set");
		}
		
		payload.setRequestEnvelope(requestEnvelope);
		
		return payload;
	}
	
	public IHESOAPResponsePayload processSOAPResponse(IHEAsyncCallbackExt asyncCallback) throws Exception
	{
		return processSOAPResponse(asyncCallback.getMessageContext().getEnvelope());
	}
	
	public IHESOAPResponsePayload processSOAPResponse(SOAPEnvelope responseEnvelope) throws Exception
	{
		if (logger.isDebugEnabled()) {
			logger.debug("Received SOAP Response");
		}
		// Check to verify the response envelope is not null
		if (null == responseEnvelope) {
			logger.error(IHESoapConstants.NULL_SOAP_ENVELOPE);
			throw new IHESoapClientException(
					IHESoapConstants.NULL_SOAP_ENVELOPE);
		}

		// Verify the response body is not null
		SOAPBody responseBody = responseEnvelope.getBody();
		if (null == responseBody) {
			logger.error(IHESoapConstants.NULL_SOAP_BODY);
			throw new IHESoapClientException(IHESoapConstants.NULL_SOAP_BODY);
		}

		// Get Response Element
		OMElement responseOMElement = responseEnvelope.getBody()
				.getFirstElement();
		if (responseOMElement == null) {
			logger.error(IHESoapConstants.EMPTY_RESPONSE);
			throw new IHESoapClientException(IHESoapConstants.EMPTY_RESPONSE);
		}

		// Check to see if the response body has a SOAP Fault
		if (responseBody.hasFault()) {
			SOAPFault fault = responseBody.getFault();
			logger.error("Received SOAP Fault", fault.getException());
			throw new IHESoapClientException(IHESoapConstants.SOAP_FAULT, fault.getException());
		}

		// Construct the payload response wrapper
		IHESOAPResponsePayload responsePayload = new IHESOAPResponsePayload();
		
		// Message
		Element responseElement = XMLUtils.toDOM(responseOMElement);
		responsePayload.setResponseElement(responseElement);
		
		if (logger.isDebugEnabled()) {
			logger.debug("Ending IHE SOAP Processing");
		}
		
		return responsePayload;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.XDSSoapClient#send(org.w3c.dom.Element, java.net.URI, java.lang.String)
	 */
	public IHESOAPResponsePayload send(URI uri, Element request, String action) throws Exception {	//Sage PIX PDQ V3 Mods	
		if (logger.isDebugEnabled()) {
			logger.debug("Beginning IHE SOAP Send");
		}
		
		// Process request element into a well-formed XDS SOAP Request

		IHESOAPRequestPayload requestPayload = processSOAPRequest(request);

		if (!doSendAction()) {
			action = null;
		}
		
		// Do Send
		SOAPEnvelope responseEnvelope = sender.send(uri, requestPayload.getRequestEnvelope(), action);
		
		// Process the response envelope into a well-formed XDS SOAP Response with attachments
		IHESOAPResponsePayload responsePayload = processSOAPResponse(responseEnvelope);
		
		if (logger.isDebugEnabled()) {
			logger.debug("Ending IHE SOAP Send");
		}
		
		return responsePayload;
	}
	
	public IHEAsyncCallbackExt sendAsync(URI uri, Element request, String action) throws Exception //Sage PIX PDQ V3 Mods
	{
		if (logger.isDebugEnabled()) {
			logger.debug("Beginning IHE SOAP Send");
		}
		
		IHESOAPRequestPayload requestPayload = processSOAPRequest(request); //Sage PIX PDQ V3 Mods

		if (logger.isDebugEnabled()) {
			logger.debug("Preparing to send asynchronous HIE request");
		}
		
		IHEAsyncCallbackExt callback = new IHEAsyncCallbackExt(this);
		
		// Do Send
		sender.sendAsync(uri, requestPayload.getRequestEnvelope(), action, callback); //Sage PIX PDQ V3 Mods
		
		if (logger.isDebugEnabled()) {
			logger.debug("Finishing sending initial asynchronous HIE request.  Returning callback.");
		}
		
		return callback;
	}
	

}
