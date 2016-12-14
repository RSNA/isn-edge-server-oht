/**
 * <copyright>
 * </copyright>
 *
 * $Id: NotifyActionType.java,v 1.1 2006/10/19 20:16:10 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notify Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract Base type for all types of Notify Actions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getNotificationOption <em>Notification Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getNotifyActionType()
 * @model extendedMetaData="name='NotifyActionType' kind='empty'"
 * @generated
 */
public interface NotifyActionType extends ActionType {
	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getNotifyActionType_EndPoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='endPoint'"
	 * @generated
	 */
	String getEndPoint();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(String value);

	/**
	 * Returns the value of the '<em><b>Notification Option</b></em>' attribute.
	 * The default value is <code>"urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Option</em>' attribute.
	 * @see #isSetNotificationOption()
	 * @see #unsetNotificationOption()
	 * @see #setNotificationOption(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getNotifyActionType_NotificationOption()
	 * @model default="urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs" unique="false" unsettable="true" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='notificationOption'"
	 * @generated
	 */
	String getNotificationOption();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getNotificationOption <em>Notification Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Option</em>' attribute.
	 * @see #isSetNotificationOption()
	 * @see #unsetNotificationOption()
	 * @see #getNotificationOption()
	 * @generated
	 */
	void setNotificationOption(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getNotificationOption <em>Notification Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationOption()
	 * @see #getNotificationOption()
	 * @see #setNotificationOption(String)
	 * @generated
	 */
	void unsetNotificationOption();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType#getNotificationOption <em>Notification Option</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Option</em>' attribute is set.
	 * @see #unsetNotificationOption()
	 * @see #getNotificationOption()
	 * @see #setNotificationOption(String)
	 * @generated
	 */
	boolean isSetNotificationOption();

} // NotifyActionType
