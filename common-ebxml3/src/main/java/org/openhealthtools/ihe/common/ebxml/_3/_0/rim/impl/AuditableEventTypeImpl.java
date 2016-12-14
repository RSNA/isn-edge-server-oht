/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuditableEventTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auditable Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl#getAffectedObjects <em>Affected Objects</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditableEventTypeImpl extends RegistryObjectTypeImpl implements AuditableEventType {
	/**
	 * The cached value of the '{@link #getAffectedObjects() <em>Affected Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedObjects()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefListType affectedObjects = null;

	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected String eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected String requestId = REQUEST_ID_EDEFAULT;

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
	public ObjectRefListType getAffectedObjects() {
		return affectedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffectedObjects(ObjectRefListType newAffectedObjects, NotificationChain msgs) {
		ObjectRefListType oldAffectedObjects = affectedObjects;
		affectedObjects = newAffectedObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS, oldAffectedObjects, newAffectedObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedObjects(ObjectRefListType newAffectedObjects) {
		if (newAffectedObjects != affectedObjects) {
			NotificationChain msgs = null;
			if (affectedObjects != null)
				msgs = ((InternalEObject)affectedObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS, null, msgs);
			if (newAffectedObjects != null)
				msgs = ((InternalEObject)newAffectedObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS, null, msgs);
			msgs = basicSetAffectedObjects(newAffectedObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS, newAffectedObjects, newAffectedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(String newEventType) {
		String oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(String newRequestId) {
		String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.AUDITABLE_EVENT_TYPE__REQUEST_ID, oldRequestId, requestId));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS:
				return basicSetAffectedObjects(null, msgs);
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
			case RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS:
				return getAffectedObjects();
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				return getEventType();
			case RimPackage.AUDITABLE_EVENT_TYPE__REQUEST_ID:
				return getRequestId();
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
			case RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS:
				setAffectedObjects((ObjectRefListType)newValue);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				setEventType((String)newValue);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__REQUEST_ID:
				setRequestId((String)newValue);
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
			case RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS:
				setAffectedObjects((ObjectRefListType)null);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case RimPackage.AUDITABLE_EVENT_TYPE__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
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
			case RimPackage.AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS:
				return affectedObjects != null;
			case RimPackage.AUDITABLE_EVENT_TYPE__EVENT_TYPE:
				return EVENT_TYPE_EDEFAULT == null ? eventType != null : !EVENT_TYPE_EDEFAULT.equals(eventType);
			case RimPackage.AUDITABLE_EVENT_TYPE__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
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
		result.append(eventType);
		result.append(", requestId: ");
		result.append(requestId);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //AuditableEventTypeImpl
