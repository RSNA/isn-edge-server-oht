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

import java.util.ArrayList;

/**
 * Utilities class to aid in the contruction of HL7 V2 message strings.
 * We anticipate this
 * functionality (some day) to be absorbed into the HL7v2 stack provided in 
 * org.eclipse.ohf.hl7v2
 *  @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a> 
 *
 */
public class HL7V2MessageUtils {
	/**
	 * Trims trailing delimiters from the message string
	 * @param msg
	 * @param delimiter
	 */
	public static void trimDelimiters(StringBuffer msg, char delimiter){
		int count  = msg.length()-1;
		while(msg.charAt(count) == delimiter){
			msg.deleteCharAt(count);
			count--;
			if (count < 0)
				break;
		}
	}
	
	/**
	 * Trims trailing delimiters and sub delimiters from the message string
	 * @param msg
	 * @param delimiter
	 * @param subdelimiter
	 */
	public static void trimDelimiters(StringBuffer msg, char delimiter, char subdelimiter){
		int count  = msg.length()-1;
		while(msg.charAt(count) == delimiter || msg.charAt(count) == subdelimiter){
			msg.deleteCharAt(count);
			count--;
			if (count < 0)
				break;
		}
	}
	
	/**
	 * Trims trailing delimiters from the segment message string
	 * @param msg
	 * @param subcomponent
	 * @param component
	 * @param field
	 * @param repetition
	 */
	public static void trimDelimiters(StringBuffer msg, 
			char subcomponent, char component, char field, char repetition){
		int count  = msg.length()-1;
		while(msg.charAt(count) == subcomponent ||msg.charAt(count) == component ||
			  msg.charAt(count) == field || msg.charAt(count) == repetition ){
			msg.deleteCharAt(count);
			count--;
			if (count < 0)
				break;
		}
	}
	
	/**
	 * Parses the given message using the given delimiter into a String 
	 * array in which each element is reserved for a single component
	 * of the message. An element in the string array will be null if a 
	 * component is not present.
	 * @param msg the message string
	 * @param delimiter the HL7 delimiter of the message
	 * @return the ordered ArrayList of individual components and subcomponents
	 */
	public static ArrayList parse(String msg, char delimiter){
		ArrayList components = new ArrayList();
		// check for null message
		if(msg == null) return components;
		
		// process message
		StringBuffer buf = new StringBuffer(msg);
		char previous = delimiter;
		while (buf.length() > 0){
			// check if component present
			if(buf.charAt(0) != delimiter && previous == delimiter){
				StringBuffer componentI = new StringBuffer();
				while(buf.length() > 0 && buf.charAt(0) != delimiter){
					componentI.append(buf.charAt(0));
					previous = buf.charAt(0);
					buf.deleteCharAt(0);
				}
				// set component
				components.add(componentI.toString());
			}
			// otherwise add empty string to preserve positioning
			else{
				components.add("");
			}
			//	advance
			if(buf.length() > 0){
				previous = buf.charAt(0);
				buf.deleteCharAt(0);
			}
		}
		// check for 'empty' final component
		// fix for Issue 115
		if(previous == delimiter){
			components.add("");
		}
		return components;
	}
	
	// test main
	/*
	public static void main(String[] args){
		// TEST HD
		String[] s = parse(3,"^1.2.345.6.777.88.9^ISO", '^');
		for(int i = 0; i <s.length; i++){
			System.out.println(s[i]);
		}
		System.out.println();
		
		// TEST CX
		s = parse(9,"12345678^^^&1.2.345.6.777.88.9&ISO^^^^20050708", '^');
		for(int i = 0; i <s.length; i++){
			System.out.println(s[i]);
		}
		System.out.println();
	}*/
}
