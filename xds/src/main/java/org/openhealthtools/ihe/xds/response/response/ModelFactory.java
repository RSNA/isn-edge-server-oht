/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.openhealthtools.ihe.xds.response.response.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Entry Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Entry Response Type</em>'.
	 * @generated
	 */
	DocumentEntryResponseType createDocumentEntryResponseType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Folder Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Response Type</em>'.
	 * @generated
	 */
	FolderResponseType createFolderResponseType();

	/**
	 * Returns a new object of class '<em>Submission Set Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submission Set Response Type</em>'.
	 * @generated
	 */
	SubmissionSetResponseType createSubmissionSetResponseType();

	/**
	 * Returns a new object of class '<em>XDS Error List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDS Error List Type</em>'.
	 * @generated
	 */
	XDSErrorListType createXDSErrorListType();

	/**
	 * Returns a new object of class '<em>XDS Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDS Error Type</em>'.
	 * @generated
	 */
	XDSErrorType createXDSErrorType();

	/**
	 * Returns a new object of class '<em>XDS Query Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDS Query Response Type</em>'.
	 * @generated
	 */
	XDSQueryResponseType createXDSQueryResponseType();

	/**
	 * Returns a new object of class '<em>XDS Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDS Response Type</em>'.
	 * @generated
	 */
	XDSResponseType createXDSResponseType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
