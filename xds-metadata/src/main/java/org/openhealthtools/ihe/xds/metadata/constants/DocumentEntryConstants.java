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
 * IHE XDS DocumentEntry Metadata attribute names and related constants
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface DocumentEntryConstants {
	
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
	
	/** Slot name for creationTime */
	public static final String CREATION_TIME = "creationTime";

	/** Slot name for hash */
	public static final String HASH = "hash";

	/** Slot name for languageCode */
	public static final String LANGUAGE_CODE = "languageCode";

	/** Slot name for legalAuthenticator(s) */
	public static final String LEGAL_AUTHENTICATOR = "legalAuthenticator";

	/** ExternalIdentifier name for patientId */
	public static final String PATIENT_ID = "XDSDocumentEntry.patientId";

	/** Slot name for serviceStartTime */
	public static final String SERVICE_START_TIME = "serviceStartTime";

	/** Slot name for serviceStopTime */
	public static final String SERVICE_STOP_TIME = "serviceStopTime";
	
	/** Slot name for reference ID list **/
	public static final String REFERENCE_ID_LIST = "urn:ihe:iti:xds:2013:referenceIdList";

	/** Slot name for repositoryUniqueId */
	public static final String REPOSITORY_UNIQUE_ID = "repositoryUniqueId";
	
	/** Slot name for size */
	public static final String SIZE = "size";

	/** Slot name for sourcePatientId */
	public static final String SOURCE_PATIENT_ID = "sourcePatientId";

	/** Slot name for sourcePatientInfo */
	public static final String SOURCE_PATIENT_INFO = "sourcePatientInfo";

	// ID's for sourcePatieintInfo fields
	/** Identifier for field PID-1 */
	public static final String PID1_ID = "PID-1";
	/** Identifier for field PID-2 */
	public static final String PID2_ID = "PID-2";
	/** Identifier for field PID-3 */
	public static final String PID3_ID = "PID-3";
	/** Identifier for field PID-4 */
	public static final String PID4_ID = "PID-4";
	/** Identifier for field PID-5 */
	public static final String PID5_ID = "PID-5";
	/** Identifier for field PID-6 */
	public static final String PID6_ID = "PID-6";
	/** Identifier for field PID-7 */
	public static final String PID7_ID = "PID-7";	
	/** Identifier for field PID-8 */
	public static final String PID8_ID = "PID-8";
	/** Identifier for field PID-9 */
	public static final String PID9_ID = "PID-9";
	/** Identifier for field PID-10 */
	public static final String PID10_ID = "PID-10";
	/** Identifier for field PID-11 */
	public static final String PID11_ID = "PID-11";	
	/** Identifier for field PID-12 */
	public static final String PID12_ID = "PID-12";
	/** Identifier for field PID-13 */
	public static final String PID13_ID = "PID-13";
	/** Identifier for field PID-14 */
	public static final String PID14_ID = "PID-14";
	/** Identifier for field PID-15 */
	public static final String PID15_ID = "PID-15";
	/** Identifier for field PID-16 */
	public static final String PID16_ID = "PID-16";
	/** Identifier for field PID-17 */
	public static final String PID17_ID = "PID-17";
	/** Identifier for field PID-18 */
	public static final String PID18_ID = "PID-18";
	/** Identifier for field PID-19 */
	public static final String PID19_ID = "PID-19";
	/** Identifier for field PID-20 */
	public static final String PID20_ID = "PID-20";
	/** Identifier for field PID-21 */
	public static final String PID21_ID = "PID-21";
	/** Identifier for field PID-22 */
	public static final String PID22_ID = "PID-22";
	/** Identifier for field PID-23 */
	public static final String PID23_ID = "PID-23";
	/** Identifier for field PID-24 */
	public static final String PID24_ID = "PID-24";
	/** Identifier for field PID-25 */
	public static final String PID25_ID = "PID-25";
	/** Identifier for field PID-26 */
	public static final String PID26_ID = "PID-26";	
	/** Identifier for field PID-27 */
	public static final String PID27_ID = "PID-27";	
	/** Identifier for field PID-28 */
	public static final String PID28_ID = "PID-28";	
	/** Identifier for field PID-29 */
	public static final String PID29_ID = "PID-29";	
	/** Identifier for field PID-30 */
	public static final String PID30_ID = "PID-30";	
	/** Identifier for field PID-31 */
	public static final String PID31_ID = "PID-31";
	/** Identifier for field PID-32 */
	public static final String PID32_ID = "PID-32";	
	/** Identifier for field PID-33 */
	public static final String PID33_ID = "PID-33";
	/** Identifier for field PID-34 */
	public static final String PID34_ID = "PID-34";
	/** Identifier for field PID-35 */
	public static final String PID35_ID = "PID-35";
	/** Identifier for field PID-36 */
	public static final String PID36_ID = "PID-36";	
	/** Identifier for field PID-37 */
	public static final String PID37_ID = "PID-37";	
	/** Identifier for field PID-38 */
	public static final String PID38_ID = "PID-38";	
	/** Identifier for field PID-39 */
	public static final String PID39_ID = "PID-39";

	/** ExternalIdentifier name for uniqueId */
	public static final String UNIQUE_ID = "XDSDocumentEntry.uniqueId";

	/** Slot name for URI */
	public static final String URI = "URI";
	
	/* SEK - this was changed for the final text September 2007. It is no longer needed.
	 *  Slot name for LONG-URI (uri's that exceed 128 character limit of ebXML2.1 Slot*/
/*	public static final String LONG_URI = "LONG-URI";*/
	
	/** Slot name for code scheme slots in Classificaitons */
	public static final String CODING_SCHEME = "codingScheme";
}
