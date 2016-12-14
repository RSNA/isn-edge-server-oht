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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  @author Matt
 *  @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class XDSDocumentFromFile extends XDSDocumentFromStream 
{
	/**
	 * 
	 */
	private File fd;
	
	/**
	 * @param descriptor
	 * @param fileName
	 * @throws IOException 
	 */
	public XDSDocumentFromFile(DocumentDescriptor descriptor, String fileName) throws IOException
	{
		this(descriptor, new File(fileName));
	}
	
	/**
	 * @param descriptor
	 * @param file
	 * @throws IOException 
	 */
	public XDSDocumentFromFile(DocumentDescriptor descriptor, File file) throws IOException
	{
		super(descriptor, new FileInputStream(file));
		this.fd = file;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.document.XDSDocument#getCanonicalPath()
	 */
	public String getCanonicalPath() 
	{
		try {
			return fd.getCanonicalPath();
		} catch (Exception e) {
			
		}
		return null;
	}
}
