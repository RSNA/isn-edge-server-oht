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

package org.openhealthtools.ihe.pix.source;


import java.io.ByteArrayInputStream;

import org.apache.log4j.Logger;
import org.eclipse.ohf.hl7v2.core.conformance.model.CPConformanceProfile;
import org.eclipse.ohf.hl7v2.core.definitions.model.VersionDefnList;
import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.ParsingOptions;
import org.eclipse.ohf.hl7v2.core.message.formats.Formats;
import org.eclipse.ohf.hl7v2.core.message.model.Item;
import org.eclipse.ohf.hl7v2.core.utilities.CPMessageBuilder;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.common.hl7v2.message.HL7_Constants;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessage;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;

/**
 * <p>PIX/PDQ Client PIX Source HL7 Generic ADT Message</p> 
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class PixMsgADT extends PixPdqMessage {

	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////

	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(PixMsgADT.class);
         
    /**
     * MessageFactory
     */
    private MessageManager globalFactory;
       
    /**
     * CPConformanceProfile for Validation
     */
    private CPConformanceProfile cpProfile;
    
    /**
     * IHE PixQuery Referenced Standard
     */
    private int version = VersionDefnList.hv231;
    
    /**
	 * Constructs a PIX Source Client ADT message object enabled for validation.
	 * INTERNAL CONSTRUCTOR ONLY - use PixSource.admitInpatient(patientId, namespaceId, universalId, universalIdType); 
	 *                                 PixSource.registerOutpatient(patientId);
	 *                                 PixSource.preadmitInpatient(patientId);
	 *                                 PixSource.updatePatient(patientId, patientClass);
	 *                                 PixSource.mergePatient(patientId, patientClass, priorId);
	 * @param globalFactory - message manager from hl7v2.core
	 * @param cpProfile - conformance profile for validation (ex. resources > conf > ADT-A04(register outpatient).XML)
	 * @param version - hl7 version for message
	 * @param msgEventType - transaction (A01, A04, A05, A08, A40)
	 * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType)
	 * @throws PixSourceException
	 */
	public PixMsgADT(MessageManager globalFactory, CPConformanceProfile cpProfile, int version, String msgEventType, String patientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
		nodeType = Item.NODE_TYPE_MESSAGE;
		this.globalFactory = globalFactory;
		this.cpProfile = cpProfile;
		this.version = version;
		createFeedMsg(msgEventType, patientId, namespaceId, universalId, universalIdType);
	}
	
	/**
	 * INTERNAL CONSTRUCTOR ONLY - ihe bridge pixImportv2 support
	 * 
	 * @param globalFactory - message manager from hl7v2.core
	 * @param cpProfile  - conformance profile for validation (ex. resources > conf > ADT-A04(register outpatient).XML)
	 * @param hl7
	 * @throws PixSourceException
	 */
	public PixMsgADT(MessageManager globalFactory, CPConformanceProfile cpProfile, String hl7) throws PixSourceException {
		nodeType = Item.NODE_TYPE_MESSAGE;
		this.globalFactory = globalFactory;
		this.cpProfile = cpProfile;
		createFeedMsg(hl7);
	}
	
	/**
	 * INTERNAL CONSTRUCTOR ONLY - ihe pam support
	 * 
	 * @param globalFactory - message manager from hl7v2.core
	 * @param cpProfile  - conformance profile for validation
	 * @param hl7
	 * @throws PixSourceException
	 */
	public PixMsgADT(MessageManager globalFactory, CPConformanceProfile cpProfile) throws PixSourceException {
		nodeType = Item.NODE_TYPE_MESSAGE;
		this.globalFactory = globalFactory;
		this.cpProfile = cpProfile;
	}
	
	
	////////////////////
	// PUBLIC METHODS //
	////////////////////
	
	/**
	 * PID-3 Patient ID (internal)
	 * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType)
	 * @throws PixSourceException
	 */
	public void addOptionalPatientId(String patientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
		
		try {
			setField(PID_3_1, patientId);
			if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType)) {
				setField(PID_3_4_1, namespaceId);
				setField(PID_3_4_2, universalId);
				setField(PID_3_4_3, universalIdType);
			} else {
				throw new PixSourceException("PixMsgADT: changeDefaultSendingApplication - "  + namespaceId + ", " + universalId + ", " + universalIdType + " invalid parameter combination ");
			}
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientId ");
		}
	}
	
	/**
	 * PID-5-1 Patient Name - Family Name
	 * @param familyName
	 * @throws PixSourceException
	 */
	public void addOptionalPatientNameFamilyName(String familyName) throws PixSourceException {
		
		try {
			setField(PID_5_1_1, familyName);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientNameFamilyName ");
		}
	}
	
	/**
	 * PID-5-2 Patient Name - Given Name
	 * @param givenName
	 * @throws PixSourceException
	 */
	public void addOptionalPatientNameGivenName(String givenName) throws PixSourceException {
		
		try {
			setField(PID_5_2, givenName);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientNameGivenName ");
		}
	}
	
	/**
	 * PID-5-3 Patient Name - Other Name
	 * @param otherName
	 * @throws PixSourceException
	 */
	public void addOptionalPatientNameOtherName(String otherName) throws PixSourceException {
		
		try {
			setField(PID_5_3, otherName);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientNameOtherName ");
		}
	}
	
	/**
	 * PID-5-4 Patient Name - Suffix
	 * @param suffix
	 * @throws PixSourceException
	 */
	public void addOptionalPatientNameSuffix(String suffix) throws PixSourceException {
		
		try {
			setField(PID_5_4, suffix);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientNameSuffix ");
		}
	}
	
	/**
	 * PID-5-5 Patient Name - Prefix
	 * @param prefix
	 * @throws PixSourceException
	 */
	public void addOptionalPatientNamePrefix(String prefix) throws PixSourceException {
		
		try {
			setField(PID_5_5, prefix);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientNamePrefix ");
		}
	}
	
	/**
	 * PID-5-6 Patient Name - Degree
	 * @param degree
	 * @throws PixSourceException
	 */
	public void addOptionalPatientNameDegree(String degree) throws PixSourceException {
		
		try {
			setField(PID_5_6, degree);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientNameDegree ");
		}
	}
	
	/**
	 * PID-6-1 Patient Mothers Maiden Family Name - Family Name
	 * @param familyName
	 * @throws PixSourceException
	 */
	public void addOptionalPatientMothersMaidenFamilyName(String familyName) throws PixSourceException {
		
		try {
			setField(PID_6_1_1, familyName);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientMothersMaidenFamilyName ");
		}
	}
	
	/**
	 * PID-6-2 Patient Mothers Maiden Given Name - Given Name
	 * @param givenName
	 * @throws PixSourceException
	 */
	public void addOptionalPatientMothersMaidenGivenName(String givenName) throws PixSourceException {
		
		try {
			setField(PID_6_2, givenName);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientMothersMaidenGivenName ");
		}
	}
	
	/**
	 * PID-6-3 Patient Mothers Maiden Other Name - Other Name
	 * @param otherName
	 * @throws PixSourceException
	 */
	public void addOptionalPatientMothersMaidenOtherName(String otherName) throws PixSourceException {
		
		try {
			setField(PID_6_3, otherName);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientMothersMaidenOtherName ");
		}
	}
	
	/**
	 * PID-7 Date/Time of Birth
	 * @param dob
	 * @throws PixSourceException
	 */
	public void addOptionalPatientDateOfBirth(String dob) throws PixSourceException {
		
		try {
			setField(PID_7_1, dob);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientDateOfBirth ");
		}
	}
	
	/**
	 * PID-8 Administrative Sex
	 * @param sex
	 * @throws PixSourceException
	 */
	public void addOptionalPatientSex(String sex) throws PixSourceException {
		
		try {
			setField(PID_8, sex);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientSex ");
		}
	}
	
	/**
	 * PID-11-1 Patient Address - Street Address
	 * @param address
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressStreetAddress(String address) throws PixSourceException {
		
		try {
			setField(PID_11_1_1, address);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressStreetAddress ");
		}
	}
	
	/**
	 * PID-11-2 Patient Address - Other Designation
	 * @param address
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressOtherDesignation(String address) throws PixSourceException {
		
		try {
			setField(PID_11_2, address);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressOtherDesignation ");
		}
	}
	
	/**
	 * PID-11-3 Patient Address - City
	 * @param city
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressCity(String city) throws PixSourceException {
		
		try {
			setField(PID_11_3, city);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressCity ");
		}
	}
	
	/**
	 * PID-11-4 Patient Address - State or Province
	 * @param stateOrProvince
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressStateOrProvince(String stateOrProvince) throws PixSourceException {
		
		try {
			setField(PID_11_4, stateOrProvince);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressStateOrProvince ");
		}
	}
	
	/**
	 * PID-11-5 Patient Address - Zip or Postal Code
	 * @param zipOrPostalCode
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressZipOrPostalCode(String zipOrPostalCode) throws PixSourceException {
		
		try {
			setField(PID_11_5, zipOrPostalCode);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressZipOrPostalCode ");
		}
	}
	
	/**
	 * PID-11-6 Patient Address - Country
	 * @param country
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressCountry(String country) throws PixSourceException {
		
		try {
			setField(PID_11_6, country);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressCountry ");
		}
	}

	/**
	 * PID-11-7 Patient Address - Address Type
	 * @param type
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressType(String type) throws PixSourceException {
		
		try {
			setField(PID_11_7, type);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressType ");
		}
	}
	
	/**
	 * PID-11-8 Patient Address - Other Geographic Designation
	 * @param otherDesignation
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressOtherGeographicDesignation(String otherDesignation) throws PixSourceException {
		
		try {
			setField(PID_11_8, otherDesignation);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressOtherGeographicDesignation ");
		}
	}	
	
	/**
	 * PID-11-9 Patient Address - County or Parish Code
	 * @param countyParishCode
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressCountyParishCode(String countyParishCode) throws PixSourceException {
		
		try {
			setField(PID_11_9, countyParishCode);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressCountyParishCode ");
		}
	}
	
	/**
	 * PID-11-10 Patient Address - Census Tract
	 * @param censusTract
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAddressCensusTract(String censusTract) throws PixSourceException {
		
		try {
			setField(PID_11_10, censusTract);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientAddressCensusTract ");
		}
	}
	
	/**
	 * PID-13-1 Home Phone Unformatted
	 * @param homePhone
	 * @throws PixSourceException
	 */
	public void addOptionalPatientPhoneHomeUnformattedTelephoneNumber(String homePhone) throws PixSourceException {
		
		try {
			setField(PID_13_1, homePhone);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientPhoneHome ");
		}
	}
	
	/**
	 * PID-14-1 Business Phone Unformatted
	 * @param businessPhone
	 * @throws PixSourceException
	 */
	public void addOptionalPatientPhoneBusinessUnformattedTelephoneNumber(String businessPhone) throws PixSourceException {
		
		try {
			setField(PID_14_1, businessPhone);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientPhoneBusiness ");
		}
	}
	
	/**
	 * PID-18 Patient Account Number
	 * @param accountNumberId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType)
	 * @throws PixSourceException
	 */
	public void addOptionalPatientAccountNumberId(String accountNumberId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
		
		try {
			if ((accountNumberId != null) && (accountNumberId.length() > 0)) {
				setField(PID_18_1, accountNumberId);
				if ((PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType))) {
					setField(PID_18_4_1, namespaceId);
					setField(PID_18_4_2, universalId);
					setField(PID_18_4_3, universalIdType);
				}
			}
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addQueryPatientAccountNumberId ");
		}
	}
	
	/**
	 * PID-24 Patient Multiple Birth Indicator (Y/N)
	 * @param mulitpleBirthIndicator
	 * @throws PixSourceException
	 */
	public void addOptionalPatientMultipleBirthIndicator(String mulitpleBirthIndicator) throws PixSourceException {
		
		try {
			setField(PID_24, mulitpleBirthIndicator);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientMultipleBirthIndicator ");
		}
	}
	
	/**
	 * PID-25 Patient Birth Order Number
	 * @param birthOrderNumber
	 * @throws PixSourceException
	 */
	public void addOptionalPatientBirthOrder(String birthOrderNumber) throws PixSourceException {
		
		try {
			setField(PID_25, birthOrderNumber);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgADT: addOptionalPatientBirthOrder ");
		}
	}
	
	
	/////////////////////
	// PRIVATE METHODS //
	/////////////////////
	
	/**
	 * Set ADT message defaults
	 * @param msgEventType - transaction (A01, A04, A05, A08, A40)
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType)
	 * @throws PixSourceException
	 */
	private void createFeedMsg(String msgEventType, String patientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
		
		if (logger.isDebugEnabled()) {
			logger.debug("PixFeedMsg: createFeedMsg - Entry ");
		}
		
		if ((patientId == null) || (patientId.length() <= 0)) {
			logger.error("PixMsgADT: createFeedMsg - required patientId empty");
			throw new PixSourceException("PixMsgADT: createFeedMsg - required patientId empty");
		}
				
		try {
			//initialize message object
			clear();
			if (globalFactory != null) {
				setDefinitions(globalFactory.getVersionDefinitions());
			}
			setVersion(version);
			setEvent(msgEventType);
			setMessageType(HL7_Constants.MSH_9_1_PIXS);
			if (msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A40)) {
				setStructId(HL7_Constants.MSH_9_3_PIXS_A40);
			} else {
				setStructId(HL7_Constants.MSH_9_3_PIXS);   //eventTypes: A01, A04, A05, A08
			}
			addMSHFromFields();
			
			//define message segments (MSH added with earlier set statements)
			getSegments().add(EVN);
			getSegments().add(PID);
			
			//Default constant values from conformance profile as a config file
			if (cpProfile != null) {
				CPMessageBuilder builder = new CPMessageBuilder();
				builder.build(version, cpProfile.getInteractions().itemInteraction(0).getStaticDefinition(), true, this);
				
				// validate assigning authority if coming from conformance profile
				String cpNamespaceId = this.getField(PID_3_4_1);
				String cpUniversalId = this.getField(PID_3_4_2);
				String cpUniversalIdType = this.getField(PID_3_4_3);
				logger.debug("PixFeedMsg: cp assigningAuthority " + cpNamespaceId + ", " + cpUniversalId + ", " + cpUniversalIdType);
				
				if (((cpNamespaceId != null) && (cpNamespaceId.length() > 0)) || 
						((cpUniversalId != null) && (cpUniversalId.length() > 0)) ||
						((cpUniversalIdType != null) && (cpUniversalIdType.length() > 0))) {
					if (PixPdqMessageUtilities.isHDParamValid(cpNamespaceId, cpUniversalId, cpUniversalIdType) == false) {
						throw new PixSourceException("PixMsgADT: createFeedMsg - patientId cp assigning authority invalid");
					}
					setField(PID_3_1, patientId);
				}
				
				// support user override of conformance profile
				if (((namespaceId != null) && (namespaceId.length() > 0)) ||
						((universalId != null) && (universalId.length() > 0)) || 
						((universalIdType != null) && (universalIdType.length() > 0))) {
					if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType) == false) {
						throw new PixSourceException("PixMsgADT: createFeedMsg - patientId assigning authority invalid");
					}
					setField(PID_3_1, patientId);
					setField(PID_3_4_1, namespaceId);
					setField(PID_3_4_2, universalId);
					setField(PID_3_4_3, universalIdType);
					
					logger.debug("PixMsgADT: createFeedMsg - patientId cp assigning authority overridden with local parameters");
				}
			} else {
				if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType) == false) {
					throw new PixSourceException("PixMsgADT: createFeedMsg - required patientId namespace invalid");
				}
				setField(PID_3_1, patientId);
				setField(PID_3_4_1, namespaceId);
				setField(PID_3_4_2, universalId);
				setField(PID_3_4_3, universalIdType);
			}
			
			//field fixed for pix source feed
			setField(MSH_12, VersionDefnList.display(version));
			
			String dateTime = PixPdqMessageUtilities.getCurrentDateTimeString();
			setField(MSH_7, dateTime);
			setNonNullElement(EVN_2_1, dateTime);
			
			setNonNullElement(MSH_10, PixPdqMessageUtilities.getRandomFieldValue(20));
			setNonNullElement(MSH_11_1, MSH_11_1_PRODUCTION);
			setNonNullElement(MSH_18_1, MSH_18_1_ASCII);

			//populate patientClass
			//if msgEventType A08 or A40 the message object is responsible for populating
			//based on user input
			//segment PV1 may exist if created through the conformance profile
			if ((msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A01)) || (msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A05))) {
				if (getSegments().countByCode(PV1) < 1) {
					getSegments().add(PV1);
				}
				setField(PV1_2, PV1_2_INPATIENT); //inpatient
			} else if (msgEventType.equals(HL7_Constants.MSH_9_2_PIXS_A04)) {
				if (getSegments().countByCode(PV1) < 1) {
					getSegments().add(PV1);
				}
				setField(PV1_2, PV1_2_OUTPATIENT); //outpatient
			} 	
		} catch (HL7V2Exception e) {
			logger.error("PixMsgADT: createFeedMsg - HL7V2Exception " + e.getLocalizedMessage());
			throw new PixSourceException(e);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
		
		if (logger.isDebugEnabled()) {
			try {
				logger.debug("PixMsgADT: createFeedMsg \r" + PixPdqMessageUtilities.msgToString(this));
			} catch (PixPdqMessageException e) {
				logger.debug("PixMsgADT: createFeedMsg \r");
			}
		}
	}
	
	/**
	 * Create PixMsgADT message object from HL7v2 String
	 * @param hl7
	 * @throws PixSourceException
	 */
	private void createFeedMsg(String hl7) throws PixSourceException {
		if (logger.isDebugEnabled()) {
			logger.debug("PixFeedMsg: createFeedMsg - Entry ");
		}
		
		if ((hl7 == null) || (hl7.length() <= 0)) {
			logger.error("PixMsgADT: createFeedMsg - required hl7 string empty");
			throw new PixSourceException("PixMsgADT: createFeedMsg - required hl7 string empty");
		}
				
		try {
			clear();
			if (globalFactory != null) {
				setDefinitions(globalFactory.getVersionDefinitions());
				ByteArrayInputStream inStream = new ByteArrayInputStream(hl7.getBytes());
		    	ParsingOptions pOptions = new ParsingOptions();
		    	globalFactory.createMessage();
				pOptions.setFormat(Formats.hfVerticalBar);
				globalFactory.load(inStream, this, pOptions);
			}
		} catch (HL7V2Exception e) {
			logger.error("PixMsgADT: createFeedMsg - HL7V2Exception " + e.getLocalizedMessage());
			throw new PixSourceException(e);
		}
		if (logger.isDebugEnabled()) {
			try {
				logger.debug("PixMsgADT: createFeedMsg \r" + PixPdqMessageUtilities.msgToString(this));
			} catch (PixPdqMessageException e) {
				logger.debug("PixMsgADT: createFeedMsg \r");
			}
		}
	}
	
}
