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

package org.openhealthtools.ihe.xds.soap;

import javax.xml.namespace.QName;

import org.openhealthtools.ihe.common.ws.client.IHESoapConstants;

/**
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 
 */
public class XDSSoapConstants extends IHESoapConstants
{

	/**
	 * 
	 */
	public static final String IHE_XDSB_NAMESPACE_URI = "urn:ihe:iti:xds-b:2007";
	
	/**
	 * 
	 */
	public static final String RS_NAMESPACE_URI = "urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0";
	
	/**
	 * 
	 */
	public static final QName REGISTRY_RESPONSE_QNAME = new QName(RS_NAMESPACE_URI, "RegistryResponse");
	
	/**
	 * 
	 */
	public static final QName RETRIEVE_DOCUMENT_SET_RESPONSE_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "RetrieveDocumentSetResponse");
	
	/**
	 * 
	 */
	public static final QName DOCUMENT_RESPONSE_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "DocumentResponse");
	
	/**
	 * 
	 */
	public static final QName DOCUMENT_UNIQUE_ID_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "DocumentUniqueId");
	public static final QName NEW_DOCUMENT_UNIQUE_ID_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "NewDocumentUniqueId");
	
	/**
	 * 
	 */
	public static final QName HOME_COMMUNITY_ID_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "HomeCommunityId");
	
	/**
	 * 
	 */
	public static final QName REPOSITORY_UNIQUE_ID_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "RepositoryUniqueId");
	public static final QName NEW_REPOSITORY_UNIQUE_ID_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "NewRepositoryUniqueId");
	
	/**
	 * 
	 */
	public static final QName IHE_MIME_TYPE_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "mimeType");
	
	
	/**
	 * 
	 */
	public static final QName DOCUMENT_BODY_QNAME = new QName(IHE_XDSB_NAMESPACE_URI, "Document");

}
