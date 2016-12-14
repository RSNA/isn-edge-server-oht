/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMSAdapterFactory.java,v 1.1 2006/10/19 20:16:31 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;


import org.openhealthtools.ihe.common.ebxml._3._0.cms.*;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage
 * @generated
 */
public class CMSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CMSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CMSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMSSwitch modelSwitch =
		new CMSSwitch() {
			public Object caseCatalogContentRequestType(CatalogContentRequestType object) {
				return createCatalogContentRequestTypeAdapter();
			}
			public Object caseCatalogContentResponseType(CatalogContentResponseType object) {
				return createCatalogContentResponseTypeAdapter();
			}
			public Object caseContentManagementServiceRequestType(ContentManagementServiceRequestType object) {
				return createContentManagementServiceRequestTypeAdapter();
			}
			public Object caseContentManagementServiceResponseType(ContentManagementServiceResponseType object) {
				return createContentManagementServiceResponseTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseValidateContentRequestType(ValidateContentRequestType object) {
				return createValidateContentRequestTypeAdapter();
			}
			public Object caseValidateContentResponseType(ValidateContentResponseType object) {
				return createValidateContentResponseTypeAdapter();
			}
			public Object caseRegistryRequestType(RegistryRequestType object) {
				return createRegistryRequestTypeAdapter();
			}
			public Object caseRegistryResponseType(RegistryResponseType object) {
				return createRegistryResponseTypeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentRequestType <em>Catalog Content Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentRequestType
	 * @generated
	 */
	public Adapter createCatalogContentRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType <em>Catalog Content Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType
	 * @generated
	 */
	public Adapter createCatalogContentResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType <em>Content Management Service Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType
	 * @generated
	 */
	public Adapter createContentManagementServiceRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceResponseType <em>Content Management Service Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceResponseType
	 * @generated
	 */
	public Adapter createContentManagementServiceResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentRequestType <em>Validate Content Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentRequestType
	 * @generated
	 */
	public Adapter createValidateContentRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentResponseType <em>Validate Content Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentResponseType
	 * @generated
	 */
	public Adapter createValidateContentResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType
	 * @generated
	 */
	public Adapter createRegistryRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType
	 * @generated
	 */
	public Adapter createRegistryResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CMSAdapterFactory
