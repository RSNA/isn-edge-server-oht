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

/**
 * Exception thrown when the composition of the SubmissionTransationData is 
 * invalid (re-word this). 
 * TODO  not sure if we are going to use this yet.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public class SubmitTransactionCompositionException extends Exception {

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public SubmitTransactionCompositionException(Throwable th) {
	        super(th);
	    }

	    public SubmitTransactionCompositionException(String msg) {
	        super(msg);
	    }

	    public SubmitTransactionCompositionException(String msg, Throwable th) {
	        super(msg, th);
	    }

	    public SubmitTransactionCompositionException() {
	    }
}
