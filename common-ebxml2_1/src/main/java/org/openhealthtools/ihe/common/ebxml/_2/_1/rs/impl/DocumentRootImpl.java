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
 * $Id: DocumentRootImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RequestAcceptedResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getAddSlotsRequest <em>Add Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getApproveObjectsRequest <em>Approve Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getOptionalFeaturesSupported <em>Optional Features Supported</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRegistryError <em>Registry Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRegistryProfile <em>Registry Profile</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRegistryResponse <em>Registry Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRemoveObjectsRequest <em>Remove Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRemoveSlotsRequest <em>Remove Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRequestAcceptedResponse <em>Request Accepted Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getSubmitObjectsRequest <em>Submit Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl#getUpdateObjectsRequest <em>Update Objects Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap = null;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RegistryPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RegistryPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSlotsRequestType getAddSlotsRequest() {
		return (AddSlotsRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__ADD_SLOTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddSlotsRequest(AddSlotsRequestType newAddSlotsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__ADD_SLOTS_REQUEST, newAddSlotsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddSlotsRequest(AddSlotsRequestType newAddSlotsRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__ADD_SLOTS_REQUEST, newAddSlotsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproveObjectsRequestType getApproveObjectsRequest() {
		return (ApproveObjectsRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproveObjectsRequest(ApproveObjectsRequestType newApproveObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST, newApproveObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproveObjectsRequest(ApproveObjectsRequestType newApproveObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST, newApproveObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecateObjectsRequestType getDeprecateObjectsRequest() {
		return (DeprecateObjectsRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecateObjectsRequest(DeprecateObjectsRequestType newDeprecateObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST, newDeprecateObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecateObjectsRequest(DeprecateObjectsRequestType newDeprecateObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST, newDeprecateObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalFeaturesSupportedType getOptionalFeaturesSupported() {
		return (OptionalFeaturesSupportedType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalFeaturesSupported(OptionalFeaturesSupportedType newOptionalFeaturesSupported, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED, newOptionalFeaturesSupported, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalFeaturesSupported(OptionalFeaturesSupportedType newOptionalFeaturesSupported) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED, newOptionalFeaturesSupported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorType getRegistryError() {
		return (RegistryErrorType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryError(RegistryErrorType newRegistryError, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR, newRegistryError, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryError(RegistryErrorType newRegistryError) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR, newRegistryError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorListType getRegistryErrorList() {
		return (RegistryErrorListType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryErrorList(RegistryErrorListType newRegistryErrorList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR_LIST, newRegistryErrorList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryErrorList(RegistryErrorListType newRegistryErrorList) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR_LIST, newRegistryErrorList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryProfileType getRegistryProfile() {
		return (RegistryProfileType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PROFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryProfile(RegistryProfileType newRegistryProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PROFILE, newRegistryProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryProfile(RegistryProfileType newRegistryProfile) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_PROFILE, newRegistryProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryResponseType getRegistryResponse() {
		return (RegistryResponseType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryResponse(RegistryResponseType newRegistryResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_RESPONSE, newRegistryResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryResponse(RegistryResponseType newRegistryResponse) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_RESPONSE, newRegistryResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveObjectsRequestType getRemoveObjectsRequest() {
		return (RemoveObjectsRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveObjectsRequest(RemoveObjectsRequestType newRemoveObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST, newRemoveObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveObjectsRequest(RemoveObjectsRequestType newRemoveObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST, newRemoveObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveSlotsRequestType getRemoveSlotsRequest() {
		return (RemoveSlotsRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveSlotsRequest(RemoveSlotsRequestType newRemoveSlotsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST, newRemoveSlotsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveSlotsRequest(RemoveSlotsRequestType newRemoveSlotsRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST, newRemoveSlotsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAcceptedResponseType getRequestAcceptedResponse() {
		return (RequestAcceptedResponseType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestAcceptedResponse(RequestAcceptedResponseType newRequestAcceptedResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE, newRequestAcceptedResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestAcceptedResponse(RequestAcceptedResponseType newRequestAcceptedResponse) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE, newRequestAcceptedResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementType getRootElement() {
		return (RootElementType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__ROOT_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootElement(RootElementType newRootElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__ROOT_ELEMENT, newRootElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(RootElementType newRootElement) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__ROOT_ELEMENT, newRootElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitObjectsRequestType getSubmitObjectsRequest() {
		return (SubmitObjectsRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitObjectsRequest(SubmitObjectsRequestType newSubmitObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST, newSubmitObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitObjectsRequest(SubmitObjectsRequestType newSubmitObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST, newSubmitObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateObjectsRequestType getUpdateObjectsRequest() {
		return (UpdateObjectsRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateObjectsRequest(UpdateObjectsRequestType newUpdateObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST, newUpdateObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateObjectsRequest(UpdateObjectsRequestType newUpdateObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST, newUpdateObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case RegistryPackage.DOCUMENT_ROOT__ADD_SLOTS_REQUEST:
				return basicSetAddSlotsRequest(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				return basicSetApproveObjectsRequest(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				return basicSetDeprecateObjectsRequest(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED:
				return basicSetOptionalFeaturesSupported(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				return basicSetRegistryError(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				return basicSetRegistryErrorList(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_PROFILE:
				return basicSetRegistryProfile(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				return basicSetRegistryResponse(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				return basicSetRemoveObjectsRequest(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST:
				return basicSetRemoveSlotsRequest(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE:
				return basicSetRequestAcceptedResponse(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				return basicSetRootElement(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				return basicSetSubmitObjectsRequest(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				return basicSetUpdateObjectsRequest(null, msgs);
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case RegistryPackage.DOCUMENT_ROOT__ADD_SLOTS_REQUEST:
				return getAddSlotsRequest();
			case RegistryPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				return getApproveObjectsRequest();
			case RegistryPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				return getDeprecateObjectsRequest();
			case RegistryPackage.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED:
				return getOptionalFeaturesSupported();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				return getRegistryError();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				return getRegistryErrorList();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_PROFILE:
				return getRegistryProfile();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				return getRegistryResponse();
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				return getRemoveObjectsRequest();
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST:
				return getRemoveSlotsRequest();
			case RegistryPackage.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE:
				return getRequestAcceptedResponse();
			case RegistryPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				return getRootElement();
			case RegistryPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				return getSubmitObjectsRequest();
			case RegistryPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				return getUpdateObjectsRequest();
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__ADD_SLOTS_REQUEST:
				setAddSlotsRequest((AddSlotsRequestType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				setApproveObjectsRequest((ApproveObjectsRequestType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				setDeprecateObjectsRequest((DeprecateObjectsRequestType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED:
				setOptionalFeaturesSupported((OptionalFeaturesSupportedType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				setRegistryError((RegistryErrorType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_PROFILE:
				setRegistryProfile((RegistryProfileType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				setRegistryResponse((RegistryResponseType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				setRemoveObjectsRequest((RemoveObjectsRequestType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST:
				setRemoveSlotsRequest((RemoveSlotsRequestType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE:
				setRequestAcceptedResponse((RequestAcceptedResponseType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				setRootElement((RootElementType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				setSubmitObjectsRequest((SubmitObjectsRequestType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				setUpdateObjectsRequest((UpdateObjectsRequestType)newValue);
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case RegistryPackage.DOCUMENT_ROOT__ADD_SLOTS_REQUEST:
				setAddSlotsRequest((AddSlotsRequestType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				setApproveObjectsRequest((ApproveObjectsRequestType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				setDeprecateObjectsRequest((DeprecateObjectsRequestType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED:
				setOptionalFeaturesSupported((OptionalFeaturesSupportedType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				setRegistryError((RegistryErrorType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_PROFILE:
				setRegistryProfile((RegistryProfileType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				setRegistryResponse((RegistryResponseType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				setRemoveObjectsRequest((RemoveObjectsRequestType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST:
				setRemoveSlotsRequest((RemoveSlotsRequestType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE:
				setRequestAcceptedResponse((RequestAcceptedResponseType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				setRootElement((RootElementType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				setSubmitObjectsRequest((SubmitObjectsRequestType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				setUpdateObjectsRequest((UpdateObjectsRequestType)null);
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case RegistryPackage.DOCUMENT_ROOT__ADD_SLOTS_REQUEST:
				return getAddSlotsRequest() != null;
			case RegistryPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				return getApproveObjectsRequest() != null;
			case RegistryPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				return getDeprecateObjectsRequest() != null;
			case RegistryPackage.DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED:
				return getOptionalFeaturesSupported() != null;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				return getRegistryError() != null;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				return getRegistryErrorList() != null;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_PROFILE:
				return getRegistryProfile() != null;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				return getRegistryResponse() != null;
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				return getRemoveObjectsRequest() != null;
			case RegistryPackage.DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST:
				return getRemoveSlotsRequest() != null;
			case RegistryPackage.DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE:
				return getRequestAcceptedResponse() != null;
			case RegistryPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				return getRootElement() != null;
			case RegistryPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				return getSubmitObjectsRequest() != null;
			case RegistryPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				return getUpdateObjectsRequest() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
