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
 * $Id: LeafRegistryObjectListTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf Registry Object List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getAuditableEvent <em>Auditable Event</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getClassificationScheme <em>Classification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getExternalLink <em>External Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getExtrinsicObject <em>Extrinsic Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getRegistryPackage <em>Registry Package</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getSpecificationLink <em>Specification Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafRegistryObjectListTypeImpl extends EObjectImpl implements LeafRegistryObjectListType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafRegistryObjectListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getObjectRef() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssociation() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuditableEvent() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassification() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassificationNode() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassificationScheme() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalIdentifier() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalLink() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtrinsicObject() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrganization() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryPackage() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getService() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServiceBinding() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecificationLink() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUser() {
		return ((FeatureMap)getGroup()).list(RimPackage.Literals.LEAF_REGISTRY_OBJECT_LIST_TYPE__USER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP:
				return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF:
				return ((InternalEList)getObjectRef()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION:
				return ((InternalEList)getAssociation()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT:
				return ((InternalEList)getAuditableEvent()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION:
				return ((InternalEList)getClassification()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE:
				return ((InternalEList)getClassificationNode()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME:
				return ((InternalEList)getClassificationScheme()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER:
				return ((InternalEList)getExternalIdentifier()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK:
				return ((InternalEList)getExternalLink()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT:
				return ((InternalEList)getExtrinsicObject()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION:
				return ((InternalEList)getOrganization()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE:
				return ((InternalEList)getRegistryPackage()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE:
				return ((InternalEList)getService()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING:
				return ((InternalEList)getServiceBinding()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK:
				return ((InternalEList)getSpecificationLink()).basicRemove(otherEnd, msgs);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__USER:
				return ((InternalEList)getUser()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF:
				return getObjectRef();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION:
				return getAssociation();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT:
				return getAuditableEvent();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION:
				return getClassification();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE:
				return getClassificationNode();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME:
				return getClassificationScheme();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK:
				return getExternalLink();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT:
				return getExtrinsicObject();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION:
				return getOrganization();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE:
				return getRegistryPackage();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE:
				return getService();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING:
				return getServiceBinding();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK:
				return getSpecificationLink();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__USER:
				return getUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF:
				getObjectRef().clear();
				getObjectRef().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT:
				getAuditableEvent().clear();
				getAuditableEvent().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE:
				getClassificationNode().clear();
				getClassificationNode().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME:
				getClassificationScheme().clear();
				getClassificationScheme().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER:
				getExternalIdentifier().clear();
				getExternalIdentifier().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK:
				getExternalLink().clear();
				getExternalLink().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT:
				getExtrinsicObject().clear();
				getExtrinsicObject().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE:
				getRegistryPackage().clear();
				getRegistryPackage().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE:
				getService().clear();
				getService().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING:
				getServiceBinding().clear();
				getServiceBinding().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK:
				getSpecificationLink().clear();
				getSpecificationLink().addAll((Collection)newValue);
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__USER:
				getUser().clear();
				getUser().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF:
				getObjectRef().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION:
				getAssociation().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT:
				getAuditableEvent().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION:
				getClassification().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE:
				getClassificationNode().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME:
				getClassificationScheme().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER:
				getExternalIdentifier().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK:
				getExternalLink().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT:
				getExtrinsicObject().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE:
				getRegistryPackage().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE:
				getService().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING:
				getServiceBinding().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK:
				getSpecificationLink().clear();
				return;
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__USER:
				getUser().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF:
				return !getObjectRef().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION:
				return !getAssociation().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT:
				return !getAuditableEvent().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION:
				return !getClassification().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE:
				return !getClassificationNode().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME:
				return !getClassificationScheme().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER:
				return !getExternalIdentifier().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK:
				return !getExternalLink().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT:
				return !getExtrinsicObject().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION:
				return !getOrganization().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE:
				return !getRegistryPackage().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE:
				return !getService().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING:
				return !getServiceBinding().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK:
				return !getSpecificationLink().isEmpty();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE__USER:
				return !getUser().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //LeafRegistryObjectListTypeImpl
