/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubscriptionQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType#getSelectorQuery <em>Selector Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSubscriptionQueryType()
 * @model extendedMetaData="name='SubscriptionQueryType' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Selector Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector Query</em>' containment reference.
	 * @see #setSelectorQuery(AdhocQueryQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSubscriptionQueryType_SelectorQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SelectorQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	AdhocQueryQueryType getSelectorQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SubscriptionQueryType#getSelectorQuery <em>Selector Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Query</em>' containment reference.
	 * @see #getSelectorQuery()
	 * @generated
	 */
	void setSelectorQuery(AdhocQueryQueryType value);

} // SubscriptionQueryType
