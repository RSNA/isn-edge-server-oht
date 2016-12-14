/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimPackage.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

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
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimFactory
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
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0";

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
	RimPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ActionTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.IdentifiableTypeImpl <em>Identifiable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.IdentifiableTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getIdentifiableType()
	 * @generated
	 */
	int IDENTIFIABLE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_TYPE__SLOT = 0;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_TYPE__HOME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Identifiable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl <em>Registry Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryObjectType()
	 * @generated
	 */
	int REGISTRY_OBJECT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__SLOT = IDENTIFIABLE_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__HOME = IDENTIFIABLE_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__ID = IDENTIFIABLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__NAME = IDENTIFIABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__DESCRIPTION = IDENTIFIABLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__VERSION_INFO = IDENTIFIABLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__CLASSIFICATION = IDENTIFIABLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER = IDENTIFIABLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__LID = IDENTIFIABLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__OBJECT_TYPE = IDENTIFIABLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE__STATUS = IDENTIFIABLE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Registry Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_TYPE_FEATURE_COUNT = IDENTIFIABLE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AdhocQueryTypeImpl <em>Adhoc Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AdhocQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getAdhocQueryType()
	 * @generated
	 */
	int ADHOC_QUERY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE__QUERY_EXPRESSION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adhoc Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AssociationType1Impl <em>Association Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AssociationType1Impl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getAssociationType1()
	 * @generated
	 */
	int ASSOCIATION_TYPE1 = 2;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__ASSOCIATION_TYPE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__SOURCE_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1__TARGET_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE1_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl <em>Auditable Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getAuditableEventType()
	 * @generated
	 */
	int AUDITABLE_EVENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Affected Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__EVENT_TYPE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__REQUEST_ID = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__TIMESTAMP = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE__USER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Auditable Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationNodeTypeImpl <em>Classification Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationNodeTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getClassificationNodeType()
	 * @generated
	 */
	int CLASSIFICATION_NODE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationSchemeTypeImpl <em>Classification Scheme Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationSchemeTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getClassificationSchemeType()
	 * @generated
	 */
	int CLASSIFICATION_SCHEME_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE__NODE_TYPE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classification Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationTypeImpl <em>Classification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getClassificationType()
	 * @generated
	 */
	int CLASSIFICATION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

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
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADHOC_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Registry Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIABLE = 7;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION = 8;

	/**
	 * The feature id for the '<em><b>Auditable Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDITABLE_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Classification Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE = 11;

	/**
	 * The feature id for the '<em><b>Classification Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_SCHEME = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_IDENTIFIER = 15;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_LINK = 16;

	/**
	 * The feature id for the '<em><b>Extrinsic Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRINSIC_OBJECT = 17;

	/**
	 * The feature id for the '<em><b>Federation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEDERATION = 18;

	/**
	 * The feature id for the '<em><b>International String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERNATIONAL_STRING = 19;

	/**
	 * The feature id for the '<em><b>Localized String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALIZED_STRING = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 21;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTIFICATION = 22;

	/**
	 * The feature id for the '<em><b>Notify Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTIFY_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_REF = 24;

	/**
	 * The feature id for the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_REF_LIST = 25;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION = 26;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON = 27;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON_NAME = 28;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_ADDRESS = 29;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY = 31;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT_LIST = 32;

	/**
	 * The feature id for the '<em><b>Registry Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_PACKAGE = 33;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 34;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_BINDING = 35;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLOT = 36;

	/**
	 * The feature id for the '<em><b>Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLOT_LIST = 37;

	/**
	 * The feature id for the '<em><b>Specification Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIFICATION_LINK = 38;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSCRIPTION = 39;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELEPHONE_NUMBER = 40;

	/**
	 * The feature id for the '<em><b>Usage Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USAGE_DESCRIPTION = 41;

	/**
	 * The feature id for the '<em><b>Usage Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USAGE_PARAMETER = 42;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 44;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_LIST = 45;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 46;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.EmailAddressTypeImpl <em>Email Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.EmailAddressTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getEmailAddressType()
	 * @generated
	 */
	int EMAIL_ADDRESS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Email Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalIdentifierTypeImpl <em>External Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalIdentifierTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getExternalIdentifierType()
	 * @generated
	 */
	int EXTERNAL_IDENTIFIER_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalLinkTypeImpl <em>External Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalLinkTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getExternalLinkType()
	 * @generated
	 */
	int EXTERNAL_LINK_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExtrinsicObjectTypeImpl <em>Extrinsic Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExtrinsicObjectTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getExtrinsicObjectType()
	 * @generated
	 */
	int EXTRINSIC_OBJECT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Content Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__IS_OPAQUE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE__MIME_TYPE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extrinsic Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.FederationTypeImpl <em>Federation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.FederationTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getFederationType()
	 * @generated
	 */
	int FEDERATION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Replication Sync Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE__REPLICATION_SYNC_LATENCY = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Federation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.InternationalStringTypeImpl <em>International String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.InternationalStringTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getInternationalStringType()
	 * @generated
	 */
	int INTERNATIONAL_STRING_TYPE = 14;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.LocalizedStringTypeImpl <em>Localized String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.LocalizedStringTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getLocalizedStringType()
	 * @generated
	 */
	int LOCALIZED_STRING_TYPE = 15;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotificationTypeImpl <em>Notification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotificationTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getNotificationType()
	 * @generated
	 */
	int NOTIFICATION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE__SUBSCRIPTION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotifyActionTypeImpl <em>Notify Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotifyActionTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getNotifyActionType()
	 * @generated
	 */
	int NOTIFY_ACTION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_ACTION_TYPE__END_POINT = ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notification Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION = ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notify Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_ACTION_TYPE_FEATURE_COUNT = ACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefListTypeImpl <em>Object Ref List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getObjectRefListType()
	 * @generated
	 */
	int OBJECT_REF_LIST_TYPE = 18;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getObjectRefType()
	 * @generated
	 */
	int OBJECT_REF_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE__SLOT = IDENTIFIABLE_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE__HOME = IDENTIFIABLE_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE__ID = IDENTIFIABLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Create Replica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE__CREATE_REPLICA = IDENTIFIABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE_FEATURE_COUNT = IDENTIFIABLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__EMAIL_ADDRESS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__PARENT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__PRIMARY_CONTACT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonNameTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getPersonNameType()
	 * @generated
	 */
	int PERSON_NAME_TYPE = 21;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__MIDDLE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl <em>Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getPersonType()
	 * @generated
	 */
	int PERSON_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__ADDRESS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__PERSON_NAME = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__TELEPHONE_NUMBER = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__EMAIL_ADDRESS = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PostalAddressTypeImpl <em>Postal Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PostalAddressTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getPostalAddressType()
	 * @generated
	 */
	int POSTAL_ADDRESS_TYPE = 23;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__CITY = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__POSTAL_CODE = 2;

	/**
	 * The feature id for the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__STATE_OR_PROVINCE = 3;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__STREET = 4;

	/**
	 * The feature id for the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__STREET_NUMBER = 5;

	/**
	 * The number of structural features of the '<em>Postal Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.QueryExpressionTypeImpl <em>Query Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.QueryExpressionTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getQueryExpressionType()
	 * @generated
	 */
	int QUERY_EXPRESSION_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TYPE__QUERY_LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Query Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectListTypeImpl <em>Registry Object List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryObjectListType()
	 * @generated
	 */
	int REGISTRY_OBJECT_LIST_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Identifiable Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE = 1;

	/**
	 * The number of structural features of the '<em>Registry Object List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryPackageTypeImpl <em>Registry Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryPackageTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryPackageType()
	 * @generated
	 */
	int REGISTRY_PACKAGE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registry Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl <em>Registry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryType()
	 * @generated
	 */
	int REGISTRY_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Cataloging Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__CATALOGING_LATENCY = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conformance Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__CONFORMANCE_PROFILE = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__OPERATOR = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replication Sync Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__REPLICATION_SYNC_LATENCY = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Specification Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE__SPECIFICATION_VERSION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Registry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceBindingTypeImpl <em>Service Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceBindingTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getServiceBindingType()
	 * @generated
	 */
	int SERVICE_BINDING_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SERVICE_BINDING = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotListTypeImpl <em>Slot List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSlotListType()
	 * @generated
	 */
	int SLOT_LIST_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_LIST_TYPE__SLOT = 0;

	/**
	 * The number of structural features of the '<em>Slot List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotType1Impl <em>Slot Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotType1Impl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSlotType1()
	 * @generated
	 */
	int SLOT_TYPE1 = 32;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SpecificationLinkTypeImpl <em>Specification Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SpecificationLinkTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSpecificationLinkType()
	 * @generated
	 */
	int SPECIFICATION_LINK_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

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
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

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
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

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
	 * The feature id for the '<em><b>Service Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__SERVICE_BINDING = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specification Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Specification Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl <em>Subscription Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSubscriptionType()
	 * @generated
	 */
	int SUBSCRIPTION_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__SLOT = REGISTRY_OBJECT_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__HOME = REGISTRY_OBJECT_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__ID = REGISTRY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__NAME = REGISTRY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__DESCRIPTION = REGISTRY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__VERSION_INFO = REGISTRY_OBJECT_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__CLASSIFICATION = REGISTRY_OBJECT_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__EXTERNAL_IDENTIFIER = REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__LID = REGISTRY_OBJECT_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__OBJECT_TYPE = REGISTRY_OBJECT_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__STATUS = REGISTRY_OBJECT_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Action Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__ACTION_GROUP = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__ACTION = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__END_TIME = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notification Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__SELECTOR = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__START_TIME = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Subscription Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberListTypeImpl <em>Telephone Number List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getTelephoneNumberListType()
	 * @generated
	 */
	int TELEPHONE_NUMBER_LIST_TYPE = 35;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberTypeImpl <em>Telephone Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getTelephoneNumberType()
	 * @generated
	 */
	int TELEPHONE_NUMBER_TYPE = 36;

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
	 * The number of structural features of the '<em>Telephone Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.UserTypeImpl <em>User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.UserTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__SLOT = PERSON_TYPE__SLOT;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__HOME = PERSON_TYPE__HOME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__ID = PERSON_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__NAME = PERSON_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__DESCRIPTION = PERSON_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__VERSION_INFO = PERSON_TYPE__VERSION_INFO;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__CLASSIFICATION = PERSON_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__EXTERNAL_IDENTIFIER = PERSON_TYPE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__LID = PERSON_TYPE__LID;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__OBJECT_TYPE = PERSON_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__STATUS = PERSON_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__ADDRESS = PERSON_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__PERSON_NAME = PERSON_TYPE__PERSON_NAME;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__TELEPHONE_NUMBER = PERSON_TYPE__TELEPHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__EMAIL_ADDRESS = PERSON_TYPE__EMAIL_ADDRESS;

	/**
	 * The number of structural features of the '<em>User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE_FEATURE_COUNT = PERSON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ValueListTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getValueListType()
	 * @generated
	 */
	int VALUE_LIST_TYPE = 38;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.VersionInfoTypeImpl <em>Version Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.VersionInfoTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getVersionInfoType()
	 * @generated
	 */
	int VERSION_INFO_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE__VERSION_NAME = 1;

	/**
	 * The number of structural features of the '<em>Version Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType <em>Conformance Profile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getConformanceProfileType()
	 * @generated
	 */
	int CONFORMANCE_PROFILE_TYPE = 40;

	/**
	 * The meta object id for the '<em>Conformance Profile Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getConformanceProfileTypeObject()
	 * @generated
	 */
	int CONFORMANCE_PROFILE_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Free Form Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getFreeFormText()
	 * @generated
	 */
	int FREE_FORM_TEXT = 42;

	/**
	 * The meta object id for the '<em>Long Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getLongName()
	 * @generated
	 */
	int LONG_NAME = 43;

	/**
	 * The meta object id for the '<em>Reference URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getReferenceURI()
	 * @generated
	 */
	int REFERENCE_URI = 44;

	/**
	 * The meta object id for the '<em>Short Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getShortName()
	 * @generated
	 */
	int SHORT_NAME = 45;

	/**
	 * The meta object id for the '<em>String16</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString16()
	 * @generated
	 */
	int STRING16 = 46;

	/**
	 * The meta object id for the '<em>String32</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString32()
	 * @generated
	 */
	int STRING32 = 47;

	/**
	 * The meta object id for the '<em>String4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString4()
	 * @generated
	 */
	int STRING4 = 48;

	/**
	 * The meta object id for the '<em>String8</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString8()
	 * @generated
	 */
	int STRING8 = 49;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType <em>Adhoc Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType
	 * @generated
	 */
	EClass getAdhocQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType#getQueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Expression</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType#getQueryExpression()
	 * @see #getAdhocQueryType()
	 * @generated
	 */
	EReference getAdhocQueryType_QueryExpression();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1 <em>Association Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Type1</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1
	 * @generated
	 */
	EClass getAssociationType1();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1#getAssociationType()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_AssociationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1#getSourceObject()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_SourceObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1#getTargetObject <em>Target Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1#getTargetObject()
	 * @see #getAssociationType1()
	 * @generated
	 */
	EAttribute getAssociationType1_TargetObject();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType <em>Auditable Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable Event Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType
	 * @generated
	 */
	EClass getAuditableEventType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getAffectedObjects <em>Affected Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affected Objects</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getAffectedObjects()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EReference getAuditableEventType_AffectedObjects();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getEventType()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_EventType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getRequestId()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_RequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getTimestamp()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getUser()
	 * @see #getAuditableEventType()
	 * @generated
	 */
	EAttribute getAuditableEventType_User();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType <em>Classification Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Node Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType
	 * @generated
	 */
	EClass getClassificationNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getClassificationNode()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EReference getClassificationNodeType_ClassificationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getCode()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EAttribute getClassificationNodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getParent()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EAttribute getClassificationNodeType_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType#getPath()
	 * @see #getClassificationNodeType()
	 * @generated
	 */
	EAttribute getClassificationNodeType_Path();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType <em>Classification Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Scheme Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType
	 * @generated
	 */
	EClass getClassificationSchemeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType#getClassificationNode()
	 * @see #getClassificationSchemeType()
	 * @generated
	 */
	EReference getClassificationSchemeType_ClassificationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType#isIsInternal <em>Is Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Internal</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType#isIsInternal()
	 * @see #getClassificationSchemeType()
	 * @generated
	 */
	EAttribute getClassificationSchemeType_IsInternal();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType#getNodeType()
	 * @see #getClassificationSchemeType()
	 * @generated
	 */
	EAttribute getClassificationSchemeType_NodeType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType <em>Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType
	 * @generated
	 */
	EClass getClassificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationNode()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_ClassificationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationScheme <em>Classification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationScheme()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_ClassificationScheme();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassifiedObject <em>Classified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classified Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassifiedObject()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_ClassifiedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getNodeRepresentation <em>Node Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Representation</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getNodeRepresentation()
	 * @see #getClassificationType()
	 * @generated
	 */
	EAttribute getClassificationType_NodeRepresentation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAdhocQuery <em>Adhoc Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAdhocQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdhocQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getIdentifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifiable</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getIdentifiable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Identifiable();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAuditableEvent <em>Auditable Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAuditableEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditableEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationNode <em>Classification Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationScheme <em>Classification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationScheme()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationScheme();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Email Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getEmailAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EmailAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Identifier</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExtrinsicObject <em>Extrinsic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExtrinsicObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtrinsicObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getFederation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Federation</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getFederation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Federation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getInternationalString <em>International String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>International String</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getInternationalString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InternationalString();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getLocalizedString <em>Localized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized String</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getLocalizedString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocalizedString();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Notification();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotifyAction <em>Notify Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notify Action</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotifyAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NotifyAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRefList <em>Object Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRefList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectRefList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPerson()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Person();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPersonName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PersonName();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPostalAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostalAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getQueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Expression</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getQueryExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_QueryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Registry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObjectList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObjectList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryPackage <em>Registry Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryPackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Service();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getServiceBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Slot();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlotList <em>Slot List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlotList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SlotList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSpecificationLink <em>Specification Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSpecificationLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpecificationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscription</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSubscription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Subscription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getTelephoneNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageDescription <em>Usage Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UsageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageParameter <em>Usage Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Parameter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UsageParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUser()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_User();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValueList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType <em>Email Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Address Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType
	 * @generated
	 */
	EClass getEmailAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getAddress()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getType()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Type();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType <em>External Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Identifier Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType
	 * @generated
	 */
	EClass getExternalIdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType#getIdentificationScheme <em>Identification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identification Scheme</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType#getIdentificationScheme()
	 * @see #getExternalIdentifierType()
	 * @generated
	 */
	EAttribute getExternalIdentifierType_IdentificationScheme();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType#getRegistryObject <em>Registry Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType#getRegistryObject()
	 * @see #getExternalIdentifierType()
	 * @generated
	 */
	EAttribute getExternalIdentifierType_RegistryObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType#getValue()
	 * @see #getExternalIdentifierType()
	 * @generated
	 */
	EAttribute getExternalIdentifierType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType <em>External Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType
	 * @generated
	 */
	EClass getExternalLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType#getExternalURI <em>External URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External URI</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType#getExternalURI()
	 * @see #getExternalLinkType()
	 * @generated
	 */
	EAttribute getExternalLinkType_ExternalURI();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType <em>Extrinsic Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extrinsic Object Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType
	 * @generated
	 */
	EClass getExtrinsicObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getContentVersionInfo <em>Content Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Version Info</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getContentVersionInfo()
	 * @see #getExtrinsicObjectType()
	 * @generated
	 */
	EReference getExtrinsicObjectType_ContentVersionInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Opaque</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#isIsOpaque()
	 * @see #getExtrinsicObjectType()
	 * @generated
	 */
	EAttribute getExtrinsicObjectType_IsOpaque();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getMimeType()
	 * @see #getExtrinsicObjectType()
	 * @generated
	 */
	EAttribute getExtrinsicObjectType_MimeType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType <em>Federation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federation Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType
	 * @generated
	 */
	EClass getFederationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType#getReplicationSyncLatency <em>Replication Sync Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Sync Latency</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType#getReplicationSyncLatency()
	 * @see #getFederationType()
	 * @generated
	 */
	EAttribute getFederationType_ReplicationSyncLatency();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType <em>Identifiable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType
	 * @generated
	 */
	EClass getIdentifiableType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType#getSlot()
	 * @see #getIdentifiableType()
	 * @generated
	 */
	EReference getIdentifiableType_Slot();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType#getHome()
	 * @see #getIdentifiableType()
	 * @generated
	 */
	EAttribute getIdentifiableType_Home();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType#getId()
	 * @see #getIdentifiableType()
	 * @generated
	 */
	EAttribute getIdentifiableType_Id();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType <em>International String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International String Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType
	 * @generated
	 */
	EClass getInternationalStringType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType#getGroup()
	 * @see #getInternationalStringType()
	 * @generated
	 */
	EAttribute getInternationalStringType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType#getLocalizedString <em>Localized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized String</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType#getLocalizedString()
	 * @see #getInternationalStringType()
	 * @generated
	 */
	EReference getInternationalStringType_LocalizedString();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType <em>Localized String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized String Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType
	 * @generated
	 */
	EClass getLocalizedStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType#getCharset()
	 * @see #getLocalizedStringType()
	 * @generated
	 */
	EAttribute getLocalizedStringType_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType#getLang()
	 * @see #getLocalizedStringType()
	 * @generated
	 */
	EAttribute getLocalizedStringType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType#getValue()
	 * @see #getLocalizedStringType()
	 * @generated
	 */
	EAttribute getLocalizedStringType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType
	 * @generated
	 */
	EClass getNotificationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType#getRegistryObjectList()
	 * @see #getNotificationType()
	 * @generated
	 */
	EReference getNotificationType_RegistryObjectList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType#getSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType#getSubscription()
	 * @see #getNotificationType()
	 * @generated
	 */
	EAttribute getNotificationType_Subscription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType <em>Notify Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notify Action Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType
	 * @generated
	 */
	EClass getNotifyActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getEndPoint()
	 * @see #getNotifyActionType()
	 * @generated
	 */
	EAttribute getNotifyActionType_EndPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getNotificationOption <em>Notification Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Option</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getNotificationOption()
	 * @see #getNotifyActionType()
	 * @generated
	 */
	EAttribute getNotifyActionType_NotificationOption();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType <em>Object Ref List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType
	 * @generated
	 */
	EClass getObjectRefListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType#getGroup()
	 * @see #getObjectRefListType()
	 * @generated
	 */
	EAttribute getObjectRefListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Ref</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType#getObjectRef()
	 * @see #getObjectRefListType()
	 * @generated
	 */
	EReference getObjectRefListType_ObjectRef();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType <em>Object Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType
	 * @generated
	 */
	EClass getObjectRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType#isCreateReplica <em>Create Replica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Replica</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType#isCreateReplica()
	 * @see #getObjectRefType()
	 * @generated
	 */
	EAttribute getObjectRefType_CreateReplica();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType
	 * @generated
	 */
	EClass getOrganizationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getAddress()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getTelephoneNumber()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getEmailAddress()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getParent()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getPrimaryContact <em>Primary Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Contact</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType#getPrimaryContact()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_PrimaryContact();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Name Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType
	 * @generated
	 */
	EClass getPersonNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType#getFirstName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType#getLastName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType#getMiddleName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_MiddleName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType
	 * @generated
	 */
	EClass getPersonType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getAddress()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getPersonName()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_PersonName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getTelephoneNumber()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Address</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType#getEmailAddress()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_EmailAddress();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType <em>Postal Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType
	 * @generated
	 */
	EClass getPostalAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCity()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_City();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCountry()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getPostalCode()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStateOrProvince <em>State Or Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Or Province</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStateOrProvince()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_StateOrProvince();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreet()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreetNumber <em>Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreetNumber()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_StreetNumber();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType <em>Query Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Expression Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType
	 * @generated
	 */
	EClass getQueryExpressionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType#getMixed()
	 * @see #getQueryExpressionType()
	 * @generated
	 */
	EAttribute getQueryExpressionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType#getAny()
	 * @see #getQueryExpressionType()
	 * @generated
	 */
	EAttribute getQueryExpressionType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType#getQueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType#getQueryLanguage()
	 * @see #getQueryExpressionType()
	 * @generated
	 */
	EAttribute getQueryExpressionType_QueryLanguage();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType <em>Registry Object List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Object List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType
	 * @generated
	 */
	EClass getRegistryObjectListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType#getIdentifiableGroup <em>Identifiable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifiable Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType#getIdentifiableGroup()
	 * @see #getRegistryObjectListType()
	 * @generated
	 */
	EAttribute getRegistryObjectListType_IdentifiableGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType#getIdentifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifiable</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType#getIdentifiable()
	 * @see #getRegistryObjectListType()
	 * @generated
	 */
	EReference getRegistryObjectListType_Identifiable();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType <em>Registry Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Object Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType
	 * @generated
	 */
	EClass getRegistryObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getName()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getDescription()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getVersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Info</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getVersionInfo()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_VersionInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getClassification()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifier</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getExternalIdentifier()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EReference getRegistryObjectType_ExternalIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getLid <em>Lid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lid</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getLid()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EAttribute getRegistryObjectType_Lid();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getObjectType()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EAttribute getRegistryObjectType_ObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getStatus()
	 * @see #getRegistryObjectType()
	 * @generated
	 */
	EAttribute getRegistryObjectType_Status();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType <em>Registry Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Package Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType
	 * @generated
	 */
	EClass getRegistryPackageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType#getRegistryObjectList()
	 * @see #getRegistryPackageType()
	 * @generated
	 */
	EReference getRegistryPackageType_RegistryObjectList();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType <em>Registry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType
	 * @generated
	 */
	EClass getRegistryType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getCatalogingLatency <em>Cataloging Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cataloging Latency</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getCatalogingLatency()
	 * @see #getRegistryType()
	 * @generated
	 */
	EAttribute getRegistryType_CatalogingLatency();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getConformanceProfile <em>Conformance Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformance Profile</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getConformanceProfile()
	 * @see #getRegistryType()
	 * @generated
	 */
	EAttribute getRegistryType_ConformanceProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getOperator()
	 * @see #getRegistryType()
	 * @generated
	 */
	EAttribute getRegistryType_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getReplicationSyncLatency <em>Replication Sync Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Sync Latency</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getReplicationSyncLatency()
	 * @see #getRegistryType()
	 * @generated
	 */
	EAttribute getRegistryType_ReplicationSyncLatency();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getSpecificationVersion <em>Specification Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Version</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType#getSpecificationVersion()
	 * @see #getRegistryType()
	 * @generated
	 */
	EAttribute getRegistryType_SpecificationVersion();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType <em>Service Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Binding Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType
	 * @generated
	 */
	EClass getServiceBindingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getSpecificationLink <em>Specification Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Link</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getSpecificationLink()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EReference getServiceBindingType_SpecificationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getAccessURI <em>Access URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access URI</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getAccessURI()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_AccessURI();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getService()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getTargetBinding <em>Target Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getTargetBinding()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_TargetBinding();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType#getServiceBinding()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_ServiceBinding();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType <em>Slot List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType
	 * @generated
	 */
	EClass getSlotListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType#getSlot()
	 * @see #getSlotListType()
	 * @generated
	 */
	EReference getSlotListType_Slot();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1 <em>Slot Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Type1</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1
	 * @generated
	 */
	EClass getSlotType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getValueList()
	 * @see #getSlotType1()
	 * @generated
	 */
	EReference getSlotType1_ValueList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getName()
	 * @see #getSlotType1()
	 * @generated
	 */
	EAttribute getSlotType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getSlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getSlotType()
	 * @see #getSlotType1()
	 * @generated
	 */
	EAttribute getSlotType1_SlotType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType <em>Specification Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Link Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType
	 * @generated
	 */
	EClass getSpecificationLinkType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getUsageDescription <em>Usage Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Description</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getUsageDescription()
	 * @see #getSpecificationLinkType()
	 * @generated
	 */
	EReference getSpecificationLinkType_UsageDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getUsageParameter <em>Usage Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage Parameter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getUsageParameter()
	 * @see #getSpecificationLinkType()
	 * @generated
	 */
	EAttribute getSpecificationLinkType_UsageParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Binding</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getServiceBinding()
	 * @see #getSpecificationLinkType()
	 * @generated
	 */
	EAttribute getSpecificationLinkType_ServiceBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getSpecificationObject <em>Specification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType#getSpecificationObject()
	 * @see #getSpecificationLinkType()
	 * @generated
	 */
	EAttribute getSpecificationLinkType_SpecificationObject();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType <em>Subscription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType
	 * @generated
	 */
	EClass getSubscriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getActionGroup()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_ActionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getAction()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EReference getSubscriptionType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getEndTime()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getNotificationInterval <em>Notification Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Interval</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getNotificationInterval()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_NotificationInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getSelector()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_Selector();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getStartTime()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_StartTime();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType <em>Telephone Number List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType
	 * @generated
	 */
	EClass getTelephoneNumberListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType#getTelephoneNumber()
	 * @see #getTelephoneNumberListType()
	 * @generated
	 */
	EReference getTelephoneNumberListType_TelephoneNumber();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType <em>Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType
	 * @generated
	 */
	EClass getTelephoneNumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getAreaCode()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_AreaCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getCountryCode()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getExtension()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getNumber()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getPhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getPhoneType()
	 * @see #getTelephoneNumberType()
	 * @generated
	 */
	EAttribute getTelephoneNumberType_PhoneType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.UserType
	 * @generated
	 */
	EClass getUserType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType <em>Value List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value List Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType
	 * @generated
	 */
	EClass getValueListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType#getGroup()
	 * @see #getValueListType()
	 * @generated
	 */
	EAttribute getValueListType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType#getValue()
	 * @see #getValueListType()
	 * @generated
	 */
	EAttribute getValueListType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType <em>Version Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Info Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType
	 * @generated
	 */
	EClass getVersionInfoType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getComment()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EAttribute getVersionInfoType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getVersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Name</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getVersionName()
	 * @see #getVersionInfoType()
	 * @generated
	 */
	EAttribute getVersionInfoType_VersionName();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType <em>Conformance Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conformance Profile Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
	 * @generated
	 */
	EEnum getConformanceProfileType();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType <em>Conformance Profile Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conformance Profile Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType"
	 *        extendedMetaData="name='conformanceProfile_._type:Object' baseType='conformanceProfile_._type'" 
	 * @generated
	 */
	EDataType getConformanceProfileTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Free Form Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Free Form Text</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FreeFormText' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='1024'" 
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
	 *        extendedMetaData="name='LongName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='256'" 
	 * @generated
	 */
	EDataType getLongName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Reference URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reference URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='referenceURI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'" 
	 * @generated
	 */
	EDataType getReferenceURI();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ActionTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AdhocQueryTypeImpl <em>Adhoc Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AdhocQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getAdhocQueryType()
		 * @generated
		 */
		EClass ADHOC_QUERY_TYPE = eINSTANCE.getAdhocQueryType();

		/**
		 * The meta object literal for the '<em><b>Query Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_TYPE__QUERY_EXPRESSION = eINSTANCE.getAdhocQueryType_QueryExpression();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AssociationType1Impl <em>Association Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AssociationType1Impl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getAssociationType1()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl <em>Auditable Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.AuditableEventTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getAuditableEventType()
		 * @generated
		 */
		EClass AUDITABLE_EVENT_TYPE = eINSTANCE.getAuditableEventType();

		/**
		 * The meta object literal for the '<em><b>Affected Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS = eINSTANCE.getAuditableEventType_AffectedObjects();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE_EVENT_TYPE__EVENT_TYPE = eINSTANCE.getAuditableEventType_EventType();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE_EVENT_TYPE__REQUEST_ID = eINSTANCE.getAuditableEventType_RequestId();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationNodeTypeImpl <em>Classification Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationNodeTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getClassificationNodeType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationSchemeTypeImpl <em>Classification Scheme Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationSchemeTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getClassificationSchemeType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationTypeImpl <em>Classification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ClassificationTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getClassificationType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTION = eINSTANCE.getDocumentRoot_Action();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>Adhoc Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADHOC_QUERY = eINSTANCE.getDocumentRoot_AdhocQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_OBJECT = eINSTANCE.getDocumentRoot_RegistryObject();

		/**
		 * The meta object literal for the '<em><b>Identifiable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IDENTIFIABLE = eINSTANCE.getDocumentRoot_Identifiable();

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
		 * The meta object literal for the '<em><b>Federation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEDERATION = eINSTANCE.getDocumentRoot_Federation();

		/**
		 * The meta object literal for the '<em><b>International String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERNATIONAL_STRING = eINSTANCE.getDocumentRoot_InternationalString();

		/**
		 * The meta object literal for the '<em><b>Localized String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCALIZED_STRING = eINSTANCE.getDocumentRoot_LocalizedString();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTIFICATION = eINSTANCE.getDocumentRoot_Notification();

		/**
		 * The meta object literal for the '<em><b>Notify Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTIFY_ACTION = eINSTANCE.getDocumentRoot_NotifyAction();

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
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSON = eINSTANCE.getDocumentRoot_Person();

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
		 * The meta object literal for the '<em><b>Query Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY_EXPRESSION = eINSTANCE.getDocumentRoot_QueryExpression();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY = eINSTANCE.getDocumentRoot_Registry();

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
		 * The meta object literal for the '<em><b>Slot List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SLOT_LIST = eINSTANCE.getDocumentRoot_SlotList();

		/**
		 * The meta object literal for the '<em><b>Specification Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIFICATION_LINK = eINSTANCE.getDocumentRoot_SpecificationLink();

		/**
		 * The meta object literal for the '<em><b>Subscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSCRIPTION = eINSTANCE.getDocumentRoot_Subscription();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.EmailAddressTypeImpl <em>Email Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.EmailAddressTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getEmailAddressType()
		 * @generated
		 */
		EClass EMAIL_ADDRESS_TYPE = eINSTANCE.getEmailAddressType();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalIdentifierTypeImpl <em>External Identifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalIdentifierTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getExternalIdentifierType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalLinkTypeImpl <em>External Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExternalLinkTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getExternalLinkType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExtrinsicObjectTypeImpl <em>Extrinsic Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ExtrinsicObjectTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getExtrinsicObjectType()
		 * @generated
		 */
		EClass EXTRINSIC_OBJECT_TYPE = eINSTANCE.getExtrinsicObjectType();

		/**
		 * The meta object literal for the '<em><b>Content Version Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO = eINSTANCE.getExtrinsicObjectType_ContentVersionInfo();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.FederationTypeImpl <em>Federation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.FederationTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getFederationType()
		 * @generated
		 */
		EClass FEDERATION_TYPE = eINSTANCE.getFederationType();

		/**
		 * The meta object literal for the '<em><b>Replication Sync Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEDERATION_TYPE__REPLICATION_SYNC_LATENCY = eINSTANCE.getFederationType_ReplicationSyncLatency();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.IdentifiableTypeImpl <em>Identifiable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.IdentifiableTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getIdentifiableType()
		 * @generated
		 */
		EClass IDENTIFIABLE_TYPE = eINSTANCE.getIdentifiableType();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE_TYPE__SLOT = eINSTANCE.getIdentifiableType_Slot();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_TYPE__HOME = eINSTANCE.getIdentifiableType_Home();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_TYPE__ID = eINSTANCE.getIdentifiableType_Id();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.InternationalStringTypeImpl <em>International String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.InternationalStringTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getInternationalStringType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.LocalizedStringTypeImpl <em>Localized String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.LocalizedStringTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getLocalizedStringType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotificationTypeImpl <em>Notification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotificationTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getNotificationType()
		 * @generated
		 */
		EClass NOTIFICATION_TYPE = eINSTANCE.getNotificationType();

		/**
		 * The meta object literal for the '<em><b>Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST = eINSTANCE.getNotificationType_RegistryObjectList();

		/**
		 * The meta object literal for the '<em><b>Subscription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_TYPE__SUBSCRIPTION = eINSTANCE.getNotificationType_Subscription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotifyActionTypeImpl <em>Notify Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.NotifyActionTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getNotifyActionType()
		 * @generated
		 */
		EClass NOTIFY_ACTION_TYPE = eINSTANCE.getNotifyActionType();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFY_ACTION_TYPE__END_POINT = eINSTANCE.getNotifyActionType_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Notification Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION = eINSTANCE.getNotifyActionType_NotificationOption();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefListTypeImpl <em>Object Ref List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getObjectRefListType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ObjectRefTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getObjectRefType()
		 * @generated
		 */
		EClass OBJECT_REF_TYPE = eINSTANCE.getObjectRefType();

		/**
		 * The meta object literal for the '<em><b>Create Replica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REF_TYPE__CREATE_REPLICA = eINSTANCE.getObjectRefType_CreateReplica();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.OrganizationTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getOrganizationType()
		 * @generated
		 */
		EClass ORGANIZATION_TYPE = eINSTANCE.getOrganizationType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__EMAIL_ADDRESS = eINSTANCE.getOrganizationType_EmailAddress();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonNameTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getPersonNameType()
		 * @generated
		 */
		EClass PERSON_NAME_TYPE = eINSTANCE.getPersonNameType();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl <em>Person Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PersonTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getPersonType()
		 * @generated
		 */
		EClass PERSON_TYPE = eINSTANCE.getPersonType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__ADDRESS = eINSTANCE.getPersonType_Address();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__PERSON_NAME = eINSTANCE.getPersonType_PersonName();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__TELEPHONE_NUMBER = eINSTANCE.getPersonType_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__EMAIL_ADDRESS = eINSTANCE.getPersonType_EmailAddress();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PostalAddressTypeImpl <em>Postal Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.PostalAddressTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getPostalAddressType()
		 * @generated
		 */
		EClass POSTAL_ADDRESS_TYPE = eINSTANCE.getPostalAddressType();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.QueryExpressionTypeImpl <em>Query Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.QueryExpressionTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getQueryExpressionType()
		 * @generated
		 */
		EClass QUERY_EXPRESSION_TYPE = eINSTANCE.getQueryExpressionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TYPE__MIXED = eINSTANCE.getQueryExpressionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TYPE__ANY = eINSTANCE.getQueryExpressionType_Any();

		/**
		 * The meta object literal for the '<em><b>Query Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TYPE__QUERY_LANGUAGE = eINSTANCE.getQueryExpressionType_QueryLanguage();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectListTypeImpl <em>Registry Object List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryObjectListType()
		 * @generated
		 */
		EClass REGISTRY_OBJECT_LIST_TYPE = eINSTANCE.getRegistryObjectListType();

		/**
		 * The meta object literal for the '<em><b>Identifiable Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP = eINSTANCE.getRegistryObjectListType_IdentifiableGroup();

		/**
		 * The meta object literal for the '<em><b>Identifiable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE = eINSTANCE.getRegistryObjectListType_Identifiable();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl <em>Registry Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryObjectTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryObjectType()
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
		 * The meta object literal for the '<em><b>Version Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_TYPE__VERSION_INFO = eINSTANCE.getRegistryObjectType_VersionInfo();

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
		 * The meta object literal for the '<em><b>Lid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_TYPE__LID = eINSTANCE.getRegistryObjectType_Lid();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_TYPE__OBJECT_TYPE = eINSTANCE.getRegistryObjectType_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_OBJECT_TYPE__STATUS = eINSTANCE.getRegistryObjectType_Status();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryPackageTypeImpl <em>Registry Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryPackageTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryPackageType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl <em>Registry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RegistryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getRegistryType()
		 * @generated
		 */
		EClass REGISTRY_TYPE = eINSTANCE.getRegistryType();

		/**
		 * The meta object literal for the '<em><b>Cataloging Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_TYPE__CATALOGING_LATENCY = eINSTANCE.getRegistryType_CatalogingLatency();

		/**
		 * The meta object literal for the '<em><b>Conformance Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_TYPE__CONFORMANCE_PROFILE = eINSTANCE.getRegistryType_ConformanceProfile();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_TYPE__OPERATOR = eINSTANCE.getRegistryType_Operator();

		/**
		 * The meta object literal for the '<em><b>Replication Sync Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_TYPE__REPLICATION_SYNC_LATENCY = eINSTANCE.getRegistryType_ReplicationSyncLatency();

		/**
		 * The meta object literal for the '<em><b>Specification Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_TYPE__SPECIFICATION_VERSION = eINSTANCE.getRegistryType_SpecificationVersion();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceBindingTypeImpl <em>Service Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceBindingTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getServiceBindingType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ServiceTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getServiceType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotListTypeImpl <em>Slot List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSlotListType()
		 * @generated
		 */
		EClass SLOT_LIST_TYPE = eINSTANCE.getSlotListType();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_LIST_TYPE__SLOT = eINSTANCE.getSlotListType_Slot();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotType1Impl <em>Slot Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SlotType1Impl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSlotType1()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SpecificationLinkTypeImpl <em>Specification Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SpecificationLinkTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSpecificationLinkType()
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
		 * The meta object literal for the '<em><b>Service Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_LINK_TYPE__SERVICE_BINDING = eINSTANCE.getSpecificationLinkType_ServiceBinding();

		/**
		 * The meta object literal for the '<em><b>Specification Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT = eINSTANCE.getSpecificationLinkType_SpecificationObject();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl <em>Subscription Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.SubscriptionTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getSubscriptionType()
		 * @generated
		 */
		EClass SUBSCRIPTION_TYPE = eINSTANCE.getSubscriptionType();

		/**
		 * The meta object literal for the '<em><b>Action Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__ACTION_GROUP = eINSTANCE.getSubscriptionType_ActionGroup();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_TYPE__ACTION = eINSTANCE.getSubscriptionType_Action();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__END_TIME = eINSTANCE.getSubscriptionType_EndTime();

		/**
		 * The meta object literal for the '<em><b>Notification Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL = eINSTANCE.getSubscriptionType_NotificationInterval();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__SELECTOR = eINSTANCE.getSubscriptionType_Selector();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__START_TIME = eINSTANCE.getSubscriptionType_StartTime();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberListTypeImpl <em>Telephone Number List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getTelephoneNumberListType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberTypeImpl <em>Telephone Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.TelephoneNumberTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getTelephoneNumberType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.UserTypeImpl <em>User Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.UserTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getUserType()
		 * @generated
		 */
		EClass USER_TYPE = eINSTANCE.getUserType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.ValueListTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getValueListType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.VersionInfoTypeImpl <em>Version Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.VersionInfoTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getVersionInfoType()
		 * @generated
		 */
		EClass VERSION_INFO_TYPE = eINSTANCE.getVersionInfoType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFO_TYPE__COMMENT = eINSTANCE.getVersionInfoType_Comment();

		/**
		 * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFO_TYPE__VERSION_NAME = eINSTANCE.getVersionInfoType_VersionName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType <em>Conformance Profile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getConformanceProfileType()
		 * @generated
		 */
		EEnum CONFORMANCE_PROFILE_TYPE = eINSTANCE.getConformanceProfileType();

		/**
		 * The meta object literal for the '<em>Conformance Profile Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getConformanceProfileTypeObject()
		 * @generated
		 */
		EDataType CONFORMANCE_PROFILE_TYPE_OBJECT = eINSTANCE.getConformanceProfileTypeObject();

		/**
		 * The meta object literal for the '<em>Free Form Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getFreeFormText()
		 * @generated
		 */
		EDataType FREE_FORM_TEXT = eINSTANCE.getFreeFormText();

		/**
		 * The meta object literal for the '<em>Long Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getLongName()
		 * @generated
		 */
		EDataType LONG_NAME = eINSTANCE.getLongName();

		/**
		 * The meta object literal for the '<em>Reference URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getReferenceURI()
		 * @generated
		 */
		EDataType REFERENCE_URI = eINSTANCE.getReferenceURI();

		/**
		 * The meta object literal for the '<em>Short Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getShortName()
		 * @generated
		 */
		EDataType SHORT_NAME = eINSTANCE.getShortName();

		/**
		 * The meta object literal for the '<em>String16</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString16()
		 * @generated
		 */
		EDataType STRING16 = eINSTANCE.getString16();

		/**
		 * The meta object literal for the '<em>String32</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString32()
		 * @generated
		 */
		EDataType STRING32 = eINSTANCE.getString32();

		/**
		 * The meta object literal for the '<em>String4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString4()
		 * @generated
		 */
		EDataType STRING4 = eINSTANCE.getString4();

		/**
		 * The meta object literal for the '<em>String8</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.impl.RimPackageImpl#getString8()
		 * @generated
		 */
		EDataType STRING8 = eINSTANCE.getString8();

	}

} //RimPackage
