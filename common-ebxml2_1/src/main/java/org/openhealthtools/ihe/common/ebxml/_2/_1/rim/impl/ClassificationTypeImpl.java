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
 * $Id: ClassificationTypeImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl#getClassificationScheme <em>Classification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl#getClassifiedObject <em>Classified Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.ClassificationTypeImpl#getNodeRepresentation <em>Node Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationTypeImpl extends RegistryObjectTypeImpl implements ClassificationType {
	/**
	 * The default value of the '{@link #getClassificationNode() <em>Classification Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNode()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationNode() <em>Classification Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNode()
	 * @generated
	 * @ordered
	 */
	protected String classificationNode = CLASSIFICATION_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationScheme() <em>Classification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationScheme() <em>Classification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationScheme()
	 * @generated
	 * @ordered
	 */
	protected String classificationScheme = CLASSIFICATION_SCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifiedObject() <em>Classified Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedObject()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIED_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifiedObject() <em>Classified Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedObject()
	 * @generated
	 * @ordered
	 */
	protected String classifiedObject = CLASSIFIED_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeRepresentation() <em>Node Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_REPRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeRepresentation() <em>Node Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeRepresentation()
	 * @generated
	 * @ordered
	 */
	protected String nodeRepresentation = NODE_REPRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.CLASSIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassificationNode() {
		return classificationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNode(String newClassificationNode) {
		String oldClassificationNode = classificationNode;
		classificationNode = newClassificationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_NODE, oldClassificationNode, classificationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassificationScheme() {
		return classificationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationScheme(String newClassificationScheme) {
		String oldClassificationScheme = classificationScheme;
		classificationScheme = newClassificationScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME, oldClassificationScheme, classificationScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifiedObject() {
		return classifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedObject(String newClassifiedObject) {
		String oldClassifiedObject = classifiedObject;
		classifiedObject = newClassifiedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.CLASSIFICATION_TYPE__CLASSIFIED_OBJECT, oldClassifiedObject, classifiedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeRepresentation() {
		return nodeRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeRepresentation(String newNodeRepresentation) {
		String oldNodeRepresentation = nodeRepresentation;
		nodeRepresentation = newNodeRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RimPackage.CLASSIFICATION_TYPE__NODE_REPRESENTATION, oldNodeRepresentation, nodeRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_NODE:
				return getClassificationNode();
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME:
				return getClassificationScheme();
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFIED_OBJECT:
				return getClassifiedObject();
			case RimPackage.CLASSIFICATION_TYPE__NODE_REPRESENTATION:
				return getNodeRepresentation();
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
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_NODE:
				setClassificationNode((String)newValue);
				return;
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME:
				setClassificationScheme((String)newValue);
				return;
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFIED_OBJECT:
				setClassifiedObject((String)newValue);
				return;
			case RimPackage.CLASSIFICATION_TYPE__NODE_REPRESENTATION:
				setNodeRepresentation((String)newValue);
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
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_NODE:
				setClassificationNode(CLASSIFICATION_NODE_EDEFAULT);
				return;
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME:
				setClassificationScheme(CLASSIFICATION_SCHEME_EDEFAULT);
				return;
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFIED_OBJECT:
				setClassifiedObject(CLASSIFIED_OBJECT_EDEFAULT);
				return;
			case RimPackage.CLASSIFICATION_TYPE__NODE_REPRESENTATION:
				setNodeRepresentation(NODE_REPRESENTATION_EDEFAULT);
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
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_NODE:
				return CLASSIFICATION_NODE_EDEFAULT == null ? classificationNode != null : !CLASSIFICATION_NODE_EDEFAULT.equals(classificationNode);
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME:
				return CLASSIFICATION_SCHEME_EDEFAULT == null ? classificationScheme != null : !CLASSIFICATION_SCHEME_EDEFAULT.equals(classificationScheme);
			case RimPackage.CLASSIFICATION_TYPE__CLASSIFIED_OBJECT:
				return CLASSIFIED_OBJECT_EDEFAULT == null ? classifiedObject != null : !CLASSIFIED_OBJECT_EDEFAULT.equals(classifiedObject);
			case RimPackage.CLASSIFICATION_TYPE__NODE_REPRESENTATION:
				return NODE_REPRESENTATION_EDEFAULT == null ? nodeRepresentation != null : !NODE_REPRESENTATION_EDEFAULT.equals(nodeRepresentation);
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
		result.append(" (classificationNode: ");
		result.append(classificationNode);
		result.append(", classificationScheme: ");
		result.append(classificationScheme);
		result.append(", classifiedObject: ");
		result.append(classifiedObject);
		result.append(", nodeRepresentation: ");
		result.append(nodeRepresentation);
		result.append(')');
		return result.toString();
	}

} //ClassificationTypeImpl
