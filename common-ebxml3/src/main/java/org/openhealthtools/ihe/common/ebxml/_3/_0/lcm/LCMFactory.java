/**
 * <copyright>
 * </copyright>
 *
 * $Id: LCMFactory.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage
 * @generated
 */
public interface LCMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LCMFactory eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Accept Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Objects Request Type</em>'.
	 * @generated
	 */
	AcceptObjectsRequestType createAcceptObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Approve Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approve Objects Request Type</em>'.
	 * @generated
	 */
	ApproveObjectsRequestType createApproveObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Deprecate Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deprecate Objects Request Type</em>'.
	 * @generated
	 */
	DeprecateObjectsRequestType createDeprecateObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Relocate Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relocate Objects Request Type</em>'.
	 * @generated
	 */
	RelocateObjectsRequestType createRelocateObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Remove Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Objects Request Type</em>'.
	 * @generated
	 */
	RemoveObjectsRequestType createRemoveObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Submit Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submit Objects Request Type</em>'.
	 * @generated
	 */
	SubmitObjectsRequestType createSubmitObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Undeprecate Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undeprecate Objects Request Type</em>'.
	 * @generated
	 */
	UndeprecateObjectsRequestType createUndeprecateObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Update Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Objects Request Type</em>'.
	 * @generated
	 */
	UpdateObjectsRequestType createUpdateObjectsRequestType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LCMPackage getLCMPackage();

} //LCMFactory
