/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2006/10/19 20:16:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs;

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
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryError <em>Registry Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryRequest <em>Registry Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryResponse <em>Registry Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Registry Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Error</em>' containment reference.
	 * @see #setRegistryError(RegistryErrorType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot_RegistryError()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryError' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryErrorType getRegistryError();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryError <em>Registry Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Error</em>' containment reference.
	 * @see #getRegistryError()
	 * @generated
	 */
	void setRegistryError(RegistryErrorType value);

	/**
	 * Returns the value of the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RegistryErrorList is derived from the ErrorList element from the ebXML Message Service Specification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registry Error List</em>' containment reference.
	 * @see #setRegistryErrorList(RegistryErrorListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot_RegistryErrorList()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryErrorList' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryErrorListType getRegistryErrorList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryErrorList <em>Registry Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Error List</em>' containment reference.
	 * @see #getRegistryErrorList()
	 * @generated
	 */
	void setRegistryErrorList(RegistryErrorListType value);

	/**
	 * Returns the value of the '<em><b>Registry Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Request</em>' containment reference.
	 * @see #setRegistryRequest(RegistryRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot_RegistryRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryRequestType getRegistryRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryRequest <em>Registry Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Request</em>' containment reference.
	 * @see #getRegistryRequest()
	 * @generated
	 */
	void setRegistryRequest(RegistryRequestType value);

	/**
	 * Returns the value of the '<em><b>Registry Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Response</em>' containment reference.
	 * @see #setRegistryResponse(RegistryResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getDocumentRoot_RegistryResponse()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryResponseType getRegistryResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryResponse <em>Registry Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Response</em>' containment reference.
	 * @see #getRegistryResponse()
	 * @generated
	 */
	void setRegistryResponse(RegistryResponseType value);

} // DocumentRoot
