/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryRequestTypeImpl.java,v 1.1 2006/10/19 20:16:12 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl#getRequestSlotList <em>Request Slot List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryRequestTypeImpl extends EObjectImpl implements RegistryRequestType {
	/**
	 * The cached value of the '{@link #getRequestSlotList() <em>Request Slot List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestSlotList()
	 * @generated
	 * @ordered
	 */
	protected SlotListType requestSlotList = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REGISTRY_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotListType getRequestSlotList() {
		return requestSlotList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestSlotList(SlotListType newRequestSlotList, NotificationChain msgs) {
		SlotListType oldRequestSlotList = requestSlotList;
		requestSlotList = newRequestSlotList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST, oldRequestSlotList, newRequestSlotList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestSlotList(SlotListType newRequestSlotList) {
		if (newRequestSlotList != requestSlotList) {
			NotificationChain msgs = null;
			if (requestSlotList != null)
				msgs = ((InternalEObject)requestSlotList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST, null, msgs);
			if (newRequestSlotList != null)
				msgs = ((InternalEObject)newRequestSlotList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST, null, msgs);
			msgs = basicSetRequestSlotList(newRequestSlotList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST, newRequestSlotList, newRequestSlotList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_REQUEST_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST:
				return basicSetRequestSlotList(null, msgs);
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
			case RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST:
				return getRequestSlotList();
			case RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT:
				return getComment();
			case RegistryPackage.REGISTRY_REQUEST_TYPE__ID:
				return getId();
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
			case RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST:
				setRequestSlotList((SlotListType)newValue);
				return;
			case RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case RegistryPackage.REGISTRY_REQUEST_TYPE__ID:
				setId((String)newValue);
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
			case RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST:
				setRequestSlotList((SlotListType)null);
				return;
			case RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RegistryPackage.REGISTRY_REQUEST_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST:
				return requestSlotList != null;
			case RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RegistryPackage.REGISTRY_REQUEST_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RegistryRequestTypeImpl
