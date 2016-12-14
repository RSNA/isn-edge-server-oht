/*******************************************************************************
 * Copyright (c) 2006,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.xds.soap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMText;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.log4j.Logger;
import org.openhealthtools.ihe.common.ws.IHESOAPSenderFactory;
import org.openhealthtools.ihe.common.ws.utils.IHEStreamDataSource;
import org.openhealthtools.ihe.xds.document.XDSDocument;
import org.openhealthtools.ihe.xds.document.DocumentDescriptor;
import org.openhealthtools.ihe.xds.document.XDSDocumentFromStream;
import org.w3c.dom.Element;

/**
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class B_XDSSoapClient extends AbstractXDSSoapClient {

	/**
	 * 
	 */
	private static final Logger logger = Logger.getLogger(B_XDSSoapClient.class);

	/**
	 * @throws Exception
	 */
	public B_XDSSoapClient()
	{
		super(IHESOAPSenderFactory.getMTOMSender());
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.AbstractXDSSoapClient#processSOAPRequest(org.w3c.dom.Element, java.util.List)
	 */
	public XDSSOAPRequestPayload processSOAPRequest(Element request, List<XDSDocument> attachments) throws Exception
	{
		return super.processSOAPRequest(request, attachments);
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.AbstractXDSSoapClient#processSOAPResponse(org.apache.axiom.soap.SOAPEnvelope)
	 */
	public XDSSOAPResponsePayload processSOAPResponse(SOAPEnvelope responseEnvelope) throws Exception
	{
		return super.processSOAPResponse(responseEnvelope);
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.AbstractXDSSoapClient#buildRequestAttachments(org.apache.axiom.om.OMElement, java.util.List)
	 */
	protected Map<String,javax.activation.DataHandler> buildRequestAttachments(OMElement bodyOMElement, List<XDSDocument> attachments) throws Exception
	{
		if (attachments != null && attachments.size() > 0) {
			// Handle XDS.b Attachments.  This is specific to the XDS.b ProvideAndRegisterDocumentSet model
			if (logger.isDebugEnabled()) {
				logger.debug("Request contains attachments.  Begin building attachment list.");
			}			
			
			Map<String,javax.activation.DataHandler> attachmentMap = new HashMap<String,javax.activation.DataHandler>();
			
			OMFactory omFactory = bodyOMElement.getOMFactory();
			OMNamespace iheNS = omFactory.createOMNamespace(XDSSoapConstants.IHE_XDSB_NAMESPACE_URI, "ihe");			
			
			OMElement documentAttachmentElement, lastElement;
			lastElement = bodyOMElement.getFirstElement();
			
			javax.activation.DataHandler attachmentPart;
			
			// Iterate through list to build XOP structure
			Iterator<XDSDocument> attachmentIterator = attachments.iterator();
			while (attachmentIterator.hasNext()) {
				
				XDSDocument attachDocument = attachmentIterator.next();
				// Create new DataHandler for the attachment
				attachmentPart = new javax.activation.DataHandler(
						new IHEStreamDataSource(attachDocument.getStream(), 
												attachDocument.getDescriptor().getMimeType()));
				
				// Create the <ihe:Document> element for use in the P&R Request
				documentAttachmentElement = omFactory.createOMElement("Document", iheNS);
				documentAttachmentElement.addAttribute(omFactory.createOMAttribute("id", null, attachDocument.getDocumentEntryUUID()));
				documentAttachmentElement.addChild(omFactory.createOMText(attachmentPart, true));				

				// Add the new attachment element tot he body.
				lastElement.insertSiblingAfter(documentAttachmentElement);
				
				// Put document in the attachment map for other use
				attachmentMap.put(attachDocument.getDocumentEntryUUID(), attachmentPart);
				lastElement = documentAttachmentElement;
				
				if (logger.isDebugEnabled()) {
					logger.debug("Adding document " + attachDocument +" as attachment");
				}
			}
			if (logger.isDebugEnabled()) {
				logger.debug("SOAP Attachments Added to Map");
			}
			
			return attachmentMap;
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.AbstractXDSSoapClient#buildResponseAttachments(org.apache.axiom.om.OMElement, boolean)
	 */
	protected OMElement buildResponseAttachments(XDSSOAPResponsePayload responsePayload, OMElement responseOMElement, boolean returnRegistryResponseOnly) throws Exception
	{
		// Verify we have a valid response type (<ihe:RetrieveDocumentSetResponse>)
		if (!responseOMElement.getQName().equals(XDSSoapConstants.RETRIEVE_DOCUMENT_SET_RESPONSE_QNAME)) {
			return responseOMElement;
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Beginning XDS.b MTOM attachment extraction");
		}		

		OMElement mimeTypeElement, documentResponseElement, documentBodyElement, documentUniqueIdElement, repositoryUniqueIdElement, homeCommunityIdElement,
			newDocumentUniqueIdElement, newRepositoryUniqueIdElement;		
		org.openhealthtools.ihe.xds.document.XDSDocument attachDocument;
		javax.activation.DataHandler documentBody;

		// Get all elements of type <ihe:DocumentResponse> and process attachments
		Iterator<?> documentResponseElements = responseOMElement.getChildrenWithName(XDSSoapConstants.DOCUMENT_RESPONSE_QNAME);
				
		if (documentResponseElements.hasNext()) {
			
			Map <String,org.openhealthtools.ihe.xds.document.XDSDocument> responseAttachments = new HashMap<String,org.openhealthtools.ihe.xds.document.XDSDocument>();

			while (documentResponseElements.hasNext()) {
				String repositoryUniqueId = null, documentUniqueId = null, homeCommunityId = null, mimeType = null,
					newRepositoryUniqueId = null, newDocumentUniqueId = null;
				documentResponseElement = (OMElement)documentResponseElements.next();
				
				//org.openhealthtools.ihe.xds.document.Document attachedDocument = new org.openhealthtools.ihe.xds.document.Document();
				
				documentUniqueIdElement = documentResponseElement.getFirstChildWithName(XDSSoapConstants.DOCUMENT_UNIQUE_ID_QNAME);
				if (documentUniqueIdElement != null) {
					documentUniqueId = ((OMText)documentUniqueIdElement.getFirstOMChild()).getText();
				}
				
				newDocumentUniqueIdElement = documentResponseElement.getFirstChildWithName(XDSSoapConstants.NEW_DOCUMENT_UNIQUE_ID_QNAME);
				if (newDocumentUniqueIdElement != null && newDocumentUniqueIdElement.getFirstOMChild() != null) {
					newDocumentUniqueId = ((OMText)newDocumentUniqueIdElement.getFirstOMChild()).getText();
				}
							
				repositoryUniqueIdElement = documentResponseElement.getFirstChildWithName(XDSSoapConstants.REPOSITORY_UNIQUE_ID_QNAME);
				if (repositoryUniqueIdElement != null) {
					repositoryUniqueId = ((OMText)repositoryUniqueIdElement.getFirstOMChild()).getText();
				}
							
				newRepositoryUniqueIdElement = documentResponseElement.getFirstChildWithName(XDSSoapConstants.NEW_REPOSITORY_UNIQUE_ID_QNAME);
				if (newRepositoryUniqueIdElement != null && newRepositoryUniqueIdElement.getFirstOMChild() != null) {
					newRepositoryUniqueId = ((OMText)newRepositoryUniqueIdElement.getFirstOMChild()).getText();
				}
				
				homeCommunityIdElement = documentResponseElement.getFirstChildWithName(XDSSoapConstants.HOME_COMMUNITY_ID_QNAME);
				if (homeCommunityIdElement != null) {
					homeCommunityId = ((OMText)homeCommunityIdElement.getFirstOMChild()).getText();
				}
				
				mimeTypeElement = documentResponseElement.getFirstChildWithName(XDSSoapConstants.IHE_MIME_TYPE_QNAME);
				if (mimeTypeElement != null) {
					mimeType = ((OMText)mimeTypeElement.getFirstOMChild()).getText();
				}
				
				OMText tempNode;
				documentBodyElement = documentResponseElement.getFirstChildWithName(XDSSoapConstants.DOCUMENT_BODY_QNAME);
				if (documentBodyElement != null) {
					tempNode = (OMText)documentBodyElement.getFirstOMChild();
					tempNode.setOptimize(true);
					
					documentBody = (javax.activation.DataHandler)tempNode.getDataHandler();
	
					if (documentBody != null) {					

						// Get the document descriptor for the MIME type specified
						DocumentDescriptor descriptor = 
							DocumentDescriptor.getDocumentDescriptorForMimeType(mimeType);

						// Create a new XDS Document from the provided stream
						attachDocument = 
							new XDSDocumentFromStream(descriptor,documentBody.getInputStream());
						
						// Set the identifiers in the attachments
						attachDocument.setDocumentUniqueId(documentUniqueId);
						attachDocument.setNewDocumentUniqueId(newDocumentUniqueId);
						attachDocument.setHomeCommunityId(homeCommunityId);
						attachDocument.setRepositoryUniqueId(repositoryUniqueId);
						attachDocument.setNewRepositoryUniqueId(newRepositoryUniqueId);
						
						// Place attachments in the response list.
						responseAttachments.put(documentUniqueId, attachDocument);
						
						if (logger.isDebugEnabled()) {
							logger.debug("Extracted attachment with id " + documentUniqueId + " from repository "+ repositoryUniqueId +".");
						}
					}
				}
			}
			
			// Set attachments into response payload
			responsePayload.setResponseAttachments(responseAttachments);
		}
		
		OMElement response;
		// Check to see if we should only return the registry response
		if (returnRegistryResponseOnly) {
			response = responseOMElement.getFirstChildWithName(XDSSoapConstants.REGISTRY_RESPONSE_QNAME);
		} else {
			response = responseOMElement;
		}
			
		if (logger.isDebugEnabled()) {
			logger.debug("Ending XDS.b MTOM attachment extraction");
		}
				
		return response;
	}
	

}
