/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see org.openhealthtools.ihe.xds.response.response.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "response";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org:openhealthtools:ihe:xds:response";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "response";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentEntryResponseTypeImpl <em>Document Entry Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.DocumentEntryResponseTypeImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getDocumentEntryResponseType()
	 * @generated
	 */
	int DOCUMENT_ENTRY_RESPONSE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Document Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Home Community Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID = 1;

	/**
	 * The number of structural features of the '<em>Document Entry Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENTRY_RESPONSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>XDS Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XDS_ERROR = 3;

	/**
	 * The feature id for the '<em><b>XDS Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XDS_ERROR_LIST = 4;

	/**
	 * The feature id for the '<em><b>XDS Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XDS_QUERY_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>XDS Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XDS_RESPONSE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.FolderResponseTypeImpl <em>Folder Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.FolderResponseTypeImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getFolderResponseType()
	 * @generated
	 */
	int FOLDER_RESPONSE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_RESPONSE_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Home Community Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID = 1;

	/**
	 * The number of structural features of the '<em>Folder Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_RESPONSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.SubmissionSetResponseTypeImpl <em>Submission Set Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.SubmissionSetResponseTypeImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getSubmissionSetResponseType()
	 * @generated
	 */
	int SUBMISSION_SET_RESPONSE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_SET_RESPONSE_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Home Community Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID = 1;

	/**
	 * The number of structural features of the '<em>Submission Set Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_SET_RESPONSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorListTypeImpl <em>XDS Error List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSErrorListTypeImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorListType()
	 * @generated
	 */
	int XDS_ERROR_LIST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_LIST_TYPE__ERROR = 0;

	/**
	 * The feature id for the '<em><b>Highest Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY = 1;

	/**
	 * The number of structural features of the '<em>XDS Error List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl <em>XDS Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorType()
	 * @generated
	 */
	int XDS_ERROR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_TYPE__CODE_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_TYPE__ERROR_CODE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_TYPE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_TYPE__SEVERITY = 4;

	/**
	 * The number of structural features of the '<em>XDS Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_ERROR_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSResponseTypeImpl <em>XDS Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSResponseTypeImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSResponseType()
	 * @generated
	 */
	int XDS_RESPONSE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_RESPONSE_TYPE__ERROR_LIST = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_RESPONSE_TYPE__STATUS = 1;

	/**
	 * The number of structural features of the '<em>XDS Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_RESPONSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl <em>XDS Query Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSQueryResponseType()
	 * @generated
	 */
	int XDS_QUERY_RESPONSE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE__ERROR_LIST = XDS_RESPONSE_TYPE__ERROR_LIST;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE__STATUS = XDS_RESPONSE_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE__REFERENCES = XDS_RESPONSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Entry Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES = XDS_RESPONSE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Folder Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES = XDS_RESPONSE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Submission Set Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES = XDS_RESPONSE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS = XDS_RESPONSE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XDS Query Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDS_QUERY_RESPONSE_TYPE_FEATURE_COUNT = XDS_RESPONSE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorCode <em>XDS Error Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorCode()
	 * @generated
	 */
	int XDS_ERROR_CODE = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.xds.response.response.XDSStatusType <em>XDS Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSStatusType()
	 * @generated
	 */
	int XDS_STATUS_TYPE = 9;

	/**
	 * The meta object id for the '<em>XDS Error Code Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorCodeObject()
	 * @generated
	 */
	int XDS_ERROR_CODE_OBJECT = 10;

	/**
	 * The meta object id for the '<em>XDS Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSStatusTypeObject()
	 * @generated
	 */
	int XDS_STATUS_TYPE_OBJECT = 11;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType <em>Document Entry Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Entry Response Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType
	 * @generated
	 */
	EClass getDocumentEntryResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getDocumentEntry <em>Document Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Entry</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getDocumentEntry()
	 * @see #getDocumentEntryResponseType()
	 * @generated
	 */
	EReference getDocumentEntryResponseType_DocumentEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getHomeCommunityId <em>Home Community Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Community Id</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getHomeCommunityId()
	 * @see #getDocumentEntryResponseType()
	 * @generated
	 */
	EAttribute getDocumentEntryResponseType_HomeCommunityId();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSError <em>XDS Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XDS Error</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSError()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XDSError();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSErrorList <em>XDS Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XDS Error List</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSErrorList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XDSErrorList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSQueryResponse <em>XDS Query Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XDS Query Response</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSQueryResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XDSQueryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSResponse <em>XDS Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XDS Response</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.DocumentRoot#getXDSResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XDSResponse();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.FolderResponseType <em>Folder Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Response Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.FolderResponseType
	 * @generated
	 */
	EClass getFolderResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.FolderResponseType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.FolderResponseType#getReference()
	 * @see #getFolderResponseType()
	 * @generated
	 */
	EReference getFolderResponseType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.FolderResponseType#getHomeCommunityId <em>Home Community Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Community Id</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.FolderResponseType#getHomeCommunityId()
	 * @see #getFolderResponseType()
	 * @generated
	 */
	EAttribute getFolderResponseType_HomeCommunityId();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType <em>Submission Set Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submission Set Response Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType
	 * @generated
	 */
	EClass getSubmissionSetResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType#getReference()
	 * @see #getSubmissionSetResponseType()
	 * @generated
	 */
	EReference getSubmissionSetResponseType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType#getHomeCommunityId <em>Home Community Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Community Id</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType#getHomeCommunityId()
	 * @see #getSubmissionSetResponseType()
	 * @generated
	 */
	EAttribute getSubmissionSetResponseType_HomeCommunityId();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType <em>XDS Error List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDS Error List Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorListType
	 * @generated
	 */
	EClass getXDSErrorListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getError()
	 * @see #getXDSErrorListType()
	 * @generated
	 */
	EReference getXDSErrorListType_Error();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getHighestSeverity <em>Highest Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highest Severity</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getHighestSeverity()
	 * @see #getXDSErrorListType()
	 * @generated
	 */
	EAttribute getXDSErrorListType_HighestSeverity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType <em>XDS Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDS Error Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorType
	 * @generated
	 */
	EClass getXDSErrorType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorType#getValue()
	 * @see #getXDSErrorType()
	 * @generated
	 */
	EAttribute getXDSErrorType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getCodeContext <em>Code Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Context</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorType#getCodeContext()
	 * @see #getXDSErrorType()
	 * @generated
	 */
	EAttribute getXDSErrorType_CodeContext();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorType#getErrorCode()
	 * @see #getXDSErrorType()
	 * @generated
	 */
	EAttribute getXDSErrorType_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorType#getLocation()
	 * @see #getXDSErrorType()
	 * @generated
	 */
	EAttribute getXDSErrorType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorType#getSeverity()
	 * @see #getXDSErrorType()
	 * @generated
	 */
	EAttribute getXDSErrorType_Severity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType <em>XDS Query Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDS Query Response Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType
	 * @generated
	 */
	EClass getXDSQueryResponseType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getReferences()
	 * @see #getXDSQueryResponseType()
	 * @generated
	 */
	EAttribute getXDSQueryResponseType_References();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getDocumentEntryResponses <em>Document Entry Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Entry Responses</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getDocumentEntryResponses()
	 * @see #getXDSQueryResponseType()
	 * @generated
	 */
	EReference getXDSQueryResponseType_DocumentEntryResponses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getFolderResponses <em>Folder Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folder Responses</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getFolderResponses()
	 * @see #getXDSQueryResponseType()
	 * @generated
	 */
	EReference getXDSQueryResponseType_FolderResponses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getSubmissionSetResponses <em>Submission Set Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submission Set Responses</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getSubmissionSetResponses()
	 * @see #getXDSQueryResponseType()
	 * @generated
	 */
	EReference getXDSQueryResponseType_SubmissionSetResponses();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Associations</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getAssociations()
	 * @see #getXDSQueryResponseType()
	 * @generated
	 */
	EAttribute getXDSQueryResponseType_Associations();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType <em>XDS Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDS Response Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSResponseType
	 * @generated
	 */
	EClass getXDSResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error List</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSResponseType#getErrorList()
	 * @see #getXDSResponseType()
	 * @generated
	 */
	EReference getXDSResponseType_ErrorList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSResponseType#getStatus()
	 * @see #getXDSResponseType()
	 * @generated
	 */
	EAttribute getXDSResponseType_Status();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorCode <em>XDS Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XDS Error Code</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
	 * @generated
	 */
	EEnum getXDSErrorCode();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.xds.response.response.XDSStatusType <em>XDS Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XDS Status Type</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @generated
	 */
	EEnum getXDSStatusType();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorCode <em>XDS Error Code Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XDS Error Code Object</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
	 * @model instanceClass="org.openhealthtools.ihe.xds.response.response.XDSErrorCode"
	 *        extendedMetaData="name='XDSErrorCode:Object' baseType='XDSErrorCode'"
	 * @generated
	 */
	EDataType getXDSErrorCodeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.xds.response.response.XDSStatusType <em>XDS Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XDS Status Type Object</em>'.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @model instanceClass="org.openhealthtools.ihe.xds.response.response.XDSStatusType"
	 *        extendedMetaData="name='XDSStatusType:Object' baseType='XDSStatusType'"
	 * @generated
	 */
	EDataType getXDSStatusTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentEntryResponseTypeImpl <em>Document Entry Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.DocumentEntryResponseTypeImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getDocumentEntryResponseType()
		 * @generated
		 */
		EClass DOCUMENT_ENTRY_RESPONSE_TYPE = eINSTANCE.getDocumentEntryResponseType();

		/**
		 * The meta object literal for the '<em><b>Document Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY = eINSTANCE.getDocumentEntryResponseType_DocumentEntry();

		/**
		 * The meta object literal for the '<em><b>Home Community Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID = eINSTANCE.getDocumentEntryResponseType_HomeCommunityId();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>XDS Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XDS_ERROR = eINSTANCE.getDocumentRoot_XDSError();

		/**
		 * The meta object literal for the '<em><b>XDS Error List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XDS_ERROR_LIST = eINSTANCE.getDocumentRoot_XDSErrorList();

		/**
		 * The meta object literal for the '<em><b>XDS Query Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XDS_QUERY_RESPONSE = eINSTANCE.getDocumentRoot_XDSQueryResponse();

		/**
		 * The meta object literal for the '<em><b>XDS Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XDS_RESPONSE = eINSTANCE.getDocumentRoot_XDSResponse();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.FolderResponseTypeImpl <em>Folder Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.FolderResponseTypeImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getFolderResponseType()
		 * @generated
		 */
		EClass FOLDER_RESPONSE_TYPE = eINSTANCE.getFolderResponseType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_RESPONSE_TYPE__REFERENCE = eINSTANCE.getFolderResponseType_Reference();

		/**
		 * The meta object literal for the '<em><b>Home Community Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID = eINSTANCE.getFolderResponseType_HomeCommunityId();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.SubmissionSetResponseTypeImpl <em>Submission Set Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.SubmissionSetResponseTypeImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getSubmissionSetResponseType()
		 * @generated
		 */
		EClass SUBMISSION_SET_RESPONSE_TYPE = eINSTANCE.getSubmissionSetResponseType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMISSION_SET_RESPONSE_TYPE__REFERENCE = eINSTANCE.getSubmissionSetResponseType_Reference();

		/**
		 * The meta object literal for the '<em><b>Home Community Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID = eINSTANCE.getSubmissionSetResponseType_HomeCommunityId();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorListTypeImpl <em>XDS Error List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSErrorListTypeImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorListType()
		 * @generated
		 */
		EClass XDS_ERROR_LIST_TYPE = eINSTANCE.getXDSErrorListType();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDS_ERROR_LIST_TYPE__ERROR = eINSTANCE.getXDSErrorListType_Error();

		/**
		 * The meta object literal for the '<em><b>Highest Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_ERROR_LIST_TYPE__HIGHEST_SEVERITY = eINSTANCE.getXDSErrorListType_HighestSeverity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl <em>XDS Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorType()
		 * @generated
		 */
		EClass XDS_ERROR_TYPE = eINSTANCE.getXDSErrorType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_ERROR_TYPE__VALUE = eINSTANCE.getXDSErrorType_Value();

		/**
		 * The meta object literal for the '<em><b>Code Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_ERROR_TYPE__CODE_CONTEXT = eINSTANCE.getXDSErrorType_CodeContext();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_ERROR_TYPE__ERROR_CODE = eINSTANCE.getXDSErrorType_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_ERROR_TYPE__LOCATION = eINSTANCE.getXDSErrorType_Location();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_ERROR_TYPE__SEVERITY = eINSTANCE.getXDSErrorType_Severity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl <em>XDS Query Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSQueryResponseType()
		 * @generated
		 */
		EClass XDS_QUERY_RESPONSE_TYPE = eINSTANCE.getXDSQueryResponseType();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_QUERY_RESPONSE_TYPE__REFERENCES = eINSTANCE.getXDSQueryResponseType_References();

		/**
		 * The meta object literal for the '<em><b>Document Entry Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES = eINSTANCE.getXDSQueryResponseType_DocumentEntryResponses();

		/**
		 * The meta object literal for the '<em><b>Folder Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES = eINSTANCE.getXDSQueryResponseType_FolderResponses();

		/**
		 * The meta object literal for the '<em><b>Submission Set Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES = eINSTANCE.getXDSQueryResponseType_SubmissionSetResponses();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS = eINSTANCE.getXDSQueryResponseType_Associations();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.impl.XDSResponseTypeImpl <em>XDS Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.impl.XDSResponseTypeImpl
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSResponseType()
		 * @generated
		 */
		EClass XDS_RESPONSE_TYPE = eINSTANCE.getXDSResponseType();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDS_RESPONSE_TYPE__ERROR_LIST = eINSTANCE.getXDSResponseType_ErrorList();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDS_RESPONSE_TYPE__STATUS = eINSTANCE.getXDSResponseType_Status();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorCode <em>XDS Error Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorCode()
		 * @generated
		 */
		EEnum XDS_ERROR_CODE = eINSTANCE.getXDSErrorCode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.xds.response.response.XDSStatusType <em>XDS Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSStatusType()
		 * @generated
		 */
		EEnum XDS_STATUS_TYPE = eINSTANCE.getXDSStatusType();

		/**
		 * The meta object literal for the '<em>XDS Error Code Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSErrorCodeObject()
		 * @generated
		 */
		EDataType XDS_ERROR_CODE_OBJECT = eINSTANCE.getXDSErrorCodeObject();

		/**
		 * The meta object literal for the '<em>XDS Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
		 * @see org.openhealthtools.ihe.xds.response.response.impl.ModelPackageImpl#getXDSStatusTypeObject()
		 * @generated
		 */
		EDataType XDS_STATUS_TYPE_OBJECT = eINSTANCE.getXDSStatusTypeObject();

	}

} //ModelPackage
