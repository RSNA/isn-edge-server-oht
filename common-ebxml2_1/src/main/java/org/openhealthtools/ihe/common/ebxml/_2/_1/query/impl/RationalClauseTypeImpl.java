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
 * $Id: RationalClauseTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rational Clause Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl#getIntClause <em>Int Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl#getFloatClause <em>Float Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl#getDateTimeClause <em>Date Time Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl#getLogicalPredicate <em>Logical Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RationalClauseTypeImpl extends EObjectImpl implements RationalClauseType {
	/**
	 * The default value of the '{@link #getIntClause() <em>Int Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntClause()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INT_CLAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntClause() <em>Int Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntClause()
	 * @generated
	 * @ordered
	 */
	protected BigInteger intClause = INT_CLAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatClause() <em>Float Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatClause()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_CLAUSE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloatClause() <em>Float Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatClause()
	 * @generated
	 * @ordered
	 */
	protected float floatClause = FLOAT_CLAUSE_EDEFAULT;

	/**
	 * This is true if the Float Clause attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean floatClauseESet = false;

	/**
	 * The default value of the '{@link #getDateTimeClause() <em>Date Time Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeClause()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATE_TIME_CLAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTimeClause() <em>Date Time Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeClause()
	 * @generated
	 * @ordered
	 */
	protected Object dateTimeClause = DATE_TIME_CLAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalPredicate() <em>Logical Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalPredicateType LOGICAL_PREDICATE_EDEFAULT = LogicalPredicateType.LE_LITERAL;

	/**
	 * The cached value of the '{@link #getLogicalPredicate() <em>Logical Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalPredicate()
	 * @generated
	 * @ordered
	 */
	protected LogicalPredicateType logicalPredicate = LOGICAL_PREDICATE_EDEFAULT;

	/**
	 * This is true if the Logical Predicate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logicalPredicateESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationalClauseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.RATIONAL_CLAUSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIntClause() {
		return intClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntClause(BigInteger newIntClause) {
		BigInteger oldIntClause = intClause;
		intClause = newIntClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.RATIONAL_CLAUSE_TYPE__INT_CLAUSE, oldIntClause, intClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloatClause() {
		return floatClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatClause(float newFloatClause) {
		float oldFloatClause = floatClause;
		floatClause = newFloatClause;
		boolean oldFloatClauseESet = floatClauseESet;
		floatClauseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE, oldFloatClause, floatClause, !oldFloatClauseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFloatClause() {
		float oldFloatClause = floatClause;
		boolean oldFloatClauseESet = floatClauseESet;
		floatClause = FLOAT_CLAUSE_EDEFAULT;
		floatClauseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE, oldFloatClause, FLOAT_CLAUSE_EDEFAULT, oldFloatClauseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFloatClause() {
		return floatClauseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDateTimeClause() {
		return dateTimeClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeClause(Object newDateTimeClause) {
		Object oldDateTimeClause = dateTimeClause;
		dateTimeClause = newDateTimeClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE, oldDateTimeClause, dateTimeClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPredicateType getLogicalPredicate() {
		return logicalPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalPredicate(LogicalPredicateType newLogicalPredicate) {
		LogicalPredicateType oldLogicalPredicate = logicalPredicate;
		logicalPredicate = newLogicalPredicate == null ? LOGICAL_PREDICATE_EDEFAULT : newLogicalPredicate;
		boolean oldLogicalPredicateESet = logicalPredicateESet;
		logicalPredicateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE, oldLogicalPredicate, logicalPredicate, !oldLogicalPredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogicalPredicate() {
		LogicalPredicateType oldLogicalPredicate = logicalPredicate;
		boolean oldLogicalPredicateESet = logicalPredicateESet;
		logicalPredicate = LOGICAL_PREDICATE_EDEFAULT;
		logicalPredicateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE, oldLogicalPredicate, LOGICAL_PREDICATE_EDEFAULT, oldLogicalPredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogicalPredicate() {
		return logicalPredicateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.RATIONAL_CLAUSE_TYPE__INT_CLAUSE:
				return getIntClause();
			case QueryPackage.RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE:
				return new Float(getFloatClause());
			case QueryPackage.RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE:
				return getDateTimeClause();
			case QueryPackage.RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE:
				return getLogicalPredicate();
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
			case QueryPackage.RATIONAL_CLAUSE_TYPE__INT_CLAUSE:
				setIntClause((BigInteger)newValue);
				return;
			case QueryPackage.RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE:
				setFloatClause(((Float)newValue).floatValue());
				return;
			case QueryPackage.RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE:
				setDateTimeClause((Object)newValue);
				return;
			case QueryPackage.RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE:
				setLogicalPredicate((LogicalPredicateType)newValue);
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
			case QueryPackage.RATIONAL_CLAUSE_TYPE__INT_CLAUSE:
				setIntClause(INT_CLAUSE_EDEFAULT);
				return;
			case QueryPackage.RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE:
				unsetFloatClause();
				return;
			case QueryPackage.RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE:
				setDateTimeClause(DATE_TIME_CLAUSE_EDEFAULT);
				return;
			case QueryPackage.RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE:
				unsetLogicalPredicate();
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
			case QueryPackage.RATIONAL_CLAUSE_TYPE__INT_CLAUSE:
				return INT_CLAUSE_EDEFAULT == null ? intClause != null : !INT_CLAUSE_EDEFAULT.equals(intClause);
			case QueryPackage.RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE:
				return isSetFloatClause();
			case QueryPackage.RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE:
				return DATE_TIME_CLAUSE_EDEFAULT == null ? dateTimeClause != null : !DATE_TIME_CLAUSE_EDEFAULT.equals(dateTimeClause);
			case QueryPackage.RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE:
				return isSetLogicalPredicate();
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
		result.append(" (intClause: ");
		result.append(intClause);
		result.append(", floatClause: ");
		if (floatClauseESet) result.append(floatClause); else result.append("<unset>");
		result.append(", dateTimeClause: ");
		result.append(dateTimeClause);
		result.append(", logicalPredicate: ");
		if (logicalPredicateESet) result.append(logicalPredicate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RationalClauseTypeImpl
