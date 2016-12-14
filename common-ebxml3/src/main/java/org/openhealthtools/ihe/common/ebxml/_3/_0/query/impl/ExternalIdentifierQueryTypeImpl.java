/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalIdentifierQueryTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Identifier Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalIdentifierQueryTypeImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalIdentifierQueryTypeImpl#getIdentificationSchemeQuery <em>Identification Scheme Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalIdentifierQueryTypeImpl extends RegistryObjectQueryTypeImpl implements ExternalIdentifierQueryType {
	/**
	 * The cached value of the '{@link #getRegistryObjectQuery() <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectQueryType registryObjectQuery = null;

	/**
	 * The cached value of the '{@link #getIdentificationSchemeQuery() <em>Identification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationSchemeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationSchemeQueryType identificationSchemeQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalIdentifierQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.EXTERNAL_IDENTIFIER_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType getRegistryObjectQuery() {
		return registryObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery, NotificationChain msgs) {
		RegistryObjectQueryType oldRegistryObjectQuery = registryObjectQuery;
		registryObjectQuery = newRegistryObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, oldRegistryObjectQuery, newRegistryObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectQuery(RegistryObjectQueryType newRegistryObjectQuery) {
		if (newRegistryObjectQuery != registryObjectQuery) {
			NotificationChain msgs = null;
			if (registryObjectQuery != null)
				msgs = ((InternalEObject)registryObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			if (newRegistryObjectQuery != null)
				msgs = ((InternalEObject)newRegistryObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			msgs = basicSetRegistryObjectQuery(newRegistryObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, newRegistryObjectQuery, newRegistryObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeQueryType getIdentificationSchemeQuery() {
		return identificationSchemeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentificationSchemeQuery(ClassificationSchemeQueryType newIdentificationSchemeQuery, NotificationChain msgs) {
		ClassificationSchemeQueryType oldIdentificationSchemeQuery = identificationSchemeQuery;
		identificationSchemeQuery = newIdentificationSchemeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY, oldIdentificationSchemeQuery, newIdentificationSchemeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationSchemeQuery(ClassificationSchemeQueryType newIdentificationSchemeQuery) {
		if (newIdentificationSchemeQuery != identificationSchemeQuery) {
			NotificationChain msgs = null;
			if (identificationSchemeQuery != null)
				msgs = ((InternalEObject)identificationSchemeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY, null, msgs);
			if (newIdentificationSchemeQuery != null)
				msgs = ((InternalEObject)newIdentificationSchemeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY, null, msgs);
			msgs = basicSetIdentificationSchemeQuery(newIdentificationSchemeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY, newIdentificationSchemeQuery, newIdentificationSchemeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return basicSetRegistryObjectQuery(null, msgs);
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY:
				return basicSetIdentificationSchemeQuery(null, msgs);
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
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY:
				return getIdentificationSchemeQuery();
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
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY:
				setIdentificationSchemeQuery((ClassificationSchemeQueryType)newValue);
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
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY:
				setIdentificationSchemeQuery((ClassificationSchemeQueryType)null);
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
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return registryObjectQuery != null;
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY:
				return identificationSchemeQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalIdentifierQueryTypeImpl
