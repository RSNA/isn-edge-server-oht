/**
 * <copyright>
 * </copyright>
 *
 * $Id: LCMSwitch.java,v 1.1 2006/10/19 20:16:27 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


import org.openhealthtools.ihe.common.ebxml._3._0.lcm.*;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

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
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage
 * @generated
 */
public class LCMSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LCMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCMSwitch() {
		if (modelPackage == null) {
			modelPackage = LCMPackage.eINSTANCE;
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
			case LCMPackage.ACCEPT_OBJECTS_REQUEST_TYPE: {
				AcceptObjectsRequestType acceptObjectsRequestType = (AcceptObjectsRequestType)theEObject;
				Object result = caseAcceptObjectsRequestType(acceptObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(acceptObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.APPROVE_OBJECTS_REQUEST_TYPE: {
				ApproveObjectsRequestType approveObjectsRequestType = (ApproveObjectsRequestType)theEObject;
				Object result = caseApproveObjectsRequestType(approveObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(approveObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.DEPRECATE_OBJECTS_REQUEST_TYPE: {
				DeprecateObjectsRequestType deprecateObjectsRequestType = (DeprecateObjectsRequestType)theEObject;
				Object result = caseDeprecateObjectsRequestType(deprecateObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(deprecateObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE: {
				RelocateObjectsRequestType relocateObjectsRequestType = (RelocateObjectsRequestType)theEObject;
				Object result = caseRelocateObjectsRequestType(relocateObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(relocateObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE: {
				RemoveObjectsRequestType removeObjectsRequestType = (RemoveObjectsRequestType)theEObject;
				Object result = caseRemoveObjectsRequestType(removeObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(removeObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.SUBMIT_OBJECTS_REQUEST_TYPE: {
				SubmitObjectsRequestType submitObjectsRequestType = (SubmitObjectsRequestType)theEObject;
				Object result = caseSubmitObjectsRequestType(submitObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(submitObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE: {
				UndeprecateObjectsRequestType undeprecateObjectsRequestType = (UndeprecateObjectsRequestType)theEObject;
				Object result = caseUndeprecateObjectsRequestType(undeprecateObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(undeprecateObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE: {
				UpdateObjectsRequestType updateObjectsRequestType = (UpdateObjectsRequestType)theEObject;
				Object result = caseUpdateObjectsRequestType(updateObjectsRequestType);
				if (result == null) result = caseRegistryRequestType(updateObjectsRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Accept Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Accept Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAcceptObjectsRequestType(AcceptObjectsRequestType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Relocate Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Relocate Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelocateObjectsRequestType(RelocateObjectsRequestType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Undeprecate Objects Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Undeprecate Objects Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUndeprecateObjectsRequestType(UndeprecateObjectsRequestType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryRequestType(RegistryRequestType object) {
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

} //LCMSwitch
