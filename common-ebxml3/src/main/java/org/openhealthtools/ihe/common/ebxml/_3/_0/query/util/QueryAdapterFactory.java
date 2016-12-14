/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryAdapterFactory.java,v 1.1 2006/10/19 20:16:34 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;


import org.openhealthtools.ihe.common.ebxml._3._0.query.*;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage
 * @generated
 */
public class QueryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySwitch modelSwitch =
		new QuerySwitch() {
			public Object caseAdhocQueryQueryType(AdhocQueryQueryType object) {
				return createAdhocQueryQueryTypeAdapter();
			}
			public Object caseAdhocQueryRequestType(AdhocQueryRequestType object) {
				return createAdhocQueryRequestTypeAdapter();
			}
			public Object caseAdhocQueryResponseType(AdhocQueryResponseType object) {
				return createAdhocQueryResponseTypeAdapter();
			}
			public Object caseAssociationQueryType(AssociationQueryType object) {
				return createAssociationQueryTypeAdapter();
			}
			public Object caseAuditableEventQueryType(AuditableEventQueryType object) {
				return createAuditableEventQueryTypeAdapter();
			}
			public Object caseBooleanFilterType(BooleanFilterType object) {
				return createBooleanFilterTypeAdapter();
			}
			public Object caseBranchType(BranchType object) {
				return createBranchTypeAdapter();
			}
			public Object caseClassificationNodeQueryType(ClassificationNodeQueryType object) {
				return createClassificationNodeQueryTypeAdapter();
			}
			public Object caseClassificationQueryType(ClassificationQueryType object) {
				return createClassificationQueryTypeAdapter();
			}
			public Object caseClassificationSchemeQueryType(ClassificationSchemeQueryType object) {
				return createClassificationSchemeQueryTypeAdapter();
			}
			public Object caseCompoundFilterType(CompoundFilterType object) {
				return createCompoundFilterTypeAdapter();
			}
			public Object caseDateTimeFilterType(DateTimeFilterType object) {
				return createDateTimeFilterTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseExternalIdentifierQueryType(ExternalIdentifierQueryType object) {
				return createExternalIdentifierQueryTypeAdapter();
			}
			public Object caseExternalLinkQueryType(ExternalLinkQueryType object) {
				return createExternalLinkQueryTypeAdapter();
			}
			public Object caseExtrinsicObjectQueryType(ExtrinsicObjectQueryType object) {
				return createExtrinsicObjectQueryTypeAdapter();
			}
			public Object caseFederationQueryType(FederationQueryType object) {
				return createFederationQueryTypeAdapter();
			}
			public Object caseFilterQueryType(FilterQueryType object) {
				return createFilterQueryTypeAdapter();
			}
			public Object caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			public Object caseFloatFilterType(FloatFilterType object) {
				return createFloatFilterTypeAdapter();
			}
			public Object caseIntegerFilterType(IntegerFilterType object) {
				return createIntegerFilterTypeAdapter();
			}
			public Object caseInternationalStringBranchType(InternationalStringBranchType object) {
				return createInternationalStringBranchTypeAdapter();
			}
			public Object caseNotificationQueryType(NotificationQueryType object) {
				return createNotificationQueryTypeAdapter();
			}
			public Object caseOrganizationQueryType(OrganizationQueryType object) {
				return createOrganizationQueryTypeAdapter();
			}
			public Object casePersonQueryType(PersonQueryType object) {
				return createPersonQueryTypeAdapter();
			}
			public Object caseQueryExpressionBranchType(QueryExpressionBranchType object) {
				return createQueryExpressionBranchTypeAdapter();
			}
			public Object caseRegistryObjectQueryType(RegistryObjectQueryType object) {
				return createRegistryObjectQueryTypeAdapter();
			}
			public Object caseRegistryPackageQueryType(RegistryPackageQueryType object) {
				return createRegistryPackageQueryTypeAdapter();
			}
			public Object caseRegistryQueryType(RegistryQueryType object) {
				return createRegistryQueryTypeAdapter();
			}
			public Object caseResponseOptionType(ResponseOptionType object) {
				return createResponseOptionTypeAdapter();
			}
			public Object caseServiceBindingQueryType(ServiceBindingQueryType object) {
				return createServiceBindingQueryTypeAdapter();
			}
			public Object caseServiceQueryType(ServiceQueryType object) {
				return createServiceQueryTypeAdapter();
			}
			public Object caseSimpleFilterType(SimpleFilterType object) {
				return createSimpleFilterTypeAdapter();
			}
			public Object caseSlotBranchType(SlotBranchType object) {
				return createSlotBranchTypeAdapter();
			}
			public Object caseSpecificationLinkQueryType(SpecificationLinkQueryType object) {
				return createSpecificationLinkQueryTypeAdapter();
			}
			public Object caseStringFilterType(StringFilterType object) {
				return createStringFilterTypeAdapter();
			}
			public Object caseSubscriptionQueryType(SubscriptionQueryType object) {
				return createSubscriptionQueryTypeAdapter();
			}
			public Object caseUserQueryType(UserQueryType object) {
				return createUserQueryTypeAdapter();
			}
			public Object caseRegistryRequestType(RegistryRequestType object) {
				return createRegistryRequestTypeAdapter();
			}
			public Object caseRegistryResponseType(RegistryResponseType object) {
				return createRegistryResponseTypeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType <em>Adhoc Query Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType
	 * @generated
	 */
	public Adapter createAdhocQueryQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType <em>Adhoc Query Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType
	 * @generated
	 */
	public Adapter createAdhocQueryRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType <em>Adhoc Query Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType
	 * @generated
	 */
	public Adapter createAdhocQueryResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType <em>Association Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType
	 * @generated
	 */
	public Adapter createAssociationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType <em>Auditable Event Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType
	 * @generated
	 */
	public Adapter createAuditableEventQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType <em>Boolean Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType
	 * @generated
	 */
	public Adapter createBooleanFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.BranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.BranchType
	 * @generated
	 */
	public Adapter createBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType <em>Classification Node Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType
	 * @generated
	 */
	public Adapter createClassificationNodeQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType <em>Classification Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType
	 * @generated
	 */
	public Adapter createClassificationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType <em>Classification Scheme Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType
	 * @generated
	 */
	public Adapter createClassificationSchemeQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType <em>Compound Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType
	 * @generated
	 */
	public Adapter createCompoundFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType <em>Date Time Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType
	 * @generated
	 */
	public Adapter createDateTimeFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType <em>External Identifier Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType
	 * @generated
	 */
	public Adapter createExternalIdentifierQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalLinkQueryType <em>External Link Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalLinkQueryType
	 * @generated
	 */
	public Adapter createExternalLinkQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType <em>Extrinsic Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType
	 * @generated
	 */
	public Adapter createExtrinsicObjectQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FederationQueryType <em>Federation Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FederationQueryType
	 * @generated
	 */
	public Adapter createFederationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType <em>Filter Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType
	 * @generated
	 */
	public Adapter createFilterQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType <em>Float Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType
	 * @generated
	 */
	public Adapter createFloatFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType <em>Integer Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType
	 * @generated
	 */
	public Adapter createIntegerFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType <em>International String Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType
	 * @generated
	 */
	public Adapter createInternationalStringBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType <em>Notification Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType
	 * @generated
	 */
	public Adapter createNotificationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType <em>Organization Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType
	 * @generated
	 */
	public Adapter createOrganizationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType <em>Person Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType
	 * @generated
	 */
	public Adapter createPersonQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType <em>Expression Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType
	 * @generated
	 */
	public Adapter createQueryExpressionBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType <em>Registry Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType
	 * @generated
	 */
	public Adapter createRegistryObjectQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType <em>Registry Package Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType
	 * @generated
	 */
	public Adapter createRegistryPackageQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType <em>Registry Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType
	 * @generated
	 */
	public Adapter createRegistryQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType <em>Response Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType
	 * @generated
	 */
	public Adapter createResponseOptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType <em>Service Binding Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType
	 * @generated
	 */
	public Adapter createServiceBindingQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType <em>Service Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType
	 * @generated
	 */
	public Adapter createServiceQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType <em>Simple Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType
	 * @generated
	 */
	public Adapter createSimpleFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType <em>Slot Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType
	 * @generated
	 */
	public Adapter createSlotBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType <em>Specification Link Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType
	 * @generated
	 */
	public Adapter createSpecificationLinkQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType <em>String Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType
	 * @generated
	 */
	public Adapter createStringFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType <em>Subscription Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType
	 * @generated
	 */
	public Adapter createSubscriptionQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.UserQueryType <em>User Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.UserQueryType
	 * @generated
	 */
	public Adapter createUserQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType
	 * @generated
	 */
	public Adapter createRegistryRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType
	 * @generated
	 */
	public Adapter createRegistryResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QueryAdapterFactory
