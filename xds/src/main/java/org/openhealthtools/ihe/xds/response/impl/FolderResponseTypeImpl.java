/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response.impl;


import org.openhealthtools.ihe.xds.metadata.FolderType;
import org.openhealthtools.ihe.xds.response.FolderResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.impl.FolderResponseTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.impl.FolderResponseTypeImpl#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FolderResponseTypeImpl implements FolderResponseType {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected FolderType folder;

	/**
	 * The cached value of the '{@link #getHomeCommunityId() <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeCommunityId()
	 * @generated
	 * @ordered
	 */
	protected String homeCommunityId ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderResponseTypeImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderType getFolder() {
		return folder;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(FolderType newfolder) {
		folder = newfolder;
//		if (newfolder != folder) {
//			NotificationChain msgs = null;
//			if (folder != null)
//				msgs = ((InternalEObject)folder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FOLDER_RESPONSE_TYPE__folder, null, msgs);
//			if (newfolder != null)
//				msgs = ((InternalEObject)newfolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FOLDER_RESPONSE_TYPE__folder, null, msgs);
//			msgs = basicSetfolder(newfolder, msgs);
//			if (msgs != null) msgs.dispatch();
//		}
//		else if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FOLDER_RESPONSE_TYPE__folder, newfolder, newfolder));
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
//		String oldHomeCommunityId = homeCommunityId;
		homeCommunityId = newHomeCommunityId;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID, oldHomeCommunityId, homeCommunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
//	 * @generated
//	 */
//	public NotificationChain basicSetfolder(FolderType newfolder, NotificationChain msgs) {
//		FolderType oldfolder = folder;
//		folder = newfolder;
//		if (eNotificationRequired()) {
//			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FOLDER_RESPONSE_TYPE__folder, oldfolder, newfolder);
//			if (msgs == null) msgs = notification; else msgs.add(notification);
//		}
//		return msgs;
//	}
		
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
//		switch (featureID) {
//			case ModelPackage.FOLDER_RESPONSE_TYPE__folder:
//				return basicSetfolder(null, msgs);
//		}
//		return super.eInverseRemove(otherEnd, featureID, msgs);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public Object eGet(int featureID, boolean resolve, boolean coreType) {
//		switch (featureID) {
//			case ModelPackage.FOLDER_RESPONSE_TYPE__folder:
//				return getfolder();
//			case ModelPackage.FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				return getHomeCommunityId();
//		}
//		return super.eGet(featureID, resolve, coreType);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void eSet(int featureID, Object newValue) {
//		switch (featureID) {
//			case ModelPackage.FOLDER_RESPONSE_TYPE__folder:
//				setfolder((FolderType)newValue);
//				return;
//			case ModelPackage.FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				setHomeCommunityId((String)newValue);
//				return;
//		}
//		super.eSet(featureID, newValue);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void eUnset(int featureID) {
//		switch (featureID) {
//			case ModelPackage.FOLDER_RESPONSE_TYPE__folder:
//				setfolder((FolderType)null);
//				return;
//			case ModelPackage.FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				setHomeCommunityId(HOME_COMMUNITY_ID_EDEFAULT);
//				return;
//		}
//		super.eUnset(featureID);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public boolean eIsSet(int featureID) {
//		switch (featureID) {
//			case ModelPackage.FOLDER_RESPONSE_TYPE__folder:
//				return folder != null;
//			case ModelPackage.FOLDER_RESPONSE_TYPE__HOME_COMMUNITY_ID:
//				return HOME_COMMUNITY_ID_EDEFAULT == null ? homeCommunityId != null : !HOME_COMMUNITY_ID_EDEFAULT.equals(homeCommunityId);
//		}
//		return super.eIsSet(featureID);
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	protected EClass eStaticClass() {
//		return ModelPackage.Literals.FOLDER_RESPONSE_TYPE;
//	}
				
} //FolderResponseTypeImpl
