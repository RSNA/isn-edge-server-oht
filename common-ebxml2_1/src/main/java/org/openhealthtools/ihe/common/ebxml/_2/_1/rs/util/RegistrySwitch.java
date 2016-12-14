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
 * $Id: RegistrySwitch.java,v 1.1 2006/06/27 23:18:00 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.rs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage
 * @generated
 */
public class RegistrySwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RegistryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrySwitch() {
		if (modelPackage == null) {
			modelPackage = RegistryPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RegistryPackage.ADD_SLOTS_REQUEST_TYPE: {
				AddSlotsRequestType addSlotsRequestType = (AddSlotsRequestType)theEObject;
				Object result = caseAddSlotsRequestType(addSlotsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.APPROVE_OBJECTS_REQUEST_TYPE: {
				ApproveObjectsRequestType approveObjectsRequestType = (ApproveObjectsRequestType)theEObject;
				Object result = caseApproveObjectsRequestType(approveObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.DEPRECATE_OBJECTS_REQUEST_TYPE: {
				DeprecateObjectsRequestType deprecateObjectsRequestType = (DeprecateObjectsRequestType)theEObject;
				Object result = caseDeprecateObjectsRequestType(deprecateObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.OPTIONAL_FEATURES_SUPPORTED_TYPE: {
				OptionalFeaturesSupportedType optionalFeaturesSupportedType = (OptionalFeaturesSupportedType)theEObject;
				Object result = caseOptionalFeaturesSupportedType(optionalFeaturesSupportedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE: {
				RegistryErrorListType registryErrorListType = (RegistryErrorListType)theEObject;
				Object result = caseRegistryErrorListType(registryErrorListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.REGISTRY_ERROR_TYPE: {
				RegistryErrorType registryErrorType = (RegistryErrorType)theEObject;
				Object result = caseRegistryErrorType(registryErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.REGISTRY_PROFILE_TYPE: {
				RegistryProfileType registryProfileType = (RegistryProfileType)theEObject;
				Object result = caseRegistryProfileType(registryProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.REGISTRY_RESPONSE_TYPE: {
				RegistryResponseType registryResponseType = (RegistryResponseType)theEObject;
				Object result = caseRegistryResponseType(registryResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.REMOVE_OBJECTS_REQUEST_TYPE: {
				RemoveObjectsRequestType removeObjectsRequestType = (RemoveObjectsRequestType)theEObject;
				Object result = caseRemoveObjectsRequestType(removeObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.REMOVE_SLOTS_REQUEST_TYPE: {
				RemoveSlotsRequestType removeSlotsRequestType = (RemoveSlotsRequestType)theEObject;
				Object result = caseRemoveSlotsRequestType(removeSlotsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.REQUEST_ACCEPTED_RESPONSE_TYPE: {
				RequestAcceptedResponseType requestAcceptedResponseType = (RequestAcceptedResponseType)theEObject;
				Object result = caseRequestAcceptedResponseType(requestAcceptedResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.ROOT_ELEMENT_TYPE: {
				RootElementType rootElementType = (RootElementType)theEObject;
				Object result = caseRootElementType(rootElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.SUBMIT_OBJECTS_REQUEST_TYPE: {
				SubmitObjectsRequestType submitObjectsRequestType = (SubmitObjectsRequestType)theEObject;
				Object result = caseSubmitObjectsRequestType(submitObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegistryPackage.UPDATE_OBJECTS_REQUEST_TYPE: {
				UpdateObjectsRequestType updateObjectsRequestType = (UpdateObjectsRequestType)theEObject;
				Object result = caseUpdateObjectsRequestType(updateObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Add Slots Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Add Slots Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddSlotsRequestType(AddSlotsRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Approve Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Approve Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseApproveObjectsRequestType(ApproveObjectsRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Deprecate Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Deprecate Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeprecateObjectsRequestType(DeprecateObjectsRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Optional Features Supported Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Optional Features Supported Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOptionalFeaturesSupportedType(OptionalFeaturesSupportedType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Error List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Error List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryErrorListType(RegistryErrorListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryErrorType(RegistryErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryProfileType(RegistryProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryResponseType(RegistryResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Remove Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Remove Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemoveObjectsRequestType(RemoveObjectsRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Remove Slots Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Remove Slots Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemoveSlotsRequestType(RemoveSlotsRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Request Accepted Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Request Accepted Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestAcceptedResponseType(RequestAcceptedResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Root Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Root Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRootElementType(RootElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Submit Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Submit Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubmitObjectsRequestType(SubmitObjectsRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Update Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Update Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateObjectsRequestType(UpdateObjectsRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //RegistrySwitch
