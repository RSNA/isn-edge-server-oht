/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryPackageType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         RegistryPackage is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *         A RegistryPackage is a named collection of objects.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType#getRegistryObjectList <em>Registry Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryPackageType()
 * @model extendedMetaData="name='RegistryPackageType' kind='elementOnly'"
 * @generated
 */
public interface RegistryPackageType extends RegistryObjectType {
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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryPackageType_RegistryObjectList()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectList' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getRegistryObjectList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType#getRegistryObjectList <em>Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object List</em>' containment reference.
	 * @see #getRegistryObjectList()
	 * @generated
	 */
	void setRegistryObjectList(RegistryObjectListType value);

} // RegistryPackageType
