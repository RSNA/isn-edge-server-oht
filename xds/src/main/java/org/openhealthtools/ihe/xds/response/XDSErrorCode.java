/**
 * <copyright>
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XDS Error Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getXDSErrorCode()
 * @model extendedMetaData="name='XDSErrorCode'"
 */
public final class XDSErrorCode
{
	/**
	 * The '<em><b>UNKNOWNERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWNERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWNERROR_LITERAL
	 * @model literal="UNKNOWN_ERROR"

	 * @ordered
	 */
	public static final int UNKNOWNERROR = 0;

	/**
	 * The '<em><b>XDS Missing Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Missing Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_MISSING_DOCUMENT_LITERAL
	 * @model name="XDSMissingDocument"

	 * @ordered
	 */
	public static final int XDS_MISSING_DOCUMENT = 1;

	/**
	 * The '<em><b>XDS Missing Document Metadata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Missing Document Metadata</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_MISSING_DOCUMENT_METADATA_LITERAL
	 * @model name="XDSMissingDocumentMetadata"

	 * @ordered
	 */
	public static final int XDS_MISSING_DOCUMENT_METADATA = 2;

	/**
	 * The '<em><b>XDS Registry Not Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Registry Not Available</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_NOT_AVAILABLE_LITERAL
	 * @model name="XDSRegistryNotAvailable"

	 * @ordered
	 */
	public static final int XDS_REGISTRY_NOT_AVAILABLE = 3;

	/**
	 * The '<em><b>XDS Registry Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Registry Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_ERROR_LITERAL
	 * @model name="XDSRegistryError"

	 * @ordered
	 */
	public static final int XDS_REGISTRY_ERROR = 4;

	/**
	 * The '<em><b>XDS Repository Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Repository Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_ERROR_LITERAL
	 * @model name="XDSRepositoryError"

	 * @ordered
	 */
	public static final int XDS_REPOSITORY_ERROR = 5;

	/**
	 * The '<em><b>XDS Registry Duplicate Unique Id In Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Registry Duplicate Unique Id In Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL
	 * @model name="XDSRegistryDuplicateUniqueIdInMessage"

	 * @ordered
	 */
	public static final int XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE = 6;

	/**
	 * The '<em><b>XDS Repository Duplicate Unique Id In Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Repository Duplicate Unique Id In Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL
	 * @model name="XDSRepositoryDuplicateUniqueIdInMessage"

	 * @ordered
	 */
	public static final int XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE = 7;

	/**
	 * The '<em><b>XDS Duplicate Unique Id In Registry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Duplicate Unique Id In Registry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL
	 * @model name="XDSDuplicateUniqueIdInRegistry"

	 * @ordered
	 */
	public static final int XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY = 8;

	/**
	 * The '<em><b>XDS Non Identical Hash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Non Identical Hash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_NON_IDENTICAL_HASH_LITERAL
	 * @model name="XDSNonIdenticalHash"

	 * @ordered
	 */
	public static final int XDS_NON_IDENTICAL_HASH = 9;

	/**
	 * The '<em><b>XDS Non Identical Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Non Identical Size</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_NON_IDENTICAL_SIZE_LITERAL
	 * @model name="XDSNonIdenticalSize"
	 * @generated
	 * @ordered
	 */
	public static final int XDS_NON_IDENTICAL_SIZE = 10;

	/**
	 * The '<em><b>XDS Registry Busy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Registry Busy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_BUSY_LITERAL
	 * @model name="XDSRegistryBusy"

	 * @ordered
	 */
	public static final int XDS_REGISTRY_BUSY = 11;

	/**
	 * The '<em><b>XDS Repository Busy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Repository Busy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_BUSY_LITERAL
	 * @model name="XDSRepositoryBusy"

	 * @ordered
	 */
	public static final int XDS_REPOSITORY_BUSY = 12;

	/**
	 * The '<em><b>XDS Registry Out Of Resources</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Registry Out Of Resources</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL
	 * @model name="XDSRegistryOutOfResources"

	 * @ordered
	 */
	public static final int XDS_REGISTRY_OUT_OF_RESOURCES = 13;

	/**
	 * The '<em><b>XDS Repository Out Of Resources</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Repository Out Of Resources</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL
	 * @model name="XDSRepositoryOutOfResources"

	 * @ordered
	 */
	public static final int XDS_REPOSITORY_OUT_OF_RESOURCES = 14;

