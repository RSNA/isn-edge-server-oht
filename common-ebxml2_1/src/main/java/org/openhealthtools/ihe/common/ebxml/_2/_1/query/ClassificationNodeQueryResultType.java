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
 * $Id: ClassificationNodeQueryResultType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Node Query Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getClassificationNode <em>Classification Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationNodeQueryResultType()
 * @model extendedMetaData="name='ClassificationNodeQueryResult_._type' kind='elementOnly'"
 * @generated
 */
public interface ClassificationNodeQueryResultType extends EObject {
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationNodeQueryResultType_Group()
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationNodeQueryResultType_ObjectRef()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectRef' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getObjectRef();

	/**
	 * Returns the value of the '<em><b>Registry Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationNodeQueryResultType_RegistryObject()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObject' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getRegistryObject();

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getClassificationNodeQueryResultType_ClassificationNode()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNode' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getClassificationNode();

} // ClassificationNodeQueryResultType
