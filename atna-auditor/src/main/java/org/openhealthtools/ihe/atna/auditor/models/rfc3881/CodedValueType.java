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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.13 at 04:13:48 PM PDT 
//


package org.openhealthtools.ihe.atna.auditor.models.rfc3881;

import org.apache.commons.lang.StringEscapeUtils;



/**
 * <p>Java class for CodedValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}CodeSystem"/>
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "CodedValueType")

public class CodedValueType {

    //@XmlAttribute(required = true)
    protected String code;
    //@XmlAttribute
    protected String displayName;
    //@XmlAttribute
    protected String originalText;
    //@XmlAttribute
    protected String codeSystem;
    //@XmlAttribute
    protected String codeSystemName;

    
    public String toString(String tagName)
    {
    	StringBuffer sb = new StringBuffer();
    	sb.append("<"+ tagName);
    	//code
    	sb.append(" code=\"");
    	sb.append(code);
    	sb.append("\"");
    	//displayName
    	if (displayName != null) {
	    	sb.append(" displayName=\"");
	    	sb.append(StringEscapeUtils.escapeXml(displayName));
	    	sb.append("\"");
    	}
    	//originalText
    	if (originalText != null) {
  
	    	sb.append(" originalText=\"");
	    	sb.append(StringEscapeUtils.escapeXml(originalText));
	    	sb.append("\"");
    	}
    	//codeSystem
    	if (codeSystem != null) {
  
	    	sb.append(" codeSystem=\"");
	    	sb.append(StringEscapeUtils.escapeXml(codeSystem));
	    	sb.append("\"");
    	}
    	//codeSystemName
    	if (codeSystemName != null) {
  
	    	sb.append(" codeSystemName=\"");
	    	sb.append(StringEscapeUtils.escapeXml(codeSystemName));
	    	sb.append("\"");
    	}
    	
    	sb.append("/>");
    	return sb.toString();
    }
    
    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the originalText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalText() {
        return originalText;
    }

    /**
     * Sets the value of the originalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalText(String value) {
        this.originalText = value;
    }

    /**
     * Gets the value of the codeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystem(String value) {
        this.codeSystem = value;
    }

    /**
     * Gets the value of the codeSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemName() {
        return codeSystemName;
    }

    /**
     * Sets the value of the codeSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemName(String value) {
        this.codeSystemName = value;
    }

}
