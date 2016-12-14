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
 * $Id: SimpleClauseType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Clause Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getBooleanClause <em>Boolean Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getRationalClause <em>Rational Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getStringClause <em>String Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getLeftArgument <em>Left Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSimpleClauseType()
 * @model extendedMetaData="name='SimpleClause_._type' kind='elementOnly'"
 * @generated
 */
public interface SimpleClauseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Clause</em>' containment reference.
	 * @see #setBooleanClause(BooleanClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSimpleClauseType_BooleanClause()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='BooleanClause' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanClauseType getBooleanClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getBooleanClause <em>Boolean Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Clause</em>' containment reference.
	 * @see #getBooleanClause()
	 * @generated
	 */
	void setBooleanClause(BooleanClauseType value);

	/**
	 * Returns the value of the '<em><b>Rational Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Clause</em>' containment reference.
	 * @see #setRationalClause(RationalClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSimpleClauseType_RationalClause()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RationalClause' namespace='##targetNamespace'"
	 * @generated
	 */
	RationalClauseType getRationalClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getRationalClause <em>Rational Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Clause</em>' containment reference.
	 * @see #getRationalClause()
	 * @generated
	 */
	void setRationalClause(RationalClauseType value);

	/**
	 * Returns the value of the '<em><b>String Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Clause</em>' containment reference.
	 * @see #setStringClause(StringClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSimpleClauseType_StringClause()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='StringClause' namespace='##targetNamespace'"
	 * @generated
	 */
	StringClauseType getStringClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getStringClause <em>String Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Clause</em>' containment reference.
	 * @see #getStringClause()
	 * @generated
	 */
	void setStringClause(StringClauseType value);

	/**
	 * Returns the value of the '<em><b>Left Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Argument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Argument</em>' attribute.
	 * @see #setLeftArgument(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSimpleClauseType_LeftArgument()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='leftArgument'"
	 * @generated
	 */
	String getLeftArgument();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getLeftArgument <em>Left Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Argument</em>' attribute.
	 * @see #getLeftArgument()
	 * @generated
	 */
	void setLeftArgument(String value);

} // SimpleClauseType
