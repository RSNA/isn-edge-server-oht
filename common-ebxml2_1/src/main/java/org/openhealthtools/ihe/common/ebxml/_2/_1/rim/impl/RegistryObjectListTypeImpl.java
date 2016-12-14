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
 * $Id: RegistryObjectListTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Object List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectListTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectListTypeImpl#getRegistryEntry <em>Registry Entry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectListTypeImpl#getRegistryObject <em>Registry Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryObjectListTypeImpl extends LeafRegistryObjectListTypeImpl implements RegistryObjectListType {
	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1 = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryObjectListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.REGISTRY_OBJECT_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, RimPackage.REGISTRY_OBJECT_LIST_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryEntry() {
		return ((FeatureMap)getGroup1()).list(RimPackage.Literals.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryObject() {
		return ((FeatureMap)getGroup1()).list(RimPackage.Literals.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__GROUP1:
				return ((InternalEList)getGroup1()).basicRemove(otherEnd, msgs);
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY:
				return ((InternalEList)getRegistryEntry()).basicRemove(otherEnd, msgs);
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT:
				return ((InternalEList)getRegistryObject()).basicRemove(otherEnd, msgs);
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY:
				return getRegistryEntry();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT:
				return getRegistryObject();
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY:
				getRegistryEntry().clear();
				getRegistryEntry().addAll((Collection)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT:
				getRegistryObject().clear();
				getRegistryObject().addAll((Collection)newValue);
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY:
				getRegistryEntry().clear();
				return;
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT:
				getRegistryObject().clear();
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY:
				return !getRegistryEntry().isEmpty();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT:
				return !getRegistryObject().isEmpty();
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
		result.append(" (group1: ");
		result.append(group1);
		result.append(')');
		return result.toString();
	}

} //RegistryObjectListTypeImpl
