/*******************************************************************************
 * Copyright (c) 2006,2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.common.ws;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFactory;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.OperationClient;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.Phase;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.wsdl.WSDLConstants;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.log4j.Logger;
import org.openhealthtools.ihe.atna.context.AbstractModuleContext;
import org.openhealthtools.ihe.atna.context.SecurityContext;
import org.openhealthtools.ihe.atna.context.SecurityContextFactory;
import org.openhealthtools.ihe.atna.nodeauth.utils.IHEHTTPSecureSocketFactoryWrapper;
import org.openhealthtools.ihe.atna.nodeauth.utils.IHEHTTPSocketFactoryWrapper;
import org.openhealthtools.ihe.common.ws.async.AsyncListenerManager;
import org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback;
import org.openhealthtools.ihe.common.ws.utils.SOAPUtils;
import org.openhealthtools.ihe.utils.UUID;

/**
 * Abstract sender mechanism for sending SOAP messages for
 * various IHE-specific transaction using the Apache Axis2 constructs.
 * General support now available for SOAP 1.1 and SOAP 1.2
 * as well as attachment support through SOAP with Attachments (SwA) and MTOM.
 * Current support is intended for use with XDS.a, XDS.b, and PIX/PDQ v3.
 * 
 * This sender takes care of socket construction (including TLS), attachment construction
 * XUA handling, WS-Addressing handling, and message serialization/deserialization.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 * 
 */
