/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonQueryTypeImpl.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
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
import org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl#getAddressFilter <em>Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl#getPersonNameFilter <em>Person Name Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl#getEmailAddresseFilter <em>Email Addresse Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonQueryTypeImpl extends RegistryObjectQueryTypeImpl implements PersonQueryType {
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
	 * The cached value of the '{@link #getPersonNameFilter() <em>Person Name Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNameFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType personNameFilter = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.PERSON_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAddressFilter() {
		if (addressFilter == null) {
			addressFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.PERSON_QUERY_TYPE__ADDRESS_FILTER);
		}
		return addressFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getPersonNameFilter() {
		return personNameFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonNameFilter(FilterType newPersonNameFilter, NotificationChain msgs) {
		FilterType oldPersonNameFilter = personNameFilter;
		personNameFilter = newPersonNameFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER, oldPersonNameFilter, newPersonNameFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonNameFilter(FilterType newPersonNameFilter) {
		if (newPersonNameFilter != personNameFilter) {
			NotificationChain msgs = null;
			if (personNameFilter != null)
				msgs = ((InternalEObject)personNameFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER, null, msgs);
			if (newPersonNameFilter != null)
				msgs = ((InternalEObject)newPersonNameFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER, null, msgs);
			msgs = basicSetPersonNameFilter(newPersonNameFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER, newPersonNameFilter, newPersonNameFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTelephoneNumberFilter() {
		if (telephoneNumberFilter == null) {
			telephoneNumberFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER);
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
			emailAddresseFilter = new EObjectContainmentEList(FilterType.class, this, QueryPackage.PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER);
		}
		return emailAddresseFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.PERSON_QUERY_TYPE__ADDRESS_FILTER:
				return ((InternalEList)getAddressFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER:
				return basicSetPersonNameFilter(null, msgs);
			case QueryPackage.PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return ((InternalEList)getTelephoneNumberFilter()).basicRemove(otherEnd, msgs);
			case QueryPackage.PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				return ((InternalEList)getEmailAddresseFilter()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.PERSON_QUERY_TYPE__ADDRESS_FILTER:
				return getAddressFilter();
			case QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER:
				return getPersonNameFilter();
			case QueryPackage.PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return getTelephoneNumberFilter();
			case QueryPackage.PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				return getEmailAddresseFilter();
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
			case QueryPackage.PERSON_QUERY_TYPE__ADDRESS_FILTER:
				getAddressFilter().clear();
				getAddressFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER:
				setPersonNameFilter((FilterType)newValue);
				return;
			case QueryPackage.PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				getTelephoneNumberFilter().addAll((Collection)newValue);
				return;
			case QueryPackage.PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				getEmailAddresseFilter().clear();
				getEmailAddresseFilter().addAll((Collection)newValue);
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
			case QueryPackage.PERSON_QUERY_TYPE__ADDRESS_FILTER:
				getAddressFilter().clear();
				return;
			case QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER:
				setPersonNameFilter((FilterType)null);
				return;
			case QueryPackage.PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				getTelephoneNumberFilter().clear();
				return;
			case QueryPackage.PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				getEmailAddresseFilter().clear();
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
			case QueryPackage.PERSON_QUERY_TYPE__ADDRESS_FILTER:
				return addressFilter != null && !addressFilter.isEmpty();
			case QueryPackage.PERSON_QUERY_TYPE__PERSON_NAME_FILTER:
				return personNameFilter != null;
			case QueryPackage.PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER:
				return telephoneNumberFilter != null && !telephoneNumberFilter.isEmpty();
			case QueryPackage.PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER:
				return emailAddresseFilter != null && !emailAddresseFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonQueryTypeImpl
