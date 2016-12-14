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
 * $Id: ExternalIdentifierTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalIdentifierTypeImpl#getIdentificationScheme <em>Identification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalIdentifierTypeImpl#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalIdentifierTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalIdentifierTypeImpl extends RegistryObjectTypeImpl implements ExternalIdentifierType {
	/**
	 * The default value of the '{@link #getIdentificationScheme() <em>Identification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificationScheme() <em>Identification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationScheme()
	 * @generated
	 * @ordered
	 */
	protected String identificationScheme = IDENTIFICATION_SCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistryObject() <em>Registry Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObject()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryObject() <em>Registry Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObject()
	 * @generated
	 * @ordered
	 */
	protected String registryObject = REGISTRY_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalIdentifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.EXTERNAL_IDENTIFIER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentificationScheme() {
		return identificationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationScheme(String newIdentificationScheme) {
		String oldIdentificationScheme = identificationScheme;
		identificationScheme = newIdentificationScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME, oldIdentificationScheme, identificationScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistryObject() {
		return registryObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObject(String newRegistryObject) {
		String oldRegistryObject = registryObject;
		registryObject = newRegistryObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT, oldRegistryObject, registryObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.EXTERNAL_IDENTIFIER_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME:
				return getIdentificationScheme();
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT:
				return getRegistryObject();
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__VALUE:
				return getValue();
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
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME:
				setIdentificationScheme((String)newValue);
				return;
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT:
				setRegistryObject((String)newValue);
				return;
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__VALUE:
				setValue((String)newValue);
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
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME:
				setIdentificationScheme(IDENTIFICATION_SCHEME_EDEFAULT);
				return;
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT:
				setRegistryObject(REGISTRY_OBJECT_EDEFAULT);
				return;
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME:
				return IDENTIFICATION_SCHEME_EDEFAULT == null ? identificationScheme != null : !IDENTIFICATION_SCHEME_EDEFAULT.equals(identificationScheme);
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT:
				return REGISTRY_OBJECT_EDEFAULT == null ? registryObject != null : !REGISTRY_OBJECT_EDEFAULT.equals(registryObject);
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (identificationScheme: ");
		result.append(identificationScheme);
		result.append(", registryObject: ");
		result.append(registryObject);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ExternalIdentifierTypeImpl
