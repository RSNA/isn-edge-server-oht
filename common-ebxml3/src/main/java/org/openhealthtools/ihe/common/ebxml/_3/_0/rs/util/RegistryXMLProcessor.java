/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryXMLProcessor.java,v 1.1 2006/10/19 20:16:32 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistryXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		RegistryPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RegistryResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new RegistryResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RegistryResourceFactoryImpl());
		}
		return registrations;
	}

} //RegistryXMLProcessor
