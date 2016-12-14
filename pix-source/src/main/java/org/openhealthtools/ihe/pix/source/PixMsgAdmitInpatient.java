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
import org.openhealthtools.ihe.common.hl7v2.message.HL7_Constants;

/**
 * <p>ADT_A01 Admission of an in-patient into a facility</p>
 * 
 * @author <a href="mailto:srrenly@us.ibm.com">Sondra Renly</a>
 */

public class PixMsgAdmitInpatient extends PixMsgADT {
	
	
	///////////////////////////
	// VARIABLE DECLARATIONS //
	///////////////////////////
	
	/**
	 * Debug,Info,Error,Fatal log
	 */
    private static Logger logger = Logger.getLogger(PixMsgAdmitInpatient.class);
    
    /**
     * IHE PixFeed ADT_A01 Referenced Standard
     */
    private static final int version = VersionDefnList.hv231;

	
	//////////////////
	// CONSTRUCTORS //
	//////////////////
	
    /**
     * Create ADT_A01 Admit Inpatient
     * 
     * @param globalFactory - message manager from hl7v2.core
     * @param cpProfile - conformance profile for validation
     * @param patientId
     * @param namespaceId      (assigningAuthority > namespaceId)
     * @param universalId      (assigningAuthority > universalId)
     * @param universalIdType  (assigningAuthority > universalIdType) 
     * @throws PixSourceException
     */    		
	public PixMsgAdmitInpatient(MessageManager globalFactory, CPConformanceProfile cpProfile, String patientId, String namespaceId, String universalId, String universalIdType) throws PixSourceException {
		super(globalFactory, cpProfile, version, HL7_Constants.MSH_9_2_PIXS_A01, patientId, namespaceId, universalId, universalIdType);
		nodeType = Item.NODE_TYPE_MESSAGE;
		createA01Fields();
	}
	
	
	/////////////////////
	// PRIVATE METHODS //
	/////////////////////
	
	/**
	 * A01 specific defaults for message object determined by PIX profile
	 * 
	 * @throws PixSourceException
	 */
	private void createA01Fields() throws PixSourceException {
		
		//nothing here now
		
		if (logger.isDebugEnabled()) {
			logger.debug("PixMsgAdmitPatient: createA01Fields ");
		}
	}
	
}
