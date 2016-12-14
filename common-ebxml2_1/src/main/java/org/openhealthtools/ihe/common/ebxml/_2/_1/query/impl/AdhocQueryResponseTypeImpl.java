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
 * $Id: AdhocQueryResponseTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adhoc Query Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryResponseTypeImpl#getFilterQueryResult <em>Filter Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryResponseTypeImpl#getSQLQueryResult <em>SQL Query Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdhocQueryResponseTypeImpl extends EObjectImpl implements AdhocQueryResponseType {
	/**
	 * The cached value of the '{@link #getFilterQueryResult() <em>Filter Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterQueryResult()
	 * @generated
	 * @ordered
	 */
	protected FilterQueryResultType filterQueryResult = null;

	/**
	 * The cached value of the '{@link #getSQLQueryResult() <em>SQL Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLQueryResult()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectListType sQLQueryResult = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdhocQueryResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ADHOC_QUERY_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterQueryResultType getFilterQueryResult() {
		return filterQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterQueryResult(FilterQueryResultType newFilterQueryResult, NotificationChain msgs) {
		FilterQueryResultType oldFilterQueryResult = filterQueryResult;
		filterQueryResult = newFilterQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT, oldFilterQueryResult, newFilterQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterQueryResult(FilterQueryResultType newFilterQueryResult) {
		if (newFilterQueryResult != filterQueryResult) {
			NotificationChain msgs = null;
			if (filterQueryResult != null)
				msgs = ((InternalEObject)filterQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT, null, msgs);
			if (newFilterQueryResult != null)
				msgs = ((InternalEObject)newFilterQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT, null, msgs);
			msgs = basicSetFilterQueryResult(newFilterQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT, newFilterQueryResult, newFilterQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getSQLQueryResult() {
		return sQLQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSQLQueryResult(RegistryObjectListType newSQLQueryResult, NotificationChain msgs) {
		RegistryObjectListType oldSQLQueryResult = sQLQueryResult;
		sQLQueryResult = newSQLQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT, oldSQLQueryResult, newSQLQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQLQueryResult(RegistryObjectListType newSQLQueryResult) {
		if (newSQLQueryResult != sQLQueryResult) {
			NotificationChain msgs = null;
			if (sQLQueryResult != null)
				msgs = ((InternalEObject)sQLQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT, null, msgs);
			if (newSQLQueryResult != null)
				msgs = ((InternalEObject)newSQLQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT, null, msgs);
			msgs = basicSetSQLQueryResult(newSQLQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT, newSQLQueryResult, newSQLQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT:
				return basicSetFilterQueryResult(null, msgs);
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT:
				return basicSetSQLQueryResult(null, msgs);
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT:
				return getFilterQueryResult();
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT:
				return getSQLQueryResult();
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT:
				setFilterQueryResult((FilterQueryResultType)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT:
				setSQLQueryResult((RegistryObjectListType)newValue);
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT:
				setFilterQueryResult((FilterQueryResultType)null);
				return;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT:
				setSQLQueryResult((RegistryObjectListType)null);
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT:
				return filterQueryResult != null;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT:
				return sQLQueryResult != null;
		}
		return super.eIsSet(featureID);
	}

} //AdhocQueryResponseTypeImpl
