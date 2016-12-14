/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassificationSchemeQueryTypeImpl.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
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
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Scheme Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationSchemeQueryTypeImpl#getChildrenQuery <em>Children Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationSchemeQueryTypeImpl#getNodeTypeQuery <em>Node Type Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationSchemeQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ClassificationSchemeQueryType {
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
	 * The cached value of the '{@link #getNodeTypeQuery() <em>Node Type Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType nodeTypeQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationSchemeQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CLASSIFICATION_SCHEME_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildrenQuery() {
		if (childrenQuery == null) {
			childrenQuery = new EObjectContainmentEList(ClassificationNodeQueryType.class, this, QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY);
		}
		return childrenQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getNodeTypeQuery() {
		return nodeTypeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeTypeQuery(ClassificationNodeQueryType newNodeTypeQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldNodeTypeQuery = nodeTypeQuery;
		nodeTypeQuery = newNodeTypeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY, oldNodeTypeQuery, newNodeTypeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeTypeQuery(ClassificationNodeQueryType newNodeTypeQuery) {
		if (newNodeTypeQuery != nodeTypeQuery) {
			NotificationChain msgs = null;
			if (nodeTypeQuery != null)
				msgs = ((InternalEObject)nodeTypeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY, null, msgs);
			if (newNodeTypeQuery != null)
				msgs = ((InternalEObject)newNodeTypeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY, null, msgs);
			msgs = basicSetNodeTypeQuery(newNodeTypeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY, newNodeTypeQuery, newNodeTypeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY:
				return ((InternalEList)getChildrenQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY:
				return basicSetNodeTypeQuery(null, msgs);
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY:
				return getChildrenQuery();
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY:
				return getNodeTypeQuery();
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY:
				getChildrenQuery().clear();
				getChildrenQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY:
				setNodeTypeQuery((ClassificationNodeQueryType)newValue);
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY:
				getChildrenQuery().clear();
				return;
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY:
				setNodeTypeQuery((ClassificationNodeQueryType)null);
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
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY:
				return childrenQuery != null && !childrenQuery.isEmpty();
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY:
				return nodeTypeQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationSchemeQueryTypeImpl
