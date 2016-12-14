/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryObjectListTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Object List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectListTypeImpl#getIdentifiableGroup <em>Identifiable Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectListTypeImpl#getIdentifiable <em>Identifiable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryObjectListTypeImpl extends EObjectImpl implements RegistryObjectListType {
	/**
	 * The cached value of the '{@link #getIdentifiableGroup() <em>Identifiable Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiableGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap identifiableGroup = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryObjectListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.REGISTRY_OBJECT_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIdentifiableGroup() {
		if (identifiableGroup == null) {
			identifiableGroup = new BasicFeatureMap(this, RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP);
		}
		return identifiableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIdentifiable() {
		return ((FeatureMap)getIdentifiableGroup()).list(RimPackage.Literals.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP:
				return ((InternalEList)getIdentifiableGroup()).basicRemove(otherEnd, msgs);
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE:
				return ((InternalEList)getIdentifiable()).basicRemove(otherEnd, msgs);
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP:
				if (coreType) return getIdentifiableGroup();
				return ((FeatureMap.Internal)getIdentifiableGroup()).getWrapper();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE:
				return getIdentifiable();
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP:
				((FeatureMap.Internal)getIdentifiableGroup()).set(newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE:
				getIdentifiable().clear();
				getIdentifiable().addAll((Collection)newValue);
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP:
				getIdentifiableGroup().clear();
				return;
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE:
				getIdentifiable().clear();
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
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP:
				return identifiableGroup != null && !identifiableGroup.isEmpty();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE:
				return !getIdentifiable().isEmpty();
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
		result.append(" (identifiableGroup: ");
		result.append(identifiableGroup);
		result.append(')');
		return result.toString();
	}

} //RegistryObjectListTypeImpl
