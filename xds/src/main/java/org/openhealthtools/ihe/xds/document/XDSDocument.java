/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds.document;

import java.io.InputStream;

/**
 * @author Matt
 *
 */
public abstract class XDSDocument
{
	/**
	 * 
	 */
	private DocumentDescriptor descriptor;
	
	/**
	 * 
	 */
	private String documentEntryUUID;
	
	/**
	 * 
	 */
	private String documentUniqueId;
	
	/**
	 * 
	 */
	private String repositoryUniqueId;
	
	/**
	 * 
	 */
	private String homeCommunityId;
	private String newDocumentUniqueId;
	private String newRepositoryUniqueId;
	
	
	/**
	 * @param descriptor
	 */
	public XDSDocument(DocumentDescriptor descriptor)
	{
		if (null == descriptor) {
			descriptor = DocumentDescriptor.UNKNOWN;
		}
		this.descriptor = descriptor;
	}
	
	/**
	 * @return
	 */
	public abstract InputStream getStream();

	/**
	 * @return
	 */
	public DocumentDescriptor getDescriptor() 
	{
		return descriptor;
	}

	/**
	 * @return
	 */
	public String getDocumentUniqueId() 
	{
		return documentUniqueId;
	}

	/**
	 * @param documentUniqueId
	 */
	public void setDocumentUniqueId(String documentUniqueId) 
	{
		this.documentUniqueId = documentUniqueId;
	}

	/**
	 * @return
	 */
	public String getRepositoryUniqueId() 
	{
		return repositoryUniqueId;
	}

	/**
	 * @param repositoryUniqueId
	 */
	public void setRepositoryUniqueId(String repositoryUniqueId) 
	{
		this.repositoryUniqueId = repositoryUniqueId;
	}

	/**
	 * @return
	 */
	public String getHomeCommunityId() 
	{
		return homeCommunityId;
	}

	/**
	 * @param homeCommunityId
	 */
	public void setHomeCommunityId(String homeCommunityId) 
	{
		this.homeCommunityId = homeCommunityId;
	}

	public String getNewDocumentUniqueId() {
		return newDocumentUniqueId;
	}

	public void setNewDocumentUniqueId(String newDocumentUniqueId) {
		this.newDocumentUniqueId = newDocumentUniqueId;
	}

	public String getNewRepositoryUniqueId() {
		return newRepositoryUniqueId;
	}

	public void setNewRepositoryUniqueId(String newRepositoryUniqueId) {
		this.newRepositoryUniqueId = newRepositoryUniqueId;
	}

	/**
	 * @return
	 */
	public String getCanonicalPath() 
	{
		return null;
	}

	/**
	 * @return
	 */
	public String getDocumentEntryUUID() 
	{
		return documentEntryUUID;
	}

	/**
	 * @param documentEntryUUID
	 */
	public void setDocumentEntryUUID(String documentEntryUUID) 
	{	
		this.documentEntryUUID = documentEntryUUID;
	}
	
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return getClass()+ ":" + "Document Descriptor="+this.descriptor.toString() + "; Document ID: " + this.documentUniqueId + "; Repository: " + this.repositoryUniqueId + (this.newDocumentUniqueId == null ? "" : "; NewDocumentUniqueId: " + newDocumentUniqueId) + (this.newRepositoryUniqueId == null ? "" : "; NewRepsitoryUniqueId: " + newRepositoryUniqueId);
    }


}
