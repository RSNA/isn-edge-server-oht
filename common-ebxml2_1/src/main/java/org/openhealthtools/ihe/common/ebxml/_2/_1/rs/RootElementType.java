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
 * $Id: RootElementType.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getSubmitObjectsRequest <em>Submit Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getUpdateObjectsRequest <em>Update Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getApproveObjectsRequest <em>Approve Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveObjectsRequest <em>Remove Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAdhocQueryRequest <em>Adhoc Query Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getGetContentRequest <em>Get Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAddSlotsRequest <em>Add Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveSlotsRequest <em>Remove Slots Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryResponse <em>Registry Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryProfile <em>Registry Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType()
 * @model extendedMetaData="name='RootElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RootElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Submit Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submit Objects Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The SubmitObjectsRequest allows one to submit a list of RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted object.  Note that the repository item being submitted is in a separate document that is not in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of the metadata of a repository item with the repository item itself. The value of the id attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within the Reference element within the Manifest element of the MessageHeader.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submit Objects Request</em>' containment reference.
	 * @see #setSubmitObjectsRequest(SubmitObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_SubmitObjectsRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubmitObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SubmitObjectsRequestType getSubmitObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getSubmitObjectsRequest <em>Submit Objects Request</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Update Objects Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The UpdateObjectsRequest allows one to update a list of RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted object.  Note that the repository item being submitted is in a separate document that is not in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of the metadata of a repository item with the repository item itself. The value of the id attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within the Reference element within the Manifest element of the MessageHeader.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Objects Request</em>' containment reference.
	 * @see #setUpdateObjectsRequest(UpdateObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_UpdateObjectsRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateObjectsRequestType getUpdateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getUpdateObjectsRequest <em>Update Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Objects Request</em>' containment reference.
	 * @see #getUpdateObjectsRequest()
	 * @generated
	 */
	void setUpdateObjectsRequest(UpdateObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Approve Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approve Objects Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The ObjectRefList is the list of
	 * refs to the registry entrys being approved.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approve Objects Request</em>' containment reference.
	 * @see #setApproveObjectsRequest(ApproveObjectsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_ApproveObjectsRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApproveObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ApproveObjectsRequestType getApproveObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getApproveObjectsRequest <em>Approve Objects Request</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Deprecate Objects Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_DeprecateObjectsRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeprecateObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeprecateObjectsRequestType getDeprecateObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecate Objects Request</em>' containment reference.
	 * @see #getDeprecateObjectsRequest()
	 * @generated
	 */
	void setDeprecateObjectsRequest(DeprecateObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Remove Objects Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Objects Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_RemoveObjectsRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemoveObjectsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveObjectsRequestType getRemoveObjectsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveObjectsRequest <em>Remove Objects Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Objects Request</em>' containment reference.
	 * @see #getRemoveObjectsRequest()
	 * @generated
	 */
	void setRemoveObjectsRequest(RemoveObjectsRequestType value);

	/**
	 * Returns the value of the '<em><b>Adhoc Query Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adhoc Query Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * An Ad hoc query request specifies a query string as defined by [RS] in the queryString attribute
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adhoc Query Request</em>' containment reference.
	 * @see #setAdhocQueryRequest(AdhocQueryRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_AdhocQueryRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdhocQueryRequest' namespace='urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1'"
	 * @generated
	 */
	AdhocQueryRequestType getAdhocQueryRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAdhocQueryRequest <em>Adhoc Query Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query Request</em>' containment reference.
	 * @see #getAdhocQueryRequest()
	 * @generated
	 */
	void setAdhocQueryRequest(AdhocQueryRequestType value);

	/**
	 * Returns the value of the '<em><b>Get Content Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Content Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Gets the actual content (not metadata) specified by the ObjectRefList
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get Content Request</em>' containment reference.
	 * @see #setGetContentRequest(GetContentRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_GetContentRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GetContentRequest' namespace='urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1'"
	 * @generated
	 */
	GetContentRequestType getGetContentRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getGetContentRequest <em>Get Content Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Content Request</em>' containment reference.
	 * @see #getGetContentRequest()
	 * @generated
	 */
	void setGetContentRequest(GetContentRequestType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_AddSlotsRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddSlotsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	AddSlotsRequestType getAddSlotsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getAddSlotsRequest <em>Add Slots Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Slots Request</em>' containment reference.
	 * @see #getAddSlotsRequest()
	 * @generated
	 */
	void setAddSlotsRequest(AddSlotsRequestType value);

	/**
	 * Returns the value of the '<em><b>Remove Slots Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Slots Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Only need name in Slot within SlotList 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Slots Request</em>' containment reference.
	 * @see #setRemoveSlotsRequest(RemoveSlotsRequestType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_RemoveSlotsRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemoveSlotsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveSlotsRequestType getRemoveSlotsRequest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRemoveSlotsRequest <em>Remove Slots Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Slots Request</em>' containment reference.
	 * @see #getRemoveSlotsRequest()
	 * @generated
	 */
	void setRemoveSlotsRequest(RemoveSlotsRequestType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_RegistryResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegistryResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryResponseType getRegistryResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryResponse <em>Registry Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Response</em>' containment reference.
	 * @see #getRegistryResponse()
	 * @generated
	 */
	void setRegistryResponse(RegistryResponseType value);

	/**
	 * Returns the value of the '<em><b>Registry Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRootElementType_RegistryProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegistryProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryProfileType getRegistryProfile();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType#getRegistryProfile <em>Registry Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Profile</em>' containment reference.
	 * @see #getRegistryProfile()
	 * @generated
	 */
	void setRegistryProfile(RegistryProfileType value);

} // RootElementType
