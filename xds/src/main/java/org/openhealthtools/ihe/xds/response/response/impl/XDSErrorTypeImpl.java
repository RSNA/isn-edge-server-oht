/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.xds.response.response.ModelPackage;
import org.openhealthtools.ihe.xds.response.response.XDSErrorCode;
import org.openhealthtools.ihe.xds.response.response.XDSErrorType;
import org.openhealthtools.ihe.xds.response.response.XDSStatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDS Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl#getCodeContext <em>Code Context</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSErrorTypeImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XDSErrorTypeImpl extends EObjectImpl implements XDSErrorType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeContext() <em>Code Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeContext() <em>Code Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeContext()
	 * @generated
	 * @ordered
	 */
	protected String codeContext = CODE_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final XDSErrorCode ERROR_CODE_EDEFAULT = XDSErrorCode.UNKNOWNERROR_LITERAL;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected XDSErrorCode errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * This is true if the Error Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorCodeESet;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final XDSStatusType SEVERITY_EDEFAULT = XDSStatusType.SUCCESS_LITERAL;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected XDSStatusType severity = SEVERITY_EDEFAULT;

	/**
	 * This is true if the Severity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean severityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XDS_ERROR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDS_ERROR_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeContext() {
		return codeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeContext(String newCodeContext) {
		String oldCodeContext = codeContext;
		codeContext = newCodeContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDS_ERROR_TYPE__CODE_CONTEXT, oldCodeContext, codeContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(XDSErrorCode newErrorCode) {
		XDSErrorCode oldErrorCode = errorCode;
		errorCode = newErrorCode == null ? ERROR_CODE_EDEFAULT : newErrorCode;
		boolean oldErrorCodeESet = errorCodeESet;
		errorCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDS_ERROR_TYPE__ERROR_CODE, oldErrorCode, errorCode, !oldErrorCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorCode() {
		XDSErrorCode oldErrorCode = errorCode;
		boolean oldErrorCodeESet = errorCodeESet;
		errorCode = ERROR_CODE_EDEFAULT;
		errorCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.XDS_ERROR_TYPE__ERROR_CODE, oldErrorCode, ERROR_CODE_EDEFAULT, oldErrorCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorCode() {
		return errorCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDS_ERROR_TYPE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSStatusType getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(XDSStatusType newSeverity) {
		XDSStatusType oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		boolean oldSeverityESet = severityESet;
		severityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XDS_ERROR_TYPE__SEVERITY, oldSeverity, severity, !oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeverity() {
		XDSStatusType oldSeverity = severity;
		boolean oldSeverityESet = severityESet;
		severity = SEVERITY_EDEFAULT;
		severityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.XDS_ERROR_TYPE__SEVERITY, oldSeverity, SEVERITY_EDEFAULT, oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeverity() {
		return severityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XDS_ERROR_TYPE__VALUE:
				return getValue();
			case ModelPackage.XDS_ERROR_TYPE__CODE_CONTEXT:
				return getCodeContext();
			case ModelPackage.XDS_ERROR_TYPE__ERROR_CODE:
				return getErrorCode();
			case ModelPackage.XDS_ERROR_TYPE__LOCATION:
				return getLocation();
			case ModelPackage.XDS_ERROR_TYPE__SEVERITY:
				return getSeverity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.XDS_ERROR_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case ModelPackage.XDS_ERROR_TYPE__CODE_CONTEXT:
				setCodeContext((String)newValue);
				return;
			case ModelPackage.XDS_ERROR_TYPE__ERROR_CODE:
				setErrorCode((XDSErrorCode)newValue);
				return;
			case ModelPackage.XDS_ERROR_TYPE__LOCATION:
				setLocation((String)newValue);
				return;
			case ModelPackage.XDS_ERROR_TYPE__SEVERITY:
				setSeverity((XDSStatusType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.XDS_ERROR_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.XDS_ERROR_TYPE__CODE_CONTEXT:
				setCodeContext(CODE_CONTEXT_EDEFAULT);
				return;
			case ModelPackage.XDS_ERROR_TYPE__ERROR_CODE:
				unsetErrorCode();
				return;
			case ModelPackage.XDS_ERROR_TYPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ModelPackage.XDS_ERROR_TYPE__SEVERITY:
				unsetSeverity();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.XDS_ERROR_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ModelPackage.XDS_ERROR_TYPE__CODE_CONTEXT:
				return CODE_CONTEXT_EDEFAULT == null ? codeContext != null : !CODE_CONTEXT_EDEFAULT.equals(codeContext);
			case ModelPackage.XDS_ERROR_TYPE__ERROR_CODE:
				return isSetErrorCode();
			case ModelPackage.XDS_ERROR_TYPE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ModelPackage.XDS_ERROR_TYPE__SEVERITY:
				return isSetSeverity();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", codeContext: ");
		result.append(codeContext);
		result.append(", errorCode: ");
		if (errorCodeESet) result.append(errorCode); else result.append("<unset>");
		result.append(", location: ");
		result.append(location);
		result.append(", severity: ");
		if (severityESet) result.append(severity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XDSErrorTypeImpl
