/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceBindingType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getSpecificationLink <em>Specification Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getAccessURI <em>Access URI</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getService <em>Service</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getTargetBinding <em>Target Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getServiceBindingType()
 * @model extendedMetaData="name='ServiceBindingType' kind='elementOnly'"
 * @generated
 */
public interface ServiceBindingType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Specification Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Link</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getServiceBindingType_SpecificationLink()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SpecificationLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSpecificationLink();

	/**
	 * Returns the value of the '<em><b>Access URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access URI</em>' attribute.
	 * @see #setAccessURI(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getServiceBindingType_AccessURI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='accessURI'"
	 * @generated
	 */
	String getAccessURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getAccessURI <em>Access URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access URI</em>' attribute.
	 * @see #getAccessURI()
	 * @generated
	 */
	void setAccessURI(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getServiceBindingType_Service()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='service'"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Target Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Binding</em>' attribute.
	 * @see #setTargetBinding(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getServiceBindingType_TargetBinding()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='targetBinding'"
	 * @generated
	 */
	String getTargetBinding();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType#getTargetBinding <em>Target Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Binding</em>' attribute.
	 * @see #getTargetBinding()
	 * @generated
	 */
	void setTargetBinding(String value);

} // ServiceBindingType
