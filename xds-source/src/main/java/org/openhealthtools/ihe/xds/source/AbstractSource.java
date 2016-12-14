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

package org.openhealthtools.ihe.xds.source;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.log4j.Logger;
import org.openhealthtools.ihe.atna.auditor.XDSSourceAuditor;
import org.openhealthtools.ihe.xds.XDSConstants;
import org.openhealthtools.ihe.xds.XDSMetadataHandler;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.soap.XDSAsyncCallback;
import org.openhealthtools.ihe.xds.soap.XDSSOAPResponsePayload;
import org.openhealthtools.ihe.xds.soap.XDSSoapClient;
import org.openhealthtools.ihe.xds.source.response.AsynchronousXDSResponseType;
import org.openhealthtools.ihe.xds.source.response.SynchronousXDSResponseType;
import org.openhealthtools.ihe.xds.source.utils.SourceAuditUtils;
import org.w3c.dom.Element;

/**
 * Abstract OHF Source Actor implementation of the IHE XDS Source Actor provides a base class
 * structure 
 * for composing and submitting IHE XDS Provide and Register Document Set
 * transactions to the IHE XDS Repository.
 * <br>
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a>
 * @author <a href="seknoop@almaden.ibm.com">Sarah Knoop </a>
 */
public abstract class AbstractSource 
{
	/**
	 * Logger for the class
	 */
	private static final Logger logger = Logger.getLogger(AbstractSource.class);

	/**
	 * URI to the Repository the Source will send submissions to.
	 */
	protected URI repositoryURI = null;

    /**
     * XDS Source Auditor for ATNA Audit Events
     */
    private XDSSourceAuditor auditor = XDSSourceAuditor.getAuditor();

	/**
	 * Transport client to manage source soap message transactions
	 */
	private final XDSSoapClient senderClient;
	
	/**
	 * XDS Metadata Handler for the specific transaction
	 */
	private final XDSMetadataHandler metadataHandler;
	

	
   /**
    * Constructor
    * @param repositoryURI the URI for the repository to submit to.
    */
	public AbstractSource(URI uri, XDSMetadataHandler metadataHandler, XDSSoapClient sender) 
	{
		this.repositoryURI = uri;
		this.senderClient = sender;
		this.metadataHandler = metadataHandler;
	}

	/**
	 * Gets the ATNA Auditor for this Actor
	 * @return	The ATNA Auditor
	 */
	public XDSSourceAuditor getAuditor()
	{
		return auditor;
	}

	/**
	 * Get the SOAP client for sending XDS transactions
	 * @return XDS SOAP Client
	 */
	public XDSSoapClient getSenderClient()
	{
		return senderClient;
	}
	
	/**
	 * @return the doAudit
	 */
	public boolean isDoAudit() {
		return getAuditor().getConfig().isAuditorEnabled();
	}


	/**
	 * @return Returns the repositoryURI as a url string
	 */
	public String getRepositoryURL() {
		return repositoryURI.toString();
	}

	/**
	 * Sets the string url to be the URI of the repository
	 * @param repositoryURL The repositoryURL to set.
	 */
	public void setRepositoryURL(String repositoryURL) {
		try {
			this.repositoryURI = new URI(repositoryURL);
		} catch (URISyntaxException e) {
			logger.fatal("SOURCE URI CANNOT BE SET: \n" + e.getMessage());
		}
	}
	
	/**
	 * @return Returns the repositoryURI
	 */
	public URI getRepositoryURI() {
		return repositoryURI;
	}

	/**
	 * Sets the the URI of the repository
	 * @param repositoryURL The URI to set.
	 */
	public void setRepositoryURI(URI repositoryURI) {
		this.repositoryURI = repositoryURI;
	}
	
	/**
	 * Gets the actor name for each actor implementation.  
	 * 
	 * @return The implementation's actor name
	 */
	public abstract String getActorName();


	/**
	 * Submits the Provide and Register Document Set transaction to the XDS
	 * Document Repository Actor. Repository errors or faults are thrown as exceptions.
	 * <br />
	 * @param txnData Transaction payload data: XDS metadata and corresponding documents
	 * @return The XDS Response from the XDS repository and registry
	 * @throws Exception If error or fault is received from the repository
	 */
	protected XDSResponseType submit(SubmitTransactionData txnData) throws Exception 
	{
		return submit(false,txnData);
	}
	
	/**
	 * Submits the Provide and Register Document Set transaction to the XDS
	 * Document Repository Actor. Repository errors or faults are thrown as exceptions.
	 * <br />
	 * If useAsync is true, the XDS.b Asynchronous Option is used for the transaction.
	 * Asynchronous transactions are NON-BLOCKING and may have a deferred response.  Implementors
	 * should check isComplete() on the response to verify the asynchronous response has been received.
	 * <br />
	 * @param useAsync Use non-blocking asynchronous XDS in the transaction (requires XDS.b Actor)
	 * @param txnData Transaction payload data: XDS metadata and corresponding documents
	 * @return The XDS Response from the XDS repository and registry (deferred if useAsync is true)
	 * @throws Exception If error or fault is received from the repository
	 */
	protected XDSResponseType submit(boolean useAsync, SubmitTransactionData txnData) throws Exception 
	{
		// verify repository URL is set
		if (getRepositoryURI() == null) {
			logger.fatal("Repository URI is undefined.");
			throw new SourceException(SourceException.XDS_REPOSITORY_UNDEFINED, "Repository URI is null.");
		}
		
		SourceAuditUtils.auditActorStart(this);

		XDSResponseType responseObject = null;
		try {
			Element submitObjectsRequest = metadataHandler.processRequest(txnData);

			if (useAsync) {
				XDSAsyncCallback responseCallback = getSenderClient().sendAsync(getRepositoryURI(), submitObjectsRequest, txnData.getDocList(), XDSConstants.PROVIDE_AND_REGISTER_DOCUMENT_SET_ACTION);
				responseObject = new AsynchronousXDSResponseType(responseCallback, metadataHandler, this, txnData);
			} else {
				XDSSOAPResponsePayload responsePayload = getSenderClient().send(getRepositoryURI(), submitObjectsRequest, txnData.getDocList(), XDSConstants.PROVIDE_AND_REGISTER_DOCUMENT_SET_ACTION);
				Element responseElement = responsePayload.getResponseElement();
				 responseObject = metadataHandler.processResponse(new SynchronousXDSResponseType(),responseElement);
			}
			
		} catch (Exception e) {
			// Disable aysnc, it is no longer valid for this transaction
			useAsync = false;
			logger.error("An error occurred while sending the Provide And Register Document Set Request.", e);
			throw e;
		} finally {
			if (!useAsync) {
				SourceAuditUtils.auditProvideAndRegister(this, txnData, responseObject);
				SourceAuditUtils.auditActorStop(this);
			}
		}
		return responseObject;
	}
}
