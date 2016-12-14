/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;

import org.openhealthtools.ihe.xds.metadata.MetadataPackage;

import org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType;
import org.openhealthtools.ihe.xds.response.response.DocumentRoot;
import org.openhealthtools.ihe.xds.response.response.FolderResponseType;
import org.openhealthtools.ihe.xds.response.response.ModelFactory;
import org.openhealthtools.ihe.xds.response.response.ModelPackage;
import org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType;
import org.openhealthtools.ihe.xds.response.response.XDSErrorCode;
import org.openhealthtools.ihe.xds.response.response.XDSErrorListType;
import org.openhealthtools.ihe.xds.response.response.XDSErrorType;
import org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType;
import org.openhealthtools.ihe.xds.response.response.XDSResponseType;
import org.openhealthtools.ihe.xds.response.response.XDSStatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEntryResponseTypeEClass = null;

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
	private EClass folderResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submissionSetResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xdsErrorListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xdsErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xdsQueryResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xdsResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xdsErrorCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xdsStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xdsErrorCodeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xdsStatusTypeObjectEDataType = null;

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
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MetadataPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentEntryResponseType() {
		return documentEntryResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentEntryResponseType_DocumentEntry() {
		return (EReference)documentEntryResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEntryResponseType_HomeCommunityId() {
		return (EAttribute)documentEntryResponseTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_XDSError() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XDSErrorList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XDSQueryResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XDSResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderResponseType() {
		return folderResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolderResponseType_Reference() {
		return (EReference)folderResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolderResponseType_HomeCommunityId() {
		return (EAttribute)folderResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmissionSetResponseType() {
		return submissionSetResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmissionSetResponseType_Reference() {
		return (EReference)submissionSetResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmissionSetResponseType_HomeCommunityId() {
		return (EAttribute)submissionSetResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDSErrorListType() {
		return xdsErrorListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDSErrorListType_Error() {
		return (EReference)xdsErrorListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSErrorListType_HighestSeverity() {
		return (EAttribute)xdsErrorListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDSErrorType() {
		return xdsErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSErrorType_Value() {
		return (EAttribute)xdsErrorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSErrorType_CodeContext() {
		return (EAttribute)xdsErrorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSErrorType_ErrorCode() {
		return (EAttribute)xdsErrorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSErrorType_Location() {
		return (EAttribute)xdsErrorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSErrorType_Severity() {
		return (EAttribute)xdsErrorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDSQueryResponseType() {
		return xdsQueryResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSQueryResponseType_References() {
		return (EAttribute)xdsQueryResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDSQueryResponseType_DocumentEntryResponses() {
		return (EReference)xdsQueryResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDSQueryResponseType_FolderResponses() {
		return (EReference)xdsQueryResponseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDSQueryResponseType_SubmissionSetResponses() {
		return (EReference)xdsQueryResponseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSQueryResponseType_Associations() {
		return (EAttribute)xdsQueryResponseTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDSResponseType() {
		return xdsResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDSResponseType_ErrorList() {
		return (EReference)xdsResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDSResponseType_Status() {
		return (EAttribute)xdsResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXDSErrorCode() {
		return xdsErrorCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXDSStatusType() {
		return xdsStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXDSErrorCodeObject() {
		return xdsErrorCodeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXDSStatusTypeObject() {
		return xdsStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		documentEntryResponseTypeEClass = createEClass(DOCUMENT_ENTRY_RESPONSE_TYPE);
		createEReference(documentEntryResponseTypeEClass, DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY);
		createEAttribute(documentEntryResponseTypeEClass, DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XDS_ERROR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XDS_ERROR_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XDS_QUERY_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XDS_RESPONSE);

		folderResponseTypeEClass = createEClass(FOLDER_RESPONSE_TYPE);
		createEReference(folderResponseTypeEClass, FOLDER_RESPONSE_TYPE__REFERENCE);
		createEAttribute(folderResponseTypeEClass, FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID);

		submissionSetResponseTypeEClass = createEClass(SUBMISSION_SET_RESPONSE_TYPE);
		createEReference(submissionSetResponseTypeEClass, SUBMISSION_SET_RESPONSE_TYPE__REFERENCE);
		createEAttribute(submissionSetResponseTypeEClass, SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID);

		xdsErrorListTypeEClass = createEClass(XDS_ERROR_LIST_TYPE);
		createEReference(xdsErrorListTypeEClass, XDS_ERROR_LIST_TYPE__ERROR);
		createEAttribute(xdsErrorListTypeEClass, XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY);

		xdsErrorTypeEClass = createEClass(XDS_ERROR_TYPE);
		createEAttribute(xdsErrorTypeEClass, XDS_ERROR_TYPE__VALUE);
		createEAttribute(xdsErrorTypeEClass, XDS_ERROR_TYPE__CODE_CONTEXT);
		createEAttribute(xdsErrorTypeEClass, XDS_ERROR_TYPE__ERROR_CODE);
		createEAttribute(xdsErrorTypeEClass, XDS_ERROR_TYPE__LOCATION);
		createEAttribute(xdsErrorTypeEClass, XDS_ERROR_TYPE__SEVERITY);

		xdsQueryResponseTypeEClass = createEClass(XDS_QUERY_RESPONSE_TYPE);
		createEAttribute(xdsQueryResponseTypeEClass, XDS_QUERY_RESPONSE_TYPE__REFERENCES);
		createEReference(xdsQueryResponseTypeEClass, XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES);
		createEReference(xdsQueryResponseTypeEClass, XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES);
		createEReference(xdsQueryResponseTypeEClass, XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES);
		createEAttribute(xdsQueryResponseTypeEClass, XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS);

		xdsResponseTypeEClass = createEClass(XDS_RESPONSE_TYPE);
		createEReference(xdsResponseTypeEClass, XDS_RESPONSE_TYPE__ERROR_LIST);
		createEAttribute(xdsResponseTypeEClass, XDS_RESPONSE_TYPE__STATUS);

		// Create enums
		xdsErrorCodeEEnum = createEEnum(XDS_ERROR_CODE);
		xdsStatusTypeEEnum = createEEnum(XDS_STATUS_TYPE);

		// Create data types
		xdsErrorCodeObjectEDataType = createEDataType(XDS_ERROR_CODE_OBJECT);
		xdsStatusTypeObjectEDataType = createEDataType(XDS_STATUS_TYPE_OBJECT);
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
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		xdsQueryResponseTypeEClass.getESuperTypes().add(this.getXDSResponseType());

		// Initialize classes and features; add operations and parameters
		initEClass(documentEntryResponseTypeEClass, DocumentEntryResponseType.class, "DocumentEntryResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentEntryResponseType_DocumentEntry(), theMetadataPackage.getDocumentEntryType(), null, "documentEntry", null, 1, 1, DocumentEntryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEntryResponseType_HomeCommunityId(), theXMLTypePackage.getString(), "homeCommunityId", null, 0, 1, DocumentEntryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XDSError(), this.getXDSErrorType(), null, "xDSError", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XDSErrorList(), this.getXDSErrorListType(), null, "xDSErrorList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XDSQueryResponse(), this.getXDSQueryResponseType(), null, "xDSQueryResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XDSResponse(), this.getXDSResponseType(), null, "xDSResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(folderResponseTypeEClass, FolderResponseType.class, "FolderResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolderResponseType_Reference(), theMetadataPackage.getFolderType(), null, "reference", null, 1, 1, FolderResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolderResponseType_HomeCommunityId(), theXMLTypePackage.getString(), "homeCommunityId", null, 0, 1, FolderResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submissionSetResponseTypeEClass, SubmissionSetResponseType.class, "SubmissionSetResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmissionSetResponseType_Reference(), theMetadataPackage.getSubmissionSetType(), null, "reference", null, 1, 1, SubmissionSetResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmissionSetResponseType_HomeCommunityId(), theXMLTypePackage.getString(), "homeCommunityId", null, 0, 1, SubmissionSetResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xdsErrorListTypeEClass, XDSErrorListType.class, "XDSErrorListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXDSErrorListType_Error(), this.getXDSErrorType(), null, "error", null, 0, -1, XDSErrorListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXDSErrorListType_HighestSeverity(), this.getXDSStatusType(), "highestSeverity", null, 0, 1, XDSErrorListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xdsErrorTypeEClass, XDSErrorType.class, "XDSErrorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXDSErrorType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, XDSErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXDSErrorType_CodeContext(), theXMLTypePackage.getString(), "codeContext", null, 1, 1, XDSErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXDSErrorType_ErrorCode(), this.getXDSErrorCode(), "errorCode", null, 1, 1, XDSErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXDSErrorType_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, XDSErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXDSErrorType_Severity(), this.getXDSStatusType(), "severity", null, 1, 1, XDSErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xdsQueryResponseTypeEClass, XDSQueryResponseType.class, "XDSQueryResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXDSQueryResponseType_References(), theXMLTypePackage.getAnySimpleType(), "references", null, 0, -1, XDSQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXDSQueryResponseType_DocumentEntryResponses(), this.getDocumentEntryResponseType(), null, "documentEntryResponses", null, 0, -1, XDSQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXDSQueryResponseType_FolderResponses(), this.getFolderResponseType(), null, "folderResponses", null, 0, -1, XDSQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXDSQueryResponseType_SubmissionSetResponses(), this.getSubmissionSetResponseType(), null, "submissionSetResponses", null, 0, -1, XDSQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXDSQueryResponseType_Associations(), theXMLTypePackage.getAnySimpleType(), "associations", null, 0, -1, XDSQueryResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xdsResponseTypeEClass, XDSResponseType.class, "XDSResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXDSResponseType_ErrorList(), this.getXDSErrorListType(), null, "errorList", null, 0, 1, XDSResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXDSResponseType_Status(), this.getXDSStatusType(), "status", null, 1, 1, XDSResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xdsErrorCodeEEnum, XDSErrorCode.class, "XDSErrorCode");
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.UNKNOWNERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_MISSING_DOCUMENT_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_MISSING_DOCUMENT_METADATA_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REGISTRY_NOT_AVAILABLE_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REGISTRY_ERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REPOSITORY_ERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_NON_IDENTICAL_HASH_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_NON_IDENTICAL_SIZE_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REGISTRY_BUSY_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REPOSITORY_BUSY_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REGISTRY_METADATA_ERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REPOSITORY_METADATA_ERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_TOO_MANY_RESULTS_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_EXTRA_METADATA_NOT_SAVED_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_UNKNOWN_PATIENT_ID_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_UNKNOWN_STORED_QUERY_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_STORED_QUERY_MISSING_PARAM_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_STORED_QUERY_PARAM_NUMBER_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_SQL_ERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.DOCUMENT_QUEUED_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_UNKNOWN_COMMUNITY_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_MISSING_HOME_COMMUNITY_ID_LITERAL);
		addEEnumLiteral(xdsErrorCodeEEnum, XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL);

		initEEnum(xdsStatusTypeEEnum, XDSStatusType.class, "XDSStatusType");
		addEEnumLiteral(xdsStatusTypeEEnum, XDSStatusType.SUCCESS_LITERAL);
		addEEnumLiteral(xdsStatusTypeEEnum, XDSStatusType.PARTIAL_SUCCESS_LITERAL);
		addEEnumLiteral(xdsStatusTypeEEnum, XDSStatusType.WARNING_LITERAL);
		addEEnumLiteral(xdsStatusTypeEEnum, XDSStatusType.ERROR_LITERAL);
		addEEnumLiteral(xdsStatusTypeEEnum, XDSStatusType.FAILURE_LITERAL);
		addEEnumLiteral(xdsStatusTypeEEnum, XDSStatusType.UNAVAILABLE_LITERAL);

		// Initialize data types
		initEDataType(xdsErrorCodeObjectEDataType, XDSErrorCode.class, "XDSErrorCodeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xdsStatusTypeObjectEDataType, XDSStatusType.class, "XDSStatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (documentEntryResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DocumentEntryResponseType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDocumentEntryResponseType_DocumentEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "documentEntry"
		   });	
		addAnnotation
		  (getDocumentEntryResponseType_HomeCommunityId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "homeCommunityId"
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
		  (getDocumentRoot_XDSError(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XDSError",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_XDSErrorList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XDSErrorList",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_XDSQueryResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XDSQueryResponse",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_XDSResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XDSResponse",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (folderResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FolderResponseType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFolderResponseType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference"
		   });	
		addAnnotation
		  (getFolderResponseType_HomeCommunityId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "homeCommunityId"
		   });	
		addAnnotation
		  (submissionSetResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SubmissionSetResponseType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubmissionSetResponseType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference"
		   });	
		addAnnotation
		  (getSubmissionSetResponseType_HomeCommunityId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "homeCommunityId"
		   });	
		addAnnotation
		  (xdsErrorCodeEEnum, 
		   source, 
		   new String[] {
			 "name", "XDSErrorCode"
		   });	
		addAnnotation
		  (xdsErrorCodeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "XDSErrorCode:Object",
			 "baseType", "XDSErrorCode"
		   });	
		addAnnotation
		  (xdsErrorListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "XDSErrorListType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getXDSErrorListType_Error(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "error"
		   });	
		addAnnotation
		  (getXDSErrorListType_HighestSeverity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highestSeverity"
		   });	
		addAnnotation
		  (xdsErrorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "XDSErrorType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getXDSErrorType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getXDSErrorType_CodeContext(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "codeContext"
		   });	
		addAnnotation
		  (getXDSErrorType_ErrorCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "errorCode"
		   });	
		addAnnotation
		  (getXDSErrorType_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location"
		   });	
		addAnnotation
		  (getXDSErrorType_Severity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "severity"
		   });	
		addAnnotation
		  (xdsQueryResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "XDSQueryResponseType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getXDSQueryResponseType_References(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "references"
		   });	
		addAnnotation
		  (getXDSQueryResponseType_DocumentEntryResponses(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "documentEntryResponses"
		   });	
		addAnnotation
		  (getXDSQueryResponseType_FolderResponses(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "folderResponses"
		   });	
		addAnnotation
		  (getXDSQueryResponseType_SubmissionSetResponses(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submissionSetResponses"
		   });	
		addAnnotation
		  (getXDSQueryResponseType_Associations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "associations"
		   });	
		addAnnotation
		  (xdsResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "XDSResponseType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getXDSResponseType_ErrorList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "errorList"
		   });	
		addAnnotation
		  (getXDSResponseType_Status(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "status"
		   });	
		addAnnotation
		  (xdsStatusTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "XDSStatusType"
		   });	
		addAnnotation
		  (xdsStatusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "XDSStatusType:Object",
			 "baseType", "XDSStatusType"
		   });
	}

} //ModelPackageImpl
