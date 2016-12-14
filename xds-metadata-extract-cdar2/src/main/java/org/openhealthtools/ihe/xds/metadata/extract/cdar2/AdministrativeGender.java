/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdministrativeGender.java,v 1.1 2006/11/02 00:58:37 sknoop Exp $
 */
package org.openhealthtools.ihe.xds.metadata.extract.cdar2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Administrative Gender</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * This class was taken from an old EMF generated code base for CDA R2 when the voc.xsd contained
 * the CDA vocabulary markup to a much greater extent.
 * <!-- begin-model-doc -->
 * vocSet: D1 (C-0-D1-cpt)
 * <!-- end-model-doc -->
 * @see org.hl7.v3.V3Package#getAdministrativeGender()
 * @model
 * @generated
 */
public final class AdministrativeGender extends AbstractEnumerator {
    /**
     * The '<em><b>F</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #F_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int F = 0;

    /**
     * The '<em><b>M</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int M = 1;

    /**
     * The '<em><b>UN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UN_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int UN = 2;

    /**
     * The '<em><b>F</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #F
     * @generated
     * @ordered
     */
    public static final AdministrativeGender F_LITERAL = new AdministrativeGender(F, "F");

    /**
     * The '<em><b>M</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M
     * @generated
     * @ordered
     */
    public static final AdministrativeGender M_LITERAL = new AdministrativeGender(M, "M");

    /**
     * The '<em><b>UN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UN
     * @generated
     * @ordered
     */
    public static final AdministrativeGender UN_LITERAL = new AdministrativeGender(UN, "UN");

    /**
     * An array of all the '<em><b>Administrative Gender</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AdministrativeGender[] VALUES_ARRAY =
        new AdministrativeGender[] {
            F_LITERAL,
            M_LITERAL,
            UN_LITERAL,
        };

    /**
     * A public read-only list of all the '<em><b>Administrative Gender</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Administrative Gender</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AdministrativeGender get(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AdministrativeGender result = VALUES_ARRAY[i];
            if (result.toString().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Administrative Gender</b></em>' literal with the specified value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AdministrativeGender get(int value) {
        switch (value) {
            case F: return F_LITERAL;
            case M: return M_LITERAL;
            case UN: return UN_LITERAL;
        }
        return null;	
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private AdministrativeGender(int value, String name) {
        super(value, name);
    }

} //AdministrativeGender
