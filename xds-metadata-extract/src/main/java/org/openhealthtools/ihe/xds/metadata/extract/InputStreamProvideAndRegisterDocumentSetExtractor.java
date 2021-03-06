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
package org.openhealthtools.ihe.xds.metadata.extract;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.ihe.xds.metadata.DocumentRoot;
import org.openhealthtools.ihe.xds.metadata.MetadataPackage;
import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;
import org.openhealthtools.ihe.xds.metadata.util.MetadataResourceFactoryImpl;

/**
 * Extracts metadata from a metadata.xsd conformant InputStream and
 * populates an instance of a ProvideAndRegisterDocumentSet.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class InputStreamProvideAndRegisterDocumentSetExtractor implements
		ProvideAndRegisterDocumentSetExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "STREAM_PRDS_EXTR";

	/** Logger */
	private static final Logger logger = Logger.getLogger(InputStreamProvideAndRegisterDocumentSetExtractor.class);
	
	/** InputStream to extract metadata from */
	private InputStream provideAndRegisterInputStream;
	
	
	/**
	 * Creates an extractor for the InputStream given. InputStream must contain a single instance of 
	 * a ProvideAndRegisterDocumentSetType conformant to the metadata.xsd.
	 * @param provideAndRegisterInputStream
	 */
	public InputStreamProvideAndRegisterDocumentSetExtractor(InputStream provideAndRegisterInputStream) {
		this.provideAndRegisterInputStream = provideAndRegisterInputStream;
	}


	/** 
	 * Renders a ProvideAndRegisterDocumentSetType object from a InputStream containing a single instance of
	 * a ProvideAndRegisterDocumentSetType conformant to the metadata.xsd.
	 * @throws MetadataExtractionException 
	 * @see org.openhealthtools.ihe.xds.metadata.extract.ProvideAndRegisterDocumentSetExtractor#extract()
	 */
	public ProvideAndRegisterDocumentSetType extract() throws MetadataExtractionException {		
		// load package (EMF)
		if(logger.isDebugEnabled()){
			logger.debug("Loading MetadataPackage.");
		}
		MetadataPackage metadataPackage = MetadataPackage.eINSTANCE;
		
		// load resources
		if(logger.isDebugEnabled()){
			logger.debug("Loading Resources.");
		}
		Resource resource = new MetadataResourceFactoryImpl().createResource(URI.createURI(MetadataPackage.eNS_URI));
		try {
			resource.load(this.provideAndRegisterInputStream, null);
		} catch (IOException e) {
			logger.error("IOException while loading Resources from InputStream.", e);
			throw new MetadataExtractionException("IOException while loading Resources from InputStream.",e);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Creating ProvideAndRegisterDocumentSet metadata with object from InputStream " + this.provideAndRegisterInputStream);
		}
		EList list = resource.getContents();
		DocumentRoot root = (DocumentRoot) list.get(0);
		ProvideAndRegisterDocumentSetType provideAndRegister = root.getProvideAndRegisterDocumentSet();
		
		// unload resources
		// FIXME - unloading resources will create and eProxy to the returned value, ie. NO DATA.
/*		if(logger.isDebugEnabled()){
			logger.debug("Unloading Resources.");
		}
		//resource.unload();
*/
		return provideAndRegister;
	}
}
