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

import java.net.URI;

import org.apache.axiom.soap.SOAPEnvelope;
import org.openhealthtools.ihe.common.ws.async.IHEAsyncCallback;

/**
 * Interface for the OHF/IHE SOAP sender without attachment support.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public interface IHESOAPSender {

	/**
	 * Sends a well-formed SOAP Envelope to a designated Web service target endpoint.  
	 * Takes care of socket construction and serialization as well as deserialization on the return.
	 * Returns a well-formed SOAP Envelope representing the server response.
	 * In the event of a fault, a wrapped OHFSOAPException is thrown.
	 * @param 	message	A well-formed SOAP Envelope to send
	 * @return	A well-formed SOAP Envelope representing the response
	 * @throws 	IHESOAPException
	 */
	public SOAPEnvelope send(URI endpoint, SOAPEnvelope message) throws IHESOAPException;
	
	
	/**
	 * Sends a well-formed SOAP Envelope to a designated Web service target endpoint.  Additionally it 
	 * includes a specified SOAP Action for SOAP and WS-Addressing purposes.
	 * Takes care of socket construction and serialization as well as deserialization on the return.
	 * Returns a well-formed SOAP Envelope representing the server response.
	 * In the event of a fault, a wrapped OHFSOAPException is thrown.
	 * @param 	message	A well-formed SOAP Envelope to send
	 * @param   action	SOAP Action to use for the transaction
	 * @return	A well-formed SOAP Envelope representing the response
	 * @throws 	IHESOAPException
	 */
	public SOAPEnvelope send(URI endpoint, SOAPEnvelope message, String action) throws IHESOAPException;	

	/**
	 * Creates a new SOAP envelope with settings specific to the sender being used.
	 * @return	A new SOAP Envelope
	 */
	public SOAPEnvelope createEnvelope();
	
	public IHEAsyncCallback sendAsync(URI endpoint, SOAPEnvelope envelope, String action) throws IHESOAPException;
	
	public IHEAsyncCallback sendAsync(URI endpoint, SOAPEnvelope envelope, String action, IHEAsyncCallback callback) throws IHESOAPException;
	
}
