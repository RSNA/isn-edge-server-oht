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
 * $Id: RegistryEntryQueryTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Entry Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryTypeImpl#getRegistryEntryFilter <em>Registry Entry Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryEntryQueryTypeImpl extends RegistryObjectQueryTypeImpl implements RegistryEntryQueryType {
	/**
	 * The cached value of the '{@link #getRegistryEntryFilter() <em>Registry Entry Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryEntryFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType registryEntryFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryEntryQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.REGISTRY_ENTRY_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getRegistryEntryFilter() {
		return registryEntryFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryFilter(FilterType newRegistryEntryFilter, NotificationChain msgs) {
		FilterType oldRegistryEntryFilter = registryEntryFilter;
		registryEntryFilter = newRegistryEntryFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER, oldRegistryEntryFilter, newRegistryEntryFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryFilter(FilterType newRegistryEntryFilter) {
		if (newRegistryEntryFilter != registryEntryFilter) {
			NotificationChain msgs = null;
			if (registryEntryFilter != null)
				msgs = ((InternalEObject)registryEntryFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER, null, msgs);
			if (newRegistryEntryFilter != null)
				msgs = ((InternalEObject)newRegistryEntryFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER, null, msgs);
			msgs = basicSetRegistryEntryFilter(newRegistryEntryFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER, newRegistryEntryFilter, newRegistryEntryFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER:
				return basicSetRegistryEntryFilter(null, msgs);
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
			case QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER:
				return getRegistryEntryFilter();
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
			case QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER:
				setRegistryEntryFilter((FilterType)newValue);
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
			case QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER:
				setRegistryEntryFilter((FilterType)null);
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
			case QueryPackage.REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER:
				return registryEntryFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //RegistryEntryQueryTypeImpl
