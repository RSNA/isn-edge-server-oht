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
 * $Id: FilterQueryResultTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Query Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getAssociationQueryResult <em>Association Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getClassificationQueryResult <em>Classification Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getOrganizationQueryResult <em>Organization Query Result</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl#getServiceQueryResult <em>Service Query Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterQueryResultTypeImpl extends EObjectImpl implements FilterQueryResultType {
	/**
	 * The cached value of the '{@link #getRegistryObjectQueryResult() <em>Registry Object Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectQueryResult()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectListType registryObjectQueryResult = null;

	/**
	 * The cached value of the '{@link #getRegistryEntryQueryResult() <em>Registry Entry Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryEntryQueryResult()
	 * @generated
	 * @ordered
	 */
	protected RegistryEntryQueryResultType registryEntryQueryResult = null;

	/**
	 * The cached value of the '{@link #getAssociationQueryResult() <em>Association Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationQueryResult()
	 * @generated
	 * @ordered
	 */
	protected AssociationQueryResultType associationQueryResult = null;

	/**
	 * The cached value of the '{@link #getAuditableEventQueryResult() <em>Auditable Event Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditableEventQueryResult()
	 * @generated
	 * @ordered
	 */
	protected AuditableEventQueryResultType auditableEventQueryResult = null;

	/**
	 * The cached value of the '{@link #getClassificationQueryResult() <em>Classification Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationQueryResult()
	 * @generated
	 * @ordered
	 */
	protected ClassificationQueryResultType classificationQueryResult = null;

	/**
	 * The cached value of the '{@link #getClassificationNodeQueryResult() <em>Classification Node Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNodeQueryResult()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryResultType classificationNodeQueryResult = null;

	/**
	 * The cached value of the '{@link #getClassificationSchemeQueryResult() <em>Classification Scheme Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSchemeQueryResult()
	 * @generated
	 * @ordered
	 */
	protected ClassificationSchemeQueryResultType classificationSchemeQueryResult = null;

	/**
	 * The cached value of the '{@link #getRegistryPackageQueryResult() <em>Registry Package Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryPackageQueryResult()
	 * @generated
	 * @ordered
	 */
	protected RegistryPackageQueryResultType registryPackageQueryResult = null;

	/**
	 * The cached value of the '{@link #getExtrinsicObjectQueryResult() <em>Extrinsic Object Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrinsicObjectQueryResult()
	 * @generated
	 * @ordered
	 */
	protected ExtrinsicObjectQueryResultType extrinsicObjectQueryResult = null;

	/**
	 * The cached value of the '{@link #getOrganizationQueryResult() <em>Organization Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationQueryResult()
	 * @generated
	 * @ordered
	 */
	protected OrganizationQueryResultType organizationQueryResult = null;

	/**
	 * The cached value of the '{@link #getServiceQueryResult() <em>Service Query Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceQueryResult()
	 * @generated
	 * @ordered
	 */
	protected ServiceQueryResultType serviceQueryResult = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterQueryResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.FILTER_QUERY_RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getRegistryObjectQueryResult() {
		return registryObjectQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectQueryResult(RegistryObjectListType newRegistryObjectQueryResult, NotificationChain msgs) {
		RegistryObjectListType oldRegistryObjectQueryResult = registryObjectQueryResult;
		registryObjectQueryResult = newRegistryObjectQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT, oldRegistryObjectQueryResult, newRegistryObjectQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectQueryResult(RegistryObjectListType newRegistryObjectQueryResult) {
		if (newRegistryObjectQueryResult != registryObjectQueryResult) {
			NotificationChain msgs = null;
			if (registryObjectQueryResult != null)
				msgs = ((InternalEObject)registryObjectQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT, null, msgs);
			if (newRegistryObjectQueryResult != null)
				msgs = ((InternalEObject)newRegistryObjectQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT, null, msgs);
			msgs = basicSetRegistryObjectQueryResult(newRegistryObjectQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT, newRegistryObjectQueryResult, newRegistryObjectQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryResultType getRegistryEntryQueryResult() {
		return registryEntryQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntryQueryResult(RegistryEntryQueryResultType newRegistryEntryQueryResult, NotificationChain msgs) {
		RegistryEntryQueryResultType oldRegistryEntryQueryResult = registryEntryQueryResult;
		registryEntryQueryResult = newRegistryEntryQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT, oldRegistryEntryQueryResult, newRegistryEntryQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntryQueryResult(RegistryEntryQueryResultType newRegistryEntryQueryResult) {
		if (newRegistryEntryQueryResult != registryEntryQueryResult) {
			NotificationChain msgs = null;
			if (registryEntryQueryResult != null)
				msgs = ((InternalEObject)registryEntryQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT, null, msgs);
			if (newRegistryEntryQueryResult != null)
				msgs = ((InternalEObject)newRegistryEntryQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT, null, msgs);
			msgs = basicSetRegistryEntryQueryResult(newRegistryEntryQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT, newRegistryEntryQueryResult, newRegistryEntryQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationQueryResultType getAssociationQueryResult() {
		return associationQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationQueryResult(AssociationQueryResultType newAssociationQueryResult, NotificationChain msgs) {
		AssociationQueryResultType oldAssociationQueryResult = associationQueryResult;
		associationQueryResult = newAssociationQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT, oldAssociationQueryResult, newAssociationQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationQueryResult(AssociationQueryResultType newAssociationQueryResult) {
		if (newAssociationQueryResult != associationQueryResult) {
			NotificationChain msgs = null;
			if (associationQueryResult != null)
				msgs = ((InternalEObject)associationQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT, null, msgs);
			if (newAssociationQueryResult != null)
				msgs = ((InternalEObject)newAssociationQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT, null, msgs);
			msgs = basicSetAssociationQueryResult(newAssociationQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT, newAssociationQueryResult, newAssociationQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditableEventQueryResultType getAuditableEventQueryResult() {
		return auditableEventQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditableEventQueryResult(AuditableEventQueryResultType newAuditableEventQueryResult, NotificationChain msgs) {
		AuditableEventQueryResultType oldAuditableEventQueryResult = auditableEventQueryResult;
		auditableEventQueryResult = newAuditableEventQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT, oldAuditableEventQueryResult, newAuditableEventQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditableEventQueryResult(AuditableEventQueryResultType newAuditableEventQueryResult) {
		if (newAuditableEventQueryResult != auditableEventQueryResult) {
			NotificationChain msgs = null;
			if (auditableEventQueryResult != null)
				msgs = ((InternalEObject)auditableEventQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT, null, msgs);
			if (newAuditableEventQueryResult != null)
				msgs = ((InternalEObject)newAuditableEventQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT, null, msgs);
			msgs = basicSetAuditableEventQueryResult(newAuditableEventQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT, newAuditableEventQueryResult, newAuditableEventQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationQueryResultType getClassificationQueryResult() {
		return classificationQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationQueryResult(ClassificationQueryResultType newClassificationQueryResult, NotificationChain msgs) {
		ClassificationQueryResultType oldClassificationQueryResult = classificationQueryResult;
		classificationQueryResult = newClassificationQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT, oldClassificationQueryResult, newClassificationQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationQueryResult(ClassificationQueryResultType newClassificationQueryResult) {
		if (newClassificationQueryResult != classificationQueryResult) {
			NotificationChain msgs = null;
			if (classificationQueryResult != null)
				msgs = ((InternalEObject)classificationQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT, null, msgs);
			if (newClassificationQueryResult != null)
				msgs = ((InternalEObject)newClassificationQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT, null, msgs);
			msgs = basicSetClassificationQueryResult(newClassificationQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT, newClassificationQueryResult, newClassificationQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryResultType getClassificationNodeQueryResult() {
		return classificationNodeQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNodeQueryResult(ClassificationNodeQueryResultType newClassificationNodeQueryResult, NotificationChain msgs) {
		ClassificationNodeQueryResultType oldClassificationNodeQueryResult = classificationNodeQueryResult;
		classificationNodeQueryResult = newClassificationNodeQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT, oldClassificationNodeQueryResult, newClassificationNodeQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNodeQueryResult(ClassificationNodeQueryResultType newClassificationNodeQueryResult) {
		if (newClassificationNodeQueryResult != classificationNodeQueryResult) {
			NotificationChain msgs = null;
			if (classificationNodeQueryResult != null)
				msgs = ((InternalEObject)classificationNodeQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT, null, msgs);
			if (newClassificationNodeQueryResult != null)
				msgs = ((InternalEObject)newClassificationNodeQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT, null, msgs);
			msgs = basicSetClassificationNodeQueryResult(newClassificationNodeQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT, newClassificationNodeQueryResult, newClassificationNodeQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeQueryResultType getClassificationSchemeQueryResult() {
		return classificationSchemeQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSchemeQueryResult(ClassificationSchemeQueryResultType newClassificationSchemeQueryResult, NotificationChain msgs) {
		ClassificationSchemeQueryResultType oldClassificationSchemeQueryResult = classificationSchemeQueryResult;
		classificationSchemeQueryResult = newClassificationSchemeQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT, oldClassificationSchemeQueryResult, newClassificationSchemeQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSchemeQueryResult(ClassificationSchemeQueryResultType newClassificationSchemeQueryResult) {
		if (newClassificationSchemeQueryResult != classificationSchemeQueryResult) {
			NotificationChain msgs = null;
			if (classificationSchemeQueryResult != null)
				msgs = ((InternalEObject)classificationSchemeQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT, null, msgs);
			if (newClassificationSchemeQueryResult != null)
				msgs = ((InternalEObject)newClassificationSchemeQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT, null, msgs);
			msgs = basicSetClassificationSchemeQueryResult(newClassificationSchemeQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT, newClassificationSchemeQueryResult, newClassificationSchemeQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackageQueryResultType getRegistryPackageQueryResult() {
		return registryPackageQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryPackageQueryResult(RegistryPackageQueryResultType newRegistryPackageQueryResult, NotificationChain msgs) {
		RegistryPackageQueryResultType oldRegistryPackageQueryResult = registryPackageQueryResult;
		registryPackageQueryResult = newRegistryPackageQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT, oldRegistryPackageQueryResult, newRegistryPackageQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryPackageQueryResult(RegistryPackageQueryResultType newRegistryPackageQueryResult) {
		if (newRegistryPackageQueryResult != registryPackageQueryResult) {
			NotificationChain msgs = null;
			if (registryPackageQueryResult != null)
				msgs = ((InternalEObject)registryPackageQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT, null, msgs);
			if (newRegistryPackageQueryResult != null)
				msgs = ((InternalEObject)newRegistryPackageQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT, null, msgs);
			msgs = basicSetRegistryPackageQueryResult(newRegistryPackageQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT, newRegistryPackageQueryResult, newRegistryPackageQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrinsicObjectQueryResultType getExtrinsicObjectQueryResult() {
		return extrinsicObjectQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrinsicObjectQueryResult(ExtrinsicObjectQueryResultType newExtrinsicObjectQueryResult, NotificationChain msgs) {
		ExtrinsicObjectQueryResultType oldExtrinsicObjectQueryResult = extrinsicObjectQueryResult;
		extrinsicObjectQueryResult = newExtrinsicObjectQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT, oldExtrinsicObjectQueryResult, newExtrinsicObjectQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrinsicObjectQueryResult(ExtrinsicObjectQueryResultType newExtrinsicObjectQueryResult) {
		if (newExtrinsicObjectQueryResult != extrinsicObjectQueryResult) {
			NotificationChain msgs = null;
			if (extrinsicObjectQueryResult != null)
				msgs = ((InternalEObject)extrinsicObjectQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT, null, msgs);
			if (newExtrinsicObjectQueryResult != null)
				msgs = ((InternalEObject)newExtrinsicObjectQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT, null, msgs);
			msgs = basicSetExtrinsicObjectQueryResult(newExtrinsicObjectQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT, newExtrinsicObjectQueryResult, newExtrinsicObjectQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryResultType getOrganizationQueryResult() {
		return organizationQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationQueryResult(OrganizationQueryResultType newOrganizationQueryResult, NotificationChain msgs) {
		OrganizationQueryResultType oldOrganizationQueryResult = organizationQueryResult;
		organizationQueryResult = newOrganizationQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT, oldOrganizationQueryResult, newOrganizationQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationQueryResult(OrganizationQueryResultType newOrganizationQueryResult) {
		if (newOrganizationQueryResult != organizationQueryResult) {
			NotificationChain msgs = null;
			if (organizationQueryResult != null)
				msgs = ((InternalEObject)organizationQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT, null, msgs);
			if (newOrganizationQueryResult != null)
				msgs = ((InternalEObject)newOrganizationQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT, null, msgs);
			msgs = basicSetOrganizationQueryResult(newOrganizationQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT, newOrganizationQueryResult, newOrganizationQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQueryResultType getServiceQueryResult() {
		return serviceQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceQueryResult(ServiceQueryResultType newServiceQueryResult, NotificationChain msgs) {
		ServiceQueryResultType oldServiceQueryResult = serviceQueryResult;
		serviceQueryResult = newServiceQueryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT, oldServiceQueryResult, newServiceQueryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceQueryResult(ServiceQueryResultType newServiceQueryResult) {
		if (newServiceQueryResult != serviceQueryResult) {
			NotificationChain msgs = null;
			if (serviceQueryResult != null)
				msgs = ((InternalEObject)serviceQueryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT, null, msgs);
			if (newServiceQueryResult != null)
				msgs = ((InternalEObject)newServiceQueryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT, null, msgs);
			msgs = basicSetServiceQueryResult(newServiceQueryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT, newServiceQueryResult, newServiceQueryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT:
				return basicSetRegistryObjectQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT:
				return basicSetRegistryEntryQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT:
				return basicSetAssociationQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT:
				return basicSetAuditableEventQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT:
				return basicSetClassificationQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT:
				return basicSetClassificationNodeQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT:
				return basicSetClassificationSchemeQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT:
				return basicSetRegistryPackageQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT:
				return basicSetExtrinsicObjectQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT:
				return basicSetOrganizationQueryResult(null, msgs);
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT:
				return basicSetServiceQueryResult(null, msgs);
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
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT:
				return getRegistryObjectQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT:
				return getRegistryEntryQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT:
				return getAssociationQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT:
				return getAuditableEventQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT:
				return getClassificationQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT:
				return getClassificationNodeQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT:
				return getClassificationSchemeQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT:
				return getRegistryPackageQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT:
				return getExtrinsicObjectQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT:
				return getOrganizationQueryResult();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT:
				return getServiceQueryResult();
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
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT:
				setRegistryObjectQueryResult((RegistryObjectListType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT:
				setRegistryEntryQueryResult((RegistryEntryQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT:
				setAssociationQueryResult((AssociationQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT:
				setAuditableEventQueryResult((AuditableEventQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT:
				setClassificationQueryResult((ClassificationQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT:
				setClassificationNodeQueryResult((ClassificationNodeQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT:
				setClassificationSchemeQueryResult((ClassificationSchemeQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT:
				setRegistryPackageQueryResult((RegistryPackageQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT:
				setExtrinsicObjectQueryResult((ExtrinsicObjectQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT:
				setOrganizationQueryResult((OrganizationQueryResultType)newValue);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT:
				setServiceQueryResult((ServiceQueryResultType)newValue);
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
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT:
				setRegistryObjectQueryResult((RegistryObjectListType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT:
				setRegistryEntryQueryResult((RegistryEntryQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT:
				setAssociationQueryResult((AssociationQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT:
				setAuditableEventQueryResult((AuditableEventQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT:
				setClassificationQueryResult((ClassificationQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT:
				setClassificationNodeQueryResult((ClassificationNodeQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT:
				setClassificationSchemeQueryResult((ClassificationSchemeQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT:
				setRegistryPackageQueryResult((RegistryPackageQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT:
				setExtrinsicObjectQueryResult((ExtrinsicObjectQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT:
				setOrganizationQueryResult((OrganizationQueryResultType)null);
				return;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT:
				setServiceQueryResult((ServiceQueryResultType)null);
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
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT:
				return registryObjectQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT:
				return registryEntryQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT:
				return associationQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT:
				return auditableEventQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT:
				return classificationQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT:
				return classificationNodeQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT:
				return classificationSchemeQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT:
				return registryPackageQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT:
				return extrinsicObjectQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT:
				return organizationQueryResult != null;
			case QueryPackage.FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT:
				return serviceQueryResult != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterQueryResultTypeImpl
