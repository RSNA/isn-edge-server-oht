/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.xds.soap;

import org.openhealthtools.ihe.common.ws.client.IHESoapClientException;

/**
 * Used to indicate a SOAP Messaging problem or error in the XDS SOAP client
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class XDSSoapClientException extends IHESoapClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5915618869785871851L;

	protected XDSSoapClientException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	protected XDSSoapClientException(String arg0) {
		super(arg0);
	}

	protected XDSSoapClientException(Throwable arg0) {
		super(arg0);
	}
}
