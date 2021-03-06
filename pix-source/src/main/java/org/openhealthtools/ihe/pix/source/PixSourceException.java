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

package org.openhealthtools.ihe.pix.source;

import org.openhealthtools.ihe.utils.IHEException;

public class PixSourceException extends IHEException {

	private static final long serialVersionUID = 8358470240444140881L;
	
	private int errorConditionCode;
    
	/**
	 * Create with a message.
	 * @param message
	 */
	public PixSourceException(String message) {
		super(message);
	}
	
	/**
	 * Create with a message and an error condition.
	 * @param message
	 * @param errorConditionCode
	 */
	public PixSourceException(String message, int errorConditionCode) {
		super(message);
		setErrorCondition(errorConditionCode);
	}
	
	/**
	 * Create with a message and an error condition and exception.
	 * @param message
	 * @param errorConditionCode
	 * @param e
	 */
	public PixSourceException(String message, int errorConditionCode, Throwable e) {
		super(message, e);
		setErrorCondition(errorConditionCode);
	}
	
	/**
	 * Create as a wrapper for some other exception.
	 * @param e
	 */
	public PixSourceException(Throwable e) {
		super(e);
	}

	/**
	 * Create as a wrapper for some other exception with an error condition.
	 * @param e
	 * @param errorConditionCode
	 */
	public PixSourceException(Throwable e, int errorConditionCode) {
		super(e);
		setErrorCondition(errorConditionCode);
	}
	
	/**
	 * Get the error condition for this exception.
	 * @return errorConditionCode
	 */
	public int getErrorCondition() {
		return errorConditionCode;
	}
	
	/**
	 * Set the error condition for this exception.
	 * @param errorConditionCode
	 */
	public void setErrorCondition(int errorConditionCode) {
		this.errorConditionCode = errorConditionCode;
	}
	
}
