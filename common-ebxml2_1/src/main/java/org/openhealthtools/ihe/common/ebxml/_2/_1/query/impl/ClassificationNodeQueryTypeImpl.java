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
 * $Id: ClassificationNodeQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
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

import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Node Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl#getClassificationNodeFilter <em>Classification Node Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl#getClassificationNodeParentBranch <em>Classification Node Parent Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl#getClassificationNodeChildrenBranch <em>Classification Node Children Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationNodeQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ClassificationNodeQueryType {
	/**
	 * The cached value of the '{@link #getClassificationNodeFilter() <em>Classification Node Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNodeFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType classificationNodeFilter = null;

	/**
	 * The cached value of the '{@link #getClassificationSchemeQuery() <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationSchemeQueryType classificationSchemeQuery = null;

	/**
	 * The cached value of the '{@link #getClassificationNodeParentBranch() <em>Classification Node Parent Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNodeParentBranch()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType classificationNodeParentBranch = null;

	/**
	 * The cached value of the '{@link #getClassificationNodeChildrenBranch() <em>Classification Node Children Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNodeChildrenBranch()
	 * @generated
	 * @ordered
	 */
	protected EList classificationNodeChildrenBranch = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationNodeQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CLASSIFICATION_NODE_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getClassificationNodeFilter() {
		return classificationNodeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeFilter(FilterType newClassificationNodeFilter, NotificationChain msgs) {
		FilterType oldClassificationNodeFilter = classificationNodeFilter;
		classificationNodeFilter = newClassificationNodeFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER, oldClassificationNodeFilter, newClassificationNodeFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeFilter(FilterType newClassificationNodeFilter) {
		if (newClassificationNodeFilter != classificationNodeFilter) {
			NotificationChain msgs = null;
			if (classificationNodeFilter != null)
				msgs = ((InternalEObject)classificationNodeFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER, null, msgs);
			if (newClassificationNodeFilter != null)
				msgs = ((InternalEObject)newClassificationNodeFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER, null, msgs);
			msgs = basicSetClassificationNodeFilter(newClassificationNodeFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER, newClassificationNodeFilter, newClassificationNodeFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeQueryType getClassificationSchemeQuery() {
		return classificationSchemeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSchemeQuery(ClassificationSchemeQueryType newClassificationSchemeQuery, NotificationChain msgs) {
		ClassificationSchemeQueryType oldClassificationSchemeQuery = classificationSchemeQuery;
		classificationSchemeQuery = newClassificationSchemeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, oldClassificationSchemeQuery, newClassificationSchemeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSchemeQuery(ClassificationSchemeQueryType newClassificationSchemeQuery) {
		if (newClassificationSchemeQuery != classificationSchemeQuery) {
			NotificationChain msgs = null;
			if (classificationSchemeQuery != null)
				msgs = ((InternalEObject)classificationSchemeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			if (newClassificationSchemeQuery != null)
				msgs = ((InternalEObject)newClassificationSchemeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			msgs = basicSetClassificationSchemeQuery(newClassificationSchemeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, newClassificationSchemeQuery, newClassificationSchemeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getClassificationNodeParentBranch() {
		return classificationNodeParentBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeParentBranch(ClassificationNodeQueryType newClassificationNodeParentBranch, NotificationChain msgs) {
		ClassificationNodeQueryType oldClassificationNodeParentBranch = classificationNodeParentBranch;
		classificationNodeParentBranch = newClassificationNodeParentBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH, oldClassificationNodeParentBranch, newClassificationNodeParentBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeParentBranch(ClassificationNodeQueryType newClassificationNodeParentBranch) {
		if (newClassificationNodeParentBranch != classificationNodeParentBranch) {
			NotificationChain msgs = null;
			if (classificationNodeParentBranch != null)
				msgs = ((InternalEObject)classificationNodeParentBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH, null, msgs);
			if (newClassificationNodeParentBranch != null)
				msgs = ((InternalEObject)newClassificationNodeParentBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH, null, msgs);
			msgs = basicSetClassificationNodeParentBranch(newClassificationNodeParentBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH, newClassificationNodeParentBranch, newClassificationNodeParentBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassificationNodeChildrenBranch() {
		if (classificationNodeChildrenBranch == null) {
			classificationNodeChildrenBranch = new EObjectContainmentEList(ClassificationNodeQueryType.class, this, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH);
		}
		return classificationNodeChildrenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER:
				return basicSetClassificationNodeFilter(null, msgs);
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return basicSetClassificationSchemeQuery(null, msgs);
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH:
				return basicSetClassificationNodeParentBranch(null, msgs);
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				return ((InternalEList)getClassificationNodeChildrenBranch()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER:
				return getClassificationNodeFilter();
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery();
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH:
				return getClassificationNodeParentBranch();
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				return getClassificationNodeChildrenBranch();
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER:
				setClassificationNodeFilter((FilterType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH:
				setClassificationNodeParentBranch((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				getClassificationNodeChildrenBranch().clear();
				getClassificationNodeChildrenBranch().addAll((Collection)newValue);
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER:
				setClassificationNodeFilter((FilterType)null);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH:
				setClassificationNodeParentBranch((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				getClassificationNodeChildrenBranch().clear();
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER:
				return classificationNodeFilter != null;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return classificationSchemeQuery != null;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH:
				return classificationNodeParentBranch != null;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH:
				return classificationNodeChildrenBranch != null && !classificationNodeChildrenBranch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassificationNodeQueryTypeImpl
