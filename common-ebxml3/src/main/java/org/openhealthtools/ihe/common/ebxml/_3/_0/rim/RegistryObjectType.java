/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryObjectType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         id may be empty. If specified it may be in urn:uuid format or be in some
 *         arbitrary format. If id is empty registry must generate globally unique id.
 *         If id is provided and in proper URN syntax the
 *         registry MUST honour it.
 *         If id is provided and is not in proper URN syntax then it is used for
 *         linkage within document and is ignored by the registry. In this case the
 *         registry generates a UUID URN for id attribute.
 *         id must not be null when object is being retrieved from the registry.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getVersionInfo <em>Version Info</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getLid <em>Lid</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType()
 * @model extendedMetaData="name='RegistryObjectType' kind='elementOnly'"
 * @generated
 */
public interface RegistryObjectType extends IdentifiableType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(InternationalStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_Name()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringType getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(InternationalStringType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(InternationalStringType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_Description()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringType getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(InternationalStringType value);

	/**
	 * Returns the value of the '<em><b>Version Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Info</em>' containment reference.
	 * @see #setVersionInfo(VersionInfoType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_VersionInfo()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='VersionInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionInfoType getVersionInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getVersionInfo <em>Version Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Info</em>' containment reference.
	 * @see #getVersionInfo()
	 * @generated
	 */
	void setVersionInfo(VersionInfoType value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_Classification()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='Classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getClassification();

	/**
	 * Returns the value of the '<em><b>External Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifier</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_ExternalIdentifier()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExternalIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getExternalIdentifier();

	/**
	 * Returns the value of the '<em><b>Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lid</em>' attribute.
	 * @see #setLid(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_Lid()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='lid'"
	 * @generated
	 */
	String getLid();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getLid <em>Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lid</em>' attribute.
	 * @see #getLid()
	 * @generated
	 */
	void setLid(String value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #setObjectType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_ObjectType()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='objectType'"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getRegistryObjectType_Status()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // RegistryObjectType
