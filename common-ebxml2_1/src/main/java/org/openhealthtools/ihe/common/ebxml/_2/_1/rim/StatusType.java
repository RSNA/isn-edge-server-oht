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
 * $Id: StatusType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getStatusType()
 * @model
 * @generated
 */
public final class StatusType extends AbstractEnumerator {
	/**
	 * The '<em><b>Submitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submitted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMITTED_LITERAL
	 * @model name="Submitted"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMITTED = 0;

	/**
	 * The '<em><b>Approved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Approved</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPROVED_LITERAL
	 * @model name="Approved"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED = 1;

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
	 * The '<em><b>Withdrawn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Withdrawn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN_LITERAL
	 * @model name="Withdrawn"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN = 3;

	/**
	 * The '<em><b>Submitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMITTED
	 * @generated
	 * @ordered
	 */
	public static final StatusType SUBMITTED_LITERAL = new StatusType(SUBMITTED, "Submitted", "Submitted");

	/**
	 * The '<em><b>Approved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED
	 * @generated
	 * @ordered
	 */
	public static final StatusType APPROVED_LITERAL = new StatusType(APPROVED, "Approved", "Approved");

	/**
	 * The '<em><b>Deprecated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED
	 * @generated
	 * @ordered
	 */
	public static final StatusType DEPRECATED_LITERAL = new StatusType(DEPRECATED, "Deprecated", "Deprecated");

	/**
	 * The '<em><b>Withdrawn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN
	 * @generated
	 * @ordered
	 */
	public static final StatusType WITHDRAWN_LITERAL = new StatusType(WITHDRAWN, "Withdrawn", "Withdrawn");

	/**
	 * An array of all the '<em><b>Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusType[] VALUES_ARRAY =
		new StatusType[] {
			SUBMITTED_LITERAL,
			APPROVED_LITERAL,
			DEPRECATED_LITERAL,
			WITHDRAWN_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusType get(int value) {
		switch (value) {
			case SUBMITTED: return SUBMITTED_LITERAL;
			case APPROVED: return APPROVED_LITERAL;
			case DEPRECATED: return DEPRECATED_LITERAL;
			case WITHDRAWN: return WITHDRAWN_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StatusType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //StatusType
