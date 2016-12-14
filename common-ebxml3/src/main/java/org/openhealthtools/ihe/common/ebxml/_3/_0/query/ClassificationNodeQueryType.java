/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassificationNodeQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Node Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType#getParentQuery <em>Parent Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType#getChildrenQuery <em>Children Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getClassificationNodeQueryType()
 * @model extendedMetaData="name='ClassificationNodeQueryType' kind='elementOnly'"
 * @generated
 */
public interface ClassificationNodeQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Parent Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Query</em>' containment reference.
	 * @see #setParentQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getClassificationNodeQueryType_ParentQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ParentQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getParentQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType#getParentQuery <em>Parent Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Query</em>' containment reference.
	 * @see #getParentQuery()
	 * @generated
	 */
	void setParentQuery(RegistryObjectQueryType value);

	/**
	 * Returns the value of the '<em><b>Children Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getClassificationNodeQueryType_ChildrenQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ChildrenQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChildrenQuery();

} // ClassificationNodeQueryType
