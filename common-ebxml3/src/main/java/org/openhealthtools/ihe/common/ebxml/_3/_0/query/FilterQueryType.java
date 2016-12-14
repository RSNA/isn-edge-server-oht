/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType#getPrimaryFilter <em>Primary Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getFilterQueryType()
 * @model abstract="true"
 *        extendedMetaData="name='FilterQueryType' kind='elementOnly'"
 * @generated
 */
public interface FilterQueryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Filter</em>' containment reference.
	 * @see #setPrimaryFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getFilterQueryType_PrimaryFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='PrimaryFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getPrimaryFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterQueryType#getPrimaryFilter <em>Primary Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Filter</em>' containment reference.
	 * @see #getPrimaryFilter()
	 * @generated
	 */
	void setPrimaryFilter(FilterType value);

} // FilterQueryType
