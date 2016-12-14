/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryFactoryImpl.java,v 1.1 2006/10/19 20:16:13 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.ihe.common.ebxml._3._0.rs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistryFactoryImpl extends EFactoryImpl implements RegistryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegistryFactory init() {
		try {
			RegistryFactory theRegistryFactory = (RegistryFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0"); 
			if (theRegistryFactory != null) {
				return theRegistryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegistryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RegistryPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RegistryPackage.REGISTRY_ERROR_LIST_TYPE: return createRegistryErrorListType();
			case RegistryPackage.REGISTRY_ERROR_TYPE: return createRegistryErrorType();
			case RegistryPackage.REGISTRY_REQUEST_TYPE: return createRegistryRequestType();
			case RegistryPackage.REGISTRY_RESPONSE_TYPE: return createRegistryResponseType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public RegistryErrorListType createRegistryErrorListType() {
		RegistryErrorListTypeImpl registryErrorListType = new RegistryErrorListTypeImpl();
		return registryErrorListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorType createRegistryErrorType() {
		RegistryErrorTypeImpl registryErrorType = new RegistryErrorTypeImpl();
		return registryErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryRequestType createRegistryRequestType() {
		RegistryRequestTypeImpl registryRequestType = new RegistryRequestTypeImpl();
		return registryRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryResponseType createRegistryResponseType() {
		RegistryResponseTypeImpl registryResponseType = new RegistryResponseTypeImpl();
		return registryResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackage getRegistryPackage() {
		return (RegistryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static RegistryPackage getPackage() {
		return RegistryPackage.eINSTANCE;
	}

} //RegistryFactoryImpl
