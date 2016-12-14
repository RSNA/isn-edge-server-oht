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
 * $Id: ResponseOptionType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Option Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#isReturnComposedObjects <em>Return Composed Objects</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getResponseOptionType()
 * @model extendedMetaData="name='ResponseOptionType' kind='empty'"
 * @generated
 */
public interface ResponseOptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Return Composed Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Composed Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Composed Objects</em>' attribute.
	 * @see #isSetReturnComposedObjects()
	 * @see #unsetReturnComposedObjects()
	 * @see #setReturnComposedObjects(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getResponseOptionType_ReturnComposedObjects()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='returnComposedObjects'"
	 * @generated
	 */
	boolean isReturnComposedObjects();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#isReturnComposedObjects <em>Return Composed Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Composed Objects</em>' attribute.
	 * @see #isSetReturnComposedObjects()
	 * @see #unsetReturnComposedObjects()
	 * @see #isReturnComposedObjects()
	 * @generated
	 */
	void setReturnComposedObjects(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#isReturnComposedObjects <em>Return Composed Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturnComposedObjects()
	 * @see #isReturnComposedObjects()
	 * @see #setReturnComposedObjects(boolean)
	 * @generated
	 */
	void unsetReturnComposedObjects();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#isReturnComposedObjects <em>Return Composed Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return Composed Objects</em>' attribute is set.
	 * @see #unsetReturnComposedObjects()
	 * @see #isReturnComposedObjects()
	 * @see #setReturnComposedObjects(boolean)
	 * @generated
	 */
	boolean isSetReturnComposedObjects();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>"RegistryObject"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
	 * @see #isSetReturnType()
	 * @see #unsetReturnType()
	 * @see #setReturnType(ReturnTypeType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getResponseOptionType_ReturnType()
	 * @model default="RegistryObject" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='returnType'"
	 * @generated
	 */
	ReturnTypeType getReturnType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
	 * @see #isSetReturnType()
	 * @see #unsetReturnType()
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ReturnTypeType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturnType()
	 * @see #getReturnType()
	 * @see #setReturnType(ReturnTypeType)
	 * @generated
	 */
	void unsetReturnType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#getReturnType <em>Return Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return Type</em>' attribute is set.
	 * @see #unsetReturnType()
	 * @see #getReturnType()
	 * @see #setReturnType(ReturnTypeType)
	 * @generated
	 */
	boolean isSetReturnType();

} // ResponseOptionType
