/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassificationQueryTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationQueryTypeImpl#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationQueryTypeImpl#getClassifiedObjectQuery <em>Classified Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationQueryTypeImpl#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ClassificationQueryType {
	/**
	 * The cached value of the '{@link #getClassificationSchemeQuery() <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationSchemeQueryType classificationSchemeQuery = null;

	/**
	 * The cached value of the '{@link #getClassifiedObjectQuery() <em>Classified Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType classifiedObjectQuery = null;

	/**
	 * The cached value of the '{@link #getClassificationNodeQuery() <em>Classification Node Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNodeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType classificationNodeQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CLASSIFICATION_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeQueryType getClassificationSchemeQuery() {
		return classificationSchemeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSchemeQuery(ClassificationSchemeQueryType newClassificationSchemeQuery, NotificationChain msgs) {
		ClassificationSchemeQueryType oldClassificationSchemeQuery = classificationSchemeQuery;
		classificationSchemeQuery = newClassificationSchemeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, oldClassificationSchemeQuery, newClassificationSchemeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSchemeQuery(ClassificationSchemeQueryType newClassificationSchemeQuery) {
		if (newClassificationSchemeQuery != classificationSchemeQuery) {
			NotificationChain msgs = null;
			if (classificationSchemeQuery != null)
				msgs = ((InternalEObject)classificationSchemeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			if (newClassificationSchemeQuery != null)
				msgs = ((InternalEObject)newClassificationSchemeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			msgs = basicSetClassificationSchemeQuery(newClassificationSchemeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, newClassificationSchemeQuery, newClassificationSchemeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getClassifiedObjectQuery() {
		return classifiedObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiedObjectQuery(RegistryObjectQueryType newClassifiedObjectQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldClassifiedObjectQuery = classifiedObjectQuery;
		classifiedObjectQuery = newClassifiedObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY, oldClassifiedObjectQuery, newClassifiedObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedObjectQuery(RegistryObjectQueryType newClassifiedObjectQuery) {
		if (newClassifiedObjectQuery != classifiedObjectQuery) {
			NotificationChain msgs = null;
			if (classifiedObjectQuery != null)
				msgs = ((InternalEObject)classifiedObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY, null, msgs);
			if (newClassifiedObjectQuery != null)
				msgs = ((InternalEObject)newClassifiedObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY, null, msgs);
			msgs = basicSetClassifiedObjectQuery(newClassifiedObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY, newClassifiedObjectQuery, newClassifiedObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getClassificationNodeQuery() {
		return classificationNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeQuery(ClassificationNodeQueryType newClassificationNodeQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldClassificationNodeQuery = classificationNodeQuery;
		classificationNodeQuery = newClassificationNodeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, oldClassificationNodeQuery, newClassificationNodeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeQuery(ClassificationNodeQueryType newClassificationNodeQuery) {
		if (newClassificationNodeQuery != classificationNodeQuery) {
			NotificationChain msgs = null;
			if (classificationNodeQuery != null)
				msgs = ((InternalEObject)classificationNodeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, null, msgs);
			if (newClassificationNodeQuery != null)
				msgs = ((InternalEObject)newClassificationNodeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, null, msgs);
			msgs = basicSetClassificationNodeQuery(newClassificationNodeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, newClassificationNodeQuery, newClassificationNodeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return basicSetClassificationSchemeQuery(null, msgs);
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY:
				return basicSetClassifiedObjectQuery(null, msgs);
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return basicSetClassificationNodeQuery(null, msgs);
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY:
				return getClassifiedObjectQuery();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return getClassificationNodeQuery();
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY:
				setClassifiedObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)newValue);
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY:
				setClassifiedObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)null);
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
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return classificationSchemeQuery != null;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY:
				return classifiedObjectQuery != null;
			case QueryPackage.CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return classificationNodeQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationQueryTypeImpl
