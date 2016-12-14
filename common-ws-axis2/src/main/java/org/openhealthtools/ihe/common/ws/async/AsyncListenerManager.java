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

package org.openhealthtools.ihe.common.ws.async;

import java.net.ServerSocket;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.OperationClient;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.description.Parameter;
import org.apache.axis2.description.TransportInDescription;
import org.apache.axis2.engine.ListenerManager;
import org.apache.axis2.transport.TransportListener;
import org.apache.axis2.transport.http.SimpleHTTPServer;
import org.apache.log4j.Logger;
import org.openhealthtools.ihe.atna.nodeauth.NoSecurityDomainException;
import org.openhealthtools.ihe.atna.nodeauth.SecurityDomain;
import org.openhealthtools.ihe.atna.nodeauth.context.NodeAuthModuleContext;
import org.openhealthtools.ihe.common.ws.IHESOAPException;

/**
 * 
 * Listening manager for creating and destroying asynchronous callback listeners
 * built-in to Axis2.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class AsyncListenerManager 
{
	private static final Logger LOGGER = Logger.getLogger(AsyncListenerManager.class);
	
	private static final String DEFAULT_TRANSPORT_NAME = "oht-ihe-http";
	
	private static final String DEFAULT_SECURE_TRANSPORT_NAME = DEFAULT_TRANSPORT_NAME + "s";
	
	private static final int DEFAULT_LISTENER_PORT_MIN = 26100;
	
	private static final int DEFAULT_LISTENER_PORT_MAX = 26200;
	
	private NodeAuthModuleContext NA_MODULE_CONTEXT = NodeAuthModuleContext.getContext();

	private final ServiceClient mSender;
	
	private int minListenerPort = DEFAULT_LISTENER_PORT_MIN;
	
	private int maxListenerPort = DEFAULT_LISTENER_PORT_MAX;
	
	private int lastListenerPort = minListenerPort;
	
	private boolean requestNonTlsResponse = false;

	private String replyToHostName = null;
	
	private int replyToPort = -1;
	
	/**
	 * @param sender
	 */
	public AsyncListenerManager(ServiceClient sender)
	{
		mSender = sender;
	}
	
	/**
	 * @param minPort
	 * @param maxPort
	 */
	public void setListenerPortRange(int minPort, int maxPort)
	{
		if (minPort < 0 || maxPort < 0) {
			throw new RuntimeException("Minimum and maximum port ranges must be positive integers");
		}
		if (minPort > maxPort) {
			throw new RuntimeException("Minimum port must be an integer value less than maximum port");
		}
		minListenerPort = minPort;
		maxListenerPort = maxPort;
	}

	/**
	 * @return
	 */
	public String getReplyToHostName() {
		return replyToHostName;
	}

	/**
	 * @param replyToHostName
	 */
	public void setReplyToHostName(String replyToHostName) {
		this.replyToHostName = replyToHostName;
	}

	/**
	 * @return
	 */
	public int getReplyToPort() {
		return replyToPort;
	}

	/**
	 * @param replyToPort
	 */
	public void setReplyToPort(int replyToPort) {
		this.replyToPort = replyToPort;
	}

	
	
	/**
	 * @param port
	 * @return
	 */
	private boolean isPortInRange(int port)
	{
		return (port >= minListenerPort && port <= maxListenerPort);
	}

	
	/**
	 * @return
	 * @throws IHESOAPException
	 */
	private synchronized int getNextValidPort() throws IHESOAPException
	{
		while (true) {
			int listenerPort = lastListenerPort++;
			if (!isPortInRange(listenerPort)) {
				throw new IHESOAPException("The HTTP server for asynchronous responses was unable to bind any port in specified range.");
			}
			try {
				ServerSocket serversocket = new ServerSocket(listenerPort);
				serversocket.close();
				return listenerPort;
			} catch (Exception e) {
				LOGGER.warn("Unable to open listener on TCP port " + listenerPort, e);
			}
		}
	}
	

	
	/**
	 * @param domain
	 * @return
	 */
	private String getTransportNameForDomain(SecurityDomain domain)
	{
		return DEFAULT_SECURE_TRANSPORT_NAME + "-" + Integer.toHexString(domain.hashCode());
	}
	
	/**
	 * @param endpoint
	 * @return
	 */
	private boolean isUsingTLS(URI endpoint)
	{
		boolean useTLS = false;
		if (!requestNonTlsResponse && (NA_MODULE_CONTEXT != null && NA_MODULE_CONTEXT.isTLSEnabled())) {
			useTLS = "https".equals(endpoint.getScheme());
		}
		return useTLS;
	}
	
	
	/**
	 * @param transportName
	 * @return
	 */
	private TransportInDescription getTransportIn(String transportName)
	{
		return mSender.getAxisConfiguration().getTransportIn(transportName);
	}
	
	/**
	 * @return
	 */
	private TransportInDescription getDefaultTransportIn()
	{
		return getTransportIn(DEFAULT_TRANSPORT_NAME);
	}
	
	/**
	 * @param domain
	 * @return
	 */
	private TransportInDescription getSecureTransportInForDomain(SecurityDomain domain)
	{
		if (null == domain) {
			return null;
		}
		return getTransportIn(getTransportNameForDomain(domain));
	}
	
	/**
	 * @param cfgCtx
	 * @throws AxisFault
	 */
	private void initializeDefaultTransportIn(ConfigurationContext cfgCtx) throws AxisFault, IHESOAPException
	{
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Initializing the default HTTP transport listener.");
		}
		SimpleHTTPServer transportClass = new org.apache.axis2.transport.http.SimpleHTTPServer();
		while (!transportClass.isRunning()) {
			LOGGER.debug("Not runnign yet..tryign again on a new port");
			initializeTransportListener(DEFAULT_TRANSPORT_NAME, transportClass, cfgCtx);
		}
	}
	
	/**
	 * @param securityDomain
	 * @param cfgCtx
	 * @throws AxisFault
	 */
	private void initializeSecureTransportIn(SecurityDomain securityDomain, ConfigurationContext cfgCtx) throws AxisFault, IHESOAPException
	{
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Initializing the secure HTTP transport listener for security domain " + securityDomain.getName());
		}
		TransportListener transportClass = new AsyncHTTPSServerListener(securityDomain);
		initializeTransportListener(getTransportNameForDomain(securityDomain), transportClass, cfgCtx);
	}
	
	/**
	 * @param transportName
	 * @param listenerClass
	 * @param cfgCtx
	 * @throws AxisFault
	 */
	private synchronized void initializeTransportListener(String transportName, TransportListener listenerClass, ConfigurationContext cfgCtx) throws AxisFault, IHESOAPException
	{
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Initializing the transport listener "+ transportName +" with listener class " + listenerClass.getClass().getName());
		}
		TransportInDescription httpTransportIn = new TransportInDescription(transportName);
		httpTransportIn.addParameter(new Parameter("port", String.valueOf(getNextValidPort())));
		httpTransportIn.setReceiver(listenerClass);
		
		ListenerManager listenerManager = cfgCtx.getListenerManager();
		if (!listenerManager.isListenerRunning(httpTransportIn.getName())) {
			listenerManager.addListener(httpTransportIn, false);
		}
	}
	
	/**
	 * Assigns the proper Axis Inbound Transport Handler to the Message Context for the 
	 * given security context.  
	 * 
	 * @param sendClient
	 * @param mc
	 * @param endpoint
	 * @throws IHESOAPException
	 */
	public void assignAsyncTransportHandlerToMessageContext(OperationClient sendClient, MessageContext mc, URI endpoint) throws IHESOAPException
	{
		ConfigurationContext cfgCtx = sendClient.getOperationContext().getConfigurationContext();
		TransportInDescription inTransport = null;
		
		if (isUsingTLS(endpoint)) {
			try {
				SecurityDomain securityDomain = NA_MODULE_CONTEXT.getSecurityDomainManager().getSecurityDomain(endpoint.getHost(), endpoint.getPort());
				inTransport = getSecureTransportInForDomain(securityDomain);
			
				if (null == inTransport) {
					try {
						initializeSecureTransportIn(securityDomain,cfgCtx);
					} catch (AxisFault af) {
						String errorMsg = "Error initializing the secure HTTP transport listener for Security Domain + " + securityDomain.getName();
						LOGGER.error(errorMsg, af);
						throw new IHESOAPException(errorMsg, af);
					} 
				}
				
				inTransport = getSecureTransportInForDomain(securityDomain);
			} catch (URISyntaxException e) {
				String errorMsg = "Error initializing the secure HTTP transport listener.  The endpoint URI specified is invalid.";
				LOGGER.error(errorMsg, e);
				throw new IHESOAPException(errorMsg, e);
			} catch (NoSecurityDomainException e) {
				String errorMsg = "Error initializing the secure HTTP transport listener.  No Security Domain for the endpoint is registered";
				LOGGER.error(errorMsg, e);
				throw new IHESOAPException(errorMsg, e);
			}
			
		} else {
			inTransport = getDefaultTransportIn();
			
			if (null == inTransport) {
				try {
					initializeDefaultTransportIn(cfgCtx);
				} catch (AxisFault af) {
					String errorMsg = "Error initializing the default HTTP transport listener.";
					LOGGER.error(errorMsg, af);
					throw new IHESOAPException(errorMsg, af);
				}
			}
			inTransport = getDefaultTransportIn();
		}
		
		if (null == inTransport) {
			String errorMsg = "Unable to initialize the default HTTP transport listener.";
			LOGGER.error(errorMsg);
			throw new IHESOAPException(errorMsg);
		}
		mc.setTransportIn(inTransport);
		
		setWsAddressingReplyToAddress(mc, sendClient);
	}
	
	private void setWsAddressingReplyToAddress(MessageContext mc, OperationClient sendClient)
	{
		String serviceName = mSender.getServiceContext().getAxisService().getName();
		String operationName = sendClient.getOperationContext().getAxisOperation().getName().getLocalPart();
		String transportName = mc.getTransportIn().getName();
		
		try {
			EndpointReference replyToFromTransport =
				mc.getConfigurationContext().getListenerManager().getEPRforService(
						serviceName,
						operationName, 
						transportName );
			
			URI endpointUri = new URI(replyToFromTransport.getAddress());
			URI newReplyToUri = new URI(
					endpointUri.getScheme(),
					endpointUri.getUserInfo(),
					endpointUri.getHost(),
					endpointUri.getPort(),
					endpointUri.getPath(), 
					endpointUri.getQuery(), 
					endpointUri.getFragment());
			
			mc.setFaultTo(new EndpointReference(newReplyToUri.toString()));
			mc.setReplyTo(new EndpointReference(newReplyToUri.toString()));
		} catch (Exception e) {
			LOGGER.warn("Unable to manipulate the ReplyTo URI.  The response may not be received.",e);
		}
	}
}
