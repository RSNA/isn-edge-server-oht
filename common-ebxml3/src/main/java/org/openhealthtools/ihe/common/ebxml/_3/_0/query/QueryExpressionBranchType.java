/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryExpressionBranchType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType#getQueryLanguageQuery <em>Query Language Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getQueryExpressionBranchType()
 * @model extendedMetaData="name='QueryExpressionBranchType' kind='elementOnly'"
 * @generated
 */
public interface QueryExpressionBranchType extends BranchType {
	/**
	 * Returns the value of the '<em><b>Query Language Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Language Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Language Query</em>' containment reference.
	 * @see #setQueryLanguageQuery(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getQueryExpressionBranchType_QueryLanguageQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='QueryLanguageQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getQueryLanguageQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType#getQueryLanguageQuery <em>Query Language Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Language Query</em>' containment reference.
	 * @see #getQueryLanguageQuery()
	 * @generated
	 */
	void setQueryLanguageQuery(ClassificationNodeQueryType value);

} // QueryExpressionBranchType
