/*******************************************************************************
 * Copyright (c) 2009 Sage Software, Inc. and its affiliated entities.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sage - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.ihe.common.ws.client;

import org.w3c.dom.Element;

/**
 * Data wrapper for IHE SOAP response payloads.  Contains 
 * the core elements.
 * 
 * @author <a href="mailto:venkataraman.sethuraman@sage.com">Venkataraman Sethuraman</a>
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class IHESOAPResponsePayload
{
	/**
	 * SOAP response element
	 */
	protected Element responseElement;
	
	/**
	 * @return the responseElement
	 */
	public Element getResponseElement() 
	{
		return responseElement;
	}
	
	/**
	 * @param responseElement the responseElement to set
	 */
	public void setResponseElement(Element responseElement) 
	{
		this.responseElement = responseElement;
	}
	
}