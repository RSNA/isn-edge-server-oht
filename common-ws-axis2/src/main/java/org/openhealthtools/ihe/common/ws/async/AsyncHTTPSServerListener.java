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

package org.openhealthtools.ihe.common.ws.async;

import java.net.SocketAddress;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

import org.apache.axis2.AxisFault;
import org.apache.axis2.description.TransportInDescription;
import org.apache.axis2.transport.nhttp.HttpCoreNIOSSLListener;
import org.apache.http.impl.nio.reactor.SSLIOSessionHandler;
import org.apache.http.params.HttpParams;
import org.openhealthtools.ihe.atna.nodeauth.SecurityDomain;
import org.openhealthtools.ihe.common.ws.IHESOAPException;

/**
 * Key/Truststore-sensitive extension of the Apache HttpCore non-blocking IO listener
 * for SSL transactions.  This listener is designed to handle inbound
 * SSL transactions as responses to Apache Axis2 asynchronous callbacks.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class AsyncHTTPSServerListener extends HttpCoreNIOSSLListener 
{
	/**
	 * Security domain containing the key/trust stores that this
	 * SSL listener will use for handshaking.
	 */
	private SecurityDomain domain;
	
	/**
	 * @param domain
	 */
	public AsyncHTTPSServerListener(SecurityDomain domain)
	{
		this.domain = domain;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.axis2.transport.nhttp.HttpCoreNIOSSLListener#getSSLContext(org.apache.axis2.description.TransportInDescription)
	 */
	protected SSLContext getSSLContext(TransportInDescription transportIn) throws AxisFault 
	{
		SSLContext ctx=null;
		
		if (null == domain) {
			throw AxisFault.makeFault(new IHESOAPException("No security domain defined, cannot start asynchronous SSL listener"));
		}
		
		// Attempt to get an instance of TLS v1
		try {
			ctx = SSLContext.getInstance("TLSv1");
		} catch (NoSuchAlgorithmException e) {
			throw AxisFault.makeFault(e);
		}

		// Initialize the instance for the key and trust stores
		try {
			ctx.init(domain.getKeyManagers(),domain.getTrustManagers(), null);
		} catch (KeyManagementException e) {
			throw AxisFault.makeFault(e);
		}
		
		return ctx;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.axis2.transport.nhttp.HttpCoreNIOSSLListener#getSSLIOSessionHandler(org.apache.axis2.description.TransportInDescription)
	 */
	protected SSLIOSessionHandler getSSLIOSessionHandler(
			TransportInDescription transportIn) throws AxisFault {

        return new SSLIOSessionHandler() {

            public void initalize(SSLEngine sslengine, HttpParams params) {
            	sslengine.setWantClientAuth(true);
            	sslengine.setNeedClientAuth(true);
            }

            public void verify(SocketAddress removeAddress, SSLSession session)
                throws SSLException {}
        };
	}
}
