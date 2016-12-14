/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.atna.auditor.events.ihe;

import org.openhealthtools.ihe.atna.auditor.codes.dicom.DICOMEventIdCodes;
import org.openhealthtools.ihe.atna.auditor.codes.ihe.IHETransactionEventTypeCodes;
import org.openhealthtools.ihe.atna.auditor.codes.rfc3881.RFC3881EventCodes;
import org.openhealthtools.ihe.atna.auditor.codes.rfc3881.RFC3881EventCodes.RFC3881EventOutcomeCodes;

/**
 * Audit Event representing a DICOM 95 Import event (DCM 110107)
 * with customizations for use in IHE ATNA.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public class ImportEvent extends GenericIHEAuditEventMessage
{
	/**
	 * Creates an IMport event for a given event outcome and 
	 * IHE transaction
	 * 
	 * @param systemIsSource Whether the generating is the source participant
	 * @param outcome Event outcome indicator
	 * @param eventType The IHE Transaction for this event
	 */
	public ImportEvent(boolean systemIsSource, RFC3881EventOutcomeCodes outcome, IHETransactionEventTypeCodes eventType)
	{
		super(  systemIsSource,
				outcome, 
				RFC3881EventCodes.RFC3881EventActionCodes.CREATE,
				new DICOMEventIdCodes.Import(),
				eventType
		);
	}

}
