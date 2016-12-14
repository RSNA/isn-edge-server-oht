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
 * $Id: ClassificationSchemeTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
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

import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationSchemeTypeImpl#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationSchemeTypeImpl#isIsInternal <em>Is Internal</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationSchemeTypeImpl#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationSchemeTypeImpl extends RegistryEntryTypeImpl implements ClassificationSchemeType {
	/**
	 * The cached value of the '{@link #getClassificationNode() <em>Classification Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNode()
	 * @generated
	 * @ordered
	 */
	protected EList classificationNode = null;

	/**
	 * The default value of the '{@link #isIsInternal() <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInternal() <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isInternal = IS_INTERNAL_EDEFAULT;

	/**
	 * This is true if the Is Internal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInternalESet = false;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeTypeType NODE_TYPE_EDEFAULT = NodeTypeType.UNIQUE_CODE_LITERAL;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeTypeType nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * This is true if the Node Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeTypeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationSchemeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.CLASSIFICATION_SCHEME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassificationNode() {
		if (classificationNode == null) {
			classificationNode = new EObjectContainmentEList(ClassificationNodeType.class, this, RimPackage.CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE);
		}
		return classificationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInternal() {
		return isInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInternal(boolean newIsInternal) {
		boolean oldIsInternal = isInternal;
		isInternal = newIsInternal;
		boolean oldIsInternalESet = isInternalESet;
		isInternalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL, oldIsInternal, isInternal, !oldIsInternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsInternal() {
		boolean oldIsInternal = isInternal;
		boolean oldIsInternalESet = isInternalESet;
		isInternal = IS_INTERNAL_EDEFAULT;
		isInternalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL, oldIsInternal, IS_INTERNAL_EDEFAULT, oldIsInternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsInternal() {
		return isInternalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeTypeType newNodeType) {
		NodeTypeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.CLASSIFICATION_SCHEME_TYPE__NODE_TYPE, oldNodeType, nodeType, !oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeType() {
		NodeTypeType oldNodeType = nodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeType = NODE_TYPE_EDEFAULT;
		nodeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RimPackage.CLASSIFICATION_SCHEME_TYPE__NODE_TYPE, oldNodeType, NODE_TYPE_EDEFAULT, oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeType() {
		return nodeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE:
				return ((InternalEList)getClassificationNode()).basicRemove(otherEnd, msgs);
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
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE:
				return getClassificationNode();
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL:
				return isIsInternal() ? Boolean.TRUE : Boolean.FALSE;
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__NODE_TYPE:
				return getNodeType();
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
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE:
				getClassificationNode().clear();
				getClassificationNode().addAll((Collection)newValue);
				return;
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL:
				setIsInternal(((Boolean)newValue).booleanValue());
				return;
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__NODE_TYPE:
				setNodeType((NodeTypeType)newValue);
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
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE:
				getClassificationNode().clear();
				return;
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL:
				unsetIsInternal();
				return;
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__NODE_TYPE:
				unsetNodeType();
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
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE:
				return classificationNode != null && !classificationNode.isEmpty();
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL:
				return isSetIsInternal();
			case RimPackage.CLASSIFICATION_SCHEME_TYPE__NODE_TYPE:
				return isSetNodeType();
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
		result.append(" (isInternal: ");
		if (isInternalESet) result.append(isInternal); else result.append("<unset>");
		result.append(", nodeType: ");
		if (nodeTypeESet) result.append(nodeType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClassificationSchemeTypeImpl
