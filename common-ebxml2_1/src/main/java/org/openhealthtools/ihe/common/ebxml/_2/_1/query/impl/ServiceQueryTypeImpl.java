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
 * $Id: ServiceQueryTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
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
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryTypeImpl#getServiceFilter <em>Service Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryTypeImpl#getServiceBindingBranch <em>Service Binding Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceQueryTypeImpl extends RegistryEntryQueryTypeImpl implements ServiceQueryType {
	/**
	 * The cached value of the '{@link #getServiceFilter() <em>Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType serviceFilter = null;

	/**
	 * The cached value of the '{@link #getServiceBindingBranch() <em>Service Binding Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBindingBranch()
	 * @generated
	 * @ordered
	 */
	protected EList serviceBindingBranch = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SERVICE_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getServiceFilter() {
		return serviceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceFilter(FilterType newServiceFilter, NotificationChain msgs) {
		FilterType oldServiceFilter = serviceFilter;
		serviceFilter = newServiceFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER, oldServiceFilter, newServiceFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFilter(FilterType newServiceFilter) {
		if (newServiceFilter != serviceFilter) {
			NotificationChain msgs = null;
			if (serviceFilter != null)
				msgs = ((InternalEObject)serviceFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER, null, msgs);
			if (newServiceFilter != null)
				msgs = ((InternalEObject)newServiceFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER, null, msgs);
			msgs = basicSetServiceFilter(newServiceFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER, newServiceFilter, newServiceFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServiceBindingBranch() {
		if (serviceBindingBranch == null) {
			serviceBindingBranch = new EObjectContainmentEList(ServiceBindingBranchType.class, this, QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH);
		}
		return serviceBindingBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER:
				return basicSetServiceFilter(null, msgs);
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH:
				return ((InternalEList)getServiceBindingBranch()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER:
				return getServiceFilter();
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH:
				return getServiceBindingBranch();
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER:
				setServiceFilter((FilterType)newValue);
				return;
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH:
				getServiceBindingBranch().clear();
				getServiceBindingBranch().addAll((Collection)newValue);
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER:
				setServiceFilter((FilterType)null);
				return;
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH:
				getServiceBindingBranch().clear();
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_FILTER:
				return serviceFilter != null;
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH:
				return serviceBindingBranch != null && !serviceBindingBranch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceQueryTypeImpl
