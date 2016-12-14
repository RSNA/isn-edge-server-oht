/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtrinsicObjectType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extrinsic Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         ExtrinsicObject is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getContentVersionInfo <em>Content Version Info</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getExtrinsicObjectType()
 * @model extendedMetaData="name='ExtrinsicObjectType' kind='elementOnly'"
 * @generated
 */
public interface ExtrinsicObjectType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Content Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Version Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Version Info</em>' containment reference.
	 * @see #setContentVersionInfo(VersionInfoType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getExtrinsicObjectType_ContentVersionInfo()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ContentVersionInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionInfoType getContentVersionInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getContentVersionInfo <em>Content Version Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Version Info</em>' containment reference.
	 * @see #getContentVersionInfo()
	 * @generated
	 */
	void setContentVersionInfo(VersionInfoType value);

	/**
	 * Returns the value of the '<em><b>Is Opaque</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Opaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Opaque</em>' attribute.
	 * @see #isSetIsOpaque()
	 * @see #unsetIsOpaque()
	 * @see #setIsOpaque(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getExtrinsicObjectType_IsOpaque()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isOpaque'"
	 * @generated
	 */
	boolean isIsOpaque();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Opaque</em>' attribute.
	 * @see #isSetIsOpaque()
	 * @see #unsetIsOpaque()
	 * @see #isIsOpaque()
	 * @generated
	 */
	void setIsOpaque(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOpaque()
	 * @see #isIsOpaque()
	 * @see #setIsOpaque(boolean)
	 * @generated
	 */
	void unsetIsOpaque();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#isIsOpaque <em>Is Opaque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Opaque</em>' attribute is set.
	 * @see #unsetIsOpaque()
	 * @see #isIsOpaque()
	 * @see #setIsOpaque(boolean)
	 * @generated
	 */
	boolean isSetIsOpaque();

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * The default value is <code>"application/octet-stream"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #isSetMimeType()
	 * @see #unsetMimeType()
	 * @see #setMimeType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getExtrinsicObjectType_MimeType()
	 * @model default="application/octet-stream" unique="false" unsettable="true" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.LongName"
	 *        extendedMetaData="kind='attribute' name='mimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #isSetMimeType()
	 * @see #unsetMimeType()
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMimeType()
	 * @see #getMimeType()
	 * @see #setMimeType(String)
	 * @generated
	 */
	void unsetMimeType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType#getMimeType <em>Mime Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mime Type</em>' attribute is set.
	 * @see #unsetMimeType()
	 * @see #getMimeType()
	 * @see #setMimeType(String)
	 * @generated
	 */
	boolean isSetMimeType();

} // ExtrinsicObjectType
