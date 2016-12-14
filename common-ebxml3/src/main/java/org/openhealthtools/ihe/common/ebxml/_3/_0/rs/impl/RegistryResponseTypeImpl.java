/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryResponseTypeImpl.java,v 1.1 2006/10/19 20:16:13 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl#getResponseSlotList <em>Response Slot List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryResponseTypeImpl extends EObjectImpl implements RegistryResponseType {
	/**
	 * The cached value of the '{@link #getResponseSlotList() <em>Response Slot List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseSlotList()
	 * @generated
	 * @ordered
	 */
	protected SlotListType responseSlotList = null;

	/**
	 * The cached value of the '{@link #getRegistryErrorList() <em>Registry Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryErrorList()
	 * @generated
	 * @ordered
	 */
	protected RegistryErrorListType registryErrorList = null;

	/**
	 * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected String requestId = REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REGISTRY_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotListType getResponseSlotList() {
		return responseSlotList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseSlotList(SlotListType newResponseSlotList, NotificationChain msgs) {
		SlotListType oldResponseSlotList = responseSlotList;
		responseSlotList = newResponseSlotList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST, oldResponseSlotList, newResponseSlotList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseSlotList(SlotListType newResponseSlotList) {
		if (newResponseSlotList != responseSlotList) {
			NotificationChain msgs = null;
			if (responseSlotList != null)
				msgs = ((InternalEObject)responseSlotList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST, null, msgs);
			if (newResponseSlotList != null)
				msgs = ((InternalEObject)newResponseSlotList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST, null, msgs);
			msgs = basicSetResponseSlotList(newResponseSlotList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST, newResponseSlotList, newResponseSlotList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorListType getRegistryErrorList() {
		return registryErrorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryErrorList(RegistryErrorListType newRegistryErrorList, NotificationChain msgs) {
		RegistryErrorListType oldRegistryErrorList = registryErrorList;
		registryErrorList = newRegistryErrorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, oldRegistryErrorList, newRegistryErrorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryErrorList(RegistryErrorListType newRegistryErrorList) {
		if (newRegistryErrorList != registryErrorList) {
			NotificationChain msgs = null;
			if (registryErrorList != null)
				msgs = ((InternalEObject)registryErrorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, null, msgs);
			if (newRegistryErrorList != null)
				msgs = ((InternalEObject)newRegistryErrorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, null, msgs);
			msgs = basicSetRegistryErrorList(newRegistryErrorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, newRegistryErrorList, newRegistryErrorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(String newRequestId) {
		String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST:
				return basicSetResponseSlotList(null, msgs);
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				return basicSetRegistryErrorList(null, msgs);
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST:
				return getResponseSlotList();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				return getRegistryErrorList();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REQUEST_ID:
				return getRequestId();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				return getStatus();
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST:
				setResponseSlotList((SlotListType)newValue);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)newValue);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REQUEST_ID:
				setRequestId((String)newValue);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				setStatus((String)newValue);
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST:
				setResponseSlotList((SlotListType)null);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)null);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST:
				return responseSlotList != null;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				return registryErrorList != null;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (requestId: ");
		result.append(requestId);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RegistryResponseTypeImpl
