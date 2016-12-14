/*******************************************************************************
 * Copyright (c) 2007,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.xds;

public interface XDSConstants {

	public static final String IHE_XDSB_NAMESPACE_URI = "urn:ihe:iti:xds-b:2007";
	
	public static final String IHE_XDSB_NAMESPACE_PREFIX = "xdsb";
	
	public static final String RETRIEVE_DOCUMENT_SET_ACTION = "urn:ihe:iti:2007:RetrieveDocumentSet";
	
	// SEK - IHE 2009 ITI CP 420 - no longer distinguishes sync/async in the action name
	//public static final String RETRIEVE_DOCUMENT_SET_ASYNC_ACTION = "urn:ihe:iti:2007:RetrieveDocumentSetAsync";
	
	public static final String REGISTRY_STORED_QUERY_ACTION = "urn:ihe:iti:2007:RegistryStoredQuery";
	
	// SEK - IHE 2009 ITI CP 420 - no longer distinguishes sync/async in the action name
	//public static final String REGISTRY_STORED_QUERY_ASYNC_ACTION = "urn:ihe:iti:2007:RegistryStoredQueryAsync";
	
	public static final String PROVIDE_AND_REGISTER_DOCUMENT_SET_ACTION = "urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b";
	
	// SEK - IHE 2009 ITI CP 420 - no longer distinguishes sync/async in the action name
	//public static final String PROVIDE_AND_REGISTER_DOCUMENT_SET_ASYNC_ACTION = "urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-bAsync";
	
	public static final String MULTI_PATIENT_STORED_QUERY_ACTION = "urn:ihe:iti:2009:MultiPatientStoredQuery";
	
	/**
	 * namespace prefix for EbXML 3.0 responses from Oasis (IHE 2008 CP 301)
	 */
	public static final String OASIS_EBXML_3_0RESPONSE_STATUS_PREFIX = "urn:oasis:names:tc:ebxml-regrep:ResponseStatusType:";

	/**
	 * namespace prefix for EbXML 3.0 responses from IHE (IHE 2008 CP 301)
	 */
	public static final String IHE_EBXML_3_0RESPONSE_STATUS_PREFIX = "urn:ihe:iti:2007:ResponseStatusType:";

	/**
	 * namespace prefix for EbXML 3.0 errors
	 */
	public static final String EBXML_3_0ERROR_SEVERITY_PREFIX = "urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:";
	
}
