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
 * $Id: LeafRegistryObjectListType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Registry Object List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getAuditableEvent <em>Auditable Event</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassificationScheme <em>Classification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExternalLink <em>External Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExtrinsicObject <em>Extrinsic Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getRegistryPackage <em>Registry Package</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getService <em>Service</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getSpecificationLink <em>Specification Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType()
 * @model extendedMetaData="name='LeafRegistryObjectListType' kind='elementOnly'"
 * @generated
 */
public interface LeafRegistryObjectListType extends EObject {
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_Group()
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_ObjectRef()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getObjectRef();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_Association()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Association' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getAssociation();

	/**
	 * Returns the value of the '<em><b>Auditable Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditable Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable Event</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_AuditableEvent()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditableEvent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getAuditableEvent();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_Classification()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Classification' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getClassification();

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_ClassificationNode()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNode' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getClassificationNode();

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_ClassificationScheme()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationScheme' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getClassificationScheme();

	/**
	 * Returns the value of the '<em><b>External Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifier</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_ExternalIdentifier()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalIdentifier' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getExternalIdentifier();

	/**
	 * Returns the value of the '<em><b>External Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Link</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_ExternalLink()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalLink' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getExternalLink();

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_ExtrinsicObject()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtrinsicObject' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getExtrinsicObject();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_Organization()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getOrganization();

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_RegistryPackage()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryPackage' namespace='##targetNamespace' group='#group:0'"
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_Service()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getService();

	/**
	 * Returns the value of the '<em><b>Service Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_ServiceBinding()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceBinding' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getServiceBinding();

	/**
	 * Returns the value of the '<em><b>Specification Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_SpecificationLink()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpecificationLink' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getSpecificationLink();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getLeafRegistryObjectListType_User()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='User' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getUser();

} // LeafRegistryObjectListType
