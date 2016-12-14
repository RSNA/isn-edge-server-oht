/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceQueryType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceQueryType#getServiceBindingQuery <em>Service Binding Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getServiceQueryType()
 * @model extendedMetaData="name='ServiceQueryType' kind='elementOnly'"
 * @generated
 */
public interface ServiceQueryType extends RegistryObjectQueryType {
	/**
	 * Returns the value of the '<em><b>Service Binding Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getServiceQueryType_ServiceBindingQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.ServiceBindingQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceBindingQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getServiceBindingQuery();

} // ServiceQueryType
