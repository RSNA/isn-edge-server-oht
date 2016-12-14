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
 * $Id: ClassificationSchemeQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Scheme Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryTypeImpl#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationSchemeQueryTypeImpl extends RegistryEntryQueryTypeImpl implements ClassificationSchemeQueryType {
	/**
	 * The cached value of the '{@link #getClassificationSchemeFilter() <em>Classification Scheme Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSchemeFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType classificationSchemeFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationSchemeQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CLASSIFICATION_SCHEME_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getClassificationSchemeFilter() {
		return classificationSchemeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSchemeFilter(FilterType newClassificationSchemeFilter, NotificationChain msgs) {
		FilterType oldClassificationSchemeFilter = classificationSchemeFilter;
		classificationSchemeFilter = newClassificationSchemeFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER, oldClassificationSchemeFilter, newClassificationSchemeFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSchemeFilter(FilterType newClassificationSchemeFilter) {
		if (newClassificationSchemeFilter != classificationSchemeFilter) {
			NotificationChain msgs = null;
			if (classificationSchemeFilter != null)
				msgs = ((InternalEObject)classificationSchemeFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER, null, msgs);
			if (newClassificationSchemeFilter != null)
				msgs = ((InternalEObject)newClassificationSchemeFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER, null, msgs);
			msgs = basicSetClassificationSchemeFilter(newClassificationSchemeFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER, newClassificationSchemeFilter, newClassificationSchemeFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER:
				return basicSetClassificationSchemeFilter(null, msgs);
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER:
				return getClassificationSchemeFilter();
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER:
				setClassificationSchemeFilter((FilterType)newValue);
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER:
				setClassificationSchemeFilter((FilterType)null);
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER:
				return classificationSchemeFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationSchemeQueryTypeImpl
