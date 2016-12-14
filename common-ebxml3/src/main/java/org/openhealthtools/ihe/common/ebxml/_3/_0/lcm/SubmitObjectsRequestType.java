/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubmitObjectsRequestType.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submit Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType#getRegistryObjectList <em>Registry Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getSubmitObjectsRequestType()
 * @model extendedMetaData="name='SubmitObjectsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface SubmitObjectsRequestType extends RegistryRequestType {
	/**
	 * Returns the value of the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object List</em>' containment reference.
	 * @see #setRegistryObjectList(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getSubmitObjectsRequestType_RegistryObjectList()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='RegistryObjectList' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	RegistryObjectListType getRegistryObjectList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType#getRegistryObjectList <em>Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object List</em>' containment reference.
	 * @see #getRegistryObjectList()
	 * @generated
	 */
	void setRegistryObjectList(RegistryObjectListType value);

} // SubmitObjectsRequestType
