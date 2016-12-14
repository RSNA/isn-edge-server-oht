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
 * $Id: QueryAdapterFactory.java,v 1.1 2006/06/27 23:18:07 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.query.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage
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
			public Object caseAdhocQueryRequestType(AdhocQueryRequestType object) {
				return createAdhocQueryRequestTypeAdapter();
			}
			public Object caseAdhocQueryResponseType(AdhocQueryResponseType object) {
				return createAdhocQueryResponseTypeAdapter();
			}
			public Object caseAssociationBranchType(AssociationBranchType object) {
				return createAssociationBranchTypeAdapter();
			}
			public Object caseAssociationQueryResultType(AssociationQueryResultType object) {
				return createAssociationQueryResultTypeAdapter();
			}
			public Object caseAssociationQueryType(AssociationQueryType object) {
				return createAssociationQueryTypeAdapter();
			}
			public Object caseAuditableEventQueryResultType(AuditableEventQueryResultType object) {
				return createAuditableEventQueryResultTypeAdapter();
			}
			public Object caseAuditableEventQueryType(AuditableEventQueryType object) {
				return createAuditableEventQueryTypeAdapter();
			}
			public Object caseBooleanClauseType(BooleanClauseType object) {
				return createBooleanClauseTypeAdapter();
			}
			public Object caseClassificationNodeQueryResultType(ClassificationNodeQueryResultType object) {
				return createClassificationNodeQueryResultTypeAdapter();
			}
			public Object caseClassificationNodeQueryType(ClassificationNodeQueryType object) {
				return createClassificationNodeQueryTypeAdapter();
			}
			public Object caseClassificationQueryResultType(ClassificationQueryResultType object) {
				return createClassificationQueryResultTypeAdapter();
			}
			public Object caseClassificationQueryType(ClassificationQueryType object) {
				return createClassificationQueryTypeAdapter();
			}
			public Object caseClassificationSchemeQueryResultType(ClassificationSchemeQueryResultType object) {
				return createClassificationSchemeQueryResultTypeAdapter();
			}
			public Object caseClassificationSchemeQueryType(ClassificationSchemeQueryType object) {
				return createClassificationSchemeQueryTypeAdapter();
			}
			public Object caseClassifiedByBranchType(ClassifiedByBranchType object) {
				return createClassifiedByBranchTypeAdapter();
			}
			public Object caseClauseType(ClauseType object) {
				return createClauseTypeAdapter();
			}
			public Object caseCompoundClauseType(CompoundClauseType object) {
				return createCompoundClauseTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseExtrinsicObjectQueryResultType(ExtrinsicObjectQueryResultType object) {
				return createExtrinsicObjectQueryResultTypeAdapter();
			}
			public Object caseExtrinsicObjectQueryType(ExtrinsicObjectQueryType object) {
				return createExtrinsicObjectQueryTypeAdapter();
			}
			public Object caseFilterQueryResultType(FilterQueryResultType object) {
				return createFilterQueryResultTypeAdapter();
			}
			public Object caseFilterQueryType(FilterQueryType object) {
				return createFilterQueryTypeAdapter();
			}
			public Object caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			public Object caseGetContentRequestType(GetContentRequestType object) {
				return createGetContentRequestTypeAdapter();
			}
			public Object caseGetContentResponseType(GetContentResponseType object) {
				return createGetContentResponseTypeAdapter();
			}
			public Object caseInternationalStringBranchType(InternationalStringBranchType object) {
				return createInternationalStringBranchTypeAdapter();
			}
			public Object caseOrganizationQueryResultType(OrganizationQueryResultType object) {
				return createOrganizationQueryResultTypeAdapter();
			}
			public Object caseOrganizationQueryType(OrganizationQueryType object) {
				return createOrganizationQueryTypeAdapter();
			}
			public Object caseRationalClauseType(RationalClauseType object) {
				return createRationalClauseTypeAdapter();
			}
			public Object caseRegistryEntryQueryResultType(RegistryEntryQueryResultType object) {
				return createRegistryEntryQueryResultTypeAdapter();
			}
			public Object caseRegistryEntryQueryType(RegistryEntryQueryType object) {
				return createRegistryEntryQueryTypeAdapter();
			}
			public Object caseRegistryObjectQueryType(RegistryObjectQueryType object) {
				return createRegistryObjectQueryTypeAdapter();
			}
			public Object caseRegistryPackageQueryResultType(RegistryPackageQueryResultType object) {
				return createRegistryPackageQueryResultTypeAdapter();
			}
			public Object caseRegistryPackageQueryType(RegistryPackageQueryType object) {
				return createRegistryPackageQueryTypeAdapter();
			}
			public Object caseResponseOptionType(ResponseOptionType object) {
				return createResponseOptionTypeAdapter();
			}
			public Object caseServiceBindingBranchType(ServiceBindingBranchType object) {
				return createServiceBindingBranchTypeAdapter();
			}
			public Object caseServiceQueryResultType(ServiceQueryResultType object) {
				return createServiceQueryResultTypeAdapter();
			}
			public Object caseServiceQueryType(ServiceQueryType object) {
				return createServiceQueryTypeAdapter();
			}
			public Object caseSimpleClauseType(SimpleClauseType object) {
				return createSimpleClauseTypeAdapter();
			}
			public Object caseSlotBranchType(SlotBranchType object) {
				return createSlotBranchTypeAdapter();
			}
			public Object caseSpecificationLinkBranchType(SpecificationLinkBranchType object) {
				return createSpecificationLinkBranchTypeAdapter();
			}
			public Object caseStringClauseType(StringClauseType object) {
				return createStringClauseTypeAdapter();
			}
			public Object caseUserBranchType(UserBranchType object) {
				return createUserBranchTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType <em>Adhoc Query Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType
	 * @generated
	 */
	public Adapter createAdhocQueryRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType <em>Adhoc Query Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType
	 * @generated
	 */
	public Adapter createAdhocQueryResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType <em>Association Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType
	 * @generated
	 */
	public Adapter createAssociationBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType <em>Association Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType
	 * @generated
	 */
	public Adapter createAssociationQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType <em>Association Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType
	 * @generated
	 */
	public Adapter createAssociationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType <em>Auditable Event Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType
	 * @generated
	 */
	public Adapter createAuditableEventQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType <em>Auditable Event Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType
	 * @generated
	 */
	public Adapter createAuditableEventQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType <em>Boolean Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType
	 * @generated
	 */
	public Adapter createBooleanClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType <em>Classification Node Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType
	 * @generated
	 */
	public Adapter createClassificationNodeQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType <em>Classification Node Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType
	 * @generated
	 */
	public Adapter createClassificationNodeQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType <em>Classification Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType
	 * @generated
	 */
	public Adapter createClassificationQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType <em>Classification Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType
	 * @generated
	 */
	public Adapter createClassificationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType <em>Classification Scheme Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType
	 * @generated
	 */
	public Adapter createClassificationSchemeQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType <em>Classification Scheme Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType
	 * @generated
	 */
	public Adapter createClassificationSchemeQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType <em>Classified By Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType
	 * @generated
	 */
	public Adapter createClassifiedByBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType <em>Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType
	 * @generated
	 */
	public Adapter createClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType <em>Compound Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType
	 * @generated
	 */
	public Adapter createCompoundClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType <em>Extrinsic Object Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType
	 * @generated
	 */
	public Adapter createExtrinsicObjectQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType <em>Extrinsic Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType
	 * @generated
	 */
	public Adapter createExtrinsicObjectQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType <em>Filter Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType
	 * @generated
	 */
	public Adapter createFilterQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType <em>Filter Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType
	 * @generated
	 */
	public Adapter createFilterQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType <em>Get Content Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType
	 * @generated
	 */
	public Adapter createGetContentRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType <em>Get Content Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType
	 * @generated
	 */
	public Adapter createGetContentResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType <em>International String Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType
	 * @generated
	 */
	public Adapter createInternationalStringBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType <em>Organization Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType
	 * @generated
	 */
	public Adapter createOrganizationQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType <em>Organization Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType
	 * @generated
	 */
	public Adapter createOrganizationQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType <em>Rational Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType
	 * @generated
	 */
	public Adapter createRationalClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType <em>Registry Entry Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType
	 * @generated
	 */
	public Adapter createRegistryEntryQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType <em>Registry Entry Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType
	 * @generated
	 */
	public Adapter createRegistryEntryQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType <em>Registry Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType
	 * @generated
	 */
	public Adapter createRegistryObjectQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType <em>Registry Package Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType
	 * @generated
	 */
	public Adapter createRegistryPackageQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType <em>Registry Package Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType
	 * @generated
	 */
	public Adapter createRegistryPackageQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType <em>Response Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType
	 * @generated
	 */
	public Adapter createResponseOptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType <em>Service Binding Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType
	 * @generated
	 */
	public Adapter createServiceBindingBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType <em>Service Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType
	 * @generated
	 */
	public Adapter createServiceQueryResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType <em>Service Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType
	 * @generated
	 */
	public Adapter createServiceQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType <em>Simple Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType
	 * @generated
	 */
	public Adapter createSimpleClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType <em>Slot Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType
	 * @generated
	 */
	public Adapter createSlotBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType <em>Specification Link Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType
	 * @generated
	 */
	public Adapter createSpecificationLinkBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType <em>String Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType
	 * @generated
	 */
	public Adapter createStringClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType <em>User Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType
	 * @generated
	 */
	public Adapter createUserBranchTypeAdapter() {
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
