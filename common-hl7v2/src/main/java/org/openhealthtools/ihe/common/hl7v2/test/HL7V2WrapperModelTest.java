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

package org.openhealthtools.ihe.common.hl7v2.test;

/**
 * This class is depricated as of Sept 15, 2006. HL7v2 model has been changed to support XDS
 * metadata and PIX and PDQ client side.<br>
 * To test the object construction from strings, buildFromMessageString 
 * and the 
 * toMessageString methods. Construction assumes component objects are present
 * for value-less components that preceed the final valued component. Cannot enforce
 * datatype compliance
 *  @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a> 
 * 
 **/
public class HL7V2WrapperModelTest {

	/**
	 * Test main demonstrates how to get and set the actual xml values
	 * for this PID 2.5 data model. Also demonstates the use of the
	 * various toMessageString() and buildFromMessageString() methods.
	 * @param args
	 */
	public static void main(String[] args) {
/*		// make an instance of HD for testing
		ComponentType hd1 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType hd2 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType hd3 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType hd = Hl7v2Factory.eINSTANCE.createComponentType();
		
		hd2.setValue("1.2.345.6.777.88.9");
		hd3.setValue("ISO");
		hd.getComponent().add(hd1);
		hd.getComponent().add(hd2);
		hd.getComponent().add(hd3);
		
		// print
		System.out.println(HL7V2MessageFormat.toMessageString(hd, MessageDelimiters.SUBCOMPONENT));
		
		// make an instance of CE for testing
		ComponentType ce1 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType ce2 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType ce3 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType ce4 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType ce5 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType ce6 = Hl7v2Factory.eINSTANCE.createComponentType();
		FieldType ce = Hl7v2Factory.eINSTANCE.createFieldType();
		ce1.setValue("12345-6");
		ce2.setValue("Arthritis");
		
		// test good value in getPatterenLiteralMethod (should print)
		ce3.setValue("99pdq");
		ce5.setValue("Arthritis");
		//ce6.setValue("SNOMED-CT");
		ce.getComponent().add(ce1);
		ce.getComponent().add(ce2);
		ce.getComponent().add(ce3);
		ce.getComponent().add(ce4);
		ce.getComponent().add(ce5);
		ce.getComponent().add(ce6);
		System.out.println(HL7V2MessageFormat.toMessageString(ce, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
	
		// create instance of CX for testing
		ComponentType cx1 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType cx2 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType cx3 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType cx4 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType cx5 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType cx6 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType cx7 = Hl7v2Factory.eINSTANCE.createComponentType();
		ComponentType cx8 = Hl7v2Factory.eINSTANCE.createComponentType();
		cx1.setValue("12345678");
		cx4.getComponent().add(hd1);
		cx4.getComponent().add(hd2);
		cx4.getComponent().add(hd3);
		cx8.setValue("20050708");
		FieldType cx = Hl7v2Factory.eINSTANCE.createFieldType();
		cx.getComponent().add(cx1);
		cx.getComponent().add(cx2);
		cx.getComponent().add(cx3);
		cx.getComponent().add(cx4);
		cx.getComponent().add(cx5);
		cx.getComponent().add(cx6);
		cx.getComponent().add(cx7);
		cx.getComponent().add(cx8);
		System.out.println(HL7V2MessageFormat.toMessageString(cx, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		
		// test the build
		// ... should build all values, even those not in table
		ce = HL7V2MessageFormat.buildFromMessageString("56780-9&Heart Murmer&LOINC&&Irregular Heart Beat&SNOWMED-CT",'&', '*');
		System.out.println(HL7V2MessageFormat.toMessageString(ce,MessageDelimiters.COMPONENT,MessageDelimiters.SUBCOMPONENT));
		
		cx = HL7V2MessageFormat.buildFromMessageString("987654321^^^&999.88.764.33.2.1&ISO^^^^20050713", MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
		System.out.println(HL7V2MessageFormat.toMessageString(cx,MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
	
		FieldType pid2 = HL7V2MessageFormat.buildFromMessageString(
									"987654321^^^&999.88.764.33.2.1&ISO^^^^20050713", 
									MessageDelimiters.COMPONENT, 
									MessageDelimiters.SUBCOMPONENT);
		System.out.println(HL7V2MessageFormat.toMessageString(pid2,MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		System.out.println("Error checks");
		System.out.println("1. empty");
		cx = HL7V2MessageFormat.buildFromMessageString("", MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
		System.out.println("out: " + HL7V2MessageFormat.toMessageString(cx,MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		System.out.println("2. garbage");
		cx = HL7V2MessageFormat.buildFromMessageString("adkjdfndjnivnengainoihdkfak8383938%@#@%%#@#@^^kdalkalkjja", MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
		System.out.println("out: " + HL7V2MessageFormat.toMessageString(cx, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		System.out.println("3. too long");
		ce= HL7V2MessageFormat.buildFromMessageString("abc^def^ghi^jkl^mno^pqr^stu^vwx^yz", MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
		System.out.println("out: " + HL7V2MessageFormat.toMessageString(ce, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		System.out.println("4. delimited, empty");
		ce= HL7V2MessageFormat.buildFromMessageString("^^^^^", MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
		System.out.println("out: " + HL7V2MessageFormat.toMessageString(ce, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		System.out.println("5.null");
		ce= HL7V2MessageFormat.buildFromMessageString(null, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT);
		System.out.println("out: " + HL7V2MessageFormat.toMessageString(ce, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		System.out.println("5.null, un-built");
		ce = Hl7v2Factory.eINSTANCE.createFieldType();
		System.out.println("out: " + HL7V2MessageFormat.toMessageString(ce, MessageDelimiters.COMPONENT, MessageDelimiters.SUBCOMPONENT));
		*/
		
	}
}
