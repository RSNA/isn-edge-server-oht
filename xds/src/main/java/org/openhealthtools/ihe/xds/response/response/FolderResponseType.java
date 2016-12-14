/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.xds.metadata.FolderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.FolderResponseType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.FolderResponseType#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 *
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getFolderResponseType()
 * @model extendedMetaData="name='FolderResponseType' kind='elementOnly'"
 * @generated
 */
public interface FolderResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(FolderType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getFolderResponseType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference'"
	 * @generated
	 */
	FolderType getReference();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.FolderResponseType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(FolderType value);

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
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getFolderResponseType_HomeCommunityId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='homeCommunityId'"
	 * @generated
	 */
	String getHomeCommunityId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.FolderResponseType#getHomeCommunityId <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Community Id</em>' attribute.
	 * @see #getHomeCommunityId()
	 * @generated
	 */
	void setHomeCommunityId(String value);

} // FolderResponseType
