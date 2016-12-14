/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryAdapterFactory.java,v 1.1 2006/06/27 23:18:00 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._2._1.rs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage
 * @generated
 */
public class RegistryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RegistryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RegistryPackage.eINSTANCE;
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
	protected RegistrySwitch modelSwitch =
		new RegistrySwitch() {
			public Object caseAddSlotsRequestType(AddSlotsRequestType object) {
				return createAddSlotsRequestTypeAdapter();
			}
			public Object caseApproveObjectsRequestType(ApproveObjectsRequestType object) {
				return createApproveObjectsRequestTypeAdapter();
			}
			public Object caseDeprecateObjectsRequestType(DeprecateObjectsRequestType object) {
				return createDeprecateObjectsRequestTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseOptionalFeaturesSupportedType(OptionalFeaturesSupportedType object) {
				return createOptionalFeaturesSupportedTypeAdapter();
			}
			public Object caseRegistryErrorListType(RegistryErrorListType object) {
				return createRegistryErrorListTypeAdapter();
			}
			public Object caseRegistryErrorType(RegistryErrorType object) {
				return createRegistryErrorTypeAdapter();
			}
			public Object caseRegistryProfileType(RegistryProfileType object) {
				return createRegistryProfileTypeAdapter();
			}
			public Object caseRegistryResponseType(RegistryResponseType object) {
				return createRegistryResponseTypeAdapter();
			}
			public Object caseRemoveObjectsRequestType(RemoveObjectsRequestType object) {
				return createRemoveObjectsRequestTypeAdapter();
			}
			public Object caseRemoveSlotsRequestType(RemoveSlotsRequestType object) {
				return createRemoveSlotsRequestTypeAdapter();
			}
			public Object caseRequestAcceptedResponseType(RequestAcceptedResponseType object) {
				return createRequestAcceptedResponseTypeAdapter();
			}
			public Object caseRootElementType(RootElementType object) {
				return createRootElementTypeAdapter();
			}
			public Object caseSubmitObjectsRequestType(SubmitObjectsRequestType object) {
				return createSubmitObjectsRequestTypeAdapter();
			}
			public Object caseUpdateObjectsRequestType(UpdateObjectsRequestType object) {
				return createUpdateObjectsRequestTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType <em>Add Slots Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.AddSlotsRequestType
	 * @generated
	 */
	public Adapter createAddSlotsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType <em>Approve Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.ApproveObjectsRequestType
	 * @generated
	 */
	public Adapter createApproveObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType <em>Deprecate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DeprecateObjectsRequestType
	 * @generated
	 */
	public Adapter createDeprecateObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType <em>Optional Features Supported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType
	 * @generated
	 */
	public Adapter createOptionalFeaturesSupportedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType <em>Error List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorListType
	 * @generated
	 */
	public Adapter createRegistryErrorListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryErrorType
	 * @generated
	 */
	public Adapter createRegistryErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType <em>Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryProfileType
	 * @generated
	 */
	public Adapter createRegistryProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryResponseType
	 * @generated
	 */
	public Adapter createRegistryResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType <em>Remove Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveObjectsRequestType
	 * @generated
	 */
	public Adapter createRemoveObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType <em>Remove Slots Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RemoveSlotsRequestType
	 * @generated
	 */
	public Adapter createRemoveSlotsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RequestAcceptedResponseType <em>Request Accepted Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RequestAcceptedResponseType
	 * @generated
	 */
	public Adapter createRequestAcceptedResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType <em>Root Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RootElementType
	 * @generated
	 */
	public Adapter createRootElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType <em>Submit Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.SubmitObjectsRequestType
	 * @generated
	 */
	public Adapter createSubmitObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType <em>Update Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.UpdateObjectsRequestType
	 * @generated
	 */
	public Adapter createUpdateObjectsRequestTypeAdapter() {
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

} //RegistryAdapterFactory
