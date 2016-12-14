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
 * $Id: CompoundClauseType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Clause Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getClause <em>Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getConnectivePredicate <em>Connective Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getCompoundClauseType()
 * @model extendedMetaData="name='CompoundClause_._type' kind='elementOnly'"
 * @generated
 */
public interface CompoundClauseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getCompoundClauseType_Clause()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='Clause' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getClause();

	/**
	 * Returns the value of the '<em><b>Connective Predicate</b></em>' attribute.
	 * The default value is <code>"And"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connective Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connective Predicate</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
	 * @see #isSetConnectivePredicate()
	 * @see #unsetConnectivePredicate()
	 * @see #setConnectivePredicate(ConnectivePredicateType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getCompoundClauseType_ConnectivePredicate()
	 * @model default="And" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='connectivePredicate'"
	 * @generated
	 */
	ConnectivePredicateType getConnectivePredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getConnectivePredicate <em>Connective Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connective Predicate</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
	 * @see #isSetConnectivePredicate()
	 * @see #unsetConnectivePredicate()
	 * @see #getConnectivePredicate()
	 * @generated
	 */
	void setConnectivePredicate(ConnectivePredicateType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getConnectivePredicate <em>Connective Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectivePredicate()
	 * @see #getConnectivePredicate()
	 * @see #setConnectivePredicate(ConnectivePredicateType)
	 * @generated
	 */
	void unsetConnectivePredicate();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getConnectivePredicate <em>Connective Predicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connective Predicate</em>' attribute is set.
	 * @see #unsetConnectivePredicate()
	 * @see #getConnectivePredicate()
	 * @see #setConnectivePredicate(ConnectivePredicateType)
	 * @generated
	 */
	boolean isSetConnectivePredicate();

} // CompoundClauseType
