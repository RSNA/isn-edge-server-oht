/**
 * <copyright>
 * </copyright>
 *
 * $Id: CatalogContentResponseType.java,v 1.1 2006/10/19 20:16:23 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Content Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType#getCatalogedContent <em>Cataloged Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getCatalogContentResponseType()
 * @model extendedMetaData="name='CatalogContentResponse_._type' kind='elementOnly'"
 * @generated
 */
public interface CatalogContentResponseType extends ContentManagementServiceResponseType {
	/**
	 * Returns the value of the '<em><b>Cataloged Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cataloged Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cataloged Content</em>' containment reference.
	 * @see #setCatalogedContent(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage#getCatalogContentResponseType_CatalogedContent()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='CatalogedContent' namespace='##targetNamespace'"
	 * @generated
	 */
	RegistryObjectListType getCatalogedContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType#getCatalogedContent <em>Cataloged Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cataloged Content</em>' containment reference.
	 * @see #getCatalogedContent()
	 * @generated
	 */
	void setCatalogedContent(RegistryObjectListType value);

} // CatalogContentResponseType
