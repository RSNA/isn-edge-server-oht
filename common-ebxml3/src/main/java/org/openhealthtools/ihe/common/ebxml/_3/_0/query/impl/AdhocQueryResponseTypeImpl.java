/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdhocQueryResponseTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;



import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adhoc Query Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryResponseTypeImpl#getRegistryObjectList <em>Registry Object List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryResponseTypeImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryResponseTypeImpl#getTotalResultCount <em>Total Result Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdhocQueryResponseTypeImpl extends RegistryResponseTypeImpl implements AdhocQueryResponseType {
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
	 * The default value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_INDEX_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startIndex = START_INDEX_EDEFAULT;

	/**
	 * This is true if the Start Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startIndexESet = false;

	/**
	 * The default value of the '{@link #getTotalResultCount() <em>Total Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalResultCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TOTAL_RESULT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalResultCount() <em>Total Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalResultCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger totalResultCount = TOTAL_RESULT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdhocQueryResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ADHOC_QUERY_RESPONSE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST, oldRegistryObjectList, newRegistryObjectList);
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
				msgs = ((InternalEObject)registryObjectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			if (newRegistryObjectList != null)
				msgs = ((InternalEObject)newRegistryObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST, null, msgs);
			msgs = basicSetRegistryObjectList(newRegistryObjectList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST, newRegistryObjectList, newRegistryObjectList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartIndex() {
		return startIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndex(BigInteger newStartIndex) {
		BigInteger oldStartIndex = startIndex;
		startIndex = newStartIndex;
		boolean oldStartIndexESet = startIndexESet;
		startIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__START_INDEX, oldStartIndex, startIndex, !oldStartIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartIndex() {
		BigInteger oldStartIndex = startIndex;
		boolean oldStartIndexESet = startIndexESet;
		startIndex = START_INDEX_EDEFAULT;
		startIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__START_INDEX, oldStartIndex, START_INDEX_EDEFAULT, oldStartIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartIndex() {
		return startIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTotalResultCount() {
		return totalResultCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalResultCount(BigInteger newTotalResultCount) {
		BigInteger oldTotalResultCount = totalResultCount;
		totalResultCount = newTotalResultCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT, oldTotalResultCount, totalResultCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST:
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST:
				return getRegistryObjectList();
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__START_INDEX:
				return getStartIndex();
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT:
				return getTotalResultCount();
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__START_INDEX:
				setStartIndex((BigInteger)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT:
				setTotalResultCount((BigInteger)newValue);
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)null);
				return;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__START_INDEX:
				unsetStartIndex();
				return;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT:
				setTotalResultCount(TOTAL_RESULT_COUNT_EDEFAULT);
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
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST:
				return registryObjectList != null;
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__START_INDEX:
				return isSetStartIndex();
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT:
				return TOTAL_RESULT_COUNT_EDEFAULT == null ? totalResultCount != null : !TOTAL_RESULT_COUNT_EDEFAULT.equals(totalResultCount);
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
		result.append(" (startIndex: ");
		if (startIndexESet) result.append(startIndex); else result.append("<unset>");
		result.append(", totalResultCount: ");
		result.append(totalResultCount);
		result.append(')');
		return result.toString();
	}

} //AdhocQueryResponseTypeImpl
