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
 * $Id: RemoveSlotsRequestType.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Slots Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRemoveSlotsRequestType()
 * @model extendedMetaData="name='RemoveSlotsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface RemoveSlotsRequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Ref</em>' containment reference.
	 * @see #setObjectRef(ObjectRefType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRemoveSlotsRequestType_ObjectRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectRef' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1'"
	 * @generated
	 */
	ObjectRefType getObjectRef();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType#getObjectRef <em>Object Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref</em>' containment reference.
	 * @see #getObjectRef()
	 * @generated
	 */
	void setObjectRef(ObjectRefType value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRemoveSlotsRequestType_Slot()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1'"
	 * @generated
	 */
	EList getSlot();

} // RemoveSlotsRequestType
