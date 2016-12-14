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
 * $Id: ClassificationQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl#getClassificationFilter <em>Classification Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ClassificationQueryType {
	/**
	 * The cached value of the '{@link #getClassificationFilter() <em>Classification Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType classificationFilter = null;

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
	 * The cached value of the '{@link #getClassificationNodeQuery() <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNodeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType classificationNodeQuery = null;

	/**
	 * The cached value of the '{@link #getRegistryObjectQuery() <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType registryObjectQuery = null;

	/**
	 * The cached value of the '{@link #getRegistryEntryQuery() <em>Registry Entry Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryEntryQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryEntryQueryType registryEntryQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CLASSIFICATION_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getClassificationFilter() {
		return classificationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationFilter(FilterType newClassificationFilter, NotificationChain msgs) {
		FilterType oldClassificationFilter = classificationFilter;
		classificationFilter = newClassificationFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER, oldClassificationFilter, newClassificationFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationFilter(FilterType newClassificationFilter) {
		if (newClassificationFilter != classificationFilter) {
			NotificationChain msgs = null;
			if (classificationFilter != null)
				msgs = ((InternalEObject)classificationFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER, null, msgs);
			if (newClassificationFilter != null)
				msgs = ((InternalEObject)newClassificationFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER, null, msgs);
			msgs = basicSetClassificationFilter(newClassificationFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER, newClassificationFilter, newClassificationFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, oldClassificationSchemeQuery, newClassificationSchemeQuery);
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
				msgs = ((InternalEObject)classificationSchemeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			if (newClassificationSchemeQuery != null)
				msgs = ((InternalEObject)newClassificationSchemeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			msgs = basicSetClassificationSchemeQuery(newClassificationSchemeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, newClassificationSchemeQuery, newClassificationSchemeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getClassificationNodeQuery() {
		return classificationNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeQuery(ClassificationNodeQueryType newClassificationNodeQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldClassificationNodeQuery = classificationNodeQuery;
		classificationNodeQuery = newClassificationNodeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, oldClassificationNodeQuery, newClassificationNodeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeQuery(ClassificationNodeQueryType newClassificationNodeQuery) {
		if (newClassificationNodeQuery != classificationNodeQuery) {
			NotificationChain msgs = null;
			if (classificationNodeQuery != null)
				msgs = ((InternalEObject)classificationNodeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, null, msgs);
			if (newClassificationNodeQuery != null)
				msgs = ((InternalEObject)newClassificationNodeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, null, msgs);
			msgs = basicSetClassificationNodeQuery(newClassificationNodeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, newClassificationNodeQuery, newClassificationNodeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getRegistryObjectQuery() {
		return registryObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldRegistryObjectQuery = registryObjectQuery;
		registryObjectQuery = newRegistryObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY, oldRegistryObjectQuery, newRegistryObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery) {
		if (newRegistryObjectQuery != registryObjectQuery) {
			NotificationChain msgs = null;
			if (registryObjectQuery != null)
				msgs = ((InternalEObject)registryObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			if (newRegistryObjectQuery != null)
				msgs = ((InternalEObject)newRegistryObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			msgs = basicSetRegistryObjectQuery(newRegistryObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY, newRegistryObjectQuery, newRegistryObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryType getRegistryEntryQuery() {
		return registryEntryQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery, NotificationChain msgs) {
		RegistryEntryQueryType oldRegistryEntryQuery = registryEntryQuery;
		registryEntryQuery = newRegistryEntryQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY, oldRegistryEntryQuery, newRegistryEntryQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery) {
		if (newRegistryEntryQuery != registryEntryQuery) {
			NotificationChain msgs = null;
			if (registryEntryQuery != null)
				msgs = ((InternalEObject)registryEntryQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			if (newRegistryEntryQuery != null)
				msgs = ((InternalEObject)newRegistryEntryQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			msgs = basicSetRegistryEntryQuery(newRegistryEntryQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY, newRegistryEntryQuery, newRegistryEntryQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER:
				return basicSetClassificationFilter(null, msgs);
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return basicSetClassificationSchemeQuery(null, msgs);
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return basicSetClassificationNodeQuery(null, msgs);
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return basicSetRegistryObjectQuery(null, msgs);
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return basicSetRegistryEntryQuery(null, msgs);
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER:
				return getClassificationFilter();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return getClassificationNodeQuery();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER:
				setClassificationFilter((FilterType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)newValue);
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER:
				setClassificationFilter((FilterType)null);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)null);
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER:
				return classificationFilter != null;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return classificationSchemeQuery != null;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return classificationNodeQuery != null;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return registryObjectQuery != null;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return registryEntryQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationQueryTypeImpl
