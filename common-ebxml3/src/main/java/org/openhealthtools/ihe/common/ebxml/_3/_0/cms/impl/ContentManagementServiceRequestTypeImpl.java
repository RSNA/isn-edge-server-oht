/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContentManagementServiceRequestTypeImpl.java,v 1.1 2006/10/19 20:16:36 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;



import org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.ContentManagementServiceRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Management Service Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceRequestTypeImpl#getOriginalContent <em>Original Content</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.ContentManagementServiceRequestTypeImpl#getInvocationControlFile <em>Invocation Control File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentManagementServiceRequestTypeImpl extends RegistryRequestTypeImpl implements ContentManagementServiceRequestType {
	/**
	 * The cached value of the '{@link #getOriginalContent() <em>Original Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalContent()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectListType originalContent = null;

	/**
	 * The cached value of the '{@link #getInvocationControlFile() <em>Invocation Control File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationControlFile()
	 * @generated
	 * @ordered
	 */
	protected EList invocationControlFile = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentManagementServiceRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMSPackage.Literals.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getOriginalContent() {
		return originalContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalContent(RegistryObjectListType newOriginalContent, NotificationChain msgs) {
		RegistryObjectListType oldOriginalContent = originalContent;
		originalContent = newOriginalContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT, oldOriginalContent, newOriginalContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalContent(RegistryObjectListType newOriginalContent) {
		if (newOriginalContent != originalContent) {
			NotificationChain msgs = null;
			if (originalContent != null)
				msgs = ((InternalEObject)originalContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT, null, msgs);
			if (newOriginalContent != null)
				msgs = ((InternalEObject)newOriginalContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT, null, msgs);
			msgs = basicSetOriginalContent(newOriginalContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT, newOriginalContent, newOriginalContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInvocationControlFile() {
		if (invocationControlFile == null) {
			invocationControlFile = new EObjectContainmentEList(ExtrinsicObjectType.class, this, CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE);
		}
		return invocationControlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT:
				return basicSetOriginalContent(null, msgs);
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE:
				return ((InternalEList)getInvocationControlFile()).basicRemove(otherEnd, msgs);
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
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT:
				return getOriginalContent();
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE:
				return getInvocationControlFile();
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
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT:
				setOriginalContent((RegistryObjectListType)newValue);
				return;
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE:
				getInvocationControlFile().clear();
				getInvocationControlFile().addAll((Collection)newValue);
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
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT:
				setOriginalContent((RegistryObjectListType)null);
				return;
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE:
				getInvocationControlFile().clear();
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
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__ORIGINAL_CONTENT:
				return originalContent != null;
			case CMSPackage.CONTENT_MANAGEMENT_SERVICE_REQUEST_TYPE__INVOCATION_CONTROL_FILE:
				return invocationControlFile != null && !invocationControlFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentManagementServiceRequestTypeImpl
