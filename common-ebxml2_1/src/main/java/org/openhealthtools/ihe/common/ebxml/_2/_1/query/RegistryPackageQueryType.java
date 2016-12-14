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
 * $Id: RegistryPackageQueryType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Package Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryPackageFilter <em>Registry Package Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryPackageQueryType()
 * @model extendedMetaData="name='RegistryPackageQueryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryPackageQueryType extends RegistryEntryQueryType {
	/**
	 * Returns the value of the '<em><b>Registry Package Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Package Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Package Filter</em>' containment reference.
	 * @see #setRegistryPackageFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryPackageQueryType_RegistryPackageFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryPackageFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getRegistryPackageFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryPackageFilter <em>Registry Package Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package Filter</em>' containment reference.
	 * @see #getRegistryPackageFilter()
	 * @generated
	 */
	void setRegistryPackageFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Registry Object Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryPackageQueryType_RegistryObjectQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRegistryObjectQuery();

	/**
	 * Returns the value of the '<em><b>Registry Entry Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Entry Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Entry Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryPackageQueryType_RegistryEntryQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryEntryQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRegistryEntryQuery();

} // RegistryPackageQueryType
