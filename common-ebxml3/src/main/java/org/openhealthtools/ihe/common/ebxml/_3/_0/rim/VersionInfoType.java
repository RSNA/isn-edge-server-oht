/**
 * <copyright>
 * </copyright>
 *
 * $Id: VersionInfoType.java,v 1.1 2006/10/19 20:16:10 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getVersionName <em>Version Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getVersionInfoType()
 * @model extendedMetaData="name='VersionInfoType' kind='empty'"
 * @generated
 */
public interface VersionInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getVersionInfoType_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Version Name</b></em>' attribute.
	 * The default value is <code>"1.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Name</em>' attribute.
	 * @see #isSetVersionName()
	 * @see #unsetVersionName()
	 * @see #setVersionName(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getVersionInfoType_VersionName()
	 * @model default="1.1" unique="false" unsettable="true" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.String16"
	 *        extendedMetaData="kind='attribute' name='versionName'"
	 * @generated
	 */
	String getVersionName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getVersionName <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Name</em>' attribute.
	 * @see #isSetVersionName()
	 * @see #unsetVersionName()
	 * @see #getVersionName()
	 * @generated
	 */
	void setVersionName(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getVersionName <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersionName()
	 * @see #getVersionName()
	 * @see #setVersionName(String)
	 * @generated
	 */
	void unsetVersionName();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType#getVersionName <em>Version Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version Name</em>' attribute is set.
	 * @see #unsetVersionName()
	 * @see #getVersionName()
	 * @see #setVersionName(String)
	 * @generated
	 */
	boolean isSetVersionName();

} // VersionInfoType
