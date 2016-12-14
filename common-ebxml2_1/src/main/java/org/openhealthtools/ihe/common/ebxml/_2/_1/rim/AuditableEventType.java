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
 * $Id: AuditableEventType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auditable Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * Mapping of the same named interface in ebRIM.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAuditableEventType()
 * @model extendedMetaData="name='AuditableEventType' kind='elementOnly'"
 * @generated
 */
public interface AuditableEventType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The default value is <code>"Created"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #setEventType(EventTypeType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAuditableEventType_EventType()
	 * @model default="Created" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='eventType'"
	 * @generated
	 */
	EventTypeType getEventType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventTypeType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventTypeType)
	 * @generated
	 */
	void unsetEventType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getEventType <em>Event Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Type</em>' attribute is set.
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventTypeType)
	 * @generated
	 */
	boolean isSetEventType();

	/**
	 * Returns the value of the '<em><b>Registry Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object</em>' attribute.
	 * @see #setRegistryObject(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAuditableEventType_RegistryObject()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='registryObject'"
	 * @generated
	 */
	String getRegistryObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getRegistryObject <em>Registry Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object</em>' attribute.
	 * @see #getRegistryObject()
	 * @generated
	 */
	void setRegistryObject(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAuditableEventType_Timestamp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='timestamp'"
	 * @generated
	 */
	Object getTimestamp();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Object value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAuditableEventType_User()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // AuditableEventType
