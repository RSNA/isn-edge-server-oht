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
 * $Id: ObjectRefListType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Ref List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType#getObjectRef <em>Object Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getObjectRefListType()
 * @model extendedMetaData="name='ObjectRefList_._type' kind='elementOnly'"
 * @generated
 */
public interface ObjectRefListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getObjectRefListType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Object Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Ref</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getObjectRefListType_ObjectRef()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getObjectRef();

} // ObjectRefListType
