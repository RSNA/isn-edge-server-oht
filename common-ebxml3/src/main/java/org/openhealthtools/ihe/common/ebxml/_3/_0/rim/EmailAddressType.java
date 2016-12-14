/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmailAddressType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping of the same named interface in ebRIM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getEmailAddressType()
 * @model extendedMetaData="name='EmailAddressType' kind='empty'"
 * @generated
 */
public interface EmailAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getEmailAddressType_Address()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ShortName" required="true"
	 *        extendedMetaData="kind='attribute' name='address'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getEmailAddressType_Type()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String32"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // EmailAddressType
