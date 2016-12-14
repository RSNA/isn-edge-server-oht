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
 * $Id: QueryFactoryImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.ihe.common.ebxml._2._1.query.*;

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
			QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1"); 
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE: return createAdhocQueryRequestType();
			case QueryPackage.ADHOC_QUERY_RESPONSE_TYPE: return createAdhocQueryResponseType();
			case QueryPackage.ASSOCIATION_BRANCH_TYPE: return createAssociationBranchType();
			case QueryPackage.ASSOCIATION_QUERY_RESULT_TYPE: return createAssociationQueryResultType();
			case QueryPackage.ASSOCIATION_QUERY_TYPE: return createAssociationQueryType();
			case QueryPackage.AUDITABLE_EVENT_QUERY_RESULT_TYPE: return createAuditableEventQueryResultType();
			case QueryPackage.AUDITABLE_EVENT_QUERY_TYPE: return createAuditableEventQueryType();
			case QueryPackage.BOOLEAN_CLAUSE_TYPE: return createBooleanClauseType();
			case QueryPackage.CLASSIFICATION_NODE_QUERY_RESULT_TYPE: return createClassificationNodeQueryResultType();
			case QueryPackage.CLASSIFICATION_NODE_QUERY_TYPE: return createClassificationNodeQueryType();
			case QueryPackage.CLASSIFICATION_QUERY_RESULT_TYPE: return createClassificationQueryResultType();
			case QueryPackage.CLASSIFICATION_QUERY_TYPE: return createClassificationQueryType();
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE: return createClassificationSchemeQueryResultType();
			case QueryPackage.CLASSIFICATION_SCHEME_QUERY_TYPE: return createClassificationSchemeQueryType();
			case QueryPackage.CLASSIFIED_BY_BRANCH_TYPE: return createClassifiedByBranchType();
			case QueryPackage.CLAUSE_TYPE: return createClauseType();
			case QueryPackage.COMPOUND_CLAUSE_TYPE: return createCompoundClauseType();
			case QueryPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_RESULT_TYPE: return createExtrinsicObjectQueryResultType();
			case QueryPackage.EXTRINSIC_OBJECT_QUERY_TYPE: return createExtrinsicObjectQueryType();
			case QueryPackage.FILTER_QUERY_RESULT_TYPE: return createFilterQueryResultType();
			case QueryPackage.FILTER_QUERY_TYPE: return createFilterQueryType();
			case QueryPackage.FILTER_TYPE: return createFilterType();
			case QueryPackage.GET_CONTENT_REQUEST_TYPE: return createGetContentRequestType();
			case QueryPackage.GET_CONTENT_RESPONSE_TYPE: return createGetContentResponseType();
			case QueryPackage.INTERNATIONAL_STRING_BRANCH_TYPE: return createInternationalStringBranchType();
			case QueryPackage.ORGANIZATION_QUERY_RESULT_TYPE: return createOrganizationQueryResultType();
			case QueryPackage.ORGANIZATION_QUERY_TYPE: return createOrganizationQueryType();
			case QueryPackage.RATIONAL_CLAUSE_TYPE: return createRationalClauseType();
			case QueryPackage.REGISTRY_ENTRY_QUERY_RESULT_TYPE: return createRegistryEntryQueryResultType();
			case QueryPackage.REGISTRY_ENTRY_QUERY_TYPE: return createRegistryEntryQueryType();
			case QueryPackage.REGISTRY_OBJECT_QUERY_TYPE: return createRegistryObjectQueryType();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_RESULT_TYPE: return createRegistryPackageQueryResultType();
			case QueryPackage.REGISTRY_PACKAGE_QUERY_TYPE: return createRegistryPackageQueryType();
			case QueryPackage.RESPONSE_OPTION_TYPE: return createResponseOptionType();
			case QueryPackage.SERVICE_BINDING_BRANCH_TYPE: return createServiceBindingBranchType();
			case QueryPackage.SERVICE_QUERY_RESULT_TYPE: return createServiceQueryResultType();
			case QueryPackage.SERVICE_QUERY_TYPE: return createServiceQueryType();
			case QueryPackage.SIMPLE_CLAUSE_TYPE: return createSimpleClauseType();
			case QueryPackage.SLOT_BRANCH_TYPE: return createSlotBranchType();
			case QueryPackage.SPECIFICATION_LINK_BRANCH_TYPE: return createSpecificationLinkBranchType();
			case QueryPackage.STRING_CLAUSE_TYPE: return createStringClauseType();
			case QueryPackage.USER_BRANCH_TYPE: return createUserBranchType();
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
			case QueryPackage.CONNECTIVE_PREDICATE_TYPE:
				return createConnectivePredicateTypeFromString(eDataType, initialValue);
			case QueryPackage.LOGICAL_PREDICATE_TYPE:
				return createLogicalPredicateTypeFromString(eDataType, initialValue);
			case QueryPackage.RETURN_TYPE_TYPE:
				return createReturnTypeTypeFromString(eDataType, initialValue);
			case QueryPackage.STRING_PREDICATE_TYPE:
				return createStringPredicateTypeFromString(eDataType, initialValue);
			case QueryPackage.CONNECTIVE_PREDICATE_TYPE_OBJECT:
				return createConnectivePredicateTypeObjectFromString(eDataType, initialValue);
			case QueryPackage.LOGICAL_PREDICATE_TYPE_OBJECT:
				return createLogicalPredicateTypeObjectFromString(eDataType, initialValue);
			case QueryPackage.RETURN_TYPE_TYPE_OBJECT:
				return createReturnTypeTypeObjectFromString(eDataType, initialValue);
			case QueryPackage.STRING_PREDICATE_TYPE_OBJECT:
				return createStringPredicateTypeObjectFromString(eDataType, initialValue);
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
			case QueryPackage.CONNECTIVE_PREDICATE_TYPE:
				return convertConnectivePredicateTypeToString(eDataType, instanceValue);
			case QueryPackage.LOGICAL_PREDICATE_TYPE:
				return convertLogicalPredicateTypeToString(eDataType, instanceValue);
			case QueryPackage.RETURN_TYPE_TYPE:
				return convertReturnTypeTypeToString(eDataType, instanceValue);
			case QueryPackage.STRING_PREDICATE_TYPE:
				return convertStringPredicateTypeToString(eDataType, instanceValue);
			case QueryPackage.CONNECTIVE_PREDICATE_TYPE_OBJECT:
				return convertConnectivePredicateTypeObjectToString(eDataType, instanceValue);
			case QueryPackage.LOGICAL_PREDICATE_TYPE_OBJECT:
				return convertLogicalPredicateTypeObjectToString(eDataType, instanceValue);
			case QueryPackage.RETURN_TYPE_TYPE_OBJECT:
				return convertReturnTypeTypeObjectToString(eDataType, instanceValue);
			case QueryPackage.STRING_PREDICATE_TYPE_OBJECT:
				return convertStringPredicateTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public AssociationBranchType createAssociationBranchType() {
		AssociationBranchTypeImpl associationBranchType = new AssociationBranchTypeImpl();
		return associationBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationQueryResultType createAssociationQueryResultType() {
		AssociationQueryResultTypeImpl associationQueryResultType = new AssociationQueryResultTypeImpl();
		return associationQueryResultType;
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
	public AuditableEventQueryResultType createAuditableEventQueryResultType() {
		AuditableEventQueryResultTypeImpl auditableEventQueryResultType = new AuditableEventQueryResultTypeImpl();
		return auditableEventQueryResultType;
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
	public BooleanClauseType createBooleanClauseType() {
		BooleanClauseTypeImpl booleanClauseType = new BooleanClauseTypeImpl();
		return booleanClauseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryResultType createClassificationNodeQueryResultType() {
		ClassificationNodeQueryResultTypeImpl classificationNodeQueryResultType = new ClassificationNodeQueryResultTypeImpl();
		return classificationNodeQueryResultType;
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
	public ClassificationQueryResultType createClassificationQueryResultType() {
		ClassificationQueryResultTypeImpl classificationQueryResultType = new ClassificationQueryResultTypeImpl();
		return classificationQueryResultType;
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
	public ClassificationSchemeQueryResultType createClassificationSchemeQueryResultType() {
		ClassificationSchemeQueryResultTypeImpl classificationSchemeQueryResultType = new ClassificationSchemeQueryResultTypeImpl();
		return classificationSchemeQueryResultType;
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
	public ClassifiedByBranchType createClassifiedByBranchType() {
		ClassifiedByBranchTypeImpl classifiedByBranchType = new ClassifiedByBranchTypeImpl();
		return classifiedByBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClauseType createClauseType() {
		ClauseTypeImpl clauseType = new ClauseTypeImpl();
		return clauseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundClauseType createCompoundClauseType() {
		CompoundClauseTypeImpl compoundClauseType = new CompoundClauseTypeImpl();
		return compoundClauseType;
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
	public ExtrinsicObjectQueryResultType createExtrinsicObjectQueryResultType() {
		ExtrinsicObjectQueryResultTypeImpl extrinsicObjectQueryResultType = new ExtrinsicObjectQueryResultTypeImpl();
		return extrinsicObjectQueryResultType;
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
	public FilterQueryResultType createFilterQueryResultType() {
		FilterQueryResultTypeImpl filterQueryResultType = new FilterQueryResultTypeImpl();
		return filterQueryResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterQueryType createFilterQueryType() {
		FilterQueryTypeImpl filterQueryType = new FilterQueryTypeImpl();
		return filterQueryType;
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
	public GetContentRequestType createGetContentRequestType() {
		GetContentRequestTypeImpl getContentRequestType = new GetContentRequestTypeImpl();
		return getContentRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetContentResponseType createGetContentResponseType() {
		GetContentResponseTypeImpl getContentResponseType = new GetContentResponseTypeImpl();
		return getContentResponseType;
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
	public OrganizationQueryResultType createOrganizationQueryResultType() {
		OrganizationQueryResultTypeImpl organizationQueryResultType = new OrganizationQueryResultTypeImpl();
		return organizationQueryResultType;
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
	public RationalClauseType createRationalClauseType() {
		RationalClauseTypeImpl rationalClauseType = new RationalClauseTypeImpl();
		return rationalClauseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryResultType createRegistryEntryQueryResultType() {
		RegistryEntryQueryResultTypeImpl registryEntryQueryResultType = new RegistryEntryQueryResultTypeImpl();
		return registryEntryQueryResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryQueryType createRegistryEntryQueryType() {
		RegistryEntryQueryTypeImpl registryEntryQueryType = new RegistryEntryQueryTypeImpl();
		return registryEntryQueryType;
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
	public RegistryPackageQueryResultType createRegistryPackageQueryResultType() {
		RegistryPackageQueryResultTypeImpl registryPackageQueryResultType = new RegistryPackageQueryResultTypeImpl();
		return registryPackageQueryResultType;
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
	public ResponseOptionType createResponseOptionType() {
		ResponseOptionTypeImpl responseOptionType = new ResponseOptionTypeImpl();
		return responseOptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingBranchType createServiceBindingBranchType() {
		ServiceBindingBranchTypeImpl serviceBindingBranchType = new ServiceBindingBranchTypeImpl();
		return serviceBindingBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQueryResultType createServiceQueryResultType() {
		ServiceQueryResultTypeImpl serviceQueryResultType = new ServiceQueryResultTypeImpl();
		return serviceQueryResultType;
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
	public SimpleClauseType createSimpleClauseType() {
		SimpleClauseTypeImpl simpleClauseType = new SimpleClauseTypeImpl();
		return simpleClauseType;
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
	public SpecificationLinkBranchType createSpecificationLinkBranchType() {
		SpecificationLinkBranchTypeImpl specificationLinkBranchType = new SpecificationLinkBranchTypeImpl();
		return specificationLinkBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringClauseType createStringClauseType() {
		StringClauseTypeImpl stringClauseType = new StringClauseTypeImpl();
		return stringClauseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserBranchType createUserBranchType() {
		UserBranchTypeImpl userBranchType = new UserBranchTypeImpl();
		return userBranchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivePredicateType createConnectivePredicateTypeFromString(EDataType eDataType, String initialValue) {
		ConnectivePredicateType result = ConnectivePredicateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectivePredicateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPredicateType createLogicalPredicateTypeFromString(EDataType eDataType, String initialValue) {
		LogicalPredicateType result = LogicalPredicateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalPredicateTypeToString(EDataType eDataType, Object instanceValue) {
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
	public StringPredicateType createStringPredicateTypeFromString(EDataType eDataType, String initialValue) {
		StringPredicateType result = StringPredicateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringPredicateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivePredicateType createConnectivePredicateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (ConnectivePredicateType)createConnectivePredicateTypeFromString(QueryPackage.Literals.CONNECTIVE_PREDICATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectivePredicateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConnectivePredicateTypeToString(QueryPackage.Literals.CONNECTIVE_PREDICATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPredicateType createLogicalPredicateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (LogicalPredicateType)createLogicalPredicateTypeFromString(QueryPackage.Literals.LOGICAL_PREDICATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalPredicateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLogicalPredicateTypeToString(QueryPackage.Literals.LOGICAL_PREDICATE_TYPE, instanceValue);
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
	public StringPredicateType createStringPredicateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (StringPredicateType)createStringPredicateTypeFromString(QueryPackage.Literals.STRING_PREDICATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringPredicateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStringPredicateTypeToString(QueryPackage.Literals.STRING_PREDICATE_TYPE, instanceValue);
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
