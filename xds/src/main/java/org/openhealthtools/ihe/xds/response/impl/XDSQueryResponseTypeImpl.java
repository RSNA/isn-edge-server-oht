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
package org.openhealthtools.ihe.xds.response.impl;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;
import org.openhealthtools.ihe.xds.response.DocumentEntryResponseType;
import org.openhealthtools.ihe.xds.response.FolderResponseType;
import org.openhealthtools.ihe.xds.response.SubmissionSetResponseType;
import org.openhealthtools.ihe.xds.response.XDSQueryResponseType;

/**
 * Abstract implementation of XDS Response Query Type.  This implementation wraps a 
 * root XDS Query Response Type model object and contains delegates to access 
 * the various aspects of that object, as an extension of a standard XDS Response Type model.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public abstract class XDSQueryResponseTypeImpl extends XDSResponseTypeImpl implements XDSQueryResponseType
{
	// Input types for 
	protected List<ObjectRefType> references;

	protected List<DocumentEntryResponseType> documentEntryResponses;

	protected List<FolderResponseType> folderResponses;

	protected List<SubmissionSetResponseType> submissionSetResponses;

	protected List<AssociationType1> associations;
	
	public XDSQueryResponseTypeImpl()
	{
		super();
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSQueryResponseType#getAssociations()
	 */
	public List<AssociationType1> getAssociations() 
	{
		if (null == associations) {
			associations = new ArrayList<AssociationType1>();
		}
		return associations;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSQueryResponseType#getDocumentEntryResponses()
	 */
	public List<DocumentEntryResponseType> getDocumentEntryResponses() 
	{
		if (null == documentEntryResponses) {
			documentEntryResponses = new ArrayList<DocumentEntryResponseType>();
		}
		return documentEntryResponses;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSQueryResponseType#getFolderResponses()
	 */
	public List<FolderResponseType> getFolderResponses() 
	{
		if (null == folderResponses) {
			folderResponses = new ArrayList<FolderResponseType>();
		}
		return folderResponses;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSQueryResponseType#getReferences()
	 */
	public List<ObjectRefType> getReferences() 
	{
		if (null == references) {
			references = new ArrayList<ObjectRefType>();
		}
		return references;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.response.XDSQueryResponseType#getSubmissionSetResponses()
	 */
	public List<SubmissionSetResponseType> getSubmissionSetResponses() 
	{
		if (null == submissionSetResponses) {
			submissionSetResponses = new ArrayList<SubmissionSetResponseType>();
		}
		return submissionSetResponses;
	}
}
