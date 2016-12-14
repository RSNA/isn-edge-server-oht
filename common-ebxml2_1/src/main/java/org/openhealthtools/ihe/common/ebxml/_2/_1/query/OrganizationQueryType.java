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
 * $Id: OrganizationQueryType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationFilter <em>Organization Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getPostalAddressFilter <em>Postal Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getUserBranch <em>User Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationParentBranch <em>Organization Parent Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationChildrenBranch <em>Organization Children Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getOrganizationQueryType()
 * @model extendedMetaData="name='OrganizationQueryType' kind='elementOnly'"
 * @generated
 */
public interface OrganizationQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Organization Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Filter</em>' containment reference.
	 * @see #setOrganizationFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getOrganizationQueryType_OrganizationFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OrganizationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getOrganizationFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationFilter <em>Organization Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Filter</em>' containment reference.
	 * @see #getOrganizationFilter()
	 * @generated
	 */
	void setOrganizationFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getOrganizationQueryType_PostalAddressFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='PostalAddressFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getPostalAddressFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getPostalAddressFilter <em>Postal Address Filter</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getOrganizationQueryType_TelephoneNumberFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TelephoneNumberFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTelephoneNumberFilter();

	/**
	 * Returns the value of the '<em><b>User Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Branch</em>' containment reference.
	 * @see #setUserBranch(UserBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getOrganizationQueryType_UserBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='UserBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	UserBranchType getUserBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getUserBranch <em>User Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Branch</em>' containment reference.
	 * @see #getUserBranch()
	 * @generated
	 */
	void setUserBranch(UserBranchType value);

	/**
	 * Returns the value of the '<em><b>Organization Parent Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Parent Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Parent Branch</em>' containment reference.
	 * @see #setOrganizationParentBranch(OrganizationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getOrganizationQueryType_OrganizationParentBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OrganizationParentBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationParentBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationParentBranch <em>Organization Parent Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Parent Branch</em>' containment reference.
	 * @see #getOrganizationParentBranch()
	 * @generated
	 */
	void setOrganizationParentBranch(OrganizationQueryType value);

	/**
	 * Returns the value of the '<em><b>Organization Children Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Children Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Children Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getOrganizationQueryType_OrganizationChildrenBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OrganizationChildrenBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOrganizationChildrenBranch();

} // OrganizationQueryType
