/*******************************************************************************
 * Copyright (c) 2006,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds.source.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryFactory;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.util.RegistryResourceFactoryImpl;
import org.openhealthtools.ihe.utils.EMFUtils;
import org.w3c.dom.Element;

/**
 * Collection of static methods for performing routine 
 * operations on ebXML 2.1-specific instances.
 */
public class EbXML_2_1MetadataUtils 
{
	/**
	 * Extracts the contents of a SubmitObjectRequestType object as a String
	 *
	 * @param submitObjectsRequest
	 * @return String holding XML
	 */
	public static Element unpackSubmitObjectsRequest(SubmitObjectsRequestType submitObjectsRequest) throws Exception 
	{
		@SuppressWarnings("unused")
		RegistryPackage packageInstance = RegistryPackage.eINSTANCE;
		
		org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot root = RegistryFactory.eINSTANCE.createDocumentRoot();
		root.setSubmitObjectsRequest(submitObjectsRequest);
		
		XMLResource resource = (XMLResource)(new RegistryResourceFactoryImpl()).createResource(URI.createURI(RegistryPackage.eNS_URI));
		resource.getContents().add(root);
		
		Element domElement = EMFUtils.transformEmfToDom(resource);
		resource.unload();
		return domElement;
	}
}
