/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response;

import org.openhealthtools.ihe.xds.metadata.FolderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.FolderResponseType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.FolderResponseType#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getFolderResponseType()
 * @model extendedMetaData="name='FolderResponseType' kind='elementOnly'"
 */
public interface FolderResponseType
{
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment Folder.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' containment Folder isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' containment Folder.
	 * @see #setFolder(FolderType)
	 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getFolderResponseType_Folder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Folder'"
	 */
	FolderType getFolder();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.model.FolderResponseType#getFodler <em>Folder</em>}' containment Folder.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' containment Folder.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(FolderType value);

	/**
	 * Returns the value of the '<em><b>Home Community Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Community Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Community Id</em>' attribute.
	 * @see #setHomeCommunityId(String)
	 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getFolderResponseType_HomeCommunityId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='homeCommunityId'"
	 * @generated
	 */
	String getHomeCommunityId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.model.FolderResponseType#getHomeCommunityId <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Community Id</em>' attribute.
	 * @see #getHomeCommunityId()
	 * @generated
	 */
	void setHomeCommunityId(String value);

} // FolderResponseType
