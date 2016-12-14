/**
 * <copyright>
 * </copyright>
 *
 * $Id: UpdateObjectsRequestTypeImpl.java,v 1.1 2006/10/19 20:16:14 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;



import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UpdateObjectsRequestTypeImpl#getRegistryObjectList <em>Registry Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateObjectsRequestTypeImpl extends RegistryRequestTypeImpl implements UpdateObjectsRequestType {
	/**
	 * The cached value of the '{@link #getRegistryObjectList() <em>Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectList()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectListType registryObjectList = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateObjectsRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LCMPackage.Literals.UPDATE_OBJECTS_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getRegistryObjectList() {
		return registryObjectList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectList(RegistryObjectListType newRegistryObjectList, NotificationChain msgs) {
		RegistryObjectListType oldRegistryObjectList = registryObjectList;
		registryObjectList = newRegistryObjectList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST, oldRegistryObjectList, newRegistryObjectList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectList(RegistryObjectListType newRegistryObjectList) {
		if (newRegistryObjectList != registryObjectList) {
			NotificationChain msgs = null;
			if (registryObjectList != null)
				msgs = ((InternalEObject)registryObjectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			if (newRegistryObjectList != null)
				msgs = ((InternalEObject)newRegistryObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			msgs = basicSetRegistryObjectList(newRegistryObjectList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST, newRegistryObjectList, newRegistryObjectList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST:
				return basicSetRegistryObjectList(null, msgs);
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
			case LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST:
				return getRegistryObjectList();
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
			case LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)newValue);
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
			case LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)null);
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
			case LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST:
				return registryObjectList != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateObjectsRequestTypeImpl
