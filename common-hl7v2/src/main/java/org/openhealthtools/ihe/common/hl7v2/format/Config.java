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

import org.openhealthtools.ihe.common.hl7v2.CX;

/**
 * This class is for the configuration of the CX datatypes used in 
 * XDS. In the 2005-2006 Connectathon compliant XDS profile CX.4.1 (assigning authority
 * name) was permitted. The 2006-2007 Connectathon compliant XDS specification
 * has incurred a perminant change PROHIBITING the use of CX.4.1. This
 * config option allows you to turn on and off the usage of CX.4.1. The default 
 * behavior is to NOT use CX.4.1.
 * 
 * @author Sarah Knoop
 * @author Eishay Smith
 * @author Glenn Deen
 *
 * @since OHF 1.0.0
 */
public class Config
{
	
	/**
	 * Controls if the {@link HL7V2MessageFormat} class will include the Assigning Authority Name attibute from the 
	 * {@link CX} object when it formats messages.
	 * 
	 * <br>Default is false
	 * 
	 *  This behavior is used to control the inclusion of this string. Connectathon'07 requries that this not be present -
	 *  while other XDS implementation do use it.
	 */
	private boolean includeCxAssigningAuthorityName = false;

	/**
	 * Static default value for includeCxAssigningAuthorityName
	 */
	private static boolean defaultIncludeCxAssigningAuthorityName = false;
	
	
	/**
	 * local thread context for thread sensitive users
	 */
    private static ThreadLocal sTransactionContext = new ThreadLocal() {
        protected synchronized Object initialValue() {
            return null;
        }
    };

    /**
	 *  Sets if the {@link HL7V2MessageFormat} class will include the Assigning Authority Name attibute from the 
	 * {@link CX} object when it formats messages.
	 * 
	 * <br>Default is false
	 * 
	 *  This behavior is used to control the inclusion of this string. Connectathon'07 requries that this not be present -
	 *  while other XDS implementation do use it.
	 * 
	 * @param include_cx_assigning_authority_name
	 */
    public Config(boolean includeCxAssigningAuthorityName) {
		this.includeCxAssigningAuthorityName = includeCxAssigningAuthorityName;
	}

    
    /**
     * Gets an instance of the Config. The variable includeCxAssigningAuthorityName will be set to the
     * defaultIncludeCxAssigningAuthorityName in the case that no one has invoked start()
     * @return Config instance with includeCxAssigningAuthorityName set.
     */
	public static Config instant(){
		if(null == (Config)sTransactionContext.get()){
			start(Config.defaultIncludeCxAssigningAuthorityName);
		}
        return (Config)sTransactionContext.get();
    }

	/**
	 * Changes the default value used to initialize includeCxAssigningAuthorityName.
	 * @param defaultIncludeCxAssigningAuthorityName
	 */
	public static void setDefaultIncludeCxAssigningAuthorityName(boolean defaultIncludeCxAssigningAuthorityName) {
		Config.defaultIncludeCxAssigningAuthorityName = defaultIncludeCxAssigningAuthorityName;
	}

	/**
	 *  Starts the context of this configuration.
	 *  <br>
	 *  Sets if the {@link HL7V2MessageFormat} class will include the Assigning Authority Name attibute from the 
	 * {@link CX} object when it formats messages.
	 * 
	 * <br>Default is false
	 * 
	 *  This behavior is used to control the inclusion of this string. Connectathon'07 requries that this not be present -
	 *  while other XDS implementation do use it.
	 * 
	 * @param include_cx_assigning_authority_name
	 */
    public static void start(boolean INCLUDE_CX_ASSIGNING_AUTHORITY_NAME) {
        sTransactionContext.set(new Config(INCLUDE_CX_ASSIGNING_AUTHORITY_NAME));
   }

	/**
	 *  Stops the context of this configuration.
	 */
    public static void stop(){
        sTransactionContext.set(null);
    }



	/**
	 * Controls if the {@link HL7V2MessageFormat} class will include the Assigning Authority Name attibute from the 
	 * {@link CX} object when it formats messages.
	 * 
	 * <br>Default is false
	 * 
	 *  This behavior is used to control the inclusion of this string. Connectathon'07 requries that this not be present -
	 *  while other XDS implementation do use it.
	 * @return
	 */
	public boolean isIncludeCxAssigningAuthorityName()
	{
		return includeCxAssigningAuthorityName;
	}	
	
}
