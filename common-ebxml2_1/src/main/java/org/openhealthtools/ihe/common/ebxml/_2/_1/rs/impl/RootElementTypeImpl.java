/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * <copyright>
 * </copyright>
 *
 * $Id: RootElementTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getSubmitObjectsRequest <em>Submit Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getUpdateObjectsRequest <em>Update Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getApproveObjectsRequest <em>Approve Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getRemoveObjectsRequest <em>Remove Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getAdhocQueryRequest <em>Adhoc Query Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getGetContentRequest <em>Get Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getAddSlotsRequest <em>Add Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getRemoveSlotsRequest <em>Remove Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getRegistryResponse <em>Registry Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl#getRegistryProfile <em>Registry Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootElementTypeImpl extends EObjectImpl implements RootElementType {
	/**
	 * The cached value of the '{@link #getSubmitObjectsRequest() <em>Submit Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitObjectsRequest()
	 * @generated
	 * @ordered
	 */
	protected SubmitObjectsRequestType submitObjectsRequest = null;

	/**
	 * The cached value of the '{@link #getUpdateObjectsRequest() <em>Update Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateObjectsRequest()
	 * @generated
	 * @ordered
	 */
	protected UpdateObjectsRequestType updateObjectsRequest = null;

	/**
	 * The cached value of the '{@link #getApproveObjectsRequest() <em>Approve Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproveObjectsRequest()
	 * @generated
	 * @ordered
	 */
	protected ApproveObjectsRequestType approveObjectsRequest = null;

	/**
	 * The cached value of the '{@link #getDeprecateObjectsRequest() <em>Deprecate Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecateObjectsRequest()
	 * @generated
	 * @ordered
	 */
	protected DeprecateObjectsRequestType deprecateObjectsRequest = null;

	/**
	 * The cached value of the '{@link #getRemoveObjectsRequest() <em>Remove Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveObjectsRequest()
	 * @generated
	 * @ordered
	 */
	protected RemoveObjectsRequestType removeObjectsRequest = null;

	/**
	 * The cached value of the '{@link #getAdhocQueryRequest() <em>Adhoc Query Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdhocQueryRequest()
	 * @generated
	 * @ordered
	 */
	protected AdhocQueryRequestType adhocQueryRequest = null;

	/**
	 * The cached value of the '{@link #getGetContentRequest() <em>Get Content Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetContentRequest()
	 * @generated
	 * @ordered
	 */
	protected GetContentRequestType getContentRequest = null;

	/**
	 * The cached value of the '{@link #getAddSlotsRequest() <em>Add Slots Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSlotsRequest()
	 * @generated
	 * @ordered
	 */
	protected AddSlotsRequestType addSlotsRequest = null;

	/**
	 * The cached value of the '{@link #getRemoveSlotsRequest() <em>Remove Slots Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveSlotsRequest()
	 * @generated
	 * @ordered
	 */
	protected RemoveSlotsRequestType removeSlotsRequest = null;

	/**
	 * The cached value of the '{@link #getRegistryResponse() <em>Registry Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryResponse()
	 * @generated
	 * @ordered
	 */
	protected RegistryResponseType registryResponse = null;

	/**
	 * The cached value of the '{@link #getRegistryProfile() <em>Registry Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryProfile()
	 * @generated
	 * @ordered
	 */
	protected RegistryProfileType registryProfile = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.ROOT_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitObjectsRequestType getSubmitObjectsRequest() {
		return submitObjectsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitObjectsRequest(SubmitObjectsRequestType newSubmitObjectsRequest, NotificationChain msgs) {
		SubmitObjectsRequestType oldSubmitObjectsRequest = submitObjectsRequest;
		submitObjectsRequest = newSubmitObjectsRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST, oldSubmitObjectsRequest, newSubmitObjectsRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitObjectsRequest(SubmitObjectsRequestType newSubmitObjectsRequest) {
		if (newSubmitObjectsRequest != submitObjectsRequest) {
			NotificationChain msgs = null;
			if (submitObjectsRequest != null)
				msgs = ((InternalEObject)submitObjectsRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST, null, msgs);
			if (newSubmitObjectsRequest != null)
				msgs = ((InternalEObject)newSubmitObjectsRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST, null, msgs);
			msgs = basicSetSubmitObjectsRequest(newSubmitObjectsRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST, newSubmitObjectsRequest, newSubmitObjectsRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateObjectsRequestType getUpdateObjectsRequest() {
		return updateObjectsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateObjectsRequest(UpdateObjectsRequestType newUpdateObjectsRequest, NotificationChain msgs) {
		UpdateObjectsRequestType oldUpdateObjectsRequest = updateObjectsRequest;
		updateObjectsRequest = newUpdateObjectsRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST, oldUpdateObjectsRequest, newUpdateObjectsRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateObjectsRequest(UpdateObjectsRequestType newUpdateObjectsRequest) {
		if (newUpdateObjectsRequest != updateObjectsRequest) {
			NotificationChain msgs = null;
			if (updateObjectsRequest != null)
				msgs = ((InternalEObject)updateObjectsRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST, null, msgs);
			if (newUpdateObjectsRequest != null)
				msgs = ((InternalEObject)newUpdateObjectsRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST, null, msgs);
			msgs = basicSetUpdateObjectsRequest(newUpdateObjectsRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST, newUpdateObjectsRequest, newUpdateObjectsRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproveObjectsRequestType getApproveObjectsRequest() {
		return approveObjectsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproveObjectsRequest(ApproveObjectsRequestType newApproveObjectsRequest, NotificationChain msgs) {
		ApproveObjectsRequestType oldApproveObjectsRequest = approveObjectsRequest;
		approveObjectsRequest = newApproveObjectsRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST, oldApproveObjectsRequest, newApproveObjectsRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproveObjectsRequest(ApproveObjectsRequestType newApproveObjectsRequest) {
		if (newApproveObjectsRequest != approveObjectsRequest) {
			NotificationChain msgs = null;
			if (approveObjectsRequest != null)
				msgs = ((InternalEObject)approveObjectsRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST, null, msgs);
			if (newApproveObjectsRequest != null)
				msgs = ((InternalEObject)newApproveObjectsRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST, null, msgs);
			msgs = basicSetApproveObjectsRequest(newApproveObjectsRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST, newApproveObjectsRequest, newApproveObjectsRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecateObjectsRequestType getDeprecateObjectsRequest() {
		return deprecateObjectsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecateObjectsRequest(DeprecateObjectsRequestType newDeprecateObjectsRequest, NotificationChain msgs) {
		DeprecateObjectsRequestType oldDeprecateObjectsRequest = deprecateObjectsRequest;
		deprecateObjectsRequest = newDeprecateObjectsRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST, oldDeprecateObjectsRequest, newDeprecateObjectsRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecateObjectsRequest(DeprecateObjectsRequestType newDeprecateObjectsRequest) {
		if (newDeprecateObjectsRequest != deprecateObjectsRequest) {
			NotificationChain msgs = null;
			if (deprecateObjectsRequest != null)
				msgs = ((InternalEObject)deprecateObjectsRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST, null, msgs);
			if (newDeprecateObjectsRequest != null)
				msgs = ((InternalEObject)newDeprecateObjectsRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST, null, msgs);
			msgs = basicSetDeprecateObjectsRequest(newDeprecateObjectsRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST, newDeprecateObjectsRequest, newDeprecateObjectsRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveObjectsRequestType getRemoveObjectsRequest() {
		return removeObjectsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveObjectsRequest(RemoveObjectsRequestType newRemoveObjectsRequest, NotificationChain msgs) {
		RemoveObjectsRequestType oldRemoveObjectsRequest = removeObjectsRequest;
		removeObjectsRequest = newRemoveObjectsRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST, oldRemoveObjectsRequest, newRemoveObjectsRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveObjectsRequest(RemoveObjectsRequestType newRemoveObjectsRequest) {
		if (newRemoveObjectsRequest != removeObjectsRequest) {
			NotificationChain msgs = null;
			if (removeObjectsRequest != null)
				msgs = ((InternalEObject)removeObjectsRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST, null, msgs);
			if (newRemoveObjectsRequest != null)
				msgs = ((InternalEObject)newRemoveObjectsRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST, null, msgs);
			msgs = basicSetRemoveObjectsRequest(newRemoveObjectsRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST, newRemoveObjectsRequest, newRemoveObjectsRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryRequestType getAdhocQueryRequest() {
		return adhocQueryRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdhocQueryRequest(AdhocQueryRequestType newAdhocQueryRequest, NotificationChain msgs) {
		AdhocQueryRequestType oldAdhocQueryRequest = adhocQueryRequest;
		adhocQueryRequest = newAdhocQueryRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST, oldAdhocQueryRequest, newAdhocQueryRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdhocQueryRequest(AdhocQueryRequestType newAdhocQueryRequest) {
		if (newAdhocQueryRequest != adhocQueryRequest) {
			NotificationChain msgs = null;
			if (adhocQueryRequest != null)
				msgs = ((InternalEObject)adhocQueryRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST, null, msgs);
			if (newAdhocQueryRequest != null)
				msgs = ((InternalEObject)newAdhocQueryRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST, null, msgs);
			msgs = basicSetAdhocQueryRequest(newAdhocQueryRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST, newAdhocQueryRequest, newAdhocQueryRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetContentRequestType getGetContentRequest() {
		return getContentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetContentRequest(GetContentRequestType newGetContentRequest, NotificationChain msgs) {
		GetContentRequestType oldGetContentRequest = getContentRequest;
		getContentRequest = newGetContentRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST, oldGetContentRequest, newGetContentRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetContentRequest(GetContentRequestType newGetContentRequest) {
		if (newGetContentRequest != getContentRequest) {
			NotificationChain msgs = null;
			if (getContentRequest != null)
				msgs = ((InternalEObject)getContentRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST, null, msgs);
			if (newGetContentRequest != null)
				msgs = ((InternalEObject)newGetContentRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST, null, msgs);
			msgs = basicSetGetContentRequest(newGetContentRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST, newGetContentRequest, newGetContentRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSlotsRequestType getAddSlotsRequest() {
		return addSlotsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddSlotsRequest(AddSlotsRequestType newAddSlotsRequest, NotificationChain msgs) {
		AddSlotsRequestType oldAddSlotsRequest = addSlotsRequest;
		addSlotsRequest = newAddSlotsRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST, oldAddSlotsRequest, newAddSlotsRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddSlotsRequest(AddSlotsRequestType newAddSlotsRequest) {
		if (newAddSlotsRequest != addSlotsRequest) {
			NotificationChain msgs = null;
			if (addSlotsRequest != null)
				msgs = ((InternalEObject)addSlotsRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST, null, msgs);
			if (newAddSlotsRequest != null)
				msgs = ((InternalEObject)newAddSlotsRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST, null, msgs);
			msgs = basicSetAddSlotsRequest(newAddSlotsRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST, newAddSlotsRequest, newAddSlotsRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveSlotsRequestType getRemoveSlotsRequest() {
		return removeSlotsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveSlotsRequest(RemoveSlotsRequestType newRemoveSlotsRequest, NotificationChain msgs) {
		RemoveSlotsRequestType oldRemoveSlotsRequest = removeSlotsRequest;
		removeSlotsRequest = newRemoveSlotsRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST, oldRemoveSlotsRequest, newRemoveSlotsRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveSlotsRequest(RemoveSlotsRequestType newRemoveSlotsRequest) {
		if (newRemoveSlotsRequest != removeSlotsRequest) {
			NotificationChain msgs = null;
			if (removeSlotsRequest != null)
				msgs = ((InternalEObject)removeSlotsRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST, null, msgs);
			if (newRemoveSlotsRequest != null)
				msgs = ((InternalEObject)newRemoveSlotsRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST, null, msgs);
			msgs = basicSetRemoveSlotsRequest(newRemoveSlotsRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST, newRemoveSlotsRequest, newRemoveSlotsRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryResponseType getRegistryResponse() {
		return registryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryResponse(RegistryResponseType newRegistryResponse, NotificationChain msgs) {
		RegistryResponseType oldRegistryResponse = registryResponse;
		registryResponse = newRegistryResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE, oldRegistryResponse, newRegistryResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryResponse(RegistryResponseType newRegistryResponse) {
		if (newRegistryResponse != registryResponse) {
			NotificationChain msgs = null;
			if (registryResponse != null)
				msgs = ((InternalEObject)registryResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE, null, msgs);
			if (newRegistryResponse != null)
				msgs = ((InternalEObject)newRegistryResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE, null, msgs);
			msgs = basicSetRegistryResponse(newRegistryResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE, newRegistryResponse, newRegistryResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryProfileType getRegistryProfile() {
		return registryProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryProfile(RegistryProfileType newRegistryProfile, NotificationChain msgs) {
		RegistryProfileType oldRegistryProfile = registryProfile;
		registryProfile = newRegistryProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE, oldRegistryProfile, newRegistryProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryProfile(RegistryProfileType newRegistryProfile) {
		if (newRegistryProfile != registryProfile) {
			NotificationChain msgs = null;
			if (registryProfile != null)
				msgs = ((InternalEObject)registryProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE, null, msgs);
			if (newRegistryProfile != null)
				msgs = ((InternalEObject)newRegistryProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE, null, msgs);
			msgs = basicSetRegistryProfile(newRegistryProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE, newRegistryProfile, newRegistryProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST:
				return basicSetSubmitObjectsRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST:
				return basicSetUpdateObjectsRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST:
				return basicSetApproveObjectsRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST:
				return basicSetDeprecateObjectsRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST:
				return basicSetRemoveObjectsRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST:
				return basicSetAdhocQueryRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST:
				return basicSetGetContentRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST:
				return basicSetAddSlotsRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST:
				return basicSetRemoveSlotsRequest(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE:
				return basicSetRegistryResponse(null, msgs);
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE:
				return basicSetRegistryProfile(null, msgs);
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
			case RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST:
				return getSubmitObjectsRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST:
				return getUpdateObjectsRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST:
				return getApproveObjectsRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST:
				return getDeprecateObjectsRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST:
				return getRemoveObjectsRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST:
				return getAdhocQueryRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST:
				return getGetContentRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST:
				return getAddSlotsRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST:
				return getRemoveSlotsRequest();
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE:
				return getRegistryResponse();
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE:
				return getRegistryProfile();
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
			case RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST:
				setSubmitObjectsRequest((SubmitObjectsRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST:
				setUpdateObjectsRequest((UpdateObjectsRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST:
				setApproveObjectsRequest((ApproveObjectsRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST:
				setDeprecateObjectsRequest((DeprecateObjectsRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST:
				setRemoveObjectsRequest((RemoveObjectsRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST:
				setAdhocQueryRequest((AdhocQueryRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST:
				setGetContentRequest((GetContentRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST:
				setAddSlotsRequest((AddSlotsRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST:
				setRemoveSlotsRequest((RemoveSlotsRequestType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE:
				setRegistryResponse((RegistryResponseType)newValue);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE:
				setRegistryProfile((RegistryProfileType)newValue);
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
			case RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST:
				setSubmitObjectsRequest((SubmitObjectsRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST:
				setUpdateObjectsRequest((UpdateObjectsRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST:
				setApproveObjectsRequest((ApproveObjectsRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST:
				setDeprecateObjectsRequest((DeprecateObjectsRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST:
				setRemoveObjectsRequest((RemoveObjectsRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST:
				setAdhocQueryRequest((AdhocQueryRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST:
				setGetContentRequest((GetContentRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST:
				setAddSlotsRequest((AddSlotsRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST:
				setRemoveSlotsRequest((RemoveSlotsRequestType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE:
				setRegistryResponse((RegistryResponseType)null);
				return;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE:
				setRegistryProfile((RegistryProfileType)null);
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
			case RegistryPackage.ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST:
				return submitObjectsRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST:
				return updateObjectsRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST:
				return approveObjectsRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST:
				return deprecateObjectsRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST:
				return removeObjectsRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST:
				return adhocQueryRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST:
				return getContentRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST:
				return addSlotsRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST:
				return removeSlotsRequest != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE:
				return registryResponse != null;
			case RegistryPackage.ROOT_ELEMENT_TYPE__REGISTRY_PROFILE:
				return registryProfile != null;
		}
		return super.eIsSet(featureID);
	}

} //RootElementTypeImpl
