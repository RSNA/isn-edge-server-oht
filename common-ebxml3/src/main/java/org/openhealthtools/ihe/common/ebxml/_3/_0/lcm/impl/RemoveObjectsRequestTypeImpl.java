/**
 * <copyright>
 * </copyright>
 *
 * $Id: RemoveObjectsRequestTypeImpl.java,v 1.1 2006/10/19 20:16:14 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;



import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RemoveObjectsRequestTypeImpl#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RemoveObjectsRequestTypeImpl#getObjectRefList <em>Object Ref List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RemoveObjectsRequestTypeImpl#getDeletionScope <em>Deletion Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveObjectsRequestTypeImpl extends RegistryRequestTypeImpl implements RemoveObjectsRequestType {
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
	 * The default value of the '{@link #getDeletionScope() <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionScope()
	 * @generated
	 * @ordered
	 */
	protected static final String DELETION_SCOPE_EDEFAULT = "urn:oasis:names:tc:ebxml-regrep:DeletionScopeType:DeleteAll";

	/**
	 * The cached value of the '{@link #getDeletionScope() <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionScope()
	 * @generated
	 * @ordered
	 */
	protected String deletionScope = DELETION_SCOPE_EDEFAULT;

	/**
	 * This is true if the Deletion Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deletionScopeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveObjectsRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LCMPackage.Literals.REMOVE_OBJECTS_REQUEST_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, oldAdhocQuery, newAdhocQuery);
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
				msgs = ((InternalEObject)adhocQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			if (newAdhocQuery != null)
				msgs = ((InternalEObject)newAdhocQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			msgs = basicSetAdhocQuery(newAdhocQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, newAdhocQuery, newAdhocQuery));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, oldObjectRefList, newObjectRefList);
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
				msgs = ((InternalEObject)objectRefList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			if (newObjectRefList != null)
				msgs = ((InternalEObject)newObjectRefList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, null, msgs);
			msgs = basicSetObjectRefList(newObjectRefList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST, newObjectRefList, newObjectRefList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeletionScope() {
		return deletionScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletionScope(String newDeletionScope) {
		String oldDeletionScope = deletionScope;
		deletionScope = newDeletionScope;
		boolean oldDeletionScopeESet = deletionScopeESet;
		deletionScopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE, oldDeletionScope, deletionScope, !oldDeletionScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeletionScope() {
		String oldDeletionScope = deletionScope;
		boolean oldDeletionScopeESet = deletionScopeESet;
		deletionScope = DELETION_SCOPE_EDEFAULT;
		deletionScopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE, oldDeletionScope, DELETION_SCOPE_EDEFAULT, oldDeletionScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeletionScope() {
		return deletionScopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return basicSetAdhocQuery(null, msgs);
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
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
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return getAdhocQuery();
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				return getObjectRefList();
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				return getDeletionScope();
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
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)newValue);
				return;
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)newValue);
				return;
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				setDeletionScope((String)newValue);
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
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)null);
				return;
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)null);
				return;
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				unsetDeletionScope();
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
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return adhocQuery != null;
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST:
				return objectRefList != null;
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE:
				return isSetDeletionScope();
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
		result.append(" (deletionScope: ");
		if (deletionScopeESet) result.append(deletionScope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RemoveObjectsRequestTypeImpl
