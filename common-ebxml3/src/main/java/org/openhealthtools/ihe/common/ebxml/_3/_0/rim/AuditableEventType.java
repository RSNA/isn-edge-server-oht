/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuditableEventType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auditable Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Event that forms an audit trail in ebXML Registry.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getAffectedObjects <em>Affected Objects</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAuditableEventType()
 * @model extendedMetaData="name='AuditableEventType' kind='elementOnly'"
 * @generated
 */
public interface AuditableEventType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Affected Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Objects</em>' containment reference.
	 * @see #setAffectedObjects(ObjectRefListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAuditableEventType_AffectedObjects()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='affectedObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefListType getAffectedObjects();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getAffectedObjects <em>Affected Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Objects</em>' containment reference.
	 * @see #getAffectedObjects()
	 * @generated
	 */
	void setAffectedObjects(ObjectRefListType value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see #setEventType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAuditableEventType_EventType()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='eventType'"
	 * @generated
	 */
	String getEventType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(String value);

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAuditableEventType_RequestId()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='requestId'"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAuditableEventType_Timestamp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='timestamp'"
	 * @generated
	 */
	Object getTimestamp();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Object value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAuditableEventType_User()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // AuditableEventType
