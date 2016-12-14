/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2006/10/19 20:16:12 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rs.impl;

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

import org.openhealthtools.ihe.common.ebxml._3._0.rs.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryErrorType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl#getRegistryError <em>Registry Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl#getRegistryErrorList <em>Registry Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl#getRegistryRequest <em>Registry Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.DocumentRootImpl#getRegistryResponse <em>Registry Response</em>}</li>
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
		return RegistryPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RegistryPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorType getRegistryError() {
		return (RegistryErrorType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryError(RegistryErrorType newRegistryError, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR, newRegistryError, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryError(RegistryErrorType newRegistryError) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR, newRegistryError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryErrorListType getRegistryErrorList() {
		return (RegistryErrorListType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryErrorList(RegistryErrorListType newRegistryErrorList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR_LIST, newRegistryErrorList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryErrorList(RegistryErrorListType newRegistryErrorList) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_ERROR_LIST, newRegistryErrorList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryRequestType getRegistryRequest() {
		return (RegistryRequestType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryRequest(RegistryRequestType newRegistryRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_REQUEST, newRegistryRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryRequest(RegistryRequestType newRegistryRequest) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_REQUEST, newRegistryRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryResponseType getRegistryResponse() {
		return (RegistryResponseType)getMixed().get(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryResponse(RegistryResponseType newRegistryResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_RESPONSE, newRegistryResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryResponse(RegistryResponseType newRegistryResponse) {
		((FeatureMap.Internal)getMixed()).set(RegistryPackage.Literals.DOCUMENT_ROOT__REGISTRY_RESPONSE, newRegistryResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				return basicSetRegistryError(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				return basicSetRegistryErrorList(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_REQUEST:
				return basicSetRegistryRequest(null, msgs);
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				return basicSetRegistryResponse(null, msgs);
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				return getRegistryError();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				return getRegistryErrorList();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_REQUEST:
				return getRegistryRequest();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				return getRegistryResponse();
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				setRegistryError((RegistryErrorType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_REQUEST:
				setRegistryRequest((RegistryRequestType)newValue);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				setRegistryResponse((RegistryResponseType)newValue);
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				setRegistryError((RegistryErrorType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				setRegistryErrorList((RegistryErrorListType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_REQUEST:
				setRegistryRequest((RegistryRequestType)null);
				return;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				setRegistryResponse((RegistryResponseType)null);
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
			case RegistryPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RegistryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case RegistryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR:
				return getRegistryError() != null;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_ERROR_LIST:
				return getRegistryErrorList() != null;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_REQUEST:
				return getRegistryRequest() != null;
			case RegistryPackage.DOCUMENT_ROOT__REGISTRY_RESPONSE:
				return getRegistryResponse() != null;
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
