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
 * $Id: UpdateObjectsRequestType.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType#getLeafRegistryObjectList <em>Leaf Registry Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getUpdateObjectsRequestType()
 * @model extendedMetaData="name='UpdateObjectsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface UpdateObjectsRequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Leaf Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf Registry Object List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf Registry Object List</em>' containment reference.
	 * @see #setLeafRegistryObjectList(LeafRegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getUpdateObjectsRequestType_LeafRegistryObjectList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LeafRegistryObjectList' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1'"
	 * @generated
	 */
	LeafRegistryObjectListType getLeafRegistryObjectList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType#getLeafRegistryObjectList <em>Leaf Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf Registry Object List</em>' containment reference.
	 * @see #getLeafRegistryObjectList()
	 * @generated
	 */
	void setLeafRegistryObjectList(LeafRegistryObjectListType value);

} // UpdateObjectsRequestType
