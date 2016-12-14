/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceQueryTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceQueryTypeImpl#getServiceBindingQuery <em>Service Binding Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ServiceQueryType {
	/**
	 * The cached value of the '{@link #getServiceBindingQuery() <em>Service Binding Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBindingQuery()
	 * @generated
	 * @ordered
	 */
	protected EList serviceBindingQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SERVICE_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServiceBindingQuery() {
		if (serviceBindingQuery == null) {
			serviceBindingQuery = new EObjectContainmentEList(ServiceBindingQueryType.class, this, QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY);
		}
		return serviceBindingQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY:
				return ((InternalEList)getServiceBindingQuery()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY:
				return getServiceBindingQuery();
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY:
				getServiceBindingQuery().clear();
				getServiceBindingQuery().addAll((Collection)newValue);
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY:
				getServiceBindingQuery().clear();
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
			case QueryPackage.SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY:
				return serviceBindingQuery != null && !serviceBindingQuery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceQueryTypeImpl
