/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceBindingQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Binding Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getServiceQuery <em>Service Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getSpecificationLinkQuery <em>Specification Link Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getTargetBindingQuery <em>Target Binding Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getServiceBindingQueryType()
 * @model extendedMetaData="name='ServiceBindingQueryType' kind='elementOnly'"
 * @generated
 */
public interface ServiceBindingQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Service Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Query</em>' containment reference.
	 * @see #setServiceQuery(ServiceQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getServiceBindingQueryType_ServiceQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceQueryType getServiceQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getServiceQuery <em>Service Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Query</em>' containment reference.
	 * @see #getServiceQuery()
	 * @generated
	 */
	void setServiceQuery(ServiceQueryType value);

	/**
	 * Returns the value of the '<em><b>Specification Link Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getServiceBindingQueryType_SpecificationLinkQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.SpecificationLinkQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SpecificationLinkQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSpecificationLinkQuery();

	/**
	 * Returns the value of the '<em><b>Target Binding Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Binding Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Binding Query</em>' containment reference.
	 * @see #setTargetBindingQuery(ServiceBindingQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getServiceBindingQueryType_TargetBindingQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TargetBindingQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingQueryType getTargetBindingQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType#getTargetBindingQuery <em>Target Binding Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Binding Query</em>' containment reference.
	 * @see #getTargetBindingQuery()
	 * @generated
	 */
	void setTargetBindingQuery(ServiceBindingQueryType value);

} // ServiceBindingQueryType
