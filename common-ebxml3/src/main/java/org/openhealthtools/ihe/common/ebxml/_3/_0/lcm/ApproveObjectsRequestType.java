/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApproveObjectsRequestType.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approve Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getApproveObjectsRequestType()
 * @model extendedMetaData="name='ApproveObjectsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface ApproveObjectsRequestType extends RegistryRequestType {
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getApproveObjectsRequestType_AdhocQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AdhocQuery' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	AdhocQueryType getAdhocQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}' containment reference.
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getApproveObjectsRequestType_ObjectRefList()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ObjectRefList' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	ObjectRefListType getObjectRefList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType#getObjectRefList <em>Object Ref List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref List</em>' containment reference.
	 * @see #getObjectRefList()
	 * @generated
	 */
	void setObjectRefList(ObjectRefListType value);

} // ApproveObjectsRequestType
