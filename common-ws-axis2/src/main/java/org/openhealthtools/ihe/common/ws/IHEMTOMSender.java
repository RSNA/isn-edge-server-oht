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
 * Sender for properly forming and sending SOAP messages conforming to SOAP 1.2 and 
 * Message Transmission Optimization Mechanism (MTOM) standards.  Designed for use with IHE transactions.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class IHEMTOMSender extends IHESOAP12Sender implements IHESOAPAttachmentSender {

	/**
	 * Creates a new SOAP 1.2 / MTOM Sender.  Use the OHFSOAPSenderFactory to get instance.
	 * @throws IHESOAPException
	 */
	protected IHEMTOMSender()
	{
		super();
		getOptions().setProperty(Constants.Configuration.ENABLE_MTOM, Constants.VALUE_TRUE);
		getOptions().setProperty(Constants.Configuration.ENABLE_SWA, Constants.VALUE_FALSE);
	}

}
