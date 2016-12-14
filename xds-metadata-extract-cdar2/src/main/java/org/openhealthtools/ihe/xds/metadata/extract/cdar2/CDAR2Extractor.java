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

package org.openhealthtools.ihe.xds.metadata.extract.cdar2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.openhealthtools.ihe.common.hl7v2.CX;
import org.openhealthtools.ihe.common.hl7v2.Hl7v2Factory;
import org.openhealthtools.ihe.common.hl7v2.SourcePatientInfoType;
import org.openhealthtools.ihe.common.hl7v2.XAD;
import org.openhealthtools.ihe.common.hl7v2.XCN;
import org.openhealthtools.ihe.common.hl7v2.XON;
import org.openhealthtools.ihe.common.hl7v2.XPN;
import org.openhealthtools.ihe.common.hl7v2.XTN;
import org.openhealthtools.ihe.xds.metadata.AuthorType;
import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.CodedMetadataType;
import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;
import org.openhealthtools.ihe.xds.metadata.ExtensionType;
import org.openhealthtools.ihe.xds.metadata.InternationalStringType;
import org.openhealthtools.ihe.xds.metadata.LocalizedStringType;
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.ParentDocumentType;
import org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.MetadataExtractionException;
import org.openhealthtools.ihe.xds.metadata.extract.MetadataExtractionStatus;
import org.openhealthtools.ihe.xds.metadata.impl.MetadataFactoryImpl;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.HealthCareFacility;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * Extracts XDS Document Entry Metadata from generic CDA R2 document
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class CDAR2Extractor implements DocumentEntryExtractor, DocumentEntryElementExtractor {
	
	/** Descriptor for Extractor */
	public static final String DESCRIPTOR = "CDAR2_DE_EXTR";
	
	/**
	 * logger
	 */
	private static Logger logger = Logger.getLogger(CDAR2Extractor.class);
	
	/**
	 * Map between CDA R2 Administrative Gender codes and HL7v2.5 
	 * Table 001(Administrative Sex). Keys are CDAR2 AdministrativeGender
	 * object literal string representations and values are 
	 * corresponding HL7v2.5 gender code values as strings.
	 */
	public static final HashMap ADMIN_GENDER_TABLE_001;
	static {
		ADMIN_GENDER_TABLE_001 = new HashMap();
		ADMIN_GENDER_TABLE_001.put(AdministrativeGender.M_LITERAL.getName(),
				"M");
		ADMIN_GENDER_TABLE_001.put(AdministrativeGender.F_LITERAL.getName(),
				"F");
		ADMIN_GENDER_TABLE_001.put(AdministrativeGender.UN_LITERAL.getName(),
				"O");
	}
	
	/**CDA R2 document object */
	protected ClinicalDocument cda;
	
	
	/**
	 * Loads CDA Document 
	 * @param cda the CDA R2 document to extract metadata from for the document entry metadata.
	 * Cannot be null.
	 */
	public CDAR2Extractor(ClinicalDocument cda) {
		this.cda = cda;
	}

	
	/**
	 * Entry point to invoke extraction process.
	 * <br>
	 * NOTES:
	 * <li> 1. Only the first ClinicalDocument/documentationOf instance will be
	 * considered for it's ServiceEvent time to fill values for
	 * serviceStartTime and serviceStopTime </li>
	 * <li> 2. Only the first ClinicalDocument/recordTarget instance will be considered
	 * for sourcePatientId (for which only the first
	 * patientRole/id on it's list will be taken) and sourcePatientInfo .</li>
	 * <li> 3. XDS metadata does not accept CX types that
	 * have more or fewer components than CX.1, CX.4.2,CX.4.3. Other corresponding componets
	 * will not be extracted.</li>
	 * <li> 4. XDS metadata validation for 2007 Connectathon will not accept DTM types beyond precision
	 * of YYYYMMDDHHMMSS. Precision has been truncated on values that include fractional seconds
	 * or time zone corrections </li>
	 * <li> 5. XDS metadata validation for 2007 Connectathon will not accept SourcePatientInfo
	 * beyond local patient ids, patient name, address, birthdate and gender. Other patient
	 * info in the CDA that corresponds to source patient info will not be extracted. </li>
	 */
	public DocumentEntryType extract() throws MetadataExtractionException{
		logger.info("BEGIN CDAR2Extractor.extract()");
		
		if(cda == null){
			logger.error("CDA is null, cannot execute extraction.");
			throw new MetadataExtractionException ("CDA is null, cannot execute extraction.");
		}
		
		// ***************** create target object *******************
		DocumentEntryType docEntry = MetadataFactoryImpl.eINSTANCE.createDocumentEntryType();
		
		//  ** extract authorInstitution, authorPerson,authorRole, authorSpeciality **
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.author(s)");
		}
		List <AuthorType> authors = extractAuthors();
		if(authors != null){
			docEntry.getAuthors().addAll(authors);
		}

		// ******************** extract classCode *********************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.classCode");
		}
		CodedMetadataType classCode = extractClassCode();
		if(classCode != null){
			docEntry.setClassCode(classCode);
		}
		
		// ******************** extract confidentialityCode **************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.confidentialityCode");
		}
		CodedMetadataType[] confidentialityCodes = extractConfidentialityCodes();
		if(confidentialityCodes != null){
			for(int i = 0; i < confidentialityCodes.length; i ++){
				docEntry.getConfidentialityCode().add(confidentialityCodes[i]);
			}
		}

		
		// ********************** extract creation time ************************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.creationTime");
		}
		String creationTime = extractCreationTime();
		if(creationTime != null){
			docEntry.setCreationTime(creationTime);
		}
		

		// ******** extract healthCareFacilityType and practiceSetting code ************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.healthcareFacilityCode");
		}
		CodedMetadataType hcfc = extractHealthCareFacilityTypeCode();
		if(hcfc != null){
			docEntry.setHealthCareFacilityTypeCode(hcfc);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.practiceSettingCode");
		}
		CodedMetadataType psc = extractPracticeSettingCode();
		if(psc != null){
			docEntry.setPracticeSettingCode(psc);
		}
		
		// ******************** extract languageCode ********************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.languageCode");
		}
		String langCode = extractLanguageCode();
		if(langCode != null){
			docEntry.setLanguageCode(langCode);
		}
		
		
		// ******************** extract legalAuthenticator ********************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.legalAuthenticator");
		}
		XCN legalAuth = extractLegalAuthenticator();
		if(legalAuth != null){
			docEntry.setLegalAuthenticator(legalAuth);
		}
		
		
		// ************* extract serviceStartTime and serviceStopTime ******
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.serviceStartTime");
		}
		String startTime = extractServiceStartTime();
		if(startTime != null){
			docEntry.setServiceStartTime(startTime);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.serviceStopTime");
		}
		String stopTime = extractServiceStopTime();
		if(stopTime != null){
			docEntry.setServiceStopTime(stopTime);
		}
		
				
		// ******** extract sourcePatientId and sourcePatientInfo *********
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.sourcePatientId");
		}
		CX sourcePatientId = extractSourcePatientId();
		if(sourcePatientId != null){
			docEntry.setSourcePatientId(sourcePatientId);
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.sourcePatientInfo");
		}
		SourcePatientInfoType patientInfo = extractSourcePatientInfo();
		if(patientInfo != null){
			docEntry.setSourcePatientInfo(patientInfo);
		}
		
		
		// ******************** extract title ********************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.title");
		}
		InternationalStringType title = extractTitle();
		if(title != null){
			docEntry.setTitle(title);
		}

		
		// ******************** extract typeCode ********************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.typeCode");
		}
		CodedMetadataType typeCode = extractTypeCode();
		if(typeCode != null){
			docEntry.setTypeCode(typeCode);
		}
	
		
		// ******************** extract uniqueId ********************
		if(logger.isDebugEnabled()){
			logger.debug("Extracting DocumentEntry.uniqueId");
		}
		String uniqueId = extractUniqueId();
		if(uniqueId != null){
			docEntry.setUniqueId(uniqueId);
		}
		
		logger.info("DONE");
		return docEntry;
	}
	
	/////////////////////////////////////////////////////////////////////////////
	// Implementations for DocumentEntryElementExtractor interface
	/////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Extracts the relevant authorInstitution, authorPerson, authorRole and authorSpeciality
	 * information from the author list in the CDA:
	 * <br>
	 * ClinicalDocument/author/assignedAuthor/id and
	 * <br>
	 * ClinicalDocument/author/assignedAuthor/assignedPerson/name
	 * <br>
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractAuthors()
	 */
	public List<AuthorType> extractAuthors() {
		if(!atLeastOne(cda.getAuthors())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName());
			}
			return null;
		}
		else {
			Iterator i = cda.getAuthors().iterator();
			// SEK - extractor is back to supporting multiple authors as of 10/20/2011
			List<AuthorType> authorList = new ArrayList<AuthorType>();
			while(i.hasNext()){
				Author author = (Author)i.next();
				AuthorType aut = null;
				AssignedAuthor aAuth = author.getAssignedAuthor();
				if(aAuth == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName());
					}
				}
				else{
					// make sure that we have an author person and not authoring device
					if(aAuth.getAssignedAuthoringDevice() == null){
						aut = MetadataFactory.eINSTANCE.createAuthorType();
						
						// check for author components and add
						XCN person = extractAuthorPerson(aAuth);
						if(person != null){
							logger.debug("found author person");
							aut.setAuthorPerson(person);
						}
						XON inst = extractAuthorInstitution(aAuth.getRepresentedOrganization());
						if(inst != null){
							logger.debug("found author institution");
							aut.getAuthorInstitution().add(inst);
						}	
						String role = extractAuthorRole(author.getFunctionCode());
						if(role != null){
							logger.debug("found author role");
							aut.getAuthorRole().add(role);
						}
						String speciality = extractAuthorSpeciality(aAuth.getCode());
						if(speciality != null){
							logger.debug("found author specialty");
							aut.getAuthorSpeciality().add(speciality);
						}
						logger.debug("looking for telcom in:" + aAuth.getTelecoms().toString());
						if (aAuth.getTelecoms().size() > 0){
							logger.debug("telcom not empty");
							Iterator j = aAuth.getTelecoms().iterator();
							while(j.hasNext()){
								
								XTN telcom = extractAuthorTelecommunication((TEL)j.next());
								if(telcom != null){
									logger.debug("found author telcom");
									aut.getAuthorTelecommunication().add(telcom);
								}
							}
						}
						authorList.add(aut);
					}
				}
			}// end iterator
			return authorList;
		}// end else
	}


	/**
	 * CDA R2 document header does not contain information corresponding to availablity status metadata.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractAvailabilityStatus()
	 */
	public AvailabilityStatusType extractAvailabilityStatus() {
		logger.info("CDA R2 document header does " +
				"not contain information corresponding to availablity status metadata.");
		return null;
	}

	/**
	 * Extracts the relevant classCode
	 * information from the CDA: ClinicalDocument/code. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR.
	 * <br>
	 * Note: typeCode and classCode data sources are the same in the CDA
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractClassCode()
	 */
	public CodedMetadataType extractClassCode() {
		if(cda.getCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/code");
			}
			return null;
		}

		if(cda.getCode().getCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/code@code");
			}
		}
		if(cda.getCode().getDisplayName() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/code@displayName");
			}
		}
		if(cda.getCode().getCodeSystemName() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/code@codeSchemeName");
			}
		}
		CodedMetadataType code = map(cda.getCode());
		return code;
	}


	/**
	 * CDA R2 document header does not contain information corresponding to comments metadata.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractComments()
	 */
	public InternationalStringType extractComments() {
		logger.info("CDA R2 document header does " +
			"not contain information corresponding to comments metadata.");
		return null;
	}

	/**
	 * Extracts the relevant confidentialityCodes
	 * information from the CDA: ClinicalDocument/confidentialityCode. 
	 * Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractConfidentialityCode()
	 */
	public CodedMetadataType[] extractConfidentialityCodes() {
		if(cda.getConfidentialityCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/confidentialityCode");
			}
			return null;
		}

		if(cda.getConfidentialityCode().getCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/confidentialityCode@code");
			}
		}
		if(cda.getConfidentialityCode().getDisplayName() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/confidentialityCode@displayName");
			}
		}
		if(cda.getConfidentialityCode().getCodeSystemName() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/confidentialityCode@codeSchemeName");
			}
		}
		CodedMetadataType code = map(cda.getConfidentialityCode());
		return new CodedMetadataType[]{code};
	}

	/**
	 * Extracts the relevant creationTime
	 * information from the CDA: ClinicalDocument/effectiveTime.
	 * This time is to be in UTC, but without the timezone offset or fractional seconds: 
	 * [[[[[YYYY]MM]DD]HH]mm]ss]. Thus, this time is assumed to be in GMT. So, if the 
	 * timestamp in the corresponding CDA element contains the timezone offset, 
	 * this method will convert the timestamp to GMT. If the timezone offset is ommitted, 
	 * then the timestamp is assumed to be in GMT. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractCreationTime()
	 */
	public String extractCreationTime() {
		if(cda.getEffectiveTime() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/effectiveTime");
			}
			return null;
		}

		if(cda.getEffectiveTime().getValue() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/effectiveTime@value");
			}
			return null;
		}
		else{
			return map(cda.getEffectiveTime());
		}		
	}


	/**
	 * DocumentEntry.entryUUID is an XDS specific attribute and outside the scope of any 
	 * CDA R2 document. Thus, it cannot be extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractEntryUUID()
	 */
	public String extractEntryUUID() {
		logger.info("DocumentEntry.entryUUID " +
			"is an XDS specific attribute and outside the scope of any CDA R2 document. \nThus, it cannot be" +
			" extracted.");
		return null;
	}

	/**
	 * This extraction routine, at this point, 
	 * does not attempt to extract event code metadata from a generic CDA R2 document.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractEventCodes()
	 */
	public CodedMetadataType[] extractEventCodes() {
		logger.info("This extraction routine, at this point," +
			"does not attempt to extract event code metadata from a generic CDA R2 document.");
		return null;
	}
	
	/**
	 * This extraction routine, at this point, 
	 * does not attempt to extract extension metadata from a generic CDA R2 document.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractExtensionss()
	 */
	public ExtensionType[] extractExtensions() {
		logger.info("This extraction routine, at this point," +
			"does not attempt to extract extension metadata from a generic CDA R2 document.");
		return null;
	}


	/**
	 * DocumentEntry.formatCode is an XDS specific attribute and outside the scope of 
	 * any CDA R2 document. Thus, it cannot be extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractFormatCode()
	 */
	public CodedMetadataType extractFormatCode() {
		logger.info("DocumentEntry.formatCode " +
			"is an XDS specific attribute and outside the scope of any CDA R2 document. \nThus, it cannot be" +
			" extracted.");
		return null;
	}

	/**
	 * DocumentEntry.hash is a comptuted value and outside the scope of any 
	 * CDA R2 document. Thus, it cannot be extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractHash()
	 */
	public String extractHash() {
		logger.info("DocumentEntry.hash " +
				"is a comptuted value and outside the scope of any CDA R2 document. \nThus, it cannot be" +
				" extracted.");
		return null;
	}

	/**
	 * Extracts the relevant healthcareFacilityTypeCode
	 * information from the CDA: ClinicalDocument/componentOf/encompassingEncounter/location/code. 
	 * Per the CDA specification this code, when present shall be consistent with ClinicalDocument/code.
	 * Thus, implementation consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. 
	 * <br>
	 * Note: healthcareFacilityTypeCode and practiceSettingCode data sources are the same in the CDA
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractHealthCareFacilityTypeCode()
	 */
	//FIXME Implementation ALMOST consistent with PCC TF-2 Medical Document Binding 
    //* to XDS, XDM and XDR.
	public CodedMetadataType extractHealthCareFacilityTypeCode() {
		if(cda.getComponentOf() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					Component1.class.getName());
			}
		}
		else if (cda.getComponentOf().getEncompassingEncounter() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					Component1.class.getName() + "/ " + 
					EncompassingEncounter.class.getName());
			}
		}
		else if (cda.getComponentOf().getEncompassingEncounter().getLocation() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					Component1.class.getName() + "/ " + 
					EncompassingEncounter.class.getName() + "/ " + 
					Location.class.getName());
			}
		}
		else if(cda.getComponentOf().getEncompassingEncounter().getLocation().getHealthCareFacility() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					Component1.class.getName() + "/ " + 
					EncompassingEncounter.class.getName() + "/ " + 
					Location.class.getName() + "/ " + 
					HealthCareFacility.class.getName());
			}
		}
		else if(cda.getComponentOf().getEncompassingEncounter().getLocation().getHealthCareFacility().getCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					Component1.class.getName() + "/ " + 
					EncompassingEncounter.class.getName() + "/ " + 
					Location.class.getName() + "/ " + 
					HealthCareFacility.class.getName() +"/code");
			}
		}
		else{
			CE facility = cda.getComponentOf().getEncompassingEncounter().getLocation().getHealthCareFacility().getCode();
			if(facility.getCode() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						Component1.class.getName() + "/ " + 
						EncompassingEncounter.class.getName() + "/ " + 
						Location.class.getName() + "/ " + 
						HealthCareFacility.class.getName()+ "/code@code)");
				}
			}
			if(facility.getDisplayName() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						Component1.class.getName() + "/ " + 
						EncompassingEncounter.class.getName() + "/ " + 
						Location.class.getName() + "/ " + 
						HealthCareFacility.class.getName()+ "/code@displayName)");
				}
			}
			if(facility.getCodeSystemName() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						Component1.class.getName() + "/ " + 
						EncompassingEncounter.class.getName() + "/ " + 
						Location.class.getName() + "/ " + 
						HealthCareFacility.class.getName()+ "/code@codeSchemeName)");
				}
			}
			CodedMetadataType code = map(facility);
			return code;
		}
		return null;
	}

	/**
	 * Extracts the relevant languageCode
	 * information from the CDA: ClinicalDocument/languageCode
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractLanguageCode()
	 */
	public String extractLanguageCode() {
		if(cda.getLanguageCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/languageCode");
			}
			return null;
		}
		if(cda.getLanguageCode().getCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/languageCode@code");
			}
		}
		return cda.getLanguageCode().getCode();
	}

	/**
	 * Extracts the relevant legalAuthenticator
	 * information from the CDA: ClinicalDocument/legalAuthenticator/assignedEntity/id and
	 * ClinicalDocument/legalAuthenticator/assignedEntity/assignedPerson/name
	 * <br>
	 * NOTES:
	 * <li> 1. Only the first ClinicalDocument/legalAuthenticator/assignedEntity/id instance
	 * and first ClinicalDocument/legalAuthenticator/assignedEntity/assignedPerson/name instance will be
	 * considered for values for the legal authenticator XCN </li>
	 * <li> 2. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR.
	 * </li>
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractLanguageCode()
	 */
	public XCN extractLegalAuthenticator() {
		if(cda.getLegalAuthenticator() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						LegalAuthenticator.class.getName());
			}
			return null;
		}
		else if(cda.getLegalAuthenticator().getAssignedEntity() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						LegalAuthenticator.class.getName()+ "/ " + 
						AssociatedEntity.class.getName());
			}
			return null;
		}
		else{
			AssignedEntity auth = cda.getLegalAuthenticator().getAssignedEntity();
			boolean idNull = false;
			
			// XCN.1, XCN.9.1, XCN.9.2
			if(!atLeastOne(auth.getIds())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							LegalAuthenticator.class.getName()+ "/ " + 
							AssociatedEntity.class.getName()+ "/ id");
				}
				idNull = true;
			}
			else {
				if(((II)auth.getIds().get(0)).getRoot() == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							LegalAuthenticator.class.getName()+ "/ " + 
							AssociatedEntity.class.getName()+ "/ id@root");
					}
				}
				if(((II)auth.getIds().get(0)).getExtension() == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							LegalAuthenticator.class.getName()+ "/ " + 
							AssociatedEntity.class.getName()+ "/ id@extension");
					}
				}
				if(((II)auth.getIds().get(0)).getAssigningAuthorityName() == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							LegalAuthenticator.class.getName()+ "/ " + 
							AssociatedEntity.class.getName()+ "/ id@assigningAuthorityName");
					}
				}
			}
			//	XCN.2 through XCN.6
			if(auth.getAssignedPerson() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							LegalAuthenticator.class.getName()+ "/ " + 
							AssociatedEntity.class.getName()+ "/ " + 
							Person.class.getName());
				}
				if(idNull){
					return null;
				}
				return map((II)auth.getIds().get(0), null);
			}
			else if(!atLeastOne(auth.getAssignedPerson().getNames())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							LegalAuthenticator.class.getName()+ "/ " + 
							AssociatedEntity.class.getName()+ "/ " + 
							Person.class.getName()+ "/name ");
				}
				if(idNull){
					return null;
				}
				return map((II)auth.getIds().get(0), null);
			}
			else{
				if(!atLeastOne(((PN)auth.getAssignedPerson().getNames().get(0)).getFamilies())){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								LegalAuthenticator.class.getName()+ "/ " + 
								AssociatedEntity.class.getName()+ "/ " + 
								Person.class.getName()+ "/name/family ");
					}
				}
				if(!atLeastOne(((PN)auth.getAssignedPerson().getNames().get(0)).getGivens())){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								LegalAuthenticator.class.getName()+ "/ " + 
								AssociatedEntity.class.getName()+ "/ " + 
								Person.class.getName()+ "/name/given ");
					}
				}
				if(!atLeastOne(((PN)auth.getAssignedPerson().getNames().get(0)).getPrefixes())){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								LegalAuthenticator.class.getName()+ "/ " + 
								AssociatedEntity.class.getName()+ "/ " + 
								Person.class.getName()+ "/name/prefix ");
					}
				}
				if(!atLeastOne(((PN)auth.getAssignedPerson().getNames().get(0)).getSuffixes())){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								LegalAuthenticator.class.getName()+ "/ " + 
								AssociatedEntity.class.getName()+ "/ " + 
								Person.class.getName()+ "/name/suffix ");
					}
				}
				if(idNull){
					return map(null, (PN)auth.getAssignedPerson().getNames().get(0));
				}
				return map((II)auth.getIds().get(0), (PN)auth.getAssignedPerson().getNames().get(0));
			}
		}
	}
	
	/**
	 * DocumentEntry.mimeType is an XDS specific attribute and outside the scope 
	 * of any CDA R2 document. Thus, it cannot be extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractMimeType()
	 */
	public String extractMimeType() {
		logger.info("DocumentEntry.mimeType" +
			"is an XDS specific attribute and outside the scope of any CDA R2 document. \nThus, it cannot be" +
			" extracted.");
		return null;
	}


	/**
	 * DocumentEntry.parentDocument expresses the id and relationship of a parent document to this CDA
	 * document in the XDS Regisry. This is not necessairly the same parent document that is
	 * documented within the CDA. Thus, this information is not extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractParentDocument()
	 */
	public ParentDocumentType extractParentDocument() {
		logger.info("DocumentEntry.parentDocument expresses the id and relationship of a parent document to this CDA" +
				" document in the XDS Regisry.\nThis is not necessairly the same parent document that is" +
				" documented within the CDA. \nThus, this information is not" +
				" extracted.");
		return null;
	}

	/**
	 * DocumentEntry.patientId expresses the Affinity Domain level patient id used 
	 * in the XDS Regisry. In all cases, this is not necessairly the same patientId that is 
	 * documented within the CDA. Thus, this information is not extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractPatientId()
	 */
	public CX extractPatientId() {
		logger.info("DocumentEntry.patientId expresses the Affinity Domain level patient id used" +
				" in the XDS Regisry.\nIn all cases, this is not necessairly the same patientId that is" +
				" documented within the CDA. \nThus, this information is not" +
				" extracted.");
		return null;
	}

	/**
	 * DocumentEntry.practiceSettingCode is recommended to 
	 * be supplied by the document source from
	 * an established vocabulary approved by the affinity domain, 
	 * such as that described by the Subject Matter Domain in LOINC.
	 * Thus this information is not extracted.
	 * <br>
	 * Note: Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractPracticeSettingCode()
	 */
	public CodedMetadataType extractPracticeSettingCode() {
		logger.info("DocumentEntry.practiceSettingCode is recommended to be supplied by the document source" +
				" from an established vocabulary approved by the affinity domain, \n such as that described by the Subject Matter Domain in LOINC." +
				" \nThus, this information is not extracted.");
		return null;
	}

	/**
	 * DocumentEntry.repositoryUniqueId is an XDS specific attribute and outside the scope 
	 * of any CDA R2 document. Thus, it cannot be extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractRepositoryUniqueId()
	 */
	public String extractRepositoryUniqueId() {
		logger.info("DocumentEntry.repositoryUniqueId" +
			"is an XDS specific attribute and outside the scope of any CDA R2 document. \nThus, it cannot be" +
			" extracted.");
		return null;
	}

	/**
	 * Extracts the relevant serviceStartTime
	 * information from the CDA: ClinicalDocument/documentationOf/serviceEvent/effectiveTime
	 * This time is to be in UTC, but without the timezone offset or fractional seconds: 
	 * [[[[[YYYY]MM]DD]HH]mm]ss]. Thus, this time is assumed to be in GMT. So, if the 
	 * timestamp in the corresponding CDA element contains the timezone offset, 
	 * this method will convert the timestamp to GMT. If the timezone offset is ommitted, 
	 * then the timestamp is assumed to be in GMT.
	 * NOTES:
	 * <li> 1. Finds the minimum low time among 
	 * ClinicalDocument/documentationOf/serviceEvent/effectiveTime instance will be
	 * for serviceStartTime. </li>
	 * <li> 2. XDS metadata validation for 2007 Connectathon will not accept DTM types beyond precision
	 * of YYYYMMDDHHMMSS. Precision has been truncated on values that include fractional seconds
	 * or time zone corrections. Time is in UTC. </li>
	 * <li> 3. Implementation  consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. </li>
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractServiceStartTime()
	 */
	public String extractServiceStartTime() {
		if(!atLeastOne(cda.getDocumentationOfs())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					DocumentationOf.class.getName());
			}
			return null;
		}
		else{
			Iterator i = this.cda.getDocumentationOfs().iterator();
			String minLowTime = null;
			while(i.hasNext()){
				DocumentationOf docOf = (DocumentationOf)i.next();
				ServiceEvent sEvent = docOf.getServiceEvent();
				if(sEvent == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							DocumentationOf.class.getName()+ "/ " +
							ServiceEvent.class);
					}
					continue;
				}
				else if(sEvent.getEffectiveTime() == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							DocumentationOf.class.getName()+ "/ " +
							ServiceEvent.class + "/ effectiveTime");
					}
					continue;
				}
				else {
					IVL_TS range = sEvent.getEffectiveTime();
					if(range.getLow() ==  null){
						if(logger.isDebugEnabled()){
							logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								DocumentationOf.class.getName()+ "/ " +
								ServiceEvent.class + "/ effectiveTime/ low");
						}
						continue;
					}
					else if(range.getLow().getValue() == null){
						if(logger.isDebugEnabled()){
							logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								DocumentationOf.class.getName()+ "/ " +
								ServiceEvent.class + "/ effectiveTime/ low@value");	
						}
						continue;
					}
					// TODO process other combinations of low/high values in IVL_TS
					
					// determine if lowTime found is minimum
					String lowTime = map(range.getLow());
					if(minLowTime == null && lowTime != null){
						minLowTime = lowTime;
					}
					else if(minLowTime != null && lowTime != null){
						if(lowTime.compareTo(minLowTime) < 0){
							minLowTime = lowTime;
						}
					}
				} // end else
			}// end loop
			return minLowTime;
		}
	}

	/**
	 * Extracts the relevant serviceStopTime
	 * information from the CDA: ClinicalDocument/documentationOf/serviceEvent/effectiveTime
	 * This time is to be in UTC, but without the timezone offset or fractional seconds: 
	 * [[[[[YYYY]MM]DD]HH]mm]ss]. Thus, this time is assumed to be in GMT. So, if the 
	 * timestamp in the corresponding CDA element contains the timezone offset, 
	 * this method will convert the timestamp to GMT. If the timezone offset is ommitted, 
	 * then the timestamp is assumed to be in GMT.
	 * <br>
	 * NOTES:
	 * <li> 1. Finds the maximum high time among 
	 * ClinicalDocument/documentationOf/serviceEvent/effectiveTime instance will be
	 * for serviceStartTime. </li>
	 * <li> 2. XDS metadata validation for 2007 Connectathon will not accept DTM types beyond precision
	 * of YYYYMMDDHHMMSS. Precision has been truncated on values that include fractional seconds
	 * or time zone corrections. Time is in UTC. </li>
	 * <li> 3.Implementation  consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. </li>
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractServiceStopTime()
	 */
	public String extractServiceStopTime() {
		if(!atLeastOne(cda.getDocumentationOfs())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					DocumentationOf.class.getName());
			}
			return null;
		}
		else{
			Iterator i = this.cda.getDocumentationOfs().iterator();
			String maxHighTime = null;
			while(i.hasNext()){
				DocumentationOf docOf = (DocumentationOf)i.next();
				ServiceEvent sEvent = docOf.getServiceEvent();
				if(sEvent == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							DocumentationOf.class.getName()+ "/ " +
							ServiceEvent.class);
					}
					continue;
				}
				else if(sEvent.getEffectiveTime() == null){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							DocumentationOf.class.getName()+ "/ " +
							ServiceEvent.class + "/ effectiveTime");
					}
					continue;
				}
				else {
					IVL_TS range = sEvent.getEffectiveTime();
					if(range.getHigh() ==  null){
						if(logger.isDebugEnabled()){
							logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								DocumentationOf.class.getName()+ "/ " +
								ServiceEvent.class + "/ effectiveTime/ high");
						}
						continue;
					}
					else if(range.getHigh().getValue() == null){
						if(logger.isDebugEnabled()){
							logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								DocumentationOf.class.getName()+ "/ " +
								ServiceEvent.class + "/ effectiveTime/ high@value");	
						}
						continue;
					}
					// TODO process other combinations of low/high values in IVL_TS
					
					// determine if highTime found is maximum
					String highTime = map(range.getHigh());
					if(maxHighTime == null && highTime != null){
						maxHighTime = highTime;
					}
					else if(maxHighTime != null && highTime != null){
						if(highTime.compareTo(maxHighTime) > 0){
							maxHighTime = highTime;
						}
					}
				} // end else
			}// end loop
			return maxHighTime;
		}
	}

	/**
	 * DocumentEntry.size is a comptuted value and outside the scope of any 
	 * CDA R2 document. Thus, it cannot be extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractSize()
	 */
	public String extractSize() {
		logger.info("DocumentEntry.size " +
				"is a comptuted value and outside the scope of any CDA R2 document. \nThus, it cannot be" +
				" extracted.");
		return null;
	}

	/**
	 * Extracts the relevant sourcePatientId
	 * information from the CDA: ClinicalDocument/recordTarget/patientRole/id
	 * <br>
	 * NOTES:
	 * <li> 1. Only the first ClinicalDocument/recordTarget instance will be considered
	 * for sourcePatientId (for which only the first
	 * patientRole/id on it's list will be taken) and sourcePatientInfo .</li>
	 * <li> 2. XDS metadata does not accept CX types that
	 * have more or fewer components than CX.1, CX.4.2,CX.4.3. Other corresponding componets
	 * will not be extracted.</li>
	 * <li> 3. Implementation  consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. </li>
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractSourcePatientId()
	 */
	public CX extractSourcePatientId() {
		if(!atLeastOne(cda.getRecordTargets())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName());
			}
			return null;
		}
		else {
			RecordTarget target = (RecordTarget)cda.getRecordTargets().get(0);
			if(target.getPatientRole() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName());
				}
				return null;
			}
			else{ 
				PatientRole patient = target.getPatientRole();
				if(!atLeastOne(patient.getIds())){
					if(logger.isDebugEnabled()){
						logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/ " +
							RecordTarget.class.getName()+ "/ " + 
							PatientRole.class.getName() +"/ id");
					}
					return null;
				}
				else{
					II pId = (II)patient.getIds().get(0);
					
					if (pId.getExtension()== null){
						if(logger.isDebugEnabled()){
							logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								RecordTarget.class.getName()+ "/ " + 
								PatientRole.class.getName() +"/ id@extension"); 
						}
					}
					if (pId.getRoot() == null){
						if(logger.isDebugEnabled()){
							logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
								ClinicalDocument.class.getName() + "/ " +
								RecordTarget.class.getName()+ "/ " + 
								PatientRole.class.getName() +"/ id@root"); 
						}
					}
					return map(pId);
				}
			}
		}
	}

	/**
	 * Extracts the relevant sourcePatientInfo
	 * information from the CDA: ClinicalDocument/recordTarget/patientRole
	 * <br>
	 * NOTES:
	 * <li> 1. Only the first ClinicalDocument/recordTarget instance will be considered
	 * for sourcePatientId (for which only the first
	 * patientRole/id on it's list will be taken) and sourcePatientInfo .</li>
	 * <li> 2. Extracts all id of the list of ids for PatientRole to PID-3 and the PatientRole/Patient/id </li> 
	 * <li> 3. XDS metadata does not accept CX types that
	 * have more or fewer components than CX.1, CX.4.2,CX.4.3. Other corresponding componets
	 * will not be extracted.</li>
	 * <li> 4. XDS metadata validation for 2007 Connectathon will not accept SourcePatientInfo
	 * beyond local patient ids, patient name, address, birthdate and gender. Other patient
	 * info in the CDA that corresponds to source patient info will not be extracted. </li>
	 * <li> 5.Only the first address will be considered for extraction, only the first subelements of the AD
	 * type will be considered for extraction. </li>
	 * <li> 6. Implementation  consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. </li>
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractSourcePatientInfo()
	 */
	public SourcePatientInfoType extractSourcePatientInfo() {
		if(!atLeastOne(cda.getRecordTargets())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName());
			}
			return null;
		}

		RecordTarget target = (RecordTarget)cda.getRecordTargets().get(0);
		if(target.getPatientRole() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName());
			}
			return null;
		}

		PatientRole patient = target.getPatientRole();
		SourcePatientInfoType sourceInfo = Hl7v2Factory.eINSTANCE.createSourcePatientInfoType();
		
		// PID-3: patientIdentifier list (from PatientRole/id)
		if(!atLeastOne(patient.getIds())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName() +"/ id");
			}
		}
		else{
			sourceInfo.getPatientIdentifier().addAll(extractPid3(patient.getIds()));
		}
		
		// PID-11: patient Address
		if(!atLeastOne(patient.getAddrs())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName() +"/ addr");
			}
		}
		else{
			// call pid11 method
			sourceInfo.setPatientAddress(extractPid11((AD)patient.getAddrs().get(0)));
		}
		
		// PID-13, PID-14
		// TODO enable this exttaction when XDS metadat is more flexible
		if(!atLeastOne(patient.getTelecoms())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName() +"/ telecom");
			}
		}
		else{
			// call pid13 and pid 14 methods
			// TODO add this support in when it is allowed by IHE.
			/*for(int i = 0; i < patient.getTelecom().size(); i++){
				PID13CONTENT pid13 = extractPid13(patient.getTelecom().get(i));
				PID14CONTENT pid14 = extractPid14(patient.getTelecom().get(i));
				if(pid13 != null){
					sourceInfo.getPID13().add(pid13);
				}
				else if (pid14 != null)
					sourceInfo.getPID14().add(pid14);
			}*/
		}
			
		// Rest of PID 3, PID 5, PID 7 and PID 8
		if(patient.getPatient() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName()+ "/ " 
					+ Patient.class.getName());
			}
		}
		else{
			Patient p = patient.getPatient();
			// PID-3: patientIdentifier list (from PatientRole/Patient/id)
			if(p.getId() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName()+ "/ " 
						+ Patient.class.getName() +"/ id");
				}
			}
			else{
				List l = new ArrayList();
				l.add(p.getId());
				sourceInfo.getPatientIdentifier().addAll(extractPid3(l));
			}
			
			// PID-5: patientName list
			if(!atLeastOne(p.getNames())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName()+ "/ " 
						+ Patient.class.getName() +"/ name");
				}
			}
			else{
				sourceInfo.getPatientName().addAll(extractPid5(p.getNames()));
			}
			// PID-7: patientDateOfBirth
			sourceInfo.setPatientDateOfBirth(extractPid7(p.getBirthTime()));
			// PID-8: patientSex
			sourceInfo.setPatientSex(extractPid8(p.getAdministrativeGenderCode()));
		}
		return sourceInfo;
	}



	/**
	 * Extracts the relevant title, Implementation  consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. 
	 * information from the CDA: ClinicalDocument/title
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractTitle()
	 */
	public InternationalStringType extractTitle() {
		if(cda.getTitle() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/title");
			}
			return null;
		}

		LocalizedStringType dName = MetadataFactory.eINSTANCE.createLocalizedStringType();
		String txt = processMixed(cda.getTitle().getMixed());
		if(txt.length() <= 0){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_VALUE + 
					ClinicalDocument.class.getName() + "/title");
			}
			return null;
		}
		else{
			dName.setValue(txt);
			InternationalStringType display = MetadataFactory.eINSTANCE.createInternationalStringType();
			display.getLocalizedString().add(dName);
			return display;
		}
	}


	/**
	 * Extracts the relevant typeCode. Implementation  consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. 
	 * information from the CDA: ClinicalDocument/code
	 * <br>
	 * Note: typeCode and classCode data sources are the same in the CDA
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractTypeCode()
	 */
	public CodedMetadataType extractTypeCode() {
		return extractClassCode();
	}

	/**
	 * DocumentEntry.URI is a comptuted value and outside the scope of any 
	 * CDA R2 document. Thus, it cannot be extracted.
	 * @return null
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractURI()
	 */
	public String extractURI() {
		logger.info("DocumentEntry.URI " +
				"is a comptuted value and outside the scope of any CDA R2 document. \nThus, it cannot be" +
				" extracted.");
		return null;
	}

	/**
	 * Extracts the relevant uniqueId. Implementation consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. 
	 * information from the CDA: ClinicalDocument/id (format is id@root^id@extension)
	 * @see org.openhealthtools.ihe.xds.metadata.extract.DocumentEntryElementExtractor.extractUniqueId()
	 */
	public String extractUniqueId() {
		if(cda.getId() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/id");
			}
			return null;
		}

		if(cda.getId().getRoot() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/id@root");
			}
			// no root
			return null;
		}
		else if (cda.getId().getExtension()== null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/id@extension");
			}
			// no extension, but there is a root
			return cda.getId().getRoot();
		}
		
		// return root^extension
		return cda.getId().getRoot() + "^" + cda.getId().getExtension();
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	// Support functions for extractAuthors() function
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Extracts authorInstitution from CDAR2
	 * <li> NOTES: </li>
	 * <li> 1. only the first organization name of the list is extracted and
	 * processed as XON.1</li>
	 * <li> 2. only the first id of the list of ids
	 * is extracted for XON.3 and XON.6.1, XON.6.2 (pending resolution to IT CP 316)</li>
	 * <li> 3. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR, pending resolution to ITI CP 316.
	 * </li>
	 * @param o ClinicalDocument/author/assignedAuthor/representedOrganization
	 * of type Organization expected.
	 * @return Returns null if institution cannot be extracted
	 * @see com.ibm.ihii.transformation.xds.metadata.MetadataExtractor#extractAuthorInstitution(java.lang.Object)
	 */
	private XON extractAuthorInstitution(Organization org) {
		if(org == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName() + "/" +
					AssignedAuthor.class.getName() + "/ " + 
					Organization.class.getName());
			}
			return null;
		}
		
		boolean idNull = false;
		
		// XON.3 and XON.6
		if(!atLeastOne(org.getIds())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName() + "/" +
					AssignedAuthor.class.getName() + "/ " + 
					Organization.class.getName() + "/ id");
			}
			idNull = true;
		}
		else {
			if(((II)org.getIds().get(0)).getRoot() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName() + "/ " + 
							Organization.class.getName()+ "/ id@root");
				}
			}
			if(((II)org.getIds().get(0)).getExtension() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName() + "/ " + 
							Organization.class.getName()+ "/ id@extension");
				}
			}
			if(((II)org.getIds().get(0)).getAssigningAuthorityName() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName() + "/ " + 
							Organization.class.getName()+ "/ id@assigningAuthorityName");
				}
			}
		}
		// XON.1
		if(!atLeastOne(org.getNames())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName() + "/" +
					AssignedAuthor.class.getName() + "/ " + 
					Organization.class.getName() + "/ name");
			}
			if(idNull){
				return null;
			}
			else{
				return map(null, (II)org.getIds().get(0));
			}
		}
		if(idNull){
			return map((ON)org.getNames().get(0), null);
		}
		return map((ON)org.getNames().get(0), (II)org.getIds().get(0));
	}
	

	/**
	 * Extracts authorPerson from CDAR2
	 * of type AssignedAuthor expected.
	 * <li> NOTES: </li>
	 * <li> 1. only the first id of the list of ids
	 * is extracted for XCN.1, XCN.9.1, XCN.9.2 </li>
	 * <li> 2. only the first person name of the assignedAuthor/assignedPerson
	 * name list (and first entries in the sub lists) are extracted 
	 * and processed for XCN.2 to XCN.6</li>
	 * <li> 3. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR </li>
	 * @param aAuth ClinicalDocument/author/assignedAuthor/ object
	 * @return Returns null if author cannot be extracted
	 * @see com.ibm.ihii.transformation.xds.metadata.MetadataExtractor#extractAuthorPerson(java.lang.Object)
	 */
	private XCN extractAuthorPerson(AssignedAuthor aAuth) {
		if(aAuth == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName() + "/" +
					AssignedAuthor.class.getName());
			}
			return null;
		}
		boolean idNull = false;
		
		//	 XCN.1, XCN.9.1, XCN.9.2
		if(!atLeastOne(aAuth.getIds())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/" +
						Author.class.getName() + "/" +
						AssignedAuthor.class.getName()+ "/ id");
			}
			idNull = true;
		}
		else {
			if(((II)aAuth.getIds().get(0)).getRoot() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName()+ "/ id@root");
				}
			}
			if(((II)aAuth.getIds().get(0)).getExtension() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName()+ "/ id@extension");
				}
			}
			if(((II)aAuth.getIds().get(0)).getAssigningAuthorityName() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName()+ "/ id@assigningAuthorityName");
				}
			}
		}
		//	XCN.2 through XCN.6
		if(aAuth.getAssignedPerson() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/" +
						Author.class.getName() + "/" +
						AssignedAuthor.class.getName()+ "/ " + 
						Person.class.getName());
			}
			if(idNull){
				return null;
			}
			return map((II)aAuth.getIds().get(0), null);
		}
		else if(!atLeastOne(aAuth.getAssignedPerson().getNames())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/" +
						Author.class.getName() + "/" +
						AssignedAuthor.class.getName()+ "/ " + 
						Person.class.getName()+ "/name ");
			}
			if(idNull){
				return null;
			}
			return map((II)aAuth.getIds().get(0), null);
		}
		else{
			if(!atLeastOne(((PN)aAuth.getAssignedPerson().getNames().get(0)).getFamilies())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName()+ "/ " + 
							Person.class.getName()+ "/name/family ");
				}
			}
			if(!atLeastOne(((PN)aAuth.getAssignedPerson().getNames().get(0)).getGivens())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName()+ "/ " + 
							Person.class.getName()+ "/name/given ");
				}
			}
			if(!atLeastOne(((PN)aAuth.getAssignedPerson().getNames().get(0)).getPrefixes())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName()+ "/ " + 
							Person.class.getName()+ "/name/prefix ");
				}
			}
			if(!atLeastOne(((PN)aAuth.getAssignedPerson().getNames().get(0)).getSuffixes())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							Author.class.getName() + "/" +
							AssignedAuthor.class.getName()+ "/ " + 
							Person.class.getName()+ "/name/suffix ");
				}
			}
			if(idNull){
				return map(null, (PN)aAuth.getAssignedPerson().getNames().get(0));
			}
			return map((II)aAuth.getIds().get(0), (PN)aAuth.getAssignedPerson().getNames().get(0));
		}
	}

	/**
	 * Extracts authorRole from CDAR2. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR.
	 * @param role ClinicalDocument/author/functionCode of type CE expected
	 * @return Returns null if code cannot be extracted
	 * @see com.ibm.ihii.transformation.xds.metadata.MetadataExtractor#extractAuthorRole(java.lang.Object)
	 */
	private String extractAuthorRole(CE role) {
		if(role == null) return null;
		
		if(role.getCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName() + "/ functionCode");
			}
			return null;
		}
		return role.getCode();
	}

	/**
	 * Extracts authorSpeciality from CDAR2. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR.
	 * @param o ClinicalDocument/author/assignedAuthor/code of type CE expected
	 * @return Returns null if code cannot be extracted
	 * @see com.ibm.ihii.transformation.xds.metadata.MetadataExtractor#extractAuthorSpeciality(java.lang.Object)
	 */
	private String extractAuthorSpeciality(CE spec) {
		if(spec == null) return null;
		
		if(spec.getCode() == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName() + "/" +
					AssignedAuthor.class.getName() +"/code");
			}
			return null;
		}
		return spec.getCode();
	}
	
	/**
	 * Extracts authorTelecommunication from CDAR2
	 * <li> NOTES: </li>
	 * <li> 1. only the first telcom is extracted
	 * @param o ClinicalDocument/author/assignedAuthor/representedOrganization
	 * of type Organization expected.
	 * @return Returns null if telcom cannot be extracted
	 */
	private XTN extractAuthorTelecommunication(TEL tel) {
		if(tel == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/" +
					Author.class.getName() + "/" +
					AssignedAuthor.class.getName() + "/ " + 
					TEL.class.getName());
			}
			return null;
		}
		return map(tel);
	}
	
	////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	// Support methods for extractSourcePatientInfo() - the PID segment
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	/**
	 * Extracts Pid-3 (patient id)
	 * @param idList ClinicalDocument/recordTarget/patient/id(s)
	 * list of type II expected
	 * @return List of CX type ids for XDS metadata
	 */
	private List extractPid3(List idList){
		Iterator i = idList.iterator();
		ArrayList ids = new ArrayList();
		while(i.hasNext()){
			II pId = (II)i.next();
		
			if (pId.getExtension()== null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ id@extension"); 
				}
			}
			if (pId.getRoot() == null){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ id@root"); 
				}
			}
			CX cx = map(pId);
			if(cx != null){
				ids.add(cx);
			}
		}
		return ids;
	}
	
	/**
	 * Extracts Pid-5 (patient name)
	 * @param nameList ClinicalDocument / recordTarget / patient / patientPatient / name(s)
	 * list of type PN expected.
	 * @return list of XPN types for patient names in XDS metadata
	 */
	private List extractPid5(List nameList){
		Iterator i = nameList.iterator();
		ArrayList names = new ArrayList();
		while(i.hasNext()){
			PN name = (PN)i.next();
			if(!atLeastOne(name.getFamilies())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							RecordTarget.class.getName() + "/" +
							PatientRole.class.getName()+ "/ " + 
							Patient.class.getName()+ "/name/family ");
				}
			}
			if(!atLeastOne(name.getGivens())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							RecordTarget.class.getName() + "/" +
							PatientRole.class.getName()+ "/ " + 
							Patient.class.getName()+ "/name/given ");
				}
			}
			if(!atLeastOne(name.getPrefixes())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							RecordTarget.class.getName() + "/" +
							PatientRole.class.getName()+ "/ " + 
							Patient.class.getName()+ "/name/prefix ");
				}
			}
			if(!atLeastOne(name.getSuffixes())){
				if(logger.isDebugEnabled()){
					logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
							ClinicalDocument.class.getName() + "/" +
							RecordTarget.class.getName() + "/" +
							PatientRole.class.getName()+ "/ " + 
							Patient.class.getName()+ "/name/suffix ");
				}
			}
			XPN xpn = map(name);
			names.add(xpn);
		}
		return names;
	}

	/**
	 * Extracts Pid-7 (patient birth day/time)
	 * @param o ClinicalDocument / recordTarget / patient / patientPatient / birthTime
	 * of type TS1 expected
	 * @return
	 */
	private String extractPid7(TS time){
		if(time == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName()+ "/ " 
					+ Patient.class.getName() +"/ birthTime");
			}
			return null;
		}

		return map(time);
	}

	/**
	 * Extracts Pid-8 (administrative sex)
	 * @param o ClinicalDocument / recordTarget / patient / patientPatient / administrativeGenderCode
	 * of type CE expected
	 * @return
	 */
	private String extractPid8(CE docCode){
		if(docCode == null){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName()+ "/ " 
					+ Patient.class.getName() +"/ administrativeGenderCode");
			}
			return null;
		}

		String gender = docCode.getCode();
		String value = (String)ADMIN_GENDER_TABLE_001.get(gender);
		
		if(value == null && gender != null){
			logger.warn(MetadataExtractionStatus.INVALID_VOCAB
					+ gender);
		}
		return value;
	}
	

	/**
	 * Extracts Pid-11 (patient address)
	 * @param o ClinicalDocument / recordTarget / patient / addr
	 * of type AD expected
	 * @return
	 */
	private XAD extractPid11(AD addr){
		if(!atLeastOne(addr.getStreetAddressLines())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
					ClinicalDocument.class.getName() + "/ " +
					RecordTarget.class.getName()+ "/ " + 
					PatientRole.class.getName() +"/ addr/streetAddressLine ");
			}
		}
		if(!atLeastOne(addr.getAdditionalLocators())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ addr/additionalLocator");
			}
		}
		if(!atLeastOne(addr.getCities())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ addr/city");
			}
		}
		if(!atLeastOne(addr.getStates())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ addr/state ");
			}
		}
		if(!atLeastOne(addr.getPostalCodes())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ addr/postalCode ");
			}
		}
		if(!atLeastOne(addr.getCounties())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ addr/country");
			}
		}
		// TODO ... add in when support is enabled
		/*if(!atLeastOne(addr.getCounty())){
			if(logger.isDebugEnabled()){
				logger.debug(MetadataExtractionStatus.MISSING_DATA_SOURCE + 
						ClinicalDocument.class.getName() + "/ " +
						RecordTarget.class.getName()+ "/ " + 
						PatientRole.class.getName() +"/ addr/county ");
			}
		}*/
		return map(addr);
	}
	

	// TODO add support in when IHE allows this information
	/**
	 * Extracts Pid-13 (patient home phone).
	 * Not used now but potentially enabled in the future.
	 * <li>NOTES</li>
	 * <li>1. Captures all telephone numbers with unspecified @use or @use = H,HP,HV </li>
	 * @param o ClinicalDocument / recordTarget / patient / telcom
	 * of type TEL expected
	 * @return
	 */
