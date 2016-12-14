/**
 * <copyright>
 * </copyright>
 *
 * $Id: LCMAdapterFactory.java,v 1.1 2006/10/19 20:16:27 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;


import org.openhealthtools.ihe.common.ebxml._3._0.lcm.*;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage
 * @generated
 */
public class LCMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LCMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LCMPackage.eINSTANCE;
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
	protected LCMSwitch modelSwitch =
		new LCMSwitch() {
			public Object caseAcceptObjectsRequestType(AcceptObjectsRequestType object) {
				return createAcceptObjectsRequestTypeAdapter();
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
			public Object caseRelocateObjectsRequestType(RelocateObjectsRequestType object) {
				return createRelocateObjectsRequestTypeAdapter();
			}
			public Object caseRemoveObjectsRequestType(RemoveObjectsRequestType object) {
				return createRemoveObjectsRequestTypeAdapter();
			}
			public Object caseSubmitObjectsRequestType(SubmitObjectsRequestType object) {
				return createSubmitObjectsRequestTypeAdapter();
			}
			public Object caseUndeprecateObjectsRequestType(UndeprecateObjectsRequestType object) {
				return createUndeprecateObjectsRequestTypeAdapter();
			}
			public Object caseUpdateObjectsRequestType(UpdateObjectsRequestType object) {
				return createUpdateObjectsRequestTypeAdapter();
			}
			public Object caseRegistryRequestType(RegistryRequestType object) {
				return createRegistryRequestTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType <em>Accept Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType
	 * @generated
	 */
	public Adapter createAcceptObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType <em>Approve Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType
	 * @generated
	 */
	public Adapter createApproveObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType <em>Deprecate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType
	 * @generated
	 */
	public Adapter createDeprecateObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType <em>Relocate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType
	 * @generated
	 */
	public Adapter createRelocateObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType <em>Remove Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType
	 * @generated
	 */
	public Adapter createRemoveObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType <em>Submit Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType
	 * @generated
	 */
	public Adapter createSubmitObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType <em>Undeprecate Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType
	 * @generated
	 */
	public Adapter createUndeprecateObjectsRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType <em>Update Objects Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType
	 * @generated
	 */
	public Adapter createUpdateObjectsRequestTypeAdapter() {
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

} //LCMAdapterFactory
