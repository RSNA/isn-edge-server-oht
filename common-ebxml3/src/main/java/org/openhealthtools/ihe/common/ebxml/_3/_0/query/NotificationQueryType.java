/**
 * <copyright>
 * </copyright>
 *
 * $Id: NotificationQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getNotificationQueryType()
 * @model extendedMetaData="name='NotificationQueryType' kind='elementOnly'"
 * @generated
 */
public interface NotificationQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Registry Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #setRegistryObjectQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getNotificationQueryType_RegistryObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getRegistryObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.NotificationQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object Query</em>' containment reference.
	 * @see #getRegistryObjectQuery()
	 * @generated
	 */
	void setRegistryObjectQuery(RegistryObjectQueryType value);

} // NotificationQueryType
