/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonTypeImpl.java,v 1.1 2006/10/19 20:16:04 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl#getEmailAddress <em>Email Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonTypeImpl extends RegistryObjectTypeImpl implements PersonType {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList address = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.PERSON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList(PostalAddressType.class, this, RimPackage.PERSON_TYPE__ADDRESS);
		}
		return address;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.PERSON_TYPE__PERSON_NAME, oldPersonName, newPersonName);
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
				msgs = ((InternalEObject)personName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.PERSON_TYPE__PERSON_NAME, null, msgs);
			if (newPersonName != null)
				msgs = ((InternalEObject)newPersonName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.PERSON_TYPE__PERSON_NAME, null, msgs);
			msgs = basicSetPersonName(newPersonName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.PERSON_TYPE__PERSON_NAME, newPersonName, newPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EObjectContainmentEList(TelephoneNumberType.class, this, RimPackage.PERSON_TYPE__TELEPHONE_NUMBER);
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
			emailAddress = new EObjectContainmentEList(EmailAddressType.class, this, RimPackage.PERSON_TYPE__EMAIL_ADDRESS);
		}
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.PERSON_TYPE__ADDRESS:
				return ((InternalEList)getAddress()).basicRemove(otherEnd, msgs);
			case RimPackage.PERSON_TYPE__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case RimPackage.PERSON_TYPE__TELEPHONE_NUMBER:
				return ((InternalEList)getTelephoneNumber()).basicRemove(otherEnd, msgs);
			case RimPackage.PERSON_TYPE__EMAIL_ADDRESS:
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
			case RimPackage.PERSON_TYPE__ADDRESS:
				return getAddress();
			case RimPackage.PERSON_TYPE__PERSON_NAME:
				return getPersonName();
			case RimPackage.PERSON_TYPE__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case RimPackage.PERSON_TYPE__EMAIL_ADDRESS:
				return getEmailAddress();
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
			case RimPackage.PERSON_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection)newValue);
				return;
			case RimPackage.PERSON_TYPE__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case RimPackage.PERSON_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection)newValue);
				return;
			case RimPackage.PERSON_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				getEmailAddress().addAll((Collection)newValue);
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
			case RimPackage.PERSON_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case RimPackage.PERSON_TYPE__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case RimPackage.PERSON_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case RimPackage.PERSON_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
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
			case RimPackage.PERSON_TYPE__ADDRESS:
				return address != null && !address.isEmpty();
			case RimPackage.PERSON_TYPE__PERSON_NAME:
				return personName != null;
			case RimPackage.PERSON_TYPE__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case RimPackage.PERSON_TYPE__EMAIL_ADDRESS:
				return emailAddress != null && !emailAddress.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonTypeImpl
