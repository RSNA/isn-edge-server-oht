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
 * $Id: RegistryObjectQueryType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Object Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getRegistryObjectFilter <em>Registry Object Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getExternalIdentifierFilter <em>External Identifier Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getNameBranch <em>Name Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getDescriptionBranch <em>Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getClassifiedByBranch <em>Classified By Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getSlotBranch <em>Slot Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getSourceAssociationBranch <em>Source Association Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getTargetAssociationBranch <em>Target Association Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType()
 * @model extendedMetaData="name='RegistryObjectQueryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryObjectQueryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object Filter</em>' containment reference.
	 * @see #setRegistryObjectFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_RegistryObjectFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getRegistryObjectFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getRegistryObjectFilter <em>Registry Object Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Filter</em>' containment reference.
	 * @see #getRegistryObjectFilter()
	 * @generated
	 */
	void setRegistryObjectFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifier Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifier Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_ExternalIdentifierFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExternalIdentifierFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getExternalIdentifierFilter();

	/**
	 * Returns the value of the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditable Event Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable Event Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_AuditableEventQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AuditableEventQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAuditableEventQuery();

	/**
	 * Returns the value of the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Branch</em>' containment reference.
	 * @see #setNameBranch(InternationalStringBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_NameBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='NameBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringBranchType getNameBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getNameBranch <em>Name Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Branch</em>' containment reference.
	 * @see #getNameBranch()
	 * @generated
	 */
	void setNameBranch(InternationalStringBranchType value);

	/**
	 * Returns the value of the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Branch</em>' containment reference.
	 * @see #setDescriptionBranch(InternationalStringBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_DescriptionBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='DescriptionBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringBranchType getDescriptionBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getDescriptionBranch <em>Description Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Branch</em>' containment reference.
	 * @see #getDescriptionBranch()
	 * @generated
	 */
	void setDescriptionBranch(InternationalStringBranchType value);

	/**
	 * Returns the value of the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified By Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified By Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_ClassifiedByBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassifiedByBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getClassifiedByBranch();

	/**
	 * Returns the value of the '<em><b>Slot Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_SlotBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SlotBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSlotBranch();

	/**
	 * Returns the value of the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Association Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Association Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_SourceAssociationBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SourceAssociationBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSourceAssociationBranch();

	/**
	 * Returns the value of the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Association Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Association Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryObjectQueryType_TargetAssociationBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TargetAssociationBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTargetAssociationBranch();

} // RegistryObjectQueryType
