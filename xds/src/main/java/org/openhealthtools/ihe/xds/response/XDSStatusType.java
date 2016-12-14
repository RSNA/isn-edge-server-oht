/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XDS Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getXDSStatusType()
 * @model extendedMetaData="name='XDSStatusType'"
 */
public final class XDSStatusType
{
	/**
	 * The '<em><b>Success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Success</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESS_LITERAL
	 * @model name="Success"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESS = 0;

	/**
	 * The '<em><b>Partial Success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partial Success</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_SUCCESS_LITERAL
	 * @model name="PartialSuccess"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_SUCCESS = 1;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Warning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARNING_LITERAL
	 * @model name="Warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING = 2;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_LITERAL
	 * @model name="Error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR = 3;

	/**
	 * The '<em><b>Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Failure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILURE_LITERAL
	 * @model name="Failure"
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE = 4;

	/**
	 * The '<em><b>Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unavailable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_LITERAL
	 * @model name="Unavailable"
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE = 5;

	/**
	 * The '<em><b>Success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS
	 * @generated
	 * @ordered
	 */
	public static final XDSStatusType SUCCESS_LITERAL = new XDSStatusType(SUCCESS, "Success", "Success");

	/**
	 * The '<em><b>Partial Success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_SUCCESS
	 * @generated
	 * @ordered
	 */
	public static final XDSStatusType PARTIAL_SUCCESS_LITERAL = new XDSStatusType(PARTIAL_SUCCESS, "PartialSuccess", "PartialSuccess");

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @generated
	 * @ordered
	 */
	public static final XDSStatusType WARNING_LITERAL = new XDSStatusType(WARNING, "Warning", "Warning");

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @generated
	 * @ordered
	 */
	public static final XDSStatusType ERROR_LITERAL = new XDSStatusType(ERROR, "Error", "Error");

	/**
	 * The '<em><b>Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILURE
	 * @generated
	 * @ordered
	 */
	public static final XDSStatusType FAILURE_LITERAL = new XDSStatusType(FAILURE, "Failure", "Failure");

	/**
	 * The '<em><b>Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE
	 * @generated
	 * @ordered
	 */
	public static final XDSStatusType UNAVAILABLE_LITERAL = new XDSStatusType(UNAVAILABLE, "Unavailable", "Unavailable");

	/**
	 * An array of all the '<em><b>XDS Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XDSStatusType[] VALUES_ARRAY =
		new XDSStatusType[] {
			SUCCESS_LITERAL,
			PARTIAL_SUCCESS_LITERAL,
			WARNING_LITERAL,
			ERROR_LITERAL,
			FAILURE_LITERAL,
			UNAVAILABLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>XDS Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XDSStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XDS Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XDSStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XDSStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XDS Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XDSStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XDSStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XDS Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XDSStatusType get(int value) {
		switch (value) {
			case SUCCESS: return SUCCESS_LITERAL;
			case PARTIAL_SUCCESS: return PARTIAL_SUCCESS_LITERAL;
			case WARNING: return WARNING_LITERAL;
			case ERROR: return ERROR_LITERAL;
			case FAILURE: return FAILURE_LITERAL;
			case UNAVAILABLE: return UNAVAILABLE_LITERAL;
		}
		return null;
	}
	
	int value;
	String name;
	String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private XDSStatusType(int value, String name, String literal) {
		//super(value, name, literal);
		this.value = value;
		this.name = name;
		this.literal = literal;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

} //XDSStatusType
