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

package org.openhealthtools.ihe.common.hl7v2.message;

public interface HL7_Constants {

	
	////////////////////////////////////////
	// SEGMENT DSC - CONTINUATION POINTER //
	////////////////////////////////////////

	//Segment DSC - Continuation pointer
	public static final String DSC = "DSC";
	
	//Continuation pointer
	public static final String DSC_1 = "DSC-1";

	//Continuation style
	public static final String DSC_2 = "DSC-2";
	
	
	/////////////////////////
	// SEGMENT ERR - ERROR //
	/////////////////////////
	
	//Segment ERR - Error
	public static final String ERR = "ERR";
	
	
	//////////////////////////////
	// SEGMENT EVN - EVENT TYPE //
	//////////////////////////////
	
	//Segment EVN - Event type
	public static final String EVN = "EVN";
	
	//Event date/time
	public static final String EVN_2_1 = "EVN-2-1";
	
	
	/////////////////////////////////
	// SEGMENT MRG - MERGE PATIENT //
	/////////////////////////////////
	
	//Segment MRG - Merge patient
	public static final String MRG = "MRG";
	
	//Merge patient ID - id, namespaceId, universalId, universalIdType
	public static final String MRG_1_1 = "MRG-1-1";
	public static final String MRG_1_4_1 = "MRG-1-4-1";
	public static final String MRG_1_4_2 = "MRG-1-4-2";
	public static final String MRG_1_4_3 = "MRG-1-4-3";
	
	
	///////////////////////////////////////////
	// SEGMENT MSA - MESSAGE ACKNOWLEDGEMENT //
	///////////////////////////////////////////
	
	//Segment MSA - Message acknowledgement
	public static final String MSA = "MSA";
	
	
	//////////////////////////////////
	// SEGMENT MSH - MESSAGE HEADER //
	//////////////////////////////////
	
	//Segment MSH - Message header
	public static final String MSH = "MSH";

	//Sending application - namespaceId, universalId, universalIdType
	public static final String MSH_3_1 = "MSH-3-1";
	public static final String MSH_3_2 = "MSH-3-2";
	public static final String MSH_3_3 = "MSH-3-3";

	//Sending facility - namespaceId, universalId, universalIdType
	public static final String MSH_4_1 = "MSH-4-1";
	public static final String MSH_4_2 = "MSH-4-2";
	public static final String MSH_4_3 = "MSH-4-3";

	//Receiving application - namespaceId, universalId, universalIdType
	public static final String MSH_5_1 = "MSH-5-1";
	public static final String MSH_5_2 = "MSH-5-2";
	public static final String MSH_5_3 = "MSH-5-3";

	//Receiving facility - namespaceId, universalId, universalIdType
	public static final String MSH_6_1 = "MSH-6-1";
	public static final String MSH_6_2 = "MSH-6-2";
	public static final String MSH_6_3 = "MSH-6-3";

	//Message date/time
	public static final String MSH_7 = "MSH-7";

	//Message type
	public static final String MSH_9_2 = "MSH-9-2";
	
	//Message control ID
	public static final String MSH_10 = "MSH-10";

	//Message processing ID
	public static final String MSH_11_1 = "MSH-11-1";
	public static final String MSH_11_1_PRODUCTION = "P";

	//Version ID
	public static final String MSH_12 = "MSH-12";

	//Character set
	public static final String MSH_18_1 = "MSH-18-1";
	public static final String MSH_18_1_ASCII = "ASCII";
	
	//Message profile identifier (v2.5.1)
	public static final String MSH_21_1 = "MSH-21-1";
	public static final String MSH_21_2 = "MSH-21-2";
	
	
	//////////////////////////////////////////
	// SEGMENT PID - PATIENT IDENTIFICATION //
	//////////////////////////////////////////
	
	//Segment PID - Patient identification
	public static final String PID = "PID";

	//Patient identifier - id, namespaceId, univeralId, universalIdType
	public static final String PID_3_1 = "PID-3-1";
	public static final String PID_3_4_1 = "PID-3-4-1";
	public static final String PID_3_4_2 = "PID-3-4-2";
	public static final String PID_3_4_3 = "PID-3-4-3";
	public static final String PID_3_5 = "PID_3_5";

