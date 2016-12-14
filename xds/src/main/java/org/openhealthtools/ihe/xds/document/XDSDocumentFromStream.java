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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;

/**
 * @author Matt
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class XDSDocumentFromStream extends XDSDocument 
{
	private static Logger logger = Logger.getLogger(XDSDocumentFromStream.class);
	
	/*
	 * input stream containing the document
	 */
	// private InputStream stream;
	
	/**
	 * buffer for document input stream copies
	 */
	private ByteArrayOutputStream baos;
	
	
	/**
	 * @param descriptor for the document
	 * @param documentStream containing the document
	 * @throws IOException 
	 */
	public XDSDocumentFromStream(DocumentDescriptor descriptor, InputStream documentStream) throws IOException
	{
		super(descriptor);
		
		// Copy the stream in buffer
		if(this.baos == null && documentStream != null){
			baos = new ByteArrayOutputStream(); 
			int read; 
			try {
				// FIXME SEK - fix for Issue 122
				byte[] bytes = new byte[1024];
				while ((read = documentStream.read(bytes)) != -1){
					baos.write(bytes, 0, read);
					//baos.write(read);
				}
			} catch (IOException e) {
				logger.error("Unable to copy stream", e);
				baos = null;
				throw e;
			}
		}
		
		//this.stream = documentStream;
	}

	/** returns a copy of the input stream so it can be read again
	 * @return a copy of the input stream
	 * @see org.openhealthtools.ihe.xds.document.XDSDocument#getStream()
	 */
	public InputStream getStream() 
	{
		//return stream;
		return new ByteArrayInputStream(baos.toByteArray());
	}
}

