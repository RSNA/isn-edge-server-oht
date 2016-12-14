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
 * $Id: ServiceQueryType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType#getServiceFilter <em>Service Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType#getServiceBindingBranch <em>Service Binding Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getServiceQueryType()
 * @model extendedMetaData="name='ServiceQueryType' kind='elementOnly'"
 * @generated
 */
public interface ServiceQueryType extends RegistryEntryQueryType {
	/**
	 * Returns the value of the '<em><b>Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Filter</em>' containment reference.
	 * @see #setServiceFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getServiceQueryType_ServiceFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getServiceFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType#getServiceFilter <em>Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Filter</em>' containment reference.
	 * @see #getServiceFilter()
	 * @generated
	 */
	void setServiceFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Service Binding Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getServiceQueryType_ServiceBindingBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceBindingBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getServiceBindingBranch();

} // ServiceQueryType
