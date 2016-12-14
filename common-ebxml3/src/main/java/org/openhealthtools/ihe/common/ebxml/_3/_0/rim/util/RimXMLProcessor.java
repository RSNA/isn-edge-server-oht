/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimXMLProcessor.java,v 1.1 2006/10/19 20:16:37 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RimXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RimXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		RimPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RimResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new RimResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RimResourceFactoryImpl());
		}
		return registrations;
	}

} //RimXMLProcessor
