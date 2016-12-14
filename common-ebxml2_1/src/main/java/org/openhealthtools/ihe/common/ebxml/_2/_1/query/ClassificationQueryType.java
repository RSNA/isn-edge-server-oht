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
 * $Id: ClassificationQueryType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationFilter <em>Classification Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationQueryType()
 * @model extendedMetaData="name='ClassificationQueryType' kind='elementOnly'"
 * @generated
 */
public interface ClassificationQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Classification Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Filter</em>' containment reference.
	 * @see #setClassificationFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationQueryType_ClassificationFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getClassificationFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationFilter <em>Classification Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Filter</em>' containment reference.
	 * @see #getClassificationFilter()
	 * @generated
	 */
	void setClassificationFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme Query</em>' containment reference.
	 * @see #setClassificationSchemeQuery(ClassificationSchemeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationQueryType_ClassificationSchemeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryType getClassificationSchemeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Query</em>' containment reference.
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 */
	void setClassificationSchemeQuery(ClassificationSchemeQueryType value);

	/**
	 * Returns the value of the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #setClassificationNodeQuery(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationQueryType_ClassificationNodeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationNodeQuery <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #getClassificationNodeQuery()
	 * @generated
	 */
	void setClassificationNodeQuery(ClassificationNodeQueryType value);

	/**
	 * Returns the value of the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #setRegistryObjectQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationQueryType_RegistryObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getRegistryObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #getRegistryObjectQuery()
	 * @generated
	 */
	void setRegistryObjectQuery(RegistryObjectQueryType value);

	/**
	 * Returns the value of the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Entry Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Entry Query</em>' containment reference.
	 * @see #setRegistryEntryQuery(RegistryEntryQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationQueryType_RegistryEntryQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryEntryQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryEntryQueryType getRegistryEntryQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Entry Query</em>' containment reference.
	 * @see #getRegistryEntryQuery()
	 * @generated
	 */
	void setRegistryEntryQuery(RegistryEntryQueryType value);

} // ClassificationQueryType
