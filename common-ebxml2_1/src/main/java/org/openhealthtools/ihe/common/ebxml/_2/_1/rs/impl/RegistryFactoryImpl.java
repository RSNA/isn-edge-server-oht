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
 * $Id: RegistryFactoryImpl.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.ihe.common.ebxml._2._1.rs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistryFactoryImpl extends EFactoryImpl implements RegistryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegistryFactory init() {
		try {
			RegistryFactory theRegistryFactory = (RegistryFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1"); 
			if (theRegistryFactory != null) {
				return theRegistryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegistryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE: return createAddSlotsRequestType();
			case RegistryPackage.APPROVE_OBJECTS_REQUEST_TYPE: return createApproveObjectsRequestType();
			case RegistryPackage.DEPRECATE_OBJECTS_REQUEST_TYPE: return createDeprecateObjectsRequestType();
			case RegistryPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE: return createOptionalFeaturesSupportedType();
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE: return createRegistryErrorListType();
			case RegistryPackage.REGISTRY_ERROR_TYPE: return createRegistryErrorType();
			case RegistryPackage.REGISTRY_PROFILE_TYPE: return createRegistryProfileType();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE: return createRegistryResponseType();
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE: return createRemoveObjectsRequestType();
			case RegistryPackage.REMOVE_SLOTS_REQUEST_TYPE: return createRemoveSlotsRequestType();
			case RegistryPackage.REQUEST_ACCEPTED_RESPONSE_TYPE: return createRequestAcceptedResponseType();
			case RegistryPackage.ROOT_ELEMENT_TYPE: return createRootElementType();
			case RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE: return createSubmitObjectsRequestType();
			case RegistryPackage.UPDATE_OBJECTS_REQUEST_TYPE: return createUpdateObjectsRequestType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RegistryPackage.DELETION_SCOPE_TYPE:
				return createDeletionScopeTypeFromString(eDataType, initialValue);
			case RegistryPackage.ERROR_TYPE:
				return createErrorTypeFromString(eDataType, initialValue);
			case RegistryPackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case RegistryPackage.DELETION_SCOPE_TYPE_OBJECT:
				return createDeletionScopeTypeObjectFromString(eDataType, initialValue);
			case RegistryPackage.ERROR_TYPE_OBJECT:
				return createErrorTypeObjectFromString(eDataType, initialValue);
			case RegistryPackage.STATUS_TYPE_OBJECT:
				return createStatusTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RegistryPackage.DELETION_SCOPE_TYPE:
				return convertDeletionScopeTypeToString(eDataType, instanceValue);
			case RegistryPackage.ERROR_TYPE:
				return convertErrorTypeToString(eDataType, instanceValue);
			case RegistryPackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case RegistryPackage.DELETION_SCOPE_TYPE_OBJECT:
				return convertDeletionScopeTypeObjectToString(eDataType, instanceValue);
			case RegistryPackage.ERROR_TYPE_OBJECT:
				return convertErrorTypeObjectToString(eDataType, instanceValue);
			case RegistryPackage.STATUS_TYPE_OBJECT:
				return convertStatusTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSlotsRequestType createAddSlotsRequestType() {
		AddSlotsRequestTypeImpl addSlotsRequestType = new AddSlotsRequestTypeImpl();
		return addSlotsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproveObjectsRequestType createApproveObjectsRequestType() {
		ApproveObjectsRequestTypeImpl approveObjectsRequestType = new ApproveObjectsRequestTypeImpl();
		return approveObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecateObjectsRequestType createDeprecateObjectsRequestType() {
		DeprecateObjectsRequestTypeImpl deprecateObjectsRequestType = new DeprecateObjectsRequestTypeImpl();
		return deprecateObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalFeaturesSupportedType createOptionalFeaturesSupportedType() {
		OptionalFeaturesSupportedTypeImpl optionalFeaturesSupportedType = new OptionalFeaturesSupportedTypeImpl();
		return optionalFeaturesSupportedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorListType createRegistryErrorListType() {
		RegistryErrorListTypeImpl registryErrorListType = new RegistryErrorListTypeImpl();
		return registryErrorListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorType createRegistryErrorType() {
		RegistryErrorTypeImpl registryErrorType = new RegistryErrorTypeImpl();
		return registryErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryProfileType createRegistryProfileType() {
		RegistryProfileTypeImpl registryProfileType = new RegistryProfileTypeImpl();
		return registryProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryResponseType createRegistryResponseType() {
		RegistryResponseTypeImpl registryResponseType = new RegistryResponseTypeImpl();
		return registryResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveObjectsRequestType createRemoveObjectsRequestType() {
		RemoveObjectsRequestTypeImpl removeObjectsRequestType = new RemoveObjectsRequestTypeImpl();
		return removeObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveSlotsRequestType createRemoveSlotsRequestType() {
		RemoveSlotsRequestTypeImpl removeSlotsRequestType = new RemoveSlotsRequestTypeImpl();
		return removeSlotsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAcceptedResponseType createRequestAcceptedResponseType() {
		RequestAcceptedResponseTypeImpl requestAcceptedResponseType = new RequestAcceptedResponseTypeImpl();
		return requestAcceptedResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementType createRootElementType() {
		RootElementTypeImpl rootElementType = new RootElementTypeImpl();
		return rootElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitObjectsRequestType createSubmitObjectsRequestType() {
		SubmitObjectsRequestTypeImpl submitObjectsRequestType = new SubmitObjectsRequestTypeImpl();
		return submitObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateObjectsRequestType createUpdateObjectsRequestType() {
		UpdateObjectsRequestTypeImpl updateObjectsRequestType = new UpdateObjectsRequestTypeImpl();
		return updateObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionScopeType createDeletionScopeTypeFromString(EDataType eDataType, String initialValue) {
		DeletionScopeType result = DeletionScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeletionScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorTypeFromString(EDataType eDataType, String initialValue) {
		ErrorType result = ErrorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionScopeType createDeletionScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (DeletionScopeType)createDeletionScopeTypeFromString(RegistryPackage.Literals.DELETION_SCOPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeletionScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeletionScopeTypeToString(RegistryPackage.Literals.DELETION_SCOPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (ErrorType)createErrorTypeFromString(RegistryPackage.Literals.ERROR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertErrorTypeToString(RegistryPackage.Literals.ERROR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (StatusType)createStatusTypeFromString(RegistryPackage.Literals.STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusTypeToString(RegistryPackage.Literals.STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackage getRegistryPackage() {
		return (RegistryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static RegistryPackage getPackage() {
		return RegistryPackage.eINSTANCE;
	}

} //RegistryFactoryImpl
