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
 * $Id: UserTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserTypeImpl extends RegistryObjectTypeImpl implements UserType {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected PostalAddressType address = null;

	/**
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected PersonNameType personName = null;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList telephoneNumber = null;

	/**
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected EList emailAddress = null;

	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected String organization = ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.USER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddressType getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(PostalAddressType newAddress, NotificationChain msgs) {
		PostalAddressType oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.USER_TYPE__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(PostalAddressType newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.USER_TYPE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.USER_TYPE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.USER_TYPE__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType getPersonName() {
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonName(PersonNameType newPersonName, NotificationChain msgs) {
		PersonNameType oldPersonName = personName;
		personName = newPersonName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.USER_TYPE__PERSON_NAME, oldPersonName, newPersonName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(PersonNameType newPersonName) {
		if (newPersonName != personName) {
			NotificationChain msgs = null;
			if (personName != null)
				msgs = ((InternalEObject)personName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.USER_TYPE__PERSON_NAME, null, msgs);
			if (newPersonName != null)
				msgs = ((InternalEObject)newPersonName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.USER_TYPE__PERSON_NAME, null, msgs);
			msgs = basicSetPersonName(newPersonName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.USER_TYPE__PERSON_NAME, newPersonName, newPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EObjectContainmentEList(TelephoneNumberType.class, this, RimPackage.USER_TYPE__TELEPHONE_NUMBER);
		}
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmailAddress() {
		if (emailAddress == null) {
			emailAddress = new EObjectContainmentEList(EmailAddressType.class, this, RimPackage.USER_TYPE__EMAIL_ADDRESS);
		}
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.USER_TYPE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.USER_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.USER_TYPE__ADDRESS:
				return basicSetAddress(null, msgs);
			case RimPackage.USER_TYPE__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case RimPackage.USER_TYPE__TELEPHONE_NUMBER:
				return ((InternalEList)getTelephoneNumber()).basicRemove(otherEnd, msgs);
			case RimPackage.USER_TYPE__EMAIL_ADDRESS:
				return ((InternalEList)getEmailAddress()).basicRemove(otherEnd, msgs);
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
			case RimPackage.USER_TYPE__ADDRESS:
				return getAddress();
			case RimPackage.USER_TYPE__PERSON_NAME:
				return getPersonName();
			case RimPackage.USER_TYPE__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case RimPackage.USER_TYPE__EMAIL_ADDRESS:
				return getEmailAddress();
			case RimPackage.USER_TYPE__ORGANIZATION:
				return getOrganization();
			case RimPackage.USER_TYPE__URL:
				return getUrl();
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
			case RimPackage.USER_TYPE__ADDRESS:
				setAddress((PostalAddressType)newValue);
				return;
			case RimPackage.USER_TYPE__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case RimPackage.USER_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection)newValue);
				return;
			case RimPackage.USER_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				getEmailAddress().addAll((Collection)newValue);
				return;
			case RimPackage.USER_TYPE__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case RimPackage.USER_TYPE__URL:
				setUrl((String)newValue);
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
			case RimPackage.USER_TYPE__ADDRESS:
				setAddress((PostalAddressType)null);
				return;
			case RimPackage.USER_TYPE__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case RimPackage.USER_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case RimPackage.USER_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				return;
			case RimPackage.USER_TYPE__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case RimPackage.USER_TYPE__URL:
				setUrl(URL_EDEFAULT);
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
			case RimPackage.USER_TYPE__ADDRESS:
				return address != null;
			case RimPackage.USER_TYPE__PERSON_NAME:
				return personName != null;
			case RimPackage.USER_TYPE__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case RimPackage.USER_TYPE__EMAIL_ADDRESS:
				return emailAddress != null && !emailAddress.isEmpty();
			case RimPackage.USER_TYPE__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case RimPackage.USER_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (organization: ");
		result.append(organization);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //UserTypeImpl
