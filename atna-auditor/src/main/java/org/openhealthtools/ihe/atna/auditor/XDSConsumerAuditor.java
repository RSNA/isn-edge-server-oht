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

import java.util.Arrays;

import org.openhealthtools.ihe.atna.auditor.codes.ihe.IHETransactionEventTypeCodes;
import org.openhealthtools.ihe.atna.auditor.codes.rfc3881.RFC3881EventCodes.RFC3881EventOutcomeCodes;
import org.openhealthtools.ihe.atna.auditor.context.AuditorModuleContext;
import org.openhealthtools.ihe.atna.auditor.events.ihe.ImportEvent;
import org.openhealthtools.ihe.atna.auditor.utils.EventUtils;

/**
 * Implementation of a XDS Auditor to send audit messages for
 * transactions under the consumer-side actors in
 * the Cross-Enterprise Document Sharing (XDS) profile, notably
 * the XDS Document Consumer.
 * 
 * Supports sending ATNA Audit messages for the following IHE transactions:
 *  - ITI-16 Registry SQL Query
 *  - ITI-17 Retrieve Document
 *  - ITI-18 Registry Stored Query
 *  - ITI-43 Retrieve Document Set
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class XDSConsumerAuditor extends XDSAuditor
{
	/**
	 * Get an instance of the XDS Document Consumer Auditor from the 
	 * global context
	 * 
	 * @return XDS Document Consumer Auditor instance
	 */
	public static XDSConsumerAuditor getAuditor()
	{
		AuditorModuleContext ctx = AuditorModuleContext.getContext();
		return (XDSConsumerAuditor)ctx.getAuditor(XDSConsumerAuditor.class);
	}
	
	/**
	 * Audits an ITI-16 Registry Query event for XDS.a Document Consumer actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param registryEndpointUri The endpoint of the registry in this transaction
	 * @param adhocQueryRequestPayload The payload of the adhoc query request element
	 * @param patientId The patient ID queried (if query pertained to a patient id)
	 */
	public void auditRegistryQueryEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String registryEndpointUri, 
			String adhocQueryRequestPayload,
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditQueryEvent(true, 
				new IHETransactionEventTypeCodes.RegistrySQLQuery(), eventOutcome, 
				getAuditSourceId(), getAuditEnterpriseSiteId(),
				getSystemUserId(), getSystemAltUserId(), getSystemUserName(), getSystemNetworkId(),
				getHumanRequestor(),
				registryEndpointUri, null,
				"", adhocQueryRequestPayload, "", 
				patientId);

	}

	/**
	 * Audits an ITI-18 Registry Stored Query event for XDS.a and XDS.b Document Consumer actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param registryEndpointUri The endpoint of the registry in this transaction
	 * @param storedQueryUUID The UUID of the stored query
	 * @param adhocQueryRequestPayload The payload of the adhoc query request element
	 * @param homeCommunityId The home community id of the transaction (if present)
	 * @param patientId The patient ID queried (if query pertained to a patient id)
	 */
	public void auditRegistryStoredQueryEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String registryEndpointUri, 
			String storedQueryUUID, String adhocQueryRequestPayload, String homeCommunityId,
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		
		/*
		 * FIXME:  Overriding endpoint URI with "anonymous", for now
		 */
		String replyToUri = "http://www.w3.org/2005/08/addressing/anonymous";
		//String replyToUri = getSystemUserId();
		
		if (patientId != null && patientId.length() > 0) { 
			auditQueryEvent(true, 
					new IHETransactionEventTypeCodes.RegistryStoredQuery(), eventOutcome, 
					getAuditSourceId(), getAuditEnterpriseSiteId(),
					replyToUri, getSystemAltUserId(), getSystemUserName(), getSystemNetworkId(),
					getHumanRequestor(),
					registryEndpointUri, null,
					storedQueryUUID, adhocQueryRequestPayload, homeCommunityId, 
					patientId);
		} else {
			auditQueryEvent(true, 
					new IHETransactionEventTypeCodes.MultiPatientStoredQuery(), eventOutcome, 
					getAuditSourceId(), getAuditEnterpriseSiteId(),
					replyToUri, getSystemAltUserId(), getSystemUserName(), getSystemNetworkId(),
					getHumanRequestor(),
					registryEndpointUri, null,
					storedQueryUUID, adhocQueryRequestPayload, homeCommunityId, 
					patientId);
		}
	}


	/**
	 * Audits an ITI-17 Retrieve Document event for XDS.a Document Consumer actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryRetrieveUri The URI of the document being retrieved
	 * @param documentUniqueId The Document Entry Unique ID of the document being retrieved (if known)
	 * @param patientId The patient ID the document relates to (if known)
	 */
	public void auditRetrieveDocumentEvent(RFC3881EventOutcomeCodes eventOutcome,
			String repositoryRetrieveUri, 
			String documentUniqueId,
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		ImportEvent importEvent = new ImportEvent(false, eventOutcome, new IHETransactionEventTypeCodes.RetrieveDocument());
		importEvent.setAuditSourceId(getAuditSourceId(), getAuditEnterpriseSiteId());
		importEvent.addSourceActiveParticipant(repositoryRetrieveUri, null, null, EventUtils.getAddressForUrl(repositoryRetrieveUri, false), false);
		importEvent.addDestinationActiveParticipant(getSystemUserId(), getSystemAltUserId(), getSystemUserName(), getSystemNetworkId(), true);
		if (!EventUtils.isEmptyOrNull(getHumanRequestor())) {
			importEvent.addHumanRequestorActiveParticipant(getHumanRequestor(), null, null, null);
		}
		if (!EventUtils.isEmptyOrNull(patientId)) {
			importEvent.addPatientParticipantObject(patientId);
		}
		importEvent.addDocumentUriParticipantObject(repositoryRetrieveUri, documentUniqueId);
		audit(importEvent);
		
	}

	/**
	 * Audits an ITI-43 Retrieve Document Set event for XDS.b Document Consumer actors.
	 * Sends audit messages for situations when exactly one repository and zero or one community are specified in the transaction.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryEndpointUri The Web service endpoint URI for the document repository
	 * @param documentUniqueIds The list of Document Entry UniqueId(s) for the document(s) retrieved
	 * @param repositoryUniqueId The XDS.b RepositoryUniqueId value for the repository
	 * @param homeCommunityId The XCA Home Community Id used in the transaction
	 * @param patientId The patient ID the document(s) relate to (if known)
	 */	
	public void auditRetrieveDocumentSetEvent(RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryEndpointUri, 
			String[] documentUniqueIds, String repositoryUniqueId, String homeCommunityId, 
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		
		String[] repositoryUniqueIds = null;
		if (!EventUtils.isEmptyOrNull(documentUniqueIds)) {
			repositoryUniqueIds = new String[documentUniqueIds.length];
			Arrays.fill(repositoryUniqueIds, repositoryUniqueId);
		}
		
		auditRetrieveDocumentSetEvent(eventOutcome, repositoryEndpointUri, documentUniqueIds, repositoryUniqueIds, homeCommunityId, patientId);
	}
	
	/**
	 * Audits an ITI-43 Retrieve Document Set event for XDS.b Document Consumer actors.
	 * Sends audit messages for situations when more than one repository and zero or one community are specified in the transaction.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryEndpointUri The Web service endpoint URI for the document repository
	 * @param documentUniqueIds The list of Document Entry UniqueId(s) for the document(s) retrieved
	 * @param repositoryUniqueIds The list of XDS.b Repository Unique Ids involved in this transaction (aligned with Document Unique Ids array)
	 * @param homeCommunityId The XCA Home Community Id used in the transaction
	 * @param patientId The patient ID the document(s) relate to (if known)
	 */
	public void auditRetrieveDocumentSetEvent(RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryEndpointUri, 
			String[] documentUniqueIds, String[] repositoryUniqueIds, String homeCommunityId, 
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		
		String[] homeCommunityIds = null;
		if (!EventUtils.isEmptyOrNull(documentUniqueIds)) {
			homeCommunityIds = new String[documentUniqueIds.length];
			Arrays.fill(homeCommunityIds, homeCommunityId);
		}
		
		auditRetrieveDocumentSetEvent(eventOutcome, repositoryEndpointUri, documentUniqueIds, repositoryUniqueIds, homeCommunityIds, patientId);
	}
	
	/**
	 * Audits an ITI-43 Retrieve Document Set event for XDS.b Document Consumer actors.
	 * Sends audit messages for situations when more than one repository and more than one community are specified in the transaction.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryEndpointUri The Web service endpoint URI for the document repository
	 * @param documentUniqueIds The list of Document Entry UniqueId(s) for the document(s) retrieved
	 * @param repositoryUniqueIds The list of XDS.b Repository Unique Ids involved in this transaction (aligned with Document Unique Ids array)
	 * @param homeCommunityIds The list of XCA Home Community Ids involved in this transaction (aligned with Document Unique Ids array)
	 * @param patientId The patient ID the document(s) relate to (if known)
	 */
	public void auditRetrieveDocumentSetEvent(RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryEndpointUri, 
			String[] documentUniqueIds, String[] repositoryUniqueIds, String[] homeCommunityIds, 
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		ImportEvent importEvent = new ImportEvent(false, eventOutcome, new IHETransactionEventTypeCodes.RetrieveDocumentSet());
		importEvent.setAuditSourceId(getAuditSourceId(), getAuditEnterpriseSiteId());
		importEvent.addSourceActiveParticipant(repositoryEndpointUri, null, null, EventUtils.getAddressForUrl(repositoryEndpointUri, false), false);
		/*
		 * FIXME:  Overriding endpoint URI with "anonymous", for now
		 */
		String replyToUri = "http://www.w3.org/2005/08/addressing/anonymous";
		importEvent.addDestinationActiveParticipant(replyToUri, getSystemAltUserId(), getSystemUserName(), getSystemNetworkId(), true);
		if (!EventUtils.isEmptyOrNull(getHumanRequestor())) {
			importEvent.addHumanRequestorActiveParticipant(getHumanRequestor(), null, null, null);
		}
		if (!EventUtils.isEmptyOrNull(patientId)) {
			importEvent.addPatientParticipantObject(patientId);
		}
		if (!EventUtils.isEmptyOrNull(documentUniqueIds)) {
			for (int i=0; i<documentUniqueIds.length; i++) {
				importEvent.addDocumentParticipantObject(documentUniqueIds[i], repositoryUniqueIds[i], homeCommunityIds[i]);
			}
		}
		audit(importEvent);
	}
}
