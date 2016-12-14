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
 * $Id: SubmitObjectsRequestTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submit Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.SubmitObjectsRequestTypeImpl#getLeafRegistryObjectList <em>Leaf Registry Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmitObjectsRequestTypeImpl extends EObjectImpl implements SubmitObjectsRequestType {
	/**
	 * The cached value of the '{@link #getLeafRegistryObjectList() <em>Leaf Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeafRegistryObjectList()
	 * @generated
	 * @ordered
	 */
	protected LeafRegistryObjectListType leafRegistryObjectList = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmitObjectsRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.SUBMIT_OBJECTS_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafRegistryObjectListType getLeafRegistryObjectList() {
		return leafRegistryObjectList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeafRegistryObjectList(LeafRegistryObjectListType newLeafRegistryObjectList, NotificationChain msgs) {
		LeafRegistryObjectListType oldLeafRegistryObjectList = leafRegistryObjectList;
		leafRegistryObjectList = newLeafRegistryObjectList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST, oldLeafRegistryObjectList, newLeafRegistryObjectList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeafRegistryObjectList(LeafRegistryObjectListType newLeafRegistryObjectList) {
		if (newLeafRegistryObjectList != leafRegistryObjectList) {
			NotificationChain msgs = null;
			if (leafRegistryObjectList != null)
				msgs = ((InternalEObject)leafRegistryObjectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST, null, msgs);
			if (newLeafRegistryObjectList != null)
				msgs = ((InternalEObject)newLeafRegistryObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST, null, msgs);
			msgs = basicSetLeafRegistryObjectList(newLeafRegistryObjectList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST, newLeafRegistryObjectList, newLeafRegistryObjectList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST:
				return basicSetLeafRegistryObjectList(null, msgs);
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
			case RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST:
				return getLeafRegistryObjectList();
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
			case RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST:
				setLeafRegistryObjectList((LeafRegistryObjectListType)newValue);
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
			case RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST:
				setLeafRegistryObjectList((LeafRegistryObjectListType)null);
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
			case RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST:
				return leafRegistryObjectList != null;
		}
		return super.eIsSet(featureID);
	}

} //SubmitObjectsRequestTypeImpl
