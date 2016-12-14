/*******************************************************************************
 * Copyright (c) 2008,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds.source.response;

import org.apache.log4j.Logger;
import org.openhealthtools.ihe.xds.XDSMetadataHandler;
import org.openhealthtools.ihe.xds.response.impl.XDSResponseTypeImpl;
import org.openhealthtools.ihe.xds.soap.XDSAsyncCallback;
import org.openhealthtools.ihe.xds.soap.XDSSOAPResponsePayload;
import org.openhealthtools.ihe.xds.source.AbstractSource;
import org.openhealthtools.ihe.xds.source.SubmitTransactionData;
import org.openhealthtools.ihe.xds.source.utils.SourceAuditUtils;
import org.w3c.dom.Element;

/**
 * Implementation of Asynchronous XDS.b response handling for
 * Provide And Register Document Set-b
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class AsynchronousXDSResponseType extends XDSResponseTypeImpl 
{
	/**
	 * Logger instance
	 */
	private static final Logger LOGGER = Logger.getLogger(AsynchronousXDSResponseType.class);
	
	/**
	 * XDS Asynchronous Response Callback
	 */
	private XDSAsyncCallback callback;
	
	/**
	 * XDS Metadata Handler to use in processing
	 */
	private XDSMetadataHandler xdsHandler;
	
	/**
	 * XDS Document Source implementation to use in processing
	 */
	private AbstractSource xdsSource;
	
	/**
	 * Initial XDS Provide And Register request metadata for reference
	 */
	private SubmitTransactionData sourceTransaction;
	
	/**
	 * Any exceptions during during processing
	 */
	private Throwable caughtThrowable;
	
	/**
	 * Whether processing has already happened on this object
	 */
	private boolean isProcessed = false;
	
	/**
	 * Constructor for Asynchronous XDS.b Provide And Register Document Set Response
	 * @param callback Callback listener instance
	 * @param xdsHandler XDS Metadata Handler instance
	 * @param xdsSource XDS Document Source actor implementation instance
	 * @param sourceTransaction Provide and Register metdata
	 */
	public AsynchronousXDSResponseType(
			XDSAsyncCallback callback, 
			XDSMetadataHandler xdsHandler,
			AbstractSource xdsSource,
			SubmitTransactionData sourceTransaction)
	{
		super();
		this.callback = callback;
		this.xdsHandler = xdsHandler;
		this.xdsSource = xdsSource;
		this.sourceTransaction = sourceTransaction;
	}
	
	/**
	 * Process the inbound asynchronous response callback object
	 * using XDS metadata handling.
	 */
	protected void process()
	{
		// Check if a transaction is already processed, not processable, 
		// or if the wire transaction is not yet complete
		if (isProcessed || null == callback || !callback.isComplete()) {
			return;
		}
		
		// If the wire transaction was successful, attempt to process
		if (callback.isSuccess()) {
			try {
				// Get the processed SOAP response, process into XDS Response Type
				// and save model
				XDSSOAPResponsePayload responsePayload = callback.getResponsePayload();
				Element responsePayloadElement = responsePayload.getResponseElement();
				xdsHandler.processResponse(this,responsePayloadElement);
	
			} catch (Throwable t) {
				LOGGER.error("Error occurred during XDS metadata processing.", t);
				caughtThrowable = t;
			}
		} else {
			caughtThrowable = callback.getFaultOrErrorException();
		}
		
		// Audit the PHI Import Event
		SourceAuditUtils.auditProvideAndRegister(xdsSource, sourceTransaction, this);
		// Audit actor shutdown
		SourceAuditUtils.auditActorStop(xdsSource);

		isProcessed = true;
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSResponseType#isComplete()
	 */
	public boolean isComplete() 
	{
		return isProcessed();
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.impl.AbstractXDSResponseType#isProcessed()
	 */
	protected boolean isProcessed()
	{
		process();
		return isProcessed;
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.impl.AbstractXDSResponseType#getCaughtException()
	 */
	public Throwable getCaughtException()
	{
		return caughtThrowable;
	}
}
