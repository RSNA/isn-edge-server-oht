/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonQueryType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getAddressFilter <em>Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getPersonNameFilter <em>Person Name Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getEmailAddresseFilter <em>Email Addresse Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getPersonQueryType()
 * @model extendedMetaData="name='PersonQueryType' kind='elementOnly'"
 * @generated
 */
public interface PersonQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Address Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getPersonQueryType_AddressFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AddressFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAddressFilter();

	/**
	 * Returns the value of the '<em><b>Person Name Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Name Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name Filter</em>' containment reference.
	 * @see #setPersonNameFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getPersonQueryType_PersonNameFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='PersonNameFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getPersonNameFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.PersonQueryType#getPersonNameFilter <em>Person Name Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name Filter</em>' containment reference.
	 * @see #getPersonNameFilter()
	 * @generated
	 */
	void setPersonNameFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Telephone Number Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Number Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Number Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getPersonQueryType_TelephoneNumberFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TelephoneNumberFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTelephoneNumberFilter();

	/**
	 * Returns the value of the '<em><b>Email Addresse Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Addresse Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Addresse Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getPersonQueryType_EmailAddresseFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='EmailAddresseFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getEmailAddresseFilter();

} // PersonQueryType
