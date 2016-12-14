/**
 * <copyright>
 * </copyright>
 *
 * $Id: SlotType1Impl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotType1Impl#getValueList <em>Value List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotType1Impl#getSlotType <em>Slot Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotType1Impl extends EObjectImpl implements SlotType1 {
	/**
	 * The cached value of the '{@link #getValueList() <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueList()
	 * @generated
	 * @ordered
	 */
	protected ValueListType valueList = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlotType() <em>Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotType()
	 * @generated
	 * @ordered
	 */
	protected static final String SLOT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlotType() <em>Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotType()
	 * @generated
	 * @ordered
	 */
	protected String slotType = SLOT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.SLOT_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListType getValueList() {
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueList(ValueListType newValueList, NotificationChain msgs) {
		ValueListType oldValueList = valueList;
		valueList = newValueList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.SLOT_TYPE1__VALUE_LIST, oldValueList, newValueList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueList(ValueListType newValueList) {
		if (newValueList != valueList) {
			NotificationChain msgs = null;
			if (valueList != null)
				msgs = ((InternalEObject)valueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.SLOT_TYPE1__VALUE_LIST, null, msgs);
			if (newValueList != null)
				msgs = ((InternalEObject)newValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.SLOT_TYPE1__VALUE_LIST, null, msgs);
			msgs = basicSetValueList(newValueList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SLOT_TYPE1__VALUE_LIST, newValueList, newValueList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SLOT_TYPE1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlotType() {
		return slotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotType(String newSlotType) {
		String oldSlotType = slotType;
		slotType = newSlotType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SLOT_TYPE1__SLOT_TYPE, oldSlotType, slotType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.SLOT_TYPE1__VALUE_LIST:
				return basicSetValueList(null, msgs);
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
			case RimPackage.SLOT_TYPE1__VALUE_LIST:
				return getValueList();
			case RimPackage.SLOT_TYPE1__NAME:
				return getName();
			case RimPackage.SLOT_TYPE1__SLOT_TYPE:
				return getSlotType();
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
			case RimPackage.SLOT_TYPE1__VALUE_LIST:
				setValueList((ValueListType)newValue);
				return;
			case RimPackage.SLOT_TYPE1__NAME:
				setName((String)newValue);
				return;
			case RimPackage.SLOT_TYPE1__SLOT_TYPE:
				setSlotType((String)newValue);
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
			case RimPackage.SLOT_TYPE1__VALUE_LIST:
				setValueList((ValueListType)null);
				return;
			case RimPackage.SLOT_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RimPackage.SLOT_TYPE1__SLOT_TYPE:
				setSlotType(SLOT_TYPE_EDEFAULT);
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
			case RimPackage.SLOT_TYPE1__VALUE_LIST:
				return valueList != null;
			case RimPackage.SLOT_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RimPackage.SLOT_TYPE1__SLOT_TYPE:
				return SLOT_TYPE_EDEFAULT == null ? slotType != null : !SLOT_TYPE_EDEFAULT.equals(slotType);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", slotType: ");
		result.append(slotType);
		result.append(')');
		return result.toString();
	}

} //SlotType1Impl