	/**
	 * The '<em><b>XDS Registry Metadata Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Registry Metadata Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_METADATA_ERROR_LITERAL
	 * @model name="XDSRegistryMetadataError"

	 * @ordered
	 */
	public static final int XDS_REGISTRY_METADATA_ERROR = 15;

	/**
	 * The '<em><b>XDS Repository Metadata Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Repository Metadata Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_METADATA_ERROR_LITERAL
	 * @model name="XDSRepositoryMetadataError"

	 * @ordered
	 */
	public static final int XDS_REPOSITORY_METADATA_ERROR = 16;

	/**
	 * The '<em><b>XDS Too Many Results</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Too Many Results</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_TOO_MANY_RESULTS_LITERAL
	 * @model name="XDSTooManyResults"

	 * @ordered
	 */
	public static final int XDS_TOO_MANY_RESULTS = 17;

	/**
	 * The '<em><b>XDS Extra Metadata Not Saved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Extra Metadata Not Saved</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_EXTRA_METADATA_NOT_SAVED_LITERAL
	 * @model name="XDSExtraMetadataNotSaved"

	 * @ordered
	 */
	public static final int XDS_EXTRA_METADATA_NOT_SAVED = 18;

	/**
	 * The '<em><b>XDS Unknown Patient Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Unknown Patient Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_PATIENT_ID_LITERAL
	 * @model name="XDSUnknownPatientId"

	 * @ordered
	 */
	public static final int XDS_UNKNOWN_PATIENT_ID = 19;

	/**
	 * The '<em><b>XDS Patient Id Does Not Match</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Patient Id Does Not Match</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL
	 * @model name="XDSPatientIdDoesNotMatch"

	 * @ordered
	 */
	public static final int XDS_PATIENT_ID_DOES_NOT_MATCH = 20;

	/**
	 * The '<em><b>XDS Unknown Stored Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Unknown Stored Query</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_STORED_QUERY_LITERAL
	 * @model name="XDSUnknownStoredQuery"

	 * @ordered
	 */
	public static final int XDS_UNKNOWN_STORED_QUERY = 21;

	/**
	 * The '<em><b>XDS Stored Query Missing Param</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Stored Query Missing Param</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_STORED_QUERY_MISSING_PARAM_LITERAL
	 * @model name="XDSStoredQueryMissingParam"

	 * @ordered
	 */
	public static final int XDS_STORED_QUERY_MISSING_PARAM = 22;

	/**
	 * The '<em><b>XDS Stored Query Param Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Stored Query Param Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_STORED_QUERY_PARAM_NUMBER_LITERAL
	 * @model name="XDSStoredQueryParamNumber"

	 * @ordered
	 */
	public static final int XDS_STORED_QUERY_PARAM_NUMBER = 23;

	/**
	 * The '<em><b>XDS Sql Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Sql Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_SQL_ERROR_LITERAL
	 * @model name="XDSSqlError"

	 * @ordered
	 */
	public static final int XDS_SQL_ERROR = 24;

	/**
	 * The '<em><b>XDS Registry Deprecated Document Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Registry Deprecated Document Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL
	 * @model name="XDSRegistryDeprecatedDocumentError"

	 * @ordered
	 */
	public static final int XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR = 25;

	/**
	 * The '<em><b>XDS Unknown Repository Unique Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Unknown Repository Unique Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL
	 * @model name="XDSUnknownRepositoryUniqueId"
	 * @generated
	 * @ordered
	 */
	public static final int XDS_UNKNOWN_REPOSITORY_UNIQUE_ID = 26;

	/*
	 * The '<em><b>XDS Repository Wrong Repository Unique Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Repository Wrong Repository Unique Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_WRONG_REPOSITORY_UNIQUE_ID_LITERAL
	 * @model name="XDSRepositoryWrongRepositoryUniqueId"

	 * @ordered
	 *//*
	public static final int XDS_REPOSITORY_WRONG_REPOSITORY_UNIQUE_ID = 25;*/
	
	// CP 388 - XDS Repository wrong repository unique id error code changed to XDS Document Unique Id Error
	/**
	 * The '<em><b>XDS Document Unique Id Error/b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Document Unique Id Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_DOCUMENT_UNIQUE_ID_ERROR
	 * @model name="XDSDocumentUniqueIdError"

	 * @ordered
	 */
	public static final int XDS_DOCUMENT_UNIQUE_ID_ERROR = 27;
	
	
	

