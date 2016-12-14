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
 * $Id: ClassificationSchemeType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * ClassificationScheme is the mapping of the same named interface in ebRIM.
 * It extends RegistryEntry.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#isIsInternal <em>Is Internal</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getClassificationSchemeType()
 * @model extendedMetaData="name='ClassificationSchemeType' kind='elementOnly'"
 * @generated
 */
public interface ClassificationSchemeType extends RegistryEntryType {
	/**
	 * Returns the value of the '<em><b>Classification Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getClassificationSchemeType_ClassificationNode()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getClassificationNode();

	/**
	 * Returns the value of the '<em><b>Is Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Internal</em>' attribute.
	 * @see #isSetIsInternal()
	 * @see #unsetIsInternal()
	 * @see #setIsInternal(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getClassificationSchemeType_IsInternal()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isInternal'"
	 * @generated
	 */
	boolean isIsInternal();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#isIsInternal <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Internal</em>' attribute.
	 * @see #isSetIsInternal()
	 * @see #unsetIsInternal()
	 * @see #isIsInternal()
	 * @generated
	 */
	void setIsInternal(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#isIsInternal <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInternal()
	 * @see #isIsInternal()
	 * @see #setIsInternal(boolean)
	 * @generated
	 */
	void unsetIsInternal();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#isIsInternal <em>Is Internal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Internal</em>' attribute is set.
	 * @see #unsetIsInternal()
	 * @see #isIsInternal()
	 * @see #setIsInternal(boolean)
	 * @generated
	 */
	boolean isSetIsInternal();

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The default value is <code>"UniqueCode"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getClassificationSchemeType_NodeType()
	 * @model default="UniqueCode" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='nodeType'"
	 * @generated
	 */
	NodeTypeType getNodeType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeTypeType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @generated
	 */
	void unsetNodeType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getNodeType <em>Node Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Type</em>' attribute is set.
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @generated
	 */
	boolean isSetNodeType();

} // ClassificationSchemeType
