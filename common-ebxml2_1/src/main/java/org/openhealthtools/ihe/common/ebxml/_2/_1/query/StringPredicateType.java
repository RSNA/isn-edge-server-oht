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
 * $Id: StringPredicateType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>String Predicate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getStringPredicateType()
 * @model
 * @generated
 */
public final class StringPredicateType extends AbstractEnumerator {
	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_LITERAL
	 * @model name="Contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS = 0;

	/**
	 * The '<em><b>Contains1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS1_LITERAL
	 * @model name="Contains1" literal="-Contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS1 = 1;

	/**
	 * The '<em><b>Starts With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Starts With</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTS_WITH_LITERAL
	 * @model name="StartsWith"
	 * @generated
	 * @ordered
	 */
	public static final int STARTS_WITH = 2;

	/**
	 * The '<em><b>Starts With1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Starts With1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTS_WITH1_LITERAL
	 * @model name="StartsWith1" literal="-StartsWith"
	 * @generated
	 * @ordered
	 */
	public static final int STARTS_WITH1 = 3;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL_LITERAL
	 * @model name="Equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL = 4;

	/**
	 * The '<em><b>Equal1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL1_LITERAL
	 * @model name="Equal1" literal="-Equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL1 = 5;

	/**
	 * The '<em><b>Ends With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ends With</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDS_WITH_LITERAL
	 * @model name="EndsWith"
	 * @generated
	 * @ordered
	 */
	public static final int ENDS_WITH = 6;

	/**
	 * The '<em><b>Ends With1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ends With1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDS_WITH1_LITERAL
	 * @model name="EndsWith1" literal="-EndsWith"
	 * @generated
	 * @ordered
	 */
	public static final int ENDS_WITH1 = 7;

	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType CONTAINS_LITERAL = new StringPredicateType(CONTAINS, "Contains", "Contains");

	/**
	 * The '<em><b>Contains1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS1
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType CONTAINS1_LITERAL = new StringPredicateType(CONTAINS1, "Contains1", "-Contains");

	/**
	 * The '<em><b>Starts With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTS_WITH
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType STARTS_WITH_LITERAL = new StringPredicateType(STARTS_WITH, "StartsWith", "StartsWith");

	/**
	 * The '<em><b>Starts With1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTS_WITH1
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType STARTS_WITH1_LITERAL = new StringPredicateType(STARTS_WITH1, "StartsWith1", "-StartsWith");

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType EQUAL_LITERAL = new StringPredicateType(EQUAL, "Equal", "Equal");

	/**
	 * The '<em><b>Equal1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL1
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType EQUAL1_LITERAL = new StringPredicateType(EQUAL1, "Equal1", "-Equal");

	/**
	 * The '<em><b>Ends With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDS_WITH
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType ENDS_WITH_LITERAL = new StringPredicateType(ENDS_WITH, "EndsWith", "EndsWith");

	/**
	 * The '<em><b>Ends With1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDS_WITH1
	 * @generated
	 * @ordered
	 */
	public static final StringPredicateType ENDS_WITH1_LITERAL = new StringPredicateType(ENDS_WITH1, "EndsWith1", "-EndsWith");

	/**
	 * An array of all the '<em><b>String Predicate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StringPredicateType[] VALUES_ARRAY =
		new StringPredicateType[] {
			CONTAINS_LITERAL,
			CONTAINS1_LITERAL,
			STARTS_WITH_LITERAL,
			STARTS_WITH1_LITERAL,
			EQUAL_LITERAL,
			EQUAL1_LITERAL,
			ENDS_WITH_LITERAL,
			ENDS_WITH1_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>String Predicate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>String Predicate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StringPredicateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringPredicateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Predicate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StringPredicateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringPredicateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Predicate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StringPredicateType get(int value) {
		switch (value) {
			case CONTAINS: return CONTAINS_LITERAL;
			case CONTAINS1: return CONTAINS1_LITERAL;
			case STARTS_WITH: return STARTS_WITH_LITERAL;
			case STARTS_WITH1: return STARTS_WITH1_LITERAL;
			case EQUAL: return EQUAL_LITERAL;
			case EQUAL1: return EQUAL1_LITERAL;
			case ENDS_WITH: return ENDS_WITH_LITERAL;
			case ENDS_WITH1: return ENDS_WITH1_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StringPredicateType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //StringPredicateType
