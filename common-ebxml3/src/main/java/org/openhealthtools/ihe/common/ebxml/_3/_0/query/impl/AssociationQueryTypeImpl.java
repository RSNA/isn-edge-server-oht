/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationQueryTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AssociationQueryTypeImpl#getAssociationTypeQuery <em>Association Type Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AssociationQueryTypeImpl#getSourceObjectQuery <em>Source Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AssociationQueryTypeImpl#getTargetObjectQuery <em>Target Object Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationQueryTypeImpl extends RegistryObjectQueryTypeImpl implements AssociationQueryType {
	/**
	 * The cached value of the '{@link #getAssociationTypeQuery() <em>Association Type Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationTypeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType associationTypeQuery = null;

	/**
	 * The cached value of the '{@link #getSourceObjectQuery() <em>Source Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType sourceObjectQuery = null;

	/**
	 * The cached value of the '{@link #getTargetObjectQuery() <em>Target Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType targetObjectQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ASSOCIATION_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getAssociationTypeQuery() {
		return associationTypeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationTypeQuery(ClassificationNodeQueryType newAssociationTypeQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldAssociationTypeQuery = associationTypeQuery;
		associationTypeQuery = newAssociationTypeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY, oldAssociationTypeQuery, newAssociationTypeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationTypeQuery(ClassificationNodeQueryType newAssociationTypeQuery) {
		if (newAssociationTypeQuery != associationTypeQuery) {
			NotificationChain msgs = null;
			if (associationTypeQuery != null)
				msgs = ((InternalEObject)associationTypeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY, null, msgs);
			if (newAssociationTypeQuery != null)
				msgs = ((InternalEObject)newAssociationTypeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY, null, msgs);
			msgs = basicSetAssociationTypeQuery(newAssociationTypeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY, newAssociationTypeQuery, newAssociationTypeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getSourceObjectQuery() {
		return sourceObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceObjectQuery(RegistryObjectQueryType newSourceObjectQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldSourceObjectQuery = sourceObjectQuery;
		sourceObjectQuery = newSourceObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY, oldSourceObjectQuery, newSourceObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceObjectQuery(RegistryObjectQueryType newSourceObjectQuery) {
		if (newSourceObjectQuery != sourceObjectQuery) {
			NotificationChain msgs = null;
			if (sourceObjectQuery != null)
				msgs = ((InternalEObject)sourceObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY, null, msgs);
			if (newSourceObjectQuery != null)
				msgs = ((InternalEObject)newSourceObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY, null, msgs);
			msgs = basicSetSourceObjectQuery(newSourceObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY, newSourceObjectQuery, newSourceObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getTargetObjectQuery() {
		return targetObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetObjectQuery(RegistryObjectQueryType newTargetObjectQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldTargetObjectQuery = targetObjectQuery;
		targetObjectQuery = newTargetObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY, oldTargetObjectQuery, newTargetObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetObjectQuery(RegistryObjectQueryType newTargetObjectQuery) {
		if (newTargetObjectQuery != targetObjectQuery) {
			NotificationChain msgs = null;
			if (targetObjectQuery != null)
				msgs = ((InternalEObject)targetObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY, null, msgs);
			if (newTargetObjectQuery != null)
				msgs = ((InternalEObject)newTargetObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY, null, msgs);
			msgs = basicSetTargetObjectQuery(newTargetObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY, newTargetObjectQuery, newTargetObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY:
				return basicSetAssociationTypeQuery(null, msgs);
			case QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY:
				return basicSetSourceObjectQuery(null, msgs);
			case QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY:
				return basicSetTargetObjectQuery(null, msgs);
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY:
				return getAssociationTypeQuery();
			case QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY:
				return getSourceObjectQuery();
			case QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY:
				return getTargetObjectQuery();
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY:
				setAssociationTypeQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY:
				setSourceObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY:
				setTargetObjectQuery((RegistryObjectQueryType)newValue);
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY:
				setAssociationTypeQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY:
				setSourceObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY:
				setTargetObjectQuery((RegistryObjectQueryType)null);
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
			case QueryPackage.ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY:
				return associationTypeQuery != null;
			case QueryPackage.ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY:
				return sourceObjectQuery != null;
			case QueryPackage.ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY:
				return targetObjectQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationQueryTypeImpl
