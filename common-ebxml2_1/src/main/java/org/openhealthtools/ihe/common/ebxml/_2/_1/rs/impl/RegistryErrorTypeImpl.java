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
 * $Id: RegistryErrorTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl#getCodeContext <em>Code Context</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryErrorTypeImpl extends EObjectImpl implements RegistryErrorType {
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
	 * The default value of the '{@link #getCodeContext() <em>Code Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeContext() <em>Code Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeContext()
	 * @generated
	 * @ordered
	 */
	protected String codeContext = CODE_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected String errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorType SEVERITY_EDEFAULT = ErrorType.ERROR_LITERAL;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected ErrorType severity = SEVERITY_EDEFAULT;

	/**
	 * This is true if the Severity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean severityESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REGISTRY_ERROR_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_ERROR_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeContext() {
		return codeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeContext(String newCodeContext) {
		String oldCodeContext = codeContext;
		codeContext = newCodeContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_ERROR_TYPE__CODE_CONTEXT, oldCodeContext, codeContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(String newErrorCode) {
		String oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_ERROR_TYPE__ERROR_CODE, oldErrorCode, errorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_ERROR_TYPE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(ErrorType newSeverity) {
		ErrorType oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		boolean oldSeverityESet = severityESet;
		severityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_ERROR_TYPE__SEVERITY, oldSeverity, severity, !oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeverity() {
		ErrorType oldSeverity = severity;
		boolean oldSeverityESet = severityESet;
		severity = SEVERITY_EDEFAULT;
		severityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RegistryPackage.REGISTRY_ERROR_TYPE__SEVERITY, oldSeverity, SEVERITY_EDEFAULT, oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeverity() {
		return severityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistryPackage.REGISTRY_ERROR_TYPE__VALUE:
				return getValue();
			case RegistryPackage.REGISTRY_ERROR_TYPE__CODE_CONTEXT:
				return getCodeContext();
			case RegistryPackage.REGISTRY_ERROR_TYPE__ERROR_CODE:
				return getErrorCode();
			case RegistryPackage.REGISTRY_ERROR_TYPE__LOCATION:
				return getLocation();
			case RegistryPackage.REGISTRY_ERROR_TYPE__SEVERITY:
				return getSeverity();
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
			case RegistryPackage.REGISTRY_ERROR_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__CODE_CONTEXT:
				setCodeContext((String)newValue);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__ERROR_CODE:
				setErrorCode((String)newValue);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__LOCATION:
				setLocation((String)newValue);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__SEVERITY:
				setSeverity((ErrorType)newValue);
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
			case RegistryPackage.REGISTRY_ERROR_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__CODE_CONTEXT:
				setCodeContext(CODE_CONTEXT_EDEFAULT);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case RegistryPackage.REGISTRY_ERROR_TYPE__SEVERITY:
				unsetSeverity();
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
			case RegistryPackage.REGISTRY_ERROR_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case RegistryPackage.REGISTRY_ERROR_TYPE__CODE_CONTEXT:
				return CODE_CONTEXT_EDEFAULT == null ? codeContext != null : !CODE_CONTEXT_EDEFAULT.equals(codeContext);
			case RegistryPackage.REGISTRY_ERROR_TYPE__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case RegistryPackage.REGISTRY_ERROR_TYPE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case RegistryPackage.REGISTRY_ERROR_TYPE__SEVERITY:
				return isSetSeverity();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", codeContext: ");
		result.append(codeContext);
		result.append(", errorCode: ");
		result.append(errorCode);
		result.append(", location: ");
		result.append(location);
		result.append(", severity: ");
		if (severityESet) result.append(severity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegistryErrorTypeImpl
