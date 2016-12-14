/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrganizationQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getAddressFilter <em>Address Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getTelephoneNumberFilter <em>Telephone Number Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getEmailAddresseFilter <em>Email Addresse Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getParentQuery <em>Parent Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getChildOrganizationQuery <em>Child Organization Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getPrimaryContactQuery <em>Primary Contact Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getOrganizationQueryType()
 * @model extendedMetaData="name='OrganizationQueryType' kind='elementOnly'"
 * @generated
 */
public interface OrganizationQueryType extends RegistryObjectQueryType {
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getOrganizationQueryType_AddressFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AddressFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAddressFilter();

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getOrganizationQueryType_TelephoneNumberFilter()
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getOrganizationQueryType_EmailAddresseFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='EmailAddresseFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getEmailAddresseFilter();

	/**
	 * Returns the value of the '<em><b>Parent Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Query</em>' containment reference.
	 * @see #setParentQuery(OrganizationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getOrganizationQueryType_ParentQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ParentQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getParentQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getParentQuery <em>Parent Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Query</em>' containment reference.
	 * @see #getParentQuery()
	 * @generated
	 */
	void setParentQuery(OrganizationQueryType value);

	/**
	 * Returns the value of the '<em><b>Child Organization Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Organization Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Organization Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getOrganizationQueryType_ChildOrganizationQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ChildOrganizationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChildOrganizationQuery();

	/**
	 * Returns the value of the '<em><b>Primary Contact Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Contact Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Contact Query</em>' containment reference.
	 * @see #setPrimaryContactQuery(PersonQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getOrganizationQueryType_PrimaryContactQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='PrimaryContactQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonQueryType getPrimaryContactQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.OrganizationQueryType#getPrimaryContactQuery <em>Primary Contact Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Contact Query</em>' containment reference.
	 * @see #getPrimaryContactQuery()
	 * @generated
	 */
	void setPrimaryContactQuery(PersonQueryType value);

} // OrganizationQueryType
