/**
 * <copyright>
 * </copyright>
 *
 * $Id: InternationalStringBranchTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>International String Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.InternationalStringBranchTypeImpl#getLocalizedStringFilter <em>Localized String Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternationalStringBranchTypeImpl extends BranchTypeImpl implements InternationalStringBranchType {
	/**
	 * The cached value of the '{@link #getLocalizedStringFilter() <em>Localized String Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedStringFilter()
	 * @generated
	 * @ordered
	 */
	protected EList localizedStringFilter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternationalStringBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.INTERNATIONAL_STRING_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocalizedStringFilter() {
		if (localizedStringFilter == null) {
			localizedStringFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER);
		}
		return localizedStringFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				return ((InternalEList)getLocalizedStringFilter()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				return getLocalizedStringFilter();
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				getLocalizedStringFilter().clear();
				getLocalizedStringFilter().addAll((Collection)newValue);
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				getLocalizedStringFilter().clear();
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
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER:
				return localizedStringFilter != null && !localizedStringFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternationalStringBranchTypeImpl
