/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReturnTypeType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Return Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getReturnTypeType()
 * @model
 * @generated
 */
public final class ReturnTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Object Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT_REF_LITERAL
	 * @model name="ObjectRef"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_REF = 0;

	/**
	 * The '<em><b>Registry Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Registry Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_OBJECT_LITERAL
	 * @model name="RegistryObject"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_OBJECT = 1;

	/**
	 * The '<em><b>Leaf Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leaf Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAF_CLASS_LITERAL
	 * @model name="LeafClass"
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_CLASS = 2;

	/**
	 * The '<em><b>Leaf Class With Repository Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leaf Class With Repository Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAF_CLASS_WITH_REPOSITORY_ITEM_LITERAL
	 * @model name="LeafClassWithRepositoryItem"
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_CLASS_WITH_REPOSITORY_ITEM = 3;

	/**
	 * The '<em><b>Object Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_REF
	 * @generated
	 * @ordered
	 */
	public static final ReturnTypeType OBJECT_REF_LITERAL = new ReturnTypeType(OBJECT_REF, "ObjectRef", "ObjectRef");

	/**
	 * The '<em><b>Registry Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_OBJECT
	 * @generated
	 * @ordered
	 */
	public static final ReturnTypeType REGISTRY_OBJECT_LITERAL = new ReturnTypeType(REGISTRY_OBJECT, "RegistryObject", "RegistryObject");

	/**
	 * The '<em><b>Leaf Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAF_CLASS
	 * @generated
	 * @ordered
	 */
	public static final ReturnTypeType LEAF_CLASS_LITERAL = new ReturnTypeType(LEAF_CLASS, "LeafClass", "LeafClass");

	/**
	 * The '<em><b>Leaf Class With Repository Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAF_CLASS_WITH_REPOSITORY_ITEM
	 * @generated
	 * @ordered
	 */
	public static final ReturnTypeType LEAF_CLASS_WITH_REPOSITORY_ITEM_LITERAL = new ReturnTypeType(LEAF_CLASS_WITH_REPOSITORY_ITEM, "LeafClassWithRepositoryItem", "LeafClassWithRepositoryItem");

	/**
	 * An array of all the '<em><b>Return Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReturnTypeType[] VALUES_ARRAY =
		new ReturnTypeType[] {
			OBJECT_REF_LITERAL,
			REGISTRY_OBJECT_LITERAL,
			LEAF_CLASS_LITERAL,
			LEAF_CLASS_WITH_REPOSITORY_ITEM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Return Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Return Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnTypeType get(int value) {
		switch (value) {
			case OBJECT_REF: return OBJECT_REF_LITERAL;
			case REGISTRY_OBJECT: return REGISTRY_OBJECT_LITERAL;
			case LEAF_CLASS: return LEAF_CLASS_LITERAL;
			case LEAF_CLASS_WITH_REPOSITORY_ITEM: return LEAF_CLASS_WITH_REPOSITORY_ITEM_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReturnTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ReturnTypeType
