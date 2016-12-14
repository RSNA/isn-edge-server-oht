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
 * $Id: RegistryPackageQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
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
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Package Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryTypeImpl#getRegistryPackageFilter <em>Registry Package Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryTypeImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryTypeImpl#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryPackageQueryTypeImpl extends RegistryEntryQueryTypeImpl implements RegistryPackageQueryType {
	/**
	 * The cached value of the '{@link #getRegistryPackageFilter() <em>Registry Package Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryPackageFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType registryPackageFilter = null;

	/**
	 * The cached value of the '{@link #getRegistryObjectQuery() <em>Registry Object Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected EList registryObjectQuery = null;

	/**
	 * The cached value of the '{@link #getRegistryEntryQuery() <em>Registry Entry Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryEntryQuery()
	 * @generated
	 * @ordered
	 */
	protected EList registryEntryQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryPackageQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.REGISTRY_PACKAGE_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getRegistryPackageFilter() {
		return registryPackageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryPackageFilter(FilterType newRegistryPackageFilter, NotificationChain msgs) {
		FilterType oldRegistryPackageFilter = registryPackageFilter;
		registryPackageFilter = newRegistryPackageFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER, oldRegistryPackageFilter, newRegistryPackageFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryPackageFilter(FilterType newRegistryPackageFilter) {
		if (newRegistryPackageFilter != registryPackageFilter) {
			NotificationChain msgs = null;
			if (registryPackageFilter != null)
				msgs = ((InternalEObject)registryPackageFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER, null, msgs);
			if (newRegistryPackageFilter != null)
				msgs = ((InternalEObject)newRegistryPackageFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER, null, msgs);
			msgs = basicSetRegistryPackageFilter(newRegistryPackageFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER, newRegistryPackageFilter, newRegistryPackageFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryObjectQuery() {
		if (registryObjectQuery == null) {
			registryObjectQuery = new EObjectContainmentEList(RegistryObjectQueryType.class, this, QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY);
		}
		return registryObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryEntryQuery() {
		if (registryEntryQuery == null) {
			registryEntryQuery = new EObjectContainmentEList(RegistryEntryQueryType.class, this, QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY);
		}
		return registryEntryQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER:
				return basicSetRegistryPackageFilter(null, msgs);
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return ((InternalEList)getRegistryObjectQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return ((InternalEList)getRegistryEntryQuery()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER:
				return getRegistryPackageFilter();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER:
				setRegistryPackageFilter((FilterType)newValue);
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				getRegistryObjectQuery().clear();
				getRegistryObjectQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				getRegistryEntryQuery().clear();
				getRegistryEntryQuery().addAll((Collection)newValue);
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER:
				setRegistryPackageFilter((FilterType)null);
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				getRegistryObjectQuery().clear();
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				getRegistryEntryQuery().clear();
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER:
				return registryPackageFilter != null;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return registryObjectQuery != null && !registryObjectQuery.isEmpty();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return registryEntryQuery != null && !registryEntryQuery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegistryPackageQueryTypeImpl
