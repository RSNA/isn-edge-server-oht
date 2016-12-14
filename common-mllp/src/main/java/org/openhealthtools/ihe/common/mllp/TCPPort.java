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

package org.openhealthtools.ihe.common.mllp;


public class TCPPort {
    
	
	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * TCP port host.
	 */
	private String tcpHost;
	
	/**
	 * TCP port number.
	 */
	private int tcpPort;
	
	/**
	 * TCP pre-message character sequence.
	 */
	private char[] startHex;
	
	/**
	 * TCP post-message character sequence.
	 */
	private char[] endHex;
	
	/**
	 * Maximum number of errors allowed before termination.
	 */
	private int maxSocketErrorCount = 20;
	
	/**
	 * Maximum ms allowed before termination.
	 */
	private int connTimeoutMS = 3000;
	
	/**
	 * TCP buffer size.
	 */
	private int bufferSize = 4096;
	
	/**
	 * Maximum ms allowed before termination.
	 */
	private int socketTimeoutMS;
	
	
	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
	/**
	 * Create a new TCP port.
	 */
	public TCPPort() {
		
	}
	
	
	////////////////////
	// PUBLIC METHODS //
	////////////////////   
	
	/**
	 * Return the TCP host.
	 * @return host
	 */
    public String getTcpHost() {
    	return this.tcpHost;
    }

    /***
     * Set the TCP host.
     * @param value
     */
    public void setTcpHost(String value) {
    	this.tcpHost = value;
    }

    /**
     * Return the TCP port.
     * @return port
     */
    public int getTcpPort() {
    	return this.tcpPort;
    }

    /**
     * Set the TCP port.
     * @param value
     */
    public void setTcpPort(int value) {
    	this.tcpPort = value;
    }

    /**
     * Return the pre-message character sequence.
     * @return sHex
     */
    public char[] getStartHex() {
    	return startHex;
    }

    /**
     * Set the pre-message character sequence.
     * @param value
     */
    public void setStartHex(char[] value) {
    	this.startHex = value;
    }

    /**
     * Return the post-message character sequence.
     * @return eHex
     */
    public char[] getEndHex() {
    	return this.endHex;
    }

    /**
     * Set the post-message character sequence.
     * @param value
     */
    public void setEndHex(char[] value) {
    	this.endHex = value;
    }

    /**
     * Return the max socket error count.
     * @return max errors
     */
    public int getMaxSocketErrorCount() {
    	return maxSocketErrorCount;
    }

    /**
     * Set the max socket error count.
     * @param value
     */
    public void setMaxSocketErrorCount(int value) {
    	this.maxSocketErrorCount = value;
    }

    /**
     * Return the connection time out (ms).
     * @return ms
     */
    public int getConnTimeoutMS() {
    	return this.connTimeoutMS;
    }

    /**
     * Set the connection time out (ms).
     * @param value
     */
    public void setConnTimeoutMS(int value) {
    	this.connTimeoutMS = value;
    }

    /**
     * Return the max buffer size.
     * @return size
     */
    public int getBufferSize() {
    	return this.bufferSize;
    }

    /**
     * Set the max buffer size.
     * @param value
     */
    public void setBufferSize(int value) {
    	this.bufferSize = value;
    }

    /**
     * Return the socket timeout (ms).
     * @return ms
     */
    public int getSocketTimeoutMS() {
    	return this.socketTimeoutMS;
    }

    /**
     * Set the socket timeout (ms).
     * @param value
     */
    public void setSocketTimeoutMS(int value) {
    	this.socketTimeoutMS = value;
    }

}
