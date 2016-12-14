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
 * $Id: RegistryEntryQueryResultType.java,v 1.1 2006/06/27 23:18:06 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Entry Query Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getClassificationScheme <em>Classification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getExtrinsicObject <em>Extrinsic Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryEntry <em>Registry Entry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryPackage <em>Registry Package</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType()
 * @model extendedMetaData="name='RegistryEntryQueryResult_._type' kind='elementOnly'"
 * @generated
 */
public interface RegistryEntryQueryResultType extends EObject {
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_Group()
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_ObjectRef()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectRef' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getObjectRef();

	/**
	 * Returns the value of the '<em><b>Classification Scheme</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_ClassificationScheme()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationScheme' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getClassificationScheme();

	/**
	 * Returns the value of the '<em><b>Extrinsic Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrinsic Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrinsic Object</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_ExtrinsicObject()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtrinsicObject' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getExtrinsicObject();

	/**
	 * Returns the value of the '<em><b>Registry Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Entry</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_RegistryEntry()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryEntry' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getRegistryEntry();

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_RegistryObject()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObject' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getRegistryObject();

	/**
	 * Returns the value of the '<em><b>Registry Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Package</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_RegistryPackage()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryPackage' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getRegistryPackage();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getRegistryEntryQueryResultType_Service()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1' group='#group:0'"
	 * @generated
	 */
	EList getService();

} // RegistryEntryQueryResultType
