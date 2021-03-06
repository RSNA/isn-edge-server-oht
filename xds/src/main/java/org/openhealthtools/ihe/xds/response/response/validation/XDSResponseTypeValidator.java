/**
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response.response.validation;

import org.openhealthtools.ihe.xds.response.response.XDSErrorListType;
import org.openhealthtools.ihe.xds.response.response.XDSStatusType;

/**
 * A sample validator interface for {@link org.openhealthtools.ihe.xds.response.response.XDSResponseType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XDSResponseTypeValidator {
	boolean validate();

	boolean validateErrorList(XDSErrorListType value);
	boolean validateStatus(XDSStatusType value);
}
