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
 * $Id: EventTypeType.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getEventTypeType()
 * @model
 * @generated
 */
public final class EventTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Created</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Created</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATED_LITERAL
	 * @model name="Created"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED = 0;

	/**
	 * The '<em><b>Deleted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deleted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETED_LITERAL
	 * @model name="Deleted"
	 * @generated
	 * @ordered
	 */
	public static final int DELETED = 1;

	/**
	 * The '<em><b>Deprecated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deprecated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED_LITERAL
	 * @model name="Deprecated"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED = 2;

	/**
	 * The '<em><b>Updated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Updated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATED_LITERAL
	 * @model name="Updated"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED = 3;

	/**
	 * The '<em><b>Versioned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Versioned</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERSIONED_LITERAL
	 * @model name="Versioned"
	 * @generated
	 * @ordered
	 */
	public static final int VERSIONED = 4;

	/**
	 * The '<em><b>Created</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED
	 * @generated
	 * @ordered
	 */
	public static final EventTypeType CREATED_LITERAL = new EventTypeType(CREATED, "Created", "Created");

	/**
	 * The '<em><b>Deleted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @generated
	 * @ordered
	 */
	public static final EventTypeType DELETED_LITERAL = new EventTypeType(DELETED, "Deleted", "Deleted");

	/**
	 * The '<em><b>Deprecated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED
	 * @generated
	 * @ordered
	 */
	public static final EventTypeType DEPRECATED_LITERAL = new EventTypeType(DEPRECATED, "Deprecated", "Deprecated");

	/**
	 * The '<em><b>Updated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED
	 * @generated
	 * @ordered
	 */
	public static final EventTypeType UPDATED_LITERAL = new EventTypeType(UPDATED, "Updated", "Updated");

	/**
	 * The '<em><b>Versioned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSIONED
	 * @generated
	 * @ordered
	 */
	public static final EventTypeType VERSIONED_LITERAL = new EventTypeType(VERSIONED, "Versioned", "Versioned");

	/**
	 * An array of all the '<em><b>Event Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventTypeType[] VALUES_ARRAY =
		new EventTypeType[] {
			CREATED_LITERAL,
			DELETED_LITERAL,
			DEPRECATED_LITERAL,
			UPDATED_LITERAL,
			VERSIONED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventTypeType get(int value) {
		switch (value) {
			case CREATED: return CREATED_LITERAL;
			case DELETED: return DELETED_LITERAL;
			case DEPRECATED: return DEPRECATED_LITERAL;
			case UPDATED: return UPDATED_LITERAL;
			case VERSIONED: return VERSIONED_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EventTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EventTypeType
