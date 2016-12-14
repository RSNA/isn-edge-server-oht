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
 * $Id: ExtrinsicObjectQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extrinsic Object Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryTypeImpl#getExtrinsicObjectFilter <em>Extrinsic Object Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtrinsicObjectQueryTypeImpl extends RegistryEntryQueryTypeImpl implements ExtrinsicObjectQueryType {
	/**
	 * The cached value of the '{@link #getExtrinsicObjectFilter() <em>Extrinsic Object Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrinsicObjectFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType extrinsicObjectFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtrinsicObjectQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.EXTRINSIC_OBJECT_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getExtrinsicObjectFilter() {
		return extrinsicObjectFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrinsicObjectFilter(FilterType newExtrinsicObjectFilter, NotificationChain msgs) {
		FilterType oldExtrinsicObjectFilter = extrinsicObjectFilter;
		extrinsicObjectFilter = newExtrinsicObjectFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER, oldExtrinsicObjectFilter, newExtrinsicObjectFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrinsicObjectFilter(FilterType newExtrinsicObjectFilter) {
		if (newExtrinsicObjectFilter != extrinsicObjectFilter) {
			NotificationChain msgs = null;
			if (extrinsicObjectFilter != null)
				msgs = ((InternalEObject)extrinsicObjectFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER, null, msgs);
			if (newExtrinsicObjectFilter != null)
				msgs = ((InternalEObject)newExtrinsicObjectFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER, null, msgs);
			msgs = basicSetExtrinsicObjectFilter(newExtrinsicObjectFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER, newExtrinsicObjectFilter, newExtrinsicObjectFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER:
				return basicSetExtrinsicObjectFilter(null, msgs);
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER:
				return getExtrinsicObjectFilter();
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER:
				setExtrinsicObjectFilter((FilterType)newValue);
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER:
				setExtrinsicObjectFilter((FilterType)null);
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER:
				return extrinsicObjectFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtrinsicObjectQueryTypeImpl
