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
 * $Id: ClauseType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getSimpleClause <em>Simple Clause</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getCompoundClause <em>Compound Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClauseType()
 * @model extendedMetaData="name='Clause_._type' kind='elementOnly'"
 * @generated
 */
public interface ClauseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Clause</em>' containment reference.
	 * @see #setSimpleClause(SimpleClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClauseType_SimpleClause()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SimpleClause' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleClauseType getSimpleClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getSimpleClause <em>Simple Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Clause</em>' containment reference.
	 * @see #getSimpleClause()
	 * @generated
	 */
	void setSimpleClause(SimpleClauseType value);

	/**
	 * Returns the value of the '<em><b>Compound Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Clause</em>' containment reference.
	 * @see #setCompoundClause(CompoundClauseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClauseType_CompoundClause()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='CompoundClause' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundClauseType getCompoundClause();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getCompoundClause <em>Compound Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Clause</em>' containment reference.
	 * @see #getCompoundClause()
	 * @generated
	 */
	void setCompoundClause(CompoundClauseType value);

} // ClauseType
