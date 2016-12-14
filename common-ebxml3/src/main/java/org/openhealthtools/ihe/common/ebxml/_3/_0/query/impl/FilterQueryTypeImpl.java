/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterQueryTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterQueryTypeImpl#getPrimaryFilter <em>Primary Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FilterQueryTypeImpl extends EObjectImpl implements FilterQueryType {
	/**
	 * The cached value of the '{@link #getPrimaryFilter() <em>Primary Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType primaryFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.FILTER_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getPrimaryFilter() {
		return primaryFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryFilter(FilterType newPrimaryFilter, NotificationChain msgs) {
		FilterType oldPrimaryFilter = primaryFilter;
		primaryFilter = newPrimaryFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER, oldPrimaryFilter, newPrimaryFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryFilter(FilterType newPrimaryFilter) {
		if (newPrimaryFilter != primaryFilter) {
			NotificationChain msgs = null;
			if (primaryFilter != null)
				msgs = ((InternalEObject)primaryFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER, null, msgs);
			if (newPrimaryFilter != null)
				msgs = ((InternalEObject)newPrimaryFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER, null, msgs);
			msgs = basicSetPrimaryFilter(newPrimaryFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER, newPrimaryFilter, newPrimaryFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER:
				return basicSetPrimaryFilter(null, msgs);
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
			case QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER:
				return getPrimaryFilter();
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
			case QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER:
				setPrimaryFilter((FilterType)newValue);
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
			case QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER:
				setPrimaryFilter((FilterType)null);
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
			case QueryPackage.FILTER_QUERY_TYPE__PRIMARY_FILTER:
				return primaryFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterQueryTypeImpl
