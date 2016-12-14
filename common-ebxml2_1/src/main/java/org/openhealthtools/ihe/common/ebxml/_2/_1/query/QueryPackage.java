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
 * $Id: QueryPackage.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

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
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "query";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryRequestTypeImpl <em>Adhoc Query Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAdhocQueryRequestType()
	 * @generated
	 */
	int ADHOC_QUERY_REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Response Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Filter Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY = 1;

	/**
	 * The feature id for the '<em><b>SQL Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY = 2;

	/**
	 * The number of structural features of the '<em>Adhoc Query Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryResponseTypeImpl <em>Adhoc Query Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAdhocQueryResponseType()
	 * @generated
	 */
	int ADHOC_QUERY_RESPONSE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Filter Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT = 0;

	/**
	 * The feature id for the '<em><b>SQL Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Adhoc Query Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationBranchTypeImpl <em>Association Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAssociationBranchType()
	 * @generated
	 */
	int ASSOCIATION_BRANCH_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Association Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__ASSOCIATION_FILTER = 0;

	/**
	 * The feature id for the '<em><b>External Link Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__EXTERNAL_LINK_FILTER = 1;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__EXTERNAL_IDENTIFIER_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__REGISTRY_OBJECT_QUERY = 3;

	/**
	 * The feature id for the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__REGISTRY_ENTRY_QUERY = 4;

	/**
	 * The feature id for the '<em><b>Association Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__ASSOCIATION_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_SCHEME_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_NODE_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Organization Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__ORGANIZATION_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__AUDITABLE_EVENT_QUERY = 10;

	/**
	 * The feature id for the '<em><b>Registry Package Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__REGISTRY_PACKAGE_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__EXTRINSIC_OBJECT_QUERY = 12;

	/**
	 * The feature id for the '<em><b>Service Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__SERVICE_QUERY = 13;

	/**
	 * The feature id for the '<em><b>User Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__USER_BRANCH = 14;

	/**
	 * The feature id for the '<em><b>Service Binding Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__SERVICE_BINDING_BRANCH = 15;

	/**
	 * The feature id for the '<em><b>Specification Link Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH = 16;

	/**
	 * The number of structural features of the '<em>Association Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_BRANCH_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryResultTypeImpl <em>Association Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAssociationQueryResultType()
	 * @generated
	 */
	int ASSOCIATION_QUERY_RESULT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_RESULT_TYPE__ASSOCIATION = 3;

	/**
	 * The number of structural features of the '<em>Association Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_RESULT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl <em>Registry Object Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryObjectQueryType()
	 * @generated
	 */
	int REGISTRY_OBJECT_QUERY_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER = 0;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH = 3;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH = 4;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH = 5;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH = 6;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = 7;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = 8;

	/**
	 * The number of structural features of the '<em>Registry Object Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryTypeImpl <em>Association Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAssociationQueryType()
	 * @generated
	 */
	int ASSOCIATION_QUERY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Association Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryResultTypeImpl <em>Auditable Event Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAuditableEventQueryResultType()
	 * @generated
	 */
	int AUDITABLE_EVENT_QUERY_RESULT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Auditable Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_RESULT_TYPE__AUDITABLE_EVENT = 3;

	/**
	 * The number of structural features of the '<em>Auditable Event Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_RESULT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl <em>Auditable Event Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAuditableEventQueryType()
	 * @generated
	 */
	int AUDITABLE_EVENT_QUERY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Auditable Event Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Auditable Event Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.BooleanClauseTypeImpl <em>Boolean Clause Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.BooleanClauseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getBooleanClauseType()
	 * @generated
	 */
	int BOOLEAN_CLAUSE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Boolean Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE = 0;

	/**
	 * The number of structural features of the '<em>Boolean Clause Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CLAUSE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryResultTypeImpl <em>Classification Node Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationNodeQueryResultType()
	 * @generated
	 */
	int CLASSIFICATION_NODE_QUERY_RESULT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_RESULT_TYPE__CLASSIFICATION_NODE = 3;

	/**
	 * The number of structural features of the '<em>Classification Node Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_RESULT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl <em>Classification Node Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationNodeQueryType()
	 * @generated
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classification Node Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification Node Parent Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classification Node Children Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classification Node Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryResultTypeImpl <em>Classification Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationQueryResultType()
	 * @generated
	 */
	int CLASSIFICATION_QUERY_RESULT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_RESULT_TYPE__CLASSIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Classification Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_RESULT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl <em>Classification Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationQueryType()
	 * @generated
	 */
	int CLASSIFICATION_QUERY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classification Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Classification Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryResultTypeImpl <em>Classification Scheme Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationSchemeQueryResultType()
	 * @generated
	 */
	int CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Registry Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__REGISTRY_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Classification Scheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME = 4;

	/**
	 * The number of structural features of the '<em>Classification Scheme Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryTypeImpl <em>Registry Entry Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryEntryQueryType()
	 * @generated
	 */
	int REGISTRY_ENTRY_QUERY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registry Entry Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryTypeImpl <em>Classification Scheme Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationSchemeQueryType()
	 * @generated
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_ENTRY_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_ENTRY_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__NAME_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__SLOT_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__REGISTRY_ENTRY_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Scheme Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classification Scheme Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassifiedByBranchTypeImpl <em>Classified By Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassifiedByBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassifiedByBranchType()
	 * @generated
	 */
	int CLASSIFIED_BY_BRANCH_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Classification Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_SCHEME_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_NODE_QUERY = 2;

	/**
	 * The number of structural features of the '<em>Classified By Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIED_BY_BRANCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClauseTypeImpl <em>Clause Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClauseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClauseType()
	 * @generated
	 */
	int CLAUSE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Simple Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_TYPE__SIMPLE_CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Compound Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_TYPE__COMPOUND_CLAUSE = 1;

	/**
	 * The number of structural features of the '<em>Clause Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.CompoundClauseTypeImpl <em>Compound Clause Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.CompoundClauseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getCompoundClauseType()
	 * @generated
	 */
	int COMPOUND_CLAUSE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CLAUSE_TYPE__CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Connective Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE = 1;

	/**
	 * The number of structural features of the '<em>Compound Clause Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CLAUSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 17;

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
	 * The feature id for the '<em><b>Adhoc Query Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADHOC_QUERY_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Adhoc Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Association Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_FILTER = 5;

	/**
	 * The feature id for the '<em><b>Association Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Association Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Auditable Event Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER = 8;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Auditable Event Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT = 10;

	/**
	 * The feature id for the '<em><b>Boolean Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_CLAUSE = 11;

	/**
	 * The feature id for the '<em><b>Classification Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_FILTER = 12;

	/**
	 * The feature id for the '<em><b>Classification Node Children Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH = 13;

	/**
	 * The feature id for the '<em><b>Classification Node Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER = 14;

	/**
	 * The feature id for the '<em><b>Classification Node Parent Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH = 15;

	/**
	 * The feature id for the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY = 16;

	/**
	 * The feature id for the '<em><b>Classification Node Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT = 17;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_QUERY = 18;

	/**
	 * The feature id for the '<em><b>Classification Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT = 19;

	/**
	 * The feature id for the '<em><b>Classification Scheme Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY = 21;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT = 22;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH = 23;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLAUSE = 24;

	/**
	 * The feature id for the '<em><b>Compound Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPOUND_CLAUSE = 25;

	/**
	 * The feature id for the '<em><b>Date Time Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_TIME_CLAUSE = 26;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION_BRANCH = 27;

	/**
	 * The feature id for the '<em><b>Email Address Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER = 28;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER = 29;

	/**
	 * The feature id for the '<em><b>External Link Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_LINK_FILTER = 30;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER = 31;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY = 32;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT = 33;

	/**
	 * The feature id for the '<em><b>Filter Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_QUERY = 34;

	/**
	 * The feature id for the '<em><b>Filter Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_QUERY_RESULT = 35;

	/**
	 * The feature id for the '<em><b>Float Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOAT_CLAUSE = 36;

	/**
	 * The feature id for the '<em><b>Get Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONTENT_REQUEST = 37;

	/**
	 * The feature id for the '<em><b>Get Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONTENT_RESPONSE = 38;

	/**
	 * The feature id for the '<em><b>Int Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INT_CLAUSE = 39;

	/**
	 * The feature id for the '<em><b>Localized String Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALIZED_STRING_FILTER = 40;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME_BRANCH = 41;

	/**
	 * The feature id for the '<em><b>Organization Children Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH = 42;

	/**
	 * The feature id for the '<em><b>Organization Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_FILTER = 43;

	/**
	 * The feature id for the '<em><b>Organization Parent Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH = 44;

	/**
	 * The feature id for the '<em><b>Organization Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_QUERY = 45;

	/**
	 * The feature id for the '<em><b>Organization Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT = 46;

	/**
	 * The feature id for the '<em><b>Postal Address Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER = 47;

	/**
	 * The feature id for the '<em><b>Rational Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RATIONAL_CLAUSE = 48;

	/**
	 * The feature id for the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER = 49;

	/**
	 * The feature id for the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY = 50;

	/**
	 * The feature id for the '<em><b>Registry Entry Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT = 51;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER = 52;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY = 53;

	/**
	 * The feature id for the '<em><b>Registry Object Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT = 54;

	/**
	 * The feature id for the '<em><b>Registry Package Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER = 55;

	/**
	 * The feature id for the '<em><b>Registry Package Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY = 56;

	/**
	 * The feature id for the '<em><b>Registry Package Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT = 57;

	/**
	 * The feature id for the '<em><b>Response Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESPONSE_OPTION = 58;

	/**
	 * The feature id for the '<em><b>Service Binding Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_BINDING_BRANCH = 59;

	/**
	 * The feature id for the '<em><b>Service Binding Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_BINDING_FILTER = 60;

	/**
	 * The feature id for the '<em><b>Service Binding Target Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH = 61;

	/**
	 * The feature id for the '<em><b>Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_FILTER = 62;

	/**
	 * The feature id for the '<em><b>Service Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_QUERY = 63;

	/**
	 * The feature id for the '<em><b>Service Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_QUERY_RESULT = 64;

	/**
	 * The feature id for the '<em><b>Simple Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_CLAUSE = 65;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLOT_BRANCH = 66;

	/**
	 * The feature id for the '<em><b>Slot Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLOT_FILTER = 67;

	/**
	 * The feature id for the '<em><b>Slot Value Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLOT_VALUE_FILTER = 68;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH = 69;

	/**
	 * The feature id for the '<em><b>Specification Link Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH = 70;

	/**
	 * The feature id for the '<em><b>Specification Link Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER = 71;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQL_QUERY = 72;

	/**
	 * The feature id for the '<em><b>Sql Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQL_QUERY_RESULT = 73;

	/**
	 * The feature id for the '<em><b>String Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_CLAUSE = 74;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH = 75;

	/**
	 * The feature id for the '<em><b>Telephone Number Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER = 76;

	/**
	 * The feature id for the '<em><b>User Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_BRANCH = 77;

	/**
	 * The feature id for the '<em><b>User Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_FILTER = 78;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 79;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryResultTypeImpl <em>Extrinsic Object Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getExtrinsicObjectQueryResultType()
	 * @generated
	 */
	int EXTRINSIC_OBJECT_QUERY_RESULT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Registry Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__REGISTRY_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Extrinsic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>Extrinsic Object Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_RESULT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryTypeImpl <em>Extrinsic Object Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getExtrinsicObjectQueryType()
	 * @generated
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_ENTRY_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_ENTRY_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__NAME_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__SLOT_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__REGISTRY_ENTRY_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extrinsic Object Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl <em>Filter Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getFilterQueryResultType()
	 * @generated
	 */
	int FILTER_QUERY_RESULT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Registry Object Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Registry Entry Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Association Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Auditable Event Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Classification Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Classification Node Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT = 6;

	/**
	 * The feature id for the '<em><b>Registry Package Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Organization Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT = 9;

	/**
	 * The feature id for the '<em><b>Service Query Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT = 10;

	/**
	 * The number of structural features of the '<em>Filter Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_RESULT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl <em>Filter Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getFilterQueryType()
	 * @generated
	 */
	int FILTER_QUERY_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY = 0;

	/**
	 * The feature id for the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Association Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__ASSOCIATION_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY = 3;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__CLASSIFICATION_QUERY = 4;

	/**
	 * The feature id for the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Registry Package Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Organization Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__ORGANIZATION_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Service Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__SERVICE_QUERY = 10;

	/**
	 * The number of structural features of the '<em>Filter Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__CLAUSE = 0;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentRequestTypeImpl <em>Get Content Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getGetContentRequestType()
	 * @generated
	 */
	int GET_CONTENT_REQUEST_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST = 0;

	/**
	 * The number of structural features of the '<em>Get Content Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENT_REQUEST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentResponseTypeImpl <em>Get Content Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getGetContentResponseType()
	 * @generated
	 */
	int GET_CONTENT_RESPONSE_TYPE = 24;

	/**
	 * The number of structural features of the '<em>Get Content Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENT_RESPONSE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.InternationalStringBranchTypeImpl <em>International String Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.InternationalStringBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getInternationalStringBranchType()
	 * @generated
	 */
	int INTERNATIONAL_STRING_BRANCH_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Localized String Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER = 0;

	/**
	 * The number of structural features of the '<em>International String Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_BRANCH_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryResultTypeImpl <em>Organization Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getOrganizationQueryResultType()
	 * @generated
	 */
	int ORGANIZATION_QUERY_RESULT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_RESULT_TYPE__ORGANIZATION = 3;

	/**
	 * The number of structural features of the '<em>Organization Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_RESULT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl <em>Organization Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getOrganizationQueryType()
	 * @generated
	 */
	int ORGANIZATION_QUERY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Organization Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postal Address Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telephone Number Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__USER_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organization Parent Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization Children Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Organization Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl <em>Rational Clause Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRationalClauseType()
	 * @generated
	 */
	int RATIONAL_CLAUSE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Int Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_CLAUSE_TYPE__INT_CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Float Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Date Time Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Logical Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE = 3;

	/**
	 * The number of structural features of the '<em>Rational Clause Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_CLAUSE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryResultTypeImpl <em>Registry Entry Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryEntryQueryResultType()
	 * @generated
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Classification Scheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME = 2;

	/**
	 * The feature id for the '<em><b>Extrinsic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Registry Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Registry Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE__SERVICE = 7;

	/**
	 * The number of structural features of the '<em>Registry Entry Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_QUERY_RESULT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl <em>Registry Package Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryPackageQueryResultType()
	 * @generated
	 */
	int REGISTRY_PACKAGE_QUERY_RESULT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Registry Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Registry Package Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_RESULT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryTypeImpl <em>Registry Package Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryPackageQueryType()
	 * @generated
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_ENTRY_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_ENTRY_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__NAME_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__SLOT_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER;

	/**
	 * The feature id for the '<em><b>Registry Package Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registry Entry Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Registry Package Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ResponseOptionTypeImpl <em>Response Option Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ResponseOptionTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getResponseOptionType()
	 * @generated
	 */
	int RESPONSE_OPTION_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Return Composed Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPTION_TYPE__RETURN_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Response Option Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceBindingBranchTypeImpl <em>Service Binding Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceBindingBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getServiceBindingBranchType()
	 * @generated
	 */
	int SERVICE_BINDING_BRANCH_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Service Binding Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Specification Link Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Service Binding Target Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH = 2;

	/**
	 * The number of structural features of the '<em>Service Binding Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_BRANCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryResultTypeImpl <em>Service Query Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryResultTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getServiceQueryResultType()
	 * @generated
	 */
	int SERVICE_QUERY_RESULT_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_RESULT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_RESULT_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_RESULT_TYPE__REGISTRY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Registry Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_RESULT_TYPE__REGISTRY_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_RESULT_TYPE__SERVICE = 4;

	/**
	 * The number of structural features of the '<em>Service Query Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_RESULT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryTypeImpl <em>Service Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getServiceQueryType()
	 * @generated
	 */
	int SERVICE_QUERY_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Registry Object Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__REGISTRY_OBJECT_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_OBJECT_FILTER;

	/**
	 * The feature id for the '<em><b>External Identifier Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = REGISTRY_ENTRY_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__AUDITABLE_EVENT_QUERY = REGISTRY_ENTRY_QUERY_TYPE__AUDITABLE_EVENT_QUERY;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__NAME_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Classified By Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__CLASSIFIED_BY_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__CLASSIFIED_BY_BRANCH;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__SLOT_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Source Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Target Association Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = REGISTRY_ENTRY_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH;

	/**
	 * The feature id for the '<em><b>Registry Entry Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__REGISTRY_ENTRY_FILTER = REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER;

	/**
	 * The feature id for the '<em><b>Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__SERVICE_FILTER = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Binding Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl <em>Simple Clause Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getSimpleClauseType()
	 * @generated
	 */
	int SIMPLE_CLAUSE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Boolean Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Rational Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>String Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLAUSE_TYPE__STRING_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Left Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT = 3;

	/**
	 * The number of structural features of the '<em>Simple Clause Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLAUSE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SlotBranchTypeImpl <em>Slot Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SlotBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getSlotBranchType()
	 * @generated
	 */
	int SLOT_BRANCH_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Slot Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_BRANCH_TYPE__SLOT_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Slot Value Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER = 1;

	/**
	 * The number of structural features of the '<em>Slot Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_BRANCH_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SpecificationLinkBranchTypeImpl <em>Specification Link Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SpecificationLinkBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getSpecificationLinkBranchType()
	 * @generated
	 */
	int SPECIFICATION_LINK_BRANCH_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Specification Link Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Registry Entry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY = 2;

	/**
	 * The number of structural features of the '<em>Specification Link Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_BRANCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.StringClauseTypeImpl <em>String Clause Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.StringClauseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getStringClauseType()
	 * @generated
	 */
	int STRING_CLAUSE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CLAUSE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>String Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CLAUSE_TYPE__STRING_PREDICATE = 1;

	/**
	 * The number of structural features of the '<em>String Clause Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CLAUSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl <em>User Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getUserBranchType()
	 * @generated
	 */
	int USER_BRANCH_TYPE = 42;

	/**
	 * The feature id for the '<em><b>User Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BRANCH_TYPE__USER_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Postal Address Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Telephone Number Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Email Address Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Organization Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BRANCH_TYPE__ORGANIZATION_QUERY = 4;

	/**
	 * The number of structural features of the '<em>User Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BRANCH_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType <em>Connective Predicate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getConnectivePredicateType()
	 * @generated
	 */
	int CONNECTIVE_PREDICATE_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType <em>Logical Predicate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getLogicalPredicateType()
	 * @generated
	 */
	int LOGICAL_PREDICATE_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType <em>Return Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getReturnTypeType()
	 * @generated
	 */
	int RETURN_TYPE_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType <em>String Predicate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getStringPredicateType()
	 * @generated
	 */
	int STRING_PREDICATE_TYPE = 46;

	/**
	 * The meta object id for the '<em>Connective Predicate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getConnectivePredicateTypeObject()
	 * @generated
	 */
	int CONNECTIVE_PREDICATE_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Logical Predicate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getLogicalPredicateTypeObject()
	 * @generated
	 */
	int LOGICAL_PREDICATE_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Return Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getReturnTypeTypeObject()
	 * @generated
	 */
	int RETURN_TYPE_TYPE_OBJECT = 49;

	/**
	 * The meta object id for the '<em>String Predicate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getStringPredicateTypeObject()
	 * @generated
	 */
	int STRING_PREDICATE_TYPE_OBJECT = 50;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType <em>Adhoc Query Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Query Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType
	 * @generated
	 */
	EClass getAdhocQueryRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getResponseOption <em>Response Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Option</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getResponseOption()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EReference getAdhocQueryRequestType_ResponseOption();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getFilterQuery <em>Filter Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getFilterQuery()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EReference getAdhocQueryRequestType_FilterQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getSQLQuery <em>SQL Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SQL Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType#getSQLQuery()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EAttribute getAdhocQueryRequestType_SQLQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType <em>Adhoc Query Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Query Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType
	 * @generated
	 */
	EClass getAdhocQueryResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getFilterQueryResult <em>Filter Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getFilterQueryResult()
	 * @see #getAdhocQueryResponseType()
	 * @generated
	 */
	EReference getAdhocQueryResponseType_FilterQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getSQLQueryResult <em>SQL Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SQL Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType#getSQLQueryResult()
	 * @see #getAdhocQueryResponseType()
	 * @generated
	 */
	EReference getAdhocQueryResponseType_SQLQueryResult();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType <em>Association Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType
	 * @generated
	 */
	EClass getAssociationBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationFilter <em>Association Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationFilter()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_AssociationFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalLinkFilter <em>External Link Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Link Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalLinkFilter()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ExternalLinkFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalIdentifierFilter <em>External Identifier Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Identifier Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExternalIdentifierFilter()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ExternalIdentifierFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryObjectQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryEntryQuery <em>Registry Entry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryEntryQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_RegistryEntryQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationQuery <em>Association Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAssociationQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_AssociationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationQuery <em>Classification Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ClassificationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationSchemeQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationNodeQuery <em>Classification Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getClassificationNodeQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ClassificationNodeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getOrganizationQuery <em>Organization Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getOrganizationQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_OrganizationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAuditableEventQuery <em>Auditable Event Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getAuditableEventQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_AuditableEventQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryPackageQuery <em>Registry Package Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getRegistryPackageQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_RegistryPackageQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getExtrinsicObjectQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ExtrinsicObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceQuery <em>Service Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceQuery()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ServiceQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getUserBranch <em>User Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getUserBranch()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_UserBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceBindingBranch <em>Service Binding Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getServiceBindingBranch()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_ServiceBindingBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getSpecificationLinkBranch <em>Specification Link Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Link Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationBranchType#getSpecificationLinkBranch()
	 * @see #getAssociationBranchType()
	 * @generated
	 */
	EReference getAssociationBranchType_SpecificationLinkBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType <em>Association Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType
	 * @generated
	 */
	EClass getAssociationQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getGroup()
	 * @see #getAssociationQueryResultType()
	 * @generated
	 */
	EAttribute getAssociationQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getObjectRef()
	 * @see #getAssociationQueryResultType()
	 * @generated
	 */
	EReference getAssociationQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getRegistryObject()
	 * @see #getAssociationQueryResultType()
	 * @generated
	 */
	EReference getAssociationQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryResultType#getAssociation()
	 * @see #getAssociationQueryResultType()
	 * @generated
	 */
	EReference getAssociationQueryResultType_Association();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType <em>Association Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType
	 * @generated
	 */
	EClass getAssociationQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType#getAssociationFilter <em>Association Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AssociationQueryType#getAssociationFilter()
	 * @see #getAssociationQueryType()
	 * @generated
	 */
	EReference getAssociationQueryType_AssociationFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType <em>Auditable Event Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable Event Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType
	 * @generated
	 */
	EClass getAuditableEventQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getGroup()
	 * @see #getAuditableEventQueryResultType()
	 * @generated
	 */
	EAttribute getAuditableEventQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getObjectRef()
	 * @see #getAuditableEventQueryResultType()
	 * @generated
	 */
	EReference getAuditableEventQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getRegistryObject()
	 * @see #getAuditableEventQueryResultType()
	 * @generated
	 */
	EReference getAuditableEventQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getAuditableEvent <em>Auditable Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auditable Event</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryResultType#getAuditableEvent()
	 * @see #getAuditableEventQueryResultType()
	 * @generated
	 */
	EReference getAuditableEventQueryResultType_AuditableEvent();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType <em>Auditable Event Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable Event Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType
	 * @generated
	 */
	EClass getAuditableEventQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getAuditableEventFilter <em>Auditable Event Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getAuditableEventFilter()
	 * @see #getAuditableEventQueryType()
	 * @generated
	 */
	EReference getAuditableEventQueryType_AuditableEventFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getRegistryObjectQuery()
	 * @see #getAuditableEventQueryType()
	 * @generated
	 */
	EReference getAuditableEventQueryType_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getRegistryEntryQuery()
	 * @see #getAuditableEventQueryType()
	 * @generated
	 */
	EReference getAuditableEventQueryType_RegistryEntryQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getUserBranch <em>User Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.AuditableEventQueryType#getUserBranch()
	 * @see #getAuditableEventQueryType()
	 * @generated
	 */
	EReference getAuditableEventQueryType_UserBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType <em>Boolean Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Clause Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType
	 * @generated
	 */
	EClass getBooleanClauseType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType#isBooleanPredicate <em>Boolean Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Predicate</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.BooleanClauseType#isBooleanPredicate()
	 * @see #getBooleanClauseType()
	 * @generated
	 */
	EAttribute getBooleanClauseType_BooleanPredicate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType <em>Classification Node Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Node Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType
	 * @generated
	 */
	EClass getClassificationNodeQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getGroup()
	 * @see #getClassificationNodeQueryResultType()
	 * @generated
	 */
	EAttribute getClassificationNodeQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getObjectRef()
	 * @see #getClassificationNodeQueryResultType()
	 * @generated
	 */
	EReference getClassificationNodeQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getRegistryObject()
	 * @see #getClassificationNodeQueryResultType()
	 * @generated
	 */
	EReference getClassificationNodeQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryResultType#getClassificationNode()
	 * @see #getClassificationNodeQueryResultType()
	 * @generated
	 */
	EReference getClassificationNodeQueryResultType_ClassificationNode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType <em>Classification Node Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Node Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType
	 * @generated
	 */
	EClass getClassificationNodeQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationNodeFilter <em>Classification Node Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationNodeFilter()
	 * @see #getClassificationNodeQueryType()
	 * @generated
	 */
	EReference getClassificationNodeQueryType_ClassificationNodeFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationSchemeQuery()
	 * @see #getClassificationNodeQueryType()
	 * @generated
	 */
	EReference getClassificationNodeQueryType_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationNodeParentBranch <em>Classification Node Parent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Parent Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationNodeParentBranch()
	 * @see #getClassificationNodeQueryType()
	 * @generated
	 */
	EReference getClassificationNodeQueryType_ClassificationNodeParentBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationNodeChildrenBranch <em>Classification Node Children Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Node Children Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationNodeQueryType#getClassificationNodeChildrenBranch()
	 * @see #getClassificationNodeQueryType()
	 * @generated
	 */
	EReference getClassificationNodeQueryType_ClassificationNodeChildrenBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType <em>Classification Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType
	 * @generated
	 */
	EClass getClassificationQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getGroup()
	 * @see #getClassificationQueryResultType()
	 * @generated
	 */
	EAttribute getClassificationQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getObjectRef()
	 * @see #getClassificationQueryResultType()
	 * @generated
	 */
	EReference getClassificationQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getRegistryObject()
	 * @see #getClassificationQueryResultType()
	 * @generated
	 */
	EReference getClassificationQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryResultType#getClassification()
	 * @see #getClassificationQueryResultType()
	 * @generated
	 */
	EReference getClassificationQueryResultType_Classification();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType <em>Classification Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType
	 * @generated
	 */
	EClass getClassificationQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationFilter <em>Classification Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationFilter()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_ClassificationFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationSchemeQuery()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationNodeQuery <em>Classification Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getClassificationNodeQuery()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_ClassificationNodeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryObjectQuery()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationQueryType#getRegistryEntryQuery()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_RegistryEntryQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType <em>Classification Scheme Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Scheme Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType
	 * @generated
	 */
	EClass getClassificationSchemeQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getGroup()
	 * @see #getClassificationSchemeQueryResultType()
	 * @generated
	 */
	EAttribute getClassificationSchemeQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getObjectRef()
	 * @see #getClassificationSchemeQueryResultType()
	 * @generated
	 */
	EReference getClassificationSchemeQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getRegistryObject()
	 * @see #getClassificationSchemeQueryResultType()
	 * @generated
	 */
	EReference getClassificationSchemeQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getRegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Entry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getRegistryEntry()
	 * @see #getClassificationSchemeQueryResultType()
	 * @generated
	 */
	EReference getClassificationSchemeQueryResultType_RegistryEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getClassificationScheme <em>Classification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryResultType#getClassificationScheme()
	 * @see #getClassificationSchemeQueryResultType()
	 * @generated
	 */
	EReference getClassificationSchemeQueryResultType_ClassificationScheme();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType <em>Classification Scheme Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Scheme Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType
	 * @generated
	 */
	EClass getClassificationSchemeQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassificationSchemeQueryType#getClassificationSchemeFilter()
	 * @see #getClassificationSchemeQueryType()
	 * @generated
	 */
	EReference getClassificationSchemeQueryType_ClassificationSchemeFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType <em>Classified By Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classified By Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType
	 * @generated
	 */
	EClass getClassifiedByBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationFilter <em>Classification Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationFilter()
	 * @see #getClassifiedByBranchType()
	 * @generated
	 */
	EReference getClassifiedByBranchType_ClassificationFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationSchemeQuery()
	 * @see #getClassifiedByBranchType()
	 * @generated
	 */
	EReference getClassifiedByBranchType_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationNodeQuery <em>Classification Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClassifiedByBranchType#getClassificationNodeQuery()
	 * @see #getClassifiedByBranchType()
	 * @generated
	 */
	EReference getClassifiedByBranchType_ClassificationNodeQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType <em>Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType
	 * @generated
	 */
	EClass getClauseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getSimpleClause <em>Simple Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getSimpleClause()
	 * @see #getClauseType()
	 * @generated
	 */
	EReference getClauseType_SimpleClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getCompoundClause <em>Compound Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compound Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ClauseType#getCompoundClause()
	 * @see #getClauseType()
	 * @generated
	 */
	EReference getClauseType_CompoundClause();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType <em>Compound Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Clause Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType
	 * @generated
	 */
	EClass getCompoundClauseType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getClause()
	 * @see #getCompoundClauseType()
	 * @generated
	 */
	EReference getCompoundClauseType_Clause();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getConnectivePredicate <em>Connective Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connective Predicate</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.CompoundClauseType#getConnectivePredicate()
	 * @see #getCompoundClauseType()
	 * @generated
	 */
	EAttribute getCompoundClauseType_ConnectivePredicate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryRequest <em>Adhoc Query Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdhocQueryRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryResponse <em>Adhoc Query Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAdhocQueryResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdhocQueryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationFilter <em>Association Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQuery <em>Association Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQueryResult <em>Association Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAssociationQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventFilter <em>Auditable Event Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditableEventFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQuery <em>Auditable Event Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditableEventQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getAuditableEventQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditableEventQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getBooleanClause <em>Boolean Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getBooleanClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BooleanClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationFilter <em>Classification Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeChildrenBranch <em>Classification Node Children Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Children Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeChildrenBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNodeChildrenBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeFilter <em>Classification Node Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNodeFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeParentBranch <em>Classification Node Parent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Parent Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeParentBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNodeParentBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQuery <em>Classification Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNodeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationNodeQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNodeQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQuery <em>Classification Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQueryResult <em>Classification Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeFilter <em>Classification Scheme Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationSchemeFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassificationSchemeQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationSchemeQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassifiedByBranch <em>Classified By Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classified By Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClassifiedByBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassifiedByBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Clause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getCompoundClause <em>Compound Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compound Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getCompoundClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompoundClause();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDateTimeClause <em>Date Time Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDateTimeClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateTimeClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDescriptionBranch <em>Description Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getDescriptionBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DescriptionBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getEmailAddressFilter <em>Email Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Email Address Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getEmailAddressFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EmailAddressFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalIdentifierFilter <em>External Identifier Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Identifier Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalIdentifierFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalIdentifierFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalLinkFilter <em>External Link Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Link Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExternalLinkFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalLinkFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectFilter <em>Extrinsic Object Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtrinsicObjectFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtrinsicObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getExtrinsicObjectQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtrinsicObjectQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQuery <em>Filter Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQueryResult <em>Filter Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFilterQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterQueryResult();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFloatClause <em>Float Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getFloatClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FloatClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentRequest <em>Get Content Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Content Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetContentRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentResponse <em>Get Content Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Content Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getGetContentResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetContentResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getIntClause <em>Int Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getIntClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IntClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getLocalizedStringFilter <em>Localized String Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized String Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getLocalizedStringFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocalizedStringFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getNameBranch <em>Name Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getNameBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NameBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationChildrenBranch <em>Organization Children Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Children Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationChildrenBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganizationChildrenBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationFilter <em>Organization Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganizationFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationParentBranch <em>Organization Parent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Parent Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationParentBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganizationParentBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQuery <em>Organization Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganizationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQueryResult <em>Organization Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getOrganizationQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganizationQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getPostalAddressFilter <em>Postal Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Address Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getPostalAddressFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostalAddressFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRationalClause <em>Rational Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRationalClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RationalClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryFilter <em>Registry Entry Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryEntryFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQuery <em>Registry Entry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryEntryQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryEntryQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryEntryQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectFilter <em>Registry Object Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObjectFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryObjectQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObjectQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageFilter <em>Registry Package Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryPackageFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQuery <em>Registry Package Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryPackageQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getRegistryPackageQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryPackageQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getResponseOption <em>Response Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Option</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getResponseOption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResponseOption();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingBranch <em>Service Binding Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceBindingBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingFilter <em>Service Binding Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceBindingFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Target Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceBindingTargetBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceBindingTargetBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceFilter <em>Service Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQuery <em>Service Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQueryResult <em>Service Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getServiceQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSimpleClause <em>Simple Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSimpleClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotBranch <em>Slot Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SlotBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotFilter <em>Slot Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SlotFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotValueFilter <em>Slot Value Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Value Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSlotValueFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SlotValueFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSourceAssociationBranch <em>Source Association Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Association Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSourceAssociationBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SourceAssociationBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkBranch <em>Specification Link Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Link Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpecificationLinkBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkFilter <em>Specification Link Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Link Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSpecificationLinkFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpecificationLinkFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SqlQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQueryResult <em>Sql Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getSqlQueryResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SqlQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getStringClause <em>String Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getStringClause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTargetAssociationBranch <em>Target Association Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Association Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTargetAssociationBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TargetAssociationBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTelephoneNumberFilter <em>Telephone Number Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Telephone Number Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getTelephoneNumberFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TelephoneNumberFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserBranch <em>User Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserBranch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserFilter <em>User Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.DocumentRoot#getUserFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType <em>Extrinsic Object Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extrinsic Object Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType
	 * @generated
	 */
	EClass getExtrinsicObjectQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getGroup()
	 * @see #getExtrinsicObjectQueryResultType()
	 * @generated
	 */
	EAttribute getExtrinsicObjectQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getObjectRef()
	 * @see #getExtrinsicObjectQueryResultType()
	 * @generated
	 */
	EReference getExtrinsicObjectQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getRegistryObject()
	 * @see #getExtrinsicObjectQueryResultType()
	 * @generated
	 */
	EReference getExtrinsicObjectQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getRegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Entry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getRegistryEntry()
	 * @see #getExtrinsicObjectQueryResultType()
	 * @generated
	 */
	EReference getExtrinsicObjectQueryResultType_RegistryEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getExtrinsicObject <em>Extrinsic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extrinsic Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryResultType#getExtrinsicObject()
	 * @see #getExtrinsicObjectQueryResultType()
	 * @generated
	 */
	EReference getExtrinsicObjectQueryResultType_ExtrinsicObject();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType <em>Extrinsic Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extrinsic Object Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType
	 * @generated
	 */
	EClass getExtrinsicObjectQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType#getExtrinsicObjectFilter <em>Extrinsic Object Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ExtrinsicObjectQueryType#getExtrinsicObjectFilter()
	 * @see #getExtrinsicObjectQueryType()
	 * @generated
	 */
	EReference getExtrinsicObjectQueryType_ExtrinsicObjectFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType <em>Filter Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType
	 * @generated
	 */
	EClass getFilterQueryResultType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryObjectQueryResult <em>Registry Object Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryObjectQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_RegistryObjectQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryEntryQueryResult <em>Registry Entry Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryEntryQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_RegistryEntryQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAssociationQueryResult <em>Association Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAssociationQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_AssociationQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAuditableEventQueryResult <em>Auditable Event Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getAuditableEventQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_AuditableEventQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationQueryResult <em>Classification Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_ClassificationQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationNodeQueryResult <em>Classification Node Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationNodeQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_ClassificationNodeQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationSchemeQueryResult <em>Classification Scheme Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getClassificationSchemeQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_ClassificationSchemeQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryPackageQueryResult <em>Registry Package Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getRegistryPackageQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_RegistryPackageQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getExtrinsicObjectQueryResult <em>Extrinsic Object Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getExtrinsicObjectQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_ExtrinsicObjectQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getOrganizationQueryResult <em>Organization Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getOrganizationQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_OrganizationQueryResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getServiceQueryResult <em>Service Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Query Result</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryResultType#getServiceQueryResult()
	 * @see #getFilterQueryResultType()
	 * @generated
	 */
	EReference getFilterQueryResultType_ServiceQueryResult();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType <em>Filter Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType
	 * @generated
	 */
	EClass getFilterQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryObjectQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryEntryQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_RegistryEntryQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAssociationQuery <em>Association Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAssociationQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_AssociationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAuditableEventQuery <em>Auditable Event Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getAuditableEventQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_AuditableEventQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationQuery <em>Classification Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_ClassificationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationNodeQuery <em>Classification Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationNodeQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_ClassificationNodeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getClassificationSchemeQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryPackageQuery <em>Registry Package Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getRegistryPackageQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_RegistryPackageQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getExtrinsicObjectQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_ExtrinsicObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getOrganizationQuery <em>Organization Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getOrganizationQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_OrganizationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getServiceQuery <em>Service Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterQueryType#getServiceQuery()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_ServiceQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType#getClause()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Clause();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType <em>Get Content Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Content Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType
	 * @generated
	 */
	EClass getGetContentRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType#getObjectRefList()
	 * @see #getGetContentRequestType()
	 * @generated
	 */
	EReference getGetContentRequestType_ObjectRefList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType <em>Get Content Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Content Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType
	 * @generated
	 */
	EClass getGetContentResponseType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType <em>International String Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International String Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType
	 * @generated
	 */
	EClass getInternationalStringBranchType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType#getLocalizedStringFilter <em>Localized String Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized String Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.InternationalStringBranchType#getLocalizedStringFilter()
	 * @see #getInternationalStringBranchType()
	 * @generated
	 */
	EReference getInternationalStringBranchType_LocalizedStringFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType <em>Organization Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType
	 * @generated
	 */
	EClass getOrganizationQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getGroup()
	 * @see #getOrganizationQueryResultType()
	 * @generated
	 */
	EAttribute getOrganizationQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getObjectRef()
	 * @see #getOrganizationQueryResultType()
	 * @generated
	 */
	EReference getOrganizationQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getRegistryObject()
	 * @see #getOrganizationQueryResultType()
	 * @generated
	 */
	EReference getOrganizationQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryResultType#getOrganization()
	 * @see #getOrganizationQueryResultType()
	 * @generated
	 */
	EReference getOrganizationQueryResultType_Organization();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType <em>Organization Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType
	 * @generated
	 */
	EClass getOrganizationQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationFilter <em>Organization Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationFilter()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_OrganizationFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getPostalAddressFilter <em>Postal Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Address Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getPostalAddressFilter()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_PostalAddressFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getTelephoneNumberFilter()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_TelephoneNumberFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getUserBranch <em>User Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getUserBranch()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_UserBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationParentBranch <em>Organization Parent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Parent Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationParentBranch()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_OrganizationParentBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationChildrenBranch <em>Organization Children Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization Children Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.OrganizationQueryType#getOrganizationChildrenBranch()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_OrganizationChildrenBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType <em>Rational Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rational Clause Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType
	 * @generated
	 */
	EClass getRationalClauseType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getIntClause <em>Int Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getIntClause()
	 * @see #getRationalClauseType()
	 * @generated
	 */
	EAttribute getRationalClauseType_IntClause();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getFloatClause <em>Float Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getFloatClause()
	 * @see #getRationalClauseType()
	 * @generated
	 */
	EAttribute getRationalClauseType_FloatClause();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getDateTimeClause <em>Date Time Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getDateTimeClause()
	 * @see #getRationalClauseType()
	 * @generated
	 */
	EAttribute getRationalClauseType_DateTimeClause();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getLogicalPredicate <em>Logical Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Predicate</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RationalClauseType#getLogicalPredicate()
	 * @see #getRationalClauseType()
	 * @generated
	 */
	EAttribute getRationalClauseType_LogicalPredicate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType <em>Registry Entry Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Entry Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType
	 * @generated
	 */
	EClass getRegistryEntryQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getGroup()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EAttribute getRegistryEntryQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getObjectRef()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EReference getRegistryEntryQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getClassificationScheme <em>Classification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getClassificationScheme()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EReference getRegistryEntryQueryResultType_ClassificationScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getExtrinsicObject <em>Extrinsic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extrinsic Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getExtrinsicObject()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EReference getRegistryEntryQueryResultType_ExtrinsicObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Entry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryEntry()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EReference getRegistryEntryQueryResultType_RegistryEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryObject()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EReference getRegistryEntryQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryPackage <em>Registry Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Package</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getRegistryPackage()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EReference getRegistryEntryQueryResultType_RegistryPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryResultType#getService()
	 * @see #getRegistryEntryQueryResultType()
	 * @generated
	 */
	EReference getRegistryEntryQueryResultType_Service();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType <em>Registry Entry Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Entry Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType
	 * @generated
	 */
	EClass getRegistryEntryQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType#getRegistryEntryFilter <em>Registry Entry Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryEntryQueryType#getRegistryEntryFilter()
	 * @see #getRegistryEntryQueryType()
	 * @generated
	 */
	EReference getRegistryEntryQueryType_RegistryEntryFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType <em>Registry Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Object Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType
	 * @generated
	 */
	EClass getRegistryObjectQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getRegistryObjectFilter <em>Registry Object Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getRegistryObjectFilter()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_RegistryObjectFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getExternalIdentifierFilter <em>External Identifier Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifier Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getExternalIdentifierFilter()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_ExternalIdentifierFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getAuditableEventQuery <em>Auditable Event Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auditable Event Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getAuditableEventQuery()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_AuditableEventQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getNameBranch <em>Name Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getNameBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_NameBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getDescriptionBranch <em>Description Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getDescriptionBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_DescriptionBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getClassifiedByBranch <em>Classified By Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classified By Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getClassifiedByBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_ClassifiedByBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getSlotBranch <em>Slot Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getSlotBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_SlotBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getSourceAssociationBranch <em>Source Association Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Association Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getSourceAssociationBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_SourceAssociationBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getTargetAssociationBranch <em>Target Association Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Association Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryObjectQueryType#getTargetAssociationBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_TargetAssociationBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType <em>Registry Package Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Package Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType
	 * @generated
	 */
	EClass getRegistryPackageQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getGroup()
	 * @see #getRegistryPackageQueryResultType()
	 * @generated
	 */
	EAttribute getRegistryPackageQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getObjectRef()
	 * @see #getRegistryPackageQueryResultType()
	 * @generated
	 */
	EReference getRegistryPackageQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getRegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Entry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getRegistryEntry()
	 * @see #getRegistryPackageQueryResultType()
	 * @generated
	 */
	EReference getRegistryPackageQueryResultType_RegistryEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getRegistryObject()
	 * @see #getRegistryPackageQueryResultType()
	 * @generated
	 */
	EReference getRegistryPackageQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getRegistryPackage <em>Registry Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Package</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryResultType#getRegistryPackage()
	 * @see #getRegistryPackageQueryResultType()
	 * @generated
	 */
	EReference getRegistryPackageQueryResultType_RegistryPackage();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType <em>Registry Package Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Package Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType
	 * @generated
	 */
	EClass getRegistryPackageQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryPackageFilter <em>Registry Package Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryPackageFilter()
	 * @see #getRegistryPackageQueryType()
	 * @generated
	 */
	EReference getRegistryPackageQueryType_RegistryPackageFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryObjectQuery()
	 * @see #getRegistryPackageQueryType()
	 * @generated
	 */
	EReference getRegistryPackageQueryType_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryEntryQuery <em>Registry Entry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Entry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.RegistryPackageQueryType#getRegistryEntryQuery()
	 * @see #getRegistryPackageQueryType()
	 * @generated
	 */
	EReference getRegistryPackageQueryType_RegistryEntryQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType <em>Response Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Option Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType
	 * @generated
	 */
	EClass getResponseOptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#isReturnComposedObjects <em>Return Composed Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Composed Objects</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#isReturnComposedObjects()
	 * @see #getResponseOptionType()
	 * @generated
	 */
	EAttribute getResponseOptionType_ReturnComposedObjects();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ResponseOptionType#getReturnType()
	 * @see #getResponseOptionType()
	 * @generated
	 */
	EAttribute getResponseOptionType_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType <em>Service Binding Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Binding Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType
	 * @generated
	 */
	EClass getServiceBindingBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingFilter <em>Service Binding Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingFilter()
	 * @see #getServiceBindingBranchType()
	 * @generated
	 */
	EReference getServiceBindingBranchType_ServiceBindingFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getSpecificationLinkBranch <em>Specification Link Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Link Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getSpecificationLinkBranch()
	 * @see #getServiceBindingBranchType()
	 * @generated
	 */
	EReference getServiceBindingBranchType_SpecificationLinkBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingTargetBranch <em>Service Binding Target Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Target Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceBindingBranchType#getServiceBindingTargetBranch()
	 * @see #getServiceBindingBranchType()
	 * @generated
	 */
	EReference getServiceBindingBranchType_ServiceBindingTargetBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType <em>Service Query Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Query Result Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType
	 * @generated
	 */
	EClass getServiceQueryResultType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getGroup()
	 * @see #getServiceQueryResultType()
	 * @generated
	 */
	EAttribute getServiceQueryResultType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getObjectRef()
	 * @see #getServiceQueryResultType()
	 * @generated
	 */
	EReference getServiceQueryResultType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getRegistryObject()
	 * @see #getServiceQueryResultType()
	 * @generated
	 */
	EReference getServiceQueryResultType_RegistryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getRegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Entry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getRegistryEntry()
	 * @see #getServiceQueryResultType()
	 * @generated
	 */
	EReference getServiceQueryResultType_RegistryEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryResultType#getService()
	 * @see #getServiceQueryResultType()
	 * @generated
	 */
	EReference getServiceQueryResultType_Service();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType <em>Service Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType
	 * @generated
	 */
	EClass getServiceQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType#getServiceFilter <em>Service Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType#getServiceFilter()
	 * @see #getServiceQueryType()
	 * @generated
	 */
	EReference getServiceQueryType_ServiceFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType#getServiceBindingBranch <em>Service Binding Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Binding Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ServiceQueryType#getServiceBindingBranch()
	 * @see #getServiceQueryType()
	 * @generated
	 */
	EReference getServiceQueryType_ServiceBindingBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType <em>Simple Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Clause Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType
	 * @generated
	 */
	EClass getSimpleClauseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getBooleanClause <em>Boolean Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getBooleanClause()
	 * @see #getSimpleClauseType()
	 * @generated
	 */
	EReference getSimpleClauseType_BooleanClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getRationalClause <em>Rational Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getRationalClause()
	 * @see #getSimpleClauseType()
	 * @generated
	 */
	EReference getSimpleClauseType_RationalClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getStringClause <em>String Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Clause</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getStringClause()
	 * @see #getSimpleClauseType()
	 * @generated
	 */
	EReference getSimpleClauseType_StringClause();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getLeftArgument <em>Left Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Argument</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SimpleClauseType#getLeftArgument()
	 * @see #getSimpleClauseType()
	 * @generated
	 */
	EAttribute getSimpleClauseType_LeftArgument();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType <em>Slot Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType
	 * @generated
	 */
	EClass getSlotBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType#getSlotFilter <em>Slot Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType#getSlotFilter()
	 * @see #getSlotBranchType()
	 * @generated
	 */
	EReference getSlotBranchType_SlotFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType#getSlotValueFilter <em>Slot Value Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot Value Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType#getSlotValueFilter()
	 * @see #getSlotBranchType()
	 * @generated
	 */
	EReference getSlotBranchType_SlotValueFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType <em>Specification Link Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Link Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType
	 * @generated
	 */
	EClass getSpecificationLinkBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType#getSpecificationLinkFilter <em>Specification Link Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Link Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType#getSpecificationLinkFilter()
	 * @see #getSpecificationLinkBranchType()
	 * @generated
	 */
	EReference getSpecificationLinkBranchType_SpecificationLinkFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType#getRegistryObjectQuery()
	 * @see #getSpecificationLinkBranchType()
	 * @generated
	 */
	EReference getSpecificationLinkBranchType_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType#getRegistryEntryQuery <em>Registry Entry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.SpecificationLinkBranchType#getRegistryEntryQuery()
	 * @see #getSpecificationLinkBranchType()
	 * @generated
	 */
	EReference getSpecificationLinkBranchType_RegistryEntryQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType <em>String Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Clause Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType
	 * @generated
	 */
	EClass getStringClauseType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getValue()
	 * @see #getStringClauseType()
	 * @generated
	 */
	EAttribute getStringClauseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getStringPredicate <em>String Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Predicate</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringClauseType#getStringPredicate()
	 * @see #getStringClauseType()
	 * @generated
	 */
	EAttribute getStringClauseType_StringPredicate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType <em>User Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType
	 * @generated
	 */
	EClass getUserBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getUserFilter <em>User Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getUserFilter()
	 * @see #getUserBranchType()
	 * @generated
	 */
	EReference getUserBranchType_UserFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getPostalAddressFilter <em>Postal Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Address Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getPostalAddressFilter()
	 * @see #getUserBranchType()
	 * @generated
	 */
	EReference getUserBranchType_PostalAddressFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getTelephoneNumberFilter()
	 * @see #getUserBranchType()
	 * @generated
	 */
	EReference getUserBranchType_TelephoneNumberFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getEmailAddressFilter <em>Email Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Address Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getEmailAddressFilter()
	 * @see #getUserBranchType()
	 * @generated
	 */
	EReference getUserBranchType_EmailAddressFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getOrganizationQuery <em>Organization Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.UserBranchType#getOrganizationQuery()
	 * @see #getUserBranchType()
	 * @generated
	 */
	EReference getUserBranchType_OrganizationQuery();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType <em>Connective Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connective Predicate Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
	 * @generated
	 */
	EEnum getConnectivePredicateType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType <em>Logical Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Predicate Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
	 * @generated
	 */
	EEnum getLogicalPredicateType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType <em>Return Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Type Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
	 * @generated
	 */
	EEnum getReturnTypeType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType <em>String Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Predicate Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
	 * @generated
	 */
	EEnum getStringPredicateType();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType <em>Connective Predicate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connective Predicate Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType"
	 *        extendedMetaData="name='connectivePredicate_._type:Object' baseType='connectivePredicate_._type'" 
	 * @generated
	 */
	EDataType getConnectivePredicateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType <em>Logical Predicate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Logical Predicate Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType"
	 *        extendedMetaData="name='logicalPredicate_._type:Object' baseType='logicalPredicate_._type'" 
	 * @generated
	 */
	EDataType getLogicalPredicateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType <em>Return Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Return Type Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType"
	 *        extendedMetaData="name='returnType_._type:Object' baseType='returnType_._type'" 
	 * @generated
	 */
	EDataType getReturnTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType <em>String Predicate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Predicate Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType"
	 *        extendedMetaData="name='stringPredicate_._type:Object' baseType='stringPredicate_._type'" 
	 * @generated
	 */
	EDataType getStringPredicateTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryRequestTypeImpl <em>Adhoc Query Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAdhocQueryRequestType()
		 * @generated
		 */
		EClass ADHOC_QUERY_REQUEST_TYPE = eINSTANCE.getAdhocQueryRequestType();

		/**
		 * The meta object literal for the '<em><b>Response Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION = eINSTANCE.getAdhocQueryRequestType_ResponseOption();

		/**
		 * The meta object literal for the '<em><b>Filter Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_REQUEST_TYPE__FILTER_QUERY = eINSTANCE.getAdhocQueryRequestType_FilterQuery();

		/**
		 * The meta object literal for the '<em><b>SQL Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADHOC_QUERY_REQUEST_TYPE__SQL_QUERY = eINSTANCE.getAdhocQueryRequestType_SQLQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryResponseTypeImpl <em>Adhoc Query Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AdhocQueryResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAdhocQueryResponseType()
		 * @generated
		 */
		EClass ADHOC_QUERY_RESPONSE_TYPE = eINSTANCE.getAdhocQueryResponseType();

		/**
		 * The meta object literal for the '<em><b>Filter Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_RESPONSE_TYPE__FILTER_QUERY_RESULT = eINSTANCE.getAdhocQueryResponseType_FilterQueryResult();

		/**
		 * The meta object literal for the '<em><b>SQL Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_RESPONSE_TYPE__SQL_QUERY_RESULT = eINSTANCE.getAdhocQueryResponseType_SQLQueryResult();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationBranchTypeImpl <em>Association Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAssociationBranchType()
		 * @generated
		 */
		EClass ASSOCIATION_BRANCH_TYPE = eINSTANCE.getAssociationBranchType();

		/**
		 * The meta object literal for the '<em><b>Association Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__ASSOCIATION_FILTER = eINSTANCE.getAssociationBranchType_AssociationFilter();

		/**
		 * The meta object literal for the '<em><b>External Link Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__EXTERNAL_LINK_FILTER = eINSTANCE.getAssociationBranchType_ExternalLinkFilter();

		/**
		 * The meta object literal for the '<em><b>External Identifier Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__EXTERNAL_IDENTIFIER_FILTER = eINSTANCE.getAssociationBranchType_ExternalIdentifierFilter();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getAssociationBranchType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__REGISTRY_ENTRY_QUERY = eINSTANCE.getAssociationBranchType_RegistryEntryQuery();

		/**
		 * The meta object literal for the '<em><b>Association Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__ASSOCIATION_QUERY = eINSTANCE.getAssociationBranchType_AssociationQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_QUERY = eINSTANCE.getAssociationBranchType_ClassificationQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getAssociationBranchType_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__CLASSIFICATION_NODE_QUERY = eINSTANCE.getAssociationBranchType_ClassificationNodeQuery();

		/**
		 * The meta object literal for the '<em><b>Organization Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__ORGANIZATION_QUERY = eINSTANCE.getAssociationBranchType_OrganizationQuery();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__AUDITABLE_EVENT_QUERY = eINSTANCE.getAssociationBranchType_AuditableEventQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Package Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__REGISTRY_PACKAGE_QUERY = eINSTANCE.getAssociationBranchType_RegistryPackageQuery();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__EXTRINSIC_OBJECT_QUERY = eINSTANCE.getAssociationBranchType_ExtrinsicObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Service Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__SERVICE_QUERY = eINSTANCE.getAssociationBranchType_ServiceQuery();

		/**
		 * The meta object literal for the '<em><b>User Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__USER_BRANCH = eINSTANCE.getAssociationBranchType_UserBranch();

		/**
		 * The meta object literal for the '<em><b>Service Binding Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__SERVICE_BINDING_BRANCH = eINSTANCE.getAssociationBranchType_ServiceBindingBranch();

		/**
		 * The meta object literal for the '<em><b>Specification Link Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH = eINSTANCE.getAssociationBranchType_SpecificationLinkBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryResultTypeImpl <em>Association Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAssociationQueryResultType()
		 * @generated
		 */
		EClass ASSOCIATION_QUERY_RESULT_TYPE = eINSTANCE.getAssociationQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getAssociationQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getAssociationQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getAssociationQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_QUERY_RESULT_TYPE__ASSOCIATION = eINSTANCE.getAssociationQueryResultType_Association();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryTypeImpl <em>Association Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AssociationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAssociationQueryType()
		 * @generated
		 */
		EClass ASSOCIATION_QUERY_TYPE = eINSTANCE.getAssociationQueryType();

		/**
		 * The meta object literal for the '<em><b>Association Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_QUERY_TYPE__ASSOCIATION_FILTER = eINSTANCE.getAssociationQueryType_AssociationFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryResultTypeImpl <em>Auditable Event Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAuditableEventQueryResultType()
		 * @generated
		 */
		EClass AUDITABLE_EVENT_QUERY_RESULT_TYPE = eINSTANCE.getAuditableEventQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE_EVENT_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getAuditableEventQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getAuditableEventQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getAuditableEventQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Auditable Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_RESULT_TYPE__AUDITABLE_EVENT = eINSTANCE.getAuditableEventQueryResultType_AuditableEvent();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl <em>Auditable Event Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.AuditableEventQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getAuditableEventQueryType()
		 * @generated
		 */
		EClass AUDITABLE_EVENT_QUERY_TYPE = eINSTANCE.getAuditableEventQueryType();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_TYPE__AUDITABLE_EVENT_FILTER = eINSTANCE.getAuditableEventQueryType_AuditableEventFilter();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getAuditableEventQueryType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_TYPE__REGISTRY_ENTRY_QUERY = eINSTANCE.getAuditableEventQueryType_RegistryEntryQuery();

		/**
		 * The meta object literal for the '<em><b>User Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_TYPE__USER_BRANCH = eINSTANCE.getAuditableEventQueryType_UserBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.BooleanClauseTypeImpl <em>Boolean Clause Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.BooleanClauseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getBooleanClauseType()
		 * @generated
		 */
		EClass BOOLEAN_CLAUSE_TYPE = eINSTANCE.getBooleanClauseType();

		/**
		 * The meta object literal for the '<em><b>Boolean Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CLAUSE_TYPE__BOOLEAN_PREDICATE = eINSTANCE.getBooleanClauseType_BooleanPredicate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryResultTypeImpl <em>Classification Node Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationNodeQueryResultType()
		 * @generated
		 */
		EClass CLASSIFICATION_NODE_QUERY_RESULT_TYPE = eINSTANCE.getClassificationNodeQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_NODE_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getClassificationNodeQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getClassificationNodeQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getClassificationNodeQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Classification Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_RESULT_TYPE__CLASSIFICATION_NODE = eINSTANCE.getClassificationNodeQueryResultType_ClassificationNode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl <em>Classification Node Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationNodeQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationNodeQueryType()
		 * @generated
		 */
		EClass CLASSIFICATION_NODE_QUERY_TYPE = eINSTANCE.getClassificationNodeQueryType();

		/**
		 * The meta object literal for the '<em><b>Classification Node Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_FILTER = eINSTANCE.getClassificationNodeQueryType_ClassificationNodeFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getClassificationNodeQueryType_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Node Parent Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_PARENT_BRANCH = eINSTANCE.getClassificationNodeQueryType_ClassificationNodeParentBranch();

		/**
		 * The meta object literal for the '<em><b>Classification Node Children Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_NODE_CHILDREN_BRANCH = eINSTANCE.getClassificationNodeQueryType_ClassificationNodeChildrenBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryResultTypeImpl <em>Classification Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationQueryResultType()
		 * @generated
		 */
		EClass CLASSIFICATION_QUERY_RESULT_TYPE = eINSTANCE.getClassificationQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getClassificationQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getClassificationQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getClassificationQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_RESULT_TYPE__CLASSIFICATION = eINSTANCE.getClassificationQueryResultType_Classification();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl <em>Classification Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationQueryType()
		 * @generated
		 */
		EClass CLASSIFICATION_QUERY_TYPE = eINSTANCE.getClassificationQueryType();

		/**
		 * The meta object literal for the '<em><b>Classification Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_FILTER = eINSTANCE.getClassificationQueryType_ClassificationFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getClassificationQueryType_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY = eINSTANCE.getClassificationQueryType_ClassificationNodeQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getClassificationQueryType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__REGISTRY_ENTRY_QUERY = eINSTANCE.getClassificationQueryType_RegistryEntryQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryResultTypeImpl <em>Classification Scheme Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationSchemeQueryResultType()
		 * @generated
		 */
		EClass CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE = eINSTANCE.getClassificationSchemeQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getClassificationSchemeQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getClassificationSchemeQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getClassificationSchemeQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Registry Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__REGISTRY_ENTRY = eINSTANCE.getClassificationSchemeQueryResultType_RegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME = eINSTANCE.getClassificationSchemeQueryResultType_ClassificationScheme();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryTypeImpl <em>Classification Scheme Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassificationSchemeQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassificationSchemeQueryType()
		 * @generated
		 */
		EClass CLASSIFICATION_SCHEME_QUERY_TYPE = eINSTANCE.getClassificationSchemeQueryType();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_SCHEME_FILTER = eINSTANCE.getClassificationSchemeQueryType_ClassificationSchemeFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassifiedByBranchTypeImpl <em>Classified By Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClassifiedByBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClassifiedByBranchType()
		 * @generated
		 */
		EClass CLASSIFIED_BY_BRANCH_TYPE = eINSTANCE.getClassifiedByBranchType();

		/**
		 * The meta object literal for the '<em><b>Classification Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_FILTER = eINSTANCE.getClassifiedByBranchType_ClassificationFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getClassifiedByBranchType_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIED_BY_BRANCH_TYPE__CLASSIFICATION_NODE_QUERY = eINSTANCE.getClassifiedByBranchType_ClassificationNodeQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClauseTypeImpl <em>Clause Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ClauseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getClauseType()
		 * @generated
		 */
		EClass CLAUSE_TYPE = eINSTANCE.getClauseType();

		/**
		 * The meta object literal for the '<em><b>Simple Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE_TYPE__SIMPLE_CLAUSE = eINSTANCE.getClauseType_SimpleClause();

		/**
		 * The meta object literal for the '<em><b>Compound Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE_TYPE__COMPOUND_CLAUSE = eINSTANCE.getClauseType_CompoundClause();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.CompoundClauseTypeImpl <em>Compound Clause Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.CompoundClauseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getCompoundClauseType()
		 * @generated
		 */
		EClass COMPOUND_CLAUSE_TYPE = eINSTANCE.getCompoundClauseType();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_CLAUSE_TYPE__CLAUSE = eINSTANCE.getCompoundClauseType_Clause();

		/**
		 * The meta object literal for the '<em><b>Connective Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_CLAUSE_TYPE__CONNECTIVE_PREDICATE = eINSTANCE.getCompoundClauseType_ConnectivePredicate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Adhoc Query Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADHOC_QUERY_REQUEST = eINSTANCE.getDocumentRoot_AdhocQueryRequest();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE = eINSTANCE.getDocumentRoot_AdhocQueryResponse();

		/**
		 * The meta object literal for the '<em><b>Association Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_FILTER = eINSTANCE.getDocumentRoot_AssociationFilter();

		/**
		 * The meta object literal for the '<em><b>Association Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_QUERY = eINSTANCE.getDocumentRoot_AssociationQuery();

		/**
		 * The meta object literal for the '<em><b>Association Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_QUERY_RESULT = eINSTANCE.getDocumentRoot_AssociationQueryResult();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDITABLE_EVENT_FILTER = eINSTANCE.getDocumentRoot_AuditableEventFilter();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY = eINSTANCE.getDocumentRoot_AuditableEventQuery();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY_RESULT = eINSTANCE.getDocumentRoot_AuditableEventQueryResult();

		/**
		 * The meta object literal for the '<em><b>Boolean Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOLEAN_CLAUSE = eINSTANCE.getDocumentRoot_BooleanClause();

		/**
		 * The meta object literal for the '<em><b>Classification Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_FILTER = eINSTANCE.getDocumentRoot_ClassificationFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Node Children Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_NODE_CHILDREN_BRANCH = eINSTANCE.getDocumentRoot_ClassificationNodeChildrenBranch();

		/**
		 * The meta object literal for the '<em><b>Classification Node Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_NODE_FILTER = eINSTANCE.getDocumentRoot_ClassificationNodeFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Node Parent Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_NODE_PARENT_BRANCH = eINSTANCE.getDocumentRoot_ClassificationNodeParentBranch();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY = eINSTANCE.getDocumentRoot_ClassificationNodeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY_RESULT = eINSTANCE.getDocumentRoot_ClassificationNodeQueryResult();

		/**
		 * The meta object literal for the '<em><b>Classification Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_QUERY = eINSTANCE.getDocumentRoot_ClassificationQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_QUERY_RESULT = eINSTANCE.getDocumentRoot_ClassificationQueryResult();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_SCHEME_FILTER = eINSTANCE.getDocumentRoot_ClassificationSchemeFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getDocumentRoot_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY_RESULT = eINSTANCE.getDocumentRoot_ClassificationSchemeQueryResult();

		/**
		 * The meta object literal for the '<em><b>Classified By Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFIED_BY_BRANCH = eINSTANCE.getDocumentRoot_ClassifiedByBranch();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLAUSE = eINSTANCE.getDocumentRoot_Clause();

		/**
		 * The meta object literal for the '<em><b>Compound Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPOUND_CLAUSE = eINSTANCE.getDocumentRoot_CompoundClause();

		/**
		 * The meta object literal for the '<em><b>Date Time Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE_TIME_CLAUSE = eINSTANCE.getDocumentRoot_DateTimeClause();

		/**
		 * The meta object literal for the '<em><b>Description Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION_BRANCH = eINSTANCE.getDocumentRoot_DescriptionBranch();

		/**
		 * The meta object literal for the '<em><b>Email Address Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMAIL_ADDRESS_FILTER = eINSTANCE.getDocumentRoot_EmailAddressFilter();

		/**
		 * The meta object literal for the '<em><b>External Identifier Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_FILTER = eINSTANCE.getDocumentRoot_ExternalIdentifierFilter();

		/**
		 * The meta object literal for the '<em><b>External Link Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_LINK_FILTER = eINSTANCE.getDocumentRoot_ExternalLinkFilter();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTRINSIC_OBJECT_FILTER = eINSTANCE.getDocumentRoot_ExtrinsicObjectFilter();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY = eINSTANCE.getDocumentRoot_ExtrinsicObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY_RESULT = eINSTANCE.getDocumentRoot_ExtrinsicObjectQueryResult();

		/**
		 * The meta object literal for the '<em><b>Filter Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER_QUERY = eINSTANCE.getDocumentRoot_FilterQuery();

		/**
		 * The meta object literal for the '<em><b>Filter Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER_QUERY_RESULT = eINSTANCE.getDocumentRoot_FilterQueryResult();

		/**
		 * The meta object literal for the '<em><b>Float Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FLOAT_CLAUSE = eINSTANCE.getDocumentRoot_FloatClause();

		/**
		 * The meta object literal for the '<em><b>Get Content Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CONTENT_REQUEST = eINSTANCE.getDocumentRoot_GetContentRequest();

		/**
		 * The meta object literal for the '<em><b>Get Content Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CONTENT_RESPONSE = eINSTANCE.getDocumentRoot_GetContentResponse();

		/**
		 * The meta object literal for the '<em><b>Int Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INT_CLAUSE = eINSTANCE.getDocumentRoot_IntClause();

		/**
		 * The meta object literal for the '<em><b>Localized String Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCALIZED_STRING_FILTER = eINSTANCE.getDocumentRoot_LocalizedStringFilter();

		/**
		 * The meta object literal for the '<em><b>Name Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAME_BRANCH = eINSTANCE.getDocumentRoot_NameBranch();

		/**
		 * The meta object literal for the '<em><b>Organization Children Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION_CHILDREN_BRANCH = eINSTANCE.getDocumentRoot_OrganizationChildrenBranch();

		/**
		 * The meta object literal for the '<em><b>Organization Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION_FILTER = eINSTANCE.getDocumentRoot_OrganizationFilter();

		/**
		 * The meta object literal for the '<em><b>Organization Parent Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION_PARENT_BRANCH = eINSTANCE.getDocumentRoot_OrganizationParentBranch();

		/**
		 * The meta object literal for the '<em><b>Organization Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION_QUERY = eINSTANCE.getDocumentRoot_OrganizationQuery();

		/**
		 * The meta object literal for the '<em><b>Organization Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION_QUERY_RESULT = eINSTANCE.getDocumentRoot_OrganizationQueryResult();

		/**
		 * The meta object literal for the '<em><b>Postal Address Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POSTAL_ADDRESS_FILTER = eINSTANCE.getDocumentRoot_PostalAddressFilter();

		/**
		 * The meta object literal for the '<em><b>Rational Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RATIONAL_CLAUSE = eINSTANCE.getDocumentRoot_RationalClause();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_ENTRY_FILTER = eINSTANCE.getDocumentRoot_RegistryEntryFilter();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY = eINSTANCE.getDocumentRoot_RegistryEntryQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_ENTRY_QUERY_RESULT = eINSTANCE.getDocumentRoot_RegistryEntryQueryResult();

		/**
		 * The meta object literal for the '<em><b>Registry Object Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_OBJECT_FILTER = eINSTANCE.getDocumentRoot_RegistryObjectFilter();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY = eINSTANCE.getDocumentRoot_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY_RESULT = eINSTANCE.getDocumentRoot_RegistryObjectQueryResult();

		/**
		 * The meta object literal for the '<em><b>Registry Package Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_PACKAGE_FILTER = eINSTANCE.getDocumentRoot_RegistryPackageFilter();

		/**
		 * The meta object literal for the '<em><b>Registry Package Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY = eINSTANCE.getDocumentRoot_RegistryPackageQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Package Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY_RESULT = eINSTANCE.getDocumentRoot_RegistryPackageQueryResult();

		/**
		 * The meta object literal for the '<em><b>Response Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESPONSE_OPTION = eINSTANCE.getDocumentRoot_ResponseOption();

		/**
		 * The meta object literal for the '<em><b>Service Binding Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_BINDING_BRANCH = eINSTANCE.getDocumentRoot_ServiceBindingBranch();

		/**
		 * The meta object literal for the '<em><b>Service Binding Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_BINDING_FILTER = eINSTANCE.getDocumentRoot_ServiceBindingFilter();

		/**
		 * The meta object literal for the '<em><b>Service Binding Target Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_BINDING_TARGET_BRANCH = eINSTANCE.getDocumentRoot_ServiceBindingTargetBranch();

		/**
		 * The meta object literal for the '<em><b>Service Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_FILTER = eINSTANCE.getDocumentRoot_ServiceFilter();

		/**
		 * The meta object literal for the '<em><b>Service Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_QUERY = eINSTANCE.getDocumentRoot_ServiceQuery();

		/**
		 * The meta object literal for the '<em><b>Service Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_QUERY_RESULT = eINSTANCE.getDocumentRoot_ServiceQueryResult();

		/**
		 * The meta object literal for the '<em><b>Simple Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE_CLAUSE = eINSTANCE.getDocumentRoot_SimpleClause();

		/**
		 * The meta object literal for the '<em><b>Slot Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SLOT_BRANCH = eINSTANCE.getDocumentRoot_SlotBranch();

		/**
		 * The meta object literal for the '<em><b>Slot Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SLOT_FILTER = eINSTANCE.getDocumentRoot_SlotFilter();

		/**
		 * The meta object literal for the '<em><b>Slot Value Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SLOT_VALUE_FILTER = eINSTANCE.getDocumentRoot_SlotValueFilter();

		/**
		 * The meta object literal for the '<em><b>Source Association Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCE_ASSOCIATION_BRANCH = eINSTANCE.getDocumentRoot_SourceAssociationBranch();

		/**
		 * The meta object literal for the '<em><b>Specification Link Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIFICATION_LINK_BRANCH = eINSTANCE.getDocumentRoot_SpecificationLinkBranch();

		/**
		 * The meta object literal for the '<em><b>Specification Link Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIFICATION_LINK_FILTER = eINSTANCE.getDocumentRoot_SpecificationLinkFilter();

		/**
		 * The meta object literal for the '<em><b>Sql Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SQL_QUERY = eINSTANCE.getDocumentRoot_SqlQuery();

		/**
		 * The meta object literal for the '<em><b>Sql Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SQL_QUERY_RESULT = eINSTANCE.getDocumentRoot_SqlQueryResult();

		/**
		 * The meta object literal for the '<em><b>String Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRING_CLAUSE = eINSTANCE.getDocumentRoot_StringClause();

		/**
		 * The meta object literal for the '<em><b>Target Association Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TARGET_ASSOCIATION_BRANCH = eINSTANCE.getDocumentRoot_TargetAssociationBranch();

		/**
		 * The meta object literal for the '<em><b>Telephone Number Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TELEPHONE_NUMBER_FILTER = eINSTANCE.getDocumentRoot_TelephoneNumberFilter();

		/**
		 * The meta object literal for the '<em><b>User Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_BRANCH = eINSTANCE.getDocumentRoot_UserBranch();

		/**
		 * The meta object literal for the '<em><b>User Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_FILTER = eINSTANCE.getDocumentRoot_UserFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryResultTypeImpl <em>Extrinsic Object Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getExtrinsicObjectQueryResultType()
		 * @generated
		 */
		EClass EXTRINSIC_OBJECT_QUERY_RESULT_TYPE = eINSTANCE.getExtrinsicObjectQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getExtrinsicObjectQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getExtrinsicObjectQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getExtrinsicObjectQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Registry Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__REGISTRY_ENTRY = eINSTANCE.getExtrinsicObjectQueryResultType_RegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRINSIC_OBJECT_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT = eINSTANCE.getExtrinsicObjectQueryResultType_ExtrinsicObject();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryTypeImpl <em>Extrinsic Object Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ExtrinsicObjectQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getExtrinsicObjectQueryType()
		 * @generated
		 */
		EClass EXTRINSIC_OBJECT_QUERY_TYPE = eINSTANCE.getExtrinsicObjectQueryType();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRINSIC_OBJECT_QUERY_TYPE__EXTRINSIC_OBJECT_FILTER = eINSTANCE.getExtrinsicObjectQueryType_ExtrinsicObjectFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl <em>Filter Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getFilterQueryResultType()
		 * @generated
		 */
		EClass FILTER_QUERY_RESULT_TYPE = eINSTANCE.getFilterQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__REGISTRY_OBJECT_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_RegistryObjectQueryResult();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__REGISTRY_ENTRY_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_RegistryEntryQueryResult();

		/**
		 * The meta object literal for the '<em><b>Association Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__ASSOCIATION_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_AssociationQueryResult();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__AUDITABLE_EVENT_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_AuditableEventQueryResult();

		/**
		 * The meta object literal for the '<em><b>Classification Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_ClassificationQueryResult();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_NODE_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_ClassificationNodeQueryResult();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_ClassificationSchemeQueryResult();

		/**
		 * The meta object literal for the '<em><b>Registry Package Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__REGISTRY_PACKAGE_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_RegistryPackageQueryResult();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_ExtrinsicObjectQueryResult();

		/**
		 * The meta object literal for the '<em><b>Organization Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__ORGANIZATION_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_OrganizationQueryResult();

		/**
		 * The meta object literal for the '<em><b>Service Query Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_RESULT_TYPE__SERVICE_QUERY_RESULT = eINSTANCE.getFilterQueryResultType_ServiceQueryResult();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl <em>Filter Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getFilterQueryType()
		 * @generated
		 */
		EClass FILTER_QUERY_TYPE = eINSTANCE.getFilterQueryType();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getFilterQueryType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__REGISTRY_ENTRY_QUERY = eINSTANCE.getFilterQueryType_RegistryEntryQuery();

		/**
		 * The meta object literal for the '<em><b>Association Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__ASSOCIATION_QUERY = eINSTANCE.getFilterQueryType_AssociationQuery();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__AUDITABLE_EVENT_QUERY = eINSTANCE.getFilterQueryType_AuditableEventQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__CLASSIFICATION_QUERY = eINSTANCE.getFilterQueryType_ClassificationQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__CLASSIFICATION_NODE_QUERY = eINSTANCE.getFilterQueryType_ClassificationNodeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getFilterQueryType_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Package Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__REGISTRY_PACKAGE_QUERY = eINSTANCE.getFilterQueryType_RegistryPackageQuery();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__EXTRINSIC_OBJECT_QUERY = eINSTANCE.getFilterQueryType_ExtrinsicObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Organization Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__ORGANIZATION_QUERY = eINSTANCE.getFilterQueryType_OrganizationQuery();

		/**
		 * The meta object literal for the '<em><b>Service Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__SERVICE_QUERY = eINSTANCE.getFilterQueryType_ServiceQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterTypeImpl <em>Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.FilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getFilterType()
		 * @generated
		 */
		EClass FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__CLAUSE = eINSTANCE.getFilterType_Clause();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentRequestTypeImpl <em>Get Content Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getGetContentRequestType()
		 * @generated
		 */
		EClass GET_CONTENT_REQUEST_TYPE = eINSTANCE.getGetContentRequestType();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_CONTENT_REQUEST_TYPE__OBJECT_REF_LIST = eINSTANCE.getGetContentRequestType_ObjectRefList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentResponseTypeImpl <em>Get Content Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.GetContentResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getGetContentResponseType()
		 * @generated
		 */
		EClass GET_CONTENT_RESPONSE_TYPE = eINSTANCE.getGetContentResponseType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.InternationalStringBranchTypeImpl <em>International String Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.InternationalStringBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getInternationalStringBranchType()
		 * @generated
		 */
		EClass INTERNATIONAL_STRING_BRANCH_TYPE = eINSTANCE.getInternationalStringBranchType();

		/**
		 * The meta object literal for the '<em><b>Localized String Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER = eINSTANCE.getInternationalStringBranchType_LocalizedStringFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryResultTypeImpl <em>Organization Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getOrganizationQueryResultType()
		 * @generated
		 */
		EClass ORGANIZATION_QUERY_RESULT_TYPE = eINSTANCE.getOrganizationQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getOrganizationQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getOrganizationQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getOrganizationQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_RESULT_TYPE__ORGANIZATION = eINSTANCE.getOrganizationQueryResultType_Organization();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl <em>Organization Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.OrganizationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getOrganizationQueryType()
		 * @generated
		 */
		EClass ORGANIZATION_QUERY_TYPE = eINSTANCE.getOrganizationQueryType();

		/**
		 * The meta object literal for the '<em><b>Organization Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__ORGANIZATION_FILTER = eINSTANCE.getOrganizationQueryType_OrganizationFilter();

		/**
		 * The meta object literal for the '<em><b>Postal Address Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__POSTAL_ADDRESS_FILTER = eINSTANCE.getOrganizationQueryType_PostalAddressFilter();

		/**
		 * The meta object literal for the '<em><b>Telephone Number Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER = eINSTANCE.getOrganizationQueryType_TelephoneNumberFilter();

		/**
		 * The meta object literal for the '<em><b>User Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__USER_BRANCH = eINSTANCE.getOrganizationQueryType_UserBranch();

		/**
		 * The meta object literal for the '<em><b>Organization Parent Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__ORGANIZATION_PARENT_BRANCH = eINSTANCE.getOrganizationQueryType_OrganizationParentBranch();

		/**
		 * The meta object literal for the '<em><b>Organization Children Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__ORGANIZATION_CHILDREN_BRANCH = eINSTANCE.getOrganizationQueryType_OrganizationChildrenBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl <em>Rational Clause Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RationalClauseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRationalClauseType()
		 * @generated
		 */
		EClass RATIONAL_CLAUSE_TYPE = eINSTANCE.getRationalClauseType();

		/**
		 * The meta object literal for the '<em><b>Int Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_CLAUSE_TYPE__INT_CLAUSE = eINSTANCE.getRationalClauseType_IntClause();

		/**
		 * The meta object literal for the '<em><b>Float Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_CLAUSE_TYPE__FLOAT_CLAUSE = eINSTANCE.getRationalClauseType_FloatClause();

		/**
		 * The meta object literal for the '<em><b>Date Time Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_CLAUSE_TYPE__DATE_TIME_CLAUSE = eINSTANCE.getRationalClauseType_DateTimeClause();

		/**
		 * The meta object literal for the '<em><b>Logical Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_CLAUSE_TYPE__LOGICAL_PREDICATE = eINSTANCE.getRationalClauseType_LogicalPredicate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryResultTypeImpl <em>Registry Entry Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryEntryQueryResultType()
		 * @generated
		 */
		EClass REGISTRY_ENTRY_QUERY_RESULT_TYPE = eINSTANCE.getRegistryEntryQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getRegistryEntryQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getRegistryEntryQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_RESULT_TYPE__CLASSIFICATION_SCHEME = eINSTANCE.getRegistryEntryQueryResultType_ClassificationScheme();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_RESULT_TYPE__EXTRINSIC_OBJECT = eINSTANCE.getRegistryEntryQueryResultType_ExtrinsicObject();

		/**
		 * The meta object literal for the '<em><b>Registry Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_ENTRY = eINSTANCE.getRegistryEntryQueryResultType_RegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getRegistryEntryQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Registry Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_RESULT_TYPE__REGISTRY_PACKAGE = eINSTANCE.getRegistryEntryQueryResultType_RegistryPackage();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_RESULT_TYPE__SERVICE = eINSTANCE.getRegistryEntryQueryResultType_Service();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryTypeImpl <em>Registry Entry Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryEntryQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryEntryQueryType()
		 * @generated
		 */
		EClass REGISTRY_ENTRY_QUERY_TYPE = eINSTANCE.getRegistryEntryQueryType();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_ENTRY_QUERY_TYPE__REGISTRY_ENTRY_FILTER = eINSTANCE.getRegistryEntryQueryType_RegistryEntryFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl <em>Registry Object Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryObjectQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryObjectQueryType()
		 * @generated
		 */
		EClass REGISTRY_OBJECT_QUERY_TYPE = eINSTANCE.getRegistryObjectQueryType();

		/**
		 * The meta object literal for the '<em><b>Registry Object Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__REGISTRY_OBJECT_FILTER = eINSTANCE.getRegistryObjectQueryType_RegistryObjectFilter();

		/**
		 * The meta object literal for the '<em><b>External Identifier Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_FILTER = eINSTANCE.getRegistryObjectQueryType_ExternalIdentifierFilter();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__AUDITABLE_EVENT_QUERY = eINSTANCE.getRegistryObjectQueryType_AuditableEventQuery();

		/**
		 * The meta object literal for the '<em><b>Name Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH = eINSTANCE.getRegistryObjectQueryType_NameBranch();

		/**
		 * The meta object literal for the '<em><b>Description Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH = eINSTANCE.getRegistryObjectQueryType_DescriptionBranch();

		/**
		 * The meta object literal for the '<em><b>Classified By Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__CLASSIFIED_BY_BRANCH = eINSTANCE.getRegistryObjectQueryType_ClassifiedByBranch();

		/**
		 * The meta object literal for the '<em><b>Slot Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH = eINSTANCE.getRegistryObjectQueryType_SlotBranch();

		/**
		 * The meta object literal for the '<em><b>Source Association Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_BRANCH = eINSTANCE.getRegistryObjectQueryType_SourceAssociationBranch();

		/**
		 * The meta object literal for the '<em><b>Target Association Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_BRANCH = eINSTANCE.getRegistryObjectQueryType_TargetAssociationBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl <em>Registry Package Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryPackageQueryResultType()
		 * @generated
		 */
		EClass REGISTRY_PACKAGE_QUERY_RESULT_TYPE = eINSTANCE.getRegistryPackageQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_PACKAGE_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getRegistryPackageQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getRegistryPackageQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_ENTRY = eINSTANCE.getRegistryPackageQueryResultType_RegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getRegistryPackageQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Registry Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_RESULT_TYPE__REGISTRY_PACKAGE = eINSTANCE.getRegistryPackageQueryResultType_RegistryPackage();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryTypeImpl <em>Registry Package Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.RegistryPackageQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getRegistryPackageQueryType()
		 * @generated
		 */
		EClass REGISTRY_PACKAGE_QUERY_TYPE = eINSTANCE.getRegistryPackageQueryType();

		/**
		 * The meta object literal for the '<em><b>Registry Package Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_PACKAGE_FILTER = eINSTANCE.getRegistryPackageQueryType_RegistryPackageFilter();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getRegistryPackageQueryType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_ENTRY_QUERY = eINSTANCE.getRegistryPackageQueryType_RegistryEntryQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ResponseOptionTypeImpl <em>Response Option Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ResponseOptionTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getResponseOptionType()
		 * @generated
		 */
		EClass RESPONSE_OPTION_TYPE = eINSTANCE.getResponseOptionType();

		/**
		 * The meta object literal for the '<em><b>Return Composed Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_OPTION_TYPE__RETURN_COMPOSED_OBJECTS = eINSTANCE.getResponseOptionType_ReturnComposedObjects();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_OPTION_TYPE__RETURN_TYPE = eINSTANCE.getResponseOptionType_ReturnType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceBindingBranchTypeImpl <em>Service Binding Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceBindingBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getServiceBindingBranchType()
		 * @generated
		 */
		EClass SERVICE_BINDING_BRANCH_TYPE = eINSTANCE.getServiceBindingBranchType();

		/**
		 * The meta object literal for the '<em><b>Service Binding Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_FILTER = eINSTANCE.getServiceBindingBranchType_ServiceBindingFilter();

		/**
		 * The meta object literal for the '<em><b>Specification Link Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_BRANCH_TYPE__SPECIFICATION_LINK_BRANCH = eINSTANCE.getServiceBindingBranchType_SpecificationLinkBranch();

		/**
		 * The meta object literal for the '<em><b>Service Binding Target Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_BRANCH_TYPE__SERVICE_BINDING_TARGET_BRANCH = eINSTANCE.getServiceBindingBranchType_ServiceBindingTargetBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryResultTypeImpl <em>Service Query Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryResultTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getServiceQueryResultType()
		 * @generated
		 */
		EClass SERVICE_QUERY_RESULT_TYPE = eINSTANCE.getServiceQueryResultType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_QUERY_RESULT_TYPE__GROUP = eINSTANCE.getServiceQueryResultType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUERY_RESULT_TYPE__OBJECT_REF = eINSTANCE.getServiceQueryResultType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUERY_RESULT_TYPE__REGISTRY_OBJECT = eINSTANCE.getServiceQueryResultType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Registry Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUERY_RESULT_TYPE__REGISTRY_ENTRY = eINSTANCE.getServiceQueryResultType_RegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUERY_RESULT_TYPE__SERVICE = eINSTANCE.getServiceQueryResultType_Service();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryTypeImpl <em>Service Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.ServiceQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getServiceQueryType()
		 * @generated
		 */
		EClass SERVICE_QUERY_TYPE = eINSTANCE.getServiceQueryType();

		/**
		 * The meta object literal for the '<em><b>Service Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUERY_TYPE__SERVICE_FILTER = eINSTANCE.getServiceQueryType_ServiceFilter();

		/**
		 * The meta object literal for the '<em><b>Service Binding Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUERY_TYPE__SERVICE_BINDING_BRANCH = eINSTANCE.getServiceQueryType_ServiceBindingBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl <em>Simple Clause Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SimpleClauseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getSimpleClauseType()
		 * @generated
		 */
		EClass SIMPLE_CLAUSE_TYPE = eINSTANCE.getSimpleClauseType();

		/**
		 * The meta object literal for the '<em><b>Boolean Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLAUSE_TYPE__BOOLEAN_CLAUSE = eINSTANCE.getSimpleClauseType_BooleanClause();

		/**
		 * The meta object literal for the '<em><b>Rational Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLAUSE_TYPE__RATIONAL_CLAUSE = eINSTANCE.getSimpleClauseType_RationalClause();

		/**
		 * The meta object literal for the '<em><b>String Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLAUSE_TYPE__STRING_CLAUSE = eINSTANCE.getSimpleClauseType_StringClause();

		/**
		 * The meta object literal for the '<em><b>Left Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CLAUSE_TYPE__LEFT_ARGUMENT = eINSTANCE.getSimpleClauseType_LeftArgument();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SlotBranchTypeImpl <em>Slot Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SlotBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getSlotBranchType()
		 * @generated
		 */
		EClass SLOT_BRANCH_TYPE = eINSTANCE.getSlotBranchType();

		/**
		 * The meta object literal for the '<em><b>Slot Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_BRANCH_TYPE__SLOT_FILTER = eINSTANCE.getSlotBranchType_SlotFilter();

		/**
		 * The meta object literal for the '<em><b>Slot Value Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_BRANCH_TYPE__SLOT_VALUE_FILTER = eINSTANCE.getSlotBranchType_SlotValueFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SpecificationLinkBranchTypeImpl <em>Specification Link Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.SpecificationLinkBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getSpecificationLinkBranchType()
		 * @generated
		 */
		EClass SPECIFICATION_LINK_BRANCH_TYPE = eINSTANCE.getSpecificationLinkBranchType();

		/**
		 * The meta object literal for the '<em><b>Specification Link Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_LINK_BRANCH_TYPE__SPECIFICATION_LINK_FILTER = eINSTANCE.getSpecificationLinkBranchType_SpecificationLinkFilter();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getSpecificationLinkBranchType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Entry Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_LINK_BRANCH_TYPE__REGISTRY_ENTRY_QUERY = eINSTANCE.getSpecificationLinkBranchType_RegistryEntryQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.StringClauseTypeImpl <em>String Clause Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.StringClauseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getStringClauseType()
		 * @generated
		 */
		EClass STRING_CLAUSE_TYPE = eINSTANCE.getStringClauseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CLAUSE_TYPE__VALUE = eINSTANCE.getStringClauseType_Value();

		/**
		 * The meta object literal for the '<em><b>String Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CLAUSE_TYPE__STRING_PREDICATE = eINSTANCE.getStringClauseType_StringPredicate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl <em>User Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.UserBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getUserBranchType()
		 * @generated
		 */
		EClass USER_BRANCH_TYPE = eINSTANCE.getUserBranchType();

		/**
		 * The meta object literal for the '<em><b>User Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_BRANCH_TYPE__USER_FILTER = eINSTANCE.getUserBranchType_UserFilter();

		/**
		 * The meta object literal for the '<em><b>Postal Address Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_BRANCH_TYPE__POSTAL_ADDRESS_FILTER = eINSTANCE.getUserBranchType_PostalAddressFilter();

		/**
		 * The meta object literal for the '<em><b>Telephone Number Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_BRANCH_TYPE__TELEPHONE_NUMBER_FILTER = eINSTANCE.getUserBranchType_TelephoneNumberFilter();

		/**
		 * The meta object literal for the '<em><b>Email Address Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_BRANCH_TYPE__EMAIL_ADDRESS_FILTER = eINSTANCE.getUserBranchType_EmailAddressFilter();

		/**
		 * The meta object literal for the '<em><b>Organization Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_BRANCH_TYPE__ORGANIZATION_QUERY = eINSTANCE.getUserBranchType_OrganizationQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType <em>Connective Predicate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getConnectivePredicateType()
		 * @generated
		 */
		EEnum CONNECTIVE_PREDICATE_TYPE = eINSTANCE.getConnectivePredicateType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType <em>Logical Predicate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getLogicalPredicateType()
		 * @generated
		 */
		EEnum LOGICAL_PREDICATE_TYPE = eINSTANCE.getLogicalPredicateType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType <em>Return Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getReturnTypeType()
		 * @generated
		 */
		EEnum RETURN_TYPE_TYPE = eINSTANCE.getReturnTypeType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType <em>String Predicate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getStringPredicateType()
		 * @generated
		 */
		EEnum STRING_PREDICATE_TYPE = eINSTANCE.getStringPredicateType();

		/**
		 * The meta object literal for the '<em>Connective Predicate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ConnectivePredicateType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getConnectivePredicateTypeObject()
		 * @generated
		 */
		EDataType CONNECTIVE_PREDICATE_TYPE_OBJECT = eINSTANCE.getConnectivePredicateTypeObject();

		/**
		 * The meta object literal for the '<em>Logical Predicate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.LogicalPredicateType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getLogicalPredicateTypeObject()
		 * @generated
		 */
		EDataType LOGICAL_PREDICATE_TYPE_OBJECT = eINSTANCE.getLogicalPredicateTypeObject();

		/**
		 * The meta object literal for the '<em>Return Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.ReturnTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getReturnTypeTypeObject()
		 * @generated
		 */
		EDataType RETURN_TYPE_TYPE_OBJECT = eINSTANCE.getReturnTypeTypeObject();

		/**
		 * The meta object literal for the '<em>String Predicate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.StringPredicateType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.impl.QueryPackageImpl#getStringPredicateTypeObject()
		 * @generated
		 */
		EDataType STRING_PREDICATE_TYPE_OBJECT = eINSTANCE.getStringPredicateTypeObject();

	}

} //QueryPackage
