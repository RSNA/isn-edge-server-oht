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
 * $Id: RationalClauseType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rational Clause Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getIntClause <em>Int Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getFloatClause <em>Float Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getDateTimeClause <em>Date Time Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getLogicalPredicate <em>Logical Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRationalClauseType()
 * @model extendedMetaData="name='RationalClause_._type' kind='elementOnly'"
 * @generated
 */
public interface RationalClauseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Clause</em>' attribute.
	 * @see #setIntClause(BigInteger)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRationalClauseType_IntClause()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='IntClause' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIntClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getIntClause <em>Int Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Clause</em>' attribute.
	 * @see #getIntClause()
	 * @generated
	 */
	void setIntClause(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Float Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Clause</em>' attribute.
	 * @see #isSetFloatClause()
	 * @see #unsetFloatClause()
	 * @see #setFloatClause(float)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRationalClauseType_FloatClause()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='FloatClause' namespace='##targetNamespace'"
	 * @generated
	 */
	float getFloatClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getFloatClause <em>Float Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Clause</em>' attribute.
	 * @see #isSetFloatClause()
	 * @see #unsetFloatClause()
	 * @see #getFloatClause()
	 * @generated
	 */
	void setFloatClause(float value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getFloatClause <em>Float Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFloatClause()
	 * @see #getFloatClause()
	 * @see #setFloatClause(float)
	 * @generated
	 */
	void unsetFloatClause();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getFloatClause <em>Float Clause</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Float Clause</em>' attribute is set.
	 * @see #unsetFloatClause()
	 * @see #getFloatClause()
	 * @see #setFloatClause(float)
	 * @generated
	 */
	boolean isSetFloatClause();

	/**
	 * Returns the value of the '<em><b>Date Time Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Clause</em>' attribute.
	 * @see #setDateTimeClause(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRationalClauseType_DateTimeClause()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='DateTimeClause' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDateTimeClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getDateTimeClause <em>Date Time Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Clause</em>' attribute.
	 * @see #getDateTimeClause()
	 * @generated
	 */
	void setDateTimeClause(Object value);

	/**
	 * Returns the value of the '<em><b>Logical Predicate</b></em>' attribute.
	 * The default value is <code>"LE"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Predicate</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
	 * @see #isSetLogicalPredicate()
	 * @see #unsetLogicalPredicate()
	 * @see #setLogicalPredicate(LogicalPredicateType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRationalClauseType_LogicalPredicate()
	 * @model default="LE" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='logicalPredicate'"
	 * @generated
	 */
	LogicalPredicateType getLogicalPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getLogicalPredicate <em>Logical Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Predicate</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
	 * @see #isSetLogicalPredicate()
	 * @see #unsetLogicalPredicate()
	 * @see #getLogicalPredicate()
	 * @generated
	 */
	void setLogicalPredicate(LogicalPredicateType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getLogicalPredicate <em>Logical Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogicalPredicate()
	 * @see #getLogicalPredicate()
	 * @see #setLogicalPredicate(LogicalPredicateType)
	 * @generated
	 */
	void unsetLogicalPredicate();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getLogicalPredicate <em>Logical Predicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Logical Predicate</em>' attribute is set.
	 * @see #unsetLogicalPredicate()
	 * @see #getLogicalPredicate()
	 * @see #setLogicalPredicate(LogicalPredicateType)
	 * @generated
	 */
	boolean isSetLogicalPredicate();

} // RationalClauseType
