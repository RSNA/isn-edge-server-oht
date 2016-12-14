/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdhocQueryType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adhoc Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The common base type for all types of Adh hoc queries.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType#getQueryExpression <em>Query Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAdhocQueryType()
 * @model extendedMetaData="name='AdhocQueryType' kind='elementOnly'"
 * @generated
 */
public interface AdhocQueryType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression</em>' containment reference.
	 * @see #setQueryExpression(QueryExpressionType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getAdhocQueryType_QueryExpression()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='QueryExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryExpressionType getQueryExpression();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType#getQueryExpression <em>Query Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Expression</em>' containment reference.
	 * @see #getQueryExpression()
	 * @generated
	 */
	void setQueryExpression(QueryExpressionType value);

} // AdhocQueryType
