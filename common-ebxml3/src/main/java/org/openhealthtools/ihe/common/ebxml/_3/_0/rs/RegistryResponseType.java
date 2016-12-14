/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryResponseType.java,v 1.1 2006/10/19 20:16:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for all ebXML Registry responses
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getResponseSlotList <em>Response Slot List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryResponseType()
 * @model extendedMetaData="name='RegistryResponseType' kind='elementOnly'"
 * @generated
 */
public interface RegistryResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Slot List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Slot List</em>' containment reference.
	 * @see #setResponseSlotList(SlotListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryResponseType_ResponseSlotList()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ResponseSlotList' namespace='##targetNamespace'"
	 * @generated
	 */
	SlotListType getResponseSlotList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getResponseSlotList <em>Response Slot List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Slot List</em>' containment reference.
	 * @see #getResponseSlotList()
	 * @generated
	 */
	void setResponseSlotList(SlotListType value);

	/**
	 * Returns the value of the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Error List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Error List</em>' containment reference.
	 * @see #setRegistryErrorList(RegistryErrorListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryResponseType_RegistryErrorList()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryErrorList' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryErrorListType getRegistryErrorList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRegistryErrorList <em>Registry Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Error List</em>' containment reference.
	 * @see #getRegistryErrorList()
	 * @generated
	 */
	void setRegistryErrorList(RegistryErrorListType value);

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryResponseType_RequestId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='requestId'"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryResponseType_Status()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // RegistryResponseType
