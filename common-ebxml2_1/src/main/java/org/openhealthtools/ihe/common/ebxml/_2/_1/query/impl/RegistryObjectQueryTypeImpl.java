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
 * $Id: RegistryObjectQueryTypeImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Object Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getRegistryObjectFilter <em>Registry Object Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getExternalIdentifierFilter <em>External Identifier Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getAuditableEventQuery <em>Auditable Event Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getNameBranch <em>Name Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getDescriptionBranch <em>Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getClassifiedByBranch <em>Classified By Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getSlotBranch <em>Slot Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getSourceAssociationBranch <em>Source Association Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl#getTargetAssociationBranch <em>Target Association Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryObjectQueryTypeImpl extends EObjectImpl implements RegistryObjectQueryType {
	/**
	 * The cached value of the '{@link #getRegistryObjectFilter() <em>Registry Object Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryObjectFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType registryObjectFilter = null;

	/**
	 * The cached value of the '{@link #getExternalIdentifierFilter() <em>External Identifier Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIdentifierFilter()
	 * @generated
	 * @ordered
	 */
	protected EList externalIdentifierFilter = null;

	/**
	 * The cached value of the '{@link #getAuditableEventQuery() <em>Auditable Event Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditableEventQuery()
	 * @generated
	 * @ordered
	 */
	protected EList auditableEventQuery = null;

	/**
	 * The cached value of the '{@link #getNameBranch() <em>Name Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameBranch()
	 * @generated
	 * @ordered
	 */
	protected InternationalStringBranchType nameBranch = null;

	/**
	 * The cached value of the '{@link #getDescriptionBranch() <em>Description Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionBranch()
	 * @generated
	 * @ordered
	 */
	protected InternationalStringBranchType descriptionBranch = null;

	/**
	 * The cached value of the '{@link #getClassifiedByBranch() <em>Classified By Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedByBranch()
	 * @generated
	 * @ordered
	 */
	protected EList classifiedByBranch = null;

	/**
	 * The cached value of the '{@link #getSlotBranch() <em>Slot Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotBranch()
	 * @generated
	 * @ordered
	 */
	protected EList slotBranch = null;

	/**
	 * The cached value of the '{@link #getSourceAssociationBranch() <em>Source Association Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAssociationBranch()
	 * @generated
	 * @ordered
	 */
	protected EList sourceAssociationBranch = null;

	/**
	 * The cached value of the '{@link #getTargetAssociationBranch() <em>Target Association Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAssociationBranch()
	 * @generated
	 * @ordered
	 */
	protected EList targetAssociationBranch = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryObjectQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.REGISTRY_OBJECT_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getRegistryObjectFilter() {
		return registryObjectFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectFilter(FilterType newRegistryObjectFilter, NotificationChain msgs) {
		FilterType oldRegistryObjectFilter = registryObjectFilter;
		registryObjectFilter = newRegistryObjectFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER, oldRegistryObjectFilter, newRegistryObjectFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectFilter(FilterType newRegistryObjectFilter) {
		if (newRegistryObjectFilter != registryObjectFilter) {
			NotificationChain msgs = null;
			if (registryObjectFilter != null)
				msgs = ((InternalEObject)registryObjectFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER, null, msgs);
			if (newRegistryObjectFilter != null)
				msgs = ((InternalEObject)newRegistryObjectFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER, null, msgs);
			msgs = basicSetRegistryObjectFilter(newRegistryObjectFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER, newRegistryObjectFilter, newRegistryObjectFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalIdentifierFilter() {
		if (externalIdentifierFilter == null) {
			externalIdentifierFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER);
		}
		return externalIdentifierFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuditableEventQuery() {
		if (auditableEventQuery == null) {
			auditableEventQuery = new EObjectContainmentEList(AuditableEventQueryType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY);
		}
		return auditableEventQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringBranchType getNameBranch() {
		return nameBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameBranch(InternationalStringBranchType newNameBranch, NotificationChain msgs) {
		InternationalStringBranchType oldNameBranch = nameBranch;
		nameBranch = newNameBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH, oldNameBranch, newNameBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameBranch(InternationalStringBranchType newNameBranch) {
		if (newNameBranch != nameBranch) {
			NotificationChain msgs = null;
			if (nameBranch != null)
				msgs = ((InternalEObject)nameBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH, null, msgs);
			if (newNameBranch != null)
				msgs = ((InternalEObject)newNameBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH, null, msgs);
			msgs = basicSetNameBranch(newNameBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH, newNameBranch, newNameBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringBranchType getDescriptionBranch() {
		return descriptionBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionBranch(InternationalStringBranchType newDescriptionBranch, NotificationChain msgs) {
		InternationalStringBranchType oldDescriptionBranch = descriptionBranch;
		descriptionBranch = newDescriptionBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH, oldDescriptionBranch, newDescriptionBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionBranch(InternationalStringBranchType newDescriptionBranch) {
		if (newDescriptionBranch != descriptionBranch) {
			NotificationChain msgs = null;
			if (descriptionBranch != null)
				msgs = ((InternalEObject)descriptionBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH, null, msgs);
			if (newDescriptionBranch != null)
				msgs = ((InternalEObject)newDescriptionBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH, null, msgs);
			msgs = basicSetDescriptionBranch(newDescriptionBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH, newDescriptionBranch, newDescriptionBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassifiedByBranch() {
		if (classifiedByBranch == null) {
			classifiedByBranch = new EObjectContainmentEList(ClassifiedByBranchType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH);
		}
		return classifiedByBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSlotBranch() {
		if (slotBranch == null) {
			slotBranch = new EObjectContainmentEList(SlotBranchType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH);
		}
		return slotBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceAssociationBranch() {
		if (sourceAssociationBranch == null) {
			sourceAssociationBranch = new EObjectContainmentEList(AssociationBranchType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH);
		}
		return sourceAssociationBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetAssociationBranch() {
		if (targetAssociationBranch == null) {
			targetAssociationBranch = new EObjectContainmentEList(AssociationBranchType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH);
		}
		return targetAssociationBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER:
				return basicSetRegistryObjectFilter(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER:
				return ((InternalEList)getExternalIdentifierFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				return ((InternalEList)getAuditableEventQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				return basicSetNameBranch(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				return basicSetDescriptionBranch(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH:
				return ((InternalEList)getClassifiedByBranch()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				return ((InternalEList)getSlotBranch()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH:
				return ((InternalEList)getSourceAssociationBranch()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH:
				return ((InternalEList)getTargetAssociationBranch()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER:
				return getRegistryObjectFilter();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER:
				return getExternalIdentifierFilter();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				return getAuditableEventQuery();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				return getNameBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				return getDescriptionBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH:
				return getClassifiedByBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				return getSlotBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH:
				return getSourceAssociationBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH:
				return getTargetAssociationBranch();
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER:
				setRegistryObjectFilter((FilterType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER:
				getExternalIdentifierFilter().clear();
				getExternalIdentifierFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				getAuditableEventQuery().clear();
				getAuditableEventQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				setNameBranch((InternationalStringBranchType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				setDescriptionBranch((InternationalStringBranchType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH:
				getClassifiedByBranch().clear();
				getClassifiedByBranch().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				getSlotBranch().clear();
				getSlotBranch().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH:
				getSourceAssociationBranch().clear();
				getSourceAssociationBranch().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH:
				getTargetAssociationBranch().clear();
				getTargetAssociationBranch().addAll((Collection)newValue);
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER:
				setRegistryObjectFilter((FilterType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER:
				getExternalIdentifierFilter().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				getAuditableEventQuery().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				setNameBranch((InternationalStringBranchType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				setDescriptionBranch((InternationalStringBranchType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH:
				getClassifiedByBranch().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				getSlotBranch().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH:
				getSourceAssociationBranch().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH:
				getTargetAssociationBranch().clear();
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER:
				return registryObjectFilter != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER:
				return externalIdentifierFilter != null && !externalIdentifierFilter.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY:
				return auditableEventQuery != null && !auditableEventQuery.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				return nameBranch != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				return descriptionBranch != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH:
				return classifiedByBranch != null && !classifiedByBranch.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				return slotBranch != null && !slotBranch.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH:
				return sourceAssociationBranch != null && !sourceAssociationBranch.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH:
				return targetAssociationBranch != null && !targetAssociationBranch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegistryObjectQueryTypeImpl
