/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConformanceProfileType.java,v 1.1 2006/10/19 20:16:10 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conformance Profile Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getConformanceProfileType()
 * @model
 * @generated
 */
public final class ConformanceProfileType extends AbstractEnumerator {
	/**
	 * The '<em><b>Registry Full</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Registry Full</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_FULL_LITERAL
	 * @model name="registryFull"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_FULL = 0;

	/**
	 * The '<em><b>Registry Lite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Registry Lite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_LITE_LITERAL
	 * @model name="registryLite"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_LITE = 1;

	/**
	 * The '<em><b>Registry Full</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_FULL
	 * @generated
	 * @ordered
	 */
	public static final ConformanceProfileType REGISTRY_FULL_LITERAL = new ConformanceProfileType(REGISTRY_FULL, "registryFull", "registryFull");

	/**
	 * The '<em><b>Registry Lite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_LITE
	 * @generated
	 * @ordered
	 */
	public static final ConformanceProfileType REGISTRY_LITE_LITERAL = new ConformanceProfileType(REGISTRY_LITE, "registryLite", "registryLite");

	/**
	 * An array of all the '<em><b>Conformance Profile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConformanceProfileType[] VALUES_ARRAY =
		new ConformanceProfileType[] {
			REGISTRY_FULL_LITERAL,
			REGISTRY_LITE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Conformance Profile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conformance Profile Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConformanceProfileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceProfileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Profile Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConformanceProfileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceProfileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Profile Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConformanceProfileType get(int value) {
		switch (value) {
			case REGISTRY_FULL: return REGISTRY_FULL_LITERAL;
			case REGISTRY_LITE: return REGISTRY_LITE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConformanceProfileType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConformanceProfileType
