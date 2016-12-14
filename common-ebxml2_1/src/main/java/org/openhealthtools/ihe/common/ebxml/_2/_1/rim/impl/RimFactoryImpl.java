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
 * $Id: RimFactoryImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RimFactoryImpl extends EFactoryImpl implements RimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RimFactory init() {
		try {
			RimFactory theRimFactory = (RimFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"); 
			if (theRimFactory != null) {
				return theRimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RimPackage.ASSOCIATION_TYPE1: return createAssociationType1();
			case RimPackage.AUDITABLE_EVENT_TYPE: return createAuditableEventType();
			case RimPackage.CLASSIFICATION_NODE_TYPE: return createClassificationNodeType();
			case RimPackage.CLASSIFICATION_SCHEME_TYPE: return createClassificationSchemeType();
			case RimPackage.CLASSIFICATION_TYPE: return createClassificationType();
			case RimPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RimPackage.EMAIL_ADDRESS_TYPE: return createEmailAddressType();
			case RimPackage.EXTERNAL_IDENTIFIER_TYPE: return createExternalIdentifierType();
			case RimPackage.EXTERNAL_LINK_TYPE: return createExternalLinkType();
			case RimPackage.EXTRINSIC_OBJECT_TYPE: return createExtrinsicObjectType();
			case RimPackage.INTERNATIONAL_STRING_TYPE: return createInternationalStringType();
			case RimPackage.LEAF_REGISTRY_OBJECT_LIST_TYPE: return createLeafRegistryObjectListType();
			case RimPackage.LOCALIZED_STRING_TYPE: return createLocalizedStringType();
			case RimPackage.OBJECT_REF_LIST_TYPE: return createObjectRefListType();
			case RimPackage.OBJECT_REF_TYPE: return createObjectRefType();
			case RimPackage.ORGANIZATION_TYPE: return createOrganizationType();
			case RimPackage.PERSON_NAME_TYPE: return createPersonNameType();
			case RimPackage.POSTAL_ADDRESS_TYPE: return createPostalAddressType();
			case RimPackage.REGISTRY_ENTRY_TYPE: return createRegistryEntryType();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE: return createRegistryObjectListType();
			case RimPackage.REGISTRY_OBJECT_TYPE: return createRegistryObjectType();
			case RimPackage.REGISTRY_PACKAGE_TYPE: return createRegistryPackageType();
			case RimPackage.SERVICE_BINDING_TYPE: return createServiceBindingType();
			case RimPackage.SERVICE_TYPE: return createServiceType();
			case RimPackage.SLOT_TYPE1: return createSlotType1();
			case RimPackage.SPECIFICATION_LINK_TYPE: return createSpecificationLinkType();
			case RimPackage.TELEPHONE_NUMBER_LIST_TYPE: return createTelephoneNumberListType();
			case RimPackage.TELEPHONE_NUMBER_TYPE: return createTelephoneNumberType();
			case RimPackage.USER_TYPE: return createUserType();
			case RimPackage.VALUE_LIST_TYPE: return createValueListType();
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
			case RimPackage.EVENT_TYPE_TYPE:
				return createEventTypeTypeFromString(eDataType, initialValue);
			case RimPackage.NODE_TYPE_TYPE:
				return createNodeTypeTypeFromString(eDataType, initialValue);
			case RimPackage.STABILITY_TYPE:
				return createStabilityTypeFromString(eDataType, initialValue);
			case RimPackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case RimPackage.EVENT_TYPE_TYPE_OBJECT:
				return createEventTypeTypeObjectFromString(eDataType, initialValue);
			case RimPackage.FREE_FORM_TEXT:
				return createFreeFormTextFromString(eDataType, initialValue);
			case RimPackage.LONG_NAME:
				return createLongNameFromString(eDataType, initialValue);
			case RimPackage.NODE_TYPE_TYPE_OBJECT:
				return createNodeTypeTypeObjectFromString(eDataType, initialValue);
			case RimPackage.SHORT_NAME:
				return createShortNameFromString(eDataType, initialValue);
			case RimPackage.STABILITY_TYPE_OBJECT:
				return createStabilityTypeObjectFromString(eDataType, initialValue);
			case RimPackage.STATUS_TYPE_OBJECT:
				return createStatusTypeObjectFromString(eDataType, initialValue);
			case RimPackage.STRING16:
				return createString16FromString(eDataType, initialValue);
			case RimPackage.STRING32:
				return createString32FromString(eDataType, initialValue);
			case RimPackage.STRING4:
				return createString4FromString(eDataType, initialValue);
			case RimPackage.STRING8:
				return createString8FromString(eDataType, initialValue);
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
			case RimPackage.EVENT_TYPE_TYPE:
				return convertEventTypeTypeToString(eDataType, instanceValue);
			case RimPackage.NODE_TYPE_TYPE:
				return convertNodeTypeTypeToString(eDataType, instanceValue);
			case RimPackage.STABILITY_TYPE:
				return convertStabilityTypeToString(eDataType, instanceValue);
			case RimPackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case RimPackage.EVENT_TYPE_TYPE_OBJECT:
				return convertEventTypeTypeObjectToString(eDataType, instanceValue);
			case RimPackage.FREE_FORM_TEXT:
				return convertFreeFormTextToString(eDataType, instanceValue);
			case RimPackage.LONG_NAME:
				return convertLongNameToString(eDataType, instanceValue);
			case RimPackage.NODE_TYPE_TYPE_OBJECT:
				return convertNodeTypeTypeObjectToString(eDataType, instanceValue);
			case RimPackage.SHORT_NAME:
				return convertShortNameToString(eDataType, instanceValue);
			case RimPackage.STABILITY_TYPE_OBJECT:
				return convertStabilityTypeObjectToString(eDataType, instanceValue);
			case RimPackage.STATUS_TYPE_OBJECT:
				return convertStatusTypeObjectToString(eDataType, instanceValue);
			case RimPackage.STRING16:
				return convertString16ToString(eDataType, instanceValue);
			case RimPackage.STRING32:
				return convertString32ToString(eDataType, instanceValue);
			case RimPackage.STRING4:
				return convertString4ToString(eDataType, instanceValue);
			case RimPackage.STRING8:
				return convertString8ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType1 createAssociationType1() {
		AssociationType1Impl associationType1 = new AssociationType1Impl();
		return associationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditableEventType createAuditableEventType() {
		AuditableEventTypeImpl auditableEventType = new AuditableEventTypeImpl();
		return auditableEventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeType createClassificationNodeType() {
		ClassificationNodeTypeImpl classificationNodeType = new ClassificationNodeTypeImpl();
		return classificationNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeType createClassificationSchemeType() {
		ClassificationSchemeTypeImpl classificationSchemeType = new ClassificationSchemeTypeImpl();
		return classificationSchemeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationType createClassificationType() {
		ClassificationTypeImpl classificationType = new ClassificationTypeImpl();
		return classificationType;
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
	public EmailAddressType createEmailAddressType() {
		EmailAddressTypeImpl emailAddressType = new EmailAddressTypeImpl();
		return emailAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalIdentifierType createExternalIdentifierType() {
		ExternalIdentifierTypeImpl externalIdentifierType = new ExternalIdentifierTypeImpl();
		return externalIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLinkType createExternalLinkType() {
		ExternalLinkTypeImpl externalLinkType = new ExternalLinkTypeImpl();
		return externalLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrinsicObjectType createExtrinsicObjectType() {
		ExtrinsicObjectTypeImpl extrinsicObjectType = new ExtrinsicObjectTypeImpl();
		return extrinsicObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType createInternationalStringType() {
		InternationalStringTypeImpl internationalStringType = new InternationalStringTypeImpl();
		return internationalStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafRegistryObjectListType createLeafRegistryObjectListType() {
		LeafRegistryObjectListTypeImpl leafRegistryObjectListType = new LeafRegistryObjectListTypeImpl();
		return leafRegistryObjectListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedStringType createLocalizedStringType() {
		LocalizedStringTypeImpl localizedStringType = new LocalizedStringTypeImpl();
		return localizedStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefListType createObjectRefListType() {
		ObjectRefListTypeImpl objectRefListType = new ObjectRefListTypeImpl();
		return objectRefListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType createObjectRefType() {
		ObjectRefTypeImpl objectRefType = new ObjectRefTypeImpl();
		return objectRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType createOrganizationType() {
		OrganizationTypeImpl organizationType = new OrganizationTypeImpl();
		return organizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType createPersonNameType() {
		PersonNameTypeImpl personNameType = new PersonNameTypeImpl();
		return personNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddressType createPostalAddressType() {
		PostalAddressTypeImpl postalAddressType = new PostalAddressTypeImpl();
		return postalAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryType createRegistryEntryType() {
		RegistryEntryTypeImpl registryEntryType = new RegistryEntryTypeImpl();
		return registryEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType createRegistryObjectListType() {
		RegistryObjectListTypeImpl registryObjectListType = new RegistryObjectListTypeImpl();
		return registryObjectListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectType createRegistryObjectType() {
		RegistryObjectTypeImpl registryObjectType = new RegistryObjectTypeImpl();
		return registryObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackageType createRegistryPackageType() {
		RegistryPackageTypeImpl registryPackageType = new RegistryPackageTypeImpl();
		return registryPackageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingType createServiceBindingType() {
		ServiceBindingTypeImpl serviceBindingType = new ServiceBindingTypeImpl();
		return serviceBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotType1 createSlotType1() {
		SlotType1Impl slotType1 = new SlotType1Impl();
		return slotType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationLinkType createSpecificationLinkType() {
		SpecificationLinkTypeImpl specificationLinkType = new SpecificationLinkTypeImpl();
		return specificationLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberListType createTelephoneNumberListType() {
		TelephoneNumberListTypeImpl telephoneNumberListType = new TelephoneNumberListTypeImpl();
		return telephoneNumberListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType createTelephoneNumberType() {
		TelephoneNumberTypeImpl telephoneNumberType = new TelephoneNumberTypeImpl();
		return telephoneNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType createUserType() {
		UserTypeImpl userType = new UserTypeImpl();
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListType createValueListType() {
		ValueListTypeImpl valueListType = new ValueListTypeImpl();
		return valueListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeType createEventTypeTypeFromString(EDataType eDataType, String initialValue) {
		EventTypeType result = EventTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType createNodeTypeTypeFromString(EDataType eDataType, String initialValue) {
		NodeTypeType result = NodeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StabilityType createStabilityTypeFromString(EDataType eDataType, String initialValue) {
		StabilityType result = StabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStabilityTypeToString(EDataType eDataType, Object instanceValue) {
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
	public EventTypeType createEventTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (EventTypeType)createEventTypeTypeFromString(RimPackage.Literals.EVENT_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTypeTypeToString(RimPackage.Literals.EVENT_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFreeFormTextFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreeFormTextToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLongNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType createNodeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (NodeTypeType)createNodeTypeTypeFromString(RimPackage.Literals.NODE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNodeTypeTypeToString(RimPackage.Literals.NODE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createShortNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StabilityType createStabilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (StabilityType)createStabilityTypeFromString(RimPackage.Literals.STABILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStabilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStabilityTypeToString(RimPackage.Literals.STABILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (StatusType)createStatusTypeFromString(RimPackage.Literals.STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusTypeToString(RimPackage.Literals.STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createString16FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString16ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createString32FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString32ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createString4FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createString8FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertString8ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RimPackage getRimPackage() {
		return (RimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static RimPackage getPackage() {
		return RimPackage.eINSTANCE;
	}

} //RimFactoryImpl
