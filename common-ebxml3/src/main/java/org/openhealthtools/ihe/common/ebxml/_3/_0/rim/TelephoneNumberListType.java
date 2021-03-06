/**
 * <copyright>
 * </copyright>
 *
 * $Id: TelephoneNumberListType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType#getTelephoneNumber <em>Telephone Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberListType()
 * @model extendedMetaData="name='TelephoneNumberListType' kind='elementOnly'"
 * @generated
 */
public interface TelephoneNumberListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Number</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberListType_TelephoneNumber()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TelephoneNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTelephoneNumber();

} // TelephoneNumberListType
