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
 * $Id: AdhocQueryRequestTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adhoc Query Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryRequestTypeImpl#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryRequestTypeImpl#getFilterQuery <em>Filter Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryRequestTypeImpl#getSQLQuery <em>SQL Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdhocQueryRequestTypeImpl extends EObjectImpl implements AdhocQueryRequestType {
	/**
	 * The cached value of the '{@link #getResponseOption() <em>Response Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseOption()
	 * @generated
	 * @ordered
	 */
	protected ResponseOptionType responseOption = null;

	/**
	 * The cached value of the '{@link #getFilterQuery() <em>Filter Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterQuery()
	 * @generated
	 * @ordered
	 */
	protected FilterQueryType filterQuery = null;

	/**
	 * The default value of the '{@link #getSQLQuery() <em>SQL Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSQLQuery() <em>SQL Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLQuery()
	 * @generated
	 * @ordered
	 */
	protected String sQLQuery = SQL_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdhocQueryRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ADHOC_QUERY_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOptionType getResponseOption() {
		return responseOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseOption(ResponseOptionType newResponseOption, NotificationChain msgs) {
		ResponseOptionType oldResponseOption = responseOption;
		responseOption = newResponseOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, oldResponseOption, newResponseOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseOption(ResponseOptionType newResponseOption) {
		if (newResponseOption != responseOption) {
			NotificationChain msgs = null;
			if (responseOption != null)
				msgs = ((InternalEObject)responseOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, null, msgs);
			if (newResponseOption != null)
				msgs = ((InternalEObject)newResponseOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, null, msgs);
			msgs = basicSetResponseOption(newResponseOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, newResponseOption, newResponseOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterQueryType getFilterQuery() {
		return filterQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterQuery(FilterQueryType newFilterQuery, NotificationChain msgs) {
		FilterQueryType oldFilterQuery = filterQuery;
		filterQuery = newFilterQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY, oldFilterQuery, newFilterQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterQuery(FilterQueryType newFilterQuery) {
		if (newFilterQuery != filterQuery) {
			NotificationChain msgs = null;
			if (filterQuery != null)
				msgs = ((InternalEObject)filterQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY, null, msgs);
			if (newFilterQuery != null)
				msgs = ((InternalEObject)newFilterQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY, null, msgs);
			msgs = basicSetFilterQuery(newFilterQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY, newFilterQuery, newFilterQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSQLQuery() {
		return sQLQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQLQuery(String newSQLQuery) {
		String oldSQLQuery = sQLQuery;
		sQLQuery = newSQLQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY, oldSQLQuery, sQLQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				return basicSetResponseOption(null, msgs);
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY:
				return basicSetFilterQuery(null, msgs);
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				return getResponseOption();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY:
				return getFilterQuery();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY:
				return getSQLQuery();
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY:
				setFilterQuery((FilterQueryType)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY:
				setSQLQuery((String)newValue);
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)null);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY:
				setFilterQuery((FilterQueryType)null);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY:
				setSQLQuery(SQL_QUERY_EDEFAULT);
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				return responseOption != null;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY:
				return filterQuery != null;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY:
				return SQL_QUERY_EDEFAULT == null ? sQLQuery != null : !SQL_QUERY_EDEFAULT.equals(sQLQuery);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sQLQuery: ");
		result.append(sQLQuery);
		result.append(')');
		return result.toString();
	}

} //AdhocQueryRequestTypeImpl
