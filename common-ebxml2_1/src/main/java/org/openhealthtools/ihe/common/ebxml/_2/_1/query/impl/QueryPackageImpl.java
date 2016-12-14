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
 * $Id: QueryPackageImpl.java,v 1.1 2006/06/27 23:18:04 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryFactory;
import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

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
	private EClass associationBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationQueryResultTypeEClass = null;

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
	private EClass auditableEventQueryResultTypeEClass = null;

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
	private EClass booleanClauseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationNodeQueryResultTypeEClass = null;

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
	private EClass classificationQueryResultTypeEClass = null;

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
	private EClass classificationSchemeQueryResultTypeEClass = null;

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
	private EClass classifiedByBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundClauseTypeEClass = null;

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
	private EClass extrinsicObjectQueryResultTypeEClass = null;

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
	private EClass filterQueryResultTypeEClass = null;

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
	private EClass getContentRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getContentResponseTypeEClass = null;

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
	private EClass organizationQueryResultTypeEClass = null;

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
	private EClass rationalClauseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryEntryQueryResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryEntryQueryTypeEClass = null;

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
	private EClass registryPackageQueryResultTypeEClass = null;

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
	private EClass responseOptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBindingBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceQueryResultTypeEClass = null;

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
	private EClass simpleClauseTypeEClass = null;

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
	private EClass specificationLinkBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringClauseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userBranchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectivePredicateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalPredicateTypeEEnum = null;

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
	private EEnum stringPredicateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectivePredicateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType logicalPredicateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType returnTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringPredicateTypeObjectEDataType = null;

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#eNS_URI
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
	public EReference getAdhocQueryRequestType_FilterQuery() {
		return (EReference)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdhocQueryRequestType_SQLQuery() {
		return (EAttribute)adhocQueryRequestTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getAdhocQueryResponseType_FilterQueryResult() {
		return (EReference)adhocQueryResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdhocQueryResponseType_SQLQueryResult() {
		return (EReference)adhocQueryResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationBranchType() {
		return associationBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_AssociationFilter() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ExternalLinkFilter() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ExternalIdentifierFilter() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_RegistryObjectQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_RegistryEntryQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_AssociationQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ClassificationQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ClassificationSchemeQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ClassificationNodeQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_OrganizationQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_AuditableEventQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_RegistryPackageQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ExtrinsicObjectQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ServiceQuery() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_UserBranch() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_ServiceBindingBranch() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBranchType_SpecificationLinkBranch() {
		return (EReference)associationBranchTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationQueryResultType() {
		return associationQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationQueryResultType_Group() {
		return (EAttribute)associationQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationQueryResultType_ObjectRef() {
		return (EReference)associationQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationQueryResultType_RegistryObject() {
		return (EReference)associationQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationQueryResultType_Association() {
		return (EReference)associationQueryResultTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getAssociationQueryType_AssociationFilter() {
		return (EReference)associationQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditableEventQueryResultType() {
		return auditableEventQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventQueryResultType_Group() {
		return (EAttribute)auditableEventQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryResultType_ObjectRef() {
		return (EReference)auditableEventQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryResultType_RegistryObject() {
		return (EReference)auditableEventQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryResultType_AuditableEvent() {
		return (EReference)auditableEventQueryResultTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getAuditableEventQueryType_AuditableEventFilter() {
		return (EReference)auditableEventQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryType_RegistryObjectQuery() {
		return (EReference)auditableEventQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryType_RegistryEntryQuery() {
		return (EReference)auditableEventQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditableEventQueryType_UserBranch() {
		return (EReference)auditableEventQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanClauseType() {
		return booleanClauseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanClauseType_BooleanPredicate() {
		return (EAttribute)booleanClauseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationNodeQueryResultType() {
		return classificationNodeQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationNodeQueryResultType_Group() {
		return (EAttribute)classificationNodeQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryResultType_ObjectRef() {
		return (EReference)classificationNodeQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryResultType_RegistryObject() {
		return (EReference)classificationNodeQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryResultType_ClassificationNode() {
		return (EReference)classificationNodeQueryResultTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getClassificationNodeQueryType_ClassificationNodeFilter() {
		return (EReference)classificationNodeQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryType_ClassificationSchemeQuery() {
		return (EReference)classificationNodeQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryType_ClassificationNodeParentBranch() {
		return (EReference)classificationNodeQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeQueryType_ClassificationNodeChildrenBranch() {
		return (EReference)classificationNodeQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationQueryResultType() {
		return classificationQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationQueryResultType_Group() {
		return (EAttribute)classificationQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryResultType_ObjectRef() {
		return (EReference)classificationQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryResultType_RegistryObject() {
		return (EReference)classificationQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryResultType_Classification() {
		return (EReference)classificationQueryResultTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getClassificationQueryType_ClassificationFilter() {
		return (EReference)classificationQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryType_ClassificationSchemeQuery() {
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
	public EReference getClassificationQueryType_RegistryObjectQuery() {
		return (EReference)classificationQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationQueryType_RegistryEntryQuery() {
		return (EReference)classificationQueryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationSchemeQueryResultType() {
		return classificationSchemeQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationSchemeQueryResultType_Group() {
		return (EAttribute)classificationSchemeQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationSchemeQueryResultType_ObjectRef() {
		return (EReference)classificationSchemeQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationSchemeQueryResultType_RegistryObject() {
		return (EReference)classificationSchemeQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationSchemeQueryResultType_RegistryEntry() {
		return (EReference)classificationSchemeQueryResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationSchemeQueryResultType_ClassificationScheme() {
		return (EReference)classificationSchemeQueryResultTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getClassificationSchemeQueryType_ClassificationSchemeFilter() {
		return (EReference)classificationSchemeQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifiedByBranchType() {
		return classifiedByBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifiedByBranchType_ClassificationFilter() {
		return (EReference)classifiedByBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifiedByBranchType_ClassificationSchemeQuery() {
		return (EReference)classifiedByBranchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifiedByBranchType_ClassificationNodeQuery() {
		return (EReference)classifiedByBranchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClauseType() {
		return clauseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClauseType_SimpleClause() {
		return (EReference)clauseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClauseType_CompoundClause() {
		return (EReference)clauseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundClauseType() {
		return compoundClauseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundClauseType_Clause() {
		return (EReference)compoundClauseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundClauseType_ConnectivePredicate() {
		return (EAttribute)compoundClauseTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AdhocQueryRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdhocQueryResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationFilter() {
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
	public EReference getDocumentRoot_AssociationQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditableEventFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditableEventQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditableEventQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BooleanClause() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNodeChildrenBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNodeFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNodeParentBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNodeQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNodeQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationSchemeFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationSchemeQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationSchemeQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassifiedByBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Clause() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompoundClause() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DateTimeClause() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DescriptionBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmailAddressFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalIdentifierFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalLinkFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtrinsicObjectFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtrinsicObjectQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtrinsicObjectQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FilterQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FilterQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FloatClause() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GetContentRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GetContentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IntClause() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalizedStringFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NameBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationChildrenBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationParentBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PostalAddressFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RationalClause() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryEntryFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryEntryQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryEntryQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObjectFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObjectQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObjectQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryPackageFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryPackageQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryPackageQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResponseOption() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceBindingBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceBindingFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceBindingTargetBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SimpleClause() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SlotBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SlotFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SlotValueFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SourceAssociationBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpecificationLinkBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpecificationLinkFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SqlQuery() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SqlQueryResult() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StringClause() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TargetAssociationBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserBranch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtrinsicObjectQueryResultType() {
		return extrinsicObjectQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrinsicObjectQueryResultType_Group() {
		return (EAttribute)extrinsicObjectQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtrinsicObjectQueryResultType_ObjectRef() {
		return (EReference)extrinsicObjectQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtrinsicObjectQueryResultType_RegistryObject() {
		return (EReference)extrinsicObjectQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtrinsicObjectQueryResultType_RegistryEntry() {
		return (EReference)extrinsicObjectQueryResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtrinsicObjectQueryResultType_ExtrinsicObject() {
		return (EReference)extrinsicObjectQueryResultTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getExtrinsicObjectQueryType_ExtrinsicObjectFilter() {
		return (EReference)extrinsicObjectQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterQueryResultType() {
		return filterQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_RegistryObjectQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_RegistryEntryQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_AssociationQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_AuditableEventQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_ClassificationQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_ClassificationNodeQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_ClassificationSchemeQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_RegistryPackageQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_ExtrinsicObjectQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_OrganizationQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryResultType_ServiceQueryResult() {
		return (EReference)filterQueryResultTypeEClass.getEStructuralFeatures().get(10);
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
	public EReference getFilterQueryType_RegistryObjectQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_RegistryEntryQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_AssociationQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_AuditableEventQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_ClassificationQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_ClassificationNodeQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_ClassificationSchemeQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_RegistryPackageQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_ExtrinsicObjectQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_OrganizationQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterQueryType_ServiceQuery() {
		return (EReference)filterQueryTypeEClass.getEStructuralFeatures().get(10);
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
	public EReference getFilterType_Clause() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetContentRequestType() {
		return getContentRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetContentRequestType_ObjectRefList() {
		return (EReference)getContentRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetContentResponseType() {
		return getContentResponseTypeEClass;
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
	public EClass getOrganizationQueryResultType() {
		return organizationQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationQueryResultType_Group() {
		return (EAttribute)organizationQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryResultType_ObjectRef() {
		return (EReference)organizationQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryResultType_RegistryObject() {
		return (EReference)organizationQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryResultType_Organization() {
		return (EReference)organizationQueryResultTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getOrganizationQueryType_OrganizationFilter() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_PostalAddressFilter() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_TelephoneNumberFilter() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_UserBranch() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_OrganizationParentBranch() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationQueryType_OrganizationChildrenBranch() {
		return (EReference)organizationQueryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationalClauseType() {
		return rationalClauseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalClauseType_IntClause() {
		return (EAttribute)rationalClauseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalClauseType_FloatClause() {
		return (EAttribute)rationalClauseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalClauseType_DateTimeClause() {
		return (EAttribute)rationalClauseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalClauseType_LogicalPredicate() {
		return (EAttribute)rationalClauseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryEntryQueryResultType() {
		return registryEntryQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntryQueryResultType_Group() {
		return (EAttribute)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryResultType_ObjectRef() {
		return (EReference)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryResultType_ClassificationScheme() {
		return (EReference)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryResultType_ExtrinsicObject() {
		return (EReference)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryResultType_RegistryEntry() {
		return (EReference)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryResultType_RegistryObject() {
		return (EReference)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryResultType_RegistryPackage() {
		return (EReference)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryResultType_Service() {
		return (EReference)registryEntryQueryResultTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryEntryQueryType() {
		return registryEntryQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryEntryQueryType_RegistryEntryFilter() {
		return (EReference)registryEntryQueryTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getRegistryObjectQueryType_RegistryObjectFilter() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_ExternalIdentifierFilter() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_AuditableEventQuery() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_NameBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_DescriptionBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_ClassifiedByBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_SlotBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_SourceAssociationBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectQueryType_TargetAssociationBranch() {
		return (EReference)registryObjectQueryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryPackageQueryResultType() {
		return registryPackageQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryPackageQueryResultType_Group() {
		return (EAttribute)registryPackageQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageQueryResultType_ObjectRef() {
		return (EReference)registryPackageQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageQueryResultType_RegistryEntry() {
		return (EReference)registryPackageQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageQueryResultType_RegistryObject() {
		return (EReference)registryPackageQueryResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageQueryResultType_RegistryPackage() {
		return (EReference)registryPackageQueryResultTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getRegistryPackageQueryType_RegistryPackageFilter() {
		return (EReference)registryPackageQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageQueryType_RegistryObjectQuery() {
		return (EReference)registryPackageQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageQueryType_RegistryEntryQuery() {
		return (EReference)registryPackageQueryTypeEClass.getEStructuralFeatures().get(2);
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
	public EClass getServiceBindingBranchType() {
		return serviceBindingBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingBranchType_ServiceBindingFilter() {
		return (EReference)serviceBindingBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingBranchType_SpecificationLinkBranch() {
		return (EReference)serviceBindingBranchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingBranchType_ServiceBindingTargetBranch() {
		return (EReference)serviceBindingBranchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceQueryResultType() {
		return serviceQueryResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceQueryResultType_Group() {
		return (EAttribute)serviceQueryResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQueryResultType_ObjectRef() {
		return (EReference)serviceQueryResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQueryResultType_RegistryObject() {
		return (EReference)serviceQueryResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQueryResultType_RegistryEntry() {
		return (EReference)serviceQueryResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQueryResultType_Service() {
		return (EReference)serviceQueryResultTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getServiceQueryType_ServiceFilter() {
		return (EReference)serviceQueryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQueryType_ServiceBindingBranch() {
		return (EReference)serviceQueryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleClauseType() {
		return simpleClauseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClauseType_BooleanClause() {
		return (EReference)simpleClauseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClauseType_RationalClause() {
		return (EReference)simpleClauseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClauseType_StringClause() {
		return (EReference)simpleClauseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleClauseType_LeftArgument() {
		return (EAttribute)simpleClauseTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getSlotBranchType_SlotFilter() {
		return (EReference)slotBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotBranchType_SlotValueFilter() {
		return (EReference)slotBranchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationLinkBranchType() {
		return specificationLinkBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationLinkBranchType_SpecificationLinkFilter() {
		return (EReference)specificationLinkBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationLinkBranchType_RegistryObjectQuery() {
		return (EReference)specificationLinkBranchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationLinkBranchType_RegistryEntryQuery() {
		return (EReference)specificationLinkBranchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringClauseType() {
		return stringClauseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringClauseType_Value() {
		return (EAttribute)stringClauseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringClauseType_StringPredicate() {
		return (EAttribute)stringClauseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserBranchType() {
		return userBranchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserBranchType_UserFilter() {
		return (EReference)userBranchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserBranchType_PostalAddressFilter() {
		return (EReference)userBranchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserBranchType_TelephoneNumberFilter() {
		return (EReference)userBranchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserBranchType_EmailAddressFilter() {
		return (EReference)userBranchTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserBranchType_OrganizationQuery() {
		return (EReference)userBranchTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectivePredicateType() {
		return connectivePredicateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalPredicateType() {
		return logicalPredicateTypeEEnum;
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
	public EEnum getStringPredicateType() {
		return stringPredicateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectivePredicateTypeObject() {
		return connectivePredicateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLogicalPredicateTypeObject() {
		return logicalPredicateTypeObjectEDataType;
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
	public EDataType getStringPredicateTypeObject() {
		return stringPredicateTypeObjectEDataType;
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
		adhocQueryRequestTypeEClass = createEClass(ADHOC_QUERY_REQUEST_TYPE);
		createEReference(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION);
		createEReference(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY);
		createEAttribute(adhocQueryRequestTypeEClass, ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY);

		adhocQueryResponseTypeEClass = createEClass(ADHOC_QUERY_RESPONSE_TYPE);
		createEReference(adhocQueryResponseTypeEClass, ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT);
		createEReference(adhocQueryResponseTypeEClass, ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT);

		associationBranchTypeEClass = createEClass(ASSOCIATION_BRANCH_TYPE);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__ASSOCIATION_FILTER);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__EXTERNAL_LINK_FILTER);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__EXTERNAL_IDENTIFIER_FILTER);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__REGISTRY_OBJECT_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__REGISTRY_ENTRY_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__ASSOCIATION_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_SCHEME_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_NODE_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__ORGANIZATION_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__AUDITABLE_EVENT_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__REGISTRY_PACKAGE_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__EXTRINSIC_OBJECT_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__SERVICE_QUERY);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__USER_BRANCH);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__SERVICE_BINDING_BRANCH);
		createEReference(associationBranchTypeEClass, ASSOCIATION_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH);

		associationQueryResultTypeEClass = createEClass(ASSOCIATION_QUERY_RESULT_TYPE);
		createEAttribute(associationQueryResultTypeEClass, ASSOCIATION_QUERY_RESULT_TYPE__GROUP);
		createEReference(associationQueryResultTypeEClass, ASSOCIATION_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(associationQueryResultTypeEClass, ASSOCIATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(associationQueryResultTypeEClass, ASSOCIATION_QUERY_RESULT_TYPE__ASSOCIATION);

		associationQueryTypeEClass = createEClass(ASSOCIATION_QUERY_TYPE);
		createEReference(associationQueryTypeEClass, ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER);

		auditableEventQueryResultTypeEClass = createEClass(AUDITABLE_EVENT_QUERY_RESULT_TYPE);
		createEAttribute(auditableEventQueryResultTypeEClass, AUDITABLE_EVENT_QUERY_RESULT_TYPE__GROUP);
		createEReference(auditableEventQueryResultTypeEClass, AUDITABLE_EVENT_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(auditableEventQueryResultTypeEClass, AUDITABLE_EVENT_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(auditableEventQueryResultTypeEClass, AUDITABLE_EVENT_QUERY_RESULT_TYPE__AUDITABLE_EVENT);

		auditableEventQueryTypeEClass = createEClass(AUDITABLE_EVENT_QUERY_TYPE);
		createEReference(auditableEventQueryTypeEClass, AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER);
		createEReference(auditableEventQueryTypeEClass, AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY);
		createEReference(auditableEventQueryTypeEClass, AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY);
		createEReference(auditableEventQueryTypeEClass, AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH);

		booleanClauseTypeEClass = createEClass(BOOLEAN_CLAUSE_TYPE);
		createEAttribute(booleanClauseTypeEClass, BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE);

		classificationNodeQueryResultTypeEClass = createEClass(CLASSIFICATION_NODE_QUERY_RESULT_TYPE);
		createEAttribute(classificationNodeQueryResultTypeEClass, CLASSIFICATION_NODE_QUERY_RESULT_TYPE__GROUP);
		createEReference(classificationNodeQueryResultTypeEClass, CLASSIFICATION_NODE_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(classificationNodeQueryResultTypeEClass, CLASSIFICATION_NODE_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(classificationNodeQueryResultTypeEClass, CLASSIFICATION_NODE_QUERY_RESULT_TYPE__CLASSIFICATION_NODE);

		classificationNodeQueryTypeEClass = createEClass(CLASSIFICATION_NODE_QUERY_TYPE);
		createEReference(classificationNodeQueryTypeEClass, CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER);
		createEReference(classificationNodeQueryTypeEClass, CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY);
		createEReference(classificationNodeQueryTypeEClass, CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH);
		createEReference(classificationNodeQueryTypeEClass, CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH);

		classificationQueryResultTypeEClass = createEClass(CLASSIFICATION_QUERY_RESULT_TYPE);
		createEAttribute(classificationQueryResultTypeEClass, CLASSIFICATION_QUERY_RESULT_TYPE__GROUP);
		createEReference(classificationQueryResultTypeEClass, CLASSIFICATION_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(classificationQueryResultTypeEClass, CLASSIFICATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(classificationQueryResultTypeEClass, CLASSIFICATION_QUERY_RESULT_TYPE__CLASSIFICATION);

		classificationQueryTypeEClass = createEClass(CLASSIFICATION_QUERY_TYPE);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY);
		createEReference(classificationQueryTypeEClass, CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY);

		classificationSchemeQueryResultTypeEClass = createEClass(CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE);
		createEAttribute(classificationSchemeQueryResultTypeEClass, CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__GROUP);
		createEReference(classificationSchemeQueryResultTypeEClass, CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(classificationSchemeQueryResultTypeEClass, CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(classificationSchemeQueryResultTypeEClass, CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__REGISTRY_ENTRY);
		createEReference(classificationSchemeQueryResultTypeEClass, CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME);

		classificationSchemeQueryTypeEClass = createEClass(CLASSIFICATION_SCHEME_QUERY_TYPE);
		createEReference(classificationSchemeQueryTypeEClass, CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER);

		classifiedByBranchTypeEClass = createEClass(CLASSIFIED_BY_BRANCH_TYPE);
		createEReference(classifiedByBranchTypeEClass, CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_FILTER);
		createEReference(classifiedByBranchTypeEClass, CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_SCHEME_QUERY);
		createEReference(classifiedByBranchTypeEClass, CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_NODE_QUERY);

		clauseTypeEClass = createEClass(CLAUSE_TYPE);
		createEReference(clauseTypeEClass, CLAUSE_TYPE__SIMPLE_CLAUSE);
		createEReference(clauseTypeEClass, CLAUSE_TYPE__COMPOUND_CLAUSE);

		compoundClauseTypeEClass = createEClass(COMPOUND_CLAUSE_TYPE);
		createEReference(compoundClauseTypeEClass, COMPOUND_CLAUSE_TYPE__CLAUSE);
		createEAttribute(compoundClauseTypeEClass, COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADHOC_QUERY_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOLEAN_CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPOUND_CLAUSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE_TIME_CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_LINK_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILTER_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILTER_QUERY_RESULT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FLOAT_CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONTENT_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONTENT_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INT_CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCALIZED_STRING_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAME_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RATIONAL_CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESPONSE_OPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_BINDING_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_BINDING_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SLOT_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SLOT_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SLOT_VALUE_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SQL_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SQL_QUERY_RESULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRING_CLAUSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER_BRANCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER_FILTER);

		extrinsicObjectQueryResultTypeEClass = createEClass(EXTRINSIC_OBJECT_QUERY_RESULT_TYPE);
		createEAttribute(extrinsicObjectQueryResultTypeEClass, EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__GROUP);
		createEReference(extrinsicObjectQueryResultTypeEClass, EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(extrinsicObjectQueryResultTypeEClass, EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(extrinsicObjectQueryResultTypeEClass, EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__REGISTRY_ENTRY);
		createEReference(extrinsicObjectQueryResultTypeEClass, EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT);

		extrinsicObjectQueryTypeEClass = createEClass(EXTRINSIC_OBJECT_QUERY_TYPE);
		createEReference(extrinsicObjectQueryTypeEClass, EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER);

		filterQueryResultTypeEClass = createEClass(FILTER_QUERY_RESULT_TYPE);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT);
		createEReference(filterQueryResultTypeEClass, FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT);

		filterQueryTypeEClass = createEClass(FILTER_QUERY_TYPE);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__ASSOCIATION_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__CLASSIFICATION_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__ORGANIZATION_QUERY);
		createEReference(filterQueryTypeEClass, FILTER_QUERY_TYPE__SERVICE_QUERY);

		filterTypeEClass = createEClass(FILTER_TYPE);
		createEReference(filterTypeEClass, FILTER_TYPE__CLAUSE);

		getContentRequestTypeEClass = createEClass(GET_CONTENT_REQUEST_TYPE);
		createEReference(getContentRequestTypeEClass, GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST);

		getContentResponseTypeEClass = createEClass(GET_CONTENT_RESPONSE_TYPE);

		internationalStringBranchTypeEClass = createEClass(INTERNATIONAL_STRING_BRANCH_TYPE);
		createEReference(internationalStringBranchTypeEClass, INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER);

		organizationQueryResultTypeEClass = createEClass(ORGANIZATION_QUERY_RESULT_TYPE);
		createEAttribute(organizationQueryResultTypeEClass, ORGANIZATION_QUERY_RESULT_TYPE__GROUP);
		createEReference(organizationQueryResultTypeEClass, ORGANIZATION_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(organizationQueryResultTypeEClass, ORGANIZATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(organizationQueryResultTypeEClass, ORGANIZATION_QUERY_RESULT_TYPE__ORGANIZATION);

		organizationQueryTypeEClass = createEClass(ORGANIZATION_QUERY_TYPE);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__USER_BRANCH);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH);
		createEReference(organizationQueryTypeEClass, ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH);

		rationalClauseTypeEClass = createEClass(RATIONAL_CLAUSE_TYPE);
		createEAttribute(rationalClauseTypeEClass, RATIONAL_CLAUSE_TYPE__INT_CLAUSE);
		createEAttribute(rationalClauseTypeEClass, RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE);
		createEAttribute(rationalClauseTypeEClass, RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE);
		createEAttribute(rationalClauseTypeEClass, RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE);

		registryEntryQueryResultTypeEClass = createEClass(REGISTRY_ENTRY_QUERY_RESULT_TYPE);
		createEAttribute(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__GROUP);
		createEReference(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME);
		createEReference(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT);
		createEReference(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_ENTRY);
		createEReference(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_PACKAGE);
		createEReference(registryEntryQueryResultTypeEClass, REGISTRY_ENTRY_QUERY_RESULT_TYPE__SERVICE);

		registryEntryQueryTypeEClass = createEClass(REGISTRY_ENTRY_QUERY_TYPE);
		createEReference(registryEntryQueryTypeEClass, REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER);

		registryObjectQueryTypeEClass = createEClass(REGISTRY_OBJECT_QUERY_TYPE);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH);
		createEReference(registryObjectQueryTypeEClass, REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH);

		registryPackageQueryResultTypeEClass = createEClass(REGISTRY_PACKAGE_QUERY_RESULT_TYPE);
		createEAttribute(registryPackageQueryResultTypeEClass, REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP);
		createEReference(registryPackageQueryResultTypeEClass, REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(registryPackageQueryResultTypeEClass, REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY);
		createEReference(registryPackageQueryResultTypeEClass, REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(registryPackageQueryResultTypeEClass, REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE);

		registryPackageQueryTypeEClass = createEClass(REGISTRY_PACKAGE_QUERY_TYPE);
		createEReference(registryPackageQueryTypeEClass, REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER);
		createEReference(registryPackageQueryTypeEClass, REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY);
		createEReference(registryPackageQueryTypeEClass, REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY);

		responseOptionTypeEClass = createEClass(RESPONSE_OPTION_TYPE);
		createEAttribute(responseOptionTypeEClass, RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS);
		createEAttribute(responseOptionTypeEClass, RESPONSE_OPTION_TYPE__RETURN_TYPE);

		serviceBindingBranchTypeEClass = createEClass(SERVICE_BINDING_BRANCH_TYPE);
		createEReference(serviceBindingBranchTypeEClass, SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER);
		createEReference(serviceBindingBranchTypeEClass, SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH);
		createEReference(serviceBindingBranchTypeEClass, SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH);

		serviceQueryResultTypeEClass = createEClass(SERVICE_QUERY_RESULT_TYPE);
		createEAttribute(serviceQueryResultTypeEClass, SERVICE_QUERY_RESULT_TYPE__GROUP);
		createEReference(serviceQueryResultTypeEClass, SERVICE_QUERY_RESULT_TYPE__OBJECT_REF);
		createEReference(serviceQueryResultTypeEClass, SERVICE_QUERY_RESULT_TYPE__REGISTRY_OBJECT);
		createEReference(serviceQueryResultTypeEClass, SERVICE_QUERY_RESULT_TYPE__REGISTRY_ENTRY);
		createEReference(serviceQueryResultTypeEClass, SERVICE_QUERY_RESULT_TYPE__SERVICE);

		serviceQueryTypeEClass = createEClass(SERVICE_QUERY_TYPE);
		createEReference(serviceQueryTypeEClass, SERVICE_QUERY_TYPE__SERVICE_FILTER);
		createEReference(serviceQueryTypeEClass, SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH);

		simpleClauseTypeEClass = createEClass(SIMPLE_CLAUSE_TYPE);
		createEReference(simpleClauseTypeEClass, SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE);
		createEReference(simpleClauseTypeEClass, SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE);
		createEReference(simpleClauseTypeEClass, SIMPLE_CLAUSE_TYPE__STRING_CLAUSE);
		createEAttribute(simpleClauseTypeEClass, SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT);

		slotBranchTypeEClass = createEClass(SLOT_BRANCH_TYPE);
		createEReference(slotBranchTypeEClass, SLOT_BRANCH_TYPE__SLOT_FILTER);
		createEReference(slotBranchTypeEClass, SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER);

		specificationLinkBranchTypeEClass = createEClass(SPECIFICATION_LINK_BRANCH_TYPE);
		createEReference(specificationLinkBranchTypeEClass, SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER);
		createEReference(specificationLinkBranchTypeEClass, SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY);
		createEReference(specificationLinkBranchTypeEClass, SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY);

		stringClauseTypeEClass = createEClass(STRING_CLAUSE_TYPE);
		createEAttribute(stringClauseTypeEClass, STRING_CLAUSE_TYPE__VALUE);
		createEAttribute(stringClauseTypeEClass, STRING_CLAUSE_TYPE__STRING_PREDICATE);

		userBranchTypeEClass = createEClass(USER_BRANCH_TYPE);
		createEReference(userBranchTypeEClass, USER_BRANCH_TYPE__USER_FILTER);
		createEReference(userBranchTypeEClass, USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER);
		createEReference(userBranchTypeEClass, USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER);
		createEReference(userBranchTypeEClass, USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER);
		createEReference(userBranchTypeEClass, USER_BRANCH_TYPE__ORGANIZATION_QUERY);

		// Create enums
		connectivePredicateTypeEEnum = createEEnum(CONNECTIVE_PREDICATE_TYPE);
		logicalPredicateTypeEEnum = createEEnum(LOGICAL_PREDICATE_TYPE);
		returnTypeTypeEEnum = createEEnum(RETURN_TYPE_TYPE);
		stringPredicateTypeEEnum = createEEnum(STRING_PREDICATE_TYPE);

		// Create data types
		connectivePredicateTypeObjectEDataType = createEDataType(CONNECTIVE_PREDICATE_TYPE_OBJECT);
		logicalPredicateTypeObjectEDataType = createEDataType(LOGICAL_PREDICATE_TYPE_OBJECT);
		returnTypeTypeObjectEDataType = createEDataType(RETURN_TYPE_TYPE_OBJECT);
		stringPredicateTypeObjectEDataType = createEDataType(STRING_PREDICATE_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		RimPackage theRimPackage = (RimPackage)EPackage.Registry.INSTANCE.getEPackage(RimPackage.eNS_URI);

		// Add supertypes to classes
		associationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		auditableEventQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		classificationNodeQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		classificationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		classificationSchemeQueryTypeEClass.getESuperTypes().add(this.getRegistryEntryQueryType());
		extrinsicObjectQueryTypeEClass.getESuperTypes().add(this.getRegistryEntryQueryType());
		organizationQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		registryEntryQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectQueryType());
		registryPackageQueryTypeEClass.getESuperTypes().add(this.getRegistryEntryQueryType());
		serviceQueryTypeEClass.getESuperTypes().add(this.getRegistryEntryQueryType());

		// Initialize classes and features; add operations and parameters
		initEClass(adhocQueryRequestTypeEClass, AdhocQueryRequestType.class, "AdhocQueryRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdhocQueryRequestType_ResponseOption(), this.getResponseOptionType(), null, "responseOption", null, 1, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdhocQueryRequestType_FilterQuery(), this.getFilterQueryType(), null, "filterQuery", null, 0, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdhocQueryRequestType_SQLQuery(), theXMLTypePackage.getString(), "sQLQuery", null, 0, 1, AdhocQueryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adhocQueryResponseTypeEClass, AdhocQueryResponseType.class, "AdhocQueryResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdhocQueryResponseType_FilterQueryResult(), this.getFilterQueryResultType(), null, "filterQueryResult", null, 0, 1, AdhocQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdhocQueryResponseType_SQLQueryResult(), theRimPackage.getRegistryObjectListType(), null, "sQLQueryResult", null, 0, 1, AdhocQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationBranchTypeEClass, AssociationBranchType.class, "AssociationBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationBranchType_AssociationFilter(), this.getFilterType(), null, "associationFilter", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ExternalLinkFilter(), this.getFilterType(), null, "externalLinkFilter", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ExternalIdentifierFilter(), this.getFilterType(), null, "externalIdentifierFilter", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_RegistryEntryQuery(), this.getRegistryEntryQueryType(), null, "registryEntryQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_AssociationQuery(), this.getAssociationQueryType(), null, "associationQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ClassificationQuery(), this.getClassificationQueryType(), null, "classificationQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ClassificationNodeQuery(), this.getClassificationNodeQueryType(), null, "classificationNodeQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_OrganizationQuery(), this.getOrganizationQueryType(), null, "organizationQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_AuditableEventQuery(), this.getAuditableEventQueryType(), null, "auditableEventQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_RegistryPackageQuery(), this.getRegistryPackageQueryType(), null, "registryPackageQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ExtrinsicObjectQuery(), this.getExtrinsicObjectQueryType(), null, "extrinsicObjectQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ServiceQuery(), this.getServiceQueryType(), null, "serviceQuery", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_UserBranch(), this.getUserBranchType(), null, "userBranch", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_ServiceBindingBranch(), this.getServiceBindingBranchType(), null, "serviceBindingBranch", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationBranchType_SpecificationLinkBranch(), this.getSpecificationLinkBranchType(), null, "specificationLinkBranch", null, 0, 1, AssociationBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationQueryResultTypeEClass, AssociationQueryResultType.class, "AssociationQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AssociationQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, AssociationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, AssociationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationQueryResultType_Association(), theRimPackage.getAssociationType1(), null, "association", null, 0, -1, AssociationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(associationQueryTypeEClass, AssociationQueryType.class, "AssociationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationQueryType_AssociationFilter(), this.getFilterType(), null, "associationFilter", null, 0, 1, AssociationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableEventQueryResultTypeEClass, AuditableEventQueryResultType.class, "AuditableEventQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuditableEventQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AuditableEventQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, AuditableEventQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, AuditableEventQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryResultType_AuditableEvent(), theRimPackage.getAuditableEventType(), null, "auditableEvent", null, 0, -1, AuditableEventQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(auditableEventQueryTypeEClass, AuditableEventQueryType.class, "AuditableEventQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuditableEventQueryType_AuditableEventFilter(), this.getFilterType(), null, "auditableEventFilter", null, 0, 1, AuditableEventQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, 1, AuditableEventQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryType_RegistryEntryQuery(), this.getRegistryEntryQueryType(), null, "registryEntryQuery", null, 0, 1, AuditableEventQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditableEventQueryType_UserBranch(), this.getUserBranchType(), null, "userBranch", null, 0, 1, AuditableEventQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanClauseTypeEClass, BooleanClauseType.class, "BooleanClauseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanClauseType_BooleanPredicate(), theXMLTypePackage.getBoolean(), "booleanPredicate", null, 1, 1, BooleanClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationNodeQueryResultTypeEClass, ClassificationNodeQueryResultType.class, "ClassificationNodeQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationNodeQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ClassificationNodeQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationNodeQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, ClassificationNodeQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationNodeQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, ClassificationNodeQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationNodeQueryResultType_ClassificationNode(), theRimPackage.getClassificationNodeType(), null, "classificationNode", null, 0, -1, ClassificationNodeQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(classificationNodeQueryTypeEClass, ClassificationNodeQueryType.class, "ClassificationNodeQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationNodeQueryType_ClassificationNodeFilter(), this.getFilterType(), null, "classificationNodeFilter", null, 0, 1, ClassificationNodeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationNodeQueryType_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, 1, ClassificationNodeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationNodeQueryType_ClassificationNodeParentBranch(), this.getClassificationNodeQueryType(), null, "classificationNodeParentBranch", null, 0, 1, ClassificationNodeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationNodeQueryType_ClassificationNodeChildrenBranch(), this.getClassificationNodeQueryType(), null, "classificationNodeChildrenBranch", null, 0, -1, ClassificationNodeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationQueryResultTypeEClass, ClassificationQueryResultType.class, "ClassificationQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ClassificationQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, ClassificationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, ClassificationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryResultType_Classification(), theRimPackage.getClassificationType(), null, "classification", null, 0, -1, ClassificationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(classificationQueryTypeEClass, ClassificationQueryType.class, "ClassificationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationQueryType_ClassificationFilter(), this.getFilterType(), null, "classificationFilter", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryType_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryType_ClassificationNodeQuery(), this.getClassificationNodeQueryType(), null, "classificationNodeQuery", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationQueryType_RegistryEntryQuery(), this.getRegistryEntryQueryType(), null, "registryEntryQuery", null, 0, 1, ClassificationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationSchemeQueryResultTypeEClass, ClassificationSchemeQueryResultType.class, "ClassificationSchemeQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationSchemeQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ClassificationSchemeQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationSchemeQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, ClassificationSchemeQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationSchemeQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, ClassificationSchemeQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationSchemeQueryResultType_RegistryEntry(), theRimPackage.getRegistryEntryType(), null, "registryEntry", null, 0, -1, ClassificationSchemeQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassificationSchemeQueryResultType_ClassificationScheme(), theRimPackage.getClassificationSchemeType(), null, "classificationScheme", null, 0, -1, ClassificationSchemeQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(classificationSchemeQueryTypeEClass, ClassificationSchemeQueryType.class, "ClassificationSchemeQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationSchemeQueryType_ClassificationSchemeFilter(), this.getFilterType(), null, "classificationSchemeFilter", null, 0, 1, ClassificationSchemeQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifiedByBranchTypeEClass, ClassifiedByBranchType.class, "ClassifiedByBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifiedByBranchType_ClassificationFilter(), this.getFilterType(), null, "classificationFilter", null, 0, 1, ClassifiedByBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifiedByBranchType_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, 1, ClassifiedByBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifiedByBranchType_ClassificationNodeQuery(), this.getClassificationNodeQueryType(), null, "classificationNodeQuery", null, 0, 1, ClassifiedByBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clauseTypeEClass, ClauseType.class, "ClauseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClauseType_SimpleClause(), this.getSimpleClauseType(), null, "simpleClause", null, 0, 1, ClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClauseType_CompoundClause(), this.getCompoundClauseType(), null, "compoundClause", null, 0, 1, ClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundClauseTypeEClass, CompoundClauseType.class, "CompoundClauseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundClauseType_Clause(), this.getClauseType(), null, "clause", null, 1, -1, CompoundClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundClauseType_ConnectivePredicate(), this.getConnectivePredicateType(), "connectivePredicate", "And", 1, 1, CompoundClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdhocQueryRequest(), this.getAdhocQueryRequestType(), null, "adhocQueryRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdhocQueryResponse(), this.getAdhocQueryResponseType(), null, "adhocQueryResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AssociationFilter(), this.getFilterType(), null, "associationFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AssociationQuery(), this.getAssociationQueryType(), null, "associationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AssociationQueryResult(), this.getAssociationQueryResultType(), null, "associationQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuditableEventFilter(), this.getFilterType(), null, "auditableEventFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuditableEventQuery(), this.getAuditableEventQueryType(), null, "auditableEventQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuditableEventQueryResult(), this.getAuditableEventQueryResultType(), null, "auditableEventQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BooleanClause(), this.getBooleanClauseType(), null, "booleanClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationFilter(), this.getFilterType(), null, "classificationFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationNodeChildrenBranch(), this.getClassificationNodeQueryType(), null, "classificationNodeChildrenBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationNodeFilter(), this.getFilterType(), null, "classificationNodeFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationNodeParentBranch(), this.getClassificationNodeQueryType(), null, "classificationNodeParentBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationNodeQuery(), this.getClassificationNodeQueryType(), null, "classificationNodeQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationNodeQueryResult(), this.getClassificationNodeQueryResultType(), null, "classificationNodeQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationQuery(), this.getClassificationQueryType(), null, "classificationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationQueryResult(), this.getClassificationQueryResultType(), null, "classificationQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationSchemeFilter(), this.getFilterType(), null, "classificationSchemeFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationSchemeQueryResult(), this.getClassificationSchemeQueryResultType(), null, "classificationSchemeQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassifiedByBranch(), this.getClassifiedByBranchType(), null, "classifiedByBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Clause(), this.getClauseType(), null, "clause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CompoundClause(), this.getCompoundClauseType(), null, "compoundClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DateTimeClause(), theXMLTypePackage.getDateTime(), "dateTimeClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DescriptionBranch(), this.getInternationalStringBranchType(), null, "descriptionBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EmailAddressFilter(), this.getFilterType(), null, "emailAddressFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalIdentifierFilter(), this.getFilterType(), null, "externalIdentifierFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalLinkFilter(), this.getFilterType(), null, "externalLinkFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtrinsicObjectFilter(), this.getFilterType(), null, "extrinsicObjectFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtrinsicObjectQuery(), this.getExtrinsicObjectQueryType(), null, "extrinsicObjectQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtrinsicObjectQueryResult(), this.getExtrinsicObjectQueryResultType(), null, "extrinsicObjectQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FilterQuery(), this.getFilterQueryType(), null, "filterQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FilterQueryResult(), this.getFilterQueryResultType(), null, "filterQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FloatClause(), theXMLTypePackage.getFloat(), "floatClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetContentRequest(), this.getGetContentRequestType(), null, "getContentRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetContentResponse(), this.getGetContentResponseType(), null, "getContentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IntClause(), theXMLTypePackage.getInteger(), "intClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocalizedStringFilter(), this.getFilterType(), null, "localizedStringFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NameBranch(), this.getInternationalStringBranchType(), null, "nameBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganizationChildrenBranch(), this.getOrganizationQueryType(), null, "organizationChildrenBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganizationFilter(), this.getFilterType(), null, "organizationFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganizationParentBranch(), this.getOrganizationQueryType(), null, "organizationParentBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganizationQuery(), this.getOrganizationQueryType(), null, "organizationQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganizationQueryResult(), this.getOrganizationQueryResultType(), null, "organizationQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PostalAddressFilter(), this.getFilterType(), null, "postalAddressFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RationalClause(), this.getRationalClauseType(), null, "rationalClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryEntryFilter(), this.getFilterType(), null, "registryEntryFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryEntryQuery(), this.getRegistryEntryQueryType(), null, "registryEntryQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryEntryQueryResult(), this.getRegistryEntryQueryResultType(), null, "registryEntryQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObjectFilter(), this.getFilterType(), null, "registryObjectFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObjectQueryResult(), theRimPackage.getRegistryObjectListType(), null, "registryObjectQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryPackageFilter(), this.getFilterType(), null, "registryPackageFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryPackageQuery(), this.getRegistryPackageQueryType(), null, "registryPackageQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryPackageQueryResult(), this.getRegistryPackageQueryResultType(), null, "registryPackageQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ResponseOption(), this.getResponseOptionType(), null, "responseOption", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceBindingBranch(), this.getServiceBindingBranchType(), null, "serviceBindingBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceBindingFilter(), this.getFilterType(), null, "serviceBindingFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceBindingTargetBranch(), this.getServiceBindingBranchType(), null, "serviceBindingTargetBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceFilter(), this.getFilterType(), null, "serviceFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceQuery(), this.getServiceQueryType(), null, "serviceQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceQueryResult(), this.getServiceQueryResultType(), null, "serviceQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SimpleClause(), this.getSimpleClauseType(), null, "simpleClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SlotBranch(), this.getSlotBranchType(), null, "slotBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SlotFilter(), this.getFilterType(), null, "slotFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SlotValueFilter(), this.getFilterType(), null, "slotValueFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SourceAssociationBranch(), this.getAssociationBranchType(), null, "sourceAssociationBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpecificationLinkBranch(), this.getSpecificationLinkBranchType(), null, "specificationLinkBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpecificationLinkFilter(), this.getFilterType(), null, "specificationLinkFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SqlQuery(), theXMLTypePackage.getString(), "sqlQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SqlQueryResult(), theRimPackage.getRegistryObjectListType(), null, "sqlQueryResult", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StringClause(), this.getStringClauseType(), null, "stringClause", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TargetAssociationBranch(), this.getAssociationBranchType(), null, "targetAssociationBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TelephoneNumberFilter(), this.getFilterType(), null, "telephoneNumberFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UserBranch(), this.getUserBranchType(), null, "userBranch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UserFilter(), this.getFilterType(), null, "userFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extrinsicObjectQueryResultTypeEClass, ExtrinsicObjectQueryResultType.class, "ExtrinsicObjectQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtrinsicObjectQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ExtrinsicObjectQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtrinsicObjectQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, ExtrinsicObjectQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExtrinsicObjectQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, ExtrinsicObjectQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExtrinsicObjectQueryResultType_RegistryEntry(), theRimPackage.getRegistryEntryType(), null, "registryEntry", null, 0, -1, ExtrinsicObjectQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExtrinsicObjectQueryResultType_ExtrinsicObject(), theRimPackage.getExtrinsicObjectType(), null, "extrinsicObject", null, 0, -1, ExtrinsicObjectQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extrinsicObjectQueryTypeEClass, ExtrinsicObjectQueryType.class, "ExtrinsicObjectQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtrinsicObjectQueryType_ExtrinsicObjectFilter(), this.getFilterType(), null, "extrinsicObjectFilter", null, 0, 1, ExtrinsicObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterQueryResultTypeEClass, FilterQueryResultType.class, "FilterQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterQueryResultType_RegistryObjectQueryResult(), theRimPackage.getRegistryObjectListType(), null, "registryObjectQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_RegistryEntryQueryResult(), this.getRegistryEntryQueryResultType(), null, "registryEntryQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_AssociationQueryResult(), this.getAssociationQueryResultType(), null, "associationQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_AuditableEventQueryResult(), this.getAuditableEventQueryResultType(), null, "auditableEventQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_ClassificationQueryResult(), this.getClassificationQueryResultType(), null, "classificationQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_ClassificationNodeQueryResult(), this.getClassificationNodeQueryResultType(), null, "classificationNodeQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_ClassificationSchemeQueryResult(), this.getClassificationSchemeQueryResultType(), null, "classificationSchemeQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_RegistryPackageQueryResult(), this.getRegistryPackageQueryResultType(), null, "registryPackageQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_ExtrinsicObjectQueryResult(), this.getExtrinsicObjectQueryResultType(), null, "extrinsicObjectQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_OrganizationQueryResult(), this.getOrganizationQueryResultType(), null, "organizationQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryResultType_ServiceQueryResult(), this.getServiceQueryResultType(), null, "serviceQueryResult", null, 0, 1, FilterQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterQueryTypeEClass, FilterQueryType.class, "FilterQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterQueryType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_RegistryEntryQuery(), this.getRegistryEntryQueryType(), null, "registryEntryQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_AssociationQuery(), this.getAssociationQueryType(), null, "associationQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_AuditableEventQuery(), this.getAuditableEventQueryType(), null, "auditableEventQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_ClassificationQuery(), this.getClassificationQueryType(), null, "classificationQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_ClassificationNodeQuery(), this.getClassificationNodeQueryType(), null, "classificationNodeQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_ClassificationSchemeQuery(), this.getClassificationSchemeQueryType(), null, "classificationSchemeQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_RegistryPackageQuery(), this.getRegistryPackageQueryType(), null, "registryPackageQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_ExtrinsicObjectQuery(), this.getExtrinsicObjectQueryType(), null, "extrinsicObjectQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_OrganizationQuery(), this.getOrganizationQueryType(), null, "organizationQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterQueryType_ServiceQuery(), this.getServiceQueryType(), null, "serviceQuery", null, 0, 1, FilterQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterTypeEClass, FilterType.class, "FilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterType_Clause(), this.getClauseType(), null, "clause", null, 1, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getContentRequestTypeEClass, GetContentRequestType.class, "GetContentRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetContentRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 1, 1, GetContentRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getContentResponseTypeEClass, GetContentResponseType.class, "GetContentResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internationalStringBranchTypeEClass, InternationalStringBranchType.class, "InternationalStringBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternationalStringBranchType_LocalizedStringFilter(), this.getFilterType(), null, "localizedStringFilter", null, 0, -1, InternationalStringBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationQueryResultTypeEClass, OrganizationQueryResultType.class, "OrganizationQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganizationQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OrganizationQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, OrganizationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, OrganizationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryResultType_Organization(), theRimPackage.getOrganizationType(), null, "organization", null, 0, -1, OrganizationQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(organizationQueryTypeEClass, OrganizationQueryType.class, "OrganizationQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationQueryType_OrganizationFilter(), this.getFilterType(), null, "organizationFilter", null, 0, 1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_PostalAddressFilter(), this.getFilterType(), null, "postalAddressFilter", null, 0, 1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_TelephoneNumberFilter(), this.getFilterType(), null, "telephoneNumberFilter", null, 0, -1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_UserBranch(), this.getUserBranchType(), null, "userBranch", null, 0, 1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_OrganizationParentBranch(), this.getOrganizationQueryType(), null, "organizationParentBranch", null, 0, 1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationQueryType_OrganizationChildrenBranch(), this.getOrganizationQueryType(), null, "organizationChildrenBranch", null, 0, -1, OrganizationQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationalClauseTypeEClass, RationalClauseType.class, "RationalClauseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRationalClauseType_IntClause(), theXMLTypePackage.getInteger(), "intClause", null, 0, 1, RationalClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalClauseType_FloatClause(), theXMLTypePackage.getFloat(), "floatClause", null, 0, 1, RationalClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalClauseType_DateTimeClause(), theXMLTypePackage.getDateTime(), "dateTimeClause", null, 0, 1, RationalClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalClauseType_LogicalPredicate(), this.getLogicalPredicateType(), "logicalPredicate", "LE", 1, 1, RationalClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryEntryQueryResultTypeEClass, RegistryEntryQueryResultType.class, "RegistryEntryQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryEntryQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RegistryEntryQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryEntryQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, RegistryEntryQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryEntryQueryResultType_ClassificationScheme(), theRimPackage.getClassificationSchemeType(), null, "classificationScheme", null, 0, -1, RegistryEntryQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryEntryQueryResultType_ExtrinsicObject(), theRimPackage.getExtrinsicObjectType(), null, "extrinsicObject", null, 0, -1, RegistryEntryQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryEntryQueryResultType_RegistryEntry(), theRimPackage.getRegistryEntryType(), null, "registryEntry", null, 0, -1, RegistryEntryQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryEntryQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, RegistryEntryQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryEntryQueryResultType_RegistryPackage(), theRimPackage.getRegistryPackageType(), null, "registryPackage", null, 0, -1, RegistryEntryQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryEntryQueryResultType_Service(), theRimPackage.getServiceType(), null, "service", null, 0, -1, RegistryEntryQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(registryEntryQueryTypeEClass, RegistryEntryQueryType.class, "RegistryEntryQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryEntryQueryType_RegistryEntryFilter(), this.getFilterType(), null, "registryEntryFilter", null, 0, 1, RegistryEntryQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryObjectQueryTypeEClass, RegistryObjectQueryType.class, "RegistryObjectQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryObjectQueryType_RegistryObjectFilter(), this.getFilterType(), null, "registryObjectFilter", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_ExternalIdentifierFilter(), this.getFilterType(), null, "externalIdentifierFilter", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_AuditableEventQuery(), this.getAuditableEventQueryType(), null, "auditableEventQuery", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_NameBranch(), this.getInternationalStringBranchType(), null, "nameBranch", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_DescriptionBranch(), this.getInternationalStringBranchType(), null, "descriptionBranch", null, 0, 1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_ClassifiedByBranch(), this.getClassifiedByBranchType(), null, "classifiedByBranch", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_SlotBranch(), this.getSlotBranchType(), null, "slotBranch", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_SourceAssociationBranch(), this.getAssociationBranchType(), null, "sourceAssociationBranch", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectQueryType_TargetAssociationBranch(), this.getAssociationBranchType(), null, "targetAssociationBranch", null, 0, -1, RegistryObjectQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryPackageQueryResultTypeEClass, RegistryPackageQueryResultType.class, "RegistryPackageQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryPackageQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RegistryPackageQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryPackageQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, RegistryPackageQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryPackageQueryResultType_RegistryEntry(), theRimPackage.getRegistryEntryType(), null, "registryEntry", null, 0, -1, RegistryPackageQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryPackageQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, RegistryPackageQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryPackageQueryResultType_RegistryPackage(), theRimPackage.getRegistryPackageType(), null, "registryPackage", null, 0, -1, RegistryPackageQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(registryPackageQueryTypeEClass, RegistryPackageQueryType.class, "RegistryPackageQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryPackageQueryType_RegistryPackageFilter(), this.getFilterType(), null, "registryPackageFilter", null, 0, 1, RegistryPackageQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryPackageQueryType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, -1, RegistryPackageQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryPackageQueryType_RegistryEntryQuery(), this.getRegistryEntryQueryType(), null, "registryEntryQuery", null, 0, -1, RegistryPackageQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseOptionTypeEClass, ResponseOptionType.class, "ResponseOptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseOptionType_ReturnComposedObjects(), theXMLTypePackage.getBoolean(), "returnComposedObjects", "false", 0, 1, ResponseOptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseOptionType_ReturnType(), this.getReturnTypeType(), "returnType", "RegistryObject", 0, 1, ResponseOptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBindingBranchTypeEClass, ServiceBindingBranchType.class, "ServiceBindingBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBindingBranchType_ServiceBindingFilter(), this.getFilterType(), null, "serviceBindingFilter", null, 0, 1, ServiceBindingBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBindingBranchType_SpecificationLinkBranch(), this.getSpecificationLinkBranchType(), null, "specificationLinkBranch", null, 0, -1, ServiceBindingBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBindingBranchType_ServiceBindingTargetBranch(), this.getServiceBindingBranchType(), null, "serviceBindingTargetBranch", null, 0, 1, ServiceBindingBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceQueryResultTypeEClass, ServiceQueryResultType.class, "ServiceQueryResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceQueryResultType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ServiceQueryResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceQueryResultType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 0, -1, ServiceQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getServiceQueryResultType_RegistryObject(), theRimPackage.getRegistryObjectType(), null, "registryObject", null, 0, -1, ServiceQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getServiceQueryResultType_RegistryEntry(), theRimPackage.getRegistryEntryType(), null, "registryEntry", null, 0, -1, ServiceQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getServiceQueryResultType_Service(), theRimPackage.getServiceType(), null, "service", null, 0, -1, ServiceQueryResultType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(serviceQueryTypeEClass, ServiceQueryType.class, "ServiceQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceQueryType_ServiceFilter(), this.getFilterType(), null, "serviceFilter", null, 0, 1, ServiceQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceQueryType_ServiceBindingBranch(), this.getServiceBindingBranchType(), null, "serviceBindingBranch", null, 0, -1, ServiceQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleClauseTypeEClass, SimpleClauseType.class, "SimpleClauseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleClauseType_BooleanClause(), this.getBooleanClauseType(), null, "booleanClause", null, 0, 1, SimpleClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClauseType_RationalClause(), this.getRationalClauseType(), null, "rationalClause", null, 0, 1, SimpleClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClauseType_StringClause(), this.getStringClauseType(), null, "stringClause", null, 0, 1, SimpleClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleClauseType_LeftArgument(), theXMLTypePackage.getString(), "leftArgument", null, 1, 1, SimpleClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotBranchTypeEClass, SlotBranchType.class, "SlotBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotBranchType_SlotFilter(), this.getFilterType(), null, "slotFilter", null, 0, 1, SlotBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlotBranchType_SlotValueFilter(), this.getFilterType(), null, "slotValueFilter", null, 0, -1, SlotBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationLinkBranchTypeEClass, SpecificationLinkBranchType.class, "SpecificationLinkBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationLinkBranchType_SpecificationLinkFilter(), this.getFilterType(), null, "specificationLinkFilter", null, 0, 1, SpecificationLinkBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationLinkBranchType_RegistryObjectQuery(), this.getRegistryObjectQueryType(), null, "registryObjectQuery", null, 0, 1, SpecificationLinkBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationLinkBranchType_RegistryEntryQuery(), this.getRegistryEntryQueryType(), null, "registryEntryQuery", null, 0, 1, SpecificationLinkBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringClauseTypeEClass, StringClauseType.class, "StringClauseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringClauseType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, StringClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringClauseType_StringPredicate(), this.getStringPredicateType(), "stringPredicate", "Contains", 1, 1, StringClauseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userBranchTypeEClass, UserBranchType.class, "UserBranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserBranchType_UserFilter(), this.getFilterType(), null, "userFilter", null, 0, 1, UserBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserBranchType_PostalAddressFilter(), this.getFilterType(), null, "postalAddressFilter", null, 0, 1, UserBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserBranchType_TelephoneNumberFilter(), this.getFilterType(), null, "telephoneNumberFilter", null, 0, -1, UserBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserBranchType_EmailAddressFilter(), this.getFilterType(), null, "emailAddressFilter", null, 0, -1, UserBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserBranchType_OrganizationQuery(), this.getOrganizationQueryType(), null, "organizationQuery", null, 0, 1, UserBranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectivePredicateTypeEEnum, ConnectivePredicateType.class, "ConnectivePredicateType");
		addEEnumLiteral(connectivePredicateTypeEEnum, ConnectivePredicateType.AND_LITERAL);
		addEEnumLiteral(connectivePredicateTypeEEnum, ConnectivePredicateType.OR_LITERAL);

		initEEnum(logicalPredicateTypeEEnum, LogicalPredicateType.class, "LogicalPredicateType");
		addEEnumLiteral(logicalPredicateTypeEEnum, LogicalPredicateType.LE_LITERAL);
		addEEnumLiteral(logicalPredicateTypeEEnum, LogicalPredicateType.LT_LITERAL);
		addEEnumLiteral(logicalPredicateTypeEEnum, LogicalPredicateType.GE_LITERAL);
		addEEnumLiteral(logicalPredicateTypeEEnum, LogicalPredicateType.GT_LITERAL);
		addEEnumLiteral(logicalPredicateTypeEEnum, LogicalPredicateType.EQ_LITERAL);
		addEEnumLiteral(logicalPredicateTypeEEnum, LogicalPredicateType.NE_LITERAL);

		initEEnum(returnTypeTypeEEnum, ReturnTypeType.class, "ReturnTypeType");
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.OBJECT_REF_LITERAL);
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.REGISTRY_OBJECT_LITERAL);
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.REGISTRY_ENTRY_LITERAL);
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.LEAF_CLASS_LITERAL);
		addEEnumLiteral(returnTypeTypeEEnum, ReturnTypeType.LEAF_CLASS_WITH_REPOSITORY_ITEM_LITERAL);

		initEEnum(stringPredicateTypeEEnum, StringPredicateType.class, "StringPredicateType");
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.CONTAINS_LITERAL);
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.CONTAINS1_LITERAL);
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.STARTS_WITH_LITERAL);
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.STARTS_WITH1_LITERAL);
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.EQUAL_LITERAL);
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.EQUAL1_LITERAL);
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.ENDS_WITH_LITERAL);
		addEEnumLiteral(stringPredicateTypeEEnum, StringPredicateType.ENDS_WITH1_LITERAL);

		// Initialize data types
		initEDataType(connectivePredicateTypeObjectEDataType, ConnectivePredicateType.class, "ConnectivePredicateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(logicalPredicateTypeObjectEDataType, LogicalPredicateType.class, "LogicalPredicateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(returnTypeTypeObjectEDataType, ReturnTypeType.class, "ReturnTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringPredicateTypeObjectEDataType, StringPredicateType.class, "StringPredicateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getAdhocQueryRequestType_FilterQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FilterQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAdhocQueryRequestType_SQLQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SQLQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (adhocQueryResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AdhocQueryResponse_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAdhocQueryResponseType_FilterQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FilterQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAdhocQueryResponseType_SQLQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SQLQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (associationBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AssociationBranchType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAssociationBranchType_AssociationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ExternalLinkFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalLinkFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ExternalIdentifierFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifierFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_RegistryEntryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_AssociationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ClassificationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ClassificationSchemeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ClassificationNodeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_OrganizationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_AuditableEventQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_RegistryPackageQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackageQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ExtrinsicObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ServiceQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_UserBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_ServiceBindingBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationBranchType_SpecificationLinkBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLinkBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (associationQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AssociationQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAssociationQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getAssociationQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAssociationQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAssociationQueryResultType_Association(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Association",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (associationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AssociationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAssociationQueryType_AssociationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (auditableEventQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuditableEventQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuditableEventQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getAuditableEventQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAuditableEventQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAuditableEventQueryResultType_AuditableEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEvent",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (auditableEventQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuditableEventQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuditableEventQueryType_AuditableEventFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditableEventQueryType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditableEventQueryType_RegistryEntryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditableEventQueryType_UserBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (booleanClauseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BooleanClause_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBooleanClauseType_BooleanPredicate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "booleanPredicate"
		   });		
		addAnnotation
		  (classificationNodeQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationNodeQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationNodeQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getClassificationNodeQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getClassificationNodeQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getClassificationNodeQueryResultType_ClassificationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNode",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (classificationNodeQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationNodeQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationNodeQueryType_ClassificationNodeFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationNodeQueryType_ClassificationSchemeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationNodeQueryType_ClassificationNodeParentBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeParentBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationNodeQueryType_ClassificationNodeChildrenBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeChildrenBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (classificationQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getClassificationQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getClassificationQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getClassificationQueryResultType_Classification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classification",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (classificationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationQueryType_ClassificationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationFilter",
			 "namespace", "##targetNamespace"
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
		  (getClassificationQueryType_ClassificationNodeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationQueryType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationQueryType_RegistryEntryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (classificationSchemeQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationSchemeQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryResultType_RegistryEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntry",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryResultType_ClassificationScheme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationScheme",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (classificationSchemeQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationSchemeQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationSchemeQueryType_ClassificationSchemeFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (classifiedByBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassifiedByBranch_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassifiedByBranchType_ClassificationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassifiedByBranchType_ClassificationSchemeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassifiedByBranchType_ClassificationNodeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (clauseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Clause_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClauseType_SimpleClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SimpleClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClauseType_CompoundClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompoundClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (compoundClauseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CompoundClause_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCompoundClauseType_Clause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Clause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundClauseType_ConnectivePredicate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connectivePredicate"
		   });		
		addAnnotation
		  (connectivePredicateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "connectivePredicate_._type"
		   });		
		addAnnotation
		  (connectivePredicateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "connectivePredicate_._type:Object",
			 "baseType", "connectivePredicate_._type"
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
		  (getDocumentRoot_AssociationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationFilter",
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
		  (getDocumentRoot_AssociationQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AuditableEventFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventFilter",
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
		  (getDocumentRoot_AuditableEventQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BooleanClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BooleanClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationNodeChildrenBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeChildrenBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationNodeFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationNodeParentBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeParentBranch",
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
		  (getDocumentRoot_ClassificationNodeQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQueryResult",
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
		  (getDocumentRoot_ClassificationQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationSchemeFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeFilter",
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
		  (getDocumentRoot_ClassificationSchemeQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassifiedByBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassifiedByBranch",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Clause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Clause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CompoundClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompoundClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DateTimeClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DateTimeClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DescriptionBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EmailAddressFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddressFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalIdentifierFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifierFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalLinkFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalLinkFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExtrinsicObjectFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObjectFilter",
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
		  (getDocumentRoot_ExtrinsicObjectQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObjectQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FilterQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FilterQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FilterQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FilterQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FloatClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FloatClause",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_GetContentRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GetContentRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_GetContentResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GetContentResponse",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IntClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IntClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LocalizedStringFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalizedStringFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NameBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OrganizationChildrenBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationChildrenBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OrganizationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OrganizationParentBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationParentBranch",
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
		  (getDocumentRoot_OrganizationQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PostalAddressFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalAddressFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RationalClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RationalClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryEntryFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryEntryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryEntryQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryObjectFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectFilter",
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
		  (getDocumentRoot_RegistryObjectQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryPackageFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackageFilter",
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
		  (getDocumentRoot_RegistryPackageQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackageQueryResult",
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
		  (getDocumentRoot_ServiceBindingBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceBindingFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceBindingTargetBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingTargetBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceFilter",
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
		  (getDocumentRoot_ServiceQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SimpleClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SimpleClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SlotBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SlotBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SlotFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SlotFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SlotValueFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SlotValueFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SourceAssociationBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceAssociationBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpecificationLinkBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLinkBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpecificationLinkFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLinkFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SqlQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SQLQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SqlQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SQLQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StringClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StringClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TargetAssociationBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TargetAssociationBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TelephoneNumberFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumberFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UserBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UserFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (extrinsicObjectQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExtrinsicObjectQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExtrinsicObjectQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getExtrinsicObjectQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExtrinsicObjectQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExtrinsicObjectQueryResultType_RegistryEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntry",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getExtrinsicObjectQueryResultType_ExtrinsicObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (extrinsicObjectQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExtrinsicObjectQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExtrinsicObjectQueryType_ExtrinsicObjectFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObjectFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (filterQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FilterQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFilterQueryResultType_RegistryObjectQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_RegistryEntryQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_AssociationQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_AuditableEventQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_ClassificationQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_ClassificationNodeQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_ClassificationSchemeQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_RegistryPackageQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackageQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_ExtrinsicObjectQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObjectQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_OrganizationQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryResultType_ServiceQueryResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceQueryResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (filterQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FilterQuery_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFilterQueryType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_RegistryEntryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_AssociationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AssociationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_AuditableEventQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_ClassificationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_ClassificationNodeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNodeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_ClassificationSchemeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationSchemeQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_RegistryPackageQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackageQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_ExtrinsicObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_OrganizationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFilterQueryType_ServiceQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (filterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FilterType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFilterType_Clause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Clause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContentRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GetContentRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGetContentRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (getContentResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GetContentResponse_._type",
			 "kind", "empty"
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
		  (logicalPredicateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "logicalPredicate_._type"
		   });		
		addAnnotation
		  (logicalPredicateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "logicalPredicate_._type:Object",
			 "baseType", "logicalPredicate_._type"
		   });		
		addAnnotation
		  (organizationQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganizationQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrganizationQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getOrganizationQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOrganizationQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getOrganizationQueryResultType_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Organization",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (organizationQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganizationQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrganizationQueryType_OrganizationFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_PostalAddressFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalAddressFilter",
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
		  (getOrganizationQueryType_UserBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_OrganizationParentBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationParentBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationQueryType_OrganizationChildrenBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationChildrenBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (rationalClauseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RationalClause_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRationalClauseType_IntClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IntClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRationalClauseType_FloatClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FloatClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRationalClauseType_DateTimeClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DateTimeClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRationalClauseType_LogicalPredicate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "logicalPredicate"
		   });		
		addAnnotation
		  (registryEntryQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryEntryQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_ClassificationScheme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationScheme",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_ExtrinsicObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_RegistryEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntry",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_RegistryPackage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackage",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryEntryQueryResultType_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (registryEntryQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryEntryQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryEntryQueryType_RegistryEntryFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryFilter",
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
		  (getRegistryObjectQueryType_RegistryObjectFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_ExternalIdentifierFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifierFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_AuditableEventQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEventQuery",
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
		  (getRegistryObjectQueryType_ClassifiedByBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassifiedByBranch",
			 "namespace", "##targetNamespace"
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
		  (getRegistryObjectQueryType_SourceAssociationBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceAssociationBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectQueryType_TargetAssociationBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TargetAssociationBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (registryPackageQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryPackageQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryPackageQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getRegistryPackageQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryPackageQueryResultType_RegistryEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntry",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryPackageQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRegistryPackageQueryResultType_RegistryPackage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackage",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (registryPackageQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryPackageQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryPackageQueryType_RegistryPackageFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackageFilter",
			 "namespace", "##targetNamespace"
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
		  (getRegistryPackageQueryType_RegistryEntryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQuery",
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
		  (serviceBindingBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceBindingBranchType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceBindingBranchType_ServiceBindingFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceBindingBranchType_SpecificationLinkBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLinkBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceBindingBranchType_ServiceBindingTargetBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingTargetBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceQueryResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceQueryResult_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceQueryResultType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getServiceQueryResultType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getServiceQueryResultType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getServiceQueryResultType_RegistryEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntry",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getServiceQueryResultType_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (serviceQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceQueryType_ServiceFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceQueryType_ServiceBindingBranch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBindingBranch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (simpleClauseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleClause_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleClauseType_BooleanClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BooleanClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleClauseType_RationalClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RationalClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleClauseType_StringClause(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StringClause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleClauseType_LeftArgument(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "leftArgument"
		   });		
		addAnnotation
		  (slotBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SlotBranch_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSlotBranchType_SlotFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SlotFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSlotBranchType_SlotValueFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SlotValueFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (specificationLinkBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SpecificationLinkBranch_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpecificationLinkBranchType_SpecificationLinkFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLinkFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecificationLinkBranchType_RegistryObjectQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecificationLinkBranchType_RegistryEntryQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntryQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (stringClauseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StringClause_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getStringClauseType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getStringClauseType_StringPredicate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stringPredicate"
		   });		
		addAnnotation
		  (stringPredicateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "stringPredicate_._type"
		   });		
		addAnnotation
		  (stringPredicateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "stringPredicate_._type:Object",
			 "baseType", "stringPredicate_._type"
		   });		
		addAnnotation
		  (userBranchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UserBranch_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserBranchType_UserFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserBranchType_PostalAddressFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalAddressFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserBranchType_TelephoneNumberFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumberFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserBranchType_EmailAddressFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddressFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserBranchType_OrganizationQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganizationQuery",
			 "namespace", "##targetNamespace"
		   });
	}

} //QueryPackageImpl
