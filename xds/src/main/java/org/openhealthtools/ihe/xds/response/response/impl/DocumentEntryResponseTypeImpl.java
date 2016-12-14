/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;

import org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType;
import org.openhealthtools.ihe.xds.response.response.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Entry Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentEntryResponseTypeImpl#getDocumentEntry <em>Document Entry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentEntryResponseTypeImpl#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentEntryResponseTypeImpl extends EObjectImpl implements DocumentEntryResponseType {
	/**
	 * The cached value of the '{@link #getDocumentEntry() <em>Document Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentEntry()
	 * @generated
	 * @ordered
	 */
	protected DocumentEntryType documentEntry;

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
	public DocumentEntryResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DOCUMENT_ENTRY_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentEntryType getDocumentEntry() {
		return documentEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentEntry(DocumentEntryType newDocumentEntry, NotificationChain msgs) {
		DocumentEntryType oldDocumentEntry = documentEntry;
		documentEntry = newDocumentEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY, oldDocumentEntry, newDocumentEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentEntry(DocumentEntryType newDocumentEntry) {
		if (newDocumentEntry != documentEntry) {
			NotificationChain msgs = null;
			if (documentEntry != null)
				msgs = ((InternalEObject)documentEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY, null, msgs);
			if (newDocumentEntry != null)
				msgs = ((InternalEObject)newDocumentEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY, null, msgs);
			msgs = basicSetDocumentEntry(newDocumentEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY, newDocumentEntry, newDocumentEntry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID, oldHomeCommunityId, homeCommunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY:
				return basicSetDocumentEntry(null, msgs);
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
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY:
				return getDocumentEntry();
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID:
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
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY:
				setDocumentEntry((DocumentEntryType)newValue);
				return;
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID:
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
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY:
				setDocumentEntry((DocumentEntryType)null);
				return;
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID:
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
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__DOCUMENT_ENTRY:
				return documentEntry != null;
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE__HOME_COMMUNITY_ID:
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

} //DocumentEntryResponseTypeImpl
