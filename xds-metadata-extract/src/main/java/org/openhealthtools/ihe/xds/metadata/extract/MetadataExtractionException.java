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
 * Indication that something went wrong during metadata
 * extraction from the source data.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 */
public class MetadataExtractionException extends Exception {
    public MetadataExtractionException(Throwable th) {
        super(th);
    }

    public MetadataExtractionException(String msg) {
        super(msg);
    }

    public MetadataExtractionException(String msg, Throwable th) {
        super(msg, th);
    }

    public MetadataExtractionException() {
    }
}
