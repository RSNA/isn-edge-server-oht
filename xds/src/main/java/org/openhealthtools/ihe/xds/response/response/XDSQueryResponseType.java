/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDS Query Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getReferences <em>References</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getDocumentEntryResponses <em>Document Entry Responses</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getFolderResponses <em>Folder Responses</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getSubmissionSetResponses <em>Submission Set Responses</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.XDSQueryResponseType#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSQueryResponseType()
 * @model extendedMetaData="name='XDSQueryResponseType' kind='elementOnly'"
 * @generated
 */
public interface XDSQueryResponseType extends XDSResponseType {
	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute list.
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSQueryResponseType_References()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='references'"
	 * @generated
	 */
	EList getReferences();

	/**
	 * Returns the value of the '<em><b>Document Entry Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Entry Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Entry Responses</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSQueryResponseType_DocumentEntryResponses()
	 * @model type="org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType" containment="true"
	 *        extendedMetaData="kind='element' name='documentEntryResponses'"
	 * @generated
	 */
	EList getDocumentEntryResponses();

	/**
	 * Returns the value of the '<em><b>Folder Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.xds.response.response.FolderResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Responses</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSQueryResponseType_FolderResponses()
	 * @model type="org.openhealthtools.ihe.xds.response.response.FolderResponseType" containment="true"
	 *        extendedMetaData="kind='element' name='folderResponses'"
	 * @generated
	 */
	EList getFolderResponses();

	/**
	 * Returns the value of the '<em><b>Submission Set Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission Set Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission Set Responses</em>' containment reference list.
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSQueryResponseType_SubmissionSetResponses()
	 * @model type="org.openhealthtools.ihe.xds.response.response.SubmissionSetResponseType" containment="true"
	 *        extendedMetaData="kind='element' name='submissionSetResponses'"
	 * @generated
	 */
	EList getSubmissionSetResponses();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' attribute list.
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getXDSQueryResponseType_Associations()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='associations'"
	 * @generated
	 */
	EList getAssociations();

} // XDSQueryResponseType
