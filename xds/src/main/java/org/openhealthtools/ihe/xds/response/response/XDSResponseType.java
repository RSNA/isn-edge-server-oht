/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDS Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getErrorList <em>Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSResponseType()
 * @model extendedMetaData="name='XDSResponseType' kind='elementOnly'"
 * @generated
 */
public interface XDSResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error List</em>' containment reference.
	 * @see #setErrorList(XDSErrorListType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSResponseType_ErrorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='errorList'"
	 * @generated
	 */
	XDSErrorListType getErrorList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getErrorList <em>Error List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error List</em>' containment reference.
	 * @see #getErrorList()
	 * @generated
	 */
	void setErrorList(XDSErrorListType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.xds.response.response.XDSStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(XDSStatusType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSResponseType_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	XDSStatusType getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(XDSStatusType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(XDSStatusType)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSResponseType#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(XDSStatusType)
	 * @generated
	 */
	boolean isSetStatus();

} // XDSResponseType
