/*******************************************************************************
 * Copyright (c) 2009 Sage Software, Inc. and its affiliated entities.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sage - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.common.ws.client;

import java.net.URI;

import org.apache.axis2.context.MessageContext;
import org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback;

/**
 * Extended asynchronous IHE callback handler for locking and binding
 * to IHE-asynchronous responses.
 * 
 * @author <a href="mailto:venkataraman.sethuraman@sage.com">Venkataraman Sethuraman</a>
 *
 */
public class IHEAsyncCallbackExt extends IHEAsyncCallback
{
	/**
	 * 
	 */
	private IHESoapClient soapProcessor;
	
	/**
	 * 
	 */
	private IHESOAPResponsePayload responsePayload;

	/**
	 * @param soapProcessor
	 */
	public IHEAsyncCallbackExt(IHESoapClient soapProcessor)
	{
		super();
		this.soapProcessor = soapProcessor;
	}
	
/*	 (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#getEndpointUri()
	 
	@Override
	public URI getEndpointUri() 
	{
		return super.getEndpointUri();
	}

	 (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#getFaultOrErrorException()
	 
	@Override
	public Exception getFaultOrErrorException() 
	{
		return super.getFaultOrErrorException();
	}

	 (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#getMessageContext()
	 
	@Override
	public MessageContext getMessageContext() 
	{
		return super.getMessageContext();
	}

	 (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#isError()
	 
	@Override
	public boolean isError() 
	{
		return super.isError();
	}

	 (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#isFault()
	 
	@Override
	public boolean isFault() 
	{
		return super.isFault();
	}

	 (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#isComplete()
	 
	public boolean isComplete()
	{ 
		return super.isComplete();
	}
	
	 (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#isSuccess()
	 
	public boolean isSuccess()
	{
		return super.isSuccess();
	}*/
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback#onComplete()
	 */
	public void onComplete() 
	{
		isSuccess = false;
		if (!isError() && !isFault()) {
			try {
				responsePayload = soapProcessor.processSOAPResponse(this);
				isSuccess = true;
			} catch (Exception e) {
				onError(e);
			}
		}
		isComplete = true;
	}
	
	/**
	 * @return
	 */
	public IHESOAPResponsePayload getResponsePayload()
	{
		return responsePayload;
	}

}
