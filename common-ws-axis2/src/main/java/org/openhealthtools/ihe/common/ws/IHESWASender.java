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

import org.apache.axis2.Constants;

/**
 * Sender for properly forming and sending SOAP messages conforming to SOAP 1.1 and 
 * SOAP with Attachments (SwA) standards.  Designed for use with IHE transactions.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class IHESWASender extends IHESOAP11Sender implements IHESOAPAttachmentSender {
	
	/**
	 * Creates a new SOAP 1.1 / SOAP with Attachments Sender.  Use the OHFSOAPSenderFactory to get instance.
	 * @throws IHESOAPException
	 */
	protected IHESWASender()
	{
		super();
		getOptions().setProperty(Constants.Configuration.ENABLE_MTOM, Constants.VALUE_FALSE);
		getOptions().setProperty(Constants.Configuration.ENABLE_SWA, Constants.VALUE_TRUE);
	}
}
