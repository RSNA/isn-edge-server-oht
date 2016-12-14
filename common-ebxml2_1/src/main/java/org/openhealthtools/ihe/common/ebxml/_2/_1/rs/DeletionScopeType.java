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
 * $Id: DeletionScopeType.java,v 1.1 2006/06/27 23:18:08 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deletion Scope Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getDeletionScopeType()
 * @model
 * @generated
 */
public final class DeletionScopeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Delete All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_ALL_LITERAL
	 * @model name="DeleteAll"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_ALL = 0;

	/**
	 * The '<em><b>Delete Repository Item Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete Repository Item Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_REPOSITORY_ITEM_ONLY_LITERAL
	 * @model name="DeleteRepositoryItemOnly"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_REPOSITORY_ITEM_ONLY = 1;

	/**
	 * The '<em><b>Delete All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_ALL
	 * @generated
	 * @ordered
	 */
	public static final DeletionScopeType DELETE_ALL_LITERAL = new DeletionScopeType(DELETE_ALL, "DeleteAll", "DeleteAll");

	/**
	 * The '<em><b>Delete Repository Item Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_REPOSITORY_ITEM_ONLY
	 * @generated
	 * @ordered
	 */
	public static final DeletionScopeType DELETE_REPOSITORY_ITEM_ONLY_LITERAL = new DeletionScopeType(DELETE_REPOSITORY_ITEM_ONLY, "DeleteRepositoryItemOnly", "DeleteRepositoryItemOnly");

	/**
	 * An array of all the '<em><b>Deletion Scope Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeletionScopeType[] VALUES_ARRAY =
		new DeletionScopeType[] {
			DELETE_ALL_LITERAL,
			DELETE_REPOSITORY_ITEM_ONLY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Deletion Scope Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deletion Scope Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeletionScopeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeletionScopeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deletion Scope Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeletionScopeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeletionScopeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deletion Scope Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeletionScopeType get(int value) {
		switch (value) {
			case DELETE_ALL: return DELETE_ALL_LITERAL;
			case DELETE_REPOSITORY_ITEM_ONLY: return DELETE_REPOSITORY_ITEM_ONLY_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeletionScopeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DeletionScopeType
