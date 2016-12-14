/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response.impl;

import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;
import org.openhealthtools.ihe.xds.response.SubmissionSetResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submission Set Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.impl.SubmissionSetResponseTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.impl.SubmissionSetResponseTypeImpl#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmissionSetResponseTypeImpl implements SubmissionSetResponseType {
	/**
	 * The cached value of the '{@link #getSubmissionSet() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()

	 * @ordered
	 */
	protected SubmissionSetType submissionSet;

	/**
	 * The cached value of the '{@link #getHomeCommunityId() <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeCommunityId()

	 * @ordered
	 */
	protected String homeCommunityId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public SubmissionSetResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public SubmissionSetType getSubmissionSet() {
		return submissionSet;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public void setSubmissionSet(SubmissionSetType newsubmissionSet) {
		submissionSet = newsubmissionSet;
		
		
//		if (newsubmissionSet != submissionSet) {
//			NotificationChain msgs = null;
//			if (submissionSet != null)
//				msgs = ((InternalEObject)submissionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet, null, msgs);
//			if (newsubmissionSet != null)
//				msgs = ((InternalEObject)newsubmissionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet, null, msgs);
//			msgs = basicSetsubmissionSet(newsubmissionSet, msgs);
//			if (msgs != null) msgs.dispatch();
//		}
//		else if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet, newsubmissionSet, newsubmissionSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public String getHomeCommunityId() {
		return homeCommunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public void setHomeCommunityId(String newHomeCommunityId) {
//		String oldHomeCommunityId = homeCommunityId;
		homeCommunityId = newHomeCommunityId;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID, oldHomeCommunityId, homeCommunityId));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public String toString() {
//		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (homeCommunityId: ");
		result.append(homeCommunityId);
		result.append(')');
		return result.toString();
	}
	

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//
//	 */
//	protected EClass eStaticClass() {
//		return ModelPackage.Literals.SUBMISSION_SET_RESPONSE_TYPE;
//	}
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//
//	 */
//	public NotificationChain basicSetsubmissionSet(SubmissionSetType newsubmissionSet, NotificationChain msgs) {
//		SubmissionSetType oldsubmissionSet = submissionSet;
//		submissionSet = newsubmissionSet;
//		if (eNotificationRequired()) {
//			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet, oldsubmissionSet, newsubmissionSet);
//			if (msgs == null) msgs = notification; else msgs.add(notification);
//		}
//		return msgs;
//	}
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//
//	 */
//	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
//		switch (featureID) {
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet:
//				return basicSetsubmissionSet(null, msgs);
//		}
//		return super.eInverseRemove(otherEnd, featureID, msgs);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//
//	 */
//	public Object eGet(int featureID, boolean resolve, boolean coreType) {
//		switch (featureID) {
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet:
//				return getsubmissionSet();
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				return getHomeCommunityId();
//		}
//		return super.eGet(featureID, resolve, coreType);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//
//	 */
//	public void eSet(int featureID, Object newValue) {
//		switch (featureID) {
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet:
//				setsubmissionSet((SubmissionSetType)newValue);
//				return;
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				setHomeCommunityId((String)newValue);
//				return;
//		}
//		super.eSet(featureID, newValue);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//
//	 */
//	public void eUnset(int featureID) {
//		switch (featureID) {
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet:
//				setsubmissionSet((SubmissionSetType)null);
//				return;
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				setHomeCommunityId(HOME_COMMUNITY_ID_EDEFAULT);
//				return;
//		}
//		super.eUnset(featureID);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//
//	 */
//	public boolean eIsSet(int featureID) {
//		switch (featureID) {
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__submissionSet:
//				return submissionSet != null;
//			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				return HOME_COMMUNITY_ID_EDEFAULT == null ? homeCommunityId != null : !HOME_COMMUNITY_ID_EDEFAULT.equals(homeCommunityId);
//		}
//		return super.eIsSet(featureID);
//	}

} //SubmissionSetResponseTypeImpl
