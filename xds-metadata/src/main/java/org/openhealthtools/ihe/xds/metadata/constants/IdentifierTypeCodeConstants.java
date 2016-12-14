/* Copyright (c) <2016>, <Radiological Society of North America>
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of the <RSNA> nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
 * OF SUCH DAMAGE.
 */
package org.openhealthtools.ihe.xds.metadata.constants;

/**
 * Constants for CXi type codes
 *
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE
 * Technical Framework</a>
 * @author Wyatt Tellis
 * @since 2.0.3
 * @version 2.0.3
 */
public interface IdentifierTypeCodeConstants
{
	/**
	 * This code shall be used when the identifier is a uniqueID from Document
	 * Sharing metadata attribute.
	 */
	String UNIQUE_ID = "urn:ihe:iti:xds:2013:uniqueId";

	/**
	 * This code shall be used when the identifier is an accession number.
	 */
	String ACCESSION_NUMBER = "urn:ihe:iti:xds:2013:accession";

	/**
	 * This code shall be used when the identifier is a referral number.
	 */
	String REFERAL_NUMBER = "urn:ihe:iti:xds:2013:referral";

	/**
	 * This code shall be used when the identifier is an order number.
	 */
	String ORDER_NUMBER = "urn:ihe:iti:xds:2013:order";

	/**
	 * This code shall be used when the identifier is an XDW workflow 
	 * identifier 
	 */
	String WORKFLOW_INSTANCE_ID = "urn:ihe:iti:xdw:2013:workflowInstanceId";
	
	/**
	 * This code shall be used when the identifier is a DICOM Study Instance UID 
	 */
	String STUDY_INSTANCE_UID = "urn:ihe:iti:xds:2016:studyInstanceUID";
	
	/**
	 * This code shall be used when the identifier is an encounter (or visit) id
	 */
	String ENCOUNTER_ID = "urn:ihe:iti:xds:2015:encounterId";
}
