/**
 */
package org.openhealthtools.ihe.xds.response.response.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.ihe.xds.response.response.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.DOCUMENT_ENTRY_RESPONSE_TYPE: return createDocumentEntryResponseType();
			case ModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ModelPackage.FOLDER_RESPONSE_TYPE: return createFolderResponseType();
			case ModelPackage.SUBMISSION_SET_RESPONSE_TYPE: return createSubmissionSetResponseType();
			case ModelPackage.XDS_ERROR_LIST_TYPE: return createXDSErrorListType();
			case ModelPackage.XDS_ERROR_TYPE: return createXDSErrorType();
			case ModelPackage.XDS_QUERY_RESPONSE_TYPE: return createXDSQueryResponseType();
			case ModelPackage.XDS_RESPONSE_TYPE: return createXDSResponseType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.XDS_ERROR_CODE:
				return createXDSErrorCodeFromString(eDataType, initialValue);
			case ModelPackage.XDS_STATUS_TYPE:
				return createXDSStatusTypeFromString(eDataType, initialValue);
			case ModelPackage.XDS_ERROR_CODE_OBJECT:
				return createXDSErrorCodeObjectFromString(eDataType, initialValue);
			case ModelPackage.XDS_STATUS_TYPE_OBJECT:
				return createXDSStatusTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.XDS_ERROR_CODE:
				return convertXDSErrorCodeToString(eDataType, instanceValue);
			case ModelPackage.XDS_STATUS_TYPE:
				return convertXDSStatusTypeToString(eDataType, instanceValue);
			case ModelPackage.XDS_ERROR_CODE_OBJECT:
				return convertXDSErrorCodeObjectToString(eDataType, instanceValue);
			case ModelPackage.XDS_STATUS_TYPE_OBJECT:
				return convertXDSStatusTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentEntryResponseType createDocumentEntryResponseType() {
		DocumentEntryResponseTypeImpl documentEntryResponseType = new DocumentEntryResponseTypeImpl();
		return documentEntryResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderResponseType createFolderResponseType() {
		FolderResponseTypeImpl folderResponseType = new FolderResponseTypeImpl();
		return folderResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmissionSetResponseType createSubmissionSetResponseType() {
		SubmissionSetResponseTypeImpl submissionSetResponseType = new SubmissionSetResponseTypeImpl();
		return submissionSetResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorListType createXDSErrorListType() {
		XDSErrorListTypeImpl xdsErrorListType = new XDSErrorListTypeImpl();
		return xdsErrorListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorType createXDSErrorType() {
		XDSErrorTypeImpl xdsErrorType = new XDSErrorTypeImpl();
		return xdsErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSQueryResponseType createXDSQueryResponseType() {
		XDSQueryResponseTypeImpl xdsQueryResponseType = new XDSQueryResponseTypeImpl();
		return xdsQueryResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSResponseType createXDSResponseType() {
		XDSResponseTypeImpl xdsResponseType = new XDSResponseTypeImpl();
		return xdsResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorCode createXDSErrorCodeFromString(EDataType eDataType, String initialValue) {
		XDSErrorCode result = XDSErrorCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXDSErrorCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSStatusType createXDSStatusTypeFromString(EDataType eDataType, String initialValue) {
		XDSStatusType result = XDSStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXDSStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSErrorCode createXDSErrorCodeObjectFromString(EDataType eDataType, String initialValue) {
		return createXDSErrorCodeFromString(ModelPackage.Literals.XDS_ERROR_CODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXDSErrorCodeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertXDSErrorCodeToString(ModelPackage.Literals.XDS_ERROR_CODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDSStatusType createXDSStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createXDSStatusTypeFromString(ModelPackage.Literals.XDS_STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXDSStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertXDSStatusTypeToString(ModelPackage.Literals.XDS_STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
