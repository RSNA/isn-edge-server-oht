/**
 * <copyright>
 * </copyright>
 *
 * $Id: NotifyActionTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notify Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotifyActionTypeImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotifyActionTypeImpl#getNotificationOption <em>Notification Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotifyActionTypeImpl extends ActionTypeImpl implements NotifyActionType {
	/**
	 * The default value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String END_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected String endPoint = END_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationOption() <em>Notification Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationOption()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_OPTION_EDEFAULT = "urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs";

	/**
	 * The cached value of the '{@link #getNotificationOption() <em>Notification Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationOption()
	 * @generated
	 * @ordered
	 */
	protected String notificationOption = NOTIFICATION_OPTION_EDEFAULT;

	/**
	 * This is true if the Notification Option attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationOptionESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotifyActionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.NOTIFY_ACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPoint(String newEndPoint) {
		String oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.NOTIFY_ACTION_TYPE__END_POINT, oldEndPoint, endPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotificationOption() {
		return notificationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationOption(String newNotificationOption) {
		String oldNotificationOption = notificationOption;
		notificationOption = newNotificationOption;
		boolean oldNotificationOptionESet = notificationOptionESet;
		notificationOptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION, oldNotificationOption, notificationOption, !oldNotificationOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationOption() {
		String oldNotificationOption = notificationOption;
		boolean oldNotificationOptionESet = notificationOptionESet;
		notificationOption = NOTIFICATION_OPTION_EDEFAULT;
		notificationOptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION, oldNotificationOption, NOTIFICATION_OPTION_EDEFAULT, oldNotificationOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationOption() {
		return notificationOptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.NOTIFY_ACTION_TYPE__END_POINT:
				return getEndPoint();
			case RimPackage.NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION:
				return getNotificationOption();
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
			case RimPackage.NOTIFY_ACTION_TYPE__END_POINT:
				setEndPoint((String)newValue);
				return;
			case RimPackage.NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION:
				setNotificationOption((String)newValue);
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
			case RimPackage.NOTIFY_ACTION_TYPE__END_POINT:
				setEndPoint(END_POINT_EDEFAULT);
				return;
			case RimPackage.NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION:
				unsetNotificationOption();
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
			case RimPackage.NOTIFY_ACTION_TYPE__END_POINT:
				return END_POINT_EDEFAULT == null ? endPoint != null : !END_POINT_EDEFAULT.equals(endPoint);
			case RimPackage.NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION:
				return isSetNotificationOption();
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
		result.append(" (endPoint: ");
		result.append(endPoint);
		result.append(", notificationOption: ");
		if (notificationOptionESet) result.append(notificationOption); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NotifyActionTypeImpl
