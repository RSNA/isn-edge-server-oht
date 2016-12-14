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


/**
 * Interface that defines a generic XDS Response.  This interface is a 
 * facade that wraps the XDS Response Type model instance, but includes
 * additional control methods to determine if the backed transaction is 
 * complete (isComplete()) and to get any error or exception that was caught
 * during sending, receiving, or processing of the transaction.
 * 
 * @see org.openhealthtools.ihe.xds.response.model.XDSResponseType
 * @see org.openhealthtools.ihe.xds.response.model.ResponsePackage#getXDSResponseType()
 */
public interface XDSResponseType 
{
	/**
	 * Checks if the transaction bound to this response has
	 * finished.  For asynchronous transactions, this means a 
	 * response has been received and the callback has finished 
	 * processing the response. If the transaction is synchronous, then
	 * this always return true.
	 * @return Whether the transaction is complete
	 */
	boolean isComplete();
	
	/**
	 * Returns any exceptions that were caught during an 
	 * asynchronous transaction.  This includes wire transfers,
	 * timeouts, and metadata processing errors.  Returns 
	 * null if no exceptions were caught.
	 * @return Exception caught during processing
	 */
	Throwable getCaughtException();
	
	/**
	 * Gets the underlying model (EMF) implementation of the XDS Response
	 * Type, exposing any specific EMF operations that may be needed 
	 * or useful to an end user.
	 * 
	 * @return The EMF instance of the underlying XDS Response model object
	 */
	//org.openhealthtools.ihe.xds.response.model.XDSResponseType getModelObject();

	
	/**
	 * Returns the value of the '<em><b>Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error List</em>' containment reference.
	 * @see #setErrorList(XDSErrorListType)
	 * @see org.openhealthtools.ihe.xds.response.ResponsePackage#getXDSResponseType_ErrorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='errorList'"
	 */
	XDSErrorListType getErrorList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.model.XDSResponseType#getErrorList <em>Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error List</em>' containment reference.
	 * @see #getErrorList()
	 */
	void setErrorList(XDSErrorListType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.xds.response.model.XDSStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.XDSStatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(XDSStatusType)
	 * @see org.openhealthtools.ihe.xds.response.ResponsePackage#getXDSResponseType_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 */
	XDSStatusType getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.model.XDSResponseType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.XDSStatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 */
	void setStatus(XDSStatusType value);


} // XDSResponseType