	/**
	 * The '<em><b>XDS Result Not Single Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Result Not Single Patient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL
	 * @model name="XDSResultNotSinglePatient"

	 * @ordered
	 */
	public static final int XDS_RESULT_NOT_SINGLE_PATIENT = 28;

	/**
	 * The '<em><b>Partial Folder Content Not Processed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partial Folder Content Not Processed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL
	 * @model name="PartialFolderContentNotProcessed"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_FOLDER_CONTENT_NOT_PROCESSED = 29;

	/**
	 * The '<em><b>Partial Replace Content Not Processed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partial Replace Content Not Processed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL
	 * @model name="PartialReplaceContentNotProcessed"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_REPLACE_CONTENT_NOT_PROCESSED = 30;

	/**
	 * The '<em><b>Partial Transform Not Processed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partial Transform Not Processed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL
	 * @model name="PartialTransformNotProcessed"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_TRANSFORM_NOT_PROCESSED = 31;

	/**
	 * The '<em><b>Partial Append Content Not Processed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partial Append Content Not Processed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL
	 * @model name="PartialAppendContentNotProcessed"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_APPEND_CONTENT_NOT_PROCESSED = 32;

	/**
	 * The '<em><b>Partial Transform Replace Not Processed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partial Transform Replace Not Processed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL
	 * @model name="PartialTransformReplaceNotProcessed"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED = 33;

	/**
	 * The '<em><b>Document Queued</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Document Queued</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_QUEUED_LITERAL
	 * @model name="DocumentQueued"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_QUEUED = 34;

	/**
	 * The '<em><b>XDS Unknown Community</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Unknown Community</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_COMMUNITY_LITERAL
	 * @model name="XDSUnknownCommunity"

	 * @ordered
	 */
	public static final int XDS_UNKNOWN_COMMUNITY = 35;

	/**
	 * The '<em><b>XDS Missing Home Community Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Missing Home Community Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_MISSING_HOME_COMMUNITY_ID_LITERAL
	 * @model name="XDSMissingHomeCommunityId"

	 * @ordered
	 */
	public static final int XDS_MISSING_HOME_COMMUNITY_ID = 36;

	/**
	 * The '<em><b>XDS Unavailable Community</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDS Unavailable Community</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDS_UNAVAILABLE_COMMUNITY_LITERAL
	 * @model name="XDSUnavailableCommunity"

	 * @ordered
	 */
	public static final int XDS_UNAVAILABLE_COMMUNITY = 37;

	/**
	 * The '<em><b>UNKNOWNERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWNERROR

	 * @ordered
	 */
	public static final XDSErrorCode UNKNOWNERROR_LITERAL = new XDSErrorCode(UNKNOWNERROR, "UNKNOWNERROR", "UNKNOWN_ERROR");

	/**
	 * The '<em><b>XDS Missing Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_MISSING_DOCUMENT

	 * @ordered
	 */
	public static final XDSErrorCode XDS_MISSING_DOCUMENT_LITERAL = new XDSErrorCode(XDS_MISSING_DOCUMENT, "XDSMissingDocument", "XDSMissingDocument");

	/**
	 * The '<em><b>XDS Missing Document Metadata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_MISSING_DOCUMENT_METADATA

	 * @ordered
	 */
	public static final XDSErrorCode XDS_MISSING_DOCUMENT_METADATA_LITERAL = new XDSErrorCode(XDS_MISSING_DOCUMENT_METADATA, "XDSMissingDocumentMetadata", "XDSMissingDocumentMetadata");

