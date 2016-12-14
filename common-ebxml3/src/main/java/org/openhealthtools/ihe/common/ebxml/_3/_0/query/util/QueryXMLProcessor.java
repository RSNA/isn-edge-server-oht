/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryXMLProcessor.java,v 1.1 2006/10/19 20:16:34 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		QueryPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the QueryResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new QueryResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new QueryResourceFactoryImpl());
		}
		return registrations;
	}

} //QueryXMLProcessor
