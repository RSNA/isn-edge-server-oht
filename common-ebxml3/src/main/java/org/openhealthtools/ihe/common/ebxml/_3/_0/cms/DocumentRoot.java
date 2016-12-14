/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2006/10/19 20:16:23 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms;

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
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentRequest <em>Catalog Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentResponse <em>Catalog Content Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentRequest <em>Validate Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentResponse <em>Validate Content Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Catalog Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request to catalog specified metadata and content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog Content Request</em>' containment reference.
	 * @see #setCatalogContentRequest(CatalogContentRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot_CatalogContentRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CatalogContentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogContentRequestType getCatalogContentRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentRequest <em>Catalog Content Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Content Request</em>' containment reference.
	 * @see #getCatalogContentRequest()
	 * @generated
	 */
	void setCatalogContentRequest(CatalogContentRequestType value);

	/**
	 * Returns the value of the '<em><b>Catalog Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response to request to catalog specified metadata and content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog Content Response</em>' containment reference.
	 * @see #setCatalogContentResponse(CatalogContentResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot_CatalogContentResponse()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CatalogContentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogContentResponseType getCatalogContentResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentResponse <em>Catalog Content Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Content Response</em>' containment reference.
	 * @see #getCatalogContentResponse()
	 * @generated
	 */
	void setCatalogContentResponse(CatalogContentResponseType value);

	/**
	 * Returns the value of the '<em><b>Validate Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request to validate specified metadata and content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate Content Request</em>' containment reference.
	 * @see #setValidateContentRequest(ValidateContentRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot_ValidateContentRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidateContentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidateContentRequestType getValidateContentRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentRequest <em>Validate Content Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Content Request</em>' containment reference.
	 * @see #getValidateContentRequest()
	 * @generated
	 */
	void setValidateContentRequest(ValidateContentRequestType value);

	/**
	 * Returns the value of the '<em><b>Validate Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response to request to validate specified metadata and content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate Content Response</em>' containment reference.
	 * @see #setValidateContentResponse(ValidateContentResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getDocumentRoot_ValidateContentResponse()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidateContentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidateContentResponseType getValidateContentResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentResponse <em>Validate Content Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Content Response</em>' containment reference.
	 * @see #getValidateContentResponse()
	 * @generated
	 */
	void setValidateContentResponse(ValidateContentResponseType value);

} // DocumentRoot
