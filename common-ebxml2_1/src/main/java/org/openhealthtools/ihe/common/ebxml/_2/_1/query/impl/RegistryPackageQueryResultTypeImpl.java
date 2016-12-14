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
 * $Id: RegistryPackageQueryResultTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Package Query Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl#getRegistryEntry <em>Registry Entry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl#getRegistryPackage <em>Registry Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryPackageQueryResultTypeImpl extends EObjectImpl implements RegistryPackageQueryResultType {
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
	protected RegistryPackageQueryResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.REGISTRY_PACKAGE_QUERY_RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getObjectRef() {
		return ((FeatureMap)getGroup()).list(QueryPackage.Literals.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryEntry() {
		return ((FeatureMap)getGroup()).list(QueryPackage.Literals.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryObject() {
		return ((FeatureMap)getGroup()).list(QueryPackage.Literals.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryPackage() {
		return ((FeatureMap)getGroup()).list(QueryPackage.Literals.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP:
				return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF:
				return ((InternalEList)getObjectRef()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY:
				return ((InternalEList)getRegistryEntry()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT:
				return ((InternalEList)getRegistryObject()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE:
				return ((InternalEList)getRegistryPackage()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF:
				return getObjectRef();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY:
				return getRegistryEntry();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT:
				return getRegistryObject();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE:
				return getRegistryPackage();
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF:
				getObjectRef().clear();
				getObjectRef().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY:
				getRegistryEntry().clear();
				getRegistryEntry().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT:
				getRegistryObject().clear();
				getRegistryObject().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE:
				getRegistryPackage().clear();
				getRegistryPackage().addAll((Collection)newValue);
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP:
				getGroup().clear();
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF:
				getObjectRef().clear();
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY:
				getRegistryEntry().clear();
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT:
				getRegistryObject().clear();
				return;
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE:
				getRegistryPackage().clear();
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF:
				return !getObjectRef().isEmpty();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY:
				return !getRegistryEntry().isEmpty();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT:
				return !getRegistryObject().isEmpty();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE:
				return !getRegistryPackage().isEmpty();
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

} //RegistryPackageQueryResultTypeImpl
