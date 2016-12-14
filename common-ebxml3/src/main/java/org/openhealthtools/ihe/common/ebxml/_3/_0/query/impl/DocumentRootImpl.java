/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

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

import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalLinkQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FederationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.UserQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getAdhocQueryQuery <em>Adhoc Query Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getAdhocQueryRequest <em>Adhoc Query Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getAdhocQueryResponse <em>Adhoc Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getAssociationQuery <em>Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getBooleanFilter <em>Boolean Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getCompoundFilter <em>Compound Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getDateTimeFilter <em>Date Time Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getExternalIdentifierQuery <em>External Identifier Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getExternalLinkQuery <em>External Link Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getFederationQuery <em>Federation Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getFloatFilter <em>Float Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getIntegerFilter <em>Integer Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getNotificationQuery <em>Notification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getOrganizationQuery <em>Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getRegistryPackageQuery <em>Registry Package Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getRegistryQuery <em>Registry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getServiceBindingQuery <em>Service Binding Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getServiceQuery <em>Service Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getSpecificationLinkQuery <em>Specification Link Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getStringFilter <em>String Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getSubscriptionQuery <em>Subscription Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl#getUserQuery <em>User Query</em>}</li>
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
	public AdhocQueryQueryType getAdhocQueryQuery() {
		return (AdhocQueryQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdhocQueryQuery(AdhocQueryQueryType newAdhocQueryQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_QUERY, newAdhocQueryQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdhocQueryQuery(AdhocQueryQueryType newAdhocQueryQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ADHOC_QUERY_QUERY, newAdhocQueryQuery);
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
	public RegistryObjectQueryType getAssociationQuery() {
		return (RegistryObjectQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationQuery(RegistryObjectQueryType newAssociationQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY, newAssociationQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationQuery(RegistryObjectQueryType newAssociationQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_QUERY, newAssociationQuery);
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
	public BooleanFilterType getBooleanFilter() {
		return (BooleanFilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__BOOLEAN_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanFilter(BooleanFilterType newBooleanFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__BOOLEAN_FILTER, newBooleanFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanFilter(BooleanFilterType newBooleanFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__BOOLEAN_FILTER, newBooleanFilter);
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
	public CompoundFilterType getCompoundFilter() {
		return (CompoundFilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__COMPOUND_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundFilter(CompoundFilterType newCompoundFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__COMPOUND_FILTER, newCompoundFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundFilter(CompoundFilterType newCompoundFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__COMPOUND_FILTER, newCompoundFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeFilterType getDateTimeFilter() {
		return (DateTimeFilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__DATE_TIME_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeFilter(DateTimeFilterType newDateTimeFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__DATE_TIME_FILTER, newDateTimeFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeFilter(DateTimeFilterType newDateTimeFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__DATE_TIME_FILTER, newDateTimeFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalIdentifierQueryType getExternalIdentifierQuery() {
		return (ExternalIdentifierQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalIdentifierQuery(ExternalIdentifierQueryType newExternalIdentifierQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY, newExternalIdentifierQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalIdentifierQuery(ExternalIdentifierQueryType newExternalIdentifierQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY, newExternalIdentifierQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLinkQueryType getExternalLinkQuery() {
		return (ExternalLinkQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalLinkQuery(ExternalLinkQueryType newExternalLinkQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY, newExternalLinkQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalLinkQuery(ExternalLinkQueryType newExternalLinkQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY, newExternalLinkQuery);
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
	public FederationQueryType getFederationQuery() {
		return (FederationQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__FEDERATION_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederationQuery(FederationQueryType newFederationQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__FEDERATION_QUERY, newFederationQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederationQuery(FederationQueryType newFederationQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__FEDERATION_QUERY, newFederationQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilter() {
		return (FilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__FILTER, newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatFilterType getFloatFilter() {
		return (FloatFilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__FLOAT_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatFilter(FloatFilterType newFloatFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__FLOAT_FILTER, newFloatFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatFilter(FloatFilterType newFloatFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__FLOAT_FILTER, newFloatFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFilterType getIntegerFilter() {
		return (IntegerFilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__INTEGER_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerFilter(IntegerFilterType newIntegerFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__INTEGER_FILTER, newIntegerFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerFilter(IntegerFilterType newIntegerFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__INTEGER_FILTER, newIntegerFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationQueryType getNotificationQuery() {
		return (NotificationQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__NOTIFICATION_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationQuery(NotificationQueryType newNotificationQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__NOTIFICATION_QUERY, newNotificationQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationQuery(NotificationQueryType newNotificationQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__NOTIFICATION_QUERY, newNotificationQuery);
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
	public RegistryQueryType getRegistryQuery() {
		return (RegistryQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryQuery(RegistryQueryType newRegistryQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_QUERY, newRegistryQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryQuery(RegistryQueryType newRegistryQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__REGISTRY_QUERY, newRegistryQuery);
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
	public ServiceBindingQueryType getServiceBindingQuery() {
		return (ServiceBindingQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBindingQuery(ServiceBindingQueryType newServiceBindingQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_QUERY, newServiceBindingQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBindingQuery(ServiceBindingQueryType newServiceBindingQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING_QUERY, newServiceBindingQuery);
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
	public SpecificationLinkQueryType getSpecificationLinkQuery() {
		return (SpecificationLinkQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationLinkQuery(SpecificationLinkQueryType newSpecificationLinkQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY, newSpecificationLinkQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationLinkQuery(SpecificationLinkQueryType newSpecificationLinkQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY, newSpecificationLinkQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringFilterType getStringFilter() {
		return (StringFilterType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__STRING_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringFilter(StringFilterType newStringFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__STRING_FILTER, newStringFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringFilter(StringFilterType newStringFilter) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__STRING_FILTER, newStringFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionQueryType getSubscriptionQuery() {
		return (SubscriptionQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__SUBSCRIPTION_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionQuery(SubscriptionQueryType newSubscriptionQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__SUBSCRIPTION_QUERY, newSubscriptionQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionQuery(SubscriptionQueryType newSubscriptionQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__SUBSCRIPTION_QUERY, newSubscriptionQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserQueryType getUserQuery() {
		return (UserQueryType)getMixed().get(QueryPackage.Literals.DOCUMENT_ROOT__USER_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserQuery(UserQueryType newUserQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(QueryPackage.Literals.DOCUMENT_ROOT__USER_QUERY, newUserQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserQuery(UserQueryType newUserQuery) {
		((FeatureMap.Internal)getMixed()).set(QueryPackage.Literals.DOCUMENT_ROOT__USER_QUERY, newUserQuery);
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
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_QUERY:
				return basicSetAdhocQueryQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				return basicSetAdhocQueryRequest(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				return basicSetAdhocQueryResponse(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				return basicSetAssociationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				return basicSetAuditableEventQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_FILTER:
				return basicSetBooleanFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				return basicSetClassificationNodeQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				return basicSetClassificationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				return basicSetClassificationSchemeQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_FILTER:
				return basicSetCompoundFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_FILTER:
				return basicSetDateTimeFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY:
				return basicSetExternalIdentifierQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY:
				return basicSetExternalLinkQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				return basicSetExtrinsicObjectQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__FEDERATION_QUERY:
				return basicSetFederationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__FLOAT_FILTER:
				return basicSetFloatFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__INTEGER_FILTER:
				return basicSetIntegerFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__NOTIFICATION_QUERY:
				return basicSetNotificationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				return basicSetOrganizationQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				return basicSetRegistryObjectQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				return basicSetRegistryPackageQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_QUERY:
				return basicSetRegistryQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				return basicSetResponseOption(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_QUERY:
				return basicSetServiceBindingQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				return basicSetServiceQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY:
				return basicSetSpecificationLinkQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__STRING_FILTER:
				return basicSetStringFilter(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__SUBSCRIPTION_QUERY:
				return basicSetSubscriptionQuery(null, msgs);
			case QueryPackage.DOCUMENT_ROOT__USER_QUERY:
				return basicSetUserQuery(null, msgs);
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
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_QUERY:
				return getAdhocQueryQuery();
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				return getAdhocQueryRequest();
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				return getAdhocQueryResponse();
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				return getAssociationQuery();
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				return getAuditableEventQuery();
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_FILTER:
				return getBooleanFilter();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				return getClassificationNodeQuery();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				return getClassificationQuery();
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery();
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_FILTER:
				return getCompoundFilter();
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_FILTER:
				return getDateTimeFilter();
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY:
				return getExternalIdentifierQuery();
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY:
				return getExternalLinkQuery();
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				return getExtrinsicObjectQuery();
			case QueryPackage.DOCUMENT_ROOT__FEDERATION_QUERY:
				return getFederationQuery();
			case QueryPackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case QueryPackage.DOCUMENT_ROOT__FLOAT_FILTER:
				return getFloatFilter();
			case QueryPackage.DOCUMENT_ROOT__INTEGER_FILTER:
				return getIntegerFilter();
			case QueryPackage.DOCUMENT_ROOT__NOTIFICATION_QUERY:
				return getNotificationQuery();
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				return getOrganizationQuery();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				return getRegistryPackageQuery();
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_QUERY:
				return getRegistryQuery();
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				return getResponseOption();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_QUERY:
				return getServiceBindingQuery();
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				return getServiceQuery();
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY:
				return getSpecificationLinkQuery();
			case QueryPackage.DOCUMENT_ROOT__STRING_FILTER:
				return getStringFilter();
			case QueryPackage.DOCUMENT_ROOT__SUBSCRIPTION_QUERY:
				return getSubscriptionQuery();
			case QueryPackage.DOCUMENT_ROOT__USER_QUERY:
				return getUserQuery();
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
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_QUERY:
				setAdhocQueryQuery((AdhocQueryQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				setAdhocQueryRequest((AdhocQueryRequestType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				setAdhocQueryResponse((AdhocQueryResponseType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				setAssociationQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				setAuditableEventQuery((AuditableEventQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_FILTER:
				setBooleanFilter((BooleanFilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				setClassificationQuery((ClassificationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_FILTER:
				setCompoundFilter((CompoundFilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_FILTER:
				setDateTimeFilter((DateTimeFilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY:
				setExternalIdentifierQuery((ExternalIdentifierQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY:
				setExternalLinkQuery((ExternalLinkQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				setExtrinsicObjectQuery((ExtrinsicObjectQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__FEDERATION_QUERY:
				setFederationQuery((FederationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__FLOAT_FILTER:
				setFloatFilter((FloatFilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__INTEGER_FILTER:
				setIntegerFilter((IntegerFilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__NOTIFICATION_QUERY:
				setNotificationQuery((NotificationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				setRegistryPackageQuery((RegistryPackageQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_QUERY:
				setRegistryQuery((RegistryQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_QUERY:
				setServiceBindingQuery((ServiceBindingQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY:
				setSpecificationLinkQuery((SpecificationLinkQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__STRING_FILTER:
				setStringFilter((StringFilterType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__SUBSCRIPTION_QUERY:
				setSubscriptionQuery((SubscriptionQueryType)newValue);
				return;
			case QueryPackage.DOCUMENT_ROOT__USER_QUERY:
				setUserQuery((UserQueryType)newValue);
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
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_QUERY:
				setAdhocQueryQuery((AdhocQueryQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				setAdhocQueryRequest((AdhocQueryRequestType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				setAdhocQueryResponse((AdhocQueryResponseType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				setAssociationQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				setAuditableEventQuery((AuditableEventQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_FILTER:
				setBooleanFilter((BooleanFilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				setClassificationQuery((ClassificationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_FILTER:
				setCompoundFilter((CompoundFilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_FILTER:
				setDateTimeFilter((DateTimeFilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY:
				setExternalIdentifierQuery((ExternalIdentifierQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY:
				setExternalLinkQuery((ExternalLinkQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				setExtrinsicObjectQuery((ExtrinsicObjectQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__FEDERATION_QUERY:
				setFederationQuery((FederationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__FLOAT_FILTER:
				setFloatFilter((FloatFilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__INTEGER_FILTER:
				setIntegerFilter((IntegerFilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__NOTIFICATION_QUERY:
				setNotificationQuery((NotificationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				setRegistryPackageQuery((RegistryPackageQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_QUERY:
				setRegistryQuery((RegistryQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_QUERY:
				setServiceBindingQuery((ServiceBindingQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY:
				setSpecificationLinkQuery((SpecificationLinkQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__STRING_FILTER:
				setStringFilter((StringFilterType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__SUBSCRIPTION_QUERY:
				setSubscriptionQuery((SubscriptionQueryType)null);
				return;
			case QueryPackage.DOCUMENT_ROOT__USER_QUERY:
				setUserQuery((UserQueryType)null);
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
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_QUERY:
				return getAdhocQueryQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_REQUEST:
				return getAdhocQueryRequest() != null;
			case QueryPackage.DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE:
				return getAdhocQueryResponse() != null;
			case QueryPackage.DOCUMENT_ROOT__ASSOCIATION_QUERY:
				return getAssociationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY:
				return getAuditableEventQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__BOOLEAN_FILTER:
				return getBooleanFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY:
				return getClassificationNodeQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_QUERY:
				return getClassificationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__COMPOUND_FILTER:
				return getCompoundFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__DATE_TIME_FILTER:
				return getDateTimeFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY:
				return getExternalIdentifierQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTERNAL_LINK_QUERY:
				return getExternalLinkQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY:
				return getExtrinsicObjectQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__FEDERATION_QUERY:
				return getFederationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__FLOAT_FILTER:
				return getFloatFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__INTEGER_FILTER:
				return getIntegerFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__NOTIFICATION_QUERY:
				return getNotificationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__ORGANIZATION_QUERY:
				return getOrganizationQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY:
				return getRegistryPackageQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__REGISTRY_QUERY:
				return getRegistryQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__RESPONSE_OPTION:
				return getResponseOption() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_BINDING_QUERY:
				return getServiceBindingQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__SERVICE_QUERY:
				return getServiceQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY:
				return getSpecificationLinkQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__STRING_FILTER:
				return getStringFilter() != null;
			case QueryPackage.DOCUMENT_ROOT__SUBSCRIPTION_QUERY:
				return getSubscriptionQuery() != null;
			case QueryPackage.DOCUMENT_ROOT__USER_QUERY:
				return getUserQuery() != null;
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
