/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * $Id: SecureTCPPort.java,v 1.3 2007/02/08 17:41:34 srenly Exp $
 */
package org.openhealthtools.ihe.common.mllp;


public class SecureTCPPort extends TCPPort {
    
	/**
	 * Key store name.
	 */
	private String keyStoreName;
	
	/**
	 * Key store password.
	 */
	private String keyStorePassword;
	
	/**
	 * Trust store name.
	 */
	private String trustStoreName;
	
	/**
	 * Trust store password.
	 */
	private String trustStorePassword;
	
	/**
	 * Boolean client authentication needed.
	 */
	private boolean isClientAuthNeeded;
	
	/**
	 * Secure TCP protocol.
	 */
	private String protocol;
	
	/**
	 * Secure TCP provider name.
	 */
	private String sslProviderName;
	
	/**
	 * Secure TCP provider class.
	 */
	private String sslProviderClass;
	
	
	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
	public SecureTCPPort() {
		super();
	}
	
	////////////////////
	// PUBLIC METHODS //
	////////////////////  
	
	/**
	 * Return the key store name.
	 * @return store name
	 */
    public String getKeyStoreName() {
    	return this.keyStoreName;
    }

    /**
     * Set the key store name.
     * @param value
     */
    public void setKeyStoreName(String value) {
    	this.keyStoreName = value;
    }
    
    /**
     * Return the key store password.
     * @return key store password
     */
    public String getKeyStorePassword() {
    	return this.keyStorePassword;
    }
    
    /**
     * Set the key store password.
     * @param value
     */
    public void setKeyStorePassword(String value) {
    	this.keyStorePassword = value;
    }

    /**
     * Return the trust store name.
     * @return store name
     */
    public String getTrustStoreName() {
    	return this.trustStoreName;
    }

    /**
     * Set the trust store name.
     * @param value
     */
    public void setTrustStoreName(String value) {
    	this.trustStoreName = value;
    }
    
    /**
     * Return the trust store password.
     * @return store password
     */
    public String getTrustStorePassword() {
    	return this.trustStorePassword;
    }
    
    /**
     * Set the trust store password.
     * @param value
     */
    public void setTrustStorePassword(String value) {
    	this.trustStorePassword = value;
    }

    /**
     * Return whether or not client authentication is needed.
     * @return boolean
     */
    public boolean isClientAuthNeeded() {
    	return this.isClientAuthNeeded;
    }

    /**
     * Set whether or not client authentication is needed.
     * @param value
     */
    public void setClientAuthNeeded(boolean value) {
    	this.isClientAuthNeeded = value;
    }

    /**
     * Return the secure tcp protocol.
     * @return protocol
     */
    public String getProtocol() {
    	return this.protocol;
    }

    /**
     * Set the secure tcp protocol.
     * @param value
     */
    public void setProtocol(String value) {
    	this.protocol = value;
    }

    /**
     * Return the secure tcp ssl provider name.
     * @return provider name
     */
    public String getSslProviderName() {
    	return this.sslProviderName;
    }

    /**
     * Set the secure tcp ssl provider name.
     * @param value
     */
    public void setSslProviderName(String value) {
    	this.sslProviderName = value;
    }

    /**
     * Return the secure tcp ssl provider class.
     * @return provider class
     */
    public String getSslProviderClass() {
    	return this.sslProviderClass;
    }

    /**
     * Set the secure tcp ssl provider class.
     * @param value
     */
    public void setSslProviderClass(String value) {
    	this.sslProviderClass = value;
    }

}