	/**
	 * The '<em><b>XDS Registry Not Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_NOT_AVAILABLE

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REGISTRY_NOT_AVAILABLE_LITERAL = new XDSErrorCode(XDS_REGISTRY_NOT_AVAILABLE, "XDSRegistryNotAvailable", "XDSRegistryNotAvailable");

	/**
	 * The '<em><b>XDS Registry Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_ERROR

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REGISTRY_ERROR_LITERAL = new XDSErrorCode(XDS_REGISTRY_ERROR, "XDSRegistryError", "XDSRegistryError");

	/**
	 * The '<em><b>XDS Repository Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_ERROR

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REPOSITORY_ERROR_LITERAL = new XDSErrorCode(XDS_REPOSITORY_ERROR, "XDSRepositoryError", "XDSRepositoryError");

	/**
	 * The '<em><b>XDS Registry Duplicate Unique Id In Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL = new XDSErrorCode(XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE, "XDSRegistryDuplicateUniqueIdInMessage", "XDSRegistryDuplicateUniqueIdInMessage");

	/**
	 * The '<em><b>XDS Repository Duplicate Unique Id In Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL = new XDSErrorCode(XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE, "XDSRepositoryDuplicateUniqueIdInMessage", "XDSRepositoryDuplicateUniqueIdInMessage");

	/**
	 * The '<em><b>XDS Duplicate Unique Id In Registry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY

	 * @ordered
	 */
	public static final XDSErrorCode XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL = new XDSErrorCode(XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY, "XDSDuplicateUniqueIdInRegistry", "XDSDuplicateUniqueIdInRegistry");

	/**
	 * The '<em><b>XDS Non Identical Hash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_NON_IDENTICAL_HASH

	 * @ordered
	 */
	public static final XDSErrorCode XDS_NON_IDENTICAL_HASH_LITERAL = new XDSErrorCode(XDS_NON_IDENTICAL_HASH, "XDSNonIdenticalHash", "XDSNonIdenticalHash");

	/**
	 * The '<em><b>XDS Non Identical Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_NON_IDENTICAL_SIZE
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode XDS_NON_IDENTICAL_SIZE_LITERAL = new XDSErrorCode(XDS_NON_IDENTICAL_SIZE, "XDSNonIdenticalSize", "XDSNonIdenticalSize");

	/**
	 * The '<em><b>XDS Registry Busy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_BUSY

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REGISTRY_BUSY_LITERAL = new XDSErrorCode(XDS_REGISTRY_BUSY, "XDSRegistryBusy", "XDSRegistryBusy");

	/**
	 * The '<em><b>XDS Repository Busy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_BUSY

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REPOSITORY_BUSY_LITERAL = new XDSErrorCode(XDS_REPOSITORY_BUSY, "XDSRepositoryBusy", "XDSRepositoryBusy");

	/**
	 * The '<em><b>XDS Registry Out Of Resources</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_OUT_OF_RESOURCES

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL = new XDSErrorCode(XDS_REGISTRY_OUT_OF_RESOURCES, "XDSRegistryOutOfResources", "XDSRegistryOutOfResources");

	/**
	 * The '<em><b>XDS Repository Out Of Resources</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_OUT_OF_RESOURCES

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL = new XDSErrorCode(XDS_REPOSITORY_OUT_OF_RESOURCES, "XDSRepositoryOutOfResources", "XDSRepositoryOutOfResources");

	/**
	 * The '<em><b>XDS Registry Metadata Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_METADATA_ERROR

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REGISTRY_METADATA_ERROR_LITERAL = new XDSErrorCode(XDS_REGISTRY_METADATA_ERROR, "XDSRegistryMetadataError", "XDSRegistryMetadataError");

	/**
	 * The '<em><b>XDS Repository Metadata Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REPOSITORY_METADATA_ERROR

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REPOSITORY_METADATA_ERROR_LITERAL = new XDSErrorCode(XDS_REPOSITORY_METADATA_ERROR, "XDSRepositoryMetadataError", "XDSRepositoryMetadataError");

	/**
	 * The '<em><b>XDS Too Many Results</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_TOO_MANY_RESULTS

	 * @ordered
	 */
	public static final XDSErrorCode XDS_TOO_MANY_RESULTS_LITERAL = new XDSErrorCode(XDS_TOO_MANY_RESULTS, "XDSTooManyResults", "XDSTooManyResults");

	/**
	 * The '<em><b>XDS Extra Metadata Not Saved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_EXTRA_METADATA_NOT_SAVED

	 * @ordered
	 */
	public static final XDSErrorCode XDS_EXTRA_METADATA_NOT_SAVED_LITERAL = new XDSErrorCode(XDS_EXTRA_METADATA_NOT_SAVED, "XDSExtraMetadataNotSaved", "XDSExtraMetadataNotSaved");

