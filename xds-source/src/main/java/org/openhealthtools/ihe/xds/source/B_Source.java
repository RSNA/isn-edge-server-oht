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

import org.apache.log4j.Logger;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.soap.B_XDSSoapClient;
import org.openhealthtools.ihe.xds.source.handlers.ProvideAndRegisterDocumentSetBMetadataHandler;

/**
 * OHF Source Actor implementation of the IHE XDS B Source Actor provides a utility class
 * for composing and submitting IHE XDS Provide and Register Document Set
 * transactions to the IHE XDS Repository over web services. This is described in the 
 * IHE ITI-41 transaction.
 * <br>
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
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class B_Source extends AbstractSource {
	/**
	 * Logger for the class
	 */
	private static final Logger LOGGER = Logger.getLogger(B_Source.class);

	/**
	 * Implementation actor name
	 */
	private static final String ACTOR_NAME = "OHT_XDS_DOCUMENT_SOURCE_B";
	
	/**
	 * Constructor
     * @param repositoryURI the URI for the repository to submit to.
	 */
	public B_Source(URI uri) {
		super(uri, 
				new ProvideAndRegisterDocumentSetBMetadataHandler(),
				new B_XDSSoapClient());
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.source.AbstractSource#getSender()
	 */
	public B_XDSSoapClient getSenderClient()
	{
		return (B_XDSSoapClient)super.getSenderClient();
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
		return this.submit(false,txnData);
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.source.AbstractSource#submit(boolean, org.openhealthtools.ihe.xds.source.SubmitTransactionData)
	 */
	public XDSResponseType submit(boolean useAsync, SubmitTransactionData txnData) throws Exception 
	{
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(">>> Entering ITI-41 Provide And Register Document Set-b; async=" + String.valueOf(useAsync));
		}
		XDSResponseType response = super.submit(useAsync, txnData);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("<<< Exiting ITI-41 Provide And Register Document Set-b; async=" + String.valueOf(useAsync));
		}
		return response;
	}

}
