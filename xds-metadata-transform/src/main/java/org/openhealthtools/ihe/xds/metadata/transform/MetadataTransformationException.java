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

package org.openhealthtools.ihe.xds.metadata.transform;
/**
 * Indicates error in transforming metadata to the target format.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class MetadataTransformationException extends Exception {
    public MetadataTransformationException(Throwable th) {
        super(th);
    }

    public MetadataTransformationException(String msg) {
        super(msg);
    }

    public MetadataTransformationException(String msg, Throwable th) {
        super(msg, th);
    }

    public MetadataTransformationException() {
    }
}
