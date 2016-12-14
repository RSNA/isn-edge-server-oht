/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

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

import org.openhealthtools.ihe.xds.response.response.DocumentRoot;
import org.openhealthtools.ihe.xds.response.response.ModelPackage;
import org.openhealthtools.ihe.xds.response.response.XDSErrorListType;
import org.openhealthtools.ihe.xds.response.response.XDSErrorType;
import org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType;
import org.openhealthtools.ihe.xds.response.response.XDSResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl#getXDSError <em>XDS Error</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl#getXDSErrorList <em>XDS Error List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl#getXDSQueryResponse <em>XDS Query Response</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.DocumentRootImpl#getXDSResponse <em>XDS Response</em>}</li>
 * </ul>
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
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ModelPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorType getXDSError() {
		return (XDSErrorType)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__XDS_ERROR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXDSError(XDSErrorType newXDSError, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__XDS_ERROR, newXDSError, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDSError(XDSErrorType newXDSError) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__XDS_ERROR, newXDSError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorListType getXDSErrorList() {
		return (XDSErrorListType)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__XDS_ERROR_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXDSErrorList(XDSErrorListType newXDSErrorList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__XDS_ERROR_LIST, newXDSErrorList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDSErrorList(XDSErrorListType newXDSErrorList) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__XDS_ERROR_LIST, newXDSErrorList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSQueryResponseType getXDSQueryResponse() {
		return (XDSQueryResponseType)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__XDS_QUERY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXDSQueryResponse(XDSQueryResponseType newXDSQueryResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__XDS_QUERY_RESPONSE, newXDSQueryResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDSQueryResponse(XDSQueryResponseType newXDSQueryResponse) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__XDS_QUERY_RESPONSE, newXDSQueryResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSResponseType getXDSResponse() {
		return (XDSResponseType)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__XDS_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXDSResponse(XDSResponseType newXDSResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__XDS_RESPONSE, newXDSResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDSResponse(XDSResponseType newXDSResponse) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__XDS_RESPONSE, newXDSResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR:
				return basicSetXDSError(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR_LIST:
				return basicSetXDSErrorList(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__XDS_QUERY_RESPONSE:
				return basicSetXDSQueryResponse(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__XDS_RESPONSE:
				return basicSetXDSResponse(null, msgs);
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
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR:
				return getXDSError();
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR_LIST:
				return getXDSErrorList();
			case ModelPackage.DOCUMENT_ROOT__XDS_QUERY_RESPONSE:
				return getXDSQueryResponse();
			case ModelPackage.DOCUMENT_ROOT__XDS_RESPONSE:
				return getXDSResponse();
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
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR:
				setXDSError((XDSErrorType)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR_LIST:
				setXDSErrorList((XDSErrorListType)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_QUERY_RESPONSE:
				setXDSQueryResponse((XDSQueryResponseType)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_RESPONSE:
				setXDSResponse((XDSResponseType)newValue);
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
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR:
				setXDSError((XDSErrorType)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR_LIST:
				setXDSErrorList((XDSErrorListType)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_QUERY_RESPONSE:
				setXDSQueryResponse((XDSQueryResponseType)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__XDS_RESPONSE:
				setXDSResponse((XDSResponseType)null);
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
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR:
				return getXDSError() != null;
			case ModelPackage.DOCUMENT_ROOT__XDS_ERROR_LIST:
				return getXDSErrorList() != null;
			case ModelPackage.DOCUMENT_ROOT__XDS_QUERY_RESPONSE:
				return getXDSQueryResponse() != null;
			case ModelPackage.DOCUMENT_ROOT__XDS_RESPONSE:
				return getXDSResponse() != null;
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
