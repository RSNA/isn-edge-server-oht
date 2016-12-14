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
 * $Id: RemoveObjectsRequestTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveObjectsRequestTypeImpl#getObjectRefList <em>Object Ref List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveObjectsRequestTypeImpl#getDeletionScope <em>Deletion Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveObjectsRequestTypeImpl extends EObjectImpl implements RemoveObjectsRequestType {
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
	 * The default value of the '{@link #getDeletionScope() <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionScope()
	 * @generated
	 * @ordered
	 */
	protected static final DeletionScopeType DELETION_SCOPE_EDEFAULT = DeletionScopeType.DELETE_ALL_LITERAL;

	/**
	 * The cached value of the '{@link #getDeletionScope() <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionScope()
	 * @generated
	 * @ordered
	 */
	protected DeletionScopeType deletionScope = DELETION_SCOPE_EDEFAULT;

	/**
	 * This is true if the Deletion Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deletionScopeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveObjectsRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REMOVE_OBJECTS_REQUEST_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, oldObjectRefList, newObjectRefList);
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
				msgs = ((InternalEObject)objectRefList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			if (newObjectRefList != null)
				msgs = ((InternalEObject)newObjectRefList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			msgs = basicSetObjectRefList(newObjectRefList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, newObjectRefList, newObjectRefList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionScopeType getDeletionScope() {
		return deletionScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletionScope(DeletionScopeType newDeletionScope) {
		DeletionScopeType oldDeletionScope = deletionScope;
		deletionScope = newDeletionScope == null ? DELETION_SCOPE_EDEFAULT : newDeletionScope;
		boolean oldDeletionScopeESet = deletionScopeESet;
		deletionScopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE, oldDeletionScope, deletionScope, !oldDeletionScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeletionScope() {
		DeletionScopeType oldDeletionScope = deletionScope;
		boolean oldDeletionScopeESet = deletionScopeESet;
		deletionScope = DELETION_SCOPE_EDEFAULT;
		deletionScopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE, oldDeletionScope, DELETION_SCOPE_EDEFAULT, oldDeletionScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeletionScope() {
		return deletionScopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
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
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				return getObjectRefList();
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				return getDeletionScope();
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
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)newValue);
				return;
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				setDeletionScope((DeletionScopeType)newValue);
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
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)null);
				return;
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				unsetDeletionScope();
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
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				return objectRefList != null;
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				return isSetDeletionScope();
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
		result.append(" (deletionScope: ");
		if (deletionScopeESet) result.append(deletionScope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RemoveObjectsRequestTypeImpl
