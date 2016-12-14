/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMSSwitch.java,v 1.1 2006/10/19 20:16:31 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


import org.openhealthtools.ihe.common.ebxml._3._0.cms.*;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType;

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
 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage
 * @generated
 */
public class CMSSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CMSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMSSwitch() {
		if (modelPackage == null) {
			modelPackage = CMSPackage.eINSTANCE;
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
			case CMSPackage.CATALOG_CONTENT_REQUEST_TYPE: {
				CatalogContentRequestType catalogContentRequestType = (CatalogContentRequestType)theEObject;
				Object result = caseCatalogContentRequestType(catalogContentRequestType);
				if (result == null) result = caseContentManagementServiceRequestType(catalogContentRequestType);
				if (result == null) result = caseRegistryRequestType(catalogContentRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE: {
				CatalogContentResponseType catalogContentResponseType = (CatalogContentResponseType)theEObject;
				Object result = caseCatalogContentResponseType(catalogContentResponseType);
				if (result == null) result = caseContentManagementServiceResponseType(catalogContentResponseType);
				if (result == null) result = caseRegistryResponseType(catalogContentResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE: {
				ContentManagementServiceRequestType contentManagementServiceRequestType = (ContentManagementServiceRequestType)theEObject;
				Object result = caseContentManagementServiceRequestType(contentManagementServiceRequestType);
				if (result == null) result = caseRegistryRequestType(contentManagementServiceRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE: {
				ContentManagementServiceResponseType contentManagementServiceResponseType = (ContentManagementServiceResponseType)theEObject;
				Object result = caseContentManagementServiceResponseType(contentManagementServiceResponseType);
				if (result == null) result = caseRegistryResponseType(contentManagementServiceResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMSPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMSPackage.VALIDATE_CONTENT_REQUEST_TYPE: {
				ValidateContentRequestType validateContentRequestType = (ValidateContentRequestType)theEObject;
				Object result = caseValidateContentRequestType(validateContentRequestType);
				if (result == null) result = caseContentManagementServiceRequestType(validateContentRequestType);
				if (result == null) result = caseRegistryRequestType(validateContentRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMSPackage.VALIDATE_CONTENT_RESPONSE_TYPE: {
				ValidateContentResponseType validateContentResponseType = (ValidateContentResponseType)theEObject;
				Object result = caseValidateContentResponseType(validateContentResponseType);
				if (result == null) result = caseContentManagementServiceResponseType(validateContentResponseType);
				if (result == null) result = caseRegistryResponseType(validateContentResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Catalog Content Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Catalog Content Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCatalogContentRequestType(CatalogContentRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Catalog Content Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Catalog Content Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCatalogContentResponseType(CatalogContentResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Content Management Service Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Content Management Service Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContentManagementServiceRequestType(ContentManagementServiceRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Content Management Service Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Content Management Service Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContentManagementServiceResponseType(ContentManagementServiceResponseType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Validate Content Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Validate Content Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValidateContentRequestType(ValidateContentRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Validate Content Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Validate Content Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValidateContentResponseType(ValidateContentResponseType object) {
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

} //CMSSwitch
