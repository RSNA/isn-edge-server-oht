/*******************************************************************************
 * Copyright (c) 2007,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds.response;

import java.util.List;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;

/**
 * Interface that defines a XDS Query Response.  This interface is a 
 * facade that wraps the XDS Query Response Type model instance and provides
 * additional delegates to access resulting data from an XDS Query.
 * 
 * @see org.openhealthtools.ihe.xds.response.model.XDSResponseType
 * @see org.openhealthtools.ihe.xds.response.model.XDSQueryResponseType
 * @see org.openhealthtools.ihe.xds.response.model.ResponsePackage#getXDSQueryResponseType()
 */
public interface XDSQueryResponseType extends XDSResponseType 
{
	/**
	 * Gets the underlying model (EMF) implementation of the XDS Query Response
	 * Type, exposing any specific EMF operations that may be needed 
	 * or useful to an end user.
	 * 
	 * @return The EMF instance of the underlying XDS Response model object
	 */
	//org.openhealthtools.ihe.xds.response.model.XDSQueryResponseType getModelObject();
	
	///////////////////////////////////// 
	// Delegate methods for EMF facade //
	/////////////////////////////////////
	
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.ResponsePackage#getXDSQueryResponseType_References()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType" containment="true"
	 *        extendedMetaData="kind='element' name='references'"
	 */
	List<ObjectRefType> getReferences();

	/**
	 * Returns the value of the '<em><b>Document Entry Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.xds.response.model.DocumentEntryResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Entry Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Entry Responses</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.model.ResponsePackage#getXDSQueryResponseType_DocumentEntryResponses()
	 * @model type="org.openhealthtools.ihe.xds.response.model.DocumentEntryResponseType" containment="true"
	 *        extendedMetaData="kind='element' name='documentEntryResponses'"
	 */
	List<DocumentEntryResponseType> getDocumentEntryResponses();

	/**
	 * Returns the value of the '<em><b>Folder Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.xds.response.model.FolderResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Responses</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.model.ResponsePackage#getXDSQueryResponseType_FolderResponses()
	 * @model type="org.openhealthtools.ihe.xds.response.model.FolderResponseType" containment="true"
	 *        extendedMetaData="kind='element' name='folderResponses'"
	 */
	List<FolderResponseType> getFolderResponses();

	/**
	 * Returns the value of the '<em><b>Submission Set Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.xds.response.model.SubmissionSetResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission Set Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission Set Responses</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.model.ResponsePackage#getXDSQueryResponseType_SubmissionSetResponses()
	 * @model type="org.openhealthtools.ihe.xds.response.model.SubmissionSetResponseType" containment="true"
	 *        extendedMetaData="kind='element' name='submissionSetResponses'"
	 */
	List<SubmissionSetResponseType> getSubmissionSetResponses();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.model.ResponsePackage#getXDSQueryResponseType_Associations()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1" containment="true"
	 *        extendedMetaData="kind='element' name='associations'"
	 */
	List<AssociationType1> getAssociations();

} // XDSQueryResponseType
