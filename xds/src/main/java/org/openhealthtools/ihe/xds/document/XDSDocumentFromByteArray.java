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

/**
 * @author Matt
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class XDSDocumentFromByteArray extends XDSDocument
{
	/**
	 * 
	 */
	protected byte[] data;
	
	//protected ByteArrayInputStream stream;
	
	/**
	 * @param descriptor
	 * @param document
	 */
	public XDSDocumentFromByteArray(DocumentDescriptor descriptor, byte[] document)
	{
		super(descriptor);
		this.data = document;
	}
	
	/** returns a new input stream from the bytes
	 * @see org.openhealthtools.ihe.xds.document.XDSDocument#getStream()
	 */
	public ByteArrayInputStream getStream()
	{
/*		if (null == stream) {
			stream = new ByteArrayInputStream(data); 
		}
		return stream;
		
		*/
		return new ByteArrayInputStream(data);
	}
	
	/**
	 * @return
	 */
	public byte[] getBytes()
	{
		return data;
	}

}
