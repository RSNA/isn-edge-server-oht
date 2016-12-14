/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryQuery <em>Adhoc Query Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryRequest <em>Adhoc Query Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryResponse <em>Adhoc Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAssociationQuery <em>Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getBooleanFilter <em>Boolean Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getCompoundFilter <em>Compound Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getDateTimeFilter <em>Date Time Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalIdentifierQuery <em>External Identifier Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalLinkQuery <em>External Link Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFederationQuery <em>Federation Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFloatFilter <em>Float Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getIntegerFilter <em>Integer Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getNotificationQuery <em>Notification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getOrganizationQuery <em>Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryPackageQuery <em>Registry Package Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryQuery <em>Registry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceBindingQuery <em>Service Binding Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceQuery <em>Service Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSpecificationLinkQuery <em>Specification Link Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getStringFilter <em>String Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSubscriptionQuery <em>Subscription Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getUserQuery <em>User Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Adhoc Query Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adhoc Query Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adhoc Query Query</em>' containment reference.
	 * @see #setAdhocQueryQuery(AdhocQueryQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_AdhocQueryQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdhocQueryQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AdhocQueryQueryType getAdhocQueryQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryQuery <em>Adhoc Query Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query Query</em>' containment reference.
	 * @see #getAdhocQueryQuery()
	 * @generated
	 */
	void setAdhocQueryQuery(AdhocQueryQueryType value);

	/**
	 * Returns the value of the '<em><b>Adhoc Query Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Ad hoc query request specifies an ad hoc query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adhoc Query Request</em>' containment reference.
	 * @see #setAdhocQueryRequest(AdhocQueryRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_AdhocQueryRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdhocQueryRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	AdhocQueryRequestType getAdhocQueryRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryRequest <em>Adhoc Query Request</em>}' containment reference.
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
	 *         The response includes a RegistryObjectList which has zero or more
	 *         RegistryObjects that match the query specified in AdhocQueryRequest.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adhoc Query Response</em>' containment reference.
	 * @see #setAdhocQueryResponse(AdhocQueryResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_AdhocQueryResponse()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdhocQueryResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AdhocQueryResponseType getAdhocQueryResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryResponse <em>Adhoc Query Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query Response</em>' containment reference.
	 * @see #getAdhocQueryResponse()
	 * @generated
	 */
	void setAdhocQueryResponse(AdhocQueryResponseType value);

	/**
	 * Returns the value of the '<em><b>Association Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Query</em>' containment reference.
	 * @see #setAssociationQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_AssociationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getAssociationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAssociationQuery <em>Association Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Query</em>' containment reference.
	 * @see #getAssociationQuery()
	 * @generated
	 */
	void setAssociationQuery(RegistryObjectQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_AuditableEventQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditableEventQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditableEventQueryType getAuditableEventQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAuditableEventQuery <em>Auditable Event Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event Query</em>' containment reference.
	 * @see #getAuditableEventQuery()
	 * @generated
	 */
	void setAuditableEventQuery(AuditableEventQueryType value);

	/**
	 * Returns the value of the '<em><b>Boolean Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Filter</em>' containment reference.
	 * @see #setBooleanFilter(BooleanFilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_BooleanFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BooleanFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanFilterType getBooleanFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getBooleanFilter <em>Boolean Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Filter</em>' containment reference.
	 * @see #getBooleanFilter()
	 * @generated
	 */
	void setBooleanFilter(BooleanFilterType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ClassificationNodeQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationNodeQuery <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #getClassificationNodeQuery()
	 * @generated
	 */
	void setClassificationNodeQuery(ClassificationNodeQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ClassificationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationQueryType getClassificationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationQuery <em>Classification Query</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ClassificationSchemeQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryType getClassificationSchemeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationSchemeQuery <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Query</em>' containment reference.
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 */
	void setClassificationSchemeQuery(ClassificationSchemeQueryType value);

	/**
	 * Returns the value of the '<em><b>Compound Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Filter</em>' containment reference.
	 * @see #setCompoundFilter(CompoundFilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_CompoundFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompoundFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundFilterType getCompoundFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getCompoundFilter <em>Compound Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Filter</em>' containment reference.
	 * @see #getCompoundFilter()
	 * @generated
	 */
	void setCompoundFilter(CompoundFilterType value);

	/**
	 * Returns the value of the '<em><b>Date Time Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Filter</em>' containment reference.
	 * @see #setDateTimeFilter(DateTimeFilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_DateTimeFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTimeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeFilterType getDateTimeFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getDateTimeFilter <em>Date Time Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Filter</em>' containment reference.
	 * @see #getDateTimeFilter()
	 * @generated
	 */
	void setDateTimeFilter(DateTimeFilterType value);

	/**
	 * Returns the value of the '<em><b>External Identifier Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifier Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifier Query</em>' containment reference.
	 * @see #setExternalIdentifierQuery(ExternalIdentifierQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ExternalIdentifierQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalIdentifierQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalIdentifierQueryType getExternalIdentifierQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalIdentifierQuery <em>External Identifier Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Identifier Query</em>' containment reference.
	 * @see #getExternalIdentifierQuery()
	 * @generated
	 */
	void setExternalIdentifierQuery(ExternalIdentifierQueryType value);

	/**
	 * Returns the value of the '<em><b>External Link Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Link Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Link Query</em>' containment reference.
	 * @see #setExternalLinkQuery(ExternalLinkQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ExternalLinkQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalLinkQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalLinkQueryType getExternalLinkQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalLinkQuery <em>External Link Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Link Query</em>' containment reference.
	 * @see #getExternalLinkQuery()
	 * @generated
	 */
	void setExternalLinkQuery(ExternalLinkQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ExtrinsicObjectQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtrinsicObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtrinsicObjectQueryType getExtrinsicObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object Query</em>' containment reference.
	 * @see #getExtrinsicObjectQuery()
	 * @generated
	 */
	void setExtrinsicObjectQuery(ExtrinsicObjectQueryType value);

	/**
	 * Returns the value of the '<em><b>Federation Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation Query</em>' containment reference.
	 * @see #setFederationQuery(FederationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_FederationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FederationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	FederationQueryType getFederationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFederationQuery <em>Federation Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation Query</em>' containment reference.
	 * @see #getFederationQuery()
	 * @generated
	 */
	void setFederationQuery(FederationQueryType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_Filter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Returns the value of the '<em><b>Float Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Filter</em>' containment reference.
	 * @see #setFloatFilter(FloatFilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_FloatFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FloatFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatFilterType getFloatFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFloatFilter <em>Float Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Filter</em>' containment reference.
	 * @see #getFloatFilter()
	 * @generated
	 */
	void setFloatFilter(FloatFilterType value);

	/**
	 * Returns the value of the '<em><b>Integer Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Filter</em>' containment reference.
	 * @see #setIntegerFilter(IntegerFilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_IntegerFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntegerFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerFilterType getIntegerFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getIntegerFilter <em>Integer Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Filter</em>' containment reference.
	 * @see #getIntegerFilter()
	 * @generated
	 */
	void setIntegerFilter(IntegerFilterType value);

	/**
	 * Returns the value of the '<em><b>Notification Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Query</em>' containment reference.
	 * @see #setNotificationQuery(NotificationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_NotificationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NotificationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationQueryType getNotificationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getNotificationQuery <em>Notification Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Query</em>' containment reference.
	 * @see #getNotificationQuery()
	 * @generated
	 */
	void setNotificationQuery(NotificationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_OrganizationQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOrganizationQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getOrganizationQuery <em>Organization Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Query</em>' containment reference.
	 * @see #getOrganizationQuery()
	 * @generated
	 */
	void setOrganizationQuery(OrganizationQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_RegistryObjectQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getRegistryObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryObjectQuery <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #getRegistryObjectQuery()
	 * @generated
	 */
	void setRegistryObjectQuery(RegistryObjectQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_RegistryPackageQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryPackageQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryPackageQueryType getRegistryPackageQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryPackageQuery <em>Registry Package Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package Query</em>' containment reference.
	 * @see #getRegistryPackageQuery()
	 * @generated
	 */
	void setRegistryPackageQuery(RegistryPackageQueryType value);

	/**
	 * Returns the value of the '<em><b>Registry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Query</em>' containment reference.
	 * @see #setRegistryQuery(RegistryQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_RegistryQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryQueryType getRegistryQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryQuery <em>Registry Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Query</em>' containment reference.
	 * @see #getRegistryQuery()
	 * @generated
	 */
	void setRegistryQuery(RegistryQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ResponseOption()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResponseOption' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseOptionType getResponseOption();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getResponseOption <em>Response Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Option</em>' containment reference.
	 * @see #getResponseOption()
	 * @generated
	 */
	void setResponseOption(ResponseOptionType value);

	/**
	 * Returns the value of the '<em><b>Service Binding Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding Query</em>' containment reference.
	 * @see #setServiceBindingQuery(ServiceBindingQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ServiceBindingQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceBindingQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingQueryType getServiceBindingQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceBindingQuery <em>Service Binding Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Query</em>' containment reference.
	 * @see #getServiceBindingQuery()
	 * @generated
	 */
	void setServiceBindingQuery(ServiceBindingQueryType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_ServiceQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceQueryType getServiceQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceQuery <em>Service Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Query</em>' containment reference.
	 * @see #getServiceQuery()
	 * @generated
	 */
	void setServiceQuery(ServiceQueryType value);

	/**
	 * Returns the value of the '<em><b>Specification Link Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link Query</em>' containment reference.
	 * @see #setSpecificationLinkQuery(SpecificationLinkQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_SpecificationLinkQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpecificationLinkQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificationLinkQueryType getSpecificationLinkQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSpecificationLinkQuery <em>Specification Link Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Link Query</em>' containment reference.
	 * @see #getSpecificationLinkQuery()
	 * @generated
	 */
	void setSpecificationLinkQuery(SpecificationLinkQueryType value);

	/**
	 * Returns the value of the '<em><b>String Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Filter</em>' containment reference.
	 * @see #setStringFilter(StringFilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_StringFilter()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StringFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	StringFilterType getStringFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getStringFilter <em>String Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Filter</em>' containment reference.
	 * @see #getStringFilter()
	 * @generated
	 */
	void setStringFilter(StringFilterType value);

	/**
	 * Returns the value of the '<em><b>Subscription Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Query</em>' containment reference.
	 * @see #setSubscriptionQuery(SubscriptionQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_SubscriptionQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubscriptionQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionQueryType getSubscriptionQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSubscriptionQuery <em>Subscription Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Query</em>' containment reference.
	 * @see #getSubscriptionQuery()
	 * @generated
	 */
	void setSubscriptionQuery(SubscriptionQueryType value);

	/**
	 * Returns the value of the '<em><b>User Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Query</em>' containment reference.
	 * @see #setUserQuery(UserQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getDocumentRoot_UserQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	UserQueryType getUserQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getUserQuery <em>User Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Query</em>' containment reference.
	 * @see #getUserQuery()
	 * @generated
	 */
	void setUserQuery(UserQueryType value);

} // DocumentRoot
