/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrganizationQueryTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
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

import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl#getAddressFilter <em>Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl#getEmailAddresseFilter <em>Email Addresse Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl#getParentQuery <em>Parent Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl#getChildOrganizationQuery <em>Child Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl#getPrimaryContactQuery <em>Primary Contact Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationQueryTypeImpl extends RegistryObjectQueryTypeImpl implements OrganizationQueryType {
	/**
	 * The cached value of the '{@link #getAddressFilter() <em>Address Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressFilter()
	 * @generated
	 * @ordered
	 */
	protected EList addressFilter = null;

	/**
	 * The cached value of the '{@link #getTelephoneNumberFilter() <em>Telephone Number Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumberFilter()
	 * @generated
	 * @ordered
	 */
	protected EList telephoneNumberFilter = null;

	/**
	 * The cached value of the '{@link #getEmailAddresseFilter() <em>Email Addresse Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddresseFilter()
	 * @generated
	 * @ordered
	 */
	protected EList emailAddresseFilter = null;

	/**
	 * The cached value of the '{@link #getParentQuery() <em>Parent Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentQuery()
	 * @generated
	 * @ordered
	 */
	protected OrganizationQueryType parentQuery = null;

	/**
	 * The cached value of the '{@link #getChildOrganizationQuery() <em>Child Organization Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildOrganizationQuery()
	 * @generated
	 * @ordered
	 */
	protected EList childOrganizationQuery = null;

	/**
	 * The cached value of the '{@link #getPrimaryContactQuery() <em>Primary Contact Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryContactQuery()
	 * @generated
	 * @ordered
	 */
	protected PersonQueryType primaryContactQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ORGANIZATION_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAddressFilter() {
		if (addressFilter == null) {
			addressFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER);
		}
		return addressFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTelephoneNumberFilter() {
		if (telephoneNumberFilter == null) {
			telephoneNumberFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER);
		}
		return telephoneNumberFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmailAddresseFilter() {
		if (emailAddresseFilter == null) {
			emailAddresseFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER);
		}
		return emailAddresseFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType getParentQuery() {
		return parentQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentQuery(OrganizationQueryType newParentQuery, NotificationChain msgs) {
		OrganizationQueryType oldParentQuery = parentQuery;
		parentQuery = newParentQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY, oldParentQuery, newParentQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentQuery(OrganizationQueryType newParentQuery) {
		if (newParentQuery != parentQuery) {
			NotificationChain msgs = null;
			if (parentQuery != null)
				msgs = ((InternalEObject)parentQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY, null, msgs);
			if (newParentQuery != null)
				msgs = ((InternalEObject)newParentQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY, null, msgs);
			msgs = basicSetParentQuery(newParentQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY, newParentQuery, newParentQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildOrganizationQuery() {
		if (childOrganizationQuery == null) {
			childOrganizationQuery = new EObjectContainmentEList(OrganizationQueryType.class, this, QueryPackage.ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY);
		}
		return childOrganizationQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonQueryType getPrimaryContactQuery() {
		return primaryContactQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryContactQuery(PersonQueryType newPrimaryContactQuery, NotificationChain msgs) {
		PersonQueryType oldPrimaryContactQuery = primaryContactQuery;
		primaryContactQuery = newPrimaryContactQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY, oldPrimaryContactQuery, newPrimaryContactQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryContactQuery(PersonQueryType newPrimaryContactQuery) {
		if (newPrimaryContactQuery != primaryContactQuery) {
			NotificationChain msgs = null;
			if (primaryContactQuery != null)
				msgs = ((InternalEObject)primaryContactQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY, null, msgs);
			if (newPrimaryContactQuery != null)
				msgs = ((InternalEObject)newPrimaryContactQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY, null, msgs);
			msgs = basicSetPrimaryContactQuery(newPrimaryContactQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY, newPrimaryContactQuery, newPrimaryContactQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER:
				return ((InternalEList)getAddressFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return ((InternalEList)getTelephoneNumberFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				return ((InternalEList)getEmailAddresseFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY:
				return basicSetParentQuery(null, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY:
				return ((InternalEList)getChildOrganizationQuery()).basicRemove(otherEnd, msgs);
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY:
				return basicSetPrimaryContactQuery(null, msgs);
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER:
				return getAddressFilter();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return getTelephoneNumberFilter();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				return getEmailAddresseFilter();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY:
				return getParentQuery();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY:
				return getChildOrganizationQuery();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY:
				return getPrimaryContactQuery();
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER:
				getAddressFilter().clear();
				getAddressFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				getTelephoneNumberFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				getEmailAddresseFilter().clear();
				getEmailAddresseFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY:
				setParentQuery((OrganizationQueryType)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY:
				getChildOrganizationQuery().clear();
				getChildOrganizationQuery().addAll((Collection)newValue);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY:
				setPrimaryContactQuery((PersonQueryType)newValue);
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER:
				getAddressFilter().clear();
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				getEmailAddresseFilter().clear();
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY:
				setParentQuery((OrganizationQueryType)null);
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY:
				getChildOrganizationQuery().clear();
				return;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY:
				setPrimaryContactQuery((PersonQueryType)null);
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
			case QueryPackage.ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER:
				return addressFilter != null && !addressFilter.isEmpty();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return telephoneNumberFilter != null && !telephoneNumberFilter.isEmpty();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				return emailAddresseFilter != null && !emailAddresseFilter.isEmpty();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PARENT_QUERY:
				return parentQuery != null;
			case QueryPackage.ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY:
				return childOrganizationQuery != null && !childOrganizationQuery.isEmpty();
			case QueryPackage.ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY:
				return primaryContactQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //OrganizationQueryTypeImpl
