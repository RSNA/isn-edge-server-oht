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
 * $Id: DocumentRootImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;


import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAdhocQueryRequest <em>Adhoc Query Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAdhocQueryResponse <em>Adhoc Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAssociationFilter <em>Association Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAssociationQuery <em>Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAssociationQueryResult <em>Association Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAuditableEventFilter <em>Auditable Event Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getBooleanClause <em>Boolean Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationFilter <em>Classification Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationNodeChildrenBranch <em>Classification Node Children Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationNodeFilter <em>Classification Node Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationNodeParentBranch <em>Classification Node Parent Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationQueryResult <em>Classification Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClassifiedByBranch <em>Classified By Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getCompoundClause <em>Compound Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getDateTimeClause <em>Date Time Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getDescriptionBranch <em>Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getEmailAddressFilter <em>Email Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getExternalIdentifierFilter <em>External Identifier Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getExternalLinkFilter <em>External Link Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getExtrinsicObjectFilter <em>Extrinsic Object Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getFilterQuery <em>Filter Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getFilterQueryResult <em>Filter Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getFloatClause <em>Float Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getGetContentRequest <em>Get Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getGetContentResponse <em>Get Content Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getIntClause <em>Int Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getLocalizedStringFilter <em>Localized String Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getNameBranch <em>Name Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getOrganizationChildrenBranch <em>Organization Children Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getOrganizationFilter <em>Organization Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getOrganizationParentBranch <em>Organization Parent Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getOrganizationQuery <em>Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getOrganizationQueryResult <em>Organization Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getPostalAddressFilter <em>Postal Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRationalClause <em>Rational Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryEntryFilter <em>Registry Entry Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryObjectFilter <em>Registry Object Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryPackageFilter <em>Registry Package Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryPackageQuery <em>Registry Package Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getServiceBindingBranch <em>Service Binding Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getServiceBindingFilter <em>Service Binding Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getServiceFilter <em>Service Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getServiceQuery <em>Service Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getServiceQueryResult <em>Service Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSimpleClause <em>Simple Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSlotBranch <em>Slot Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSlotFilter <em>Slot Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSlotValueFilter <em>Slot Value Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSourceAssociationBranch <em>Source Association Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSpecificationLinkBranch <em>Specification Link Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSpecificationLinkFilter <em>Specification Link Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getSqlQueryResult <em>Sql Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getStringClause <em>String Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getTargetAssociationBranch <em>Target Association Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getUserBranch <em>User Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl#getUserFilter <em>User Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap = null;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation = null;

	/**
	 * The default value of the '{@link #getDateTimeClause() <em>Date Time Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeClause()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATE_TIME_CLAUSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFloatClause() <em>Float Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatClause()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_CLAUSE_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getIntClause() <em>Int Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntClause()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INT_CLAUSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSqlQuery() <em>Sql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_QUERY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, QueryPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, QueryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, QueryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryRequestType getAdhocQueryRequest() {
		return (AdhocQueryRequestType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdhocQueryRequest(AdhocQueryRequestType newAdhocQueryRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST, newAdhocQueryRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdhocQueryRequest(AdhocQueryRequestType newAdhocQueryRequest) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST, newAdhocQueryRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryResponseType getAdhocQueryResponse() {
		return (AdhocQueryResponseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdhocQueryResponse(AdhocQueryResponseType newAdhocQueryResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE, newAdhocQueryResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdhocQueryResponse(AdhocQueryResponseType newAdhocQueryResponse) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE, newAdhocQueryResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getAssociationFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationFilter(FilterType newAssociationFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_FILTER, newAssociationFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationFilter(FilterType newAssociationFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_FILTER, newAssociationFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationQueryType getAssociationQuery() {
		return (AssociationQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationQuery(AssociationQueryType newAssociationQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY, newAssociationQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationQuery(AssociationQueryType newAssociationQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY, newAssociationQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationQueryResultType getAssociationQueryResult() {
		return (AssociationQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationQueryResult(AssociationQueryResultType newAssociationQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT, newAssociationQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationQueryResult(AssociationQueryResultType newAssociationQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT, newAssociationQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getAuditableEventFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditableEventFilter(FilterType newAuditableEventFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER, newAuditableEventFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditableEventFilter(FilterType newAuditableEventFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER, newAuditableEventFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditableEventQueryType getAuditableEventQuery() {
		return (AuditableEventQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditableEventQuery(AuditableEventQueryType newAuditableEventQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY, newAuditableEventQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditableEventQuery(AuditableEventQueryType newAuditableEventQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY, newAuditableEventQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditableEventQueryResultType getAuditableEventQueryResult() {
		return (AuditableEventQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditableEventQueryResult(AuditableEventQueryResultType newAuditableEventQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT, newAuditableEventQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditableEventQueryResult(AuditableEventQueryResultType newAuditableEventQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT, newAuditableEventQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanClauseType getBooleanClause() {
		return (BooleanClauseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__BOOLEAN_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanClause(BooleanClauseType newBooleanClause, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__BOOLEAN_CLAUSE, newBooleanClause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanClause(BooleanClauseType newBooleanClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__BOOLEAN_CLAUSE, newBooleanClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getClassificationFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationFilter(FilterType newClassificationFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_FILTER, newClassificationFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationFilter(FilterType newClassificationFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_FILTER, newClassificationFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getClassificationNodeChildrenBranch() {
		return (ClassificationNodeQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeChildrenBranch(ClassificationNodeQueryType newClassificationNodeChildrenBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH, newClassificationNodeChildrenBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeChildrenBranch(ClassificationNodeQueryType newClassificationNodeChildrenBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH, newClassificationNodeChildrenBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getClassificationNodeFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeFilter(FilterType newClassificationNodeFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER, newClassificationNodeFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeFilter(FilterType newClassificationNodeFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER, newClassificationNodeFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getClassificationNodeParentBranch() {
		return (ClassificationNodeQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeParentBranch(ClassificationNodeQueryType newClassificationNodeParentBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH, newClassificationNodeParentBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeParentBranch(ClassificationNodeQueryType newClassificationNodeParentBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH, newClassificationNodeParentBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getClassificationNodeQuery() {
		return (ClassificationNodeQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeQuery(ClassificationNodeQueryType newClassificationNodeQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY, newClassificationNodeQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeQuery(ClassificationNodeQueryType newClassificationNodeQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY, newClassificationNodeQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryResultType getClassificationNodeQueryResult() {
		return (ClassificationNodeQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeQueryResult(ClassificationNodeQueryResultType newClassificationNodeQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT, newClassificationNodeQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeQueryResult(ClassificationNodeQueryResultType newClassificationNodeQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT, newClassificationNodeQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationQueryType getClassificationQuery() {
		return (ClassificationQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationQuery(ClassificationQueryType newClassificationQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_QUERY, newClassificationQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationQuery(ClassificationQueryType newClassificationQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_QUERY, newClassificationQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationQueryResultType getClassificationQueryResult() {
		return (ClassificationQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationQueryResult(ClassificationQueryResultType newClassificationQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT, newClassificationQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationQueryResult(ClassificationQueryResultType newClassificationQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT, newClassificationQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getClassificationSchemeFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSchemeFilter(FilterType newClassificationSchemeFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER, newClassificationSchemeFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSchemeFilter(FilterType newClassificationSchemeFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER, newClassificationSchemeFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeQueryType getClassificationSchemeQuery() {
		return (ClassificationSchemeQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSchemeQuery(ClassificationSchemeQueryType newClassificationSchemeQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY, newClassificationSchemeQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSchemeQuery(ClassificationSchemeQueryType newClassificationSchemeQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY, newClassificationSchemeQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeQueryResultType getClassificationSchemeQueryResult() {
		return (ClassificationSchemeQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSchemeQueryResult(ClassificationSchemeQueryResultType newClassificationSchemeQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT, newClassificationSchemeQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSchemeQueryResult(ClassificationSchemeQueryResultType newClassificationSchemeQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT, newClassificationSchemeQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiedByBranchType getClassifiedByBranch() {
		return (ClassifiedByBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiedByBranch(ClassifiedByBranchType newClassifiedByBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH, newClassifiedByBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedByBranch(ClassifiedByBranchType newClassifiedByBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH, newClassifiedByBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClauseType getClause() {
		return (ClauseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClause(ClauseType newClause, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__CLAUSE, newClause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClause(ClauseType newClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__CLAUSE, newClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundClauseType getCompoundClause() {
		return (CompoundClauseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__COMPOUND_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundClause(CompoundClauseType newCompoundClause, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__COMPOUND_CLAUSE, newCompoundClause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundClause(CompoundClauseType newCompoundClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__COMPOUND_CLAUSE, newCompoundClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDateTimeClause() {
		return (Object)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__DATE_TIME_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeClause(Object newDateTimeClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__DATE_TIME_CLAUSE, newDateTimeClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringBranchType getDescriptionBranch() {
		return (InternationalStringBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__DESCRIPTION_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionBranch(InternationalStringBranchType newDescriptionBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__DESCRIPTION_BRANCH, newDescriptionBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionBranch(InternationalStringBranchType newDescriptionBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__DESCRIPTION_BRANCH, newDescriptionBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getEmailAddressFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmailAddressFilter(FilterType newEmailAddressFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER, newEmailAddressFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailAddressFilter(FilterType newEmailAddressFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER, newEmailAddressFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getExternalIdentifierFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalIdentifierFilter(FilterType newExternalIdentifierFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER, newExternalIdentifierFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalIdentifierFilter(FilterType newExternalIdentifierFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER, newExternalIdentifierFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getExternalLinkFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalLinkFilter(FilterType newExternalLinkFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER, newExternalLinkFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalLinkFilter(FilterType newExternalLinkFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER, newExternalLinkFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getExtrinsicObjectFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrinsicObjectFilter(FilterType newExtrinsicObjectFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER, newExtrinsicObjectFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrinsicObjectFilter(FilterType newExtrinsicObjectFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER, newExtrinsicObjectFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrinsicObjectQueryType getExtrinsicObjectQuery() {
		return (ExtrinsicObjectQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrinsicObjectQuery(ExtrinsicObjectQueryType newExtrinsicObjectQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY, newExtrinsicObjectQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrinsicObjectQuery(ExtrinsicObjectQueryType newExtrinsicObjectQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY, newExtrinsicObjectQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrinsicObjectQueryResultType getExtrinsicObjectQueryResult() {
		return (ExtrinsicObjectQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrinsicObjectQueryResult(ExtrinsicObjectQueryResultType newExtrinsicObjectQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT, newExtrinsicObjectQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrinsicObjectQueryResult(ExtrinsicObjectQueryResultType newExtrinsicObjectQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT, newExtrinsicObjectQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterQueryType getFilterQuery() {
		return (FilterQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__FILTER_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterQuery(FilterQueryType newFilterQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__FILTER_QUERY, newFilterQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterQuery(FilterQueryType newFilterQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__FILTER_QUERY, newFilterQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterQueryResultType getFilterQueryResult() {
		return (FilterQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__FILTER_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterQueryResult(FilterQueryResultType newFilterQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__FILTER_QUERY_RESULT, newFilterQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterQueryResult(FilterQueryResultType newFilterQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__FILTER_QUERY_RESULT, newFilterQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloatClause() {
		return ((Float)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__FLOAT_CLAUSE, true)).floatValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatClause(float newFloatClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__FLOAT_CLAUSE, new Float(newFloatClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetContentRequestType getGetContentRequest() {
		return (GetContentRequestType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__GET_CONTENT_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetContentRequest(GetContentRequestType newGetContentRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__GET_CONTENT_REQUEST, newGetContentRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetContentRequest(GetContentRequestType newGetContentRequest) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__GET_CONTENT_REQUEST, newGetContentRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetContentResponseType getGetContentResponse() {
		return (GetContentResponseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__GET_CONTENT_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetContentResponse(GetContentResponseType newGetContentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__GET_CONTENT_RESPONSE, newGetContentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetContentResponse(GetContentResponseType newGetContentResponse) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__GET_CONTENT_RESPONSE, newGetContentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIntClause() {
		return (BigInteger)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__INT_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntClause(BigInteger newIntClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__INT_CLAUSE, newIntClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getLocalizedStringFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalizedStringFilter(FilterType newLocalizedStringFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER, newLocalizedStringFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizedStringFilter(FilterType newLocalizedStringFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER, newLocalizedStringFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringBranchType getNameBranch() {
		return (InternationalStringBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__NAME_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameBranch(InternationalStringBranchType newNameBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__NAME_BRANCH, newNameBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameBranch(InternationalStringBranchType newNameBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__NAME_BRANCH, newNameBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getOrganizationChildrenBranch() {
		return (OrganizationQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationChildrenBranch(OrganizationQueryType newOrganizationChildrenBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH, newOrganizationChildrenBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationChildrenBranch(OrganizationQueryType newOrganizationChildrenBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH, newOrganizationChildrenBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getOrganizationFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationFilter(FilterType newOrganizationFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_FILTER, newOrganizationFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationFilter(FilterType newOrganizationFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_FILTER, newOrganizationFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getOrganizationParentBranch() {
		return (OrganizationQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationParentBranch(OrganizationQueryType newOrganizationParentBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH, newOrganizationParentBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationParentBranch(OrganizationQueryType newOrganizationParentBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH, newOrganizationParentBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getOrganizationQuery() {
		return (OrganizationQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationQuery(OrganizationQueryType newOrganizationQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_QUERY, newOrganizationQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationQuery(OrganizationQueryType newOrganizationQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_QUERY, newOrganizationQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryResultType getOrganizationQueryResult() {
		return (OrganizationQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationQueryResult(OrganizationQueryResultType newOrganizationQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT, newOrganizationQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationQueryResult(OrganizationQueryResultType newOrganizationQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT, newOrganizationQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getPostalAddressFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalAddressFilter(FilterType newPostalAddressFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER, newPostalAddressFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalAddressFilter(FilterType newPostalAddressFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER, newPostalAddressFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalClauseType getRationalClause() {
		return (RationalClauseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__RATIONAL_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationalClause(RationalClauseType newRationalClause, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__RATIONAL_CLAUSE, newRationalClause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationalClause(RationalClauseType newRationalClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__RATIONAL_CLAUSE, newRationalClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getRegistryEntryFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryFilter(FilterType newRegistryEntryFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER, newRegistryEntryFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryFilter(FilterType newRegistryEntryFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER, newRegistryEntryFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryType getRegistryEntryQuery() {
		return (RegistryEntryQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY, newRegistryEntryQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY, newRegistryEntryQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryResultType getRegistryEntryQueryResult() {
		return (RegistryEntryQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryQueryResult(RegistryEntryQueryResultType newRegistryEntryQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT, newRegistryEntryQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryQueryResult(RegistryEntryQueryResultType newRegistryEntryQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT, newRegistryEntryQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getRegistryObjectFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectFilter(FilterType newRegistryObjectFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER, newRegistryObjectFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectFilter(FilterType newRegistryObjectFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER, newRegistryObjectFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getRegistryObjectQuery() {
		return (RegistryObjectQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY, newRegistryObjectQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY, newRegistryObjectQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getRegistryObjectQueryResult() {
		return (RegistryObjectListType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectQueryResult(RegistryObjectListType newRegistryObjectQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT, newRegistryObjectQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectQueryResult(RegistryObjectListType newRegistryObjectQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT, newRegistryObjectQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getRegistryPackageFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryPackageFilter(FilterType newRegistryPackageFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER, newRegistryPackageFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryPackageFilter(FilterType newRegistryPackageFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER, newRegistryPackageFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackageQueryType getRegistryPackageQuery() {
		return (RegistryPackageQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryPackageQuery(RegistryPackageQueryType newRegistryPackageQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY, newRegistryPackageQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryPackageQuery(RegistryPackageQueryType newRegistryPackageQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY, newRegistryPackageQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackageQueryResultType getRegistryPackageQueryResult() {
		return (RegistryPackageQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryPackageQueryResult(RegistryPackageQueryResultType newRegistryPackageQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT, newRegistryPackageQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryPackageQueryResult(RegistryPackageQueryResultType newRegistryPackageQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT, newRegistryPackageQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOptionType getResponseOption() {
		return (ResponseOptionType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__RESPONSE_OPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseOption(ResponseOptionType newResponseOption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__RESPONSE_OPTION, newResponseOption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseOption(ResponseOptionType newResponseOption) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__RESPONSE_OPTION, newResponseOption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingBranchType getServiceBindingBranch() {
		return (ServiceBindingBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBindingBranch(ServiceBindingBranchType newServiceBindingBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH, newServiceBindingBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBindingBranch(ServiceBindingBranchType newServiceBindingBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH, newServiceBindingBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getServiceBindingFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBindingFilter(FilterType newServiceBindingFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_FILTER, newServiceBindingFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBindingFilter(FilterType newServiceBindingFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_FILTER, newServiceBindingFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingBranchType getServiceBindingTargetBranch() {
		return (ServiceBindingBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBindingTargetBranch(ServiceBindingBranchType newServiceBindingTargetBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH, newServiceBindingTargetBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBindingTargetBranch(ServiceBindingBranchType newServiceBindingTargetBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH, newServiceBindingTargetBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getServiceFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceFilter(FilterType newServiceFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_FILTER, newServiceFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFilter(FilterType newServiceFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_FILTER, newServiceFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQueryType getServiceQuery() {
		return (ServiceQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceQuery(ServiceQueryType newServiceQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_QUERY, newServiceQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceQuery(ServiceQueryType newServiceQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_QUERY, newServiceQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQueryResultType getServiceQueryResult() {
		return (ServiceQueryResultType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceQueryResult(ServiceQueryResultType newServiceQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_QUERY_RESULT, newServiceQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceQueryResult(ServiceQueryResultType newServiceQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_QUERY_RESULT, newServiceQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClauseType getSimpleClause() {
		return (SimpleClauseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SIMPLE_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleClause(SimpleClauseType newSimpleClause, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SIMPLE_CLAUSE, newSimpleClause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleClause(SimpleClauseType newSimpleClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SIMPLE_CLAUSE, newSimpleClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotBranchType getSlotBranch() {
		return (SlotBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotBranch(SlotBranchType newSlotBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_BRANCH, newSlotBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotBranch(SlotBranchType newSlotBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_BRANCH, newSlotBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getSlotFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotFilter(FilterType newSlotFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_FILTER, newSlotFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotFilter(FilterType newSlotFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_FILTER, newSlotFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getSlotValueFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_VALUE_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotValueFilter(FilterType newSlotValueFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_VALUE_FILTER, newSlotValueFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotValueFilter(FilterType newSlotValueFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SLOT_VALUE_FILTER, newSlotValueFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationBranchType getSourceAssociationBranch() {
		return (AssociationBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAssociationBranch(AssociationBranchType newSourceAssociationBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH, newSourceAssociationBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAssociationBranch(AssociationBranchType newSourceAssociationBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH, newSourceAssociationBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationLinkBranchType getSpecificationLinkBranch() {
		return (SpecificationLinkBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationLinkBranch(SpecificationLinkBranchType newSpecificationLinkBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH, newSpecificationLinkBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationLinkBranch(SpecificationLinkBranchType newSpecificationLinkBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH, newSpecificationLinkBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getSpecificationLinkFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationLinkFilter(FilterType newSpecificationLinkFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER, newSpecificationLinkFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationLinkFilter(FilterType newSpecificationLinkFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER, newSpecificationLinkFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSqlQuery() {
		return (String)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SQL_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlQuery(String newSqlQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SQL_QUERY, newSqlQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getSqlQueryResult() {
		return (RegistryObjectListType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SQL_QUERY_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlQueryResult(RegistryObjectListType newSqlQueryResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SQL_QUERY_RESULT, newSqlQueryResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlQueryResult(RegistryObjectListType newSqlQueryResult) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SQL_QUERY_RESULT, newSqlQueryResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringClauseType getStringClause() {
		return (StringClauseType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__STRING_CLAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringClause(StringClauseType newStringClause, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__STRING_CLAUSE, newStringClause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringClause(StringClauseType newStringClause) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__STRING_CLAUSE, newStringClause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationBranchType getTargetAssociationBranch() {
		return (AssociationBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAssociationBranch(AssociationBranchType newTargetAssociationBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH, newTargetAssociationBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAssociationBranch(AssociationBranchType newTargetAssociationBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH, newTargetAssociationBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getTelephoneNumberFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelephoneNumberFilter(FilterType newTelephoneNumberFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER, newTelephoneNumberFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephoneNumberFilter(FilterType newTelephoneNumberFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER, newTelephoneNumberFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserBranchType getUserBranch() {
		return (UserBranchType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__USER_BRANCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserBranch(UserBranchType newUserBranch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__USER_BRANCH, newUserBranch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserBranch(UserBranchType newUserBranch) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__USER_BRANCH, newUserBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getUserFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__USER_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFilter(FilterType newUserFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__USER_FILTER, newUserFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFilter(FilterType newUserFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__USER_FILTER, newUserFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case QueryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case QueryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				return basicSetAdhocQueryRequest(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				return basicSetAdhocQueryResponse(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_FILTER:
				return basicSetAssociationFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				return basicSetAssociationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT:
				return basicSetAssociationQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER:
				return basicSetAuditableEventFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				return basicSetAuditableEventQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT:
				return basicSetAuditableEventQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_CLAUSE:
				return basicSetBooleanClause(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_FILTER:
				return basicSetClassificationFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				return basicSetClassificationNodeChildrenBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER:
				return basicSetClassificationNodeFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH:
				return basicSetClassificationNodeParentBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				return basicSetClassificationNodeQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT:
				return basicSetClassificationNodeQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				return basicSetClassificationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT:
				return basicSetClassificationQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER:
				return basicSetClassificationSchemeFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				return basicSetClassificationSchemeQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT:
				return basicSetClassificationSchemeQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH:
				return basicSetClassifiedByBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLAUSE:
				return basicSetClause(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_CLAUSE:
				return basicSetCompoundClause(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__DESCRIPTION_BRANCH:
				return basicSetDescriptionBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER:
				return basicSetEmailAddressFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER:
				return basicSetExternalIdentifierFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER:
				return basicSetExternalLinkFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER:
				return basicSetExtrinsicObjectFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				return basicSetExtrinsicObjectQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT:
				return basicSetExtrinsicObjectQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY:
				return basicSetFilterQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY_RESULT:
				return basicSetFilterQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_REQUEST:
				return basicSetGetContentRequest(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_RESPONSE:
				return basicSetGetContentResponse(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER:
				return basicSetLocalizedStringFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__NAME_BRANCH:
				return basicSetNameBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH:
				return basicSetOrganizationChildrenBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_FILTER:
				return basicSetOrganizationFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH:
				return basicSetOrganizationParentBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				return basicSetOrganizationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT:
				return basicSetOrganizationQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER:
				return basicSetPostalAddressFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__RATIONAL_CLAUSE:
				return basicSetRationalClause(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER:
				return basicSetRegistryEntryFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY:
				return basicSetRegistryEntryQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT:
				return basicSetRegistryEntryQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER:
				return basicSetRegistryObjectFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				return basicSetRegistryObjectQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT:
				return basicSetRegistryObjectQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER:
				return basicSetRegistryPackageFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				return basicSetRegistryPackageQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT:
				return basicSetRegistryPackageQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				return basicSetResponseOption(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH:
				return basicSetServiceBindingBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_FILTER:
				return basicSetServiceBindingFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH:
				return basicSetServiceBindingTargetBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_FILTER:
				return basicSetServiceFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				return basicSetServiceQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY_RESULT:
				return basicSetServiceQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SIMPLE_CLAUSE:
				return basicSetSimpleClause(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SLOT_BRANCH:
				return basicSetSlotBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SLOT_FILTER:
				return basicSetSlotFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SLOT_VALUE_FILTER:
				return basicSetSlotValueFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH:
				return basicSetSourceAssociationBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH:
				return basicSetSpecificationLinkBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER:
				return basicSetSpecificationLinkFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY_RESULT:
				return basicSetSqlQueryResult(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__STRING_CLAUSE:
				return basicSetStringClause(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH:
				return basicSetTargetAssociationBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER:
				return basicSetTelephoneNumberFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__USER_BRANCH:
				return basicSetUserBranch(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__USER_FILTER:
				return basicSetUserFilter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case QueryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case QueryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				return getAdhocQueryRequest();
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				return getAdhocQueryResponse();
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_FILTER:
				return getAssociationFilter();
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				return getAssociationQuery();
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT:
				return getAssociationQueryResult();
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER:
				return getAuditableEventFilter();
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				return getAuditableEventQuery();
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT:
				return getAuditableEventQueryResult();
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_CLAUSE:
				return getBooleanClause();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_FILTER:
				return getClassificationFilter();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				return getClassificationNodeChildrenBranch();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER:
				return getClassificationNodeFilter();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH:
				return getClassificationNodeParentBranch();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				return getClassificationNodeQuery();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT:
				return getClassificationNodeQueryResult();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				return getClassificationQuery();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT:
				return getClassificationQueryResult();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER:
				return getClassificationSchemeFilter();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT:
				return getClassificationSchemeQueryResult();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH:
				return getClassifiedByBranch();
			case QueryPackage.DOCUMENT_ROOT__CLAUSE:
				return getClause();
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_CLAUSE:
				return getCompoundClause();
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_CLAUSE:
				return getDateTimeClause();
			case QueryPackage.DOCUMENT_ROOT__DESCRIPTION_BRANCH:
				return getDescriptionBranch();
			case QueryPackage.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER:
				return getEmailAddressFilter();
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER:
				return getExternalIdentifierFilter();
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER:
				return getExternalLinkFilter();
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER:
				return getExtrinsicObjectFilter();
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				return getExtrinsicObjectQuery();
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT:
				return getExtrinsicObjectQueryResult();
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY:
				return getFilterQuery();
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY_RESULT:
				return getFilterQueryResult();
			case QueryPackage.DOCUMENT_ROOT__FLOAT_CLAUSE:
				return new Float(getFloatClause());
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_REQUEST:
				return getGetContentRequest();
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_RESPONSE:
				return getGetContentResponse();
			case QueryPackage.DOCUMENT_ROOT__INT_CLAUSE:
				return getIntClause();
			case QueryPackage.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER:
				return getLocalizedStringFilter();
			case QueryPackage.DOCUMENT_ROOT__NAME_BRANCH:
				return getNameBranch();
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH:
				return getOrganizationChildrenBranch();
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_FILTER:
				return getOrganizationFilter();
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH:
				return getOrganizationParentBranch();
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				return getOrganizationQuery();
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT:
				return getOrganizationQueryResult();
			case QueryPackage.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER:
				return getPostalAddressFilter();
			case QueryPackage.DOCUMENT_ROOT__RATIONAL_CLAUSE:
				return getRationalClause();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER:
				return getRegistryEntryFilter();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY:
				return getRegistryEntryQuery();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT:
				return getRegistryEntryQueryResult();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER:
				return getRegistryObjectFilter();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT:
				return getRegistryObjectQueryResult();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER:
				return getRegistryPackageFilter();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				return getRegistryPackageQuery();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT:
				return getRegistryPackageQueryResult();
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				return getResponseOption();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH:
				return getServiceBindingBranch();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_FILTER:
				return getServiceBindingFilter();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH:
				return getServiceBindingTargetBranch();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_FILTER:
				return getServiceFilter();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				return getServiceQuery();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY_RESULT:
				return getServiceQueryResult();
			case QueryPackage.DOCUMENT_ROOT__SIMPLE_CLAUSE:
				return getSimpleClause();
			case QueryPackage.DOCUMENT_ROOT__SLOT_BRANCH:
				return getSlotBranch();
			case QueryPackage.DOCUMENT_ROOT__SLOT_FILTER:
				return getSlotFilter();
			case QueryPackage.DOCUMENT_ROOT__SLOT_VALUE_FILTER:
				return getSlotValueFilter();
			case QueryPackage.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH:
				return getSourceAssociationBranch();
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH:
				return getSpecificationLinkBranch();
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER:
				return getSpecificationLinkFilter();
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY:
				return getSqlQuery();
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY_RESULT:
				return getSqlQueryResult();
			case QueryPackage.DOCUMENT_ROOT__STRING_CLAUSE:
				return getStringClause();
			case QueryPackage.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH:
				return getTargetAssociationBranch();
			case QueryPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER:
				return getTelephoneNumberFilter();
			case QueryPackage.DOCUMENT_ROOT__USER_BRANCH:
				return getUserBranch();
			case QueryPackage.DOCUMENT_ROOT__USER_FILTER:
				return getUserFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				setAdhocQueryRequest((AdhocQueryRequestType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				setAdhocQueryResponse((AdhocQueryResponseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_FILTER:
				setAssociationFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				setAssociationQuery((AssociationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT:
				setAssociationQueryResult((AssociationQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER:
				setAuditableEventFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				setAuditableEventQuery((AuditableEventQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT:
				setAuditableEventQueryResult((AuditableEventQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_CLAUSE:
				setBooleanClause((BooleanClauseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_FILTER:
				setClassificationFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				setClassificationNodeChildrenBranch((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER:
				setClassificationNodeFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH:
				setClassificationNodeParentBranch((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT:
				setClassificationNodeQueryResult((ClassificationNodeQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				setClassificationQuery((ClassificationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT:
				setClassificationQueryResult((ClassificationQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER:
				setClassificationSchemeFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT:
				setClassificationSchemeQueryResult((ClassificationSchemeQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH:
				setClassifiedByBranch((ClassifiedByBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLAUSE:
				setClause((ClauseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_CLAUSE:
				setCompoundClause((CompoundClauseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_CLAUSE:
				setDateTimeClause((Object)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__DESCRIPTION_BRANCH:
				setDescriptionBranch((InternationalStringBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER:
				setEmailAddressFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER:
				setExternalIdentifierFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER:
				setExternalLinkFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER:
				setExtrinsicObjectFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				setExtrinsicObjectQuery((ExtrinsicObjectQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT:
				setExtrinsicObjectQueryResult((ExtrinsicObjectQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY:
				setFilterQuery((FilterQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY_RESULT:
				setFilterQueryResult((FilterQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__FLOAT_CLAUSE:
				setFloatClause(((Float)newValue).floatValue());
				return;
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_REQUEST:
				setGetContentRequest((GetContentRequestType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_RESPONSE:
				setGetContentResponse((GetContentResponseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__INT_CLAUSE:
				setIntClause((BigInteger)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER:
				setLocalizedStringFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__NAME_BRANCH:
				setNameBranch((InternationalStringBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH:
				setOrganizationChildrenBranch((OrganizationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_FILTER:
				setOrganizationFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH:
				setOrganizationParentBranch((OrganizationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT:
				setOrganizationQueryResult((OrganizationQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER:
				setPostalAddressFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__RATIONAL_CLAUSE:
				setRationalClause((RationalClauseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER:
				setRegistryEntryFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT:
				setRegistryEntryQueryResult((RegistryEntryQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER:
				setRegistryObjectFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT:
				setRegistryObjectQueryResult((RegistryObjectListType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER:
				setRegistryPackageFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				setRegistryPackageQuery((RegistryPackageQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT:
				setRegistryPackageQueryResult((RegistryPackageQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH:
				setServiceBindingBranch((ServiceBindingBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_FILTER:
				setServiceBindingFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH:
				setServiceBindingTargetBranch((ServiceBindingBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_FILTER:
				setServiceFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY_RESULT:
				setServiceQueryResult((ServiceQueryResultType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SIMPLE_CLAUSE:
				setSimpleClause((SimpleClauseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SLOT_BRANCH:
				setSlotBranch((SlotBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SLOT_FILTER:
				setSlotFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SLOT_VALUE_FILTER:
				setSlotValueFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH:
				setSourceAssociationBranch((AssociationBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH:
				setSpecificationLinkBranch((SpecificationLinkBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER:
				setSpecificationLinkFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY:
				setSqlQuery((String)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY_RESULT:
				setSqlQueryResult((RegistryObjectListType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__STRING_CLAUSE:
				setStringClause((StringClauseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH:
				setTargetAssociationBranch((AssociationBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER:
				setTelephoneNumberFilter((FilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__USER_BRANCH:
				setUserBranch((UserBranchType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__USER_FILTER:
				setUserFilter((FilterType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case QueryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case QueryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				setAdhocQueryRequest((AdhocQueryRequestType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				setAdhocQueryResponse((AdhocQueryResponseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_FILTER:
				setAssociationFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				setAssociationQuery((AssociationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT:
				setAssociationQueryResult((AssociationQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER:
				setAuditableEventFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				setAuditableEventQuery((AuditableEventQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT:
				setAuditableEventQueryResult((AuditableEventQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_CLAUSE:
				setBooleanClause((BooleanClauseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_FILTER:
				setClassificationFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				setClassificationNodeChildrenBranch((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER:
				setClassificationNodeFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH:
				setClassificationNodeParentBranch((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT:
				setClassificationNodeQueryResult((ClassificationNodeQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				setClassificationQuery((ClassificationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT:
				setClassificationQueryResult((ClassificationQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER:
				setClassificationSchemeFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT:
				setClassificationSchemeQueryResult((ClassificationSchemeQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH:
				setClassifiedByBranch((ClassifiedByBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLAUSE:
				setClause((ClauseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_CLAUSE:
				setCompoundClause((CompoundClauseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_CLAUSE:
				setDateTimeClause(DATE_TIME_CLAUSE_EDEFAULT);
				return;
			case QueryPackage.DOCUMENT_ROOT__DESCRIPTION_BRANCH:
				setDescriptionBranch((InternationalStringBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER:
				setEmailAddressFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER:
				setExternalIdentifierFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER:
				setExternalLinkFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER:
				setExtrinsicObjectFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				setExtrinsicObjectQuery((ExtrinsicObjectQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT:
				setExtrinsicObjectQueryResult((ExtrinsicObjectQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY:
				setFilterQuery((FilterQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY_RESULT:
				setFilterQueryResult((FilterQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__FLOAT_CLAUSE:
				setFloatClause(FLOAT_CLAUSE_EDEFAULT);
				return;
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_REQUEST:
				setGetContentRequest((GetContentRequestType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_RESPONSE:
				setGetContentResponse((GetContentResponseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__INT_CLAUSE:
				setIntClause(INT_CLAUSE_EDEFAULT);
				return;
			case QueryPackage.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER:
				setLocalizedStringFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__NAME_BRANCH:
				setNameBranch((InternationalStringBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH:
				setOrganizationChildrenBranch((OrganizationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_FILTER:
				setOrganizationFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH:
				setOrganizationParentBranch((OrganizationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT:
				setOrganizationQueryResult((OrganizationQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER:
				setPostalAddressFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__RATIONAL_CLAUSE:
				setRationalClause((RationalClauseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER:
				setRegistryEntryFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT:
				setRegistryEntryQueryResult((RegistryEntryQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER:
				setRegistryObjectFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT:
				setRegistryObjectQueryResult((RegistryObjectListType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER:
				setRegistryPackageFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				setRegistryPackageQuery((RegistryPackageQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT:
				setRegistryPackageQueryResult((RegistryPackageQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH:
				setServiceBindingBranch((ServiceBindingBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_FILTER:
				setServiceBindingFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH:
				setServiceBindingTargetBranch((ServiceBindingBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_FILTER:
				setServiceFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY_RESULT:
				setServiceQueryResult((ServiceQueryResultType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SIMPLE_CLAUSE:
				setSimpleClause((SimpleClauseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SLOT_BRANCH:
				setSlotBranch((SlotBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SLOT_FILTER:
				setSlotFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SLOT_VALUE_FILTER:
				setSlotValueFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH:
				setSourceAssociationBranch((AssociationBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH:
				setSpecificationLinkBranch((SpecificationLinkBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER:
				setSpecificationLinkFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY:
				setSqlQuery(SQL_QUERY_EDEFAULT);
				return;
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY_RESULT:
				setSqlQueryResult((RegistryObjectListType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__STRING_CLAUSE:
				setStringClause((StringClauseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH:
				setTargetAssociationBranch((AssociationBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER:
				setTelephoneNumberFilter((FilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__USER_BRANCH:
				setUserBranch((UserBranchType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__USER_FILTER:
				setUserFilter((FilterType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case QueryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case QueryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				return getAdhocQueryRequest() != null;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				return getAdhocQueryResponse() != null;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_FILTER:
				return getAssociationFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				return getAssociationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT:
				return getAssociationQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER:
				return getAuditableEventFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				return getAuditableEventQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT:
				return getAuditableEventQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_CLAUSE:
				return getBooleanClause() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_FILTER:
				return getClassificationFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				return getClassificationNodeChildrenBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER:
				return getClassificationNodeFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH:
				return getClassificationNodeParentBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				return getClassificationNodeQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT:
				return getClassificationNodeQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				return getClassificationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT:
				return getClassificationQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER:
				return getClassificationSchemeFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT:
				return getClassificationSchemeQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH:
				return getClassifiedByBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__CLAUSE:
				return getClause() != null;
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_CLAUSE:
				return getCompoundClause() != null;
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_CLAUSE:
				return DATE_TIME_CLAUSE_EDEFAULT == null ? getDateTimeClause() != null : !DATE_TIME_CLAUSE_EDEFAULT.equals(getDateTimeClause());
			case QueryPackage.DOCUMENT_ROOT__DESCRIPTION_BRANCH:
				return getDescriptionBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER:
				return getEmailAddressFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER:
				return getExternalIdentifierFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_FILTER:
				return getExternalLinkFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER:
				return getExtrinsicObjectFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				return getExtrinsicObjectQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT:
				return getExtrinsicObjectQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY:
				return getFilterQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__FILTER_QUERY_RESULT:
				return getFilterQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__FLOAT_CLAUSE:
				return getFloatClause() != FLOAT_CLAUSE_EDEFAULT;
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_REQUEST:
				return getGetContentRequest() != null;
			case QueryPackage.DOCUMENT_ROOT__GET_CONTENT_RESPONSE:
				return getGetContentResponse() != null;
			case QueryPackage.DOCUMENT_ROOT__INT_CLAUSE:
				return INT_CLAUSE_EDEFAULT == null ? getIntClause() != null : !INT_CLAUSE_EDEFAULT.equals(getIntClause());
			case QueryPackage.DOCUMENT_ROOT__LOCALIZED_STRING_FILTER:
				return getLocalizedStringFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__NAME_BRANCH:
				return getNameBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH:
				return getOrganizationChildrenBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_FILTER:
				return getOrganizationFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH:
				return getOrganizationParentBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				return getOrganizationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT:
				return getOrganizationQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER:
				return getPostalAddressFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__RATIONAL_CLAUSE:
				return getRationalClause() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER:
				return getRegistryEntryFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY:
				return getRegistryEntryQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT:
				return getRegistryEntryQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER:
				return getRegistryObjectFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT:
				return getRegistryObjectQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER:
				return getRegistryPackageFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				return getRegistryPackageQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT:
				return getRegistryPackageQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				return getResponseOption() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_BRANCH:
				return getServiceBindingBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_FILTER:
				return getServiceBindingFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH:
				return getServiceBindingTargetBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_FILTER:
				return getServiceFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				return getServiceQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY_RESULT:
				return getServiceQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__SIMPLE_CLAUSE:
				return getSimpleClause() != null;
			case QueryPackage.DOCUMENT_ROOT__SLOT_BRANCH:
				return getSlotBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__SLOT_FILTER:
				return getSlotFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__SLOT_VALUE_FILTER:
				return getSlotValueFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH:
				return getSourceAssociationBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH:
				return getSpecificationLinkBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER:
				return getSpecificationLinkFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY:
				return SQL_QUERY_EDEFAULT == null ? getSqlQuery() != null : !SQL_QUERY_EDEFAULT.equals(getSqlQuery());
			case QueryPackage.DOCUMENT_ROOT__SQL_QUERY_RESULT:
				return getSqlQueryResult() != null;
			case QueryPackage.DOCUMENT_ROOT__STRING_CLAUSE:
				return getStringClause() != null;
			case QueryPackage.DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH:
				return getTargetAssociationBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER:
				return getTelephoneNumberFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__USER_BRANCH:
				return getUserBranch() != null;
			case QueryPackage.DOCUMENT_ROOT__USER_FILTER:
				return getUserFilter() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
