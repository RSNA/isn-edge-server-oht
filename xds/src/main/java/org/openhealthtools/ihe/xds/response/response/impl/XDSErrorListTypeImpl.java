/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

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

import org.openhealthtools.ihe.xds.response.response.ModelPackage;
import org.openhealthtools.ihe.xds.response.response.XDSErrorListType;
import org.openhealthtools.ihe.xds.response.response.XDSErrorType;
import org.openhealthtools.ihe.xds.response.response.XDSStatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDS Error List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorListTypeImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorListTypeImpl#getHighestSeverity <em>Highest Severity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XDSErrorListTypeImpl extends EObjectImpl implements XDSErrorListType {
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList error;

	/**
	 * The default value of the '{@link #getHighestSeverity() <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final XDSStatusType HIGHEST_SEVERITY_EDEFAULT = XDSStatusType.SUCCESS_LITERAL;

	/**
	 * The cached value of the '{@link #getHighestSeverity() <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestSeverity()
	 * @generated
	 * @ordered
	 */
	protected XDSStatusType highestSeverity = HIGHEST_SEVERITY_EDEFAULT;

	/**
	 * This is true if the Highest Severity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highestSeverityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XDS_ERROR_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getError() {
		if (error == null) {
			error = new EObjectContainmentEList(XDSErrorType.class, this, ModelPackage.XDS_ERROR_LIST_TYPE__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSStatusType getHighestSeverity() {
		return highestSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighestSeverity(XDSStatusType newHighestSeverity) {
		XDSStatusType oldHighestSeverity = highestSeverity;
		highestSeverity = newHighestSeverity == null ? HIGHEST_SEVERITY_EDEFAULT : newHighestSeverity;
		boolean oldHighestSeverityESet = highestSeverityESet;
		highestSeverityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY, oldHighestSeverity, highestSeverity, !oldHighestSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHighestSeverity() {
		XDSStatusType oldHighestSeverity = highestSeverity;
		boolean oldHighestSeverityESet = highestSeverityESet;
		highestSeverity = HIGHEST_SEVERITY_EDEFAULT;
		highestSeverityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY, oldHighestSeverity, HIGHEST_SEVERITY_EDEFAULT, oldHighestSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHighestSeverity() {
		return highestSeverityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
				return ((InternalEList)getError()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
				return getError();
			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
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
			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
				getError().clear();
				getError().addAll((Collection)newValue);
				return;
			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
				setHighestSeverity((XDSStatusType)newValue);
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
			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
				getError().clear();
				return;
			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
				unsetHighestSeverity();
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
			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
				return error != null && !error.isEmpty();
			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
				return isSetHighestSeverity();
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
		if (highestSeverityESet) result.append(highestSeverity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XDSErrorListTypeImpl
