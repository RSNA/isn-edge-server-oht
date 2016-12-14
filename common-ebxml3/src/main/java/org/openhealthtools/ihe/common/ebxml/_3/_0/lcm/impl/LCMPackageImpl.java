/**
 * <copyright>
 * </copyright>
 *
 * $Id: LCMPackageImpl.java,v 1.1 2006/10/19 20:16:14 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;



import org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LCMPackageImpl extends EPackageImpl implements LCMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptObjectsRequestTypeEClass = null;

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
	private EClass relocateObjectsRequestTypeEClass = null;

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
	private EClass submitObjectsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undeprecateObjectsRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateObjectsRequestTypeEClass = null;

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LCMPackageImpl() {
		super(eNS_URI, LCMFactory.eINSTANCE);
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
	public static LCMPackage init() {
		if (isInited) return (LCMPackage)EPackage.Registry.INSTANCE.getEPackage(LCMPackage.eNS_URI);

		// Obtain or create and register package
		LCMPackageImpl theLCMPackage = (LCMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof LCMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new LCMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RimPackage.eINSTANCE.eClass();
		RegistryPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLCMPackage.createPackageContents();

		// Initialize created meta-data
		theLCMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLCMPackage.freeze();

		return theLCMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptObjectsRequestType() {
		return acceptObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptObjectsRequestType_CorrelationId() {
		return (EAttribute)acceptObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getApproveObjectsRequestType_AdhocQuery() {
		return (EReference)approveObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApproveObjectsRequestType_ObjectRefList() {
		return (EReference)approveObjectsRequestTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDeprecateObjectsRequestType_AdhocQuery() {
		return (EReference)deprecateObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecateObjectsRequestType_ObjectRefList() {
		return (EReference)deprecateObjectsRequestTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AcceptObjectsRequest() {
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
	public EReference getDocumentRoot_RelocateObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemoveObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubmitObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UndeprecateObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdateObjectsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelocateObjectsRequestType() {
		return relocateObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelocateObjectsRequestType_AdhocQuery() {
		return (EReference)relocateObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelocateObjectsRequestType_SourceRegistry() {
		return (EReference)relocateObjectsRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelocateObjectsRequestType_DestinationRegistry() {
		return (EReference)relocateObjectsRequestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelocateObjectsRequestType_OwnerAtSource() {
		return (EReference)relocateObjectsRequestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelocateObjectsRequestType_OwnerAtDestination() {
		return (EReference)relocateObjectsRequestTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getRemoveObjectsRequestType_AdhocQuery() {
		return (EReference)removeObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveObjectsRequestType_ObjectRefList() {
		return (EReference)removeObjectsRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveObjectsRequestType_DeletionScope() {
		return (EAttribute)removeObjectsRequestTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getSubmitObjectsRequestType_RegistryObjectList() {
		return (EReference)submitObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndeprecateObjectsRequestType() {
		return undeprecateObjectsRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUndeprecateObjectsRequestType_AdhocQuery() {
		return (EReference)undeprecateObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUndeprecateObjectsRequestType_ObjectRefList() {
		return (EReference)undeprecateObjectsRequestTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getUpdateObjectsRequestType_RegistryObjectList() {
		return (EReference)updateObjectsRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCMFactory getLCMFactory() {
		return (LCMFactory)getEFactoryInstance();
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
		acceptObjectsRequestTypeEClass = createEClass(ACCEPT_OBJECTS_REQUEST_TYPE);
		createEAttribute(acceptObjectsRequestTypeEClass, ACCEPT_OBJECTS_REQUEST_TYPE__CORRELATION_ID);

		approveObjectsRequestTypeEClass = createEClass(APPROVE_OBJECTS_REQUEST_TYPE);
		createEReference(approveObjectsRequestTypeEClass, APPROVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY);
		createEReference(approveObjectsRequestTypeEClass, APPROVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST);

		deprecateObjectsRequestTypeEClass = createEClass(DEPRECATE_OBJECTS_REQUEST_TYPE);
		createEReference(deprecateObjectsRequestTypeEClass, DEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY);
		createEReference(deprecateObjectsRequestTypeEClass, DEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST);

		relocateObjectsRequestTypeEClass = createEClass(RELOCATE_OBJECTS_REQUEST_TYPE);
		createEReference(relocateObjectsRequestTypeEClass, RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY);
		createEReference(relocateObjectsRequestTypeEClass, RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY);
		createEReference(relocateObjectsRequestTypeEClass, RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY);
		createEReference(relocateObjectsRequestTypeEClass, RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE);
		createEReference(relocateObjectsRequestTypeEClass, RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION);

		removeObjectsRequestTypeEClass = createEClass(REMOVE_OBJECTS_REQUEST_TYPE);
		createEReference(removeObjectsRequestTypeEClass, REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY);
		createEReference(removeObjectsRequestTypeEClass, REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST);
		createEAttribute(removeObjectsRequestTypeEClass, REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE);

		submitObjectsRequestTypeEClass = createEClass(SUBMIT_OBJECTS_REQUEST_TYPE);
		createEReference(submitObjectsRequestTypeEClass, SUBMIT_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST);

		undeprecateObjectsRequestTypeEClass = createEClass(UNDEPRECATE_OBJECTS_REQUEST_TYPE);
		createEReference(undeprecateObjectsRequestTypeEClass, UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY);
		createEReference(undeprecateObjectsRequestTypeEClass, UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST);

		updateObjectsRequestTypeEClass = createEClass(UPDATE_OBJECTS_REQUEST_TYPE);
		createEReference(updateObjectsRequestTypeEClass, UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		RimPackage theRimPackage = (RimPackage)EPackage.Registry.INSTANCE.getEPackage(RimPackage.eNS_URI);

		// Add supertypes to classes
		acceptObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		approveObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		deprecateObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		relocateObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		removeObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		submitObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		undeprecateObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		updateObjectsRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());

		// Initialize classes and features; add operations and parameters
		initEClass(acceptObjectsRequestTypeEClass, AcceptObjectsRequestType.class, "AcceptObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptObjectsRequestType_CorrelationId(), theXMLTypePackage.getAnyURI(), "correlationId", null, 1, 1, AcceptObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(approveObjectsRequestTypeEClass, ApproveObjectsRequestType.class, "ApproveObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApproveObjectsRequestType_AdhocQuery(), theRimPackage.getAdhocQueryType(), null, "adhocQuery", null, 0, 1, ApproveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApproveObjectsRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 0, 1, ApproveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deprecateObjectsRequestTypeEClass, DeprecateObjectsRequestType.class, "DeprecateObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeprecateObjectsRequestType_AdhocQuery(), theRimPackage.getAdhocQueryType(), null, "adhocQuery", null, 0, 1, DeprecateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeprecateObjectsRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 0, 1, DeprecateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AcceptObjectsRequest(), this.getAcceptObjectsRequestType(), null, "acceptObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApproveObjectsRequest(), this.getApproveObjectsRequestType(), null, "approveObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DeprecateObjectsRequest(), this.getDeprecateObjectsRequestType(), null, "deprecateObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelocateObjectsRequest(), this.getRelocateObjectsRequestType(), null, "relocateObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoveObjectsRequest(), this.getRemoveObjectsRequestType(), null, "removeObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubmitObjectsRequest(), this.getSubmitObjectsRequestType(), null, "submitObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UndeprecateObjectsRequest(), this.getUndeprecateObjectsRequestType(), null, "undeprecateObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdateObjectsRequest(), this.getUpdateObjectsRequestType(), null, "updateObjectsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relocateObjectsRequestTypeEClass, RelocateObjectsRequestType.class, "RelocateObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelocateObjectsRequestType_AdhocQuery(), theRimPackage.getAdhocQueryType(), null, "adhocQuery", null, 1, 1, RelocateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelocateObjectsRequestType_SourceRegistry(), theRimPackage.getObjectRefType(), null, "sourceRegistry", null, 1, 1, RelocateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelocateObjectsRequestType_DestinationRegistry(), theRimPackage.getObjectRefType(), null, "destinationRegistry", null, 1, 1, RelocateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelocateObjectsRequestType_OwnerAtSource(), theRimPackage.getObjectRefType(), null, "ownerAtSource", null, 1, 1, RelocateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelocateObjectsRequestType_OwnerAtDestination(), theRimPackage.getObjectRefType(), null, "ownerAtDestination", null, 1, 1, RelocateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeObjectsRequestTypeEClass, RemoveObjectsRequestType.class, "RemoveObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveObjectsRequestType_AdhocQuery(), theRimPackage.getAdhocQueryType(), null, "adhocQuery", null, 0, 1, RemoveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoveObjectsRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 0, 1, RemoveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveObjectsRequestType_DeletionScope(), theRimPackage.getReferenceURI(), "deletionScope", "urn:oasis:names:tc:ebxml-regrep:DeletionScopeType:DeleteAll", 0, 1, RemoveObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submitObjectsRequestTypeEClass, SubmitObjectsRequestType.class, "SubmitObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmitObjectsRequestType_RegistryObjectList(), theRimPackage.getRegistryObjectListType(), null, "registryObjectList", null, 1, 1, SubmitObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undeprecateObjectsRequestTypeEClass, UndeprecateObjectsRequestType.class, "UndeprecateObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUndeprecateObjectsRequestType_AdhocQuery(), theRimPackage.getAdhocQueryType(), null, "adhocQuery", null, 0, 1, UndeprecateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUndeprecateObjectsRequestType_ObjectRefList(), theRimPackage.getObjectRefListType(), null, "objectRefList", null, 0, 1, UndeprecateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateObjectsRequestTypeEClass, UpdateObjectsRequestType.class, "UpdateObjectsRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateObjectsRequestType_RegistryObjectList(), theRimPackage.getRegistryObjectListType(), null, "registryObjectList", null, 1, 1, UpdateObjectsRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (acceptObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AcceptObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAcceptObjectsRequestType_CorrelationId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "correlationId"
		   });		
		addAnnotation
		  (approveObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ApproveObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getApproveObjectsRequestType_AdhocQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQuery",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getApproveObjectsRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (deprecateObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeprecateObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeprecateObjectsRequestType_AdhocQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQuery",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getDeprecateObjectsRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
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
		  (getDocumentRoot_AcceptObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AcceptObjectsRequest",
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
		  (getDocumentRoot_RelocateObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelocateObjectsRequest",
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
		  (getDocumentRoot_SubmitObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SubmitObjectsRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UndeprecateObjectsRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UndeprecateObjectsRequest",
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
		  (relocateObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelocateObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRelocateObjectsRequestType_AdhocQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQuery",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getRelocateObjectsRequestType_SourceRegistry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceRegistry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelocateObjectsRequestType_DestinationRegistry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DestinationRegistry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelocateObjectsRequestType_OwnerAtSource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OwnerAtSource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelocateObjectsRequestType_OwnerAtDestination(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OwnerAtDestination",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (removeObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemoveObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRemoveObjectsRequestType_AdhocQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQuery",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getRemoveObjectsRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getRemoveObjectsRequestType_DeletionScope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "deletionScope"
		   });		
		addAnnotation
		  (submitObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SubmitObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubmitObjectsRequestType_RegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (undeprecateObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UndeprecateObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUndeprecateObjectsRequestType_AdhocQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQuery",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (getUndeprecateObjectsRequestType_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });		
		addAnnotation
		  (updateObjectsRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UpdateObjectsRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUpdateObjectsRequestType_RegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectList",
			 "namespace", "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
		   });
	}

} //LCMPackageImpl
