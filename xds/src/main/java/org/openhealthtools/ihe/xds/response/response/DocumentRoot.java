/**
 */
package org.openhealthtools.ihe.xds.response.response;

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
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSError <em>XDS Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSErrorList <em>XDS Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSQueryResponse <em>XDS Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSResponse <em>XDS Response</em>}</li>
 * </ul>
 *
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>XDS Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDS Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDS Error</em>' containment reference.
	 * @see #setXDSError(XDSErrorType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot_XDSError()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XDSError' namespace='##targetNamespace'"
	 * @generated
	 */
	XDSErrorType getXDSError();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSError <em>XDS Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDS Error</em>' containment reference.
	 * @see #getXDSError()
	 * @generated
	 */
	void setXDSError(XDSErrorType value);

	/**
	 * Returns the value of the '<em><b>XDS Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDS Error List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDS Error List</em>' containment reference.
	 * @see #setXDSErrorList(XDSErrorListType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot_XDSErrorList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XDSErrorList' namespace='##targetNamespace'"
	 * @generated
	 */
	XDSErrorListType getXDSErrorList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSErrorList <em>XDS Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDS Error List</em>' containment reference.
	 * @see #getXDSErrorList()
	 * @generated
	 */
	void setXDSErrorList(XDSErrorListType value);

	/**
	 * Returns the value of the '<em><b>XDS Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDS Query Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDS Query Response</em>' containment reference.
	 * @see #setXDSQueryResponse(XDSQueryResponseType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot_XDSQueryResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XDSQueryResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	XDSQueryResponseType getXDSQueryResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSQueryResponse <em>XDS Query Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDS Query Response</em>' containment reference.
	 * @see #getXDSQueryResponse()
	 * @generated
	 */
	void setXDSQueryResponse(XDSQueryResponseType value);

	/**
	 * Returns the value of the '<em><b>XDS Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDS Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDS Response</em>' containment reference.
	 * @see #setXDSResponse(XDSResponseType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentRoot_XDSResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XDSResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	XDSResponseType getXDSResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSResponse <em>XDS Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDS Response</em>' containment reference.
	 * @see #getXDSResponse()
	 * @generated
	 */
	void setXDSResponse(XDSResponseType value);

} // DocumentRoot
