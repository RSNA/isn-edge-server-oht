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
 * $Id: StringClauseType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Clause Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getStringPredicate <em>String Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getStringClauseType()
 * @model extendedMetaData="name='StringClause_._type' kind='simple'"
 * @generated
 */
public interface StringClauseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getStringClauseType_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>String Predicate</b></em>' attribute.
	 * The default value is <code>"Contains"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Predicate</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
	 * @see #isSetStringPredicate()
	 * @see #unsetStringPredicate()
	 * @see #setStringPredicate(StringPredicateType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getStringClauseType_StringPredicate()
	 * @model default="Contains" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='stringPredicate'"
	 * @generated
	 */
	StringPredicateType getStringPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getStringPredicate <em>String Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Predicate</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
	 * @see #isSetStringPredicate()
	 * @see #unsetStringPredicate()
	 * @see #getStringPredicate()
	 * @generated
	 */
	void setStringPredicate(StringPredicateType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getStringPredicate <em>String Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStringPredicate()
	 * @see #getStringPredicate()
	 * @see #setStringPredicate(StringPredicateType)
	 * @generated
	 */
	void unsetStringPredicate();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getStringPredicate <em>String Predicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>String Predicate</em>' attribute is set.
	 * @see #unsetStringPredicate()
	 * @see #getStringPredicate()
	 * @see #setStringPredicate(StringPredicateType)
	 * @generated
	 */
	boolean isSetStringPredicate();

} // StringClauseType
