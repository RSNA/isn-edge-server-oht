/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimSwitch.java,v 1.1 2006/10/19 20:16:38 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.*;

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
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage
 * @generated
 */
public class RimSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RimSwitch() {
		if (modelPackage == null) {
			modelPackage = RimPackage.eINSTANCE;
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
			case RimPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				Object result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.ADHOC_QUERY_TYPE: {
				AdhocQueryType adhocQueryType = (AdhocQueryType)theEObject;
				Object result = caseAdhocQueryType(adhocQueryType);
				if (result == null) result = caseRegistryObjectType(adhocQueryType);
				if (result == null) result = caseIdentifiableType(adhocQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.ASSOCIATION_TYPE1: {
				AssociationType1 associationType1 = (AssociationType1)theEObject;
				Object result = caseAssociationType1(associationType1);
				if (result == null) result = caseRegistryObjectType(associationType1);
				if (result == null) result = caseIdentifiableType(associationType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.AUDITABLE_EVENT_TYPE: {
				AuditableEventType auditableEventType = (AuditableEventType)theEObject;
				Object result = caseAuditableEventType(auditableEventType);
				if (result == null) result = caseRegistryObjectType(auditableEventType);
				if (result == null) result = caseIdentifiableType(auditableEventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.CLASSIFICATION_NODE_TYPE: {
				ClassificationNodeType classificationNodeType = (ClassificationNodeType)theEObject;
				Object result = caseClassificationNodeType(classificationNodeType);
				if (result == null) result = caseRegistryObjectType(classificationNodeType);
				if (result == null) result = caseIdentifiableType(classificationNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.CLASSIFICATION_SCHEME_TYPE: {
				ClassificationSchemeType classificationSchemeType = (ClassificationSchemeType)theEObject;
				Object result = caseClassificationSchemeType(classificationSchemeType);
				if (result == null) result = caseRegistryObjectType(classificationSchemeType);
				if (result == null) result = caseIdentifiableType(classificationSchemeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.CLASSIFICATION_TYPE: {
				ClassificationType classificationType = (ClassificationType)theEObject;
				Object result = caseClassificationType(classificationType);
				if (result == null) result = caseRegistryObjectType(classificationType);
				if (result == null) result = caseIdentifiableType(classificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.EMAIL_ADDRESS_TYPE: {
				EmailAddressType emailAddressType = (EmailAddressType)theEObject;
				Object result = caseEmailAddressType(emailAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE: {
				ExternalIdentifierType externalIdentifierType = (ExternalIdentifierType)theEObject;
				Object result = caseExternalIdentifierType(externalIdentifierType);
				if (result == null) result = caseRegistryObjectType(externalIdentifierType);
				if (result == null) result = caseIdentifiableType(externalIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.EXTERNAL_LINK_TYPE: {
				ExternalLinkType externalLinkType = (ExternalLinkType)theEObject;
				Object result = caseExternalLinkType(externalLinkType);
				if (result == null) result = caseRegistryObjectType(externalLinkType);
				if (result == null) result = caseIdentifiableType(externalLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.EXTRINSIC_OBJECT_TYPE: {
				ExtrinsicObjectType extrinsicObjectType = (ExtrinsicObjectType)theEObject;
				Object result = caseExtrinsicObjectType(extrinsicObjectType);
				if (result == null) result = caseRegistryObjectType(extrinsicObjectType);
				if (result == null) result = caseIdentifiableType(extrinsicObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.FEDERATION_TYPE: {
				FederationType federationType = (FederationType)theEObject;
				Object result = caseFederationType(federationType);
				if (result == null) result = caseRegistryObjectType(federationType);
				if (result == null) result = caseIdentifiableType(federationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.IDENTIFIABLE_TYPE: {
				IdentifiableType identifiableType = (IdentifiableType)theEObject;
				Object result = caseIdentifiableType(identifiableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.INTERNATIONAL_STRING_TYPE: {
				InternationalStringType internationalStringType = (InternationalStringType)theEObject;
				Object result = caseInternationalStringType(internationalStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.LOCALIZED_STRING_TYPE: {
				LocalizedStringType localizedStringType = (LocalizedStringType)theEObject;
				Object result = caseLocalizedStringType(localizedStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.NOTIFICATION_TYPE: {
				NotificationType notificationType = (NotificationType)theEObject;
				Object result = caseNotificationType(notificationType);
				if (result == null) result = caseRegistryObjectType(notificationType);
				if (result == null) result = caseIdentifiableType(notificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.NOTIFY_ACTION_TYPE: {
				NotifyActionType notifyActionType = (NotifyActionType)theEObject;
				Object result = caseNotifyActionType(notifyActionType);
				if (result == null) result = caseActionType(notifyActionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.OBJECT_REF_LIST_TYPE: {
				ObjectRefListType objectRefListType = (ObjectRefListType)theEObject;
				Object result = caseObjectRefListType(objectRefListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.OBJECT_REF_TYPE: {
				ObjectRefType objectRefType = (ObjectRefType)theEObject;
				Object result = caseObjectRefType(objectRefType);
				if (result == null) result = caseIdentifiableType(objectRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.ORGANIZATION_TYPE: {
				OrganizationType organizationType = (OrganizationType)theEObject;
				Object result = caseOrganizationType(organizationType);
				if (result == null) result = caseRegistryObjectType(organizationType);
				if (result == null) result = caseIdentifiableType(organizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.PERSON_NAME_TYPE: {
				PersonNameType personNameType = (PersonNameType)theEObject;
				Object result = casePersonNameType(personNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.PERSON_TYPE: {
				PersonType personType = (PersonType)theEObject;
				Object result = casePersonType(personType);
				if (result == null) result = caseRegistryObjectType(personType);
				if (result == null) result = caseIdentifiableType(personType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.POSTAL_ADDRESS_TYPE: {
				PostalAddressType postalAddressType = (PostalAddressType)theEObject;
				Object result = casePostalAddressType(postalAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.QUERY_EXPRESSION_TYPE: {
				QueryExpressionType queryExpressionType = (QueryExpressionType)theEObject;
				Object result = caseQueryExpressionType(queryExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE: {
				RegistryObjectListType registryObjectListType = (RegistryObjectListType)theEObject;
				Object result = caseRegistryObjectListType(registryObjectListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.REGISTRY_OBJECT_TYPE: {
				RegistryObjectType registryObjectType = (RegistryObjectType)theEObject;
				Object result = caseRegistryObjectType(registryObjectType);
				if (result == null) result = caseIdentifiableType(registryObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.REGISTRY_PACKAGE_TYPE: {
				RegistryPackageType registryPackageType = (RegistryPackageType)theEObject;
				Object result = caseRegistryPackageType(registryPackageType);
				if (result == null) result = caseRegistryObjectType(registryPackageType);
				if (result == null) result = caseIdentifiableType(registryPackageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.REGISTRY_TYPE: {
				RegistryType registryType = (RegistryType)theEObject;
				Object result = caseRegistryType(registryType);
				if (result == null) result = caseRegistryObjectType(registryType);
				if (result == null) result = caseIdentifiableType(registryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.SERVICE_BINDING_TYPE: {
				ServiceBindingType serviceBindingType = (ServiceBindingType)theEObject;
				Object result = caseServiceBindingType(serviceBindingType);
				if (result == null) result = caseRegistryObjectType(serviceBindingType);
				if (result == null) result = caseIdentifiableType(serviceBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				Object result = caseServiceType(serviceType);
				if (result == null) result = caseRegistryObjectType(serviceType);
				if (result == null) result = caseIdentifiableType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.SLOT_LIST_TYPE: {
				SlotListType slotListType = (SlotListType)theEObject;
				Object result = caseSlotListType(slotListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.SLOT_TYPE1: {
				SlotType1 slotType1 = (SlotType1)theEObject;
				Object result = caseSlotType1(slotType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.SPECIFICATION_LINK_TYPE: {
				SpecificationLinkType specificationLinkType = (SpecificationLinkType)theEObject;
				Object result = caseSpecificationLinkType(specificationLinkType);
				if (result == null) result = caseRegistryObjectType(specificationLinkType);
				if (result == null) result = caseIdentifiableType(specificationLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.SUBSCRIPTION_TYPE: {
				SubscriptionType subscriptionType = (SubscriptionType)theEObject;
				Object result = caseSubscriptionType(subscriptionType);
				if (result == null) result = caseRegistryObjectType(subscriptionType);
				if (result == null) result = caseIdentifiableType(subscriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.TELEPHONE_NUMBER_LIST_TYPE: {
				TelephoneNumberListType telephoneNumberListType = (TelephoneNumberListType)theEObject;
				Object result = caseTelephoneNumberListType(telephoneNumberListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.TELEPHONE_NUMBER_TYPE: {
				TelephoneNumberType telephoneNumberType = (TelephoneNumberType)theEObject;
				Object result = caseTelephoneNumberType(telephoneNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.USER_TYPE: {
				UserType userType = (UserType)theEObject;
				Object result = caseUserType(userType);
				if (result == null) result = casePersonType(userType);
				if (result == null) result = caseRegistryObjectType(userType);
				if (result == null) result = caseIdentifiableType(userType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.VALUE_LIST_TYPE: {
				ValueListType valueListType = (ValueListType)theEObject;
				Object result = caseValueListType(valueListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RimPackage.VERSION_INFO_TYPE: {
				VersionInfoType versionInfoType = (VersionInfoType)theEObject;
				Object result = caseVersionInfoType(versionInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionType(ActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Adhoc Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Adhoc Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdhocQueryType(AdhocQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociationType1(AssociationType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Auditable Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Auditable Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAuditableEventType(AuditableEventType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationNodeType(ClassificationNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Scheme Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Scheme Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationSchemeType(ClassificationSchemeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationType(ClassificationType object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Email Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Email Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmailAddressType(EmailAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>External Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>External Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalIdentifierType(ExternalIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>External Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>External Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalLinkType(ExternalLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extrinsic Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extrinsic Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtrinsicObjectType(ExtrinsicObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Federation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Federation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationType(FederationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Identifiable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Identifiable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentifiableType(IdentifiableType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>International String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>International String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInternationalStringType(InternationalStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Localized String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Localized String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocalizedStringType(LocalizedStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Notification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotificationType(NotificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Notify Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notify Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotifyActionType(NotifyActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object Ref List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object Ref List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectRefListType(ObjectRefListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectRefType(ObjectRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Organization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrganizationType(OrganizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Person Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Person Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePersonNameType(PersonNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePersonType(PersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Postal Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Postal Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostalAddressType(PostalAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Query Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Query Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryExpressionType(QueryExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Object List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Object List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryObjectListType(RegistryObjectListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryObjectType(RegistryObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Package Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryPackageType(RegistryPackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Registry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Registry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegistryType(RegistryType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceBindingType(ServiceBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Slot List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Slot List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSlotListType(SlotListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Slot Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Slot Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSlotType1(SlotType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Specification Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Specification Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpecificationLinkType(SpecificationLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Subscription Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Subscription Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubscriptionType(SubscriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Telephone Number List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Telephone Number List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTelephoneNumberListType(TelephoneNumberListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Telephone Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTelephoneNumberType(TelephoneNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>User Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>User Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserType(UserType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Value List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Value List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueListType(ValueListType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Version Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Version Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVersionInfoType(VersionInfoType object) {
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

} //RimSwitch
