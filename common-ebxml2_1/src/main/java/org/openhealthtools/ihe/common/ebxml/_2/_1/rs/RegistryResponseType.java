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
 * $Id: RegistryResponseType.java,v 1.2 2007/07/21 00:25:33 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.query.AdhocQueryResponseType;
import org.openhealthtools.ihe.common.ebxml._2._1.query.GetContentResponseType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getAdhocQueryResponse <em>Adhoc Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getGetContentResponse <em>Get Content Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryResponseType()
 * @model extendedMetaData="name='RegistryResponse_._type' kind='elementOnly'"
 * @generated
 */
public interface RegistryResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Adhoc Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adhoc Query Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The response includes a RegistryObjectList which has zero or more
	 * RegistryObjects that match the query specified in AdhocQueryRequest.
	 * 
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adhoc Query Response</em>' containment reference.
	 * @see #setAdhocQueryResponse(AdhocQueryResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryResponseType_AdhocQueryResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdhocQueryResponse' namespace='urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1'"
	 * @generated
	 */
	AdhocQueryResponseType getAdhocQueryResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getAdhocQueryResponse <em>Adhoc Query Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query Response</em>' containment reference.
	 * @see #getAdhocQueryResponse()
	 * @generated
	 */
	void setAdhocQueryResponse(AdhocQueryResponseType value);

	/**
	 * Returns the value of the '<em><b>Get Content Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Content Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The GetContentResponse will have no sub-elements if there were no errors.
	 * The actual contents will be in the other payloads of the message.  
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get Content Response</em>' containment reference.
	 * @see #setGetContentResponse(GetContentResponseType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryResponseType_GetContentResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GetContentResponse' namespace='urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1'"
	 * @generated
	 */
	GetContentResponseType getGetContentResponse();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getGetContentResponse <em>Get Content Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Content Response</em>' containment reference.
	 * @see #getGetContentResponse()
	 * @generated
	 */
	void setGetContentResponse(GetContentResponseType value);

	/**
	 * Returns the value of the '<em><b>Registry Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Error List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The RegistryErrorList is derived from the ErrorList element from the ebXML Message Service Specification 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registry Error List</em>' containment reference.
	 * @see #setRegistryErrorList(RegistryErrorListType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryResponseType_RegistryErrorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegistryErrorList' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryErrorListType getRegistryErrorList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getRegistryErrorList <em>Registry Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Error List</em>' containment reference.
	 * @see #getRegistryErrorList()
	 * @generated
	 */
	void setRegistryErrorList(RegistryErrorListType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"Success"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(StatusType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getRegistryResponseType_Status()
	 * @model default="Success" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	boolean isSetStatus();

} // RegistryResponseType
