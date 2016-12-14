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
 * $Id: ServiceBindingBranchType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Binding Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingFilter <em>Service Binding Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getSpecificationLinkBranch <em>Specification Link Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getServiceBindingBranchType()
 * @model extendedMetaData="name='ServiceBindingBranchType' kind='elementOnly'"
 * @generated
 */
public interface ServiceBindingBranchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Binding Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding Filter</em>' containment reference.
	 * @see #setServiceBindingFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getServiceBindingBranchType_ServiceBindingFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceBindingFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getServiceBindingFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingFilter <em>Service Binding Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Filter</em>' containment reference.
	 * @see #getServiceBindingFilter()
	 * @generated
	 */
	void setServiceBindingFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Specification Link Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getServiceBindingBranchType_SpecificationLinkBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SpecificationLinkBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSpecificationLinkBranch();

	/**
	 * Returns the value of the '<em><b>Service Binding Target Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding Target Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding Target Branch</em>' containment reference.
	 * @see #setServiceBindingTargetBranch(ServiceBindingBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getServiceBindingBranchType_ServiceBindingTargetBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceBindingTargetBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingBranchType getServiceBindingTargetBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Target Branch</em>' containment reference.
	 * @see #getServiceBindingTargetBranch()
	 * @generated
	 */
	void setServiceBindingTargetBranch(ServiceBindingBranchType value);

} // ServiceBindingBranchType
