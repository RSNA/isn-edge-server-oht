/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryQueryTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryQueryTypeImpl#getOperatorQuery <em>Operator Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryQueryTypeImpl extends RegistryObjectQueryTypeImpl implements RegistryQueryType {
	/**
	 * The cached value of the '{@link #getOperatorQuery() <em>Operator Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorQuery()
	 * @generated
	 * @ordered
	 */
	protected OrganizationQueryType operatorQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.REGISTRY_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getOperatorQuery() {
		return operatorQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorQuery(OrganizationQueryType newOperatorQuery, NotificationChain msgs) {
		OrganizationQueryType oldOperatorQuery = operatorQuery;
		operatorQuery = newOperatorQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY, oldOperatorQuery, newOperatorQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorQuery(OrganizationQueryType newOperatorQuery) {
		if (newOperatorQuery != operatorQuery) {
			NotificationChain msgs = null;
			if (operatorQuery != null)
				msgs = ((InternalEObject)operatorQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY, null, msgs);
			if (newOperatorQuery != null)
				msgs = ((InternalEObject)newOperatorQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY, null, msgs);
			msgs = basicSetOperatorQuery(newOperatorQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY, newOperatorQuery, newOperatorQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY:
				return basicSetOperatorQuery(null, msgs);
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
			case QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY:
				return getOperatorQuery();
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
			case QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY:
				setOperatorQuery((OrganizationQueryType)newValue);
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
			case QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY:
				setOperatorQuery((OrganizationQueryType)null);
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
			case QueryPackage.REGISTRY_QUERY_TYPE__OPERATOR_QUERY:
				return operatorQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //RegistryQueryTypeImpl
