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
 * $Id: ServiceBindingTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl#getSpecificationLink <em>Specification Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl#getAccessURI <em>Access URI</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ServiceBindingTypeImpl#getTargetBinding <em>Target Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceBindingTypeImpl extends RegistryObjectTypeImpl implements ServiceBindingType {
	/**
	 * The cached value of the '{@link #getSpecificationLink() <em>Specification Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationLink()
	 * @generated
	 * @ordered
	 */
	protected EList specificationLink = null;

	/**
	 * The default value of the '{@link #getAccessURI() <em>Access URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessURI() <em>Access URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURI()
	 * @generated
	 * @ordered
	 */
	protected String accessURI = ACCESS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected String service = SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetBinding() <em>Target Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetBinding() <em>Target Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBinding()
	 * @generated
	 * @ordered
	 */
	protected String targetBinding = TARGET_BINDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.SERVICE_BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecificationLink() {
		if (specificationLink == null) {
			specificationLink = new EObjectContainmentEList(SpecificationLinkType.class, this, RimPackage.SERVICE_BINDING_TYPE__SPECIFICATION_LINK);
		}
		return specificationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessURI() {
		return accessURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessURI(String newAccessURI) {
		String oldAccessURI = accessURI;
		accessURI = newAccessURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SERVICE_BINDING_TYPE__ACCESS_URI, oldAccessURI, accessURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(String newService) {
		String oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SERVICE_BINDING_TYPE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetBinding() {
		return targetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBinding(String newTargetBinding) {
		String oldTargetBinding = targetBinding;
		targetBinding = newTargetBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SERVICE_BINDING_TYPE__TARGET_BINDING, oldTargetBinding, targetBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.SERVICE_BINDING_TYPE__SPECIFICATION_LINK:
				return ((InternalEList)getSpecificationLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.SERVICE_BINDING_TYPE__SPECIFICATION_LINK:
				return getSpecificationLink();
			case RimPackage.SERVICE_BINDING_TYPE__ACCESS_URI:
				return getAccessURI();
			case RimPackage.SERVICE_BINDING_TYPE__SERVICE:
				return getService();
			case RimPackage.SERVICE_BINDING_TYPE__TARGET_BINDING:
				return getTargetBinding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RimPackage.SERVICE_BINDING_TYPE__SPECIFICATION_LINK:
				getSpecificationLink().clear();
				getSpecificationLink().addAll((Collection)newValue);
				return;
			case RimPackage.SERVICE_BINDING_TYPE__ACCESS_URI:
				setAccessURI((String)newValue);
				return;
			case RimPackage.SERVICE_BINDING_TYPE__SERVICE:
				setService((String)newValue);
				return;
			case RimPackage.SERVICE_BINDING_TYPE__TARGET_BINDING:
				setTargetBinding((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RimPackage.SERVICE_BINDING_TYPE__SPECIFICATION_LINK:
				getSpecificationLink().clear();
				return;
			case RimPackage.SERVICE_BINDING_TYPE__ACCESS_URI:
				setAccessURI(ACCESS_URI_EDEFAULT);
				return;
			case RimPackage.SERVICE_BINDING_TYPE__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case RimPackage.SERVICE_BINDING_TYPE__TARGET_BINDING:
				setTargetBinding(TARGET_BINDING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RimPackage.SERVICE_BINDING_TYPE__SPECIFICATION_LINK:
				return specificationLink != null && !specificationLink.isEmpty();
			case RimPackage.SERVICE_BINDING_TYPE__ACCESS_URI:
				return ACCESS_URI_EDEFAULT == null ? accessURI != null : !ACCESS_URI_EDEFAULT.equals(accessURI);
			case RimPackage.SERVICE_BINDING_TYPE__SERVICE:
				return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
			case RimPackage.SERVICE_BINDING_TYPE__TARGET_BINDING:
				return TARGET_BINDING_EDEFAULT == null ? targetBinding != null : !TARGET_BINDING_EDEFAULT.equals(targetBinding);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (accessURI: ");
		result.append(accessURI);
		result.append(", service: ");
		result.append(service);
		result.append(", targetBinding: ");
		result.append(targetBinding);
		result.append(')');
		return result.toString();
	}

} //ServiceBindingTypeImpl
