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
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.util.RimResourceFactoryImpl;
import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;

/**
 * Class containing utility methods to extract XDS folder
 * metadata from ebRIM 2.1 conformant InputStream.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class EbXML_2_1InputStreamFolderExtractor implements FolderExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "EBXML_STREAM_FOL_EXTR";
	
	/** Logger */
	private static final Logger logger = Logger.getLogger(EbXML_2_1InputStreamFolderExtractor.class);
	
	/** InputStream to extract metadata from */
	private InputStream ebXMLFolderInputStream;
	
	/**
	 * Creates an extractor for the InputStream given. InputStream must contain one of the following:
	 * <l> A single instance of a RegistryPackageType. Must be conformant to the modified rim.xsd.</l>
	 * <l> A single instance of a  LeafRegistryObjectListType populated with extactly one RegistryPackageType and 
	 * one or more AssociationType1 (to reference the documents to be placed in this folder). 
	 * Must be conformant to the modified rim.xsd.</l>
	 * UUIDs in the InputStream are assumed to match those in {@link org.openhealthtools.ihe.xds.metadata.constants.UUIDs}.
	 * @param ebXMLFolderInputStream
	 */
	public EbXML_2_1InputStreamFolderExtractor(InputStream ebXMLFolderInputStream) {
		this.ebXMLFolderInputStream = ebXMLFolderInputStream;
	}

	/** 
	 * Renders a FolderType object from a InputStream containing a single instance of a RegistryPackageType.
	 * Must be conformant to the modified rim.xsd.
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
		else if(root.getLeafRegistryObjectList() != null){
			if(!root.getLeafRegistryObjectList().getExtrinsicObject().isEmpty()){
				folderData = (RegistryPackageType)root.getLeafRegistryObjectList().getRegistryPackage().get(0);
				if(!root.getLeafRegistryObjectList().getAssociation().isEmpty()){
					EList assocs = root.getLeafRegistryObjectList().getAssociation();
					associationData = new AssociationType1[assocs.size()];
					for(int i = 0; i < associationData.length; i++){
						associationData[i] = (AssociationType1)assocs.get(i);
					}
				}
				else{
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
		EbXML_2_1FolderExtractor fExtractor = new EbXML_2_1FolderExtractor(folderData, associationData);
		FolderType folder = fExtractor.extract();
		
		// unload resources
		if(logger.isDebugEnabled()){
			logger.debug("Unloading Resources.");
		}
		resource.unload();
		return folder;
	}
}
