/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2006/10/19 20:16:14 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl;

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

import org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.ApproveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.DeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.RemoveObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.SubmitObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.UndeprecateObjectsRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.lcm.UpdateObjectsRequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getAcceptObjectsRequest <em>Accept Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getApproveObjectsRequest <em>Approve Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getDeprecateObjectsRequest <em>Deprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getRelocateObjectsRequest <em>Relocate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getRemoveObjectsRequest <em>Remove Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getSubmitObjectsRequest <em>Submit Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getUndeprecateObjectsRequest <em>Undeprecate Objects Request</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.impl.DocumentRootImpl#getUpdateObjectsRequest <em>Update Objects Request</em>}</li>
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
		return LCMPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, LCMPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, LCMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, LCMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptObjectsRequestType getAcceptObjectsRequest() {
		return (AcceptObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptObjectsRequest(AcceptObjectsRequestType newAcceptObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST, newAcceptObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptObjectsRequest(AcceptObjectsRequestType newAcceptObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST, newAcceptObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproveObjectsRequestType getApproveObjectsRequest() {
		return (ApproveObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproveObjectsRequest(ApproveObjectsRequestType newApproveObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST, newApproveObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproveObjectsRequest(ApproveObjectsRequestType newApproveObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST, newApproveObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecateObjectsRequestType getDeprecateObjectsRequest() {
		return (DeprecateObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecateObjectsRequest(DeprecateObjectsRequestType newDeprecateObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST, newDeprecateObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecateObjectsRequest(DeprecateObjectsRequestType newDeprecateObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST, newDeprecateObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelocateObjectsRequestType getRelocateObjectsRequest() {
		return (RelocateObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelocateObjectsRequest(RelocateObjectsRequestType newRelocateObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST, newRelocateObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelocateObjectsRequest(RelocateObjectsRequestType newRelocateObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST, newRelocateObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveObjectsRequestType getRemoveObjectsRequest() {
		return (RemoveObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveObjectsRequest(RemoveObjectsRequestType newRemoveObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST, newRemoveObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveObjectsRequest(RemoveObjectsRequestType newRemoveObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST, newRemoveObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitObjectsRequestType getSubmitObjectsRequest() {
		return (SubmitObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitObjectsRequest(SubmitObjectsRequestType newSubmitObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST, newSubmitObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitObjectsRequest(SubmitObjectsRequestType newSubmitObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST, newSubmitObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndeprecateObjectsRequestType getUndeprecateObjectsRequest() {
		return (UndeprecateObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUndeprecateObjectsRequest(UndeprecateObjectsRequestType newUndeprecateObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST, newUndeprecateObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndeprecateObjectsRequest(UndeprecateObjectsRequestType newUndeprecateObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST, newUndeprecateObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateObjectsRequestType getUpdateObjectsRequest() {
		return (UpdateObjectsRequestType)getMixed().get(LCMPackage.Literals.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateObjectsRequest(UpdateObjectsRequestType newUpdateObjectsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(LCMPackage.Literals.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST, newUpdateObjectsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateObjectsRequest(UpdateObjectsRequestType newUpdateObjectsRequest) {
		((FeatureMap.Internal)getMixed()).set(LCMPackage.Literals.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST, newUpdateObjectsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LCMPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case LCMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case LCMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case LCMPackage.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST:
				return basicSetAcceptObjectsRequest(null, msgs);
			case LCMPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				return basicSetApproveObjectsRequest(null, msgs);
			case LCMPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				return basicSetDeprecateObjectsRequest(null, msgs);
			case LCMPackage.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST:
				return basicSetRelocateObjectsRequest(null, msgs);
			case LCMPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				return basicSetRemoveObjectsRequest(null, msgs);
			case LCMPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				return basicSetSubmitObjectsRequest(null, msgs);
			case LCMPackage.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST:
				return basicSetUndeprecateObjectsRequest(null, msgs);
			case LCMPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				return basicSetUpdateObjectsRequest(null, msgs);
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
			case LCMPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case LCMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case LCMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case LCMPackage.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST:
				return getAcceptObjectsRequest();
			case LCMPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				return getApproveObjectsRequest();
			case LCMPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				return getDeprecateObjectsRequest();
			case LCMPackage.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST:
				return getRelocateObjectsRequest();
			case LCMPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				return getRemoveObjectsRequest();
			case LCMPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				return getSubmitObjectsRequest();
			case LCMPackage.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST:
				return getUndeprecateObjectsRequest();
			case LCMPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				return getUpdateObjectsRequest();
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
			case LCMPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST:
				setAcceptObjectsRequest((AcceptObjectsRequestType)newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				setApproveObjectsRequest((ApproveObjectsRequestType)newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				setDeprecateObjectsRequest((DeprecateObjectsRequestType)newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST:
				setRelocateObjectsRequest((RelocateObjectsRequestType)newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				setRemoveObjectsRequest((RemoveObjectsRequestType)newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				setSubmitObjectsRequest((SubmitObjectsRequestType)newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST:
				setUndeprecateObjectsRequest((UndeprecateObjectsRequestType)newValue);
				return;
			case LCMPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				setUpdateObjectsRequest((UpdateObjectsRequestType)newValue);
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
			case LCMPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case LCMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case LCMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case LCMPackage.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST:
				setAcceptObjectsRequest((AcceptObjectsRequestType)null);
				return;
			case LCMPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				setApproveObjectsRequest((ApproveObjectsRequestType)null);
				return;
			case LCMPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				setDeprecateObjectsRequest((DeprecateObjectsRequestType)null);
				return;
			case LCMPackage.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST:
				setRelocateObjectsRequest((RelocateObjectsRequestType)null);
				return;
			case LCMPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				setRemoveObjectsRequest((RemoveObjectsRequestType)null);
				return;
			case LCMPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				setSubmitObjectsRequest((SubmitObjectsRequestType)null);
				return;
			case LCMPackage.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST:
				setUndeprecateObjectsRequest((UndeprecateObjectsRequestType)null);
				return;
			case LCMPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				setUpdateObjectsRequest((UpdateObjectsRequestType)null);
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
			case LCMPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case LCMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case LCMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case LCMPackage.DOCUMENT_ROOT__ACCEPT_OBJECTS_REQUEST:
				return getAcceptObjectsRequest() != null;
			case LCMPackage.DOCUMENT_ROOT__APPROVE_OBJECTS_REQUEST:
				return getApproveObjectsRequest() != null;
			case LCMPackage.DOCUMENT_ROOT__DEPRECATE_OBJECTS_REQUEST:
				return getDeprecateObjectsRequest() != null;
			case LCMPackage.DOCUMENT_ROOT__RELOCATE_OBJECTS_REQUEST:
				return getRelocateObjectsRequest() != null;
			case LCMPackage.DOCUMENT_ROOT__REMOVE_OBJECTS_REQUEST:
				return getRemoveObjectsRequest() != null;
			case LCMPackage.DOCUMENT_ROOT__SUBMIT_OBJECTS_REQUEST:
				return getSubmitObjectsRequest() != null;
			case LCMPackage.DOCUMENT_ROOT__UNDEPRECATE_OBJECTS_REQUEST:
				return getUndeprecateObjectsRequest() != null;
			case LCMPackage.DOCUMENT_ROOT__UPDATE_OBJECTS_REQUEST:
				return getUpdateObjectsRequest() != null;
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
