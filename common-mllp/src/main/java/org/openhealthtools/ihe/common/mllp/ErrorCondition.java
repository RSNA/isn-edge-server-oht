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

package org.openhealthtools.ihe.common.mllp;

public class ErrorCondition {

	/**
	 * MLLPException - unable to create a socket connection 
	 */
	public static final int mllpNoSocketConnection  =  0;
	
	/**
	 * MLLPException - encountered an unexpected error
	 */
	public static final int mllpUnexpectedError  =  1;
	
	/**
	 * MLLPException - unable to close a socket connection
	 */
	public static final int mllpErrorClosingSocket = 2;
	
	/**
	 * MLLPException - error occurred while using socket
	 */
	public static final int mllpSocketUseError = 3;
	
	/**
	 * MLLPException - exception creating secureSocket
	 */
	public static final int mllpSecureSocketError = 4;
	
	/**
	 * MLLPException - exception creating non-secure socket
	 */
	public static final int mllpNonSecureSocketError = 5;
	
	
	/**
	 * Human friendly display for the error condition
	 * @param value
	 * @return error message
	 */
	public static String display(int value) {
			switch (value) {
			case mllpNoSocketConnection : return "Unable to create a socket connection";
			case mllpUnexpectedError: return "Encountered an unexpected error";
			case mllpErrorClosingSocket: return "Unable to close a socket connection";
			case mllpSocketUseError: return "Error occurred while using socket";
			case mllpSecureSocketError: return "Exception creating secureSocket";
			case mllpNonSecureSocketError: return "Exception creating non-secure socket";
			} return null;
	}
	
	/**
	 * Appropriate accept code for the error condition
	 * @param value
	 * @return accept code
	 */
	public static String acceptCode(int value) {
		switch (value) {
		case mllpNoSocketConnection : return "";
		case mllpUnexpectedError: return "";
		case mllpErrorClosingSocket: return "";
		case mllpSocketUseError: return "";
		case mllpSecureSocketError: return "";
		case mllpNonSecureSocketError: return "";	
		} return null;
	}
	
	/**
	 * HL7 error condition code for the condition
	 * @param value
	 * @return error condition
	 */
	public static String errorCondition(int value) {
		switch (value) {
		case mllpNoSocketConnection : return "";
		case mllpUnexpectedError: return "";
		case mllpErrorClosingSocket: return "";
		case mllpSocketUseError: return "";
		case mllpSecureSocketError: return "";
		case mllpNonSecureSocketError: return "";
		} return null;
	}		
}