/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryPackage.java,v 1.1 2006/10/19 20:16:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The schema for OASIS ebXML Registry Services
 * The schema for OASIS ebXML Registry Information Model
 * 
 *    See http://www.w3.org/XML/1998/namespace.html and
 *    http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *     This schema document describes the XML namespace, in a form
 *     suitable for import by other schema documents.  
 * 
 *     Note that local names in this namespace are intended to be defined
 *     only by the World Wide Web Consortium or its subgroups.  The
 *     following names are currently defined in this namespace and should
 *     not be used with conflicting semantics by any Working Group,
 *     specification, or document instance:
 * 
 *     base (as an attribute name): denotes an attribute whose value
 *          provides a URI to be used as the base for interpreting any
 *          relative URIs in the scope of the element on which it
 *          appears; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML Base specification.
 * 
 *     id   (as an attribute name): denotes an attribute whose value
 *          should be interpreted as if declared to be of type ID.
 *          The xml:id specification is not yet a W3C Recommendation,
 *          but this attribute is included here to facilitate experimentation
 *          with the mechanisms it proposes.  Note that it is _not_ included
 *          in the specialAttrs attribute group.
 * 
 *     lang (as an attribute name): denotes an attribute whose value
 *          is a language code for the natural language of the content of
 *          any element; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML specification.
 *   
 *     space (as an attribute name): denotes an attribute whose
 *          value is a keyword indicating what whitespace processing
 *          discipline is intended for the content of the element; its
 *          value is inherited.  This name is reserved by virtue of its
 *          definition in the XML specification.
 * 
 *     Father (in any context at all): denotes Jon Bosak, the chair of 
 *          the original XML Working Group.  This name is reserved by 
 *          the following decision of the W3C XML Plenary and 
 *          XML Coordination groups:
 * 
 *              In appreciation for his vision, leadership and dedication
 *              the W3C XML Plenary on this 10th day of February, 2000
 *              reserves for Jon Bosak in perpetuity the XML name
 *              xml:Father
 *   
 * This schema defines attributes and an attribute group
 *         suitable for use by
 *         schemas wishing to allow xml:base, xml:lang, xml:space or xml:id
 *         attributes on elements they define.
 * 
 *         To enable this, such a schema must import this schema
 *         for the XML namespace, e.g. as follows:
 *         &lt;schema . . .&gt;
 *          . . .
 *          &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                     schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 * 
 *         Subsequently, qualified reference to any of the attributes
 *         or the group defined below will have the desired effect, e.g.
 * 
 *         &lt;type . . .&gt;
 *          . . .
 *          &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *  
 *          will define a type which will schema-validate an instance
 *          element with any of those attributes
 * In keeping with the XML Schema WG's standard versioning
 *    policy, this schema document will persist at
 *    http://www.w3.org/2005/08/xml.xsd.
 *    At the date of issue it can also be found at
 *    http://www.w3.org/2001/xml.xsd.
 *    The schema document at that URI may however change in the future,
 *    in order to remain compatible with the latest version of XML Schema
 *    itself, or with the XML namespace itself.  In other words, if the XML
 *    Schema or XML namespaces change, the version of this document at
 *    http://www.w3.org/2001/xml.xsd will change
 *    accordingly; the version at
 *    http://www.w3.org/2005/08/xml.xsd will not change.
 *   
 * <!-- end-model-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryFactory
 * @model kind="package"
 * @generated
 */
