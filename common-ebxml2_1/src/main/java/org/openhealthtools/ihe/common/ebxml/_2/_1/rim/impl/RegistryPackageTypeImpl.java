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
 * $Id: RegistryPackageTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Package Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryPackageTypeImpl#getRegistryObjectList <em>Registry Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryPackageTypeImpl extends RegistryEntryTypeImpl implements RegistryPackageType {
	/**
	 * The cached value of the '{@link #getRegistryObjectList() <em>Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectList()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectListType registryObjectList = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryPackageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.REGISTRY_PACKAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getRegistryObjectList() {
		return registryObjectList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectList(RegistryObjectListType newRegistryObjectList, NotificationChain msgs) {
		RegistryObjectListType oldRegistryObjectList = registryObjectList;
		registryObjectList = newRegistryObjectList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST, oldRegistryObjectList, newRegistryObjectList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectList(RegistryObjectListType newRegistryObjectList) {
		if (newRegistryObjectList != registryObjectList) {
			NotificationChain msgs = null;
			if (registryObjectList != null)
				msgs = ((InternalEObject)registryObjectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			if (newRegistryObjectList != null)
				msgs = ((InternalEObject)newRegistryObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			msgs = basicSetRegistryObjectList(newRegistryObjectList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST, newRegistryObjectList, newRegistryObjectList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST:
				return basicSetRegistryObjectList(null, msgs);
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
			case RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST:
				return getRegistryObjectList();
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
			case RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)newValue);
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
			case RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)null);
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
			case RimPackage.REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST:
				return registryObjectList != null;
		}
		return super.eIsSet(featureID);
	}

} //RegistryPackageTypeImpl
