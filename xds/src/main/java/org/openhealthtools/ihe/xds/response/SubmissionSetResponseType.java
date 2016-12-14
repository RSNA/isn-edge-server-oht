/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.ihe.xds.response;

import org.openhealthtools.ihe.xds.metadata.SubmissionSetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submission Set Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.SubmissionSetResponseType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.xds.response.model.SubmissionSetResponseType#getHomeCommunityId <em>Home Community Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getSubmissionSetResponseType()
 * @model extendedMetaData="name='SubmissionSetResponseType' kind='elementOnly'"
 */
public interface SubmissionSetResponseType
{
	/**
	 * Returns the value of the '<em><b>SumissionSet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(SubmissionSetType)
	 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getSubmissionSetResponseType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference'"
	 * @generated
	 */
	SubmissionSetType getSubmissionSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.model.SubmissionSetResponseType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setSubmissionSet(SubmissionSetType value);

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
	 * @see org.openhealthtools.ihe.xds.response.model.ModelPackage#getSubmissionSetResponseType_HomeCommunityId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='homeCommunityId'"
	 * @generated
	 */
	String getHomeCommunityId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.xds.response.model.SubmissionSetResponseType#getHomeCommunityId <em>Home Community Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Community Id</em>' attribute.
	 * @see #getHomeCommunityId()
	 * @generated
	 */
	void setHomeCommunityId(String value);

} // SubmissionSetResponseType
