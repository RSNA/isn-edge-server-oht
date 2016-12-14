/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimFactoryImpl.java,v 1.1 2006/10/19 20:16:04 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.*;

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
			RimFactory theRimFactory = (RimFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"); 
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
			case RimPackage.ADHOC_QUERY_TYPE: return createAdhocQueryType();
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
			case RimPackage.FEDERATION_TYPE: return createFederationType();
			case RimPackage.IDENTIFIABLE_TYPE: return createIdentifiableType();
			case RimPackage.INTERNATIONAL_STRING_TYPE: return createInternationalStringType();
			case RimPackage.LOCALIZED_STRING_TYPE: return createLocalizedStringType();
			case RimPackage.NOTIFICATION_TYPE: return createNotificationType();
			case RimPackage.NOTIFY_ACTION_TYPE: return createNotifyActionType();
			case RimPackage.OBJECT_REF_LIST_TYPE: return createObjectRefListType();
			case RimPackage.OBJECT_REF_TYPE: return createObjectRefType();
			case RimPackage.ORGANIZATION_TYPE: return createOrganizationType();
			case RimPackage.PERSON_NAME_TYPE: return createPersonNameType();
			case RimPackage.PERSON_TYPE: return createPersonType();
			case RimPackage.POSTAL_ADDRESS_TYPE: return createPostalAddressType();
			case RimPackage.QUERY_EXPRESSION_TYPE: return createQueryExpressionType();
			case RimPackage.REGISTRY_OBJECT_LIST_TYPE: return createRegistryObjectListType();
			case RimPackage.REGISTRY_OBJECT_TYPE: return createRegistryObjectType();
			case RimPackage.REGISTRY_PACKAGE_TYPE: return createRegistryPackageType();
			case RimPackage.REGISTRY_TYPE: return createRegistryType();
			case RimPackage.SERVICE_BINDING_TYPE: return createServiceBindingType();
			case RimPackage.SERVICE_TYPE: return createServiceType();
			case RimPackage.SLOT_LIST_TYPE: return createSlotListType();
			case RimPackage.SLOT_TYPE1: return createSlotType1();
			case RimPackage.SPECIFICATION_LINK_TYPE: return createSpecificationLinkType();
			case RimPackage.SUBSCRIPTION_TYPE: return createSubscriptionType();
			case RimPackage.TELEPHONE_NUMBER_LIST_TYPE: return createTelephoneNumberListType();
			case RimPackage.TELEPHONE_NUMBER_TYPE: return createTelephoneNumberType();
			case RimPackage.USER_TYPE: return createUserType();
			case RimPackage.VALUE_LIST_TYPE: return createValueListType();
			case RimPackage.VERSION_INFO_TYPE: return createVersionInfoType();
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
			case RimPackage.CONFORMANCE_PROFILE_TYPE:
				return createConformanceProfileTypeFromString(eDataType, initialValue);
			case RimPackage.CONFORMANCE_PROFILE_TYPE_OBJECT:
				return createConformanceProfileTypeObjectFromString(eDataType, initialValue);
			case RimPackage.FREE_FORM_TEXT:
				return createFreeFormTextFromString(eDataType, initialValue);
			case RimPackage.LONG_NAME:
				return createLongNameFromString(eDataType, initialValue);
			case RimPackage.REFERENCE_URI:
				return createReferenceURIFromString(eDataType, initialValue);
			case RimPackage.SHORT_NAME:
				return createShortNameFromString(eDataType, initialValue);
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
			case RimPackage.CONFORMANCE_PROFILE_TYPE:
				return convertConformanceProfileTypeToString(eDataType, instanceValue);
			case RimPackage.CONFORMANCE_PROFILE_TYPE_OBJECT:
				return convertConformanceProfileTypeObjectToString(eDataType, instanceValue);
			case RimPackage.FREE_FORM_TEXT:
				return convertFreeFormTextToString(eDataType, instanceValue);
			case RimPackage.LONG_NAME:
				return convertLongNameToString(eDataType, instanceValue);
			case RimPackage.REFERENCE_URI:
				return convertReferenceURIToString(eDataType, instanceValue);
			case RimPackage.SHORT_NAME:
				return convertShortNameToString(eDataType, instanceValue);
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
	public AdhocQueryType createAdhocQueryType() {
		AdhocQueryTypeImpl adhocQueryType = new AdhocQueryTypeImpl();
		return adhocQueryType;
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
	public FederationType createFederationType() {
		FederationTypeImpl federationType = new FederationTypeImpl();
		return federationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableType createIdentifiableType() {
		IdentifiableTypeImpl identifiableType = new IdentifiableTypeImpl();
		return identifiableType;
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
	public LocalizedStringType createLocalizedStringType() {
		LocalizedStringTypeImpl localizedStringType = new LocalizedStringTypeImpl();
		return localizedStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationType createNotificationType() {
		NotificationTypeImpl notificationType = new NotificationTypeImpl();
		return notificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyActionType createNotifyActionType() {
		NotifyActionTypeImpl notifyActionType = new NotifyActionTypeImpl();
		return notifyActionType;
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
	public PersonType createPersonType() {
		PersonTypeImpl personType = new PersonTypeImpl();
		return personType;
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
	public QueryExpressionType createQueryExpressionType() {
		QueryExpressionTypeImpl queryExpressionType = new QueryExpressionTypeImpl();
		return queryExpressionType;
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
	public RegistryType createRegistryType() {
		RegistryTypeImpl registryType = new RegistryTypeImpl();
		return registryType;
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
	public SlotListType createSlotListType() {
		SlotListTypeImpl slotListType = new SlotListTypeImpl();
		return slotListType;
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
	public SubscriptionType createSubscriptionType() {
		SubscriptionTypeImpl subscriptionType = new SubscriptionTypeImpl();
		return subscriptionType;
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
	public VersionInfoType createVersionInfoType() {
		VersionInfoTypeImpl versionInfoType = new VersionInfoTypeImpl();
		return versionInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileType createConformanceProfileTypeFromString(EDataType eDataType, String initialValue) {
		ConformanceProfileType result = ConformanceProfileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceProfileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileType createConformanceProfileTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (ConformanceProfileType)createConformanceProfileTypeFromString(RimPackage.Literals.CONFORMANCE_PROFILE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceProfileTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceProfileTypeToString(RimPackage.Literals.CONFORMANCE_PROFILE_TYPE, instanceValue);
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
	public String createReferenceURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
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
