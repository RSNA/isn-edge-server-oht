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
 * $Id: StabilityType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stability Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getStabilityType()
 * @model
 * @generated
 */
public final class StabilityType extends AbstractEnumerator {
	/**
	 * The '<em><b>Dynamic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_LITERAL
	 * @model name="Dynamic"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC = 0;

	/**
	 * The '<em><b>Dynamic Compatible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamic Compatible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_COMPATIBLE_LITERAL
	 * @model name="DynamicCompatible"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_COMPATIBLE = 1;

	/**
	 * The '<em><b>Static</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Static</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATIC_LITERAL
	 * @model name="Static"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC = 2;

	/**
	 * The '<em><b>Dynamic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC
	 * @generated
	 * @ordered
	 */
	public static final StabilityType DYNAMIC_LITERAL = new StabilityType(DYNAMIC, "Dynamic", "Dynamic");

	/**
	 * The '<em><b>Dynamic Compatible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_COMPATIBLE
	 * @generated
	 * @ordered
	 */
	public static final StabilityType DYNAMIC_COMPATIBLE_LITERAL = new StabilityType(DYNAMIC_COMPATIBLE, "DynamicCompatible", "DynamicCompatible");

	/**
	 * The '<em><b>Static</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC
	 * @generated
	 * @ordered
	 */
	public static final StabilityType STATIC_LITERAL = new StabilityType(STATIC, "Static", "Static");

	/**
	 * An array of all the '<em><b>Stability Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StabilityType[] VALUES_ARRAY =
		new StabilityType[] {
			DYNAMIC_LITERAL,
			DYNAMIC_COMPATIBLE_LITERAL,
			STATIC_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Stability Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stability Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StabilityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StabilityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stability Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StabilityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StabilityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stability Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StabilityType get(int value) {
		switch (value) {
			case DYNAMIC: return DYNAMIC_LITERAL;
			case DYNAMIC_COMPATIBLE: return DYNAMIC_COMPATIBLE_LITERAL;
			case STATIC: return STATIC_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StabilityType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //StabilityType
