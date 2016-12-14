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
 * $Id: FilterQueryResultType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Query Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAssociationQueryResult <em>Association Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationQueryResult <em>Classification Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getOrganizationQueryResult <em>Organization Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getServiceQueryResult <em>Service Query Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType()
 * @model extendedMetaData="name='FilterQueryResult_._type' kind='elementOnly'"
 * @generated
 */
public interface FilterQueryResultType extends EObject {
	/**
	 * Returns the value of the '<em><b>Registry Object Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object Query Result</em>' containment reference.
	 * @see #setRegistryObjectQueryResult(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_RegistryObjectQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getRegistryObjectQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Query Result</em>' containment reference.
	 * @see #getRegistryObjectQueryResult()
	 * @generated
	 */
	void setRegistryObjectQueryResult(RegistryObjectListType value);

	/**
	 * Returns the value of the '<em><b>Registry Entry Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Entry Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Entry Query Result</em>' containment reference.
	 * @see #setRegistryEntryQueryResult(RegistryEntryQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_RegistryEntryQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryEntryQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryEntryQueryResultType getRegistryEntryQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Entry Query Result</em>' containment reference.
	 * @see #getRegistryEntryQueryResult()
	 * @generated
	 */
	void setRegistryEntryQueryResult(RegistryEntryQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Association Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Query Result</em>' containment reference.
	 * @see #setAssociationQueryResult(AssociationQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_AssociationQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AssociationQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationQueryResultType getAssociationQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAssociationQueryResult <em>Association Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Query Result</em>' containment reference.
	 * @see #getAssociationQueryResult()
	 * @generated
	 */
	void setAssociationQueryResult(AssociationQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Auditable Event Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditable Event Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable Event Query Result</em>' containment reference.
	 * @see #setAuditableEventQueryResult(AuditableEventQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_AuditableEventQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AuditableEventQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditableEventQueryResultType getAuditableEventQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event Query Result</em>' containment reference.
	 * @see #getAuditableEventQueryResult()
	 * @generated
	 */
	void setAuditableEventQueryResult(AuditableEventQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Classification Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Query Result</em>' containment reference.
	 * @see #setClassificationQueryResult(ClassificationQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_ClassificationQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationQueryResultType getClassificationQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationQueryResult <em>Classification Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Query Result</em>' containment reference.
	 * @see #getClassificationQueryResult()
	 * @generated
	 */
	void setClassificationQueryResult(ClassificationQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Classification Node Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node Query Result</em>' containment reference.
	 * @see #setClassificationNodeQueryResult(ClassificationNodeQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_ClassificationNodeQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryResultType getClassificationNodeQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query Result</em>' containment reference.
	 * @see #getClassificationNodeQueryResult()
	 * @generated
	 */
	void setClassificationNodeQueryResult(ClassificationNodeQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Classification Scheme Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme Query Result</em>' containment reference.
	 * @see #setClassificationSchemeQueryResult(ClassificationSchemeQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_ClassificationSchemeQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryResultType getClassificationSchemeQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Query Result</em>' containment reference.
	 * @see #getClassificationSchemeQueryResult()
	 * @generated
	 */
	void setClassificationSchemeQueryResult(ClassificationSchemeQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Registry Package Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Package Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Package Query Result</em>' containment reference.
	 * @see #setRegistryPackageQueryResult(RegistryPackageQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_RegistryPackageQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryPackageQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryPackageQueryResultType getRegistryPackageQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package Query Result</em>' containment reference.
	 * @see #getRegistryPackageQueryResult()
	 * @generated
	 */
	void setRegistryPackageQueryResult(RegistryPackageQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Extrinsic Object Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrinsic Object Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrinsic Object Query Result</em>' containment reference.
	 * @see #setExtrinsicObjectQueryResult(ExtrinsicObjectQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_ExtrinsicObjectQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExtrinsicObjectQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtrinsicObjectQueryResultType getExtrinsicObjectQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object Query Result</em>' containment reference.
	 * @see #getExtrinsicObjectQueryResult()
	 * @generated
	 */
	void setExtrinsicObjectQueryResult(ExtrinsicObjectQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Organization Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Query Result</em>' containment reference.
	 * @see #setOrganizationQueryResult(OrganizationQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_OrganizationQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OrganizationQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryResultType getOrganizationQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getOrganizationQueryResult <em>Organization Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Query Result</em>' containment reference.
	 * @see #getOrganizationQueryResult()
	 * @generated
	 */
	void setOrganizationQueryResult(OrganizationQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Service Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Query Result</em>' containment reference.
	 * @see #setServiceQueryResult(ServiceQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getFilterQueryResultType_ServiceQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceQueryResultType getServiceQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getServiceQueryResult <em>Service Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Query Result</em>' containment reference.
	 * @see #getServiceQueryResult()
	 * @generated
	 */
	void setServiceQueryResult(ServiceQueryResultType value);

} // FilterQueryResultType
