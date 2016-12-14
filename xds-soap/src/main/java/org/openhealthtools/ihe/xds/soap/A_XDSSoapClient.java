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

import javax.mail.util.ByteArrayDataSource;

import org.apache.axiom.om.OMElement;
import org.apache.log4j.Logger;
import org.openhealthtools.ihe.common.ws.IHESOAPSenderFactory;
import org.openhealthtools.ihe.xds.document.XDSDocument;

/**
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class A_XDSSoapClient extends AbstractXDSSoapClient {

	/**
	 * 
	 */
	private static final Logger logger = Logger.getLogger(A_XDSSoapClient.class);

	/**
	 * @throws Exception
	 */
	public A_XDSSoapClient()
	{
		super(IHESOAPSenderFactory.getSWASender());
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.soap.AbstractXDSSoapClient#buildRequestAttachments(org.apache.axiom.om.OMElement, java.util.List)
	 */
	protected Map<String,javax.activation.DataHandler> buildRequestAttachments(OMElement body, List<XDSDocument> attachments) throws Exception 
	{
		if (attachments != null && attachments.size() > 0) {
			// Handle XDS.b Attachments.  This is specific to the XDS.b ProvideAndRegisterDocumentSet model
			if (logger.isDebugEnabled()) {
				logger.debug("Request contains attachments.  Begin building attachment list.");
			}			
			Map<String,javax.activation.DataHandler> attachmentMap = new HashMap<String,javax.activation.DataHandler>();
			javax.activation.DataHandler attachmentPart;
			
			Iterator<XDSDocument> attachmentIterator = attachments.iterator();
			while (attachmentIterator.hasNext()) {
				XDSDocument attachDocument = (XDSDocument)attachmentIterator.next();
				
				// Create new DataHandler for the attachment
				attachmentPart = new javax.activation.DataHandler(
						new ByteArrayDataSource(attachDocument.getStream(), 
												attachDocument.getDescriptor().getMimeType()));
	
				// Put document in the attachment map for other use
				attachmentMap.put(attachDocument.getDocumentEntryUUID(), attachmentPart);
	
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
	protected OMElement buildResponseAttachments(XDSSOAPResponsePayload responsePayload, OMElement body, boolean returnOnlyRegistryResponse) throws Exception 
	{
		return body;
	}
}
