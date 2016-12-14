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
 * $Id: StringClauseTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Clause Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.StringClauseTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.StringClauseTypeImpl#getStringPredicate <em>String Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringClauseTypeImpl extends EObjectImpl implements StringClauseType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringPredicate() <em>String Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final StringPredicateType STRING_PREDICATE_EDEFAULT = StringPredicateType.CONTAINS_LITERAL;

	/**
	 * The cached value of the '{@link #getStringPredicate() <em>String Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringPredicate()
	 * @generated
	 * @ordered
	 */
	protected StringPredicateType stringPredicate = STRING_PREDICATE_EDEFAULT;

	/**
	 * This is true if the String Predicate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stringPredicateESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringClauseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.STRING_CLAUSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.STRING_CLAUSE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPredicateType getStringPredicate() {
		return stringPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringPredicate(StringPredicateType newStringPredicate) {
		StringPredicateType oldStringPredicate = stringPredicate;
		stringPredicate = newStringPredicate == null ? STRING_PREDICATE_EDEFAULT : newStringPredicate;
		boolean oldStringPredicateESet = stringPredicateESet;
		stringPredicateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.STRING_CLAUSE_TYPE__STRING_PREDICATE, oldStringPredicate, stringPredicate, !oldStringPredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStringPredicate() {
		StringPredicateType oldStringPredicate = stringPredicate;
		boolean oldStringPredicateESet = stringPredicateESet;
		stringPredicate = STRING_PREDICATE_EDEFAULT;
		stringPredicateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.STRING_CLAUSE_TYPE__STRING_PREDICATE, oldStringPredicate, STRING_PREDICATE_EDEFAULT, oldStringPredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStringPredicate() {
		return stringPredicateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.STRING_CLAUSE_TYPE__VALUE:
				return getValue();
			case QueryPackage.STRING_CLAUSE_TYPE__STRING_PREDICATE:
				return getStringPredicate();
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
			case QueryPackage.STRING_CLAUSE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case QueryPackage.STRING_CLAUSE_TYPE__STRING_PREDICATE:
				setStringPredicate((StringPredicateType)newValue);
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
			case QueryPackage.STRING_CLAUSE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case QueryPackage.STRING_CLAUSE_TYPE__STRING_PREDICATE:
				unsetStringPredicate();
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
			case QueryPackage.STRING_CLAUSE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case QueryPackage.STRING_CLAUSE_TYPE__STRING_PREDICATE:
				return isSetStringPredicate();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", stringPredicate: ");
		if (stringPredicateESet) result.append(stringPredicate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StringClauseTypeImpl
