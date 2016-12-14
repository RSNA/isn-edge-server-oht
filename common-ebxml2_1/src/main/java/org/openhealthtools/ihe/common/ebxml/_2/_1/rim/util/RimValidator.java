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
 * $Id: RimValidator.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage
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
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.ihe.common.ebxml._2._1.rim";

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
			case RimPackage.INTERNATIONAL_STRING_TYPE:
				return validateInternationalStringType((InternationalStringType)value, diagnostics, context);
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE:
				return validateLeafRegistryObjectListType((LeafRegistryObjectListType)value, diagnostics, context);
			case RimPackage.LOCALIZED_STRING_TYPE:
				return validateLocalizedStringType((LocalizedStringType)value, diagnostics, context);
			case RimPackage.OBJECT_REF_LIST_TYPE:
				return validateObjectRefListType((ObjectRefListType)value, diagnostics, context);
			case RimPackage.OBJECT_REF_TYPE:
				return validateObjectRefType((ObjectRefType)value, diagnostics, context);
			case RimPackage.ORGANIZATION_TYPE:
				return validateOrganizationType((OrganizationType)value, diagnostics, context);
			case RimPackage.PERSON_NAME_TYPE:
				return validatePersonNameType((PersonNameType)value, diagnostics, context);
			case RimPackage.POSTAL_ADDRESS_TYPE:
				return validatePostalAddressType((PostalAddressType)value, diagnostics, context);
			case RimPackage.REGISTRY_ENTRY_TYPE:
				return validateRegistryEntryType((RegistryEntryType)value, diagnostics, context);
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE:
				return validateRegistryObjectListType((RegistryObjectListType)value, diagnostics, context);
			case RimPackage.REGISTRY_OBJECT_TYPE:
				return validateRegistryObjectType((RegistryObjectType)value, diagnostics, context);
			case RimPackage.REGISTRY_PACKAGE_TYPE:
				return validateRegistryPackageType((RegistryPackageType)value, diagnostics, context);
			case RimPackage.SERVICE_BINDING_TYPE:
				return validateServiceBindingType((ServiceBindingType)value, diagnostics, context);
			case RimPackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case RimPackage.SLOT_TYPE1:
				return validateSlotType1((SlotType1)value, diagnostics, context);
			case RimPackage.SPECIFICATION_LINK_TYPE:
				return validateSpecificationLinkType((SpecificationLinkType)value, diagnostics, context);
			case RimPackage.TELEPHONE_NUMBER_LIST_TYPE:
				return validateTelephoneNumberListType((TelephoneNumberListType)value, diagnostics, context);
			case RimPackage.TELEPHONE_NUMBER_TYPE:
				return validateTelephoneNumberType((TelephoneNumberType)value, diagnostics, context);
			case RimPackage.USER_TYPE:
				return validateUserType((UserType)value, diagnostics, context);
			case RimPackage.VALUE_LIST_TYPE:
				return validateValueListType((ValueListType)value, diagnostics, context);
			case RimPackage.EVENT_TYPE_TYPE:
				return validateEventTypeType((EventTypeType)value, diagnostics, context);
			case RimPackage.NODE_TYPE_TYPE:
				return validateNodeTypeType((NodeTypeType)value, diagnostics, context);
			case RimPackage.STABILITY_TYPE:
				return validateStabilityType((StabilityType)value, diagnostics, context);
			case RimPackage.STATUS_TYPE:
				return validateStatusType((StatusType)value, diagnostics, context);
			case RimPackage.EVENT_TYPE_TYPE_OBJECT:
				return validateEventTypeTypeObject((EventTypeType)value, diagnostics, context);
			case RimPackage.FREE_FORM_TEXT:
				return validateFreeFormText((String)value, diagnostics, context);
			case RimPackage.LONG_NAME:
				return validateLongName((String)value, diagnostics, context);
			case RimPackage.NODE_TYPE_TYPE_OBJECT:
				return validateNodeTypeTypeObject((NodeTypeType)value, diagnostics, context);
			case RimPackage.SHORT_NAME:
				return validateShortName((String)value, diagnostics, context);
			case RimPackage.STABILITY_TYPE_OBJECT:
				return validateStabilityTypeObject((StabilityType)value, diagnostics, context);
			case RimPackage.STATUS_TYPE_OBJECT:
				return validateStatusTypeObject((StatusType)value, diagnostics, context);
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
	public boolean validateInternationalStringType(InternationalStringType internationalStringType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(internationalStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeafRegistryObjectListType(LeafRegistryObjectListType leafRegistryObjectListType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(leafRegistryObjectListType, diagnostics, context);
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
	public boolean validatePostalAddressType(PostalAddressType postalAddressType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(postalAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryEntryType(RegistryEntryType registryEntryType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(registryEntryType, diagnostics, context);
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
	public boolean validateEventTypeType(EventTypeType eventTypeType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeTypeType(NodeTypeType nodeTypeType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStabilityType(StabilityType stabilityType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusType(StatusType statusType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTypeTypeObject(EventTypeType eventTypeTypeObject, DiagnosticChain diagnostics, Map context) {
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
		boolean result = length <= 256;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.FREE_FORM_TEXT, freeFormText, length, 256, diagnostics, context);
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
		boolean result = length <= 128;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(RimPackage.Literals.LONG_NAME, longName, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeTypeTypeObject(NodeTypeType nodeTypeTypeObject, DiagnosticChain diagnostics, Map context) {
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
	public boolean validateStabilityTypeObject(StabilityType stabilityTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusTypeObject(StatusType statusTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
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
