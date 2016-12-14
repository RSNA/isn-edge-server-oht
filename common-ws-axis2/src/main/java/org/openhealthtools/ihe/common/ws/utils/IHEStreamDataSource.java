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

package org.openhealthtools.ihe.common.ws.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataSource;

/**
 * Implementation of Java Activation Data Source for use
 * with a generic, implementation-dependent input stream.
 * Supports output only, does not have the capability to 
 * provide an output stream.
 * 
 * @since  OHT IHE 1.1.0
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class IHEStreamDataSource implements DataSource 
{

	/**
	 * 
	 */
	private static final String DS_NAME = "IHEStreamDataSource";
	
	/**
	 * Input stream to use
	 */
	private InputStream stream;
	
	/**
	 * Content type for input stream
	 */
	private String contentType;
	
	/**
	 * Data source constructor, requires a valid stream and content type
	 * @param stream Input stream for backing data source
	 * @param contentType Content/MIME type for the input stream
	 */
	public IHEStreamDataSource(InputStream stream, String contentType)
	{
		this.stream = stream;
		this.contentType = contentType;
	}
	
	/* (non-Javadoc)
	 * @see javax.activation.DataSource#getContentType()
	 */
	public String getContentType() 
	{
		return contentType;
	}

	/* (non-Javadoc)
	 * @see javax.activation.DataSource#getInputStream()
	 */
	public InputStream getInputStream() throws IOException 
	{
		return stream;
	}

	/* (non-Javadoc)
	 * @see javax.activation.DataSource#getName()
	 */
	public String getName() 
	{
		return DS_NAME;
	}

	/* (non-Javadoc)
	 * @see javax.activation.DataSource#getOutputStream()
	 */
	public OutputStream getOutputStream() throws IOException 
	{
		throw new IOException("OutputStream Not Supported");
	}
}
