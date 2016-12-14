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


package org.openhealthtools.ihe.common.hl7v2.format;

/**
 * To represent HL7 V2.x standard message delimiters.
 * We anticipate this
 * functionality (some day) to be absorbed into the HL7v2 stack provided in 
 * org.eclipse.ohf.hl7v2
 *  @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a> 
 * 
 **/

public interface MessageDelimiters {
	/** HL7v2 Message Field separator */
	public static final char FIELD = '|';
	/** HL7v2 Message Component separator */
	public static final char COMPONENT = '^';
	/** HL7v2 Message Subcomponent separator */
	public static final char SUBCOMPONENT = '&';
	/** HL7v2 Message Repitition separator */
	public static final char REPETITION = '~';
	/** HL7v2 Message Excape separator */
	public static final char ESCAPE = '\\';
	/** HL7v2 Message Segment separator */
	public static final String SEGMENT = "\r";

	//public static final String SEGMENT = "<cr>";
	
}
