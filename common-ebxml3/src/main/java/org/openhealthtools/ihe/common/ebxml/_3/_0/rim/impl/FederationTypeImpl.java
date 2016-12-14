/**
 * <copyright>
 * </copyright>
 *
 * $Id: FederationTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Federation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.FederationTypeImpl#getReplicationSyncLatency <em>Replication Sync Latency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FederationTypeImpl extends RegistryObjectTypeImpl implements FederationType {
	/**
	 * The default value of the '{@link #getReplicationSyncLatency() <em>Replication Sync Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationSyncLatency()
	 * @generated
	 * @ordered
	 */
	protected static final Object REPLICATION_SYNC_LATENCY_EDEFAULT = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getDuration(), "P1D");

	/**
	 * The cached value of the '{@link #getReplicationSyncLatency() <em>Replication Sync Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationSyncLatency()
	 * @generated
	 * @ordered
	 */
	protected Object replicationSyncLatency = REPLICATION_SYNC_LATENCY_EDEFAULT;

	/**
	 * This is true if the Replication Sync Latency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replicationSyncLatencyESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.FEDERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getReplicationSyncLatency() {
		return replicationSyncLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicationSyncLatency(Object newReplicationSyncLatency) {
		Object oldReplicationSyncLatency = replicationSyncLatency;
		replicationSyncLatency = newReplicationSyncLatency;
		boolean oldReplicationSyncLatencyESet = replicationSyncLatencyESet;
		replicationSyncLatencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.FEDERATION_TYPE__REPLICATION_SYNC_LATENCY, oldReplicationSyncLatency, replicationSyncLatency, !oldReplicationSyncLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplicationSyncLatency() {
		Object oldReplicationSyncLatency = replicationSyncLatency;
		boolean oldReplicationSyncLatencyESet = replicationSyncLatencyESet;
		replicationSyncLatency = REPLICATION_SYNC_LATENCY_EDEFAULT;
		replicationSyncLatencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.FEDERATION_TYPE__REPLICATION_SYNC_LATENCY, oldReplicationSyncLatency, REPLICATION_SYNC_LATENCY_EDEFAULT, oldReplicationSyncLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplicationSyncLatency() {
		return replicationSyncLatencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.FEDERATION_TYPE__REPLICATION_SYNC_LATENCY:
				return getReplicationSyncLatency();
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
			case RimPackage.FEDERATION_TYPE__REPLICATION_SYNC_LATENCY:
				setReplicationSyncLatency((Object)newValue);
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
			case RimPackage.FEDERATION_TYPE__REPLICATION_SYNC_LATENCY:
				unsetReplicationSyncLatency();
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
			case RimPackage.FEDERATION_TYPE__REPLICATION_SYNC_LATENCY:
				return isSetReplicationSyncLatency();
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
		result.append(" (replicationSyncLatency: ");
		if (replicationSyncLatencyESet) result.append(replicationSyncLatency); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FederationTypeImpl