public abstract class AbstractIHESOAPSender 
implements IHESOAPSender,IHESOAPAttachmentSender 
{

	/**
	 * Log4j Static Logger Instance
	 */
	private static final Logger LOGGER = Logger.getLogger(AbstractIHESOAPSender.class);
	
	
	/**
	 * Flag to indicate that the sender is properly initialized
	 */
	private boolean senderReady = false;

	
	/**
	 * Apache Axis2 client sender mechanism
	 */
	private ServiceClient mSender;

	/**
	 * Apache Axis2 options
	 */
	private Options mOptions;

	/**
	 * SOAP Factory for the respective types
	 */
	private SOAPFactory soapFactory;
	
	/**
	 * 
	 */
	private AsyncListenerManager listenerServerManager;
	
	/**
	 * 
	 */
	private HttpClient httpClient;
	
	////////////////////////////////////////////////
	// Apache HttpCommons Socket Factory Wrappers //
	//  for HTTP and HTTPS Protocol Handling      //
	////////////////////////////////////////////////
	/**
	 * 
	 */
	private static Protocol httpsProtocolHandler;
	
	/**
	 * 
	 */
	private static Protocol httpProtocolHandler;
	static {
		httpsProtocolHandler = new Protocol("https", (IHEHTTPSocketFactoryWrapper)(new IHEHTTPSecureSocketFactoryWrapper()), 443);
		httpProtocolHandler = new Protocol("http", new IHEHTTPSocketFactoryWrapper(), 80);
			
		Protocol.registerProtocol("https", httpsProtocolHandler);
		Protocol.registerProtocol("http", httpProtocolHandler);
	}
	
	
	///////////////////////////////////
	/// Axis2 Phase Handling for XUA //
	///////////////////////////////////
	
	/**
	 * 
	 */
	private static final String XUA_OUT_PHASE_NAME = "XUAOutPhase";
	
	/**
	 * 
	 */
	private static final String XUA_OUT_PHASE_CLASS = "org.openhealthtools.ihe.xua.handlers.axis.XUAOutPhaseHandler";
	
	/**
	 * 
	 */
	private static final String XUA_IN_PHASE_NAME = "XUAInPhase";
	
	/**
	 * 
	 */
	private static final String XUA_IN_PHASE_CLASS = "org.openhealthtools.ihe.xua.handlers.axis.XUAInPhaseHandler";

	/**
	 * 
	 */
	private Phase xuaOutPhase = null;
	/**
	 * 
	 */
	private Phase xuaInPhase = null;
	/**
	 * 
	 */
	private boolean xuaPhasesInstantiated = false;
	

	/**
	 * @throws IHESOAPException
	 */
	protected AbstractIHESOAPSender()
	{
		try {
			mOptions = new Options();
			mOptions.setProperty(AddressingConstants.
					 ADD_MUST_UNDERSTAND_TO_ADDRESSING_HEADERS, Boolean.TRUE); 
			
			// Initialize the Apache Commons HTTP Client
			initializeHttpClient();
			
			// Initialize the Axis2 Attachment cache Directory
			initializeAxis2CacheDirectory();
			
			// Initialize Axis2 Service Sender
			mSender = new ServiceClient();
			mSender.setOptions(mOptions);
			
			//initializeAddressingHandlers();
			
			// We will default to SOAP 1.2
			soapFactory = OMAbstractFactory.getSOAP12Factory();
			
			// Initialize the Asynchronous callback listener manager
			listenerServerManager = new AsyncListenerManager(mSender);
			
			// Set the client ready to go.
			senderReady = true;
			
		} catch (AxisFault af) {
			LOGGER.error("Error initializing the SOAP Sender.", af);
		} catch (Throwable t) {
			LOGGER.error("Error initializing the SOAP Sender.", t);
		}
	}

	public final void setHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
	}
	
	public final ServiceClient getAxisServiceClient() {
		return mSender;
	}

	public final AsyncListenerManager getAsyncListenerManager() {
		return listenerServerManager;
	}

	public final HttpClient getHttpClient() {
		return httpClient;
	}
	

	/**
	 * @return
	 */
	protected boolean isSenderReady()
	{
		return senderReady;
	}
	
	/**
	 * 
	 */
	protected void initializeHttpClient()
	{
		HttpConnectionManager connManager = new MultiThreadedHttpConnectionManager();
		httpClient = new HttpClient(connManager);
		
		DefaultHttpMethodRetryHandler retryhandler = new DefaultHttpMethodRetryHandler(0, true);
		httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, retryhandler);
		
		// Set the HTTP Client instance to use in sending
		// FIXME issue 114
		//this line causing threading issues: mOptions.setProperty(HTTPConstants.REUSE_HTTP_CLIENT, Boolean.TRUE);
		mOptions.setProperty(HTTPConstants.REUSE_HTTP_CLIENT, Boolean.FALSE);
		mOptions.setProperty(HTTPConstants.CACHED_HTTP_CLIENT, httpClient);
	}

	
	protected void initializeAxis2CacheDirectory()
	{
		String axis2OptionDir = (String)mOptions.getProperty(Constants.Configuration.ATTACHMENT_TEMP_DIR);
		String iheTempDir = System.getProperty("ihe.soap.tmpdir");
	
		String[] dirsToCheck = new String[] { iheTempDir, axis2OptionDir};
		
		String newAttachmentPath = SOAPUtils.checkAttachmentTempDirectory(dirsToCheck);
		if (SOAPUtils.isNullOrEmpty(newAttachmentPath)) {
			LOGGER.info("SOAP Attachment caching disabled.");
			mOptions.setProperty(Constants.Configuration.CACHE_ATTACHMENTS,Constants.VALUE_FALSE);

		}else {
			LOGGER.info("SOAP Attachment caching to directory " + newAttachmentPath);
			mOptions.setProperty(Constants.Configuration.CACHE_ATTACHMENTS,Constants.VALUE_TRUE);
			mOptions.setProperty(Constants.Configuration.ATTACHMENT_TEMP_DIR, newAttachmentPath);
			mOptions.setProperty(Constants.Configuration.FILE_SIZE_THRESHOLD, "16000");
		}
		
	}

	/**
	 * @param endpoint
	 * @param envelope
	 * @param action
	 * @param attachments
	 * @return
	 * @throws IHESOAPException
	 * @throws AxisFault
	 */
	private MessageContext prepareMessageContext(URI endpoint, SOAPEnvelope envelope, String action, Map<String,javax.activation.DataHandler> attachments) throws IHESOAPException,AxisFault
	{
		if (null == endpoint || SOAPUtils.isNullOrEmpty(endpoint.toString())) {
			throw new IHESOAPException("No Service Endpoint Defined");
		}
		
		// Create MC
		MessageContext requestMessageContext = new MessageContext();
		requestMessageContext.setEnvelope(envelope);
		requestMessageContext.setOptions(getOptions());
		if (!SOAPUtils.isNullOrEmpty(action)) {
			requestMessageContext.getOptions().setAction(action);
			requestMessageContext.getOptions().setMessageId(UUID.generateURN());
		}
		
		// Cache attachments into MessageContext for SwA sending
		if (null != attachments && attachments.size() > 0) {
			Set<String> attachmentSet = attachments.keySet();
			for (String mapKey : attachmentSet) {
				if (mapKey instanceof String) {
					requestMessageContext.addAttachment((String) mapKey, (javax.activation.DataHandler)attachments.get(mapKey));
				}
			}
			

		} else {
			// FIXME SEK - we should have a beter way of setting these properties at a higher level so we don't have to rely on string matching at this point
			if (action != null && action.contains("RetrieveDocumentSet") ) {
				requestMessageContext.setProperty(Constants.Configuration.ENABLE_MTOM, Constants.VALUE_TRUE);
			} 
			else if (action != null && !action.contains("ProvideAndRegisterDocumentSet-b") ){
				// If no attachments to send, and not P&R-b, reset MIME settings
				requestMessageContext.setProperty(Constants.Configuration.ENABLE_MTOM, Constants.VALUE_FALSE);
				requestMessageContext.setProperty(Constants.Configuration.ENABLE_SWA, Constants.VALUE_FALSE);
			}
		}
		
		// Check if we're to use the HTTP Chunking workaround
		if (useHttpChunking()) {
			requestMessageContext.setProperty(HTTPConstants.CHUNKED, "true");
		} else {
			requestMessageContext.setProperty(HTTPConstants.CHUNKED, "false");
		}
		
		// Set destination endpiont uri
		requestMessageContext.getOptions().setTo(new EndpointReference(endpoint.toString()));
		
		// Push service context into Message Context
		requestMessageContext.setServiceContext(mSender.getServiceContext());
		
		return requestMessageContext;
	}

	/**
	 * Finalizes construction of sockets and sends a SOAP Message over a given ATNA socket.
	 * @throws IHESOAPException
	 */
	private MessageContext executeSend(MessageContext requestMessageContext) throws IHESOAPException 
	{
		try {

			if (null == requestMessageContext) {
				throw new IHESOAPException("A MessageContext must be set before send.");
			}
			
			OperationClient sendClient = mSender.createClient(ServiceClient.ANON_OUT_IN_OP);
			
			
			
			sendClient.addMessageContext(requestMessageContext);
			enableXuaInPhaseFlow(sendClient);
			enableAddressingInPhaseFlow(requestMessageContext, sendClient);
			sendClient.execute(true);

			return sendClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
		} catch (AxisFault af) {
			af.printStackTrace();
			throw new IHESOAPException("A SOAP Fault occurred during message transmission.", af);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IHESOAPException("Error Sending SOAP Message", e);
		} finally {

		}
	}

	/**
	 * @param endpoint
	 * @param requestMessageContext
	 * @param callback
	 * @return
	 * @throws IHESOAPException
	 */
	private IHEAsyncCallback executeSendAsync(URI endpoint, MessageContext requestMessageContext, IHEAsyncCallback callback) throws IHESOAPException 
	{
		try {
			if (null == requestMessageContext) {
				throw new IHESOAPException("A MessageContext must be set before send.");
			}
			
			// If user did not provide their own callback instance, create one
			if (null == callback) {
				callback = new IHEAsyncCallback();
			}
			callback.setEndpointUri(endpoint);
			
			// Create send client
			OperationClient sendClient = mSender.createClient(ServiceClient.ANON_OUT_IN_OP);

			// Assign the proper transport listener to the Message Context
			listenerServerManager.assignAsyncTransportHandlerToMessageContext(sendClient,requestMessageContext,endpoint);

			sendClient.addMessageContext(requestMessageContext);
			enableXuaInPhaseFlow(sendClient);
			enableAddressingInPhaseFlow(requestMessageContext, sendClient);
			
			// Set and enable asynchronous controls
			sendClient.setCallback(callback);
			sendClient.getOptions().setUseSeparateListener(true);
			
			/// Execute non-blocking
			sendClient.execute(false);

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Finished sending asynchronous request.  Returning callback listener.");
			}
		  
			return callback;
		} catch (AxisFault af) {
			af.printStackTrace();
			throw new IHESOAPException("Error Sending SOAP Message.", af);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IHESOAPException("Error Sending SOAP Message", e);
		} finally {

		}
	}
	




	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.IHESOAPSender#sendAsync(java.net.URI, org.apache.axiom.soap.SOAPEnvelope, java.lang.String)
	 */
	public IHEAsyncCallback sendAsync(URI endpoint, SOAPEnvelope envelope, String action) throws IHESOAPException 
	{
		return sendAsync(endpoint,envelope,null,action);
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.IHESOAPSender#sendAsync(java.net.URI, org.apache.axiom.soap.SOAPEnvelope, java.lang.String, org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback)
	 */
	public IHEAsyncCallback sendAsync(URI endpoint, SOAPEnvelope envelope, String action, IHEAsyncCallback callback) throws IHESOAPException 
	{
		return sendAsync(endpoint,envelope,null,action, callback);
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.IHESOAPAttachmentSender#sendAsync(java.net.URI, org.apache.axiom.soap.SOAPEnvelope, java.util.Map, java.lang.String)
	 */
	public IHEAsyncCallback sendAsync(URI endpoint, SOAPEnvelope envelope, Map<String,javax.activation.DataHandler> attachments, String action) throws IHESOAPException 
	{
		return sendAsync(endpoint,envelope,null,action, null);
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.IHESOAPAttachmentSender#sendAsync(java.net.URI, org.apache.axiom.soap.SOAPEnvelope, java.util.Map, java.lang.String, org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback)
	 */
	public IHEAsyncCallback sendAsync(URI endpoint, SOAPEnvelope envelope, Map<String,javax.activation.DataHandler> attachments, String action, IHEAsyncCallback callback) throws IHESOAPException 
	{
		if (!isSenderReady()) {
			throw new IHESOAPException("The SOAP Sender is not ready for send, probably due to an initialization problem.  Please consult logs.");
		}
		try {
			// Prepare message context for sending
			MessageContext requestMessageContext= prepareMessageContext(endpoint, envelope, action, attachments);
			
			// Send MC
			IHEAsyncCallback asyncCallback = executeSendAsync(endpoint,requestMessageContext, callback);
		
			// Return the callback
			return asyncCallback;
		} catch (AxisFault af) {
			
			throw new IHESOAPException("Error sending SOAP Message", af);
		}
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.ihe.common.ws.OHFSOAPAttachmentSender#send(org.apache.axiom.soap.SOAPEnvelope,
	 *      java.util.Map, java.lang.String)
	 */
	public SOAPEnvelope send(URI endpoint, SOAPEnvelope envelope, Map<String,javax.activation.DataHandler> attachments, String action) throws IHESOAPException 
	{
		if (!isSenderReady()) {
			throw new IHESOAPException("The SOAP Sender is not ready for send, probably due to an initialization problem.  Please consult logs.");
		}
		try {
	
			// Prepare message context for sending
			MessageContext requestMessageContext= prepareMessageContext(endpoint, envelope, action, attachments);
	
			// Send MC
			MessageContext responseMessageContext = executeSend(requestMessageContext);
	
			
			SOAPEnvelope responseEnvelope = responseMessageContext.getEnvelope();
	
			return responseEnvelope;
		} catch (AxisFault af) {
			throw new IHESOAPException("Error sending SOAP Message", af);
		}
	}


	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.OHFSOAPAttachmentSender#send(org.apache.axiom.soap.SOAPEnvelope, java.util.Map)
	 */
	public SOAPEnvelope send(URI endpoint, SOAPEnvelope envelope, Map<String,javax.activation.DataHandler> attachments) throws IHESOAPException 
	{
		return send(endpoint,envelope,attachments, null);
	}

	// Accessory Send Methods
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.ihe.common.ws.OHFSOAPSender#send(org.apache.axiom.soap.SOAPEnvelope,
	 *      java.lang.String)
	 */
	public SOAPEnvelope send(URI endpoint, SOAPEnvelope envelope, String action) throws IHESOAPException {
		return send(endpoint,envelope, new HashMap<String,javax.activation.DataHandler>(), action);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.ihe.common.ws.OHFSOAPSender#send(org.apache.axiom.soap.SOAPEnvelope)
	 */
	public SOAPEnvelope send(URI endpoint, SOAPEnvelope envelope) throws IHESOAPException 
	{
		return send(endpoint, envelope, new HashMap<String,javax.activation.DataHandler>(), null);
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.ihe.common.ws.OHFSOAPSender#createEnvelope()
	 */
	public SOAPEnvelope createEnvelope() {
		SOAPEnvelope envelope = soapFactory.createSOAPEnvelope();
		soapFactory.createSOAPBody(envelope);
		soapFactory.createSOAPHeader(envelope);
		envelope.build();
		return envelope;
	}
	
	/**
	 * Gets the SOAP Factory for the given SOAP transport type
	 * @return	The SOAP Factory
	 */
	protected SOAPFactory getSOAPFactory() {
		return soapFactory;
	}
	
	/**
	 * Gets the current Axis2 options
	 * @return	Axis2 sender options and settings
	 */
	protected Options getOptions() {
		return mOptions;
	}

	/**
	 * Sets the Apache Axis2 options and settings
	 * @param options	The options and settings to use
	 */
	protected void setOptions(Options options) {
		mOptions = options;
	}

	/**
	 * Set the SOAP factory to use for creating envelope and parts.
	 * @param factory	The SOAP Factory to use
	 */
	protected void setSOAPFactory(SOAPFactory factory) {
		this.soapFactory = factory;
	}
	
	/**
	 * @return
	 */
	private boolean useHttpChunking()
	{
		String property = System.getProperty("use.http.chunking");
		if (property != null && property.toLowerCase().equals("true")) {
			return true;
		}
		return false;
	}

	
	/**
	 * @param sendClient
	 */
	private void enableXuaInPhaseFlow(OperationClient sendClient)
	{
		try {
			boolean xuaEnabled = false;
			
			SecurityContext securityContext = SecurityContextFactory.getSecurityContext();
			AbstractModuleContext xuaContext = securityContext.getModuleContext("org.openhealthtools.ihe.xua");
			if (null != xuaContext) {
				String xuaEnabledSetting = xuaContext.getConfig().getOption("xua.enabled");
				if (xuaEnabledSetting != null) {
					xuaEnabled = Boolean.valueOf((String)xuaEnabledSetting).booleanValue();
				}
			}
			
			List outFlowPhases = sendClient.getOperationContext().getAxisOperation().getPhasesOutFlow();
			List inFlowPhases = sendClient.getOperationContext().getAxisOperation().getRemainingPhasesInFlow();
	
			if (xuaEnabled) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("XUA enabled for transaction.  Attempting to enable XUA phase handlers.");
				}
							
				if (!xuaPhasesInstantiated) {
					instantiateXUAHandler();
				}
		
				if (xuaOutPhase != null && !outFlowPhases.contains(xuaOutPhase)) {
					outFlowPhases.add(xuaOutPhase);
				}
				
				if (xuaInPhase != null && !inFlowPhases.contains(xuaInPhase)) {
					inFlowPhases.add(xuaInPhase);
				}
			} else {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("XUA disabled for transaction");
				}
				
				if (xuaOutPhase != null && outFlowPhases.contains(xuaOutPhase)) {
					outFlowPhases.remove(xuaOutPhase);
				}
				
				if (xuaInPhase != null && inFlowPhases.contains(xuaInPhase)) {
					inFlowPhases.remove(xuaInPhase);
				}
			}
		} catch (Throwable t) {
			LOGGER.warn("Non-critical attempt to enable XUA failed.  XUA may not be enabled.", t);
		}

	}
	
	/**
	 * Instantiate the Cross-Enterprise
	 */
	private void instantiateXUAHandler()
	{
		// If phases are already instantiated, return
		if (xuaPhasesInstantiated) {
			return;
		}
		
		// Create the XUA OutPhase Handler
		Phase phOut = null;
		try {

			phOut = new Phase(XUA_OUT_PHASE_NAME);
			Class<?> clazz = Class.forName(XUA_OUT_PHASE_CLASS);
			AbstractHandler outHandler = (AbstractHandler)clazz.newInstance();
			phOut.addHandler(outHandler);
			
		} catch (Throwable t) {
			LOGGER.warn("XUA out-phase handler could not be created, XUA outbound message handling not enabled.");
			LOGGER.warn("Exception", t);
		}
		
		xuaOutPhase = phOut;
		
		// Create the XUA InPhase Handler
		Phase phIn = null;
		try {

			phIn = new Phase(XUA_IN_PHASE_NAME);
			Class<?> clazz = Class.forName(XUA_IN_PHASE_CLASS);
			AbstractHandler inHandler = (AbstractHandler)clazz.newInstance();
			phIn.addHandler(inHandler);
			
		} catch (Throwable t) {
			LOGGER.warn("XUA in-phase handler could not be created, XUA inbound message handling not enabled.");
			LOGGER.warn("Exception", t);
		}
		
		xuaInPhase = phIn;
		xuaPhasesInstantiated = true;
	}
	
	
	/**
	 * Sets the Apache Axis2 Addressing Phase Handlers for Inbound and Outbound flows
	 * 
	 * @param ctx Message Context used in transaction (for action)
	 * @param sendClient In/out operation client to add handlers for phases.
	 */
	protected void enableAddressingInPhaseFlow(MessageContext ctx, OperationClient sendClient)
	{
		ctx.setProperty(AddressingConstants.REPLACE_ADDRESSING_HEADERS, Constants.VALUE_FALSE);
		ctx.setProperty(AddressingConstants.INCLUDE_OPTIONAL_HEADERS, Constants.VALUE_TRUE);

		if (SOAPUtils.isNullOrEmpty(ctx.getOptions().getAction())) {
			ctx.setProperty(AddressingConstants.DISABLE_ADDRESSING_FOR_OUT_MESSAGES, Constants.VALUE_TRUE);
		} else {
			ctx.setProperty(AddressingConstants.DISABLE_ADDRESSING_FOR_OUT_MESSAGES, Constants.VALUE_FALSE);
		}
	}
	
	
	
//	private Phase getPhaseFromList(String phaseName, List<Phase> phases)
//	{
//		for (Phase phase : phases) {
//			if (phase.getName().equals(phaseName)) {
//				return phase;
//			}
//		}
//		return null;
//	}
//	private static Handler ADDRESSING_OUT_HANDLER;
//	private static Handler ADDRESSING_IN_HANDLER;
//	private static Handler ADDRESSING_IN_VALIDATION_HANDLER;
//	
//	static 
//	{
//		ADDRESSING_OUT_HANDLER = new org.apache.axis2.handlers.addressing.AddressingOutHandler();
//		
//		ADDRESSING_OUT_HANDLER.getHandlerDesc().setHandler(ADDRESSING_OUT_HANDLER);
//		ADDRESSING_OUT_HANDLER.getHandlerDesc().setName("AddressingOutHandler");
//		
//		
//		ADDRESSING_IN_HANDLER = new org.apache.axis2.handlers.addressing.AddressingInHandler();
//		ADDRESSING_IN_HANDLER.getHandlerDesc().setHandler(ADDRESSING_IN_HANDLER);
//		ADDRESSING_IN_HANDLER.getHandlerDesc().setName("AddressingInHandler");
//		ADDRESSING_IN_HANDLER.getHandlerDesc().getRules().setBefore("AddressingBasedDispatcher");
//		
//		ADDRESSING_IN_VALIDATION_HANDLER = new org.apache.axis2.handlers.addressing.AddressingValidationHandler();
//		ADDRESSING_IN_VALIDATION_HANDLER.getHandlerDesc().setHandler(ADDRESSING_IN_VALIDATION_HANDLER);
//		ADDRESSING_IN_VALIDATION_HANDLER.getHandlerDesc().setName("AddressingValidationHandler");
//		ADDRESSING_IN_VALIDATION_HANDLER.getHandlerDesc().getRules().setAfter("AddressingBasedDispatcher");
//	}
//	
//	private void initializeAddressingHandlers()
//	{	
//		List<Phase> inFlowPhases = mSender.getAxisConfiguration().getInFlowPhases();
//		Phase addressingInPhase = getPhaseFromList("Addressing", inFlowPhases);
//		
//		try {
//			if (addressingInPhase != null) {
//				addressingInPhase.addHandler(ADDRESSING_IN_HANDLER.getHandlerDesc());
//				addressingInPhase.addHandler(ADDRESSING_IN_VALIDATION_HANDLER.getHandlerDesc());
//			} else {
//				LOGGER.warn("Unable to find Axis2 Addressing Inbound phase.  Cannot attach inbound Addressing handlers.  This may cause problems.");
//			}
//		} catch (PhaseException pe) {
//			LOGGER.warn("Exception occurred while attempting to attach Addressing handlers to Axis2 Inbound Addressing Phase.  This may cause problems.");
//			LOGGER.debug(pe);
//		}
//		
//		List<Phase> inFaultFlowPhases = mSender.getAxisConfiguration().getInFlowPhases();
//		Phase addressingInFaultPhase = getPhaseFromList("Addressing", inFlowPhases);
//		
//		try {
//			if (addressingInFaultPhase != null) {
//				addressingInFaultPhase.addHandler(ADDRESSING_IN_HANDLER.getHandlerDesc());
//				addressingInFaultPhase.addHandler(ADDRESSING_IN_VALIDATION_HANDLER.getHandlerDesc());
//			} else {
//				LOGGER.warn("Unable to find Axis2 Addressing Inbound phase.  Cannot attach inbound Addressing handlers.  This may cause problems.");
//			}
//		} catch (PhaseException pe) {
//			LOGGER.warn("Exception occurred while attempting to attach Addressing handlers to Axis2 Inbound Addressing Phase.  This may cause problems.");
//			LOGGER.debug(pe);
//		}
//		
//		List<Phase> outFlowPhases = mSender.getAxisConfiguration().getOutFlowPhases();
//		Phase addressingOutPhase = getPhaseFromList("MessageOut", outFlowPhases);
//		try {
//			if (addressingOutPhase != null) {
//				addressingOutPhase.addHandler(ADDRESSING_OUT_HANDLER.getHandlerDesc());
//			} else {
//				LOGGER.warn("Unable to find Axis2 MessageOut outbound phase.  Cannot attach outbound Addressing handlers.  This may cause problems.");
//			}
//		} catch (PhaseException pe) {
//			LOGGER.warn("Exception occurred while attempting to attach Addressing handlers to Axis2 outbound MessageOut Phase.  This may cause problems.");
//			LOGGER.debug(pe);
//		}
//	}

	/////////////////////////////////////////////
		/// Axis2 Phase Handling for WS-Addressing //
		/////////////////////////////////////////////
	//	/**
	//	 * 
	//	 */
	//	private static HandlerDescription ADDRESSING_OUT_HANDLER = new HandlerDescription("AddressingOutHandler");
	//	
	//	/**
	//	 * 
	//	 */
	//	private static HandlerDescription ADDRESSING_IN_HANDLER = new HandlerDescription("AddressingInHandler");
	//	
	//	/**
	//	 * 
	//	 */
	//	private static HandlerDescription ADDRESSING_IN_VALIDATION_HANDLER = new HandlerDescription("AddressingValidationHandler");	
	//	
	//	/**
	//	 * 
	//	 */
	//	private static final Phase IHE_ADDRESSING_IN_FLOW_PHASE = new Phase("IHEAddressingInFlow");
	//	
	//	/**
	//	 * 
	//	 */
	//	private static final Phase IHE_ADDRESSING_OUT_FLOW_PHASE = new Phase("IHEAddressingOutFlow");
	//	
	//	static {
	//		try {
	//			ADDRESSING_IN_HANDLER.setHandler(new org.apache.axis2.handlers.addressing.AddressingInHandler());
	//			ADDRESSING_IN_VALIDATION_HANDLER.setHandler(new org.apache.axis2.handlers.addressing.AddressingValidationHandler());
	//			ADDRESSING_OUT_HANDLER.setHandler(new org.apache.axis2.handlers.addressing.AddressingOutHandler());
	//			
	//			IHE_ADDRESSING_IN_FLOW_PHASE.addHandler(ADDRESSING_IN_HANDLER);
	//			IHE_ADDRESSING_IN_FLOW_PHASE.addHandler(ADDRESSING_IN_VALIDATION_HANDLER);
	//			IHE_ADDRESSING_OUT_FLOW_PHASE.addHandler(ADDRESSING_OUT_HANDLER);
	//		} catch (Throwable t) {
	//			LOGGER.error("Error creating the IHE Addressing handler phase.", t);
	//		}
	//	}
		

	
	// Deprecated Methods
	
	/**
	 * Calls the WS-Adderssing module to construct and attach the necessary SOAP 
	 * header blocks for WS-Addressing.
	 */
//	private void configureAddressing(String action) throws AxisFault {
//		String messageId = UUID.generateURN();
//		mOptions.setMessageId(messageId);
//		if (!SOAPUtils.isNullOrEmpty(action)) {
//			org.openhealthtools.ihe.common.ws.modules.WSAddressing wsaAddressingModule = new org.openhealthtools.ihe.common.ws.modules.WSAddressing(
//					getAction(), getEndpoint().toString(), messageId);
//			wsaAddressingModule.processOutgoing(requestMessageContext
//					.getEnvelope());
//
//			mOptions.setAction(action);
//			
//			try {
//				mSender.engageModule("addressing-1.3");
//			} catch (Throwable e) {
//				// do nothing
//			}
//			
//		} else {
//			try {
//				mSender.disengageModule("addressing-1.3");
//			} catch (Throwable e) {
//				// do nothing
//			}
//			mOptions.setAction("");
//		}
//	}
	
	
	// Methods for Future Use

	//	
	// protected Element prepareSend(Element element) throws OHFSOAPException
	// {
	// try {
	// OMElement requestOMElement =
	// org.apache.axis2.util.XMLUtils.toOM(element);
	// OMElement responseOMElement = prepareSend(requestOMElement);
	// return org.apache.axis2.util.XMLUtils.toDOM(responseOMElement);
	// } catch (Exception e) {
	// throw new OHFSOAPException("An error occurred while serializing the
	// message for send", e);
	// }
	// }
	//	
	// protected OMElement prepareSend(OMElement element) throws
	// OHFSOAPException
	// {
	// SOAPEnvelope requestEnvelope = soapFactory.createSOAPEnvelope();
	// requestEnvelope.getBody().addChild(element);
	//		
	// SOAPEnvelope responseEnvelope = prepareSend(requestEnvelope);
	//		
	//		return responseEnvelope.getBody().getFirstElement();
	//	}	

}
