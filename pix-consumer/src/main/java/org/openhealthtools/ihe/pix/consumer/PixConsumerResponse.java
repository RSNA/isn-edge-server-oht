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

package org.openhealthtools.ihe.pix.consumer;

import org.eclipse.ohf.hl7v2.core.definitions.model.VersionDefnList;
import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.model.Field;
import org.eclipse.ohf.hl7v2.core.message.model.Segment;
import org.eclipse.ohf.hl7v2.core.message.model.SegmentList;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessage;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;

/**
 * <p>QBP^Q23 Return Corresponding Identifiers</p>
 * 
 * <p>IHE HL7 Segments: MSH,MSA,[ERR],QAK,QPD,[PID]<br>
 * IHE HL7 Standard: HL7 2.5</p>
 * 
 * <p>Within PID, only PID-3 (IDs) and PID-5 (Names) are returned.</p>
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class PixConsumerResponse extends PixPdqMessage {

	
	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * Debug,Info,Error,Fatal log
	 */
    //private static Logger logger = Logger.getLogger(PixConsumerResponse.class);
      
    /**
     * Indicator that response has an optional error segment
     */
    private boolean hasERR = false;
    
    /**
     * Indicator that response has an optional patient identification segment
     */
    private boolean hasPID = false;
    
    /**
     * IHE PIX Consumer Referenced Standard
     */
    private static final int version = VersionDefnList.hv25;
    
    
	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
    /**
     * Constructs a PIX response message.
     * @param globalFactory - message manager
     * @throws PixConsumerException
     */
	public PixConsumerResponse(MessageManager globalFactory) throws PixConsumerException {
		super();
		try {
			this.setDefinitions(globalFactory.getVersionDefinitions());
			this.setVersion(version);
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
	}
	
	
	////////////////////
	// PUBLIC METHODS //
	////////////////////
	
	/**
	 * Initialize message after load finished
	 */
	public void init() {
		
		SegmentList segList = this.getSegments();
		for (int i=0; i < segList.size(); i ++) {
			if (hasERR == false && segList.item(i).getCode().compareTo(ERR) == 0) {
				hasERR = true;
			}
			else if (hasPID == false && segList.item(i).getCode().compareTo(PID) == 0) {
				hasPID = true;
			}
		}
	}
	
	/**
	 * Response contains 1 or more error segments.
	 * @return hasERR
	 */
	public boolean hasError() {
		return hasERR;
	}
	
	/**
	 * MSA-1 Acknowledgement Code
	 * This field contains an acknowledgment code, see message processing rules.
	 * AA Original mode: Application Accept 
	 *    Enhanced mode: Application acknowledgment: Accept
	 * AE Original mode: Application Error
	 *    Enhanced mode: Application acknowledgment: Error
	 * AR Original mode: Application Reject
	 *    Enhanced mode: Application acknowledgment: Reject
	 * CA Enhanced mode: Accept acknowledgment: Commit Accept
	 * CE Enhanced mode: Accept acknowledgment: Commit Error
	 * CR Enhanced mode: Accept acknowledgment: Commit Reject
	 * 
	 * @param expandString
	 * @return Acknowledgement Code (ID)
	 * @throws PixConsumerException
	 */
	public String getResponseAckCode(boolean expandString) throws PixConsumerException {

		String value = null;
		Segment seg = getSegments().getByCodeAndIndex(MSA, 1);
		int fieldIndex = 0;
		
		try {
			if (expandString) {
				value = seg.forceField(fieldIndex).getAsTableDescription();
			} else {
				value = seg.forceField(fieldIndex).getAsString();
			}
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
		return value;	
	}
	
	/**
	 * MSA-2 Message Control ID
	 * This field contains the message control ID of the message sent by the 
	 * sending system. It allows the sending system to associate this response 
	 * with the message for which it is intended.
	 * 
	 * @return ControlID (ST)
	 * @throws PixConsumerException
	 */
	public String getControlId() throws PixConsumerException {
		
		Segment seg = getSegments().getByCodeAndIndex(MSA, 1);
		int fieldIndex = 1;
		
		try {
			return seg.forceField(fieldIndex).getAsString();
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
	}
		
	/**
	 * The number of errors found in the query response using segments.
	 * @return count
	 */
	public int getErrorCountBySegment() {
		
		if (!hasERR) {
			return -1;
		}
		return getSegments().countByCode(ERR);
	}
	
	/**
	 * The number of errors found in the query response using repeats.
	 * @return count
	 */
	public int getErrorCountByRepeat() {
		
		if (!hasERR) {
			return -1;
		}
		try {
			int fieldIndex = 1;
			return getSegments().getByCodeAndIndex(ERR, 1).getFields().item(fieldIndex).getNonEmptyCount();
		} catch (HL7V2Exception e) {
			return -1;
		}
	}
	
	/**
	 * ERR-2 Error Location
	 * Identifies the location in a message related to the identified error, 
	 * warning or message. If multiple repetitions are present, the error results 
	 * from the values in a combination of places.
	 * 
	 * @param segmentIndex - the segment to use (0 to PixConsumerResponse.getErrorCountBySegment()-1)
	 *                       use 0 for primary if multiple errors reported with repeats rather than different segments
	 * @param repeatIndex -  the repetition to return (0 to PixConsumerResponse.getErrorCountByRepeat()-1)
	 *                       use 0 for primary if multiple errors reported in different segments rather than by repeat
	 * @return Error Location (ERL) 6 components*
	 *         String[0] - SegmentID
	 *         String[1] - SegmentSequence
	 *         String[2] - FieldPosition
	 *         String[3] - FieldRepetition
	 *         String[4] - ComponentNumber
	 *         String[5] - SubComponentNumber     
	 * *supports repetitions
	 * @throws PixConsumerException
	 */
	public String[] getErrorLocation(int segmentIndex, int repeatIndex) throws PixConsumerException {
		
		if (!hasERR) {
			return null;
		}
		Segment seg = getSegments().getByCodeAndIndex(ERR, segmentIndex+1);
		int fieldIndex = 1;
		
		try {
			return PixPdqMessageUtilities.getFieldComponentsInRepeat(seg, fieldIndex, repeatIndex);
		} catch (PixPdqMessageException e) {
			throw new PixConsumerException(e);
		}
	}
	
	/**
	 * ERR-3 HL7 Error Code
	 * Identifies the HL7 (communications) error code.
	 * 
	 * @param segmentIndex - the segment to use (0 to PixConsumerResponse.getErrorCountBySegment()-1)
	 *                       use 0 for primary if multiple errors reported with repeats rather than different segments
	 * @return Error Code (CWE) 7 components
	 *         String[0] - Identifier
	 *         String[1] - Text
	 *         String[2] - NameOfCodingSystem
	 *         String[3] - AlternateIdentifier
	 *         String[4] - CodingSystemVersionID
	 *         String[5] - AlternateCodingSystemVersionID
	 *         String[6] - OriginalText
	 * @throws PixConsumerException
	 */
	public String[] getErrorCode(int segmentIndex) throws PixConsumerException {
		
		if (!hasERR) {
			return null;
		}
		Segment seg = getSegments().getByCodeAndIndex(ERR, segmentIndex+1);
		int fieldIndex = 2;
		
		try {
			return PixPdqMessageUtilities.getFieldComponents(seg, fieldIndex);
		} catch (PixPdqMessageException e) {
			throw new PixConsumerException(e);
		}
	}
	
	/**
	 * ERR-4 Error Severity
	 * Identifies the severity of an application error. Knowing if something is
	 * Error, Warning or Information is intrinsic to how an application handles 
	 * the content.
	 * W warning
	 * I information
	 * E error
	 * 
	 * @param segmentIndex - the segment to use (0 to PixConsumerResponse.getErrorCountBySegment()-1)
	 *                       use 0 for primary if multiple errors reported with repeats rather than different segments
	 * @param expandString
	 * @return Error Severity (ID)
	 * @throws PixConsumerException
	 */
	public String getErrorSeverity(int segmentIndex, boolean expandString) throws PixConsumerException {
		
		if (hasERR == false) {
			return "";
		}
		String value = null;
		Segment seg = getSegments().getByCodeAndIndex(ERR, segmentIndex+1);
		int fieldIndex = 3;
		
		try {
			if (expandString) {
				value = seg.forceField(fieldIndex).getAsTableDescription();
			} else {
				value = seg.forceField(fieldIndex).getAsString();
			}
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
		return value;
	}
	
	/**
	 * QAK-2 Query Response Status
	 * This field may be valued by the initiating system to identify the query, 
	 * and may be used to match response messages to the originating query.
	 * 
	 * HL7 Table 0208 - Query Response Status (v2.5)
	 * Value Description
	 * OK    Data found, no errors (this is the default)
	 * NF    No data found, no errors
	 * AE    Application error
	 * AR    Application reject
	 * 
	 * @param expandString
	 * @return Query Status (ID)
	 * @throws PixConsumerException
	 */
	public String getQueryStatus(boolean expandString) throws PixConsumerException {
		
		String value = null;
		Segment seg = getSegments().getByCodeAndIndex(QAK, 1);
		int fieldIndex = 1;
		
		try {
			if (expandString) {
				value = seg.forceField(fieldIndex).getAsTableDescription();
			} else {
				value = seg.forceField(fieldIndex).getAsString();
			}
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
		return value;
	}  
	
	/**
	 * QPD-1 Query Name
	 * This field contains the name of the query.
	 * 
	 * @return Query Name (CE) 6 components
	 *         String[0] - Identifier
	 *         String[1] - Text
	 *         String[2] - NameOfCodingSystem
	 *         String[3] - AlternateIdentifier
	 *         String[4] - AlternateText
	 *         String[5] - AlternateCodingSystem        
	 * @throws PixConsumerException
	 */
	public String[] getQueryName() throws PixConsumerException {
		
		Segment seg = getSegments().getByCodeAndIndex(QPD, 1);
		int fieldIndex = 0;
		
		try {
			return PixPdqMessageUtilities.getFieldComponents(seg, fieldIndex);
		} catch (PixPdqMessageException e) {
			throw new PixConsumerException(e);
		}
	}
	
	/**
	 * QPD-2 Query Tag
	 * This field may be valued by the initiating system to identify the 
	 * query, and may be used to match response messages to the originating query.
	 * 
	 * @return query tag from message
	 * @throws PixConsumerException
	 */
	public String getQueryTag() throws PixConsumerException {
		
		Segment seg = getSegments().getByCodeAndIndex(QPD, 1);
		int fieldIndex = 1;
		
		try {
			return seg.forceField(fieldIndex).getAsString();
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
	}	
	
	/**
	 * The number of patients found in the query response.
	 * @return count
	 */
	public int getPatientCount() {
		
		return getSegments().countByCode(PID);
	}
	
	/**
	 * The number of patient IDs found for a patient in the query response.
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @return count of IDs for 1 patient
	 * @throws PixConsumerException
	 */
	public int getPatientIdentifierCount(int patientIndex) throws PixConsumerException {
		
		Segment seg = getSegments().getByCodeAndIndex(PID, patientIndex+1);
		int fieldIndex = 2;
		try {
			return seg.getFields().item(fieldIndex).getNonEmptyCount();
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
	}
	
	/**
	 * PID-3 Patient ID (internal)
	 * This field contains the list of identifiers (one or more) used by the healthcare 
	 * facility to uniquely identify a patient (e.g., medical record number, billing 
	 * number, birth registry, national unique individual identifier, etc).
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param identifierIndex - the ID to return (0 to PixConsumerResponse.getPatientIdentifierCount()-1)
	 * @return Patient Identifier (CX) reduced to 2 components & subcomponents
	 *         String[0] - Identifier
	 *         String[1] - AssigningAuthority namespaceId
	 *         String[2] - AssigningAuthority universalId
	 *         String[3] - assigningAuthority universalIdType
	 * @throws PixConsumerException
	 */
	public String[] getPatientIdentifier(int patientIndex, int identifierIndex) throws PixConsumerException {
		
		String values[] = new String[4];
		
		Segment seg = getSegments().getByCodeAndIndex(PID, patientIndex+1);
		int fieldIndex = 2;
		
		try {
			Field fld = seg.getFields().item(fieldIndex).getRepeat(identifierIndex);
			values[0] = fld.forceElement("1").getAsString();
			values[1] = fld.forceElement("4-1").getAsString();
			values[2] = fld.forceElement("4-2").getAsString();
			values[3] = fld.forceElement("4-3").getAsString();
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
		return values;
	}
	
	/**
	 * PID-5 Patient Name
	 * The number of patient names found for a patient in the query response.
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @return count of names for 1 patient
	 * @throws PdqConsumerException
	 */
	public int getPatientNameCount(int patientIndex) {
		
		Segment seg = getSegments().getByCodeAndIndex(PID, patientIndex+1);
		int fieldIndex = 4;
		try {
			return seg.getFields().item(fieldIndex).getNonEmptyCount();
		} catch (HL7V2Exception e) {
			return -1;
		}
	}
	
	/**
	 * PID-5-1 Patient Name
	 * This field contains the names of the patient, the primary or legal name
	 * of the patient is reported first.
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @return Patient Name (XPN) reduced to 6 components
	 *         String[0] - FamilyName
	 *         String[1] - GivenName
	 *         String[2] - MiddleName
	 *         String[3] - Suffix
	 *         String[4] - Prefix
	 *         String[5] - Degree
	 * @throws PixConsumerException
	 */
	public String[] getPatientName(int patientIndex, int patientNameIndex) throws PixConsumerException {
		
		String values[] = new String[6];
		int fieldIndex = 4;

		try {
			Field fld = getSegments().getByCodeAndIndex(PID, patientIndex+1).getFields().item(fieldIndex).getRepeat(patientNameIndex);
			values[0] = fld.forceElement("1-1").getAsString();
			values[1] = fld.forceElement("2").getAsString();
			values[2] = fld.forceElement("3").getAsString();
			values[3] = fld.forceElement("4").getAsString();
			values[4] = fld.forceElement("5").getAsString();
			values[5] = fld.forceElement("6").getAsString();
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
		return values;
	}
	
	/**
	 * PID-5-1 Patient Name - Family Name
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @return Patient Name Family Name (FN)
	 * @throws PixConsumerException
	 */
	public String getPatientNameFamilyName(int patientIndex, int patientNameIndex) throws PixConsumerException {
		
		String component = "1-1";
		return getPatientNameRepeatField(patientIndex, patientNameIndex, component);
	}
	
	/**
	 * PID-5-2 Patient Name - Given Name
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @return Patient Name Given Name (ST)
	 * @throws PixConsumerException
	 */
	public String getPatientNameGivenName(int patientIndex, int patientNameIndex) throws PixConsumerException {
		
		String component = "2";
		return getPatientNameRepeatField(patientIndex, patientNameIndex, component);
	}
	
	/**
	 * PID-5-3 Patient Name - Other Name
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @return Patient Name Second and Further Names (ST)
	 * @throws PixConsumerException
	 */
	public String getPatientNameOtherName(int patientIndex, int patientNameIndex) throws PixConsumerException {
		
		String component = "3";
		return getPatientNameRepeatField(patientIndex, patientNameIndex, component);
	}
	
	/**
	 * PID-5-4 Patient Name - Suffix
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @return Suffix (ST)
	 * @throws PixConsumerException
	 */
	public String getPatientNameSuffix(int patientIndex, int patientNameIndex) throws PixConsumerException {
		
		String component = "4";
		return getPatientNameRepeatField(patientIndex, patientNameIndex, component);
	}
	
	/**
	 * PID-5-5 Patient Name - Prefix
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @return Prefix (ST)
	 * @throws PixConsumerException
	 */
	public String getPatientNamePrefix(int patientIndex, int patientNameIndex) throws PixConsumerException {
		
		String component = "5";
		return getPatientNameRepeatField(patientIndex, patientNameIndex, component);
	}
	
	/**
	 * PID-5-6 Patient Name - Degree
	 * 
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @return Degree (IS)
	 * @throws PixConsumerException
	 */
	public String getPatientNameDegree(int patientIndex, int patientNameIndex) throws PixConsumerException {
		
		String component = "6";
		return getPatientNameRepeatField(patientIndex, patientNameIndex, component);
	}
	
	/**
	 * Return the specified patient's name by specified component.
	 * @param patientIndex - the patient to use (0 to PixConsumerResponse.getPatientCount()-1)
	 * @param patientNameIndex - the name to return (0 to PixConsumerResponse.getPatientNameCount()-1)
	 *                           the primary or legal name of the patient is reported first
	 * @param component - the patient name component
	 * @return name field
	 * @throws PixConsumerException
	 */
	private String getPatientNameRepeatField(int patientIndex, int patientNameIndex, String component) throws PixConsumerException {
		
		try {
			int fieldIndex = 4;
			Field fld = getSegments().getByCodeAndIndex(PID, patientIndex+1).getFields().item(fieldIndex).getRepeat(patientNameIndex);
			return fld.forceElement(component).getAsString();
		} catch (HL7V2Exception e) {
			throw new PixConsumerException(e);
		}
	}

}
