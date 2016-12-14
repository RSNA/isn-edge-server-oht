/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryPackageImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;



import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.BranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalLinkQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FederationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.UserQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryPackageImpl extends EPackageImpl implements QueryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adhocQueryQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adhocQueryRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adhocQueryResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditableEventQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationNodeQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationSchemeQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalIdentifierQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalLinkQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extrinsicObjectQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federationQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalStringBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryExpressionBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryObjectQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryPackageQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseOptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBindingQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationLinkQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userQueryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comparatorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType logicalOperatorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType returnTypeTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryPackageImpl() {
		super(eNS_URI, QueryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueryPackage init() {
		if (isInited) return (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Obtain or create and register package
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new QueryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RimPackage.eINSTANCE.eClass();
		RegistryPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQueryPackage.createPackageContents();

		// Initialize created meta-data
		theQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueryPackage.freeze();

		return theQueryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdhocQueryQueryType() {
		return adhocQueryQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdhocQueryQueryType_QueryExpressionBranch() {
		return (EReference)adhocQueryQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdhocQueryRequestType() {
		return adhocQueryRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdhocQueryRequestType_ResponseOption() {
		return (EReference)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdhocQueryRequestType_AdhocQuery() {
		return (EReference)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdhocQueryRequestType_Federated() {
		return (EAttribute)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdhocQueryRequestType_Federation() {
		return (EAttribute)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdhocQueryRequestType_MaxResults() {
		return (EAttribute)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdhocQueryRequestType_StartIndex() {
		return (EAttribute)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdhocQueryResponseType() {
		return adhocQueryResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdhocQueryResponseType_RegistryObjectList() {
		return (EReference)adhocQueryResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdhocQueryResponseType_StartIndex() {
		return (EAttribute)adhocQueryResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdhocQueryResponseType_TotalResultCount() {
		return (EAttribute)adhocQueryResponseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationQueryType() {
		return associationQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationQueryType_AssociationTypeQuery() {
		return (EReference)associationQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationQueryType_SourceObjectQuery() {
		return (EReference)associationQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationQueryType_TargetObjectQuery() {
		return (EReference)associationQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditableEventQueryType() {
		return auditableEventQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryType_AffectedObjectQuery() {
		return (EReference)auditableEventQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryType_EventTypeQuery() {
		return (EReference)auditableEventQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryType_UserQuery() {
		return (EReference)auditableEventQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanFilterType() {
		return booleanFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanFilterType_Value() {
		return (EAttribute)booleanFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchType() {
		return branchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationNodeQueryType() {
		return classificationNodeQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryType_ParentQuery() {
		return (EReference)classificationNodeQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryType_ChildrenQuery() {
		return (EReference)classificationNodeQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationQueryType() {
		return classificationQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryType_ClassificationSchemeQuery() {
		return (EReference)classificationQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryType_ClassifiedObjectQuery() {
		return (EReference)classificationQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryType_ClassificationNodeQuery() {
		return (EReference)classificationQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationSchemeQueryType() {
		return classificationSchemeQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationSchemeQueryType_ChildrenQuery() {
		return (EReference)classificationSchemeQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationSchemeQueryType_NodeTypeQuery() {
		return (EReference)classificationSchemeQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundFilterType() {
		return compoundFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundFilterType_LeftFilter() {
		return (EReference)compoundFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundFilterType_RightFilter() {
		return (EReference)compoundFilterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundFilterType_LogicalOperator() {
		return (EAttribute)compoundFilterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeFilterType() {
		return dateTimeFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeFilterType_Value() {
		return (EAttribute)dateTimeFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdhocQueryQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdhocQueryRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdhocQueryResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditableEventQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BooleanFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNodeQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationSchemeQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompoundFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateTimeFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalIdentifierQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalLinkQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtrinsicObjectQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FederationQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Filter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FloatFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntegerFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NotificationQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObjectQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryPackageQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResponseOption() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceBindingQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpecificationLinkQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StringFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubscriptionQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalIdentifierQueryType() {
		return externalIdentifierQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalIdentifierQueryType_RegistryObjectQuery() {
		return (EReference)externalIdentifierQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalIdentifierQueryType_IdentificationSchemeQuery() {
		return (EReference)externalIdentifierQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalLinkQueryType() {
		return externalLinkQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtrinsicObjectQueryType() {
		return extrinsicObjectQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtrinsicObjectQueryType_ContentVersionInfoFilter() {
		return (EReference)extrinsicObjectQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationQueryType() {
		return federationQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterQueryType() {
		return filterQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_PrimaryFilter() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterType() {
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterType_Negate() {
		return (EAttribute)filterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatFilterType() {
		return floatFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatFilterType_Value() {
		return (EAttribute)floatFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerFilterType() {
		return integerFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerFilterType_Value() {
		return (EAttribute)integerFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternationalStringBranchType() {
		return internationalStringBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalStringBranchType_LocalizedStringFilter() {
		return (EReference)internationalStringBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationQueryType() {
		return notificationQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationQueryType_RegistryObjectQuery() {
		return (EReference)notificationQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationQueryType() {
		return organizationQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_AddressFilter() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_TelephoneNumberFilter() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_EmailAddresseFilter() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_ParentQuery() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_ChildOrganizationQuery() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_PrimaryContactQuery() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonQueryType() {
		return personQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonQueryType_AddressFilter() {
		return (EReference)personQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonQueryType_PersonNameFilter() {
		return (EReference)personQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonQueryType_TelephoneNumberFilter() {
		return (EReference)personQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonQueryType_EmailAddresseFilter() {
		return (EReference)personQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryExpressionBranchType() {
		return queryExpressionBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryExpressionBranchType_QueryLanguageQuery() {
		return (EReference)queryExpressionBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryObjectQueryType() {
		return registryObjectQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_SlotBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_NameBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_DescriptionBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_VersionInfoFilter() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_ClassificationQuery() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_ExternalIdentifierQuery() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_ObjectTypeQuery() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_StatusQuery() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_SourceAssociationQuery() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_TargetAssociationQuery() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryPackageQueryType() {
		return registryPackageQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageQueryType_RegistryObjectQuery() {
		return (EReference)registryPackageQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryQueryType() {
		return registryQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryQueryType_OperatorQuery() {
		return (EReference)registryQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseOptionType() {
		return responseOptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseOptionType_ReturnComposedObjects() {
		return (EAttribute)responseOptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseOptionType_ReturnType() {
		return (EAttribute)responseOptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBindingQueryType() {
		return serviceBindingQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingQueryType_ServiceQuery() {
		return (EReference)serviceBindingQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingQueryType_SpecificationLinkQuery() {
		return (EReference)serviceBindingQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingQueryType_TargetBindingQuery() {
		return (EReference)serviceBindingQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceQueryType() {
		return serviceQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQueryType_ServiceBindingQuery() {
		return (EReference)serviceQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleFilterType() {
		return simpleFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleFilterType_Comparator() {
		return (EAttribute)simpleFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleFilterType_DomainAttribute() {
		return (EAttribute)simpleFilterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotBranchType() {
		return slotBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationLinkQueryType() {
		return specificationLinkQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationLinkQueryType_UsageDescriptionBranch() {
		return (EReference)specificationLinkQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationLinkQueryType_ServiceBindingQuery() {
		return (EReference)specificationLinkQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationLinkQueryType_SpecificationObjectQuery() {
		return (EReference)specificationLinkQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringFilterType() {
		return stringFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringFilterType_Value() {
		return (EAttribute)stringFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionQueryType() {
		return subscriptionQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionQueryType_SelectorQuery() {
		return (EReference)subscriptionQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserQueryType() {
		return userQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparatorType() {
		return comparatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperatorType() {
		return logicalOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReturnTypeType() {
		return returnTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComparatorTypeObject() {
		return comparatorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLogicalOperatorTypeObject() {
		return logicalOperatorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReturnTypeTypeObject() {
		return returnTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactory getQueryFactory() {
		return (QueryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adhocQueryQueryTypeEClass = createEClass(ADHOC_QUERY_QUERY_TYPE);
		createEReference(adhocQueryQueryTypeEClass, ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH);

		adhocQueryRequestTypeEClass = createEClass(ADHOC_QUERY_REQUEST_TYPE);
		createEReference(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION);
		createEReference(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY);
		createEAttribute(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__FEDERATED);
		createEAttribute(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__FEDERATION);
		createEAttribute(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS);
		createEAttribute(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__START_INDEX);

		adhocQueryResponseTypeEClass = createEClass(ADHOC_QUERY_RESPONSE_TYPE);
		createEReference(adhocQueryResponseTypeEClass, ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST);
		createEAttribute(adhocQueryResponseTypeEClass, ADHOC_QUERY_RESPONSE_TYPE__START_INDEX);
		createEAttribute(adhocQueryResponseTypeEClass, ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT);

		associationQueryTypeEClass = createEClass(ASSOCIATION_QUERY_TYPE);
		createEReference(associationQueryTypeEClass, ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY);
		createEReference(associationQueryTypeEClass, ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY);
		createEReference(associationQueryTypeEClass, ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY);

		auditableEventQueryTypeEClass = createEClass(AUDITABLE_EVENT_QUERY_TYPE);
		createEReference(auditableEventQueryTypeEClass, AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY);
		createEReference(auditableEventQueryTypeEClass, AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY);
		createEReference(auditableEventQueryTypeEClass, AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY);

		booleanFilterTypeEClass = createEClass(BOOLEAN_FILTER_TYPE);
		createEAttribute(booleanFilterTypeEClass, BOOLEAN_FILTER_TYPE__VALUE);

		branchTypeEClass = createEClass(BRANCH_TYPE);

		classificationNodeQueryTypeEClass = createEClass(CLASSIFICATION_NODE_QUERY_TYPE);
		createEReference(classificationNodeQueryTypeEClass, CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY);
		createEReference(classificationNodeQueryTypeEClass, CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY);

		classificationQueryTypeEClass = createEClass(CLASSIFICATION_QUERY_TYPE);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY);

		classificationSchemeQueryTypeEClass = createEClass(CLASSIFICATION_SCHEME_QUERY_TYPE);
		createEReference(classificationSchemeQueryTypeEClass, CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY);
		createEReference(classificationSchemeQueryTypeEClass, CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY);

		compoundFilterTypeEClass = createEClass(COMPOUND_FILTER_TYPE);
		createEReference(compoundFilterTypeEClass, COMPOUND_FILTER_TYPE__LEFT_FILTER);
		createEReference(compoundFilterTypeEClass, COMPOUND_FILTER_TYPE__RIGHT_FILTER);
		createEAttribute(compoundFilterTypeEClass, COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR);

		dateTimeFilterTypeEClass = createEClass(DATE_TIME_FILTER_TYPE);
		createEAttribute(dateTimeFilterTypeEClass, DATE_TIME_FILTER_TYPE__VALUE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADHOC_QUERY_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADHOC_QUERY_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOLEAN_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPOUND_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_TIME_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_LINK_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEDERATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOAT_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTEGER_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOTIFICATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESPONSE_OPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_BINDING_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRING_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBSCRIPTION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER_QUERY);

		externalIdentifierQueryTypeEClass = createEClass(EXTERNAL_IDENTIFIER_QUERY_TYPE);
		createEReference(externalIdentifierQueryTypeEClass, EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY);
		createEReference(externalIdentifierQueryTypeEClass, EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY);

		externalLinkQueryTypeEClass = createEClass(EXTERNAL_LINK_QUERY_TYPE);

		extrinsicObjectQueryTypeEClass = createEClass(EXTRINSIC_OBJECT_QUERY_TYPE);
		createEReference(extrinsicObjectQueryTypeEClass, EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER);

		federationQueryTypeEClass = createEClass(FEDERATION_QUERY_TYPE);

		filterQueryTypeEClass = createEClass(FILTER_QUERY_TYPE);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__PRIMARY_FILTER);

		filterTypeEClass = createEClass(FILTER_TYPE);
		createEAttribute(filterTypeEClass, FILTER_TYPE__NEGATE);

		floatFilterTypeEClass = createEClass(FLOAT_FILTER_TYPE);
		createEAttribute(floatFilterTypeEClass, FLOAT_FILTER_TYPE__VALUE);

		integerFilterTypeEClass = createEClass(INTEGER_FILTER_TYPE);
		createEAttribute(integerFilterTypeEClass, INTEGER_FILTER_TYPE__VALUE);

		internationalStringBranchTypeEClass = createEClass(INTERNATIONAL_STRING_BRANCH_TYPE);
		createEReference(internationalStringBranchTypeEClass, INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER);

		notificationQueryTypeEClass = createEClass(NOTIFICATION_QUERY_TYPE);
		createEReference(notificationQueryTypeEClass, NOTIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY);

		organizationQueryTypeEClass = createEClass(ORGANIZATION_QUERY_TYPE);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__PARENT_QUERY);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY);

		personQueryTypeEClass = createEClass(PERSON_QUERY_TYPE);
		createEReference(personQueryTypeEClass, PERSON_QUERY_TYPE__ADDRESS_FILTER);
		createEReference(personQueryTypeEClass, PERSON_QUERY_TYPE__PERSON_NAME_FILTER);
		createEReference(personQueryTypeEClass, PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER);
		createEReference(personQueryTypeEClass, PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER);

		queryExpressionBranchTypeEClass = createEClass(QUERY_EXPRESSION_BRANCH_TYPE);
		createEReference(queryExpressionBranchTypeEClass, QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY);

		registryObjectQueryTypeEClass = createEClass(REGISTRY_OBJECT_QUERY_TYPE);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY);

		registryPackageQueryTypeEClass = createEClass(REGISTRY_PACKAGE_QUERY_TYPE);
		createEReference(registryPackageQueryTypeEClass, REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY);

		registryQueryTypeEClass = createEClass(REGISTRY_QUERY_TYPE);
		createEReference(registryQueryTypeEClass, REGISTRY_QUERY_TYPE__OPERATOR_QUERY);

		responseOptionTypeEClass = createEClass(RESPONSE_OPTION_TYPE);
		createEAttribute(responseOptionTypeEClass, RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS);
		createEAttribute(responseOptionTypeEClass, RESPONSE_OPTION_TYPE__RETURN_TYPE);

		serviceBindingQueryTypeEClass = createEClass(SERVICE_BINDING_QUERY_TYPE);
		createEReference(serviceBindingQueryTypeEClass, SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY);
		createEReference(serviceBindingQueryTypeEClass, SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY);
		createEReference(serviceBindingQueryTypeEClass, SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY);

		serviceQueryTypeEClass = createEClass(SERVICE_QUERY_TYPE);
		createEReference(serviceQueryTypeEClass, SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY);

		simpleFilterTypeEClass = createEClass(SIMPLE_FILTER_TYPE);
		createEAttribute(simpleFilterTypeEClass, SIMPLE_FILTER_TYPE__COMPARATOR);
		createEAttribute(simpleFilterTypeEClass, SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE);

		slotBranchTypeEClass = createEClass(SLOT_BRANCH_TYPE);

		specificationLinkQueryTypeEClass = createEClass(SPECIFICATION_LINK_QUERY_TYPE);
		createEReference(specificationLinkQueryTypeEClass, SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH);
		createEReference(specificationLinkQueryTypeEClass, SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY);
		createEReference(specificationLinkQueryTypeEClass, SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY);

		stringFilterTypeEClass = createEClass(STRING_FILTER_TYPE);
		createEAttribute(stringFilterTypeEClass, STRING_FILTER_TYPE__VALUE);

		subscriptionQueryTypeEClass = createEClass(SUBSCRIPTION_QUERY_TYPE);
		createEReference(subscriptionQueryTypeEClass, SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY);

		userQueryTypeEClass = createEClass(USER_QUERY_TYPE);

		// Create enums
		comparatorTypeEEnum = createEEnum(COMPARATOR_TYPE);
		logicalOperatorTypeEEnum = createEEnum(LOGICAL_OPERATOR_TYPE);
		returnTypeTypeEEnum = createEEnum(RETURN_TYPE_TYPE);

		// Create data types
		comparatorTypeObjectEDataType = createEDataType(COMPARATOR_TYPE_OBJECT);
		logicalOperatorTypeObjectEDataType = createEDataType(LOGICAL_OPERATOR_TYPE_OBJECT);
		returnTypeTypeObjectEDataType = createEDataType(RETURN_TYPE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RegistryPackage theRegistryPackage = (RegistryPackage)EPackage.Registry.INSTANCE.getEPackage(RegistryPackage.eNS_URI);
		RimPackage theRimPackage = (RimPackage)EPackage.Registry.INSTANCE.getEPackage(RimPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		adhocQueryQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		adhocQueryRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		adhocQueryResponseTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryResponseType());
		associationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		auditableEventQueryTypeEClass.getESuperTypes().add(this.getFilterQueryType());
		booleanFilterTypeEClass.getESuperTypes().add(this.getSimpleFilterType());
		branchTypeEClass.getESuperTypes().add(this.getFilterQueryType());
		classificationNodeQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		classificationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		classificationSchemeQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		compoundFilterTypeEClass.getESuperTypes().add(this.getFilterType());
		dateTimeFilterTypeEClass.getESuperTypes().add(this.getSimpleFilterType());
		externalIdentifierQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		externalLinkQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		extrinsicObjectQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		federationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		floatFilterTypeEClass.getESuperTypes().add(this.getSimpleFilterType());
		integerFilterTypeEClass.getESuperTypes().add(this.getSimpleFilterType());
		internationalStringBranchTypeEClass.getESuperTypes().add(this.getBranchType());
		notificationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		organizationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		personQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		queryExpressionBranchTypeEClass.getESuperTypes().add(this.getBranchType());
		registryObjectQueryTypeEClass.getESuperTypes().add(this.getFilterQueryType());
		registryPackageQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		registryQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		serviceBindingQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		serviceQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		simpleFilterTypeEClass.getESuperTypes().add(this.getFilterType());
		slotBranchTypeEClass.getESuperTypes().add(this.getBranchType());
		specificationLinkQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		stringFilterTypeEClass.getESuperTypes().add(this.getSimpleFilterType());
		subscriptionQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		userQueryTypeEClass.getESuperTypes().add(this.getPersonQueryType());

		// Initialize classes and features; add operations and parameters
		initEClass(adhocQueryQueryTypeEClass, AdhocQueryQueryType.class, "AdhocQueryQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdhocQueryQueryType_QueryExpressionBranch(), this.getQueryExpressionBranchType(), null, "queryExpressionBranch", null, 0, 1, AdhocQueryQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adhocQueryRequestTypeEClass, AdhocQueryRequestType.class, "AdhocQueryRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdhocQueryRequestType_ResponseOption(), this.getResponseOptionType(), null, "responseOption", null, 1, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdhocQueryRequestType_AdhocQuery(), theRimPackage.getAdhocQueryType(), null, "adhocQuery", null, 1, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdhocQueryRequestType_Federated(), theXMLTypePackage.getBoolean(), "federated", "false", 0, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdhocQueryRequestType_Federation(), theXMLTypePackage.getAnyURI(), "federation", null, 0, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdhocQueryRequestType_MaxResults(), theXMLTypePackage.getInteger(), "maxResults", "-1", 0, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdhocQueryRequestType_StartIndex(), theXMLTypePackage.getInteger(), "startIndex", "0", 0, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adhocQueryResponseTypeEClass, AdhocQueryResponseType.class, "AdhocQueryResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdhocQueryResponseType_RegistryObjectList(), theRimPackage.getRegistryObjectListType(), null, "registryObjectList", null, 1, 1, AdhocQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdhocQueryResponseType_StartIndex(), theXMLTypePackage.getInteger(), "startIndex", "0", 0, 1, AdhocQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdhocQueryResponseType_TotalResultCount(), theXMLTypePackage.getInteger(), "totalResultCount", null, 0, 1, AdhocQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationQueryTypeEClass, AssociationQueryType.class, "AssociationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationQueryType_AssociationTypeQuery(), this.getClassificationNodeQueryType(), null, "associationTypeQuery", null, 0, 1, AssociationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationQueryType_SourceObjectQuery(), this.getRegistryObjectQueryType(), null, "sourceObjectQuery", null, 0, 1, AssociationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationQueryType_TargetObjectQuery(), this.getRegistryObjectQueryType(), null, "targetObjectQuery", null, 0, 1, AssociationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableEventQueryTypeEClass, AuditableEventQueryType.class, "AuditableEventQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuditableEventQueryType_AffectedObjectQuery(), this.getRegistryObjectQueryType(), null, "affectedObjectQuery", null, 0, -1, AuditableEventQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryType_EventTypeQuery(), this.getClassificationNodeQueryType(), null, "eventTypeQuery", null, 0, 1, AuditableEventQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryType_UserQuery(), this.getUserQueryType(), null, "userQuery", null, 0, 1, AuditableEventQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanFilterTypeEClass, BooleanFilterType.class, "BooleanFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanFilterType_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, BooleanFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchTypeEClass, BranchType.class, "BranchType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classificationNodeQueryTypeEClass, ClassificationNodeQueryType.class, "ClassificationNodeQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationNodeQueryType_ParentQuery(), this.getRegistryObjectQueryType(), null, "parentQuery", null, 0, 1, ClassificationNodeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationNodeQueryType_ChildrenQuery(), this.getClassificationNodeQueryType(), null, "childrenQuery", null, 0, -1, ClassificationNodeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationQueryTypeEClass, ClassificationQueryType.class, "ClassificationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationQueryType_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryType_ClassifiedObjectQuery(), this.getRegistryObjectQueryType(), null, "classifiedObjectQuery", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryType_ClassificationNodeQuery(), this.getClassificationNodeQueryType(), null, "classificationNodeQuery", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationSchemeQueryTypeEClass, ClassificationSchemeQueryType.class, "ClassificationSchemeQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationSchemeQueryType_ChildrenQuery(), this.getClassificationNodeQueryType(), null, "childrenQuery", null, 0, -1, ClassificationSchemeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationSchemeQueryType_NodeTypeQuery(), this.getClassificationNodeQueryType(), null, "nodeTypeQuery", null, 0, 1, ClassificationSchemeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundFilterTypeEClass, CompoundFilterType.class, "CompoundFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundFilterType_LeftFilter(), this.getFilterType(), null, "leftFilter", null, 1, 1, CompoundFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundFilterType_RightFilter(), this.getFilterType(), null, "rightFilter", null, 1, 1, CompoundFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundFilterType_LogicalOperator(), this.getLogicalOperatorType(), "logicalOperator", "AND", 1, 1, CompoundFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeFilterTypeEClass, DateTimeFilterType.class, "DateTimeFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeFilterType_Value(), theXMLTypePackage.getDateTime(), "value", null, 1, 1, DateTimeFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdhocQueryQuery(), this.getAdhocQueryQueryType(), null, "adhocQueryQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdhocQueryRequest(), this.getAdhocQueryRequestType(), null, "adhocQueryRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdhocQueryResponse(), this.getAdhocQueryResponseType(), null, "adhocQueryResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AssociationQuery(), this.getRegistryObjectQueryType(), null, "associationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuditableEventQuery(), this.getAuditableEventQueryType(), null, "auditableEventQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BooleanFilter(), this.getBooleanFilterType(), null, "booleanFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationNodeQuery(), this.getClassificationNodeQueryType(), null, "classificationNodeQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationQuery(), this.getClassificationQueryType(), null, "classificationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CompoundFilter(), this.getCompoundFilterType(), null, "compoundFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateTimeFilter(), this.getDateTimeFilterType(), null, "dateTimeFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalIdentifierQuery(), this.getExternalIdentifierQueryType(), null, "externalIdentifierQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalLinkQuery(), this.getExternalLinkQueryType(), null, "externalLinkQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtrinsicObjectQuery(), this.getExtrinsicObjectQueryType(), null, "extrinsicObjectQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FederationQuery(), this.getFederationQueryType(), null, "federationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Filter(), this.getFilterType(), null, "filter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FloatFilter(), this.getFloatFilterType(), null, "floatFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IntegerFilter(), this.getIntegerFilterType(), null, "integerFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NotificationQuery(), this.getNotificationQueryType(), null, "notificationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganizationQuery(), this.getOrganizationQueryType(), null, "organizationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryPackageQuery(), this.getRegistryPackageQueryType(), null, "registryPackageQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryQuery(), this.getRegistryQueryType(), null, "registryQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ResponseOption(), this.getResponseOptionType(), null, "responseOption", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceBindingQuery(), this.getServiceBindingQueryType(), null, "serviceBindingQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceQuery(), this.getServiceQueryType(), null, "serviceQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpecificationLinkQuery(), this.getSpecificationLinkQueryType(), null, "specificationLinkQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StringFilter(), this.getStringFilterType(), null, "stringFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubscriptionQuery(), this.getSubscriptionQueryType(), null, "subscriptionQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UserQuery(), this.getUserQueryType(), null, "userQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(externalIdentifierQueryTypeEClass, ExternalIdentifierQueryType.class, "ExternalIdentifierQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalIdentifierQueryType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, 1, ExternalIdentifierQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalIdentifierQueryType_IdentificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "identificationSchemeQuery", null, 0, 1, ExternalIdentifierQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalLinkQueryTypeEClass, ExternalLinkQueryType.class, "ExternalLinkQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extrinsicObjectQueryTypeEClass, ExtrinsicObjectQueryType.class, "ExtrinsicObjectQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtrinsicObjectQueryType_ContentVersionInfoFilter(), this.getFilterType(), null, "contentVersionInfoFilter", null, 0, 1, ExtrinsicObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(federationQueryTypeEClass, FederationQueryType.class, "FederationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterQueryTypeEClass, FilterQueryType.class, "FilterQueryType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterQueryType_PrimaryFilter(), this.getFilterType(), null, "primaryFilter", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterTypeEClass, FilterType.class, "FilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterType_Negate(), theXMLTypePackage.getBoolean(), "negate", "false", 0, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatFilterTypeEClass, FloatFilterType.class, "FloatFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatFilterType_Value(), theXMLTypePackage.getFloat(), "value", null, 1, 1, FloatFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerFilterTypeEClass, IntegerFilterType.class, "IntegerFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerFilterType_Value(), theXMLTypePackage.getInteger(), "value", null, 1, 1, IntegerFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internationalStringBranchTypeEClass, InternationalStringBranchType.class, "InternationalStringBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternationalStringBranchType_LocalizedStringFilter(), this.getFilterType(), null, "localizedStringFilter", null, 0, -1, InternationalStringBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationQueryTypeEClass, NotificationQueryType.class, "NotificationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotificationQueryType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, 1, NotificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationQueryTypeEClass, OrganizationQueryType.class, "OrganizationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationQueryType_AddressFilter(), this.getFilterType(), null, "addressFilter", null, 0, -1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_TelephoneNumberFilter(), this.getFilterType(), null, "telephoneNumberFilter", null, 0, -1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_EmailAddresseFilter(), this.getFilterType(), null, "emailAddresseFilter", null, 0, -1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_ParentQuery(), this.getOrganizationQueryType(), null, "parentQuery", null, 0, 1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_ChildOrganizationQuery(), this.getOrganizationQueryType(), null, "childOrganizationQuery", null, 0, -1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_PrimaryContactQuery(), this.getPersonQueryType(), null, "primaryContactQuery", null, 0, 1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personQueryTypeEClass, PersonQueryType.class, "PersonQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonQueryType_AddressFilter(), this.getFilterType(), null, "addressFilter", null, 0, -1, PersonQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonQueryType_PersonNameFilter(), this.getFilterType(), null, "personNameFilter", null, 0, 1, PersonQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonQueryType_TelephoneNumberFilter(), this.getFilterType(), null, "telephoneNumberFilter", null, 0, -1, PersonQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonQueryType_EmailAddresseFilter(), this.getFilterType(), null, "emailAddresseFilter", null, 0, -1, PersonQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryExpressionBranchTypeEClass, QueryExpressionBranchType.class, "QueryExpressionBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryExpressionBranchType_QueryLanguageQuery(), this.getClassificationNodeQueryType(), null, "queryLanguageQuery", null, 0, 1, QueryExpressionBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryObjectQueryTypeEClass, RegistryObjectQueryType.class, "RegistryObjectQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryObjectQueryType_SlotBranch(), this.getSlotBranchType(), null, "slotBranch", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_NameBranch(), this.getInternationalStringBranchType(), null, "nameBranch", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_DescriptionBranch(), this.getInternationalStringBranchType(), null, "descriptionBranch", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_VersionInfoFilter(), this.getFilterType(), null, "versionInfoFilter", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_ClassificationQuery(), this.getClassificationQueryType(), null, "classificationQuery", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_ExternalIdentifierQuery(), this.getExternalIdentifierQueryType(), null, "externalIdentifierQuery", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_ObjectTypeQuery(), this.getClassificationNodeQueryType(), null, "objectTypeQuery", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_StatusQuery(), this.getClassificationNodeQueryType(), null, "statusQuery", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_SourceAssociationQuery(), this.getAssociationQueryType(), null, "sourceAssociationQuery", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_TargetAssociationQuery(), this.getAssociationQueryType(), null, "targetAssociationQuery", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryPackageQueryTypeEClass, RegistryPackageQueryType.class, "RegistryPackageQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryPackageQueryType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, -1, RegistryPackageQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryQueryTypeEClass, RegistryQueryType.class, "RegistryQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryQueryType_OperatorQuery(), this.getOrganizationQueryType(), null, "operatorQuery", null, 0, 1, RegistryQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseOptionTypeEClass, ResponseOptionType.class, "ResponseOptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseOptionType_ReturnComposedObjects(), theXMLTypePackage.getBoolean(), "returnComposedObjects", "false", 0, 1, ResponseOptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseOptionType_ReturnType(), this.getReturnTypeType(), "returnType", "RegistryObject", 0, 1, ResponseOptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBindingQueryTypeEClass, ServiceBindingQueryType.class, "ServiceBindingQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBindingQueryType_ServiceQuery(), this.getServiceQueryType(), null, "serviceQuery", null, 0, 1, ServiceBindingQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBindingQueryType_SpecificationLinkQuery(), this.getSpecificationLinkQueryType(), null, "specificationLinkQuery", null, 0, -1, ServiceBindingQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBindingQueryType_TargetBindingQuery(), this.getServiceBindingQueryType(), null, "targetBindingQuery", null, 0, 1, ServiceBindingQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceQueryTypeEClass, ServiceQueryType.class, "ServiceQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceQueryType_ServiceBindingQuery(), this.getServiceBindingQueryType(), null, "serviceBindingQuery", null, 0, -1, ServiceQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleFilterTypeEClass, SimpleFilterType.class, "SimpleFilterType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleFilterType_Comparator(), this.getComparatorType(), "comparator", "LE", 1, 1, SimpleFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleFilterType_DomainAttribute(), theXMLTypePackage.getString(), "domainAttribute", null, 1, 1, SimpleFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotBranchTypeEClass, SlotBranchType.class, "SlotBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificationLinkQueryTypeEClass, SpecificationLinkQueryType.class, "SpecificationLinkQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationLinkQueryType_UsageDescriptionBranch(), this.getInternationalStringBranchType(), null, "usageDescriptionBranch", null, 0, 1, SpecificationLinkQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationLinkQueryType_ServiceBindingQuery(), this.getServiceBindingQueryType(), null, "serviceBindingQuery", null, 0, 1, SpecificationLinkQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationLinkQueryType_SpecificationObjectQuery(), this.getRegistryObjectQueryType(), null, "specificationObjectQuery", null, 0, 1, SpecificationLinkQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringFilterTypeEClass, StringFilterType.class, "StringFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringFilterType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, StringFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionQueryTypeEClass, SubscriptionQueryType.class, "SubscriptionQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscriptionQueryType_SelectorQuery(), this.getAdhocQueryQueryType(), null, "selectorQuery", null, 0, 1, SubscriptionQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userQueryTypeEClass, UserQueryType.class, "UserQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(comparatorTypeEEnum, ComparatorType.class, "ComparatorType");
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.LE_LITERAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.LT_LITERAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.GE_LITERAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.GT_LITERAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.EQ_LITERAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.NE_LITERAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.LIKE_LITERAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.NOT_LIKE_LITERAL);

		initEEnum(logicalOperatorTypeEEnum, LogicalOperatorType.class, "LogicalOperatorType");
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.AND_LITERAL);
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.OR_LITERAL);

		initEEnum(returnTypeTypeEEnum, ReturnTypeType.class, "ReturnTypeType");
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.OBJECT_REF_LITERAL);
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.REGISTRY_OBJECT_LITERAL);
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.LEAF_CLASS_LITERAL);
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.LEAF_CLASS_WITH_REPOSITORY_ITEM_LITERAL);

		// Initialize data types
		initEDataType(comparatorTypeObjectEDataType, ComparatorType.class, "ComparatorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(logicalOperatorTypeObjectEDataType, LogicalOperatorType.class, "LogicalOperatorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(returnTypeTypeObjectEDataType, ReturnTypeType.class, "ReturnTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (adhocQueryQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AdhocQueryQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAdhocQueryQueryType_QueryExpressionBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "QueryExpressionBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (adhocQueryRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AdhocQueryRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAdhocQueryRequestType_ResponseOption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResponseOption",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAdhocQueryRequestType_AdhocQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQuery",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getAdhocQueryRequestType_Federated(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "federated"
		   });		
		addAnnotation
		  (getAdhocQueryRequestType_Federation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "federation"
		   });		
		addAnnotation
		  (getAdhocQueryRequestType_MaxResults(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxResults"
		   });		
		addAnnotation
		  (getAdhocQueryRequestType_StartIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startIndex"
		   });		
		addAnnotation
		  (adhocQueryResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AdhocQueryResponse_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAdhocQueryResponseType_RegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getAdhocQueryResponseType_StartIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startIndex"
		   });		
		addAnnotation
		  (getAdhocQueryResponseType_TotalResultCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "totalResultCount"
		   });		
		addAnnotation
		  (associationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AssociationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAssociationQueryType_AssociationTypeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationTypeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationQueryType_SourceObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationQueryType_TargetObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TargetObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (auditableEventQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuditableEventQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuditableEventQueryType_AffectedObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AffectedObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditableEventQueryType_EventTypeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EventTypeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditableEventQueryType_UserQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (booleanFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BooleanFilterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBooleanFilterType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (branchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BranchType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (classificationNodeQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationNodeQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationNodeQueryType_ParentQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ParentQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationNodeQueryType_ChildrenQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChildrenQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (classificationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationQueryType_ClassificationSchemeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationQueryType_ClassifiedObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassifiedObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationQueryType_ClassificationNodeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (classificationSchemeQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationSchemeQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryType_ChildrenQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChildrenQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryType_NodeTypeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NodeTypeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (comparatorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "comparator_._type"
		   });		
		addAnnotation
		  (comparatorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "comparator_._type:Object",
			 "baseType", "comparator_._type"
		   });		
		addAnnotation
		  (compoundFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CompoundFilterType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCompoundFilterType_LeftFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LeftFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundFilterType_RightFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RightFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundFilterType_LogicalOperator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "logicalOperator"
		   });		
		addAnnotation
		  (dateTimeFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DateTimeFilterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDateTimeFilterType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_AdhocQueryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQueryQuery",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AdhocQueryRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQueryRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AdhocQueryResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQueryResponse",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AssociationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AuditableEventQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BooleanFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BooleanFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationNodeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationSchemeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CompoundFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompoundFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DateTimeFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DateTimeFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalIdentifierQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifierQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalLinkQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalLinkQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExtrinsicObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FederationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FederationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Filter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Filter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FloatFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FloatFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IntegerFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IntegerFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NotificationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NotificationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OrganizationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryPackageQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackageQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ResponseOption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResponseOption",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceBindingQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpecificationLinkQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLinkQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StringFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StringFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SubscriptionQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SubscriptionQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UserQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (externalIdentifierQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalIdentifierQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalIdentifierQueryType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExternalIdentifierQueryType_IdentificationSchemeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IdentificationSchemeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (externalLinkQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalLinkQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (extrinsicObjectQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExtrinsicObjectQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExtrinsicObjectQueryType_ContentVersionInfoFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContentVersionInfoFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (federationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FederationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (filterQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FilterQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFilterQueryType_PrimaryFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PrimaryFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (filterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FilterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFilterType_Negate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "negate"
		   });		
		addAnnotation
		  (floatFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FloatFilterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFloatFilterType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (integerFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IntegerFilterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIntegerFilterType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (internationalStringBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InternationalStringBranchType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInternationalStringBranchType_LocalizedStringFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalizedStringFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (logicalOperatorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "logicalOperator_._type"
		   });		
		addAnnotation
		  (logicalOperatorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "logicalOperator_._type:Object",
			 "baseType", "logicalOperator_._type"
		   });		
		addAnnotation
		  (notificationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NotificationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotificationQueryType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (organizationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganizationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrganizationQueryType_AddressFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_TelephoneNumberFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumberFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_EmailAddresseFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddresseFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_ParentQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ParentQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_ChildOrganizationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChildOrganizationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_PrimaryContactQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PrimaryContactQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (personQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersonQueryType_AddressFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonQueryType_PersonNameFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonNameFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonQueryType_TelephoneNumberFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumberFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonQueryType_EmailAddresseFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddresseFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (queryExpressionBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "QueryExpressionBranchType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQueryExpressionBranchType_QueryLanguageQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "QueryLanguageQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (registryObjectQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryObjectQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_SlotBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SlotBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_NameBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_DescriptionBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_VersionInfoFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VersionInfoFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_ClassificationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_ExternalIdentifierQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifierQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_ObjectTypeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectTypeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_StatusQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StatusQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_SourceAssociationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceAssociationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_TargetAssociationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TargetAssociationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (registryPackageQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryPackageQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryPackageQueryType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (registryQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryQueryType_OperatorQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OperatorQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (responseOptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResponseOptionType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getResponseOptionType_ReturnComposedObjects(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "returnComposedObjects"
		   });		
		addAnnotation
		  (getResponseOptionType_ReturnType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "returnType"
		   });		
		addAnnotation
		  (returnTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "returnType_._type"
		   });		
		addAnnotation
		  (returnTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "returnType_._type:Object",
			 "baseType", "returnType_._type"
		   });		
		addAnnotation
		  (serviceBindingQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceBindingQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceBindingQueryType_ServiceQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceBindingQueryType_SpecificationLinkQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLinkQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceBindingQueryType_TargetBindingQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TargetBindingQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceQueryType_ServiceBindingQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (simpleFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleFilterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSimpleFilterType_Comparator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comparator"
		   });		
		addAnnotation
		  (getSimpleFilterType_DomainAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "domainAttribute"
		   });		
		addAnnotation
		  (slotBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SlotBranchType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (specificationLinkQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SpecificationLinkQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpecificationLinkQueryType_UsageDescriptionBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageDescriptionBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecificationLinkQueryType_ServiceBindingQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecificationLinkQueryType_SpecificationObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (stringFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StringFilterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStringFilterType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (subscriptionQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SubscriptionQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubscriptionQueryType_SelectorQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SelectorQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UserQueryType",
			 "kind", "elementOnly"
		   });
	}

} //QueryPackageImpl
