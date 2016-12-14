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
 * $Id: ClassificationSchemeQueryType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Scheme Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationSchemeQueryType()
 * @model extendedMetaData="name='ClassificationSchemeQueryType' kind='elementOnly'"
 * @generated
 */
public interface ClassificationSchemeQueryType extends RegistryEntryQueryType {
	/**
	 * Returns the value of the '<em><b>Classification Scheme Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme Filter</em>' containment reference.
	 * @see #setClassificationSchemeFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationSchemeQueryType_ClassificationSchemeFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationSchemeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getClassificationSchemeFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme Filter</em>' containment reference.
	 * @see #getClassificationSchemeFilter()
	 * @generated
	 */
	void setClassificationSchemeFilter(FilterType value);

} // ClassificationSchemeQueryType
