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
 * $Id: SlotBranchTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
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
import org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SlotBranchTypeImpl#getSlotFilter <em>Slot Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SlotBranchTypeImpl#getSlotValueFilter <em>Slot Value Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotBranchTypeImpl extends EObjectImpl implements SlotBranchType {
	/**
	 * The cached value of the '{@link #getSlotFilter() <em>Slot Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType slotFilter = null;

	/**
	 * The cached value of the '{@link #getSlotValueFilter() <em>Slot Value Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotValueFilter()
	 * @generated
	 * @ordered
	 */
	protected EList slotValueFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SLOT_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getSlotFilter() {
		return slotFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotFilter(FilterType newSlotFilter, NotificationChain msgs) {
		FilterType oldSlotFilter = slotFilter;
		slotFilter = newSlotFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER, oldSlotFilter, newSlotFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotFilter(FilterType newSlotFilter) {
		if (newSlotFilter != slotFilter) {
			NotificationChain msgs = null;
			if (slotFilter != null)
				msgs = ((InternalEObject)slotFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER, null, msgs);
			if (newSlotFilter != null)
				msgs = ((InternalEObject)newSlotFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER, null, msgs);
			msgs = basicSetSlotFilter(newSlotFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER, newSlotFilter, newSlotFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSlotValueFilter() {
		if (slotValueFilter == null) {
			slotValueFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER);
		}
		return slotValueFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER:
				return basicSetSlotFilter(null, msgs);
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER:
				return ((InternalEList)getSlotValueFilter()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER:
				return getSlotFilter();
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER:
				return getSlotValueFilter();
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
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER:
				setSlotFilter((FilterType)newValue);
				return;
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER:
				getSlotValueFilter().clear();
				getSlotValueFilter().addAll((Collection)newValue);
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
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER:
				setSlotFilter((FilterType)null);
				return;
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER:
				getSlotValueFilter().clear();
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
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_FILTER:
				return slotFilter != null;
			case QueryPackage.SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER:
				return slotValueFilter != null && !slotValueFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SlotBranchTypeImpl
