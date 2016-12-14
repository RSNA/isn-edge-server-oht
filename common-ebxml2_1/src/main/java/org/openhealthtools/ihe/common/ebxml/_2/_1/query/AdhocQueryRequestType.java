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
 * $Id: AdhocQueryRequestType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adhoc Query Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getFilterQuery <em>Filter Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getSQLQuery <em>SQL Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAdhocQueryRequestType()
 * @model extendedMetaData="name='AdhocQueryRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface AdhocQueryRequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Option</em>' containment reference.
	 * @see #setResponseOption(ResponseOptionType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAdhocQueryRequestType_ResponseOption()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='ResponseOption' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseOptionType getResponseOption();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getResponseOption <em>Response Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Option</em>' containment reference.
	 * @see #getResponseOption()
	 * @generated
	 */
	void setResponseOption(ResponseOptionType value);

	/**
	 * Returns the value of the '<em><b>Filter Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Query</em>' containment reference.
	 * @see #setFilterQuery(FilterQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAdhocQueryRequestType_FilterQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='FilterQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterQueryType getFilterQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getFilterQuery <em>Filter Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Query</em>' containment reference.
	 * @see #getFilterQuery()
	 * @generated
	 */
	void setFilterQuery(FilterQueryType value);

	/**
	 * Returns the value of the '<em><b>SQL Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Query</em>' attribute.
	 * @see #setSQLQuery(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getAdhocQueryRequestType_SQLQuery()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SQLQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSQLQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getSQLQuery <em>SQL Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQL Query</em>' attribute.
	 * @see #getSQLQuery()
	 * @generated
	 */
	void setSQLQuery(String value);

} // AdhocQueryRequestType