	/**
	 * The '<em><b>XDS Unknown Patient Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_PATIENT_ID

	 * @ordered
	 */
	public static final XDSErrorCode XDS_UNKNOWN_PATIENT_ID_LITERAL = new XDSErrorCode(XDS_UNKNOWN_PATIENT_ID, "XDSUnknownPatientId", "XDSUnknownPatientId");

	/**
	 * The '<em><b>XDS Patient Id Does Not Match</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_PATIENT_ID_DOES_NOT_MATCH

	 * @ordered
	 */
	public static final XDSErrorCode XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL = new XDSErrorCode(XDS_PATIENT_ID_DOES_NOT_MATCH, "XDSPatientIdDoesNotMatch", "XDSPatientIdDoesNotMatch");

	/**
	 * The '<em><b>XDS Unknown Stored Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_STORED_QUERY

	 * @ordered
	 */
	public static final XDSErrorCode XDS_UNKNOWN_STORED_QUERY_LITERAL = new XDSErrorCode(XDS_UNKNOWN_STORED_QUERY, "XDSUnknownStoredQuery", "XDSUnknownStoredQuery");

	/**
	 * The '<em><b>XDS Stored Query Missing Param</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_STORED_QUERY_MISSING_PARAM

	 * @ordered
	 */
	public static final XDSErrorCode XDS_STORED_QUERY_MISSING_PARAM_LITERAL = new XDSErrorCode(XDS_STORED_QUERY_MISSING_PARAM, "XDSStoredQueryMissingParam", "XDSStoredQueryMissingParam");

	/**
	 * The '<em><b>XDS Stored Query Param Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_STORED_QUERY_PARAM_NUMBER

	 * @ordered
	 */
	public static final XDSErrorCode XDS_STORED_QUERY_PARAM_NUMBER_LITERAL = new XDSErrorCode(XDS_STORED_QUERY_PARAM_NUMBER, "XDSStoredQueryParamNumber", "XDSStoredQueryParamNumber");

	/**
	 * The '<em><b>XDS Sql Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_SQL_ERROR

	 * @ordered
	 */
	public static final XDSErrorCode XDS_SQL_ERROR_LITERAL = new XDSErrorCode(XDS_SQL_ERROR, "XDSSqlError", "XDSSqlError");

	/**
	 * The '<em><b>XDS Registry Deprecated Document Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR

	 * @ordered
	 */
	public static final XDSErrorCode XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL = new XDSErrorCode(XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR, "XDSRegistryDeprecatedDocumentError", "XDSRegistryDeprecatedDocumentError");

	/**
	 * The '<em><b>XDS Unknown Repository Unique Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_REPOSITORY_UNIQUE_ID
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL = new XDSErrorCode(XDS_UNKNOWN_REPOSITORY_UNIQUE_ID, "XDSUnknownRepositoryUniqueId", "XDSUnknownRepositoryUniqueId");

	/**
	 * The '<em><b>XDS Document Unique Id Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_DOCUMENT_UNIQUE_ID_ERROR

	 * @ordered
	 */
	public static final XDSErrorCode XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL = new XDSErrorCode(XDS_DOCUMENT_UNIQUE_ID_ERROR, "XDSDocumentUniqueIdError", "XDSDocumentUniqueIdError");

	/**
	 * The '<em><b>XDS Result Not Single Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_RESULT_NOT_SINGLE_PATIENT
	 * @ordered
	 */
	public static final XDSErrorCode XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL= new XDSErrorCode(XDS_RESULT_NOT_SINGLE_PATIENT, "XDSResultNotSinglePatient", "XDSResultNotSinglePatient");
	/**
	 * The '<em><b>Partial Folder Content Not Processed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_FOLDER_CONTENT_NOT_PROCESSED
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL = new XDSErrorCode(PARTIAL_FOLDER_CONTENT_NOT_PROCESSED, "PartialFolderContentNotProcessed", "PartialFolderContentNotProcessed");

	/**
	 * The '<em><b>Partial Replace Content Not Processed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_REPLACE_CONTENT_NOT_PROCESSED
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL = new XDSErrorCode(PARTIAL_REPLACE_CONTENT_NOT_PROCESSED, "PartialReplaceContentNotProcessed", "PartialReplaceContentNotProcessed");

	/**
	 * The '<em><b>Partial Transform Not Processed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_TRANSFORM_NOT_PROCESSED
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL = new XDSErrorCode(PARTIAL_TRANSFORM_NOT_PROCESSED, "PartialTransformNotProcessed", "PartialTransformNotProcessed");

	/**
	 * The '<em><b>Partial Append Content Not Processed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_APPEND_CONTENT_NOT_PROCESSED
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL = new XDSErrorCode(PARTIAL_APPEND_CONTENT_NOT_PROCESSED, "PartialAppendContentNotProcessed", "PartialAppendContentNotProcessed");

	/**
	 * The '<em><b>Partial Transform Replace Not Processed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL = new XDSErrorCode(PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED, "PartialTransformReplaceNotProcessed", "PartialTransformReplaceNotProcessed");

	/**
	 * The '<em><b>Document Queued</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_QUEUED
	 * @generated
	 * @ordered
	 */
	public static final XDSErrorCode DOCUMENT_QUEUED_LITERAL = new XDSErrorCode(DOCUMENT_QUEUED, "DocumentQueued", "DocumentQueued");

