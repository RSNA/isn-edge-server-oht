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

import org.apache.log4j.Logger;
import org.eclipse.ohf.hl7v2.core.definitions.model.VersionDefnList;
import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.model.Segment;
import org.eclipse.ohf.hl7v2.core.message.model.SegmentList;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessage;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;

/**
 * ACK ADT Acknowledgement
 * 
 * IHE HL7 Segments: MSH,MSA,ERR
 * IHE HL7 Standard: HL7 2.3.1
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class PixSourceResponse extends PixPdqMessage {

	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(PixSourceResponse.class);
         
    /**
     * Indicator that response has an optional error segment
     */
    private boolean hasERR = false;
        
    /**
     * IHE PIX Consumer Referenced Standard
     */
    private static final int version = VersionDefnList.hv231;
    

	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
    /**
     * Constructs a PIX response message.
     * @param globalFactory - message manager
     * @throws PixSourceException
     */
	public PixSourceResponse(MessageManager globalFactory) throws PixSourceException {
		super();
		try {
			this.setDefinitions(globalFactory.getVersionDefinitions());
			this.setVersion(version);
		} catch (HL7V2Exception e) {
			throw new PixSourceException(e);
		}

	}
	
	
	////////////////////
	// PUBLIC METHODS //
	////////////////////
	
	/**
	 * Initialize message object structures after data loads.
	 */
	public void init() {
		
		SegmentList segList = this.getSegments();
		for (int i=0; i < segList.size(); i ++) {
			if (hasERR == false && segList.item(i).getCode().compareTo(ERR) == 0) {
				hasERR = true;
				if (logger.isDebugEnabled()) {
					logger.debug("PixSourceResponse: init - found error segment in pix source response ");
				}
			}
		}
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
	 * @throws PixSourceException
	 */
	public String getResponseAckCode(boolean expandString) throws PixSourceException {

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
			throw new PixSourceException(e);
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
	 * @throws PixSourceException
	 */
	public String getControlId() throws PixSourceException {
		
		Segment seg = getSegments().getByCodeAndIndex(MSA, 1);
		int fieldIndex = 1;
		
		try {
			return seg.forceField(fieldIndex).getAsString();
		} catch (HL7V2Exception e) {
			throw new PixSourceException(e);
		}
	}
	
	/**
	 * Response contains 1 or more errors.
	 * @return hasERR
	 */
	public boolean hasError() {
		return hasERR;
	}
	
	/**
	 * The number of errors found in the response using segments.
	 * @return count
	 */
	public int getErrorCountBySegment() {
		
		if (!hasERR) {
			return -1;
		}
		return getSegments().countByCode(ERR);
	}
	
	/**
	 * The number of errors found in the response using repeats.
	 * @return count
	 */
	public int getErrorCountByRepeat() {
		
		if (!hasERR) {
			return -1;
		}
		try {
			return getSegments().getByCodeAndIndex(ERR, 1).getFields().item(0).getNonEmptyCount();
		} catch (HL7V2Exception e) {
			return -1;
		}
	}
	
	/**
	 * ERR-1 HL7 Error Code and Location (type CM)
	 * 
	 * @param segmentIndex - (0 - response.getErrorCountBySegment()-1)
	 * @param repeatIndex  - (0 - response.getErrorCountByRepeat()-1)
	 * @return error code can contain:
	 *         String[0] - ??
	 *         String[1] - ??
	 * 	       String[2] - ??
	 *         String[3] - ??
	 * 
	 * @throws PixSourceException
	 */
	public String[] getErrorCodeAndLocation(int segmentIndex, int repeatIndex) throws PixSourceException {
		
		if (hasERR == false) {
			return null;
		}
		Segment seg = getSegments().getByCodeAndIndex(ERR, segmentIndex+1);
		int fieldIndex = 0;
		
		try {
			return PixPdqMessageUtilities.getFieldComponentsInRepeat(seg, fieldIndex, repeatIndex);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}
	}

}

