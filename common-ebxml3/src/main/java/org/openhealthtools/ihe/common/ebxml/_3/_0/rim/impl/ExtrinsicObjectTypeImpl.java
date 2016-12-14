/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtrinsicObjectTypeImpl.java,v 1.1 2006/10/19 20:16:04 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extrinsic Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExtrinsicObjectTypeImpl#getContentVersionInfo <em>Content Version Info</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExtrinsicObjectTypeImpl#isIsOpaque <em>Is Opaque</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExtrinsicObjectTypeImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtrinsicObjectTypeImpl extends RegistryObjectTypeImpl implements ExtrinsicObjectType {
	/**
	 * The cached value of the '{@link #getContentVersionInfo() <em>Content Version Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersionInfo()
	 * @generated
	 * @ordered
	 */
	protected VersionInfoType contentVersionInfo = null;

	/**
	 * The default value of the '{@link #isIsOpaque() <em>Is Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpaque()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPAQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOpaque() <em>Is Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpaque()
	 * @generated
	 * @ordered
	 */
	protected boolean isOpaque = IS_OPAQUE_EDEFAULT;

	/**
	 * This is true if the Is Opaque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isOpaqueESet = false;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = "application/octet-stream";

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * This is true if the Mime Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mimeTypeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtrinsicObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.EXTRINSIC_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfoType getContentVersionInfo() {
		return contentVersionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentVersionInfo(VersionInfoType newContentVersionInfo, NotificationChain msgs) {
		VersionInfoType oldContentVersionInfo = contentVersionInfo;
		contentVersionInfo = newContentVersionInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO, oldContentVersionInfo, newContentVersionInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentVersionInfo(VersionInfoType newContentVersionInfo) {
		if (newContentVersionInfo != contentVersionInfo) {
			NotificationChain msgs = null;
			if (contentVersionInfo != null)
				msgs = ((InternalEObject)contentVersionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO, null, msgs);
			if (newContentVersionInfo != null)
				msgs = ((InternalEObject)newContentVersionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO, null, msgs);
			msgs = basicSetContentVersionInfo(newContentVersionInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO, newContentVersionInfo, newContentVersionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOpaque() {
		return isOpaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOpaque(boolean newIsOpaque) {
		boolean oldIsOpaque = isOpaque;
		isOpaque = newIsOpaque;
		boolean oldIsOpaqueESet = isOpaqueESet;
		isOpaqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.EXTRINSIC_OBJECT_TYPE__IS_OPAQUE, oldIsOpaque, isOpaque, !oldIsOpaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsOpaque() {
		boolean oldIsOpaque = isOpaque;
		boolean oldIsOpaqueESet = isOpaqueESet;
		isOpaque = IS_OPAQUE_EDEFAULT;
		isOpaqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.EXTRINSIC_OBJECT_TYPE__IS_OPAQUE, oldIsOpaque, IS_OPAQUE_EDEFAULT, oldIsOpaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsOpaque() {
		return isOpaqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		boolean oldMimeTypeESet = mimeTypeESet;
		mimeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.EXTRINSIC_OBJECT_TYPE__MIME_TYPE, oldMimeType, mimeType, !oldMimeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMimeType() {
		String oldMimeType = mimeType;
		boolean oldMimeTypeESet = mimeTypeESet;
		mimeType = MIME_TYPE_EDEFAULT;
		mimeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.EXTRINSIC_OBJECT_TYPE__MIME_TYPE, oldMimeType, MIME_TYPE_EDEFAULT, oldMimeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMimeType() {
		return mimeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO:
				return basicSetContentVersionInfo(null, msgs);
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
			case RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO:
				return getContentVersionInfo();
			case RimPackage.EXTRINSIC_OBJECT_TYPE__IS_OPAQUE:
				return isIsOpaque() ? Boolean.TRUE : Boolean.FALSE;
			case RimPackage.EXTRINSIC_OBJECT_TYPE__MIME_TYPE:
				return getMimeType();
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
			case RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO:
				setContentVersionInfo((VersionInfoType)newValue);
				return;
			case RimPackage.EXTRINSIC_OBJECT_TYPE__IS_OPAQUE:
				setIsOpaque(((Boolean)newValue).booleanValue());
				return;
			case RimPackage.EXTRINSIC_OBJECT_TYPE__MIME_TYPE:
				setMimeType((String)newValue);
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
			case RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO:
				setContentVersionInfo((VersionInfoType)null);
				return;
			case RimPackage.EXTRINSIC_OBJECT_TYPE__IS_OPAQUE:
				unsetIsOpaque();
				return;
			case RimPackage.EXTRINSIC_OBJECT_TYPE__MIME_TYPE:
				unsetMimeType();
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
			case RimPackage.EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO:
				return contentVersionInfo != null;
			case RimPackage.EXTRINSIC_OBJECT_TYPE__IS_OPAQUE:
				return isSetIsOpaque();
			case RimPackage.EXTRINSIC_OBJECT_TYPE__MIME_TYPE:
				return isSetMimeType();
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
		result.append(" (isOpaque: ");
		if (isOpaqueESet) result.append(isOpaque); else result.append("<unset>");
		result.append(", mimeType: ");
		if (mimeTypeESet) result.append(mimeType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExtrinsicObjectTypeImpl
