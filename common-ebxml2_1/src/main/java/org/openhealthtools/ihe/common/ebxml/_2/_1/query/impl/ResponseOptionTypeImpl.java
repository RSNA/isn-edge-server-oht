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
 * $Id: ResponseOptionTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Option Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ResponseOptionTypeImpl#isReturnComposedObjects <em>Return Composed Objects</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ResponseOptionTypeImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseOptionTypeImpl extends EObjectImpl implements ResponseOptionType {
	/**
	 * The default value of the '{@link #isReturnComposedObjects() <em>Return Composed Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnComposedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_COMPOSED_OBJECTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnComposedObjects() <em>Return Composed Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnComposedObjects()
	 * @generated
	 * @ordered
	 */
	protected boolean returnComposedObjects = RETURN_COMPOSED_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Return Composed Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnComposedObjectsESet = false;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnTypeType RETURN_TYPE_EDEFAULT = ReturnTypeType.REGISTRY_OBJECT_LITERAL;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected ReturnTypeType returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * This is true if the Return Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnTypeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseOptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.RESPONSE_OPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnComposedObjects() {
		return returnComposedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnComposedObjects(boolean newReturnComposedObjects) {
		boolean oldReturnComposedObjects = returnComposedObjects;
		returnComposedObjects = newReturnComposedObjects;
		boolean oldReturnComposedObjectsESet = returnComposedObjectsESet;
		returnComposedObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS, oldReturnComposedObjects, returnComposedObjects, !oldReturnComposedObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnComposedObjects() {
		boolean oldReturnComposedObjects = returnComposedObjects;
		boolean oldReturnComposedObjectsESet = returnComposedObjectsESet;
		returnComposedObjects = RETURN_COMPOSED_OBJECTS_EDEFAULT;
		returnComposedObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS, oldReturnComposedObjects, RETURN_COMPOSED_OBJECTS_EDEFAULT, oldReturnComposedObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnComposedObjects() {
		return returnComposedObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(ReturnTypeType newReturnType) {
		ReturnTypeType oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		boolean oldReturnTypeESet = returnTypeESet;
		returnTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.RESPONSE_OPTION_TYPE__RETURN_TYPE, oldReturnType, returnType, !oldReturnTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnType() {
		ReturnTypeType oldReturnType = returnType;
		boolean oldReturnTypeESet = returnTypeESet;
		returnType = RETURN_TYPE_EDEFAULT;
		returnTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.RESPONSE_OPTION_TYPE__RETURN_TYPE, oldReturnType, RETURN_TYPE_EDEFAULT, oldReturnTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnType() {
		return returnTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS:
				return isReturnComposedObjects() ? Boolean.TRUE : Boolean.FALSE;
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_TYPE:
				return getReturnType();
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
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS:
				setReturnComposedObjects(((Boolean)newValue).booleanValue());
				return;
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_TYPE:
				setReturnType((ReturnTypeType)newValue);
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
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS:
				unsetReturnComposedObjects();
				return;
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_TYPE:
				unsetReturnType();
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
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS:
				return isSetReturnComposedObjects();
			case QueryPackage.RESPONSE_OPTION_TYPE__RETURN_TYPE:
				return isSetReturnType();
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
		result.append(" (returnComposedObjects: ");
		if (returnComposedObjectsESet) result.append(returnComposedObjects); else result.append("<unset>");
		result.append(", returnType: ");
		if (returnTypeESet) result.append(returnType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResponseOptionTypeImpl
