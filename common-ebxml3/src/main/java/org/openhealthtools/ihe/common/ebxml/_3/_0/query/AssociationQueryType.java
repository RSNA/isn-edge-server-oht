/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getAssociationTypeQuery <em>Association Type Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getSourceObjectQuery <em>Source Object Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getTargetObjectQuery <em>Target Object Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAssociationQueryType()
 * @model extendedMetaData="name='AssociationQueryType' kind='elementOnly'"
 * @generated
 */
public interface AssociationQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Association Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type Query</em>' containment reference.
	 * @see #setAssociationTypeQuery(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAssociationQueryType_AssociationTypeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='AssociationTypeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getAssociationTypeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getAssociationTypeQuery <em>Association Type Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type Query</em>' containment reference.
	 * @see #getAssociationTypeQuery()
	 * @generated
	 */
	void setAssociationTypeQuery(ClassificationNodeQueryType value);

	/**
	 * Returns the value of the '<em><b>Source Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object Query</em>' containment reference.
	 * @see #setSourceObjectQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAssociationQueryType_SourceObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SourceObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getSourceObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getSourceObjectQuery <em>Source Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object Query</em>' containment reference.
	 * @see #getSourceObjectQuery()
	 * @generated
	 */
	void setSourceObjectQuery(RegistryObjectQueryType value);

	/**
	 * Returns the value of the '<em><b>Target Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Object Query</em>' containment reference.
	 * @see #setTargetObjectQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAssociationQueryType_TargetObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TargetObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getTargetObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType#getTargetObjectQuery <em>Target Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Object Query</em>' containment reference.
	 * @see #getTargetObjectQuery()
	 * @generated
	 */
	void setTargetObjectQuery(RegistryObjectQueryType value);

} // AssociationQueryType
