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
 * $Id: ServiceBindingBranchTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
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
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Binding Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceBindingBranchTypeImpl#getServiceBindingFilter <em>Service Binding Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceBindingBranchTypeImpl#getSpecificationLinkBranch <em>Specification Link Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceBindingBranchTypeImpl#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceBindingBranchTypeImpl extends EObjectImpl implements ServiceBindingBranchType {
	/**
	 * The cached value of the '{@link #getServiceBindingFilter() <em>Service Binding Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBindingFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType serviceBindingFilter = null;

	/**
	 * The cached value of the '{@link #getSpecificationLinkBranch() <em>Specification Link Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationLinkBranch()
	 * @generated
	 * @ordered
	 */
	protected EList specificationLinkBranch = null;

	/**
	 * The cached value of the '{@link #getServiceBindingTargetBranch() <em>Service Binding Target Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBindingTargetBranch()
	 * @generated
	 * @ordered
	 */
	protected ServiceBindingBranchType serviceBindingTargetBranch = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBindingBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SERVICE_BINDING_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getServiceBindingFilter() {
		return serviceBindingFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBindingFilter(FilterType newServiceBindingFilter, NotificationChain msgs) {
		FilterType oldServiceBindingFilter = serviceBindingFilter;
		serviceBindingFilter = newServiceBindingFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER, oldServiceBindingFilter, newServiceBindingFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBindingFilter(FilterType newServiceBindingFilter) {
		if (newServiceBindingFilter != serviceBindingFilter) {
			NotificationChain msgs = null;
			if (serviceBindingFilter != null)
				msgs = ((InternalEObject)serviceBindingFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER, null, msgs);
			if (newServiceBindingFilter != null)
				msgs = ((InternalEObject)newServiceBindingFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER, null, msgs);
			msgs = basicSetServiceBindingFilter(newServiceBindingFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER, newServiceBindingFilter, newServiceBindingFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecificationLinkBranch() {
		if (specificationLinkBranch == null) {
			specificationLinkBranch = new EObjectContainmentEList(SpecificationLinkBranchType.class, this, QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH);
		}
		return specificationLinkBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingBranchType getServiceBindingTargetBranch() {
		return serviceBindingTargetBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBindingTargetBranch(ServiceBindingBranchType newServiceBindingTargetBranch, NotificationChain msgs) {
		ServiceBindingBranchType oldServiceBindingTargetBranch = serviceBindingTargetBranch;
		serviceBindingTargetBranch = newServiceBindingTargetBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH, oldServiceBindingTargetBranch, newServiceBindingTargetBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBindingTargetBranch(ServiceBindingBranchType newServiceBindingTargetBranch) {
		if (newServiceBindingTargetBranch != serviceBindingTargetBranch) {
			NotificationChain msgs = null;
			if (serviceBindingTargetBranch != null)
				msgs = ((InternalEObject)serviceBindingTargetBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH, null, msgs);
			if (newServiceBindingTargetBranch != null)
				msgs = ((InternalEObject)newServiceBindingTargetBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH, null, msgs);
			msgs = basicSetServiceBindingTargetBranch(newServiceBindingTargetBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH, newServiceBindingTargetBranch, newServiceBindingTargetBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER:
				return basicSetServiceBindingFilter(null, msgs);
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH:
				return ((InternalEList)getSpecificationLinkBranch()).basicRemove(otherEnd, msgs);
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH:
				return basicSetServiceBindingTargetBranch(null, msgs);
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
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER:
				return getServiceBindingFilter();
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH:
				return getSpecificationLinkBranch();
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH:
				return getServiceBindingTargetBranch();
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
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER:
				setServiceBindingFilter((FilterType)newValue);
				return;
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH:
				getSpecificationLinkBranch().clear();
				getSpecificationLinkBranch().addAll((Collection)newValue);
				return;
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH:
				setServiceBindingTargetBranch((ServiceBindingBranchType)newValue);
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
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER:
				setServiceBindingFilter((FilterType)null);
				return;
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH:
				getSpecificationLinkBranch().clear();
				return;
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH:
				setServiceBindingTargetBranch((ServiceBindingBranchType)null);
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
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER:
				return serviceBindingFilter != null;
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH:
				return specificationLinkBranch != null && !specificationLinkBranch.isEmpty();
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH:
				return serviceBindingTargetBranch != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceBindingBranchTypeImpl
