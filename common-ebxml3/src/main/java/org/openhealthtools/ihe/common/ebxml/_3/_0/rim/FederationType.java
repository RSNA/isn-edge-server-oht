/**
 * <copyright>
 * </copyright>
 *
 * $Id: FederationType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Federation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping of the same named interface in ebRIM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType#getReplicationSyncLatency <em>Replication Sync Latency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getFederationType()
 * @model extendedMetaData="name='FederationType' kind='elementOnly'"
 * @generated
 */
public interface FederationType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Replication Sync Latency</b></em>' attribute.
	 * The default value is <code>"P1D"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication Sync Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication Sync Latency</em>' attribute.
	 * @see #isSetReplicationSyncLatency()
	 * @see #unsetReplicationSyncLatency()
	 * @see #setReplicationSyncLatency(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getFederationType_ReplicationSyncLatency()
	 * @model default="P1D" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='replicationSyncLatency'"
	 * @generated
	 */
	Object getReplicationSyncLatency();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType#getReplicationSyncLatency <em>Replication Sync Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Sync Latency</em>' attribute.
	 * @see #isSetReplicationSyncLatency()
	 * @see #unsetReplicationSyncLatency()
	 * @see #getReplicationSyncLatency()
	 * @generated
	 */
	void setReplicationSyncLatency(Object value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType#getReplicationSyncLatency <em>Replication Sync Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplicationSyncLatency()
	 * @see #getReplicationSyncLatency()
	 * @see #setReplicationSyncLatency(Object)
	 * @generated
	 */
	void unsetReplicationSyncLatency();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType#getReplicationSyncLatency <em>Replication Sync Latency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replication Sync Latency</em>' attribute is set.
	 * @see #unsetReplicationSyncLatency()
	 * @see #getReplicationSyncLatency()
	 * @see #setReplicationSyncLatency(Object)
	 * @generated
	 */
	boolean isSetReplicationSyncLatency();

} // FederationType
