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
 * $Id: UserBranchType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getUserFilter <em>User Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getPostalAddressFilter <em>Postal Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getEmailAddressFilter <em>Email Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getOrganizationQuery <em>Organization Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getUserBranchType()
 * @model extendedMetaData="name='UserBranch_._type' kind='elementOnly'"
 * @generated
 */
public interface UserBranchType extends EObject {
	/**
	 * Returns the value of the '<em><b>User Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Filter</em>' containment reference.
	 * @see #setUserFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getUserBranchType_UserFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='UserFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getUserFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getUserFilter <em>User Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Filter</em>' containment reference.
	 * @see #getUserFilter()
	 * @generated
	 */
	void setUserFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Postal Address Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Address Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Address Filter</em>' containment reference.
	 * @see #setPostalAddressFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getUserBranchType_PostalAddressFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='PostalAddressFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getPostalAddressFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getPostalAddressFilter <em>Postal Address Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Address Filter</em>' containment reference.
	 * @see #getPostalAddressFilter()
	 * @generated
	 */
	void setPostalAddressFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Telephone Number Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Number Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Number Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getUserBranchType_TelephoneNumberFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TelephoneNumberFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTelephoneNumberFilter();

	/**
	 * Returns the value of the '<em><b>Email Address Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Address Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getUserBranchType_EmailAddressFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='EmailAddressFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getEmailAddressFilter();

	/**
	 * Returns the value of the '<em><b>Organization Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Query</em>' containment reference.
	 * @see #setOrganizationQuery(OrganizationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getUserBranchType_OrganizationQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OrganizationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getOrganizationQuery <em>Organization Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Query</em>' containment reference.
	 * @see #getOrganizationQuery()
	 * @generated
	 */
	void setOrganizationQuery(OrganizationQueryType value);

} // UserBranchType
