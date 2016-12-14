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

package org.openhealthtools.ihe.xds.metadata.constants;
/**
 * IHE XDS Folder Metadata attribute names and related constants
 * @see <a href="http://www.ihe.net/Technical_Framework/index.cfm#IT">IHE Technical Framework</a> 
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface FolderConstants {
	
	/** ExternalIdentifier name for patientId */
	public static final String PATIENT_ID = "XDSFolder.patientId";
	
	/** Slot name for submissionTime */
	public static final String LAST_UPDATE_TIME = "lastUpdateTime";
	
	/** ExternalIdentifier name for uniqueId */
	public static final String UNIQUE_ID = "XDSFolder.uniqueId";
	
	/** Slot name for code scheme slots in Classificaitons */
	public static final String CODING_SCHEME = "codingScheme";
}
