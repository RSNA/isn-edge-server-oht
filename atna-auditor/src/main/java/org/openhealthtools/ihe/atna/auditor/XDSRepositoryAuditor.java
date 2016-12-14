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
import org.openhealthtools.ihe.atna.auditor.events.ihe.ExportEvent;
import org.openhealthtools.ihe.atna.auditor.events.ihe.ImportEvent;
import org.openhealthtools.ihe.atna.auditor.utils.EventUtils;

/**
 * Implementation of a XDS Auditor to send audit messages for
 * transactions under the server-side actors in
 * the Cross-Enterprise Document Sharing (XDS) profile, notably
 * the XDS Document Repository.
 * 
 * Supports sending ATNA Audit messages for the following IHE transactions:
 *  - ITI-14 Register Document Set
 *  - ITI-15 Provide and Register Document Set
 *  - ITI-17 Retrieve Document
 *  - ITI-41 Provide and Register Document Set-b
 *  - ITI-42 Register Document Set-b
 *  - ITI-43 Retrieve Document Set
 *  
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class XDSRepositoryAuditor extends XDSAuditor
{
	/**
	 * Get an instance of the XDS Document Repository Auditor from the 
	 * global context
	 * 
	 * @return XDS Document Repository Auditor instance
	 */
	public static XDSRepositoryAuditor getAuditor()
	{
		AuditorModuleContext ctx = AuditorModuleContext.getContext();
		return (XDSRepositoryAuditor)ctx.getAuditor(XDSRepositoryAuditor.class);
	}

	/**
	 * Audits an ITI-15 Provide And Register Document Set event for XDS.a Document Repository actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param sourceUserId The Active Participant UserID for the document source (if using WS-Addressing)
	 * @param sourceIpAddress The IP Address of the document source that initiated the transaction
	 * @param repositoryEndpointUri The URI of this repository's endpoint that received the transaction
	 * @param submissionSetUniqueId  The UniqueID of the Submission Set provided
	 * @param patientId The Patient Id that this submission pertains to
	 */
	public void auditProvideAndRegisterDocumentSetEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String sourceUserId, String sourceIpAddress, 
			String repositoryEndpointUri,
			String submissionSetUniqueId,
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditProvideAndRegisterEvent(new IHETransactionEventTypeCodes.ProvideAndRegisterDocumentSet(), eventOutcome, sourceUserId, sourceIpAddress, repositoryEndpointUri, submissionSetUniqueId, patientId);
	}
	
	/**
	 * Audits an ITI-41 Provide And Register Document Set-b event for XDS.b Document Repository actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param sourceUserId The Active Participant UserID for the document source (if using WS-Addressing)
	 * @param sourceIpAddress The IP Address of the document source that initiated the transaction
	 * @param repositoryEndpointUri The URI of this repository's endpoint that received the transaction
	 * @param submissionSetUniqueId  The UniqueID of the Submission Set provided
	 * @param patientId The Patient Id that this submission pertains to
	 */
	public void auditProvideAndRegisterDocumentSetBEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String sourceUserId, String sourceIpAddress, 
			String repositoryEndpointUri,
			String submissionSetUniqueId,
			String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditProvideAndRegisterEvent( new IHETransactionEventTypeCodes.ProvideAndRegisterDocumentSetB(), eventOutcome, sourceUserId, sourceIpAddress, repositoryEndpointUri, submissionSetUniqueId, patientId);
	}

	/**
	 * Audits an ITI-14 Register Document Set event for XDS.a Document Repository actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param registryEndpointUri The endpoint of the registry in this transaction
	 * @param submissionSetUniqueId The UniqueID of the Submission Set registered
	 * @param patientId The Patient Id that this submission pertains to
	 */
	public void auditRegisterDocumentSetEvent(
			RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryUserId,
			String registryEndpointUri,
			String submissionSetUniqueId, String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditRegisterEvent(new IHETransactionEventTypeCodes.RegisterDocumentSet(), eventOutcome, repositoryUserId, registryEndpointUri, submissionSetUniqueId, patientId);
	}

	/**
	 * Audits an ITI-42 Register Document Set-b event for XDS.b Document Repository actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param registryEndpointUri The endpoint of the registry in this transaction
	 * @param submissionSetUniqueId The UniqueID of the Submission Set registered
	 * @param patientId The Patient Id that this submission pertains to
	 */
	public void auditRegisterDocumentSetBEvent(
			RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryUserId,
			String registryEndpointUri,
			String submissionSetUniqueId, String patientId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		auditRegisterEvent(new IHETransactionEventTypeCodes.RegisterDocumentSetB(), eventOutcome, repositoryUserId, registryEndpointUri, submissionSetUniqueId, patientId);
	}
	
	/**
	 * Audits an ITI-17 Retrieve Document event for XDS.a Document Repository actors.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param consumerIpAddress The IP address of the document consumer that initiated the transaction
	 * @param repositoryRetrieveUri The URI that was used to retrieve the document
	 * @param documentUniqueId The Document Entry Unique ID of the document being retrieved (if known)
	 * @param patientId The patient ID the document relates to (if known)
	 */
	public void auditRetrieveDocumentEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String consumerIpAddress, 
			String repositoryRetrieveUri, String documentUniqueId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		ExportEvent exportEvent = new ExportEvent(true, eventOutcome, new IHETransactionEventTypeCodes.RetrieveDocument());
		exportEvent.setAuditSourceId(getAuditSourceId(), getAuditEnterpriseSiteId());
		exportEvent.addSourceActiveParticipant(repositoryRetrieveUri, getSystemAltUserId(), null, EventUtils.getAddressForUrl(repositoryRetrieveUri, false), false);
		exportEvent.addDestinationActiveParticipant(consumerIpAddress, null, null, consumerIpAddress, true);
		//exportEvent.addPatientParticipantObject(patientId);
		exportEvent.addDocumentUriParticipantObject(repositoryRetrieveUri, documentUniqueId);
		audit(exportEvent);
	}

	/**
	 * Audits an ITI-43 Retrieve Document Set-b event for XDS.b Document Repository actors.
	 * Sends audit messages for situations when exactly one repository and zero or one community are specified in the transaction.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param consumerUserId The Active Participant UserID for the document consumer (if using WS-Addressing)
	 * @param consumerUserName The Active Participant UserName for the document consumer (if using WS-Security / XUA)
	 * @param consumerIpAddress The IP address of the document consumer that initiated the transaction
	 * @param repositoryEndpointUri The Web service endpoint URI for this document repository
	 * @param documentUniqueIds The list of Document Entry UniqueId(s) for the document(s) retrieved
	 * @param repositoryUniqueId The XDS.b Repository Unique Id value for this repository
	 * @param homeCommunityId The XCA Home Community Id used in the transaction
	 */
	public void auditRetrieveDocumentSetEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String consumerUserId, String consumerUserName, String consumerIpAddress,
			String repositoryEndpointUri,
			String[] documentUniqueIds, String repositoryUniqueId,  String homeCommunityId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		
		String[] repositoryUniqueIds = null;
		if (!EventUtils.isEmptyOrNull(documentUniqueIds)) {
			repositoryUniqueIds = new String[documentUniqueIds.length];
			Arrays.fill(repositoryUniqueIds, repositoryUniqueId);
		}
		
		auditRetrieveDocumentSetEvent(eventOutcome, consumerUserId, consumerUserName, consumerIpAddress, repositoryEndpointUri, documentUniqueIds, repositoryUniqueIds, homeCommunityId);
	}
	
	/**
	 * Audits an ITI-43 Retrieve Document Set-b event for XDS.b Document Repository actors.
	 * Sends audit messages for situations when more than one repository and zero or one community are specified in the transaction.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param consumerUserId The Active Participant UserID for the document consumer (if using WS-Addressing)
	 * @param consumerUserName The Active Participant UserName for the document consumer (if using WS-Security / XUA)
	 * @param consumerIpAddress The IP address of the document consumer that initiated the transaction
	 * @param repositoryEndpointUri The Web service endpoint URI for this document repository
	 * @param documentUniqueIds The list of Document Entry UniqueId(s) for the document(s) retrieved
	 * @param repositoryUniqueIds The list of XDS.b Repository Unique Ids involved in this transaction (aligned with Document Unique Ids array)
	 * @param homeCommunityId The XCA Home Community Id used in the transaction
	 */
	public void auditRetrieveDocumentSetEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String consumerUserId, String consumerUserName, String consumerIpAddress,
			String repositoryEndpointUri,
			String[] documentUniqueIds, String[] repositoryUniqueIds, String homeCommunityId) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		
		String[] homeCommunityIds = null;
		if (!EventUtils.isEmptyOrNull(documentUniqueIds)) {
			homeCommunityIds = new String[documentUniqueIds.length];
			Arrays.fill(homeCommunityIds, homeCommunityId);
		}
		
		auditRetrieveDocumentSetEvent(eventOutcome, consumerUserId, consumerUserName, consumerIpAddress, repositoryEndpointUri, documentUniqueIds, repositoryUniqueIds, homeCommunityIds);
	}

	/**
	 * Audits an ITI-43 Retrieve Document Set-b event for XDS.b Document Repository actors.
	 * Sends audit messages for situations when more than one repository and more than one community are specified in the transaction.
	 * 
	 * @param eventOutcome The event outcome indicator
	 * @param consumerUserId The Active Participant UserID for the document consumer (if using WS-Addressing)
	 * @param consumerUserName The Active Participant UserName for the document consumer (if using WS-Security / XUA)
	 * @param consumerIpAddress The IP address of the document consumer that initiated the transaction
	 * @param repositoryEndpointUri The Web service endpoint URI for this document repository
	 * @param documentUniqueIds The list of Document Entry UniqueId(s) for the document(s) retrieved
	 * @param repositoryUniqueIds The list of XDS.b Repository Unique Ids involved in this transaction (aligned with Document Unique Ids array)
	 * @param homeCommunityIds The list of XCA Home Community Ids involved in this transaction (aligned with Document Unique Ids array)
	 */
	public void auditRetrieveDocumentSetEvent(
			RFC3881EventOutcomeCodes eventOutcome,
			String consumerUserId, String consumerUserName, String consumerIpAddress,
			String repositoryEndpointUri,
			String[] documentUniqueIds, String[] repositoryUniqueIds, String[] homeCommunityIds) 
	{
		if (!isAuditorEnabled()) {
			return;
		}
		ExportEvent exportEvent = new ExportEvent(true, eventOutcome, new IHETransactionEventTypeCodes.RetrieveDocumentSet());
		exportEvent.setAuditSourceId(getAuditSourceId(), getAuditEnterpriseSiteId());
		exportEvent.addSourceActiveParticipant(repositoryEndpointUri, getSystemAltUserId(), null, EventUtils.getAddressForUrl(repositoryEndpointUri, false), false);
		exportEvent.addDestinationActiveParticipant(consumerUserId, null, consumerUserName, consumerIpAddress, true);
		//exportEvent.addPatientParticipantObject(patientId);
		if (!EventUtils.isEmptyOrNull(documentUniqueIds)) {
			for (int i=0; i<documentUniqueIds.length; i++) {
				exportEvent.addDocumentParticipantObject(documentUniqueIds[i], repositoryUniqueIds[i], homeCommunityIds[i]);
			}
		}
		audit(exportEvent);
	}

	
	/**
	 * Generically sends audit messages for XDS Document Repository Provide And Register Document Set events
	 * 
	 * @param transaction The specific IHE Transaction (ITI-15 or ITI-41)
	 * @param eventOutcome The event outcome indicator
	 * @param sourceUserId The Active Participant UserID for the document consumer (if using WS-Addressing)
	 * @param sourceIpAddress The IP address of the document source that initiated the transaction
	 * @param repositoryEndpointUri The Web service endpoint URI for this document repository
	 * @param submissionSetUniqueId The UniqueID of the Submission Set registered
	 * @param patientId The Patient Id that this submission pertains to
	 */
	protected void auditProvideAndRegisterEvent (
			IHETransactionEventTypeCodes transaction, 
			RFC3881EventOutcomeCodes eventOutcome,
			String sourceUserId, String sourceIpAddress, 
			String repositoryEndpointUri,
			String submissionSetUniqueId,
			String patientId)
	{
		ImportEvent importEvent = new ImportEvent(false, eventOutcome, transaction);
		importEvent.setAuditSourceId(getAuditSourceId(), getAuditEnterpriseSiteId());
		importEvent.addSourceActiveParticipant(sourceUserId, null, null, sourceIpAddress, true);
		importEvent.addDestinationActiveParticipant(repositoryEndpointUri, getSystemAltUserId(), null, EventUtils.getAddressForUrl(repositoryEndpointUri, false), false);
		if (!EventUtils.isEmptyOrNull(patientId)) {
			importEvent.addPatientParticipantObject(patientId);
		}
		importEvent.addSubmissionSetParticipantObject(submissionSetUniqueId);		
		
		audit(importEvent);
	}
	
	/**
	 * Generically sends audit messages for XDS Document Repository Register Document Set events
	 * 
	 * @param transaction The specific IHE Transaction (ITI-14 or ITI-42)
	 * @param eventOutcome The event outcome indicator
	 * @param repositoryUserId The Active Participant UserID for the document repository (if using WS-Addressing)
	 * @param registryEndpointUri  The Web service endpoint URI for the document registry
	 * @param submissionSetUniqueId The UniqueID of the Submission Set registered
	 * @param patientId The Patient Id that this submission pertains to
	 */
	protected void auditRegisterEvent(
			IHETransactionEventTypeCodes transaction,
			RFC3881EventOutcomeCodes eventOutcome, 
			String repositoryUserId,
			String registryEndpointUri,
			String submissionSetUniqueId, String patientId)
	{
		ExportEvent exportEvent = new ExportEvent(true, eventOutcome, transaction);
		exportEvent.setAuditSourceId(getAuditSourceId(), getAuditEnterpriseSiteId());
		exportEvent.addSourceActiveParticipant(repositoryUserId, getSystemAltUserId(), null, getSystemNetworkId(), true);
		exportEvent.addDestinationActiveParticipant(registryEndpointUri, null, null, EventUtils.getAddressForUrl(registryEndpointUri, false), false);
		if (!EventUtils.isEmptyOrNull(patientId)) {
			exportEvent.addPatientParticipantObject(patientId);
		}
		exportEvent.addSubmissionSetParticipantObject(submissionSetUniqueId);
		audit(exportEvent);
	}
	
}
