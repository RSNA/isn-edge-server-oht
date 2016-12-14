/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping of the same named interface in ebRIM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getCatalogingLatency <em>Cataloging Latency</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getConformanceProfile <em>Conformance Profile</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getReplicationSyncLatency <em>Replication Sync Latency</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getSpecificationVersion <em>Specification Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryType()
 * @model extendedMetaData="name='RegistryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Cataloging Latency</b></em>' attribute.
	 * The default value is <code>"P1D"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cataloging Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cataloging Latency</em>' attribute.
	 * @see #isSetCatalogingLatency()
	 * @see #unsetCatalogingLatency()
	 * @see #setCatalogingLatency(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryType_CatalogingLatency()
	 * @model default="P1D" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='catalogingLatency'"
	 * @generated
	 */
	Object getCatalogingLatency();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getCatalogingLatency <em>Cataloging Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cataloging Latency</em>' attribute.
	 * @see #isSetCatalogingLatency()
	 * @see #unsetCatalogingLatency()
	 * @see #getCatalogingLatency()
	 * @generated
	 */
	void setCatalogingLatency(Object value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getCatalogingLatency <em>Cataloging Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCatalogingLatency()
	 * @see #getCatalogingLatency()
	 * @see #setCatalogingLatency(Object)
	 * @generated
	 */
	void unsetCatalogingLatency();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getCatalogingLatency <em>Cataloging Latency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cataloging Latency</em>' attribute is set.
	 * @see #unsetCatalogingLatency()
	 * @see #getCatalogingLatency()
	 * @see #setCatalogingLatency(Object)
	 * @generated
	 */
	boolean isSetCatalogingLatency();

	/**
	 * Returns the value of the '<em><b>Conformance Profile</b></em>' attribute.
	 * The default value is <code>"registryLite"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance Profile</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
	 * @see #isSetConformanceProfile()
	 * @see #unsetConformanceProfile()
	 * @see #setConformanceProfile(ConformanceProfileType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryType_ConformanceProfile()
	 * @model default="registryLite" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='conformanceProfile'"
	 * @generated
	 */
	ConformanceProfileType getConformanceProfile();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getConformanceProfile <em>Conformance Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Profile</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
	 * @see #isSetConformanceProfile()
	 * @see #unsetConformanceProfile()
	 * @see #getConformanceProfile()
	 * @generated
	 */
	void setConformanceProfile(ConformanceProfileType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getConformanceProfile <em>Conformance Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConformanceProfile()
	 * @see #getConformanceProfile()
	 * @see #setConformanceProfile(ConformanceProfileType)
	 * @generated
	 */
	void unsetConformanceProfile();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getConformanceProfile <em>Conformance Profile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conformance Profile</em>' attribute is set.
	 * @see #unsetConformanceProfile()
	 * @see #getConformanceProfile()
	 * @see #setConformanceProfile(ConformanceProfileType)
	 * @generated
	 */
	boolean isSetConformanceProfile();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryType_Operator()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='operator'"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryType_ReplicationSyncLatency()
	 * @model default="P1D" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='replicationSyncLatency'"
	 * @generated
	 */
	Object getReplicationSyncLatency();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getReplicationSyncLatency <em>Replication Sync Latency</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getReplicationSyncLatency <em>Replication Sync Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplicationSyncLatency()
	 * @see #getReplicationSyncLatency()
	 * @see #setReplicationSyncLatency(Object)
	 * @generated
	 */
	void unsetReplicationSyncLatency();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getReplicationSyncLatency <em>Replication Sync Latency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replication Sync Latency</em>' attribute is set.
	 * @see #unsetReplicationSyncLatency()
	 * @see #getReplicationSyncLatency()
	 * @see #setReplicationSyncLatency(Object)
	 * @generated
	 */
	boolean isSetReplicationSyncLatency();

	/**
	 * Returns the value of the '<em><b>Specification Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Version</em>' attribute.
	 * @see #setSpecificationVersion(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryType_SpecificationVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='specificationVersion'"
	 * @generated
	 */
	String getSpecificationVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getSpecificationVersion <em>Specification Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Version</em>' attribute.
	 * @see #getSpecificationVersion()
	 * @generated
	 */
	void setSpecificationVersion(String value);

} // RegistryType
