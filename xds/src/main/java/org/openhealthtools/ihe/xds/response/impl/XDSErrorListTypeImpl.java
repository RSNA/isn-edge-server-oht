/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response.impl;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.ihe.xds.response.XDSErrorListType;
import org.openhealthtools.ihe.xds.response.XDSErrorType;
import org.openhealthtools.ihe.xds.response.XDSStatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDS Error List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.impl.XDSErrorListTypeImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.impl.XDSErrorListTypeImpl#getHighestSeverity <em>Highest Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XDSErrorListTypeImpl implements XDSErrorListType 
{
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected List<XDSErrorType> error = new ArrayList<XDSErrorType>();

	/**
	 * The cached value of the '{@link #getHighestSeverity() <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestSeverity()
	 * @generated
	 * @ordered
	 */
	protected XDSStatusType highestSeverity = XDSStatusType.SUCCESS_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * 
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
	public List<XDSErrorType> getError() {
		if (error == null) {
			error = new ArrayList<XDSErrorType>();
			
//			error = new EObjectContainmentEList(XDSErrorType.class, this, ModelPackage.XDS_ERROR_LIST_TYPE__ERROR);
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
//		XDSStatusType oldHighestSeverity = highestSeverity;
		highestSeverity = newHighestSeverity == null ? XDSStatusType.SUCCESS_LITERAL : newHighestSeverity;
//		boolean oldHighestSeverityESet = highestSeverityESet;
//		highestSeverityESet = true;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY, oldHighestSeverity, highestSeverity, !oldHighestSeverityESet));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
//		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (highestSeverity: ");
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public void unsetHighestSeverity() {
//		XDSStatusType oldHighestSeverity = highestSeverity;
//		boolean oldHighestSeverityESet = highestSeverityESet;
//		highestSeverity = HIGHEST_SEVERITY_EDEFAULT;
//		highestSeverityESet = false;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY, oldHighestSeverity, HIGHEST_SEVERITY_EDEFAULT, oldHighestSeverityESet));
//	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public boolean isSetHighestSeverity() {
//		return highestSeverityESet;
//	}

	
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected EClass eStaticClass() {
//		return ModelPackage.Literals.XDS_ERROR_LIST_TYPE;
//	}
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
//		switch (featureID) {
//			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
//				return ((InternalEList)getError()).basicRemove(otherEnd, msgs);
//		}
//		return super.eInverseRemove(otherEnd, featureID, msgs);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public Object eGet(int featureID, boolean resolve, boolean coreType) {
//		switch (featureID) {
//			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
//				return getError();
//			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
//				return getHighestSeverity();
//		}
//		return super.eGet(featureID, resolve, coreType);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void eSet(int featureID, Object newValue) {
//		switch (featureID) {
//			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
//				getError().clear();
//				getError().addAll((Collection)newValue);
//				return;
//			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
//				setHighestSeverity((XDSStatusType)newValue);
//				return;
//		}
//		super.eSet(featureID, newValue);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void eUnset(int featureID) {
//		switch (featureID) {
//			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
//				getError().clear();
//				return;
//			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
//				unsetHighestSeverity();
//				return;
//		}
//		super.eUnset(featureID);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public boolean eIsSet(int featureID) {
//		switch (featureID) {
//			case ModelPackage.XDS_ERROR_LIST_TYPE__ERROR:
//				return error != null && !error.isEmpty();
//			case ModelPackage.XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY:
//				return isSetHighestSeverity();
//		}
//		return super.eIsSet(featureID);
//	}



} //XDSErrorListTypeImpl
