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

import org.openhealthtools.ihe.utils.IHEException;

/**
 * Used to indicate a SOAP Messaging problem or error in the IHE SOAP client
 * @author <a href="mailto:venkataraman.sethuraman@sage.com">Venkataraman Sethuraman</a>
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class IHESoapClientException extends IHEException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1155404009198833426L;

	protected IHESoapClientException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	protected IHESoapClientException(String arg0) {
		super(arg0);
	}

	protected IHESoapClientException(Throwable arg0) {
		super(arg0);
	}
}
