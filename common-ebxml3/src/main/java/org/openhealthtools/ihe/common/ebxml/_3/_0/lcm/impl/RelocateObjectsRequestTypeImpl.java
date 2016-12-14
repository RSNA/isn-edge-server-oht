/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelocateObjectsRequestTypeImpl.java,v 1.1 2006/10/19 20:16:14 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;



import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relocate Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl#getSourceRegistry <em>Source Registry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl#getDestinationRegistry <em>Destination Registry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl#getOwnerAtSource <em>Owner At Source</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl#getOwnerAtDestination <em>Owner At Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelocateObjectsRequestTypeImpl extends RegistryRequestTypeImpl implements RelocateObjectsRequestType {
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
	 * The cached value of the '{@link #getSourceRegistry() <em>Source Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRegistry()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefType sourceRegistry = null;

	/**
	 * The cached value of the '{@link #getDestinationRegistry() <em>Destination Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationRegistry()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefType destinationRegistry = null;

	/**
	 * The cached value of the '{@link #getOwnerAtSource() <em>Owner At Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerAtSource()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefType ownerAtSource = null;

	/**
	 * The cached value of the '{@link #getOwnerAtDestination() <em>Owner At Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerAtDestination()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefType ownerAtDestination = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelocateObjectsRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LCMPackage.Literals.RELOCATE_OBJECTS_REQUEST_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, oldAdhocQuery, newAdhocQuery);
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
				msgs = ((InternalEObject)adhocQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			if (newAdhocQuery != null)
				msgs = ((InternalEObject)newAdhocQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			msgs = basicSetAdhocQuery(newAdhocQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY, newAdhocQuery, newAdhocQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getSourceRegistry() {
		return sourceRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRegistry(ObjectRefType newSourceRegistry, NotificationChain msgs) {
		ObjectRefType oldSourceRegistry = sourceRegistry;
		sourceRegistry = newSourceRegistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY, oldSourceRegistry, newSourceRegistry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRegistry(ObjectRefType newSourceRegistry) {
		if (newSourceRegistry != sourceRegistry) {
			NotificationChain msgs = null;
			if (sourceRegistry != null)
				msgs = ((InternalEObject)sourceRegistry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY, null, msgs);
			if (newSourceRegistry != null)
				msgs = ((InternalEObject)newSourceRegistry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY, null, msgs);
			msgs = basicSetSourceRegistry(newSourceRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY, newSourceRegistry, newSourceRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getDestinationRegistry() {
		return destinationRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationRegistry(ObjectRefType newDestinationRegistry, NotificationChain msgs) {
		ObjectRefType oldDestinationRegistry = destinationRegistry;
		destinationRegistry = newDestinationRegistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY, oldDestinationRegistry, newDestinationRegistry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationRegistry(ObjectRefType newDestinationRegistry) {
		if (newDestinationRegistry != destinationRegistry) {
			NotificationChain msgs = null;
			if (destinationRegistry != null)
				msgs = ((InternalEObject)destinationRegistry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY, null, msgs);
			if (newDestinationRegistry != null)
				msgs = ((InternalEObject)newDestinationRegistry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY, null, msgs);
			msgs = basicSetDestinationRegistry(newDestinationRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY, newDestinationRegistry, newDestinationRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getOwnerAtSource() {
		return ownerAtSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerAtSource(ObjectRefType newOwnerAtSource, NotificationChain msgs) {
		ObjectRefType oldOwnerAtSource = ownerAtSource;
		ownerAtSource = newOwnerAtSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE, oldOwnerAtSource, newOwnerAtSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerAtSource(ObjectRefType newOwnerAtSource) {
		if (newOwnerAtSource != ownerAtSource) {
			NotificationChain msgs = null;
			if (ownerAtSource != null)
				msgs = ((InternalEObject)ownerAtSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE, null, msgs);
			if (newOwnerAtSource != null)
				msgs = ((InternalEObject)newOwnerAtSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE, null, msgs);
			msgs = basicSetOwnerAtSource(newOwnerAtSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE, newOwnerAtSource, newOwnerAtSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getOwnerAtDestination() {
		return ownerAtDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerAtDestination(ObjectRefType newOwnerAtDestination, NotificationChain msgs) {
		ObjectRefType oldOwnerAtDestination = ownerAtDestination;
		ownerAtDestination = newOwnerAtDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION, oldOwnerAtDestination, newOwnerAtDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerAtDestination(ObjectRefType newOwnerAtDestination) {
		if (newOwnerAtDestination != ownerAtDestination) {
			NotificationChain msgs = null;
			if (ownerAtDestination != null)
				msgs = ((InternalEObject)ownerAtDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION, null, msgs);
			if (newOwnerAtDestination != null)
				msgs = ((InternalEObject)newOwnerAtDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION, null, msgs);
			msgs = basicSetOwnerAtDestination(newOwnerAtDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION, newOwnerAtDestination, newOwnerAtDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return basicSetAdhocQuery(null, msgs);
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY:
				return basicSetSourceRegistry(null, msgs);
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY:
				return basicSetDestinationRegistry(null, msgs);
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE:
				return basicSetOwnerAtSource(null, msgs);
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION:
				return basicSetOwnerAtDestination(null, msgs);
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
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return getAdhocQuery();
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY:
				return getSourceRegistry();
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY:
				return getDestinationRegistry();
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE:
				return getOwnerAtSource();
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION:
				return getOwnerAtDestination();
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
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)newValue);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY:
				setSourceRegistry((ObjectRefType)newValue);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY:
				setDestinationRegistry((ObjectRefType)newValue);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE:
				setOwnerAtSource((ObjectRefType)newValue);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION:
				setOwnerAtDestination((ObjectRefType)newValue);
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
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)null);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY:
				setSourceRegistry((ObjectRefType)null);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY:
				setDestinationRegistry((ObjectRefType)null);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE:
				setOwnerAtSource((ObjectRefType)null);
				return;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION:
				setOwnerAtDestination((ObjectRefType)null);
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
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY:
				return adhocQuery != null;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY:
				return sourceRegistry != null;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY:
				return destinationRegistry != null;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE:
				return ownerAtSource != null;
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION:
				return ownerAtDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //RelocateObjectsRequestTypeImpl
