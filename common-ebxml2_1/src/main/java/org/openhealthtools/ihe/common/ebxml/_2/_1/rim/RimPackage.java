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
 * $Id: RimPackage.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

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
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimFactory
 * @model kind="package"
 * @generated
 */
public interface RimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RimPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectTypeImpl <em>Registry Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryObjectType()
	 * @generated
	 */
	int REGISTRY_OBJECT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__SLOT = 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__CLASSIFICATION = 3;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__OBJECT_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Registry Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl <em>Association Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getAssociationType1()
	 * @generated
	 */
	int ASSOCIATION_TYPE1 = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__ASSOCIATION_TYPE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Confirmed By Source Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Confirmed By Target Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__SOURCE_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__TARGET_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Association Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl <em>Auditable Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getAuditableEventType()
	 * @generated
	 */
	int AUDITABLE_EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__EVENT_TYPE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__TIMESTAMP = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__USER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Auditable Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationNodeTypeImpl <em>Classification Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationNodeTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getClassificationNodeType()
	 * @generated
	 */
	int CLASSIFICATION_NODE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__CLASSIFICATION_NODE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__CODE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__PARENT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__PATH = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classification Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl <em>Registry Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryEntryType()
	 * @generated
	 */
	int REGISTRY_ENTRY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__EXPIRATION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__MAJOR_VERSION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__MINOR_VERSION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__STABILITY = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__STATUS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE__USER_VERSION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Registry Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationSchemeTypeImpl <em>Classification Scheme Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationSchemeTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getClassificationSchemeType()
	 * @generated
	 */
	int CLASSIFICATION_SCHEME_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__NAME = REGISTRY_ENTRY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__DESCRIPTION = REGISTRY_ENTRY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__SLOT = REGISTRY_ENTRY_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION = REGISTRY_ENTRY_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_ENTRY_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_ENTRY_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__ID = REGISTRY_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__OBJECT_TYPE = REGISTRY_ENTRY_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__EXPIRATION = REGISTRY_ENTRY_TYPE__EXPIRATION;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__MAJOR_VERSION = REGISTRY_ENTRY_TYPE__MAJOR_VERSION;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__MINOR_VERSION = REGISTRY_ENTRY_TYPE__MINOR_VERSION;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__STABILITY = REGISTRY_ENTRY_TYPE__STABILITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__STATUS = REGISTRY_ENTRY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>User Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__USER_VERSION = REGISTRY_ENTRY_TYPE__USER_VERSION;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__NODE_TYPE = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classification Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl <em>Classification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getClassificationType()
	 * @generated
	 */
	int CLASSIFICATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__CLASSIFICATION_NODE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classified Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__CLASSIFIED_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__NODE_REPRESENTATION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Auditable Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDITABLE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE = 7;

	/**
	 * The feature id for the '<em><b>Classification Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_SCHEME = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL_ADDRESS = 10;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_LINK = 12;

	/**
	 * The feature id for the '<em><b>Extrinsic Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRINSIC_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Fax Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAX_NUMBER = 14;

	/**
	 * The feature id for the '<em><b>International String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERNATIONAL_STRING = 15;

	/**
	 * The feature id for the '<em><b>Leaf Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST = 16;

	/**
	 * The feature id for the '<em><b>Localized String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALIZED_STRING = 17;

	/**
	 * The feature id for the '<em><b>Mobile Telephone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 19;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_REF = 20;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_REF_LIST = 21;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION = 22;

	/**
	 * The feature id for the '<em><b>Pager Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGER_NUMBER = 23;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON_NAME = 24;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_ADDRESS = 25;

	/**
	 * The feature id for the '<em><b>Registry Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_ENTRY = 26;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT = 27;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT_LIST = 28;

	/**
	 * The feature id for the '<em><b>Registry Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_PACKAGE = 29;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 30;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_BINDING = 31;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLOT = 32;

	/**
	 * The feature id for the '<em><b>Specification Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIFICATION_LINK = 33;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELEPHONE_NUMBER = 34;

	/**
	 * The feature id for the '<em><b>Usage Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USAGE_DESCRIPTION = 35;

	/**
	 * The feature id for the '<em><b>Usage Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USAGE_PARAMETER = 36;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 38;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_LIST = 39;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 40;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.EmailAddressTypeImpl <em>Email Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.EmailAddressTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getEmailAddressType()
	 * @generated
	 */
	int EMAIL_ADDRESS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__SLOT = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Email Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalIdentifierTypeImpl <em>External Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalIdentifierTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getExternalIdentifierType()
	 * @generated
	 */
	int EXTERNAL_IDENTIFIER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Identification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__VALUE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>External Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalLinkTypeImpl <em>External Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalLinkTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getExternalLinkType()
	 * @generated
	 */
	int EXTERNAL_LINK_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__EXTERNAL_URI = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExtrinsicObjectTypeImpl <em>Extrinsic Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExtrinsicObjectTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getExtrinsicObjectType()
	 * @generated
	 */
	int EXTRINSIC_OBJECT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__NAME = REGISTRY_ENTRY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__DESCRIPTION = REGISTRY_ENTRY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__SLOT = REGISTRY_ENTRY_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__CLASSIFICATION = REGISTRY_ENTRY_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_ENTRY_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_ENTRY_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__ID = REGISTRY_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__OBJECT_TYPE = REGISTRY_ENTRY_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__EXPIRATION = REGISTRY_ENTRY_TYPE__EXPIRATION;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__MAJOR_VERSION = REGISTRY_ENTRY_TYPE__MAJOR_VERSION;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__MINOR_VERSION = REGISTRY_ENTRY_TYPE__MINOR_VERSION;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__STABILITY = REGISTRY_ENTRY_TYPE__STABILITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__STATUS = REGISTRY_ENTRY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>User Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__USER_VERSION = REGISTRY_ENTRY_TYPE__USER_VERSION;

	/**
	 * The feature id for the '<em><b>Is Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__IS_OPAQUE = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__MIME_TYPE = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extrinsic Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.InternationalStringTypeImpl <em>International String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.InternationalStringTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getInternationalStringType()
	 * @generated
	 */
	int INTERNATIONAL_STRING_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Localized String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_TYPE__LOCALIZED_STRING = 1;

	/**
	 * The number of structural features of the '<em>International String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl <em>Leaf Registry Object List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getLeafRegistryObjectListType()
	 * @generated
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Auditable Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE = 5;

	/**
	 * The feature id for the '<em><b>Classification Scheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME = 6;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK = 8;

	/**
	 * The feature id for the '<em><b>Extrinsic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION = 10;

	/**
	 * The feature id for the '<em><b>Registry Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING = 13;

	/**
	 * The feature id for the '<em><b>Specification Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK = 14;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE__USER = 15;

	/**
	 * The number of structural features of the '<em>Leaf Registry Object List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REGISTRY_OBJECT_LIST_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LocalizedStringTypeImpl <em>Localized String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LocalizedStringTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getLocalizedStringType()
	 * @generated
	 */
	int LOCALIZED_STRING_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_STRING_TYPE__CHARSET = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_STRING_TYPE__LANG = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_STRING_TYPE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Localized String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_STRING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefListTypeImpl <em>Object Ref List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getObjectRefListType()
	 * @generated
	 */
	int OBJECT_REF_LIST_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_LIST_TYPE__OBJECT_REF = 1;

	/**
	 * The number of structural features of the '<em>Object Ref List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getObjectRefType()
	 * @generated
	 */
	int OBJECT_REF_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Object Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.OrganizationTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ADDRESS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__TELEPHONE_NUMBER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__PARENT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__PRIMARY_CONTACT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PersonNameTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getPersonNameType()
	 * @generated
	 */
	int PERSON_NAME_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__SLOT = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__FIRST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__MIDDLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PostalAddressTypeImpl <em>Postal Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PostalAddressTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getPostalAddressType()
	 * @generated
	 */
	int POSTAL_ADDRESS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__SLOT = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__CITY = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__STATE_OR_PROVINCE = 5;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__STREET = 6;

	/**
	 * The feature id for the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__STREET_NUMBER = 7;

	/**
	 * The number of structural features of the '<em>Postal Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectListTypeImpl <em>Registry Object List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryObjectListType()
	 * @generated
	 */
	int REGISTRY_OBJECT_LIST_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__GROUP = LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF = LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION = LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Auditable Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT = LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION = LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE = LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE;

	/**
	 * The feature id for the '<em><b>Classification Scheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME = LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER = LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK = LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Extrinsic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT = LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION = LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Registry Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE = LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__SERVICE = LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING = LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING;

	/**
	 * The feature id for the '<em><b>Specification Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK = LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__USER = LEAF_REGISTRY_OBJECT_LIST_TYPE__USER;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__GROUP1 = LEAF_REGISTRY_OBJECT_LIST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY = LEAF_REGISTRY_OBJECT_LIST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT = LEAF_REGISTRY_OBJECT_LIST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Registry Object List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE_FEATURE_COUNT = LEAF_REGISTRY_OBJECT_LIST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryPackageTypeImpl <em>Registry Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryPackageTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryPackageType()
	 * @generated
	 */
	int REGISTRY_PACKAGE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__NAME = REGISTRY_ENTRY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__DESCRIPTION = REGISTRY_ENTRY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__SLOT = REGISTRY_ENTRY_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__CLASSIFICATION = REGISTRY_ENTRY_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_ENTRY_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_ENTRY_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__ID = REGISTRY_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__OBJECT_TYPE = REGISTRY_ENTRY_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__EXPIRATION = REGISTRY_ENTRY_TYPE__EXPIRATION;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__MAJOR_VERSION = REGISTRY_ENTRY_TYPE__MAJOR_VERSION;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__MINOR_VERSION = REGISTRY_ENTRY_TYPE__MINOR_VERSION;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__STABILITY = REGISTRY_ENTRY_TYPE__STABILITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__STATUS = REGISTRY_ENTRY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>User Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__USER_VERSION = REGISTRY_ENTRY_TYPE__USER_VERSION;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registry Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl <em>Service Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getServiceBindingType()
	 * @generated
	 */
	int SERVICE_BINDING_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Specification Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__SPECIFICATION_LINK = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__ACCESS_URI = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__SERVICE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__TARGET_BINDING = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = REGISTRY_ENTRY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__DESCRIPTION = REGISTRY_ENTRY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SLOT = REGISTRY_ENTRY_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__CLASSIFICATION = REGISTRY_ENTRY_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_ENTRY_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_ENTRY_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ID = REGISTRY_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__OBJECT_TYPE = REGISTRY_ENTRY_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__EXPIRATION = REGISTRY_ENTRY_TYPE__EXPIRATION;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__MAJOR_VERSION = REGISTRY_ENTRY_TYPE__MAJOR_VERSION;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__MINOR_VERSION = REGISTRY_ENTRY_TYPE__MINOR_VERSION;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__STABILITY = REGISTRY_ENTRY_TYPE__STABILITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__STATUS = REGISTRY_ENTRY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>User Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__USER_VERSION = REGISTRY_ENTRY_TYPE__USER_VERSION;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SERVICE_BINDING = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = REGISTRY_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SlotType1Impl <em>Slot Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SlotType1Impl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getSlotType1()
	 * @generated
	 */
	int SLOT_TYPE1 = 24;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE1__VALUE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE1__NAME = 1;

	/**
	 * The feature id for the '<em><b>Slot Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE1__SLOT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Slot Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SpecificationLinkTypeImpl <em>Specification Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SpecificationLinkTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getSpecificationLinkType()
	 * @generated
	 */
	int SPECIFICATION_LINK_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Usage Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__USAGE_PARAMETER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specification Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberListTypeImpl <em>Telephone Number List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getTelephoneNumberListType()
	 * @generated
	 */
	int TELEPHONE_NUMBER_LIST_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_LIST_TYPE__TELEPHONE_NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Telephone Number List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberTypeImpl <em>Telephone Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getTelephoneNumberType()
	 * @generated
	 */
	int TELEPHONE_NUMBER_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE__AREA_CODE = 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE__COUNTRY_CODE = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE__EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE__NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Phone Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE__PHONE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE__URL = 5;

	/**
	 * The number of structural features of the '<em>Telephone Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl <em>User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Access Control Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__ACCESS_CONTROL_POLICY = REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__ADDRESS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__PERSON_NAME = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__TELEPHONE_NUMBER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__EMAIL_ADDRESS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__ORGANIZATION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__URL = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ValueListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getValueListType()
	 * @generated
	 */
	int VALUE_LIST_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType <em>Event Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getEventTypeType()
	 * @generated
	 */
	int EVENT_TYPE_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType <em>Node Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getNodeTypeType()
	 * @generated
	 */
	int NODE_TYPE_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType <em>Stability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStabilityType()
	 * @generated
	 */
	int STABILITY_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 33;

	/**
	 * The meta object id for the '<em>Event Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getEventTypeTypeObject()
	 * @generated
	 */
	int EVENT_TYPE_TYPE_OBJECT = 34;

	/**
	 * The meta object id for the '<em>Free Form Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getFreeFormText()
	 * @generated
	 */
	int FREE_FORM_TEXT = 35;

	/**
	 * The meta object id for the '<em>Long Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getLongName()
	 * @generated
	 */
	int LONG_NAME = 36;

	/**
	 * The meta object id for the '<em>Node Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getNodeTypeTypeObject()
	 * @generated
	 */
	int NODE_TYPE_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Short Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getShortName()
	 * @generated
	 */
	int SHORT_NAME = 38;

	/**
	 * The meta object id for the '<em>Stability Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStabilityTypeObject()
	 * @generated
	 */
	int STABILITY_TYPE_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStatusTypeObject()
	 * @generated
	 */
	int STATUS_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>String16</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString16()
	 * @generated
	 */
	int STRING16 = 41;

	/**
	 * The meta object id for the '<em>String32</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString32()
	 * @generated
	 */
	int STRING32 = 42;

	/**
	 * The meta object id for the '<em>String4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString4()
	 * @generated
	 */
	int STRING4 = 43;

	/**
	 * The meta object id for the '<em>String8</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString8()
	 * @generated
	 */
	int STRING8 = 44;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1 <em>Association Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Type1</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1
	 * @generated
	 */
	EClass getAssociationType1();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getAssociationType()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_AssociationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedBySourceOwner <em>Is Confirmed By Source Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Confirmed By Source Owner</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedBySourceOwner()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_IsConfirmedBySourceOwner();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedByTargetOwner <em>Is Confirmed By Target Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Confirmed By Target Owner</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedByTargetOwner()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_IsConfirmedByTargetOwner();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getSourceObject()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_SourceObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getTargetObject <em>Target Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getTargetObject()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_TargetObject();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType <em>Auditable Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable Event Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType
	 * @generated
	 */
	EClass getAuditableEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getEventType()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_EventType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getRegistryObject()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_RegistryObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getTimestamp()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType#getUser()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_User();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType <em>Classification Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Node Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType
	 * @generated
	 */
	EClass getClassificationNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getClassificationNode()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EReference getClassificationNodeType_ClassificationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getCode()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EAttribute getClassificationNodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getParent()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EAttribute getClassificationNodeType_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType#getPath()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EAttribute getClassificationNodeType_Path();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType <em>Classification Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Scheme Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType
	 * @generated
	 */
	EClass getClassificationSchemeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getClassificationNode()
	 * @see #getClassificationSchemeType()
	 * @generated
	 */
	EReference getClassificationSchemeType_ClassificationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#isIsInternal <em>Is Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Internal</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#isIsInternal()
	 * @see #getClassificationSchemeType()
	 * @generated
	 */
	EAttribute getClassificationSchemeType_IsInternal();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType#getNodeType()
	 * @see #getClassificationSchemeType()
	 * @generated
	 */
	EAttribute getClassificationSchemeType_NodeType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType <em>Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType
	 * @generated
	 */
	EClass getClassificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getClassificationNode()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_ClassificationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getClassificationScheme <em>Classification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getClassificationScheme()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_ClassificationScheme();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getClassifiedObject <em>Classified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classified Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getClassifiedObject()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_ClassifiedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getNodeRepresentation <em>Node Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Representation</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType#getNodeRepresentation()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_NodeRepresentation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getAuditableEvent <em>Auditable Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getAuditableEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditableEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getClassification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getClassificationNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getClassificationScheme <em>Classification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getClassificationScheme()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationScheme();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Email Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getEmailAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EmailAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Identifier</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getExternalIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getExternalLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getExtrinsicObject <em>Extrinsic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getExtrinsicObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtrinsicObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getFaxNumber <em>Fax Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fax Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getFaxNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FaxNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getInternationalString <em>International String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>International String</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getInternationalString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InternationalString();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getLeafRegistryObjectList <em>Leaf Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leaf Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getLeafRegistryObjectList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LeafRegistryObjectList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getLocalizedString <em>Localized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized String</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getLocalizedString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocalizedString();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getMobileTelephoneNumber <em>Mobile Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mobile Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getMobileTelephoneNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MobileTelephoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getObjectRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getObjectRefList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectRefList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getPagerNumber <em>Pager Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pager Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getPagerNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PagerNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getPersonName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PersonName();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getPostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getPostalAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostalAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Entry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryObjectList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObjectList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryPackage <em>Registry Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getRegistryPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryPackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Service();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getServiceBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getSlot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Slot();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getSpecificationLink <em>Specification Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getSpecificationLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpecificationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getTelephoneNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getUsageDescription <em>Usage Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getUsageDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UsageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getUsageParameter <em>Usage Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Parameter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getUsageParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UsageParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getUser()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_User();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot#getValueList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType <em>Email Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Address Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType
	 * @generated
	 */
	EClass getEmailAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getGroup()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getSlot()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EReference getEmailAddressType_Slot();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getAddress()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType#getType()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Type();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType <em>External Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Identifier Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType
	 * @generated
	 */
	EClass getExternalIdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getIdentificationScheme <em>Identification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getIdentificationScheme()
	 * @see #getExternalIdentifierType()
	 * @generated
	 */
	EAttribute getExternalIdentifierType_IdentificationScheme();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getRegistryObject()
	 * @see #getExternalIdentifierType()
	 * @generated
	 */
	EAttribute getExternalIdentifierType_RegistryObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType#getValue()
	 * @see #getExternalIdentifierType()
	 * @generated
	 */
	EAttribute getExternalIdentifierType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType <em>External Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType
	 * @generated
	 */
	EClass getExternalLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType#getExternalURI <em>External URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External URI</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType#getExternalURI()
	 * @see #getExternalLinkType()
	 * @generated
	 */
	EAttribute getExternalLinkType_ExternalURI();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType <em>Extrinsic Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extrinsic Object Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType
	 * @generated
	 */
	EClass getExtrinsicObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Opaque</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#isIsOpaque()
	 * @see #getExtrinsicObjectType()
	 * @generated
	 */
	EAttribute getExtrinsicObjectType_IsOpaque();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType#getMimeType()
	 * @see #getExtrinsicObjectType()
	 * @generated
	 */
	EAttribute getExtrinsicObjectType_MimeType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType <em>International String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International String Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType
	 * @generated
	 */
	EClass getInternationalStringType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType#getGroup()
	 * @see #getInternationalStringType()
	 * @generated
	 */
	EAttribute getInternationalStringType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType#getLocalizedString <em>Localized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized String</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType#getLocalizedString()
	 * @see #getInternationalStringType()
	 * @generated
	 */
	EReference getInternationalStringType_LocalizedString();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType <em>Leaf Registry Object List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Registry Object List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType
	 * @generated
	 */
	EClass getLeafRegistryObjectListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getGroup()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EAttribute getLeafRegistryObjectListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getObjectRef()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_ObjectRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getAssociation()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_Association();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getAuditableEvent <em>Auditable Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auditable Event</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getAuditableEvent()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_AuditableEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassification()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassificationNode()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_ClassificationNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassificationScheme <em>Classification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getClassificationScheme()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_ClassificationScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifier</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExternalIdentifier()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_ExternalIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExternalLink()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_ExternalLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExtrinsicObject <em>Extrinsic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extrinsic Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getExtrinsicObject()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_ExtrinsicObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getOrganization()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_Organization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getRegistryPackage <em>Registry Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Package</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getRegistryPackage()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_RegistryPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getService()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getServiceBinding()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_ServiceBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getSpecificationLink <em>Specification Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getSpecificationLink()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_SpecificationLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType#getUser()
	 * @see #getLeafRegistryObjectListType()
	 * @generated
	 */
	EReference getLeafRegistryObjectListType_User();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType <em>Localized String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized String Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType
	 * @generated
	 */
	EClass getLocalizedStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType#getCharset()
	 * @see #getLocalizedStringType()
	 * @generated
	 */
	EAttribute getLocalizedStringType_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType#getLang()
	 * @see #getLocalizedStringType()
	 * @generated
	 */
	EAttribute getLocalizedStringType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType#getValue()
	 * @see #getLocalizedStringType()
	 * @generated
	 */
	EAttribute getLocalizedStringType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType <em>Object Ref List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType
	 * @generated
	 */
	EClass getObjectRefListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType#getGroup()
	 * @see #getObjectRefListType()
	 * @generated
	 */
	EAttribute getObjectRefListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType#getObjectRef()
	 * @see #getObjectRefListType()
	 * @generated
	 */
	EReference getObjectRefListType_ObjectRef();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType <em>Object Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType
	 * @generated
	 */
	EClass getObjectRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType#getId()
	 * @see #getObjectRefType()
	 * @generated
	 */
	EAttribute getObjectRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType
	 * @generated
	 */
	EClass getOrganizationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getAddress()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getTelephoneNumber()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_TelephoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getParent()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getPrimaryContact <em>Primary Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Contact</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType#getPrimaryContact()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_PrimaryContact();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Name Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType
	 * @generated
	 */
	EClass getPersonNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getGroup()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getSlot()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EReference getPersonNameType_Slot();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getFirstName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getLastName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType#getMiddleName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_MiddleName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType <em>Postal Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType
	 * @generated
	 */
	EClass getPostalAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getGroup()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getSlot()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EReference getPostalAddressType_Slot();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCity()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_City();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCountry()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getPostalCode()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStateOrProvince <em>State Or Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Or Province</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStateOrProvince()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_StateOrProvince();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreet()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreetNumber <em>Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreetNumber()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_StreetNumber();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType <em>Registry Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Entry Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType
	 * @generated
	 */
	EClass getRegistryEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getExpiration <em>Expiration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getExpiration()
	 * @see #getRegistryEntryType()
	 * @generated
	 */
	EAttribute getRegistryEntryType_Expiration();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMajorVersion <em>Major Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Version</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMajorVersion()
	 * @see #getRegistryEntryType()
	 * @generated
	 */
	EAttribute getRegistryEntryType_MajorVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMinorVersion <em>Minor Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Version</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMinorVersion()
	 * @see #getRegistryEntryType()
	 * @generated
	 */
	EAttribute getRegistryEntryType_MinorVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStability <em>Stability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stability</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStability()
	 * @see #getRegistryEntryType()
	 * @generated
	 */
	EAttribute getRegistryEntryType_Stability();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStatus()
	 * @see #getRegistryEntryType()
	 * @generated
	 */
	EAttribute getRegistryEntryType_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getUserVersion <em>User Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Version</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getUserVersion()
	 * @see #getRegistryEntryType()
	 * @generated
	 */
	EAttribute getRegistryEntryType_UserVersion();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType <em>Registry Object List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Object List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType
	 * @generated
	 */
	EClass getRegistryObjectListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType#getGroup1()
	 * @see #getRegistryObjectListType()
	 * @generated
	 */
	EAttribute getRegistryObjectListType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType#getRegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Entry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType#getRegistryEntry()
	 * @see #getRegistryObjectListType()
	 * @generated
	 */
	EReference getRegistryObjectListType_RegistryEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType#getRegistryObject()
	 * @see #getRegistryObjectListType()
	 * @generated
	 */
	EReference getRegistryObjectListType_RegistryObject();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType <em>Registry Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Object Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType
	 * @generated
	 */
	EClass getRegistryObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getName()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getDescription()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getSlot()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_Slot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getClassification()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifier</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getExternalIdentifier()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_ExternalIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getAccessControlPolicy <em>Access Control Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Control Policy</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getAccessControlPolicy()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EAttribute getRegistryObjectType_AccessControlPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getId()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EAttribute getRegistryObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType#getObjectType()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EAttribute getRegistryObjectType_ObjectType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType <em>Registry Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Package Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType
	 * @generated
	 */
	EClass getRegistryPackageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType#getRegistryObjectList()
	 * @see #getRegistryPackageType()
	 * @generated
	 */
	EReference getRegistryPackageType_RegistryObjectList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType <em>Service Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Binding Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType
	 * @generated
	 */
	EClass getServiceBindingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getSpecificationLink <em>Specification Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getSpecificationLink()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EReference getServiceBindingType_SpecificationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getAccessURI <em>Access URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access URI</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getAccessURI()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_AccessURI();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getService()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getTargetBinding <em>Target Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType#getTargetBinding()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_TargetBinding();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType#getServiceBinding()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_ServiceBinding();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1 <em>Slot Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Type1</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1
	 * @generated
	 */
	EClass getSlotType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1#getValueList()
	 * @see #getSlotType1()
	 * @generated
	 */
	EReference getSlotType1_ValueList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1#getName()
	 * @see #getSlotType1()
	 * @generated
	 */
	EAttribute getSlotType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1#getSlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1#getSlotType()
	 * @see #getSlotType1()
	 * @generated
	 */
	EAttribute getSlotType1_SlotType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType <em>Specification Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Link Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType
	 * @generated
	 */
	EClass getSpecificationLinkType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getUsageDescription <em>Usage Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getUsageDescription()
	 * @see #getSpecificationLinkType()
	 * @generated
	 */
	EReference getSpecificationLinkType_UsageDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getUsageParameter <em>Usage Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage Parameter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getUsageParameter()
	 * @see #getSpecificationLinkType()
	 * @generated
	 */
	EAttribute getSpecificationLinkType_UsageParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getSpecificationObject <em>Specification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType#getSpecificationObject()
	 * @see #getSpecificationLinkType()
	 * @generated
	 */
	EAttribute getSpecificationLinkType_SpecificationObject();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberListType <em>Telephone Number List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberListType
	 * @generated
	 */
	EClass getTelephoneNumberListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberListType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberListType#getTelephoneNumber()
	 * @see #getTelephoneNumberListType()
	 * @generated
	 */
	EReference getTelephoneNumberListType_TelephoneNumber();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType <em>Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType
	 * @generated
	 */
	EClass getTelephoneNumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getAreaCode()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_AreaCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getCountryCode()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getExtension()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getNumber()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getPhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getPhoneType()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_PhoneType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType#getUrl()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_Url();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType
	 * @generated
	 */
	EClass getUserType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getAddress()
	 * @see #getUserType()
	 * @generated
	 */
	EReference getUserType_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getPersonName()
	 * @see #getUserType()
	 * @generated
	 */
	EReference getUserType_PersonName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getTelephoneNumber()
	 * @see #getUserType()
	 * @generated
	 */
	EReference getUserType_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getEmailAddress()
	 * @see #getUserType()
	 * @generated
	 */
	EReference getUserType_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getOrganization()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType#getUrl()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Url();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType <em>Value List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType
	 * @generated
	 */
	EClass getValueListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType#getGroup()
	 * @see #getValueListType()
	 * @generated
	 */
	EAttribute getValueListType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType#getValue()
	 * @see #getValueListType()
	 * @generated
	 */
	EAttribute getValueListType_Value();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType <em>Event Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
	 * @generated
	 */
	EEnum getEventTypeType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType <em>Node Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
	 * @generated
	 */
	EEnum getNodeTypeType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType <em>Stability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stability Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
	 * @generated
	 */
	EEnum getStabilityType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType <em>Event Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Type Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType"
	 *        extendedMetaData="name='eventType_._type:Object' baseType='eventType_._type'" 
	 * @generated
	 */
	EDataType getEventTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Free Form Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Free Form Text</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FreeFormText' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='256'" 
	 * @generated
	 */
	EDataType getFreeFormText();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LongName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128'" 
	 * @generated
	 */
	EDataType getLongName();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType <em>Node Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Type Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType"
	 *        extendedMetaData="name='nodeType_._type:Object' baseType='nodeType_._type'" 
	 * @generated
	 */
	EDataType getNodeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Short Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ShortName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='64'" 
	 * @generated
	 */
	EDataType getShortName();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType <em>Stability Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stability Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType"
	 *        extendedMetaData="name='stability_._type:Object' baseType='stability_._type'" 
	 * @generated
	 */
	EDataType getStabilityTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType <em>Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType"
	 *        extendedMetaData="name='status_._type:Object' baseType='status_._type'" 
	 * @generated
	 */
	EDataType getStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String16</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='String16' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='16'" 
	 * @generated
	 */
	EDataType getString16();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String32</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='String32' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32'" 
	 * @generated
	 */
	EDataType getString32();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String4</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='String4' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='4'" 
	 * @generated
	 */
	EDataType getString4();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String8</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='String8' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='8'" 
	 * @generated
	 */
	EDataType getString8();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RimFactory getRimFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl <em>Association Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AssociationType1Impl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getAssociationType1()
		 * @generated
		 */
		EClass ASSOCIATION_TYPE1 = eINSTANCE.getAssociationType1();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE1__ASSOCIATION_TYPE = eINSTANCE.getAssociationType1_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Is Confirmed By Source Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER = eINSTANCE.getAssociationType1_IsConfirmedBySourceOwner();

		/**
		 * The meta object literal for the '<em><b>Is Confirmed By Target Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER = eINSTANCE.getAssociationType1_IsConfirmedByTargetOwner();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE1__SOURCE_OBJECT = eINSTANCE.getAssociationType1_SourceObject();

		/**
		 * The meta object literal for the '<em><b>Target Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE1__TARGET_OBJECT = eINSTANCE.getAssociationType1_TargetObject();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl <em>Auditable Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.AuditableEventTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getAuditableEventType()
		 * @generated
		 */
		EClass AUDITABLE_EVENT_TYPE = eINSTANCE.getAuditableEventType();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE_EVENT_TYPE__EVENT_TYPE = eINSTANCE.getAuditableEventType_EventType();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT = eINSTANCE.getAuditableEventType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE_EVENT_TYPE__TIMESTAMP = eINSTANCE.getAuditableEventType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE_EVENT_TYPE__USER = eINSTANCE.getAuditableEventType_User();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationNodeTypeImpl <em>Classification Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationNodeTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getClassificationNodeType()
		 * @generated
		 */
		EClass CLASSIFICATION_NODE_TYPE = eINSTANCE.getClassificationNodeType();

		/**
		 * The meta object literal for the '<em><b>Classification Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_TYPE__CLASSIFICATION_NODE = eINSTANCE.getClassificationNodeType_ClassificationNode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_NODE_TYPE__CODE = eINSTANCE.getClassificationNodeType_Code();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_NODE_TYPE__PARENT = eINSTANCE.getClassificationNodeType_Parent();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_NODE_TYPE__PATH = eINSTANCE.getClassificationNodeType_Path();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationSchemeTypeImpl <em>Classification Scheme Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationSchemeTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getClassificationSchemeType()
		 * @generated
		 */
		EClass CLASSIFICATION_SCHEME_TYPE = eINSTANCE.getClassificationSchemeType();

		/**
		 * The meta object literal for the '<em><b>Classification Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE = eINSTANCE.getClassificationSchemeType_ClassificationNode();

		/**
		 * The meta object literal for the '<em><b>Is Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL = eINSTANCE.getClassificationSchemeType_IsInternal();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_SCHEME_TYPE__NODE_TYPE = eINSTANCE.getClassificationSchemeType_NodeType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl <em>Classification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getClassificationType()
		 * @generated
		 */
		EClass CLASSIFICATION_TYPE = eINSTANCE.getClassificationType();

		/**
		 * The meta object literal for the '<em><b>Classification Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_TYPE__CLASSIFICATION_NODE = eINSTANCE.getClassificationType_ClassificationNode();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME = eINSTANCE.getClassificationType_ClassificationScheme();

		/**
		 * The meta object literal for the '<em><b>Classified Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_TYPE__CLASSIFIED_OBJECT = eINSTANCE.getClassificationType_ClassifiedObject();

		/**
		 * The meta object literal for the '<em><b>Node Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_TYPE__NODE_REPRESENTATION = eINSTANCE.getClassificationType_NodeRepresentation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION = eINSTANCE.getDocumentRoot_Association();

		/**
		 * The meta object literal for the '<em><b>Auditable Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDITABLE_EVENT = eINSTANCE.getDocumentRoot_AuditableEvent();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION = eINSTANCE.getDocumentRoot_Classification();

		/**
		 * The meta object literal for the '<em><b>Classification Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_NODE = eINSTANCE.getDocumentRoot_ClassificationNode();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_SCHEME = eINSTANCE.getDocumentRoot_ClassificationScheme();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMAIL_ADDRESS = eINSTANCE.getDocumentRoot_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>External Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_IDENTIFIER = eINSTANCE.getDocumentRoot_ExternalIdentifier();

		/**
		 * The meta object literal for the '<em><b>External Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_LINK = eINSTANCE.getDocumentRoot_ExternalLink();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTRINSIC_OBJECT = eINSTANCE.getDocumentRoot_ExtrinsicObject();

		/**
		 * The meta object literal for the '<em><b>Fax Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FAX_NUMBER = eINSTANCE.getDocumentRoot_FaxNumber();

		/**
		 * The meta object literal for the '<em><b>International String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERNATIONAL_STRING = eINSTANCE.getDocumentRoot_InternationalString();

		/**
		 * The meta object literal for the '<em><b>Leaf Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST = eINSTANCE.getDocumentRoot_LeafRegistryObjectList();

		/**
		 * The meta object literal for the '<em><b>Localized String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCALIZED_STRING = eINSTANCE.getDocumentRoot_LocalizedString();

		/**
		 * The meta object literal for the '<em><b>Mobile Telephone Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER = eINSTANCE.getDocumentRoot_MobileTelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT_REF = eINSTANCE.getDocumentRoot_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Object Ref List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT_REF_LIST = eINSTANCE.getDocumentRoot_ObjectRefList();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION = eINSTANCE.getDocumentRoot_Organization();

		/**
		 * The meta object literal for the '<em><b>Pager Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PAGER_NUMBER = eINSTANCE.getDocumentRoot_PagerNumber();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSON_NAME = eINSTANCE.getDocumentRoot_PersonName();

		/**
		 * The meta object literal for the '<em><b>Postal Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POSTAL_ADDRESS = eINSTANCE.getDocumentRoot_PostalAddress();

		/**
		 * The meta object literal for the '<em><b>Registry Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_ENTRY = eINSTANCE.getDocumentRoot_RegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_OBJECT = eINSTANCE.getDocumentRoot_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_OBJECT_LIST = eINSTANCE.getDocumentRoot_RegistryObjectList();

		/**
		 * The meta object literal for the '<em><b>Registry Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_PACKAGE = eINSTANCE.getDocumentRoot_RegistryPackage();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE = eINSTANCE.getDocumentRoot_Service();

		/**
		 * The meta object literal for the '<em><b>Service Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_BINDING = eINSTANCE.getDocumentRoot_ServiceBinding();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SLOT = eINSTANCE.getDocumentRoot_Slot();

		/**
		 * The meta object literal for the '<em><b>Specification Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIFICATION_LINK = eINSTANCE.getDocumentRoot_SpecificationLink();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TELEPHONE_NUMBER = eINSTANCE.getDocumentRoot_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Usage Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USAGE_DESCRIPTION = eINSTANCE.getDocumentRoot_UsageDescription();

		/**
		 * The meta object literal for the '<em><b>Usage Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__USAGE_PARAMETER = eINSTANCE.getDocumentRoot_UsageParameter();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER = eINSTANCE.getDocumentRoot_User();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '<em><b>Value List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_LIST = eINSTANCE.getDocumentRoot_ValueList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.EmailAddressTypeImpl <em>Email Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.EmailAddressTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getEmailAddressType()
		 * @generated
		 */
		EClass EMAIL_ADDRESS_TYPE = eINSTANCE.getEmailAddressType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_TYPE__GROUP = eINSTANCE.getEmailAddressType_Group();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_ADDRESS_TYPE__SLOT = eINSTANCE.getEmailAddressType_Slot();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_TYPE__ADDRESS = eINSTANCE.getEmailAddressType_Address();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_TYPE__TYPE = eINSTANCE.getEmailAddressType_Type();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalIdentifierTypeImpl <em>External Identifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalIdentifierTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getExternalIdentifierType()
		 * @generated
		 */
		EClass EXTERNAL_IDENTIFIER_TYPE = eINSTANCE.getExternalIdentifierType();

		/**
		 * The meta object literal for the '<em><b>Identification Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME = eINSTANCE.getExternalIdentifierType_IdentificationScheme();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT = eINSTANCE.getExternalIdentifierType_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER_TYPE__VALUE = eINSTANCE.getExternalIdentifierType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalLinkTypeImpl <em>External Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExternalLinkTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getExternalLinkType()
		 * @generated
		 */
		EClass EXTERNAL_LINK_TYPE = eINSTANCE.getExternalLinkType();

		/**
		 * The meta object literal for the '<em><b>External URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_LINK_TYPE__EXTERNAL_URI = eINSTANCE.getExternalLinkType_ExternalURI();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExtrinsicObjectTypeImpl <em>Extrinsic Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ExtrinsicObjectTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getExtrinsicObjectType()
		 * @generated
		 */
		EClass EXTRINSIC_OBJECT_TYPE = eINSTANCE.getExtrinsicObjectType();

		/**
		 * The meta object literal for the '<em><b>Is Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRINSIC_OBJECT_TYPE__IS_OPAQUE = eINSTANCE.getExtrinsicObjectType_IsOpaque();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRINSIC_OBJECT_TYPE__MIME_TYPE = eINSTANCE.getExtrinsicObjectType_MimeType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.InternationalStringTypeImpl <em>International String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.InternationalStringTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getInternationalStringType()
		 * @generated
		 */
		EClass INTERNATIONAL_STRING_TYPE = eINSTANCE.getInternationalStringType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNATIONAL_STRING_TYPE__GROUP = eINSTANCE.getInternationalStringType_Group();

		/**
		 * The meta object literal for the '<em><b>Localized String</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNATIONAL_STRING_TYPE__LOCALIZED_STRING = eINSTANCE.getInternationalStringType_LocalizedString();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl <em>Leaf Registry Object List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LeafRegistryObjectListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getLeafRegistryObjectListType()
		 * @generated
		 */
		EClass LEAF_REGISTRY_OBJECT_LIST_TYPE = eINSTANCE.getLeafRegistryObjectListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP = eINSTANCE.getLeafRegistryObjectListType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF = eINSTANCE.getLeafRegistryObjectListType_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION = eINSTANCE.getLeafRegistryObjectListType_Association();

		/**
		 * The meta object literal for the '<em><b>Auditable Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT = eINSTANCE.getLeafRegistryObjectListType_AuditableEvent();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION = eINSTANCE.getLeafRegistryObjectListType_Classification();

		/**
		 * The meta object literal for the '<em><b>Classification Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE = eINSTANCE.getLeafRegistryObjectListType_ClassificationNode();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME = eINSTANCE.getLeafRegistryObjectListType_ClassificationScheme();

		/**
		 * The meta object literal for the '<em><b>External Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER = eINSTANCE.getLeafRegistryObjectListType_ExternalIdentifier();

		/**
		 * The meta object literal for the '<em><b>External Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK = eINSTANCE.getLeafRegistryObjectListType_ExternalLink();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT = eINSTANCE.getLeafRegistryObjectListType_ExtrinsicObject();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION = eINSTANCE.getLeafRegistryObjectListType_Organization();

		/**
		 * The meta object literal for the '<em><b>Registry Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE = eINSTANCE.getLeafRegistryObjectListType_RegistryPackage();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE = eINSTANCE.getLeafRegistryObjectListType_Service();

		/**
		 * The meta object literal for the '<em><b>Service Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING = eINSTANCE.getLeafRegistryObjectListType_ServiceBinding();

		/**
		 * The meta object literal for the '<em><b>Specification Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK = eINSTANCE.getLeafRegistryObjectListType_SpecificationLink();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_REGISTRY_OBJECT_LIST_TYPE__USER = eINSTANCE.getLeafRegistryObjectListType_User();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LocalizedStringTypeImpl <em>Localized String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.LocalizedStringTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getLocalizedStringType()
		 * @generated
		 */
		EClass LOCALIZED_STRING_TYPE = eINSTANCE.getLocalizedStringType();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_STRING_TYPE__CHARSET = eINSTANCE.getLocalizedStringType_Charset();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_STRING_TYPE__LANG = eINSTANCE.getLocalizedStringType_Lang();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_STRING_TYPE__VALUE = eINSTANCE.getLocalizedStringType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefListTypeImpl <em>Object Ref List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getObjectRefListType()
		 * @generated
		 */
		EClass OBJECT_REF_LIST_TYPE = eINSTANCE.getObjectRefListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REF_LIST_TYPE__GROUP = eINSTANCE.getObjectRefListType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_REF_LIST_TYPE__OBJECT_REF = eINSTANCE.getObjectRefListType_ObjectRef();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ObjectRefTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getObjectRefType()
		 * @generated
		 */
		EClass OBJECT_REF_TYPE = eINSTANCE.getObjectRefType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REF_TYPE__ID = eINSTANCE.getObjectRefType_Id();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.OrganizationTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getOrganizationType()
		 * @generated
		 */
		EClass ORGANIZATION_TYPE = eINSTANCE.getOrganizationType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__ADDRESS = eINSTANCE.getOrganizationType_Address();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__TELEPHONE_NUMBER = eINSTANCE.getOrganizationType_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__PARENT = eINSTANCE.getOrganizationType_Parent();

		/**
		 * The meta object literal for the '<em><b>Primary Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__PRIMARY_CONTACT = eINSTANCE.getOrganizationType_PrimaryContact();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PersonNameTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getPersonNameType()
		 * @generated
		 */
		EClass PERSON_NAME_TYPE = eINSTANCE.getPersonNameType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__GROUP = eINSTANCE.getPersonNameType_Group();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME_TYPE__SLOT = eINSTANCE.getPersonNameType_Slot();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__FIRST_NAME = eINSTANCE.getPersonNameType_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__LAST_NAME = eINSTANCE.getPersonNameType_LastName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__MIDDLE_NAME = eINSTANCE.getPersonNameType_MiddleName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PostalAddressTypeImpl <em>Postal Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.PostalAddressTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getPostalAddressType()
		 * @generated
		 */
		EClass POSTAL_ADDRESS_TYPE = eINSTANCE.getPostalAddressType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS_TYPE__GROUP = eINSTANCE.getPostalAddressType_Group();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS_TYPE__SLOT = eINSTANCE.getPostalAddressType_Slot();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS_TYPE__CITY = eINSTANCE.getPostalAddressType_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS_TYPE__COUNTRY = eINSTANCE.getPostalAddressType_Country();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS_TYPE__POSTAL_CODE = eINSTANCE.getPostalAddressType_PostalCode();

		/**
		 * The meta object literal for the '<em><b>State Or Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS_TYPE__STATE_OR_PROVINCE = eINSTANCE.getPostalAddressType_StateOrProvince();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS_TYPE__STREET = eINSTANCE.getPostalAddressType_Street();

		/**
		 * The meta object literal for the '<em><b>Street Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS_TYPE__STREET_NUMBER = eINSTANCE.getPostalAddressType_StreetNumber();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl <em>Registry Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryEntryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryEntryType()
		 * @generated
		 */
		EClass REGISTRY_ENTRY_TYPE = eINSTANCE.getRegistryEntryType();

		/**
		 * The meta object literal for the '<em><b>Expiration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY_TYPE__EXPIRATION = eINSTANCE.getRegistryEntryType_Expiration();

		/**
		 * The meta object literal for the '<em><b>Major Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY_TYPE__MAJOR_VERSION = eINSTANCE.getRegistryEntryType_MajorVersion();

		/**
		 * The meta object literal for the '<em><b>Minor Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY_TYPE__MINOR_VERSION = eINSTANCE.getRegistryEntryType_MinorVersion();

		/**
		 * The meta object literal for the '<em><b>Stability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY_TYPE__STABILITY = eINSTANCE.getRegistryEntryType_Stability();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY_TYPE__STATUS = eINSTANCE.getRegistryEntryType_Status();

		/**
		 * The meta object literal for the '<em><b>User Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY_TYPE__USER_VERSION = eINSTANCE.getRegistryEntryType_UserVersion();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectListTypeImpl <em>Registry Object List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryObjectListType()
		 * @generated
		 */
		EClass REGISTRY_OBJECT_LIST_TYPE = eINSTANCE.getRegistryObjectListType();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_LIST_TYPE__GROUP1 = eINSTANCE.getRegistryObjectListType_Group1();

		/**
		 * The meta object literal for the '<em><b>Registry Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY = eINSTANCE.getRegistryObjectListType_RegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT = eINSTANCE.getRegistryObjectListType_RegistryObject();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectTypeImpl <em>Registry Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryObjectTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryObjectType()
		 * @generated
		 */
		EClass REGISTRY_OBJECT_TYPE = eINSTANCE.getRegistryObjectType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_TYPE__NAME = eINSTANCE.getRegistryObjectType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_TYPE__DESCRIPTION = eINSTANCE.getRegistryObjectType_Description();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_TYPE__SLOT = eINSTANCE.getRegistryObjectType_Slot();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_TYPE__CLASSIFICATION = eINSTANCE.getRegistryObjectType_Classification();

		/**
		 * The meta object literal for the '<em><b>External Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER = eINSTANCE.getRegistryObjectType_ExternalIdentifier();

		/**
		 * The meta object literal for the '<em><b>Access Control Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY = eINSTANCE.getRegistryObjectType_AccessControlPolicy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_TYPE__ID = eINSTANCE.getRegistryObjectType_Id();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_TYPE__OBJECT_TYPE = eINSTANCE.getRegistryObjectType_ObjectType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryPackageTypeImpl <em>Registry Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RegistryPackageTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getRegistryPackageType()
		 * @generated
		 */
		EClass REGISTRY_PACKAGE_TYPE = eINSTANCE.getRegistryPackageType();

		/**
		 * The meta object literal for the '<em><b>Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST = eINSTANCE.getRegistryPackageType_RegistryObjectList();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl <em>Service Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getServiceBindingType()
		 * @generated
		 */
		EClass SERVICE_BINDING_TYPE = eINSTANCE.getServiceBindingType();

		/**
		 * The meta object literal for the '<em><b>Specification Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_TYPE__SPECIFICATION_LINK = eINSTANCE.getServiceBindingType_SpecificationLink();

		/**
		 * The meta object literal for the '<em><b>Access URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BINDING_TYPE__ACCESS_URI = eINSTANCE.getServiceBindingType_AccessURI();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BINDING_TYPE__SERVICE = eINSTANCE.getServiceBindingType_Service();

		/**
		 * The meta object literal for the '<em><b>Target Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BINDING_TYPE__TARGET_BINDING = eINSTANCE.getServiceBindingType_TargetBinding();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Service Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__SERVICE_BINDING = eINSTANCE.getServiceType_ServiceBinding();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SlotType1Impl <em>Slot Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SlotType1Impl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getSlotType1()
		 * @generated
		 */
		EClass SLOT_TYPE1 = eINSTANCE.getSlotType1();

		/**
		 * The meta object literal for the '<em><b>Value List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_TYPE1__VALUE_LIST = eINSTANCE.getSlotType1_ValueList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE1__NAME = eINSTANCE.getSlotType1_Name();

		/**
		 * The meta object literal for the '<em><b>Slot Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE1__SLOT_TYPE = eINSTANCE.getSlotType1_SlotType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SpecificationLinkTypeImpl <em>Specification Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SpecificationLinkTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getSpecificationLinkType()
		 * @generated
		 */
		EClass SPECIFICATION_LINK_TYPE = eINSTANCE.getSpecificationLinkType();

		/**
		 * The meta object literal for the '<em><b>Usage Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION = eINSTANCE.getSpecificationLinkType_UsageDescription();

		/**
		 * The meta object literal for the '<em><b>Usage Parameter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_LINK_TYPE__USAGE_PARAMETER = eINSTANCE.getSpecificationLinkType_UsageParameter();

		/**
		 * The meta object literal for the '<em><b>Specification Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT = eINSTANCE.getSpecificationLinkType_SpecificationObject();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberListTypeImpl <em>Telephone Number List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getTelephoneNumberListType()
		 * @generated
		 */
		EClass TELEPHONE_NUMBER_LIST_TYPE = eINSTANCE.getTelephoneNumberListType();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELEPHONE_NUMBER_LIST_TYPE__TELEPHONE_NUMBER = eINSTANCE.getTelephoneNumberListType_TelephoneNumber();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberTypeImpl <em>Telephone Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.TelephoneNumberTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getTelephoneNumberType()
		 * @generated
		 */
		EClass TELEPHONE_NUMBER_TYPE = eINSTANCE.getTelephoneNumberType();

		/**
		 * The meta object literal for the '<em><b>Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE__AREA_CODE = eINSTANCE.getTelephoneNumberType_AreaCode();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE__COUNTRY_CODE = eINSTANCE.getTelephoneNumberType_CountryCode();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE__EXTENSION = eINSTANCE.getTelephoneNumberType_Extension();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE__NUMBER = eINSTANCE.getTelephoneNumberType_Number();

		/**
		 * The meta object literal for the '<em><b>Phone Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE__PHONE_TYPE = eINSTANCE.getTelephoneNumberType_PhoneType();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE__URL = eINSTANCE.getTelephoneNumberType_Url();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl <em>User Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.UserTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getUserType()
		 * @generated
		 */
		EClass USER_TYPE = eINSTANCE.getUserType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TYPE__ADDRESS = eINSTANCE.getUserType_Address();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TYPE__PERSON_NAME = eINSTANCE.getUserType_PersonName();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TYPE__TELEPHONE_NUMBER = eINSTANCE.getUserType_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TYPE__EMAIL_ADDRESS = eINSTANCE.getUserType_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TYPE__ORGANIZATION = eINSTANCE.getUserType_Organization();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TYPE__URL = eINSTANCE.getUserType_Url();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ValueListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getValueListType()
		 * @generated
		 */
		EClass VALUE_LIST_TYPE = eINSTANCE.getValueListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LIST_TYPE__GROUP = eINSTANCE.getValueListType_Group();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LIST_TYPE__VALUE = eINSTANCE.getValueListType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType <em>Event Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getEventTypeType()
		 * @generated
		 */
		EEnum EVENT_TYPE_TYPE = eINSTANCE.getEventTypeType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType <em>Node Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getNodeTypeType()
		 * @generated
		 */
		EEnum NODE_TYPE_TYPE = eINSTANCE.getNodeTypeType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType <em>Stability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStabilityType()
		 * @generated
		 */
		EEnum STABILITY_TYPE = eINSTANCE.getStabilityType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em>Event Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getEventTypeTypeObject()
		 * @generated
		 */
		EDataType EVENT_TYPE_TYPE_OBJECT = eINSTANCE.getEventTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Free Form Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getFreeFormText()
		 * @generated
		 */
		EDataType FREE_FORM_TEXT = eINSTANCE.getFreeFormText();

		/**
		 * The meta object literal for the '<em>Long Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getLongName()
		 * @generated
		 */
		EDataType LONG_NAME = eINSTANCE.getLongName();

		/**
		 * The meta object literal for the '<em>Node Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getNodeTypeTypeObject()
		 * @generated
		 */
		EDataType NODE_TYPE_TYPE_OBJECT = eINSTANCE.getNodeTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Short Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getShortName()
		 * @generated
		 */
		EDataType SHORT_NAME = eINSTANCE.getShortName();

		/**
		 * The meta object literal for the '<em>Stability Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStabilityTypeObject()
		 * @generated
		 */
		EDataType STABILITY_TYPE_OBJECT = eINSTANCE.getStabilityTypeObject();

		/**
		 * The meta object literal for the '<em>Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getStatusTypeObject()
		 * @generated
		 */
		EDataType STATUS_TYPE_OBJECT = eINSTANCE.getStatusTypeObject();

		/**
		 * The meta object literal for the '<em>String16</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString16()
		 * @generated
		 */
		EDataType STRING16 = eINSTANCE.getString16();

		/**
		 * The meta object literal for the '<em>String32</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString32()
		 * @generated
		 */
		EDataType STRING32 = eINSTANCE.getString32();

		/**
		 * The meta object literal for the '<em>String4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString4()
		 * @generated
		 */
		EDataType STRING4 = eINSTANCE.getString4();

		/**
		 * The meta object literal for the '<em>String8</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimPackageImpl#getString8()
		 * @generated
		 */
		EDataType STRING8 = eINSTANCE.getString8();

	}

} //RimPackage
