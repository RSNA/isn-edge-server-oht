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
import org.eclipse.ohf.hl7v2.core.conformance.model.CPConformanceProfile;
import org.eclipse.ohf.hl7v2.core.definitions.model.VersionDefnList;
import org.eclipse.ohf.hl7v2.core.message.MessageManager;
import org.eclipse.ohf.hl7v2.core.message.model.Item;
import org.eclipse.ohf.hl7v2.core.utilities.HL7V2Exception;
import org.openhealthtools.ihe.common.hl7v2.message.HL7_Constants;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageException;
import org.openhealthtools.ihe.common.hl7v2.message.PixPdqMessageUtilities;

/**
 * <p>ADT_A40 Merge Patient Internal ID</p>
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class PixMsgMergePatient extends PixMsgADT {
	
	
	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(PixMsgMergePatient.class);
    
    /**
     * IHE PixFeed ADT_A40 Referenced Standard
     */
    private static final int version = VersionDefnList.hv231;

	
	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
    /**
     * Create ADT_A40 Merge Patient
     * @param globalFactory - message manager from hl7v2.core
     * @param cpProfile - conformance profile for validation
     * @param patientId - patient Id
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @param patientClass - patient's class (I inpatient, O outpatient, E emergency, ...)
     * @param priorPatientId - patient's Id to merge with same assigningAuthority as patient
     * @throws PixSourceException
     */
	public PixMsgMergePatient(MessageManager globalFactory, CPConformanceProfile cpProfile, String patientId, String namespaceId, String universalId, String universalIdType, String patientClass, String priorPatientId) throws PixSourceException {
		super(globalFactory, cpProfile, version, HL7_Constants.MSH_9_2_PIXS_A40, patientId, namespaceId, universalId, universalIdType);
		nodeType = Item.NODE_TYPE_MESSAGE;
		createA40Fields(patientClass, priorPatientId, namespaceId, universalId, universalIdType);
	}
	
	/////////////////////
	// PRIVATE METHODS //
	/////////////////////
	
	/**
	 * A40 specific defaults for message object determined by PIX profile
	 * 
	 * @param patientClass - patient's class (I inpatient, O outpatient, E emergency, ...)
	 * @param priorPatientId - patient's Id to merge
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
	 * @throws PixSourceException
	 */
	private void createA40Fields(String patientClass, String priorPatientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
							
		try {
			getSegments().add(MRG);
			setField(MRG_1_1, priorPatientId);
			if (PixPdqMessageUtilities.isHDParamValid(namespaceId, universalId, universalIdType)) {
				setField(MRG_1_4_1, namespaceId);
				setField(MRG_1_4_2, universalId);
				setField(MRG_1_4_3, universalIdType);
			} else {
				throw new PixSourceException("PixMsgMergePatient: createA40Fields - "  + namespaceId + ", " + universalId + ", " + universalIdType + " invalid parameter combination ");
			}
			getSegments().add(PV1);
			setField(PV1_2, patientClass);
		} catch (HL7V2Exception e) {
			throw new PixSourceException(e);
		} catch (PixPdqMessageException e) {
			throw new PixSourceException(e);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgMergePatient: createA40Fields ");
		}
	}
	
}
