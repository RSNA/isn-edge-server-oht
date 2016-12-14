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
 * List of uuid's used to identify pieces of XDS Metadata
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface UUIDs {
	
	// doc entry
	/** IHE assigned UUID for Document Entry Author */
	public static final String DOC_ENTRY_AUTHOR = 
		"urn:uuid:93606bcf-9494-43ec-9b4e-a7748d1a838d";
	
	/** IHE assigned UUID for Document Entry Object */
	public static final String DOC_ENTRY_OBJECT = 
		"urn:uuid:7edca82f-054d-47f2-a032-9b2a5b5186c1";
	
	/** IHE assigned UUID for On Demand Document Entry Object */
	public static final String ON_DEMAND_DOC_ENTRY_OBJECT = 
		"urn:uuid:34268e47-fdf5-41a6-ba33-82133c465248";
	
	/** IHE assigned UUID for Document Entry Class Code */
	public static final String DOC_ENTRY_CLASS_CODE = 
		"urn:uuid:41a5887f-8865-4c09-adf7-e362475b143a";
	
	/** IHE assigned UUID for Document Entry Confidentiality Code */
	public static final String DOC_ENTRY_CONFIDENTIALITY_CODE = 
		"urn:uuid:f4f85eac-e6cb-4883-b524-f2705394840f";
	
	/** IHE assigned UUID for Document Entry Event Code */
	public static final String DOC_ENTRY_EVENT_CODE = 
		"urn:uuid:2c6b8cb7-8b2a-4051-b291-b1ae6a575ef4";
	
	/** IHE assigned UUID for Document Entry Format Code */
	public static final String DOC_ENTRY_FORMAT_CODE = 
		"urn:uuid:a09d5840-386c-46f2-b5ad-9c3699a4309d";
	
	/** IHE assigned UUID for Document Entry Healthcare Facility Code */
	public static final String DOC_ENTRY_HEALTH_CARE_FACILITY_CODE = 
		"urn:uuid:f33fb8ac-18af-42cc-ae0e-ed0b0bdb91e1";
	
	/** IHE assigned UUID for Document Entry Parent Document Relationship Code */
	public static final String DOC_ENTRY_PARENT_DOCUMENT_RELATIONSHIP_CODE = 
		"urn:uuid:abd807a3-4432-4053-87b4-fd82c643d1f3";
	
	/** IHE assigned UUID for Document Entry Practice Setting Code */
    public static final String DOC_ENTRY_PRACTICE_SETTING_CODE = 
		"urn:uuid:cccf5598-8b07-4b77-a05e-ae952c785ead";
    
	/** IHE assigned UUID for Document Type Code */
    public static final String DOC_ENTRY_TYPE_CODE = 	 
		"urn:uuid:f0306f51-975f-434e-a61c-c59651d33983";
    
	/** IHE assigned UUID for Document Entry Unique Id */
	public static final String DOC_ENTRY_UNIQUE_IDENTIFICATION_SCHEME = 	 
		"urn:uuid:2e82c1f6-a085-4c72-9da3-8640a32e42ab";
	
	/** IHE assigned UUID for Document Entry Patient Id */
	public static final String DOC_ENTRY_PATIENT_IDENTIFICATION_SCHEME = 
		"urn:uuid:58a6f841-87b3-4a3e-92fd-a8ffeff98427";
	
	//XDSSubmissionSet values
	/** IHE assigned UUID for Submission Set author */
	public static final String SUBMISSON_SET_AUTHOR = 
		"urn:uuid:a7058bb9-b4e4-4307-ba5b-e3f0ab85e12d";
	
	/** IHE assigned UUID for Submission Set Object */
	public static final String SUBMISSON_SET_OBJECT = 
		"urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd";
	
	/** IHE assigned UUID for Submission Set Content Type Code */
    public static final String SUBMISSION_SET_CONTENT_TYPE_CODE = 
		"urn:uuid:aa543740-bdda-424e-8c96-df4873be8500";
    
    /** IHE assigned UUID for Submission Set Source ID */
	public static final String SUBMISSION_SET_SOURCE_IDENTIFICATION_SCHEME = 
		"urn:uuid:554ac39e-e3fe-47fe-b233-965d2a147832";
	
	/** IHE assigned UUID for Submission Set Unique Id */
	public static final String SUBMISSION_SET_UNIQUE_IDENTIFICATION_SCHEME = 
		"urn:uuid:96fdda7c-d067-4183-912e-bf5ee74998a8";
	//	 old version - XDS 2004
	/*
	public static final String SUBMISSION_SET_UNIQUE_IDENTIFICATION_SCHEME = 
		"urn:uuid:4b052cba-b03b-4233-8b27-e8d5e3f8d3e4";*/
	
	/** IHE assigned UUID for Submission Set Patient Id */
	public static final String SUBMISSION_SET_PATIENT_IDENTIFICATION_SCHEME = 
		"urn:uuid:6b5aea1a-874d-4603-a4bc-96a0a7b38446";
	
	//XDSFolder/values
	/** IHE assigned UUID for Folder Object */
	public static final String FOLDER_OBJECT = 
		"urn:uuid:d9d542f3-6cc4-48b6-8870-ea235fbc94c2";
	
	/** IHE assigned UUID for Folder Code */
	public static final String FOLDER_CODE = 
		"urn:uuid:1ba97051-7806-41a8-a48b-8fce7af683c5";
	
	/** IHE assigned UUID for Folder Unique Id */
	public static final String FOLDER_UNIQUE_IDENTIFICATION_SCHEME = 
		"urn:uuid:75df8f67-9973-4fbe-a900-df66cefecc5a";
	//	 old version - XDS 2004
	/*
	public static final String FOLDER_UNIQUE_IDENTIFICATION_SCHEME = 
		"urn:uuid:f64ffdf0-4b97-4e06-b79f-a52b38ec2f8a";	
	*/
	/** IHE assigned UUID for Folder Patient ID */
	public static final String FOLDER_PATIENT_IDENTIFICATION_SCHEME = 
		"urn:uuid:f64ffdf0-4b97-4e06-b79f-a52b38ec2f8a";
	
	
	//Additional Structures values
	/** IHE assigned Name for Has Member Association */
	public static final String HAS_MEMBER = "HasMember";
	
	//uuid for "HasMember, needed in the ObjectRef declaration, but not used
	// in the "HasMember" association
	/** IHE assigned UUID for Has Member Association */
	public static final String HAS_MEMBER_UUID = 
		"urn:uuid:2d03bffb-f426-4830-8413-bab8537a995b"; 

}
