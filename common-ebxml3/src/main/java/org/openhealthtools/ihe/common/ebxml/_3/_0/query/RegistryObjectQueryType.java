/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegistryObjectQueryType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Object Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getSlotBranch <em>Slot Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getNameBranch <em>Name Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getDescriptionBranch <em>Description Branch</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getVersionInfoFilter <em>Version Info Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getClassificationQuery <em>Classification Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getExternalIdentifierQuery <em>External Identifier Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getObjectTypeQuery <em>Object Type Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getStatusQuery <em>Status Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getSourceAssociationQuery <em>Source Association Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getTargetAssociationQuery <em>Target Association Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType()
 * @model extendedMetaData="name='RegistryObjectQueryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryObjectQueryType extends FilterQueryType {
	/**
	 * Returns the value of the '<em><b>Slot Branch</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Branch</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_SlotBranch()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.SlotBranchType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SlotBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSlotBranch();

	/**
	 * Returns the value of the '<em><b>Name Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Branch</em>' containment reference.
	 * @see #setNameBranch(InternationalStringBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_NameBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='NameBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringBranchType getNameBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getNameBranch <em>Name Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Branch</em>' containment reference.
	 * @see #getNameBranch()
	 * @generated
	 */
	void setNameBranch(InternationalStringBranchType value);

	/**
	 * Returns the value of the '<em><b>Description Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Branch</em>' containment reference.
	 * @see #setDescriptionBranch(InternationalStringBranchType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_DescriptionBranch()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='DescriptionBranch' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalStringBranchType getDescriptionBranch();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getDescriptionBranch <em>Description Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Branch</em>' containment reference.
	 * @see #getDescriptionBranch()
	 * @generated
	 */
	void setDescriptionBranch(InternationalStringBranchType value);

	/**
	 * Returns the value of the '<em><b>Version Info Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Info Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Info Filter</em>' containment reference.
	 * @see #setVersionInfoFilter(FilterType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_VersionInfoFilter()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='VersionInfoFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getVersionInfoFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getVersionInfoFilter <em>Version Info Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Info Filter</em>' containment reference.
	 * @see #getVersionInfoFilter()
	 * @generated
	 */
	void setVersionInfoFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Classification Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_ClassificationQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ClassificationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getClassificationQuery();

	/**
	 * Returns the value of the '<em><b>External Identifier Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifier Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifier Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_ExternalIdentifierQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.ExternalIdentifierQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ExternalIdentifierQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getExternalIdentifierQuery();

	/**
	 * Returns the value of the '<em><b>Object Type Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Query</em>' containment reference.
	 * @see #setObjectTypeQuery(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_ObjectTypeQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ObjectTypeQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getObjectTypeQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getObjectTypeQuery <em>Object Type Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type Query</em>' containment reference.
	 * @see #getObjectTypeQuery()
	 * @generated
	 */
	void setObjectTypeQuery(ClassificationNodeQueryType value);

	/**
	 * Returns the value of the '<em><b>Status Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Query</em>' containment reference.
	 * @see #setStatusQuery(ClassificationNodeQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_StatusQuery()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='StatusQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationNodeQueryType getStatusQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.RegistryObjectQueryType#getStatusQuery <em>Status Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Query</em>' containment reference.
	 * @see #getStatusQuery()
	 * @generated
	 */
	void setStatusQuery(ClassificationNodeQueryType value);

	/**
	 * Returns the value of the '<em><b>Source Association Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Association Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Association Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_SourceAssociationQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SourceAssociationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSourceAssociationQuery();

	/**
	 * Returns the value of the '<em><b>Target Association Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Association Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Association Query</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getRegistryObjectQueryType_TargetAssociationQuery()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.AssociationQueryType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='TargetAssociationQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTargetAssociationQuery();

} // RegistryObjectQueryType
