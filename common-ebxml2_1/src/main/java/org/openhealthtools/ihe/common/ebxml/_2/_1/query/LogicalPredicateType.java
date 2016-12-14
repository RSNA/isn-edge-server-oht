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
 * $Id: LogicalPredicateType.java,v 1.1 2006/06/27 23:18:05 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Logical Predicate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.query.QueryPackage#getLogicalPredicateType()
 * @model
 * @generated
 */
public final class LogicalPredicateType extends AbstractEnumerator {
	/**
	 * The '<em><b>LE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LE = 0;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT = 1;

	/**
	 * The '<em><b>GE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GE = 2;

	/**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GT = 3;

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQ_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ = 4;

	/**
	 * The '<em><b>NE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NE = 5;

	/**
	 * The '<em><b>LE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @generated
	 * @ordered
	 */
	public static final LogicalPredicateType LE_LITERAL = new LogicalPredicateType(LE, "LE", "LE");

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @generated
	 * @ordered
	 */
	public static final LogicalPredicateType LT_LITERAL = new LogicalPredicateType(LT, "LT", "LT");

	/**
	 * The '<em><b>GE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE
	 * @generated
	 * @ordered
	 */
	public static final LogicalPredicateType GE_LITERAL = new LogicalPredicateType(GE, "GE", "GE");

	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @generated
	 * @ordered
	 */
	public static final LogicalPredicateType GT_LITERAL = new LogicalPredicateType(GT, "GT", "GT");

	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @generated
	 * @ordered
	 */
	public static final LogicalPredicateType EQ_LITERAL = new LogicalPredicateType(EQ, "EQ", "EQ");

	/**
	 * The '<em><b>NE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE
	 * @generated
	 * @ordered
	 */
	public static final LogicalPredicateType NE_LITERAL = new LogicalPredicateType(NE, "NE", "NE");

	/**
	 * An array of all the '<em><b>Logical Predicate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogicalPredicateType[] VALUES_ARRAY =
		new LogicalPredicateType[] {
			LE_LITERAL,
			LT_LITERAL,
			GE_LITERAL,
			GT_LITERAL,
			EQ_LITERAL,
			NE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Logical Predicate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Logical Predicate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicalPredicateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicalPredicateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logical Predicate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicalPredicateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicalPredicateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logical Predicate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicalPredicateType get(int value) {
		switch (value) {
			case LE: return LE_LITERAL;
			case LT: return LT_LITERAL;
			case GE: return GE_LITERAL;
			case GT: return GT_LITERAL;
			case EQ: return EQ_LITERAL;
			case NE: return NE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LogicalPredicateType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //LogicalPredicateType
