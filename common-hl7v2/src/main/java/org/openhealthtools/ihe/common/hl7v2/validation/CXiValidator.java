/**
 *
 * $Id$
 */
package org.openhealthtools.ihe.common.hl7v2.validation;


/**
 * A sample validator interface for {@link org.openhealthtools.ihe.common.hl7v2.CXi}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CXiValidator {
	boolean validate();

	boolean validateIdNumber(String value);
	boolean validateAssigningAuthorityName(String value);
	boolean validateAssigningAuthorityUniversalId(String value);
	boolean validateAssigningAuthorityUniversalIdType(String value);
	boolean validateIdentifierTypeCode(String value);
}
