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

import org.apache.log4j.Logger;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.soap.A_XDSSoapClient;
import org.openhealthtools.ihe.xds.source.handlers.ProvideAndRegisterDocumentSetMetadataHandler;

/**
 * OHF Source Actor implementation of the IHE XDS Source Actor provides a utility class
 * for composing and submitting IHE XDS Provide and Register Document Set
 * transactions to the IHE XDS Repository. This is described in the IHE ITI-15
 * transaction.
 * <br>
 *  Classes using this class, should interact with it as follows:<br>
 *  <br>
 *  <ol>
 *  <li>Create a new transaction data instance (see {@link org.openhealthtools.ihe.xds.source.SubmitTransactionData})
 *     (note: per IHE XDS - a transaction can hold 0 or more documents, and ALL documents must
 *      belong to the same patient)<br>
 *  <li>Invoke submit() to perform the submission to the XDS Repository Actor. <br>
 * </ol>
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a>
 * @author <a href="glenn@almaden.ibm.com">Glenn Deen </a>
 * @author <a href="seknoop@almaden.ibm.com">Sarah Knoop </a>
 */
public class Source extends AbstractSource{
	/**
	 * Logger for the class
	 */
	private static final Logger LOGGER = Logger.getLogger(Source.class);

	/**
	 * Implementation actor name
	 */
	private static final String ACTOR_NAME = "OHT_XDS_DOCUMENT_SOURCE";
	
   /**
    * Constructor
    * @param repositoryURI the URI for the repository to submit to.
    */
	public Source(java.net.URI uri) 
	{
		super(uri, 
				new ProvideAndRegisterDocumentSetMetadataHandler(), 
				new A_XDSSoapClient());
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.source.AbstractSource#getSender()
	 */
	public A_XDSSoapClient getSenderClient()
	{
		return (A_XDSSoapClient)super.getSenderClient();
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.source.AbstractSource#getActorName()
	 */
	public String getActorName()
	{
		return ACTOR_NAME;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.source.AbstractSource#submit(org.openhealthtools.ihe.xds.source.SubmitTransactionData)
	 */
	public XDSResponseType submit(SubmitTransactionData txnData) throws Exception 
	{
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Entering ITI-15 Provide And Register Document Set");
		}
		XDSResponseType response = super.submit(false, txnData);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Exiting ITI-15 Provide And Register Document Set");
		}
		return response;
	}
}
