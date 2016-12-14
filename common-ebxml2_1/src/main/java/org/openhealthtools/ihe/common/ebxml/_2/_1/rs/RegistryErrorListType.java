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
 * $Id: RegistryErrorListType.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getRegistryError <em>Registry Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryErrorListType()
 * @model extendedMetaData="name='RegistryErrorList_._type' kind='elementOnly'"
 * @generated
 */
public interface RegistryErrorListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Registry Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Error</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryErrorListType_RegistryError()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RegistryError' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRegistryError();

	/**
	 * Returns the value of the '<em><b>Highest Severity</b></em>' attribute.
	 * The default value is <code>"Warning"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highest Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highest Severity</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
	 * @see #isSetHighestSeverity()
	 * @see #unsetHighestSeverity()
	 * @see #setHighestSeverity(ErrorType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryErrorListType_HighestSeverity()
	 * @model default="Warning" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='highestSeverity'"
	 * @generated
	 */
	ErrorType getHighestSeverity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highest Severity</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
	 * @see #isSetHighestSeverity()
	 * @see #unsetHighestSeverity()
	 * @see #getHighestSeverity()
	 * @generated
	 */
	void setHighestSeverity(ErrorType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighestSeverity()
	 * @see #getHighestSeverity()
	 * @see #setHighestSeverity(ErrorType)
	 * @generated
	 */
	void unsetHighestSeverity();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Highest Severity</em>' attribute is set.
	 * @see #unsetHighestSeverity()
	 * @see #getHighestSeverity()
	 * @see #setHighestSeverity(ErrorType)
	 * @generated
	 */
	boolean isSetHighestSeverity();

} // RegistryErrorListType
