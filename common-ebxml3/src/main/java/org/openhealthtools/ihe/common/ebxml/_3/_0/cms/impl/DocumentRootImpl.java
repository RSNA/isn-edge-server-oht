/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2006/10/19 20:16:36 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.cms.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.cms.CMSPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.CatalogContentResponseType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.cms.ValidateContentResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl#getCatalogContentRequest <em>Catalog Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl#getCatalogContentResponse <em>Catalog Content Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl#getValidateContentRequest <em>Validate Content Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.cms.impl.DocumentRootImpl#getValidateContentResponse <em>Validate Content Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap = null;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CMSPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CMSPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogContentRequestType getCatalogContentRequest() {
		return (CatalogContentRequestType)getMixed().get(CMSPackage.Literals.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogContentRequest(CatalogContentRequestType newCatalogContentRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMSPackage.Literals.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST, newCatalogContentRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogContentRequest(CatalogContentRequestType newCatalogContentRequest) {
		((FeatureMap.Internal)getMixed()).set(CMSPackage.Literals.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST, newCatalogContentRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogContentResponseType getCatalogContentResponse() {
		return (CatalogContentResponseType)getMixed().get(CMSPackage.Literals.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogContentResponse(CatalogContentResponseType newCatalogContentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMSPackage.Literals.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE, newCatalogContentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogContentResponse(CatalogContentResponseType newCatalogContentResponse) {
		((FeatureMap.Internal)getMixed()).set(CMSPackage.Literals.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE, newCatalogContentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateContentRequestType getValidateContentRequest() {
		return (ValidateContentRequestType)getMixed().get(CMSPackage.Literals.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateContentRequest(ValidateContentRequestType newValidateContentRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMSPackage.Literals.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST, newValidateContentRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateContentRequest(ValidateContentRequestType newValidateContentRequest) {
		((FeatureMap.Internal)getMixed()).set(CMSPackage.Literals.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST, newValidateContentRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateContentResponseType getValidateContentResponse() {
		return (ValidateContentResponseType)getMixed().get(CMSPackage.Literals.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateContentResponse(ValidateContentResponseType newValidateContentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMSPackage.Literals.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE, newValidateContentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateContentResponse(ValidateContentResponseType newValidateContentResponse) {
		((FeatureMap.Internal)getMixed()).set(CMSPackage.Literals.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE, newValidateContentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMSPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case CMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST:
				return basicSetCatalogContentRequest(null, msgs);
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE:
				return basicSetCatalogContentResponse(null, msgs);
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST:
				return basicSetValidateContentRequest(null, msgs);
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE:
				return basicSetValidateContentResponse(null, msgs);
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
			case CMSPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST:
				return getCatalogContentRequest();
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE:
				return getCatalogContentResponse();
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST:
				return getValidateContentRequest();
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE:
				return getValidateContentResponse();
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
			case CMSPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST:
				setCatalogContentRequest((CatalogContentRequestType)newValue);
				return;
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE:
				setCatalogContentResponse((CatalogContentResponseType)newValue);
				return;
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST:
				setValidateContentRequest((ValidateContentRequestType)newValue);
				return;
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE:
				setValidateContentResponse((ValidateContentResponseType)newValue);
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
			case CMSPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST:
				setCatalogContentRequest((CatalogContentRequestType)null);
				return;
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE:
				setCatalogContentResponse((CatalogContentResponseType)null);
				return;
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST:
				setValidateContentRequest((ValidateContentRequestType)null);
				return;
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE:
				setValidateContentResponse((ValidateContentResponseType)null);
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
			case CMSPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_REQUEST:
				return getCatalogContentRequest() != null;
			case CMSPackage.DOCUMENT_ROOT__CATALOG_CONTENT_RESPONSE:
				return getCatalogContentResponse() != null;
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_REQUEST:
				return getValidateContentRequest() != null;
			case CMSPackage.DOCUMENT_ROOT__VALIDATE_CONTENT_RESPONSE:
				return getValidateContentResponse() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
