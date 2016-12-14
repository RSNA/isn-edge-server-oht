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
 * $Id: SpecificationLinkType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getUsageDescription <em>Usage Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getUsageParameter <em>Usage Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getSpecificationObject <em>Specification Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getSpecificationLinkType()
 * @model extendedMetaData="name='SpecificationLinkType' kind='elementOnly'"
 * @generated
 */
public interface SpecificationLinkType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Usage Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Description</em>' containment reference.
	 * @see #setUsageDescription(InternationalStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getSpecificationLinkType_UsageDescription()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='UsageDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringType getUsageDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getUsageDescription <em>Usage Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Description</em>' containment reference.
	 * @see #getUsageDescription()
	 * @generated
	 */
	void setUsageDescription(InternationalStringType value);

	/**
	 * Returns the value of the '<em><b>Usage Parameter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Parameter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Parameter</em>' attribute list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getSpecificationLinkType_UsageParameter()
	 * @model type="java.lang.String" unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.FreeFormText"
	 *        extendedMetaData="kind='element' name='UsageParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getUsageParameter();

	/**
	 * Returns the value of the '<em><b>Specification Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Object</em>' attribute.
	 * @see #setSpecificationObject(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getSpecificationLinkType_SpecificationObject()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='specificationObject'"
	 * @generated
	 */
	String getSpecificationObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getSpecificationObject <em>Specification Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Object</em>' attribute.
	 * @see #getSpecificationObject()
	 * @generated
	 */
	void setSpecificationObject(String value);

} // SpecificationLinkType
