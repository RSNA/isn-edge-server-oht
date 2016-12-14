/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.xds;

import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.openhealthtools.ihe.utils.EMFUtils;
import org.openhealthtools.ihe.xds.metadata.extract.MetadataExtractionException;
import org.openhealthtools.ihe.xds.response.XDSErrorCode;
import org.openhealthtools.ihe.xds.response.XDSErrorType;
import org.openhealthtools.ihe.xds.response.XDSResponseType;
import org.openhealthtools.ihe.xds.response.XDSStatusType;
import org.openhealthtools.ihe.xds.response.impl.XDSErrorListTypeImpl;
import org.openhealthtools.ihe.xds.response.impl.XDSErrorTypeImpl;
import org.w3c.dom.Element;

/**
 * Utility class to aid in the parsing and interpretation of responses from 
 * the XDS REgistry and XDS Repository
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class XDSResponseParser {
	/**
	 * Logger for the class
	 */
	private static final Logger logger = Logger.getLogger(XDSResponseParser.class);
	
	/**
	 * Examines the reply from the Server. Throws Exception if any
	 * error conditions are found in the reply. <br>
	 * Supports ebXML 2.1 and ebXML 3.0 RegistryResposeType messages.
	 * @param xmlData bytes returned by the repository
	 * @param isQuery indicates if this response is to a query (=true) or not (=false)
	 * @return fully populated XDSResponseType. If the response is a query response, then the
	 * XDSResponseType will be a XDSQueryResponseType object 
	 * @throws XDSResponseParserException 
	 * @throws IOException 
	 */
	public static XDSResponseType processResponse(XDSResponseType xdsResponse, Element response, boolean isQuery) throws XDSResponseParserException, IOException {
		if (response == null){
			logger.error("Error: Response from Server was null.");
			throw new XDSResponseParserException( "Error: Response from Server was null.");
		}
		/*String responseData = new String(xmlData);
		if (responseData.equals("")){
			logger.error("Error: Response from Repository was empty.");
			throw new XDSResponseParserException( "Error: Response from Repository was empty.");
		}*/
		
		// check for ebXML 2.1
		if(response.getNamespaceURI().compareTo(org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage.eNS_URI) == 0) {
			return parseEbXML_2_1(xdsResponse, response, isQuery);
		} 
		// check for ebXML 3.0
		else if (response.getNamespaceURI().compareTo(org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage.eNS_URI) == 0) {
			return parseEbXML_3_0(xdsResponse, response, isQuery);
		} 
		else if (response.getNamespaceURI().compareTo(org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage.eNS_URI) == 0) {
			return parseEbXML_3_0(xdsResponse, response, isQuery);
		} 
		// other
		else {
			logger.error("Server response was coded with an unrecognized namespace. " /*+ reply.getNamespaceURI()*/);
			if(logger.isDebugEnabled()){
				logger.debug("Response was:");
				//logger.debug(responseData);				
			}
			throw new XDSResponseParserException( "Server response was coded with an unrecognized namespace. " );
		}
	} // end of ParseResponse	
	
	/**
	 * Method to assist in the parsing of ebXMl 2.1 responses
	 * @param xmlData the ebXML 2.1 bytes
	 * @param isQuery indicates if this response is to a query (=true) or not (=false)
	 * @return the populated XDSResponseType
	 * @throws XDSResponseParserException 
	 * @throws IOException 
	 */
	private static XDSResponseType parseEbXML_2_1 (XDSResponseType xdsResponse, Element responseElement, boolean isQuery) throws XDSResponseParserException, IOException{
		
		// try to load the response
		if(logger.isDebugEnabled()){
			logger.debug("Loading response in EMF.");
		}
//		org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage packageInstance = 
//			org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage.eINSTANCE;
//		XMLResource resources = (XMLResource)(new org.openhealthtools.ihe.common.ebxml._2._1.rs.util.RegistryResourceFactoryImpl().createResource(
//				URI.createURI(org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage.eNS_URI)));
//
//		if(getHackMetadataFlag())
//		{
//			XMLResource xResource = (XMLResource)resources;
//			xResource.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
//		}
//
//        try {
//
//			resources.load(responseElement, null);
//		} catch (IOException e) {
//			throw new XDSResponseParserException("Error parsing ebXML 2. 1 response with EMF. Response is:\n ", e);
//		}
//
//		
//		// parse the response "varieties"
//		EList list = resources.getContents();
//		Object o = list.get(0);
		
		
		
		Object rootObject = null;
		try {
			rootObject = EMFUtils.transformDomToEmf(
					responseElement, 
					new org.openhealthtools.ihe.common.ebxml._2._1.rs.util.RegistryResourceFactoryImpl(), 
					URI.createURI(org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage.eNS_URI), 
					EMFUtils.isEMFValidationRelaxed());
		} catch (Exception e) {
			String error = new String("Registry response is not ebXML v2.1. Response is: " + e.getMessage());
			logger.fatal(error);
			throw new XDSResponseParserException(error, e);
		}
		
		// root is RegistryResponseType
		if (rootObject instanceof org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot) {
			org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot root = 
				(org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot)rootObject;
			
			// null checks
			org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType response = root.getRegistryResponse();
			if(response == null){
				logger.error("EbXML 2.1 RegistryResponse is null");
				throw new XDSResponseParserException("EbXML 2.1 RegistryResponse is null");
			}
			
			// check status
			if(response.getStatus() == null){
				logger.warn("RegistryResponse status is null");
			}
			else if (response.getStatus().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType.SUCCESS_LITERAL)){
				if(logger.isDebugEnabled()){
					logger.debug("Success.");
				}
				xdsResponse.setStatus(XDSStatusType.SUCCESS_LITERAL);
			}
			else if (response.getStatus().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType.FAILURE_LITERAL)){
				if(logger.isDebugEnabled()){
					logger.debug("Failure.");
				}
				xdsResponse.setStatus(XDSStatusType.FAILURE_LITERAL);
			}
			else if (response.getStatus().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType.UNAVAILABLE_LITERAL)){
				if(logger.isDebugEnabled()){
					logger.debug("Unavailable.");
				}
				xdsResponse.setStatus(XDSStatusType.UNAVAILABLE_LITERAL);
			}
			else if (response.getStatus().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.StatusType.PARTIAL_SUCCESS_LITERAL)){
				if(logger.isDebugEnabled()){
					logger.debug("Partial Success.");
				}
				xdsResponse.setStatus(XDSStatusType.PARTIAL_SUCCESS_LITERAL);
			}
			else {
				logger.warn("RegistryResponse status is unrecognized");
			}
			
			// check for errors
			if(response.getRegistryErrorList() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list is null.");
				}
			}
			else if(response.getRegistryErrorList().getRegistryError() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list contains no errors.");
				}
			}
			else if(response.getRegistryErrorList().getRegistryError().isEmpty()){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list contains no errors.");
				}
			}
			else{ // found errors
				XDSErrorType[] errors = convert(response.getRegistryErrorList());
				
				// MAD 3/16/2009 Removed EMF reference, added direct class instantiation
//				xdsResponse.setErrorList(ModelFactory.eINSTANCE.createXDSErrorListType());
				xdsResponse.setErrorList(new XDSErrorListTypeImpl());
				// MAD 3/16/2009
				
				if(response.getRegistryErrorList().getHighestSeverity() != null){
					if(response.getRegistryErrorList().getHighestSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.ERROR_LITERAL)){
						xdsResponse.getErrorList().setHighestSeverity(XDSStatusType.ERROR_LITERAL);
					}
					else if(response.getRegistryErrorList().getHighestSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.WARNING_LITERAL)){
						xdsResponse.getErrorList().setHighestSeverity(XDSStatusType.WARNING_LITERAL);
					}
				}
				StringBuffer errorMsg = new StringBuffer();
				for(int i = 0; i<errors.length; i++){
					xdsResponse.getErrorList().getError().add(errors[i]);
					if(logger.isInfoEnabled()){
						errorMsg.append(
								"Error #" + i + 
								"\n\tSeverity=" + errors[i].getSeverity().getName() + 
								"\n\tCode=" + errors[i].getErrorCode().getName() + 
								"\n\tCode Context=" + errors[i].getCodeContext() + 
								"\n\tLocation= " + errors[i].getLocation() +"\n\n");
					}
				}
				if(logger.isInfoEnabled()){
					logger.info(errorMsg);
				}
			}
			
			

			return xdsResponse;
		} else {

			logger.error("Unexpected class found as document root " + rootObject.getClass().getName());
			throw new XDSResponseParserException( "Unexpected class found as document root "
							+ rootObject.getClass().getName());
		}
	}
	
	/**
	 * Method to assist in the parsing of ebXMl 2.1 responses
	 * @param xmlData the ebXML 3.0 bytes
	 * @param isQuery indicates if this response is to a query (=true) or not (=false)
	 * @return the populated XDSResponseType
	 * @throws XDSResponseParserException 
	 * @throws IOException 
	 */
	private static XDSResponseType parseEbXML_3_0 (XDSResponseType xdsResponse, Element responseElement, boolean isQuery) throws XDSResponseParserException, IOException{
		// try to load the response
		if(logger.isDebugEnabled()){
			logger.debug("Loading response in EMF.");
		}

//		XMLResource resources = (XMLResource)(new org.openhealthtools.ihe.common.ebxml._3._0.rs.util.RegistryResourceFactoryImpl().createResource(
//				URI.createURI(org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage.eNS_URI)));
//
//		if(getHackMetadataFlag())
//		{
//			XMLResource xResource = (XMLResource)resources;
//			xResource.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
//		}
//
//        try {
//			resources.load(responseElement, null);
//			//resources.unload();
//		} catch (IOException e) {
//			throw new XDSResponseParserException("Error parsing ebXML 3.0 response with EMF. Response is:\n " + "FIX ME BY ADDING RESPONSE", e);
//		}
//		
//		// parse the response "varieties"
//		EList list = resources.getContents();
//		Object o = list.get(0);
		
		
		org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage packageInstance = 
			org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage.eINSTANCE;
		
		Object rootObject = null;
		try {
			rootObject = EMFUtils.transformDomToEmf(
					responseElement, 
					new org.openhealthtools.ihe.common.ebxml._3._0.rs.util.RegistryResourceFactoryImpl(), 
					URI.createURI(org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage.eNS_URI), 
					EMFUtils.isEMFValidationRelaxed());
		} catch (Exception e) {
			String error = new String("Registry response is not ebXML v2.1. Response is: " + e.getMessage());
			logger.fatal(error);
			throw new XDSResponseParserException(error, e);
		}
		
		// root is RegistryResponseType
		if (rootObject instanceof org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot) {
			org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot root = 
				(org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot)rootObject;
			
			// null checks
			org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType response = 
				root.getRegistryResponse();
			if(response == null){
//				resources.unload();
				logger.error("EbXML 3.0 RegistryResponse is null");
				throw new XDSResponseParserException("EbXML 3.0 RegistryResponse is null");
			}
			
			
			// MAD 3/16/2009 Removed EMF reference
//			// return value
//			XDSResponseType xdsResponse = null;
//			// check for query response
//			if(isQuery){
//				xdsResponse = ModelFactory.eINSTANCE.createXDSQueryResponseType();
//			}
//			else{
//				xdsResponse = ModelFactory.eINSTANCE.createXDSResponseType();
//			}
			// MAD 3/16/2009
			
			// check status
			if(response.getStatus() == null){
				logger.warn("RegistryResponse status is null");
			}
			else if (response.getStatus().equals(XDSConstants.OASIS_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.SUCCESS_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Success.");
				}
				xdsResponse.setStatus(XDSStatusType.SUCCESS_LITERAL);
			}
			else if (response.getStatus().equals(XDSConstants.OASIS_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.FAILURE_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Failure.");
				}
				xdsResponse.setStatus(XDSStatusType.FAILURE_LITERAL);
			}
			else if (response.getStatus().equals(XDSConstants.OASIS_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.UNAVAILABLE_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Unavailable.");
				}
				xdsResponse.setStatus(XDSStatusType.UNAVAILABLE_LITERAL);
			}
			else if (response.getStatus().equals(XDSConstants.IHE_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.PARTIAL_SUCCESS_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Partial Success.");
				}
				xdsResponse.setStatus(XDSStatusType.PARTIAL_SUCCESS_LITERAL);
			}
			else {
				logger.warn("RegistryResponse status is unrecognized");
			}
			
			// check for errors
			if(response.getRegistryErrorList() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list is null.");
				}
			}
			else if(response.getRegistryErrorList().getRegistryError() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list contains no errors.");
				}
			}
			else if(response.getRegistryErrorList().getRegistryError().isEmpty()){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list contains no errors.");
				}
			}
			else{ // found errors
				XDSErrorType[] errors = convert(response.getRegistryErrorList());
				// MAD 3/16/2009 Removed EMF reference, added direct class instantiation
//				xdsResponse.setErrorList(ModelFactory.eINSTANCE.createXDSErrorListType());
				xdsResponse.setErrorList(new XDSErrorListTypeImpl());
				// MAD 3/16/2009
				
				if(response.getRegistryErrorList().getHighestSeverity() != null){
					if(response.getRegistryErrorList().getHighestSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.ERROR_LITERAL)){
						xdsResponse.getErrorList().setHighestSeverity(XDSStatusType.ERROR_LITERAL);
					}
					else if(response.getRegistryErrorList().getHighestSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.WARNING_LITERAL)){
						xdsResponse.getErrorList().setHighestSeverity(XDSStatusType.WARNING_LITERAL);
					}
				}
				StringBuffer errorMsg = new StringBuffer();
				for(int i = 0; i<errors.length; i++){
					xdsResponse.getErrorList().getError().add(errors[i]);
					if(logger.isInfoEnabled()){
						errorMsg.append(
								"Error #" + i + 
								"\n\tSeverity=" + errors[i].getSeverity().getName() + 
								"\n\tCode=" + errors[i].getErrorCode().getName() + 
								"\n\tCode Context=" + errors[i].getCodeContext() + 
								"\n\tLocation= " + errors[i].getLocation() +"\n\n");
					}
				}
				if(logger.isInfoEnabled()){
					logger.info(errorMsg);
				}
			}