	//Patient name - family surname, given, other, suffix, prefix, degree, type
	public static final String PID_5_1_1 = "PID-5-1-1";
	public static final String PID_5_2 = "PID-5-2";
	public static final String PID_5_3 = "PID-5-3";
	public static final String PID_5_4 = "PID-5-4";
	public static final String PID_5_5 = "PID-5-5";
	public static final String PID_5_6 = "PID-5-6";
	public static final String PID_5_7 = "PID-5-7";
	
	//Patient mother's maiden name
	public static final String PID_6_1_1 = "PID-6-1-1";
	public static final String PID_6_2 = "PID-6-2";
	public static final String PID_6_3 = "PID-6-3";
	public static final String PID_6_4 = "PID-6-4";
	public static final String PID_6_5 = "PID-6-5";
	public static final String PID_6_6 = "PID-6-6";
	public static final String PID_6_7 = "PID-6-7";

	//Patient date/time birth
	public static final String PID_7_1 = "PID-7-1";

	//Patient sex
	public static final String PID_8 = "PID-8";
	
	//Patient race
	public static final String PID_10_1 = "PID-10-1";

	//Patient address - street, other, city, state, zip, country, type, designation, county, census tract
	public static final String PID_11_1_1 = "PID-11-1-1";
	public static final String PID_11_2 = "PID-11-2";
	public static final String PID_11_3 = "PID-11-3";
	public static final String PID_11_4 = "PID-11-4";
	public static final String PID_11_5 = "PID-11-5";
	public static final String PID_11_6 = "PID-11-6";
	public static final String PID_11_7 = "PID-11-7";
	public static final String PID_11_8 = "PID-11-8";
	public static final String PID_11_9 = "PID-11-9";
	public static final String PID_11_10 = "PID-11-10";

	//Patient home phone
	public static final String PID_13_1 = "PID-13-1";

	//Patient business phone
	public static final String PID_14_1 = "PID-14-1";
	
	//Patient account number - id, namespaceId, univeralId, universalIdType
	public static final String PID_18_1 = "PID-18-1";
	public static final String PID_18_4_1 = "PID-18-4-1";
	public static final String PID_18_4_2 = "PID-18-4-2";
	public static final String PID_18_4_3 = "PID-18-4-3";
	
	//Patient driver license number
	public static final String PID_20_1 = "PID-20-1";
	public static final String PID_20_2 = "PID-20-2";
	public static final String PID_20_3 = "PID-20-3";
	
	//Public health immunization registry requested fields
	public static final String PID_24 = "PID-24";			// multiple birth indicator (Y/N)
	public static final String PID_25 = "PID-25";			// birth order (number)	
	public static final String PID_33_1 = "PID-33";         // last update date
	public static final String PID_34 = "PID-34";           // last update facility
	
	
	///////////////////////////////////////////////////
	// SEGMENT PD1 - PATIENT ADDITIONAL DEMOGRAPHICS //
	///////////////////////////////////////////////////
	
	//Segment PD1 - Patient additional demographics
	public static final String PD1 = "PD1";
	
	
	/////////////////////////////////
	// SEGMENT PV1 - PATIENT VISIT //
	/////////////////////////////////
	
	//Segment PV1 - Patient visit
	public static final String PV1 = "PV1";

	//Patient class
	public static final String PV1_2 = "PV1-2";
	public static final String PV1_2_INPATIENT = "I";
	public static final String PV1_2_OUTPATIENT = "O";
	public static final String PV1_2_NOT_APPLICABLE = "N";
	
	//Assigned Patient Location - point of care, room, bed
	public static final String PV1_3_1 = "PV1-3-1";
	public static final String PV1_3_2 = "PV1-3-2";
	public static final String PV1_3_3 = "PV1-3-3";
	
	//Attending Doctor - id, name, assigningAuthority
	public static final String PV1_7_1 = "PV1-7-1";
	public static final String PV1_7_2_1_1 = "PV1-7-2-1-1";
	
	//Referring Doctor - id, name, assigningAuthority
	public static final String PV1_8_1 = "PV1-8-1";
	public static final String PV1_8_2_1_1 = "PV1-8-2-1-1";
	
	//Consulting Doctor - id, name, assigningAuthority
	public static final String PV1_9_1 = "PV1-9-1";
	public static final String PV1_9_2_1_1 = "PV1-9-2-1-1";
	
	//Hospital service
	public static final String PV1_10 = "PV1-10";
	public static final String PV1_10_MedicalService = "MED";
	public static final String PV1_10_SurgicalService = "SUR";
	public static final String PV1_10_CardiacService = "CAR";	
	
