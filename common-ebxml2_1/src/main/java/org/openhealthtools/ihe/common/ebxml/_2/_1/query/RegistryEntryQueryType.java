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
 * $Id: RegistryEntryQueryType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Entry Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType#getRegistryEntryFilter <em>Registry Entry Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryType()
 * @model extendedMetaData="name='RegistryEntryQueryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryEntryQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Entry Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Entry Filter</em>' containment reference.
	 * @see #setRegistryEntryFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryType_RegistryEntryFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryEntryFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getRegistryEntryFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType#getRegistryEntryFilter <em>Registry Entry Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Entry Filter</em>' containment reference.
	 * @see #getRegistryEntryFilter()
	 * @generated
	 */
	void setRegistryEntryFilter(FilterType value);

} // RegistryEntryQueryType
