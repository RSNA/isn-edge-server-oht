/**
 * <copyright>
 * </copyright>
 *
 * $Id: PostalAddressType.java,v 1.1 2006/10/19 20:16:10 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping of the same named interface in ebRIM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCity <em>City</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreet <em>Street</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreetNumber <em>Street Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getPostalAddressType()
 * @model extendedMetaData="name='PostalAddressType' kind='empty'"
 * @generated
 */
public interface PostalAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getPostalAddressType_City()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='city'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getPostalAddressType_Country()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='country'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getPostalAddressType_PostalCode()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='postalCode'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Or Province</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #setStateOrProvince(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getPostalAddressType_StateOrProvince()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='stateOrProvince'"
	 * @generated
	 */
	String getStateOrProvince();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #getStateOrProvince()
	 * @generated
	 */
	void setStateOrProvince(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getPostalAddressType_Street()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='street'"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Number</em>' attribute.
	 * @see #setStreetNumber(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getPostalAddressType_StreetNumber()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String32"
	 *        extendedMetaData="kind='attribute' name='streetNumber'"
	 * @generated
	 */
	String getStreetNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType#getStreetNumber <em>Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Number</em>' attribute.
	 * @see #getStreetNumber()
	 * @generated
	 */
	void setStreetNumber(String value);

} // PostalAddressType
