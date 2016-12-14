/**
 * <copyright>
 * </copyright>
 *
 * $Id: QuerySwitch.java,v 1.1 2006/10/19 20:16:34 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


import org.openhealthtools.ihe.common.ebxml._3._0.query.*;
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
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage
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
			case QueryPackage.ADHOC_QUERY_QUERY_TYPE: {
				AdhocQueryQueryType adhocQueryQueryType = (AdhocQueryQueryType)theEObject;
				Object result = caseAdhocQueryQueryType(adhocQueryQueryType);
				if (result == null) result = caseRegistryObjectQueryType(adhocQueryQueryType);
				if (result == null) result = caseFilterQueryType(adhocQueryQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE: {
				AdhocQueryRequestType adhocQueryRequestType = (AdhocQueryRequestType)theEObject;
				Object result = caseAdhocQueryRequestType(adhocQueryRequestType);
				if (result == null) result = caseRegistryRequestType(adhocQueryRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE: {
				AdhocQueryResponseType adhocQueryResponseType = (AdhocQueryResponseType)theEObject;
				Object result = caseAdhocQueryResponseType(adhocQueryResponseType);
				if (result == null) result = caseRegistryResponseType(adhocQueryResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ASSOCIATION_QUERY_TYPE: {
				AssociationQueryType associationQueryType = (AssociationQueryType)theEObject;
				Object result = caseAssociationQueryType(associationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(associationQueryType);
				if (result == null) result = caseFilterQueryType(associationQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE: {
				AuditableEventQueryType auditableEventQueryType = (AuditableEventQueryType)theEObject;
				Object result = caseAuditableEventQueryType(auditableEventQueryType);
				if (result == null) result = caseFilterQueryType(auditableEventQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BOOLEAN_FILTER_TYPE: {
				BooleanFilterType booleanFilterType = (BooleanFilterType)theEObject;
				Object result = caseBooleanFilterType(booleanFilterType);
				if (result == null) result = caseSimpleFilterType(booleanFilterType);
				if (result == null) result = caseFilterType(booleanFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BRANCH_TYPE: {
				BranchType branchType = (BranchType)theEObject;
				Object result = caseBranchType(branchType);
				if (result == null) result = caseFilterQueryType(branchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE: {
				ClassificationNodeQueryType classificationNodeQueryType = (ClassificationNodeQueryType)theEObject;
				Object result = caseClassificationNodeQueryType(classificationNodeQueryType);
				if (result == null) result = caseRegistryObjectQueryType(classificationNodeQueryType);
				if (result == null) result = caseFilterQueryType(classificationNodeQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_QUERY_TYPE: {
				ClassificationQueryType classificationQueryType = (ClassificationQueryType)theEObject;
				Object result = caseClassificationQueryType(classificationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(classificationQueryType);
				if (result == null) result = caseFilterQueryType(classificationQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE: {
				ClassificationSchemeQueryType classificationSchemeQueryType = (ClassificationSchemeQueryType)theEObject;
				Object result = caseClassificationSchemeQueryType(classificationSchemeQueryType);
				if (result == null) result = caseRegistryObjectQueryType(classificationSchemeQueryType);
				if (result == null) result = caseFilterQueryType(classificationSchemeQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.COMPOUND_FILTER_TYPE: {
				CompoundFilterType compoundFilterType = (CompoundFilterType)theEObject;
				Object result = caseCompoundFilterType(compoundFilterType);
				if (result == null) result = caseFilterType(compoundFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.DATE_TIME_FILTER_TYPE: {
				DateTimeFilterType dateTimeFilterType = (DateTimeFilterType)theEObject;
				Object result = caseDateTimeFilterType(dateTimeFilterType);
				if (result == null) result = caseSimpleFilterType(dateTimeFilterType);
				if (result == null) result = caseFilterType(dateTimeFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE: {
				ExternalIdentifierQueryType externalIdentifierQueryType = (ExternalIdentifierQueryType)theEObject;
				Object result = caseExternalIdentifierQueryType(externalIdentifierQueryType);
				if (result == null) result = caseRegistryObjectQueryType(externalIdentifierQueryType);
				if (result == null) result = caseFilterQueryType(externalIdentifierQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.EXTERNAL_LINK_QUERY_TYPE: {
				ExternalLinkQueryType externalLinkQueryType = (ExternalLinkQueryType)theEObject;
				Object result = caseExternalLinkQueryType(externalLinkQueryType);
				if (result == null) result = caseRegistryObjectQueryType(externalLinkQueryType);
				if (result == null) result = caseFilterQueryType(externalLinkQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE: {
				ExtrinsicObjectQueryType extrinsicObjectQueryType = (ExtrinsicObjectQueryType)theEObject;
				Object result = caseExtrinsicObjectQueryType(extrinsicObjectQueryType);
				if (result == null) result = caseRegistryObjectQueryType(extrinsicObjectQueryType);
				if (result == null) result = caseFilterQueryType(extrinsicObjectQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.FEDERATION_QUERY_TYPE: {
				FederationQueryType federationQueryType = (FederationQueryType)theEObject;
				Object result = caseFederationQueryType(federationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(federationQueryType);
				if (result == null) result = caseFilterQueryType(federationQueryType);
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
			case QueryPackage.FLOAT_FILTER_TYPE: {
				FloatFilterType floatFilterType = (FloatFilterType)theEObject;
				Object result = caseFloatFilterType(floatFilterType);
				if (result == null) result = caseSimpleFilterType(floatFilterType);
				if (result == null) result = caseFilterType(floatFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.INTEGER_FILTER_TYPE: {
				IntegerFilterType integerFilterType = (IntegerFilterType)theEObject;
				Object result = caseIntegerFilterType(integerFilterType);
				if (result == null) result = caseSimpleFilterType(integerFilterType);
				if (result == null) result = caseFilterType(integerFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE: {
				InternationalStringBranchType internationalStringBranchType = (InternationalStringBranchType)theEObject;
				Object result = caseInternationalStringBranchType(internationalStringBranchType);
				if (result == null) result = caseBranchType(internationalStringBranchType);
				if (result == null) result = caseFilterQueryType(internationalStringBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.NOTIFICATION_QUERY_TYPE: {
				NotificationQueryType notificationQueryType = (NotificationQueryType)theEObject;
				Object result = caseNotificationQueryType(notificationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(notificationQueryType);
				if (result == null) result = caseFilterQueryType(notificationQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ORGANIZATION_QUERY_TYPE: {
				OrganizationQueryType organizationQueryType = (OrganizationQueryType)theEObject;
				Object result = caseOrganizationQueryType(organizationQueryType);
				if (result == null) result = caseRegistryObjectQueryType(organizationQueryType);
				if (result == null) result = caseFilterQueryType(organizationQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.PERSON_QUERY_TYPE: {
				PersonQueryType personQueryType = (PersonQueryType)theEObject;
				Object result = casePersonQueryType(personQueryType);
				if (result == null) result = caseRegistryObjectQueryType(personQueryType);
				if (result == null) result = caseFilterQueryType(personQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE: {
				QueryExpressionBranchType queryExpressionBranchType = (QueryExpressionBranchType)theEObject;
				Object result = caseQueryExpressionBranchType(queryExpressionBranchType);
				if (result == null) result = caseBranchType(queryExpressionBranchType);
				if (result == null) result = caseFilterQueryType(queryExpressionBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE: {
				RegistryObjectQueryType registryObjectQueryType = (RegistryObjectQueryType)theEObject;
				Object result = caseRegistryObjectQueryType(registryObjectQueryType);
				if (result == null) result = caseFilterQueryType(registryObjectQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE: {
				RegistryPackageQueryType registryPackageQueryType = (RegistryPackageQueryType)theEObject;
				Object result = caseRegistryPackageQueryType(registryPackageQueryType);
				if (result == null) result = caseRegistryObjectQueryType(registryPackageQueryType);
				if (result == null) result = caseFilterQueryType(registryPackageQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.REGISTRY_QUERY_TYPE: {
				RegistryQueryType registryQueryType = (RegistryQueryType)theEObject;
				Object result = caseRegistryQueryType(registryQueryType);
				if (result == null) result = caseRegistryObjectQueryType(registryQueryType);
				if (result == null) result = caseFilterQueryType(registryQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.RESPONSE_OPTION_TYPE: {
				ResponseOptionType responseOptionType = (ResponseOptionType)theEObject;
				Object result = caseResponseOptionType(responseOptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE: {
				ServiceBindingQueryType serviceBindingQueryType = (ServiceBindingQueryType)theEObject;
				Object result = caseServiceBindingQueryType(serviceBindingQueryType);
				if (result == null) result = caseRegistryObjectQueryType(serviceBindingQueryType);
				if (result == null) result = caseFilterQueryType(serviceBindingQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SERVICE_QUERY_TYPE: {
				ServiceQueryType serviceQueryType = (ServiceQueryType)theEObject;
				Object result = caseServiceQueryType(serviceQueryType);
				if (result == null) result = caseRegistryObjectQueryType(serviceQueryType);
				if (result == null) result = caseFilterQueryType(serviceQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SIMPLE_FILTER_TYPE: {
				SimpleFilterType simpleFilterType = (SimpleFilterType)theEObject;
				Object result = caseSimpleFilterType(simpleFilterType);
				if (result == null) result = caseFilterType(simpleFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SLOT_BRANCH_TYPE: {
				SlotBranchType slotBranchType = (SlotBranchType)theEObject;
				Object result = caseSlotBranchType(slotBranchType);
				if (result == null) result = caseBranchType(slotBranchType);
				if (result == null) result = caseFilterQueryType(slotBranchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE: {
				SpecificationLinkQueryType specificationLinkQueryType = (SpecificationLinkQueryType)theEObject;
				Object result = caseSpecificationLinkQueryType(specificationLinkQueryType);
				if (result == null) result = caseRegistryObjectQueryType(specificationLinkQueryType);
				if (result == null) result = caseFilterQueryType(specificationLinkQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.STRING_FILTER_TYPE: {
				StringFilterType stringFilterType = (StringFilterType)theEObject;
				Object result = caseStringFilterType(stringFilterType);
				if (result == null) result = caseSimpleFilterType(stringFilterType);
				if (result == null) result = caseFilterType(stringFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SUBSCRIPTION_QUERY_TYPE: {
				SubscriptionQueryType subscriptionQueryType = (SubscriptionQueryType)theEObject;
				Object result = caseSubscriptionQueryType(subscriptionQueryType);
				if (result == null) result = caseRegistryObjectQueryType(subscriptionQueryType);
				if (result == null) result = caseFilterQueryType(subscriptionQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.USER_QUERY_TYPE: {
				UserQueryType userQueryType = (UserQueryType)theEObject;
				Object result = caseUserQueryType(userQueryType);
				if (result == null) result = casePersonQueryType(userQueryType);
				if (result == null) result = caseRegistryObjectQueryType(userQueryType);
				if (result == null) result = caseFilterQueryType(userQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Adhoc Query Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Adhoc Query Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdhocQueryQueryType(AdhocQueryQueryType object) {
		return null;
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
	 * Returns the result of interpretting the object as an instance of '<em>Boolean Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Boolean Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanFilterType(BooleanFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBranchType(BranchType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Compound Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Compound Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompoundFilterType(CompoundFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Date Time Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Date Time Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDateTimeFilterType(DateTimeFilterType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>External Identifier Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>External Identifier Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalIdentifierQueryType(ExternalIdentifierQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>External Link Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>External Link Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalLinkQueryType(ExternalLinkQueryType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Federation Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Federation Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationQueryType(FederationQueryType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Float Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Float Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFloatFilterType(FloatFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Integer Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Integer Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntegerFilterType(IntegerFilterType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Notification Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notification Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotificationQueryType(NotificationQueryType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Person Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Person Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePersonQueryType(PersonQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryExpressionBranchType(QueryExpressionBranchType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Registry Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryQueryType(RegistryQueryType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Service Binding Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Binding Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceBindingQueryType(ServiceBindingQueryType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Simple Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Simple Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleFilterType(SimpleFilterType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Specification Link Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Specification Link Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpecificationLinkQueryType(SpecificationLinkQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringFilterType(StringFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Subscription Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Subscription Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubscriptionQueryType(SubscriptionQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>User Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>User Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserQueryType(UserQueryType object) {
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

} //QuerySwitch
