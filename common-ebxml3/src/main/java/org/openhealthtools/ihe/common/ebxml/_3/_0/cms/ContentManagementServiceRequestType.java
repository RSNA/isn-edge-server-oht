/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContentManagementServiceRequestType.java,v 1.1 2006/10/19 20:16:23 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms;

import org.eclipse.emf.common.util.EList;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Management Service Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for all Content Management Service requests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType#getOriginalContent <em>Original Content</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType#getInvocationControlFile <em>Invocation Control File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getContentManagementServiceRequestType()
 * @model extendedMetaData="name='ContentManagementServiceRequestType' kind='elementOnly'"
 * @generated
 */
public interface ContentManagementServiceRequestType extends RegistryRequestType {
	/**
	 * Returns the value of the '<em><b>Original Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Content</em>' containment reference.
	 * @see #setOriginalContent(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getContentManagementServiceRequestType_OriginalContent()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='OriginalContent' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getOriginalContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType#getOriginalContent <em>Original Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Content</em>' containment reference.
	 * @see #getOriginalContent()
	 * @generated
	 */
	void setOriginalContent(RegistryObjectListType value);

	/**
	 * Returns the value of the '<em><b>Invocation Control File</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocation Control File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Control File</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getContentManagementServiceRequestType_InvocationControlFile()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='InvocationControlFile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getInvocationControlFile();

} // ContentManagementServiceRequestType
