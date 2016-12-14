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
package org.openhealthtools.ihe.atna.auditor;

import org.openhealthtools.ihe.atna.auditor.codes.ihe.IHETransactionEventTypeCodes;
import org.openhealthtools.ihe.atna.auditor.codes.rfc3881.RFC3881EventCodes.RFC3881EventOutcomeCodes;
import org.openhealthtools.ihe.atna.auditor.context.AuditorModuleContext;
import org.openhealthtools.ihe.atna.auditor.events.ihe.ImportEvent;
import org.openhealthtools.ihe.atna.auditor.utils.EventUtils;

/**
 * Implementation of a XDS Auditor to send audit messages for
 * transactions under the server-side actors in
 * the Cross-Enterprise Document Sharing (XDS) profile, notably
 * the XDS Document Registry.
 * 
 * Supports sending ATNA Audit messages for the following IHE transactions:
 *  - ITI-14 Register Document Set
 *  - ITI-16 Registry SQL Query
 *  - ITI-18 Registry Stored Query
 *  - ITI-42 Register Document Set-b
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class XDSRegistryAuditor extends XDSAuditor
{
	/**
	 * Get an instance of the XDS Document Registry Auditor from the 
	 * global context
	 * 
	 * @return XDS Document Registry Auditor instance
	 */
	public static XDSRegistryAuditor getAuditor()
	{
		AuditorModuleContext ctx = AuditorModuleContext.getContext();
		return (XDSRegistryAuditor)ctx.getAuditor(XDSRegistryAuditor.class);
	}
	
	/**
	 * Audits an ITI-14 Register Document Set event for XDS.a Document Registry actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryUserId The Active Participant UserID for the repository (if using WS-Addressing)
	 * @param repositoryIpAddress The IP Address of the repository that initiated the transaction
	 * @param registryEndpointUri The URI of this registry's endpoint that received the transaction
	 * @param submissionSetUniqueId The UniqueID of the Submission Set registered
	 * @param patientId The Patient Id that this submission pertains to
	 */
	public void auditRegisterDocumentSetEvent(
			RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryUserId, String repositoryIpAddress,
			String registryEndpointUri,
			String submissionSetUniqueId, 
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditRegisterEvent(new IHETransactionEventTypeCodes.RegisterDocumentSet(), eventOutcome, repositoryUserId, repositoryIpAddress, registryEndpointUri, submissionSetUniqueId, patientId);
	}

	/**
	 * Audits an ITI-16 Registry SQL Query event for XDS.a Document Registry actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param consumerUserId The Active Participant UserID for the consumer (if using WS-Addressing)
	 * @param consumerUserName The Active Participant UserName for the consumer (if using WS-Security / XUA)
	 * @param consumerIpAddress The IP Address of the consumer that initiated the transaction
	 * @param registryEndpointUri The URI of this registry's endpoint that received the transaction
	 * @param adhocQueryRequestPayload The payload of the adhoc query request element
	 * @param patientId The patient ID queried (if query pertained to a patient id)
	 */
	public void auditRegistryQueryEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String consumerUserId, String consumerUserName, String consumerIpAddress,
			String registryEndpointUri, 
			String adhocQueryRequestPayload,
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditQueryEvent(false, 
				new IHETransactionEventTypeCodes.RegistrySQLQuery(), eventOutcome, 
				getAuditSourceId(), getAuditEnterpriseSiteId(), 
				consumerUserId, null, consumerUserName, consumerIpAddress, 
				null,
				registryEndpointUri, getSystemAltUserId(), 
				"", adhocQueryRequestPayload, "", 
				patientId);
	}

	/**
	 * Audits an ITI-18 Registry Stored Query event for XDS.a and XDS.b Document Registry actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param consumerUserId The Active Participant UserID for the consumer (if using WS-Addressing)
	 * @param consumerUserName The Active Participant UserName for the consumer (if using WS-Security / XUA)
	 * @param consumerIpAddress The IP Address of the consumer that initiated the transaction
	 * @param registryEndpointUri The URI of this registry's endpoint that received the transaction
	 * @param storedQueryUUID The UUID of the stored query
	 * @param adhocQueryRequestPayload The payload of the adhoc query request element
	 * @param homeCommunityId The home community id of the transaction (if present)
	 * @param patientId The patient ID queried (if query pertained to a patient id)
	 */
	public void auditRegistryStoredQueryEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String consumerUserId, String consumerUserName, String consumerIpAddress,
			String registryEndpointUri, 
			String storedQueryUUID, String adhocQueryRequestPayload, String homeCommunityId,
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditQueryEvent(false, 
				new IHETransactionEventTypeCodes.RegistryStoredQuery(), eventOutcome, 
				getAuditSourceId(), getAuditEnterpriseSiteId(), 
				consumerUserId, null, consumerUserName, consumerIpAddress, 
				null,
				registryEndpointUri, getSystemAltUserId(), 
				storedQueryUUID, adhocQueryRequestPayload, homeCommunityId, 
				patientId);
	}

	/**
	 * Audits an ITI-42 Register Document Set-b event for XDS.b Document Registry actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryUserId The Active Participant UserID for the repository (if using WS-Addressing)
	 * @param repositoryIpAddress The IP Address of the repository that initiated the transaction
	 * @param registryEndpointUri The URI of this registry's endpoint that received the transaction
	 * @param submissionSetUniqueId The UniqueID of the Submission Set registered
	 * @param patientId The Patient Id that this submission pertains to
	 */
	public void auditRegisterDocumentSetBEvent(
			RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryUserId, String repositoryIpAddress,
			String registryEndpointUri,
			String submissionSetUniqueId, 
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditRegisterEvent(new IHETransactionEventTypeCodes.RegisterDocumentSetB(), eventOutcome, repositoryUserId, repositoryIpAddress, registryEndpointUri, submissionSetUniqueId, patientId);
	}
	
	/**
	 * Generically sends audit messages for XDS Document Registry Register Document Set events
	 * 
	 * @param transaction The specific IHE Transaction (ITI-15 or ITI-41)
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryUserId The Active Participant UserID for the repository (if using WS-Addressing)
	 * @param repositoryIpAddress The IP Address of the repository that initiated the transaction
	 * @param registryEndpointUri The URI of this registry's endpoint that received the transaction
	 * @param submissionSetUniqueId The UniqueID of the Submission Set provided
	 * @param patientId The Patient Id that this submission pertains to
	 */
	protected void auditRegisterEvent(
			IHETransactionEventTypeCodes transaction, RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryUserId, String repositoryIpAddress,
			String registryEndpointUri,
			String submissionSetUniqueId, 
			String patientId)
	{
		ImportEvent importEvent = new ImportEvent(false, eventOutcome, transaction);
		importEvent.setAuditSourceId(getAuditSourceId(), getAuditEnterpriseSiteId());
		importEvent.addSourceActiveParticipant(repositoryUserId, null, null, repositoryIpAddress, true);
		importEvent.addDestinationActiveParticipant(registryEndpointUri, getSystemAltUserId(), null, EventUtils.getAddressForUrl(registryEndpointUri, false), false);
		if (!EventUtils.isEmptyOrNull(patientId)) {
			importEvent.addPatientParticipantObject(patientId);
		}
		importEvent.addSubmissionSetParticipantObject(submissionSetUniqueId);		
		
		audit(importEvent);
	}
}
