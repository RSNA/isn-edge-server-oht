/**
 * <copyright>
 * </copyright>
 *
 * $Id: LCMFactoryImpl.java,v 1.1 2006/10/19 20:16:14 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.ihe.common.ebxml._3._0.lcm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LCMFactoryImpl extends EFactoryImpl implements LCMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LCMFactory init() {
		try {
			LCMFactory theLCMFactory = (LCMFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0"); 
			if (theLCMFactory != null) {
				return theLCMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LCMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LCMPackage.ACCEPT_OBJECTS_REQUEST_TYPE: return createAcceptObjectsRequestType();
			case LCMPackage.APPROVE_OBJECTS_REQUEST_TYPE: return createApproveObjectsRequestType();
			case LCMPackage.DEPRECATE_OBJECTS_REQUEST_TYPE: return createDeprecateObjectsRequestType();
			case LCMPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case LCMPackage.RELOCATE_OBJECTS_REQUEST_TYPE: return createRelocateObjectsRequestType();
			case LCMPackage.REMOVE_OBJECTS_REQUEST_TYPE: return createRemoveObjectsRequestType();
			case LCMPackage.SUBMIT_OBJECTS_REQUEST_TYPE: return createSubmitObjectsRequestType();
			case LCMPackage.UNDEPRECATE_OBJECTS_REQUEST_TYPE: return createUndeprecateObjectsRequestType();
			case LCMPackage.UPDATE_OBJECTS_REQUEST_TYPE: return createUpdateObjectsRequestType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptObjectsRequestType createAcceptObjectsRequestType() {
		AcceptObjectsRequestTypeImpl acceptObjectsRequestType = new AcceptObjectsRequestTypeImpl();
		return acceptObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproveObjectsRequestType createApproveObjectsRequestType() {
		ApproveObjectsRequestTypeImpl approveObjectsRequestType = new ApproveObjectsRequestTypeImpl();
		return approveObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecateObjectsRequestType createDeprecateObjectsRequestType() {
		DeprecateObjectsRequestTypeImpl deprecateObjectsRequestType = new DeprecateObjectsRequestTypeImpl();
		return deprecateObjectsRequestType;
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
	public RelocateObjectsRequestType createRelocateObjectsRequestType() {
		RelocateObjectsRequestTypeImpl relocateObjectsRequestType = new RelocateObjectsRequestTypeImpl();
		return relocateObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveObjectsRequestType createRemoveObjectsRequestType() {
		RemoveObjectsRequestTypeImpl removeObjectsRequestType = new RemoveObjectsRequestTypeImpl();
		return removeObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitObjectsRequestType createSubmitObjectsRequestType() {
		SubmitObjectsRequestTypeImpl submitObjectsRequestType = new SubmitObjectsRequestTypeImpl();
		return submitObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndeprecateObjectsRequestType createUndeprecateObjectsRequestType() {
		UndeprecateObjectsRequestTypeImpl undeprecateObjectsRequestType = new UndeprecateObjectsRequestTypeImpl();
		return undeprecateObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateObjectsRequestType createUpdateObjectsRequestType() {
		UpdateObjectsRequestTypeImpl updateObjectsRequestType = new UpdateObjectsRequestTypeImpl();
		return updateObjectsRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCMPackage getLCMPackage() {
		return (LCMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static LCMPackage getPackage() {
		return LCMPackage.eINSTANCE;
	}

} //LCMFactoryImpl
