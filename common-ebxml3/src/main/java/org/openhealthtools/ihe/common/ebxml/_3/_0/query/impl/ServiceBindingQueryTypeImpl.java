/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceBindingQueryTypeImpl.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Binding Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceBindingQueryTypeImpl#getServiceQuery <em>Service Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceBindingQueryTypeImpl#getSpecificationLinkQuery <em>Specification Link Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceBindingQueryTypeImpl#getTargetBindingQuery <em>Target Binding Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceBindingQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ServiceBindingQueryType {
	/**
	 * The cached value of the '{@link #getServiceQuery() <em>Service Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceQuery()
	 * @generated
	 * @ordered
	 */
	protected ServiceQueryType serviceQuery = null;

	/**
	 * The cached value of the '{@link #getSpecificationLinkQuery() <em>Specification Link Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationLinkQuery()
	 * @generated
	 * @ordered
	 */
	protected EList specificationLinkQuery = null;

	/**
	 * The cached value of the '{@link #getTargetBindingQuery() <em>Target Binding Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBindingQuery()
	 * @generated
	 * @ordered
	 */
	protected ServiceBindingQueryType targetBindingQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBindingQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SERVICE_BINDING_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQueryType getServiceQuery() {
		return serviceQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceQuery(ServiceQueryType newServiceQuery, NotificationChain msgs) {
		ServiceQueryType oldServiceQuery = serviceQuery;
		serviceQuery = newServiceQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY, oldServiceQuery, newServiceQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceQuery(ServiceQueryType newServiceQuery) {
		if (newServiceQuery != serviceQuery) {
			NotificationChain msgs = null;
			if (serviceQuery != null)
				msgs = ((InternalEObject)serviceQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY, null, msgs);
			if (newServiceQuery != null)
				msgs = ((InternalEObject)newServiceQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY, null, msgs);
			msgs = basicSetServiceQuery(newServiceQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY, newServiceQuery, newServiceQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecificationLinkQuery() {
		if (specificationLinkQuery == null) {
			specificationLinkQuery = new EObjectContainmentEList(SpecificationLinkQueryType.class, this, QueryPackage.SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY);
		}
		return specificationLinkQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingQueryType getTargetBindingQuery() {
		return targetBindingQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetBindingQuery(ServiceBindingQueryType newTargetBindingQuery, NotificationChain msgs) {
		ServiceBindingQueryType oldTargetBindingQuery = targetBindingQuery;
		targetBindingQuery = newTargetBindingQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY, oldTargetBindingQuery, newTargetBindingQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBindingQuery(ServiceBindingQueryType newTargetBindingQuery) {
		if (newTargetBindingQuery != targetBindingQuery) {
			NotificationChain msgs = null;
			if (targetBindingQuery != null)
				msgs = ((InternalEObject)targetBindingQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY, null, msgs);
			if (newTargetBindingQuery != null)
				msgs = ((InternalEObject)newTargetBindingQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY, null, msgs);
			msgs = basicSetTargetBindingQuery(newTargetBindingQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY, newTargetBindingQuery, newTargetBindingQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY:
				return basicSetServiceQuery(null, msgs);
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY:
				return ((InternalEList)getSpecificationLinkQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY:
				return basicSetTargetBindingQuery(null, msgs);
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
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY:
				return getServiceQuery();
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY:
				return getSpecificationLinkQuery();
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY:
				return getTargetBindingQuery();
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
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)newValue);
				return;
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY:
				getSpecificationLinkQuery().clear();
				getSpecificationLinkQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY:
				setTargetBindingQuery((ServiceBindingQueryType)newValue);
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
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)null);
				return;
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY:
				getSpecificationLinkQuery().clear();
				return;
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY:
				setTargetBindingQuery((ServiceBindingQueryType)null);
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
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY:
				return serviceQuery != null;
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY:
				return specificationLinkQuery != null && !specificationLinkQuery.isEmpty();
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY:
				return targetBindingQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceBindingQueryTypeImpl
