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
 * $Id: RegistryProfileType.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getOptionalFeaturesSupported <em>Optional Features Supported</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryProfileType()
 * @model extendedMetaData="name='RegistryProfile_._type' kind='elementOnly'"
 * @generated
 */
public interface RegistryProfileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Optional Features Supported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Features Supported</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Features Supported</em>' containment reference.
	 * @see #setOptionalFeaturesSupported(OptionalFeaturesSupportedType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryProfileType_OptionalFeaturesSupported()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OptionalFeaturesSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionalFeaturesSupportedType getOptionalFeaturesSupported();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getOptionalFeaturesSupported <em>Optional Features Supported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Features Supported</em>' containment reference.
	 * @see #getOptionalFeaturesSupported()
	 * @generated
	 */
	void setOptionalFeaturesSupported(OptionalFeaturesSupportedType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryProfileType_Version()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // RegistryProfileType
