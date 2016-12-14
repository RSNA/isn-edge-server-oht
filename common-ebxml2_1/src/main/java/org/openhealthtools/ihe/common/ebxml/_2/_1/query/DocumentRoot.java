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
 * $Id: DocumentRoot.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryRequest <em>Adhoc Query Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryResponse <em>Adhoc Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationFilter <em>Association Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQuery <em>Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQueryResult <em>Association Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventFilter <em>Auditable Event Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getBooleanClause <em>Boolean Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationFilter <em>Classification Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeChildrenBranch <em>Classification Node Children Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeFilter <em>Classification Node Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeParentBranch <em>Classification Node Parent Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQueryResult <em>Classification Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassifiedByBranch <em>Classified By Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClause <em>Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getCompoundClause <em>Compound Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDateTimeClause <em>Date Time Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDescriptionBranch <em>Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getEmailAddressFilter <em>Email Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalIdentifierFilter <em>External Identifier Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalLinkFilter <em>External Link Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectFilter <em>Extrinsic Object Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQuery <em>Filter Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQueryResult <em>Filter Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFloatClause <em>Float Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentRequest <em>Get Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentResponse <em>Get Content Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getIntClause <em>Int Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getLocalizedStringFilter <em>Localized String Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getNameBranch <em>Name Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationChildrenBranch <em>Organization Children Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationFilter <em>Organization Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationParentBranch <em>Organization Parent Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQuery <em>Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQueryResult <em>Organization Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getPostalAddressFilter <em>Postal Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRationalClause <em>Rational Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryFilter <em>Registry Entry Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectFilter <em>Registry Object Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageFilter <em>Registry Package Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQuery <em>Registry Package Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingBranch <em>Service Binding Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingFilter <em>Service Binding Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceFilter <em>Service Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQuery <em>Service Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQueryResult <em>Service Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSimpleClause <em>Simple Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotBranch <em>Slot Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotFilter <em>Slot Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotValueFilter <em>Slot Value Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSourceAssociationBranch <em>Source Association Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkBranch <em>Specification Link Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkFilter <em>Specification Link Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQueryResult <em>Sql Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getStringClause <em>String Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTargetAssociationBranch <em>Target Association Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserBranch <em>User Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserFilter <em>User Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Adhoc Query Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * An Ad hoc query request specifies a query string as defined by [RS] in the queryString attribute
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adhoc Query Request</em>' containment reference.
	 * @see #setAdhocQueryRequest(AdhocQueryRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AdhocQueryRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdhocQueryRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	AdhocQueryRequestType getAdhocQueryRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryRequest <em>Adhoc Query Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query Request</em>' containment reference.
	 * @see #getAdhocQueryRequest()
	 * @generated
	 */
	void setAdhocQueryRequest(AdhocQueryRequestType value);

	/**
	 * Returns the value of the '<em><b>Adhoc Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The response includes a RegistryObjectList which has zero or more
	 * RegistryObjects that match the query specified in AdhocQueryRequest.
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adhoc Query Response</em>' containment reference.
	 * @see #setAdhocQueryResponse(AdhocQueryResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AdhocQueryResponse()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdhocQueryResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AdhocQueryResponseType getAdhocQueryResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryResponse <em>Adhoc Query Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query Response</em>' containment reference.
	 * @see #getAdhocQueryResponse()
	 * @generated
	 */
	void setAdhocQueryResponse(AdhocQueryResponseType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AssociationFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getAssociationFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationFilter <em>Association Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Filter</em>' containment reference.
	 * @see #getAssociationFilter()
	 * @generated
	 */
	void setAssociationFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AssociationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationQueryType getAssociationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQuery <em>Association Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Query</em>' containment reference.
	 * @see #getAssociationQuery()
	 * @generated
	 */
	void setAssociationQuery(AssociationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AssociationQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationQueryResultType getAssociationQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQueryResult <em>Association Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Query Result</em>' containment reference.
	 * @see #getAssociationQueryResult()
	 * @generated
	 */
	void setAssociationQueryResult(AssociationQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Auditable Event Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditable Event Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable Event Filter</em>' containment reference.
	 * @see #setAuditableEventFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AuditableEventFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditableEventFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getAuditableEventFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventFilter <em>Auditable Event Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event Filter</em>' containment reference.
	 * @see #getAuditableEventFilter()
	 * @generated
	 */
	void setAuditableEventFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AuditableEventQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditableEventQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditableEventQueryType getAuditableEventQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQuery <em>Auditable Event Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event Query</em>' containment reference.
	 * @see #getAuditableEventQuery()
	 * @generated
	 */
	void setAuditableEventQuery(AuditableEventQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_AuditableEventQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditableEventQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditableEventQueryResultType getAuditableEventQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event Query Result</em>' containment reference.
	 * @see #getAuditableEventQueryResult()
	 * @generated
	 */
	void setAuditableEventQueryResult(AuditableEventQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Boolean Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Clause</em>' containment reference.
	 * @see #setBooleanClause(BooleanClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_BooleanClause()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BooleanClause' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanClauseType getBooleanClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getBooleanClause <em>Boolean Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Clause</em>' containment reference.
	 * @see #getBooleanClause()
	 * @generated
	 */
	void setBooleanClause(BooleanClauseType value);

	/**
	 * Returns the value of the '<em><b>Classification Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Filter</em>' containment reference.
	 * @see #setClassificationFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getClassificationFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationFilter <em>Classification Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Filter</em>' containment reference.
	 * @see #getClassificationFilter()
	 * @generated
	 */
	void setClassificationFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Classification Node Children Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node Children Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node Children Branch</em>' containment reference.
	 * @see #setClassificationNodeChildrenBranch(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationNodeChildrenBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNodeChildrenBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeChildrenBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeChildrenBranch <em>Classification Node Children Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Children Branch</em>' containment reference.
	 * @see #getClassificationNodeChildrenBranch()
	 * @generated
	 */
	void setClassificationNodeChildrenBranch(ClassificationNodeQueryType value);

	/**
	 * Returns the value of the '<em><b>Classification Node Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node Filter</em>' containment reference.
	 * @see #setClassificationNodeFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationNodeFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNodeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getClassificationNodeFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeFilter <em>Classification Node Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Filter</em>' containment reference.
	 * @see #getClassificationNodeFilter()
	 * @generated
	 */
	void setClassificationNodeFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Classification Node Parent Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node Parent Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node Parent Branch</em>' containment reference.
	 * @see #setClassificationNodeParentBranch(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationNodeParentBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNodeParentBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeParentBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeParentBranch <em>Classification Node Parent Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Parent Branch</em>' containment reference.
	 * @see #getClassificationNodeParentBranch()
	 * @generated
	 */
	void setClassificationNodeParentBranch(ClassificationNodeQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationNodeQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQuery <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #getClassificationNodeQuery()
	 * @generated
	 */
	void setClassificationNodeQuery(ClassificationNodeQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationNodeQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryResultType getClassificationNodeQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query Result</em>' containment reference.
	 * @see #getClassificationNodeQueryResult()
	 * @generated
	 */
	void setClassificationNodeQueryResult(ClassificationNodeQueryResultType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationQueryType getClassificationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQuery <em>Classification Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Query</em>' containment reference.
	 * @see #getClassificationQuery()
	 * @generated
	 */
	void setClassificationQuery(ClassificationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationQueryResultType getClassificationQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQueryResult <em>Classification Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Query Result</em>' containment reference.
	 * @see #getClassificationQueryResult()
	 * @generated
	 */
	void setClassificationQueryResult(ClassificationQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Classification Scheme Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme Filter</em>' containment reference.
	 * @see #setClassificationSchemeFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationSchemeFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getClassificationSchemeFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Filter</em>' containment reference.
	 * @see #getClassificationSchemeFilter()
	 * @generated
	 */
	void setClassificationSchemeFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationSchemeQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryType getClassificationSchemeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQuery <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Query</em>' containment reference.
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 */
	void setClassificationSchemeQuery(ClassificationSchemeQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassificationSchemeQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryResultType getClassificationSchemeQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Query Result</em>' containment reference.
	 * @see #getClassificationSchemeQueryResult()
	 * @generated
	 */
	void setClassificationSchemeQueryResult(ClassificationSchemeQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Classified By Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified By Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified By Branch</em>' containment reference.
	 * @see #setClassifiedByBranch(ClassifiedByBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ClassifiedByBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassifiedByBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassifiedByBranchType getClassifiedByBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassifiedByBranch <em>Classified By Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified By Branch</em>' containment reference.
	 * @see #getClassifiedByBranch()
	 * @generated
	 */
	void setClassifiedByBranch(ClassifiedByBranchType value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The following lines define the XML syntax for Clause.
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference.
	 * @see #setClause(ClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_Clause()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Clause' namespace='##targetNamespace'"
	 * @generated
	 */
	ClauseType getClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClause <em>Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clause</em>' containment reference.
	 * @see #getClause()
	 * @generated
	 */
	void setClause(ClauseType value);

	/**
	 * Returns the value of the '<em><b>Compound Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Clause</em>' containment reference.
	 * @see #setCompoundClause(CompoundClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_CompoundClause()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompoundClause' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundClauseType getCompoundClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getCompoundClause <em>Compound Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Clause</em>' containment reference.
	 * @see #getCompoundClause()
	 * @generated
	 */
	void setCompoundClause(CompoundClauseType value);

	/**
	 * Returns the value of the '<em><b>Date Time Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Clause</em>' attribute.
	 * @see #setDateTimeClause(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_DateTimeClause()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTimeClause' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDateTimeClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDateTimeClause <em>Date Time Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Clause</em>' attribute.
	 * @see #getDateTimeClause()
	 * @generated
	 */
	void setDateTimeClause(Object value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_DescriptionBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DescriptionBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringBranchType getDescriptionBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDescriptionBranch <em>Description Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Branch</em>' containment reference.
	 * @see #getDescriptionBranch()
	 * @generated
	 */
	void setDescriptionBranch(InternationalStringBranchType value);

	/**
	 * Returns the value of the '<em><b>Email Address Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Address Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address Filter</em>' containment reference.
	 * @see #setEmailAddressFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_EmailAddressFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EmailAddressFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getEmailAddressFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getEmailAddressFilter <em>Email Address Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address Filter</em>' containment reference.
	 * @see #getEmailAddressFilter()
	 * @generated
	 */
	void setEmailAddressFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ExternalIdentifierFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalIdentifierFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getExternalIdentifierFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalIdentifierFilter <em>External Identifier Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Identifier Filter</em>' containment reference.
	 * @see #getExternalIdentifierFilter()
	 * @generated
	 */
	void setExternalIdentifierFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ExternalLinkFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalLinkFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getExternalLinkFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalLinkFilter <em>External Link Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Link Filter</em>' containment reference.
	 * @see #getExternalLinkFilter()
	 * @generated
	 */
	void setExternalLinkFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Extrinsic Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrinsic Object Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrinsic Object Filter</em>' containment reference.
	 * @see #setExtrinsicObjectFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ExtrinsicObjectFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtrinsicObjectFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getExtrinsicObjectFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectFilter <em>Extrinsic Object Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object Filter</em>' containment reference.
	 * @see #getExtrinsicObjectFilter()
	 * @generated
	 */
	void setExtrinsicObjectFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ExtrinsicObjectQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtrinsicObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtrinsicObjectQueryType getExtrinsicObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object Query</em>' containment reference.
	 * @see #getExtrinsicObjectQuery()
	 * @generated
	 */
	void setExtrinsicObjectQuery(ExtrinsicObjectQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ExtrinsicObjectQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtrinsicObjectQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtrinsicObjectQueryResultType getExtrinsicObjectQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object Query Result</em>' containment reference.
	 * @see #getExtrinsicObjectQueryResult()
	 * @generated
	 */
	void setExtrinsicObjectQueryResult(ExtrinsicObjectQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Filter Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Query</em>' containment reference.
	 * @see #setFilterQuery(FilterQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_FilterQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FilterQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterQueryType getFilterQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQuery <em>Filter Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Query</em>' containment reference.
	 * @see #getFilterQuery()
	 * @generated
	 */
	void setFilterQuery(FilterQueryType value);

	/**
	 * Returns the value of the '<em><b>Filter Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Query Result</em>' containment reference.
	 * @see #setFilterQueryResult(FilterQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_FilterQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FilterQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterQueryResultType getFilterQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQueryResult <em>Filter Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Query Result</em>' containment reference.
	 * @see #getFilterQueryResult()
	 * @generated
	 */
	void setFilterQueryResult(FilterQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Float Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Clause</em>' attribute.
	 * @see #setFloatClause(float)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_FloatClause()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Float" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FloatClause' namespace='##targetNamespace'"
	 * @generated
	 */
	float getFloatClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFloatClause <em>Float Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Clause</em>' attribute.
	 * @see #getFloatClause()
	 * @generated
	 */
	void setFloatClause(float value);

	/**
	 * Returns the value of the '<em><b>Get Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Gets the actual content (not metadata) specified by the ObjectRefList
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get Content Request</em>' containment reference.
	 * @see #setGetContentRequest(GetContentRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_GetContentRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetContentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	GetContentRequestType getGetContentRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentRequest <em>Get Content Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Content Request</em>' containment reference.
	 * @see #getGetContentRequest()
	 * @generated
	 */
	void setGetContentRequest(GetContentRequestType value);

	/**
	 * Returns the value of the '<em><b>Get Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The GetContentResponse will have no sub-elements if there were no errors.
	 * The actual contents will be in the other payloads of the message.  
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get Content Response</em>' containment reference.
	 * @see #setGetContentResponse(GetContentResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_GetContentResponse()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetContentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetContentResponseType getGetContentResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentResponse <em>Get Content Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Content Response</em>' containment reference.
	 * @see #getGetContentResponse()
	 * @generated
	 */
	void setGetContentResponse(GetContentResponseType value);

	/**
	 * Returns the value of the '<em><b>Int Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Clause</em>' attribute.
	 * @see #setIntClause(BigInteger)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_IntClause()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntClause' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIntClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getIntClause <em>Int Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Clause</em>' attribute.
	 * @see #getIntClause()
	 * @generated
	 */
	void setIntClause(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Localized String Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localized String Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized String Filter</em>' containment reference.
	 * @see #setLocalizedStringFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_LocalizedStringFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocalizedStringFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getLocalizedStringFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getLocalizedStringFilter <em>Localized String Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized String Filter</em>' containment reference.
	 * @see #getLocalizedStringFilter()
	 * @generated
	 */
	void setLocalizedStringFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_NameBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NameBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringBranchType getNameBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getNameBranch <em>Name Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Branch</em>' containment reference.
	 * @see #getNameBranch()
	 * @generated
	 */
	void setNameBranch(InternationalStringBranchType value);

	/**
	 * Returns the value of the '<em><b>Organization Children Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Children Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Children Branch</em>' containment reference.
	 * @see #setOrganizationChildrenBranch(OrganizationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_OrganizationChildrenBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationChildrenBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationChildrenBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationChildrenBranch <em>Organization Children Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Children Branch</em>' containment reference.
	 * @see #getOrganizationChildrenBranch()
	 * @generated
	 */
	void setOrganizationChildrenBranch(OrganizationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_OrganizationFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getOrganizationFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationFilter <em>Organization Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Filter</em>' containment reference.
	 * @see #getOrganizationFilter()
	 * @generated
	 */
	void setOrganizationFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_OrganizationParentBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationParentBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationParentBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationParentBranch <em>Organization Parent Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Parent Branch</em>' containment reference.
	 * @see #getOrganizationParentBranch()
	 * @generated
	 */
	void setOrganizationParentBranch(OrganizationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_OrganizationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQuery <em>Organization Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Query</em>' containment reference.
	 * @see #getOrganizationQuery()
	 * @generated
	 */
	void setOrganizationQuery(OrganizationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_OrganizationQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryResultType getOrganizationQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQueryResult <em>Organization Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Query Result</em>' containment reference.
	 * @see #getOrganizationQueryResult()
	 * @generated
	 */
	void setOrganizationQueryResult(OrganizationQueryResultType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_PostalAddressFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostalAddressFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getPostalAddressFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getPostalAddressFilter <em>Postal Address Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Address Filter</em>' containment reference.
	 * @see #getPostalAddressFilter()
	 * @generated
	 */
	void setPostalAddressFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Rational Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Clause</em>' containment reference.
	 * @see #setRationalClause(RationalClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RationalClause()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RationalClause' namespace='##targetNamespace'"
	 * @generated
	 */
	RationalClauseType getRationalClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRationalClause <em>Rational Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Clause</em>' containment reference.
	 * @see #getRationalClause()
	 * @generated
	 */
	void setRationalClause(RationalClauseType value);

	/**
	 * Returns the value of the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Entry Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Entry Filter</em>' containment reference.
	 * @see #setRegistryEntryFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryEntryFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryEntryFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getRegistryEntryFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryFilter <em>Registry Entry Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Entry Filter</em>' containment reference.
	 * @see #getRegistryEntryFilter()
	 * @generated
	 */
	void setRegistryEntryFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryEntryQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryEntryQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryEntryQueryType getRegistryEntryQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQuery <em>Registry Entry Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Entry Query</em>' containment reference.
	 * @see #getRegistryEntryQuery()
	 * @generated
	 */
	void setRegistryEntryQuery(RegistryEntryQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryEntryQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryEntryQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryEntryQueryResultType getRegistryEntryQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Entry Query Result</em>' containment reference.
	 * @see #getRegistryEntryQueryResult()
	 * @generated
	 */
	void setRegistryEntryQueryResult(RegistryEntryQueryResultType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryObjectFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObjectFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getRegistryObjectFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectFilter <em>Registry Object Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Filter</em>' containment reference.
	 * @see #getRegistryObjectFilter()
	 * @generated
	 */
	void setRegistryObjectFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryObjectQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getRegistryObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQuery <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #getRegistryObjectQuery()
	 * @generated
	 */
	void setRegistryObjectQuery(RegistryObjectQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryObjectQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObjectQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getRegistryObjectQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Query Result</em>' containment reference.
	 * @see #getRegistryObjectQueryResult()
	 * @generated
	 */
	void setRegistryObjectQueryResult(RegistryObjectListType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryPackageFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryPackageFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getRegistryPackageFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageFilter <em>Registry Package Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package Filter</em>' containment reference.
	 * @see #getRegistryPackageFilter()
	 * @generated
	 */
	void setRegistryPackageFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryPackageQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryPackageQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryPackageQueryType getRegistryPackageQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQuery <em>Registry Package Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package Query</em>' containment reference.
	 * @see #getRegistryPackageQuery()
	 * @generated
	 */
	void setRegistryPackageQuery(RegistryPackageQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_RegistryPackageQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryPackageQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryPackageQueryResultType getRegistryPackageQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package Query Result</em>' containment reference.
	 * @see #getRegistryPackageQueryResult()
	 * @generated
	 */
	void setRegistryPackageQueryResult(RegistryPackageQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Response Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Option</em>' containment reference.
	 * @see #setResponseOption(ResponseOptionType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ResponseOption()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResponseOption' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseOptionType getResponseOption();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getResponseOption <em>Response Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Option</em>' containment reference.
	 * @see #getResponseOption()
	 * @generated
	 */
	void setResponseOption(ResponseOptionType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ServiceBindingBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceBindingBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingBranchType getServiceBindingBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingBranch <em>Service Binding Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Branch</em>' containment reference.
	 * @see #getServiceBindingBranch()
	 * @generated
	 */
	void setServiceBindingBranch(ServiceBindingBranchType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ServiceBindingFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceBindingFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getServiceBindingFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingFilter <em>Service Binding Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Filter</em>' containment reference.
	 * @see #getServiceBindingFilter()
	 * @generated
	 */
	void setServiceBindingFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ServiceBindingTargetBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceBindingTargetBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingBranchType getServiceBindingTargetBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Target Branch</em>' containment reference.
	 * @see #getServiceBindingTargetBranch()
	 * @generated
	 */
	void setServiceBindingTargetBranch(ServiceBindingBranchType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ServiceFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getServiceFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceFilter <em>Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Filter</em>' containment reference.
	 * @see #getServiceFilter()
	 * @generated
	 */
	void setServiceFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ServiceQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceQueryType getServiceQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQuery <em>Service Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Query</em>' containment reference.
	 * @see #getServiceQuery()
	 * @generated
	 */
	void setServiceQuery(ServiceQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_ServiceQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceQueryResultType getServiceQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQueryResult <em>Service Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Query Result</em>' containment reference.
	 * @see #getServiceQueryResult()
	 * @generated
	 */
	void setServiceQueryResult(ServiceQueryResultType value);

	/**
	 * Returns the value of the '<em><b>Simple Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Clause</em>' containment reference.
	 * @see #setSimpleClause(SimpleClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SimpleClause()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleClause' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleClauseType getSimpleClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSimpleClause <em>Simple Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Clause</em>' containment reference.
	 * @see #getSimpleClause()
	 * @generated
	 */
	void setSimpleClause(SimpleClauseType value);

	/**
	 * Returns the value of the '<em><b>Slot Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Branch</em>' containment reference.
	 * @see #setSlotBranch(SlotBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SlotBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SlotBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	SlotBranchType getSlotBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotBranch <em>Slot Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Branch</em>' containment reference.
	 * @see #getSlotBranch()
	 * @generated
	 */
	void setSlotBranch(SlotBranchType value);

	/**
	 * Returns the value of the '<em><b>Slot Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Filter</em>' containment reference.
	 * @see #setSlotFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SlotFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SlotFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getSlotFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotFilter <em>Slot Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Filter</em>' containment reference.
	 * @see #getSlotFilter()
	 * @generated
	 */
	void setSlotFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Slot Value Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Value Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Value Filter</em>' containment reference.
	 * @see #setSlotValueFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SlotValueFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SlotValueFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getSlotValueFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotValueFilter <em>Slot Value Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Value Filter</em>' containment reference.
	 * @see #getSlotValueFilter()
	 * @generated
	 */
	void setSlotValueFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Source Association Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Association Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Association Branch</em>' containment reference.
	 * @see #setSourceAssociationBranch(AssociationBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SourceAssociationBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceAssociationBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationBranchType getSourceAssociationBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSourceAssociationBranch <em>Source Association Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Association Branch</em>' containment reference.
	 * @see #getSourceAssociationBranch()
	 * @generated
	 */
	void setSourceAssociationBranch(AssociationBranchType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SpecificationLinkBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpecificationLinkBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificationLinkBranchType getSpecificationLinkBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkBranch <em>Specification Link Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Link Branch</em>' containment reference.
	 * @see #getSpecificationLinkBranch()
	 * @generated
	 */
	void setSpecificationLinkBranch(SpecificationLinkBranchType value);

	/**
	 * Returns the value of the '<em><b>Specification Link Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link Filter</em>' containment reference.
	 * @see #setSpecificationLinkFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SpecificationLinkFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpecificationLinkFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getSpecificationLinkFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkFilter <em>Specification Link Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Link Filter</em>' containment reference.
	 * @see #getSpecificationLinkFilter()
	 * @generated
	 */
	void setSpecificationLinkFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Sql Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Query</em>' attribute.
	 * @see #setSqlQuery(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SqlQuery()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SQLQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSqlQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQuery <em>Sql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Query</em>' attribute.
	 * @see #getSqlQuery()
	 * @generated
	 */
	void setSqlQuery(String value);

	/**
	 * Returns the value of the '<em><b>Sql Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Query Result</em>' containment reference.
	 * @see #setSqlQueryResult(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_SqlQueryResult()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SQLQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getSqlQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQueryResult <em>Sql Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Query Result</em>' containment reference.
	 * @see #getSqlQueryResult()
	 * @generated
	 */
	void setSqlQueryResult(RegistryObjectListType value);

	/**
	 * Returns the value of the '<em><b>String Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Clause</em>' containment reference.
	 * @see #setStringClause(StringClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_StringClause()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StringClause' namespace='##targetNamespace'"
	 * @generated
	 */
	StringClauseType getStringClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getStringClause <em>String Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Clause</em>' containment reference.
	 * @see #getStringClause()
	 * @generated
	 */
	void setStringClause(StringClauseType value);

	/**
	 * Returns the value of the '<em><b>Target Association Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Association Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Association Branch</em>' containment reference.
	 * @see #setTargetAssociationBranch(AssociationBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_TargetAssociationBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TargetAssociationBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationBranchType getTargetAssociationBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTargetAssociationBranch <em>Target Association Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Association Branch</em>' containment reference.
	 * @see #getTargetAssociationBranch()
	 * @generated
	 */
	void setTargetAssociationBranch(AssociationBranchType value);

	/**
	 * Returns the value of the '<em><b>Telephone Number Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Number Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Number Filter</em>' containment reference.
	 * @see #setTelephoneNumberFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_TelephoneNumberFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumberFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getTelephoneNumberFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTelephoneNumberFilter <em>Telephone Number Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone Number Filter</em>' containment reference.
	 * @see #getTelephoneNumberFilter()
	 * @generated
	 */
	void setTelephoneNumberFilter(FilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_UserBranch()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	UserBranchType getUserBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserBranch <em>User Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Branch</em>' containment reference.
	 * @see #getUserBranch()
	 * @generated
	 */
	void setUserBranch(UserBranchType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getDocumentRoot_UserFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getUserFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserFilter <em>User Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Filter</em>' containment reference.
	 * @see #getUserFilter()
	 * @generated
	 */
	void setUserFilter(FilterType value);

} // DocumentRoot
