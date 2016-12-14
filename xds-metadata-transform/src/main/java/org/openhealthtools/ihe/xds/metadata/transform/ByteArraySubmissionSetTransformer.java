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
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.MetadataPackage;
import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;
import org.openhealthtools.ihe.xds.metadata.util.MetadataResourceFactoryImpl;

/**
 * Class containing utility methods to transform XDS submission set
 * metadata to a metadata.xsd conformant byte array.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class ByteArraySubmissionSetTransformer implements SubmissionSetTransformer {
	
	/** Descriptor for Transformer */
	public static final String DESCRIPTOR = "BYTE_SS_XFRMR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(ByteArraySubmissionSetTransformer.class);
	
	/** Byte Array to transform metadata to */
	private byte[] submissionSetByteArray;
	
	
	/**
	 * Returns the byte array containing a single instance of
	 * a SubmissionSetType conformant to the metadata.xsd. Returns null if the
	 * transformation has not been executed, or had failed.
	 * @return the submissionSetByteArray
	 */
	public byte[] getSubmissionSetByteArray() {
		return submissionSetByteArray;
	}



	/** 
	 * Renders a byte array containing a single instance of
	 * a SubmissionSetType conformant to the metadata.xsd.
	 * @throws MetadataTransformationException
	 * @see org.openhealthtools.ihe.xds.metadata.transform.SubmissionSetTransformer#transform(org.openhealthtools.ihe.xds.metadata.SubmissionSetType)
	 */
	public void transform(SubmissionSetType subSet) throws MetadataTransformationException{
		// set up the document root
		if(logger.isDebugEnabled()){
			logger.debug("Composing DocumentRoot");
		}
		DocumentRoot root = MetadataFactory.eINSTANCE.createDocumentRoot();
		root.setSubmissionSet(subSet);
		
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
				this.submissionSetByteArray = bos.toByteArray();
				if(logger.isDebugEnabled()){
					logger.debug("Saved DocumentEntry metadata to byte array");
				}
			}
			finally {
				bos.close();
			}
		} catch (IOException e) {
			logger.error("IOException while saving Resources to byte array.", e);
			throw new MetadataTransformationException("IOException while saving Resources to byte array.",e);
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
