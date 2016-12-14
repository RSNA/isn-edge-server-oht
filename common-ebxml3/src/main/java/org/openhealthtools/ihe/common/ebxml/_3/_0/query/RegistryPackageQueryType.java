/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryPackageQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Package Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryPackageQueryType#getRegistryObjectQuery <em>Registry Object Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryPackageQueryType()
 * @model extendedMetaData="name='RegistryPackageQueryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryPackageQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Registry Object Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryPackageQueryType_RegistryObjectQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='RegistryObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRegistryObjectQuery();

} // RegistryPackageQueryType
