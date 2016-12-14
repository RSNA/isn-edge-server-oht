/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComparatorType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getComparatorType()
 * @model
 * @generated
 */
public final class ComparatorType extends AbstractEnumerator {
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
	 * The '<em><b>Like</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Like</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIKE_LITERAL
	 * @model name="Like"
	 * @generated
	 * @ordered
	 */
	public static final int LIKE = 6;

	/**
	 * The '<em><b>Not Like</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Like</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_LIKE_LITERAL
	 * @model name="NotLike"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_LIKE = 7;

	/**
	 * The '<em><b>LE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType LE_LITERAL = new ComparatorType(LE, "LE", "LE");

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType LT_LITERAL = new ComparatorType(LT, "LT", "LT");

	/**
	 * The '<em><b>GE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType GE_LITERAL = new ComparatorType(GE, "GE", "GE");

	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType GT_LITERAL = new ComparatorType(GT, "GT", "GT");

	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType EQ_LITERAL = new ComparatorType(EQ, "EQ", "EQ");

	/**
	 * The '<em><b>NE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType NE_LITERAL = new ComparatorType(NE, "NE", "NE");

	/**
	 * The '<em><b>Like</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType LIKE_LITERAL = new ComparatorType(LIKE, "Like", "Like");

	/**
	 * The '<em><b>Not Like</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_LIKE
	 * @generated
	 * @ordered
	 */
	public static final ComparatorType NOT_LIKE_LITERAL = new ComparatorType(NOT_LIKE, "NotLike", "NotLike");

	/**
	 * An array of all the '<em><b>Comparator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparatorType[] VALUES_ARRAY =
		new ComparatorType[] {
			LE_LITERAL,
			LT_LITERAL,
			GE_LITERAL,
			GT_LITERAL,
			EQ_LITERAL,
			NE_LITERAL,
			LIKE_LITERAL,
			NOT_LIKE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparatorType get(int value) {
		switch (value) {
			case LE: return LE_LITERAL;
			case LT: return LT_LITERAL;
			case GE: return GE_LITERAL;
			case GT: return GT_LITERAL;
			case EQ: return EQ_LITERAL;
			case NE: return NE_LITERAL;
			case LIKE: return LIKE_LITERAL;
			case NOT_LIKE: return NOT_LIKE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComparatorType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ComparatorType
