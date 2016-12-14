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
 * $Id: RemoveObjectsRequestType.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRemoveObjectsRequestType()
 * @model extendedMetaData="name='RemoveObjectsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface RemoveObjectsRequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Ref List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of ObjectRefs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Ref List</em>' containment reference.
	 * @see #setObjectRefList(ObjectRefListType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRemoveObjectsRequestType_ObjectRefList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectRefList' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1'"
	 * @generated
	 */
	ObjectRefListType getObjectRefList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref List</em>' containment reference.
	 * @see #getObjectRefList()
	 * @generated
	 */
	void setObjectRefList(ObjectRefListType value);

	/**
	 * Returns the value of the '<em><b>Deletion Scope</b></em>' attribute.
	 * The default value is <code>"DeleteAll"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletion Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion Scope</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
	 * @see #isSetDeletionScope()
	 * @see #unsetDeletionScope()
	 * @see #setDeletionScope(DeletionScopeType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRemoveObjectsRequestType_DeletionScope()
	 * @model default="DeleteAll" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='deletionScope'"
	 * @generated
	 */
	DeletionScopeType getDeletionScope();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletion Scope</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
	 * @see #isSetDeletionScope()
	 * @see #unsetDeletionScope()
	 * @see #getDeletionScope()
	 * @generated
	 */
	void setDeletionScope(DeletionScopeType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeletionScope()
	 * @see #getDeletionScope()
	 * @see #setDeletionScope(DeletionScopeType)
	 * @generated
	 */
	void unsetDeletionScope();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deletion Scope</em>' attribute is set.
	 * @see #unsetDeletionScope()
	 * @see #getDeletionScope()
	 * @see #setDeletionScope(DeletionScopeType)
	 * @generated
	 */
	boolean isSetDeletionScope();

} // RemoveObjectsRequestType
