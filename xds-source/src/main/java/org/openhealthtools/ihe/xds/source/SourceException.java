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

package org.openhealthtools.ihe.xds.source;



/**
 * Exception class for XDS Source Actor implementation
 * 
 * @author <a href="glenn@almaden.ibm.com">Glenn Deen </a>
 * @since OHF v0.0
 */
public class SourceException extends Exception {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Documents stored to repository successfully but an error occurred in
     * storing the metadata to the registry Trigger Event output error from IHE
     * XDS Provide and Register Document Set transaction. See IHE XDS section
     * 3.15.4.2.1
     *  
     */
    public static final int REGISTRY_REJECTED_METADATA = 1;

    /**
     * Documents were not successfully stored to the repository Trigger Event
     * output error from IHE XDS Provide and Register Document Set transaction.
     * See IHE XDS section 3.15.4.2.1
     *  
     */
    public static final int REPOSITORY_REJECTED_DOCUMENTS = 2;

    /**
     * The URL to the XDS Repository has not been defined.
     */
    public static final int XDS_REPOSITORY_UNDEFINED = 3;
    
    /**
     * The response message from the Repository could not be interpreted.
     */
    public static final int REPOSITORY_RESPONSE_NOT_UNDERSTOOD = 4;
    
    /**
     * The Respository response indicated it was unavailble.
     */
    public static final int REPOSITORY_UNAVAILABLE = 5;
    
    /**
     * The namespace referenced by the ebXML response from the registry was not recognized.
     * Only ebXML 2.1 and ebXML 3.0 responses are understood.
     */
    public static final int REGISTRY_RESPONSE_USED_UNKNOWN_NAMESPACE = 6;
    /**
     * The SOAP message to the Repository returned a SOAP error.
     * The original error will be imbedded in the SourceExceptions exception chain.
     */
    public static final int MESSAGING_ERROR = 7;
    
    /**
     * The Terminology Service returned an error. The original error will be imbedded it the exception chain.
     */
    public static final int TERMINOLOGY_SERVICE_ERROR = 8;
    /**
     * The IHE XDS Auditor Service returned an error. The original error will be imbedded it the exception chain.
     */
    public static final int AUDIT_ERROR = 9;
    
   /**
    *  A document in the submission is missing a  PatientID entry in its metadata.  
    */
    public static final int DOCUMENT_ENTRY_MISSING_PATIENT_ID  = 10;
    
    
    /**
     * holds the reason code
     */
    private int reason;
    
    /**
     * Create a new exception 
     * @param reason Reason code for the exception, one of the int reason
     * constants: REGISTRY_REJECTED_METADATA, REPOSITORY_REJECTED_DOCUMENTS
     */
    public SourceException(int reason) {
        super();
        this.reason = reason;
    }
    /**
     * Create a new exception 
     * @param reason Reason code for the exception, one of the int reason
     * constants: REGISTRY_REJECTED_METADATA, REPOSITORY_REJECTED_DOCUMENTS
     * @param message String indicating the reason for the exception
     * 
     */ 
    public SourceException(int reason, String message) {
        super(message);
        this.reason = reason;
    }
    /**
     * Create a new exception 
     * parameter reason Reason code for the exception, one of the int reason
     * constants: REGISTRY_REJECTED_METADATA, REPOSITORY_REJECTED_DOCUMENTS
     */
    /**
     * @param reason Reason code for the exception, one of the int reason
     * constants: REGISTRY_REJECTED_METADATA, REPOSITORY_REJECTED_DOCUMENTS
     * @param message String indicating the reason for the exception
     * @param cause Throwable exception which caused the exception
     */
    public SourceException(int reason, String message, Throwable cause) {
        super(message, cause);
        this.reason = reason;
    }

    /**
     * Get the reason code for the exception
     * @return int reason code - see error code constants
     */
    public int getReason()
    {
        return this.reason;
    }
    
}
