/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getIdentifiable <em>Identifiable</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAuditableEvent <em>Auditable Event</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationScheme <em>Classification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalLink <em>External Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExtrinsicObject <em>Extrinsic Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getFederation <em>Federation</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getInternationalString <em>International String</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getLocalizedString <em>Localized String</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotification <em>Notification</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotifyAction <em>Notify Action</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRefList <em>Object Ref List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPerson <em>Person</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getQueryExpression <em>Query Expression</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistry <em>Registry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObjectList <em>Registry Object List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryPackage <em>Registry Package</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getService <em>Service</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlotList <em>Slot List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSpecificationLink <em>Specification Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageDescription <em>Usage Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageParameter <em>Usage Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUser <em>User</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValueList <em>Value List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Action()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(PostalAddressType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Address()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalAddressType getAddress();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(PostalAddressType value);

	/**
	 * Returns the value of the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adhoc Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adhoc Query</em>' containment reference.
	 * @see #setAdhocQuery(AdhocQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_AdhocQuery()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdhocQuery' namespace='##targetNamespace' affiliation='RegistryObject'"
	 * @generated
	 */
	AdhocQueryType getAdhocQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAdhocQuery <em>Adhoc Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query</em>' containment reference.
	 * @see #getAdhocQuery()
	 * @generated
	 */
	void setAdhocQuery(AdhocQueryType value);

	/**
	 * Returns the value of the '<em><b>Registry Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object</em>' containment reference.
	 * @see #setRegistryObject(RegistryObjectType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_RegistryObject()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObject' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	RegistryObjectType getRegistryObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObject <em>Registry Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object</em>' containment reference.
	 * @see #getRegistryObject()
	 * @generated
	 */
	void setRegistryObject(RegistryObjectType value);

	/**
	 * Returns the value of the '<em><b>Identifiable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable</em>' containment reference.
	 * @see #setIdentifiable(IdentifiableType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Identifiable()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Identifiable' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifiableType getIdentifiable();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getIdentifiable <em>Identifiable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiable</em>' containment reference.
	 * @see #getIdentifiable()
	 * @generated
	 */
	void setIdentifiable(IdentifiableType value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference.
	 * @see #setAssociation(AssociationType1)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Association()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Association' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	AssociationType1 getAssociation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAssociation <em>Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' containment reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(AssociationType1 value);

	/**
	 * Returns the value of the '<em><b>Auditable Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditable Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable Event</em>' containment reference.
	 * @see #setAuditableEvent(AuditableEventType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_AuditableEvent()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditableEvent' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	AuditableEventType getAuditableEvent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getAuditableEvent <em>Auditable Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable Event</em>' containment reference.
	 * @see #getAuditableEvent()
	 * @generated
	 */
	void setAuditableEvent(AuditableEventType value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(ClassificationType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Classification()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Classification' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ClassificationType getClassification();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(ClassificationType value);

	/**
	 * Returns the value of the '<em><b>Classification Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node</em>' containment reference.
	 * @see #setClassificationNode(ClassificationNodeType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ClassificationNode()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationNode' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ClassificationNodeType getClassificationNode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationNode <em>Classification Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node</em>' containment reference.
	 * @see #getClassificationNode()
	 * @generated
	 */
	void setClassificationNode(ClassificationNodeType value);

	/**
	 * Returns the value of the '<em><b>Classification Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme</em>' containment reference.
	 * @see #setClassificationScheme(ClassificationSchemeType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ClassificationScheme()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClassificationScheme' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ClassificationSchemeType getClassificationScheme();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getClassificationScheme <em>Classification Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme</em>' containment reference.
	 * @see #getClassificationScheme()
	 * @generated
	 */
	void setClassificationScheme(ClassificationSchemeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(InternationalStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Description()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringType getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(InternationalStringType value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' containment reference.
	 * @see #setEmailAddress(EmailAddressType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_EmailAddress()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EmailAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EmailAddressType getEmailAddress();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getEmailAddress <em>Email Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' containment reference.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(EmailAddressType value);

	/**
	 * Returns the value of the '<em><b>External Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifier</em>' containment reference.
	 * @see #setExternalIdentifier(ExternalIdentifierType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ExternalIdentifier()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalIdentifier' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ExternalIdentifierType getExternalIdentifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalIdentifier <em>External Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Identifier</em>' containment reference.
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	void setExternalIdentifier(ExternalIdentifierType value);

	/**
	 * Returns the value of the '<em><b>External Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Link</em>' containment reference.
	 * @see #setExternalLink(ExternalLinkType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ExternalLink()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalLink' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ExternalLinkType getExternalLink();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExternalLink <em>External Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Link</em>' containment reference.
	 * @see #getExternalLink()
	 * @generated
	 */
	void setExternalLink(ExternalLinkType value);

	/**
	 * Returns the value of the '<em><b>Extrinsic Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrinsic Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrinsic Object</em>' containment reference.
	 * @see #setExtrinsicObject(ExtrinsicObjectType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ExtrinsicObject()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtrinsicObject' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ExtrinsicObjectType getExtrinsicObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getExtrinsicObject <em>Extrinsic Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrinsic Object</em>' containment reference.
	 * @see #getExtrinsicObject()
	 * @generated
	 */
	void setExtrinsicObject(ExtrinsicObjectType value);

	/**
	 * Returns the value of the '<em><b>Federation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation</em>' containment reference.
	 * @see #setFederation(FederationType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Federation()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Federation' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	FederationType getFederation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getFederation <em>Federation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation</em>' containment reference.
	 * @see #getFederation()
	 * @generated
	 */
	void setFederation(FederationType value);

	/**
	 * Returns the value of the '<em><b>International String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>International String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>International String</em>' containment reference.
	 * @see #setInternationalString(InternationalStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_InternationalString()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InternationalString' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringType getInternationalString();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getInternationalString <em>International String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>International String</em>' containment reference.
	 * @see #getInternationalString()
	 * @generated
	 */
	void setInternationalString(InternationalStringType value);

	/**
	 * Returns the value of the '<em><b>Localized String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localized String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized String</em>' containment reference.
	 * @see #setLocalizedString(LocalizedStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_LocalizedString()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocalizedString' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedStringType getLocalizedString();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getLocalizedString <em>Localized String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized String</em>' containment reference.
	 * @see #getLocalizedString()
	 * @generated
	 */
	void setLocalizedString(LocalizedStringType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(InternationalStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Name()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringType getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(InternationalStringType value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' containment reference.
	 * @see #setNotification(NotificationType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Notification()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Notification' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationType getNotification();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotification <em>Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' containment reference.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(NotificationType value);

	/**
	 * Returns the value of the '<em><b>Notify Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notify Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify Action</em>' containment reference.
	 * @see #setNotifyAction(NotifyActionType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_NotifyAction()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NotifyAction' namespace='##targetNamespace' affiliation='Action'"
	 * @generated
	 */
	NotifyActionType getNotifyAction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getNotifyAction <em>Notify Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify Action</em>' containment reference.
	 * @see #getNotifyAction()
	 * @generated
	 */
	void setNotifyAction(NotifyActionType value);

	/**
	 * Returns the value of the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Ref</em>' containment reference.
	 * @see #setObjectRef(ObjectRefType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ObjectRef()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectRef' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ObjectRefType getObjectRef();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRef <em>Object Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref</em>' containment reference.
	 * @see #getObjectRef()
	 * @generated
	 */
	void setObjectRef(ObjectRefType value);

	/**
	 * Returns the value of the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Ref List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Ref List</em>' containment reference.
	 * @see #setObjectRefList(ObjectRefListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ObjectRefList()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectRefList' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefListType getObjectRefList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getObjectRefList <em>Object Ref List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref List</em>' containment reference.
	 * @see #getObjectRefList()
	 * @generated
	 */
	void setObjectRefList(ObjectRefListType value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Organization()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	OrganizationType getOrganization();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationType value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(PersonType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Person()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	PersonType getPerson();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PersonType value);

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference.
	 * @see #setPersonName(PersonNameType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_PersonName()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonNameType getPersonName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPersonName <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' containment reference.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(PersonNameType value);

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Address</em>' containment reference.
	 * @see #setPostalAddress(PostalAddressType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_PostalAddress()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostalAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalAddressType getPostalAddress();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getPostalAddress <em>Postal Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Address</em>' containment reference.
	 * @see #getPostalAddress()
	 * @generated
	 */
	void setPostalAddress(PostalAddressType value);

	/**
	 * Returns the value of the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression</em>' containment reference.
	 * @see #setQueryExpression(QueryExpressionType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_QueryExpression()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryExpressionType getQueryExpression();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getQueryExpression <em>Query Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Expression</em>' containment reference.
	 * @see #getQueryExpression()
	 * @generated
	 */
	void setQueryExpression(QueryExpressionType value);

	/**
	 * Returns the value of the '<em><b>Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry</em>' containment reference.
	 * @see #setRegistry(RegistryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Registry()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Registry' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	RegistryType getRegistry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistry <em>Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' containment reference.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(RegistryType value);

	/**
	 * Returns the value of the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object List</em>' containment reference.
	 * @see #setRegistryObjectList(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_RegistryObjectList()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryObjectList' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getRegistryObjectList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryObjectList <em>Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object List</em>' containment reference.
	 * @see #getRegistryObjectList()
	 * @generated
	 */
	void setRegistryObjectList(RegistryObjectListType value);

	/**
	 * Returns the value of the '<em><b>Registry Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Package</em>' containment reference.
	 * @see #setRegistryPackage(RegistryPackageType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_RegistryPackage()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryPackage' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	RegistryPackageType getRegistryPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getRegistryPackage <em>Registry Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Package</em>' containment reference.
	 * @see #getRegistryPackage()
	 * @generated
	 */
	void setRegistryPackage(RegistryPackageType value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Service()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ServiceType getService();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Service Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding</em>' containment reference.
	 * @see #setServiceBinding(ServiceBindingType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ServiceBinding()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceBinding' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	ServiceBindingType getServiceBinding();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getServiceBinding <em>Service Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding</em>' containment reference.
	 * @see #getServiceBinding()
	 * @generated
	 */
	void setServiceBinding(ServiceBindingType value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference.
	 * @see #setSlot(SlotType1)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Slot()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace'"
	 * @generated
	 */
	SlotType1 getSlot();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlot <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' containment reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(SlotType1 value);

	/**
	 * Returns the value of the '<em><b>Slot List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot List</em>' containment reference.
	 * @see #setSlotList(SlotListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_SlotList()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SlotList' namespace='##targetNamespace'"
	 * @generated
	 */
	SlotListType getSlotList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSlotList <em>Slot List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot List</em>' containment reference.
	 * @see #getSlotList()
	 * @generated
	 */
	void setSlotList(SlotListType value);

	/**
	 * Returns the value of the '<em><b>Specification Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link</em>' containment reference.
	 * @see #setSpecificationLink(SpecificationLinkType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_SpecificationLink()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpecificationLink' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	SpecificationLinkType getSpecificationLink();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSpecificationLink <em>Specification Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Link</em>' containment reference.
	 * @see #getSpecificationLink()
	 * @generated
	 */
	void setSpecificationLink(SpecificationLinkType value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(SubscriptionType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Subscription()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Subscription' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	SubscriptionType getSubscription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(SubscriptionType value);

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Number</em>' containment reference.
	 * @see #setTelephoneNumber(TelephoneNumberType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_TelephoneNumber()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	TelephoneNumberType getTelephoneNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getTelephoneNumber <em>Telephone Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone Number</em>' containment reference.
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	void setTelephoneNumber(TelephoneNumberType value);

	/**
	 * Returns the value of the '<em><b>Usage Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Description</em>' containment reference.
	 * @see #setUsageDescription(InternationalStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_UsageDescription()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UsageDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringType getUsageDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageDescription <em>Usage Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Description</em>' containment reference.
	 * @see #getUsageDescription()
	 * @generated
	 */
	void setUsageDescription(InternationalStringType value);

	/**
	 * Returns the value of the '<em><b>Usage Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Parameter</em>' attribute.
	 * @see #setUsageParameter(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_UsageParameter()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.FreeFormText" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UsageParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUsageParameter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUsageParameter <em>Usage Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Parameter</em>' attribute.
	 * @see #getUsageParameter()
	 * @generated
	 */
	void setUsageParameter(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(UserType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_User()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='User' namespace='##targetNamespace' affiliation='Identifiable'"
	 * @generated
	 */
	UserType getUser();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(UserType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_Value()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.LongName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value List</em>' containment reference.
	 * @see #setValueList(ValueListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getDocumentRoot_ValueList()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueList' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueListType getValueList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot#getValueList <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value List</em>' containment reference.
	 * @see #getValueList()
	 * @generated
	 */
	void setValueList(ValueListType value);

} // DocumentRoot