//			resources.unload();
			return xdsResponse;
		} else if (rootObject instanceof org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot) {
			// root is AdhocQueryResponseType
			org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot root = (org.openhealthtools.ihe.common.ebxml._3._0.query.DocumentRoot)rootObject;
			org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType response = root.getAdhocQueryResponse();
//			resources.unload();
			if(response == null){
//				resources.unload();
				logger.error("EbXML 3.0 AdhocQueryResponse is null");
				throw new XDSResponseParserException("EbXML 3.0 AdhocQueryResponse is null");
			}
			
			
			// MAD 3/16/2009 Removed EMF reference
//			// return value
//			XDSResponseType xdsResponse = null;
//			// check for query response
//			if(isQuery){
//				xdsResponse = ModelFactory.eINSTANCE.createXDSQueryResponseType();
//			}
//			else{
//				xdsResponse = ModelFactory.eINSTANCE.createXDSResponseType();
//			}
			// MAD 3/16/2009

			
			
			
			// check status
			if(response.getStatus() == null){
				logger.warn("RegistryResponse status is null");
			}
			else if (response.getStatus().equals(XDSConstants.OASIS_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.SUCCESS_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Success.");
				}
				xdsResponse.setStatus(XDSStatusType.SUCCESS_LITERAL);
			}
			else if (response.getStatus().equals(XDSConstants.OASIS_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.FAILURE_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Failure.");
				}
				xdsResponse.setStatus(XDSStatusType.FAILURE_LITERAL);
			}
			else if (response.getStatus().equals(XDSConstants.OASIS_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.UNAVAILABLE_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Unavailable.");
				}
				xdsResponse.setStatus(XDSStatusType.UNAVAILABLE_LITERAL);
			}
			else if (response.getStatus().equals(XDSConstants.IHE_EBXML_3_0RESPONSE_STATUS_PREFIX + XDSStatusType.PARTIAL_SUCCESS_LITERAL.getName())){
				if(logger.isDebugEnabled()){
					logger.debug("Partial Success.");
				}
				xdsResponse.setStatus(XDSStatusType.PARTIAL_SUCCESS_LITERAL);
			}
			else {
				logger.warn("RegistryResponse status is unrecognized");
			}
			
			// check for errors
			if(response.getRegistryErrorList() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list is null.");
				}
			}
			else if(response.getRegistryErrorList().getRegistryError() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list contains no errors.");
				}
			}
			else if(response.getRegistryErrorList().getRegistryError().isEmpty()){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error list contains no errors.");
				}
			}
			else{ // found errors
				XDSErrorType[] errors = convert(response.getRegistryErrorList());

				// MAD 3/16/2009 Removed EMF reference, added direct class instantiation
//				xdsResponse.setErrorList(ModelFactory.eINSTANCE.createXDSErrorListType());
				xdsResponse.setErrorList(new XDSErrorListTypeImpl());
				// MAD 3/16/2009
				
				if(response.getRegistryErrorList().getHighestSeverity() != null){
					if(response.getRegistryErrorList().getHighestSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.ERROR_LITERAL)){
						xdsResponse.getErrorList().setHighestSeverity(XDSStatusType.ERROR_LITERAL);
					}
					else if(response.getRegistryErrorList().getHighestSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.WARNING_LITERAL)){
						xdsResponse.getErrorList().setHighestSeverity(XDSStatusType.WARNING_LITERAL);
					}
				}
				StringBuffer errorMsg = new StringBuffer();
				for(int i = 0; i<errors.length; i++){
					xdsResponse.getErrorList().getError().add(errors[i]);
					if(logger.isInfoEnabled()){
						errorMsg.append(
								"Error #" + i + 
								"\n\tSeverity=" + errors[i].getSeverity().getName() + 
								"\n\tCode=" + errors[i].getErrorCode().getName() + 
								"\n\tCode Context=" + errors[i].getCodeContext() + 
								"\n\tLocation= " + errors[i].getLocation() +"\n\n");
					}
				}
				if(logger.isInfoEnabled()){
					logger.info(errorMsg);
				}
			}
