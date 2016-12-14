/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryRequestType.java,v 1.1 2006/10/19 20:16:34 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for all ebXML Registry requests
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getRequestSlotList <em>Request Slot List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryRequestType()
 * @model extendedMetaData="name='RegistryRequestType' kind='elementOnly'"
 * @generated
 */
public interface RegistryRequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Slot List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Slot List</em>' containment reference.
	 * @see #setRequestSlotList(SlotListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryRequestType_RequestSlotList()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RequestSlotList' namespace='##targetNamespace'"
	 * @generated
	 */
	SlotListType getRequestSlotList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getRequestSlotList <em>Request Slot List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Slot List</em>' containment reference.
	 * @see #getRequestSlotList()
	 * @generated
	 */
	void setRequestSlotList(SlotListType value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryRequestType_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryRequestType_Id()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // RegistryRequestType
