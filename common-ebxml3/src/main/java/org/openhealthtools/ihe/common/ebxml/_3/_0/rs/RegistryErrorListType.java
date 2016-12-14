/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryErrorListType.java,v 1.1 2006/10/19 20:16:34 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType#getRegistryError <em>Registry Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryErrorListType()
 * @model extendedMetaData="name='RegistryErrorList_._type' kind='elementOnly'"
 * @generated
 */
public interface RegistryErrorListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Registry Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Error</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryErrorListType_RegistryError()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='RegistryError' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRegistryError();

	/**
	 * Returns the value of the '<em><b>Highest Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highest Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highest Severity</em>' attribute.
	 * @see #setHighestSeverity(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage#getRegistryErrorListType_HighestSeverity()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='highestSeverity'"
	 * @generated
	 */
	String getHighestSeverity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType#getHighestSeverity <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highest Severity</em>' attribute.
	 * @see #getHighestSeverity()
	 * @generated
	 */
	void setHighestSeverity(String value);

} // RegistryErrorListType
