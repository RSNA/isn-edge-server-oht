/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryPackageImpl.java,v 1.1 2006/10/19 20:16:12 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType;

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
	private EClass documentRootEClass = null;

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
	private EClass registryRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryResponseTypeEClass = null;

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#eNS_URI
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
	public EReference getDocumentRoot_RegistryError() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryErrorList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
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
	public EClass getRegistryRequestType() {
		return registryRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryRequestType_RequestSlotList() {
		return (EReference)registryRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryRequestType_Comment() {
		return (EAttribute)registryRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryRequestType_Id() {
		return (EAttribute)registryRequestTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getRegistryResponseType_ResponseSlotList() {
		return (EReference)registryResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryResponseType_RegistryErrorList() {
		return (EReference)registryResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryResponseType_RequestId() {
		return (EAttribute)registryResponseTypeEClass.getEStructuralFeatures().get(2);
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ERROR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ERROR_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_RESPONSE);

		registryErrorListTypeEClass = createEClass(REGISTRY_ERROR_LIST_TYPE);
		createEReference(registryErrorListTypeEClass, REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR);
		createEAttribute(registryErrorListTypeEClass, REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY);

		registryErrorTypeEClass = createEClass(REGISTRY_ERROR_TYPE);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__VALUE);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__CODE_CONTEXT);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__ERROR_CODE);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__LOCATION);
		createEAttribute(registryErrorTypeEClass, REGISTRY_ERROR_TYPE__SEVERITY);

		registryRequestTypeEClass = createEClass(REGISTRY_REQUEST_TYPE);
		createEReference(registryRequestTypeEClass, REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST);
		createEAttribute(registryRequestTypeEClass, REGISTRY_REQUEST_TYPE__COMMENT);
		createEAttribute(registryRequestTypeEClass, REGISTRY_REQUEST_TYPE__ID);

		registryResponseTypeEClass = createEClass(REGISTRY_RESPONSE_TYPE);
		createEReference(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST);
		createEReference(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST);
		createEAttribute(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__REQUEST_ID);
		createEAttribute(registryResponseTypeEClass, REGISTRY_RESPONSE_TYPE__STATUS);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryError(), this.getRegistryErrorType(), null, "registryError", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryErrorList(), this.getRegistryErrorListType(), null, "registryErrorList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryRequest(), this.getRegistryRequestType(), null, "registryRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryResponse(), this.getRegistryResponseType(), null, "registryResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(registryErrorListTypeEClass, RegistryErrorListType.class, "RegistryErrorListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryErrorListType_RegistryError(), this.getRegistryErrorType(), null, "registryError", null, 1, -1, RegistryErrorListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorListType_HighestSeverity(), theRimPackage.getReferenceURI(), "highestSeverity", null, 0, 1, RegistryErrorListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryErrorTypeEClass, RegistryErrorType.class, "RegistryErrorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryErrorType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_CodeContext(), theXMLTypePackage.getString(), "codeContext", null, 1, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_ErrorCode(), theXMLTypePackage.getString(), "errorCode", null, 1, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryErrorType_Severity(), theRimPackage.getReferenceURI(), "severity", "urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error", 0, 1, RegistryErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryRequestTypeEClass, RegistryRequestType.class, "RegistryRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryRequestType_RequestSlotList(), theRimPackage.getSlotListType(), null, "requestSlotList", null, 0, 1, RegistryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRequestType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, RegistryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryRequestType_Id(), theXMLTypePackage.getAnyURI(), "id", null, 0, 1, RegistryRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryResponseTypeEClass, RegistryResponseType.class, "RegistryResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryResponseType_ResponseSlotList(), theRimPackage.getSlotListType(), null, "responseSlotList", null, 0, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryResponseType_RegistryErrorList(), this.getRegistryErrorListType(), null, "registryErrorList", null, 0, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryResponseType_RequestId(), theXMLTypePackage.getAnyURI(), "requestId", null, 0, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryResponseType_Status(), theRimPackage.getReferenceURI(), "status", null, 1, 1, RegistryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDocumentRoot_RegistryRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryRequest",
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
		  (registryRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryRequestType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryRequestType_RequestSlotList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSlotList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryRequestType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment"
		   });		
		addAnnotation
		  (getRegistryRequestType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });			
		addAnnotation
		  (registryResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryResponseType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryResponseType_ResponseSlotList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResponseSlotList",
			 "namespace", "##targetNamespace"
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
		  (getRegistryResponseType_RequestId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "requestId"
		   });		
		addAnnotation
		  (getRegistryResponseType_Status(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "status"
		   });
	}

} //RegistryPackageImpl
