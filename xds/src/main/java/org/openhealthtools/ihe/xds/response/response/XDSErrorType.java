/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDS Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getCodeContext <em>Code Context</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorType()
 * @model extendedMetaData="name='XDSErrorType' kind='simple'"
 * @generated
 */
public interface XDSErrorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Code Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Context</em>' attribute.
	 * @see #setCodeContext(String)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorType_CodeContext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='codeContext'"
	 * @generated
	 */
	String getCodeContext();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getCodeContext <em>Code Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Context</em>' attribute.
	 * @see #getCodeContext()
	 * @generated
	 */
	void setCodeContext(String value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.xds.response.response.XDSErrorCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #setErrorCode(XDSErrorCode)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorType_ErrorCode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='errorCode'"
	 * @generated
	 */
	XDSErrorCode getErrorCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSErrorCode
	 * @see #isSetErrorCode()
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(XDSErrorCode value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(XDSErrorCode)
	 * @generated
	 */
	void unsetErrorCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getErrorCode <em>Error Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Code</em>' attribute is set.
	 * @see #unsetErrorCode()
	 * @see #getErrorCode()
	 * @see #setErrorCode(XDSErrorCode)
	 * @generated
	 */
	boolean isSetErrorCode();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorType_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.xds.response.response.XDSStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #setSeverity(XDSStatusType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSErrorType_Severity()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='severity'"
	 * @generated
	 */
	XDSStatusType getSeverity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.openhealthtools.ihe.xds.response.response.XDSStatusType
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(XDSStatusType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(XDSStatusType)
	 * @generated
	 */
	void unsetSeverity();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.xds.response.response.XDSErrorType#getSeverity <em>Severity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Severity</em>' attribute is set.
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(XDSStatusType)
	 * @generated
	 */
	boolean isSetSeverity();

} // XDSErrorType
