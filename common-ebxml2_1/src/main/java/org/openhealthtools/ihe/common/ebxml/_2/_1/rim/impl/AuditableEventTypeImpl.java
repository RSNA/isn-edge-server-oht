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
 * $Id: AuditableEventTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auditable Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditableEventTypeImpl extends RegistryObjectTypeImpl implements AuditableEventType {
	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final EventTypeType EVENT_TYPE_EDEFAULT = EventTypeType.CREATED_LITERAL;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventTypeType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Event Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventTypeESet = false;

	/**
	 * The default value of the '{@link #getRegistryObject() <em>Registry Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObject()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryObject() <em>Registry Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObject()
	 * @generated
	 * @ordered
	 */
	protected String registryObject = REGISTRY_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Object TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Object timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditableEventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.AUDITABLE_EVENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(EventTypeType newEventType) {
		EventTypeType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		boolean oldEventTypeESet = eventTypeESet;
		eventTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE, oldEventType, eventType, !oldEventTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventType() {
		EventTypeType oldEventType = eventType;
		boolean oldEventTypeESet = eventTypeESet;
		eventType = EVENT_TYPE_EDEFAULT;
		eventTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE, oldEventType, EVENT_TYPE_EDEFAULT, oldEventTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventType() {
		return eventTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistryObject() {
		return registryObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObject(String newRegistryObject) {
		String oldRegistryObject = registryObject;
		registryObject = newRegistryObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT, oldRegistryObject, registryObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Object newTimestamp) {
		Object oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				return getEventType();
			case RimPackage.AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT:
				return getRegistryObject();
			case RimPackage.AUDITABLE_EVENT_TYPE__TIMESTAMP:
				return getTimestamp();
			case RimPackage.AUDITABLE_EVENT_TYPE__USER:
				return getUser();
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
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				setEventType((EventTypeType)newValue);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT:
				setRegistryObject((String)newValue);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__TIMESTAMP:
				setTimestamp((Object)newValue);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__USER:
				setUser((String)newValue);
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
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				unsetEventType();
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT:
				setRegistryObject(REGISTRY_OBJECT_EDEFAULT);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__USER:
				setUser(USER_EDEFAULT);
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
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				return isSetEventType();
			case RimPackage.AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT:
				return REGISTRY_OBJECT_EDEFAULT == null ? registryObject != null : !REGISTRY_OBJECT_EDEFAULT.equals(registryObject);
			case RimPackage.AUDITABLE_EVENT_TYPE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case RimPackage.AUDITABLE_EVENT_TYPE__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
		result.append(" (eventType: ");
		if (eventTypeESet) result.append(eventType); else result.append("<unset>");
		result.append(", registryObject: ");
		result.append(registryObject);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //AuditableEventTypeImpl