//			resources.unload();
			return xdsResponse;
		} else {
			// response is unexpected XML
//			resources.unload();
			logger.error("Unexpected class found as document root " + rootObject.getClass().getName());
			throw new XDSResponseParserException( "Unexpected class found as document root "
							+ rootObject.getClass().getName());
		}
	}
	
	/**
	 * Method to convert the ebXML 2.1 error list to a list of XDSErrorTypes
	 * @param errorList  ebXML errors, non null, non empty
	 * @return list of XDSErrorTypes
	 */
	private static XDSErrorType[] convert(org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType errorList){
		XDSErrorType[] errors = new XDSErrorType[errorList.getRegistryError().size()];
		Iterator i = errorList.getRegistryError().iterator();
		int count = 0;
		while (i.hasNext()){
			org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType e = (org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType)i.next();
			
			
			// MAD 3/16/2009 Removed EMF reference, added direct class instantiation
			//errors[count] = ModelFactory.eINSTANCE.createXDSErrorType();
			errors[count] = new XDSErrorTypeImpl();
			// MAD 3/16/2009
			
			
			// set severity
			if(e.getSeverity() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" severity is null.");
				}
			}
			else if(e.getSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.ERROR_LITERAL)){
				errors[count].setSeverity(XDSStatusType.ERROR_LITERAL);
			}
			else if(e.getSeverity().equals(org.openhealthtools.ihe.common.ebxml._2._1.rs.ErrorType.WARNING_LITERAL)){
				errors[count].setSeverity(XDSStatusType.WARNING_LITERAL);
			}
			else{
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" severity is unrecognized.");
				}
			}
			
			// set error code
			if(e.getErrorCode() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" code is null.");
				}
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_EXTRA_METADATA_NOT_SAVED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_EXTRA_METADATA_NOT_SAVED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_MISSING_DOCUMENT_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_MISSING_DOCUMENT_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_MISSING_DOCUMENT_METADATA_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_MISSING_DOCUMENT_METADATA_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_NON_IDENTICAL_HASH_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_NON_IDENTICAL_HASH_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_BUSY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_BUSY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_METADATA_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_METADATA_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_NOT_AVAILABLE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_NOT_AVAILABLE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_BUSY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_BUSY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_METADATA_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_METADATA_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_SQL_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_SQL_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_STORED_QUERY_MISSING_PARAM_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_STORED_QUERY_MISSING_PARAM_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_STORED_QUERY_PARAM_NUMBER_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_STORED_QUERY_PARAM_NUMBER_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_TOO_MANY_RESULTS_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_TOO_MANY_RESULTS_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNKNOWN_PATIENT_ID_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNKNOWN_PATIENT_ID_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNKNOWN_STORED_QUERY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNKNOWN_STORED_QUERY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_MISSING_HOME_COMMUNITY_ID_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_MISSING_HOME_COMMUNITY_ID_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL);
			}
			// SEK - new for 2013
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_NON_IDENTICAL_SIZE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_NON_IDENTICAL_SIZE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.DOCUMENT_QUEUED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.DOCUMENT_QUEUED_LITERAL);
			}
			// default
			else{
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" code is unrecognized.");
				}
				errors[count].setErrorCode(XDSErrorCode.UNKNOWNERROR_LITERAL);
			}

			// set code context
			if(e.getCodeContext() != null){
				errors[count].setCodeContext(e.getCodeContext());
			}
			// set location
			if(e.getLocation() != null){
				errors[count].setLocation(e.getLocation());
			}
			// set any additional string payload
			if(e.getValue() != null){
				errors[count].setValue(e.getValue());
			}
			count++;
		}
		return errors;
	}
	
	/**
	 * Method to convert the ebXML 3.0 error list to a list of XDSErrorTypes
	 * @param errorList  ebXML errors
	 * @return list of XDSErrorTypes
	 */
	private static XDSErrorType[] convert(org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType errorList){
		XDSErrorType[] errors = new XDSErrorType[errorList.getRegistryError().size()];
		Iterator i = errorList.getRegistryError().iterator();
		int count = 0;
		while (i.hasNext()){
			org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType e = (org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType)i.next();
			
			// MAD 3/16/2009 Removed EMF reference, added direct class instantiation
			//errors[count] = ModelFactory.eINSTANCE.createXDSErrorType();
			errors[count] = new XDSErrorTypeImpl();
			// MAD 3/16/2009
			
			// set severity
			if(e.getSeverity() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" severity is null.");
				}
			}
			else if(e.getSeverity().equals(XDSConstants.EBXML_3_0ERROR_SEVERITY_PREFIX + XDSStatusType.ERROR_LITERAL.getName())){
				errors[count].setSeverity(XDSStatusType.ERROR_LITERAL);
			}
			else if(e.getSeverity().equals(XDSConstants.EBXML_3_0ERROR_SEVERITY_PREFIX + XDSStatusType.WARNING_LITERAL)){
				errors[count].setSeverity(XDSStatusType.WARNING_LITERAL);
			}
			else{
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" severity is unrecognized.");
				}
			}
			
			// set error code
			if(e.getErrorCode() == null){
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" code is null.");
				}
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_DUPLICATE_UNIQUE_ID_IN_REGISTRY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_EXTRA_METADATA_NOT_SAVED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_EXTRA_METADATA_NOT_SAVED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_MISSING_DOCUMENT_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_MISSING_DOCUMENT_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_MISSING_DOCUMENT_METADATA_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_MISSING_DOCUMENT_METADATA_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_NON_IDENTICAL_HASH_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_NON_IDENTICAL_HASH_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_PATIENT_ID_DOES_NOT_MATCH_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_BUSY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_BUSY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_METADATA_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_METADATA_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_NOT_AVAILABLE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_NOT_AVAILABLE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_OUT_OF_RESOURCES_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_BUSY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_BUSY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_DUPLICATE_UNIQUE_ID_IN_MESSAGE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_METADATA_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_METADATA_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REPOSITORY_OUT_OF_RESOURCES_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_SQL_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_SQL_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_STORED_QUERY_MISSING_PARAM_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_STORED_QUERY_MISSING_PARAM_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_STORED_QUERY_PARAM_NUMBER_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_STORED_QUERY_PARAM_NUMBER_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_TOO_MANY_RESULTS_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_TOO_MANY_RESULTS_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNKNOWN_PATIENT_ID_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNKNOWN_PATIENT_ID_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNKNOWN_STORED_QUERY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNKNOWN_STORED_QUERY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_REGISTRY_DEPRECATED_DOCUMENT_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_DOCUMENT_UNIQUE_ID_ERROR_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_MISSING_HOME_COMMUNITY_ID_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_MISSING_HOME_COMMUNITY_ID_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNAVAILABLE_COMMUNITY_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_RESULT_NOT_SINGLE_PATIENT_LITERAL);
			}
			// SEK - new for 2013
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_NON_IDENTICAL_SIZE_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_NON_IDENTICAL_SIZE_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.XDS_UNKNOWN_REPOSITORY_UNIQUE_ID_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_APPEND_CONTENT_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_FOLDER_CONTENT_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_REPLACE_CONTENT_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_TRANSFORM_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.PARTIAL_TRANSFORM_REPLACE_NOT_PROCESSED_LITERAL);
			}
			else if(e.getErrorCode().equals(XDSErrorCode.DOCUMENT_QUEUED_LITERAL.getName())){
				errors[count].setErrorCode(XDSErrorCode.DOCUMENT_QUEUED_LITERAL);
			}
			// default
			else{
				if(logger.isDebugEnabled()){
					logger.debug("RegistryResponse error " + count +" code is unrecognized.");
				}
				errors[count].setErrorCode(XDSErrorCode.UNKNOWNERROR_LITERAL);
			}
			
			// set code context
			if(e.getCodeContext() != null){
				errors[count].setCodeContext(e.getCodeContext());
			}
			// set location
			if(e.getLocation() != null){
				errors[count].setLocation(e.getLocation());
			}
			// set any additional string payload
			if(e.getValue() != null){
				errors[count].setValue(e.getValue());
			}
			count++;
		}
		return errors;
	}



}
