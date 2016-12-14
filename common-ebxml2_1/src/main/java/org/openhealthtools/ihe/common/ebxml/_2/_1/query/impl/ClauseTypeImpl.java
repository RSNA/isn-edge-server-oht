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
 * $Id: ClauseTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClauseTypeImpl#getSimpleClause <em>Simple Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClauseTypeImpl#getCompoundClause <em>Compound Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseTypeImpl extends EObjectImpl implements ClauseType {
	/**
	 * The cached value of the '{@link #getSimpleClause() <em>Simple Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleClause()
	 * @generated
	 * @ordered
	 */
	protected SimpleClauseType simpleClause = null;

	/**
	 * The cached value of the '{@link #getCompoundClause() <em>Compound Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundClause()
	 * @generated
	 * @ordered
	 */
	protected CompoundClauseType compoundClause = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClauseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CLAUSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClauseType getSimpleClause() {
		return simpleClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleClause(SimpleClauseType newSimpleClause, NotificationChain msgs) {
		SimpleClauseType oldSimpleClause = simpleClause;
		simpleClause = newSimpleClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE, oldSimpleClause, newSimpleClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleClause(SimpleClauseType newSimpleClause) {
		if (newSimpleClause != simpleClause) {
			NotificationChain msgs = null;
			if (simpleClause != null)
				msgs = ((InternalEObject)simpleClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE, null, msgs);
			if (newSimpleClause != null)
				msgs = ((InternalEObject)newSimpleClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE, null, msgs);
			msgs = basicSetSimpleClause(newSimpleClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE, newSimpleClause, newSimpleClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundClauseType getCompoundClause() {
		return compoundClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundClause(CompoundClauseType newCompoundClause, NotificationChain msgs) {
		CompoundClauseType oldCompoundClause = compoundClause;
		compoundClause = newCompoundClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE, oldCompoundClause, newCompoundClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundClause(CompoundClauseType newCompoundClause) {
		if (newCompoundClause != compoundClause) {
			NotificationChain msgs = null;
			if (compoundClause != null)
				msgs = ((InternalEObject)compoundClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE, null, msgs);
			if (newCompoundClause != null)
				msgs = ((InternalEObject)newCompoundClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE, null, msgs);
			msgs = basicSetCompoundClause(newCompoundClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE, newCompoundClause, newCompoundClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE:
				return basicSetSimpleClause(null, msgs);
			case QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE:
				return basicSetCompoundClause(null, msgs);
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
			case QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE:
				return getSimpleClause();
			case QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE:
				return getCompoundClause();
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
			case QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE:
				setSimpleClause((SimpleClauseType)newValue);
				return;
			case QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE:
				setCompoundClause((CompoundClauseType)newValue);
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
			case QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE:
				setSimpleClause((SimpleClauseType)null);
				return;
			case QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE:
				setCompoundClause((CompoundClauseType)null);
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
			case QueryPackage.CLAUSE_TYPE__SIMPLE_CLAUSE:
				return simpleClause != null;
			case QueryPackage.CLAUSE_TYPE__COMPOUND_CLAUSE:
				return compoundClause != null;
		}
		return super.eIsSet(featureID);
	}

} //ClauseTypeImpl
