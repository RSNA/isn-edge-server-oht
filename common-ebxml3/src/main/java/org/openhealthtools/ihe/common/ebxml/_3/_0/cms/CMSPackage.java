/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMSPackage.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;

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
 * The schema for OASIS ebXML Registry Services
 * <!-- end-model-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSFactory
 * @model kind="package"
 * @generated
 */
public interface CMSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:xsd:cms:3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMSPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceRequestTypeImpl <em>Content Management Service Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getContentManagementServiceRequestType()
	 * @generated
	 */
	int CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Original Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invocation Control File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Management Service Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentRequestTypeImpl <em>Catalog Content Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getCatalogContentRequestType()
	 * @generated
	 */
	int CATALOG_CONTENT_REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_REQUEST_TYPE__REQUEST_SLOT_LIST = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_REQUEST_TYPE__COMMENT = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_REQUEST_TYPE__ID = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Original Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_REQUEST_TYPE__ORIGINAL_CONTENT = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT;

	/**
	 * The feature id for the '<em><b>Invocation Control File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_REQUEST_TYPE__INVOCATION_CONTROL_FILE = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE;

	/**
	 * The number of structural features of the '<em>Catalog Content Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_REQUEST_TYPE_FEATURE_COUNT = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceResponseTypeImpl <em>Content Management Service Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getContentManagementServiceResponseType()
	 * @generated
	 */
	int CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Response Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__RESPONSE_SLOT_LIST = RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__REGISTRY_ERROR_LIST = RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__REQUEST_ID = RegistryPackage.REGISTRY_RESPONSE_TYPE__REQUEST_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__STATUS = RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS;

	/**
	 * The number of structural features of the '<em>Content Management Service Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_RESPONSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentResponseTypeImpl <em>Catalog Content Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getCatalogContentResponseType()
	 * @generated
	 */
	int CATALOG_CONTENT_RESPONSE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Response Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_RESPONSE_TYPE__RESPONSE_SLOT_LIST = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__RESPONSE_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_RESPONSE_TYPE__REGISTRY_ERROR_LIST = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__REGISTRY_ERROR_LIST;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_RESPONSE_TYPE__REQUEST_ID = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__REQUEST_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_RESPONSE_TYPE__STATUS = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Cataloged Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Content Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTENT_RESPONSE_TYPE_FEATURE_COUNT = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>Catalog Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Catalog Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Validate Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Validate Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentRequestTypeImpl <em>Validate Content Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getValidateContentRequestType()
	 * @generated
	 */
	int VALIDATE_CONTENT_REQUEST_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_REQUEST_TYPE__REQUEST_SLOT_LIST = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_REQUEST_TYPE__COMMENT = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_REQUEST_TYPE__ID = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Original Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_REQUEST_TYPE__ORIGINAL_CONTENT = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT;

	/**
	 * The feature id for the '<em><b>Invocation Control File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_REQUEST_TYPE__INVOCATION_CONTROL_FILE = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE;

	/**
	 * The number of structural features of the '<em>Validate Content Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_REQUEST_TYPE_FEATURE_COUNT = CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentResponseTypeImpl <em>Validate Content Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getValidateContentResponseType()
	 * @generated
	 */
	int VALIDATE_CONTENT_RESPONSE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Response Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_RESPONSE_TYPE__RESPONSE_SLOT_LIST = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__RESPONSE_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_RESPONSE_TYPE__REGISTRY_ERROR_LIST = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__REGISTRY_ERROR_LIST;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_RESPONSE_TYPE__REQUEST_ID = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__REQUEST_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_RESPONSE_TYPE__STATUS = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE__STATUS;

	/**
	 * The number of structural features of the '<em>Validate Content Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_CONTENT_RESPONSE_TYPE_FEATURE_COUNT = CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentRequestType <em>Catalog Content Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Content Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentRequestType
	 * @generated
	 */
	EClass getCatalogContentRequestType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType <em>Catalog Content Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Content Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType
	 * @generated
	 */
	EClass getCatalogContentResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType#getCatalogedContent <em>Cataloged Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cataloged Content</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType#getCatalogedContent()
	 * @see #getCatalogContentResponseType()
	 * @generated
	 */
	EReference getCatalogContentResponseType_CatalogedContent();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType <em>Content Management Service Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Management Service Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType
	 * @generated
	 */
	EClass getContentManagementServiceRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType#getOriginalContent <em>Original Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Content</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType#getOriginalContent()
	 * @see #getContentManagementServiceRequestType()
	 * @generated
	 */
	EReference getContentManagementServiceRequestType_OriginalContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType#getInvocationControlFile <em>Invocation Control File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invocation Control File</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType#getInvocationControlFile()
	 * @see #getContentManagementServiceRequestType()
	 * @generated
	 */
	EReference getContentManagementServiceRequestType_InvocationControlFile();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceResponseType <em>Content Management Service Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Management Service Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceResponseType
	 * @generated
	 */
	EClass getContentManagementServiceResponseType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentRequest <em>Catalog Content Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog Content Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CatalogContentRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentResponse <em>Catalog Content Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog Content Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getCatalogContentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CatalogContentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentRequest <em>Validate Content Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Content Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidateContentRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentResponse <em>Validate Content Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Content Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot#getValidateContentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidateContentResponse();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentRequestType <em>Validate Content Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Content Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentRequestType
	 * @generated
	 */
	EClass getValidateContentRequestType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentResponseType <em>Validate Content Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Content Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentResponseType
	 * @generated
	 */
	EClass getValidateContentResponseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CMSFactory getCMSFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentRequestTypeImpl <em>Catalog Content Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getCatalogContentRequestType()
		 * @generated
		 */
		EClass CATALOG_CONTENT_REQUEST_TYPE = eINSTANCE.getCatalogContentRequestType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentResponseTypeImpl <em>Catalog Content Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getCatalogContentResponseType()
		 * @generated
		 */
		EClass CATALOG_CONTENT_RESPONSE_TYPE = eINSTANCE.getCatalogContentResponseType();

		/**
		 * The meta object literal for the '<em><b>Cataloged Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT = eINSTANCE.getCatalogContentResponseType_CatalogedContent();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceRequestTypeImpl <em>Content Management Service Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getContentManagementServiceRequestType()
		 * @generated
		 */
		EClass CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE = eINSTANCE.getContentManagementServiceRequestType();

		/**
		 * The meta object literal for the '<em><b>Original Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT = eINSTANCE.getContentManagementServiceRequestType_OriginalContent();

		/**
		 * The meta object literal for the '<em><b>Invocation Control File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE = eINSTANCE.getContentManagementServiceRequestType_InvocationControlFile();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceResponseTypeImpl <em>Content Management Service Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getContentManagementServiceResponseType()
		 * @generated
		 */
		EClass CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE = eINSTANCE.getContentManagementServiceResponseType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Catalog Content Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST = eINSTANCE.getDocumentRoot_CatalogContentRequest();

		/**
		 * The meta object literal for the '<em><b>Catalog Content Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE = eINSTANCE.getDocumentRoot_CatalogContentResponse();

		/**
		 * The meta object literal for the '<em><b>Validate Content Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST = eINSTANCE.getDocumentRoot_ValidateContentRequest();

		/**
		 * The meta object literal for the '<em><b>Validate Content Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE = eINSTANCE.getDocumentRoot_ValidateContentResponse();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentRequestTypeImpl <em>Validate Content Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getValidateContentRequestType()
		 * @generated
		 */
		EClass VALIDATE_CONTENT_REQUEST_TYPE = eINSTANCE.getValidateContentRequestType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentResponseTypeImpl <em>Validate Content Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ValidateContentResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSPackageImpl#getValidateContentResponseType()
		 * @generated
		 */
		EClass VALIDATE_CONTENT_RESPONSE_TYPE = eINSTANCE.getValidateContentResponseType();

	}

} //CMSPackage
