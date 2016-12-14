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

import org.openhealthtools.ihe.xds.metadata.ProvideAndRegisterDocumentSetType;

/**
 * Implementations of this interface will provide the mechanism to 
 * render an instance of a particular target format for the information
 * contained within the given ProvideAndRegisterDocumentSetType object.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface ProvideAndRegisterDocumentSetTransformer {

	public void transform(ProvideAndRegisterDocumentSetType docSet)throws MetadataTransformationException;
}
