/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryTypeImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl#getCatalogingLatency <em>Cataloging Latency</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl#getConformanceProfile <em>Conformance Profile</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl#getReplicationSyncLatency <em>Replication Sync Latency</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl#getSpecificationVersion <em>Specification Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryTypeImpl extends RegistryObjectTypeImpl implements RegistryType {
	/**
	 * The default value of the '{@link #getCatalogingLatency() <em>Cataloging Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogingLatency()
	 * @generated
	 * @ordered
	 */
	protected static final Object CATALOGING_LATENCY_EDEFAULT = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getDuration(), "P1D");

	/**
	 * The cached value of the '{@link #getCatalogingLatency() <em>Cataloging Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogingLatency()
	 * @generated
	 * @ordered
	 */
	protected Object catalogingLatency = CATALOGING_LATENCY_EDEFAULT;

	/**
	 * This is true if the Cataloging Latency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean catalogingLatencyESet = false;

	/**
	 * The default value of the '{@link #getConformanceProfile() <em>Conformance Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceProfile()
	 * @generated
	 * @ordered
	 */
	protected static final ConformanceProfileType CONFORMANCE_PROFILE_EDEFAULT = ConformanceProfileType.REGISTRY_LITE_LITERAL;

	/**
	 * The cached value of the '{@link #getConformanceProfile() <em>Conformance Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceProfile()
	 * @generated
	 * @ordered
	 */
	protected ConformanceProfileType conformanceProfile = CONFORMANCE_PROFILE_EDEFAULT;

	/**
	 * This is true if the Conformance Profile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conformanceProfileESet = false;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

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
	 * The default value of the '{@link #getSpecificationVersion() <em>Specification Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificationVersion() <em>Specification Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationVersion()
	 * @generated
	 * @ordered
	 */
	protected String specificationVersion = SPECIFICATION_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.REGISTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCatalogingLatency() {
		return catalogingLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogingLatency(Object newCatalogingLatency) {
		Object oldCatalogingLatency = catalogingLatency;
		catalogingLatency = newCatalogingLatency;
		boolean oldCatalogingLatencyESet = catalogingLatencyESet;
		catalogingLatencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_TYPE__CATALOGING_LATENCY, oldCatalogingLatency, catalogingLatency, !oldCatalogingLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCatalogingLatency() {
		Object oldCatalogingLatency = catalogingLatency;
		boolean oldCatalogingLatencyESet = catalogingLatencyESet;
		catalogingLatency = CATALOGING_LATENCY_EDEFAULT;
		catalogingLatencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.REGISTRY_TYPE__CATALOGING_LATENCY, oldCatalogingLatency, CATALOGING_LATENCY_EDEFAULT, oldCatalogingLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCatalogingLatency() {
		return catalogingLatencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileType getConformanceProfile() {
		return conformanceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceProfile(ConformanceProfileType newConformanceProfile) {
		ConformanceProfileType oldConformanceProfile = conformanceProfile;
		conformanceProfile = newConformanceProfile == null ? CONFORMANCE_PROFILE_EDEFAULT : newConformanceProfile;
		boolean oldConformanceProfileESet = conformanceProfileESet;
		conformanceProfileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_TYPE__CONFORMANCE_PROFILE, oldConformanceProfile, conformanceProfile, !oldConformanceProfileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConformanceProfile() {
		ConformanceProfileType oldConformanceProfile = conformanceProfile;
		boolean oldConformanceProfileESet = conformanceProfileESet;
		conformanceProfile = CONFORMANCE_PROFILE_EDEFAULT;
		conformanceProfileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.REGISTRY_TYPE__CONFORMANCE_PROFILE, oldConformanceProfile, CONFORMANCE_PROFILE_EDEFAULT, oldConformanceProfileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConformanceProfile() {
		return conformanceProfileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_TYPE__OPERATOR, oldOperator, operator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_TYPE__REPLICATION_SYNC_LATENCY, oldReplicationSyncLatency, replicationSyncLatency, !oldReplicationSyncLatencyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.REGISTRY_TYPE__REPLICATION_SYNC_LATENCY, oldReplicationSyncLatency, REPLICATION_SYNC_LATENCY_EDEFAULT, oldReplicationSyncLatencyESet));
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
	public String getSpecificationVersion() {
		return specificationVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationVersion(String newSpecificationVersion) {
		String oldSpecificationVersion = specificationVersion;
		specificationVersion = newSpecificationVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.REGISTRY_TYPE__SPECIFICATION_VERSION, oldSpecificationVersion, specificationVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.REGISTRY_TYPE__CATALOGING_LATENCY:
				return getCatalogingLatency();
			case RimPackage.REGISTRY_TYPE__CONFORMANCE_PROFILE:
				return getConformanceProfile();
			case RimPackage.REGISTRY_TYPE__OPERATOR:
				return getOperator();
			case RimPackage.REGISTRY_TYPE__REPLICATION_SYNC_LATENCY:
				return getReplicationSyncLatency();
			case RimPackage.REGISTRY_TYPE__SPECIFICATION_VERSION:
				return getSpecificationVersion();
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
			case RimPackage.REGISTRY_TYPE__CATALOGING_LATENCY:
				setCatalogingLatency((Object)newValue);
				return;
			case RimPackage.REGISTRY_TYPE__CONFORMANCE_PROFILE:
				setConformanceProfile((ConformanceProfileType)newValue);
				return;
			case RimPackage.REGISTRY_TYPE__OPERATOR:
				setOperator((String)newValue);
				return;
			case RimPackage.REGISTRY_TYPE__REPLICATION_SYNC_LATENCY:
				setReplicationSyncLatency((Object)newValue);
				return;
			case RimPackage.REGISTRY_TYPE__SPECIFICATION_VERSION:
				setSpecificationVersion((String)newValue);
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
			case RimPackage.REGISTRY_TYPE__CATALOGING_LATENCY:
				unsetCatalogingLatency();
				return;
			case RimPackage.REGISTRY_TYPE__CONFORMANCE_PROFILE:
				unsetConformanceProfile();
				return;
			case RimPackage.REGISTRY_TYPE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case RimPackage.REGISTRY_TYPE__REPLICATION_SYNC_LATENCY:
				unsetReplicationSyncLatency();
				return;
			case RimPackage.REGISTRY_TYPE__SPECIFICATION_VERSION:
				setSpecificationVersion(SPECIFICATION_VERSION_EDEFAULT);
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
			case RimPackage.REGISTRY_TYPE__CATALOGING_LATENCY:
				return isSetCatalogingLatency();
			case RimPackage.REGISTRY_TYPE__CONFORMANCE_PROFILE:
				return isSetConformanceProfile();
			case RimPackage.REGISTRY_TYPE__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case RimPackage.REGISTRY_TYPE__REPLICATION_SYNC_LATENCY:
				return isSetReplicationSyncLatency();
			case RimPackage.REGISTRY_TYPE__SPECIFICATION_VERSION:
				return SPECIFICATION_VERSION_EDEFAULT == null ? specificationVersion != null : !SPECIFICATION_VERSION_EDEFAULT.equals(specificationVersion);
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
		result.append(" (catalogingLatency: ");
		if (catalogingLatencyESet) result.append(catalogingLatency); else result.append("<unset>");
		result.append(", conformanceProfile: ");
		if (conformanceProfileESet) result.append(conformanceProfile); else result.append("<unset>");
		result.append(", operator: ");
		result.append(operator);
		result.append(", replicationSyncLatency: ");
		if (replicationSyncLatencyESet) result.append(replicationSyncLatency); else result.append("<unset>");
		result.append(", specificationVersion: ");
		result.append(specificationVersion);
		result.append(')');
		return result.toString();
	}

} //RegistryTypeImpl
