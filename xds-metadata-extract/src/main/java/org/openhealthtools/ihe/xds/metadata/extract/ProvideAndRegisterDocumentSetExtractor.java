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

package org.openhealthtools.ihe.xds.metadata.extract;

import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;

/**
 * Implementations of this interface will extract data from the
 * associated source format and produce the entire set of metadata
 * for a particular submission transaction.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface ProvideAndRegisterDocumentSetExtractor {

	public ProvideAndRegisterDocumentSetType extract() throws MetadataExtractionException;
		
}
