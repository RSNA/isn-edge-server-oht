/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompoundFilterType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLeftFilter <em>Left Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getRightFilter <em>Right Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLogicalOperator <em>Logical Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getCompoundFilterType()
 * @model extendedMetaData="name='CompoundFilterType' kind='elementOnly'"
 * @generated
 */
public interface CompoundFilterType extends FilterType {
	/**
	 * Returns the value of the '<em><b>Left Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Filter</em>' containment reference.
	 * @see #setLeftFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getCompoundFilterType_LeftFilter()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='LeftFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getLeftFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLeftFilter <em>Left Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Filter</em>' containment reference.
	 * @see #getLeftFilter()
	 * @generated
	 */
	void setLeftFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Right Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Filter</em>' containment reference.
	 * @see #setRightFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getCompoundFilterType_RightFilter()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='RightFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getRightFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getRightFilter <em>Right Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Filter</em>' containment reference.
	 * @see #getRightFilter()
	 * @generated
	 */
	void setRightFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Logical Operator</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operator</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
	 * @see #isSetLogicalOperator()
	 * @see #unsetLogicalOperator()
	 * @see #setLogicalOperator(LogicalOperatorType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getCompoundFilterType_LogicalOperator()
	 * @model default="AND" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='logicalOperator'"
	 * @generated
	 */
	LogicalOperatorType getLogicalOperator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLogicalOperator <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operator</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType
	 * @see #isSetLogicalOperator()
	 * @see #unsetLogicalOperator()
	 * @see #getLogicalOperator()
	 * @generated
	 */
	void setLogicalOperator(LogicalOperatorType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLogicalOperator <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogicalOperator()
	 * @see #getLogicalOperator()
	 * @see #setLogicalOperator(LogicalOperatorType)
	 * @generated
	 */
	void unsetLogicalOperator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType#getLogicalOperator <em>Logical Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Logical Operator</em>' attribute is set.
	 * @see #unsetLogicalOperator()
	 * @see #getLogicalOperator()
	 * @see #setLogicalOperator(LogicalOperatorType)
	 * @generated
	 */
	boolean isSetLogicalOperator();

} // CompoundFilterType
