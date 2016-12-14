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
 * $Id: SpecificationLinkBranchTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Link Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SpecificationLinkBranchTypeImpl#getSpecificationLinkFilter <em>Specification Link Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SpecificationLinkBranchTypeImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SpecificationLinkBranchTypeImpl#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationLinkBranchTypeImpl extends EObjectImpl implements SpecificationLinkBranchType {
	/**
	 * The cached value of the '{@link #getSpecificationLinkFilter() <em>Specification Link Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationLinkFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType specificationLinkFilter = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationLinkBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SPECIFICATION_LINK_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getSpecificationLinkFilter() {
		return specificationLinkFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationLinkFilter(FilterType newSpecificationLinkFilter, NotificationChain msgs) {
		FilterType oldSpecificationLinkFilter = specificationLinkFilter;
		specificationLinkFilter = newSpecificationLinkFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER, oldSpecificationLinkFilter, newSpecificationLinkFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationLinkFilter(FilterType newSpecificationLinkFilter) {
		if (newSpecificationLinkFilter != specificationLinkFilter) {
			NotificationChain msgs = null;
			if (specificationLinkFilter != null)
				msgs = ((InternalEObject)specificationLinkFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER, null, msgs);
			if (newSpecificationLinkFilter != null)
				msgs = ((InternalEObject)newSpecificationLinkFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER, null, msgs);
			msgs = basicSetSpecificationLinkFilter(newSpecificationLinkFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER, newSpecificationLinkFilter, newSpecificationLinkFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY, oldRegistryObjectQuery, newRegistryObjectQuery);
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
				msgs = ((InternalEObject)registryObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			if (newRegistryObjectQuery != null)
				msgs = ((InternalEObject)newRegistryObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			msgs = basicSetRegistryObjectQuery(newRegistryObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY, newRegistryObjectQuery, newRegistryObjectQuery));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY, oldRegistryEntryQuery, newRegistryEntryQuery);
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
				msgs = ((InternalEObject)registryEntryQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			if (newRegistryEntryQuery != null)
				msgs = ((InternalEObject)newRegistryEntryQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			msgs = basicSetRegistryEntryQuery(newRegistryEntryQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY, newRegistryEntryQuery, newRegistryEntryQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER:
				return basicSetSpecificationLinkFilter(null, msgs);
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY:
				return basicSetRegistryObjectQuery(null, msgs);
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY:
				return basicSetRegistryEntryQuery(null, msgs);
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
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER:
				return getSpecificationLinkFilter();
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY:
				return getRegistryEntryQuery();
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
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER:
				setSpecificationLinkFilter((FilterType)newValue);
				return;
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)newValue);
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
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER:
				setSpecificationLinkFilter((FilterType)null);
				return;
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)null);
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
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER:
				return specificationLinkFilter != null;
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY:
				return registryObjectQuery != null;
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY:
				return registryEntryQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificationLinkBranchTypeImpl
