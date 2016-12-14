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
import org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.util.RimResourceFactoryImpl;
import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;

/**
 * Class containing utility methods to extract XDS submission set
 * metadata from ebRIM 3.0 conformant InputStream.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0InputStreamSubmissionSetExtractor implements SubmissionSetExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_3_0_STREAM_SS_EXTR";

	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0InputStreamSubmissionSetExtractor.class);
	
	/** InputStream to extract metadata from */
	private InputStream ebXMLsubmissionSetInputStream;
	
	/**
	 * Creates an extractor for the InputStream given. InputStream must contain single instance of a RegistryPackageType.
	 * Must be conformant to the rim.xsd. 
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * <br>
	 * IMPORTANT NOTE: This object cannot render the lists of associated documents and associated
	 * folders for the submission set from a list of AssocationType1 because it lacks the context 
	 * (sufficient markup) to distinguish the associations that link the submission set to a 
	 * document and those that link it to a folder.
	 * @param ebXMLsubmissionSetInputStream
	 */
	public EbXML_3_0InputStreamSubmissionSetExtractor(InputStream ebXMLsubmissionSetInputStream) {
		this.ebXMLsubmissionSetInputStream = ebXMLsubmissionSetInputStream;
	}

	/** 
	 * Renders a SubmissionSetType object from a InputStream containing a single instance of a RegistryPackageType.
	 * Must be conformant to the rim.xsd.
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * @throws MetadataExtractionException 
	 * @see org.openhealthtools.ihe.xds.metadata.extract.SubmissionSetExtractor#extract()
	 */
	public SubmissionSetType extract() throws MetadataExtractionException{
		// load package (EMF)
		if(logger.isDebugEnabled()){
			logger.debug("Loading RimPackage.");
		}
		RimPackage metadataPackage = RimPackage.eINSTANCE;
		
		// load resources
		if(logger.isDebugEnabled()){
			logger.debug("Loading Resources.");
		}
		Resource resource = new RimResourceFactoryImpl().createResource(URI.createURI(RimPackage.eNS_URI));
		try {
			resource.load(this.ebXMLsubmissionSetInputStream, null);
		} catch (IOException e) {
			logger.error("IOException while loading Resources from InputStream.", e);
			throw new MetadataExtractionException("IOException while loading Resources from InputStream.",e);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Parsing ebXML InputStream contents.");
		}
		EList list = resource.getContents();
		DocumentRoot root = (DocumentRoot) list.get(0);
		
		RegistryPackageType setData = null;
		
		// try just extrinsic object
		if(root.getRegistryPackage() != null){
			setData = (RegistryPackageType)root.getRegistryPackage();
		}
		else{
			//error
			logger.error("Malformed InputStream: InputStream must contain a single RegistryPackage." +
					"Extraction cannot proceed.");
			throw new MetadataExtractionException("Malformed InputStream: InputStream must contain a single RegistryPackage." +
					"Extraction cannot proceed.");
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Creating DocumentEntry metadata with object from InputStream " + this.ebXMLsubmissionSetInputStream);
		}
		EbXML_3_0SubmissionSetExtractor ssExtractor = new EbXML_3_0SubmissionSetExtractor(setData, null, null);
		SubmissionSetType submissionSet = ssExtractor.extract();
		
		// unload resources
		if(logger.isDebugEnabled()){
			logger.debug("Unloading Resources.");
		}
		resource.unload();
		return submissionSet;
	}

}
