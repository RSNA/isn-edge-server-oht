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
 * $Id: SpecificationLinkTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SpecificationLinkTypeImpl#getUsageDescription <em>Usage Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SpecificationLinkTypeImpl#getUsageParameter <em>Usage Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.SpecificationLinkTypeImpl#getSpecificationObject <em>Specification Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationLinkTypeImpl extends RegistryObjectTypeImpl implements SpecificationLinkType {
	/**
	 * The cached value of the '{@link #getUsageDescription() <em>Usage Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected InternationalStringType usageDescription = null;

	/**
	 * The cached value of the '{@link #getUsageParameter() <em>Usage Parameter</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageParameter()
	 * @generated
	 * @ordered
	 */
	protected EList usageParameter = null;

	/**
	 * The default value of the '{@link #getSpecificationObject() <em>Specification Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationObject()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificationObject() <em>Specification Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationObject()
	 * @generated
	 * @ordered
	 */
	protected String specificationObject = SPECIFICATION_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.SPECIFICATION_LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType getUsageDescription() {
		return usageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageDescription(InternationalStringType newUsageDescription, NotificationChain msgs) {
		InternationalStringType oldUsageDescription = usageDescription;
		usageDescription = newUsageDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION, oldUsageDescription, newUsageDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageDescription(InternationalStringType newUsageDescription) {
		if (newUsageDescription != usageDescription) {
			NotificationChain msgs = null;
			if (usageDescription != null)
				msgs = ((InternalEObject)usageDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION, null, msgs);
			if (newUsageDescription != null)
				msgs = ((InternalEObject)newUsageDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION, null, msgs);
			msgs = basicSetUsageDescription(newUsageDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION, newUsageDescription, newUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsageParameter() {
		if (usageParameter == null) {
			usageParameter = new EDataTypeEList(String.class, this, RimPackage.SPECIFICATION_LINK_TYPE__USAGE_PARAMETER);
		}
		return usageParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificationObject() {
		return specificationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationObject(String newSpecificationObject) {
		String oldSpecificationObject = specificationObject;
		specificationObject = newSpecificationObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT, oldSpecificationObject, specificationObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION:
				return basicSetUsageDescription(null, msgs);
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
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION:
				return getUsageDescription();
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_PARAMETER:
				return getUsageParameter();
			case RimPackage.SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT:
				return getSpecificationObject();
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
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION:
				setUsageDescription((InternationalStringType)newValue);
				return;
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_PARAMETER:
				getUsageParameter().clear();
				getUsageParameter().addAll((Collection)newValue);
				return;
			case RimPackage.SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT:
				setSpecificationObject((String)newValue);
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
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION:
				setUsageDescription((InternationalStringType)null);
				return;
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_PARAMETER:
				getUsageParameter().clear();
				return;
			case RimPackage.SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT:
				setSpecificationObject(SPECIFICATION_OBJECT_EDEFAULT);
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
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION:
				return usageDescription != null;
			case RimPackage.SPECIFICATION_LINK_TYPE__USAGE_PARAMETER:
				return usageParameter != null && !usageParameter.isEmpty();
			case RimPackage.SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT:
				return SPECIFICATION_OBJECT_EDEFAULT == null ? specificationObject != null : !SPECIFICATION_OBJECT_EDEFAULT.equals(specificationObject);
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
		result.append(" (usageParameter: ");
		result.append(usageParameter);
		result.append(", specificationObject: ");
		result.append(specificationObject);
		result.append(')');
		return result.toString();
	}

} //SpecificationLinkTypeImpl
