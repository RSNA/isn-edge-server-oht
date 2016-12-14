/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;

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
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getAcceptObjectsRequest <em>Accept Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getApproveObjectsRequest <em>Approve Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRelocateObjectsRequest <em>Relocate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRemoveObjectsRequest <em>Remove Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getSubmitObjectsRequest <em>Submit Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUndeprecateObjectsRequest <em>Undeprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUpdateObjectsRequest <em>Update Objects Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Accept Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Objects Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Objects Request</em>' containment reference.
	 * @see #setAcceptObjectsRequest(AcceptObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_AcceptObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AcceptObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptObjectsRequestType getAcceptObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getAcceptObjectsRequest <em>Accept Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Objects Request</em>' containment reference.
	 * @see #getAcceptObjectsRequest()
	 * @generated
	 */
	void setAcceptObjectsRequest(AcceptObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Approve Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ObjectRefList and AdhocQuery identify the list of
	 *         objects being approved.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approve Objects Request</em>' containment reference.
	 * @see #setApproveObjectsRequest(ApproveObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_ApproveObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApproveObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ApproveObjectsRequestType getApproveObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getApproveObjectsRequest <em>Approve Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approve Objects Request</em>' containment reference.
	 * @see #getApproveObjectsRequest()
	 * @generated
	 */
	void setApproveObjectsRequest(ApproveObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Deprecate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ObjectRefList and AdhocQuery identify the list of
	 *         objects being deprecated.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecate Objects Request</em>' containment reference.
	 * @see #setDeprecateObjectsRequest(DeprecateObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_DeprecateObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeprecateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeprecateObjectsRequestType getDeprecateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecate Objects Request</em>' containment reference.
	 * @see #getDeprecateObjectsRequest()
	 * @generated
	 */
	void setDeprecateObjectsRequest(DeprecateObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Relocate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relocate Objects Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relocate Objects Request</em>' containment reference.
	 * @see #setRelocateObjectsRequest(RelocateObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_RelocateObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelocateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RelocateObjectsRequestType getRelocateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRelocateObjectsRequest <em>Relocate Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relocate Objects Request</em>' containment reference.
	 * @see #getRelocateObjectsRequest()
	 * @generated
	 */
	void setRelocateObjectsRequest(RelocateObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Remove Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ObjectRefList is the list of
	 *         refs to the registry entrys being removed
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Objects Request</em>' containment reference.
	 * @see #setRemoveObjectsRequest(RemoveObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_RemoveObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemoveObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveObjectsRequestType getRemoveObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRemoveObjectsRequest <em>Remove Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Objects Request</em>' containment reference.
	 * @see #getRemoveObjectsRequest()
	 * @generated
	 */
	void setRemoveObjectsRequest(RemoveObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Submit Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SubmitObjectsRequest allows one to submit a list of RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted object.  Note that the repository item being submitted is in a separate document that is not in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of the metadata of a repository item with the repository item itself. The value of the id attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within the Reference element within the Manifest element of the MessageHeader.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submit Objects Request</em>' containment reference.
	 * @see #setSubmitObjectsRequest(SubmitObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_SubmitObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubmitObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SubmitObjectsRequestType getSubmitObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getSubmitObjectsRequest <em>Submit Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit Objects Request</em>' containment reference.
	 * @see #getSubmitObjectsRequest()
	 * @generated
	 */
	void setSubmitObjectsRequest(SubmitObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Undeprecate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ObjectRefList is the list of
	 *         refs to the registry entrys being un-deprecated.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undeprecate Objects Request</em>' containment reference.
	 * @see #setUndeprecateObjectsRequest(UndeprecateObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_UndeprecateObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UndeprecateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UndeprecateObjectsRequestType getUndeprecateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUndeprecateObjectsRequest <em>Undeprecate Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeprecate Objects Request</em>' containment reference.
	 * @see #getUndeprecateObjectsRequest()
	 * @generated
	 */
	void setUndeprecateObjectsRequest(UndeprecateObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Update Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UpdateObjectsRequest allows one to update a list of RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted object.  Note that the repository item being submitted is in a separate document that is not in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of the metadata of a repository item with the repository item itself. The value of the id attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within the Reference element within the Manifest element of the MessageHeader.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Objects Request</em>' containment reference.
	 * @see #setUpdateObjectsRequest(UpdateObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getDocumentRoot_UpdateObjectsRequest()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateObjectsRequestType getUpdateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUpdateObjectsRequest <em>Update Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Objects Request</em>' containment reference.
	 * @see #getUpdateObjectsRequest()
	 * @generated
	 */
	void setUpdateObjectsRequest(UpdateObjectsRequestType value);

} // DocumentRoot
