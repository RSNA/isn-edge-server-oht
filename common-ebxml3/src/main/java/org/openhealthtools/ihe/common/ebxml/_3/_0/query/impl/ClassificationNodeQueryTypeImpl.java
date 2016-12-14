/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassificationNodeQueryTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
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

import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Node Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationNodeQueryTypeImpl#getParentQuery <em>Parent Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationNodeQueryTypeImpl#getChildrenQuery <em>Children Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationNodeQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ClassificationNodeQueryType {
	/**
	 * The cached value of the '{@link #getParentQuery() <em>Parent Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType parentQuery = null;

	/**
	 * The cached value of the '{@link #getChildrenQuery() <em>Children Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenQuery()
	 * @generated
	 * @ordered
	 */
	protected EList childrenQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationNodeQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CLASSIFICATION_NODE_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getParentQuery() {
		return parentQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentQuery(RegistryObjectQueryType newParentQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldParentQuery = parentQuery;
		parentQuery = newParentQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY, oldParentQuery, newParentQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentQuery(RegistryObjectQueryType newParentQuery) {
		if (newParentQuery != parentQuery) {
			NotificationChain msgs = null;
			if (parentQuery != null)
				msgs = ((InternalEObject)parentQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY, null, msgs);
			if (newParentQuery != null)
				msgs = ((InternalEObject)newParentQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY, null, msgs);
			msgs = basicSetParentQuery(newParentQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY, newParentQuery, newParentQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildrenQuery() {
		if (childrenQuery == null) {
			childrenQuery = new EObjectContainmentEList(ClassificationNodeQueryType.class, this, QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY);
		}
		return childrenQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY:
				return basicSetParentQuery(null, msgs);
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY:
				return ((InternalEList)getChildrenQuery()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY:
				return getParentQuery();
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY:
				return getChildrenQuery();
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY:
				setParentQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY:
				getChildrenQuery().clear();
				getChildrenQuery().addAll((Collection)newValue);
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY:
				setParentQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY:
				getChildrenQuery().clear();
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
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY:
				return parentQuery != null;
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY:
				return childrenQuery != null && !childrenQuery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassificationNodeQueryTypeImpl
