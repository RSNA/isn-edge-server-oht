/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.xds.document;

import java.util.HashMap;
import java.util.Map;

/**
 *  Provides constants for type of Documents known by the Source
 *  @version $Revision: 1.1 $
 *  @author <a href="glenn@almaden.ibm.com>Glenn Deen</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class DocumentDescriptor
{
	// Note: The strings here are used in the XDS Source code to select the 
	// appropriate MetadataExtractor to use to extract metadata.  Since many
	// types might map to a mimeType of text/xml, but be distinct the metadata 
	// extraction plugin they require, we must be able to later do a comparision
	// which will yield distinct differences. Thus the type strings used here 
	// must be constructed to allow two types which have the same mime type to be
	// distiguished from one another. The convention use then for conflicting types,
	// is to prefix them with a unique descriptive text, up to a "!". The 
    // portion after the bang ! is the IHE mime Type for the document. - rgd 1/5/2006 (sek 6/8/2006)
	
    /**
     * HL7 CDA R2 document
     */
	public static final DocumentDescriptor CDA_R2 = new DocumentDescriptor("CDA-R2","text/xml");
	
    /**
     * XDS-MS Document 
     */
	public static final DocumentDescriptor XDS_MS = new DocumentDescriptor("XDS-MS","text/x-cda-r2+xml");
	
	
    /**
     * XDS-Lab Document 
     */
	public static final DocumentDescriptor XDS_LAB = new DocumentDescriptor("XDS-LAB","text/xml");
	
	
    /**
     * XDS-SD Document 
     */
	public static final DocumentDescriptor XDS_SD = new DocumentDescriptor("XDS-SD","text/xml");
	
    /**
     * HL7 CDA R1 document
     */
	public static final DocumentDescriptor CDA_R1 = new DocumentDescriptor("CDA-R1","text/xml");
	
    /**
     * CCR Document
     */
	public static final DocumentDescriptor CCR = new DocumentDescriptor("CCR","text/xml");
	
    /**
     * Document is XML structured text
     */
	public static final DocumentDescriptor XML = new DocumentDescriptor("XML","text/xml");
    
    /**
     * Document is PDF
     */
    public static final DocumentDescriptor PDF = new DocumentDescriptor("PDF","application/pdf");
    
    /**
     * Document is DICOM 
     */
	public static final DocumentDescriptor DICOM = new DocumentDescriptor("DICOM","application/dicom");
 
    /**
     * HL7 Lab document
     */
	public static final DocumentDescriptor HL7_LAB = new DocumentDescriptor("HL7-lab", "application/x-hl7");
    
    /**
     * Document type is unknown
     */
	public static final DocumentDescriptor UNKNOWN = new DocumentDescriptor("UNKNOWN","application/octet-stream");
    
	
	/**
	 * Mapping of known MIME Types to Document Descriptor
	 */
	public static final Map<String,DocumentDescriptor> MIME_TYPE_MAP = 
		new HashMap<String,DocumentDescriptor>();
	static {
		MIME_TYPE_MAP.put(XML.getMimeType(), XML);
		MIME_TYPE_MAP.put(PDF.getMimeType(), PDF);
		MIME_TYPE_MAP.put(HL7_LAB.getMimeType(), HL7_LAB);
		MIME_TYPE_MAP.put(DICOM.getMimeType(), DICOM);
	}

	
 /*   ***
     * For use when updateing existing metadata ... and no new document is submitted
     **
     //FIXME - decide on one way to handle exitsing documents ... remove this?
	public static final DocumentDescriptor ReferenceToExisting = new DocumentDescriptor("ReferenceToExisting","");
    */
    
	/** This should ideally be set from among one of the consants below */
	private String descriptor;
	
	/** 
	 * Constructor used to form descriptor objects
	 * @param format
	 * @param mimeType
	 */
	public DocumentDescriptor (String format, String mimeType){
		this.descriptor = format + "!" + mimeType;
	}
	
	public String toString(){
		return this.descriptor;
	}
	
	public String getMimeType(){
		return this.descriptor.substring(this.descriptor.indexOf('!')+1);
	}
	
	public boolean equals(Object o){
		DocumentDescriptor other = null;
		try{
			other = (DocumentDescriptor)o;
		}catch(ClassCastException e){
			return false;
		}
		return this.descriptor.equals(other.descriptor);
	}
	
	/**
	 * Searches for the best-matching document descriptor for the MIME type specified.
	 * If a unknown MIME type is found, then return a generic new MIME type
	 * @param mimeType MIME type to use
	 * @return The best-matching existing Document Descriptor or a new Document Descriptor
	 */
	public static DocumentDescriptor getDocumentDescriptorForMimeType(String mimeType)
	{
		DocumentDescriptor foundDescriptor;
		if (mimeType != null && !"".equals(mimeType)) {
			foundDescriptor = MIME_TYPE_MAP.get(mimeType);
			if (null == foundDescriptor) {
				foundDescriptor = new DocumentDescriptor("UNKNOWN", mimeType);
				MIME_TYPE_MAP.put(foundDescriptor.getMimeType(), foundDescriptor);
			}
		} else {
			foundDescriptor = DocumentDescriptor.UNKNOWN;
		}
		
		return foundDescriptor;
	}
}
