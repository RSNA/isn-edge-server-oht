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

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.util.RegistryResourceFactoryImpl;
import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;

/**
 * Class containing utility methods to extract complete XDS
 * metadata from ebRIM 3.0 conformant InputStream.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0InputStreamProvideAndRegisterDocumentSetExtractor implements
		ProvideAndRegisterDocumentSetExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_3_0_STREAM_PRDS_EXTR";

	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0InputStreamProvideAndRegisterDocumentSetExtractor.class);
	
	/** InputStream to extract metadata from */
	private InputStream ebXMLmetadataInputStream;
	
	/**
	 * Creates an extractor for the InputStream given. InputStream must contain single instance of a SubmitObjectRequest.
	 * Must be conformant to the rs.xsd.
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * <br>
	 * IMPORTANT NOTE: We note that documents and folders with corresponding ExtrinsicObjects/RegistryPackages
	 * (respectively) in the current SubmitObjectRequest will appear on the appropriate associated document and folder
	 * lists for the submission set.  EbXML Associations that represent the linking of existing documents
	 * and existing folders to the current submission set will all appear on it's list of associated documents.
	 * This is because there is no way (currently) in the ebXML to distinguish 
	 * an existing folder from an existing document entry in this context.
	 * @param ebXMLmetadataInputStream InputStream conformant to modified rs.xsd populated with metadata values
	 */
	public EbXML_3_0InputStreamProvideAndRegisterDocumentSetExtractor(InputStream ebXMLmetadataInputStream) {
		this.ebXMLmetadataInputStream = ebXMLmetadataInputStream;
	}

	/** 
	 * Renders a ProvideAndRegisterDocumentSetType object from a InputStream containing a single instance of a 
	 * SubmitObjectRequest. Must be conformant to the rs.xsd.
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * @throws MetadataExtractionException 
	 * @see org.openhealthtools.ihe.xds.metadata.extract.ProvideAndRegisterDocumentSetExtractor#extract()
	 */
	public ProvideAndRegisterDocumentSetType extract() throws MetadataExtractionException{
		// load package (EMF)
		if(logger.isDebugEnabled()){
			logger.debug("Loading RegistryPackage.");
		}
		RegistryPackage metadataPackage = RegistryPackage.eINSTANCE;
		
		// load resources
		if(logger.isDebugEnabled()){
			logger.debug("Loading Resources.");
		}
		Resource resource = new RegistryResourceFactoryImpl().createResource(URI.createURI(RegistryPackage.eNS_URI));
		try {
			resource.load(this.ebXMLmetadataInputStream, null);
		} catch (IOException e) {
			logger.error("IOException while loading Resources from InputStream.", e);
			throw new MetadataExtractionException("IOException while loading Resources from InputStream.",e);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Parsing ebXML InputStream contents.");
		}
		EList list = resource.getContents();
		DocumentRoot root = (DocumentRoot) list.get(0);
		
		SubmitObjectsRequestType metadata = null;
		
		// tty getting submit object request
		if(root.getSubmitObjectsRequest() != null){
			metadata = (SubmitObjectsRequestType)root.getSubmitObjectsRequest();
		}
		else{
			//error
			logger.error("Malformed InputStream: InputStream must contain a single SubmitObjectsRequest." +
					"Extraction cannot proceed.");
			throw new MetadataExtractionException("Malformed InputStream: InputStream must contain a single SubmitObjectsRequest." +
					"Extraction cannot proceed.");
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Creating entire metadata with object from InputStream " + this.ebXMLmetadataInputStream);
		}
		EbXML_3_0ProvideAndRegisterDocumentSetExtractor prsExtractor = new EbXML_3_0ProvideAndRegisterDocumentSetExtractor(metadata);
		ProvideAndRegisterDocumentSetType meta = prsExtractor.extract();
		
		// unload resources
		if(logger.isDebugEnabled()){
			logger.debug("Unloading Resources.");
		}
		resource.unload();
		return meta;
	}

}
