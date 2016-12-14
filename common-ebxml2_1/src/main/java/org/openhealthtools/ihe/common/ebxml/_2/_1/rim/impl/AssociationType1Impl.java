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
 * $Id: AssociationType1Impl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl#isIsConfirmedBySourceOwner <em>Is Confirmed By Source Owner</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl#isIsConfirmedByTargetOwner <em>Is Confirmed By Target Owner</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl#getTargetObject <em>Target Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationType1Impl extends RegistryObjectTypeImpl implements AssociationType1 {
	/**
	 * The default value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected String associationType = ASSOCIATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConfirmedBySourceOwner() <em>Is Confirmed By Source Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfirmedBySourceOwner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONFIRMED_BY_SOURCE_OWNER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConfirmedBySourceOwner() <em>Is Confirmed By Source Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfirmedBySourceOwner()
	 * @generated
	 * @ordered
	 */
	protected boolean isConfirmedBySourceOwner = IS_CONFIRMED_BY_SOURCE_OWNER_EDEFAULT;

	/**
	 * This is true if the Is Confirmed By Source Owner attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConfirmedBySourceOwnerESet = false;

	/**
	 * The default value of the '{@link #isIsConfirmedByTargetOwner() <em>Is Confirmed By Target Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfirmedByTargetOwner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONFIRMED_BY_TARGET_OWNER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConfirmedByTargetOwner() <em>Is Confirmed By Target Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfirmedByTargetOwner()
	 * @generated
	 * @ordered
	 */
	protected boolean isConfirmedByTargetOwner = IS_CONFIRMED_BY_TARGET_OWNER_EDEFAULT;

	/**
	 * This is true if the Is Confirmed By Target Owner attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConfirmedByTargetOwnerESet = false;

	/**
	 * The default value of the '{@link #getSourceObject() <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected String sourceObject = SOURCE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetObject() <em>Target Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObject()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetObject() <em>Target Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObject()
	 * @generated
	 * @ordered
	 */
	protected String targetObject = TARGET_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.ASSOCIATION_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociationType() {
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationType(String newAssociationType) {
		String oldAssociationType = associationType;
		associationType = newAssociationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.ASSOCIATION_TYPE1__ASSOCIATION_TYPE, oldAssociationType, associationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConfirmedBySourceOwner() {
		return isConfirmedBySourceOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConfirmedBySourceOwner(boolean newIsConfirmedBySourceOwner) {
		boolean oldIsConfirmedBySourceOwner = isConfirmedBySourceOwner;
		isConfirmedBySourceOwner = newIsConfirmedBySourceOwner;
		boolean oldIsConfirmedBySourceOwnerESet = isConfirmedBySourceOwnerESet;
		isConfirmedBySourceOwnerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER, oldIsConfirmedBySourceOwner, isConfirmedBySourceOwner, !oldIsConfirmedBySourceOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConfirmedBySourceOwner() {
		boolean oldIsConfirmedBySourceOwner = isConfirmedBySourceOwner;
		boolean oldIsConfirmedBySourceOwnerESet = isConfirmedBySourceOwnerESet;
		isConfirmedBySourceOwner = IS_CONFIRMED_BY_SOURCE_OWNER_EDEFAULT;
		isConfirmedBySourceOwnerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER, oldIsConfirmedBySourceOwner, IS_CONFIRMED_BY_SOURCE_OWNER_EDEFAULT, oldIsConfirmedBySourceOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConfirmedBySourceOwner() {
		return isConfirmedBySourceOwnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConfirmedByTargetOwner() {
		return isConfirmedByTargetOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConfirmedByTargetOwner(boolean newIsConfirmedByTargetOwner) {
		boolean oldIsConfirmedByTargetOwner = isConfirmedByTargetOwner;
		isConfirmedByTargetOwner = newIsConfirmedByTargetOwner;
		boolean oldIsConfirmedByTargetOwnerESet = isConfirmedByTargetOwnerESet;
		isConfirmedByTargetOwnerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER, oldIsConfirmedByTargetOwner, isConfirmedByTargetOwner, !oldIsConfirmedByTargetOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConfirmedByTargetOwner() {
		boolean oldIsConfirmedByTargetOwner = isConfirmedByTargetOwner;
		boolean oldIsConfirmedByTargetOwnerESet = isConfirmedByTargetOwnerESet;
		isConfirmedByTargetOwner = IS_CONFIRMED_BY_TARGET_OWNER_EDEFAULT;
		isConfirmedByTargetOwnerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER, oldIsConfirmedByTargetOwner, IS_CONFIRMED_BY_TARGET_OWNER_EDEFAULT, oldIsConfirmedByTargetOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConfirmedByTargetOwner() {
		return isConfirmedByTargetOwnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceObject() {
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceObject(String newSourceObject) {
		String oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.ASSOCIATION_TYPE1__SOURCE_OBJECT, oldSourceObject, sourceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetObject() {
		return targetObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetObject(String newTargetObject) {
		String oldTargetObject = targetObject;
		targetObject = newTargetObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.ASSOCIATION_TYPE1__TARGET_OBJECT, oldTargetObject, targetObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.ASSOCIATION_TYPE1__ASSOCIATION_TYPE:
				return getAssociationType();
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER:
				return isIsConfirmedBySourceOwner() ? Boolean.TRUE : Boolean.FALSE;
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER:
				return isIsConfirmedByTargetOwner() ? Boolean.TRUE : Boolean.FALSE;
			case RimPackage.ASSOCIATION_TYPE1__SOURCE_OBJECT:
				return getSourceObject();
			case RimPackage.ASSOCIATION_TYPE1__TARGET_OBJECT:
				return getTargetObject();
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
			case RimPackage.ASSOCIATION_TYPE1__ASSOCIATION_TYPE:
				setAssociationType((String)newValue);
				return;
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER:
				setIsConfirmedBySourceOwner(((Boolean)newValue).booleanValue());
				return;
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER:
				setIsConfirmedByTargetOwner(((Boolean)newValue).booleanValue());
				return;
			case RimPackage.ASSOCIATION_TYPE1__SOURCE_OBJECT:
				setSourceObject((String)newValue);
				return;
			case RimPackage.ASSOCIATION_TYPE1__TARGET_OBJECT:
				setTargetObject((String)newValue);
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
			case RimPackage.ASSOCIATION_TYPE1__ASSOCIATION_TYPE:
				setAssociationType(ASSOCIATION_TYPE_EDEFAULT);
				return;
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER:
				unsetIsConfirmedBySourceOwner();
				return;
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER:
				unsetIsConfirmedByTargetOwner();
				return;
			case RimPackage.ASSOCIATION_TYPE1__SOURCE_OBJECT:
				setSourceObject(SOURCE_OBJECT_EDEFAULT);
				return;
			case RimPackage.ASSOCIATION_TYPE1__TARGET_OBJECT:
				setTargetObject(TARGET_OBJECT_EDEFAULT);
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
			case RimPackage.ASSOCIATION_TYPE1__ASSOCIATION_TYPE:
				return ASSOCIATION_TYPE_EDEFAULT == null ? associationType != null : !ASSOCIATION_TYPE_EDEFAULT.equals(associationType);
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER:
				return isSetIsConfirmedBySourceOwner();
			case RimPackage.ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER:
				return isSetIsConfirmedByTargetOwner();
			case RimPackage.ASSOCIATION_TYPE1__SOURCE_OBJECT:
				return SOURCE_OBJECT_EDEFAULT == null ? sourceObject != null : !SOURCE_OBJECT_EDEFAULT.equals(sourceObject);
			case RimPackage.ASSOCIATION_TYPE1__TARGET_OBJECT:
				return TARGET_OBJECT_EDEFAULT == null ? targetObject != null : !TARGET_OBJECT_EDEFAULT.equals(targetObject);
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
		result.append(" (associationType: ");
		result.append(associationType);
		result.append(", isConfirmedBySourceOwner: ");
		if (isConfirmedBySourceOwnerESet) result.append(isConfirmedBySourceOwner); else result.append("<unset>");
		result.append(", isConfirmedByTargetOwner: ");
		if (isConfirmedByTargetOwnerESet) result.append(isConfirmedByTargetOwner); else result.append("<unset>");
		result.append(", sourceObject: ");
		result.append(sourceObject);
		result.append(", targetObject: ");
		result.append(targetObject);
		result.append(')');
		return result.toString();
	}

} //AssociationType1Impl
