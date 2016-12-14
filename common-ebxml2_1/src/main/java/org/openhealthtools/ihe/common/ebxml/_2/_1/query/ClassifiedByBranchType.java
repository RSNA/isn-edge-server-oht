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
 * $Id: ClassifiedByBranchType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classified By Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationFilter <em>Classification Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassifiedByBranchType()
 * @model extendedMetaData="name='ClassifiedByBranch_._type' kind='elementOnly'"
 * @generated
 */
public interface ClassifiedByBranchType extends EObject {
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassifiedByBranchType_ClassificationFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getClassificationFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationFilter <em>Classification Filter</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassifiedByBranchType_ClassificationSchemeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationSchemeQueryType getClassificationSchemeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassifiedByBranchType_ClassificationNodeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationNodeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getClassificationNodeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationNodeQuery <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node Query</em>' containment reference.
	 * @see #getClassificationNodeQuery()
	 * @generated
	 */
	void setClassificationNodeQuery(ClassificationNodeQueryType value);

} // ClassifiedByBranchType
