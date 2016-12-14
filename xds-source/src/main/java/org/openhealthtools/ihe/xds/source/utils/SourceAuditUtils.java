/*******************************************************************************
 * Copyright (c) 2008,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds.source.utils;

import org.openhealthtools.ihe.atna.auditor.codes.rfc3881.RFC3881EventCodes.RFC3881EventOutcomeCodes;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.response.XDSStatusType;
import org.openhealthtools.ihe.xds.source.AbstractSource;
import org.openhealthtools.ihe.xds.source.B_Source;
import org.openhealthtools.ihe.xds.source.Source;
import org.openhealthtools.ihe.xds.source.SubmitTransactionData;
import org.openhealthtools.ihe.xds.utils.XDSUtils;

/**
 * Collection of audit utilities for use with XDS Document Source
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public final class SourceAuditUtils 
{
	/**
	 * Audit Actor Start Event
	 * @param impl XDS Source implementation to use
	 */
	public static void auditActorStart(AbstractSource impl)
	{
		impl.getAuditor().auditActorStartEvent(RFC3881EventOutcomeCodes.SUCCESS, impl.getActorName(), null);
	}
	
	/**
	 * Audit Actor Stop Event
	 * @param impl XDS Source implementation to use
	 */
	public static void auditActorStop(AbstractSource impl)
	{
		impl.getAuditor().auditActorStopEvent(RFC3881EventOutcomeCodes.SUCCESS, impl.getActorName(), null);
	}

	/**
	 * Audit a PHI Import event for Provide And Register Document Set (ITI-15) / 
	 * Provide and Register Document Set -b (ITI-41).
	 * 
	 * @param impl XDS Source implementation to use
	 * @param txnData Provide And Register request metadata to read from
	 * @param responseObject Provide and Register response metadata to read from
	 */
	public static void auditProvideAndRegister(AbstractSource impl, SubmitTransactionData txnData, XDSResponseType responseObject)
	{
		// Lookup outcome code
		RFC3881EventOutcomeCodes outcome = getAuditOutcomeFromXDSResponse(responseObject);
		
		// Get data
		String repositoryUrl = impl.getRepositoryURI().toString();
		String submissionSetUniqueId = txnData.getSubmissionSet().getUniqueId();
		String formattedPatientId = XDSUtils.getStringFormattedPatientId(txnData.getSubmissionSet().getPatientId());
		
		// Audit correct transaction based o nimplementation
		if (impl instanceof Source) {
			impl.getAuditor().auditProvideAndRegisterDocumentSetEvent(outcome, repositoryUrl, submissionSetUniqueId, formattedPatientId);
		} else if (impl instanceof B_Source) {
			impl.getAuditor().auditProvideAndRegisterDocumentSetBEvent(outcome, repositoryUrl, submissionSetUniqueId, formattedPatientId);
		} else {
			// no auditor supported
		}
	}
	
	/**
	 * Look up an RFC-3881-defined Event Outcome Indicator code based on an XDS Response code
	 *  - XDS Success = RFC 3881 Success<br />
	 *  - XDS Partial Success = RFC 3881 Minor Failure<br />
	 *  - XDS Failure or worse = RFC 3881 Serious Failure
	 * @param responseObject XDS Response metadata to use
	 * @return RFC-3881 Event Outcome Indicator code for the XDS response metadata
	 */
	public static RFC3881EventOutcomeCodes getAuditOutcomeFromXDSResponse(XDSResponseType responseObject) 
	{
		RFC3881EventOutcomeCodes outcome = null;
		if (responseObject != null && responseObject.getStatus() != null) {
			if (responseObject.getStatus().equals(XDSStatusType.SUCCESS_LITERAL)) {
				outcome = RFC3881EventOutcomeCodes.SUCCESS;
			} else if (responseObject.getStatus().equals(XDSStatusType.PARTIAL_SUCCESS_LITERAL)) {
				outcome = RFC3881EventOutcomeCodes.MINOR_FAILURE;
			} else {
				outcome = RFC3881EventOutcomeCodes.SERIOUS_FAILURE;
			}
		} else {
			outcome = RFC3881EventOutcomeCodes.SERIOUS_FAILURE;
		}
		return outcome;
	}
	

}
