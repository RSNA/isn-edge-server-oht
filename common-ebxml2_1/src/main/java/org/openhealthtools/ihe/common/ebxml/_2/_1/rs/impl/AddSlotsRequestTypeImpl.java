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
 * $Id: AddSlotsRequestTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;


import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Slots Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.AddSlotsRequestTypeImpl#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.AddSlotsRequestTypeImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddSlotsRequestTypeImpl extends EObjectImpl implements AddSlotsRequestType {
	/**
	 * The cached value of the '{@link #getObjectRef() <em>Object Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRef()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefType objectRef = null;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList slot = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddSlotsRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.ADD_SLOTS_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getObjectRef() {
		return objectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectRef(ObjectRefType newObjectRef, NotificationChain msgs) {
		ObjectRefType oldObjectRef = objectRef;
		objectRef = newObjectRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF, oldObjectRef, newObjectRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRef(ObjectRefType newObjectRef) {
		if (newObjectRef != objectRef) {
			NotificationChain msgs = null;
			if (objectRef != null)
				msgs = ((InternalEObject)objectRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF, null, msgs);
			if (newObjectRef != null)
				msgs = ((InternalEObject)newObjectRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF, null, msgs);
			msgs = basicSetObjectRef(newObjectRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF, newObjectRef, newObjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList(SlotType1.class, this, RegistryPackage.ADD_SLOTS_REQUEST_TYPE__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF:
				return basicSetObjectRef(null, msgs);
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__SLOT:
				return ((InternalEList)getSlot()).basicRemove(otherEnd, msgs);
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
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF:
				return getObjectRef();
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__SLOT:
				return getSlot();
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
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF:
				setObjectRef((ObjectRefType)newValue);
				return;
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection)newValue);
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
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF:
				setObjectRef((ObjectRefType)null);
				return;
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__SLOT:
				getSlot().clear();
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
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__OBJECT_REF:
				return objectRef != null;
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE__SLOT:
				return slot != null && !slot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddSlotsRequestTypeImpl
