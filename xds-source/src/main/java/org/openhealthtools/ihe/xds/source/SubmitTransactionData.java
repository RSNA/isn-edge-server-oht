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

package org.openhealthtools.ihe.xds.source;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType;
import org.openhealthtools.ihe.utils.UUID;
import org.openhealthtools.ihe.xds.document.Document;
import org.openhealthtools.ihe.xds.document.DocumentDescriptor;
import org.openhealthtools.ihe.xds.document.XDSDocument;
import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;
import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.metadata.MetadataFactory;
import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;
import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;
import org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1DocumentEntryExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1FolderExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1InputStreamDocumentEntryExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1InputStreamFolderExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1InputStreamSubmissionSetExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1SubmissionSetExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.InputStreamDocumentEntryExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.InputStreamFolderExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.InputStreamSubmissionSetExtractor;
import org.openhealthtools.ihe.xds.metadata.extract.MetadataExtractionException;
import org.openhealthtools.ihe.xds.metadata.extract.cdar2.CDAR2Extractor;
import org.openhealthtools.ihe.xds.metadata.transform.ByteArrayProvideAndRegisterDocumentSetTransformer;
import org.openhealthtools.ihe.xds.metadata.transform.MetadataTransformationException;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * This object represents the transaction payload for ITI-15: Provide and Register
 * Document Set Transaction. It is strongly recommended that the user be familiar
 * with this transaction as documented by IHE (see link below). The transaction is 
 * comprised of two key componets:
 * <li> A list of {@link org.openhealthtools.ihe.xds.document.XDSDocument}s to submit</li>
 * <li> XDS metadata for the transaction {@link org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType}</li>
 * XDS Metadata has 3 parts: DocumentEntry, SubmissionSet, Folder. Each document added to the
 * transaction payload must be accompanied by a corresponding DocumentEntry. Each transaction 
 * payload must have exactly one SubmissionSet. The use of Folder is optional.
 * <br>
 * NOTES:
 * <li>It is strongly recommended that the user let this API generate entryUUIDs for the
 * various pieces of metadata, rather than setting this information manually.</li>
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class SubmitTransactionData {
	/**
	 * Logger for the class
	 */
	private static final Logger logger = Logger.getLogger(SubmitTransactionData.class);

	/**
	 * List of Document Types
	 */
	protected List<XDSDocument> docList;
	
	/**
	 * Metadata to compose
	 */
	protected ProvideAndRegisterDocumentSetType metadata;
	
	/**
	 * Metadata Extractors: keys = Descriptor objects, values = String descriptors 
	 * indicating the extractor to use
	 */
	protected static Map metadataExtractors;
	
	/**
	 * Metadata Transformers: keys = Descriptor objects, values = String descriptors 
	 * indicating the extractor to use
	 */
	protected static Map metadataTransformers;
	
	/**
	 * Loads the extractors and transformers
	 */
	static{
		
		metadataExtractors = new HashMap();

		// add the CDA R2 extractors ... 
		// TODO this part should be configurable
		metadataExtractors.put(DocumentDescriptor.CDA_R2, CDAR2Extractor.DESCRIPTOR);
		metadataExtractors.put(DocumentDescriptor.XDS_LAB, CDAR2Extractor.DESCRIPTOR);
		metadataExtractors.put(DocumentDescriptor.XDS_MS, CDAR2Extractor.DESCRIPTOR);
		metadataExtractors.put(DocumentDescriptor.XDS_SD, CDAR2Extractor.DESCRIPTOR);
		
		metadataTransformers = new HashMap();
	}
	
	/**
	 * Constructor. Initializes document and metadata. Generates a UUID for this submission set. 
	 */
	public SubmitTransactionData() {
		this.docList = new ArrayList<XDSDocument>();
		this.metadata = MetadataFactory.eINSTANCE.createProvideAndRegisterDocumentSetType();
		this.metadata.setSubmissionSet(MetadataFactory.eINSTANCE.createSubmissionSetType());
		this.metadata.getSubmissionSet().setEntryUUID(UUID.generateURN());
	}
	
	/**
	 * @return the docList
	 */
	public List<XDSDocument> getDocList() {
		return this.docList;
	}

	// ----------------------------------------------------------------------------------------
	// DOCUMENT ENTRY RELATED METHODS
	// ----------------------------------------------------------------------------------------
	/**
	 * Add the given document to the Document Submission Set. <br/>Note: Each
	 * document may appear only once per submission set. If the same document
	 * object is added more than once, it will still appear only once in the
	 * document set. The DocumentEntry.entryUUID returned will be the same
	 * object instance for each addition of the same document. Will automatically 
	 * extract metadata from the document if a MetadataExtractor for the 
	 * Document's DocumentDescriptor has been loaded.
	 * 
	 * @param document
	 *            Document to add (@see com.ibm.ihii.xdssource.Document), must not be null
	 * @return a reference (the DocumentEntry.entryUUID) to the document entry metadata created for this document
	 * @throws MetadataExtractionException
	 *             if an error occurred extracting the XDS metadata from the
	 *             document.
	 * @throws SubmitTransactionCompositionException if an error occurred in composing the submit transaction data
	 * @deprecated See {@link #addDocument(XDSDocument)}
	 */
	public String addDocument(Document document) throws MetadataExtractionException, SubmitTransactionCompositionException {
		// null checks
		if(document == null){
			logger.error("Cannot add a null document");
			throw new SubmitTransactionCompositionException("Cannot add a null document");
		}
		
		String method = "addDocument() ";
		if (logger.isDebugEnabled()) logger.debug(method + "adding " + document.getCanonicalPath());
		
		
		// Check if this document is already added. If so then return the
		// existing metadata		
		if (docList.contains(document))
		{
			logger.info(method + "document was previously added - it will not be added again");
			return document.getDocumentEntryUUID();
		}

		// Document Entry metadata for this document
		DocumentEntryType docEntry = null;
		
		//	See if there is an extractor for this kind of document
		String deExtractorDescriptor = (String)metadataExtractors.get(document.getDescriptor());
		if(deExtractorDescriptor == null){
			if (logger.isDebugEnabled()){
				logger.debug("No metadata extractor availiable for " + document.getDescriptor().toString());
			}
			docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
		}
		else if(deExtractorDescriptor.equals(CDAR2Extractor.DESCRIPTOR)){
			try {
				InputStream input = document.getStream();
				ClinicalDocument cda = CDAUtil.load(input);
				CDAR2Extractor deExtractor = new CDAR2Extractor(cda);
				docEntry = deExtractor.extract();
			} catch (IOException e) {
				logger.error("An IOException occurred during the extraction process." , e);
				docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
			} 
			catch (Exception e) {
				logger.error("An Exception occurred during the extraction process." , e);
				docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
			} 
		}
		else{
			if (logger.isDebugEnabled()){
				logger.debug("Metadata Extraction is not enabled at this time for " + 
						document.getDescriptor().toString());
			}
		}
		
		// set the document entry UUID on the meta and in the document object
		String docEntryUUID = UUID.generateURN();
		docEntry.setEntryUUID(docEntryUUID);
		document.setDocumentEntryUUID(docEntryUUID);
		if (logger.isDebugEnabled()){
			logger.debug("DocumentEntry.entryUUID generated and set to: " + docEntryUUID);
		}
		
		// set mime type
		docEntry.setMimeType(document.getDescriptor().getMimeType());
		
		// add metadata
		this.metadata.getDocumentEntry().add(docEntry);
		this.metadata.getSubmissionSet().getAssociatedDocuments().add(docEntryUUID);
		
		// add document
		this.docList.add(document);
		
		if (logger.isDebugEnabled()) logger.debug(method + "document was successfully added.");
		return document.getDocumentEntryUUID();
	}
	
	/**
	 * Add the given document to the Document Submission Set. <br/>Note: Each
	 * document may appear only once per submission set. If the same document
	 * object is added more than once, it will still appear only once in the
	 * document set. The DocumentEntry.entryUUID returned will be the same
	 * object instance for each addition of the same document. Will automatically 
	 * extract metadata from the document if a MetadataExtractor for the 
	 * Document's DocumentDescriptor has been loaded.
	 * 
	 * @param document
	 *            Document to add (@see com.ibm.ihii.xdssource.Document), must not be null
	 * @return a reference (the DocumentEntry.entryUUID) to the document entry metadata created for this document
	 * @throws MetadataExtractionException
	 *             if an error occurred extracting the XDS metadata from the
	 *             document.
	 * @throws SubmitTransactionCompositionException if an error occurred in composing the submit transaction data
	 */
	public String addDocument(XDSDocument document) throws MetadataExtractionException, SubmitTransactionCompositionException {
		// null checks
		if(document == null){
			logger.error("Cannot add a null document");
			throw new SubmitTransactionCompositionException("Cannot add a null document");
		}
		
		String method = "addDocument() ";
		if (logger.isDebugEnabled()) logger.debug(method + "adding " + document.getCanonicalPath());
		
		
		// Check if this document is already added. If so then return the
		// existing metadata		
		if (docList.contains(document))
		{
			logger.info(method + "document was previously added - it will not be added again");
			return document.getDocumentEntryUUID();
		}

		// Document Entry metadata for this document
		DocumentEntryType docEntry = null;
		
		//	See if there is an extractor for this kind of document
		String deExtractorDescriptor = (String)metadataExtractors.get(document.getDescriptor());
		if(deExtractorDescriptor == null){
			if (logger.isDebugEnabled()){
				logger.debug("No metadata extractor availiable for " + document.getDescriptor().toString());
			}
			docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
		}
		else if(deExtractorDescriptor.equals(CDAR2Extractor.DESCRIPTOR)){
			try {	
				// Sage HACK!! Save the loaded EPackage off
				EPackage eOrigPackage = EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
				 
				// Sage HACK!! load the package that we actually want
				EPackage.Registry.INSTANCE.put(CDAPackage.eNS_URI, CDAPackage.eINSTANCE);
				
				InputStream input = document.getStream();
				/* FIXME Not sure what this is for.  There may or may not be a way to set this option via the MDHT CDA tools apis
				if (EMFUtils.isEMFValidationRelaxed()){
					if (resources instanceof XMLResource) {
						resources.getDefaultLoadOptions()
								.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
										Boolean.TRUE);
					}
				}*/

				ClinicalDocument cda = CDAUtil.load(input);
				
				// Sage HACK!! Restore the loaded EPackage for this namespace
				if (eOrigPackage != null)
					EPackage.Registry.INSTANCE.put(CDAPackage.eNS_URI, eOrigPackage);
				
				CDAR2Extractor deExtractor = new CDAR2Extractor(cda);
				docEntry = deExtractor.extract();
			} catch (IOException e) {
				logger.error("An IOException occurred during the extraction process." , e);
				docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
			} catch (Exception e) {
				logger.error("An Exception occurred during the extraction process." , e);
				docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
			} 
		}
		else{
			if (logger.isDebugEnabled()){
				logger.debug("Metadata Extraction is not enabled at this time for " + 
						document.getDescriptor().toString());
			}
		}
		
		// set the document entry UUID on the meta and in the document object
		String docEntryUUID = UUID.generateURN();
		docEntry.setEntryUUID(docEntryUUID);
		document.setDocumentEntryUUID(docEntryUUID);
		if (logger.isDebugEnabled()){
			logger.debug("DocumentEntry.entryUUID generated and set to: " + docEntryUUID);
		}
		
		// set mime type
		docEntry.setMimeType(document.getDescriptor().getMimeType());
		
		// add metadata
		this.metadata.getDocumentEntry().add(docEntry);
		this.metadata.getSubmissionSet().getAssociatedDocuments().add(docEntryUUID);
		
		// add document
		this.docList.add(document);
		
		if (logger.isDebugEnabled()) logger.debug(method + "document was successfully added.");
		return document.getDocumentEntryUUID();
	}
	
	/**
	 * Loads the DocumentEntry metadata from the file specified, INCLUDING
	 * the entryUUID of the document entry, if present. It is advisible not to include this element in the
	 * file unless there are special circumstances. The DocumentEntry.entryUUID will be generated, if
	 * not present in the file.  File format is to be conform to stipulations
	 * outlined in {@link org.openhealthtools.ihe.xds.metadata.extract.InputStreamDocumentEntryExtractor}
	 * Also, the document will be added. Note: Each
	 * document may appear only once per submission set. If the same document
	 * object is attempted to be added more than once, it will not be added to 
	 * the document set. The DocumentEntry.entryUUID returned will be the existing
	 * object instance this document.
	 * @param metadata InputStream containing metadata.xsd compliant metadata metadata
	 * @return the current entryUUID of this document entry metadata
	 * @throws MetadataExtractionException if an error occurred extracting the XDS metadata from the
	 *             document.
	 * @throws SubmitTransactionCompositionException if an error occurred in composing the submit transaction data
	 */
	public String loadDocumentWithMetadata(XDSDocument document, InputStream metadata) throws MetadataExtractionException, SubmitTransactionCompositionException {
		// null checks
		if(document == null){
			logger.error("Cannot add a null document");
			throw new SubmitTransactionCompositionException("Cannot add a null document");
		}
		
		String method = "loadDocumentWithMetadata() ";
		if (logger.isDebugEnabled()) logger.debug(method + "adding " + document.getCanonicalPath());

		// Check if this document is already added. If so then return the
		// existing metadata		
		if (docList.contains(document))
		{
			logger.info(method + "document was previously added - it will not be added again");
			return document.getDocumentEntryUUID();
		}
		
		// Extract meta from input stream
		InputStreamDocumentEntryExtractor deExtractor = new InputStreamDocumentEntryExtractor(metadata);
		DocumentEntryType docEntry = deExtractor.extract();
		
//		if(docEntry.eIsProxy()){
//			System.out.println("DOC ENTRY IS EPROXY COMING BACK FROM EXTRACT");
//		}
		
		if(docEntry.getEntryUUID() == null ){
			docEntry.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug(" DocumentEntry entryUUID generated.");
			}
		}
		else if(docEntry.getEntryUUID().length() == 0){
			docEntry.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug(" DocumentEntry entryUUID generated.");
			}
		}
		// set mime type
		docEntry.setMimeType(document.getDescriptor().getMimeType());
		
		// add document
		document.setDocumentEntryUUID(docEntry.getEntryUUID());
		this.docList.add(document);
		
		// add metadata
		this.metadata.getDocumentEntry().add(docEntry);
		this.metadata.getSubmissionSet().getAssociatedDocuments().add(docEntry.getEntryUUID());
		
		if(logger.isDebugEnabled()){
			logger.debug("Document metadata loaded. Current DocumentEntry entryUUID: " + 
					docEntry.getEntryUUID() +".");
		}
		
		if (logger.isDebugEnabled()){
			logger.debug(method + "document was successfully added.");
		}
		return document.getDocumentEntryUUID();
	}
	
	/**
	 * Loads the DocumentEntry metadata from the ebXML file specified, INCLUDING
	 * the entryUUID of the document entry, if present. It is advisible 
	 * to set the id attribute in the ebXML file to the empty
	 * string, rather than replace the entryUUID assigned by this object, 
	 * unless special circumstances exist. The DocumentEntry.entryUUID will be generated, if
	 * not present in the file.  File format is to be conform to stipulations
	 * outlined in {@link org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1InputStreamDocumentEntryExtractor}
	 * Also, the document will be added. Note: Each
	 * document may appear only once per submission set. If the same document
	 * object is attempted to be added more than once, it will not be added to 
	 * the document set. The DocumentEntry.entryUUID returned will be the existing
	 * object instance this document.
	 * @param metadata InputStream containing ebXML compliant metadata metadata
	 * @return the current entryUUID of this document entry metadata
	 * @throws MetadataExtractionException if an error occurred extracting the XDS metadata from the
	 *             document.
	 * @throws SubmitTransactionCompositionException if an error occurred in composing the submit transaction data
	 */
	public String loadDocumentWithEbXMLMetadata(XDSDocument document, InputStream metadata) throws MetadataExtractionException, SubmitTransactionCompositionException {
		// null checks
		if(document == null){
			logger.error("Cannot add a null document");
			throw new SubmitTransactionCompositionException("Cannot add a null document");
		}
		
		String method = "loadDocumentWithEbXMLMetadata() ";
		if (logger.isDebugEnabled()) logger.debug(method + "adding " + document.getCanonicalPath());

		// Check if this document is already added. If so then return the
		// existing metadata		
		if (docList.contains(document))
		{
			logger.info(method + "document was previously added - it will not be added again");
			return document.getDocumentEntryUUID();
		}
		
		// Extract meta from file
		EbXML_2_1InputStreamDocumentEntryExtractor deExtractor = new EbXML_2_1InputStreamDocumentEntryExtractor(metadata);
		DocumentEntryType docEntry = deExtractor.extract();

		if(docEntry.getEntryUUID() == null ){
			docEntry.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug(" DocumentEntry entryUUID generated.");
			}
		}
		else if(docEntry.getEntryUUID().length() == 0){
			docEntry.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug(" DocumentEntry entryUUID generated.");
			}
		}
		// set mime type
		docEntry.setMimeType(document.getDescriptor().getMimeType());
		
		// add document
		document.setDocumentEntryUUID(docEntry.getEntryUUID());
		this.docList.add(document);
		
		// add metadata
		this.metadata.getDocumentEntry().add(docEntry);
		this.metadata.getSubmissionSet().getAssociatedDocuments().add(docEntry.getEntryUUID());
		
		if(logger.isDebugEnabled()){
			logger.debug("Document metadata loaded. Current DocumentEntry entryUUID: " + 
					docEntry.getEntryUUID() +".");
		}
		
		if (logger.isDebugEnabled()) logger.debug(method + "document was successfully added.");
		return document.getDocumentEntryUUID();
	}
	
	/**
	 * Loads the DocumentEntry metadata from the ebXML objects specified, INCLUDING
	 * the entryUUID of the document entry, if present. It is advisible 
	 * to set the id attribute in the ExtrinsicObject to the empty
	 * string, rather than replace the entryUUID assigned by this object, 
	 * unless special circumstances exist. The DocumentEntry.entryUUID will be generated, if
	 * not present in the file.
	 * Also, the document will be added. Note: Each
	 * document may appear only once per submission set. If the same document
	 * object is attempted to be added more than once, it will not be added to 
	 * the document set. The DocumentEntry.entryUUID returned will be the existing
	 * object instance this document.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1DocumentEntryExtractor
	 * @param docData ebXML object containg metadata for the document, cannot be null
	 * @param parentData ebXML object containing metadata for a parent document, if 
	 * applicable. may be set to null if no parent document exists.
	 * @return the current entryUUID of this document entry metadata
	 * @throws MetadataExtractionException if an error occurred extracting the XDS metadata from the
	 *             document.
	 * @throws SubmitTransactionCompositionException if an error occurred in composing the submit transaction data
	 */
	public String loadDocumentWithEbXMLMetadata(XDSDocument document, 
			ExtrinsicObjectType docData, AssociationType1 parentData) throws MetadataExtractionException, SubmitTransactionCompositionException {
		// null checks
		if(document == null){
			logger.error("Cannot add a null document");
			throw new SubmitTransactionCompositionException("Cannot add a null document");
		}
		
		String method = "loadDocumentWithEbXMLMetadata() ";
		if (logger.isDebugEnabled()) logger.debug(method + "adding " + document.getCanonicalPath());

		// Check if this document is already added. If so then return the
		// existing metadata		
		if (docList.contains(document))
		{
			logger.info(method + "document was previously added - it will not be added again");
			return document.getDocumentEntryUUID();
		}
		
		// Extract meta from file
		EbXML_2_1DocumentEntryExtractor deExtractor = new EbXML_2_1DocumentEntryExtractor(docData, parentData);
		DocumentEntryType docEntry = deExtractor.extract();

		if(docEntry.getEntryUUID() == null ){
			docEntry.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug(" DocumentEntry entryUUID generated.");
			}
		}
		else if(docEntry.getEntryUUID().length() == 0){
			docEntry.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug(" DocumentEntry entryUUID generated.");
			}
		}
		// set mime type
		docEntry.setMimeType(document.getDescriptor().getMimeType());
		
		// add document
		document.setDocumentEntryUUID(docEntry.getEntryUUID());
		this.docList.add(document);
		
		// add metadata
		this.metadata.getDocumentEntry().add(docEntry);
		this.metadata.getSubmissionSet().getAssociatedDocuments().add(docEntry.getEntryUUID());
		
		if(logger.isDebugEnabled()){
			logger.debug("Document metadata loaded. Current DocumentEntry entryUUID: " + 
					docEntry.getEntryUUID() +".");
		}
		
		if (logger.isDebugEnabled()) logger.debug(method + "document was successfully added.");
		return document.getDocumentEntryUUID();
	}
	
	/**
	 * Add document that already exists in the XDS Registry to the Document Submission Set. 
	 * <br/>
	 * Note: Each
	 * document may appear only once per submission set. If the same document
	 * object is added more than once, it will still appear only once in the
	 * document set. The DocumentEntry.entryUUID returned will be the same
	 * object instance for each addition of the same document.
	 * 
	 * @param documentEntryUUID the DocumentEntry.entryUUID for the existing document
	 */
	public void addExistingDocument(String documentEntryUUID) throws MetadataExtractionException {
		String method = "addExistingDocument() ";
		if (logger.isDebugEnabled()) logger.debug(method + "adding existing document");

		// Check if this document is already added. If so then return the
		// existing metadata		
		Iterator i = this.metadata.getDocumentEntry().iterator();
		while(i.hasNext()){
			if(documentEntryUUID.equals(((DocumentEntryType)i.next()).getEntryUUID())){
				logger.info(method + "document was previously added - it will not be added again");
				return;	
			}
		}
		
		// create an existing document entry
		DocumentEntryType docEntry = MetadataFactory.eINSTANCE.createDocumentEntryType();
		docEntry.setEntryUUID(documentEntryUUID);

		// set "existing" flag
		docEntry.setExisting(true);
		
		// add metadata
		this.metadata.getDocumentEntry().add(docEntry);
		this.metadata.getSubmissionSet().getAssociatedDocuments().add(documentEntryUUID);
		
		if(logger.isDebugEnabled()){
			logger.debug("Document metadata loaded. Current DocumentEntry entryUUID: " + 
					docEntry.getEntryUUID() +".");
		}

		if (logger.isDebugEnabled()) logger.debug(method + "document was successfully added.");
	}
	

	/**
	 * Removes the document and its associated metadata. Removes any references to the document from
	 * folders. If the document does not exist in the set, nothing is done.
	 * 
	 * @param documentEntryUUID
	 *            Reference to the DocumentEntryType object corresponding to the Document to
	 *            remove
	 */
	public void deleteDocument(String documentEntryUUID) {
		// confirm metadata is present
		Iterator i = this.metadata.getDocumentEntry().iterator();
		boolean present = false;
		while(i.hasNext()){
			DocumentEntryType docEntry = (DocumentEntryType)i.next();
			if(docEntry.getEntryUUID().equals(documentEntryUUID)){
				present = true;
				// remove it, while we're at it
				if(logger.isDebugEnabled()){
					logger.debug("DocumentEntry metadata found for entryUUID: " + 
							documentEntryUUID +". Removing DocumentEntry metadata.");
				}
				this.metadata.getDocumentEntry().remove(docEntry);
				this.metadata.getSubmissionSet().getAssociatedDocuments().remove(documentEntryUUID);
				
				break;
			}	
		}
		if(!present){
			logger.info("DocumentEntry metadata for entryUUID = " + documentEntryUUID +" does not exist.");
			return;
		}
		
		// Locate the document with the given metadata
		i = this.docList.iterator();
		while (i.hasNext())
		{
			XDSDocument document = (XDSDocument)i.next();
			if (document.getDocumentEntryUUID().equals(documentEntryUUID))
			{
				if(logger.isDebugEnabled()){
					logger.debug("Document found for entryUUID: " + documentEntryUUID +". Removing Document.");
				}
				this.docList.remove(document);
				break;
			}
		}
		
		// remove from folders
		i = this.metadata.getFolder().iterator();
		while(i.hasNext()){
			FolderType fol = (FolderType)i.next();
			Iterator j = fol.getAssociatedDocuments().iterator();
			while(j.hasNext()){
				String assocDoc = (String)i.next();
				if(assocDoc.equals(documentEntryUUID)){
					if(logger.isDebugEnabled()){
						logger.debug("Associated folder found for entryUUID: " + 
								documentEntryUUID +". Removing reference in folder:  ." +
								fol.getEntryUUID());
					}
					fol.getAssociatedDocuments().remove(documentEntryUUID);
					break;
				}
			}
		}
	}

	/**
	 * Returns the DocumentEntryType metadata object for the
	 * specified documentEntryUUID. If the corresponding document has not been added to the submission
	 * set, then null is returned.
	 * @param documentEntryUUID
	 * @return DocumentEntryType object for the specified document, or null if
	 *         the document is not in the submission set.
	 */
	
	//	 * TODO --- should there be a check to verify that a document in the set has 
	// corresponding metadata in this method??
	public DocumentEntryType getDocumentEntry(String documentEntryUUID) {
		Iterator i = this.metadata.getDocumentEntry().iterator();
		while(i.hasNext()){
			DocumentEntryType docEntry = (DocumentEntryType)i.next();
			if(docEntry.getEntryUUID().equals(documentEntryUUID)){
				if(logger.isDebugEnabled()){
					logger.debug("DocumentEntry metadata found for entryUUID: " + documentEntryUUID +".");
				}
				return docEntry;
			}	
		}
		if(logger.isDebugEnabled()){
			logger.debug("DocumentEntry metadata NOT found for entryUUID: " + documentEntryUUID +".");
		}
		return null;
	}
	

	/**
	 * Returns the Document object associated with the
	 * specified documentEntryUUID.
	 * If no such Document exists, null is returned.
	 * @param documentEntryUUID
	 * @return Associate Document or null
	 */
	//	 * TODO --- should there be a check to verify that a document in the set has 
	// corresponding metadata in this method??
	public XDSDocument getDocument(String documentEntryUUID)
	{
		Iterator i = this.docList.iterator();
		while (i.hasNext())
		{
			XDSDocument document = (XDSDocument)i.next();
			if (document.getDocumentEntryUUID().equals(documentEntryUUID))
			{
				if(logger.isDebugEnabled()){
					logger.debug("Document found for entryUUID: " + documentEntryUUID +".");
				}
				return document;
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("Document NOT found for entryUUID: " + documentEntryUUID +".");
		}
		return null;
	}
	
	/**
	 * Checks to see if the specified document object has been added to the
	 * Source
	 * 
	 * @param document
	 *            document object to look for
	 * @return true if the document was found, false otherwise
	 */
	public boolean isDocumentAdded(XDSDocument document) {
		return this.docList.contains(document);
	}

	// ----------------------------------------------------------------------------------------
	// FOLDER RELATED METHODS
	// ----------------------------------------------------------------------------------------
	
	/**
	 * Create and Add a folder to the submission set
	 * 
	 * @return Returns the entryUUID of the FolderType created
	 */
	public String addFolder() {
		FolderType folder = MetadataFactory.eINSTANCE.createFolderType();
		folder.setEntryUUID(UUID.generateURN());
		this.metadata.getFolder().add(folder);
		this.metadata.getSubmissionSet().getAssociatedFolders().add(folder.getEntryUUID());
		if(logger.isDebugEnabled()){
			logger.debug("Folder added with entryUUID: " + folder.getEntryUUID() +".");
		}
		return folder.getEntryUUID();
	}
	
	/**
	 * Loads Folder metadata from the file specified, INCLUDING
	 * the entryUUID of the folder, if present. It is advisible not to include this element in the
	 * file unless there are special circumstances. Subsequantly, adds the folder to 
	 * this object. File format is to be conform to stipulations
	 * outlined in {@link org.openhealthtools.ihe.xds.metadata.extract.InputStreamFolderExtractor}
	 * @param folderStream InputStream contiaing a metadata.xsd compliant folder
	 * @return the current entryUUID of the folder added
	 * @throws MetadataExtractionException
	 */
	public String loadFolder(InputStream folderStream) throws MetadataExtractionException {
		InputStreamFolderExtractor folExtractor = new InputStreamFolderExtractor(folderStream);
		FolderType folder = folExtractor.extract();
		if(folder.getEntryUUID() == null ){
			folder.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug("Folder entryUUID generated.");
			}
		}
		else if(folder.getEntryUUID().length() == 0){
			folder.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug("Folder entryUUID generated.");
			}
		}

		// add metadata
		this.metadata.getFolder().add(folder);
		this.metadata.getSubmissionSet().getAssociatedFolders().add(folder.getEntryUUID());
		
		if(logger.isDebugEnabled()){
			logger.debug("Folder metadata loaded. Current Folder entryUUID: " + 
					folder.getEntryUUID() +".");
		}
		return folder.getEntryUUID();
	}
	
	/**
	 * Loads Folder metadata from the file specified, INCLUDING
	 * the entryUUID of the folder, if present. It is advisible 
	 * to set the id attribute in the ebXML file to the empty
	 * string, rather than replace the entryUUID assigned by this object, 
	 * unless special circumstances exist. Subsequantly, adds the folder to 
	 * this object. File format is to be conform to stipulations
	 * outlined in {@link org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1InputStreamFolderExtractor}
	 * @param folderStream InputStream contiaing a ebXML compliant folder
	 * @return the current entryUUID of the folder added
	 * @throws MetadataExtractionException
	 */
	public String loadEbXMLFolder(InputStream folderStream) throws MetadataExtractionException {
		EbXML_2_1InputStreamFolderExtractor folExtractor = new EbXML_2_1InputStreamFolderExtractor(folderStream);
		FolderType folder = folExtractor.extract();
		if(folder.getEntryUUID() == null ){
			folder.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug("Folder entryUUID generated.");
			}
		}
		else if(folder.getEntryUUID().length() == 0){
			folder.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug("Folder entryUUID generated.");
			}
		}

		// add metadata
		this.metadata.getFolder().add(folder);
		this.metadata.getSubmissionSet().getAssociatedFolders().add(folder.getEntryUUID());
		
		if(logger.isDebugEnabled()){
			logger.debug("Folder metadata loaded. Current Folder entryUUID: " + 
					folder.getEntryUUID() +".");
		}
		return folder.getEntryUUID();
	}
	
	/**
	 * Loads Folder metadata from the file specified, INCLUDING
	 * the entryUUID of the folder, if present. It is advisible 
	 * to set the id attribute in the RegistryPackage to the empty
	 * string, rather than replace the entryUUID assigned by this object, 
	 * unless special circumstances exist. Subsequantly, adds the folder to 
	 * this object.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1FolderExtractor
	 * @param folData ebXML object containg metadata for this folder, cannot be null
	 * @return the current entryUUID of the folder added
	 * @throws MetadataExtractionException
	 */
	public String loadEbXMLFolder(RegistryPackageType folData) throws MetadataExtractionException {
		EbXML_2_1FolderExtractor folExtractor = new EbXML_2_1FolderExtractor(folData, null);
		FolderType folder = folExtractor.extract();
		if(folder.getEntryUUID() == null ){
			folder.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug("Folder entryUUID generated.");
			}
		}
		else if(folder.getEntryUUID().length() == 0){
			folder.setEntryUUID(UUID.generateURN());
			if(logger.isDebugEnabled()){
				logger.debug("Folder entryUUID generated.");
			}
		}

		// add metadata
		this.metadata.getFolder().add(folder);
		this.metadata.getSubmissionSet().getAssociatedFolders().add(folder.getEntryUUID());
		
		if(logger.isDebugEnabled()){
			logger.debug("Folder metadata loaded. Current Folder entryUUID: " + 
					folder.getEntryUUID() +".");
		}
		return folder.getEntryUUID();
	}

	/**
	 * Add folder that already exists in the XDS Registry to the Document Submission Set. 
	 * @param folderEntryUUID the Folder.entryUUID for the existing folder
	 */
	public void addExistingFolder(String folderEntryUUID) throws MetadataExtractionException {
		String method = "addExistingDocument() ";
		if (logger.isDebugEnabled()) logger.debug(method + "adding existing document");

		// Check if this folder is already added. If so then return the
		// existing metadata		
		Iterator i = this.metadata.getFolder().iterator();
		while(i.hasNext()){
			if(folderEntryUUID.equals(((FolderType)i.next()).getEntryUUID())){
				logger.info(method + "folder was previously added - it will not be added again");
				return;	
			}
		}
		
		// create an existing folder
		FolderType folder = MetadataFactory.eINSTANCE.createFolderType();
		folder.setEntryUUID(folderEntryUUID);

		// set "existing" flag
		folder.setExisting(true);
		
		// add metadata
		this.metadata.getFolder().add(folder);
		this.metadata.getSubmissionSet().getAssociatedFolders().add(folder.getEntryUUID());
		
		if(logger.isDebugEnabled()){
			logger.debug("Document metadata loaded. Current DocumentEntry entryUUID: " + 
					folder.getEntryUUID() +".");
		}

		if (logger.isDebugEnabled()) logger.debug(method + "document was successfully added.");
	}
	
	/**
	 * Remove(delete) the folder to the submission set with the corresponding
	 * folderEntryUUID
	 * 
	 * @param folderEntryUUID of the folder to remove (delete)
	 */
	public void deleteFolder(String folderEntryUUID) {
		Iterator i = this.metadata.getFolder().iterator();
		while(i.hasNext()){
			FolderType folder = (FolderType)i.next();
			if(folder.getEntryUUID().equals(folderEntryUUID)){
				// remove it
				if(logger.isDebugEnabled()){
					logger.debug("Folder metadata found for entryUUID: " + 
							folderEntryUUID +". Removing Folder metadata.");
				}
				this.metadata.getFolder().remove(folder);
				this.metadata.getSubmissionSet().getAssociatedFolders().remove(folderEntryUUID);
				return;
			}	
		}
		if(logger.isDebugEnabled()){
			logger.debug("Folder metadata NOT found for entryUUID: " + 
					folderEntryUUID +".");
		}
	}
	
	/**
	 * Returns the FolderType metadata object for the
	 * specified folderEntryUUID. If the corresponding folder has not been added to the submission
	 * set, then null is returned.
	 */
	public FolderType getFolder(String folderEntryUUID)
	{
		Iterator i = this.metadata.getFolder().iterator();
		while (i.hasNext())
		{
			FolderType folder = (FolderType)i.next(); 
			if (folder.getEntryUUID().equals(folderEntryUUID)){
				if(logger.isDebugEnabled()){
					logger.debug("Folder found for entryUUID: " + folderEntryUUID +".");
				}
				return folder; 
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("Folder NOT found for entryUUID: " + folderEntryUUID +".");
		}
		return null;
	}

	/**
	 * Adds the documentEntryUUID reference to the specified folder's list of
	 * associated documents. If the folder does not exist, the reference is not added.
	 * If the document is already in the folder, the reference is not added.
	 */
	public void addDocumentToFolder(String documentEntryUUID, String folderEntryUUID){
		Iterator i = this.metadata.getFolder().iterator();
		while (i.hasNext())
		{
			FolderType folder = (FolderType)i.next(); 
			if (folder.getEntryUUID().equals(folderEntryUUID)){
				if(logger.isDebugEnabled()){
					logger.debug("Folder found for entryUUID: " + folderEntryUUID +".");
				}
				if(folder.getAssociatedDocuments().contains(documentEntryUUID)){
					if(logger.isDebugEnabled()){
						logger.debug("Folder contains document with entryUUID: " + documentEntryUUID +".");
					}
					return;
				}
				folder.getAssociatedDocuments().add(documentEntryUUID);
				if(logger.isDebugEnabled()){
					logger.debug("Document reference added to folder with entryUUID: " + documentEntryUUID +".");
				}
				return;
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("Folder NOT found for entryUUID: " + folderEntryUUID +".");
		}
	}

	/**
	 * Removes (deletes) the documentEntryUUID reference to the specified folder's list of
	 * associated documents. If the folder does not exist, the referecnce is not deleted.
	 */
	public void deleteDocumentFromFolder(String documentEntryUUID, String folderEntryUUID){
		Iterator i = this.metadata.getFolder().iterator();
		while (i.hasNext())
		{
			FolderType folder = (FolderType)i.next(); 
			if (folder.getEntryUUID().equals(folderEntryUUID)){
				if(logger.isDebugEnabled()){
					logger.debug("Folder found for entryUUID: " + folderEntryUUID +".");
				}
				folder.getAssociatedDocuments().remove(documentEntryUUID);
				if(logger.isDebugEnabled()){
					logger.debug("Document reference removed from folder with entryUUID: " + documentEntryUUID +".");
				}
				return;
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("Folder NOT found for entryUUID: " + folderEntryUUID +".");
		}
	}
	
	// ----------------------------------------------------------------------------------------
	// Submission Set RELATED METHODS
	// ----------------------------------------------------------------------------------------
	/**
	 * Returns a reference to this Submission Set's metadata
	 * @return SubmissionSetType object holding the metadata for the transaction
	 */
	public SubmissionSetType getSubmissionSet() {
		return this.metadata.getSubmissionSet();
	}

	/**
	 * Replaces the current SubmissionSet metadata from the file specified, INCLUDING
	 * the entryUUID of the submission, if present. It is advisible not to include this element in the
	 * file unless there are special circumstances.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.InputStreamSubmissionSetExtractor
	 * @param submissionSetStream InputStream contiaing a metadata.xsd compliant folder
	 * @throws MetadataExtractionException
	 */
	public void loadSubmissionSet(InputStream submissionSetStream) throws MetadataExtractionException {
		InputStreamSubmissionSetExtractor ssExtractor = new InputStreamSubmissionSetExtractor(submissionSetStream);
		SubmissionSetType sSet = ssExtractor.extract();
		if(logger.isDebugEnabled()){
			logger.debug("Previous Submission entryUUID: " + 
					this.metadata.getSubmissionSet().getEntryUUID() +".");
		}
		if(sSet.getEntryUUID() == null ){
			sSet.setEntryUUID(this.metadata.getSubmissionSet().getEntryUUID());
		}
		else if(sSet.getEntryUUID().length() == 0){
			sSet.setEntryUUID(this.metadata.getSubmissionSet().getEntryUUID());
		}
		this.metadata.setSubmissionSet(sSet);
		if(logger.isDebugEnabled()){
			logger.debug("Submission Set metadata loaded. Current Submission entryUUID: " + 
					this.metadata.getSubmissionSet().getEntryUUID() +".");
		}
	}
	
	/**
	 * Replaces the current SubmissionSet metadata with values from the 
	 * EbXML v2.1 file specified, INCLUDING
	 * the entryUUID of the submission, if present. It is advisible 
	 * to set the id attribute in the ebXML file to the empty
	 * string, rather than replace the entryUUID assigned by this object, 
	 * unless special circumstances exist. File format is to be conform to stipulations
	 * outlined in {@link org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1InputStreamSubmissionSetExtractor}
	 * @param submissionSetStream InputStream contiaing a ebXML compliant folder
	 * @throws MetadataExtractionException
	 */
	//	FIXME ensure that the note above retains schema compliancy
	public void loadEbXMLSubmissionSet(InputStream submissionSetStream) throws MetadataExtractionException {
		EbXML_2_1InputStreamSubmissionSetExtractor ssExtractor = new EbXML_2_1InputStreamSubmissionSetExtractor(submissionSetStream);
		SubmissionSetType sSet = ssExtractor.extract();
		if(logger.isDebugEnabled()){
			logger.debug("Previous Submission entryUUID: " + 
					this.metadata.getSubmissionSet().getEntryUUID() +".");
		}
		if(sSet.getEntryUUID() == null ){
			sSet.setEntryUUID(this.metadata.getSubmissionSet().getEntryUUID());
		}
		else if(sSet.getEntryUUID().length() == 0){
			sSet.setEntryUUID(this.metadata.getSubmissionSet().getEntryUUID());
		}
		this.metadata.setSubmissionSet(sSet);
		if(logger.isDebugEnabled()){
			logger.debug("Submission Set metadata loaded. Current Submission entryUUID: " + 
					this.metadata.getSubmissionSet().getEntryUUID() +".");
		}
	}
	
	/**
	 * Replaces the current SubmissionSet metadata with values from the 
	 * EbXML v2.1 RegistryPackage object specified, INCLUDING
	 * the entryUUID of the submission, if present. It is advisible 
	 * to set the id attribute in the RegistryPackage to the empty
	 * string, rather than replace the entryUUID assigned by this object, 
	 * unless special circumstances exist.
	 * @see org.openhealthtools.ihe.xds.metadata.extract.EbXML_2_1SubmissionSetExtractor
	 * @param setData ebXML object containg metadata for the submission set, cannot be null
	 * @throws MetadataExtractionException
	 */
	//	FIXME ensure that the note above retains schema compliancy
	public void loadEbXMLSubmissionSet(RegistryPackageType setData) throws MetadataExtractionException {
		EbXML_2_1SubmissionSetExtractor ssExtractor = new EbXML_2_1SubmissionSetExtractor(setData, null, null);
		SubmissionSetType sSet = ssExtractor.extract();
		if(logger.isDebugEnabled()){
			logger.debug("Previous Submission entryUUID: " + 
					this.metadata.getSubmissionSet().getEntryUUID() +".");
		}
		if(sSet.getEntryUUID() == null ){
			sSet.setEntryUUID(this.metadata.getSubmissionSet().getEntryUUID());
		}
		else if(sSet.getEntryUUID().length() == 0){
			sSet.setEntryUUID(this.metadata.getSubmissionSet().getEntryUUID());
		}
		this.metadata.setSubmissionSet(sSet);
		if(logger.isDebugEnabled()){
			logger.debug("Submission Set metadata loaded. Current Submission entryUUID: " + 
					this.metadata.getSubmissionSet().getEntryUUID() +".");
		}
	}
	
	// ----------------------------------------------------------------------------------------
	// Provide and Register Document Set RELATED METHODS
	// ----------------------------------------------------------------------------------------
	
	/**
	 * @return the metadata
	 */
	public ProvideAndRegisterDocumentSetType getMetadata() {
		
/*		if(this.metadata.eIsProxy()){
			System.out.println("METADATA IS E-PROXY!!!");
		}*/
		return this.metadata;
	}

	/** 
	 * Returns a file containing the current state of all metadata set in this submission
	 * @param path path to output file
	 */
	public void saveMetadataToFile(String path)throws MetadataTransformationException{
		ByteArrayProvideAndRegisterDocumentSetTransformer setTransformer = new ByteArrayProvideAndRegisterDocumentSetTransformer();
		setTransformer.transform(this.metadata);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(new File(path));
			fos.write(setTransformer.getMetadataByteArray());
		} catch (FileNotFoundException e1) {
			logger.error("File not found: " + path);
			throw new MetadataTransformationException("File not found: " + path, e1);
		}catch (IOException e) {
			logger.error("IOException while writing to file: " +path, e);
			throw new MetadataTransformationException("IOException while writing to file: " +path,e);
		}

	}
}
