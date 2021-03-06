/**
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response.response.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XDSQueryResponseTypeValidator {
	boolean validate();

	boolean validateReferences(EList value);
	boolean validateDocumentEntryResponses(EList value);
	boolean validateFolderResponses(EList value);
	boolean validateSubmissionSetResponses(EList value);
	boolean validateAssociations(EList value);
}
