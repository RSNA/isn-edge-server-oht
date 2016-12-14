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
 * $Id: InternationalStringBranchTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>International String Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.InternationalStringBranchTypeImpl#getLocalizedStringFilter <em>Localized String Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternationalStringBranchTypeImpl extends EObjectImpl implements InternationalStringBranchType {
	/**
	 * The cached value of the '{@link #getLocalizedStringFilter() <em>Localized String Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedStringFilter()
	 * @generated
	 * @ordered
	 */
	protected EList localizedStringFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternationalStringBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.INTERNATIONAL_STRING_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocalizedStringFilter() {
		if (localizedStringFilter == null) {
			localizedStringFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER);
		}
		return localizedStringFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				return ((InternalEList)getLocalizedStringFilter()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				return getLocalizedStringFilter();
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				getLocalizedStringFilter().clear();
				getLocalizedStringFilter().addAll((Collection)newValue);
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				getLocalizedStringFilter().clear();
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				return localizedStringFilter != null && !localizedStringFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternationalStringBranchTypeImpl
