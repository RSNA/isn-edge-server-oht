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
 * $Id: SlotBranchType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType#getSlotFilter <em>Slot Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType#getSlotValueFilter <em>Slot Value Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSlotBranchType()
 * @model extendedMetaData="name='SlotBranch_._type' kind='elementOnly'"
 * @generated
 */
public interface SlotBranchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Slot Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Filter</em>' containment reference.
	 * @see #setSlotFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSlotBranchType_SlotFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SlotFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getSlotFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.query.SlotBranchType#getSlotFilter <em>Slot Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Filter</em>' containment reference.
	 * @see #getSlotFilter()
	 * @generated
	 */
	void setSlotFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Slot Value Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Value Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Value Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getSlotBranchType_SlotValueFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SlotValueFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSlotValueFilter();

} // SlotBranchType
