/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType#getServiceBinding <em>Service Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getServiceType()
 * @model extendedMetaData="name='ServiceType' kind='elementOnly'"
 * @generated
 */
public interface ServiceType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Service Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getServiceType_ServiceBinding()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ServiceBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getServiceBinding();

} // ServiceType