	/**
	 * The '<em><b>XDS Unknown Community</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_UNKNOWN_COMMUNITY

	 * @ordered
	 */
	public static final XDSErrorCode XDS_UNKNOWN_COMMUNITY_LITERAL = new XDSErrorCode(XDS_UNKNOWN_COMMUNITY, "XDSUnknownCommunity", "XDSUnknownCommunity");

	/**
	 * The '<em><b>XDS Missing Home Community Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_MISSING_HOME_COMMUNITY_ID

	 * @ordered
	 */
	public static final XDSErrorCode XDS_MISSING_HOME_COMMUNITY_ID_LITERAL = new XDSErrorCode(XDS_MISSING_HOME_COMMUNITY_ID, "XDSMissingHomeCommunityId", "XDSMissingHomeCommunityId");

	/**
	 * The '<em><b>XDS Unavailable Community</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDS_UNAVAILABLE_COMMUNITY

	 * @ordered
	 */
	public static final XDSErrorCode XDS_UNAVAILABLE_COMMUNITY_LITERAL = new XDSErrorCode(XDS_UNAVAILABLE_COMMUNITY, "XDSUnavailableCommunity", "XDSUnavailableCommunity");

	/**
	 * An array of all the '<em><b>XDS Error Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private static final XDSErrorCode[] VALUES_ARRAY =
		new XDSErrorCode[] {
			UNKNOWNERROR_LITERAL,
			XDS_MISSING_DOCUMENT_LITERAL,
			XDS_MISSING_DOCUMENT_METADATA_LITERAL,
			XDS_REGISTRY_NOT_AVAILABLE_LITERAL,
			XDS_REGISTRY_ERROR_LITERAL,
			XDS_REPOSITORY_ERROR_LITERAL,
			XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL,
			XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL,
			XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL,
			XDS_NON_IDENTICAL_HASH_LITERAL,
			XDS_REGISTRY_BUSY_LITERAL,
			XDS_REPOSITORY_BUSY_LITERAL,
			XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL,
			XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL,
			XDS_REGISTRY_METADATA_ERROR_LITERAL,
			XDS_REPOSITORY_METADATA_ERROR_LITERAL,
			XDS_TOO_MANY_RESULTS_LITERAL,
			XDS_EXTRA_METADATA_NOT_SAVED_LITERAL,
			XDS_UNKNOWN_PATIENT_ID_LITERAL,
			XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL,
			XDS_UNKNOWN_STORED_QUERY_LITERAL,
			XDS_STORED_QUERY_MISSING_PARAM_LITERAL,
			XDS_STORED_QUERY_PARAM_NUMBER_LITERAL,
			XDS_SQL_ERROR_LITERAL,
			XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL,
			XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL,
			XDS_UNKNOWN_COMMUNITY_LITERAL,
			XDS_MISSING_HOME_COMMUNITY_ID_LITERAL,
			XDS_UNAVAILABLE_COMMUNITY_LITERAL,
			XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL,
			XDS_NON_IDENTICAL_SIZE_LITERAL,
			XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL,
			PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL,
			PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL,
			PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL,
			PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL,
			PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL,
			DOCUMENT_QUEUED_LITERAL
		};

	/**
	 * A public read-only list of all the '<em><b>XDS Error Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public static final List<XDSErrorCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XDS Error Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public static XDSErrorCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XDSErrorCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XDS Error Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public static XDSErrorCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XDSErrorCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XDS Error Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public static XDSErrorCode get(int value) {
		switch (value) {
			case UNKNOWNERROR: return UNKNOWNERROR_LITERAL;
			case XDS_MISSING_DOCUMENT: return XDS_MISSING_DOCUMENT_LITERAL;
			case XDS_MISSING_DOCUMENT_METADATA: return XDS_MISSING_DOCUMENT_METADATA_LITERAL;
			case XDS_REGISTRY_NOT_AVAILABLE: return XDS_REGISTRY_NOT_AVAILABLE_LITERAL;
			case XDS_REGISTRY_ERROR: return XDS_REGISTRY_ERROR_LITERAL;
			case XDS_REPOSITORY_ERROR: return XDS_REPOSITORY_ERROR_LITERAL;
			case XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE: return XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL;
			case XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE: return XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL;
			case XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY: return XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL;
			case XDS_NON_IDENTICAL_HASH: return XDS_NON_IDENTICAL_HASH_LITERAL;
			case XDS_REGISTRY_BUSY: return XDS_REGISTRY_BUSY_LITERAL;
			case XDS_REPOSITORY_BUSY: return XDS_REPOSITORY_BUSY_LITERAL;
			case XDS_REGISTRY_OUT_OF_RESOURCES: return XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL;
			case XDS_REPOSITORY_OUT_OF_RESOURCES: return XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL;
			case XDS_REGISTRY_METADATA_ERROR: return XDS_REGISTRY_METADATA_ERROR_LITERAL;
			case XDS_REPOSITORY_METADATA_ERROR: return XDS_REPOSITORY_METADATA_ERROR_LITERAL;
			case XDS_TOO_MANY_RESULTS: return XDS_TOO_MANY_RESULTS_LITERAL;
			case XDS_EXTRA_METADATA_NOT_SAVED: return XDS_EXTRA_METADATA_NOT_SAVED_LITERAL;
			case XDS_UNKNOWN_PATIENT_ID: return XDS_UNKNOWN_PATIENT_ID_LITERAL;
			case XDS_PATIENT_ID_DOES_NOT_MATCH: return XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL;
			case XDS_UNKNOWN_STORED_QUERY: return XDS_UNKNOWN_STORED_QUERY_LITERAL;
			case XDS_STORED_QUERY_MISSING_PARAM: return XDS_STORED_QUERY_MISSING_PARAM_LITERAL;
			case XDS_STORED_QUERY_PARAM_NUMBER: return XDS_STORED_QUERY_PARAM_NUMBER_LITERAL;
			case XDS_SQL_ERROR: return XDS_SQL_ERROR_LITERAL;
			case XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR: return XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL;
			case XDS_DOCUMENT_UNIQUE_ID_ERROR: return XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL;
			case XDS_UNKNOWN_COMMUNITY: return XDS_UNKNOWN_COMMUNITY_LITERAL;
			case XDS_MISSING_HOME_COMMUNITY_ID: return XDS_MISSING_HOME_COMMUNITY_ID_LITERAL;
			case XDS_UNAVAILABLE_COMMUNITY: return XDS_UNAVAILABLE_COMMUNITY_LITERAL;
			case XDS_RESULT_NOT_SINGLE_PATIENT: return XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL;
			case XDS_NON_IDENTICAL_SIZE: return XDS_NON_IDENTICAL_SIZE_LITERAL;
			case XDS_UNKNOWN_REPOSITORY_UNIQUE_ID: return XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL;
			case PARTIAL_APPEND_CONTENT_NOT_PROCESSED: return PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL;
			case PARTIAL_FOLDER_CONTENT_NOT_PROCESSED: return PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL;
			case PARTIAL_REPLACE_CONTENT_NOT_PROCESSED: return PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL;
			case PARTIAL_TRANSFORM_NOT_PROCESSED: return PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL;
			case PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED: return PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL;
			case DOCUMENT_QUEUED: return DOCUMENT_QUEUED_LITERAL;
		}
		return null;
	}

	int value;
	String name;
	String literal;
	
	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	private XDSErrorCode(int value, String name, String literal) {
		//super(value, name, literal);
		this.value = value;
		this.name = name;
		this.literal = literal;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	

} //XDSErrorCode
