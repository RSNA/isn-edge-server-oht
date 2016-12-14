/**
 * <copyright>
 * </copyright>
 *
 * $Id: TelephoneNumberType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TelephoneNumber is the mapping of the same named interface in ebRIM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getNumber <em>Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getPhoneType <em>Phone Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberType()
 * @model extendedMetaData="name='TelephoneNumberType' kind='empty'"
 * @generated
 */
public interface TelephoneNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Code</em>' attribute.
	 * @see #setAreaCode(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberType_AreaCode()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String8"
	 *        extendedMetaData="kind='attribute' name='areaCode'"
	 * @generated
	 */
	String getAreaCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getAreaCode <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Code</em>' attribute.
	 * @see #getAreaCode()
	 * @generated
	 */
	void setAreaCode(String value);

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberType_CountryCode()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String8"
	 *        extendedMetaData="kind='attribute' name='countryCode'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberType_Extension()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String8"
	 *        extendedMetaData="kind='attribute' name='extension'"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberType_Number()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String16"
	 *        extendedMetaData="kind='attribute' name='number'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Phone Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Type</em>' attribute.
	 * @see #setPhoneType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getTelephoneNumberType_PhoneType()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String32"
	 *        extendedMetaData="kind='attribute' name='phoneType'"
	 * @generated
	 */
	String getPhoneType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType#getPhoneType <em>Phone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Type</em>' attribute.
	 * @see #getPhoneType()
	 * @generated
	 */
	void setPhoneType(String value);

} // TelephoneNumberType
