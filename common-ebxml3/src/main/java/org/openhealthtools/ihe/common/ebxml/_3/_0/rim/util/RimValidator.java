/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimValidator.java,v 1.1 2006/10/19 20:16:38 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage
 * @generated
 */
public class RimValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RimValidator INSTANCE = new RimValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.ihe.common.ebxml._3._0.rim";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RimValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return RimPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case RimPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case RimPackage.ADHOC_QUERY_TYPE:
				return validateAdhocQueryType((AdhocQueryType)value, diagnostics, context);
			case RimPackage.ASSOCIATION_TYPE1:
				return validateAssociationType1((AssociationType1)value, diagnostics, context);
			case RimPackage.AUDITABLE_EVENT_TYPE:
				return validateAuditableEventType((AuditableEventType)value, diagnostics, context);
			case RimPackage.CLASSIFICATION_NODE_TYPE:
				return validateClassificationNodeType((ClassificationNodeType)value, diagnostics, context);
			case RimPackage.CLASSIFICATION_SCHEME_TYPE:
				return validateClassificationSchemeType((ClassificationSchemeType)value, diagnostics, context);
			case RimPackage.CLASSIFICATION_TYPE:
				return validateClassificationType((ClassificationType)value, diagnostics, context);
			case RimPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case RimPackage.EMAIL_ADDRESS_TYPE:
				return validateEmailAddressType((EmailAddressType)value, diagnostics, context);
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE:
				return validateExternalIdentifierType((ExternalIdentifierType)value, diagnostics, context);
			case RimPackage.EXTERNAL_LINK_TYPE:
				return validateExternalLinkType((ExternalLinkType)value, diagnostics, context);
			case RimPackage.EXTRINSIC_OBJECT_TYPE:
				return validateExtrinsicObjectType((ExtrinsicObjectType)value, diagnostics, context);
			case RimPackage.FEDERATION_TYPE:
				return validateFederationType((FederationType)value, diagnostics, context);
			case RimPackage.IDENTIFIABLE_TYPE:
				return validateIdentifiableType((IdentifiableType)value, diagnostics, context);
			case RimPackage.INTERNATIONAL_STRING_TYPE:
				return validateInternationalStringType((InternationalStringType)value, diagnostics, context);
			case RimPackage.LOCALIZED_STRING_TYPE:
				return validateLocalizedStringType((LocalizedStringType)value, diagnostics, context);
			case RimPackage.NOTIFICATION_TYPE:
				return validateNotificationType((NotificationType)value, diagnostics, context);
			case RimPackage.NOTIFY_ACTION_TYPE:
				return validateNotifyActionType((NotifyActionType)value, diagnostics, context);
			case RimPackage.OBJECT_REF_LIST_TYPE:
				return validateObjectRefListType((ObjectRefListType)value, diagnostics, context);
			case RimPackage.OBJECT_REF_TYPE:
				return validateObjectRefType((ObjectRefType)value, diagnostics, context);
			case RimPackage.ORGANIZATION_TYPE:
				return validateOrganizationType((OrganizationType)value, diagnostics, context);
			case RimPackage.PERSON_NAME_TYPE:
				return validatePersonNameType((PersonNameType)value, diagnostics, context);
			case RimPackage.PERSON_TYPE:
				return validatePersonType((PersonType)value, diagnostics, context);
			case RimPackage.POSTAL_ADDRESS_TYPE:
				return validatePostalAddressType((PostalAddressType)value, diagnostics, context);
			case RimPackage.QUERY_EXPRESSION_TYPE:
				return validateQueryExpressionType((QueryExpressionType)value, diagnostics, context);
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE:
				return validateRegistryObjectListType((RegistryObjectListType)value, diagnostics, context);
			case RimPackage.REGISTRY_OBJECT_TYPE:
				return validateRegistryObjectType((RegistryObjectType)value, diagnostics, context);
			case RimPackage.REGISTRY_PACKAGE_TYPE:
				return validateRegistryPackageType((RegistryPackageType)value, diagnostics, context);
			case RimPackage.REGISTRY_TYPE:
				return validateRegistryType((RegistryType)value, diagnostics, context);
			case RimPackage.SERVICE_BINDING_TYPE:
				return validateServiceBindingType((ServiceBindingType)value, diagnostics, context);
			case RimPackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case RimPackage.SLOT_LIST_TYPE:
				return validateSlotListType((SlotListType)value, diagnostics, context);
			case RimPackage.SLOT_TYPE1:
				return validateSlotType1((SlotType1)value, diagnostics, context);
			case RimPackage.SPECIFICATION_LINK_TYPE:
				return validateSpecificationLinkType((SpecificationLinkType)value, diagnostics, context);
			case RimPackage.SUBSCRIPTION_TYPE:
				return validateSubscriptionType((SubscriptionType)value, diagnostics, context);
			case RimPackage.TELEPHONE_NUMBER_LIST_TYPE:
				return validateTelephoneNumberListType((TelephoneNumberListType)value, diagnostics, context);
			case RimPackage.TELEPHONE_NUMBER_TYPE:
				return validateTelephoneNumberType((TelephoneNumberType)value, diagnostics, context);
			case RimPackage.USER_TYPE:
				return validateUserType((UserType)value, diagnostics, context);
			case RimPackage.VALUE_LIST_TYPE:
				return validateValueListType((ValueListType)value, diagnostics, context);
			case RimPackage.VERSION_INFO_TYPE:
				return validateVersionInfoType((VersionInfoType)value, diagnostics, context);
			case RimPackage.CONFORMANCE_PROFILE_TYPE:
				return validateConformanceProfileType((ConformanceProfileType)value, diagnostics, context);
			case RimPackage.CONFORMANCE_PROFILE_TYPE_OBJECT:
				return validateConformanceProfileTypeObject((ConformanceProfileType)value, diagnostics, context);
			case RimPackage.FREE_FORM_TEXT:
				return validateFreeFormText((String)value, diagnostics, context);
			case RimPackage.LONG_NAME:
				return validateLongName((String)value, diagnostics, context);
			case RimPackage.REFERENCE_URI:
				return validateReferenceURI((String)value, diagnostics, context);
			case RimPackage.SHORT_NAME:
				return validateShortName((String)value, diagnostics, context);
			case RimPackage.STRING16:
				return validateString16((String)value, diagnostics, context);
			case RimPackage.STRING32:
				return validateString32((String)value, diagnostics, context);
			case RimPackage.STRING4:
				return validateString4((String)value, diagnostics, context);
			case RimPackage.STRING8:
				return validateString8((String)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdhocQueryType(AdhocQueryType adhocQueryType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(adhocQueryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationType1(AssociationType1 associationType1, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(associationType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditableEventType(AuditableEventType auditableEventType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(auditableEventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationNodeType(ClassificationNodeType classificationNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(classificationNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationSchemeType(ClassificationSchemeType classificationSchemeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(classificationSchemeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationType(ClassificationType classificationType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(classificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType(EmailAddressType emailAddressType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(emailAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalIdentifierType(ExternalIdentifierType externalIdentifierType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(externalIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalLinkType(ExternalLinkType externalLinkType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(externalLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrinsicObjectType(ExtrinsicObjectType extrinsicObjectType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(extrinsicObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFederationType(FederationType federationType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(federationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiableType(IdentifiableType identifiableType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(identifiableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternationalStringType(InternationalStringType internationalStringType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(internationalStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalizedStringType(LocalizedStringType localizedStringType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(localizedStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationType(NotificationType notificationType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(notificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotifyActionType(NotifyActionType notifyActionType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(notifyActionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectRefListType(ObjectRefListType objectRefListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(objectRefListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectRefType(ObjectRefType objectRefType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(objectRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationType(OrganizationType organizationType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(organizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonNameType(PersonNameType personNameType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(personNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonType(PersonType personType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(personType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalAddressType(PostalAddressType postalAddressType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(postalAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryExpressionType(QueryExpressionType queryExpressionType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(queryExpressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryObjectListType(RegistryObjectListType registryObjectListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(registryObjectListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryObjectType(RegistryObjectType registryObjectType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(registryObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryPackageType(RegistryPackageType registryPackageType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(registryPackageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryType(RegistryType registryType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(registryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBindingType(ServiceBindingType serviceBindingType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(serviceBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotListType(SlotListType slotListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(slotListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotType1(SlotType1 slotType1, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(slotType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificationLinkType(SpecificationLinkType specificationLinkType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(specificationLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionType(SubscriptionType subscriptionType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(subscriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumberListType(TelephoneNumberListType telephoneNumberListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(telephoneNumberListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumberType(TelephoneNumberType telephoneNumberType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(telephoneNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserType(UserType userType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(userType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueListType(ValueListType valueListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(valueListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionInfoType(VersionInfoType versionInfoType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(versionInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceProfileType(ConformanceProfileType conformanceProfileType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceProfileTypeObject(ConformanceProfileType conformanceProfileTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeFormText(String freeFormText, DiagnosticChain diagnostics, Map context) {
		boolean result = validateFreeFormText_MaxLength(freeFormText, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Free Form Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeFormText_MaxLength(String freeFormText, DiagnosticChain diagnostics, Map context) {
		int length = freeFormText.length();  
		boolean result = length <= 1024;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.FREE_FORM_TEXT, freeFormText, length, 1024, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongName(String longName, DiagnosticChain diagnostics, Map context) {
		boolean result = validateLongName_MaxLength(longName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Long Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongName_MaxLength(String longName, DiagnosticChain diagnostics, Map context) {
		int length = longName.length();  
		boolean result = length <= 256;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.LONG_NAME, longName, length, 256, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceURI(String referenceURI, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortName(String shortName, DiagnosticChain diagnostics, Map context) {
		boolean result = validateShortName_MaxLength(shortName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Short Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortName_MaxLength(String shortName, DiagnosticChain diagnostics, Map context) {
		int length = shortName.length();  
		boolean result = length <= 64;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.SHORT_NAME, shortName, length, 64, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString16(String string16, DiagnosticChain diagnostics, Map context) {
		boolean result = validateString16_MaxLength(string16, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>String16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString16_MaxLength(String string16, DiagnosticChain diagnostics, Map context) {
		int length = string16.length();  
		boolean result = length <= 16;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.STRING16, string16, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString32(String string32, DiagnosticChain diagnostics, Map context) {
		boolean result = validateString32_MaxLength(string32, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>String32</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString32_MaxLength(String string32, DiagnosticChain diagnostics, Map context) {
		int length = string32.length();  
		boolean result = length <= 32;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.STRING32, string32, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString4(String string4, DiagnosticChain diagnostics, Map context) {
		boolean result = validateString4_MaxLength(string4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>String4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString4_MaxLength(String string4, DiagnosticChain diagnostics, Map context) {
		int length = string4.length();  
		boolean result = length <= 4;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.STRING4, string4, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString8(String string8, DiagnosticChain diagnostics, Map context) {
		boolean result = validateString8_MaxLength(string8, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>String8</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString8_MaxLength(String string8, DiagnosticChain diagnostics, Map context) {
		int length = string8.length();  
		boolean result = length <= 8;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.STRING8, string8, length, 8, diagnostics, context);
		return result;
	}

} //RimValidator
