/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDS Error List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getError <em>Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getHighestSeverity <em>Highest Severity</em>}</li>
 * </ul>
 *
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorListType()
 * @model extendedMetaData="name='XDSErrorListType' kind='elementOnly'"
 * @generated
 */
public interface XDSErrorListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.xds.response.response.XDSErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorListType_Error()
	 * @model type="org.openhealthtools.ihe.xds.response.response.XDSErrorType" containment="true"
	 *        extendedMetaData="kind='element' name='error'"
	 * @generated
	 */
	EList getError();

	/**
	 * Returns the value of the '<em><b>Highest Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.xds.response.response.XDSStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highest Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highest Severity</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see #isSetHighestSeverity()
	 * @see #unsetHighestSeverity()
	 * @see #setHighestSeverity(XDSStatusType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorListType_HighestSeverity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='highestSeverity'"
	 * @generated
	 */
	XDSStatusType getHighestSeverity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getHighestSeverity <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highest Severity</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see #isSetHighestSeverity()
	 * @see #unsetHighestSeverity()
	 * @see #getHighestSeverity()
	 * @generated
	 */
	void setHighestSeverity(XDSStatusType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getHighestSeverity <em>Highest Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighestSeverity()
	 * @see #getHighestSeverity()
	 * @see #setHighestSeverity(XDSStatusType)
	 * @generated
	 */
	void unsetHighestSeverity();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorListType#getHighestSeverity <em>Highest Severity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Highest Severity</em>' attribute is set.
	 * @see #unsetHighestSeverity()
	 * @see #getHighestSeverity()
	 * @see #setHighestSeverity(XDSStatusType)
	 * @generated
	 */
	boolean isSetHighestSeverity();

} // XDSErrorListType
