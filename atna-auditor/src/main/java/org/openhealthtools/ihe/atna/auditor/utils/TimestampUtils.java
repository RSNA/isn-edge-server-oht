/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.atna.auditor.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimestampUtils {

	// Conforms to String 
	// 		2008-08-14T09:47:04.350-07:00
	
	private static final String RFC3881_TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	
	//private static final SimpleDateFormat RFC3881_DATE_FORMATTER = new SimpleDateFormat(RFC3881_TIMESTAMP_FORMAT);
	private static final ThreadLocal<SimpleDateFormat> RFC3881_DATE_FORMATTER = new ThreadLocal<SimpleDateFormat>(){
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat(RFC3881_TIMESTAMP_FORMAT);
		}		
	};
	
	private static final String BSDSYSLOG_TIMESTAMP_FORMAT = "MMM dd HH:mm:ss";
	
	//private static final SimpleDateFormat BSDSYSLOG_DATE_FORMATTER = new SimpleDateFormat(BSDSYSLOG_TIMESTAMP_FORMAT, Locale.US);
	private static final ThreadLocal<SimpleDateFormat> BSDSYSLOG_DATE_FORMATTER = new ThreadLocal<SimpleDateFormat>(){
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat(BSDSYSLOG_TIMESTAMP_FORMAT, Locale.US);
		}		
	};
	
	public static String getRFC3881Timestamp()
	{
		return TimestampUtils.getRFC3881Timestamp(new Date());
	}
	
	public static String getRFC3881Timestamp(Date date)
	{
		
		StringBuffer formattedDate = new StringBuffer(RFC3881_DATE_FORMATTER.get().format(date));
		formattedDate.insert((formattedDate.length()-2), ':');
		return formattedDate.toString();
	}
	
	public static String getBSDSyslogDate()
	{
		return getBSDSyslogDate(new Date());
	}
    public static String getBSDSyslogDate(Date date)
    {
    	StringBuffer sb = new StringBuffer(BSDSYSLOG_DATE_FORMATTER.get().format(date));
    	if (sb.charAt(4) == '0') {
    		sb.setCharAt(4, ' ');
    	}
    	return sb.toString();
    }
}
