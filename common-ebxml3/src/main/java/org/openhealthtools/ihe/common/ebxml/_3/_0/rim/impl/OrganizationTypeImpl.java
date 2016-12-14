/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrganizationTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
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
import org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl#getPrimaryContact <em>Primary Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationTypeImpl extends RegistryObjectTypeImpl implements OrganizationType {
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
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryContact() <em>Primary Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryContact()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryContact() <em>Primary Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryContact()
	 * @generated
	 * @ordered
	 */
	protected String primaryContact = PRIMARY_CONTACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.ORGANIZATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList(PostalAddressType.class, this, RimPackage.ORGANIZATION_TYPE__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EObjectContainmentEList(TelephoneNumberType.class, this, RimPackage.ORGANIZATION_TYPE__TELEPHONE_NUMBER);
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
			emailAddress = new EObjectContainmentEList(EmailAddressType.class, this, RimPackage.ORGANIZATION_TYPE__EMAIL_ADDRESS);
		}
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.ORGANIZATION_TYPE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryContact() {
		return primaryContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryContact(String newPrimaryContact) {
		String oldPrimaryContact = primaryContact;
		primaryContact = newPrimaryContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.ORGANIZATION_TYPE__PRIMARY_CONTACT, oldPrimaryContact, primaryContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.ORGANIZATION_TYPE__ADDRESS:
				return ((InternalEList)getAddress()).basicRemove(otherEnd, msgs);
			case RimPackage.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				return ((InternalEList)getTelephoneNumber()).basicRemove(otherEnd, msgs);
			case RimPackage.ORGANIZATION_TYPE__EMAIL_ADDRESS:
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
			case RimPackage.ORGANIZATION_TYPE__ADDRESS:
				return getAddress();
			case RimPackage.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case RimPackage.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				return getEmailAddress();
			case RimPackage.ORGANIZATION_TYPE__PARENT:
				return getParent();
			case RimPackage.ORGANIZATION_TYPE__PRIMARY_CONTACT:
				return getPrimaryContact();
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
			case RimPackage.ORGANIZATION_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection)newValue);
				return;
			case RimPackage.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection)newValue);
				return;
			case RimPackage.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				getEmailAddress().addAll((Collection)newValue);
				return;
			case RimPackage.ORGANIZATION_TYPE__PARENT:
				setParent((String)newValue);
				return;
			case RimPackage.ORGANIZATION_TYPE__PRIMARY_CONTACT:
				setPrimaryContact((String)newValue);
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
			case RimPackage.ORGANIZATION_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case RimPackage.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case RimPackage.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				return;
			case RimPackage.ORGANIZATION_TYPE__PARENT:
				setParent(PARENT_EDEFAULT);
				return;
			case RimPackage.ORGANIZATION_TYPE__PRIMARY_CONTACT:
				setPrimaryContact(PRIMARY_CONTACT_EDEFAULT);
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
			case RimPackage.ORGANIZATION_TYPE__ADDRESS:
				return address != null && !address.isEmpty();
			case RimPackage.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case RimPackage.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				return emailAddress != null && !emailAddress.isEmpty();
			case RimPackage.ORGANIZATION_TYPE__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
			case RimPackage.ORGANIZATION_TYPE__PRIMARY_CONTACT:
				return PRIMARY_CONTACT_EDEFAULT == null ? primaryContact != null : !PRIMARY_CONTACT_EDEFAULT.equals(primaryContact);
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
		result.append(" (parent: ");
		result.append(parent);
		result.append(", primaryContact: ");
		result.append(primaryContact);
		result.append(')');
		return result.toString();
	}

} //OrganizationTypeImpl
