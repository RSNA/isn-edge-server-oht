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

import java.util.Collections;
import java.util.List;

import org.openhealthtools.ihe.xds.document.XDSDocument;
import org.openhealthtools.ihe.xds.response.XDSRetrieveResponseType;

/**
 * Abstract implementation of XDS Retrieve Response Type.
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public abstract class XDSRetrieveResponseTypeImpl extends XDSResponseTypeImpl 
implements XDSRetrieveResponseType
{
	/**
	 * The list of attachments stored by the retrieve response
	 */
	private List<XDSDocument> attachments;
	
	public XDSRetrieveResponseTypeImpl()
	{
		super();
	}
	
	/**
	 * Abstract implementation of XDS Retrieve Document response type
	 * @param responseObject Underlying response model object to use
	 */
//	public XDSRetrieveResponseTypeImpl(XDSResponseType responseObject) 
//	{
//		super(responseObject);
//	}

	/**
	 * Set the list of attachments 
	 * @param attachments List of attachments for this responect
	 */
	protected void setAttachments(List<XDSDocument> attachments)
	{
		this.attachments = attachments;
	}

	/**
	 * Returns the list of attachments in their standard form.
	 * @return Mutable list of attachments
	 */
	protected List<XDSDocument> getMutableAttachments()
	{
		return attachments;
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSRetrieveResponseType#getAttachments()
	 */
	public List<XDSDocument> getAttachments()
	{
		if (!isProcessed()) {
			return null;
		}
		if (null == attachments) {
			return null;
		}
		return Collections.unmodifiableList(attachments);
	}

}
