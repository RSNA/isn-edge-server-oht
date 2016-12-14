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
 * $Id: UserBranchTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl#getUserFilter <em>User Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl#getPostalAddressFilter <em>Postal Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl#getEmailAddressFilter <em>Email Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl#getOrganizationQuery <em>Organization Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserBranchTypeImpl extends EObjectImpl implements UserBranchType {
	/**
	 * The cached value of the '{@link #getUserFilter() <em>User Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType userFilter = null;

	/**
	 * The cached value of the '{@link #getPostalAddressFilter() <em>Postal Address Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalAddressFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType postalAddressFilter = null;

	/**
	 * The cached value of the '{@link #getTelephoneNumberFilter() <em>Telephone Number Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumberFilter()
	 * @generated
	 * @ordered
	 */
	protected EList telephoneNumberFilter = null;

	/**
	 * The cached value of the '{@link #getEmailAddressFilter() <em>Email Address Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddressFilter()
	 * @generated
	 * @ordered
	 */
	protected EList emailAddressFilter = null;

	/**
	 * The cached value of the '{@link #getOrganizationQuery() <em>Organization Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationQuery()
	 * @generated
	 * @ordered
	 */
	protected OrganizationQueryType organizationQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.USER_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getUserFilter() {
		return userFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFilter(FilterType newUserFilter, NotificationChain msgs) {
		FilterType oldUserFilter = userFilter;
		userFilter = newUserFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.USER_BRANCH_TYPE__USER_FILTER, oldUserFilter, newUserFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFilter(FilterType newUserFilter) {
		if (newUserFilter != userFilter) {
			NotificationChain msgs = null;
			if (userFilter != null)
				msgs = ((InternalEObject)userFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.USER_BRANCH_TYPE__USER_FILTER, null, msgs);
			if (newUserFilter != null)
				msgs = ((InternalEObject)newUserFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.USER_BRANCH_TYPE__USER_FILTER, null, msgs);
			msgs = basicSetUserFilter(newUserFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.USER_BRANCH_TYPE__USER_FILTER, newUserFilter, newUserFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getPostalAddressFilter() {
		return postalAddressFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalAddressFilter(FilterType newPostalAddressFilter, NotificationChain msgs) {
		FilterType oldPostalAddressFilter = postalAddressFilter;
		postalAddressFilter = newPostalAddressFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER, oldPostalAddressFilter, newPostalAddressFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalAddressFilter(FilterType newPostalAddressFilter) {
		if (newPostalAddressFilter != postalAddressFilter) {
			NotificationChain msgs = null;
			if (postalAddressFilter != null)
				msgs = ((InternalEObject)postalAddressFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER, null, msgs);
			if (newPostalAddressFilter != null)
				msgs = ((InternalEObject)newPostalAddressFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER, null, msgs);
			msgs = basicSetPostalAddressFilter(newPostalAddressFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER, newPostalAddressFilter, newPostalAddressFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTelephoneNumberFilter() {
		if (telephoneNumberFilter == null) {
			telephoneNumberFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER);
		}
		return telephoneNumberFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmailAddressFilter() {
		if (emailAddressFilter == null) {
			emailAddressFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER);
		}
		return emailAddressFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getOrganizationQuery() {
		return organizationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationQuery(OrganizationQueryType newOrganizationQuery, NotificationChain msgs) {
		OrganizationQueryType oldOrganizationQuery = organizationQuery;
		organizationQuery = newOrganizationQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY, oldOrganizationQuery, newOrganizationQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationQuery(OrganizationQueryType newOrganizationQuery) {
		if (newOrganizationQuery != organizationQuery) {
			NotificationChain msgs = null;
			if (organizationQuery != null)
				msgs = ((InternalEObject)organizationQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY, null, msgs);
			if (newOrganizationQuery != null)
				msgs = ((InternalEObject)newOrganizationQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY, null, msgs);
			msgs = basicSetOrganizationQuery(newOrganizationQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY, newOrganizationQuery, newOrganizationQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.USER_BRANCH_TYPE__USER_FILTER:
				return basicSetUserFilter(null, msgs);
			case QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER:
				return basicSetPostalAddressFilter(null, msgs);
			case QueryPackage.USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER:
				return ((InternalEList)getTelephoneNumberFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER:
				return ((InternalEList)getEmailAddressFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY:
				return basicSetOrganizationQuery(null, msgs);
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
			case QueryPackage.USER_BRANCH_TYPE__USER_FILTER:
				return getUserFilter();
			case QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER:
				return getPostalAddressFilter();
			case QueryPackage.USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER:
				return getTelephoneNumberFilter();
			case QueryPackage.USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER:
				return getEmailAddressFilter();
			case QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY:
				return getOrganizationQuery();
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
			case QueryPackage.USER_BRANCH_TYPE__USER_FILTER:
				setUserFilter((FilterType)newValue);
				return;
			case QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER:
				setPostalAddressFilter((FilterType)newValue);
				return;
			case QueryPackage.USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				getTelephoneNumberFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER:
				getEmailAddressFilter().clear();
				getEmailAddressFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)newValue);
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
			case QueryPackage.USER_BRANCH_TYPE__USER_FILTER:
				setUserFilter((FilterType)null);
				return;
			case QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER:
				setPostalAddressFilter((FilterType)null);
				return;
			case QueryPackage.USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				return;
			case QueryPackage.USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER:
				getEmailAddressFilter().clear();
				return;
			case QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)null);
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
			case QueryPackage.USER_BRANCH_TYPE__USER_FILTER:
				return userFilter != null;
			case QueryPackage.USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER:
				return postalAddressFilter != null;
			case QueryPackage.USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER:
				return telephoneNumberFilter != null && !telephoneNumberFilter.isEmpty();
			case QueryPackage.USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER:
				return emailAddressFilter != null && !emailAddressFilter.isEmpty();
			case QueryPackage.USER_BRANCH_TYPE__ORGANIZATION_QUERY:
				return organizationQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //UserBranchTypeImpl
