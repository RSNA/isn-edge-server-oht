/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubscriptionTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl#getNotificationInterval <em>Notification Interval</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl#getStartTime <em>Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubscriptionTypeImpl extends RegistryObjectTypeImpl implements SubscriptionType {
	/**
	 * The cached value of the '{@link #getActionGroup() <em>Action Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap actionGroup = null;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Object endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationInterval() <em>Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Object NOTIFICATION_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationInterval() <em>Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationInterval()
	 * @generated
	 * @ordered
	 */
	protected Object notificationInterval = NOTIFICATION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected String selector = SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Object startTime = START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.SUBSCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActionGroup() {
		if (actionGroup == null) {
			actionGroup = new BasicFeatureMap(this, RimPackage.SUBSCRIPTION_TYPE__ACTION_GROUP);
		}
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAction() {
		return ((FeatureMap)getActionGroup()).list(RimPackage.Literals.SUBSCRIPTION_TYPE__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Object newEndTime) {
		Object oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SUBSCRIPTION_TYPE__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNotificationInterval() {
		return notificationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationInterval(Object newNotificationInterval) {
		Object oldNotificationInterval = notificationInterval;
		notificationInterval = newNotificationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL, oldNotificationInterval, notificationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		String oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SUBSCRIPTION_TYPE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Object newStartTime) {
		Object oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SUBSCRIPTION_TYPE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.SUBSCRIPTION_TYPE__ACTION_GROUP:
				return ((InternalEList)getActionGroup()).basicRemove(otherEnd, msgs);
			case RimPackage.SUBSCRIPTION_TYPE__ACTION:
				return ((InternalEList)getAction()).basicRemove(otherEnd, msgs);
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
			case RimPackage.SUBSCRIPTION_TYPE__ACTION_GROUP:
				if (coreType) return getActionGroup();
				return ((FeatureMap.Internal)getActionGroup()).getWrapper();
			case RimPackage.SUBSCRIPTION_TYPE__ACTION:
				return getAction();
			case RimPackage.SUBSCRIPTION_TYPE__END_TIME:
				return getEndTime();
			case RimPackage.SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL:
				return getNotificationInterval();
			case RimPackage.SUBSCRIPTION_TYPE__SELECTOR:
				return getSelector();
			case RimPackage.SUBSCRIPTION_TYPE__START_TIME:
				return getStartTime();
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
			case RimPackage.SUBSCRIPTION_TYPE__ACTION_GROUP:
				((FeatureMap.Internal)getActionGroup()).set(newValue);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection)newValue);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__END_TIME:
				setEndTime((Object)newValue);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL:
				setNotificationInterval((Object)newValue);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__SELECTOR:
				setSelector((String)newValue);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__START_TIME:
				setStartTime((Object)newValue);
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
			case RimPackage.SUBSCRIPTION_TYPE__ACTION_GROUP:
				getActionGroup().clear();
				return;
			case RimPackage.SUBSCRIPTION_TYPE__ACTION:
				getAction().clear();
				return;
			case RimPackage.SUBSCRIPTION_TYPE__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL:
				setNotificationInterval(NOTIFICATION_INTERVAL_EDEFAULT);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case RimPackage.SUBSCRIPTION_TYPE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
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
			case RimPackage.SUBSCRIPTION_TYPE__ACTION_GROUP:
				return actionGroup != null && !actionGroup.isEmpty();
			case RimPackage.SUBSCRIPTION_TYPE__ACTION:
				return !getAction().isEmpty();
			case RimPackage.SUBSCRIPTION_TYPE__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case RimPackage.SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL:
				return NOTIFICATION_INTERVAL_EDEFAULT == null ? notificationInterval != null : !NOTIFICATION_INTERVAL_EDEFAULT.equals(notificationInterval);
			case RimPackage.SUBSCRIPTION_TYPE__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case RimPackage.SUBSCRIPTION_TYPE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
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
		result.append(" (actionGroup: ");
		result.append(actionGroup);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", notificationInterval: ");
		result.append(notificationInterval);
		result.append(", selector: ");
		result.append(selector);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(')');
		return result.toString();
	}

} //SubscriptionTypeImpl
