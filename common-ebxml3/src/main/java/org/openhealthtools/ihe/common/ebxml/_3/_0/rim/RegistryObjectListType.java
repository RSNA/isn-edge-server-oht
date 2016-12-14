/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryObjectListType.java,v 1.1 2006/10/19 20:16:10 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Object List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType#getIdentifiableGroup <em>Identifiable Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType#getIdentifiable <em>Identifiable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectListType()
 * @model extendedMetaData="name='RegistryObjectListType' kind='elementOnly'"
 * @generated
 */
public interface RegistryObjectListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiable Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable Group</em>' attribute list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectListType_IdentifiableGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Identifiable:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIdentifiableGroup();

	/**
	 * Returns the value of the '<em><b>Identifiable</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectListType_Identifiable()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Identifiable' namespace='##targetNamespace' group='Identifiable:group'"
	 * @generated
	 */
	EList getIdentifiable();

} // RegistryObjectListType
