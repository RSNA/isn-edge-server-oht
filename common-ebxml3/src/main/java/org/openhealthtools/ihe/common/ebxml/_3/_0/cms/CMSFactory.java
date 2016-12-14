/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMSFactory.java,v 1.1 2006/10/19 20:16:23 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage
 * @generated
 */
public interface CMSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMSFactory eINSTANCE = org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CMSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalog Content Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Content Request Type</em>'.
	 * @generated
	 */
	CatalogContentRequestType createCatalogContentRequestType();

	/**
	 * Returns a new object of class '<em>Catalog Content Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Content Response Type</em>'.
	 * @generated
	 */
	CatalogContentResponseType createCatalogContentResponseType();

	/**
	 * Returns a new object of class '<em>Content Management Service Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Management Service Request Type</em>'.
	 * @generated
	 */
	ContentManagementServiceRequestType createContentManagementServiceRequestType();

	/**
	 * Returns a new object of class '<em>Content Management Service Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Management Service Response Type</em>'.
	 * @generated
	 */
	ContentManagementServiceResponseType createContentManagementServiceResponseType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Validate Content Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Content Request Type</em>'.
	 * @generated
	 */
	ValidateContentRequestType createValidateContentRequestType();

	/**
	 * Returns a new object of class '<em>Validate Content Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Content Response Type</em>'.
	 * @generated
	 */
	ValidateContentResponseType createValidateContentResponseType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CMSPackage getCMSPackage();

} //CMSFactory
