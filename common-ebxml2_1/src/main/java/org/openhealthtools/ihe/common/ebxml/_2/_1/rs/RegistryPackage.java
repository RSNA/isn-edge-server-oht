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
 * $Id: RegistryPackage.java,v 1.1 2006/06/27 23:18:08 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

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
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryFactory
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
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1";

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
	RegistryPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.AddSlotsRequestTypeImpl <em>Add Slots Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.AddSlotsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getAddSlotsRequestType()
	 * @generated
	 */
	int ADD_SLOTS_REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SLOTS_REQUEST_TYPE__OBJECT_REF = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SLOTS_REQUEST_TYPE__SLOT = 1;

	/**
	 * The number of structural features of the '<em>Add Slots Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SLOTS_REQUEST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.ApproveObjectsRequestTypeImpl <em>Approve Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.ApproveObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getApproveObjectsRequestType()
	 * @generated
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = 0;

	/**
	 * The number of structural features of the '<em>Approve Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DeprecateObjectsRequestTypeImpl <em>Deprecate Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DeprecateObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDeprecateObjectsRequestType()
	 * @generated
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = 0;

	/**
	 * The number of structural features of the '<em>Deprecate Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Add Slots Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_SLOTS_REQUEST = 3;

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
	 * The feature id for the '<em><b>Optional Features Supported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED = 6;

	/**
	 * The feature id for the '<em><b>Registry Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ERROR = 7;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ERROR_LIST = 8;

	/**
	 * The feature id for the '<em><b>Registry Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_PROFILE = 9;

	/**
	 * The feature id for the '<em><b>Registry Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Remove Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST = 11;

	/**
	 * The feature id for the '<em><b>Remove Slots Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Request Accepted Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOT_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Submit Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST = 15;

	/**
	 * The feature id for the '<em><b>Update Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST = 16;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.OptionalFeaturesSupportedTypeImpl <em>Optional Features Supported Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.OptionalFeaturesSupportedTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getOptionalFeaturesSupportedType()
	 * @generated
	 */
	int OPTIONAL_FEATURES_SUPPORTED_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY = 0;

	/**
	 * The feature id for the '<em><b>XQuery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY = 1;

	/**
	 * The number of structural features of the '<em>Optional Features Supported Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES_SUPPORTED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorListTypeImpl <em>Error List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryErrorListType()
	 * @generated
	 */
	int REGISTRY_ERROR_LIST_TYPE = 5;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryErrorType()
	 * @generated
	 */
	int REGISTRY_ERROR_TYPE = 6;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryProfileTypeImpl <em>Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryProfileTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryProfileType()
	 * @generated
	 */
	int REGISTRY_PROFILE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Optional Features Supported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PROFILE_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PROFILE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl <em>Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryResponseType()
	 * @generated
	 */
	int REGISTRY_RESPONSE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Adhoc Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE = 0;

	/**
	 * The feature id for the '<em><b>Get Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST = 2;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveObjectsRequestTypeImpl <em>Remove Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRemoveObjectsRequestType()
	 * @generated
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = 0;

	/**
	 * The feature id for the '<em><b>Deletion Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE__DELETION_SCOPE = 1;

	/**
	 * The number of structural features of the '<em>Remove Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveSlotsRequestTypeImpl <em>Remove Slots Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveSlotsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRemoveSlotsRequestType()
	 * @generated
	 */
	int REMOVE_SLOTS_REQUEST_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SLOTS_REQUEST_TYPE__OBJECT_REF = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SLOTS_REQUEST_TYPE__SLOT = 1;

	/**
	 * The number of structural features of the '<em>Remove Slots Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SLOTS_REQUEST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RequestAcceptedResponseTypeImpl <em>Request Accepted Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RequestAcceptedResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRequestAcceptedResponseType()
	 * @generated
	 */
	int REQUEST_ACCEPTED_RESPONSE_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Request Accepted Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACCEPTED_RESPONSE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRootElementType()
	 * @generated
	 */
	int ROOT_ELEMENT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Submit Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Update Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Approve Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Deprecate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Remove Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Adhoc Query Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Get Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Add Slots Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Remove Slots Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Registry Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>Registry Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__REGISTRY_PROFILE = 10;

	/**
	 * The number of structural features of the '<em>Root Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.SubmitObjectsRequestTypeImpl <em>Submit Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.SubmitObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getSubmitObjectsRequestType()
	 * @generated
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Leaf Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST = 0;

	/**
	 * The number of structural features of the '<em>Submit Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.UpdateObjectsRequestTypeImpl <em>Update Objects Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.UpdateObjectsRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getUpdateObjectsRequestType()
	 * @generated
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Leaf Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST = 0;

	/**
	 * The number of structural features of the '<em>Update Objects Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECTS_REQUEST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType <em>Deletion Scope Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDeletionScopeType()
	 * @generated
	 */
	int DELETION_SCOPE_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType <em>Error Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 17;

	/**
	 * The meta object id for the '<em>Deletion Scope Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDeletionScopeTypeObject()
	 * @generated
	 */
	int DELETION_SCOPE_TYPE_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Error Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getErrorTypeObject()
	 * @generated
	 */
	int ERROR_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getStatusTypeObject()
	 * @generated
	 */
	int STATUS_TYPE_OBJECT = 20;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType <em>Add Slots Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Slots Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType
	 * @generated
	 */
	EClass getAddSlotsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType#getObjectRef()
	 * @see #getAddSlotsRequestType()
	 * @generated
	 */
	EReference getAddSlotsRequestType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType#getSlot()
	 * @see #getAddSlotsRequestType()
	 * @generated
	 */
	EReference getAddSlotsRequestType_Slot();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType <em>Approve Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approve Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType
	 * @generated
	 */
	EClass getApproveObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType#getObjectRefList()
	 * @see #getApproveObjectsRequestType()
	 * @generated
	 */
	EReference getApproveObjectsRequestType_ObjectRefList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType <em>Deprecate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecate Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType
	 * @generated
	 */
	EClass getDeprecateObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType#getObjectRefList()
	 * @see #getDeprecateObjectsRequestType()
	 * @generated
	 */
	EReference getDeprecateObjectsRequestType_ObjectRefList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getAddSlotsRequest <em>Add Slots Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Slots Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getAddSlotsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddSlotsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getApproveObjectsRequest <em>Approve Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approve Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getApproveObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApproveObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecate Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getDeprecateObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeprecateObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getOptionalFeaturesSupported <em>Optional Features Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional Features Supported</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getOptionalFeaturesSupported()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OptionalFeaturesSupported();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryError <em>Registry Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Error</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryError()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryError();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryErrorList <em>Registry Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Error List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryErrorList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryErrorList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryProfile <em>Registry Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Profile</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryResponse <em>Registry Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveObjectsRequest <em>Remove Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoveObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveSlotsRequest <em>Remove Slots Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Slots Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveSlotsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoveSlotsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRequestAcceptedResponse <em>Request Accepted Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Accepted Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRequestAcceptedResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestAcceptedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Element</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRootElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RootElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getSubmitObjectsRequest <em>Submit Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Submit Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getSubmitObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubmitObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getUpdateObjectsRequest <em>Update Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getUpdateObjectsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateObjectsRequest();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType <em>Optional Features Supported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Features Supported Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType
	 * @generated
	 */
	EClass getOptionalFeaturesSupportedType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isSqlQuery()
	 * @see #getOptionalFeaturesSupportedType()
	 * @generated
	 */
	EAttribute getOptionalFeaturesSupportedType_SqlQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isXQuery <em>XQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuery</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isXQuery()
	 * @see #getOptionalFeaturesSupportedType()
	 * @generated
	 */
	EAttribute getOptionalFeaturesSupportedType_XQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType <em>Error List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType
	 * @generated
	 */
	EClass getRegistryErrorListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getRegistryError <em>Registry Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Error</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getRegistryError()
	 * @see #getRegistryErrorListType()
	 * @generated
	 */
	EReference getRegistryErrorListType_RegistryError();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highest Severity</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType#getHighestSeverity()
	 * @see #getRegistryErrorListType()
	 * @generated
	 */
	EAttribute getRegistryErrorListType_HighestSeverity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType
	 * @generated
	 */
	EClass getRegistryErrorType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getValue()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getCodeContext <em>Code Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Context</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getCodeContext()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_CodeContext();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getErrorCode()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getLocation()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType#getSeverity()
	 * @see #getRegistryErrorType()
	 * @generated
	 */
	EAttribute getRegistryErrorType_Severity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType <em>Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType
	 * @generated
	 */
	EClass getRegistryProfileType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getOptionalFeaturesSupported <em>Optional Features Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional Features Supported</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getOptionalFeaturesSupported()
	 * @see #getRegistryProfileType()
	 * @generated
	 */
	EReference getRegistryProfileType_OptionalFeaturesSupported();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType#getVersion()
	 * @see #getRegistryProfileType()
	 * @generated
	 */
	EAttribute getRegistryProfileType_Version();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType
	 * @generated
	 */
	EClass getRegistryResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getAdhocQueryResponse <em>Adhoc Query Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getAdhocQueryResponse()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EReference getRegistryResponseType_AdhocQueryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getGetContentResponse <em>Get Content Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Content Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getGetContentResponse()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EReference getRegistryResponseType_GetContentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getRegistryErrorList <em>Registry Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Error List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getRegistryErrorList()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EReference getRegistryResponseType_RegistryErrorList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getStatus()
	 * @see #getRegistryResponseType()
	 * @generated
	 */
	EAttribute getRegistryResponseType_Status();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType <em>Remove Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType
	 * @generated
	 */
	EClass getRemoveObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getObjectRefList()
	 * @see #getRemoveObjectsRequestType()
	 * @generated
	 */
	EReference getRemoveObjectsRequestType_ObjectRefList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deletion Scope</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType#getDeletionScope()
	 * @see #getRemoveObjectsRequestType()
	 * @generated
	 */
	EAttribute getRemoveObjectsRequestType_DeletionScope();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType <em>Remove Slots Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Slots Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType
	 * @generated
	 */
	EClass getRemoveSlotsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType#getObjectRef()
	 * @see #getRemoveSlotsRequestType()
	 * @generated
	 */
	EReference getRemoveSlotsRequestType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType#getSlot()
	 * @see #getRemoveSlotsRequestType()
	 * @generated
	 */
	EReference getRemoveSlotsRequestType_Slot();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RequestAcceptedResponseType <em>Request Accepted Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Accepted Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RequestAcceptedResponseType
	 * @generated
	 */
	EClass getRequestAcceptedResponseType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType <em>Root Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Element Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType
	 * @generated
	 */
	EClass getRootElementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getSubmitObjectsRequest <em>Submit Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Submit Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getSubmitObjectsRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_SubmitObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getUpdateObjectsRequest <em>Update Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getUpdateObjectsRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_UpdateObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getApproveObjectsRequest <em>Approve Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approve Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getApproveObjectsRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_ApproveObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecate Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getDeprecateObjectsRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_DeprecateObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveObjectsRequest <em>Remove Objects Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Objects Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveObjectsRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_RemoveObjectsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAdhocQueryRequest <em>Adhoc Query Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAdhocQueryRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_AdhocQueryRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getGetContentRequest <em>Get Content Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Content Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getGetContentRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_GetContentRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAddSlotsRequest <em>Add Slots Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Slots Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAddSlotsRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_AddSlotsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveSlotsRequest <em>Remove Slots Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Slots Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveSlotsRequest()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_RemoveSlotsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryResponse <em>Registry Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryResponse()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_RegistryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryProfile <em>Registry Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Profile</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryProfile()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_RegistryProfile();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType <em>Submit Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType
	 * @generated
	 */
	EClass getSubmitObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType#getLeafRegistryObjectList <em>Leaf Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leaf Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType#getLeafRegistryObjectList()
	 * @see #getSubmitObjectsRequestType()
	 * @generated
	 */
	EReference getSubmitObjectsRequestType_LeafRegistryObjectList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType <em>Update Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Objects Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType
	 * @generated
	 */
	EClass getUpdateObjectsRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType#getLeafRegistryObjectList <em>Leaf Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leaf Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType#getLeafRegistryObjectList()
	 * @see #getUpdateObjectsRequestType()
	 * @generated
	 */
	EReference getUpdateObjectsRequestType_LeafRegistryObjectList();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType <em>Deletion Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deletion Scope Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
	 * @generated
	 */
	EEnum getDeletionScopeType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
	 * @generated
	 */
	EEnum getErrorType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType <em>Deletion Scope Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Deletion Scope Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType"
	 *        extendedMetaData="name='deletionScope_._type:Object' baseType='deletionScope_._type'" 
	 * @generated
	 */
	EDataType getDeletionScopeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType <em>Error Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Error Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType"
	 *        extendedMetaData="name='ErrorType:Object' baseType='ErrorType'" 
	 * @generated
	 */
	EDataType getErrorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType <em>Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType"
	 *        extendedMetaData="name='status_._type:Object' baseType='status_._type'" 
	 * @generated
	 */
	EDataType getStatusTypeObject();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.AddSlotsRequestTypeImpl <em>Add Slots Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.AddSlotsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getAddSlotsRequestType()
		 * @generated
		 */
		EClass ADD_SLOTS_REQUEST_TYPE = eINSTANCE.getAddSlotsRequestType();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SLOTS_REQUEST_TYPE__OBJECT_REF = eINSTANCE.getAddSlotsRequestType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SLOTS_REQUEST_TYPE__SLOT = eINSTANCE.getAddSlotsRequestType_Slot();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.ApproveObjectsRequestTypeImpl <em>Approve Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.ApproveObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getApproveObjectsRequestType()
		 * @generated
		 */
		EClass APPROVE_OBJECTS_REQUEST_TYPE = eINSTANCE.getApproveObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = eINSTANCE.getApproveObjectsRequestType_ObjectRefList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DeprecateObjectsRequestTypeImpl <em>Deprecate Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DeprecateObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDeprecateObjectsRequestType()
		 * @generated
		 */
		EClass DEPRECATE_OBJECTS_REQUEST_TYPE = eINSTANCE.getDeprecateObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATE_OBJECTS_REQUEST_TYPE__OBJECT_REF_LIST = eINSTANCE.getDeprecateObjectsRequestType_ObjectRefList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Add Slots Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADD_SLOTS_REQUEST = eINSTANCE.getDocumentRoot_AddSlotsRequest();

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
		 * The meta object literal for the '<em><b>Optional Features Supported</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OPTIONAL_FEATURES_SUPPORTED = eINSTANCE.getDocumentRoot_OptionalFeaturesSupported();

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
		 * The meta object literal for the '<em><b>Registry Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_PROFILE = eINSTANCE.getDocumentRoot_RegistryProfile();

		/**
		 * The meta object literal for the '<em><b>Registry Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_RESPONSE = eINSTANCE.getDocumentRoot_RegistryResponse();

		/**
		 * The meta object literal for the '<em><b>Remove Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_RemoveObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Slots Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVE_SLOTS_REQUEST = eINSTANCE.getDocumentRoot_RemoveSlotsRequest();

		/**
		 * The meta object literal for the '<em><b>Request Accepted Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUEST_ACCEPTED_RESPONSE = eINSTANCE.getDocumentRoot_RequestAcceptedResponse();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROOT_ELEMENT = eINSTANCE.getDocumentRoot_RootElement();

		/**
		 * The meta object literal for the '<em><b>Submit Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_SubmitObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Update Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST = eINSTANCE.getDocumentRoot_UpdateObjectsRequest();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.OptionalFeaturesSupportedTypeImpl <em>Optional Features Supported Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.OptionalFeaturesSupportedTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getOptionalFeaturesSupportedType()
		 * @generated
		 */
		EClass OPTIONAL_FEATURES_SUPPORTED_TYPE = eINSTANCE.getOptionalFeaturesSupportedType();

		/**
		 * The meta object literal for the '<em><b>Sql Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL_FEATURES_SUPPORTED_TYPE__SQL_QUERY = eINSTANCE.getOptionalFeaturesSupportedType_SqlQuery();

		/**
		 * The meta object literal for the '<em><b>XQuery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL_FEATURES_SUPPORTED_TYPE__XQUERY = eINSTANCE.getOptionalFeaturesSupportedType_XQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorListTypeImpl <em>Error List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryErrorListType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryErrorTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryErrorType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryProfileTypeImpl <em>Profile Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryProfileTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryProfileType()
		 * @generated
		 */
		EClass REGISTRY_PROFILE_TYPE = eINSTANCE.getRegistryProfileType();

		/**
		 * The meta object literal for the '<em><b>Optional Features Supported</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PROFILE_TYPE__OPTIONAL_FEATURES_SUPPORTED = eINSTANCE.getRegistryProfileType_OptionalFeaturesSupported();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_PROFILE_TYPE__VERSION = eINSTANCE.getRegistryProfileType_Version();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl <em>Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRegistryResponseType()
		 * @generated
		 */
		EClass REGISTRY_RESPONSE_TYPE = eINSTANCE.getRegistryResponseType();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_RESPONSE_TYPE__ADHOC_QUERY_RESPONSE = eINSTANCE.getRegistryResponseType_AdhocQueryResponse();

		/**
		 * The meta object literal for the '<em><b>Get Content Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_RESPONSE_TYPE__GET_CONTENT_RESPONSE = eINSTANCE.getRegistryResponseType_GetContentResponse();

		/**
		 * The meta object literal for the '<em><b>Registry Error List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST = eINSTANCE.getRegistryResponseType_RegistryErrorList();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_RESPONSE_TYPE__STATUS = eINSTANCE.getRegistryResponseType_Status();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveObjectsRequestTypeImpl <em>Remove Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRemoveObjectsRequestType()
		 * @generated
		 */
		EClass REMOVE_OBJECTS_REQUEST_TYPE = eINSTANCE.getRemoveObjectsRequestType();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveSlotsRequestTypeImpl <em>Remove Slots Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RemoveSlotsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRemoveSlotsRequestType()
		 * @generated
		 */
		EClass REMOVE_SLOTS_REQUEST_TYPE = eINSTANCE.getRemoveSlotsRequestType();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_SLOTS_REQUEST_TYPE__OBJECT_REF = eINSTANCE.getRemoveSlotsRequestType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_SLOTS_REQUEST_TYPE__SLOT = eINSTANCE.getRemoveSlotsRequestType_Slot();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RequestAcceptedResponseTypeImpl <em>Request Accepted Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RequestAcceptedResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRequestAcceptedResponseType()
		 * @generated
		 */
		EClass REQUEST_ACCEPTED_RESPONSE_TYPE = eINSTANCE.getRequestAcceptedResponseType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RootElementTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getRootElementType()
		 * @generated
		 */
		EClass ROOT_ELEMENT_TYPE = eINSTANCE.getRootElementType();

		/**
		 * The meta object literal for the '<em><b>Submit Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__SUBMIT_OBJECTS_REQUEST = eINSTANCE.getRootElementType_SubmitObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Update Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__UPDATE_OBJECTS_REQUEST = eINSTANCE.getRootElementType_UpdateObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Approve Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__APPROVE_OBJECTS_REQUEST = eINSTANCE.getRootElementType_ApproveObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Deprecate Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__DEPRECATE_OBJECTS_REQUEST = eINSTANCE.getRootElementType_DeprecateObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Objects Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__REMOVE_OBJECTS_REQUEST = eINSTANCE.getRootElementType_RemoveObjectsRequest();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__ADHOC_QUERY_REQUEST = eINSTANCE.getRootElementType_AdhocQueryRequest();

		/**
		 * The meta object literal for the '<em><b>Get Content Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__GET_CONTENT_REQUEST = eINSTANCE.getRootElementType_GetContentRequest();

		/**
		 * The meta object literal for the '<em><b>Add Slots Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__ADD_SLOTS_REQUEST = eINSTANCE.getRootElementType_AddSlotsRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Slots Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__REMOVE_SLOTS_REQUEST = eINSTANCE.getRootElementType_RemoveSlotsRequest();

		/**
		 * The meta object literal for the '<em><b>Registry Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__REGISTRY_RESPONSE = eINSTANCE.getRootElementType_RegistryResponse();

		/**
		 * The meta object literal for the '<em><b>Registry Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__REGISTRY_PROFILE = eINSTANCE.getRootElementType_RegistryProfile();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.SubmitObjectsRequestTypeImpl <em>Submit Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.SubmitObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getSubmitObjectsRequestType()
		 * @generated
		 */
		EClass SUBMIT_OBJECTS_REQUEST_TYPE = eINSTANCE.getSubmitObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Leaf Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMIT_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST = eINSTANCE.getSubmitObjectsRequestType_LeafRegistryObjectList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.UpdateObjectsRequestTypeImpl <em>Update Objects Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.UpdateObjectsRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getUpdateObjectsRequestType()
		 * @generated
		 */
		EClass UPDATE_OBJECTS_REQUEST_TYPE = eINSTANCE.getUpdateObjectsRequestType();

		/**
		 * The meta object literal for the '<em><b>Leaf Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_OBJECTS_REQUEST_TYPE__LEAF_REGISTRY_OBJECT_LIST = eINSTANCE.getUpdateObjectsRequestType_LeafRegistryObjectList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType <em>Deletion Scope Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDeletionScopeType()
		 * @generated
		 */
		EEnum DELETION_SCOPE_TYPE = eINSTANCE.getDeletionScopeType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType <em>Error Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getErrorType()
		 * @generated
		 */
		EEnum ERROR_TYPE = eINSTANCE.getErrorType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em>Deletion Scope Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeletionScopeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getDeletionScopeTypeObject()
		 * @generated
		 */
		EDataType DELETION_SCOPE_TYPE_OBJECT = eINSTANCE.getDeletionScopeTypeObject();

		/**
		 * The meta object literal for the '<em>Error Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getErrorTypeObject()
		 * @generated
		 */
		EDataType ERROR_TYPE_OBJECT = eINSTANCE.getErrorTypeObject();

		/**
		 * The meta object literal for the '<em>Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.impl.RegistryPackageImpl#getStatusTypeObject()
		 * @generated
		 */
		EDataType STATUS_TYPE_OBJECT = eINSTANCE.getStatusTypeObject();

	}

} //RegistryPackage
