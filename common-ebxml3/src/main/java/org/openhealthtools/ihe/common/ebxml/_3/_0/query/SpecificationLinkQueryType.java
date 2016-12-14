/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecificationLinkQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Link Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getUsageDescriptionBranch <em>Usage Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getServiceBindingQuery <em>Service Binding Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getSpecificationObjectQuery <em>Specification Object Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSpecificationLinkQueryType()
 * @model extendedMetaData="name='SpecificationLinkQueryType' kind='elementOnly'"
 * @generated
 */
public interface SpecificationLinkQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Usage Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Description Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Description Branch</em>' containment reference.
	 * @see #setUsageDescriptionBranch(InternationalStringBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSpecificationLinkQueryType_UsageDescriptionBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='UsageDescriptionBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringBranchType getUsageDescriptionBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getUsageDescriptionBranch <em>Usage Description Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Description Branch</em>' containment reference.
	 * @see #getUsageDescriptionBranch()
	 * @generated
	 */
	void setUsageDescriptionBranch(InternationalStringBranchType value);

	/**
	 * Returns the value of the '<em><b>Service Binding Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding Query</em>' containment reference.
	 * @see #setServiceBindingQuery(ServiceBindingQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSpecificationLinkQueryType_ServiceBindingQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceBindingQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingQueryType getServiceBindingQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getServiceBindingQuery <em>Service Binding Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding Query</em>' containment reference.
	 * @see #getServiceBindingQuery()
	 * @generated
	 */
	void setServiceBindingQuery(ServiceBindingQueryType value);

	/**
	 * Returns the value of the '<em><b>Specification Object Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Object Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Object Query</em>' containment reference.
	 * @see #setSpecificationObjectQuery(RegistryObjectQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getSpecificationLinkQueryType_SpecificationObjectQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SpecificationObjectQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectQueryType getSpecificationObjectQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType#getSpecificationObjectQuery <em>Specification Object Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Object Query</em>' containment reference.
	 * @see #getSpecificationObjectQuery()
	 * @generated
	 */
	void setSpecificationObjectQuery(RegistryObjectQueryType value);

} // SpecificationLinkQueryType
