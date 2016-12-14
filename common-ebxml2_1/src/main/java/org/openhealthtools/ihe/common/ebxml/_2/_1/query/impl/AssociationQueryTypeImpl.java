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
 * $Id: AssociationQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryTypeImpl#getAssociationFilter <em>Association Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationQueryTypeImpl extends RegistryObjectQueryTypeImpl implements AssociationQueryType {
	/**
	 * The cached value of the '{@link #getAssociationFilter() <em>Association Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType associationFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ASSOCIATION_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getAssociationFilter() {
		return associationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationFilter(FilterType newAssociationFilter, NotificationChain msgs) {
		FilterType oldAssociationFilter = associationFilter;
		associationFilter = newAssociationFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER, oldAssociationFilter, newAssociationFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationFilter(FilterType newAssociationFilter) {
		if (newAssociationFilter != associationFilter) {
			NotificationChain msgs = null;
			if (associationFilter != null)
				msgs = ((InternalEObject)associationFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER, null, msgs);
			if (newAssociationFilter != null)
				msgs = ((InternalEObject)newAssociationFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER, null, msgs);
			msgs = basicSetAssociationFilter(newAssociationFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER, newAssociationFilter, newAssociationFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER:
				return basicSetAssociationFilter(null, msgs);
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER:
				return getAssociationFilter();
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER:
				setAssociationFilter((FilterType)newValue);
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER:
				setAssociationFilter((FilterType)null);
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER:
				return associationFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationQueryTypeImpl
