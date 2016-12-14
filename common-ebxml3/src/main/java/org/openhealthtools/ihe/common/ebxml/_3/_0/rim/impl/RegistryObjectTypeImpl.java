/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryObjectTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
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

import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getVersionInfo <em>Version Info</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getLid <em>Lid</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryObjectTypeImpl extends IdentifiableTypeImpl implements RegistryObjectType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected InternationalStringType name = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected InternationalStringType description = null;

	/**
	 * The cached value of the '{@link #getVersionInfo() <em>Version Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionInfo()
	 * @generated
	 * @ordered
	 */
	protected VersionInfoType versionInfo = null;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList classification = null;

	/**
	 * The cached value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList externalIdentifier = null;

	/**
	 * The default value of the '{@link #getLid() <em>Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLid()
	 * @generated
	 * @ordered
	 */
	protected static final String LID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLid() <em>Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLid()
	 * @generated
	 * @ordered
	 */
	protected String lid = LID_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected String objectType = OBJECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.REGISTRY_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(InternationalStringType newName, NotificationChain msgs) {
		InternationalStringType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(InternationalStringType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_OBJECT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_OBJECT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(InternationalStringType newDescription, NotificationChain msgs) {
		InternationalStringType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(InternationalStringType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfoType getVersionInfo() {
		return versionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionInfo(VersionInfoType newVersionInfo, NotificationChain msgs) {
		VersionInfoType oldVersionInfo = versionInfo;
		versionInfo = newVersionInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO, oldVersionInfo, newVersionInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionInfo(VersionInfoType newVersionInfo) {
		if (newVersionInfo != versionInfo) {
			NotificationChain msgs = null;
			if (versionInfo != null)
				msgs = ((InternalEObject)versionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO, null, msgs);
			if (newVersionInfo != null)
				msgs = ((InternalEObject)newVersionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO, null, msgs);
			msgs = basicSetVersionInfo(newVersionInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO, newVersionInfo, newVersionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList(ClassificationType.class, this, RimPackage.REGISTRY_OBJECT_TYPE__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalIdentifier() {
		if (externalIdentifier == null) {
			externalIdentifier = new EObjectContainmentEList(ExternalIdentifierType.class, this, RimPackage.REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER);
		}
		return externalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLid() {
		return lid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLid(String newLid) {
		String oldLid = lid;
		lid = newLid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__LID, oldLid, lid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(String newObjectType) {
		String oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__OBJECT_TYPE, oldObjectType, objectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_OBJECT_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.REGISTRY_OBJECT_TYPE__NAME:
				return basicSetName(null, msgs);
			case RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO:
				return basicSetVersionInfo(null, msgs);
			case RimPackage.REGISTRY_OBJECT_TYPE__CLASSIFICATION:
				return ((InternalEList)getClassification()).basicRemove(otherEnd, msgs);
			case RimPackage.REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER:
				return ((InternalEList)getExternalIdentifier()).basicRemove(otherEnd, msgs);
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
			case RimPackage.REGISTRY_OBJECT_TYPE__NAME:
				return getName();
			case RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION:
				return getDescription();
			case RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO:
				return getVersionInfo();
			case RimPackage.REGISTRY_OBJECT_TYPE__CLASSIFICATION:
				return getClassification();
			case RimPackage.REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
			case RimPackage.REGISTRY_OBJECT_TYPE__LID:
				return getLid();
			case RimPackage.REGISTRY_OBJECT_TYPE__OBJECT_TYPE:
				return getObjectType();
			case RimPackage.REGISTRY_OBJECT_TYPE__STATUS:
				return getStatus();
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
			case RimPackage.REGISTRY_OBJECT_TYPE__NAME:
				setName((InternationalStringType)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION:
				setDescription((InternationalStringType)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO:
				setVersionInfo((VersionInfoType)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER:
				getExternalIdentifier().clear();
				getExternalIdentifier().addAll((Collection)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__LID:
				setLid((String)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__OBJECT_TYPE:
				setObjectType((String)newValue);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__STATUS:
				setStatus((String)newValue);
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
			case RimPackage.REGISTRY_OBJECT_TYPE__NAME:
				setName((InternationalStringType)null);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION:
				setDescription((InternationalStringType)null);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO:
				setVersionInfo((VersionInfoType)null);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__CLASSIFICATION:
				getClassification().clear();
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER:
				getExternalIdentifier().clear();
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__LID:
				setLid(LID_EDEFAULT);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__OBJECT_TYPE:
				setObjectType(OBJECT_TYPE_EDEFAULT);
				return;
			case RimPackage.REGISTRY_OBJECT_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case RimPackage.REGISTRY_OBJECT_TYPE__NAME:
				return name != null;
			case RimPackage.REGISTRY_OBJECT_TYPE__DESCRIPTION:
				return description != null;
			case RimPackage.REGISTRY_OBJECT_TYPE__VERSION_INFO:
				return versionInfo != null;
			case RimPackage.REGISTRY_OBJECT_TYPE__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case RimPackage.REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER:
				return externalIdentifier != null && !externalIdentifier.isEmpty();
			case RimPackage.REGISTRY_OBJECT_TYPE__LID:
				return LID_EDEFAULT == null ? lid != null : !LID_EDEFAULT.equals(lid);
			case RimPackage.REGISTRY_OBJECT_TYPE__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case RimPackage.REGISTRY_OBJECT_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (lid: ");
		result.append(lid);
		result.append(", objectType: ");
		result.append(objectType);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RegistryObjectTypeImpl
