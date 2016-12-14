/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType#isNegate <em>Negate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getFilterType()
 * @model extendedMetaData="name='FilterType' kind='empty'"
 * @generated
 */
public interface FilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Negate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate</em>' attribute.
	 * @see #isSetNegate()
	 * @see #unsetNegate()
	 * @see #setNegate(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getFilterType_Negate()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='negate'"
	 * @generated
	 */
	boolean isNegate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType#isNegate <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate</em>' attribute.
	 * @see #isSetNegate()
	 * @see #unsetNegate()
	 * @see #isNegate()
	 * @generated
	 */
	void setNegate(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType#isNegate <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNegate()
	 * @see #isNegate()
	 * @see #setNegate(boolean)
	 * @generated
	 */
	void unsetNegate();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType#isNegate <em>Negate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Negate</em>' attribute is set.
	 * @see #unsetNegate()
	 * @see #isNegate()
	 * @see #setNegate(boolean)
	 * @generated
	 */
	boolean isSetNegate();

} // FilterType
