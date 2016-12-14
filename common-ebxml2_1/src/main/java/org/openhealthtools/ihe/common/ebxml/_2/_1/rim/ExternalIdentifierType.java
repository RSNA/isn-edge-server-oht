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
 * $Id: ExternalIdentifierType.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * ExternalIdentifier is the mapping of the same named interface in ebRIM.
 * It extends RegistryObject.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getIdentificationScheme <em>Identification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getExternalIdentifierType()
 * @model extendedMetaData="name='ExternalIdentifierType' kind='elementOnly'"
 * @generated
 */
public interface ExternalIdentifierType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Identification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Scheme</em>' attribute.
	 * @see #setIdentificationScheme(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getExternalIdentifierType_IdentificationScheme()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='identificationScheme'"
	 * @generated
	 */
	String getIdentificationScheme();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getIdentificationScheme <em>Identification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Scheme</em>' attribute.
	 * @see #getIdentificationScheme()
	 * @generated
	 */
	void setIdentificationScheme(String value);

	/**
	 * Returns the value of the '<em><b>Registry Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object</em>' attribute.
	 * @see #setRegistryObject(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getExternalIdentifierType_RegistryObject()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='registryObject'"
	 * @generated
	 */
	String getRegistryObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getRegistryObject <em>Registry Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object</em>' attribute.
	 * @see #getRegistryObject()
	 * @generated
	 */
	void setRegistryObject(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getExternalIdentifierType_Value()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.ShortName" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ExternalIdentifierType
