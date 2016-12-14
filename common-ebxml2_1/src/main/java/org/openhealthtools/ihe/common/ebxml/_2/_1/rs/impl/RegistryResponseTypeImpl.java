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
 * $Id: RegistryResponseTypeImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl#getAdhocQueryResponse <em>Adhoc Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl#getGetContentResponse <em>Get Content Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistryResponseTypeImpl extends EObjectImpl implements RegistryResponseType {
	/**
	 * The cached value of the '{@link #getAdhocQueryResponse() <em>Adhoc Query Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdhocQueryResponse()
	 * @generated
	 * @ordered
	 */
	protected AdhocQueryResponseType adhocQueryResponse = null;

	/**
	 * The cached value of the '{@link #getGetContentResponse() <em>Get Content Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetContentResponse()
	 * @generated
	 * @ordered
	 */
	protected GetContentResponseType getContentResponse = null;

	/**
	 * The cached value of the '{@link #getRegistryErrorList() <em>Registry Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryErrorList()
	 * @generated
	 * @ordered
	 */
	protected RegistryErrorListType registryErrorList = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.SUCCESS_LITERAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.REGISTRY_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryResponseType getAdhocQueryResponse() {
		return adhocQueryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdhocQueryResponse(AdhocQueryResponseType newAdhocQueryResponse, NotificationChain msgs) {
		AdhocQueryResponseType oldAdhocQueryResponse = adhocQueryResponse;
		adhocQueryResponse = newAdhocQueryResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE, oldAdhocQueryResponse, newAdhocQueryResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdhocQueryResponse(AdhocQueryResponseType newAdhocQueryResponse) {
		if (newAdhocQueryResponse != adhocQueryResponse) {
			NotificationChain msgs = null;
			if (adhocQueryResponse != null)
				msgs = ((InternalEObject)adhocQueryResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE, null, msgs);
			if (newAdhocQueryResponse != null)
				msgs = ((InternalEObject)newAdhocQueryResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE, null, msgs);
			msgs = basicSetAdhocQueryResponse(newAdhocQueryResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE, newAdhocQueryResponse, newAdhocQueryResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetContentResponseType getGetContentResponse() {
		return getContentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetContentResponse(GetContentResponseType newGetContentResponse, NotificationChain msgs) {
		GetContentResponseType oldGetContentResponse = getContentResponse;
		getContentResponse = newGetContentResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE, oldGetContentResponse, newGetContentResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetContentResponse(GetContentResponseType newGetContentResponse) {
		if (newGetContentResponse != getContentResponse) {
			NotificationChain msgs = null;
			if (getContentResponse != null)
				msgs = ((InternalEObject)getContentResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE, null, msgs);
			if (newGetContentResponse != null)
				msgs = ((InternalEObject)newGetContentResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE, null, msgs);
			msgs = basicSetGetContentResponse(newGetContentResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE, newGetContentResponse, newGetContentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorListType getRegistryErrorList() {
		return registryErrorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryErrorList(RegistryErrorListType newRegistryErrorList, NotificationChain msgs) {
		RegistryErrorListType oldRegistryErrorList = registryErrorList;
		registryErrorList = newRegistryErrorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, oldRegistryErrorList, newRegistryErrorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryErrorList(RegistryErrorListType newRegistryErrorList) {
		if (newRegistryErrorList != registryErrorList) {
			NotificationChain msgs = null;
			if (registryErrorList != null)
				msgs = ((InternalEObject)registryErrorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, null, msgs);
			if (newRegistryErrorList != null)
				msgs = ((InternalEObject)newRegistryErrorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, null, msgs);
			msgs = basicSetRegistryErrorList(newRegistryErrorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST, newRegistryErrorList, newRegistryErrorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		StatusType oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE:
				return basicSetAdhocQueryResponse(null, msgs);
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE:
				return basicSetGetContentResponse(null, msgs);
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				return basicSetRegistryErrorList(null, msgs);
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE:
				return getAdhocQueryResponse();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE:
				return getGetContentResponse();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				return getRegistryErrorList();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				return getStatus();
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE:
				setAdhocQueryResponse((AdhocQueryResponseType)newValue);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE:
				setGetContentResponse((GetContentResponseType)newValue);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)newValue);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				setStatus((StatusType)newValue);
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE:
				setAdhocQueryResponse((AdhocQueryResponseType)null);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE:
				setGetContentResponse((GetContentResponseType)null);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)null);
				return;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				unsetStatus();
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
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE:
				return adhocQueryResponse != null;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE:
				return getContentResponse != null;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST:
				return registryErrorList != null;
			case RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS:
				return isSetStatus();
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
		result.append(" (status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegistryResponseTypeImpl
