/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMSFactoryImpl.java,v 1.1 2006/10/19 20:16:36 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.ihe.common.ebxml._3._0.cms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMSFactoryImpl extends EFactoryImpl implements CMSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMSFactory init() {
		try {
			CMSFactory theCMSFactory = (CMSFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:xsd:cms:3.0"); 
			if (theCMSFactory != null) {
				return theCMSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CMSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CMSPackage.CATALOG_CONTENT_REQUEST_TYPE: return createCatalogContentRequestType();
			case CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE: return createCatalogContentResponseType();
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE: return createContentManagementServiceRequestType();
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_RESPONSE_TYPE: return createContentManagementServiceResponseType();
			case CMSPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CMSPackage.VALIDATE_CONTENT_REQUEST_TYPE: return createValidateContentRequestType();
			case CMSPackage.VALIDATE_CONTENT_RESPONSE_TYPE: return createValidateContentResponseType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogContentRequestType createCatalogContentRequestType() {
		CatalogContentRequestTypeImpl catalogContentRequestType = new CatalogContentRequestTypeImpl();
		return catalogContentRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogContentResponseType createCatalogContentResponseType() {
		CatalogContentResponseTypeImpl catalogContentResponseType = new CatalogContentResponseTypeImpl();
		return catalogContentResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentManagementServiceRequestType createContentManagementServiceRequestType() {
		ContentManagementServiceRequestTypeImpl contentManagementServiceRequestType = new ContentManagementServiceRequestTypeImpl();
		return contentManagementServiceRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentManagementServiceResponseType createContentManagementServiceResponseType() {
		ContentManagementServiceResponseTypeImpl contentManagementServiceResponseType = new ContentManagementServiceResponseTypeImpl();
		return contentManagementServiceResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateContentRequestType createValidateContentRequestType() {
		ValidateContentRequestTypeImpl validateContentRequestType = new ValidateContentRequestTypeImpl();
		return validateContentRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateContentResponseType createValidateContentResponseType() {
		ValidateContentResponseTypeImpl validateContentResponseType = new ValidateContentResponseTypeImpl();
		return validateContentResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMSPackage getCMSPackage() {
		return (CMSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static CMSPackage getPackage() {
		return CMSPackage.eINSTANCE;
	}

} //CMSFactoryImpl
