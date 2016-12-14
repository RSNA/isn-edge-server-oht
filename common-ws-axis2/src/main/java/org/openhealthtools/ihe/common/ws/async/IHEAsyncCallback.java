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

import java.net.URI;

import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.util.Utils;

/**
 * Generic Axis2-supported asynchronous callback for IHE asynch transactions, 
 * such as XDS.b Asynchronous.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 * 
 */
public class IHEAsyncCallback implements AxisCallback 
{
	/**
	 * 
	 */
	protected boolean isComplete = false;
	
	/**
	 * 
	 */
	protected boolean isSuccess = false;
	
	/**
	 * 
	 */
	protected boolean isFault = false;
	
	/**
	 * 
	 */
	protected boolean isError = false;

	/**
	 * 
	 */
	protected MessageContext responseContext;
	
	/**
	 * 
	 */
	protected Exception exceptionCause = null;
	
	/**
	 * 
	 */
	protected URI endpointUri = null;

	/**
	 * 
	 */
	public IHEAsyncCallback() {

	}

	/**
	 * Sets the Endpoint URI that this callback is bound to
	 * @param endpointUri
	 */
	public void setEndpointUri(URI endpointUri) {
		this.endpointUri = endpointUri;
	}

	/**
	 * Whether the async transaction is complete
	 * @return Whether the async transaction is complete
	 */
	public boolean isComplete() {
		return isComplete;
	}

	/**
	 * @return Whether the transaction was successful
	 */
	public boolean isSuccess() {
		return isSuccess;
	}

	/**
	 * @return Whether a fault was received from the transaction
	 */
	public boolean isFault() {
		return isFault;
	}

	/**
	 * @return Whether an error was received from the transaction
	 */
	public boolean isError() {
		return isError;
	}

	/**
	 * @return The message context corresponding to the transaction's response
	 */
	public MessageContext getMessageContext() {
		return responseContext;
	}

	/**
	 * @return Returns any SOAP faults or Java Exception from the transaction
	 */
	public Exception getFaultOrErrorException() {
		return exceptionCause;
	}

	/**
	 * @return Gets the Endpoint URI that this callback is bound to
	 */
	public URI getEndpointUri() {
		return endpointUri;
	}

	/* (non-Javadoc)
	 * @see org.apache.axis2.client.async.AxisCallback#onComplete()
	 */
	public void onComplete() {
		if (!isFault && !isError) {
			isSuccess = true;
		}
		isComplete = true;
	}

	/* (non-Javadoc)
	 * @see org.apache.axis2.client.async.AxisCallback#onError(java.lang.Exception)
	 */
	public void onError(Exception exception) {
		isError = true;
		exceptionCause = exception;
		onComplete();
	}

	/* (non-Javadoc)
	 * @see org.apache.axis2.client.async.AxisCallback#onFault(org.apache.axis2.context.MessageContext)
	 */
	public void onFault(MessageContext mc) {
		isFault = true;
		exceptionCause = Utils.getInboundFaultFromMessageContext(mc);
	}

	/* (non-Javadoc)
	 * @see org.apache.axis2.client.async.AxisCallback#onMessage(org.apache.axis2.context.MessageContext)
	 */
	public void onMessage(MessageContext mc) {
		responseContext = mc;
	}
}
