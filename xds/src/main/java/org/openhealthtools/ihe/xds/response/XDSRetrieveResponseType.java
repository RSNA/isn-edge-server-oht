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
package org.openhealthtools.ihe.xds.response;

import java.util.List;
import java.util.Map;

import org.openhealthtools.ihe.xds.document.XDSDocument;

/**
 * Interface that defines the specification for responses from 
 * XDS transactions that retrieve documents.  Implementation extends
 * the standard XDS Response and adds accessors to get received 
 * documents/attachments and to get more than one exception that might've
 * been caught in the transaction.
 */
public interface XDSRetrieveResponseType extends XDSResponseType 
{
	/**
	 * Return the list of XDS Document attachments from the 
	 * response.
	 * @return The attachments received in a transaction
	 */
	public List<XDSDocument> getAttachments();	
	
	/**
	 * For multiple-transaction response wrappers, 
	 * return a map of caught exceptions or errors
	 * mapped to the respective transaction that 
	 * generated the exception.  Returns null
	 * if no exceptions were caught.
	 * 
	 * @return A map of transaction to exceptions.
	 */
	public Map<XDSRetrieveResponseType,Throwable> getCaughtExceptions();
	
	///////////////////////////////////// 
	// Delegate methods for EMF facade //
	/////////////////////////////////////
	// This interface does not further define any EMF instance
} 