public interface RegistryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegistryPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Registry Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ERROR = 3;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ERROR_LIST = 4;

	/**
	 * The feature id for the '<em><b>Registry Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Registry Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_RESPONSE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorListTypeImpl <em>Error List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryErrorListType()
	 * @generated
	 */
	int REGISTRY_ERROR_LIST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Registry Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR = 0;

	/**
	 * The feature id for the '<em><b>Highest Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY = 1;

	/**
	 * The number of structural features of the '<em>Error List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryErrorType()
	 * @generated
	 */
	int REGISTRY_ERROR_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_TYPE__CODE_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_TYPE__ERROR_CODE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_TYPE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_TYPE__SEVERITY = 4;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ERROR_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl <em>Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryRequestType()
	 * @generated
	 */
	int REGISTRY_REQUEST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_REQUEST_TYPE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_REQUEST_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_REQUEST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl <em>Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryResponseType()
	 * @generated
	 */
	int REGISTRY_RESPONSE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Response Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST = 1;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE__REQUEST_ID = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryError <em>Registry Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Error</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryError()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryError();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryErrorList <em>Registry Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Error List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryErrorList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryErrorList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryRequest <em>Registry Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryResponse <em>Registry Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot#getRegistryResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryResponse();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType <em>Error List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType
	 * @generated
	 */
	EClass getRegistryErrorListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType#getRegistryError <em>Registry Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Error</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType#getRegistryError()
	 * @see #getRegistryErrorListType()
	 * @generated
	 */
	EReference getRegistryErrorListType_RegistryError();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highest Severity</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType#getHighestSeverity()
	 * @see #getRegistryErrorListType()
	 * @generated
	 */
	EAttribute getRegistryErrorListType_HighestSeverity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType
	 * @generated
	 */
	EClass getRegistryErrorType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getValue()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getCodeContext <em>Code Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Context</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getCodeContext()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_CodeContext();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getErrorCode()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getLocation()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType#getSeverity()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_Severity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType
	 * @generated
	 */
	EClass getRegistryRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getRequestSlotList <em>Request Slot List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Slot List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getRequestSlotList()
	 * @see #getRegistryRequestType()
	 * @generated
	 */
	EReference getRegistryRequestType_RequestSlotList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getComment()
	 * @see #getRegistryRequestType()
	 * @generated
	 */
	EAttribute getRegistryRequestType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType#getId()
	 * @see #getRegistryRequestType()
	 * @generated
	 */
	EAttribute getRegistryRequestType_Id();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType
	 * @generated
	 */
	EClass getRegistryResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getResponseSlotList <em>Response Slot List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Slot List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getResponseSlotList()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EReference getRegistryResponseType_ResponseSlotList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRegistryErrorList <em>Registry Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Error List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRegistryErrorList()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EReference getRegistryResponseType_RegistryErrorList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getRequestId()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EAttribute getRegistryResponseType_RequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType#getStatus()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EAttribute getRegistryResponseType_Status();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegistryFactory getRegistryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Registry Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_ERROR = eINSTANCE.getDocumentRoot_RegistryError();

		/**
		 * The meta object literal for the '<em><b>Registry Error List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_ERROR_LIST = eINSTANCE.getDocumentRoot_RegistryErrorList();

		/**
		 * The meta object literal for the '<em><b>Registry Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_REQUEST = eINSTANCE.getDocumentRoot_RegistryRequest();

		/**
		 * The meta object literal for the '<em><b>Registry Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_RESPONSE = eINSTANCE.getDocumentRoot_RegistryResponse();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorListTypeImpl <em>Error List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryErrorListType()
		 * @generated
		 */
		EClass REGISTRY_ERROR_LIST_TYPE = eINSTANCE.getRegistryErrorListType();

		/**
		 * The meta object literal for the '<em><b>Registry Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ERROR_LIST_TYPE__REGISTRY_ERROR = eINSTANCE.getRegistryErrorListType_RegistryError();

		/**
		 * The meta object literal for the '<em><b>Highest Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ERROR_LIST_TYPE__HIGHEST_SEVERITY = eINSTANCE.getRegistryErrorListType_HighestSeverity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryErrorTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryErrorType()
		 * @generated
		 */
		EClass REGISTRY_ERROR_TYPE = eINSTANCE.getRegistryErrorType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ERROR_TYPE__VALUE = eINSTANCE.getRegistryErrorType_Value();

		/**
		 * The meta object literal for the '<em><b>Code Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ERROR_TYPE__CODE_CONTEXT = eINSTANCE.getRegistryErrorType_CodeContext();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ERROR_TYPE__ERROR_CODE = eINSTANCE.getRegistryErrorType_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ERROR_TYPE__LOCATION = eINSTANCE.getRegistryErrorType_Location();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ERROR_TYPE__SEVERITY = eINSTANCE.getRegistryErrorType_Severity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl <em>Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryRequestType()
		 * @generated
		 */
		EClass REGISTRY_REQUEST_TYPE = eINSTANCE.getRegistryRequestType();

		/**
		 * The meta object literal for the '<em><b>Request Slot List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST = eINSTANCE.getRegistryRequestType_RequestSlotList();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_REQUEST_TYPE__COMMENT = eINSTANCE.getRegistryRequestType_Comment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_REQUEST_TYPE__ID = eINSTANCE.getRegistryRequestType_Id();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl <em>Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryPackageImpl#getRegistryResponseType()
		 * @generated
		 */
		EClass REGISTRY_RESPONSE_TYPE = eINSTANCE.getRegistryResponseType();

		/**
		 * The meta object literal for the '<em><b>Response Slot List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST = eINSTANCE.getRegistryResponseType_ResponseSlotList();

		/**
		 * The meta object literal for the '<em><b>Registry Error List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST = eINSTANCE.getRegistryResponseType_RegistryErrorList();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_RESPONSE_TYPE__REQUEST_ID = eINSTANCE.getRegistryResponseType_RequestId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_RESPONSE_TYPE__STATUS = eINSTANCE.getRegistryResponseType_Status();

	}

} //RegistryPackage
