/**
 *
 * $Id$
 */
package org.openhealthtools.ihe.common.hl7v2.validation;


/**
 * A sample validator interface for {@link org.openhealthtools.ihe.common.hl7v2.XAD}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XADValidator {
	boolean validate();

	boolean validateStreetAddress(String value);
	boolean validateOtherDesignation(String value);
	boolean validateCity(String value);
	boolean validateStateOrProvince(String value);
	boolean validateZipOrPostalCode(String value);
	boolean validateCountry(String value);
	boolean validateCountyParishCode(String value);
}
