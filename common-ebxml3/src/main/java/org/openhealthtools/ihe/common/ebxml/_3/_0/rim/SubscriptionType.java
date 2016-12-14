/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubscriptionType.java,v 1.1 2006/10/19 20:16:10 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Subscription for specified Events in an ebXML V3+ registry.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getAction <em>Action</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getNotificationInterval <em>Notification Interval</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getStartTime <em>Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSubscriptionType()
 * @model extendedMetaData="name='SubscriptionType' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Action Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Group</em>' attribute list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSubscriptionType_ActionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Action:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActionGroup();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSubscriptionType_Action()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.ActionType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace' group='Action:group'"
	 * @generated
	 */
	EList getAction();

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSubscriptionType_EndTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='endTime'"
	 * @generated
	 */
	Object getEndTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Object value);

	/**
	 * Returns the value of the '<em><b>Notification Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Interval</em>' attribute.
	 * @see #setNotificationInterval(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSubscriptionType_NotificationInterval()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='notificationInterval'"
	 * @generated
	 */
	Object getNotificationInterval();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getNotificationInterval <em>Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Interval</em>' attribute.
	 * @see #getNotificationInterval()
	 * @generated
	 */
	void setNotificationInterval(Object value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSubscriptionType_Selector()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='selector'"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSubscriptionType_StartTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='startTime'"
	 * @generated
	 */
	Object getStartTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Object value);

} // SubscriptionType
