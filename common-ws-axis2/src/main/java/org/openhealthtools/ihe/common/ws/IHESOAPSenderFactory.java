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

/**
 * Factory for creating SOAP senders needed for specific IHE transactions.
 * Presently supports:
 *  - SOAP 1.1
 *  - SOAP 1.1 plus SOAP With Attachments (SwA) - XDS.a
 *  - SOAP 1.2 - PIX/PDQ v3
 *  - SOAP 1.2 plus Message-Transmission Optimized Mechanism (MTOM) - XDS.b
 *  
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class IHESOAPSenderFactory {

	/**
	 * Default Constructor
	 */
	public IHESOAPSenderFactory()
	{
	}
	
	/**
	 * Returns a SOAP 1.1 sender with SOAP With Attachments (SwA) support
	 * @return	SOAP1.1 + SWA Sender
	 * @throws 	IHESOAPException
	 */
	public static IHESOAPAttachmentSender getSWASender()
	{
		return new IHESWASender();
	}
	
	/**
	 * Returns a SOAP 1.2 sender with MTOM attachment support
	 * @return	SOAP 1.2 + MTOM Sender
	 * @throws 	IHESOAPException
	 */
	public static IHESOAPAttachmentSender getMTOMSender()
	{
		return new IHEMTOMSender();
	}
	
	/**
	 * Returns a SOAP 1.1 sender with no attachment support
	 * @return 	SOAP 1.1 Sender
	 * @throws 	IHESOAPException
	 */
	public static IHESOAPSender getSOAP11Sender()
	{
		return new IHESOAP11Sender();
	}
	
	/**
	 * Returns a SOAP 1.2 sender with no attachment support
	 * @return	SOAP 1.2 sender
	 * @throws 	IHESOAPException
	 */
	public static IHESOAPSender getSOAP12Sender()
	{
		return new IHESOAP12Sender();
	}
}
