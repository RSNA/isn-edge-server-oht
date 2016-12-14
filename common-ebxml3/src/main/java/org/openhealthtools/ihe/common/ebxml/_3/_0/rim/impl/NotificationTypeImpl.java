/**
 * <copyright>
 * </copyright>
 *
 * $Id: NotificationTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotificationTypeImpl#getRegistryObjectList <em>Registry Object List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotificationTypeImpl#getSubscription <em>Subscription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationTypeImpl extends RegistryObjectTypeImpl implements NotificationType {
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
	 * The default value of the '{@link #getSubscription() <em>Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected String subscription = SUBSCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.NOTIFICATION_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST, oldRegistryObjectList, newRegistryObjectList);
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
				msgs = ((InternalEObject)registryObjectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			if (newRegistryObjectList != null)
				msgs = ((InternalEObject)newRegistryObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			msgs = basicSetRegistryObjectList(newRegistryObjectList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST, newRegistryObjectList, newRegistryObjectList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscription() {
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription(String newSubscription) {
		String oldSubscription = subscription;
		subscription = newSubscription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.NOTIFICATION_TYPE__SUBSCRIPTION, oldSubscription, subscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST:
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
			case RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST:
				return getRegistryObjectList();
			case RimPackage.NOTIFICATION_TYPE__SUBSCRIPTION:
				return getSubscription();
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
			case RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)newValue);
				return;
			case RimPackage.NOTIFICATION_TYPE__SUBSCRIPTION:
				setSubscription((String)newValue);
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
			case RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)null);
				return;
			case RimPackage.NOTIFICATION_TYPE__SUBSCRIPTION:
				setSubscription(SUBSCRIPTION_EDEFAULT);
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
			case RimPackage.NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST:
				return registryObjectList != null;
			case RimPackage.NOTIFICATION_TYPE__SUBSCRIPTION:
				return SUBSCRIPTION_EDEFAULT == null ? subscription != null : !SUBSCRIPTION_EDEFAULT.equals(subscription);
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
		result.append(" (subscription: ");
		result.append(subscription);
		result.append(')');
		return result.toString();
	}

} //NotificationTypeImpl
