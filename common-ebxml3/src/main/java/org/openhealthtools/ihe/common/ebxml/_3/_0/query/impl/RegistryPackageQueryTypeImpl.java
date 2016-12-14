/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryPackageQueryTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
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
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Package Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryPackageQueryTypeImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryPackageQueryTypeImpl extends RegistryObjectQueryTypeImpl implements RegistryPackageQueryType {
	/**
	 * The cached value of the '{@link #getRegistryObjectQuery() <em>Registry Object Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected EList registryObjectQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryPackageQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.REGISTRY_PACKAGE_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegistryObjectQuery() {
		if (registryObjectQuery == null) {
			registryObjectQuery = new EObjectContainmentEList(RegistryObjectQueryType.class, this, QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY);
		}
		return registryObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return ((InternalEList)getRegistryObjectQuery()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				getRegistryObjectQuery().clear();
				getRegistryObjectQuery().addAll((Collection)newValue);
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				getRegistryObjectQuery().clear();
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
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return registryObjectQuery != null && !registryObjectQuery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegistryPackageQueryTypeImpl
