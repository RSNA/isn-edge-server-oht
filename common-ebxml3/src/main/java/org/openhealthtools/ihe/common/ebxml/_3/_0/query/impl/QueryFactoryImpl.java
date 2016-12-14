/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryFactoryImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.ihe.common.ebxml._3._0.query.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryFactory init() {
		try {
			QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0"); 
			if (theQueryFactory != null) {
				return theQueryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QueryPackage.ADHOC_QUERY_QUERY_TYPE: return createAdhocQueryQueryType();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE: return createAdhocQueryRequestType();
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE: return createAdhocQueryResponseType();
			case QueryPackage.ASSOCIATION_QUERY_TYPE: return createAssociationQueryType();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE: return createAuditableEventQueryType();
			case QueryPackage.BOOLEAN_FILTER_TYPE: return createBooleanFilterType();
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE: return createClassificationNodeQueryType();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE: return createClassificationQueryType();
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE: return createClassificationSchemeQueryType();
			case QueryPackage.COMPOUND_FILTER_TYPE: return createCompoundFilterType();
			case QueryPackage.DATE_TIME_FILTER_TYPE: return createDateTimeFilterType();
			case QueryPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case QueryPackage.EXTERNAL_IDENTIFIER_QUERY_TYPE: return createExternalIdentifierQueryType();
			case QueryPackage.EXTERNAL_LINK_QUERY_TYPE: return createExternalLinkQueryType();
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE: return createExtrinsicObjectQueryType();
			case QueryPackage.FEDERATION_QUERY_TYPE: return createFederationQueryType();
			case QueryPackage.FILTER_TYPE: return createFilterType();
			case QueryPackage.FLOAT_FILTER_TYPE: return createFloatFilterType();
			case QueryPackage.INTEGER_FILTER_TYPE: return createIntegerFilterType();
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE: return createInternationalStringBranchType();
			case QueryPackage.NOTIFICATION_QUERY_TYPE: return createNotificationQueryType();
			case QueryPackage.ORGANIZATION_QUERY_TYPE: return createOrganizationQueryType();
			case QueryPackage.PERSON_QUERY_TYPE: return createPersonQueryType();
			case QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE: return createQueryExpressionBranchType();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE: return createRegistryObjectQueryType();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE: return createRegistryPackageQueryType();
			case QueryPackage.REGISTRY_QUERY_TYPE: return createRegistryQueryType();
			case QueryPackage.RESPONSE_OPTION_TYPE: return createResponseOptionType();
			case QueryPackage.SERVICE_BINDING_QUERY_TYPE: return createServiceBindingQueryType();
			case QueryPackage.SERVICE_QUERY_TYPE: return createServiceQueryType();
			case QueryPackage.SLOT_BRANCH_TYPE: return createSlotBranchType();
			case QueryPackage.SPECIFICATION_LINK_QUERY_TYPE: return createSpecificationLinkQueryType();
			case QueryPackage.STRING_FILTER_TYPE: return createStringFilterType();
			case QueryPackage.SUBSCRIPTION_QUERY_TYPE: return createSubscriptionQueryType();
			case QueryPackage.USER_QUERY_TYPE: return createUserQueryType();
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
			case QueryPackage.COMPARATOR_TYPE:
				return createComparatorTypeFromString(eDataType, initialValue);
			case QueryPackage.LOGICAL_OPERATOR_TYPE:
				return createLogicalOperatorTypeFromString(eDataType, initialValue);
			case QueryPackage.RETURN_TYPE_TYPE:
				return createReturnTypeTypeFromString(eDataType, initialValue);
			case QueryPackage.COMPARATOR_TYPE_OBJECT:
				return createComparatorTypeObjectFromString(eDataType, initialValue);
			case QueryPackage.LOGICAL_OPERATOR_TYPE_OBJECT:
				return createLogicalOperatorTypeObjectFromString(eDataType, initialValue);
			case QueryPackage.RETURN_TYPE_TYPE_OBJECT:
				return createReturnTypeTypeObjectFromString(eDataType, initialValue);
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
			case QueryPackage.COMPARATOR_TYPE:
				return convertComparatorTypeToString(eDataType, instanceValue);
			case QueryPackage.LOGICAL_OPERATOR_TYPE:
				return convertLogicalOperatorTypeToString(eDataType, instanceValue);
			case QueryPackage.RETURN_TYPE_TYPE:
				return convertReturnTypeTypeToString(eDataType, instanceValue);
			case QueryPackage.COMPARATOR_TYPE_OBJECT:
				return convertComparatorTypeObjectToString(eDataType, instanceValue);
			case QueryPackage.LOGICAL_OPERATOR_TYPE_OBJECT:
				return convertLogicalOperatorTypeObjectToString(eDataType, instanceValue);
			case QueryPackage.RETURN_TYPE_TYPE_OBJECT:
				return convertReturnTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryQueryType createAdhocQueryQueryType() {
		AdhocQueryQueryTypeImpl adhocQueryQueryType = new AdhocQueryQueryTypeImpl();
		return adhocQueryQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryRequestType createAdhocQueryRequestType() {
		AdhocQueryRequestTypeImpl adhocQueryRequestType = new AdhocQueryRequestTypeImpl();
		return adhocQueryRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryResponseType createAdhocQueryResponseType() {
		AdhocQueryResponseTypeImpl adhocQueryResponseType = new AdhocQueryResponseTypeImpl();
		return adhocQueryResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationQueryType createAssociationQueryType() {
		AssociationQueryTypeImpl associationQueryType = new AssociationQueryTypeImpl();
		return associationQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditableEventQueryType createAuditableEventQueryType() {
		AuditableEventQueryTypeImpl auditableEventQueryType = new AuditableEventQueryTypeImpl();
		return auditableEventQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanFilterType createBooleanFilterType() {
		BooleanFilterTypeImpl booleanFilterType = new BooleanFilterTypeImpl();
		return booleanFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType createClassificationNodeQueryType() {
		ClassificationNodeQueryTypeImpl classificationNodeQueryType = new ClassificationNodeQueryTypeImpl();
		return classificationNodeQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationQueryType createClassificationQueryType() {
		ClassificationQueryTypeImpl classificationQueryType = new ClassificationQueryTypeImpl();
		return classificationQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeQueryType createClassificationSchemeQueryType() {
		ClassificationSchemeQueryTypeImpl classificationSchemeQueryType = new ClassificationSchemeQueryTypeImpl();
		return classificationSchemeQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundFilterType createCompoundFilterType() {
		CompoundFilterTypeImpl compoundFilterType = new CompoundFilterTypeImpl();
		return compoundFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeFilterType createDateTimeFilterType() {
		DateTimeFilterTypeImpl dateTimeFilterType = new DateTimeFilterTypeImpl();
		return dateTimeFilterType;
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
	public ExternalIdentifierQueryType createExternalIdentifierQueryType() {
		ExternalIdentifierQueryTypeImpl externalIdentifierQueryType = new ExternalIdentifierQueryTypeImpl();
		return externalIdentifierQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLinkQueryType createExternalLinkQueryType() {
		ExternalLinkQueryTypeImpl externalLinkQueryType = new ExternalLinkQueryTypeImpl();
		return externalLinkQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrinsicObjectQueryType createExtrinsicObjectQueryType() {
		ExtrinsicObjectQueryTypeImpl extrinsicObjectQueryType = new ExtrinsicObjectQueryTypeImpl();
		return extrinsicObjectQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationQueryType createFederationQueryType() {
		FederationQueryTypeImpl federationQueryType = new FederationQueryTypeImpl();
		return federationQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatFilterType createFloatFilterType() {
		FloatFilterTypeImpl floatFilterType = new FloatFilterTypeImpl();
		return floatFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFilterType createIntegerFilterType() {
		IntegerFilterTypeImpl integerFilterType = new IntegerFilterTypeImpl();
		return integerFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringBranchType createInternationalStringBranchType() {
		InternationalStringBranchTypeImpl internationalStringBranchType = new InternationalStringBranchTypeImpl();
		return internationalStringBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationQueryType createNotificationQueryType() {
		NotificationQueryTypeImpl notificationQueryType = new NotificationQueryTypeImpl();
		return notificationQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQueryType createOrganizationQueryType() {
		OrganizationQueryTypeImpl organizationQueryType = new OrganizationQueryTypeImpl();
		return organizationQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonQueryType createPersonQueryType() {
		PersonQueryTypeImpl personQueryType = new PersonQueryTypeImpl();
		return personQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryExpressionBranchType createQueryExpressionBranchType() {
		QueryExpressionBranchTypeImpl queryExpressionBranchType = new QueryExpressionBranchTypeImpl();
		return queryExpressionBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectQueryType createRegistryObjectQueryType() {
		RegistryObjectQueryTypeImpl registryObjectQueryType = new RegistryObjectQueryTypeImpl();
		return registryObjectQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackageQueryType createRegistryPackageQueryType() {
		RegistryPackageQueryTypeImpl registryPackageQueryType = new RegistryPackageQueryTypeImpl();
		return registryPackageQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryQueryType createRegistryQueryType() {
		RegistryQueryTypeImpl registryQueryType = new RegistryQueryTypeImpl();
		return registryQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOptionType createResponseOptionType() {
		ResponseOptionTypeImpl responseOptionType = new ResponseOptionTypeImpl();
		return responseOptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingQueryType createServiceBindingQueryType() {
		ServiceBindingQueryTypeImpl serviceBindingQueryType = new ServiceBindingQueryTypeImpl();
		return serviceBindingQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQueryType createServiceQueryType() {
		ServiceQueryTypeImpl serviceQueryType = new ServiceQueryTypeImpl();
		return serviceQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotBranchType createSlotBranchType() {
		SlotBranchTypeImpl slotBranchType = new SlotBranchTypeImpl();
		return slotBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationLinkQueryType createSpecificationLinkQueryType() {
		SpecificationLinkQueryTypeImpl specificationLinkQueryType = new SpecificationLinkQueryTypeImpl();
		return specificationLinkQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringFilterType createStringFilterType() {
		StringFilterTypeImpl stringFilterType = new StringFilterTypeImpl();
		return stringFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionQueryType createSubscriptionQueryType() {
		SubscriptionQueryTypeImpl subscriptionQueryType = new SubscriptionQueryTypeImpl();
		return subscriptionQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserQueryType createUserQueryType() {
		UserQueryTypeImpl userQueryType = new UserQueryTypeImpl();
		return userQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparatorType createComparatorTypeFromString(EDataType eDataType, String initialValue) {
		ComparatorType result = ComparatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType createLogicalOperatorTypeFromString(EDataType eDataType, String initialValue) {
		LogicalOperatorType result = LogicalOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType createReturnTypeTypeFromString(EDataType eDataType, String initialValue) {
		ReturnTypeType result = ReturnTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparatorType createComparatorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (ComparatorType)createComparatorTypeFromString(QueryPackage.Literals.COMPARATOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComparatorTypeToString(QueryPackage.Literals.COMPARATOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType createLogicalOperatorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (LogicalOperatorType)createLogicalOperatorTypeFromString(QueryPackage.Literals.LOGICAL_OPERATOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLogicalOperatorTypeToString(QueryPackage.Literals.LOGICAL_OPERATOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType createReturnTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (ReturnTypeType)createReturnTypeTypeFromString(QueryPackage.Literals.RETURN_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReturnTypeTypeToString(QueryPackage.Literals.RETURN_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPackage getQueryPackage() {
		return (QueryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static QueryPackage getPackage() {
		return QueryPackage.eINSTANCE;
	}

} //QueryFactoryImpl