	//Admitting Doctor - id, name, assigningAuthority
	public static final String PV1_17_1 = "PV1-17-1";
	public static final String PV1_17_2_1_1 = "PV1-17-2-1-1";
	
	//Visit number
	public static final String PV1_19_1 = "PV1-19-1";
	
	
	////////////////////////////////////////////////////////
	// SEGMENT PV2 - PATIENT VISIT ADDITIONAL INFORMATION //
	////////////////////////////////////////////////////////
	
	//Segment PV2 - Patient visit additional information
	public static final String PV2 = "PV2";	
	
	
	/////////////////////////////////////////
	// SEGMENT QAK - QUERY ACKNOWLEDGEMENT //
	/////////////////////////////////////////	
	
	//Segment QAK - Query acknowledgement
	public static final String QAK = "QAK";
	
	
	//////////////////////////////////////////////
	// SEGMENT QPD - QUERY PARAMETER DEFINITION //
	//////////////////////////////////////////////	
	
	//Segment QPD - Query parameter definition
	public static final String QPD = "QPD";
	
	//Message query name - identifier, text, coding system, alt id, alt text, alt coding system
	public static final String QPD_1_1 = "QPD-1-1";
	public static final String QPD_1_2 = "QPD-1-2";
	public static final String QPD_1_3 = "QPD-1-3";
	public static final String QPD_1_4 = "QPD-1-4";
	public static final String QPD_1_5 = "QPD-1-5";
	public static final String QPD_1_6 = "QPD-1-6";
	
	//Query tag
	public static final String QPD_2 = "QPD-2";
	
	//Custom PIXC - "person identifier" - id, namespaceId, universalId, universalIdType
	public static final String QPD_3_1 = "QPD-3-1";
	public static final String QPD_3_4_1 = "QPD-3-4-1";
	public static final String QPD_3_4_2 = "QPD-3-4-2";
	public static final String QPD_3_4_3 = "QPD-3-4-3";
	
	//Custom PDQ - "what domains returned" - namespaceId, universalId, universalIdType
	public static final String QPD_8_4_1 = "QPD-8-4-1";
	public static final String QPD_8_4_2 = "QPD-8-4-2";
	public static final String QPD_8_4_3 = "QPD-8-4-3";
	
	
	//////////////////////////////////////////////
	// SEGMENT RCP - RESPONSE CONTROL PARAMETER //
	//////////////////////////////////////////////		
	
	//Segment RCP - Response control parameter
	public static final String RCP = "RCP";
	
	//Query priority
	public static final String RCP_1 = "RCP-1";
	public static final String RCP_1_IMMEDIATE = "I";
	
	//Quantity limited request
	public static final String RCP_2_1 = "RCP-2-1";
	public static final String RCP_2_2_1 = "RCP-2-2-1";
	public static final String RCP_2_2_1_RECORDS = "RD";

	
	///////////////////////////
	// IHE PIX Message Types //
	///////////////////////////
	
	public static final String MSH_9_1_PIXS = "ADT";
	public static final String MSH_9_2_PIXS_A01 = "A01";
	public static final String MSH_9_2_PIXS_A04 = "A04";
	public static final String MSH_9_2_PIXS_A05 = "A05";
	public static final String MSH_9_2_PIXS_A08 = "A08";
	public static final String MSH_9_2_PIXS_A40 = "A40";
	public static final String MSH_9_3_PIXS = "ADT_A01";
	public static final String MSH_9_3_PIXS_A40 = "ADT_A39";
	
	///////////////////////////
	// IHE PAM Message Types //
	///////////////////////////
	
	public static final String MSH_9_1_PAMS = "ADT";
	public static final String MSH_9_2_PAMS_A24 = "A24";
	public static final String MSH_9_2_PAMS_A28 = "A28";
	public static final String MSH_9_2_PAMS_A31 = "A31";
	public static final String MSH_9_2_PAMS_A37 = "A37";
	public static final String MSH_9_2_PAMS_A40 = "A40";
	public static final String MSH_9_2_PAMS_A47 = "A47";
	public static final String MSH_9_3_PAMS = "ADT_A05";
	public static final String MHS_9_3_PAMS_A24 = "ADT_A24";
	public static final String MSH_9_3_PAMS_A37 = "ADT_A37";
	public static final String MSH_9_3_PAMS_A40 = "ADT_A39";
	public static final String MSH_9_3_PAMS_A47 = "ADT_A30";
	
	
}
