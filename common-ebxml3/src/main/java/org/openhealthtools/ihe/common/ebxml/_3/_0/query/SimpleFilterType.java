/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleFilterType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getDomainAttribute <em>Domain Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSimpleFilterType()
 * @model abstract="true"
 *        extendedMetaData="name='SimpleFilterType' kind='empty'"
 * @generated
 */
public interface SimpleFilterType extends FilterType {
	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The default value is <code>"LE"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
	 * @see #isSetComparator()
	 * @see #unsetComparator()
	 * @see #setComparator(ComparatorType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSimpleFilterType_Comparator()
	 * @model default="LE" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='comparator'"
	 * @generated
	 */
	ComparatorType getComparator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType
	 * @see #isSetComparator()
	 * @see #unsetComparator()
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(ComparatorType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComparator()
	 * @see #getComparator()
	 * @see #setComparator(ComparatorType)
	 * @generated
	 */
	void unsetComparator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getComparator <em>Comparator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comparator</em>' attribute is set.
	 * @see #unsetComparator()
	 * @see #getComparator()
	 * @see #setComparator(ComparatorType)
	 * @generated
	 */
	boolean isSetComparator();

	/**
	 * Returns the value of the '<em><b>Domain Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Attribute</em>' attribute.
	 * @see #setDomainAttribute(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSimpleFilterType_DomainAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='domainAttribute'"
	 * @generated
	 */
	String getDomainAttribute();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType#getDomainAttribute <em>Domain Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Attribute</em>' attribute.
	 * @see #getDomainAttribute()
	 * @generated
	 */
	void setDomainAttribute(String value);

} // SimpleFilterType
