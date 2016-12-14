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
 * $Id: AdhocQueryResponseType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adhoc Query Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getFilterQueryResult <em>Filter Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getSQLQueryResult <em>SQL Query Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAdhocQueryResponseType()
 * @model extendedMetaData="name='AdhocQueryResponse_._type' kind='elementOnly'"
 * @generated
 */
public interface AdhocQueryResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Query Result</em>' containment reference.
	 * @see #setFilterQueryResult(FilterQueryResultType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAdhocQueryResponseType_FilterQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='FilterQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterQueryResultType getFilterQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getFilterQueryResult <em>Filter Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Query Result</em>' containment reference.
	 * @see #getFilterQueryResult()
	 * @generated
	 */
	void setFilterQueryResult(FilterQueryResultType value);

	/**
	 * Returns the value of the '<em><b>SQL Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Query Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Query Result</em>' containment reference.
	 * @see #setSQLQueryResult(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAdhocQueryResponseType_SQLQueryResult()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SQLQueryResult' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getSQLQueryResult();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getSQLQueryResult <em>SQL Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQL Query Result</em>' containment reference.
	 * @see #getSQLQueryResult()
	 * @generated
	 */
	void setSQLQueryResult(RegistryObjectListType value);

} // AdhocQueryResponseType
