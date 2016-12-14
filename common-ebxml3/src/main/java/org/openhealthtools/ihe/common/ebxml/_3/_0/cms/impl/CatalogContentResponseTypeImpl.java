/**
 * <copyright>
 * </copyright>
 *
 * $Id: CatalogContentResponseTypeImpl.java,v 1.1 2006/10/19 20:16:36 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Content Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.CatalogContentResponseTypeImpl#getCatalogedContent <em>Cataloged Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogContentResponseTypeImpl extends ContentManagementServiceResponseTypeImpl implements CatalogContentResponseType {
	/**
	 * The cached value of the '{@link #getCatalogedContent() <em>Cataloged Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogedContent()
	 * @generated
	 * @ordered
	 */
	protected RegistryObjectListType catalogedContent = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogContentResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMSPackage.Literals.CATALOG_CONTENT_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getCatalogedContent() {
		return catalogedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogedContent(RegistryObjectListType newCatalogedContent, NotificationChain msgs) {
		RegistryObjectListType oldCatalogedContent = catalogedContent;
		catalogedContent = newCatalogedContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT, oldCatalogedContent, newCatalogedContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogedContent(RegistryObjectListType newCatalogedContent) {
		if (newCatalogedContent != catalogedContent) {
			NotificationChain msgs = null;
			if (catalogedContent != null)
				msgs = ((InternalEObject)catalogedContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT, null, msgs);
			if (newCatalogedContent != null)
				msgs = ((InternalEObject)newCatalogedContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT, null, msgs);
			msgs = basicSetCatalogedContent(newCatalogedContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT, newCatalogedContent, newCatalogedContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT:
				return basicSetCatalogedContent(null, msgs);
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
			case CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT:
				return getCatalogedContent();
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
			case CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT:
				setCatalogedContent((RegistryObjectListType)newValue);
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
			case CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT:
				setCatalogedContent((RegistryObjectListType)null);
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
			case CMSPackage.CATALOG_CONTENT_RESPONSE_TYPE__CATALOGED_CONTENT:
				return catalogedContent != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogContentResponseTypeImpl
