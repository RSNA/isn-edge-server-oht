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
 * $Id: OrganizationQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl#getOrganizationFilter <em>Organization Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl#getPostalAddressFilter <em>Postal Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl#getUserBranch <em>User Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl#getOrganizationParentBranch <em>Organization Parent Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl#getOrganizationChildrenBranch <em>Organization Children Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationQueryTypeImpl extends RegistryObjectQueryTypeImpl implements OrganizationQueryType {
	/**
	 * The cached value of the '{@link #getOrganizationFilter() <em>Organization Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType organizationFilter = null;

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
	 * The cached value of the '{@link #getUserBranch() <em>User Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserBranch()
	 * @generated
	 * @ordered
	 */
	protected UserBranchType userBranch = null;

	/**
	 * The cached value of the '{@link #getOrganizationParentBranch() <em>Organization Parent Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationParentBranch()
	 * @generated
	 * @ordered
	 */
	protected OrganizationQueryType organizationParentBranch = null;

	/**
	 * The cached value of the '{@link #getOrganizationChildrenBranch() <em>Organization Children Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationChildrenBranch()
	 * @generated
	 * @ordered
	 */
	protected EList organizationChildrenBranch = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ORGANIZATION_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getOrganizationFilter() {
		return organizationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationFilter(FilterType newOrganizationFilter, NotificationChain msgs) {
		FilterType oldOrganizationFilter = organizationFilter;
		organizationFilter = newOrganizationFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER, oldOrganizationFilter, newOrganizationFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationFilter(FilterType newOrganizationFilter) {
		if (newOrganizationFilter != organizationFilter) {
			NotificationChain msgs = null;
			if (organizationFilter != null)
				msgs = ((InternalEObject)organizationFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER, null, msgs);
			if (newOrganizationFilter != null)
				msgs = ((InternalEObject)newOrganizationFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER, null, msgs);
			msgs = basicSetOrganizationFilter(newOrganizationFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER, newOrganizationFilter, newOrganizationFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER, oldPostalAddressFilter, newPostalAddressFilter);
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
				msgs = ((InternalEObject)postalAddressFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER, null, msgs);
			if (newPostalAddressFilter != null)
				msgs = ((InternalEObject)newPostalAddressFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER, null, msgs);
			msgs = basicSetPostalAddressFilter(newPostalAddressFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER, newPostalAddressFilter, newPostalAddressFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTelephoneNumberFilter() {
		if (telephoneNumberFilter == null) {
			telephoneNumberFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER);
		}
		return telephoneNumberFilter;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH, oldUserBranch, newUserBranch);
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
				msgs = ((InternalEObject)userBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH, null, msgs);
			if (newUserBranch != null)
				msgs = ((InternalEObject)newUserBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH, null, msgs);
			msgs = basicSetUserBranch(newUserBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH, newUserBranch, newUserBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getOrganizationParentBranch() {
		return organizationParentBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationParentBranch(OrganizationQueryType newOrganizationParentBranch, NotificationChain msgs) {
		OrganizationQueryType oldOrganizationParentBranch = organizationParentBranch;
		organizationParentBranch = newOrganizationParentBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH, oldOrganizationParentBranch, newOrganizationParentBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationParentBranch(OrganizationQueryType newOrganizationParentBranch) {
		if (newOrganizationParentBranch != organizationParentBranch) {
			NotificationChain msgs = null;
			if (organizationParentBranch != null)
				msgs = ((InternalEObject)organizationParentBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH, null, msgs);
			if (newOrganizationParentBranch != null)
				msgs = ((InternalEObject)newOrganizationParentBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH, null, msgs);
			msgs = basicSetOrganizationParentBranch(newOrganizationParentBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH, newOrganizationParentBranch, newOrganizationParentBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrganizationChildrenBranch() {
		if (organizationChildrenBranch == null) {
			organizationChildrenBranch = new EObjectContainmentEList(OrganizationQueryType.class, this, QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH);
		}
		return organizationChildrenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER:
				return basicSetOrganizationFilter(null, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER:
				return basicSetPostalAddressFilter(null, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return ((InternalEList)getTelephoneNumberFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH:
				return basicSetUserBranch(null, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH:
				return basicSetOrganizationParentBranch(null, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH:
				return ((InternalEList)getOrganizationChildrenBranch()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER:
				return getOrganizationFilter();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER:
				return getPostalAddressFilter();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return getTelephoneNumberFilter();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH:
				return getUserBranch();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH:
				return getOrganizationParentBranch();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH:
				return getOrganizationChildrenBranch();
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER:
				setOrganizationFilter((FilterType)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER:
				setPostalAddressFilter((FilterType)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				getTelephoneNumberFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH:
				setUserBranch((UserBranchType)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH:
				setOrganizationParentBranch((OrganizationQueryType)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH:
				getOrganizationChildrenBranch().clear();
				getOrganizationChildrenBranch().addAll((Collection)newValue);
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER:
				setOrganizationFilter((FilterType)null);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER:
				setPostalAddressFilter((FilterType)null);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH:
				setUserBranch((UserBranchType)null);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH:
				setOrganizationParentBranch((OrganizationQueryType)null);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH:
				getOrganizationChildrenBranch().clear();
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER:
				return organizationFilter != null;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER:
				return postalAddressFilter != null;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return telephoneNumberFilter != null && !telephoneNumberFilter.isEmpty();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__USER_BRANCH:
				return userBranch != null;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH:
				return organizationParentBranch != null;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH:
				return organizationChildrenBranch != null && !organizationChildrenBranch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationQueryTypeImpl
