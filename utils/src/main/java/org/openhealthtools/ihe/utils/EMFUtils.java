/*******************************************************************************
 * Copyright (c) 2008,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.DOMHandler;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.DefaultDOMHandlerImpl;
import org.w3c.dom.Element;

/**
 * Static class to handle routine operations on EMF instances
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public class EMFUtils 
{
	/**
	 * Default DOM Handler to use in EMF->DOM transforms
	 */
	//FIXME SEK - Fix for Issue 121
	//private static final DOMHandler EMF_DOM_HANDLER =  new DefaultDOMHandlerImpl();
	
	/**
	 * Default Save Options to use in EMF->DOM transforms
	 */
	private static final Map<String,String> EMF_SAVE_OPTIONS = new HashMap<String,String>();
	static {
		EMF_SAVE_OPTIONS.put(XMLResource.OPTION_FORMATTED, Boolean.FALSE.toString());
	}
	
	
	/**
	 * Transforms a generic EObject to DOM element using the 
	 * associated Resources Factory and namespace URI.
	 * @param object Object to transform to DOM
	 * @param resourceFactory Resource factory backing the EObject
	 * @param uri Namespace URI backing the EObject
	 * @return DOM Element representing the EObject 
	 * @throws Exception
	 */
	public static Element transformEmfToDom(EObject object,
			Resource.Factory resourceFactory,
			String uri) throws Exception
	{
		
		XMLResource resource = (XMLResource)resourceFactory.createResource(
				org.eclipse.emf.common.util.URI.createURI(uri));
		resource.getContents().add(object);
		return transformEmfToDom(resource);
	}
	
	/**
	 * Transforms an EMF-based XML Resource instance into a DOM Document Element.
	 * @param resource EMF-built XML Resource to transform
	 * @return DOM Element representing the XML Resource
	 * @throws Exception
	 */
	public static Element transformEmfToDom(XMLResource resource) throws Exception
	{
		org.w3c.dom.Document domDocument = XMLUtils.createDomDocument();
		// FIXME Fix for issue 121
		resource.save(domDocument, EMF_SAVE_OPTIONS, null);
		//resource.save(domDocument, EMF_SAVE_OPTIONS, EMF_DOM_HANDLER);
		return domDocument.getDocumentElement();
	}
	
	/**
	 * Load an EMF EObject-based instance from a DOM element using a 
	 * given EMF resource factory and namespace URI.
	 * 
	 * @param domElement DOM element to transform to EMF
	 * @param resourceFactory Resource factory to back the EObject
	 * @param uri Namespace URI to back the EObject
	 * @param useMetadataHack Whether to relax loading rules
	 * @return EMF-based EObject representing the DOM element
	 * @throws Exception
	 */
	public static Object transformDomToEmf(
			Element domElement,
			Resource.Factory resourceFactory,
			URI uri,
			boolean isValidationRelaxed) throws Exception
	{
	
		XMLResource resources = (XMLResource)resourceFactory.createResource(uri);
		if (isValidationRelaxed){
			if (resources instanceof XMLResource) {
				resources.getDefaultLoadOptions()
						.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
								Boolean.TRUE);
			}
		}
		
		resources.load(domElement, null);
		EList<?> list = resources.getContents();
		return list.get(0);
	}
	
	/**
	 * To relax EMF validation for processing responses. To enable relaxed validation
	 * create and set the system property 'relax.validation' to 'true'
	 *
	 * @return if feature is enabled or not
	 */
	public static boolean isEMFValidationRelaxed() {
		String val = System.getProperty("relax.validation");
		if (null == val) {
			return false;
		}
		val = val.trim();
		if (val.length() <= 0) {
			return false;
		}
		if (val.equals("true") || val.equals("yes")) {
			return true;
		}
		return false;
	}
	
	
}