/*	private PID13CONTENT extractPid13(Object o){
		if(o == null){
			logger.info(MetadataExtractionStatus.MISSING_DATA_SOURCE 
					+ RecordTarget.class
					+ "/ " + PatientRole.class
					+ "/ " + TEL.class);
			return null;
		}
		if(o instanceof TEL){
			TEL tel = (TEL)o;
			XTN xtn = map(tel);
			if(xtn.getXTN2().getValue() == null){
				logger.info(MetadataExtractionStatus.MISSING_DATA_VALUE 
						+ PID13CONTENT.PID13_ID
						+ " (" + XTN2CONTENT.class +")");
			}
			if(xtn.getXTN12().getValue() == null){
				logger.info(MetadataExtractionStatus.MISSING_DATA_VALUE 
						+ PID13CONTENT.PID13_ID
						+ " (" + XTN12CONTENT.class +")");
			}
			PID13CONTENT pid13 = Hl7v2Factory.eINSTANCE.createPID13CONTENT();
			if(!atLeastOne(tel.getUse())){
				pid13.setXTN2(xtn.getXTN2());
				pid13.setXTN12(xtn.getXTN12());
				return pid13;
			}
			else if(((CsTelecommunicationAddressUse)tel.getUse().get(0)).equals(CsTelecommunicationAddressUse.H_LITERAL) ||
				   ((CsTelecommunicationAddressUse)tel.getUse().get(0)).equals(CsTelecommunicationAddressUse.HP_LITERAL) ||
				   ((CsTelecommunicationAddressUse)tel.getUse().get(0)).equals(CsTelecommunicationAddressUse.HV_LITERAL)){
					pid13.setXTN2(xtn.getXTN2());
					pid13.setXTN12(xtn.getXTN12());
					return pid13;
			}
			else{
				return null;
			}
		}
		logger.info(MetadataExtractionStatus.INVALID_DATA_SOURCE 
				+ PID13CONTENT.PID13_ID
				+ " (" + o.getClass().getName() + ")");
		return null;
	}

	*/
	//	 TODO add support in when IHE allows this information
	/**
	 * Extracts Pid-14 (patient business phone)
	 * Not used now but potentially enabled in the future
	 * <li>NOTES</li>
	 * <li>1. Captures all telephone numbers with first @use = WP</li>
	 * @param o ClinicalDocument / recordTarget / patient / telcom
	 * of type TEL expected
	 * @return
	 *//*
	private PID14CONTENT extractPid14(Object o){
		if(o == null){
			logger.info(MetadataExtractionStatus.MISSING_DATA_SOURCE 
					+ RecordTarget.class
					+ "/ " + PatientRole.class
					+ "/ " + TEL.class);
			return null;
		}
		if(o instanceof TEL){
			TEL tel = (TEL)o;
			if(!atLeastOne(tel.getUse())){
				logger.info(MetadataExtractionStatus.MISSING_DATA_SOURCE 
						+ RecordTarget.class
						+ "/ " + PatientRole.class
						+ "/ " + TEL.class +"(@use)");
				return null;
			}
			else if(((CsTelecommunicationAddressUse)tel.getUse().get(0)).equals(CsTelecommunicationAddressUse.WP_LITERAL)){
				PID14CONTENT pid14 = Hl7v2Factory.eINSTANCE.createPID14CONTENT();
				XTN xtn = map(tel);
				if(xtn.getXTN2().getValue() == null){
					logger.info(MetadataExtractionStatus.MISSING_DATA_VALUE 
							+ PID14CONTENT.PID14_ID
							+ " (" + XTN2CONTENT.class +")");
				}
				if(xtn.getXTN12().getValue() == null){
					logger.info(MetadataExtractionStatus.MISSING_DATA_VALUE 
							+ PID14CONTENT.PID14_ID
							+ " (" + XTN12CONTENT.class +")");
				}
				pid14.setXTN2(xtn.getXTN2());
				pid14.setXTN12(xtn.getXTN12());
				return pid14;
			}
			else{
				return null;
			}
		}
		logger.info(MetadataExtractionStatus.INVALID_DATA_SOURCE 
				+ PID14CONTENT.PID14_ID
				+ " (" + o.getClass().getName() + ")");
		return null;
	}*/
	
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	// Support method for processing CDA Data types into metadata
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	/**
	 * Concatinates values in mixed data
	 * @param m
	 * @return mixed data as a string
	 */
	protected String processMixed(FeatureMap m){
        StringBuffer txt = new StringBuffer("");
        for (int i=0 ; i< m.size() ; i++) {
            FeatureMap.Entry entry = (FeatureMap.Entry)m.get(i);
            if (entry.getEStructuralFeature() == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
                txt.append((String)entry.getValue());
            }
        }
		return txt.toString();
	}
	/**
	 * Checks to see if the list has at least one element.
	 * @param l
	 * @return false if l is null, if l.size() < 1 or if l.get(0) is null. 
	 * Otherwise, return true.
	 */
	protected boolean atLeastOne(List l){
		if(l == null) return false;
		if(l.size() < 1)return false;
		if(l.get(0) == null)return false;
		return true;
	}
	/**
	 * Maps from document code CD (or children CE, CS1) to
	 * a CodedMetadataType
	 * @param docCode
	 * @return
	 */
	protected CodedMetadataType map(CD docCode){
		if(docCode == null){return null;}
		// set code
		CodedMetadataType code = MetadataFactoryImpl.eINSTANCE.createCodedMetadataType();
		code.setCode(docCode.getCode());
		
		// set display name
		if(docCode.getDisplayName() != null){
			LocalizedStringType dName = MetadataFactory.eINSTANCE.createLocalizedStringType();
			dName.setValue(docCode.getDisplayName());
			InternationalStringType display = MetadataFactory.eINSTANCE.createInternationalStringType();
			display.getLocalizedString().add(dName);
			code.setDisplayName(display);
		}
		
		// set code scheme name		
		// FIXME SEK - temporary fix for Issue 37
		/*	if(docCode.getCodeSystemName() != null){
				code.setSchemeName(docCode.getCodeSystemName());
		}*/
		if (docCode.getCodeSystemName() != null) {
			code.setSchemeName(docCode.getCodeSystemName());
		}
		else {
			code.setSchemeName(docCode.getCodeSystem());
		}


		// TODO ... enable if appropriate.
		//code.setSchemeUUID(docCode.getCodeSystem());
		
		return code;
	}
	
	
	/**
	 * Maps CDA R2 II data type to components to the OHT model version of a 
	 * HL7 v2.5 CX data type
	 * <li> NOTES: </li>
	 * <li> 1. Always sets CX.4.3 to "ISO"</li>
	 * <li> 2. XDS metadata does not accept CX types that
	 * have more or fewer components than CX.1, CX.4.2,CX.4.3. Other corresponding componets
	 * will not be extracted. (ie. will not extract assigningAuthorityName attribute
	 * from II type)</li>
	 * @param id
	 * @return
	 */
	protected CX map(II id){
		if(id == null){ return null;}
		
		CX cx = Hl7v2Factory.eINSTANCE.createCX();

		// CX.1 - id number
		cx.setIdNumber(id.getExtension());
		// CX.4.2 - assigning authority universal id
		cx.setAssigningAuthorityUniversalId(id.getRoot());
		// CX.4.3 - assigning authority universal id type
		cx.setAssigningAuthorityUniversalIdType("ISO");

		return cx;
	}
	
	
	/**
	 * Maps CDA R2 TEL type to the OHT model version of the Hl7 v2.5 XTN
	 * data type.
	 * @param tel
	 * @return
	 */
	protected XTN map (TEL tel){
		if(tel == null){ return null;}
		
		XTN xtn = Hl7v2Factory.eINSTANCE.createXTN();
		
		// Updated CP 524, 627 and 628 for IHE ITI TF v9 (2012-2013)
		// XTN.3
		// FIXME 12/19/12 SEK - not sure if this is required, no matching concept for this in CDA
		xtn.setTelecommunicationType("");
		// XTN.4
		xtn.setTelecommunicationAddress(tel.getValue());
		
		// XTN.12 - unformatted telephone number
		/*xtn.setUnformattedTelephoneNumber(tel.getValue());*/
		
		return xtn;
	}
	
	/**
	 * Maps CDA R2 TS1 data type to the OHT model version of the Hl7 v2.5 TS
	 * data type. The XDS Metadata timestamp is to be in UTC, but without the timezone offset or fractional seconds: 
	 * [[[[[YYYY]MM]DD]HH]mm]ss]. Thus, this time is assumed to be in GMT. So, if the 
	 * timestamp in the corresponding CDA element contains the timezone offset, 
	 * this method will convert the timestamp to GMT. If the timezone offset is ommitted, 
	 * then the timestamp is assumed to be in GMT.
	 * <br>
	 * @param time
	 * @return
	 */
	protected String map (TS time){
		if(time == null){ return null;}
		if(time.getValue() == null){return null;}
		
		String tm = time.getValue();
		// Check for time zone
		int timeZoneOffset = 0;
		String offset = "";
		if(tm.length() > "-ZZZZ".length()) {
			// check for minus GMT
			if(tm.charAt(tm.length()-"-ZZZZ".length()) == '-'){
				// found timezone offset
				offset = tm.substring(tm.length()-"-ZZZZ".length());
			}
			// check for plus GMT
			else if(tm.charAt(tm.length()-"-ZZZZ".length()) == '+'){
				// found timezone offset
				offset = tm.substring(tm.length()-"+ZZZZ".length());
			}
		}
		// trim length (get rid of time zone and fractional seconds)
		if(tm.length() > "YYYYMMDDHHMMSS".length()){
			tm = tm.substring(0,"YYYYMMDDHHMMSS".length());
		}
		
		// factor in timezone offset, if applicable
		if(tm.length() > "YYYYMMDDHH".length()&& offset.length()>0){

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			// first, set up time in current time zone
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"+offset));
			Date specifiedTime;
			//System.out.println("Specified time is: " + tm);
			//System.out.println("time zone is:GMT" + offset);
			try {
				// switch timezone
				specifiedTime = sdf.parse(tm);
				sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
				tm = sdf.format(specifiedTime);
				//System.out.println("Specified time post conversion: "+ tm);
				//System.exit(0);
			} catch (ParseException e) {
				// FIXME just skip the conversion, bad time stamp, hence bad
				// CDA!
				// Maybe this should be more robust?? An Exception?
			}
		}
		return tm;
	}
	
	/**
	 * Maps CDA R2 PN datatype to the OHT model version of the HL7 v2.5 XPN
	 * data type.
	 * <li> NOTES: </li>
	 * <li> 1. only the first entries in the sub lists for name parts
	 * are extracted and processed for XPN.1 to XPN.5</li>
	 * @param name
	 * @return
	 */
	protected XPN map(PN name){
		if(name == null){ return null;}
		
		XPN xpn = Hl7v2Factory.eINSTANCE.createXPN();
		// XPN.1.1 - family_name.surname
		if(atLeastOne(name.getFamilies())){
			ENXP family = (ENXP)name.getFamilies().get(0);
			String txt = processMixed(family.getMixed());
		    if(txt.length() > 0){
				xpn.setFamilyName(txt);
		    }
		}
		// XPN.2 and XPN.3 (given name and middle name) 
		// FIXME ... this assumes that these names are in order ... of which
		// there is no garuntee
		if(atLeastOne(name.getGivens())){
			ENXP given = (ENXP)name.getGivens().get(0);
			String txt = processMixed(given.getMixed());
		    if(txt.length() > 0){
				xpn.setGivenName(txt);
		    }
			if(name.getGivens().size() > 1){
				if(name.getGivens().get(1) != null){
					ENXP middle = (ENXP)name.getGivens().get(1);
					txt = processMixed(given.getMixed());
				    if(txt.length() > 0){
						xpn.setOtherName(txt);
				    }
				}
			}
		}
		
		// XPN.4 - suffix
		if(atLeastOne(name.getSuffixes())){
			ENXP suffix = (ENXP)name.getSuffixes().get(0);
			String txt = processMixed(suffix.getMixed());
		    if(txt.length() > 0){
				xpn.setSuffix(txt);
		    }
		}
		
		// XPN.5 - prefix
		if(atLeastOne(name.getPrefixes())){
			ENXP prefix = (ENXP)name.getPrefixes().get(0);
			String txt = processMixed(prefix.getMixed());
		    if(txt.length() > 0){
				xpn.setPrefix(txt);
		    }
		}
		return xpn;
	}
	
	/**
	 * Maps CDA R2 II and PN datatypes to the OHT model version of the HL7 v2.5 XCN
	 * data type. Implementation consistent with PCC TF-2 Medical Document Binding
	 *  to XDS, XDM and XDR. 
	 * @param id
	 * @param name
	 * @return
	 */
	protected XCN map(II id, PN name){
		XCN xcn = Hl7v2Factory.eINSTANCE.createXCN();
		
		boolean idNull = true;
		boolean nameNull = true;
		if(id != null){
			// XCN.1 - id number
			xcn.setIdNumber(id.getExtension());
			// XCN.9.1 - assigning authority universal id
			xcn.setAssigningAuthorityName(id.getAssigningAuthorityName());
			// XCN.9.2 - assigning authority universal id
			xcn.setAssigningAuthorityUniversalId(id.getRoot());
			// XCN.9.3 - assigning authority universal id type
			xcn.setAssigningAuthorityUniversalIdType("ISO");
			idNull = false;
		}
		if(name != null){
			// XCN 2.1
			if(atLeastOne(name.getFamilies())){
				ENXP family = (ENXP)name.getFamilies().get(0);
				String txt = processMixed(family.getMixed());
			    if(txt.length() > 0){
					xcn.setFamilyName(txt);
			    }
			}
			// XCN.3 and XCN.4 (given name and middle name) 
			// FIXME ... this assumes that these names are in order ... of which
			// there is no garuntee
			if(atLeastOne(name.getGivens())){
				ENXP given = (ENXP)name.getGivens().get(0);
				String txt = processMixed(given.getMixed());
			    if(txt.length() > 0){
					xcn.setGivenName(txt);
			    }
				if(name.getGivens().size() > 1){
					if(name.getGivens().get(1) != null){
						ENXP middle = (ENXP)name.getGivens().get(1);
						txt = processMixed(given.getMixed());
					    if(txt.length() > 0){
							xcn.setOtherName(txt);
					    }
					}
				}
			}
			
			// XCN.5 - suffix
			if(atLeastOne(name.getSuffixes())){
				ENXP suffix = (ENXP)name.getSuffixes().get(0);
				String txt = processMixed(suffix.getMixed());
			    if(txt.length() > 0){
					xcn.setSuffix(txt);
			    }
			}
			
			// XCN.6 - prefix
			if(atLeastOne(name.getPrefixes())){
				ENXP prefix = (ENXP)name.getPrefixes().get(0);
				String txt = processMixed(prefix.getMixed());
			    if(txt.length() > 0){
					xcn.setPrefix(txt);
			    }
			}
		}
		if(idNull && nameNull){
			return null;
		}
		else{
			return xcn;
		}
	}
	
	/**
	 * Maps CDA R2 II and ON datatypes to the OHT model version of the HL7 v2.5 XON
	 * data type. Implementation consistent with PCC TF-2 Medical Document Binding 
	 * to XDS, XDM and XDR, pending resolution to ITI CP 316.
	 * @param id
	 * @param name
	 * @return
	 */
	protected XON map(ON name, II id){
		XON xon = Hl7v2Factory.eINSTANCE.createXON();
		
		boolean idNull = true;
		boolean nameNull = true;
		if(id != null){
			// XON.3 - id number
			xon.setIdNumber(id.getExtension());
			// XON.6.1 - assigning authority universal id
			xon.setAssigningAuthorityName(id.getAssigningAuthorityName());
			// XON.6.2 - assigning authority universal id
			xon.setAssigningAuthorityUniversalId(id.getRoot());
			// XON.6.3 - assigning authority universal id type
			xon.setAssigningAuthorityUniversalIdType("ISO");
			idNull = false;
		}
		if(name != null){
			// XON 1
			String txt = processMixed(name.getMixed());
			if(txt.length() > 0){
				xon.setOrganizationName(txt);
			}
		}
		return xon;
	}
	
	
	/**
	 * Maps CDA R2 AD datatype to the OHT model version of the HL7 v2.5 XAD 
	 * data type
	 * <li> NOTES: </li>
	 * <li> 1. only the first entries in the sub lists for address parts
	 * are extracted and processed for XAD.1.1, XAD.2 through
	 * XAD.6 </li>
	 * <li> 2. XAD.9 is not extracted at this point due to IHE restrictions on metadata, 
	 * could be enabled in the future.
	 * </li>
	 * @param addr
	 * @return
	 */
	protected XAD map(AD addr){
		if(addr == null){ return null;}
		
		XAD xad = Hl7v2Factory.eINSTANCE.createXAD();
		
		// XAD.1.1
		if(atLeastOne(addr.getStreetAddressLines())){
			ADXP stl = (ADXP)addr.getStreetAddressLines().get(0);
			String txt = processMixed(stl.getMixed());
			if(txt.length() > 0){
				xad.setStreetAddress(txt);
			}
		}
		
		// XAD.2
		if(atLeastOne(addr.getAdditionalLocators())){
			ADXP stl = (ADXP)addr.getAdditionalLocators().get(0);
			String txt = processMixed(stl.getMixed());
			if(txt.length() > 0){
				xad.setOtherDesignation(txt);
			}
		}
		
		// XAD.3
		if(atLeastOne(addr.getCities())){
			ADXP stl = (ADXP)addr.getCities().get(0);
			String txt = processMixed(stl.getMixed());
			if(txt.length() > 0){
				xad.setCity(txt);
			}
		}
		
		// XAD.4
		if(atLeastOne(addr.getStates())){
			ADXP stl = (ADXP)addr.getStates().get(0);
			String txt = processMixed(stl.getMixed());
			if(txt.length() > 0){
				xad.setStateOrProvince(txt);
			}
		}
		
		// XAD.5
		if(atLeastOne(addr.getPostalCodes())){
			ADXP stl = (ADXP)addr.getPostalCodes().get(0);
			String txt = processMixed(stl.getMixed());
			if(txt.length() > 0){
				xad.setZipOrPostalCode(txt);
			}
		}
		
		// XAD.6
		if(atLeastOne(addr.getCounties())){
			ADXP stl = (ADXP)addr.getCounties().get(0);
			String txt = processMixed(stl.getMixed());
			if(txt.length() > 0){
				
				// TODO code validation with ISO two letter country codes
				// corresponding HL7 table is 399
			/*	HL7Table0399Type value = HL7Table0399Type.get(txt.toUpperCase());
				if(value == null && txt != null){
					logger.warn(MetadataExtractionStatus.INVALID_VOCAB
							+ txt + " (" +HL7Table0399Type.class + ")");
					value = HL7Table0399Type.getUnknownLiteral(txt);
				}*/
				
				xad.setCountry(txt);
			}
		}
		
		// XAD.9
		// TODO possibly enable at a later date when IHE metadata is more flexible
		// can be useful for pubic health
	/*	if(atLeastOne(addr.getCounty())){
			ADXP stl = (ADXP)addr.getCounty().get(0);
			String txt = processMixed(stl.getMixed());
			if(txt.length() > 0){
				xad.setCountyParishCode(txt);
			}
		}*/

		return xad;
	}
	
	
	
	
}