/*******************************************************************************
 * Copyright (c) 2006,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.xds.document;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;


/**
 *  Manages a document to be submitted to the XDS Repository.
 *  Holds a reference to associated metadata and a document descriptor.
 *  @version $Revision: 1.3 $
 *  @author <a href="seknoop@us.ibm.com">Sarah Knoop </a>
 *  @author <a href="glenn@almaden.ibm.com">Glenn Deen</a>
 *  @since IHII Phase 2
 *  @deprecated See org.openhealthtools.ihe.xds.document.XDSDocument class.
 */
public class Document extends XDSDocument
{

    /**
     * Logger for the class
     */
    private static final Logger logger = Logger.getLogger(Document.class);

    /**
     * Descriptor of the document. See @see org.openhealthtools.ihe.xds.source.document.DocumentDescriptor
     */
    private DocumentDescriptor descriptor;

    /**
     * The canonical path on the file system to the document.
     */
    private String canonicalPath;

    /**
     * The reference to XDS document entry metadata for the document
     */
    private String documentEntryUUID;

    /**
     *
     */
    private String documentUniqueId;
    /**
     *
     */
    private String homeCommunityId;
    /**
     *
     */
    private String repositoryUniqueId;

    private InputStream buf;
    
    public InputStream getStream()
    {
    	return buf;
    }
    
    public Document(InputStream buf, 
    		DocumentDescriptor descriptor,
    		String mimeType, 
    		String documentUniqueId, 
    		String repositoryUniqueId, 
    		String homeCommunityId)
    {
    	super(descriptor);
    	this.buf = buf;
        if(null == descriptor) {
        	this.descriptor = DocumentDescriptor.UNKNOWN;
        } else {
        	this.descriptor = descriptor;
        }
        this.documentUniqueId = documentUniqueId;
        this.homeCommunityId = homeCommunityId;
        this.repositoryUniqueId = repositoryUniqueId;
        

    }
    
    public Document(InputStream buf, 
    		DocumentDescriptor descriptor)
    {
    	this(buf,descriptor,null,null,null,null);
    }
    
    
    /**
     * Construct a new Document object from the given File object
     * @param file
     * @param descriptor @see org.openhealthtools.ihe.xds.source.document.DocumentDescriptor
     * @throws FileNotFoundException
     * @throws IOEXCEPTION
     */
    public Document(File file, DocumentDescriptor descriptor) throws FileNotFoundException, IOException
    {
    	this(new FileInputStream(file),descriptor);

        if (logger.isDebugEnabled()) logger.debug("Created new Document from File="
        		+file.getAbsolutePath()+" Descriptor="+this.descriptor.toString()
        		+ " MimeType="+this.descriptor.getMimeType());
    }

    /**
     * Construct a new Document object, given path
     * @param source path to file on system
     * @param descriptor @see org.openhealthtools.ihe.xds.source.document.DocumentDescriptor
     * @throws FileNotFoundException
     * @throws IOEXCEPTION
     */
    public Document(String source, DocumentDescriptor descriptor) throws FileNotFoundException, IOException
    {
    	this(new File(source), descriptor);
    }


    /**
     * Construct a new Document object from the contents of the byte array holding a
     * document of type specified in the docType.
     * @param documentByteArray
     * @param descriptor @see org.openhealthtools.ihe.xds.source.document.DocumentDescriptor
     */
    public Document(byte[] documentByteArray,  DocumentDescriptor descriptor)
    {
    	this(new ByteArrayInputStream(documentByteArray), descriptor);
        if(descriptor == null){
        	this.descriptor = DocumentDescriptor.UNKNOWN;
        }
        else{
        	this.descriptor = descriptor;
        }
    }


    public Document(byte[] documentByteArray, String mimeType, String documentUniqueId, String repositoryUniqueId, String homeCommunityId)
    {
        this(new ByteArrayInputStream(documentByteArray),
        		null, mimeType, documentUniqueId, repositoryUniqueId, homeCommunityId);
    }

    /**
     * Get the canonical path to the document. See {@link File#getCanonicalPath()}
     * @return the path (returns the empty string "" if no path is define. For example if the document
     * was provided as an in memory object, and not read from disk.
     */
    public String getCanonicalPath()
    {
        return this.canonicalPath;
    }

    /**
     * get the descriptor {@link org.openhealthtools.ihe.xds.document.DocumentDescriptor} of the document.
     * @return document descriptor
     */
    public DocumentDescriptor getDescriptor()
    {
        return this.descriptor;
    }

    /**
     * return the internal document data
     * @return String representation of the raw document
     */
//    public byte[] getDocumentData()
//    {
//        return this.documentData;
//    }
//
//    public String getDocumentDataAsString()
//    {
//        return new String(this.documentData);
//    }

    /**
	 * @return the documentEntryUUID
	 */
	public String getDocumentEntryUUID() {
		return documentEntryUUID;
	}

	/**
	 * @param documentEntryUUID the documentEntryUUID to set
	 */
	public void setDocumentEntryUUID(String documentEntryUUID) {
		this.documentEntryUUID = documentEntryUUID;
	}

	/**
     * Tests if the given document holds the same document as the class instance.
     * A result of true requires that both the Type of the document, and the byte level contents
     * of the two document match.
     * @param document
     * @return true if the Document instances hold the same source document.
     */
//    public boolean equals(Document document)
//    {
//         if ( !document.descriptor.equals(this.descriptor)) return false;  // they don't have the same type -they can't match
//
//         if ( this.getDocumentDataAsString().equals( document.getDocumentDataAsString())) return true;
//
//         return false;
//
//    }

    public String toString()
    {
        return Document.class+ ":" + "Document Descriptor="+this.descriptor.toString() + "; Document ID: " + this.documentUniqueId + "; Repository: " + this.repositoryUniqueId;
    }

    public String getDocumentUniqueId() 
    {
		return documentUniqueId;
	}

	public void setDocumentUniqueId(String documentUniqueId) 
	{
		this.documentUniqueId = documentUniqueId;
	}

	public String getHomeCommunityId() 
	{
		return homeCommunityId;
	}

	public void setHomeCommunityId(String homeCommunityId) 
	{
		this.homeCommunityId = homeCommunityId;
	}

	public String getRepositoryUniqueId() 
	{
		return repositoryUniqueId;
	}

	public void setRepositoryUniqueId(String repositoryUniqueId) 
	{
		this.repositoryUniqueId = repositoryUniqueId;
	}

}