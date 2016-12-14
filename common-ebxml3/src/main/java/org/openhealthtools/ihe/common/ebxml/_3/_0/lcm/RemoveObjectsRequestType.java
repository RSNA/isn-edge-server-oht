/**
 * <copyright>
 * </copyright>
 *
 * $Id: RemoveObjectsRequestType.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRemoveObjectsRequestType()
 * @model extendedMetaData="name='RemoveObjectsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface RemoveObjectsRequestType extends RegistryRequestType {
	/**
	 * Returns the value of the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adhoc Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adhoc Query</em>' containment reference.
	 * @see #setAdhocQuery(AdhocQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRemoveObjectsRequestType_AdhocQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AdhocQuery' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	AdhocQueryType getAdhocQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query</em>' containment reference.
	 * @see #getAdhocQuery()
	 * @generated
	 */
	void setAdhocQuery(AdhocQueryType value);

	/**
	 * Returns the value of the '<em><b>Object Ref List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Ref List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Ref List</em>' containment reference.
	 * @see #setObjectRefList(ObjectRefListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRemoveObjectsRequestType_ObjectRefList()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ObjectRefList' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	ObjectRefListType getObjectRefList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref List</em>' containment reference.
	 * @see #getObjectRefList()
	 * @generated
	 */
	void setObjectRefList(ObjectRefListType value);

	/**
	 * Returns the value of the '<em><b>Deletion Scope</b></em>' attribute.
	 * The default value is <code>"urn:oasis:names:tc:ebxml-regrep:DeletionScopeType:DeleteAll"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletion Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion Scope</em>' attribute.
	 * @see #isSetDeletionScope()
	 * @see #unsetDeletionScope()
	 * @see #setDeletionScope(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRemoveObjectsRequestType_DeletionScope()
	 * @model default="urn:oasis:names:tc:ebxml-regrep:DeletionScopeType:DeleteAll" unique="false" unsettable="true" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='deletionScope'"
	 * @generated
	 */
	String getDeletionScope();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletion Scope</em>' attribute.
	 * @see #isSetDeletionScope()
	 * @see #unsetDeletionScope()
	 * @see #getDeletionScope()
	 * @generated
	 */
	void setDeletionScope(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeletionScope()
	 * @see #getDeletionScope()
	 * @see #setDeletionScope(String)
	 * @generated
	 */
	void unsetDeletionScope();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType#getDeletionScope <em>Deletion Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deletion Scope</em>' attribute is set.
	 * @see #unsetDeletionScope()
	 * @see #getDeletionScope()
	 * @see #setDeletionScope(String)
	 * @generated
	 */
	boolean isSetDeletionScope();

} // RemoveObjectsRequestType
