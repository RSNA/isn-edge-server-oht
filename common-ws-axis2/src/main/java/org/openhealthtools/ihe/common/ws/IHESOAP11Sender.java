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

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.soap.SOAP11Constants;

/**
 * Sender for properly forming and sending SOAP messages conforming to SOAP 1.1 without attachments.
 * Designed for use with IHE transactions.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public class IHESOAP11Sender extends AbstractIHESOAPSender {

	/**
	 * Creates a new SOAP 1.1 Sender.  Use the OHFSOAPSenderFactory to get instance.
	 * @throws IHESOAPException
	 */
	protected IHESOAP11Sender()
	{
		super();
		getOptions().setSoapVersionURI(SOAP11Constants.SOAP_ENVELOPE_NAMESPACE_URI);
		setSOAPFactory(OMAbstractFactory.getSOAP11Factory());
	}

}
