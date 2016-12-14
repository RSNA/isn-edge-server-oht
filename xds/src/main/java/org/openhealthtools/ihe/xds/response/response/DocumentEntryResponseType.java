/**
 */
package org.openhealthtools.ihe.xds.response.response;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.xds.metadata.DocumentEntryType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Entry Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getDocumentEntry <em>Document Entry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 *
 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentEntryResponseType()
 * @model extendedMetaData="name='DocumentEntryResponseType' kind='elementOnly'"
 * @generated
 */
public interface DocumentEntryResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Entry</em>' containment reference.
	 * @see #setDocumentEntry(DocumentEntryType)
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentEntryResponseType_DocumentEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='documentEntry'"
	 * @generated
	 */
	DocumentEntryType getDocumentEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getDocumentEntry <em>Document Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Entry</em>' containment reference.
	 * @see #getDocumentEntry()
	 * @generated
	 */
	void setDocumentEntry(DocumentEntryType value);

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
	 * @see org.openhealthtools.ihe.xds.response.response.ModelPackage#getDocumentEntryResponseType_HomeCommunityId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='homeCommunityId'"
	 * @generated
	 */
	String getHomeCommunityId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.response.DocumentEntryResponseType#getHomeCommunityId <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Community Id</em>' attribute.
	 * @see #getHomeCommunityId()
	 * @generated
	 */
	void setHomeCommunityId(String value);

} // DocumentEntryResponseType
