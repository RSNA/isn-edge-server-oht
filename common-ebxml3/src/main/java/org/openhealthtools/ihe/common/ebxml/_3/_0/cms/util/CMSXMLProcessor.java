/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMSXMLProcessor.java,v 1.1 2006/10/19 20:16:31 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CMSXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMSXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CMSPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CMSResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CMSResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CMSResourceFactoryImpl());
		}
		return registrations;
	}

} //CMSXMLProcessor
