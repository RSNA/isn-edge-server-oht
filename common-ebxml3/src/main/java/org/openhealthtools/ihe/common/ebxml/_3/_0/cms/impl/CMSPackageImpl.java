/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMSPackageImpl.java,v 1.1 2006/10/19 20:16:35 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;



import org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMSPackageImpl extends EPackageImpl implements CMSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogContentRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogContentResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentManagementServiceRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentManagementServiceResponseTypeEClass = null;

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
	private EClass validateContentRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validateContentResponseTypeEClass = null;

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CMSPackageImpl() {
		super(eNS_URI, CMSFactory.eINSTANCE);
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
	public static CMSPackage init() {
		if (isInited) return (CMSPackage)EPackage.Registry.INSTANCE.getEPackage(CMSPackage.eNS_URI);

		// Obtain or create and register package
		CMSPackageImpl theCMSPackage = (CMSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CMSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CMSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RimPackage.eINSTANCE.eClass();
		RegistryPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCMSPackage.createPackageContents();

		// Initialize created meta-data
		theCMSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCMSPackage.freeze();

		return theCMSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogContentRequestType() {
		return catalogContentRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogContentResponseType() {
		return catalogContentResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogContentResponseType_CatalogedContent() {
		return (EReference)catalogContentResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentManagementServiceRequestType() {
		return contentManagementServiceRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentManagementServiceRequestType_OriginalContent() {
		return (EReference)contentManagementServiceRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentManagementServiceRequestType_InvocationControlFile() {
		return (EReference)contentManagementServiceRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentManagementServiceResponseType() {
		return contentManagementServiceResponseTypeEClass;
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
	public EReference getDocumentRoot_CatalogContentRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CatalogContentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidateContentRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidateContentResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidateContentRequestType() {
		return validateContentRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidateContentResponseType() {
		return validateContentResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMSFactory getCMSFactory() {
		return (CMSFactory)getEFactoryInstance();
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
		catalogContentRequestTypeEClass = createEClass(CATALOG_CONTENT_REQUEST_TYPE);

		catalogContentResponseTypeEClass = createEClass(CATALOG_CONTENT_RESPONSE_TYPE);
		createEReference(catalogContentResponseTypeEClass, CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT);

		contentManagementServiceRequestTypeEClass = createEClass(CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE);
		createEReference(contentManagementServiceRequestTypeEClass, CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT);
		createEReference(contentManagementServiceRequestTypeEClass, CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE);

		contentManagementServiceResponseTypeEClass = createEClass(CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE);

		validateContentRequestTypeEClass = createEClass(VALIDATE_CONTENT_REQUEST_TYPE);

		validateContentResponseTypeEClass = createEClass(VALIDATE_CONTENT_RESPONSE_TYPE);
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
		RegistryPackage theRegistryPackage = (RegistryPackage)EPackage.Registry.INSTANCE.getEPackage(RegistryPackage.eNS_URI);

		// Add supertypes to classes
		catalogContentRequestTypeEClass.getESuperTypes().add(this.getContentManagementServiceRequestType());
		catalogContentResponseTypeEClass.getESuperTypes().add(this.getContentManagementServiceResponseType());
		contentManagementServiceRequestTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryRequestType());
		contentManagementServiceResponseTypeEClass.getESuperTypes().add(theRegistryPackage.getRegistryResponseType());
		validateContentRequestTypeEClass.getESuperTypes().add(this.getContentManagementServiceRequestType());
		validateContentResponseTypeEClass.getESuperTypes().add(this.getContentManagementServiceResponseType());

		// Initialize classes and features; add operations and parameters
		initEClass(catalogContentRequestTypeEClass, CatalogContentRequestType.class, "CatalogContentRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catalogContentResponseTypeEClass, CatalogContentResponseType.class, "CatalogContentResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogContentResponseType_CatalogedContent(), theRimPackage.getRegistryObjectListType(), null, "catalogedContent", null, 1, 1, CatalogContentResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentManagementServiceRequestTypeEClass, ContentManagementServiceRequestType.class, "ContentManagementServiceRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentManagementServiceRequestType_OriginalContent(), theRimPackage.getRegistryObjectListType(), null, "originalContent", null, 1, 1, ContentManagementServiceRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentManagementServiceRequestType_InvocationControlFile(), theRimPackage.getExtrinsicObjectType(), null, "invocationControlFile", null, 0, -1, ContentManagementServiceRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentManagementServiceResponseTypeEClass, ContentManagementServiceResponseType.class, "ContentManagementServiceResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CatalogContentRequest(), this.getCatalogContentRequestType(), null, "catalogContentRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CatalogContentResponse(), this.getCatalogContentResponseType(), null, "catalogContentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidateContentRequest(), this.getValidateContentRequestType(), null, "validateContentRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidateContentResponse(), this.getValidateContentResponseType(), null, "validateContentResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(validateContentRequestTypeEClass, ValidateContentRequestType.class, "ValidateContentRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validateContentResponseTypeEClass, ValidateContentResponseType.class, "ValidateContentResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (catalogContentRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CatalogContentRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (catalogContentResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CatalogContentResponse_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCatalogContentResponseType_CatalogedContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CatalogedContent",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (contentManagementServiceRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ContentManagementServiceRequestType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContentManagementServiceRequestType_OriginalContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalContent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContentManagementServiceRequestType_InvocationControlFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvocationControlFile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (contentManagementServiceResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ContentManagementServiceResponseType",
			 "kind", "elementOnly"
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
		  (getDocumentRoot_CatalogContentRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CatalogContentRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_CatalogContentResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CatalogContentResponse",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ValidateContentRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidateContentRequest",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ValidateContentResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidateContentResponse",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (validateContentRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ValidateContentRequest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (validateContentResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ValidateContentResponse_._type",
			 "kind", "elementOnly"
		   });
	}

} //CMSPackageImpl
