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
 * $Id: AuditableEventQueryTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auditable Event Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl#getAuditableEventFilter <em>Auditable Event Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl#getUserBranch <em>User Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditableEventQueryTypeImpl extends RegistryObjectQueryTypeImpl implements AuditableEventQueryType {
	/**
	 * The cached value of the '{@link #getAuditableEventFilter() <em>Auditable Event Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditableEventFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType auditableEventFilter = null;

	/**
	 * The cached value of the '{@link #getRegistryObjectQuery() <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType registryObjectQuery = null;

	/**
	 * The cached value of the '{@link #getRegistryEntryQuery() <em>Registry Entry Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryEntryQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryEntryQueryType registryEntryQuery = null;

	/**
	 * The cached value of the '{@link #getUserBranch() <em>User Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserBranch()
	 * @generated
	 * @ordered
	 */
	protected UserBranchType userBranch = null;

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
	public FilterType getAuditableEventFilter() {
		return auditableEventFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditableEventFilter(FilterType newAuditableEventFilter, NotificationChain msgs) {
		FilterType oldAuditableEventFilter = auditableEventFilter;
		auditableEventFilter = newAuditableEventFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER, oldAuditableEventFilter, newAuditableEventFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditableEventFilter(FilterType newAuditableEventFilter) {
		if (newAuditableEventFilter != auditableEventFilter) {
			NotificationChain msgs = null;
			if (auditableEventFilter != null)
				msgs = ((InternalEObject)auditableEventFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER, null, msgs);
			if (newAuditableEventFilter != null)
				msgs = ((InternalEObject)newAuditableEventFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER, null, msgs);
			msgs = basicSetAuditableEventFilter(newAuditableEventFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER, newAuditableEventFilter, newAuditableEventFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getRegistryObjectQuery() {
		return registryObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldRegistryObjectQuery = registryObjectQuery;
		registryObjectQuery = newRegistryObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY, oldRegistryObjectQuery, newRegistryObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery) {
		if (newRegistryObjectQuery != registryObjectQuery) {
			NotificationChain msgs = null;
			if (registryObjectQuery != null)
				msgs = ((InternalEObject)registryObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			if (newRegistryObjectQuery != null)
				msgs = ((InternalEObject)newRegistryObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			msgs = basicSetRegistryObjectQuery(newRegistryObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY, newRegistryObjectQuery, newRegistryObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryType getRegistryEntryQuery() {
		return registryEntryQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery, NotificationChain msgs) {
		RegistryEntryQueryType oldRegistryEntryQuery = registryEntryQuery;
		registryEntryQuery = newRegistryEntryQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY, oldRegistryEntryQuery, newRegistryEntryQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery) {
		if (newRegistryEntryQuery != registryEntryQuery) {
			NotificationChain msgs = null;
			if (registryEntryQuery != null)
				msgs = ((InternalEObject)registryEntryQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			if (newRegistryEntryQuery != null)
				msgs = ((InternalEObject)newRegistryEntryQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			msgs = basicSetRegistryEntryQuery(newRegistryEntryQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY, newRegistryEntryQuery, newRegistryEntryQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserBranchType getUserBranch() {
		return userBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserBranch(UserBranchType newUserBranch, NotificationChain msgs) {
		UserBranchType oldUserBranch = userBranch;
		userBranch = newUserBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH, oldUserBranch, newUserBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserBranch(UserBranchType newUserBranch) {
		if (newUserBranch != userBranch) {
			NotificationChain msgs = null;
			if (userBranch != null)
				msgs = ((InternalEObject)userBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH, null, msgs);
			if (newUserBranch != null)
				msgs = ((InternalEObject)newUserBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH, null, msgs);
			msgs = basicSetUserBranch(newUserBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH, newUserBranch, newUserBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER:
				return basicSetAuditableEventFilter(null, msgs);
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return basicSetRegistryObjectQuery(null, msgs);
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return basicSetRegistryEntryQuery(null, msgs);
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH:
				return basicSetUserBranch(null, msgs);
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER:
				return getAuditableEventFilter();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return getRegistryEntryQuery();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH:
				return getUserBranch();
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER:
				setAuditableEventFilter((FilterType)newValue);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)newValue);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH:
				setUserBranch((UserBranchType)newValue);
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER:
				setAuditableEventFilter((FilterType)null);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)null);
				return;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH:
				setUserBranch((UserBranchType)null);
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
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER:
				return auditableEventFilter != null;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return registryObjectQuery != null;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return registryEntryQuery != null;
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH:
				return userBranch != null;
		}
		return super.eIsSet(featureID);
	}

} //AuditableEventQueryTypeImpl
