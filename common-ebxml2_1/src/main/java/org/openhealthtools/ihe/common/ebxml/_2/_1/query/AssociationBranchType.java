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
 * $Id: AssociationBranchType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationFilter <em>Association Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalLinkFilter <em>External Link Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalIdentifierFilter <em>External Identifier Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationQuery <em>Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getOrganizationQuery <em>Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryPackageQuery <em>Registry Package Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceQuery <em>Service Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getUserBranch <em>User Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceBindingBranch <em>Service Binding Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getSpecificationLinkBranch <em>Specification Link Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType()
 * @model extendedMetaData="name='AssociationBranchType' kind='elementOnly'"
 * @generated
 */
public interface AssociationBranchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Association Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Filter</em>' containment reference.
	 * @see #setAssociationFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_AssociationFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AssociationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getAssociationFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationFilter <em>Association Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Filter</em>' containment reference.
	 * @see #getAssociationFilter()
	 * @generated
	 */
	void setAssociationFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>External Link Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Link Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Link Filter</em>' containment reference.
	 * @see #setExternalLinkFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ExternalLinkFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExternalLinkFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getExternalLinkFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalLinkFilter <em>External Link Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Link Filter</em>' containment reference.
	 * @see #getExternalLinkFilter()
	 * @generated
	 */
	void setExternalLinkFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>External Identifier Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifier Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifier Filter</em>' containment reference.
	 * @see #setExternalIdentifierFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ExternalIdentifierFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExternalIdentifierFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getExternalIdentifierFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalIdentifierFilter <em>External Identifier Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Identifier Filter</em>' containment reference.
	 * @see #getExternalIdentifierFilter()
	 * @generated
	 */
	void setExternalIdentifierFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #setRegistryObjectQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_RegistryObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getRegistryObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryObjectQuery <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #getRegistryObjectQuery()
	 * @generated
	 */
	void setRegistryObjectQuery(RegistryObjectQueryType value);

	/**
	 * Returns the value of the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Entry Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Entry Query</em>' containment reference.
	 * @see #setRegistryEntryQuery(RegistryEntryQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_RegistryEntryQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryEntryQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryEntryQueryType getRegistryEntryQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryEntryQuery <em>Registry Entry Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Entry Query</em>' containment reference.
	 * @see #getRegistryEntryQuery()
	 * @generated
	 */
	void setRegistryEntryQuery(RegistryEntryQueryType value);

	/**
	 * Returns the value of the '<em><b>Association Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Query</em>' containment reference.
	 * @see #setAssociationQuery(AssociationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_AssociationQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AssociationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationQueryType getAssociationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationQuery <em>Association Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Query</em>' containment reference.
	 * @see #getAssociationQuery()
	 * @generated
	 */
	void setAssociationQuery(AssociationQueryType value);

	/**
	 * Returns the value of the '<em><b>Classification Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Query</em>' containment reference.
	 * @see #setClassificationQuery(ClassificationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ClassificationQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationQueryType getClassificationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationQuery <em>Classification Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Query</em>' containment reference.
	 * @see #getClassificationQuery()
	 * @generated
	 */
	void setClassificationQuery(ClassificationQueryType value);

	/**
	 * Returns the value of the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme Query</em>' containment reference.
	 * @see #setClassificationSchemeQuery(ClassificationSchemeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ClassificationSchemeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryType getClassificationSchemeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Query</em>' containment reference.
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 */
	void setClassificationSchemeQuery(ClassificationSchemeQueryType value);

	/**
	 * Returns the value of the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #setClassificationNodeQuery(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ClassificationNodeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationNodeQuery <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #getClassificationNodeQuery()
	 * @generated
	 */
	void setClassificationNodeQuery(ClassificationNodeQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_OrganizationQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OrganizationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getOrganizationQuery <em>Organization Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Query</em>' containment reference.
	 * @see #getOrganizationQuery()
	 * @generated
	 */
	void setOrganizationQuery(OrganizationQueryType value);

	/**
	 * Returns the value of the '<em><b>Auditable Event Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditable Event Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable Event Query</em>' containment reference.
	 * @see #setAuditableEventQuery(AuditableEventQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_AuditableEventQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AuditableEventQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditableEventQueryType getAuditableEventQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAuditableEventQuery <em>Auditable Event Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event Query</em>' containment reference.
	 * @see #getAuditableEventQuery()
	 * @generated
	 */
	void setAuditableEventQuery(AuditableEventQueryType value);

	/**
	 * Returns the value of the '<em><b>Registry Package Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Package Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Package Query</em>' containment reference.
	 * @see #setRegistryPackageQuery(RegistryPackageQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_RegistryPackageQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryPackageQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryPackageQueryType getRegistryPackageQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryPackageQuery <em>Registry Package Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package Query</em>' containment reference.
	 * @see #getRegistryPackageQuery()
	 * @generated
	 */
	void setRegistryPackageQuery(RegistryPackageQueryType value);

	/**
	 * Returns the value of the '<em><b>Extrinsic Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrinsic Object Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrinsic Object Query</em>' containment reference.
	 * @see #setExtrinsicObjectQuery(ExtrinsicObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ExtrinsicObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExtrinsicObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtrinsicObjectQueryType getExtrinsicObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object Query</em>' containment reference.
	 * @see #getExtrinsicObjectQuery()
	 * @generated
	 */
	void setExtrinsicObjectQuery(ExtrinsicObjectQueryType value);

	/**
	 * Returns the value of the '<em><b>Service Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Query</em>' containment reference.
	 * @see #setServiceQuery(ServiceQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ServiceQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceQueryType getServiceQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceQuery <em>Service Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Query</em>' containment reference.
	 * @see #getServiceQuery()
	 * @generated
	 */
	void setServiceQuery(ServiceQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_UserBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='UserBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	UserBranchType getUserBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getUserBranch <em>User Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Branch</em>' containment reference.
	 * @see #getUserBranch()
	 * @generated
	 */
	void setUserBranch(UserBranchType value);

	/**
	 * Returns the value of the '<em><b>Service Binding Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding Branch</em>' containment reference.
	 * @see #setServiceBindingBranch(ServiceBindingBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_ServiceBindingBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceBindingBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingBranchType getServiceBindingBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceBindingBranch <em>Service Binding Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Branch</em>' containment reference.
	 * @see #getServiceBindingBranch()
	 * @generated
	 */
	void setServiceBindingBranch(ServiceBindingBranchType value);

	/**
	 * Returns the value of the '<em><b>Specification Link Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link Branch</em>' containment reference.
	 * @see #setSpecificationLinkBranch(SpecificationLinkBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAssociationBranchType_SpecificationLinkBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SpecificationLinkBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificationLinkBranchType getSpecificationLinkBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getSpecificationLinkBranch <em>Specification Link Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Link Branch</em>' containment reference.
	 * @see #getSpecificationLinkBranch()
	 * @generated
	 */
	void setSpecificationLinkBranch(SpecificationLinkBranchType value);

} // AssociationBranchType
