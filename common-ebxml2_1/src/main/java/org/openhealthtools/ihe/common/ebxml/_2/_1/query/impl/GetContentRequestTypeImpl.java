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
 * $Id: GetContentRequestTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Content Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentRequestTypeImpl#getObjectRefList <em>Object Ref List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetContentRequestTypeImpl extends EObjectImpl implements GetContentRequestType {
	/**
	 * The cached value of the '{@link #getObjectRefList() <em>Object Ref List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRefList()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefListType objectRefList = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetContentRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.GET_CONTENT_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefListType getObjectRefList() {
		return objectRefList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectRefList(ObjectRefListType newObjectRefList, NotificationChain msgs) {
		ObjectRefListType oldObjectRefList = objectRefList;
		objectRefList = newObjectRefList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST, oldObjectRefList, newObjectRefList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRefList(ObjectRefListType newObjectRefList) {
		if (newObjectRefList != objectRefList) {
			NotificationChain msgs = null;
			if (objectRefList != null)
				msgs = ((InternalEObject)objectRefList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			if (newObjectRefList != null)
				msgs = ((InternalEObject)newObjectRefList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			msgs = basicSetObjectRefList(newObjectRefList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST, newObjectRefList, newObjectRefList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST:
				return basicSetObjectRefList(null, msgs);
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
			case QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST:
				return getObjectRefList();
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
			case QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)newValue);
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
			case QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)null);
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
			case QueryPackage.GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST:
				return objectRefList != null;
		}
		return super.eIsSet(featureID);
	}

} //GetContentRequestTypeImpl
