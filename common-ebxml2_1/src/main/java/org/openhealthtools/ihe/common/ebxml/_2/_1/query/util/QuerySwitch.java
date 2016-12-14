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
 * $Id: QuerySwitch.java,v 1.1 2006/06/27 23:18:07 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.query.*;

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
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage
 * @generated
 */
public class QuerySwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySwitch() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE: {
				AdhocQueryRequestType adhocQueryRequestType = (AdhocQueryRequestType)theEObject;
				Object result = caseAdhocQueryRequestType(adhocQueryRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE: {
				AdhocQueryResponseType adhocQueryResponseType = (AdhocQueryResponseType)theEObject;
				Object result = caseAdhocQueryResponseType(adhocQueryResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ASSOCIATION_BRANCH_TYPE: {
				AssociationBranchType associationBranchType = (AssociationBranchType)theEObject;
				Object result = caseAssociationBranchType(associationBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ASSOCIATION_QUERY_RESULT_TYPE: {
				AssociationQueryResultType associationQueryResultType = (AssociationQueryResultType)theEObject;
				Object result = caseAssociationQueryResultType(associationQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ASSOCIATION_QUERY_TYPE: {
				AssociationQueryType associationQueryType = (AssociationQueryType)theEObject;
				Object result = caseAssociationQueryType(associationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(associationQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.AUDITABLE_EVENT_QUERY_RESULT_TYPE: {
				AuditableEventQueryResultType auditableEventQueryResultType = (AuditableEventQueryResultType)theEObject;
				Object result = caseAuditableEventQueryResultType(auditableEventQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE: {
				AuditableEventQueryType auditableEventQueryType = (AuditableEventQueryType)theEObject;
				Object result = caseAuditableEventQueryType(auditableEventQueryType);
				if (result == null) result = caseRegistryObjectQueryType(auditableEventQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BOOLEAN_CLAUSE_TYPE: {
				BooleanClauseType booleanClauseType = (BooleanClauseType)theEObject;
				Object result = caseBooleanClauseType(booleanClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_NODE_QUERY_RESULT_TYPE: {
				ClassificationNodeQueryResultType classificationNodeQueryResultType = (ClassificationNodeQueryResultType)theEObject;
				Object result = caseClassificationNodeQueryResultType(classificationNodeQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE: {
				ClassificationNodeQueryType classificationNodeQueryType = (ClassificationNodeQueryType)theEObject;
				Object result = caseClassificationNodeQueryType(classificationNodeQueryType);
				if (result == null) result = caseRegistryObjectQueryType(classificationNodeQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_QUERY_RESULT_TYPE: {
				ClassificationQueryResultType classificationQueryResultType = (ClassificationQueryResultType)theEObject;
				Object result = caseClassificationQueryResultType(classificationQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_QUERY_TYPE: {
				ClassificationQueryType classificationQueryType = (ClassificationQueryType)theEObject;
				Object result = caseClassificationQueryType(classificationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(classificationQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE: {
				ClassificationSchemeQueryResultType classificationSchemeQueryResultType = (ClassificationSchemeQueryResultType)theEObject;
				Object result = caseClassificationSchemeQueryResultType(classificationSchemeQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE: {
				ClassificationSchemeQueryType classificationSchemeQueryType = (ClassificationSchemeQueryType)theEObject;
				Object result = caseClassificationSchemeQueryType(classificationSchemeQueryType);
				if (result == null) result = caseRegistryEntryQueryType(classificationSchemeQueryType);
				if (result == null) result = caseRegistryObjectQueryType(classificationSchemeQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFIED_BY_BRANCH_TYPE: {
				ClassifiedByBranchType classifiedByBranchType = (ClassifiedByBranchType)theEObject;
				Object result = caseClassifiedByBranchType(classifiedByBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLAUSE_TYPE: {
				ClauseType clauseType = (ClauseType)theEObject;
				Object result = caseClauseType(clauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.COMPOUND_CLAUSE_TYPE: {
				CompoundClauseType compoundClauseType = (CompoundClauseType)theEObject;
				Object result = caseCompoundClauseType(compoundClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_RESULT_TYPE: {
				ExtrinsicObjectQueryResultType extrinsicObjectQueryResultType = (ExtrinsicObjectQueryResultType)theEObject;
				Object result = caseExtrinsicObjectQueryResultType(extrinsicObjectQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE: {
				ExtrinsicObjectQueryType extrinsicObjectQueryType = (ExtrinsicObjectQueryType)theEObject;
				Object result = caseExtrinsicObjectQueryType(extrinsicObjectQueryType);
				if (result == null) result = caseRegistryEntryQueryType(extrinsicObjectQueryType);
				if (result == null) result = caseRegistryObjectQueryType(extrinsicObjectQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.FILTER_QUERY_RESULT_TYPE: {
				FilterQueryResultType filterQueryResultType = (FilterQueryResultType)theEObject;
				Object result = caseFilterQueryResultType(filterQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.FILTER_QUERY_TYPE: {
				FilterQueryType filterQueryType = (FilterQueryType)theEObject;
				Object result = caseFilterQueryType(filterQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				Object result = caseFilterType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.GET_CONTENT_REQUEST_TYPE: {
				GetContentRequestType getContentRequestType = (GetContentRequestType)theEObject;
				Object result = caseGetContentRequestType(getContentRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.GET_CONTENT_RESPONSE_TYPE: {
				GetContentResponseType getContentResponseType = (GetContentResponseType)theEObject;
				Object result = caseGetContentResponseType(getContentResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE: {
				InternationalStringBranchType internationalStringBranchType = (InternationalStringBranchType)theEObject;
				Object result = caseInternationalStringBranchType(internationalStringBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ORGANIZATION_QUERY_RESULT_TYPE: {
				OrganizationQueryResultType organizationQueryResultType = (OrganizationQueryResultType)theEObject;
				Object result = caseOrganizationQueryResultType(organizationQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ORGANIZATION_QUERY_TYPE: {
				OrganizationQueryType organizationQueryType = (OrganizationQueryType)theEObject;
				Object result = caseOrganizationQueryType(organizationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(organizationQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.RATIONAL_CLAUSE_TYPE: {
				RationalClauseType rationalClauseType = (RationalClauseType)theEObject;
				Object result = caseRationalClauseType(rationalClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_ENTRY_QUERY_RESULT_TYPE: {
				RegistryEntryQueryResultType registryEntryQueryResultType = (RegistryEntryQueryResultType)theEObject;
				Object result = caseRegistryEntryQueryResultType(registryEntryQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_ENTRY_QUERY_TYPE: {
				RegistryEntryQueryType registryEntryQueryType = (RegistryEntryQueryType)theEObject;
				Object result = caseRegistryEntryQueryType(registryEntryQueryType);
				if (result == null) result = caseRegistryObjectQueryType(registryEntryQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE: {
				RegistryObjectQueryType registryObjectQueryType = (RegistryObjectQueryType)theEObject;
				Object result = caseRegistryObjectQueryType(registryObjectQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE: {
				RegistryPackageQueryResultType registryPackageQueryResultType = (RegistryPackageQueryResultType)theEObject;
				Object result = caseRegistryPackageQueryResultType(registryPackageQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE: {
				RegistryPackageQueryType registryPackageQueryType = (RegistryPackageQueryType)theEObject;
				Object result = caseRegistryPackageQueryType(registryPackageQueryType);
				if (result == null) result = caseRegistryEntryQueryType(registryPackageQueryType);
				if (result == null) result = caseRegistryObjectQueryType(registryPackageQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.RESPONSE_OPTION_TYPE: {
				ResponseOptionType responseOptionType = (ResponseOptionType)theEObject;
				Object result = caseResponseOptionType(responseOptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE: {
				ServiceBindingBranchType serviceBindingBranchType = (ServiceBindingBranchType)theEObject;
				Object result = caseServiceBindingBranchType(serviceBindingBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SERVICE_QUERY_RESULT_TYPE: {
				ServiceQueryResultType serviceQueryResultType = (ServiceQueryResultType)theEObject;
				Object result = caseServiceQueryResultType(serviceQueryResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SERVICE_QUERY_TYPE: {
				ServiceQueryType serviceQueryType = (ServiceQueryType)theEObject;
				Object result = caseServiceQueryType(serviceQueryType);
				if (result == null) result = caseRegistryEntryQueryType(serviceQueryType);
				if (result == null) result = caseRegistryObjectQueryType(serviceQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SIMPLE_CLAUSE_TYPE: {
				SimpleClauseType simpleClauseType = (SimpleClauseType)theEObject;
				Object result = caseSimpleClauseType(simpleClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SLOT_BRANCH_TYPE: {
				SlotBranchType slotBranchType = (SlotBranchType)theEObject;
				Object result = caseSlotBranchType(slotBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE: {
				SpecificationLinkBranchType specificationLinkBranchType = (SpecificationLinkBranchType)theEObject;
				Object result = caseSpecificationLinkBranchType(specificationLinkBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.STRING_CLAUSE_TYPE: {
				StringClauseType stringClauseType = (StringClauseType)theEObject;
				Object result = caseStringClauseType(stringClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.USER_BRANCH_TYPE: {
				UserBranchType userBranchType = (UserBranchType)theEObject;
				Object result = caseUserBranchType(userBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Adhoc Query Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Adhoc Query Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdhocQueryRequestType(AdhocQueryRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Adhoc Query Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Adhoc Query Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdhocQueryResponseType(AdhocQueryResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociationBranchType(AssociationBranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociationQueryResultType(AssociationQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociationQueryType(AssociationQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Auditable Event Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Auditable Event Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAuditableEventQueryResultType(AuditableEventQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Auditable Event Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Auditable Event Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAuditableEventQueryType(AuditableEventQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Boolean Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Boolean Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanClauseType(BooleanClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Node Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Node Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationNodeQueryResultType(ClassificationNodeQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Node Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Node Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationNodeQueryType(ClassificationNodeQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationQueryResultType(ClassificationQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationQueryType(ClassificationQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Scheme Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Scheme Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationSchemeQueryResultType(ClassificationSchemeQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Scheme Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Scheme Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationSchemeQueryType(ClassificationSchemeQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classified By Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classified By Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassifiedByBranchType(ClassifiedByBranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClauseType(ClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Compound Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Compound Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompoundClauseType(CompoundClauseType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Extrinsic Object Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extrinsic Object Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtrinsicObjectQueryResultType(ExtrinsicObjectQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extrinsic Object Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extrinsic Object Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtrinsicObjectQueryType(ExtrinsicObjectQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Filter Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Filter Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilterQueryResultType(FilterQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Filter Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Filter Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilterQueryType(FilterQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilterType(FilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Get Content Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Get Content Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetContentRequestType(GetContentRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Get Content Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Get Content Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetContentResponseType(GetContentResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>International String Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>International String Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInternationalStringBranchType(InternationalStringBranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationQueryResultType(OrganizationQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationQueryType(OrganizationQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rational Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rational Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRationalClauseType(RationalClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Entry Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Entry Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryEntryQueryResultType(RegistryEntryQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Entry Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Entry Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryEntryQueryType(RegistryEntryQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Object Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Object Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryObjectQueryType(RegistryObjectQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Package Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Package Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryPackageQueryResultType(RegistryPackageQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Package Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Package Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryPackageQueryType(RegistryPackageQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Response Option Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Response Option Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResponseOptionType(ResponseOptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Binding Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Binding Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceBindingBranchType(ServiceBindingBranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Query Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Query Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceQueryResultType(ServiceQueryResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceQueryType(ServiceQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Simple Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Simple Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleClauseType(SimpleClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Slot Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Slot Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSlotBranchType(SlotBranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Specification Link Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Specification Link Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpecificationLinkBranchType(SpecificationLinkBranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringClauseType(StringClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>User Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>User Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserBranchType(UserBranchType object) {
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

} //QuerySwitch
