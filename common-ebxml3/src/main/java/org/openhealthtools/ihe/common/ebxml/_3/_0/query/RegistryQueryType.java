/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType#getOperatorQuery <em>Operator Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryQueryType()
 * @model extendedMetaData="name='RegistryQueryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Operator Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Query</em>' containment reference.
	 * @see #setOperatorQuery(OrganizationQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryQueryType_OperatorQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='OperatorQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationQueryType getOperatorQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryQueryType#getOperatorQuery <em>Operator Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Query</em>' containment reference.
	 * @see #getOperatorQuery()
	 * @generated
	 */
	void setOperatorQuery(OrganizationQueryType value);

} // RegistryQueryType
