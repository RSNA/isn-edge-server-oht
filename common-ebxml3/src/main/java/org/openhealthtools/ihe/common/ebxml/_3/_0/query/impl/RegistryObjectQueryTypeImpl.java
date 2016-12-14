/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryObjectQueryTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
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

import org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Object Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getSlotBranch <em>Slot Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getNameBranch <em>Name Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getDescriptionBranch <em>Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getVersionInfoFilter <em>Version Info Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getExternalIdentifierQuery <em>External Identifier Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getObjectTypeQuery <em>Object Type Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getStatusQuery <em>Status Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getSourceAssociationQuery <em>Source Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl#getTargetAssociationQuery <em>Target Association Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryObjectQueryTypeImpl extends FilterQueryTypeImpl implements RegistryObjectQueryType {
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
	 * The cached value of the '{@link #getVersionInfoFilter() <em>Version Info Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionInfoFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType versionInfoFilter = null;

	/**
	 * The cached value of the '{@link #getClassificationQuery() <em>Classification Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationQuery()
	 * @generated
	 * @ordered
	 */
	protected EList classificationQuery = null;

	/**
	 * The cached value of the '{@link #getExternalIdentifierQuery() <em>External Identifier Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIdentifierQuery()
	 * @generated
	 * @ordered
	 */
	protected EList externalIdentifierQuery = null;

	/**
	 * The cached value of the '{@link #getObjectTypeQuery() <em>Object Type Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType objectTypeQuery = null;

	/**
	 * The cached value of the '{@link #getStatusQuery() <em>Status Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType statusQuery = null;

	/**
	 * The cached value of the '{@link #getSourceAssociationQuery() <em>Source Association Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAssociationQuery()
	 * @generated
	 * @ordered
	 */
	protected EList sourceAssociationQuery = null;

	/**
	 * The cached value of the '{@link #getTargetAssociationQuery() <em>Target Association Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAssociationQuery()
	 * @generated
	 * @ordered
	 */
	protected EList targetAssociationQuery = null;

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
	public FilterType getVersionInfoFilter() {
		return versionInfoFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionInfoFilter(FilterType newVersionInfoFilter, NotificationChain msgs) {
		FilterType oldVersionInfoFilter = versionInfoFilter;
		versionInfoFilter = newVersionInfoFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER, oldVersionInfoFilter, newVersionInfoFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionInfoFilter(FilterType newVersionInfoFilter) {
		if (newVersionInfoFilter != versionInfoFilter) {
			NotificationChain msgs = null;
			if (versionInfoFilter != null)
				msgs = ((InternalEObject)versionInfoFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER, null, msgs);
			if (newVersionInfoFilter != null)
				msgs = ((InternalEObject)newVersionInfoFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER, null, msgs);
			msgs = basicSetVersionInfoFilter(newVersionInfoFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER, newVersionInfoFilter, newVersionInfoFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassificationQuery() {
		if (classificationQuery == null) {
			classificationQuery = new EObjectContainmentEList(ClassificationQueryType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY);
		}
		return classificationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalIdentifierQuery() {
		if (externalIdentifierQuery == null) {
			externalIdentifierQuery = new EObjectContainmentEList(ExternalIdentifierQueryType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY);
		}
		return externalIdentifierQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getObjectTypeQuery() {
		return objectTypeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectTypeQuery(ClassificationNodeQueryType newObjectTypeQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldObjectTypeQuery = objectTypeQuery;
		objectTypeQuery = newObjectTypeQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY, oldObjectTypeQuery, newObjectTypeQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeQuery(ClassificationNodeQueryType newObjectTypeQuery) {
		if (newObjectTypeQuery != objectTypeQuery) {
			NotificationChain msgs = null;
			if (objectTypeQuery != null)
				msgs = ((InternalEObject)objectTypeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY, null, msgs);
			if (newObjectTypeQuery != null)
				msgs = ((InternalEObject)newObjectTypeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY, null, msgs);
			msgs = basicSetObjectTypeQuery(newObjectTypeQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY, newObjectTypeQuery, newObjectTypeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getStatusQuery() {
		return statusQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusQuery(ClassificationNodeQueryType newStatusQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldStatusQuery = statusQuery;
		statusQuery = newStatusQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY, oldStatusQuery, newStatusQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusQuery(ClassificationNodeQueryType newStatusQuery) {
		if (newStatusQuery != statusQuery) {
			NotificationChain msgs = null;
			if (statusQuery != null)
				msgs = ((InternalEObject)statusQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY, null, msgs);
			if (newStatusQuery != null)
				msgs = ((InternalEObject)newStatusQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY, null, msgs);
			msgs = basicSetStatusQuery(newStatusQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY, newStatusQuery, newStatusQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceAssociationQuery() {
		if (sourceAssociationQuery == null) {
			sourceAssociationQuery = new EObjectContainmentEList(AssociationQueryType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY);
		}
		return sourceAssociationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetAssociationQuery() {
		if (targetAssociationQuery == null) {
			targetAssociationQuery = new EObjectContainmentEList(AssociationQueryType.class, this, QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY);
		}
		return targetAssociationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				return ((InternalEList)getSlotBranch()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				return basicSetNameBranch(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				return basicSetDescriptionBranch(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER:
				return basicSetVersionInfoFilter(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY:
				return ((InternalEList)getClassificationQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY:
				return ((InternalEList)getExternalIdentifierQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY:
				return basicSetObjectTypeQuery(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY:
				return basicSetStatusQuery(null, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY:
				return ((InternalEList)getSourceAssociationQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY:
				return ((InternalEList)getTargetAssociationQuery()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				return getSlotBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				return getNameBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				return getDescriptionBranch();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER:
				return getVersionInfoFilter();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY:
				return getClassificationQuery();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY:
				return getExternalIdentifierQuery();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY:
				return getObjectTypeQuery();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY:
				return getStatusQuery();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY:
				return getSourceAssociationQuery();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY:
				return getTargetAssociationQuery();
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				getSlotBranch().clear();
				getSlotBranch().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				setNameBranch((InternationalStringBranchType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				setDescriptionBranch((InternationalStringBranchType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER:
				setVersionInfoFilter((FilterType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY:
				getClassificationQuery().clear();
				getClassificationQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY:
				getExternalIdentifierQuery().clear();
				getExternalIdentifierQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY:
				setObjectTypeQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY:
				setStatusQuery((ClassificationNodeQueryType)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY:
				getSourceAssociationQuery().clear();
				getSourceAssociationQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY:
				getTargetAssociationQuery().clear();
				getTargetAssociationQuery().addAll((Collection)newValue);
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				getSlotBranch().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				setNameBranch((InternationalStringBranchType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				setDescriptionBranch((InternationalStringBranchType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER:
				setVersionInfoFilter((FilterType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY:
				getClassificationQuery().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY:
				getExternalIdentifierQuery().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY:
				setObjectTypeQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY:
				setStatusQuery((ClassificationNodeQueryType)null);
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY:
				getSourceAssociationQuery().clear();
				return;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY:
				getTargetAssociationQuery().clear();
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
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH:
				return slotBranch != null && !slotBranch.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH:
				return nameBranch != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH:
				return descriptionBranch != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER:
				return versionInfoFilter != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY:
				return classificationQuery != null && !classificationQuery.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY:
				return externalIdentifierQuery != null && !externalIdentifierQuery.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY:
				return objectTypeQuery != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY:
				return statusQuery != null;
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY:
				return sourceAssociationQuery != null && !sourceAssociationQuery.isEmpty();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY:
				return targetAssociationQuery != null && !targetAssociationQuery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegistryObjectQueryTypeImpl
