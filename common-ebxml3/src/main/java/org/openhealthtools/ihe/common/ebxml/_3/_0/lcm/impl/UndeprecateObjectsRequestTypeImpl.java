/**
 * <copyright>
 * </copyright>
 *
 * $Id: UndeprecateObjectsRequestTypeImpl.java,v 1.1 2006/10/19 20:16:14 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;



import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Undeprecate Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UndeprecateObjectsRequestTypeImpl#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UndeprecateObjectsRequestTypeImpl#getObjectRefList <em>Object Ref List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UndeprecateObjectsRequestTypeImpl extends RegistryRequestTypeImpl implements UndeprecateObjectsRequestType {
	/**
	 * The cached value of the '{@link #getAdhocQuery() <em>Adhoc Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdhocQuery()
	 * @generated
	 * @ordered
	 */
	protected AdhocQueryType adhocQuery = null;

	/**
	 * The cached value of the '{@link #getObjectRefList() <em>Object Ref List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRefList()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefListType objectRefList = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndeprecateObjectsRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LCMPackage.Literals.UNDEPRECATE_OBJECTS_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryType getAdhocQuery() {
		return adhocQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdhocQuery(AdhocQueryType newAdhocQuery, NotificationChain msgs) {
		AdhocQueryType oldAdhocQuery = adhocQuery;
		adhocQuery = newAdhocQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, oldAdhocQuery, newAdhocQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdhocQuery(AdhocQueryType newAdhocQuery) {
		if (newAdhocQuery != adhocQuery) {
			NotificationChain msgs = null;
			if (adhocQuery != null)
				msgs = ((InternalEObject)adhocQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			if (newAdhocQuery != null)
				msgs = ((InternalEObject)newAdhocQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			msgs = basicSetAdhocQuery(newAdhocQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, newAdhocQuery, newAdhocQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefListType getObjectRefList() {
		return objectRefList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectRefList(ObjectRefListType newObjectRefList, NotificationChain msgs) {
		ObjectRefListType oldObjectRefList = objectRefList;
		objectRefList = newObjectRefList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, oldObjectRefList, newObjectRefList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRefList(ObjectRefListType newObjectRefList) {
		if (newObjectRefList != objectRefList) {
			NotificationChain msgs = null;
			if (objectRefList != null)
				msgs = ((InternalEObject)objectRefList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			if (newObjectRefList != null)
				msgs = ((InternalEObject)newObjectRefList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			msgs = basicSetObjectRefList(newObjectRefList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, newObjectRefList, newObjectRefList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return basicSetAdhocQuery(null, msgs);
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				return basicSetObjectRefList(null, msgs);
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
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return getAdhocQuery();
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				return getObjectRefList();
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
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)newValue);
				return;
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)newValue);
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
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)null);
				return;
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)null);
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
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return adhocQuery != null;
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				return objectRefList != null;
		}
		return super.eIsSet(featureID);
	}

} //UndeprecateObjectsRequestTypeImpl
