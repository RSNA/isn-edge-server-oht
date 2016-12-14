/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtrinsicObjectQueryType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extrinsic Object Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType#getContentVersionInfoFilter <em>Content Version Info Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getExtrinsicObjectQueryType()
 * @model extendedMetaData="name='ExtrinsicObjectQueryType' kind='elementOnly'"
 * @generated
 */
public interface ExtrinsicObjectQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Content Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Version Info Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Version Info Filter</em>' containment reference.
	 * @see #setContentVersionInfoFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getExtrinsicObjectQueryType_ContentVersionInfoFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ContentVersionInfoFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getContentVersionInfoFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExtrinsicObjectQueryType#getContentVersionInfoFilter <em>Content Version Info Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Version Info Filter</em>' containment reference.
	 * @see #getContentVersionInfoFilter()
	 * @generated
	 */
	void setContentVersionInfoFilter(FilterType value);

} // ExtrinsicObjectQueryType
