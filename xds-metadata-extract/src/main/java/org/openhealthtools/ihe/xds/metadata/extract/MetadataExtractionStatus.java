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

/**
 * 
 */
package org.openhealthtools.ihe.xds.metadata.extract;


/**
 * Status messages for metadata extraction
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface MetadataExtractionStatus {
	/**
	 * Status indicating that anticipated source infomation is missing, therefore
	 * more than one metadata value will be absent.
	 */
	public static final String MISSING_DATA_SOURCE = "Missing metadata source: ";
	
	/**
	 * Status indicating that anticipated source infomation is missing, therefore
	 * exactly one metadata value will be absent.
	 */
	public static final String MISSING_DATA_VALUE = "Missing metadata value: ";
	
	/**
	 * Status indicating that source infomation is invalid, therefore
	 * the extraction process cannot complete for one or more metadata values possibly resulting
	 * in missing metadata values.
	 */
	public static final String INVALID_DATA_SOURCE = "Invalid metadata source: ";
	
	/**
	 * Status indicating source infomation data could not be found or translated to
	 * the target vocabulary of XDS metadata.
	 */
	public static final String INVALID_VOCAB = "Vocabulary value not found: ";
}
