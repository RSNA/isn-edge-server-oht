/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtrinsicObjectQueryTypeImpl.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extrinsic Object Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExtrinsicObjectQueryTypeImpl#getContentVersionInfoFilter <em>Content Version Info Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtrinsicObjectQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ExtrinsicObjectQueryType {
	/**
	 * The cached value of the '{@link #getContentVersionInfoFilter() <em>Content Version Info Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersionInfoFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType contentVersionInfoFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtrinsicObjectQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.EXTRINSIC_OBJECT_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getContentVersionInfoFilter() {
		return contentVersionInfoFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentVersionInfoFilter(FilterType newContentVersionInfoFilter, NotificationChain msgs) {
		FilterType oldContentVersionInfoFilter = contentVersionInfoFilter;
		contentVersionInfoFilter = newContentVersionInfoFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER, oldContentVersionInfoFilter, newContentVersionInfoFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentVersionInfoFilter(FilterType newContentVersionInfoFilter) {
		if (newContentVersionInfoFilter != contentVersionInfoFilter) {
			NotificationChain msgs = null;
			if (contentVersionInfoFilter != null)
				msgs = ((InternalEObject)contentVersionInfoFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER, null, msgs);
			if (newContentVersionInfoFilter != null)
				msgs = ((InternalEObject)newContentVersionInfoFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER, null, msgs);
			msgs = basicSetContentVersionInfoFilter(newContentVersionInfoFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER, newContentVersionInfoFilter, newContentVersionInfoFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER:
				return basicSetContentVersionInfoFilter(null, msgs);
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER:
				return getContentVersionInfoFilter();
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER:
				setContentVersionInfoFilter((FilterType)newValue);
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER:
				setContentVersionInfoFilter((FilterType)null);
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
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER:
				return contentVersionInfoFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtrinsicObjectQueryTypeImpl
