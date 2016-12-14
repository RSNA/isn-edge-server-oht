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
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.util.RimResourceFactoryImpl;
import org.openhealthtools.ihe.xds.metadata.FolderType;

/**
 * Class containing utility methods to extract XDS folder
 * metadata from ebRIM 3.0 conformant InputStream.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_3_0InputStreamFolderExtractor implements FolderExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_3_0_STREAM_FOL_EXTR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_3_0InputStreamFolderExtractor.class);
	
	/** InputStream to extract metadata from */
	private InputStream ebXMLFolderInputStream;
	
	/**
	 * Creates an extractor for the InputStream given. InputStream must contain one of the following:
	 * <l> A single instance of a RegistryPackageType. Must be conformant to the rim.xsd.</l>
	 * <l> A single instance of a RegistryObjectListType populated with extactly one RegistryPackageType and 
	 * one or more AssociationType1 (to reference the documents to be placed in this folder). 
	 * Must be conformant to the rim.xsd.</l>
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * @param ebXMLFolderInputStream
	 */
	public EbXML_3_0InputStreamFolderExtractor(InputStream ebXMLFolderInputStream) {
		this.ebXMLFolderInputStream = ebXMLFolderInputStream;
	}

	/** 
	 * Renders a FolderType object from a InputStream containing a single instance of a RegistryPackageType.
	 * Must be conformant to the rim.xsd.
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * @throws MetadataExtractionException 
	 * @see org.openhealthtools.ihe.xds.metadata.extract.FolderExtractor#extract()
	 */
	public FolderType extract() throws MetadataExtractionException{
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
			resource.load(this.ebXMLFolderInputStream, null);
		} catch (IOException e) {
			logger.error("IOException while loading Resources from InputStream.", e);
			throw new MetadataExtractionException("IOException while loading Resources from InputStream.",e);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Parsing ebXML InputStream contents.");
		}
		EList list = resource.getContents();
		DocumentRoot root = (DocumentRoot) list.get(0);
		
		RegistryPackageType folderData = null;
		AssociationType1[] associationData = null;
		
		// try just the RegistryPackage
		if(root.getRegistryPackage() != null){
			folderData = (RegistryPackageType)root.getRegistryPackage();
		}
		// try for registry package and associations
		else if(root.getRegistryObjectList() != null){
			if(root.getRegistryObjectList().getIdentifiable() != null){
				boolean foundRegistryPackage = false;
				ArrayList associations = new ArrayList();
				Iterator i = root.getRegistryObjectList().getIdentifiable().iterator();
				while(i.hasNext()){
					IdentifiableType ident = (IdentifiableType)i.next();
					if(ident instanceof RegistryPackageType && !foundRegistryPackage){
						folderData = (RegistryPackageType)ident;
						foundRegistryPackage = true;
					}
					else if(ident instanceof AssociationType1){
						associations.add((AssociationType1)ident);
					}
				}
				if(!foundRegistryPackage || associations.size() == 0) {
					logger.error("Malformed InputStream: InputStream must contain a single RegistryPackage or a single " +
							"LeafRegistryObjectList containing a single RegistryPackage and one or more Associations. " +
							"Extraction cannot proceed.");
					throw new MetadataExtractionException(
							"Malformed InputStream: InputStream must contain a single RegistryPackage or a single " +
							"LeafRegistryObjectList containing a single RegistryPackage and one or more Associations. " +
							"Extraction cannot proceed.");
				}
			}
		}
		else{
			//error
			logger.error("Malformed InputStream: InputStream must contain a single RegistryPackage or a single " +
					"LeafRegistryObjectList containing a single RegistryPackage and one or more Associations. " +
					"Extraction cannot proceed.");
			throw new MetadataExtractionException("Malformed InputStream: InputStream must contain a single RegistryPackage or a single " +
					"LeafRegistryObjectList containing a single RegistryPackage and one or more Associations. " +
					"Extraction cannot proceed.");
		}

		
		if(logger.isDebugEnabled()){
			logger.debug("Creating Folder metadata with object from InputStream " + this.ebXMLFolderInputStream);
		}
		EbXML_3_0FolderExtractor fExtractor = new EbXML_3_0FolderExtractor(folderData, associationData);
		FolderType folder = fExtractor.extract();
		
		// unload resources
		if(logger.isDebugEnabled()){
			logger.debug("Unloading Resources.");
		}
		resource.unload();
		return folder;
	}
}
