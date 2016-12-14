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
 * $Id: DocumentRoot.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

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
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getAddSlotsRequest <em>Add Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getApproveObjectsRequest <em>Approve Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getOptionalFeaturesSupported <em>Optional Features Supported</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryError <em>Registry Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryProfile <em>Registry Profile</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryResponse <em>Registry Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveObjectsRequest <em>Remove Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveSlotsRequest <em>Remove Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRequestAcceptedResponse <em>Request Accepted Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getSubmitObjectsRequest <em>Submit Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getUpdateObjectsRequest <em>Update Objects Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Add Slots Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Slots Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Slots Request</em>' containment reference.
	 * @see #setAddSlotsRequest(AddSlotsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_AddSlotsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddSlotsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSlotsRequestType getAddSlotsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getAddSlotsRequest <em>Add Slots Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Slots Request</em>' containment reference.
	 * @see #getAddSlotsRequest()
	 * @generated
	 */
	void setAddSlotsRequest(AddSlotsRequestType value);

	/**
	 * Returns the value of the '<em><b>Approve Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The ObjectRefList is the list of
	 * refs to the registry entrys being approved.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approve Objects Request</em>' containment reference.
	 * @see #setApproveObjectsRequest(ApproveObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_ApproveObjectsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApproveObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ApproveObjectsRequestType getApproveObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getApproveObjectsRequest <em>Approve Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approve Objects Request</em>' containment reference.
	 * @see #getApproveObjectsRequest()
	 * @generated
	 */
	void setApproveObjectsRequest(ApproveObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Deprecate Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The ObjectRefList is the list of
	 * refs to the registry entrys being deprecated.
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecate Objects Request</em>' containment reference.
	 * @see #setDeprecateObjectsRequest(DeprecateObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_DeprecateObjectsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeprecateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeprecateObjectsRequestType getDeprecateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecate Objects Request</em>' containment reference.
	 * @see #getDeprecateObjectsRequest()
	 * @generated
	 */
	void setDeprecateObjectsRequest(DeprecateObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Optional Features Supported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Features Supported</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Features Supported</em>' containment reference.
	 * @see #setOptionalFeaturesSupported(OptionalFeaturesSupportedType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_OptionalFeaturesSupported()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OptionalFeaturesSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionalFeaturesSupportedType getOptionalFeaturesSupported();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getOptionalFeaturesSupported <em>Optional Features Supported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Features Supported</em>' containment reference.
	 * @see #getOptionalFeaturesSupported()
	 * @generated
	 */
	void setOptionalFeaturesSupported(OptionalFeaturesSupportedType value);

	/**
	 * Returns the value of the '<em><b>Registry Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Error</em>' containment reference.
	 * @see #setRegistryError(RegistryErrorType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RegistryError()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryError' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryErrorType getRegistryError();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryError <em>Registry Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Error</em>' containment reference.
	 * @see #getRegistryError()
	 * @generated
	 */
	void setRegistryError(RegistryErrorType value);

	/**
	 * Returns the value of the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The RegistryErrorList is derived from the ErrorList element from the ebXML Message Service Specification 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registry Error List</em>' containment reference.
	 * @see #setRegistryErrorList(RegistryErrorListType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RegistryErrorList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryErrorList' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryErrorListType getRegistryErrorList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryErrorList <em>Registry Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Error List</em>' containment reference.
	 * @see #getRegistryErrorList()
	 * @generated
	 */
	void setRegistryErrorList(RegistryErrorListType value);

	/**
	 * Returns the value of the '<em><b>Registry Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Describes the capability profile for the registry and what optional features
	 * are supported
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registry Profile</em>' containment reference.
	 * @see #setRegistryProfile(RegistryProfileType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RegistryProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryProfileType getRegistryProfile();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryProfile <em>Registry Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Profile</em>' containment reference.
	 * @see #getRegistryProfile()
	 * @generated
	 */
	void setRegistryProfile(RegistryProfileType value);

	/**
	 * Returns the value of the '<em><b>Registry Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Response</em>' containment reference.
	 * @see #setRegistryResponse(RegistryResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RegistryResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegistryResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryResponseType getRegistryResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRegistryResponse <em>Registry Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Response</em>' containment reference.
	 * @see #getRegistryResponse()
	 * @generated
	 */
	void setRegistryResponse(RegistryResponseType value);

	/**
	 * Returns the value of the '<em><b>Remove Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The ObjectRefList is the list of
	 * refs to the registry entrys being removed
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Objects Request</em>' containment reference.
	 * @see #setRemoveObjectsRequest(RemoveObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RemoveObjectsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemoveObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveObjectsRequestType getRemoveObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveObjectsRequest <em>Remove Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Objects Request</em>' containment reference.
	 * @see #getRemoveObjectsRequest()
	 * @generated
	 */
	void setRemoveObjectsRequest(RemoveObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Remove Slots Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Only need name in Slot within SlotList 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Slots Request</em>' containment reference.
	 * @see #setRemoveSlotsRequest(RemoveSlotsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RemoveSlotsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemoveSlotsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveSlotsRequestType getRemoveSlotsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRemoveSlotsRequest <em>Remove Slots Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Slots Request</em>' containment reference.
	 * @see #getRemoveSlotsRequest()
	 * @generated
	 */
	void setRemoveSlotsRequest(RemoveSlotsRequestType value);

	/**
	 * Returns the value of the '<em><b>Request Accepted Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Mapping of the same named interface in ebRS.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Accepted Response</em>' containment reference.
	 * @see #setRequestAcceptedResponse(RequestAcceptedResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RequestAcceptedResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestAcceptedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestAcceptedResponseType getRequestAcceptedResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRequestAcceptedResponse <em>Request Accepted Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Accepted Response</em>' containment reference.
	 * @see #getRequestAcceptedResponse()
	 * @generated
	 */
	void setRequestAcceptedResponse(RequestAcceptedResponseType value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The contrived root node 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Element</em>' containment reference.
	 * @see #setRootElement(RootElementType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_RootElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RootElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RootElementType getRootElement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getRootElement <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' containment reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(RootElementType value);

	/**
	 * Returns the value of the '<em><b>Submit Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The SubmitObjectsRequest allows one to submit a list of RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted object.  Note that the repository item being submitted is in a separate document that is not in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of the metadata of a repository item with the repository item itself. The value of the id attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within the Reference element within the Manifest element of the MessageHeader.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submit Objects Request</em>' containment reference.
	 * @see #setSubmitObjectsRequest(SubmitObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_SubmitObjectsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubmitObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SubmitObjectsRequestType getSubmitObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getSubmitObjectsRequest <em>Submit Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit Objects Request</em>' containment reference.
	 * @see #getSubmitObjectsRequest()
	 * @generated
	 */
	void setSubmitObjectsRequest(SubmitObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Update Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The UpdateObjectsRequest allows one to update a list of RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted object.  Note that the repository item being submitted is in a separate document that is not in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of the metadata of a repository item with the repository item itself. The value of the id attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within the Reference element within the Manifest element of the MessageHeader.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Objects Request</em>' containment reference.
	 * @see #setUpdateObjectsRequest(UpdateObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDocumentRoot_UpdateObjectsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateObjectsRequestType getUpdateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot#getUpdateObjectsRequest <em>Update Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Objects Request</em>' containment reference.
	 * @see #getUpdateObjectsRequest()
	 * @generated
	 */
	void setUpdateObjectsRequest(UpdateObjectsRequestType value);

} // DocumentRoot
