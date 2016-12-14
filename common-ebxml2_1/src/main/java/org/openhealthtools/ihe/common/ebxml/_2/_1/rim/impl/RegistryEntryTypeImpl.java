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
 * $Id: RegistryEntryTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl#getExpiration <em>Expiration</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl#getStability <em>Stability</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl#getUserVersion <em>User Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryEntryTypeImpl extends RegistryObjectTypeImpl implements RegistryEntryType {
	/**
	 * The default value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected Object expiration = EXPIRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAJOR_VERSION_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger majorVersion = MAJOR_VERSION_EDEFAULT;

	/**
	 * This is true if the Major Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean majorVersionESet = false;

	/**
	 * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINOR_VERSION_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minorVersion = MINOR_VERSION_EDEFAULT;

	/**
	 * This is true if the Minor Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minorVersionESet = false;

	/**
	 * The default value of the '{@link #getStability() <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStability()
	 * @generated
	 * @ordered
	 */
	protected static final StabilityType STABILITY_EDEFAULT = StabilityType.DYNAMIC_LITERAL;

	/**
	 * The cached value of the '{@link #getStability() <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStability()
	 * @generated
	 * @ordered
	 */
	protected StabilityType stability = STABILITY_EDEFAULT;

	/**
	 * This is true if the Stability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stabilityESet = false;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.SUBMITTED_LITERAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet = false;

	/**
	 * The default value of the '{@link #getUserVersion() <em>User Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserVersion() <em>User Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserVersion()
	 * @generated
	 * @ordered
	 */
	protected String userVersion = USER_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.REGISTRY_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExpiration() {
		return expiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiration(Object newExpiration) {
		Object oldExpiration = expiration;
		expiration = newExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_ENTRY_TYPE__EXPIRATION, oldExpiration, expiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMajorVersion() {
		return majorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorVersion(BigInteger newMajorVersion) {
		BigInteger oldMajorVersion = majorVersion;
		majorVersion = newMajorVersion;
		boolean oldMajorVersionESet = majorVersionESet;
		majorVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_ENTRY_TYPE__MAJOR_VERSION, oldMajorVersion, majorVersion, !oldMajorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMajorVersion() {
		BigInteger oldMajorVersion = majorVersion;
		boolean oldMajorVersionESet = majorVersionESet;
		majorVersion = MAJOR_VERSION_EDEFAULT;
		majorVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.REGISTRY_ENTRY_TYPE__MAJOR_VERSION, oldMajorVersion, MAJOR_VERSION_EDEFAULT, oldMajorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMajorVersion() {
		return majorVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinorVersion() {
		return minorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorVersion(BigInteger newMinorVersion) {
		BigInteger oldMinorVersion = minorVersion;
		minorVersion = newMinorVersion;
		boolean oldMinorVersionESet = minorVersionESet;
		minorVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_ENTRY_TYPE__MINOR_VERSION, oldMinorVersion, minorVersion, !oldMinorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinorVersion() {
		BigInteger oldMinorVersion = minorVersion;
		boolean oldMinorVersionESet = minorVersionESet;
		minorVersion = MINOR_VERSION_EDEFAULT;
		minorVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.REGISTRY_ENTRY_TYPE__MINOR_VERSION, oldMinorVersion, MINOR_VERSION_EDEFAULT, oldMinorVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinorVersion() {
		return minorVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StabilityType getStability() {
		return stability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStability(StabilityType newStability) {
		StabilityType oldStability = stability;
		stability = newStability == null ? STABILITY_EDEFAULT : newStability;
		boolean oldStabilityESet = stabilityESet;
		stabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_ENTRY_TYPE__STABILITY, oldStability, stability, !oldStabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStability() {
		StabilityType oldStability = stability;
		boolean oldStabilityESet = stabilityESet;
		stability = STABILITY_EDEFAULT;
		stabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.REGISTRY_ENTRY_TYPE__STABILITY, oldStability, STABILITY_EDEFAULT, oldStabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStability() {
		return stabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_ENTRY_TYPE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		StatusType oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.REGISTRY_ENTRY_TYPE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserVersion() {
		return userVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserVersion(String newUserVersion) {
		String oldUserVersion = userVersion;
		userVersion = newUserVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_ENTRY_TYPE__USER_VERSION, oldUserVersion, userVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.REGISTRY_ENTRY_TYPE__EXPIRATION:
				return getExpiration();
			case RimPackage.REGISTRY_ENTRY_TYPE__MAJOR_VERSION:
				return getMajorVersion();
			case RimPackage.REGISTRY_ENTRY_TYPE__MINOR_VERSION:
				return getMinorVersion();
			case RimPackage.REGISTRY_ENTRY_TYPE__STABILITY:
				return getStability();
			case RimPackage.REGISTRY_ENTRY_TYPE__STATUS:
				return getStatus();
			case RimPackage.REGISTRY_ENTRY_TYPE__USER_VERSION:
				return getUserVersion();
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
			case RimPackage.REGISTRY_ENTRY_TYPE__EXPIRATION:
				setExpiration((Object)newValue);
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__MAJOR_VERSION:
				setMajorVersion((BigInteger)newValue);
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__MINOR_VERSION:
				setMinorVersion((BigInteger)newValue);
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__STABILITY:
				setStability((StabilityType)newValue);
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__STATUS:
				setStatus((StatusType)newValue);
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__USER_VERSION:
				setUserVersion((String)newValue);
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
			case RimPackage.REGISTRY_ENTRY_TYPE__EXPIRATION:
				setExpiration(EXPIRATION_EDEFAULT);
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__MAJOR_VERSION:
				unsetMajorVersion();
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__MINOR_VERSION:
				unsetMinorVersion();
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__STABILITY:
				unsetStability();
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__STATUS:
				unsetStatus();
				return;
			case RimPackage.REGISTRY_ENTRY_TYPE__USER_VERSION:
				setUserVersion(USER_VERSION_EDEFAULT);
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
			case RimPackage.REGISTRY_ENTRY_TYPE__EXPIRATION:
				return EXPIRATION_EDEFAULT == null ? expiration != null : !EXPIRATION_EDEFAULT.equals(expiration);
			case RimPackage.REGISTRY_ENTRY_TYPE__MAJOR_VERSION:
				return isSetMajorVersion();
			case RimPackage.REGISTRY_ENTRY_TYPE__MINOR_VERSION:
				return isSetMinorVersion();
			case RimPackage.REGISTRY_ENTRY_TYPE__STABILITY:
				return isSetStability();
			case RimPackage.REGISTRY_ENTRY_TYPE__STATUS:
				return isSetStatus();
			case RimPackage.REGISTRY_ENTRY_TYPE__USER_VERSION:
				return USER_VERSION_EDEFAULT == null ? userVersion != null : !USER_VERSION_EDEFAULT.equals(userVersion);
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
		result.append(" (expiration: ");
		result.append(expiration);
		result.append(", majorVersion: ");
		if (majorVersionESet) result.append(majorVersion); else result.append("<unset>");
		result.append(", minorVersion: ");
		if (minorVersionESet) result.append(minorVersion); else result.append("<unset>");
		result.append(", stability: ");
		if (stabilityESet) result.append(stability); else result.append("<unset>");
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", userVersion: ");
		result.append(userVersion);
		result.append(')');
		return result.toString();
	}

} //RegistryEntryTypeImpl
