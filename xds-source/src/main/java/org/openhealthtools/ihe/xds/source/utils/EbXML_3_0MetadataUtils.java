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

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.util.LCMResourceFactoryImpl;
import org.openhealthtools.ihe.utils.EMFUtils;
import org.w3c.dom.Element;

/**
 * Collection of static methods for performing routine 
 * operations on ebXML 3.0-specific instances.
 */
public class EbXML_3_0MetadataUtils 
{
	/**
	 * Extracts the contents of a ebXML 3.1 SubmitObjectRequestType object into a 
	 * DOM element for sending as part of a SOAP body
	 *
	 * @param submitObjectsRequest
	 * @return String holding XML
	 */
	public static Element unpackSubmitObjectsRequest(SubmitObjectsRequestType submitObjectsRequest) throws Exception 
	{
		@SuppressWarnings("unused")
		LCMPackage packageInstance = LCMPackage.eINSTANCE;
		DocumentRoot root = LCMFactory.eINSTANCE.createDocumentRoot();
		root.setSubmitObjectsRequest(submitObjectsRequest);
		XMLResource resource = (XMLResource)(new LCMResourceFactoryImpl())
				.createResource(org.eclipse.emf.common.util.URI.createURI(LCMPackage.eNS_URI));
		resource.getContents().add(root);
		Element domElement = EMFUtils.transformEmfToDom(resource);
		resource.unload();
		return domElement;
	}
	
}
