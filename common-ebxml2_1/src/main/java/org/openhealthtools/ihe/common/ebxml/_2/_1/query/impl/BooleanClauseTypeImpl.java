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
 * $Id: BooleanClauseTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Clause Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.BooleanClauseTypeImpl#isBooleanPredicate <em>Boolean Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanClauseTypeImpl extends EObjectImpl implements BooleanClauseType {
	/**
	 * The default value of the '{@link #isBooleanPredicate() <em>Boolean Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_PREDICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBooleanPredicate() <em>Boolean Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanPredicate()
	 * @generated
	 * @ordered
	 */
	protected boolean booleanPredicate = BOOLEAN_PREDICATE_EDEFAULT;

	/**
	 * This is true if the Boolean Predicate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booleanPredicateESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanClauseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.BOOLEAN_CLAUSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBooleanPredicate() {
		return booleanPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanPredicate(boolean newBooleanPredicate) {
		boolean oldBooleanPredicate = booleanPredicate;
		booleanPredicate = newBooleanPredicate;
		boolean oldBooleanPredicateESet = booleanPredicateESet;
		booleanPredicateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE, oldBooleanPredicate, booleanPredicate, !oldBooleanPredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBooleanPredicate() {
		boolean oldBooleanPredicate = booleanPredicate;
		boolean oldBooleanPredicateESet = booleanPredicateESet;
		booleanPredicate = BOOLEAN_PREDICATE_EDEFAULT;
		booleanPredicateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE, oldBooleanPredicate, BOOLEAN_PREDICATE_EDEFAULT, oldBooleanPredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBooleanPredicate() {
		return booleanPredicateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE:
				return isBooleanPredicate() ? Boolean.TRUE : Boolean.FALSE;
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
			case QueryPackage.BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE:
				setBooleanPredicate(((Boolean)newValue).booleanValue());
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
			case QueryPackage.BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE:
				unsetBooleanPredicate();
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
			case QueryPackage.BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE:
				return isSetBooleanPredicate();
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
		result.append(" (booleanPredicate: ");
		if (booleanPredicateESet) result.append(booleanPredicate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BooleanClauseTypeImpl
