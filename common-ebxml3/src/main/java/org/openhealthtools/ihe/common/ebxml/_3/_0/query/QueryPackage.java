/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryPackage.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryFactory
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
	String eNS_URI = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0";

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
	QueryPackage eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterQueryTypeImpl <em>Filter Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFilterQueryType()
	 * @generated
	 */
	int FILTER_QUERY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE__PRIMARY_FILTER = 0;

	/**
	 * The number of structural features of the '<em>Filter Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_QUERY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl <em>Registry Object Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getRegistryObjectQueryType()
	 * @generated
	 */
	int REGISTRY_OBJECT_QUERY_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER = FILTER_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH = FILTER_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH = FILTER_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH = FILTER_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER = FILTER_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Registry Object Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT = FILTER_QUERY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryQueryTypeImpl <em>Adhoc Query Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAdhocQueryQueryType()
	 * @generated
	 */
	int ADHOC_QUERY_QUERY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Query Expression Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adhoc Query Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl <em>Adhoc Query Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAdhocQueryRequestType()
	 * @generated
	 */
	int ADHOC_QUERY_REQUEST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Request Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__REQUEST_SLOT_LIST = RegistryPackage.REGISTRY_REQUEST_TYPE__REQUEST_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__COMMENT = RegistryPackage.REGISTRY_REQUEST_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__ID = RegistryPackage.REGISTRY_REQUEST_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Response Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Federated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__FEDERATED = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Federation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__FEDERATION = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE__START_INDEX = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Adhoc Query Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_REQUEST_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_REQUEST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryResponseTypeImpl <em>Adhoc Query Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryResponseTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAdhocQueryResponseType()
	 * @generated
	 */
	int ADHOC_QUERY_RESPONSE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Response Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__RESPONSE_SLOT_LIST = RegistryPackage.REGISTRY_RESPONSE_TYPE__RESPONSE_SLOT_LIST;

	/**
	 * The feature id for the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_ERROR_LIST = RegistryPackage.REGISTRY_RESPONSE_TYPE__REGISTRY_ERROR_LIST;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__REQUEST_ID = RegistryPackage.REGISTRY_RESPONSE_TYPE__REQUEST_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__STATUS = RegistryPackage.REGISTRY_RESPONSE_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST = RegistryPackage.REGISTRY_RESPONSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__START_INDEX = RegistryPackage.REGISTRY_RESPONSE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Result Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT = RegistryPackage.REGISTRY_RESPONSE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Adhoc Query Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_QUERY_RESPONSE_TYPE_FEATURE_COUNT = RegistryPackage.REGISTRY_RESPONSE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AssociationQueryTypeImpl <em>Association Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AssociationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAssociationQueryType()
	 * @generated
	 */
	int ASSOCIATION_QUERY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

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
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Association Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AuditableEventQueryTypeImpl <em>Auditable Event Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AuditableEventQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAuditableEventQueryType()
	 * @generated
	 */
	int AUDITABLE_EVENT_QUERY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__PRIMARY_FILTER = FILTER_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Affected Object Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY = FILTER_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Auditable Event Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_EVENT_QUERY_TYPE_FEATURE_COUNT = FILTER_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__NEGATE = 0;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SimpleFilterTypeImpl <em>Simple Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SimpleFilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSimpleFilterType()
	 * @generated
	 */
	int SIMPLE_FILTER_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FILTER_TYPE__NEGATE = FILTER_TYPE__NEGATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FILTER_TYPE__COMPARATOR = FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE = FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FILTER_TYPE_FEATURE_COUNT = FILTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BooleanFilterTypeImpl <em>Boolean Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BooleanFilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getBooleanFilterType()
	 * @generated
	 */
	int BOOLEAN_FILTER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_TYPE__NEGATE = SIMPLE_FILTER_TYPE__NEGATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_TYPE__COMPARATOR = SIMPLE_FILTER_TYPE__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Domain Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_TYPE__DOMAIN_ATTRIBUTE = SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_TYPE__VALUE = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FILTER_TYPE_FEATURE_COUNT = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BranchTypeImpl <em>Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getBranchType()
	 * @generated
	 */
	int BRANCH_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__PRIMARY_FILTER = FILTER_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The number of structural features of the '<em>Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE_FEATURE_COUNT = FILTER_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationNodeQueryTypeImpl <em>Classification Node Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationNodeQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getClassificationNodeQueryType()
	 * @generated
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

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
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Parent Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classification Node Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_NODE_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationQueryTypeImpl <em>Classification Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getClassificationQueryType()
	 * @generated
	 */
	int CLASSIFICATION_QUERY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

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
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classified Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classification Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationSchemeQueryTypeImpl <em>Classification Scheme Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationSchemeQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getClassificationSchemeQueryType()
	 * @generated
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Children Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classification Scheme Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_SCHEME_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.CompoundFilterTypeImpl <em>Compound Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.CompoundFilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getCompoundFilterType()
	 * @generated
	 */
	int COMPOUND_FILTER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FILTER_TYPE__NEGATE = FILTER_TYPE__NEGATE;

	/**
	 * The feature id for the '<em><b>Left Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FILTER_TYPE__LEFT_FILTER = FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FILTER_TYPE__RIGHT_FILTER = FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR = FILTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compound Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FILTER_TYPE_FEATURE_COUNT = FILTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DateTimeFilterTypeImpl <em>Date Time Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DateTimeFilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getDateTimeFilterType()
	 * @generated
	 */
	int DATE_TIME_FILTER_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FILTER_TYPE__NEGATE = SIMPLE_FILTER_TYPE__NEGATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FILTER_TYPE__COMPARATOR = SIMPLE_FILTER_TYPE__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Domain Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FILTER_TYPE__DOMAIN_ATTRIBUTE = SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FILTER_TYPE__VALUE = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FILTER_TYPE_FEATURE_COUNT = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

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
	 * The feature id for the '<em><b>Adhoc Query Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADHOC_QUERY_QUERY = 3;

	/**
	 * The feature id for the '<em><b>Adhoc Query Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADHOC_QUERY_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Adhoc Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADHOC_QUERY_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Association Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Auditable Event Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Boolean Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_FILTER = 8;

	/**
	 * The feature id for the '<em><b>Classification Node Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_QUERY = 10;

	/**
	 * The feature id for the '<em><b>Classification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Compound Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPOUND_FILTER = 12;

	/**
	 * The feature id for the '<em><b>Date Time Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_TIME_FILTER = 13;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY = 14;

	/**
	 * The feature id for the '<em><b>External Link Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_LINK_QUERY = 15;

	/**
	 * The feature id for the '<em><b>Extrinsic Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY = 16;

	/**
	 * The feature id for the '<em><b>Federation Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEDERATION_QUERY = 17;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 18;

	/**
	 * The feature id for the '<em><b>Float Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOAT_FILTER = 19;

	/**
	 * The feature id for the '<em><b>Integer Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTEGER_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Notification Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTIFICATION_QUERY = 21;

	/**
	 * The feature id for the '<em><b>Organization Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_QUERY = 22;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY = 23;

	/**
	 * The feature id for the '<em><b>Registry Package Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY = 24;

	/**
	 * The feature id for the '<em><b>Registry Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRY_QUERY = 25;

	/**
	 * The feature id for the '<em><b>Response Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESPONSE_OPTION = 26;

	/**
	 * The feature id for the '<em><b>Service Binding Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_BINDING_QUERY = 27;

	/**
	 * The feature id for the '<em><b>Service Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_QUERY = 28;

	/**
	 * The feature id for the '<em><b>Specification Link Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY = 29;

	/**
	 * The feature id for the '<em><b>String Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_FILTER = 30;

	/**
	 * The feature id for the '<em><b>Subscription Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSCRIPTION_QUERY = 31;

	/**
	 * The feature id for the '<em><b>User Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_QUERY = 32;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 33;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalIdentifierQueryTypeImpl <em>External Identifier Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalIdentifierQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getExternalIdentifierQueryType()
	 * @generated
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identification Scheme Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Identifier Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalLinkQueryTypeImpl <em>External Link Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalLinkQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getExternalLinkQueryType()
	 * @generated
	 */
	int EXTERNAL_LINK_QUERY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The number of structural features of the '<em>External Link Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExtrinsicObjectQueryTypeImpl <em>Extrinsic Object Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExtrinsicObjectQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getExtrinsicObjectQueryType()
	 * @generated
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Content Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extrinsic Object Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRINSIC_OBJECT_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FederationQueryTypeImpl <em>Federation Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FederationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFederationQueryType()
	 * @generated
	 */
	int FEDERATION_QUERY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The number of structural features of the '<em>Federation Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FloatFilterTypeImpl <em>Float Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FloatFilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFloatFilterType()
	 * @generated
	 */
	int FLOAT_FILTER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FILTER_TYPE__NEGATE = SIMPLE_FILTER_TYPE__NEGATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FILTER_TYPE__COMPARATOR = SIMPLE_FILTER_TYPE__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Domain Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FILTER_TYPE__DOMAIN_ATTRIBUTE = SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FILTER_TYPE__VALUE = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FILTER_TYPE_FEATURE_COUNT = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.IntegerFilterTypeImpl <em>Integer Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.IntegerFilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getIntegerFilterType()
	 * @generated
	 */
	int INTEGER_FILTER_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FILTER_TYPE__NEGATE = SIMPLE_FILTER_TYPE__NEGATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FILTER_TYPE__COMPARATOR = SIMPLE_FILTER_TYPE__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Domain Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FILTER_TYPE__DOMAIN_ATTRIBUTE = SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FILTER_TYPE__VALUE = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FILTER_TYPE_FEATURE_COUNT = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.InternationalStringBranchTypeImpl <em>International String Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.InternationalStringBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getInternationalStringBranchType()
	 * @generated
	 */
	int INTERNATIONAL_STRING_BRANCH_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_BRANCH_TYPE__PRIMARY_FILTER = BRANCH_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Localized String Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_BRANCH_TYPE__LOCALIZED_STRING_FILTER = BRANCH_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>International String Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STRING_BRANCH_TYPE_FEATURE_COUNT = BRANCH_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.NotificationQueryTypeImpl <em>Notification Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.NotificationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getNotificationQueryType()
	 * @generated
	 */
	int NOTIFICATION_QUERY_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notification Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl <em>Organization Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getOrganizationQueryType()
	 * @generated
	 */
	int ORGANIZATION_QUERY_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

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
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Address Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Telephone Number Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email Addresse Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__PARENT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Organization Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Primary Contact Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Organization Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl <em>Person Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getPersonQueryType()
	 * @generated
	 */
	int PERSON_QUERY_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Address Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__ADDRESS_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person Name Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__PERSON_NAME_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telephone Number Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email Addresse Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryExpressionBranchTypeImpl <em>Expression Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryExpressionBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getQueryExpressionBranchType()
	 * @generated
	 */
	int QUERY_EXPRESSION_BRANCH_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_BRANCH_TYPE__PRIMARY_FILTER = BRANCH_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Query Language Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY = BRANCH_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_BRANCH_TYPE_FEATURE_COUNT = BRANCH_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryPackageQueryTypeImpl <em>Registry Package Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryPackageQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getRegistryPackageQueryType()
	 * @generated
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Registry Object Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registry Package Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_PACKAGE_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryQueryTypeImpl <em>Registry Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getRegistryQueryType()
	 * @generated
	 */
	int REGISTRY_QUERY_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Operator Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE__OPERATOR_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registry Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ResponseOptionTypeImpl <em>Response Option Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ResponseOptionTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getResponseOptionType()
	 * @generated
	 */
	int RESPONSE_OPTION_TYPE = 29;

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
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceBindingQueryTypeImpl <em>Service Binding Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceBindingQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getServiceBindingQueryType()
	 * @generated
	 */
	int SERVICE_BINDING_QUERY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Service Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Link Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Binding Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Binding Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceQueryTypeImpl <em>Service Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getServiceQueryType()
	 * @generated
	 */
	int SERVICE_QUERY_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Service Binding Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SlotBranchTypeImpl <em>Slot Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SlotBranchTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSlotBranchType()
	 * @generated
	 */
	int SLOT_BRANCH_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_BRANCH_TYPE__PRIMARY_FILTER = BRANCH_TYPE__PRIMARY_FILTER;

	/**
	 * The number of structural features of the '<em>Slot Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_BRANCH_TYPE_FEATURE_COUNT = BRANCH_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SpecificationLinkQueryTypeImpl <em>Specification Link Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SpecificationLinkQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSpecificationLinkQueryType()
	 * @generated
	 */
	int SPECIFICATION_LINK_QUERY_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Usage Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Binding Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specification Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification Link Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_LINK_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.StringFilterTypeImpl <em>String Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.StringFilterTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getStringFilterType()
	 * @generated
	 */
	int STRING_FILTER_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FILTER_TYPE__NEGATE = SIMPLE_FILTER_TYPE__NEGATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FILTER_TYPE__COMPARATOR = SIMPLE_FILTER_TYPE__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Domain Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FILTER_TYPE__DOMAIN_ATTRIBUTE = SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FILTER_TYPE__VALUE = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FILTER_TYPE_FEATURE_COUNT = SIMPLE_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SubscriptionQueryTypeImpl <em>Subscription Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SubscriptionQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSubscriptionQueryType()
	 * @generated
	 */
	int SUBSCRIPTION_QUERY_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__PRIMARY_FILTER = REGISTRY_OBJECT_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__SLOT_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__NAME_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__DESCRIPTION_BRANCH = REGISTRY_OBJECT_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__VERSION_INFO_FILTER = REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__CLASSIFICATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__OBJECT_TYPE_QUERY = REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__STATUS_QUERY = REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Selector Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subscription Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_QUERY_TYPE_FEATURE_COUNT = REGISTRY_OBJECT_QUERY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.UserQueryTypeImpl <em>User Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.UserQueryTypeImpl
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getUserQueryType()
	 * @generated
	 */
	int USER_QUERY_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__PRIMARY_FILTER = PERSON_QUERY_TYPE__PRIMARY_FILTER;

	/**
	 * The feature id for the '<em><b>Slot Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__SLOT_BRANCH = PERSON_QUERY_TYPE__SLOT_BRANCH;

	/**
	 * The feature id for the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__NAME_BRANCH = PERSON_QUERY_TYPE__NAME_BRANCH;

	/**
	 * The feature id for the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__DESCRIPTION_BRANCH = PERSON_QUERY_TYPE__DESCRIPTION_BRANCH;

	/**
	 * The feature id for the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__VERSION_INFO_FILTER = PERSON_QUERY_TYPE__VERSION_INFO_FILTER;

	/**
	 * The feature id for the '<em><b>Classification Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__CLASSIFICATION_QUERY = PERSON_QUERY_TYPE__CLASSIFICATION_QUERY;

	/**
	 * The feature id for the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = PERSON_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY;

	/**
	 * The feature id for the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__OBJECT_TYPE_QUERY = PERSON_QUERY_TYPE__OBJECT_TYPE_QUERY;

	/**
	 * The feature id for the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__STATUS_QUERY = PERSON_QUERY_TYPE__STATUS_QUERY;

	/**
	 * The feature id for the '<em><b>Source Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = PERSON_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Target Association Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = PERSON_QUERY_TYPE__TARGET_ASSOCIATION_QUERY;

	/**
	 * The feature id for the '<em><b>Address Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__ADDRESS_FILTER = PERSON_QUERY_TYPE__ADDRESS_FILTER;

	/**
	 * The feature id for the '<em><b>Person Name Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__PERSON_NAME_FILTER = PERSON_QUERY_TYPE__PERSON_NAME_FILTER;

	/**
	 * The feature id for the '<em><b>Telephone Number Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__TELEPHONE_NUMBER_FILTER = PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER;

	/**
	 * The feature id for the '<em><b>Email Addresse Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE__EMAIL_ADDRESSE_FILTER = PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER;

	/**
	 * The number of structural features of the '<em>User Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_QUERY_TYPE_FEATURE_COUNT = PERSON_QUERY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType <em>Comparator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getComparatorType()
	 * @generated
	 */
	int COMPARATOR_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType <em>Logical Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getLogicalOperatorType()
	 * @generated
	 */
	int LOGICAL_OPERATOR_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType <em>Return Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getReturnTypeType()
	 * @generated
	 */
	int RETURN_TYPE_TYPE = 40;

	/**
	 * The meta object id for the '<em>Comparator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getComparatorTypeObject()
	 * @generated
	 */
	int COMPARATOR_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Logical Operator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getLogicalOperatorTypeObject()
	 * @generated
	 */
	int LOGICAL_OPERATOR_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Return Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getReturnTypeTypeObject()
	 * @generated
	 */
	int RETURN_TYPE_TYPE_OBJECT = 43;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType <em>Adhoc Query Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Query Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType
	 * @generated
	 */
	EClass getAdhocQueryQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType#getQueryExpressionBranch <em>Query Expression Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Expression Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType#getQueryExpressionBranch()
	 * @see #getAdhocQueryQueryType()
	 * @generated
	 */
	EReference getAdhocQueryQueryType_QueryExpressionBranch();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType <em>Adhoc Query Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Query Request Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType
	 * @generated
	 */
	EClass getAdhocQueryRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getResponseOption <em>Response Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Option</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getResponseOption()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EReference getAdhocQueryRequestType_ResponseOption();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getAdhocQuery <em>Adhoc Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getAdhocQuery()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EReference getAdhocQueryRequestType_AdhocQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#isFederated <em>Federated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federated</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#isFederated()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EAttribute getAdhocQueryRequestType_Federated();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getFederation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federation</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getFederation()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EAttribute getAdhocQueryRequestType_Federation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getMaxResults <em>Max Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Results</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getMaxResults()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EAttribute getAdhocQueryRequestType_MaxResults();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getStartIndex()
	 * @see #getAdhocQueryRequestType()
	 * @generated
	 */
	EAttribute getAdhocQueryRequestType_StartIndex();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType <em>Adhoc Query Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Query Response Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType
	 * @generated
	 */
	EClass getAdhocQueryResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getRegistryObjectList <em>Registry Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object List</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getRegistryObjectList()
	 * @see #getAdhocQueryResponseType()
	 * @generated
	 */
	EReference getAdhocQueryResponseType_RegistryObjectList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getStartIndex()
	 * @see #getAdhocQueryResponseType()
	 * @generated
	 */
	EAttribute getAdhocQueryResponseType_StartIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getTotalResultCount <em>Total Result Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Result Count</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getTotalResultCount()
	 * @see #getAdhocQueryResponseType()
	 * @generated
	 */
	EAttribute getAdhocQueryResponseType_TotalResultCount();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType <em>Association Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType
	 * @generated
	 */
	EClass getAssociationQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getAssociationTypeQuery <em>Association Type Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Type Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getAssociationTypeQuery()
	 * @see #getAssociationQueryType()
	 * @generated
	 */
	EReference getAssociationQueryType_AssociationTypeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getSourceObjectQuery <em>Source Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getSourceObjectQuery()
	 * @see #getAssociationQueryType()
	 * @generated
	 */
	EReference getAssociationQueryType_SourceObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getTargetObjectQuery <em>Target Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getTargetObjectQuery()
	 * @see #getAssociationQueryType()
	 * @generated
	 */
	EReference getAssociationQueryType_TargetObjectQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType <em>Auditable Event Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable Event Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType
	 * @generated
	 */
	EClass getAuditableEventQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getAffectedObjectQuery <em>Affected Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getAffectedObjectQuery()
	 * @see #getAuditableEventQueryType()
	 * @generated
	 */
	EReference getAuditableEventQueryType_AffectedObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getEventTypeQuery <em>Event Type Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Type Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getEventTypeQuery()
	 * @see #getAuditableEventQueryType()
	 * @generated
	 */
	EReference getAuditableEventQueryType_EventTypeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getUserQuery <em>User Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getUserQuery()
	 * @see #getAuditableEventQueryType()
	 * @generated
	 */
	EReference getAuditableEventQueryType_UserQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType <em>Boolean Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType
	 * @generated
	 */
	EClass getBooleanFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.BooleanFilterType#isValue()
	 * @see #getBooleanFilterType()
	 * @generated
	 */
	EAttribute getBooleanFilterType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.BranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.BranchType
	 * @generated
	 */
	EClass getBranchType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType <em>Classification Node Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Node Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType
	 * @generated
	 */
	EClass getClassificationNodeQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType#getParentQuery <em>Parent Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType#getParentQuery()
	 * @see #getClassificationNodeQueryType()
	 * @generated
	 */
	EReference getClassificationNodeQueryType_ParentQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType#getChildrenQuery <em>Children Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType#getChildrenQuery()
	 * @see #getClassificationNodeQueryType()
	 * @generated
	 */
	EReference getClassificationNodeQueryType_ChildrenQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType <em>Classification Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType
	 * @generated
	 */
	EClass getClassificationQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType#getClassificationSchemeQuery()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType#getClassifiedObjectQuery <em>Classified Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classified Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType#getClassifiedObjectQuery()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_ClassifiedObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType#getClassificationNodeQuery <em>Classification Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType#getClassificationNodeQuery()
	 * @see #getClassificationQueryType()
	 * @generated
	 */
	EReference getClassificationQueryType_ClassificationNodeQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType <em>Classification Scheme Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Scheme Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType
	 * @generated
	 */
	EClass getClassificationSchemeQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType#getChildrenQuery <em>Children Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType#getChildrenQuery()
	 * @see #getClassificationSchemeQueryType()
	 * @generated
	 */
	EReference getClassificationSchemeQueryType_ChildrenQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType#getNodeTypeQuery <em>Node Type Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Type Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationSchemeQueryType#getNodeTypeQuery()
	 * @see #getClassificationSchemeQueryType()
	 * @generated
	 */
	EReference getClassificationSchemeQueryType_NodeTypeQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType <em>Compound Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType
	 * @generated
	 */
	EClass getCompoundFilterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLeftFilter <em>Left Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLeftFilter()
	 * @see #getCompoundFilterType()
	 * @generated
	 */
	EReference getCompoundFilterType_LeftFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getRightFilter <em>Right Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getRightFilter()
	 * @see #getCompoundFilterType()
	 * @generated
	 */
	EReference getCompoundFilterType_RightFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Operator</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLogicalOperator()
	 * @see #getCompoundFilterType()
	 * @generated
	 */
	EAttribute getCompoundFilterType_LogicalOperator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType <em>Date Time Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType
	 * @generated
	 */
	EClass getDateTimeFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DateTimeFilterType#getValue()
	 * @see #getDateTimeFilterType()
	 * @generated
	 */
	EAttribute getDateTimeFilterType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryQuery <em>Adhoc Query Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdhocQueryQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryRequest <em>Adhoc Query Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query Request</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdhocQueryRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryResponse <em>Adhoc Query Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adhoc Query Response</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAdhocQueryResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdhocQueryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAssociationQuery <em>Association Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAssociationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAuditableEventQuery <em>Auditable Event Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditable Event Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getAuditableEventQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditableEventQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getBooleanFilter <em>Boolean Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getBooleanFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BooleanFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationNodeQuery <em>Classification Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Node Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationNodeQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationNodeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationQuery <em>Classification Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationSchemeQuery <em>Classification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getClassificationSchemeQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassificationSchemeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getCompoundFilter <em>Compound Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compound Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getCompoundFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompoundFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getDateTimeFilter <em>Date Time Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getDateTimeFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateTimeFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalIdentifierQuery <em>External Identifier Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Identifier Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalIdentifierQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalIdentifierQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalLinkQuery <em>External Link Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Link Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExternalLinkQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalLinkQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExtrinsicObjectQuery <em>Extrinsic Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrinsic Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getExtrinsicObjectQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtrinsicObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFederationQuery <em>Federation Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Federation Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFederationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FederationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFloatFilter <em>Float Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getFloatFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FloatFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getIntegerFilter <em>Integer Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getIntegerFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntegerFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getNotificationQuery <em>Notification Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getNotificationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NotificationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getOrganizationQuery <em>Organization Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getOrganizationQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganizationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryObjectQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryPackageQuery <em>Registry Package Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Package Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryPackageQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryPackageQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryQuery <em>Registry Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getRegistryQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegistryQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getResponseOption <em>Response Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Option</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getResponseOption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResponseOption();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceBindingQuery <em>Service Binding Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceBindingQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceBindingQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceQuery <em>Service Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getServiceQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSpecificationLinkQuery <em>Specification Link Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Link Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSpecificationLinkQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpecificationLinkQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getStringFilter <em>String Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getStringFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSubscriptionQuery <em>Subscription Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscription Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getSubscriptionQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubscriptionQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getUserQuery <em>User Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot#getUserQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType <em>External Identifier Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Identifier Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType
	 * @generated
	 */
	EClass getExternalIdentifierQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType#getRegistryObjectQuery()
	 * @see #getExternalIdentifierQueryType()
	 * @generated
	 */
	EReference getExternalIdentifierQueryType_RegistryObjectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType#getIdentificationSchemeQuery <em>Identification Scheme Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identification Scheme Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType#getIdentificationSchemeQuery()
	 * @see #getExternalIdentifierQueryType()
	 * @generated
	 */
	EReference getExternalIdentifierQueryType_IdentificationSchemeQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalLinkQueryType <em>External Link Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalLinkQueryType
	 * @generated
	 */
	EClass getExternalLinkQueryType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType <em>Extrinsic Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extrinsic Object Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType
	 * @generated
	 */
	EClass getExtrinsicObjectQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType#getContentVersionInfoFilter <em>Content Version Info Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Version Info Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType#getContentVersionInfoFilter()
	 * @see #getExtrinsicObjectQueryType()
	 * @generated
	 */
	EReference getExtrinsicObjectQueryType_ContentVersionInfoFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FederationQueryType <em>Federation Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federation Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FederationQueryType
	 * @generated
	 */
	EClass getFederationQueryType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType <em>Filter Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType
	 * @generated
	 */
	EClass getFilterQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType#getPrimaryFilter <em>Primary Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType#getPrimaryFilter()
	 * @see #getFilterQueryType()
	 * @generated
	 */
	EReference getFilterQueryType_PrimaryFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType#isNegate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negate</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType#isNegate()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_Negate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType <em>Float Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType
	 * @generated
	 */
	EClass getFloatFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.FloatFilterType#getValue()
	 * @see #getFloatFilterType()
	 * @generated
	 */
	EAttribute getFloatFilterType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType <em>Integer Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType
	 * @generated
	 */
	EClass getIntegerFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.IntegerFilterType#getValue()
	 * @see #getIntegerFilterType()
	 * @generated
	 */
	EAttribute getIntegerFilterType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType <em>International String Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International String Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType
	 * @generated
	 */
	EClass getInternationalStringBranchType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType#getLocalizedStringFilter <em>Localized String Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized String Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType#getLocalizedStringFilter()
	 * @see #getInternationalStringBranchType()
	 * @generated
	 */
	EReference getInternationalStringBranchType_LocalizedStringFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType <em>Notification Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType
	 * @generated
	 */
	EClass getNotificationQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType#getRegistryObjectQuery()
	 * @see #getNotificationQueryType()
	 * @generated
	 */
	EReference getNotificationQueryType_RegistryObjectQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType <em>Organization Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType
	 * @generated
	 */
	EClass getOrganizationQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getAddressFilter <em>Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getAddressFilter()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_AddressFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getTelephoneNumberFilter()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_TelephoneNumberFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getEmailAddresseFilter <em>Email Addresse Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Addresse Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getEmailAddresseFilter()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_EmailAddresseFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getParentQuery <em>Parent Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getParentQuery()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_ParentQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getChildOrganizationQuery <em>Child Organization Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Organization Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getChildOrganizationQuery()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_ChildOrganizationQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getPrimaryContactQuery <em>Primary Contact Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Contact Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getPrimaryContactQuery()
	 * @see #getOrganizationQueryType()
	 * @generated
	 */
	EReference getOrganizationQueryType_PrimaryContactQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType <em>Person Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType
	 * @generated
	 */
	EClass getPersonQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getAddressFilter <em>Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getAddressFilter()
	 * @see #getPersonQueryType()
	 * @generated
	 */
	EReference getPersonQueryType_AddressFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getPersonNameFilter <em>Person Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getPersonNameFilter()
	 * @see #getPersonQueryType()
	 * @generated
	 */
	EReference getPersonQueryType_PersonNameFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getTelephoneNumberFilter()
	 * @see #getPersonQueryType()
	 * @generated
	 */
	EReference getPersonQueryType_TelephoneNumberFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getEmailAddresseFilter <em>Email Addresse Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Addresse Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getEmailAddresseFilter()
	 * @see #getPersonQueryType()
	 * @generated
	 */
	EReference getPersonQueryType_EmailAddresseFilter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType <em>Expression Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType
	 * @generated
	 */
	EClass getQueryExpressionBranchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType#getQueryLanguageQuery <em>Query Language Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Language Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType#getQueryLanguageQuery()
	 * @see #getQueryExpressionBranchType()
	 * @generated
	 */
	EReference getQueryExpressionBranchType_QueryLanguageQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType <em>Registry Object Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Object Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType
	 * @generated
	 */
	EClass getRegistryObjectQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getSlotBranch <em>Slot Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getSlotBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_SlotBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getNameBranch <em>Name Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getNameBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_NameBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getDescriptionBranch <em>Description Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getDescriptionBranch()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_DescriptionBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getVersionInfoFilter <em>Version Info Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Info Filter</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getVersionInfoFilter()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_VersionInfoFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getClassificationQuery <em>Classification Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getClassificationQuery()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_ClassificationQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getExternalIdentifierQuery <em>External Identifier Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifier Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getExternalIdentifierQuery()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_ExternalIdentifierQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getObjectTypeQuery <em>Object Type Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Type Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getObjectTypeQuery()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_ObjectTypeQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getStatusQuery <em>Status Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getStatusQuery()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_StatusQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getSourceAssociationQuery <em>Source Association Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Association Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getSourceAssociationQuery()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_SourceAssociationQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getTargetAssociationQuery <em>Target Association Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Association Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getTargetAssociationQuery()
	 * @see #getRegistryObjectQueryType()
	 * @generated
	 */
	EReference getRegistryObjectQueryType_TargetAssociationQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType <em>Registry Package Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Package Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType
	 * @generated
	 */
	EClass getRegistryPackageQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType#getRegistryObjectQuery()
	 * @see #getRegistryPackageQueryType()
	 * @generated
	 */
	EReference getRegistryPackageQueryType_RegistryObjectQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType <em>Registry Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType
	 * @generated
	 */
	EClass getRegistryQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType#getOperatorQuery <em>Operator Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType#getOperatorQuery()
	 * @see #getRegistryQueryType()
	 * @generated
	 */
	EReference getRegistryQueryType_OperatorQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType <em>Response Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Option Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType
	 * @generated
	 */
	EClass getResponseOptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType#isReturnComposedObjects <em>Return Composed Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Composed Objects</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType#isReturnComposedObjects()
	 * @see #getResponseOptionType()
	 * @generated
	 */
	EAttribute getResponseOptionType_ReturnComposedObjects();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType#getReturnType()
	 * @see #getResponseOptionType()
	 * @generated
	 */
	EAttribute getResponseOptionType_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType <em>Service Binding Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Binding Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType
	 * @generated
	 */
	EClass getServiceBindingQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getServiceQuery <em>Service Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getServiceQuery()
	 * @see #getServiceBindingQueryType()
	 * @generated
	 */
	EReference getServiceBindingQueryType_ServiceQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getSpecificationLinkQuery <em>Specification Link Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Link Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getSpecificationLinkQuery()
	 * @see #getServiceBindingQueryType()
	 * @generated
	 */
	EReference getServiceBindingQueryType_SpecificationLinkQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getTargetBindingQuery <em>Target Binding Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Binding Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getTargetBindingQuery()
	 * @see #getServiceBindingQueryType()
	 * @generated
	 */
	EReference getServiceBindingQueryType_TargetBindingQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType <em>Service Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType
	 * @generated
	 */
	EClass getServiceQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType#getServiceBindingQuery <em>Service Binding Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Binding Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType#getServiceBindingQuery()
	 * @see #getServiceQueryType()
	 * @generated
	 */
	EReference getServiceQueryType_ServiceBindingQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType <em>Simple Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType
	 * @generated
	 */
	EClass getSimpleFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getComparator()
	 * @see #getSimpleFilterType()
	 * @generated
	 */
	EAttribute getSimpleFilterType_Comparator();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getDomainAttribute <em>Domain Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Attribute</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getDomainAttribute()
	 * @see #getSimpleFilterType()
	 * @generated
	 */
	EAttribute getSimpleFilterType_DomainAttribute();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType <em>Slot Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Branch Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType
	 * @generated
	 */
	EClass getSlotBranchType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType <em>Specification Link Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Link Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType
	 * @generated
	 */
	EClass getSpecificationLinkQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getUsageDescriptionBranch <em>Usage Description Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Description Branch</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getUsageDescriptionBranch()
	 * @see #getSpecificationLinkQueryType()
	 * @generated
	 */
	EReference getSpecificationLinkQueryType_UsageDescriptionBranch();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getServiceBindingQuery <em>Service Binding Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getServiceBindingQuery()
	 * @see #getSpecificationLinkQueryType()
	 * @generated
	 */
	EReference getSpecificationLinkQueryType_ServiceBindingQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getSpecificationObjectQuery <em>Specification Object Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Object Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getSpecificationObjectQuery()
	 * @see #getSpecificationLinkQueryType()
	 * @generated
	 */
	EReference getSpecificationLinkQueryType_SpecificationObjectQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType <em>String Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Filter Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType
	 * @generated
	 */
	EClass getStringFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.StringFilterType#getValue()
	 * @see #getStringFilterType()
	 * @generated
	 */
	EAttribute getStringFilterType_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType <em>Subscription Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType
	 * @generated
	 */
	EClass getSubscriptionQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType#getSelectorQuery <em>Selector Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector Query</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType#getSelectorQuery()
	 * @see #getSubscriptionQueryType()
	 * @generated
	 */
	EReference getSubscriptionQueryType_SelectorQuery();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.UserQueryType <em>User Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Query Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.UserQueryType
	 * @generated
	 */
	EClass getUserQueryType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType <em>Comparator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
	 * @generated
	 */
	EEnum getComparatorType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType <em>Logical Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
	 * @generated
	 */
	EEnum getLogicalOperatorType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType <em>Return Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Type Type</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType
	 * @generated
	 */
	EEnum getReturnTypeType();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType <em>Comparator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comparator Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType"
	 *        extendedMetaData="name='comparator_._type:Object' baseType='comparator_._type'" 
	 * @generated
	 */
	EDataType getComparatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType <em>Logical Operator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Logical Operator Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType"
	 *        extendedMetaData="name='logicalOperator_._type:Object' baseType='logicalOperator_._type'" 
	 * @generated
	 */
	EDataType getLogicalOperatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType <em>Return Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Return Type Type Object</em>'.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType
	 * @model instanceClass="org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType"
	 *        extendedMetaData="name='returnType_._type:Object' baseType='returnType_._type'" 
	 * @generated
	 */
	EDataType getReturnTypeTypeObject();

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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryQueryTypeImpl <em>Adhoc Query Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAdhocQueryQueryType()
		 * @generated
		 */
		EClass ADHOC_QUERY_QUERY_TYPE = eINSTANCE.getAdhocQueryQueryType();

		/**
		 * The meta object literal for the '<em><b>Query Expression Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH = eINSTANCE.getAdhocQueryQueryType_QueryExpressionBranch();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl <em>Adhoc Query Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAdhocQueryRequestType()
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
		 * The meta object literal for the '<em><b>Adhoc Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY = eINSTANCE.getAdhocQueryRequestType_AdhocQuery();

		/**
		 * The meta object literal for the '<em><b>Federated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADHOC_QUERY_REQUEST_TYPE__FEDERATED = eINSTANCE.getAdhocQueryRequestType_Federated();

		/**
		 * The meta object literal for the '<em><b>Federation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADHOC_QUERY_REQUEST_TYPE__FEDERATION = eINSTANCE.getAdhocQueryRequestType_Federation();

		/**
		 * The meta object literal for the '<em><b>Max Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS = eINSTANCE.getAdhocQueryRequestType_MaxResults();

		/**
		 * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADHOC_QUERY_REQUEST_TYPE__START_INDEX = eINSTANCE.getAdhocQueryRequestType_StartIndex();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryResponseTypeImpl <em>Adhoc Query Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryResponseTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAdhocQueryResponseType()
		 * @generated
		 */
		EClass ADHOC_QUERY_RESPONSE_TYPE = eINSTANCE.getAdhocQueryResponseType();

		/**
		 * The meta object literal for the '<em><b>Registry Object List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_QUERY_RESPONSE_TYPE__REGISTRY_OBJECT_LIST = eINSTANCE.getAdhocQueryResponseType_RegistryObjectList();

		/**
		 * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADHOC_QUERY_RESPONSE_TYPE__START_INDEX = eINSTANCE.getAdhocQueryResponseType_StartIndex();

		/**
		 * The meta object literal for the '<em><b>Total Result Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADHOC_QUERY_RESPONSE_TYPE__TOTAL_RESULT_COUNT = eINSTANCE.getAdhocQueryResponseType_TotalResultCount();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AssociationQueryTypeImpl <em>Association Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AssociationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAssociationQueryType()
		 * @generated
		 */
		EClass ASSOCIATION_QUERY_TYPE = eINSTANCE.getAssociationQueryType();

		/**
		 * The meta object literal for the '<em><b>Association Type Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_QUERY_TYPE__ASSOCIATION_TYPE_QUERY = eINSTANCE.getAssociationQueryType_AssociationTypeQuery();

		/**
		 * The meta object literal for the '<em><b>Source Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_QUERY_TYPE__SOURCE_OBJECT_QUERY = eINSTANCE.getAssociationQueryType_SourceObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Target Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_QUERY_TYPE__TARGET_OBJECT_QUERY = eINSTANCE.getAssociationQueryType_TargetObjectQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AuditableEventQueryTypeImpl <em>Auditable Event Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AuditableEventQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getAuditableEventQueryType()
		 * @generated
		 */
		EClass AUDITABLE_EVENT_QUERY_TYPE = eINSTANCE.getAuditableEventQueryType();

		/**
		 * The meta object literal for the '<em><b>Affected Object Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_TYPE__AFFECTED_OBJECT_QUERY = eINSTANCE.getAuditableEventQueryType_AffectedObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Event Type Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_TYPE__EVENT_TYPE_QUERY = eINSTANCE.getAuditableEventQueryType_EventTypeQuery();

		/**
		 * The meta object literal for the '<em><b>User Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDITABLE_EVENT_QUERY_TYPE__USER_QUERY = eINSTANCE.getAuditableEventQueryType_UserQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BooleanFilterTypeImpl <em>Boolean Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BooleanFilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getBooleanFilterType()
		 * @generated
		 */
		EClass BOOLEAN_FILTER_TYPE = eINSTANCE.getBooleanFilterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_FILTER_TYPE__VALUE = eINSTANCE.getBooleanFilterType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BranchTypeImpl <em>Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.BranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getBranchType()
		 * @generated
		 */
		EClass BRANCH_TYPE = eINSTANCE.getBranchType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationNodeQueryTypeImpl <em>Classification Node Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationNodeQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getClassificationNodeQueryType()
		 * @generated
		 */
		EClass CLASSIFICATION_NODE_QUERY_TYPE = eINSTANCE.getClassificationNodeQueryType();

		/**
		 * The meta object literal for the '<em><b>Parent Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_TYPE__PARENT_QUERY = eINSTANCE.getClassificationNodeQueryType_ParentQuery();

		/**
		 * The meta object literal for the '<em><b>Children Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_NODE_QUERY_TYPE__CHILDREN_QUERY = eINSTANCE.getClassificationNodeQueryType_ChildrenQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationQueryTypeImpl <em>Classification Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getClassificationQueryType()
		 * @generated
		 */
		EClass CLASSIFICATION_QUERY_TYPE = eINSTANCE.getClassificationQueryType();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getClassificationQueryType_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Classified Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__CLASSIFIED_OBJECT_QUERY = eINSTANCE.getClassificationQueryType_ClassifiedObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_QUERY_TYPE__CLASSIFICATION_NODE_QUERY = eINSTANCE.getClassificationQueryType_ClassificationNodeQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationSchemeQueryTypeImpl <em>Classification Scheme Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ClassificationSchemeQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getClassificationSchemeQueryType()
		 * @generated
		 */
		EClass CLASSIFICATION_SCHEME_QUERY_TYPE = eINSTANCE.getClassificationSchemeQueryType();

		/**
		 * The meta object literal for the '<em><b>Children Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_QUERY_TYPE__CHILDREN_QUERY = eINSTANCE.getClassificationSchemeQueryType_ChildrenQuery();

		/**
		 * The meta object literal for the '<em><b>Node Type Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_SCHEME_QUERY_TYPE__NODE_TYPE_QUERY = eINSTANCE.getClassificationSchemeQueryType_NodeTypeQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.CompoundFilterTypeImpl <em>Compound Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.CompoundFilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getCompoundFilterType()
		 * @generated
		 */
		EClass COMPOUND_FILTER_TYPE = eINSTANCE.getCompoundFilterType();

		/**
		 * The meta object literal for the '<em><b>Left Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_FILTER_TYPE__LEFT_FILTER = eINSTANCE.getCompoundFilterType_LeftFilter();

		/**
		 * The meta object literal for the '<em><b>Right Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_FILTER_TYPE__RIGHT_FILTER = eINSTANCE.getCompoundFilterType_RightFilter();

		/**
		 * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR = eINSTANCE.getCompoundFilterType_LogicalOperator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DateTimeFilterTypeImpl <em>Date Time Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DateTimeFilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getDateTimeFilterType()
		 * @generated
		 */
		EClass DATE_TIME_FILTER_TYPE = eINSTANCE.getDateTimeFilterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_FILTER_TYPE__VALUE = eINSTANCE.getDateTimeFilterType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.DocumentRootImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Adhoc Query Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADHOC_QUERY_QUERY = eINSTANCE.getDocumentRoot_AdhocQueryQuery();

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
		 * The meta object literal for the '<em><b>Association Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_QUERY = eINSTANCE.getDocumentRoot_AssociationQuery();

		/**
		 * The meta object literal for the '<em><b>Auditable Event Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDITABLE_EVENT_QUERY = eINSTANCE.getDocumentRoot_AuditableEventQuery();

		/**
		 * The meta object literal for the '<em><b>Boolean Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOLEAN_FILTER = eINSTANCE.getDocumentRoot_BooleanFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Node Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_NODE_QUERY = eINSTANCE.getDocumentRoot_ClassificationNodeQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_QUERY = eINSTANCE.getDocumentRoot_ClassificationQuery();

		/**
		 * The meta object literal for the '<em><b>Classification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATION_SCHEME_QUERY = eINSTANCE.getDocumentRoot_ClassificationSchemeQuery();

		/**
		 * The meta object literal for the '<em><b>Compound Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPOUND_FILTER = eINSTANCE.getDocumentRoot_CompoundFilter();

		/**
		 * The meta object literal for the '<em><b>Date Time Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_TIME_FILTER = eINSTANCE.getDocumentRoot_DateTimeFilter();

		/**
		 * The meta object literal for the '<em><b>External Identifier Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_IDENTIFIER_QUERY = eINSTANCE.getDocumentRoot_ExternalIdentifierQuery();

		/**
		 * The meta object literal for the '<em><b>External Link Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_LINK_QUERY = eINSTANCE.getDocumentRoot_ExternalLinkQuery();

		/**
		 * The meta object literal for the '<em><b>Extrinsic Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTRINSIC_OBJECT_QUERY = eINSTANCE.getDocumentRoot_ExtrinsicObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Federation Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEDERATION_QUERY = eINSTANCE.getDocumentRoot_FederationQuery();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER = eINSTANCE.getDocumentRoot_Filter();

		/**
		 * The meta object literal for the '<em><b>Float Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOAT_FILTER = eINSTANCE.getDocumentRoot_FloatFilter();

		/**
		 * The meta object literal for the '<em><b>Integer Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTEGER_FILTER = eINSTANCE.getDocumentRoot_IntegerFilter();

		/**
		 * The meta object literal for the '<em><b>Notification Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTIFICATION_QUERY = eINSTANCE.getDocumentRoot_NotificationQuery();

		/**
		 * The meta object literal for the '<em><b>Organization Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION_QUERY = eINSTANCE.getDocumentRoot_OrganizationQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_OBJECT_QUERY = eINSTANCE.getDocumentRoot_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Package Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_PACKAGE_QUERY = eINSTANCE.getDocumentRoot_RegistryPackageQuery();

		/**
		 * The meta object literal for the '<em><b>Registry Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGISTRY_QUERY = eINSTANCE.getDocumentRoot_RegistryQuery();

		/**
		 * The meta object literal for the '<em><b>Response Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESPONSE_OPTION = eINSTANCE.getDocumentRoot_ResponseOption();

		/**
		 * The meta object literal for the '<em><b>Service Binding Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_BINDING_QUERY = eINSTANCE.getDocumentRoot_ServiceBindingQuery();

		/**
		 * The meta object literal for the '<em><b>Service Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_QUERY = eINSTANCE.getDocumentRoot_ServiceQuery();

		/**
		 * The meta object literal for the '<em><b>Specification Link Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIFICATION_LINK_QUERY = eINSTANCE.getDocumentRoot_SpecificationLinkQuery();

		/**
		 * The meta object literal for the '<em><b>String Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRING_FILTER = eINSTANCE.getDocumentRoot_StringFilter();

		/**
		 * The meta object literal for the '<em><b>Subscription Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSCRIPTION_QUERY = eINSTANCE.getDocumentRoot_SubscriptionQuery();

		/**
		 * The meta object literal for the '<em><b>User Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_QUERY = eINSTANCE.getDocumentRoot_UserQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalIdentifierQueryTypeImpl <em>External Identifier Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalIdentifierQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getExternalIdentifierQueryType()
		 * @generated
		 */
		EClass EXTERNAL_IDENTIFIER_QUERY_TYPE = eINSTANCE.getExternalIdentifierQueryType();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_IDENTIFIER_QUERY_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getExternalIdentifierQueryType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '<em><b>Identification Scheme Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_IDENTIFIER_QUERY_TYPE__IDENTIFICATION_SCHEME_QUERY = eINSTANCE.getExternalIdentifierQueryType_IdentificationSchemeQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalLinkQueryTypeImpl <em>External Link Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExternalLinkQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getExternalLinkQueryType()
		 * @generated
		 */
		EClass EXTERNAL_LINK_QUERY_TYPE = eINSTANCE.getExternalLinkQueryType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExtrinsicObjectQueryTypeImpl <em>Extrinsic Object Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ExtrinsicObjectQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getExtrinsicObjectQueryType()
		 * @generated
		 */
		EClass EXTRINSIC_OBJECT_QUERY_TYPE = eINSTANCE.getExtrinsicObjectQueryType();

		/**
		 * The meta object literal for the '<em><b>Content Version Info Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRINSIC_OBJECT_QUERY_TYPE__CONTENT_VERSION_INFO_FILTER = eINSTANCE.getExtrinsicObjectQueryType_ContentVersionInfoFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FederationQueryTypeImpl <em>Federation Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FederationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFederationQueryType()
		 * @generated
		 */
		EClass FEDERATION_QUERY_TYPE = eINSTANCE.getFederationQueryType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterQueryTypeImpl <em>Filter Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFilterQueryType()
		 * @generated
		 */
		EClass FILTER_QUERY_TYPE = eINSTANCE.getFilterQueryType();

		/**
		 * The meta object literal for the '<em><b>Primary Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_QUERY_TYPE__PRIMARY_FILTER = eINSTANCE.getFilterQueryType_PrimaryFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterTypeImpl <em>Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFilterType()
		 * @generated
		 */
		EClass FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '<em><b>Negate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TYPE__NEGATE = eINSTANCE.getFilterType_Negate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FloatFilterTypeImpl <em>Float Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.FloatFilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getFloatFilterType()
		 * @generated
		 */
		EClass FLOAT_FILTER_TYPE = eINSTANCE.getFloatFilterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_FILTER_TYPE__VALUE = eINSTANCE.getFloatFilterType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.IntegerFilterTypeImpl <em>Integer Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.IntegerFilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getIntegerFilterType()
		 * @generated
		 */
		EClass INTEGER_FILTER_TYPE = eINSTANCE.getIntegerFilterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FILTER_TYPE__VALUE = eINSTANCE.getIntegerFilterType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.InternationalStringBranchTypeImpl <em>International String Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.InternationalStringBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getInternationalStringBranchType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.NotificationQueryTypeImpl <em>Notification Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.NotificationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getNotificationQueryType()
		 * @generated
		 */
		EClass NOTIFICATION_QUERY_TYPE = eINSTANCE.getNotificationQueryType();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_QUERY_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getNotificationQueryType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl <em>Organization Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.OrganizationQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getOrganizationQueryType()
		 * @generated
		 */
		EClass ORGANIZATION_QUERY_TYPE = eINSTANCE.getOrganizationQueryType();

		/**
		 * The meta object literal for the '<em><b>Address Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__ADDRESS_FILTER = eINSTANCE.getOrganizationQueryType_AddressFilter();

		/**
		 * The meta object literal for the '<em><b>Telephone Number Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__TELEPHONE_NUMBER_FILTER = eINSTANCE.getOrganizationQueryType_TelephoneNumberFilter();

		/**
		 * The meta object literal for the '<em><b>Email Addresse Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__EMAIL_ADDRESSE_FILTER = eINSTANCE.getOrganizationQueryType_EmailAddresseFilter();

		/**
		 * The meta object literal for the '<em><b>Parent Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__PARENT_QUERY = eINSTANCE.getOrganizationQueryType_ParentQuery();

		/**
		 * The meta object literal for the '<em><b>Child Organization Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__CHILD_ORGANIZATION_QUERY = eINSTANCE.getOrganizationQueryType_ChildOrganizationQuery();

		/**
		 * The meta object literal for the '<em><b>Primary Contact Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_QUERY_TYPE__PRIMARY_CONTACT_QUERY = eINSTANCE.getOrganizationQueryType_PrimaryContactQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl <em>Person Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.PersonQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getPersonQueryType()
		 * @generated
		 */
		EClass PERSON_QUERY_TYPE = eINSTANCE.getPersonQueryType();

		/**
		 * The meta object literal for the '<em><b>Address Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_QUERY_TYPE__ADDRESS_FILTER = eINSTANCE.getPersonQueryType_AddressFilter();

		/**
		 * The meta object literal for the '<em><b>Person Name Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_QUERY_TYPE__PERSON_NAME_FILTER = eINSTANCE.getPersonQueryType_PersonNameFilter();

		/**
		 * The meta object literal for the '<em><b>Telephone Number Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_QUERY_TYPE__TELEPHONE_NUMBER_FILTER = eINSTANCE.getPersonQueryType_TelephoneNumberFilter();

		/**
		 * The meta object literal for the '<em><b>Email Addresse Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_QUERY_TYPE__EMAIL_ADDRESSE_FILTER = eINSTANCE.getPersonQueryType_EmailAddresseFilter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryExpressionBranchTypeImpl <em>Expression Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryExpressionBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getQueryExpressionBranchType()
		 * @generated
		 */
		EClass QUERY_EXPRESSION_BRANCH_TYPE = eINSTANCE.getQueryExpressionBranchType();

		/**
		 * The meta object literal for the '<em><b>Query Language Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY = eINSTANCE.getQueryExpressionBranchType_QueryLanguageQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl <em>Registry Object Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryObjectQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getRegistryObjectQueryType()
		 * @generated
		 */
		EClass REGISTRY_OBJECT_QUERY_TYPE = eINSTANCE.getRegistryObjectQueryType();

		/**
		 * The meta object literal for the '<em><b>Slot Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__SLOT_BRANCH = eINSTANCE.getRegistryObjectQueryType_SlotBranch();

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
		 * The meta object literal for the '<em><b>Version Info Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__VERSION_INFO_FILTER = eINSTANCE.getRegistryObjectQueryType_VersionInfoFilter();

		/**
		 * The meta object literal for the '<em><b>Classification Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__CLASSIFICATION_QUERY = eINSTANCE.getRegistryObjectQueryType_ClassificationQuery();

		/**
		 * The meta object literal for the '<em><b>External Identifier Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__EXTERNAL_IDENTIFIER_QUERY = eINSTANCE.getRegistryObjectQueryType_ExternalIdentifierQuery();

		/**
		 * The meta object literal for the '<em><b>Object Type Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__OBJECT_TYPE_QUERY = eINSTANCE.getRegistryObjectQueryType_ObjectTypeQuery();

		/**
		 * The meta object literal for the '<em><b>Status Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__STATUS_QUERY = eINSTANCE.getRegistryObjectQueryType_StatusQuery();

		/**
		 * The meta object literal for the '<em><b>Source Association Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__SOURCE_ASSOCIATION_QUERY = eINSTANCE.getRegistryObjectQueryType_SourceAssociationQuery();

		/**
		 * The meta object literal for the '<em><b>Target Association Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_OBJECT_QUERY_TYPE__TARGET_ASSOCIATION_QUERY = eINSTANCE.getRegistryObjectQueryType_TargetAssociationQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryPackageQueryTypeImpl <em>Registry Package Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryPackageQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getRegistryPackageQueryType()
		 * @generated
		 */
		EClass REGISTRY_PACKAGE_QUERY_TYPE = eINSTANCE.getRegistryPackageQueryType();

		/**
		 * The meta object literal for the '<em><b>Registry Object Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_PACKAGE_QUERY_TYPE__REGISTRY_OBJECT_QUERY = eINSTANCE.getRegistryPackageQueryType_RegistryObjectQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryQueryTypeImpl <em>Registry Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.RegistryQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getRegistryQueryType()
		 * @generated
		 */
		EClass REGISTRY_QUERY_TYPE = eINSTANCE.getRegistryQueryType();

		/**
		 * The meta object literal for the '<em><b>Operator Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_QUERY_TYPE__OPERATOR_QUERY = eINSTANCE.getRegistryQueryType_OperatorQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ResponseOptionTypeImpl <em>Response Option Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ResponseOptionTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getResponseOptionType()
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
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceBindingQueryTypeImpl <em>Service Binding Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceBindingQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getServiceBindingQueryType()
		 * @generated
		 */
		EClass SERVICE_BINDING_QUERY_TYPE = eINSTANCE.getServiceBindingQueryType();

		/**
		 * The meta object literal for the '<em><b>Service Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_QUERY_TYPE__SERVICE_QUERY = eINSTANCE.getServiceBindingQueryType_ServiceQuery();

		/**
		 * The meta object literal for the '<em><b>Specification Link Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_QUERY_TYPE__SPECIFICATION_LINK_QUERY = eINSTANCE.getServiceBindingQueryType_SpecificationLinkQuery();

		/**
		 * The meta object literal for the '<em><b>Target Binding Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_QUERY_TYPE__TARGET_BINDING_QUERY = eINSTANCE.getServiceBindingQueryType_TargetBindingQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceQueryTypeImpl <em>Service Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.ServiceQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getServiceQueryType()
		 * @generated
		 */
		EClass SERVICE_QUERY_TYPE = eINSTANCE.getServiceQueryType();

		/**
		 * The meta object literal for the '<em><b>Service Binding Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUERY_TYPE__SERVICE_BINDING_QUERY = eINSTANCE.getServiceQueryType_ServiceBindingQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SimpleFilterTypeImpl <em>Simple Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SimpleFilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSimpleFilterType()
		 * @generated
		 */
		EClass SIMPLE_FILTER_TYPE = eINSTANCE.getSimpleFilterType();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_FILTER_TYPE__COMPARATOR = eINSTANCE.getSimpleFilterType_Comparator();

		/**
		 * The meta object literal for the '<em><b>Domain Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE = eINSTANCE.getSimpleFilterType_DomainAttribute();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SlotBranchTypeImpl <em>Slot Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SlotBranchTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSlotBranchType()
		 * @generated
		 */
		EClass SLOT_BRANCH_TYPE = eINSTANCE.getSlotBranchType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SpecificationLinkQueryTypeImpl <em>Specification Link Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SpecificationLinkQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSpecificationLinkQueryType()
		 * @generated
		 */
		EClass SPECIFICATION_LINK_QUERY_TYPE = eINSTANCE.getSpecificationLinkQueryType();

		/**
		 * The meta object literal for the '<em><b>Usage Description Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_LINK_QUERY_TYPE__USAGE_DESCRIPTION_BRANCH = eINSTANCE.getSpecificationLinkQueryType_UsageDescriptionBranch();

		/**
		 * The meta object literal for the '<em><b>Service Binding Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_LINK_QUERY_TYPE__SERVICE_BINDING_QUERY = eINSTANCE.getSpecificationLinkQueryType_ServiceBindingQuery();

		/**
		 * The meta object literal for the '<em><b>Specification Object Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_LINK_QUERY_TYPE__SPECIFICATION_OBJECT_QUERY = eINSTANCE.getSpecificationLinkQueryType_SpecificationObjectQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.StringFilterTypeImpl <em>String Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.StringFilterTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getStringFilterType()
		 * @generated
		 */
		EClass STRING_FILTER_TYPE = eINSTANCE.getStringFilterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FILTER_TYPE__VALUE = eINSTANCE.getStringFilterType_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SubscriptionQueryTypeImpl <em>Subscription Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SubscriptionQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getSubscriptionQueryType()
		 * @generated
		 */
		EClass SUBSCRIPTION_QUERY_TYPE = eINSTANCE.getSubscriptionQueryType();

		/**
		 * The meta object literal for the '<em><b>Selector Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_QUERY_TYPE__SELECTOR_QUERY = eINSTANCE.getSubscriptionQueryType_SelectorQuery();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.UserQueryTypeImpl <em>User Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.UserQueryTypeImpl
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getUserQueryType()
		 * @generated
		 */
		EClass USER_QUERY_TYPE = eINSTANCE.getUserQueryType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType <em>Comparator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getComparatorType()
		 * @generated
		 */
		EEnum COMPARATOR_TYPE = eINSTANCE.getComparatorType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType <em>Logical Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getLogicalOperatorType()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR_TYPE = eINSTANCE.getLogicalOperatorType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType <em>Return Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getReturnTypeType()
		 * @generated
		 */
		EEnum RETURN_TYPE_TYPE = eINSTANCE.getReturnTypeType();

		/**
		 * The meta object literal for the '<em>Comparator Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getComparatorTypeObject()
		 * @generated
		 */
		EDataType COMPARATOR_TYPE_OBJECT = eINSTANCE.getComparatorTypeObject();

		/**
		 * The meta object literal for the '<em>Logical Operator Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getLogicalOperatorTypeObject()
		 * @generated
		 */
		EDataType LOGICAL_OPERATOR_TYPE_OBJECT = eINSTANCE.getLogicalOperatorTypeObject();

		/**
		 * The meta object literal for the '<em>Return Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ReturnTypeType
		 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryPackageImpl#getReturnTypeTypeObject()
		 * @generated
		 */
		EDataType RETURN_TYPE_TYPE_OBJECT = eINSTANCE.getReturnTypeTypeObject();

	}

} //QueryPackage
