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
 * $Id: SimpleClauseTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Clause Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl#getBooleanClause <em>Boolean Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl#getRationalClause <em>Rational Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl#getStringClause <em>String Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl#getLeftArgument <em>Left Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleClauseTypeImpl extends EObjectImpl implements SimpleClauseType {
	/**
	 * The cached value of the '{@link #getBooleanClause() <em>Boolean Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanClause()
	 * @generated
	 * @ordered
	 */
	protected BooleanClauseType booleanClause = null;

	/**
	 * The cached value of the '{@link #getRationalClause() <em>Rational Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationalClause()
	 * @generated
	 * @ordered
	 */
	protected RationalClauseType rationalClause = null;

	/**
	 * The cached value of the '{@link #getStringClause() <em>String Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringClause()
	 * @generated
	 * @ordered
	 */
	protected StringClauseType stringClause = null;

	/**
	 * The default value of the '{@link #getLeftArgument() <em>Left Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftArgument()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_ARGUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftArgument() <em>Left Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftArgument()
	 * @generated
	 * @ordered
	 */
	protected String leftArgument = LEFT_ARGUMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleClauseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SIMPLE_CLAUSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanClauseType getBooleanClause() {
		return booleanClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanClause(BooleanClauseType newBooleanClause, NotificationChain msgs) {
		BooleanClauseType oldBooleanClause = booleanClause;
		booleanClause = newBooleanClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE, oldBooleanClause, newBooleanClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanClause(BooleanClauseType newBooleanClause) {
		if (newBooleanClause != booleanClause) {
			NotificationChain msgs = null;
			if (booleanClause != null)
				msgs = ((InternalEObject)booleanClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE, null, msgs);
			if (newBooleanClause != null)
				msgs = ((InternalEObject)newBooleanClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE, null, msgs);
			msgs = basicSetBooleanClause(newBooleanClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE, newBooleanClause, newBooleanClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalClauseType getRationalClause() {
		return rationalClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationalClause(RationalClauseType newRationalClause, NotificationChain msgs) {
		RationalClauseType oldRationalClause = rationalClause;
		rationalClause = newRationalClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE, oldRationalClause, newRationalClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationalClause(RationalClauseType newRationalClause) {
		if (newRationalClause != rationalClause) {
			NotificationChain msgs = null;
			if (rationalClause != null)
				msgs = ((InternalEObject)rationalClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE, null, msgs);
			if (newRationalClause != null)
				msgs = ((InternalEObject)newRationalClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE, null, msgs);
			msgs = basicSetRationalClause(newRationalClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE, newRationalClause, newRationalClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringClauseType getStringClause() {
		return stringClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringClause(StringClauseType newStringClause, NotificationChain msgs) {
		StringClauseType oldStringClause = stringClause;
		stringClause = newStringClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE, oldStringClause, newStringClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringClause(StringClauseType newStringClause) {
		if (newStringClause != stringClause) {
			NotificationChain msgs = null;
			if (stringClause != null)
				msgs = ((InternalEObject)stringClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE, null, msgs);
			if (newStringClause != null)
				msgs = ((InternalEObject)newStringClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE, null, msgs);
			msgs = basicSetStringClause(newStringClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE, newStringClause, newStringClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeftArgument() {
		return leftArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftArgument(String newLeftArgument) {
		String oldLeftArgument = leftArgument;
		leftArgument = newLeftArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT, oldLeftArgument, leftArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE:
				return basicSetBooleanClause(null, msgs);
			case QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE:
				return basicSetRationalClause(null, msgs);
			case QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE:
				return basicSetStringClause(null, msgs);
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
			case QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE:
				return getBooleanClause();
			case QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE:
				return getRationalClause();
			case QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE:
				return getStringClause();
			case QueryPackage.SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT:
				return getLeftArgument();
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
			case QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE:
				setBooleanClause((BooleanClauseType)newValue);
				return;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE:
				setRationalClause((RationalClauseType)newValue);
				return;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE:
				setStringClause((StringClauseType)newValue);
				return;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT:
				setLeftArgument((String)newValue);
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
			case QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE:
				setBooleanClause((BooleanClauseType)null);
				return;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE:
				setRationalClause((RationalClauseType)null);
				return;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE:
				setStringClause((StringClauseType)null);
				return;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT:
				setLeftArgument(LEFT_ARGUMENT_EDEFAULT);
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
			case QueryPackage.SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE:
				return booleanClause != null;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE:
				return rationalClause != null;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__STRING_CLAUSE:
				return stringClause != null;
			case QueryPackage.SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT:
				return LEFT_ARGUMENT_EDEFAULT == null ? leftArgument != null : !LEFT_ARGUMENT_EDEFAULT.equals(leftArgument);
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
		result.append(" (leftArgument: ");
		result.append(leftArgument);
		result.append(')');
		return result.toString();
	}

} //SimpleClauseTypeImpl
