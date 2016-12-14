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
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.util.RimResourceFactoryImpl;
import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;

/**
 * Class containing utility methods to extract XDS document entry
 * metadata from ebRIM 3.0 conformant InputStream.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0InputStreamDocumentEntryExtractor implements DocumentEntryExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_3_0_STREAM_DE_EXTR";

	/** logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0InputStreamDocumentEntryExtractor.class);
	
	/** InputStream to extract metadata from */
	private InputStream ebXMLdocumentEntryInputStream;
	
	/**
	 * Creates an extractor for the InputStream given. InputStream must contain one of the following:
	 * <l> A single instance of a ExtrinsicObjectType. Must be conformant to the rim.xsd.</l>
	 * <l> A single instance of a  RegistryObjectListType populated with extactly one ExtrinsicObjectType and 
	 * one AssociationType (to reference the parent document). Must be conformant to the rim.xsd.</l>
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * @param ebXMLdocumentEntryInputStream
	 */
	public EbXML_3_0InputStreamDocumentEntryExtractor(InputStream ebXMLdocumentEntryInputStream) {
		this.ebXMLdocumentEntryInputStream = ebXMLdocumentEntryInputStream;
	}

	/** 
	 * Renders a DocumentEntryType object from a InputStream containing one of the following:
	 * <l> A single instance of a ExtrinsicObjectType. Must be conformant to the modified rim.xsd.</l>
	 * <l> A single instance of a RegistryObjectListType populated with extactly one ExtrinsicObjectType and 
	 * one AssociationType (to reference the parent document). Must be conformant to the rim.xsd.</l>
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * @throws MetadataExtractionException 
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryExtractor#extract()
	 */
	public DocumentEntryType extract() throws MetadataExtractionException{
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
			resource.load(this.ebXMLdocumentEntryInputStream, null);
		} catch (IOException e) {
			logger.error("IOException while loading Resources from InputStream.", e);
			throw new MetadataExtractionException("IOException while loading Resources from InputStream.",e);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Parsing ebXML InputStream contents.");
		}
		EList list = resource.getContents();
		DocumentRoot root = (DocumentRoot) list.get(0);
		
		ExtrinsicObjectType docData = null;
		AssociationType1 parentData = null;
		
		// try just extrinsic object
		if(root.getExtrinsicObject() != null){
			docData = (ExtrinsicObjectType)root.getExtrinsicObject();
		}
		// try for exrinsic object and parent
		else if(root.getRegistryObjectList() != null){
			if(root.getRegistryObjectList().getIdentifiable() != null){
				boolean foundExtrinsicObject = false;
				boolean foundAssociation = false;
				Iterator i = root.getRegistryObjectList().getIdentifiable().iterator();
				while(i.hasNext()){
					IdentifiableType ident = (IdentifiableType)i.next();
					if(ident instanceof ExtrinsicObjectType && !foundExtrinsicObject){
						docData = (ExtrinsicObjectType)ident;
						foundExtrinsicObject = true;
					}
					else if(ident instanceof AssociationType1 && !foundAssociation){
						parentData = (AssociationType1)ident;
						foundAssociation = true;
					}
				}
				if(!foundAssociation || !foundExtrinsicObject) {
						logger.error("Malformed InputStream: InputStream must contain a single ExtrinsicObject or a single " +
								"LeafRegistryObjectList containing a single ExtrinsicObject and a Association. " +
								"Extraction cannot proceed.");
						throw new MetadataExtractionException(
								"Malformed InputStream: InputStream must contain a single ExtrinsicObject or a single " +
								"LeafRegistryObjectList containing a single ExtrinsicObject and a Association. " +
								"Extraction cannot proceed.");
				}
			}
		}
		else{
			//error
			logger.error("Malformed InputStream: InputStream must contain a single ExtrinsicObject or a single " +
					"LeafRegistryObjectList containing a single ExtrinsicObject and a Association. " +
					"Extraction cannot proceed.");
			throw new MetadataExtractionException("Malformed InputStream: InputStream must contain a single ExtrinsicObject or a single " +
					"LeafRegistryObjectList containing a single ExtrinsicObject and a Association. " +
					"Extraction cannot proceed.");
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Creating DocumentEntry metadata with object from InputStream " + this.ebXMLdocumentEntryInputStream);
		}
		EbXML_3_0DocumentEntryExtractor deExtractor = new EbXML_3_0DocumentEntryExtractor(docData, parentData);
		DocumentEntryType documentEntry = deExtractor.extract();
		
		// unload resources
		if(logger.isDebugEnabled()){
			logger.debug("Unloading Resources.");
		}
		resource.unload();
		return documentEntry;
	}

}
