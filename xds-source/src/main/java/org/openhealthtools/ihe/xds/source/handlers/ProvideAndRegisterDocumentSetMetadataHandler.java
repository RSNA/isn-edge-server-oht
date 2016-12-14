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

package org.openhealthtools.ihe.xds.source.handlers;

import org.openhealthtools.ihe.xds.XDSMetadataHandler;
import org.openhealthtools.ihe.xds.XDSResponseParser;
import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;
import org.openhealthtools.ihe.xds.metadata.transform.EbXML_2_1ProvideAndRegisterDocumentSetTransformer;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.source.SubmitTransactionData;
import org.openhealthtools.ihe.xds.source.utils.EbXML_2_1MetadataUtils;
import org.w3c.dom.Element;

/**
 * Implementation of XDS transaction request/response metadata 
 * handling for ITI-15 Provide and Register Document Set in
 * XDS.a Document Source actors.
 */
public class ProvideAndRegisterDocumentSetMetadataHandler implements XDSMetadataHandler
{
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.XDSMetadataHandler#processRequest(java.lang.Object)
	 */
	public Element processRequest(Object requestBody) throws Exception
	{
		if (!(requestBody instanceof SubmitTransactionData)) {
			throw new IllegalArgumentException("Invalid Provide And Register Submission Payload Type.  Must be of type SubmitTransactionData.");
		}
		
		SubmitTransactionData txnData = (SubmitTransactionData)requestBody;
		
		// Form the ebXML payload for the message
		EbXML_2_1ProvideAndRegisterDocumentSetTransformer setTransformer = new EbXML_2_1ProvideAndRegisterDocumentSetTransformer();
		ProvideAndRegisterDocumentSetType meta = txnData.getMetadata();
		setTransformer.transform(meta);
		
		// Transform EMF instance to DOM instance and return
		return EbXML_2_1MetadataUtils.unpackSubmitObjectsRequest(setTransformer.getSubmitReq());
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.XDSMetadataHandler#processResponse(org.w3c.dom.Element)
	 */
	public XDSResponseType processResponse(XDSResponseType xdsResponse, Element responsePayload) throws Exception
	{
		XDSResponseType response = XDSResponseParser.processResponse(xdsResponse, responsePayload, false);
		return response;
	}
	
}
