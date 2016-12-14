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

import org.openhealthtools.ihe.xds.XDSConstants;
import org.openhealthtools.ihe.xds.XDSMetadataHandler;
import org.openhealthtools.ihe.xds.XDSResponseParser;
import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;
import org.openhealthtools.ihe.xds.metadata.transform.EbXML_3_0ProvideAndRegisterDocumentSetTransformer;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.source.SubmitTransactionData;
import org.openhealthtools.ihe.xds.source.utils.EbXML_3_0MetadataUtils;
import org.w3c.dom.Element;

/**
 * Implementation of XDS transaction request/response metadata 
 * handling for ITI-41 Provide and Register Document Set-b in
 * XDS.b Document Source actors.
 */
public class ProvideAndRegisterDocumentSetBMetadataHandler implements XDSMetadataHandler
{
	/**
	 * Element name for P&R Request Wrapper
	 */
	private static final String PR_REQUEST_ELEMENT_NAME = "ProvideAndRegisterDocumentSetRequest";

	/**
	 * Add the IHE namespaced XDS.b 
	 * @param submitObjectElement
	 * @return DOM Element wrapped by the XDS.b P&R Document Set wrapper
	 */
	private Element addXDSbProvideAndRegisterWrapper(Element submitObjectElement)
	{
		org.w3c.dom.Document domDocument = submitObjectElement.getOwnerDocument();
		
		Element prElement = domDocument.createElementNS(XDSConstants.IHE_XDSB_NAMESPACE_URI, PR_REQUEST_ELEMENT_NAME);
		prElement.setPrefix(XDSConstants.IHE_XDSB_NAMESPACE_PREFIX);
		prElement.appendChild(submitObjectElement);
		
		return prElement;
	}
	
	/* (non-Javadoc)
	 * @see org.openhealthtools.ihe.xds.XDSMetadataHandler#processRequest(java.lang.Object)
	 */
	public Element processRequest(Object requestBody) throws Exception
	{
		if (!(requestBody instanceof SubmitTransactionData)) {
			throw new IllegalArgumentException("Invalid Provide And Register Submission Payload Type");
		}
		
		SubmitTransactionData txnData = (SubmitTransactionData)requestBody;
		
		// form the ebXML payload for the message
		EbXML_3_0ProvideAndRegisterDocumentSetTransformer setTransformer = new EbXML_3_0ProvideAndRegisterDocumentSetTransformer();
		
		// Transform our P&R request metadata to ebXML 3.0
		ProvideAndRegisterDocumentSetType meta = txnData.getMetadata();
		setTransformer.transform(meta);
		
		// Serialize to ebXML payload to DOM 
		Element ebXMLMetadata = EbXML_3_0MetadataUtils.unpackSubmitObjectsRequest(setTransformer.getSubmitReq());
		
		// wrap the ebXML metadata in XDS b wrapper schema.
		return addXDSbProvideAndRegisterWrapper(ebXMLMetadata);
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
