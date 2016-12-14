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
 * $Id: BooleanClauseType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Clause Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType#isBooleanPredicate <em>Boolean Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getBooleanClauseType()
 * @model extendedMetaData="name='BooleanClause_._type' kind='empty'"
 * @generated
 */
public interface BooleanClauseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Predicate</em>' attribute.
	 * @see #isSetBooleanPredicate()
	 * @see #unsetBooleanPredicate()
	 * @see #setBooleanPredicate(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getBooleanClauseType_BooleanPredicate()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='booleanPredicate'"
	 * @generated
	 */
	boolean isBooleanPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType#isBooleanPredicate <em>Boolean Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Predicate</em>' attribute.
	 * @see #isSetBooleanPredicate()
	 * @see #unsetBooleanPredicate()
	 * @see #isBooleanPredicate()
	 * @generated
	 */
	void setBooleanPredicate(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType#isBooleanPredicate <em>Boolean Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBooleanPredicate()
	 * @see #isBooleanPredicate()
	 * @see #setBooleanPredicate(boolean)
	 * @generated
	 */
	void unsetBooleanPredicate();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType#isBooleanPredicate <em>Boolean Predicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boolean Predicate</em>' attribute is set.
	 * @see #unsetBooleanPredicate()
	 * @see #isBooleanPredicate()
	 * @see #setBooleanPredicate(boolean)
	 * @generated
	 */
	boolean isSetBooleanPredicate();

} // BooleanClauseType
