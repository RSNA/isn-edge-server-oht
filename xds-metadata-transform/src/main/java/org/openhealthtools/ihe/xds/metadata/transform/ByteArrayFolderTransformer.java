/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.openhealthtools.ihe.xds.metadata.transform;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.ihe.xds.metadata.DocumentRoot;
import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.MetadataPackage;
import org.openhealthtools.ihe.xds.metadata.util.MetadataResourceFactoryImpl;

/**
 * Class containing utility methods to transform XDS Folder
 * metadata to a metadata.xsd conformant ByteArray.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class ByteArrayFolderTransformer implements FolderTransformer {
	
	/** Descriptor for Transformer */
	public static final String DESCRIPTOR = "BYTE_FOL_XFRMR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(ByteArrayFolderTransformer.class);
	
	/** byte array to transform metadata to */
	private byte[] folderByteArray;
	
	/**
	 * Returns the byte array containing a single instance of
	 * a FolderType conformant to the metadata.xsd. Returns null if the
	 * transformation has not been executed, or had failed.
	 * @return the folderByteArray
	 */
	public byte[] getFolderByteArray() {
		return folderByteArray;
	}

	/** 
	 * Renders a byte array containing a single instance of
	 * a FolderType conformant to the metadata.xsd.
	 * @throws MetadataTransformationException 
	 * @throws MetadataTransformationException
	 *  @see org.openhealthtools.ihe.xds.metadata.transform.FolderTransformer#transform(org.openhealthtools.ihe.xds.metadata.FolderType)
	 */
	public void transform(FolderType folder) throws MetadataTransformationException {
		// set up the document root
		if(logger.isDebugEnabled()){
			logger.debug("Composing DocumentRoot");
		}
		DocumentRoot root = MetadataFactory.eINSTANCE.createDocumentRoot();
		root.setFolder(folder);
		
		// set up the metadata package
		if(logger.isDebugEnabled()){
			logger.debug("Loading MetadataPackage.");
		}
		MetadataPackage packageInstance = MetadataPackage.eINSTANCE;
		// save  resources
		if(logger.isDebugEnabled()){
			logger.debug("Saving Resources.");
		}
		Resource resources = (new MetadataResourceFactoryImpl().createResource(URI.createURI(MetadataPackage.eNS_URI)));	
		resources.getContents().add(root);

		ByteArrayOutputStream bos = null;
		try {
			try{
				bos= new ByteArrayOutputStream();
				resources.save(bos, null);
				this.folderByteArray = bos.toByteArray();
				if(logger.isDebugEnabled()){
					logger.debug("Saved DocumentEntry metadata to byte array");
				}
			}
			finally{
				bos.close();
			}
		} catch (IOException e) {
			logger.error("IOException while saving Resources to ByteArray.", e);
			throw new MetadataTransformationException("IOException while saving Resources to ByteArray.",e);
		}
		
		// unload resources
		// FIXME - unloading resources will create and eProxy to the returned value, ie. NO DATA.
/*		if(logger.isDebugEnabled()){
			logger.debug("Unloading Resources.");
		}
		//resource.unload();
*/
	}



}
