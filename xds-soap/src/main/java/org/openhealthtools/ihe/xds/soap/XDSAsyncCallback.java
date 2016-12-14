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

package org.openhealthtools.ihe.xds.soap;

import java.net.URI;

import org.apache.axis2.context.MessageContext;
import org.openhealthtools.ihe.common.ws.client.IHEAsyncCallbackExt;

/**
 * Extended asynchronous XDS callback handler for locking and binding
 * to XDS-asynchronous responses.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class XDSAsyncCallback extends IHEAsyncCallbackExt
{
	/**
	 * 
	 */
	private XDSSoapClient soapProcessor;
	
	/**
	 * 
	 */
	private XDSSOAPResponsePayload responsePayload;

	/**
	 * @param soapProcessor
	 */
	public XDSAsyncCallback(XDSSoapClient soapProcessor)
	{
		super(soapProcessor);
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
	public XDSSOAPResponsePayload getResponsePayload()
	{
		return responsePayload;
	}

}
