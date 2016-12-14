/*******************************************************************************
 * Copyright (c) 2007,2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.common.ws.utils;

import java.io.File;

/**
 * Utility class for the OHT IHE SOAP Handler classes.
 * 
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 */
public class SOAPUtils {

	/**
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str)
	{
		return (null == str || str.equals(""));
	}
	
	/**
	 * @param fileToCheck
	 * @return
	 */
	private static String canWriteToDir(File fileToCheck)
	{
		try {
			if (!fileToCheck.isDirectory()) {
				if (fileToCheck.exists()) {
					fileToCheck = fileToCheck.getParentFile();
				} else {
					if (!fileToCheck.mkdirs()) {
						return null;
					}
				}
			}
			
			File.createTempFile("ihe", "test", fileToCheck).delete();
			
			return fileToCheck.getCanonicalPath();
		} catch (Exception ioe) {
			return null;
		}
	}
	
	/**
	 * @param dirsToCheck
	 * @return
	 */
	public static String checkAttachmentTempDirectory(String[] dirsToCheck)
	{
		String path;
		for (String dirToCheck : dirsToCheck) {
			if (!SOAPUtils.isNullOrEmpty(dirToCheck)) {
				path = canWriteToDir(new File(dirToCheck));
				if (!SOAPUtils.isNullOrEmpty(path)) {
					return path;
				}
			}
		}
		return null;
	}
	
}
