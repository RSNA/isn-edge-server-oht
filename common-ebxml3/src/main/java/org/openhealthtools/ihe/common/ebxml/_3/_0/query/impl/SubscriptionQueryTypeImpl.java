/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubscriptionQueryTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SubscriptionQueryTypeImpl#getSelectorQuery <em>Selector Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubscriptionQueryTypeImpl extends RegistryObjectQueryTypeImpl implements SubscriptionQueryType {
	/**
	 * The cached value of the '{@link #getSelectorQuery() <em>Selector Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorQuery()
	 * @generated
	 * @ordered
	 */
	protected AdhocQueryQueryType selectorQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SUBSCRIPTION_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryQueryType getSelectorQuery() {
		return selectorQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectorQuery(AdhocQueryQueryType newSelectorQuery, NotificationChain msgs) {
		AdhocQueryQueryType oldSelectorQuery = selectorQuery;
		selectorQuery = newSelectorQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY, oldSelectorQuery, newSelectorQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectorQuery(AdhocQueryQueryType newSelectorQuery) {
		if (newSelectorQuery != selectorQuery) {
			NotificationChain msgs = null;
			if (selectorQuery != null)
				msgs = ((InternalEObject)selectorQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY, null, msgs);
			if (newSelectorQuery != null)
				msgs = ((InternalEObject)newSelectorQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY, null, msgs);
			msgs = basicSetSelectorQuery(newSelectorQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY, newSelectorQuery, newSelectorQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY:
				return basicSetSelectorQuery(null, msgs);
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
			case QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY:
				return getSelectorQuery();
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
			case QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY:
				setSelectorQuery((AdhocQueryQueryType)newValue);
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
			case QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY:
				setSelectorQuery((AdhocQueryQueryType)null);
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
			case QueryPackage.SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY:
				return selectorQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionQueryTypeImpl
