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
 * $Id: RegistryProfileTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryProfileTypeImpl#getOptionalFeaturesSupported <em>Optional Features Supported</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryProfileTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryProfileTypeImpl extends EObjectImpl implements RegistryProfileType {
	/**
	 * The cached value of the '{@link #getOptionalFeaturesSupported() <em>Optional Features Supported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalFeaturesSupported()
	 * @generated
	 * @ordered
	 */
	protected OptionalFeaturesSupportedType optionalFeaturesSupported = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REGISTRY_PROFILE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalFeaturesSupportedType getOptionalFeaturesSupported() {
		return optionalFeaturesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalFeaturesSupported(OptionalFeaturesSupportedType newOptionalFeaturesSupported, NotificationChain msgs) {
		OptionalFeaturesSupportedType oldOptionalFeaturesSupported = optionalFeaturesSupported;
		optionalFeaturesSupported = newOptionalFeaturesSupported;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED, oldOptionalFeaturesSupported, newOptionalFeaturesSupported);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalFeaturesSupported(OptionalFeaturesSupportedType newOptionalFeaturesSupported) {
		if (newOptionalFeaturesSupported != optionalFeaturesSupported) {
			NotificationChain msgs = null;
			if (optionalFeaturesSupported != null)
				msgs = ((InternalEObject)optionalFeaturesSupported).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED, null, msgs);
			if (newOptionalFeaturesSupported != null)
				msgs = ((InternalEObject)newOptionalFeaturesSupported).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED, null, msgs);
			msgs = basicSetOptionalFeaturesSupported(newOptionalFeaturesSupported, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED, newOptionalFeaturesSupported, newOptionalFeaturesSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_PROFILE_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED:
				return basicSetOptionalFeaturesSupported(null, msgs);
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
			case RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED:
				return getOptionalFeaturesSupported();
			case RegistryPackage.REGISTRY_PROFILE_TYPE__VERSION:
				return getVersion();
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
			case RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED:
				setOptionalFeaturesSupported((OptionalFeaturesSupportedType)newValue);
				return;
			case RegistryPackage.REGISTRY_PROFILE_TYPE__VERSION:
				setVersion((String)newValue);
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
			case RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED:
				setOptionalFeaturesSupported((OptionalFeaturesSupportedType)null);
				return;
			case RegistryPackage.REGISTRY_PROFILE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case RegistryPackage.REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED:
				return optionalFeaturesSupported != null;
			case RegistryPackage.REGISTRY_PROFILE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //RegistryProfileTypeImpl
