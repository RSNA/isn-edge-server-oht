/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;

import org.openhealthtools.ihe.xds.response.response.ModelPackage;
import org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submission Set Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.SubmissionSetResponseTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.SubmissionSetResponseTypeImpl#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmissionSetResponseTypeImpl extends EObjectImpl implements SubmissionSetResponseType {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected SubmissionSetType reference;

	/**
	 * The default value of the '{@link #getHomeCommunityId() <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeCommunityId()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_COMMUNITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeCommunityId() <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeCommunityId()
	 * @generated
	 * @ordered
	 */
	protected String homeCommunityId = HOME_COMMUNITY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmissionSetResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SUBMISSION_SET_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmissionSetType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(SubmissionSetType newReference, NotificationChain msgs) {
		SubmissionSetType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(SubmissionSetType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHomeCommunityId() {
		return homeCommunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeCommunityId(String newHomeCommunityId) {
		String oldHomeCommunityId = homeCommunityId;
		homeCommunityId = newHomeCommunityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID, oldHomeCommunityId, homeCommunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE:
				return basicSetReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE:
				return getReference();
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
				return getHomeCommunityId();
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
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE:
				setReference((SubmissionSetType)newValue);
				return;
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
				setHomeCommunityId((String)newValue);
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
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE:
				setReference((SubmissionSetType)null);
				return;
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
				setHomeCommunityId(HOME_COMMUNITY_ID_EDEFAULT);
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
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__REFERENCE:
				return reference != null;
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
				return HOME_COMMUNITY_ID_EDEFAULT == null ? homeCommunityId != null : !HOME_COMMUNITY_ID_EDEFAULT.equals(homeCommunityId);
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
		result.append(" (homeCommunityId: ");
		result.append(homeCommunityId);
		result.append(')');
		return result.toString();
	}

} //SubmissionSetResponseTypeImpl
