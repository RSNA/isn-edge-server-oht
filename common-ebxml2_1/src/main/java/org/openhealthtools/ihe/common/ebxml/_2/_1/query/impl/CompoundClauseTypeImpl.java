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
 * $Id: CompoundClauseTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Clause Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.CompoundClauseTypeImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.CompoundClauseTypeImpl#getConnectivePredicate <em>Connective Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundClauseTypeImpl extends EObjectImpl implements CompoundClauseType {
	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected EList clause = null;

	/**
	 * The default value of the '{@link #getConnectivePredicate() <em>Connective Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivePredicate()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectivePredicateType CONNECTIVE_PREDICATE_EDEFAULT = ConnectivePredicateType.AND_LITERAL;

	/**
	 * The cached value of the '{@link #getConnectivePredicate() <em>Connective Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivePredicate()
	 * @generated
	 * @ordered
	 */
	protected ConnectivePredicateType connectivePredicate = CONNECTIVE_PREDICATE_EDEFAULT;

	/**
	 * This is true if the Connective Predicate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectivePredicateESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundClauseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.COMPOUND_CLAUSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClause() {
		if (clause == null) {
			clause = new EObjectContainmentEList(ClauseType.class, this, QueryPackage.COMPOUND_CLAUSE_TYPE__CLAUSE);
		}
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivePredicateType getConnectivePredicate() {
		return connectivePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivePredicate(ConnectivePredicateType newConnectivePredicate) {
		ConnectivePredicateType oldConnectivePredicate = connectivePredicate;
		connectivePredicate = newConnectivePredicate == null ? CONNECTIVE_PREDICATE_EDEFAULT : newConnectivePredicate;
		boolean oldConnectivePredicateESet = connectivePredicateESet;
		connectivePredicateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE, oldConnectivePredicate, connectivePredicate, !oldConnectivePredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectivePredicate() {
		ConnectivePredicateType oldConnectivePredicate = connectivePredicate;
		boolean oldConnectivePredicateESet = connectivePredicateESet;
		connectivePredicate = CONNECTIVE_PREDICATE_EDEFAULT;
		connectivePredicateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE, oldConnectivePredicate, CONNECTIVE_PREDICATE_EDEFAULT, oldConnectivePredicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectivePredicate() {
		return connectivePredicateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CLAUSE:
				return ((InternalEList)getClause()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CLAUSE:
				return getClause();
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE:
				return getConnectivePredicate();
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
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CLAUSE:
				getClause().clear();
				getClause().addAll((Collection)newValue);
				return;
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE:
				setConnectivePredicate((ConnectivePredicateType)newValue);
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
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CLAUSE:
				getClause().clear();
				return;
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE:
				unsetConnectivePredicate();
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
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CLAUSE:
				return clause != null && !clause.isEmpty();
			case QueryPackage.COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE:
				return isSetConnectivePredicate();
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
		result.append(" (connectivePredicate: ");
		if (connectivePredicateESet) result.append(connectivePredicate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CompoundClauseTypeImpl
