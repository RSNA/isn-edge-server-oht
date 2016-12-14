/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryFactory.java,v 1.1 2006/10/19 20:16:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage
 * @generated
 */
public interface RegistryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegistryFactory eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Error List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error List Type</em>'.
	 * @generated
	 */
	RegistryErrorListType createRegistryErrorListType();

	/**
	 * Returns a new object of class '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Type</em>'.
	 * @generated
	 */
	RegistryErrorType createRegistryErrorType();

	/**
	 * Returns a new object of class '<em>Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Type</em>'.
	 * @generated
	 */
	RegistryRequestType createRegistryRequestType();

	/**
	 * Returns a new object of class '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Type</em>'.
	 * @generated
	 */
	RegistryResponseType createRegistryResponseType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RegistryPackage getRegistryPackage();

} //RegistryFactory
