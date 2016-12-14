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

package org.openhealthtools.ihe.xds.metadata.extract;

import java.util.List;

import org.openhealthtools.ihe.common.hl7v2.CX;
import org.openhealthtools.ihe.common.hl7v2.SourcePatientInfoType;
import org.openhealthtools.ihe.common.hl7v2.XCN;
import org.openhealthtools.ihe.xds.metadata.AuthorType;
import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.CodedMetadataType;
import org.openhealthtools.ihe.xds.metadata.ExtensionType;
import org.openhealthtools.ihe.xds.metadata.InternationalStringType;
import org.openhealthtools.ihe.xds.metadata.ParentDocumentType;


/**
 * Implementations of this interface will extract data from the
 * associated source format and produce individual elements of the
 * Document Entry metadata.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public interface DocumentEntryElementExtractor {
	// SEK - changed single author to author list 10/20/2011
	/**
	 * Populates the author list using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public List<AuthorType> extractAuthors();
	
	/**
	 * Populates the availabilityStatus using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public AvailabilityStatusType extractAvailabilityStatus();
	
	/**
	 * Populates the classCode using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CodedMetadataType extractClassCode();
	
	/**
	 * Populates the comments using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public InternationalStringType extractComments();
	
	/**
	 * Populates the confidentialityCodes using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CodedMetadataType[] extractConfidentialityCodes();

	/**
	 * Populates the creationTime using information
	 * from the associated source data. This time is to be in UTC, but 
	 * without the timezone offset or fractional seconds: [[[[[YYYY]MM]DD]HH]mm]ss]. 
	 * Thus, this time is assumed to be in GMT.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractCreationTime();

	/**
	 * Populates the entryUUID using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractEntryUUID();
	
	/**
	 * Populates the eventCodes using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CodedMetadataType[] extractEventCodes();
	
	
	/**
	 * Populates the extensions (if any) using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public ExtensionType[] extractExtensions();
	
	/**
	 * Populates the formatCode using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CodedMetadataType extractFormatCode();
	
	/**
	 * Populates the hash using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractHash();
	
	/**
	 * Populates the healthcareFacilityTypeCode using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CodedMetadataType extractHealthCareFacilityTypeCode();
	
	/**
	 * Populates the languageCode using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractLanguageCode();
	
	/**
	 * Populates the legalAuthenticator using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public XCN extractLegalAuthenticator();
	
	/**
	 * Populates the mimeType using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractMimeType();
	
	/**
	 * Populates the parentDocument using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public ParentDocumentType extractParentDocument();
	
	/**
	 * Populates the patientId using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CX extractPatientId();
	
	/**
	 * Populates the practiceSettingCode using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CodedMetadataType extractPracticeSettingCode();
	
	/**
	 * Populates the repositoryUniqueId using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractRepositoryUniqueId();
	
	/**
	 * Populates the serviceStartTime using information
	 * from the associated source data. This time is to be in UTC, but 
	 * without the timezone offset or fractional seconds: [[[[[YYYY]MM]DD]HH]mm]ss]. 
	 * Thus, this time is assumed to be in GMT.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractServiceStartTime();
	
	/**
	 * Populates the serviceStopTime using information
	 * from the associated source data. This time is to be in UTC, but 
	 * without the timezone offset or fractional seconds: [[[[[YYYY]MM]DD]HH]mm]ss]. 
	 * Thus, this time is assumed to be in GMT.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractServiceStopTime();
	
	/**
	 * Populates the size using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractSize();
	
	/**
	 * Populates the sourcePatientId using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CX extractSourcePatientId();
	
	/**
	 * Populates the sourcePatientInfo using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public SourcePatientInfoType extractSourcePatientInfo();
	
	/**
	 * Populates the title using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public InternationalStringType extractTitle();
	
	/**
	 * Populates the typeCode using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public CodedMetadataType extractTypeCode();
	
	/**
	 * Populates the uniqueId using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractUniqueId();	
	
	/**
	 * Populates the uri using information
	 * from the associated source data.
	 * @return Returns the populated attribute. Returns null if
	 * this attribute cannot be rendered from the source data.
	 */
	public String extractURI();
}
