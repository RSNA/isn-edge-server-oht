/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuditableEventQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auditable Event Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getAffectedObjectQuery <em>Affected Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getEventTypeQuery <em>Event Type Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getUserQuery <em>User Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAuditableEventQueryType()
 * @model extendedMetaData="name='AuditableEventQueryType' kind='elementOnly'"
 * @generated
 */
public interface AuditableEventQueryType extends FilterQueryType {
	/**
	 * Returns the value of the '<em><b>Affected Object Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Object Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Object Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAuditableEventQueryType_AffectedObjectQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AffectedObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAffectedObjectQuery();

	/**
	 * Returns the value of the '<em><b>Event Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type Query</em>' containment reference.
	 * @see #setEventTypeQuery(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAuditableEventQueryType_EventTypeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='EventTypeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getEventTypeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getEventTypeQuery <em>Event Type Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type Query</em>' containment reference.
	 * @see #getEventTypeQuery()
	 * @generated
	 */
	void setEventTypeQuery(ClassificationNodeQueryType value);

	/**
	 * Returns the value of the '<em><b>User Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Query</em>' containment reference.
	 * @see #setUserQuery(UserQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAuditableEventQueryType_UserQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='UserQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	UserQueryType getUserQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AuditableEventQueryType#getUserQuery <em>User Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Query</em>' containment reference.
	 * @see #getUserQuery()
	 * @generated
	 */
	void setUserQuery(UserQueryType value);

} // AuditableEventQueryType
