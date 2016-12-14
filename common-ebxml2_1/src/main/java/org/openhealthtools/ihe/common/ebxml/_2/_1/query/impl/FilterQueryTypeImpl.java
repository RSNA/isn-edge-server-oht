/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterQueryTypeImpl.java,v 1.1 2006/06/27 23:18:03 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getRegistryEntryQuery <em>Registry Entry Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getAssociationQuery <em>Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getClassificationNodeQuery <em>Classification Node Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getClassificationSchemeQuery <em>Classification Scheme Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getRegistryPackageQuery <em>Registry Package Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getOrganizationQuery <em>Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl#getServiceQuery <em>Service Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterQueryTypeImpl extends EObjectImpl implements FilterQueryType {
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
	 * The cached value of the '{@link #getRegistryEntryQuery() <em>Registry Entry Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryEntryQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryEntryQueryType registryEntryQuery = null;

	/**
	 * The cached value of the '{@link #getAssociationQuery() <em>Association Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationQuery()
	 * @generated
	 * @ordered
	 */
	protected AssociationQueryType associationQuery = null;

	/**
	 * The cached value of the '{@link #getAuditableEventQuery() <em>Auditable Event Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditableEventQuery()
	 * @generated
	 * @ordered
	 */
	protected AuditableEventQueryType auditableEventQuery = null;

	/**
	 * The cached value of the '{@link #getClassificationQuery() <em>Classification Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationQueryType classificationQuery = null;

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
	 * The cached value of the '{@link #getClassificationSchemeQuery() <em>Classification Scheme Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSchemeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationSchemeQueryType classificationSchemeQuery = null;

	/**
	 * The cached value of the '{@link #getRegistryPackageQuery() <em>Registry Package Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryPackageQuery()
	 * @generated
	 * @ordered
	 */
	protected RegistryPackageQueryType registryPackageQuery = null;

	/**
	 * The cached value of the '{@link #getExtrinsicObjectQuery() <em>Extrinsic Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrinsicObjectQuery()
	 * @generated
	 * @ordered
	 */
	protected ExtrinsicObjectQueryType extrinsicObjectQuery = null;

	/**
	 * The cached value of the '{@link #getOrganizationQuery() <em>Organization Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationQuery()
	 * @generated
	 * @ordered
	 */
	protected OrganizationQueryType organizationQuery = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.FILTER_QUERY_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, oldRegistryObjectQuery, newRegistryObjectQuery);
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
				msgs = ((InternalEObject)registryObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			if (newRegistryObjectQuery != null)
				msgs = ((InternalEObject)newRegistryObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, null, msgs);
			msgs = basicSetRegistryObjectQuery(newRegistryObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY, newRegistryObjectQuery, newRegistryObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryType getRegistryEntryQuery() {
		return registryEntryQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery, NotificationChain msgs) {
		RegistryEntryQueryType oldRegistryEntryQuery = registryEntryQuery;
		registryEntryQuery = newRegistryEntryQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY, oldRegistryEntryQuery, newRegistryEntryQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryQuery(RegistryEntryQueryType newRegistryEntryQuery) {
		if (newRegistryEntryQuery != registryEntryQuery) {
			NotificationChain msgs = null;
			if (registryEntryQuery != null)
				msgs = ((InternalEObject)registryEntryQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			if (newRegistryEntryQuery != null)
				msgs = ((InternalEObject)newRegistryEntryQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY, null, msgs);
			msgs = basicSetRegistryEntryQuery(newRegistryEntryQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY, newRegistryEntryQuery, newRegistryEntryQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationQueryType getAssociationQuery() {
		return associationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationQuery(AssociationQueryType newAssociationQuery, NotificationChain msgs) {
		AssociationQueryType oldAssociationQuery = associationQuery;
		associationQuery = newAssociationQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY, oldAssociationQuery, newAssociationQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationQuery(AssociationQueryType newAssociationQuery) {
		if (newAssociationQuery != associationQuery) {
			NotificationChain msgs = null;
			if (associationQuery != null)
				msgs = ((InternalEObject)associationQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY, null, msgs);
			if (newAssociationQuery != null)
				msgs = ((InternalEObject)newAssociationQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY, null, msgs);
			msgs = basicSetAssociationQuery(newAssociationQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY, newAssociationQuery, newAssociationQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditableEventQueryType getAuditableEventQuery() {
		return auditableEventQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditableEventQuery(AuditableEventQueryType newAuditableEventQuery, NotificationChain msgs) {
		AuditableEventQueryType oldAuditableEventQuery = auditableEventQuery;
		auditableEventQuery = newAuditableEventQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY, oldAuditableEventQuery, newAuditableEventQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditableEventQuery(AuditableEventQueryType newAuditableEventQuery) {
		if (newAuditableEventQuery != auditableEventQuery) {
			NotificationChain msgs = null;
			if (auditableEventQuery != null)
				msgs = ((InternalEObject)auditableEventQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY, null, msgs);
			if (newAuditableEventQuery != null)
				msgs = ((InternalEObject)newAuditableEventQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY, null, msgs);
			msgs = basicSetAuditableEventQuery(newAuditableEventQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY, newAuditableEventQuery, newAuditableEventQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationQueryType getClassificationQuery() {
		return classificationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationQuery(ClassificationQueryType newClassificationQuery, NotificationChain msgs) {
		ClassificationQueryType oldClassificationQuery = classificationQuery;
		classificationQuery = newClassificationQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY, oldClassificationQuery, newClassificationQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationQuery(ClassificationQueryType newClassificationQuery) {
		if (newClassificationQuery != classificationQuery) {
			NotificationChain msgs = null;
			if (classificationQuery != null)
				msgs = ((InternalEObject)classificationQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY, null, msgs);
			if (newClassificationQuery != null)
				msgs = ((InternalEObject)newClassificationQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY, null, msgs);
			msgs = basicSetClassificationQuery(newClassificationQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY, newClassificationQuery, newClassificationQuery));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, oldClassificationNodeQuery, newClassificationNodeQuery);
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
				msgs = ((InternalEObject)classificationNodeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, null, msgs);
			if (newClassificationNodeQuery != null)
				msgs = ((InternalEObject)newClassificationNodeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, null, msgs);
			msgs = basicSetClassificationNodeQuery(newClassificationNodeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY, newClassificationNodeQuery, newClassificationNodeQuery));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, oldClassificationSchemeQuery, newClassificationSchemeQuery);
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
				msgs = ((InternalEObject)classificationSchemeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			if (newClassificationSchemeQuery != null)
				msgs = ((InternalEObject)newClassificationSchemeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, null, msgs);
			msgs = basicSetClassificationSchemeQuery(newClassificationSchemeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY, newClassificationSchemeQuery, newClassificationSchemeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackageQueryType getRegistryPackageQuery() {
		return registryPackageQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryPackageQuery(RegistryPackageQueryType newRegistryPackageQuery, NotificationChain msgs) {
		RegistryPackageQueryType oldRegistryPackageQuery = registryPackageQuery;
		registryPackageQuery = newRegistryPackageQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY, oldRegistryPackageQuery, newRegistryPackageQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryPackageQuery(RegistryPackageQueryType newRegistryPackageQuery) {
		if (newRegistryPackageQuery != registryPackageQuery) {
			NotificationChain msgs = null;
			if (registryPackageQuery != null)
				msgs = ((InternalEObject)registryPackageQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY, null, msgs);
			if (newRegistryPackageQuery != null)
				msgs = ((InternalEObject)newRegistryPackageQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY, null, msgs);
			msgs = basicSetRegistryPackageQuery(newRegistryPackageQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY, newRegistryPackageQuery, newRegistryPackageQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrinsicObjectQueryType getExtrinsicObjectQuery() {
		return extrinsicObjectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrinsicObjectQuery(ExtrinsicObjectQueryType newExtrinsicObjectQuery, NotificationChain msgs) {
		ExtrinsicObjectQueryType oldExtrinsicObjectQuery = extrinsicObjectQuery;
		extrinsicObjectQuery = newExtrinsicObjectQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY, oldExtrinsicObjectQuery, newExtrinsicObjectQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrinsicObjectQuery(ExtrinsicObjectQueryType newExtrinsicObjectQuery) {
		if (newExtrinsicObjectQuery != extrinsicObjectQuery) {
			NotificationChain msgs = null;
			if (extrinsicObjectQuery != null)
				msgs = ((InternalEObject)extrinsicObjectQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY, null, msgs);
			if (newExtrinsicObjectQuery != null)
				msgs = ((InternalEObject)newExtrinsicObjectQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY, null, msgs);
			msgs = basicSetExtrinsicObjectQuery(newExtrinsicObjectQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY, newExtrinsicObjectQuery, newExtrinsicObjectQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getOrganizationQuery() {
		return organizationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationQuery(OrganizationQueryType newOrganizationQuery, NotificationChain msgs) {
		OrganizationQueryType oldOrganizationQuery = organizationQuery;
		organizationQuery = newOrganizationQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY, oldOrganizationQuery, newOrganizationQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationQuery(OrganizationQueryType newOrganizationQuery) {
		if (newOrganizationQuery != organizationQuery) {
			NotificationChain msgs = null;
			if (organizationQuery != null)
				msgs = ((InternalEObject)organizationQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY, null, msgs);
			if (newOrganizationQuery != null)
				msgs = ((InternalEObject)newOrganizationQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY, null, msgs);
			msgs = basicSetOrganizationQuery(newOrganizationQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY, newOrganizationQuery, newOrganizationQuery));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY, oldServiceQuery, newServiceQuery);
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
				msgs = ((InternalEObject)serviceQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY, null, msgs);
			if (newServiceQuery != null)
				msgs = ((InternalEObject)newServiceQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY, null, msgs);
			msgs = basicSetServiceQuery(newServiceQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY, newServiceQuery, newServiceQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return basicSetRegistryObjectQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return basicSetRegistryEntryQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY:
				return basicSetAssociationQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				return basicSetAuditableEventQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY:
				return basicSetClassificationQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return basicSetClassificationNodeQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return basicSetClassificationSchemeQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY:
				return basicSetRegistryPackageQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY:
				return basicSetExtrinsicObjectQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY:
				return basicSetOrganizationQuery(null, msgs);
			case QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY:
				return basicSetServiceQuery(null, msgs);
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
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return getRegistryObjectQuery();
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return getRegistryEntryQuery();
			case QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY:
				return getAssociationQuery();
			case QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				return getAuditableEventQuery();
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY:
				return getClassificationQuery();
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return getClassificationNodeQuery();
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return getClassificationSchemeQuery();
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY:
				return getRegistryPackageQuery();
			case QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY:
				return getExtrinsicObjectQuery();
			case QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY:
				return getOrganizationQuery();
			case QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY:
				return getServiceQuery();
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
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY:
				setAssociationQuery((AssociationQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				setAuditableEventQuery((AuditableEventQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY:
				setClassificationQuery((ClassificationQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY:
				setRegistryPackageQuery((RegistryPackageQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY:
				setExtrinsicObjectQuery((ExtrinsicObjectQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)newValue);
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
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				setRegistryObjectQuery((RegistryObjectQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				setRegistryEntryQuery((RegistryEntryQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY:
				setAssociationQuery((AssociationQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				setAuditableEventQuery((AuditableEventQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY:
				setClassificationQuery((ClassificationQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				setClassificationNodeQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				setClassificationSchemeQuery((ClassificationSchemeQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY:
				setRegistryPackageQuery((RegistryPackageQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY:
				setExtrinsicObjectQuery((ExtrinsicObjectQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY:
				setOrganizationQuery((OrganizationQueryType)null);
				return;
			case QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY:
				setServiceQuery((ServiceQueryType)null);
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
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY:
				return registryObjectQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY:
				return registryEntryQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__ASSOCIATION_QUERY:
				return associationQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				return auditableEventQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_QUERY:
				return classificationQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY:
				return classificationNodeQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY:
				return classificationSchemeQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY:
				return registryPackageQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY:
				return extrinsicObjectQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__ORGANIZATION_QUERY:
				return organizationQuery != null;
			case QueryPackage.FILTER_QUERY_TYPE__SERVICE_QUERY:
				return serviceQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterQueryTypeImpl
