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

import org.openhealthtools.ihe.xds.response.impl.XDSResponseTypeImpl;

/**
 * Implementation of Synchronous XDS.a/XDS.b response handling for
 * Provide And Register Document Set.  This implementation is 
 * simply a wrapper for the model object created by XDS Response parsing.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class SynchronousXDSResponseType extends XDSResponseTypeImpl
{
	public SynchronousXDSResponseType()
	{
		super();
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSResponseType#isComplete()
	 */
	public boolean isComplete()
	{
		return true;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.impl.AbstractXDSResponseType#isProcessed()
	 */
	protected boolean isProcessed() 
	{
		return true;
	}
}
