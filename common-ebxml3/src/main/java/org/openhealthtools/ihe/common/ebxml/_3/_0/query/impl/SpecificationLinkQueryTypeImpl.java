/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecificationLinkQueryTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Link Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SpecificationLinkQueryTypeImpl#getUsageDescriptionBranch <em>Usage Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SpecificationLinkQueryTypeImpl#getServiceBindingQuery <em>Service Binding Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SpecificationLinkQueryTypeImpl#getSpecificationObjectQuery <em>Specification Object Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationLinkQueryTypeImpl extends RegistryObjectQueryTypeImpl implements SpecificationLinkQueryType {
	/**
	 * The cached value of the '{@link #getUsageDescriptionBranch() <em>Usage Description Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageDescriptionBranch()
	 * @generated
	 * @ordered
	 */
	protected InternationalStringBranchType usageDescriptionBranch = null;

	/**
	 * The cached value of the '{@link #getServiceBindingQuery() <em>Service Binding Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBindingQuery()
	 * @generated
	 * @ordered
	 */
	protected ServiceBindingQueryType serviceBindingQuery = null;

	/**
	 * The cached value of the '{@link #getSpecificationObjectQuery() <em>Specification Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType specificationObjectQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationLinkQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SPECIFICATION_LINK_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringBranchType getUsageDescriptionBranch() {
		return usageDescriptionBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageDescriptionBranch(InternationalStringBranchType newUsageDescriptionBranch, NotificationChain msgs) {
		InternationalStringBranchType oldUsageDescriptionBranch = usageDescriptionBranch;
		usageDescriptionBranch = newUsageDescriptionBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH, oldUsageDescriptionBranch, newUsageDescriptionBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageDescriptionBranch(InternationalStringBranchType newUsageDescriptionBranch) {
		if (newUsageDescriptionBranch != usageDescriptionBranch) {
			NotificationChain msgs = null;
			if (usageDescriptionBranch != null)
				msgs = ((InternalEObject)usageDescriptionBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH, null, msgs);
			if (newUsageDescriptionBranch != null)
				msgs = ((InternalEObject)newUsageDescriptionBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH, null, msgs);
			msgs = basicSetUsageDescriptionBranch(newUsageDescriptionBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH, newUsageDescriptionBranch, newUsageDescriptionBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingQueryType getServiceBindingQuery() {
		return serviceBindingQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBindingQuery(ServiceBindingQueryType newServiceBindingQuery, NotificationChain msgs) {
		ServiceBindingQueryType oldServiceBindingQuery = serviceBindingQuery;
		serviceBindingQuery = newServiceBindingQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY, oldServiceBindingQuery, newServiceBindingQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBindingQuery(ServiceBindingQueryType newServiceBindingQuery) {
		if (newServiceBindingQuery != serviceBindingQuery) {
			NotificationChain msgs = null;
			if (serviceBindingQuery != null)
				msgs = ((InternalEObject)serviceBindingQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY, null, msgs);
			if (newServiceBindingQuery != null)
				msgs = ((InternalEObject)newServiceBindingQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY, null, msgs);
			msgs = basicSetServiceBindingQuery(newServiceBindingQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY, newServiceBindingQuery, newServiceBindingQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getSpecificationObjectQuery() {
		return specificationObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationObjectQuery(RegistryObjectQueryType newSpecificationObjectQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldSpecificationObjectQuery = specificationObjectQuery;
		specificationObjectQuery = newSpecificationObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY, oldSpecificationObjectQuery, newSpecificationObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationObjectQuery(RegistryObjectQueryType newSpecificationObjectQuery) {
		if (newSpecificationObjectQuery != specificationObjectQuery) {
			NotificationChain msgs = null;
			if (specificationObjectQuery != null)
				msgs = ((InternalEObject)specificationObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY, null, msgs);
			if (newSpecificationObjectQuery != null)
				msgs = ((InternalEObject)newSpecificationObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY, null, msgs);
			msgs = basicSetSpecificationObjectQuery(newSpecificationObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY, newSpecificationObjectQuery, newSpecificationObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH:
				return basicSetUsageDescriptionBranch(null, msgs);
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY:
				return basicSetServiceBindingQuery(null, msgs);
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY:
				return basicSetSpecificationObjectQuery(null, msgs);
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
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH:
				return getUsageDescriptionBranch();
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY:
				return getServiceBindingQuery();
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY:
				return getSpecificationObjectQuery();
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
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH:
				setUsageDescriptionBranch((InternationalStringBranchType)newValue);
				return;
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY:
				setServiceBindingQuery((ServiceBindingQueryType)newValue);
				return;
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY:
				setSpecificationObjectQuery((RegistryObjectQueryType)newValue);
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
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH:
				setUsageDescriptionBranch((InternationalStringBranchType)null);
				return;
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY:
				setServiceBindingQuery((ServiceBindingQueryType)null);
				return;
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY:
				setSpecificationObjectQuery((RegistryObjectQueryType)null);
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
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH:
				return usageDescriptionBranch != null;
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY:
				return serviceBindingQuery != null;
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY:
				return specificationObjectQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificationLinkQueryTypeImpl
