/**
 * <copyright>
 * </copyright>
 *
 * $Id: LCMPackage.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;

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
 * The schema for OASIS ebXML Registry Services
 * <!-- end-model-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMFactory
 * @model kind="package"
 * @generated
 */
public interface LCMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lcm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LCMPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.AcceptObjectsRequestTypeImpl <em>Accept Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.AcceptObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getAcceptObjectsRequestType()
	 * @generated
	 */
	int ACCEPT_OBJECTS_REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OBJECTS_REQUEST_TYPE__CORRELATION_ID = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.ApproveObjectsRequestTypeImpl <em>Approve Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.ApproveObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getApproveObjectsRequestType()
	 * @generated
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Approve Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DeprecateObjectsRequestTypeImpl <em>Deprecate Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DeprecateObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getDeprecateObjectsRequestType()
	 * @generated
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deprecate Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Accept Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Approve Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Deprecate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Relocate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Remove Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Submit Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Undeprecate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Update Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST = 10;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl <em>Relocate Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getRelocateObjectsRequestType()
	 * @generated
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner At Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner At Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relocate Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RemoveObjectsRequestTypeImpl <em>Remove Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RemoveObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getRemoveObjectsRequestType()
	 * @generated
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deletion Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remove Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.SubmitObjectsRequestTypeImpl <em>Submit Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.SubmitObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getSubmitObjectsRequestType()
	 * @generated
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Submit Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UndeprecateObjectsRequestTypeImpl <em>Undeprecate Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UndeprecateObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getUndeprecateObjectsRequestType()
	 * @generated
	 */
	int UNDEPRECATE_OBJECTS_REQUEST_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEPRECATE_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEPRECATE_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEPRECATE_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Undeprecate Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEPRECATE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UpdateObjectsRequestTypeImpl <em>Update Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UpdateObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getUpdateObjectsRequestType()
	 * @generated
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType <em>Accept Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType
	 * @generated
	 */
	EClass getAcceptObjectsRequestType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType#getCorrelationId <em>Correlation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Id</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType#getCorrelationId()
	 * @see #getAcceptObjectsRequestType()
	 * @generated
	 */
	EAttribute getAcceptObjectsRequestType_CorrelationId();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType <em>Approve Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approve Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType
	 * @generated
	 */
	EClass getApproveObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getAdhocQuery()
	 * @see #getApproveObjectsRequestType()
	 * @generated
	 */
	EReference getApproveObjectsRequestType_AdhocQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getObjectRefList()
	 * @see #getApproveObjectsRequestType()
	 * @generated
	 */
	EReference getApproveObjectsRequestType_ObjectRefList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType <em>Deprecate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecate Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType
	 * @generated
	 */
	EClass getDeprecateObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType#getAdhocQuery()
	 * @see #getDeprecateObjectsRequestType()
	 * @generated
	 */
	EReference getDeprecateObjectsRequestType_AdhocQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType#getObjectRefList()
	 * @see #getDeprecateObjectsRequestType()
	 * @generated
	 */
	EReference getDeprecateObjectsRequestType_ObjectRefList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getAcceptObjectsRequest <em>Accept Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accept Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getAcceptObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AcceptObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getApproveObjectsRequest <em>Approve Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approve Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getApproveObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApproveObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecate Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getDeprecateObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeprecateObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRelocateObjectsRequest <em>Relocate Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relocate Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRelocateObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelocateObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRemoveObjectsRequest <em>Remove Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getRemoveObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoveObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getSubmitObjectsRequest <em>Submit Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Submit Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getSubmitObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubmitObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUndeprecateObjectsRequest <em>Undeprecate Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undeprecate Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUndeprecateObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UndeprecateObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUpdateObjectsRequest <em>Update Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot#getUpdateObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateObjectsRequest();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType <em>Relocate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relocate Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType
	 * @generated
	 */
	EClass getRelocateObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getAdhocQuery()
	 * @see #getRelocateObjectsRequestType()
	 * @generated
	 */
	EReference getRelocateObjectsRequestType_AdhocQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getSourceRegistry <em>Source Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Registry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getSourceRegistry()
	 * @see #getRelocateObjectsRequestType()
	 * @generated
	 */
	EReference getRelocateObjectsRequestType_SourceRegistry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getDestinationRegistry <em>Destination Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Registry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getDestinationRegistry()
	 * @see #getRelocateObjectsRequestType()
	 * @generated
	 */
	EReference getRelocateObjectsRequestType_DestinationRegistry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtSource <em>Owner At Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner At Source</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtSource()
	 * @see #getRelocateObjectsRequestType()
	 * @generated
	 */
	EReference getRelocateObjectsRequestType_OwnerAtSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtDestination <em>Owner At Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner At Destination</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtDestination()
	 * @see #getRelocateObjectsRequestType()
	 * @generated
	 */
	EReference getRelocateObjectsRequestType_OwnerAtDestination();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType <em>Remove Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType
	 * @generated
	 */
	EClass getRemoveObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getAdhocQuery()
	 * @see #getRemoveObjectsRequestType()
	 * @generated
	 */
	EReference getRemoveObjectsRequestType_AdhocQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getObjectRefList()
	 * @see #getRemoveObjectsRequestType()
	 * @generated
	 */
	EReference getRemoveObjectsRequestType_ObjectRefList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deletion Scope</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getDeletionScope()
	 * @see #getRemoveObjectsRequestType()
	 * @generated
	 */
	EAttribute getRemoveObjectsRequestType_DeletionScope();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType <em>Submit Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType
	 * @generated
	 */
	EClass getSubmitObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType#getRegistryObjectList()
	 * @see #getSubmitObjectsRequestType()
	 * @generated
	 */
	EReference getSubmitObjectsRequestType_RegistryObjectList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType <em>Undeprecate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undeprecate Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType
	 * @generated
	 */
	EClass getUndeprecateObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType#getAdhocQuery()
	 * @see #getUndeprecateObjectsRequestType()
	 * @generated
	 */
	EReference getUndeprecateObjectsRequestType_AdhocQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType#getObjectRefList()
	 * @see #getUndeprecateObjectsRequestType()
	 * @generated
	 */
	EReference getUndeprecateObjectsRequestType_ObjectRefList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType <em>Update Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType
	 * @generated
	 */
	EClass getUpdateObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType#getRegistryObjectList()
	 * @see #getUpdateObjectsRequestType()
	 * @generated
	 */
	EReference getUpdateObjectsRequestType_RegistryObjectList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LCMFactory getLCMFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.AcceptObjectsRequestTypeImpl <em>Accept Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.AcceptObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getAcceptObjectsRequestType()
		 * @generated
		 */
		EClass ACCEPT_OBJECTS_REQUEST_TYPE = eINSTANCE.getAcceptObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Correlation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_OBJECTS_REQUEST_TYPE__CORRELATION_ID = eINSTANCE.getAcceptObjectsRequestType_CorrelationId();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.ApproveObjectsRequestTypeImpl <em>Approve Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.ApproveObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getApproveObjectsRequestType()
		 * @generated
		 */
		EClass APPROVE_OBJECTS_REQUEST_TYPE = eINSTANCE.getApproveObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = eINSTANCE.getApproveObjectsRequestType_AdhocQuery();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = eINSTANCE.getApproveObjectsRequestType_ObjectRefList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DeprecateObjectsRequestTypeImpl <em>Deprecate Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DeprecateObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getDeprecateObjectsRequestType()
		 * @generated
		 */
		EClass DEPRECATE_OBJECTS_REQUEST_TYPE = eINSTANCE.getDeprecateObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = eINSTANCE.getDeprecateObjectsRequestType_AdhocQuery();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = eINSTANCE.getDeprecateObjectsRequestType_ObjectRefList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Accept Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_AcceptObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Approve Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_ApproveObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Deprecate Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_DeprecateObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Relocate Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_RelocateObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_RemoveObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Submit Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_SubmitObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Undeprecate Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_UndeprecateObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Update Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_UpdateObjectsRequest();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl <em>Relocate Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RelocateObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getRelocateObjectsRequestType()
		 * @generated
		 */
		EClass RELOCATE_OBJECTS_REQUEST_TYPE = eINSTANCE.getRelocateObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = eINSTANCE.getRelocateObjectsRequestType_AdhocQuery();

		/**
		 * The meta object literal for the '<em><b>Source Registry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATE_OBJECTS_REQUEST_TYPE__SOURCE_REGISTRY = eINSTANCE.getRelocateObjectsRequestType_SourceRegistry();

		/**
		 * The meta object literal for the '<em><b>Destination Registry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATE_OBJECTS_REQUEST_TYPE__DESTINATION_REGISTRY = eINSTANCE.getRelocateObjectsRequestType_DestinationRegistry();

		/**
		 * The meta object literal for the '<em><b>Owner At Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_SOURCE = eINSTANCE.getRelocateObjectsRequestType_OwnerAtSource();

		/**
		 * The meta object literal for the '<em><b>Owner At Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATE_OBJECTS_REQUEST_TYPE__OWNER_AT_DESTINATION = eINSTANCE.getRelocateObjectsRequestType_OwnerAtDestination();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RemoveObjectsRequestTypeImpl <em>Remove Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.RemoveObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getRemoveObjectsRequestType()
		 * @generated
		 */
		EClass REMOVE_OBJECTS_REQUEST_TYPE = eINSTANCE.getRemoveObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = eINSTANCE.getRemoveObjectsRequestType_AdhocQuery();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = eINSTANCE.getRemoveObjectsRequestType_ObjectRefList();

		/**
		 * The meta object literal for the '<em><b>Deletion Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE = eINSTANCE.getRemoveObjectsRequestType_DeletionScope();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.SubmitObjectsRequestTypeImpl <em>Submit Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.SubmitObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getSubmitObjectsRequestType()
		 * @generated
		 */
		EClass SUBMIT_OBJECTS_REQUEST_TYPE = eINSTANCE.getSubmitObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMIT_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST = eINSTANCE.getSubmitObjectsRequestType_RegistryObjectList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UndeprecateObjectsRequestTypeImpl <em>Undeprecate Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UndeprecateObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getUndeprecateObjectsRequestType()
		 * @generated
		 */
		EClass UNDEPRECATE_OBJECTS_REQUEST_TYPE = eINSTANCE.getUndeprecateObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDEPRECATE_OBJECTS_REQUEST_TYPE__ADHOC_QUERY = eINSTANCE.getUndeprecateObjectsRequestType_AdhocQuery();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = eINSTANCE.getUndeprecateObjectsRequestType_ObjectRefList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UpdateObjectsRequestTypeImpl <em>Update Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.UpdateObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.LCMPackageImpl#getUpdateObjectsRequestType()
		 * @generated
		 */
		EClass UPDATE_OBJECTS_REQUEST_TYPE = eINSTANCE.getUpdateObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_OBJECTS_REQUEST_TYPE__REGISTRY_OBJECT_LIST = eINSTANCE.getUpdateObjectsRequestType_RegistryObjectList();

	}

} //LCMPackage
