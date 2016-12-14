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
 * $Id: OptionalFeaturesSupportedTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Features Supported Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.OptionalFeaturesSupportedTypeImpl#isSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.OptionalFeaturesSupportedTypeImpl#isXQuery <em>XQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionalFeaturesSupportedTypeImpl extends EObjectImpl implements OptionalFeaturesSupportedType {
	/**
	 * The default value of the '{@link #isSqlQuery() <em>Sql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSqlQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SQL_QUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSqlQuery() <em>Sql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSqlQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean sqlQuery = SQL_QUERY_EDEFAULT;

	/**
	 * This is true if the Sql Query attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sqlQueryESet = false;

	/**
	 * The default value of the '{@link #isXQuery() <em>XQuery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XQUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXQuery() <em>XQuery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean xQuery = XQUERY_EDEFAULT;

	/**
	 * This is true if the XQuery attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xQueryESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalFeaturesSupportedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.OPTIONAL_FEATURES_SUPPORTED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSqlQuery() {
		return sqlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlQuery(boolean newSqlQuery) {
		boolean oldSqlQuery = sqlQuery;
		sqlQuery = newSqlQuery;
		boolean oldSqlQueryESet = sqlQueryESet;
		sqlQueryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY, oldSqlQuery, sqlQuery, !oldSqlQueryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSqlQuery() {
		boolean oldSqlQuery = sqlQuery;
		boolean oldSqlQueryESet = sqlQueryESet;
		sqlQuery = SQL_QUERY_EDEFAULT;
		sqlQueryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY, oldSqlQuery, SQL_QUERY_EDEFAULT, oldSqlQueryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSqlQuery() {
		return sqlQueryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXQuery() {
		return xQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXQuery(boolean newXQuery) {
		boolean oldXQuery = xQuery;
		xQuery = newXQuery;
		boolean oldXQueryESet = xQueryESet;
		xQueryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY, oldXQuery, xQuery, !oldXQueryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXQuery() {
		boolean oldXQuery = xQuery;
		boolean oldXQueryESet = xQueryESet;
		xQuery = XQUERY_EDEFAULT;
		xQueryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY, oldXQuery, XQUERY_EDEFAULT, oldXQueryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXQuery() {
		return xQueryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY:
				return isSqlQuery() ? Boolean.TRUE : Boolean.FALSE;
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY:
				return isXQuery() ? Boolean.TRUE : Boolean.FALSE;
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
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY:
				setSqlQuery(((Boolean)newValue).booleanValue());
				return;
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY:
				setXQuery(((Boolean)newValue).booleanValue());
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
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY:
				unsetSqlQuery();
				return;
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY:
				unsetXQuery();
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
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY:
				return isSetSqlQuery();
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY:
				return isSetXQuery();
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
		result.append(" (sqlQuery: ");
		if (sqlQueryESet) result.append(sqlQuery); else result.append("<unset>");
		result.append(", xQuery: ");
		if (xQueryESet) result.append(xQuery); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OptionalFeaturesSupportedTypeImpl
