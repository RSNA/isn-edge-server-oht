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
package org.openhealthtools.ihe.xds.response.impl;

import org.openhealthtools.ihe.xds.response.XDSErrorListType;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.response.XDSStatusType;

/**
 * Abstract implementation of XDS Response Type.  This implementation wraps a 
 * root XDS Response Type model object and contains delegates to access 
 * the various aspects of that object.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public abstract class XDSResponseTypeImpl 
implements XDSResponseType
{	
	protected XDSErrorListType errorList;
	
	protected static final XDSStatusType STATUS_EDEFAULT = XDSStatusType.SUCCESS_LITERAL;

	protected XDSStatusType status = STATUS_EDEFAULT;
	
	
	public XDSResponseTypeImpl()
	{
//		this(null);
	}
	
	/**
	 * Default constructor, takes a response model object
	 * @param responseObject
	 */
//	public XDSResponseTypeImpl(XDSResponseType responseObject)
//	{
//		//this.responseObject = responseObject;
//	}
	
	/**
	 * Gets the underlying XDS Response Type model instance
	 * @return
	 */
//	public XDSResponseType getModelObject()
//	{
//		return responseObject;
//	}
	
	/**
	 * Sets the underlying XDS Response Type model instance
	 * @param responseObject
	 */
//	protected void setModelObject(XDSResponseType responseObject)
//	{
//		this.responseObject = responseObject;
//	}
	
	/**
	 * Returns whether the response has been fully processed.  This must
	 * be implemented by the final implementation and is dependent on 
	 * the type of transaction (synchronous, asynchronous).
	 * 
	 * @return Whether the response has been processed.
	 */
	protected abstract boolean isProcessed();
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSResponseType#getCaughtException()
	 */
	public Throwable getCaughtException()
	{
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSResponseType#getErrorList()
	 */
	public XDSErrorListType getErrorList() 
	{
		return errorList;
		
//		if (null == getModelObject()) {
//			return null;
//		}
//		return getModelObject().getErrorList();
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSResponseType#getStatus()
	 */
	public XDSStatusType getStatus() 
	{
		return this.status;
	
//		if (null == getModelObject()) {
//			return null;
//		}
//		return getModelObject().getStatus();
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSResponseType#setErrorList(org.openhealthtools.ihe.xds.response.model.XDSErrorListType)
	 */
	public void setErrorList(XDSErrorListType value) 
	{
		this.errorList = value;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSResponseType#setStatus(org.openhealthtools.ihe.xds.response.model.XDSStatusType)
	 */
	public void setStatus(XDSStatusType value) 
	{
		this.status = value;
	}

}
