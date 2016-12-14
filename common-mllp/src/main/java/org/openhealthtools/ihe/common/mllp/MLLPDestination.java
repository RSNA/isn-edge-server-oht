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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import org.apache.log4j.Logger;
import org.openhealthtools.ihe.atna.nodeauth.context.NodeAuthModuleContext;

/**
 * This class handles transmission of a given HL7 message to a designated
 * recipient. It supports use of either secured or non-secured sockets. It will
 * return the response returned by the recipient.
 *
 * @author <a href="mailto:rstevens@us.ibm.com">Rick Stevens</a>
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class MLLPDestination {

	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////

	/**
	 * Debug,Info,Error,Fatal log - output requires doAudit = true
	 */
    private static final Logger logger = Logger.getLogger(MLLPDestination.class);

    /**
     * TCPPort - supplies host, port#, starting/ending characters, and misc settings
     */
    private TCPPort port;

    /**
     * Starting message hex character array (versus String in TCPPort)
     */
    private char[] sHex;

    /**
     * Ending message hex character array (versus String in TCPPort)
     */
    private char[] eHex;

    /**
     * MLLP Destination socket
     */
    private Socket targetSocket;

    /**
     * How many times to retry a connection request
     */
    private int MAX_RETRY_COUNT = 3;

    /**
     * How long to wait between retry attempts
     */
    private int RETRY_WAIT = 2000;

    /**
     * Constant for error messages.
     */
    private static final String ERROR_RESP = "err";

    private URI uri=null;
    
    /**
     * Should the ATNA Agent or the MLLP legacy transport be used. Default is true = use ATNA
     */
    private static boolean USE_ATNA = true; 
    
	//////////////////
	// CONSTRUCTORS //
	//////////////////

    /**
     * Create a new MLLPDestination instance.
     *
     * @param destination
     *            Identifies the host and port that will be the destination for a
     *            given MLLP HL7 message.
     */
    public MLLPDestination(TCPPort destination) {
        this.port = destination;
		char[] sHex = new char[1];
		sHex[0] = 0x0B;
		char[] eHex = new char[2];
		eHex[0] = 0x1C;
		eHex[1] = 0x0D;
		port.setStartHex(sHex);
		port.setEndHex(eHex);
        this.sHex = port.getStartHex();
        this.eHex = port.getEndHex();
        this.targetSocket = null;

        String scheme = "mllp";
        if (destination instanceof SecureTCPPort)
        {
        	scheme = "mllps";
        }
		try
		{
			this.uri = new URI(scheme,null,destination.getTcpHost(),destination.getTcpPort(),null,null,null);
		}
		catch (URISyntaxException e)
		{
			logger.error("Problem constructing URI. "+e.getLocalizedMessage());
		}

    }

	/**
	 * Create a new MLLPDestination instance with unsecure port details.
	 * Defaults in the start and end characters as well as a buffer size of 4096.
	 * 
	 * @deprecated Use {@link #MLLPDestination(URI)} instead
	 * @param tcpHost - destination address
	 * @param tcpPort - destination port
	 */
	public MLLPDestination(String tcpHost, int tcpPort) {

		this.port = new TCPPort();
		port.setTcpHost(tcpHost);
		port.setTcpPort(tcpPort);
		char[] sHex = new char[1];
		sHex[0] = 0x0B;
		char[] eHex = new char[2];
		eHex[0] = 0x1C;
		eHex[1] = 0x0D;
		port.setStartHex(sHex);
		port.setEndHex(eHex);
        this.sHex = port.getStartHex();
        this.eHex = port.getEndHex();
        this.targetSocket = null;
        logger.info("Forcing use of unsecure mllp. If this is not want was expected, use a different constructor");
		try
		{
			this.uri = new URI("mllp",null,tcpHost,tcpPort,null,null,null);
		}
		catch (URISyntaxException e)
		{
			logger.error("Problem constructing URI. "+e.getLocalizedMessage());
		}
    }

	/**
	 * Create a new MLLPDestination instance. If the uri scheme is "mllp" an unsecure port
	 * will be created, and "mllps" will produce a secure port. Otherwise an illegal argument
	 * exception will be thrown.
	 * 
	 * Defaults in the start and end characters as well as a buffer size of 4096.
	 *
	 * @param uri
	 */
	public MLLPDestination(URI uri) {
		this.uri = uri;
		if (uri.getScheme().equalsIgnoreCase("mllp"))
		{
			this.port = new TCPPort();
		}
		else if (uri.getScheme().equalsIgnoreCase("mllps"))
		{
			this.port = new SecureTCPPort();
		}
		else
		{
			logger.error("URI for MLLP is does not contain a valid protocol. Expected either mllp or mllps instead got: "+uri.getScheme());
			throw new IllegalArgumentException("URI contained an invalid protocol: "+uri.getScheme());
		}
		port.setTcpHost(uri.getHost());
		port.setTcpPort(uri.getPort());
		char[] sHex = new char[1];
		sHex[0] = 0x0B;
		char[] eHex = new char[2];
		eHex[0] = 0x1C;
		eHex[1] = 0x0D;
		port.setStartHex(sHex);
		port.setEndHex(eHex);
        this.sHex = port.getStartHex();
        this.eHex = port.getEndHex();
        this.targetSocket = null;
	}


	////////////////////
	// PUBLIC METHODS //
	////////////////////

    /**
     * Get default maximum times to retry a connection.
     * @return maxRetry
     */
    public int getMaxRetry() {
    	return this.MAX_RETRY_COUNT;
    }

    /**
     * Modify default maximum times to retry a connection. Default is 3.
     * @param retryCount
     */
    public void setMaxRetry(int retryCount) {
    	this.MAX_RETRY_COUNT = retryCount;
    }

    /**
     * Get default wait time between retry attempts.
     * @return retryCount
     */
    public int getRetryWait() {
    	return this.RETRY_WAIT;
    }

    /**
     * Modify default wait time between retry attempts. Default is 2000.
     * @param retryWait
     */
    public void setRetryWait(int retryWait) {
    	this.RETRY_WAIT = retryWait;
    }
    
    /**
     * Get MLLP server and port in URI format.
     * @return URI
     */
    public URI getURI() {
    	return this.uri;
    }

    /**
     * Send specified message to destination host and port and return response
     * received.
     *
     * @param msg
     *            Message to send.
     * @return Response message received; any kind of internal error will result in null
     * response message being returned.
     * @throws MLLPException
     */
    public String sendMessage(String msg) throws MLLPException {

    	if(logger.isDebugEnabled()){
    		logger.debug("MLLPDestination: sendMessage - Entry ");
    	}

        String respMsg = null;
        this.targetSocket = null;

        try {

//        	if (USE_ATNA)
//        	{
        	
        	NodeAuthModuleContext nodeAuthContext = NodeAuthModuleContext.getContext();
        	boolean useTLS = uri.getScheme().equalsIgnoreCase("mllps");
        	this.targetSocket = nodeAuthContext.getSocketHandler().getSocket(uri, useTLS);
        	
        	
//        	}
//        	else
//        	{
//        		// See if we need to send message over secure (TLS) or non-secure connection
//        		if (this.port instanceof SecureTCPPort) {
//        			this.targetSocket = createSecureSocket((SecureTCPPort) this.port);
//        		} else {
//        			this.targetSocket = createSocket(this.port);
//        		}
//        	}

            // If have a targetSocket, send the message
            if (this.targetSocket != null) {
            	logger.info("*** Sending message to " + this.port.getTcpHost() + " on port " + this.port.getTcpPort()+"\n" + msg);
        		respMsg = sendMessage(this.targetSocket, msg, this.port);
            } else {
            	logger.error("Unable to create socket connection needed to deliver message");
            	throw new MLLPException("Unable to create socket connection ", ErrorCondition.mllpNoSocketConnection);
            }
            logger.info("*** Response from " + this.port.getTcpHost() + " on port " + this.port.getTcpPort() + " was:\n" + respMsg);

        } catch (Throwable th) {
        	logger.error("Encountered unexpected error. "+th.getLocalizedMessage(), th);
        	throw new MLLPException("Unexpected error ", ErrorCondition.mllpUnexpectedError,th);

        } finally {
            if (this.targetSocket != null) {
                try {
                    this.targetSocket.close();
                } catch (IOException e) {
                	logger.error("Error closing socket associated with port " + this.port.toString(), e);
                	throw new MLLPException("Error closing socket ", ErrorCondition.mllpErrorClosingSocket,e);
                }
                this.targetSocket = null;
            }
        }

        if(logger.isDebugEnabled()){
        	logger.debug("MLLPDestination: sendMessage - Exit");
        }

        return respMsg;
    }


	/////////////////////
	// PRIVATE METHODS //
	/////////////////////

    /**
     * Send message via socket and wait for response.
     * @param socket
     * @param message to send
     * @param tcp port to use
     * @return host response to message
     * @throws MLLPException
     */
     private String sendMessage(Socket socket, String msg, TCPPort tcpp) throws MLLPException {
        String respondMsg = null;
        BufferedReader fromServer = null;
        PrintWriter toServer = null;

        try {
            fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
        	logger.error("Unable to get input stream for communication to " + tcpp.getTcpHost() + ":" + tcpp.getTcpPort(), e);
            respondMsg = ERROR_RESP;
        }

        if (respondMsg == null) {
            try {
                toServer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            } catch (IOException e) {
            	logger.error("Unable to get output stream for communication to " + tcpp.getTcpHost() + ":" + tcpp.getTcpPort(), e);
                respondMsg = ERROR_RESP;
            }
        }

        if (respondMsg == null) {

            // Send message to destination, wrapped in envelope
            if (logger.isDebugEnabled()) {
                logger.debug("sending the server: " + addEnvelope(msg));
            }
            toServer.print(addEnvelope(msg));
            toServer.flush();
            if (logger.isDebugEnabled()) {
                logger.debug("done sending the message to the server");
            }
            char[] buf = new char[tcpp.getBufferSize()];

            // Now, read for response from destination application
            StringBuffer sb = new StringBuffer();
            try {
            	
            	int readLength = -1;
            	try {
            		readLength = fromServer.read(buf, 0, buf.length);
            	} catch (IOException e) {
            		logger.warn("Warning - exception thrown during server response read sometimes due to the server closing the socket.");
            		logger.warn("Warning - will attempt to continue under assumption that response was received.");
            		logger.warn("  If it was not, your guess is as good as mine as to where subsequent code will break based on bad input.");
            		logger.warn("  Buffer length " + buf.length + " message " + buf.toString() + " received prior to exception.");
            		logger.warn(e);
            		//added warn & continue to support case where server closes socket immediately, buffer may be complete
            	}

                // See if socket connection was broken; return error if that is the case
                if (readLength == -1) {
                    logger.error("did not read any byte from the server");
                    respondMsg = ERROR_RESP;
                } else {
                    // Continue to read from socket until end of response is found
                    while (readLength != -1) {
                        sb.append(buf, 0, readLength);
                        if ( ! endOfMessageFound(sb) ) {
                        	if(logger.isDebugEnabled()){
                        		logger.debug("End of message not found. Doing another read to receive rest of message");
                        	}
                        }
                        else {
                            break;
                        }
                        readLength = fromServer.read(buf, 0, buf.length);
                        if (logger.isDebugEnabled()) {
                        	logger.debug("buffer length " + buf.length);
                        	logger.debug("readLength= " + readLength);
                            logger.debug("got: " + String.valueOf(buf[buf.length - 1]));
                        }
                    }
                    respondMsg = this.checkStripEnvelope(sb);
                    if(logger.isDebugEnabled()){
                    	logger.debug("Response was: " + respondMsg);
                    }
                }
            } catch (IOException e) {
            	logger.error("Error reading data from " + tcpp.toString(), e);
                respondMsg = ERROR_RESP;
                throw new MLLPException("Error sending message ", ErrorCondition.mllpSocketUseError,e);
            }
        }

        if (respondMsg == ERROR_RESP) {
        	throw new MLLPException("Error sending message ", ErrorCondition.mllpSocketUseError);
        }

        return respondMsg;
    }

    /**
     * Detect end of message
     * @param stringbuffer
     * @return true/false
     */
    private boolean endOfMessageFound(StringBuffer sb) {
    	if (sb.length() < eHex.length) {
    		return false;
    	}
        for (int x = sb.length() - eHex.length, y = 0; y < eHex.length; x++, y++) {
            if (sb.charAt(x) != eHex[y]) {
            	if(logger.isDebugEnabled()){
            		logger.debug("Ending character sequence not found in message");
            	}
                return false;
            }
        }
        return true;
    }

    /**
     * Create secure socket to MLLP destination.
     * @param tcpp
     * @return sslSocket
     * @throws MLLPException
     */
    private SSLSocket createSecureSocket(SecureTCPPort tcpp) throws MLLPException {

    	SSLSocket s = null;
        int retries = 0;
        SSLContext sslc = null;
        String sslPName = null;
        String sslPClass = null;

        try {

            sslPName = tcpp.getSslProviderName();
            sslPClass = tcpp.getSslProviderClass();
            if (sslPName != null && sslPName.length() > 0 && sslPClass != null && sslPClass.length() > 0) {
            	if(logger.isDebugEnabled()){
            		logger.debug("Registering " + sslPName + " provider for " + tcpp.getProtocol() + " protocol");
            	}
                Security.setProperty("security.provider.1", sslPClass);
                sslc = SSLContext.getInstance(tcpp.getProtocol(), sslPName);
            } else {
            	if(logger.isDebugEnabled()){
            		logger.debug("Using default provider for " + tcpp.getProtocol() + " protocol");
            	}
                sslc = SSLContext.getInstance(tcpp.getProtocol());
            }

        } catch (NoSuchAlgorithmException e) {
        	logger.error("Requested secure socket provider " + sslPName + " is not supported", e);
        	throw new MLLPException("Secure socket provider not supported ", ErrorCondition.mllpSecureSocketError);
        } catch (NoSuchProviderException e) {
        	logger.error("Error registering provider for secure socket " + sslPName, e);
        	throw new MLLPException("Error registering provider for secure socket ", ErrorCondition.mllpSecureSocketError);
        }

        if(logger.isDebugEnabled()){
        	logger.debug("SSLContext provider is: " + sslc.getProvider().toString());
        	logger.debug("Default key manager algorithm is : " + KeyManagerFactory.getDefaultAlgorithm());
        }

        InputStream is;
        try {
        	is = new FileInputStream(tcpp.getKeyStoreName());
        } catch (FileNotFoundException e) {
        	is = null;
        }

        String keyStorePass = tcpp.getKeyStorePassword();

        if (is == null) {
        	logger.error("Unable to find certificate store " + tcpp.getKeyStoreName() + " on classpath");
        	throw new MLLPException("Secure socket unable to find certificate store ", ErrorCondition.mllpSecureSocketError);
        }

        // Load key store containing certificates to use for client
        // connection authentication
        KeyStore kstore;
        KeyManagerFactory kfact;
        try {
            kfact = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kstore = KeyStore.getInstance(KeyStore.getDefaultType());
            kstore.load(is, keyStorePass.toCharArray());
            kfact.init(kstore, keyStorePass.toCharArray());

        } catch (NoSuchAlgorithmException e) {
        	logger.error("Algorithm " + KeyManagerFactory.getDefaultAlgorithm() + " is not supported", e);
        	throw new MLLPException("Secure socket algorithm not supported ", ErrorCondition.mllpSecureSocketError);
        } catch (KeyStoreException e) {
        	logger.error("Keystore of type " + KeyStore.getDefaultType() + " is not supported", e);
        	throw new MLLPException("Secure socket keystore not supported ", ErrorCondition.mllpSecureSocketError);
        } catch (CertificateException e) {
        	logger.error("Error loading key store " + tcpp.getKeyStoreName(), e);
        	throw new MLLPException("Secure socket error loading key store ", ErrorCondition.mllpSecureSocketError);
        } catch (IOException e) {
        	logger.error("Error loading key store " + tcpp.getKeyStoreName(), e);
        	throw new MLLPException("Secure socket error loading key store ", ErrorCondition.mllpSecureSocketError);
        } catch (UnrecoverableKeyException e) {
        	logger.error("Error loading key store " + tcpp.getKeyStoreName(), e);
        	throw new MLLPException("Secure socket error loading key store ", ErrorCondition.mllpSecureSocketError);
        }

        // Locate trust store
        try {
        	is = new FileInputStream(tcpp.getTrustStoreName());
        } catch (FileNotFoundException e) {
        	is = null;
        }

        String trustStorePass = tcpp.getTrustStorePassword();

        if (is == null) {
            logger.error("Unable to find trust store " + tcpp.getTrustStoreName() + " on classpath");
        	throw new MLLPException("Secure socket unable to find trust store ", ErrorCondition.mllpSecureSocketError);
        }

        TrustManagerFactory tfact;
        try {

        	tfact = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore tstore = KeyStore.getInstance(KeyStore.getDefaultType());
            tstore.load(is, trustStorePass.toCharArray());
            tfact.init(tstore);

        } catch (NoSuchAlgorithmException e) {
        	logger.error("Error loading trust store " + tcpp.getTrustStoreName(), e);
        	throw new MLLPException("Secure socket error loading trust store ", ErrorCondition.mllpSecureSocketError);
        } catch (KeyStoreException e) {
        	logger.error("Error loading trust store " + tcpp.getTrustStoreName(), e);
        	throw new MLLPException("Secure socket error loading trust store ", ErrorCondition.mllpSecureSocketError);
        } catch (CertificateException e) {
        	logger.error("Error loading trust store " + tcpp.getTrustStoreName(), e);
           	throw new MLLPException("Secure socket error loading trust store ", ErrorCondition.mllpSecureSocketError);
        } catch (IOException e) {
        	logger.error("Error loading trust store " + tcpp.getTrustStoreName(), e);
           	throw new MLLPException("Secure socket error loading trust store ", ErrorCondition.mllpSecureSocketError);
        }

        try {
            sslc.init(kfact.getKeyManagers(), tfact.getTrustManagers(), null);

        } catch (KeyManagementException e) {
        	logger.error("Error initializing key management infrastructure", e);
           	throw new MLLPException("Secure socket error initializing key management ", ErrorCondition.mllpSecureSocketError);
        }
        SSLSocketFactory sslFact = sslc.getSocketFactory();

        if(logger.isDebugEnabled()) {
            String[] csuites = sslFact.getDefaultCipherSuites();
            logger.debug("Cipher suites for " + sslFact.getClass().getName() + " are: ");
            for (int i = 0; i < csuites.length; i++) {
                logger.debug("\t" + csuites[i]);
            }
        }

        // Loop to get a connection or until we've exhausted number of retries
        while (retries < MAX_RETRY_COUNT) {
            try {
                s = (SSLSocket) sslFact.createSocket(tcpp.getTcpHost(), tcpp.getTcpPort());

                // Set amount of time to wait on socket read before timing out
                s.setSoTimeout(tcpp.getSocketTimeoutMS());
                s.setKeepAlive(true);

                // Set list of enabled cipher suites to use for this port
                List suiteList = new ArrayList();
                if (suiteList != null && suiteList.size() > 0) {
                    String[] enabledSuites = new String[suiteList.size()];
                    for (int i = 0; i < enabledSuites.length; i++) {
                        enabledSuites[i] = (String) suiteList.get(i);
                        if(logger.isDebugEnabled()){
                        	logger.debug("Enabling cipher suite: " + enabledSuites[i]);
                        }
                    }
                    s.setEnabledCipherSuites(enabledSuites);
                }

                // Force the TLS handshake at this point so we can catch any authentication errors
                s.startHandshake();
                break;

            } catch (SSLHandshakeException he) {
            	logger.error("Handshake failed with server " + tcpp.toString(), he);
                try {
                    s.close();
                } catch (IOException e1) {
                	logger.error("Error trying to close socket for " + tcpp.toString(), e1);
                }
                throw new MLLPException("Secure socket handshake failed ", ErrorCondition.mllpSecureSocketError);
            } catch (UnknownHostException e) {
            	logger.error("Unable to establish connection to " + tcpp.getTcpHost() + " " + tcpp.getTcpPort(), e);
            	throw new MLLPException("Secure socket connection failed ", ErrorCondition.mllpSecureSocketError);
            } catch (SocketException e) {
            	logger.error("Error connecting to " + tcpp.getTcpHost() + " " + tcpp.getTcpPort() + ". Will retry in "
                        + RETRY_WAIT / 1000 + " seconds.", e);
                try {
                    Thread.sleep(RETRY_WAIT);
                    retries++;
                    continue;
                } catch (InterruptedException ie) {
                	if(logger.isDebugEnabled()){
                		logger.debug("Sleep awoken early");
                	}
                    retries++;
                    continue;
                }

            } catch (IOException e) {
            	logger.error("Error connecting to " + tcpp.getTcpHost() + " " + tcpp.getTcpPort() + ". Will retry in "
                        + RETRY_WAIT / 1000 + " seconds.", e);
                retries++;
                continue;
            }

        }
        if (retries > MAX_RETRY_COUNT) {
           	throw new MLLPException("Secure socket retries exhausted ", ErrorCondition.mllpSecureSocketError);
        }
        return s;
    }


    /**
     * Create non-secure socket to MLLP destination.
     * @param tcpp
     * @return socket
     * @throws MLLPException
     */
    private Socket createSocket(TCPPort tcpp) throws MLLPException {
        Socket s = null;
        int retries = 0;

        // Loop to get a connection or until we've exhausted number of retries
        while (retries < MAX_RETRY_COUNT) {
            try {
                s = new Socket(tcpp.getTcpHost(), tcpp.getTcpPort());

                // Set amount of time to wait on socket read before timing out
                s.setSoTimeout(tcpp.getSocketTimeoutMS());
                s.setKeepAlive(true);
                break;
            } catch (UnknownHostException e) {
            	logger.error("Unable to establish connection to " + tcpp.getTcpHost() + " " + tcpp.getTcpPort(), e);
                break;
            } catch (SocketException e) {
                // Some kind of error, retry if we haven't exceeded max retry
                // count
            	logger.error("Error connecting to " + tcpp.getTcpHost() + " " + tcpp.getTcpPort() + ". Will retry in "
                        + RETRY_WAIT / 1000 + " seconds.", e);

                try {
                    Thread.sleep(RETRY_WAIT);
                    retries++;
                    continue;
                } catch (InterruptedException ie) {
                	if(logger.isDebugEnabled()){
                		logger.debug("Sleep awoken early");
                	}
                    retries++;
                    continue;
                }

            } catch (IOException e) {
                // Some kind of error, retry if we haven't exceeded max retry
                // count
            	logger.error("Error connecting to " + tcpp.getTcpHost() + " " + tcpp.getTcpPort() + ". Will retry in "
                        + RETRY_WAIT / 1000 + " seconds.", e);
                retries++;
                continue;
            }
        }

        if (retries > MAX_RETRY_COUNT) {
           	throw new MLLPException("Socket retries exhausted ", ErrorCondition.mllpNonSecureSocketError);
        }

        return s;
    }

    /**
     * Add configured envelope around a specified message
     * @param msg
     * @return enveloped message
     */
    private String addEnvelope(String msg) {

        StringBuffer sb = new StringBuffer(msg.length() + sHex.length + eHex.length);

        for (int x = 0; x < sHex.length; x++) {
            sb.append(sHex[x]);
        }

        sb.append(msg);

        for (int x = 0; x < eHex.length; x++) {
            sb.append(eHex[x]);
        }

        if (logger.isDebugEnabled()) {
        	logger.debug(sb.toString());
        }
        return sb.toString();
    }

    /**
     * Method used by the process that will removed beginning and ending
     * characters from a message. Characters that are to be removed are
     * determined by how TCPPort is configured.
     *
     * @param msg
     *            Buffer containing a message
     * @return Returns a string representing a string that does not contain an
     *         envelope. If an error occurs then the string "err" will be
     *         returned
     */
    private String checkStripEnvelope(StringBuffer msg) {
        int msgLen = msg.length();

        for (int x = 0; x < sHex.length; x++) {
            if (msg.charAt(x) != sHex[x]) {
            	logger.fatal("Message format error. Start envelope char " + msg.charAt(x)
                        + " did not match the configuration parameter " + sHex[x] + "");
                return ERROR_RESP;
            }
        }

        for (int x = (msgLen - eHex.length), y = 0; x < msgLen; x++, y++) {
            if (msg.charAt(x) != eHex[y]) {
            	logger.fatal("Message format error. End envelope char at " + msg.charAt(x)
                        + " did not match the configuration parameter " + eHex[y]);
                return ERROR_RESP;
            }
        }

        return msg.substring(sHex.length, (msgLen - eHex.length));
    }

//    private AtnaAgent getAtnaAgent()
//    {
//    	if (atnaAgent == null) atnaAgent = AtnaAgentFactory.getAtnaAgent();
//    	return atnaAgent;
//    }

	/**
	 * Get the current class setting for the use of ATNA or MLLP legacy.
	 * 
	 * @return true = use ATNA, false = MLLP Legacy 
	 */
	public static boolean getUseATNA()
	{
		return USE_ATNA;
	}

	/**
	 * Select if the MLLPDestination class should use the ATNA Agent communications, or
	 * the legacy MLLP implementation. The default is to use ANTA. 
	 * @param atna true = use ATNA, false = use MLLP legacy 
	 */
	public static void setUseATNA(boolean atna)
	{
		USE_ATNA = atna;
	}
}
