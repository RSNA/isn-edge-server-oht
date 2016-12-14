/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryFactory.java,v 1.1 2006/06/27 23:18:08 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage
 * @generated
 */
public interface RegistryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegistryFactory eINSTANCE = org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add Slots Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Slots Request Type</em>'.
	 * @generated
	 */
	AddSlotsRequestType createAddSlotsRequestType();

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
	 * Returns a new object of class '<em>Optional Features Supported Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Features Supported Type</em>'.
	 * @generated
	 */
	OptionalFeaturesSupportedType createOptionalFeaturesSupportedType();

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
	 * Returns a new object of class '<em>Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile Type</em>'.
	 * @generated
	 */
	RegistryProfileType createRegistryProfileType();

	/**
	 * Returns a new object of class '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Type</em>'.
	 * @generated
	 */
	RegistryResponseType createRegistryResponseType();

	/**
	 * Returns a new object of class '<em>Remove Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Objects Request Type</em>'.
	 * @generated
	 */
	RemoveObjectsRequestType createRemoveObjectsRequestType();

	/**
	 * Returns a new object of class '<em>Remove Slots Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Slots Request Type</em>'.
	 * @generated
	 */
	RemoveSlotsRequestType createRemoveSlotsRequestType();

	/**
	 * Returns a new object of class '<em>Request Accepted Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Accepted Response Type</em>'.
	 * @generated
	 */
	RequestAcceptedResponseType createRequestAcceptedResponseType();

	/**
	 * Returns a new object of class '<em>Root Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Element Type</em>'.
	 * @generated
	 */
	RootElementType createRootElementType();

	/**
	 * Returns a new object of class '<em>Submit Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submit Objects Request Type</em>'.
	 * @generated
	 */
	SubmitObjectsRequestType createSubmitObjectsRequestType();

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
	RegistryPackage getRegistryPackage();

} //RegistryFactory
