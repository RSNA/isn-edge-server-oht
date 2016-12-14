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
import java.util.Map;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFault;
import org.apache.axis2.util.XMLUtils;
import org.apache.log4j.Logger;
import org.openhealthtools.ihe.common.ws.IHESOAP12Sender;
import org.openhealthtools.ihe.common.ws.IHESOAPAttachmentSender;
import org.openhealthtools.ihe.common.ws.IHESOAPSender;
import org.openhealthtools.ihe.common.ws.client.AbstractIHESoapClient;
import org.openhealthtools.ihe.common.ws.client.IHESOAPResponsePayload;
import org.openhealthtools.ihe.xds.document.XDSDocument;
import org.w3c.dom.Element;

/**
 * SOAP processing for XDS transactions which includes MTOM and SOAP with attachments
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public abstract class AbstractXDSSoapClient extends AbstractIHESoapClient implements XDSSoapClient 
{
	/**
	 * 
	 */
	private static final Logger logger = Logger.getLogger(AbstractXDSSoapClient.class);

	/**
	 * 
	 */
	//private IHESOAPAttachmentSender sender;
	
	/**
	 * @param sender
	 */
	public AbstractXDSSoapClient(IHESOAPAttachmentSender sender) 
	{
		super(sender);
		//this.sender = sender;
	}
	
	protected boolean doSendAction()
	{
		return (sender instanceof IHESOAP12Sender);
	}

	/**
	 * @param body
	 * @param attachments
	 * @return
	 * @throws Exception
	 */
	protected abstract Map<String,javax.activation.DataHandler> buildRequestAttachments(OMElement body, List<XDSDocument> attachments) throws Exception;

	/**
	 * @param body
	 * @param returnOnlyRegistryResponse
	 * @return
	 * @throws Exception
	 */
	protected abstract OMElement buildResponseAttachments(XDSSOAPResponsePayload responsePayload, OMElement body, boolean returnOnlyRegistryResponse) throws Exception;

	
	public XDSSOAPRequestPayload processSOAPRequest(Element request, List<XDSDocument> attachments) throws Exception
	{
		XDSSOAPRequestPayload payload = new XDSSOAPRequestPayload();
		// Set the body of the SOAP Message
		OMElement bodyOMElement = XMLUtils.toOM(request);

		// Cache attachments into map
		Map<String,javax.activation.DataHandler> attachmentMap = buildRequestAttachments(bodyOMElement, attachments);

		// We have a response with content. Serialize content to be human
		// readable
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		bodyOMElement.serialize(baos);
//		String serializedRequestBody = baos.toString();
//		if (logger.isDebugEnabled()) {
//			logger.debug("****** SOAP REQUEST BODY ******");
//			logger.debug(serializedRequestBody);
//			logger.debug("********************************");
//		}

		// Create SOAP Envelope
		SOAPEnvelope requestEnvelope = sender.createEnvelope();

		// Finalize body for send
		SOAPBody requestBody = requestEnvelope.getBody();
		requestBody.addChild(bodyOMElement);

		if (logger.isDebugEnabled()) {
			logger.debug("SOAP Envelope Set");
		}
		
		payload.setRequestEnvelope(requestEnvelope);
		payload.setRequestAttachments(attachmentMap);
		
		return payload;
	}
	
	public XDSSOAPResponsePayload processSOAPResponse(XDSAsyncCallback asyncCallback) throws Exception
	{
		return processSOAPResponse(asyncCallback.getMessageContext().getEnvelope());
	}
	
	public XDSSOAPResponsePayload processSOAPResponse(SOAPEnvelope responseEnvelope) throws Exception
	{
		if (logger.isDebugEnabled()) {
			logger.debug("Received SOAP Response");
		}
		// Check to verify the response envelope is not null
		if (null == responseEnvelope) {
			logger.error(XDSSoapConstants.NULL_SOAP_ENVELOPE);
			throw new XDSSoapClientException(
					XDSSoapConstants.NULL_SOAP_ENVELOPE);
		}

		// Verify the response body is not null
		SOAPBody responseBody = responseEnvelope.getBody();
		if (null == responseBody) {
			logger.error(XDSSoapConstants.NULL_SOAP_BODY);
			throw new XDSSoapClientException(XDSSoapConstants.NULL_SOAP_BODY);
		}

		// Get Response Element
		OMElement responseOMElement = responseEnvelope.getBody()
				.getFirstElement();
		if (responseOMElement == null) {
			logger.error(XDSSoapConstants.EMPTY_RESPONSE);
			throw new XDSSoapClientException(XDSSoapConstants.EMPTY_RESPONSE);
		}

		// Serialize response content to be human readable
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		responseOMElement.serialize(baos);
//		String serializedResponseBody = baos.toString();
//
//		if (logger.isDebugEnabled()) {
//			logger.debug("****** SOAP RESPONSE BODY ******");
//			logger.debug(serializedResponseBody);
//			logger.debug("********************************");
//		}

		// Check to see if the response body has a SOAP Fault
		if (responseBody.hasFault()) {
			SOAPFault fault = responseBody.getFault();
			logger.error("Received SOAP Fault", fault.getException());
			throw new XDSSoapClientException(XDSSoapConstants.SOAP_FAULT, fault.getException());
		}

		// Construct the payload response wrapper
		XDSSOAPResponsePayload responsePayload = new XDSSOAPResponsePayload();
		
		// Build attachment list from response
		responseOMElement = buildResponseAttachments(responsePayload, responseOMElement, true);

		// Message
		Element responseElement = XMLUtils.toDOM(responseOMElement);
		responsePayload.setResponseElement(responseElement);
		
		if (logger.isDebugEnabled()) {
			logger.debug("Ending XDS SOAP Processing");
		}
		
		return responsePayload;
	}
	
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.XDSSoapClient#send(org.w3c.dom.Element, java.net.URI, java.lang.String)
	 */
	public XDSSOAPResponsePayload send(URI uri, Element request, String action) throws Exception 
	{
		return send(uri, request, null, action);
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.XDSSoapClient#send(org.w3c.dom.Element, java.util.List, java.net.URI)
	 */
	public XDSSOAPResponsePayload send(URI uri, Element request, List<XDSDocument> attachments) throws Exception 
	{
		return send(uri, request, attachments, null);
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.XDSSoapClient#send(org.w3c.dom.Element, java.util.List, java.net.URI, java.lang.String)
	 */
	public XDSSOAPResponsePayload send(URI uri, Element request, List<XDSDocument> attachments, String action) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Beginning XDS SOAP Send");
		}
		
		// Process request element into a well-formed XDS SOAP Request
		XDSSOAPRequestPayload requestPayload = processSOAPRequest(request, attachments);

		if (!doSendAction()) {
			action = null;
		}
		
		// Do Send
		// FIXME SEK - The only thing I don't like about this ... the cast
		SOAPEnvelope responseEnvelope = ((IHESOAPAttachmentSender)sender).send(uri, requestPayload.getRequestEnvelope(), requestPayload.getRequestAttachments(), action);
		
		// Process the response envelope into a well-formed XDS SOAP Response with attachments
		XDSSOAPResponsePayload responsePayload = processSOAPResponse(responseEnvelope);
		
		if (logger.isDebugEnabled()) {
			logger.debug("Ending XDS SOAP Send");
		}
		
		return responsePayload;
	}
	
	public XDSAsyncCallback sendAsync(URI uri, Element request, String action) throws Exception
	{
		return sendAsync(uri, request, null, action);
	}
	
	public XDSAsyncCallback sendAsync(URI uri, Element request, List<XDSDocument> attachments, String action) throws Exception
	{
		if (logger.isDebugEnabled()) {
			logger.debug("Beginning XDS SOAP Send");
		}
		
		XDSSOAPRequestPayload requestPayload = processSOAPRequest(request, attachments);

		if (logger.isDebugEnabled()) {
			logger.debug("Preparing to send asynchronous XDS request");
		}
		
		XDSAsyncCallback callback = new XDSAsyncCallback(this);
		
		// Do Send
		// FIXME SEK - The only thing I don't like about this ... the cast
		((IHESOAPAttachmentSender)sender).sendAsync(uri, requestPayload.getRequestEnvelope(), requestPayload.getRequestAttachments(), action, callback);
		
		if (logger.isDebugEnabled()) {
			logger.debug("Finishing sending initial asynchronous XDS request.  Returning callback.");
		}
		
		return callback;
	}
	

}
