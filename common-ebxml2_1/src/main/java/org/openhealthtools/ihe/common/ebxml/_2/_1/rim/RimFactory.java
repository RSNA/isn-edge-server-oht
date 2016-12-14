/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimFactory.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage
 * @generated
 */
public interface RimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RimFactory eINSTANCE = org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.RimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Association Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Type1</em>'.
	 * @generated
	 */
	AssociationType1 createAssociationType1();

	/**
	 * Returns a new object of class '<em>Auditable Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auditable Event Type</em>'.
	 * @generated
	 */
	AuditableEventType createAuditableEventType();

	/**
	 * Returns a new object of class '<em>Classification Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification Node Type</em>'.
	 * @generated
	 */
	ClassificationNodeType createClassificationNodeType();

	/**
	 * Returns a new object of class '<em>Classification Scheme Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification Scheme Type</em>'.
	 * @generated
	 */
	ClassificationSchemeType createClassificationSchemeType();

	/**
	 * Returns a new object of class '<em>Classification Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification Type</em>'.
	 * @generated
	 */
	ClassificationType createClassificationType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Email Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Address Type</em>'.
	 * @generated
	 */
	EmailAddressType createEmailAddressType();

	/**
	 * Returns a new object of class '<em>External Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Identifier Type</em>'.
	 * @generated
	 */
	ExternalIdentifierType createExternalIdentifierType();

	/**
	 * Returns a new object of class '<em>External Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Link Type</em>'.
	 * @generated
	 */
	ExternalLinkType createExternalLinkType();

	/**
	 * Returns a new object of class '<em>Extrinsic Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extrinsic Object Type</em>'.
	 * @generated
	 */
	ExtrinsicObjectType createExtrinsicObjectType();

	/**
	 * Returns a new object of class '<em>International String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>International String Type</em>'.
	 * @generated
	 */
	InternationalStringType createInternationalStringType();

	/**
	 * Returns a new object of class '<em>Leaf Registry Object List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Registry Object List Type</em>'.
	 * @generated
	 */
	LeafRegistryObjectListType createLeafRegistryObjectListType();

	/**
	 * Returns a new object of class '<em>Localized String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localized String Type</em>'.
	 * @generated
	 */
	LocalizedStringType createLocalizedStringType();

	/**
	 * Returns a new object of class '<em>Object Ref List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Ref List Type</em>'.
	 * @generated
	 */
	ObjectRefListType createObjectRefListType();

	/**
	 * Returns a new object of class '<em>Object Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Ref Type</em>'.
	 * @generated
	 */
	ObjectRefType createObjectRefType();

	/**
	 * Returns a new object of class '<em>Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Type</em>'.
	 * @generated
	 */
	OrganizationType createOrganizationType();

	/**
	 * Returns a new object of class '<em>Person Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Name Type</em>'.
	 * @generated
	 */
	PersonNameType createPersonNameType();

	/**
	 * Returns a new object of class '<em>Postal Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postal Address Type</em>'.
	 * @generated
	 */
	PostalAddressType createPostalAddressType();

	/**
	 * Returns a new object of class '<em>Registry Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Entry Type</em>'.
	 * @generated
	 */
	RegistryEntryType createRegistryEntryType();

	/**
	 * Returns a new object of class '<em>Registry Object List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Object List Type</em>'.
	 * @generated
	 */
	RegistryObjectListType createRegistryObjectListType();

	/**
	 * Returns a new object of class '<em>Registry Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Object Type</em>'.
	 * @generated
	 */
	RegistryObjectType createRegistryObjectType();

	/**
	 * Returns a new object of class '<em>Registry Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Package Type</em>'.
	 * @generated
	 */
	RegistryPackageType createRegistryPackageType();

	/**
	 * Returns a new object of class '<em>Service Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Binding Type</em>'.
	 * @generated
	 */
	ServiceBindingType createServiceBindingType();

	/**
	 * Returns a new object of class '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Type</em>'.
	 * @generated
	 */
	ServiceType createServiceType();

	/**
	 * Returns a new object of class '<em>Slot Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Type1</em>'.
	 * @generated
	 */
	SlotType1 createSlotType1();

	/**
	 * Returns a new object of class '<em>Specification Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Link Type</em>'.
	 * @generated
	 */
	SpecificationLinkType createSpecificationLinkType();

	/**
	 * Returns a new object of class '<em>Telephone Number List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telephone Number List Type</em>'.
	 * @generated
	 */
	TelephoneNumberListType createTelephoneNumberListType();

	/**
	 * Returns a new object of class '<em>Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telephone Number Type</em>'.
	 * @generated
	 */
	TelephoneNumberType createTelephoneNumberType();

	/**
	 * Returns a new object of class '<em>User Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Type</em>'.
	 * @generated
	 */
	UserType createUserType();

	/**
	 * Returns a new object of class '<em>Value List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value List Type</em>'.
	 * @generated
	 */
	ValueListType createValueListType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RimPackage getRimPackage();

} //RimFactory
