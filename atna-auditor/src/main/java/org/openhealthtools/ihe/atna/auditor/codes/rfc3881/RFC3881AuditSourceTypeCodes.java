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
package org.openhealthtools.ihe.atna.auditor.codes.rfc3881;

import org.openhealthtools.ihe.atna.auditor.models.rfc3881.CodedValueType;

/**
 * Audit Source Type Codes defined by RFC 3881
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 * @since OHT IHE Profiles 0.4.0
 */
public abstract class RFC3881AuditSourceTypeCodes extends CodedValueType
{
	protected RFC3881AuditSourceTypeCodes(String value, String displayName)
	{
		setCodeSystemName("RFC-3881");
		setDisplayName(displayName);
		setCode(value);
	}
	
	/**
	 * "1", "End User Display Device"
	 */
	public static class EndUserDisplayDevice extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "1", "End User Display Device"
		 */
		public EndUserDisplayDevice()
		{
			super("1", "End User Display Device");
		}
	}
	
	/**
	 * "2", "Data Acquisition Device"
	 */
	public static class DataAcquisitionDevice extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "2", "Data Acquisition Device"
		 */
		public DataAcquisitionDevice()
		{
			super("2", "Data Acquisition Device");
		}
	}
	
	/**
	 * "3", "Web Server Process"
	 */
	public static class WebServerProcess extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "3", "Web Server Process"
		 */
		public WebServerProcess()
		{
			super("3", "Web Server Process");
		}
	}
	
	/**
	 * "4", "Application Server Process"
	 */
	public static class ApplicationServerProcess extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "4", "Application Server Process"
		 */
		public ApplicationServerProcess()
		{
			super("4", "Application Server Process");
		}
	}
	
	/**
	 * "5", "Database Server Process"
	 */
	public static class DatabaseServerProcess extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "5", "Database Server Process"
		 */
		public DatabaseServerProcess()
		{
			super("5", "Database Server Process");
		}
	}
	
	/**
	 * "6", "Security Server"
	 */
	public static class SecurityServer extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "6", "Security Server"
		 */
		public SecurityServer()
		{
			super("6", "Security Server");
		}
	}
	
	/**
	 * "7", "Network Component"
	 */
	public static class NetworkComponent extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "7", "Network Component"
		 */
		public NetworkComponent()
		{
			super("7", "Network Component");
		}
	}
	
	/**
	 * "8", "Operating Software"
	 */
	public static class OperatingSoftware extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "8", "Operating Software"
		 */
		public OperatingSoftware()
		{
			super("8", "Operating Software");
		}
	}
	
	/**
	 * "9", "External Source"
	 */
	public static class ExternalSource extends RFC3881AuditSourceTypeCodes
	{
		/**
		 * "9", "External Source"
		 */
		public ExternalSource()
		{
			super("9", "External Source");
		}
	}
}
