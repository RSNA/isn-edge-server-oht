/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuditableEventQueryTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.UserQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auditable Event Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AuditableEventQueryTypeImpl#getAffectedObjectQuery <em>Affected Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AuditableEventQueryTypeImpl#getEventTypeQuery <em>Event Type Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AuditableEventQueryTypeImpl#getUserQuery <em>User Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditableEventQueryTypeImpl extends FilterQueryTypeImpl implements AuditableEventQueryType {
	/**
	 * The cached value of the '{@link #getAffectedObjectQuery() <em>Affected Object Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected EList affectedObjectQuery = null;

	/**
	 * The cached value of the '{@link #getEventTypeQuery() <em>Event Type Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTypeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType eventTypeQuery = null;

	/**
	 * The cached value of the '{@link #getUserQuery() <em>User Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserQuery()
	 * @generated
	 * @ordered
	 */
	protected UserQueryType userQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditableEventQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.AUDITABLE_EVENT_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAffectedObjectQuery() {
		if (affectedObjectQuery == null) {
			affectedObjectQuery = new EObjectContainmentEList(RegistryObjectQueryType.class, this, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY);
		}
		return affectedObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getEventTypeQuery() {
		return eventTypeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventTypeQuery(ClassificationNodeQueryType newEventTypeQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldEventTypeQuery = eventTypeQuery;
		eventTypeQuery = newEventTypeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY, oldEventTypeQuery, newEventTypeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTypeQuery(ClassificationNodeQueryType newEventTypeQuery) {
		if (newEventTypeQuery != eventTypeQuery) {
			NotificationChain msgs = null;
			if (eventTypeQuery != null)
				msgs = ((InternalEObject)eventTypeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY, null, msgs);
			if (newEventTypeQuery != null)
				msgs = ((InternalEObject)newEventTypeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY, null, msgs);
			msgs = basicSetEventTypeQuery(newEventTypeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY, newEventTypeQuery, newEventTypeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserQueryType getUserQuery() {
		return userQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserQuery(UserQueryType newUserQuery, NotificationChain msgs) {
		UserQueryType oldUserQuery = userQuery;
		userQuery = newUserQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY, oldUserQuery, newUserQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserQuery(UserQueryType newUserQuery) {
		if (newUserQuery != userQuery) {
			NotificationChain msgs = null;
			if (userQuery != null)
				msgs = ((InternalEObject)userQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY, null, msgs);
			if (newUserQuery != null)
				msgs = ((InternalEObject)newUserQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY, null, msgs);
			msgs = basicSetUserQuery(newUserQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY, newUserQuery, newUserQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY:
				return ((InternalEList)getAffectedObjectQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY:
				return basicSetEventTypeQuery(null, msgs);
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY:
				return basicSetUserQuery(null, msgs);
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY:
				return getAffectedObjectQuery();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY:
				return getEventTypeQuery();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY:
				return getUserQuery();
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY:
				getAffectedObjectQuery().clear();
				getAffectedObjectQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY:
				setEventTypeQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY:
				setUserQuery((UserQueryType)newValue);
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY:
				getAffectedObjectQuery().clear();
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY:
				setEventTypeQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY:
				setUserQuery((UserQueryType)null);
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY:
				return affectedObjectQuery != null && !affectedObjectQuery.isEmpty();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY:
				return eventTypeQuery != null;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY:
				return userQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //AuditableEventQueryTypeImpl
