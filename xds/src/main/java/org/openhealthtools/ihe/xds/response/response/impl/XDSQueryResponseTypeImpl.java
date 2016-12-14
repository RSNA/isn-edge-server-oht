/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;

import org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType;
import org.openhealthtools.ihe.xds.response.response.FolderResponseType;
import org.openhealthtools.ihe.xds.response.response.ModelPackage;
import org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType;
import org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDS Query Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl#getDocumentEntryResponses <em>Document Entry Responses</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl#getFolderResponses <em>Folder Responses</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl#getSubmissionSetResponses <em>Submission Set Responses</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.impl.XDSQueryResponseTypeImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XDSQueryResponseTypeImpl extends XDSResponseTypeImpl implements XDSQueryResponseType {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList references;

	/**
	 * The cached value of the '{@link #getDocumentEntryResponses() <em>Document Entry Responses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentEntryResponses()
	 * @generated
	 * @ordered
	 */
	protected EList documentEntryResponses;

	/**
	 * The cached value of the '{@link #getFolderResponses() <em>Folder Responses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderResponses()
	 * @generated
	 * @ordered
	 */
	protected EList folderResponses;

	/**
	 * The cached value of the '{@link #getSubmissionSetResponses() <em>Submission Set Responses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionSetResponses()
	 * @generated
	 * @ordered
	 */
	protected EList submissionSetResponses;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList associations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSQueryResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XDS_QUERY_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferences() {
		if (references == null) {
			references = new EDataTypeEList(Object.class, this, ModelPackage.XDS_QUERY_RESPONSE_TYPE__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentEntryResponses() {
		if (documentEntryResponses == null) {
			documentEntryResponses = new EObjectContainmentEList(DocumentEntryResponseType.class, this, ModelPackage.XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES);
		}
		return documentEntryResponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFolderResponses() {
		if (folderResponses == null) {
			folderResponses = new EObjectContainmentEList(FolderResponseType.class, this, ModelPackage.XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES);
		}
		return folderResponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubmissionSetResponses() {
		if (submissionSetResponses == null) {
			submissionSetResponses = new EObjectContainmentEList(SubmissionSetResponseType.class, this, ModelPackage.XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES);
		}
		return submissionSetResponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssociations() {
		if (associations == null) {
			associations = new EDataTypeEList(Object.class, this, ModelPackage.XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS);
		}
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES:
				return ((InternalEList)getDocumentEntryResponses()).basicRemove(otherEnd, msgs);
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES:
				return ((InternalEList)getFolderResponses()).basicRemove(otherEnd, msgs);
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES:
				return ((InternalEList)getSubmissionSetResponses()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__REFERENCES:
				return getReferences();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES:
				return getDocumentEntryResponses();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES:
				return getFolderResponses();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES:
				return getSubmissionSetResponses();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS:
				return getAssociations();
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
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection)newValue);
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES:
				getDocumentEntryResponses().clear();
				getDocumentEntryResponses().addAll((Collection)newValue);
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES:
				getFolderResponses().clear();
				getFolderResponses().addAll((Collection)newValue);
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES:
				getSubmissionSetResponses().clear();
				getSubmissionSetResponses().addAll((Collection)newValue);
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection)newValue);
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
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__REFERENCES:
				getReferences().clear();
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES:
				getDocumentEntryResponses().clear();
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES:
				getFolderResponses().clear();
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES:
				getSubmissionSetResponses().clear();
				return;
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS:
				getAssociations().clear();
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
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__REFERENCES:
				return references != null && !references.isEmpty();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__DOCUMENT_ENTRY_RESPONSES:
				return documentEntryResponses != null && !documentEntryResponses.isEmpty();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__FOLDER_RESPONSES:
				return folderResponses != null && !folderResponses.isEmpty();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__SUBMISSION_SET_RESPONSES:
				return submissionSetResponses != null && !submissionSetResponses.isEmpty();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
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
		result.append(" (references: ");
		result.append(references);
		result.append(", associations: ");
		result.append(associations);
		result.append(')');
		return result.toString();
	}

} //XDSQueryResponseTypeImpl
