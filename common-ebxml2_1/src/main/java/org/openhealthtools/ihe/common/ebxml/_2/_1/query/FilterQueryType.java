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
 * $Id: FilterQueryType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAssociationQuery <em>Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryPackageQuery <em>Registry Package Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getOrganizationQuery <em>Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getServiceQuery <em>Service Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType()
 * @model extendedMetaData="name='FilterQuery_._type' kind='elementOnly'"
 * @generated
 */
public interface FilterQueryType extends EObject {
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_RegistryObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getRegistryObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_RegistryEntryQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryEntryQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryEntryQueryType getRegistryEntryQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_AssociationQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AssociationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationQueryType getAssociationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAssociationQuery <em>Association Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Query</em>' containment reference.
	 * @see #getAssociationQuery()
	 * @generated
	 */
	void setAssociationQuery(AssociationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_AuditableEventQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AuditableEventQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditableEventQueryType getAuditableEventQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAuditableEventQuery <em>Auditable Event Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event Query</em>' containment reference.
	 * @see #getAuditableEventQuery()
	 * @generated
	 */
	void setAuditableEventQuery(AuditableEventQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_ClassificationQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationQueryType getClassificationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationQuery <em>Classification Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Query</em>' containment reference.
	 * @see #getClassificationQuery()
	 * @generated
	 */
	void setClassificationQuery(ClassificationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_ClassificationNodeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationNodeQuery <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #getClassificationNodeQuery()
	 * @generated
	 */
	void setClassificationNodeQuery(ClassificationNodeQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_ClassificationSchemeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryType getClassificationSchemeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Query</em>' containment reference.
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 */
	void setClassificationSchemeQuery(ClassificationSchemeQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_RegistryPackageQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryPackageQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryPackageQueryType getRegistryPackageQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryPackageQuery <em>Registry Package Query</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_ExtrinsicObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExtrinsicObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtrinsicObjectQueryType getExtrinsicObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object Query</em>' containment reference.
	 * @see #getExtrinsicObjectQuery()
	 * @generated
	 */
	void setExtrinsicObjectQuery(ExtrinsicObjectQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_OrganizationQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OrganizationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getOrganizationQuery <em>Organization Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Query</em>' containment reference.
	 * @see #getOrganizationQuery()
	 * @generated
	 */
	void setOrganizationQuery(OrganizationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryType_ServiceQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceQueryType getServiceQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getServiceQuery <em>Service Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Query</em>' containment reference.
	 * @see #getServiceQuery()
	 * @generated
	 */
	void setServiceQuery(ServiceQueryType value);

} // FilterQueryType
