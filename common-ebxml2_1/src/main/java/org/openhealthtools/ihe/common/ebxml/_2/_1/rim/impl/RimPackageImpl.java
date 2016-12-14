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
 * $Id: RimPackageImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


import org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.EventTypeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.NodeTypeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimFactory;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.util.RimValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RimPackageImpl extends EPackageImpl implements RimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditableEventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationSchemeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extrinsicObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafRegistryObjectListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRefListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryObjectListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryPackageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType freeFormTextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stabilityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType string16EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType string32EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType string4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType string8EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RimPackageImpl() {
		super(eNS_URI, RimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RimPackage init() {
		if (isInited) return (RimPackage)EPackage.Registry.INSTANCE.getEPackage(RimPackage.eNS_URI);

		// Obtain or create and register package
		RimPackageImpl theRimPackage = (RimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RimPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRimPackage.createPackageContents();

		// Initialize created meta-data
		theRimPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRimPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RimValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRimPackage.freeze();

		return theRimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationType1() {
		return associationType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationType1_AssociationType() {
		return (EAttribute)associationType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationType1_IsConfirmedBySourceOwner() {
		return (EAttribute)associationType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationType1_IsConfirmedByTargetOwner() {
		return (EAttribute)associationType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationType1_SourceObject() {
		return (EAttribute)associationType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationType1_TargetObject() {
		return (EAttribute)associationType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditableEventType() {
		return auditableEventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_EventType() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_RegistryObject() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_Timestamp() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_User() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationNodeType() {
		return classificationNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationNodeType_ClassificationNode() {
		return (EReference)classificationNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationNodeType_Code() {
		return (EAttribute)classificationNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationNodeType_Parent() {
		return (EAttribute)classificationNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationNodeType_Path() {
		return (EAttribute)classificationNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationSchemeType() {
		return classificationSchemeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationSchemeType_ClassificationNode() {
		return (EReference)classificationSchemeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationSchemeType_IsInternal() {
		return (EAttribute)classificationSchemeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationSchemeType_NodeType() {
		return (EAttribute)classificationSchemeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationType() {
		return classificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationType_ClassificationNode() {
		return (EAttribute)classificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationType_ClassificationScheme() {
		return (EAttribute)classificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationType_ClassifiedObject() {
		return (EAttribute)classificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationType_NodeRepresentation() {
		return (EAttribute)classificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Association() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditableEvent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Classification() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNode() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationScheme() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmailAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalIdentifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalLink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtrinsicObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FaxNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InternationalString() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LeafRegistryObjectList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalizedString() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MobileTelephoneNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Name() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectRef() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectRefList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Organization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PagerNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PostalAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObjectList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryPackage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Service() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Slot() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpecificationLink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsageDescription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UsageParameter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_User() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailAddressType() {
		return emailAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_Group() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmailAddressType_Slot() {
		return (EReference)emailAddressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_Address() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_Type() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalIdentifierType() {
		return externalIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifierType_IdentificationScheme() {
		return (EAttribute)externalIdentifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifierType_RegistryObject() {
		return (EAttribute)externalIdentifierTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifierType_Value() {
		return (EAttribute)externalIdentifierTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalLinkType() {
		return externalLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalLinkType_ExternalURI() {
		return (EAttribute)externalLinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtrinsicObjectType() {
		return extrinsicObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrinsicObjectType_IsOpaque() {
		return (EAttribute)extrinsicObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrinsicObjectType_MimeType() {
		return (EAttribute)extrinsicObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternationalStringType() {
		return internationalStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternationalStringType_Group() {
		return (EAttribute)internationalStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalStringType_LocalizedString() {
		return (EReference)internationalStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafRegistryObjectListType() {
		return leafRegistryObjectListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeafRegistryObjectListType_Group() {
		return (EAttribute)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_ObjectRef() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_Association() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_AuditableEvent() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_Classification() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_ClassificationNode() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_ClassificationScheme() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_ExternalIdentifier() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_ExternalLink() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_ExtrinsicObject() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_Organization() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_RegistryPackage() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_Service() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_ServiceBinding() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_SpecificationLink() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeafRegistryObjectListType_User() {
		return (EReference)leafRegistryObjectListTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizedStringType() {
		return localizedStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedStringType_Charset() {
		return (EAttribute)localizedStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedStringType_Lang() {
		return (EAttribute)localizedStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedStringType_Value() {
		return (EAttribute)localizedStringTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRefListType() {
		return objectRefListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectRefListType_Group() {
		return (EAttribute)objectRefListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectRefListType_ObjectRef() {
		return (EReference)objectRefListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRefType() {
		return objectRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectRefType_Id() {
		return (EAttribute)objectRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationType() {
		return organizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_Address() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_TelephoneNumber() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_Parent() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_PrimaryContact() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonNameType() {
		return personNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_Group() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_Slot() {
		return (EReference)personNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_FirstName() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_LastName() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_MiddleName() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalAddressType() {
		return postalAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_Group() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalAddressType_Slot() {
		return (EReference)postalAddressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_City() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_Country() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_PostalCode() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_StateOrProvince() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_Street() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_StreetNumber() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryEntryType() {
		return registryEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntryType_Expiration() {
		return (EAttribute)registryEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntryType_MajorVersion() {
		return (EAttribute)registryEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntryType_MinorVersion() {
		return (EAttribute)registryEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntryType_Stability() {
		return (EAttribute)registryEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntryType_Status() {
		return (EAttribute)registryEntryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntryType_UserVersion() {
		return (EAttribute)registryEntryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryObjectListType() {
		return registryObjectListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryObjectListType_Group1() {
		return (EAttribute)registryObjectListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectListType_RegistryEntry() {
		return (EReference)registryObjectListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectListType_RegistryObject() {
		return (EReference)registryObjectListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryObjectType() {
		return registryObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectType_Name() {
		return (EReference)registryObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectType_Description() {
		return (EReference)registryObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectType_Slot() {
		return (EReference)registryObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectType_Classification() {
		return (EReference)registryObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectType_ExternalIdentifier() {
		return (EReference)registryObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryObjectType_AccessControlPolicy() {
		return (EAttribute)registryObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryObjectType_Id() {
		return (EAttribute)registryObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryObjectType_ObjectType() {
		return (EAttribute)registryObjectTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryPackageType() {
		return registryPackageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryPackageType_RegistryObjectList() {
		return (EReference)registryPackageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBindingType() {
		return serviceBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingType_SpecificationLink() {
		return (EReference)serviceBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBindingType_AccessURI() {
		return (EAttribute)serviceBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBindingType_Service() {
		return (EAttribute)serviceBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBindingType_TargetBinding() {
		return (EAttribute)serviceBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_ServiceBinding() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotType1() {
		return slotType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotType1_ValueList() {
		return (EReference)slotType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType1_Name() {
		return (EAttribute)slotType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType1_SlotType() {
		return (EAttribute)slotType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationLinkType() {
		return specificationLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationLinkType_UsageDescription() {
		return (EReference)specificationLinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationLinkType_UsageParameter() {
		return (EAttribute)specificationLinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationLinkType_SpecificationObject() {
		return (EAttribute)specificationLinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelephoneNumberListType() {
		return telephoneNumberListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelephoneNumberListType_TelephoneNumber() {
		return (EReference)telephoneNumberListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelephoneNumberType() {
		return telephoneNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_AreaCode() {
		return (EAttribute)telephoneNumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_CountryCode() {
		return (EAttribute)telephoneNumberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_Extension() {
		return (EAttribute)telephoneNumberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_Number() {
		return (EAttribute)telephoneNumberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_PhoneType() {
		return (EAttribute)telephoneNumberTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_Url() {
		return (EAttribute)telephoneNumberTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserType() {
		return userTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserType_Address() {
		return (EReference)userTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserType_PersonName() {
		return (EReference)userTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserType_TelephoneNumber() {
		return (EReference)userTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserType_EmailAddress() {
		return (EReference)userTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserType_Organization() {
		return (EAttribute)userTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserType_Url() {
		return (EAttribute)userTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueListType() {
		return valueListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueListType_Group() {
		return (EAttribute)valueListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueListType_Value() {
		return (EAttribute)valueListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventTypeType() {
		return eventTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeTypeType() {
		return nodeTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStabilityType() {
		return stabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventTypeTypeObject() {
		return eventTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFreeFormText() {
		return freeFormTextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongName() {
		return longNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeTypeTypeObject() {
		return nodeTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShortName() {
		return shortNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStabilityTypeObject() {
		return stabilityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatusTypeObject() {
		return statusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString16() {
		return string16EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString32() {
		return string32EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString4() {
		return string4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString8() {
		return string8EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RimFactory getRimFactory() {
		return (RimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		associationType1EClass = createEClass(ASSOCIATION_TYPE1);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__ASSOCIATION_TYPE);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__IS_CONFIRMED_BY_SOURCE_OWNER);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__IS_CONFIRMED_BY_TARGET_OWNER);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__SOURCE_OBJECT);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__TARGET_OBJECT);

		auditableEventTypeEClass = createEClass(AUDITABLE_EVENT_TYPE);
		createEAttribute(auditableEventTypeEClass, AUDITABLE_EVENT_TYPE__EVENT_TYPE);
		createEAttribute(auditableEventTypeEClass, AUDITABLE_EVENT_TYPE__REGISTRY_OBJECT);
		createEAttribute(auditableEventTypeEClass, AUDITABLE_EVENT_TYPE__TIMESTAMP);
		createEAttribute(auditableEventTypeEClass, AUDITABLE_EVENT_TYPE__USER);

		classificationNodeTypeEClass = createEClass(CLASSIFICATION_NODE_TYPE);
		createEReference(classificationNodeTypeEClass, CLASSIFICATION_NODE_TYPE__CLASSIFICATION_NODE);
		createEAttribute(classificationNodeTypeEClass, CLASSIFICATION_NODE_TYPE__CODE);
		createEAttribute(classificationNodeTypeEClass, CLASSIFICATION_NODE_TYPE__PARENT);
		createEAttribute(classificationNodeTypeEClass, CLASSIFICATION_NODE_TYPE__PATH);

		classificationSchemeTypeEClass = createEClass(CLASSIFICATION_SCHEME_TYPE);
		createEReference(classificationSchemeTypeEClass, CLASSIFICATION_SCHEME_TYPE__CLASSIFICATION_NODE);
		createEAttribute(classificationSchemeTypeEClass, CLASSIFICATION_SCHEME_TYPE__IS_INTERNAL);
		createEAttribute(classificationSchemeTypeEClass, CLASSIFICATION_SCHEME_TYPE__NODE_TYPE);

		classificationTypeEClass = createEClass(CLASSIFICATION_TYPE);
		createEAttribute(classificationTypeEClass, CLASSIFICATION_TYPE__CLASSIFICATION_NODE);
		createEAttribute(classificationTypeEClass, CLASSIFICATION_TYPE__CLASSIFICATION_SCHEME);
		createEAttribute(classificationTypeEClass, CLASSIFICATION_TYPE__CLASSIFIED_OBJECT);
		createEAttribute(classificationTypeEClass, CLASSIFICATION_TYPE__NODE_REPRESENTATION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDITABLE_EVENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_NODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFICATION_SCHEME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMAIL_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_IDENTIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_LINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRINSIC_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FAX_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERNATIONAL_STRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCALIZED_STRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_REF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_REF_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PAGER_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSON_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POSTAL_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_PACKAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SLOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIFICATION_LINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TELEPHONE_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USAGE_DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USAGE_PARAMETER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_LIST);

		emailAddressTypeEClass = createEClass(EMAIL_ADDRESS_TYPE);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__GROUP);
		createEReference(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__SLOT);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__ADDRESS);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__TYPE);

		externalIdentifierTypeEClass = createEClass(EXTERNAL_IDENTIFIER_TYPE);
		createEAttribute(externalIdentifierTypeEClass, EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME);
		createEAttribute(externalIdentifierTypeEClass, EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT);
		createEAttribute(externalIdentifierTypeEClass, EXTERNAL_IDENTIFIER_TYPE__VALUE);

		externalLinkTypeEClass = createEClass(EXTERNAL_LINK_TYPE);
		createEAttribute(externalLinkTypeEClass, EXTERNAL_LINK_TYPE__EXTERNAL_URI);

		extrinsicObjectTypeEClass = createEClass(EXTRINSIC_OBJECT_TYPE);
		createEAttribute(extrinsicObjectTypeEClass, EXTRINSIC_OBJECT_TYPE__IS_OPAQUE);
		createEAttribute(extrinsicObjectTypeEClass, EXTRINSIC_OBJECT_TYPE__MIME_TYPE);

		internationalStringTypeEClass = createEClass(INTERNATIONAL_STRING_TYPE);
		createEAttribute(internationalStringTypeEClass, INTERNATIONAL_STRING_TYPE__GROUP);
		createEReference(internationalStringTypeEClass, INTERNATIONAL_STRING_TYPE__LOCALIZED_STRING);

		leafRegistryObjectListTypeEClass = createEClass(LEAF_REGISTRY_OBJECT_LIST_TYPE);
		createEAttribute(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__GROUP);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__OBJECT_REF);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__ASSOCIATION);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__AUDITABLE_EVENT);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_NODE);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__CLASSIFICATION_SCHEME);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_IDENTIFIER);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTERNAL_LINK);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__EXTRINSIC_OBJECT);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__ORGANIZATION);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__REGISTRY_PACKAGE);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__SERVICE_BINDING);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__SPECIFICATION_LINK);
		createEReference(leafRegistryObjectListTypeEClass, LEAF_REGISTRY_OBJECT_LIST_TYPE__USER);

		localizedStringTypeEClass = createEClass(LOCALIZED_STRING_TYPE);
		createEAttribute(localizedStringTypeEClass, LOCALIZED_STRING_TYPE__CHARSET);
		createEAttribute(localizedStringTypeEClass, LOCALIZED_STRING_TYPE__LANG);
		createEAttribute(localizedStringTypeEClass, LOCALIZED_STRING_TYPE__VALUE);

		objectRefListTypeEClass = createEClass(OBJECT_REF_LIST_TYPE);
		createEAttribute(objectRefListTypeEClass, OBJECT_REF_LIST_TYPE__GROUP);
		createEReference(objectRefListTypeEClass, OBJECT_REF_LIST_TYPE__OBJECT_REF);

		objectRefTypeEClass = createEClass(OBJECT_REF_TYPE);
		createEAttribute(objectRefTypeEClass, OBJECT_REF_TYPE__ID);

		organizationTypeEClass = createEClass(ORGANIZATION_TYPE);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__ADDRESS);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__TELEPHONE_NUMBER);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__PARENT);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__PRIMARY_CONTACT);

		personNameTypeEClass = createEClass(PERSON_NAME_TYPE);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__GROUP);
		createEReference(personNameTypeEClass, PERSON_NAME_TYPE__SLOT);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__FIRST_NAME);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__LAST_NAME);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__MIDDLE_NAME);

		postalAddressTypeEClass = createEClass(POSTAL_ADDRESS_TYPE);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__GROUP);
		createEReference(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__SLOT);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__CITY);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__COUNTRY);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__POSTAL_CODE);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__STATE_OR_PROVINCE);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__STREET);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__STREET_NUMBER);

		registryEntryTypeEClass = createEClass(REGISTRY_ENTRY_TYPE);
		createEAttribute(registryEntryTypeEClass, REGISTRY_ENTRY_TYPE__EXPIRATION);
		createEAttribute(registryEntryTypeEClass, REGISTRY_ENTRY_TYPE__MAJOR_VERSION);
		createEAttribute(registryEntryTypeEClass, REGISTRY_ENTRY_TYPE__MINOR_VERSION);
		createEAttribute(registryEntryTypeEClass, REGISTRY_ENTRY_TYPE__STABILITY);
		createEAttribute(registryEntryTypeEClass, REGISTRY_ENTRY_TYPE__STATUS);
		createEAttribute(registryEntryTypeEClass, REGISTRY_ENTRY_TYPE__USER_VERSION);

		registryObjectListTypeEClass = createEClass(REGISTRY_OBJECT_LIST_TYPE);
		createEAttribute(registryObjectListTypeEClass, REGISTRY_OBJECT_LIST_TYPE__GROUP1);
		createEReference(registryObjectListTypeEClass, REGISTRY_OBJECT_LIST_TYPE__REGISTRY_ENTRY);
		createEReference(registryObjectListTypeEClass, REGISTRY_OBJECT_LIST_TYPE__REGISTRY_OBJECT);

		registryObjectTypeEClass = createEClass(REGISTRY_OBJECT_TYPE);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__NAME);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__DESCRIPTION);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__SLOT);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__CLASSIFICATION);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER);
		createEAttribute(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__ACCESS_CONTROL_POLICY);
		createEAttribute(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__ID);
		createEAttribute(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__OBJECT_TYPE);

		registryPackageTypeEClass = createEClass(REGISTRY_PACKAGE_TYPE);
		createEReference(registryPackageTypeEClass, REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST);

		serviceBindingTypeEClass = createEClass(SERVICE_BINDING_TYPE);
		createEReference(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__SPECIFICATION_LINK);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__ACCESS_URI);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__SERVICE);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__TARGET_BINDING);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEReference(serviceTypeEClass, SERVICE_TYPE__SERVICE_BINDING);

		slotType1EClass = createEClass(SLOT_TYPE1);
		createEReference(slotType1EClass, SLOT_TYPE1__VALUE_LIST);
		createEAttribute(slotType1EClass, SLOT_TYPE1__NAME);
		createEAttribute(slotType1EClass, SLOT_TYPE1__SLOT_TYPE);

		specificationLinkTypeEClass = createEClass(SPECIFICATION_LINK_TYPE);
		createEReference(specificationLinkTypeEClass, SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION);
		createEAttribute(specificationLinkTypeEClass, SPECIFICATION_LINK_TYPE__USAGE_PARAMETER);
		createEAttribute(specificationLinkTypeEClass, SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT);

		telephoneNumberListTypeEClass = createEClass(TELEPHONE_NUMBER_LIST_TYPE);
		createEReference(telephoneNumberListTypeEClass, TELEPHONE_NUMBER_LIST_TYPE__TELEPHONE_NUMBER);

		telephoneNumberTypeEClass = createEClass(TELEPHONE_NUMBER_TYPE);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__AREA_CODE);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__COUNTRY_CODE);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__EXTENSION);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__NUMBER);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__PHONE_TYPE);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__URL);

		userTypeEClass = createEClass(USER_TYPE);
		createEReference(userTypeEClass, USER_TYPE__ADDRESS);
		createEReference(userTypeEClass, USER_TYPE__PERSON_NAME);
		createEReference(userTypeEClass, USER_TYPE__TELEPHONE_NUMBER);
		createEReference(userTypeEClass, USER_TYPE__EMAIL_ADDRESS);
		createEAttribute(userTypeEClass, USER_TYPE__ORGANIZATION);
		createEAttribute(userTypeEClass, USER_TYPE__URL);

		valueListTypeEClass = createEClass(VALUE_LIST_TYPE);
		createEAttribute(valueListTypeEClass, VALUE_LIST_TYPE__GROUP);
		createEAttribute(valueListTypeEClass, VALUE_LIST_TYPE__VALUE);

		// Create enums
		eventTypeTypeEEnum = createEEnum(EVENT_TYPE_TYPE);
		nodeTypeTypeEEnum = createEEnum(NODE_TYPE_TYPE);
		stabilityTypeEEnum = createEEnum(STABILITY_TYPE);
		statusTypeEEnum = createEEnum(STATUS_TYPE);

		// Create data types
		eventTypeTypeObjectEDataType = createEDataType(EVENT_TYPE_TYPE_OBJECT);
		freeFormTextEDataType = createEDataType(FREE_FORM_TEXT);
		longNameEDataType = createEDataType(LONG_NAME);
		nodeTypeTypeObjectEDataType = createEDataType(NODE_TYPE_TYPE_OBJECT);
		shortNameEDataType = createEDataType(SHORT_NAME);
		stabilityTypeObjectEDataType = createEDataType(STABILITY_TYPE_OBJECT);
		statusTypeObjectEDataType = createEDataType(STATUS_TYPE_OBJECT);
		string16EDataType = createEDataType(STRING16);
		string32EDataType = createEDataType(STRING32);
		string4EDataType = createEDataType(STRING4);
		string8EDataType = createEDataType(STRING8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Add supertypes to classes
		associationType1EClass.getESuperTypes().add(this.getRegistryObjectType());
		auditableEventTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		classificationNodeTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		classificationSchemeTypeEClass.getESuperTypes().add(this.getRegistryEntryType());
		classificationTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		externalIdentifierTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		externalLinkTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		extrinsicObjectTypeEClass.getESuperTypes().add(this.getRegistryEntryType());
		organizationTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		registryEntryTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		registryObjectListTypeEClass.getESuperTypes().add(this.getLeafRegistryObjectListType());
		registryPackageTypeEClass.getESuperTypes().add(this.getRegistryEntryType());
		serviceBindingTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		serviceTypeEClass.getESuperTypes().add(this.getRegistryEntryType());
		specificationLinkTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		userTypeEClass.getESuperTypes().add(this.getRegistryObjectType());

		// Initialize classes and features; add operations and parameters
		initEClass(associationType1EClass, AssociationType1.class, "AssociationType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationType1_AssociationType(), this.getLongName(), "associationType", null, 1, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationType1_IsConfirmedBySourceOwner(), theXMLTypePackage.getBoolean(), "isConfirmedBySourceOwner", null, 0, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationType1_IsConfirmedByTargetOwner(), theXMLTypePackage.getBoolean(), "isConfirmedByTargetOwner", null, 0, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationType1_SourceObject(), theXMLTypePackage.getAnyURI(), "sourceObject", null, 1, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationType1_TargetObject(), theXMLTypePackage.getAnyURI(), "targetObject", null, 1, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableEventTypeEClass, AuditableEventType.class, "AuditableEventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuditableEventType_EventType(), this.getEventTypeType(), "eventType", "Created", 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditableEventType_RegistryObject(), theXMLTypePackage.getAnyURI(), "registryObject", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditableEventType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditableEventType_User(), theXMLTypePackage.getAnyURI(), "user", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationNodeTypeEClass, ClassificationNodeType.class, "ClassificationNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationNodeType_ClassificationNode(), this.getClassificationNodeType(), null, "classificationNode", null, 0, -1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationNodeType_Code(), this.getShortName(), "code", null, 0, 1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationNodeType_Parent(), theXMLTypePackage.getAnyURI(), "parent", null, 0, 1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationNodeType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationSchemeTypeEClass, ClassificationSchemeType.class, "ClassificationSchemeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationSchemeType_ClassificationNode(), this.getClassificationNodeType(), null, "classificationNode", null, 0, -1, ClassificationSchemeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationSchemeType_IsInternal(), theXMLTypePackage.getBoolean(), "isInternal", null, 1, 1, ClassificationSchemeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationSchemeType_NodeType(), this.getNodeTypeType(), "nodeType", "UniqueCode", 1, 1, ClassificationSchemeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationTypeEClass, ClassificationType.class, "ClassificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationType_ClassificationNode(), theXMLTypePackage.getAnyURI(), "classificationNode", null, 0, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationType_ClassificationScheme(), theXMLTypePackage.getAnyURI(), "classificationScheme", null, 0, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationType_ClassifiedObject(), theXMLTypePackage.getAnyURI(), "classifiedObject", null, 1, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationType_NodeRepresentation(), this.getLongName(), "nodeRepresentation", null, 0, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getPostalAddressType(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Association(), this.getAssociationType1(), null, "association", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuditableEvent(), this.getAuditableEventType(), null, "auditableEvent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Classification(), this.getClassificationType(), null, "classification", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationNode(), this.getClassificationNodeType(), null, "classificationNode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassificationScheme(), this.getClassificationSchemeType(), null, "classificationScheme", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), this.getInternationalStringType(), null, "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EmailAddress(), this.getEmailAddressType(), null, "emailAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalIdentifier(), this.getExternalIdentifierType(), null, "externalIdentifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalLink(), this.getExternalLinkType(), null, "externalLink", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtrinsicObject(), this.getExtrinsicObjectType(), null, "extrinsicObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FaxNumber(), this.getTelephoneNumberType(), null, "faxNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InternationalString(), this.getInternationalStringType(), null, "internationalString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LeafRegistryObjectList(), this.getLeafRegistryObjectListType(), null, "leafRegistryObjectList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocalizedString(), this.getLocalizedStringType(), null, "localizedString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MobileTelephoneNumber(), this.getTelephoneNumberType(), null, "mobileTelephoneNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Name(), this.getInternationalStringType(), null, "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectRef(), this.getObjectRefType(), null, "objectRef", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectRefList(), this.getObjectRefListType(), null, "objectRefList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Organization(), this.getOrganizationType(), null, "organization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PagerNumber(), this.getTelephoneNumberType(), null, "pagerNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PersonName(), this.getPersonNameType(), null, "personName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PostalAddress(), this.getPostalAddressType(), null, "postalAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryEntry(), this.getRegistryEntryType(), null, "registryEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObject(), this.getRegistryObjectType(), null, "registryObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObjectList(), this.getRegistryObjectListType(), null, "registryObjectList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryPackage(), this.getRegistryPackageType(), null, "registryPackage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Service(), this.getServiceType(), null, "service", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceBinding(), this.getServiceBindingType(), null, "serviceBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Slot(), this.getSlotType1(), null, "slot", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpecificationLink(), this.getSpecificationLinkType(), null, "specificationLink", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UsageDescription(), this.getInternationalStringType(), null, "usageDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UsageParameter(), this.getFreeFormText(), "usageParameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_User(), this.getUserType(), null, "user", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Value(), this.getLongName(), "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValueList(), this.getValueListType(), null, "valueList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emailAddressTypeEClass, EmailAddressType.class, "EmailAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailAddressType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmailAddressType_Slot(), this.getSlotType1(), null, "slot", null, 0, -1, EmailAddressType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressType_Address(), this.getShortName(), "address", null, 1, 1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressType_Type(), this.getString32(), "type", null, 0, 1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalIdentifierTypeEClass, ExternalIdentifierType.class, "ExternalIdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalIdentifierType_IdentificationScheme(), theXMLTypePackage.getAnyURI(), "identificationScheme", null, 1, 1, ExternalIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalIdentifierType_RegistryObject(), theXMLTypePackage.getAnyURI(), "registryObject", null, 0, 1, ExternalIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalIdentifierType_Value(), this.getShortName(), "value", null, 1, 1, ExternalIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalLinkTypeEClass, ExternalLinkType.class, "ExternalLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalLinkType_ExternalURI(), theXMLTypePackage.getAnyURI(), "externalURI", null, 1, 1, ExternalLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extrinsicObjectTypeEClass, ExtrinsicObjectType.class, "ExtrinsicObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtrinsicObjectType_IsOpaque(), theXMLTypePackage.getBoolean(), "isOpaque", null, 0, 1, ExtrinsicObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrinsicObjectType_MimeType(), this.getLongName(), "mimeType", null, 0, 1, ExtrinsicObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internationalStringTypeEClass, InternationalStringType.class, "InternationalStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternationalStringType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, InternationalStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternationalStringType_LocalizedString(), this.getLocalizedStringType(), null, "localizedString", null, 0, -1, InternationalStringType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(leafRegistryObjectListTypeEClass, LeafRegistryObjectListType.class, "LeafRegistryObjectListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeafRegistryObjectListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LeafRegistryObjectListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_ObjectRef(), this.getObjectRefType(), null, "objectRef", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_Association(), this.getAssociationType1(), null, "association", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_AuditableEvent(), this.getAuditableEventType(), null, "auditableEvent", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_Classification(), this.getClassificationType(), null, "classification", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_ClassificationNode(), this.getClassificationNodeType(), null, "classificationNode", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_ClassificationScheme(), this.getClassificationSchemeType(), null, "classificationScheme", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_ExternalIdentifier(), this.getExternalIdentifierType(), null, "externalIdentifier", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_ExternalLink(), this.getExternalLinkType(), null, "externalLink", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_ExtrinsicObject(), this.getExtrinsicObjectType(), null, "extrinsicObject", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_Organization(), this.getOrganizationType(), null, "organization", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_RegistryPackage(), this.getRegistryPackageType(), null, "registryPackage", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_Service(), this.getServiceType(), null, "service", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_ServiceBinding(), this.getServiceBindingType(), null, "serviceBinding", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_SpecificationLink(), this.getSpecificationLinkType(), null, "specificationLink", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLeafRegistryObjectListType_User(), this.getUserType(), null, "user", null, 0, -1, LeafRegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(localizedStringTypeEClass, LocalizedStringType.class, "LocalizedStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalizedStringType_Charset(), theXMLTypePackage.getAnySimpleType(), "charset", "UTF-8", 0, 1, LocalizedStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalizedStringType_Lang(), theXMLNamespacePackage.getLangType(), "lang", "en-us", 0, 1, LocalizedStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalizedStringType_Value(), this.getFreeFormText(), "value", null, 1, 1, LocalizedStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRefListTypeEClass, ObjectRefListType.class, "ObjectRefListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectRefListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ObjectRefListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectRefListType_ObjectRef(), this.getObjectRefType(), null, "objectRef", null, 0, -1, ObjectRefListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(objectRefTypeEClass, ObjectRefType.class, "ObjectRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectRefType_Id(), theXMLTypePackage.getAnyURI(), "id", null, 0, 1, ObjectRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationTypeEClass, OrganizationType.class, "OrganizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationType_Address(), this.getPostalAddressType(), null, "address", null, 1, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 1, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_Parent(), theXMLTypePackage.getAnyURI(), "parent", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_PrimaryContact(), theXMLTypePackage.getAnyURI(), "primaryContact", null, 1, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personNameTypeEClass, PersonNameType.class, "PersonNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonNameType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonNameType_Slot(), this.getSlotType1(), null, "slot", null, 0, -1, PersonNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameType_FirstName(), this.getShortName(), "firstName", null, 0, 1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameType_LastName(), this.getShortName(), "lastName", null, 0, 1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameType_MiddleName(), this.getShortName(), "middleName", null, 0, 1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalAddressTypeEClass, PostalAddressType.class, "PostalAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostalAddressType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostalAddressType_Slot(), this.getSlotType1(), null, "slot", null, 0, -1, PostalAddressType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_City(), this.getShortName(), "city", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_Country(), this.getShortName(), "country", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_PostalCode(), this.getShortName(), "postalCode", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_StateOrProvince(), this.getShortName(), "stateOrProvince", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_Street(), this.getShortName(), "street", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_StreetNumber(), this.getString32(), "streetNumber", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryEntryTypeEClass, RegistryEntryType.class, "RegistryEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryEntryType_Expiration(), theXMLTypePackage.getDateTime(), "expiration", null, 0, 1, RegistryEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryEntryType_MajorVersion(), theXMLTypePackage.getInteger(), "majorVersion", "1", 0, 1, RegistryEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryEntryType_MinorVersion(), theXMLTypePackage.getInteger(), "minorVersion", "0", 0, 1, RegistryEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryEntryType_Stability(), this.getStabilityType(), "stability", "Dynamic", 0, 1, RegistryEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryEntryType_Status(), this.getStatusType(), "status", "Submitted", 0, 1, RegistryEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryEntryType_UserVersion(), this.getShortName(), "userVersion", null, 0, 1, RegistryEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryObjectListTypeEClass, RegistryObjectListType.class, "RegistryObjectListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryObjectListType_Group1(), ecorePackage.getEFeatureMapEntry(), "group1", null, 0, -1, RegistryObjectListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectListType_RegistryEntry(), this.getRegistryEntryType(), null, "registryEntry", null, 0, -1, RegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectListType_RegistryObject(), this.getRegistryObjectType(), null, "registryObject", null, 0, -1, RegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(registryObjectTypeEClass, RegistryObjectType.class, "RegistryObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryObjectType_Name(), this.getInternationalStringType(), null, "name", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_Description(), this.getInternationalStringType(), null, "description", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_Slot(), this.getSlotType1(), null, "slot", null, 0, -1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_Classification(), this.getClassificationType(), null, "classification", null, 0, -1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_ExternalIdentifier(), this.getExternalIdentifierType(), null, "externalIdentifier", null, 0, -1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryObjectType_AccessControlPolicy(), theXMLTypePackage.getAnyURI(), "accessControlPolicy", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryObjectType_Id(), theXMLTypePackage.getAnyURI(), "id", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryObjectType_ObjectType(), this.getLongName(), "objectType", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryPackageTypeEClass, RegistryPackageType.class, "RegistryPackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryPackageType_RegistryObjectList(), this.getRegistryObjectListType(), null, "registryObjectList", null, 0, 1, RegistryPackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBindingTypeEClass, ServiceBindingType.class, "ServiceBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBindingType_SpecificationLink(), this.getSpecificationLinkType(), null, "specificationLink", null, 0, -1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_AccessURI(), theXMLTypePackage.getAnyURI(), "accessURI", null, 0, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_Service(), theXMLTypePackage.getAnyURI(), "service", null, 0, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_TargetBinding(), theXMLTypePackage.getAnyURI(), "targetBinding", null, 0, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceType_ServiceBinding(), this.getServiceBindingType(), null, "serviceBinding", null, 0, -1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotType1EClass, SlotType1.class, "SlotType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotType1_ValueList(), this.getValueListType(), null, "valueList", null, 1, 1, SlotType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType1_Name(), this.getLongName(), "name", null, 1, 1, SlotType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType1_SlotType(), this.getLongName(), "slotType", null, 0, 1, SlotType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationLinkTypeEClass, SpecificationLinkType.class, "SpecificationLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationLinkType_UsageDescription(), this.getInternationalStringType(), null, "usageDescription", null, 0, 1, SpecificationLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationLinkType_UsageParameter(), this.getFreeFormText(), "usageParameter", null, 0, -1, SpecificationLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationLinkType_SpecificationObject(), theXMLTypePackage.getAnyURI(), "specificationObject", null, 1, 1, SpecificationLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telephoneNumberListTypeEClass, TelephoneNumberListType.class, "TelephoneNumberListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelephoneNumberListType_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 0, -1, TelephoneNumberListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telephoneNumberTypeEClass, TelephoneNumberType.class, "TelephoneNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelephoneNumberType_AreaCode(), this.getString4(), "areaCode", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_CountryCode(), this.getString4(), "countryCode", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_Extension(), this.getString8(), "extension", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_Number(), this.getString16(), "number", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_PhoneType(), this.getString32(), "phoneType", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTypeEClass, UserType.class, "UserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserType_Address(), this.getPostalAddressType(), null, "address", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserType_PersonName(), this.getPersonNameType(), null, "personName", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserType_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 0, -1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserType_EmailAddress(), this.getEmailAddressType(), null, "emailAddress", null, 0, -1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserType_Organization(), theXMLTypePackage.getAnyURI(), "organization", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueListTypeEClass, ValueListType.class, "ValueListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ValueListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueListType_Value(), this.getLongName(), "value", null, 0, -1, ValueListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventTypeTypeEEnum, EventTypeType.class, "EventTypeType");
		addEEnumLiteral(eventTypeTypeEEnum, EventTypeType.CREATED_LITERAL);
		addEEnumLiteral(eventTypeTypeEEnum, EventTypeType.DELETED_LITERAL);
		addEEnumLiteral(eventTypeTypeEEnum, EventTypeType.DEPRECATED_LITERAL);
		addEEnumLiteral(eventTypeTypeEEnum, EventTypeType.UPDATED_LITERAL);
		addEEnumLiteral(eventTypeTypeEEnum, EventTypeType.VERSIONED_LITERAL);

		initEEnum(nodeTypeTypeEEnum, NodeTypeType.class, "NodeTypeType");
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.UNIQUE_CODE_LITERAL);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.EMBEDDED_PATH_LITERAL);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.NON_UNIQUE_CODE_LITERAL);

		initEEnum(stabilityTypeEEnum, StabilityType.class, "StabilityType");
		addEEnumLiteral(stabilityTypeEEnum, StabilityType.DYNAMIC_LITERAL);
		addEEnumLiteral(stabilityTypeEEnum, StabilityType.DYNAMIC_COMPATIBLE_LITERAL);
		addEEnumLiteral(stabilityTypeEEnum, StabilityType.STATIC_LITERAL);

		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.SUBMITTED_LITERAL);
		addEEnumLiteral(statusTypeEEnum, StatusType.APPROVED_LITERAL);
		addEEnumLiteral(statusTypeEEnum, StatusType.DEPRECATED_LITERAL);
		addEEnumLiteral(statusTypeEEnum, StatusType.WITHDRAWN_LITERAL);

		// Initialize data types
		initEDataType(eventTypeTypeObjectEDataType, EventTypeType.class, "EventTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(freeFormTextEDataType, String.class, "FreeFormText", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longNameEDataType, String.class, "LongName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeTypeTypeObjectEDataType, NodeTypeType.class, "NodeTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shortNameEDataType, String.class, "ShortName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stabilityTypeObjectEDataType, StabilityType.class, "StabilityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statusTypeObjectEDataType, StatusType.class, "StatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(string16EDataType, String.class, "String16", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(string32EDataType, String.class, "String32", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(string4EDataType, String.class, "String4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(string8EDataType, String.class, "String8", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";				
		addAnnotation
		  (associationType1EClass, 
		   source, 
		   new String[] {
			 "name", "AssociationType1",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAssociationType1_AssociationType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "associationType"
		   });		
		addAnnotation
		  (getAssociationType1_IsConfirmedBySourceOwner(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isConfirmedBySourceOwner"
		   });		
		addAnnotation
		  (getAssociationType1_IsConfirmedByTargetOwner(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isConfirmedByTargetOwner"
		   });		
		addAnnotation
		  (getAssociationType1_SourceObject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sourceObject"
		   });		
		addAnnotation
		  (getAssociationType1_TargetObject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetObject"
		   });			
		addAnnotation
		  (auditableEventTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuditableEventType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuditableEventType_EventType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventType"
		   });		
		addAnnotation
		  (getAuditableEventType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "registryObject"
		   });		
		addAnnotation
		  (getAuditableEventType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp"
		   });		
		addAnnotation
		  (getAuditableEventType_User(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user"
		   });			
		addAnnotation
		  (classificationNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationNodeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationNodeType_ClassificationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationNodeType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "code"
		   });		
		addAnnotation
		  (getClassificationNodeType_Parent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parent"
		   });		
		addAnnotation
		  (getClassificationNodeType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });			
		addAnnotation
		  (classificationSchemeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationSchemeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationSchemeType_ClassificationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassificationSchemeType_IsInternal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isInternal"
		   });		
		addAnnotation
		  (getClassificationSchemeType_NodeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nodeType"
		   });			
		addAnnotation
		  (classificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassificationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassificationType_ClassificationNode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "classificationNode"
		   });		
		addAnnotation
		  (getClassificationType_ClassificationScheme(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "classificationScheme"
		   });		
		addAnnotation
		  (getClassificationType_ClassifiedObject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "classifiedObject"
		   });		
		addAnnotation
		  (getClassificationType_NodeRepresentation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nodeRepresentation"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Association(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Association",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AuditableEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEvent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Classification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationScheme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationScheme",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EmailAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalLink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExtrinsicObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FaxNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FaxNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_InternationalString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InternationalString",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LeafRegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LeafRegistryObjectList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LocalizedString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalizedString",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MobileTelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MobileTelephoneNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ObjectRefList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRefList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Organization",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PagerNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PagerNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PostalAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryPackage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBinding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpecificationLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UsageDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UsageParameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageParameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_User(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "User",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ValueList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValueList",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (emailAddressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EmailAddressType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmailAddressType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getEmailAddressType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEmailAddressType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address"
		   });		
		addAnnotation
		  (getEmailAddressType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (eventTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "eventType_._type"
		   });		
		addAnnotation
		  (eventTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "eventType_._type:Object",
			 "baseType", "eventType_._type"
		   });			
		addAnnotation
		  (externalIdentifierTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalIdentifierType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalIdentifierType_IdentificationScheme(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "identificationScheme"
		   });		
		addAnnotation
		  (getExternalIdentifierType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "registryObject"
		   });		
		addAnnotation
		  (getExternalIdentifierType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });			
		addAnnotation
		  (externalLinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalLinkType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalLinkType_ExternalURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalURI"
		   });			
		addAnnotation
		  (extrinsicObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExtrinsicObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExtrinsicObjectType_IsOpaque(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isOpaque"
		   });		
		addAnnotation
		  (getExtrinsicObjectType_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimeType"
		   });		
		addAnnotation
		  (freeFormTextEDataType, 
		   source, 
		   new String[] {
			 "name", "FreeFormText",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "256"
		   });		
		addAnnotation
		  (internationalStringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InternationalStringType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInternationalStringType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getInternationalStringType_LocalizedString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalizedString",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (leafRegistryObjectListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LeafRegistryObjectListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_Association(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Association",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_AuditableEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEvent",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_Classification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classification",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_ClassificationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNode",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_ClassificationScheme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationScheme",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_ExternalIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifier",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_ExternalLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalLink",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_ExtrinsicObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObject",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Organization",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_RegistryPackage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryPackage",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_ServiceBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBinding",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_SpecificationLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLink",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getLeafRegistryObjectListType_User(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "User",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (localizedStringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LocalizedStringType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLocalizedStringType_Charset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charset"
		   });		
		addAnnotation
		  (getLocalizedStringType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getLocalizedStringType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (longNameEDataType, 
		   source, 
		   new String[] {
			 "name", "LongName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "128"
		   });		
		addAnnotation
		  (nodeTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "nodeType_._type"
		   });		
		addAnnotation
		  (nodeTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "nodeType_._type:Object",
			 "baseType", "nodeType_._type"
		   });		
		addAnnotation
		  (objectRefListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ObjectRefList_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getObjectRefListType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getObjectRefListType_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (objectRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ObjectRefType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getObjectRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });			
		addAnnotation
		  (organizationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganizationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrganizationType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationType_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrganizationType_Parent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parent"
		   });		
		addAnnotation
		  (getOrganizationType_PrimaryContact(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "primaryContact"
		   });			
		addAnnotation
		  (personNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonNameType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersonNameType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getPersonNameType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPersonNameType_FirstName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "firstName"
		   });		
		addAnnotation
		  (getPersonNameType_LastName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lastName"
		   });		
		addAnnotation
		  (getPersonNameType_MiddleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "middleName"
		   });			
		addAnnotation
		  (postalAddressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PostalAddressType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPostalAddressType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getPostalAddressType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPostalAddressType_City(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "city"
		   });		
		addAnnotation
		  (getPostalAddressType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country"
		   });		
		addAnnotation
		  (getPostalAddressType_PostalCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "postalCode"
		   });		
		addAnnotation
		  (getPostalAddressType_StateOrProvince(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stateOrProvince"
		   });		
		addAnnotation
		  (getPostalAddressType_Street(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "street"
		   });		
		addAnnotation
		  (getPostalAddressType_StreetNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "streetNumber"
		   });		
		addAnnotation
		  (registryEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryEntryType_Expiration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expiration"
		   });		
		addAnnotation
		  (getRegistryEntryType_MajorVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "majorVersion"
		   });		
		addAnnotation
		  (getRegistryEntryType_MinorVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minorVersion"
		   });		
		addAnnotation
		  (getRegistryEntryType_Stability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stability"
		   });		
		addAnnotation
		  (getRegistryEntryType_Status(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "status"
		   });		
		addAnnotation
		  (getRegistryEntryType_UserVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "userVersion"
		   });		
		addAnnotation
		  (registryObjectListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryObjectListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryObjectListType_Group1(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:11"
		   });		
		addAnnotation
		  (getRegistryObjectListType_RegistryEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryEntry",
			 "namespace", "##targetNamespace",
			 "group", "#group:11"
		   });		
		addAnnotation
		  (getRegistryObjectListType_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "##targetNamespace",
			 "group", "#group:11"
		   });			
		addAnnotation
		  (registryObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryObjectType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectType_Classification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectType_ExternalIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalIdentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectType_AccessControlPolicy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accessControlPolicy"
		   });		
		addAnnotation
		  (getRegistryObjectType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getRegistryObjectType_ObjectType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "objectType"
		   });			
		addAnnotation
		  (registryPackageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryPackageType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryPackageType_RegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceBindingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceBindingType_SpecificationLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceBindingType_AccessURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accessURI"
		   });		
		addAnnotation
		  (getServiceBindingType_Service(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "service"
		   });		
		addAnnotation
		  (getServiceBindingType_TargetBinding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetBinding"
		   });		
		addAnnotation
		  (serviceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceType_ServiceBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBinding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (shortNameEDataType, 
		   source, 
		   new String[] {
			 "name", "ShortName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "64"
		   });		
		addAnnotation
		  (slotType1EClass, 
		   source, 
		   new String[] {
			 "name", "SlotType1",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSlotType1_ValueList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValueList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSlotType1_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getSlotType1_SlotType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "slotType"
		   });		
		addAnnotation
		  (specificationLinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SpecificationLinkType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpecificationLinkType_UsageDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecificationLinkType_UsageParameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsageParameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecificationLinkType_SpecificationObject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specificationObject"
		   });		
		addAnnotation
		  (stabilityTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "stability_._type"
		   });		
		addAnnotation
		  (stabilityTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "stability_._type:Object",
			 "baseType", "stability_._type"
		   });		
		addAnnotation
		  (statusTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "status_._type"
		   });		
		addAnnotation
		  (statusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "status_._type:Object",
			 "baseType", "status_._type"
		   });		
		addAnnotation
		  (string16EDataType, 
		   source, 
		   new String[] {
			 "name", "String16",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "16"
		   });		
		addAnnotation
		  (string32EDataType, 
		   source, 
		   new String[] {
			 "name", "String32",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "32"
		   });		
		addAnnotation
		  (string4EDataType, 
		   source, 
		   new String[] {
			 "name", "String4",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "4"
		   });		
		addAnnotation
		  (string8EDataType, 
		   source, 
		   new String[] {
			 "name", "String8",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "8"
		   });		
		addAnnotation
		  (telephoneNumberListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TelephoneNumberListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTelephoneNumberListType_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumber",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (telephoneNumberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TelephoneNumberType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getTelephoneNumberType_AreaCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "areaCode"
		   });		
		addAnnotation
		  (getTelephoneNumberType_CountryCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "countryCode"
		   });		
		addAnnotation
		  (getTelephoneNumberType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extension"
		   });		
		addAnnotation
		  (getTelephoneNumberType_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "number"
		   });		
		addAnnotation
		  (getTelephoneNumberType_PhoneType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phoneType"
		   });		
		addAnnotation
		  (getTelephoneNumberType_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url"
		   });			
		addAnnotation
		  (userTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UserType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserType_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserType_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserType_EmailAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserType_Organization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "organization"
		   });		
		addAnnotation
		  (getUserType_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url"
		   });		
		addAnnotation
		  (valueListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ValueListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getValueListType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getValueListType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });
	}

} //RimPackageImpl
