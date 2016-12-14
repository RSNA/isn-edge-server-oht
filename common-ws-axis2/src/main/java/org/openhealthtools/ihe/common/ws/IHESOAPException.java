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

package org.openhealthtools.ihe.common.ws;

import org.openhealthtools.ihe.utils.IHEException;

/**
 * Exception  to consolidate and wrap various exceptions that may be
 * thrown in the process of sending a SOAP message.  May represent SOAP faults,
 * network failures, security failures, serialization failures, etc.  User
 * should closely examine the cause event.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class IHESOAPException extends IHEException 
{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 8375773849693086820L;

	/**
	 * Exception with a specific message
	 * @param 	message	Error message
	 */
	public IHESOAPException(String message)
	{
		super(message);
	}
	
	/**
	 * Exception wrapping another exception with a specific message
	 * @param 	message	Error message
	 * @param 	cause	Causing exception event
	 */
	public IHESOAPException(String message, Throwable cause)
	{
		super(message,cause);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	public String toString()
	{
		String response = super.toString();
		if (getCause() != null) {
			response = response.concat("  [Caused by "+ getCause().toString() +"]");
		}
		return response;
	}
}
