/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectRefTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefTypeImpl#isCreateReplica <em>Create Replica</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectRefTypeImpl extends IdentifiableTypeImpl implements ObjectRefType {
	/**
	 * The default value of the '{@link #isCreateReplica() <em>Create Replica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateReplica()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_REPLICA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateReplica() <em>Create Replica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateReplica()
	 * @generated
	 * @ordered
	 */
	protected boolean createReplica = CREATE_REPLICA_EDEFAULT;

	/**
	 * This is true if the Create Replica attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createReplicaESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.OBJECT_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateReplica() {
		return createReplica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateReplica(boolean newCreateReplica) {
		boolean oldCreateReplica = createReplica;
		createReplica = newCreateReplica;
		boolean oldCreateReplicaESet = createReplicaESet;
		createReplicaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.OBJECT_REF_TYPE__CREATE_REPLICA, oldCreateReplica, createReplica, !oldCreateReplicaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateReplica() {
		boolean oldCreateReplica = createReplica;
		boolean oldCreateReplicaESet = createReplicaESet;
		createReplica = CREATE_REPLICA_EDEFAULT;
		createReplicaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.OBJECT_REF_TYPE__CREATE_REPLICA, oldCreateReplica, CREATE_REPLICA_EDEFAULT, oldCreateReplicaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateReplica() {
		return createReplicaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.OBJECT_REF_TYPE__CREATE_REPLICA:
				return isCreateReplica() ? Boolean.TRUE : Boolean.FALSE;
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
			case RimPackage.OBJECT_REF_TYPE__CREATE_REPLICA:
				setCreateReplica(((Boolean)newValue).booleanValue());
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
			case RimPackage.OBJECT_REF_TYPE__CREATE_REPLICA:
				unsetCreateReplica();
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
			case RimPackage.OBJECT_REF_TYPE__CREATE_REPLICA:
				return isSetCreateReplica();
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
		result.append(" (createReplica: ");
		if (createReplicaESet) result.append(createReplica); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObjectRefTypeImpl
