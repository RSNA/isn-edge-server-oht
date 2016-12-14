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
 * $Id: NodeTypeType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getNodeTypeType()
 * @model
 * @generated
 */
public final class NodeTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Unique Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unique Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_CODE_LITERAL
	 * @model name="UniqueCode"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_CODE = 0;

	/**
	 * The '<em><b>Embedded Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Embedded Path</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMBEDDED_PATH_LITERAL
	 * @model name="EmbeddedPath"
	 * @generated
	 * @ordered
	 */
	public static final int EMBEDDED_PATH = 1;

	/**
	 * The '<em><b>Non Unique Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Unique Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_UNIQUE_CODE_LITERAL
	 * @model name="NonUniqueCode"
	 * @generated
	 * @ordered
	 */
	public static final int NON_UNIQUE_CODE = 2;

	/**
	 * The '<em><b>Unique Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_CODE
	 * @generated
	 * @ordered
	 */
	public static final NodeTypeType UNIQUE_CODE_LITERAL = new NodeTypeType(UNIQUE_CODE, "UniqueCode", "UniqueCode");

	/**
	 * The '<em><b>Embedded Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMBEDDED_PATH
	 * @generated
	 * @ordered
	 */
	public static final NodeTypeType EMBEDDED_PATH_LITERAL = new NodeTypeType(EMBEDDED_PATH, "EmbeddedPath", "EmbeddedPath");

	/**
	 * The '<em><b>Non Unique Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_UNIQUE_CODE
	 * @generated
	 * @ordered
	 */
	public static final NodeTypeType NON_UNIQUE_CODE_LITERAL = new NodeTypeType(NON_UNIQUE_CODE, "NonUniqueCode", "NonUniqueCode");

	/**
	 * An array of all the '<em><b>Node Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeTypeType[] VALUES_ARRAY =
		new NodeTypeType[] {
			UNIQUE_CODE_LITERAL,
			EMBEDDED_PATH_LITERAL,
			NON_UNIQUE_CODE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeTypeType get(int value) {
		switch (value) {
			case UNIQUE_CODE: return UNIQUE_CODE_LITERAL;
			case EMBEDDED_PATH: return EMBEDDED_PATH_LITERAL;
			case NON_UNIQUE_CODE: return NON_UNIQUE_CODE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NodeTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //NodeTypeType
