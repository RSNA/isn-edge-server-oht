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
 * $Id: ExtrinsicObjectType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extrinsic Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * ExtrinsicObject are attributes from the ExtrinsicObject interface in ebRIM.
 * It inherits RegistryEntryAttributes
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getExtrinsicObjectType()
 * @model extendedMetaData="name='ExtrinsicObjectType' kind='elementOnly'"
 * @generated
 */
public interface ExtrinsicObjectType extends RegistryEntryType {
	/**
	 * Returns the value of the '<em><b>Is Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Opaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Opaque</em>' attribute.
	 * @see #isSetIsOpaque()
	 * @see #unsetIsOpaque()
	 * @see #setIsOpaque(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getExtrinsicObjectType_IsOpaque()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isOpaque'"
	 * @generated
	 */
	boolean isIsOpaque();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Opaque</em>' attribute.
	 * @see #isSetIsOpaque()
	 * @see #unsetIsOpaque()
	 * @see #isIsOpaque()
	 * @generated
	 */
	void setIsOpaque(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOpaque()
	 * @see #isIsOpaque()
	 * @see #setIsOpaque(boolean)
	 * @generated
	 */
	void unsetIsOpaque();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Opaque</em>' attribute is set.
	 * @see #unsetIsOpaque()
	 * @see #isIsOpaque()
	 * @see #setIsOpaque(boolean)
	 * @generated
	 */
	boolean isSetIsOpaque();

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getExtrinsicObjectType_MimeType()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.LongName"
	 *        extendedMetaData="kind='attribute' name='mimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // ExtrinsicObjectType
