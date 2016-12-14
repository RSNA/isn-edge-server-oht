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
 * $Id: RegistryPackageImpl.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;



import org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryFactory;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RequestAcceptedResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistryPackageImpl extends EPackageImpl implements RegistryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSlotsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approveObjectsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecateObjectsRequestTypeEClass = null;

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
	private EClass optionalFeaturesSupportedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryErrorListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeObjectsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeSlotsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAcceptedResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submitObjectsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateObjectsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deletionScopeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deletionScopeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType errorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusTypeObjectEDataType = null;

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RegistryPackageImpl() {
		super(eNS_URI, RegistryFactory.eINSTANCE);
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
	public static RegistryPackage init() {
		if (isInited) return (RegistryPackage)EPackage.Registry.INSTANCE.getEPackage(RegistryPackage.eNS_URI);

		// Obtain or create and register package
		RegistryPackageImpl theRegistryPackage = (RegistryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RegistryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RegistryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QueryPackage.eINSTANCE.eClass();
		RimPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRegistryPackage.createPackageContents();

		// Initialize created meta-data
		theRegistryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRegistryPackage.freeze();

		return theRegistryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSlotsRequestType() {
		return addSlotsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddSlotsRequestType_ObjectRef() {
		return (EReference)addSlotsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddSlotsRequestType_Slot() {
		return (EReference)addSlotsRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApproveObjectsRequestType() {
		return approveObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApproveObjectsRequestType_ObjectRefList() {
		return (EReference)approveObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeprecateObjectsRequestType() {
		return deprecateObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecateObjectsRequestType_ObjectRefList() {
		return (EReference)deprecateObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_AddSlotsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApproveObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeprecateObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OptionalFeaturesSupported() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryError() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryErrorList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryProfile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemoveObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemoveSlotsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestAcceptedResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RootElement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubmitObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdateObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalFeaturesSupportedType() {
		return optionalFeaturesSupportedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionalFeaturesSupportedType_SqlQuery() {
		return (EAttribute)optionalFeaturesSupportedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionalFeaturesSupportedType_XQuery() {
		return (EAttribute)optionalFeaturesSupportedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryErrorListType() {
		return registryErrorListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryErrorListType_RegistryError() {
		return (EReference)registryErrorListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryErrorListType_HighestSeverity() {
		return (EAttribute)registryErrorListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryErrorType() {
		return registryErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryErrorType_Value() {
		return (EAttribute)registryErrorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryErrorType_CodeContext() {
		return (EAttribute)registryErrorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryErrorType_ErrorCode() {
		return (EAttribute)registryErrorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryErrorType_Location() {
		return (EAttribute)registryErrorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryErrorType_Severity() {
		return (EAttribute)registryErrorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryProfileType() {
		return registryProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryProfileType_OptionalFeaturesSupported() {
		return (EReference)registryProfileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryProfileType_Version() {
		return (EAttribute)registryProfileTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryResponseType() {
		return registryResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryResponseType_AdhocQueryResponse() {
		return (EReference)registryResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryResponseType_GetContentResponse() {
		return (EReference)registryResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryResponseType_RegistryErrorList() {
		return (EReference)registryResponseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryResponseType_Status() {
		return (EAttribute)registryResponseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveObjectsRequestType() {
		return removeObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveObjectsRequestType_ObjectRefList() {
		return (EReference)removeObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveObjectsRequestType_DeletionScope() {
		return (EAttribute)removeObjectsRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveSlotsRequestType() {
		return removeSlotsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveSlotsRequestType_ObjectRef() {
		return (EReference)removeSlotsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveSlotsRequestType_Slot() {
		return (EReference)removeSlotsRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestAcceptedResponseType() {
		return requestAcceptedResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootElementType() {
		return rootElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_SubmitObjectsRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_UpdateObjectsRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_ApproveObjectsRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_DeprecateObjectsRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_RemoveObjectsRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_AdhocQueryRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_GetContentRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_AddSlotsRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_RemoveSlotsRequest() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_RegistryResponse() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_RegistryProfile() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmitObjectsRequestType() {
		return submitObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmitObjectsRequestType_LeafRegistryObjectList() {
		return (EReference)submitObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateObjectsRequestType() {
		return updateObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateObjectsRequestType_LeafRegistryObjectList() {
		return (EReference)updateObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeletionScopeType() {
		return deletionScopeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorType() {
		return errorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeletionScopeTypeObject() {
		return deletionScopeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getErrorTypeObject() {
		return errorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatusTypeObject() {
		return statusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryFactory getRegistryFactory() {
		return (RegistryFactory)getEFactoryInstance();
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
		addSlotsRequestTypeEClass = createEClass(ADD_SLOTS_REQUEST_TYPE);
		createEReference(addSlotsRequestTypeEClass, ADD_SLOTS_REQUEST_TYPE__OBJECT_REF);
		createEReference(addSlotsRequestTypeEClass, ADD_SLOTS_REQUEST_TYPE__SLOT);

		approveObjectsRequestTypeEClass = createEClass(APPROVE_OBJECTS_REQUEST_TYPE);
		createEReference(approveObjectsRequestTypeEClass, APPROVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST);

		deprecateObjectsRequestTypeEClass = createEClass(DEPRECATE_OBJECTS_REQUEST_TYPE);
		createEReference(deprecateObjectsRequestTypeEClass, DEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADD_SLOTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ERROR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ERROR_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_PROFILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT_ELEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST);

		optionalFeaturesSupportedTypeEClass = createEClass(OPTIONAL_FEATURES_SUPPORTED_TYPE);
		createEAttribute(optionalFeaturesSupportedTypeEClass, OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY);
		createEAttribute(optionalFeaturesSupportedTypeEClass, OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY);

		registryErrorListTypeEClass = createEClass(REGISTRY_ERROR_LIST_TYPE);
		createEReference(registryErrorListTypeEClass, REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR);
		createEAttribute(registryErrorListTypeEClass, REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY);

		registryErrorTypeEClass = createEClass(REGISTRY_ERROR_TYPE);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__VALUE);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__CODE_CONTEXT);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__ERROR_CODE);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__LOCATION);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__SEVERITY);

		registryProfileTypeEClass = createEClass(REGISTRY_PROFILE_TYPE);
		createEReference(registryProfileTypeEClass, REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED);
		createEAttribute(registryProfileTypeEClass, REGISTRY_PROFILE_TYPE__VERSION);

		registryResponseTypeEClass = createEClass(REGISTRY_RESPONSE_TYPE);
		createEReference(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE);
		createEReference(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE);
		createEReference(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST);
		createEAttribute(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__STATUS);

		removeObjectsRequestTypeEClass = createEClass(REMOVE_OBJECTS_REQUEST_TYPE);
		createEReference(removeObjectsRequestTypeEClass, REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST);
		createEAttribute(removeObjectsRequestTypeEClass, REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE);

		removeSlotsRequestTypeEClass = createEClass(REMOVE_SLOTS_REQUEST_TYPE);
		createEReference(removeSlotsRequestTypeEClass, REMOVE_SLOTS_REQUEST_TYPE__OBJECT_REF);
		createEReference(removeSlotsRequestTypeEClass, REMOVE_SLOTS_REQUEST_TYPE__SLOT);

		requestAcceptedResponseTypeEClass = createEClass(REQUEST_ACCEPTED_RESPONSE_TYPE);

		rootElementTypeEClass = createEClass(ROOT_ELEMENT_TYPE);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__REGISTRY_PROFILE);

		submitObjectsRequestTypeEClass = createEClass(SUBMIT_OBJECTS_REQUEST_TYPE);
		createEReference(submitObjectsRequestTypeEClass, SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST);

		updateObjectsRequestTypeEClass = createEClass(UPDATE_OBJECTS_REQUEST_TYPE);
		createEReference(updateObjectsRequestTypeEClass, UPDATE_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST);

		// Create enums
		deletionScopeTypeEEnum = createEEnum(DELETION_SCOPE_TYPE);
		errorTypeEEnum = createEEnum(ERROR_TYPE);
		statusTypeEEnum = createEEnum(STATUS_TYPE);

		// Create data types
		deletionScopeTypeObjectEDataType = createEDataType(DELETION_SCOPE_TYPE_OBJECT);
		errorTypeObjectEDataType = createEDataType(ERROR_TYPE_OBJECT);
		statusTypeObjectEDataType = createEDataType(STATUS_TYPE_OBJECT);
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
		RimPackage theRimPackage = (RimPackage)EPackage.Registry.INSTANCE.getEPackage(RimPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(addSlotsRequestTypeEClass, AddSlotsRequestType.class, "AddSlotsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddSlotsRequestType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 1, 1, AddSlotsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddSlotsRequestType_Slot(), theRimPackage.getSlotType1(), null, "slot", null, 1, -1, AddSlotsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(approveObjectsRequestTypeEClass, ApproveObjectsRequestType.class, "ApproveObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApproveObjectsRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 1, 1, ApproveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deprecateObjectsRequestTypeEClass, DeprecateObjectsRequestType.class, "DeprecateObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeprecateObjectsRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 1, 1, DeprecateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddSlotsRequest(), this.getAddSlotsRequestType(), null, "addSlotsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApproveObjectsRequest(), this.getApproveObjectsRequestType(), null, "approveObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DeprecateObjectsRequest(), this.getDeprecateObjectsRequestType(), null, "deprecateObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OptionalFeaturesSupported(), this.getOptionalFeaturesSupportedType(), null, "optionalFeaturesSupported", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryError(), this.getRegistryErrorType(), null, "registryError", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryErrorList(), this.getRegistryErrorListType(), null, "registryErrorList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryProfile(), this.getRegistryProfileType(), null, "registryProfile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryResponse(), this.getRegistryResponseType(), null, "registryResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoveObjectsRequest(), this.getRemoveObjectsRequestType(), null, "removeObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoveSlotsRequest(), this.getRemoveSlotsRequestType(), null, "removeSlotsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestAcceptedResponse(), this.getRequestAcceptedResponseType(), null, "requestAcceptedResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RootElement(), this.getRootElementType(), null, "rootElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubmitObjectsRequest(), this.getSubmitObjectsRequestType(), null, "submitObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdateObjectsRequest(), this.getUpdateObjectsRequestType(), null, "updateObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(optionalFeaturesSupportedTypeEClass, OptionalFeaturesSupportedType.class, "OptionalFeaturesSupportedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionalFeaturesSupportedType_SqlQuery(), theXMLTypePackage.getBoolean(), "sqlQuery", "false", 0, 1, OptionalFeaturesSupportedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionalFeaturesSupportedType_XQuery(), theXMLTypePackage.getBoolean(), "xQuery", "false", 0, 1, OptionalFeaturesSupportedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryErrorListTypeEClass, RegistryErrorListType.class, "RegistryErrorListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryErrorListType_RegistryError(), this.getRegistryErrorType(), null, "registryError", null, 1, -1, RegistryErrorListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorListType_HighestSeverity(), this.getErrorType(), "highestSeverity", "Warning", 0, 1, RegistryErrorListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryErrorTypeEClass, RegistryErrorType.class, "RegistryErrorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryErrorType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_CodeContext(), theXMLTypePackage.getString(), "codeContext", null, 1, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_ErrorCode(), theXMLTypePackage.getString(), "errorCode", null, 1, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_Severity(), this.getErrorType(), "severity", "Error", 0, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryProfileTypeEClass, RegistryProfileType.class, "RegistryProfileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryProfileType_OptionalFeaturesSupported(), this.getOptionalFeaturesSupportedType(), null, "optionalFeaturesSupported", null, 1, 1, RegistryProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryProfileType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, RegistryProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryResponseTypeEClass, RegistryResponseType.class, "RegistryResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryResponseType_AdhocQueryResponse(), theQueryPackage.getAdhocQueryResponseType(), null, "adhocQueryResponse", null, 0, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryResponseType_GetContentResponse(), theQueryPackage.getGetContentResponseType(), null, "getContentResponse", null, 0, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryResponseType_RegistryErrorList(), this.getRegistryErrorListType(), null, "registryErrorList", null, 0, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryResponseType_Status(), this.getStatusType(), "status", "Success", 1, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeObjectsRequestTypeEClass, RemoveObjectsRequestType.class, "RemoveObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveObjectsRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 1, 1, RemoveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveObjectsRequestType_DeletionScope(), this.getDeletionScopeType(), "deletionScope", "DeleteAll", 0, 1, RemoveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeSlotsRequestTypeEClass, RemoveSlotsRequestType.class, "RemoveSlotsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveSlotsRequestType_ObjectRef(), theRimPackage.getObjectRefType(), null, "objectRef", null, 1, 1, RemoveSlotsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoveSlotsRequestType_Slot(), theRimPackage.getSlotType1(), null, "slot", null, 1, -1, RemoveSlotsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestAcceptedResponseTypeEClass, RequestAcceptedResponseType.class, "RequestAcceptedResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootElementTypeEClass, RootElementType.class, "RootElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootElementType_SubmitObjectsRequest(), this.getSubmitObjectsRequestType(), null, "submitObjectsRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_UpdateObjectsRequest(), this.getUpdateObjectsRequestType(), null, "updateObjectsRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_ApproveObjectsRequest(), this.getApproveObjectsRequestType(), null, "approveObjectsRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_DeprecateObjectsRequest(), this.getDeprecateObjectsRequestType(), null, "deprecateObjectsRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_RemoveObjectsRequest(), this.getRemoveObjectsRequestType(), null, "removeObjectsRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_AdhocQueryRequest(), theQueryPackage.getAdhocQueryRequestType(), null, "adhocQueryRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_GetContentRequest(), theQueryPackage.getGetContentRequestType(), null, "getContentRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_AddSlotsRequest(), this.getAddSlotsRequestType(), null, "addSlotsRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_RemoveSlotsRequest(), this.getRemoveSlotsRequestType(), null, "removeSlotsRequest", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_RegistryResponse(), this.getRegistryResponseType(), null, "registryResponse", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_RegistryProfile(), this.getRegistryProfileType(), null, "registryProfile", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submitObjectsRequestTypeEClass, SubmitObjectsRequestType.class, "SubmitObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmitObjectsRequestType_LeafRegistryObjectList(), theRimPackage.getLeafRegistryObjectListType(), null, "leafRegistryObjectList", null, 1, 1, SubmitObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateObjectsRequestTypeEClass, UpdateObjectsRequestType.class, "UpdateObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateObjectsRequestType_LeafRegistryObjectList(), theRimPackage.getLeafRegistryObjectListType(), null, "leafRegistryObjectList", null, 1, 1, UpdateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deletionScopeTypeEEnum, DeletionScopeType.class, "DeletionScopeType");
		addEEnumLiteral(deletionScopeTypeEEnum, DeletionScopeType.DELETE_ALL_LITERAL);
		addEEnumLiteral(deletionScopeTypeEEnum, DeletionScopeType.DELETE_REPOSITORY_ITEM_ONLY_LITERAL);

		initEEnum(errorTypeEEnum, ErrorType.class, "ErrorType");
		addEEnumLiteral(errorTypeEEnum, ErrorType.WARNING_LITERAL);
		addEEnumLiteral(errorTypeEEnum, ErrorType.ERROR_LITERAL);

		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.SUCCESS_LITERAL);
		addEEnumLiteral(statusTypeEEnum, StatusType.FAILURE_LITERAL);
		addEEnumLiteral(statusTypeEEnum, StatusType.UNAVAILABLE_LITERAL);
		addEEnumLiteral(statusTypeEEnum, StatusType.PARTIAL_SUCCESS_LITERAL);

		// Initialize data types
		initEDataType(deletionScopeTypeObjectEDataType, DeletionScopeType.class, "DeletionScopeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(errorTypeObjectEDataType, ErrorType.class, "ErrorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statusTypeObjectEDataType, StatusType.class, "StatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (addSlotsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AddSlotsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddSlotsRequestType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (getAddSlotsRequestType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (approveObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ApproveObjectsRequest_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getApproveObjectsRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (deletionScopeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "deletionScope_._type"
		   });		
		addAnnotation
		  (deletionScopeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "deletionScope_._type:Object",
			 "baseType", "deletionScope_._type"
		   });		
		addAnnotation
		  (deprecateObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeprecateObjectsRequest_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDeprecateObjectsRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
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
		  (getDocumentRoot_AddSlotsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddSlotsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ApproveObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApproveObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_DeprecateObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeprecateObjectsRequest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OptionalFeaturesSupported(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OptionalFeaturesSupported",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryError(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryError",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RegistryErrorList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryErrorList",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RegistryProfile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryProfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryResponse",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RemoveObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemoveObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RemoveSlotsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemoveSlotsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequestAcceptedResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestAcceptedResponse",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RootElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RootElement",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SubmitObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SubmitObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UpdateObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdateObjectsRequest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (errorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ErrorType"
		   });		
		addAnnotation
		  (errorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ErrorType:Object",
			 "baseType", "ErrorType"
		   });		
		addAnnotation
		  (optionalFeaturesSupportedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OptionalFeaturesSupported_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOptionalFeaturesSupportedType_SqlQuery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sqlQuery"
		   });		
		addAnnotation
		  (getOptionalFeaturesSupportedType_XQuery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xQuery"
		   });		
		addAnnotation
		  (registryErrorListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryErrorList_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryErrorListType_RegistryError(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryError",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryErrorListType_HighestSeverity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highestSeverity"
		   });		
		addAnnotation
		  (registryErrorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryError_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRegistryErrorType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRegistryErrorType_CodeContext(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "codeContext"
		   });		
		addAnnotation
		  (getRegistryErrorType_ErrorCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "errorCode"
		   });		
		addAnnotation
		  (getRegistryErrorType_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location"
		   });		
		addAnnotation
		  (getRegistryErrorType_Severity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "severity"
		   });		
		addAnnotation
		  (registryProfileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryProfile_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryProfileType_OptionalFeaturesSupported(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OptionalFeaturesSupported",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryProfileType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (registryResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryResponse_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRegistryResponseType_AdhocQueryResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQueryResponse",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1"
		   });			
		addAnnotation
		  (getRegistryResponseType_GetContentResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GetContentResponse",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1"
		   });			
		addAnnotation
		  (getRegistryResponseType_RegistryErrorList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryErrorList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryResponseType_Status(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "status"
		   });		
		addAnnotation
		  (removeObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemoveObjectsRequest_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRemoveObjectsRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (getRemoveObjectsRequestType_DeletionScope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "deletionScope"
		   });		
		addAnnotation
		  (removeSlotsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemoveSlotsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRemoveSlotsRequestType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (getRemoveSlotsRequestType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (requestAcceptedResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestAcceptedResponse_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (rootElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RootElement_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRootElementType_SubmitObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SubmitObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRootElementType_UpdateObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdateObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRootElementType_ApproveObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApproveObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRootElementType_DeprecateObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeprecateObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRootElementType_RemoveObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemoveObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRootElementType_AdhocQueryRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQueryRequest",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1"
		   });			
		addAnnotation
		  (getRootElementType_GetContentRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GetContentRequest",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1"
		   });		
		addAnnotation
		  (getRootElementType_AddSlotsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddSlotsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRootElementType_RemoveSlotsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemoveSlotsRequest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRootElementType_RegistryResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryResponse",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRootElementType_RegistryProfile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryProfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (statusTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "status_._type"
		   });		
		addAnnotation
		  (statusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "status_._type:Object",
			 "baseType", "status_._type"
		   });		
		addAnnotation
		  (submitObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SubmitObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubmitObjectsRequestType_LeafRegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LeafRegistryObjectList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });		
		addAnnotation
		  (updateObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UpdateObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUpdateObjectsRequestType_LeafRegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LeafRegistryObjectList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1"
		   });
	}

} //RegistryPackageImpl
