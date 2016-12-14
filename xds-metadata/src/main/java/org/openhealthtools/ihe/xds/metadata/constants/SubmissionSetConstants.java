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

package org.openhealthtools.ihe.xds.metadata.constants;

/**
 * IHE XDS SubmissionSet Metadata attribute names and related constants
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface SubmissionSetConstants {
	/** Slot name for authorInstitution */
	public static final String AUTHOR_INSTITUTION = "authorInstitution";

	/** Slot name for authorPerson */
	public static final String AUTHOR_PERSON = "authorPerson";
	
	/** Slot name for authorRole */
	public static final String AUTHOR_ROLE = "authorRole";
	
	/** Slot name for authorSpecialty */
	public static final String AUTHOR_SPECIALITY = "authorSpecialty";
	
	/** Slot name for authorSpecialty */
	public static final String AUTHOR_TELECOMMUNICATION = "authorTelecommunication";
	
	/** ExternalIdentifier name for patientId */
	public static final String PATIENT_ID = "XDSSubmissionSet.patientId";
	
	/** ExternalIdentifier name for sourceId */
	public static final String SOURCE_ID = "XDSSubmissionSet.sourceId";
	
	/** Slot name for submissionTime */
	public static final String SUBMISSION_TIME = "submissionTime";
	
	/** Name for RegistryPackage*/
	public static final String SUBMISSION_SET = "Submission Set";
	
	/** ExternalIdentifier name for uniqueId */
	public static final String UNIQUE_ID = "XDSSubmissionSet.uniqueId";
	
	/** Slot name for code scheme slots in Classificaitons */
	public static final String CODING_SCHEME = "codingScheme";
	
	// IHE 2008-2009 ITI CP #362
	/** Slot name for intendedRecipient */
	public static final String INTENDED_RECIPIENT = "intendedRecipient";
	
}
