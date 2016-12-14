/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdhocQueryQueryType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adhoc Query Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType#getQueryExpressionBranch <em>Query Expression Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryQueryType()
 * @model extendedMetaData="name='AdhocQueryQueryType' kind='elementOnly'"
 * @generated
 */
public interface AdhocQueryQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Query Expression Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Expression Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression Branch</em>' containment reference.
	 * @see #setQueryExpressionBranch(QueryExpressionBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryQueryType_QueryExpressionBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='QueryExpressionBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryExpressionBranchType getQueryExpressionBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType#getQueryExpressionBranch <em>Query Expression Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Expression Branch</em>' containment reference.
	 * @see #getQueryExpressionBranch()
	 * @generated
	 */
	void setQueryExpressionBranch(QueryExpressionBranchType value);

} // AdhocQueryQueryType
