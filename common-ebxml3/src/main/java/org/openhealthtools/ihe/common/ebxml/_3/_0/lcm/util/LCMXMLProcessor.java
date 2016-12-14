/**
 * <copyright>
 * </copyright>
 *
 * $Id: LCMXMLProcessor.java,v 1.1 2006/10/19 20:16:27 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LCMXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCMXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		LCMPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the LCMResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new LCMResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new LCMResourceFactoryImpl());
		}
		return registrations;
	}

} //LCMXMLProcessor
