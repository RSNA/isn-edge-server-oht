/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryErrorListTypeImpl.java,v 1.1 2006/10/19 20:16:12 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs.impl;

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

import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorListTypeImpl#getRegistryError <em>Registry Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorListTypeImpl#getHighestSeverity <em>Highest Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryErrorListTypeImpl extends EObjectImpl implements RegistryErrorListType {
	/**
	 * The cached value of the '{@link #getRegistryError() <em>Registry Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryError()
	 * @generated
	 * @ordered
	 */
	protected EList registryError = null;

	/**
	 * The default value of the '{@link #getHighestSeverity() <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGHEST_SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighestSeverity() <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestSeverity()
	 * @generated
	 * @ordered
	 */
	protected String highestSeverity = HIGHEST_SEVERITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryErrorListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REGISTRY_ERROR_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryError() {
		if (registryError == null) {
			registryError = new EObjectContainmentEList(RegistryErrorType.class, this, RegistryPackage.REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR);
		}
		return registryError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHighestSeverity() {
		return highestSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighestSeverity(String newHighestSeverity) {
		String oldHighestSeverity = highestSeverity;
		highestSeverity = newHighestSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY, oldHighestSeverity, highestSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR:
				return ((InternalEList)getRegistryError()).basicRemove(otherEnd, msgs);
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
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR:
				return getRegistryError();
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
				return getHighestSeverity();
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
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR:
				getRegistryError().clear();
				getRegistryError().addAll((Collection)newValue);
				return;
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
				setHighestSeverity((String)newValue);
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
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR:
				getRegistryError().clear();
				return;
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
				setHighestSeverity(HIGHEST_SEVERITY_EDEFAULT);
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
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR:
				return registryError != null && !registryError.isEmpty();
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
				return HIGHEST_SEVERITY_EDEFAULT == null ? highestSeverity != null : !HIGHEST_SEVERITY_EDEFAULT.equals(highestSeverity);
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
		result.append(" (highestSeverity: ");
		result.append(highestSeverity);
		result.append(')');
		return result.toString();
	}

} //RegistryErrorListTypeImpl
