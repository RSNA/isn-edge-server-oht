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
 * $Id: DocumentRootImpl.java,v 1.1 2006/06/27 23:18:02 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.AuditableEventType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationNodeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationSchemeType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.EmailAddressType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExternalLinkType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.LeafRegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.OrganizationType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.PersonNameType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryObjectType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceBindingType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ServiceType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.SpecificationLinkType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.TelephoneNumberType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.UserType;
import org.openhealthtools.ihe.common.ebxml._2._1.rim.ValueListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getAuditableEvent <em>Auditable Event</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getClassificationScheme <em>Classification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getExternalLink <em>External Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getExtrinsicObject <em>Extrinsic Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getFaxNumber <em>Fax Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getInternationalString <em>International String</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getLeafRegistryObjectList <em>Leaf Registry Object List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getLocalizedString <em>Localized String</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getMobileTelephoneNumber <em>Mobile Telephone Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getObjectRefList <em>Object Ref List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getRegistryEntry <em>Registry Entry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getRegistryObject <em>Registry Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getRegistryObjectList <em>Registry Object List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getRegistryPackage <em>Registry Package</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getSpecificationLink <em>Specification Link</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getUsageDescription <em>Usage Description</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getUsageParameter <em>Usage Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.impl.DocumentRootImpl#getValueList <em>Value List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap = null;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation = null;

	/**
	 * The default value of the '{@link #getUsageParameter() <em>Usage Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_PARAMETER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RimPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RimPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddressType getAddress() {
		return (PostalAddressType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(PostalAddressType newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(PostalAddressType newAddress) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType1 getAssociation() {
		return (AssociationType1)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(AssociationType1 newAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(AssociationType1 newAssociation) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditableEventType getAuditableEvent() {
		return (AuditableEventType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditableEvent(AuditableEventType newAuditableEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT, newAuditableEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditableEvent(AuditableEventType newAuditableEvent) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__AUDITABLE_EVENT, newAuditableEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationType getClassification() {
		return (ClassificationType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(ClassificationType newClassification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION, newClassification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(ClassificationType newClassification) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION, newClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeType getClassificationNode() {
		return (ClassificationNodeType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationNode(ClassificationNodeType newClassificationNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE, newClassificationNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNode(ClassificationNodeType newClassificationNode) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_NODE, newClassificationNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSchemeType getClassificationScheme() {
		return (ClassificationSchemeType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationScheme(ClassificationSchemeType newClassificationScheme, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME, newClassificationScheme, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationScheme(ClassificationSchemeType newClassificationScheme) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION_SCHEME, newClassificationScheme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType getDescription() {
		return (InternationalStringType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(InternationalStringType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(InternationalStringType newDescription) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddressType getEmailAddress() {
		return (EmailAddressType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmailAddress(EmailAddressType newEmailAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS, newEmailAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailAddress(EmailAddressType newEmailAddress) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS, newEmailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalIdentifierType getExternalIdentifier() {
		return (ExternalIdentifierType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalIdentifier(ExternalIdentifierType newExternalIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER, newExternalIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalIdentifier(ExternalIdentifierType newExternalIdentifier) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER, newExternalIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLinkType getExternalLink() {
		return (ExternalLinkType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalLink(ExternalLinkType newExternalLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK, newExternalLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalLink(ExternalLinkType newExternalLink) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__EXTERNAL_LINK, newExternalLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrinsicObjectType getExtrinsicObject() {
		return (ExtrinsicObjectType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrinsicObject(ExtrinsicObjectType newExtrinsicObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT, newExtrinsicObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrinsicObject(ExtrinsicObjectType newExtrinsicObject) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__EXTRINSIC_OBJECT, newExtrinsicObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType getFaxNumber() {
		return (TelephoneNumberType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__FAX_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaxNumber(TelephoneNumberType newFaxNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__FAX_NUMBER, newFaxNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaxNumber(TelephoneNumberType newFaxNumber) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__FAX_NUMBER, newFaxNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType getInternationalString() {
		return (InternationalStringType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__INTERNATIONAL_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternationalString(InternationalStringType newInternationalString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__INTERNATIONAL_STRING, newInternationalString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternationalString(InternationalStringType newInternationalString) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__INTERNATIONAL_STRING, newInternationalString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafRegistryObjectListType getLeafRegistryObjectList() {
		return (LeafRegistryObjectListType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeafRegistryObjectList(LeafRegistryObjectListType newLeafRegistryObjectList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST, newLeafRegistryObjectList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeafRegistryObjectList(LeafRegistryObjectListType newLeafRegistryObjectList) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST, newLeafRegistryObjectList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedStringType getLocalizedString() {
		return (LocalizedStringType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__LOCALIZED_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalizedString(LocalizedStringType newLocalizedString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__LOCALIZED_STRING, newLocalizedString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizedString(LocalizedStringType newLocalizedString) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__LOCALIZED_STRING, newLocalizedString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType getMobileTelephoneNumber() {
		return (TelephoneNumberType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMobileTelephoneNumber(TelephoneNumberType newMobileTelephoneNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER, newMobileTelephoneNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobileTelephoneNumber(TelephoneNumberType newMobileTelephoneNumber) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER, newMobileTelephoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType getName() {
		return (InternationalStringType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(InternationalStringType newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__NAME, newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(InternationalStringType newName) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getObjectRef() {
		return (ObjectRefType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectRef(ObjectRefType newObjectRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF, newObjectRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRef(ObjectRefType newObjectRef) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF, newObjectRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefListType getObjectRefList() {
		return (ObjectRefListType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectRefList(ObjectRefListType newObjectRefList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF_LIST, newObjectRefList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRefList(ObjectRefListType newObjectRefList) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__OBJECT_REF_LIST, newObjectRefList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType getOrganization() {
		return (OrganizationType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(OrganizationType newOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(OrganizationType newOrganization) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType getPagerNumber() {
		return (TelephoneNumberType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__PAGER_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPagerNumber(TelephoneNumberType newPagerNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__PAGER_NUMBER, newPagerNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagerNumber(TelephoneNumberType newPagerNumber) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__PAGER_NUMBER, newPagerNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType getPersonName() {
		return (PersonNameType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__PERSON_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonName(PersonNameType newPersonName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__PERSON_NAME, newPersonName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(PersonNameType newPersonName) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__PERSON_NAME, newPersonName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddressType getPostalAddress() {
		return (PostalAddressType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__POSTAL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalAddress(PostalAddressType newPostalAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__POSTAL_ADDRESS, newPostalAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalAddress(PostalAddressType newPostalAddress) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__POSTAL_ADDRESS, newPostalAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntryType getRegistryEntry() {
		return (RegistryEntryType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryEntry(RegistryEntryType newRegistryEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY, newRegistryEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryEntry(RegistryEntryType newRegistryEntry) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_ENTRY, newRegistryEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectType getRegistryObject() {
		return (RegistryObjectType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObject(RegistryObjectType newRegistryObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT, newRegistryObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObject(RegistryObjectType newRegistryObject) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT, newRegistryObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryObjectListType getRegistryObjectList() {
		return (RegistryObjectListType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryObjectList(RegistryObjectListType newRegistryObjectList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST, newRegistryObjectList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryObjectList(RegistryObjectListType newRegistryObjectList) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST, newRegistryObjectList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryPackageType getRegistryPackage() {
		return (RegistryPackageType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistryPackage(RegistryPackageType newRegistryPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE, newRegistryPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistryPackage(RegistryPackageType newRegistryPackage) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__REGISTRY_PACKAGE, newRegistryPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getService() {
		return (ServiceType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceType newService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__SERVICE, newService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceType newService) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingType getServiceBinding() {
		return (ServiceBindingType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBinding(ServiceBindingType newServiceBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING, newServiceBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBinding(ServiceBindingType newServiceBinding) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING, newServiceBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotType1 getSlot() {
		return (SlotType1)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__SLOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(SlotType1 newSlot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__SLOT, newSlot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlot(SlotType1 newSlot) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__SLOT, newSlot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationLinkType getSpecificationLink() {
		return (SpecificationLinkType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationLink(SpecificationLinkType newSpecificationLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK, newSpecificationLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationLink(SpecificationLinkType newSpecificationLink) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__SPECIFICATION_LINK, newSpecificationLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType getTelephoneNumber() {
		return (TelephoneNumberType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelephoneNumber(TelephoneNumberType newTelephoneNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER, newTelephoneNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephoneNumber(TelephoneNumberType newTelephoneNumber) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER, newTelephoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStringType getUsageDescription() {
		return (InternationalStringType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__USAGE_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageDescription(InternationalStringType newUsageDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__USAGE_DESCRIPTION, newUsageDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageDescription(InternationalStringType newUsageDescription) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__USAGE_DESCRIPTION, newUsageDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageParameter() {
		return (String)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__USAGE_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageParameter(String newUsageParameter) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__USAGE_PARAMETER, newUsageParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType getUser() {
		return (UserType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(UserType newUser, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__USER, newUser, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(UserType newUser) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListType getValueList() {
		return (ValueListType)getMixed().get(RimPackage.Literals.DOCUMENT_ROOT__VALUE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueList(ValueListType newValueList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RimPackage.Literals.DOCUMENT_ROOT__VALUE_LIST, newValueList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueList(ValueListType newValueList) {
		((FeatureMap.Internal)getMixed()).set(RimPackage.Literals.DOCUMENT_ROOT__VALUE_LIST, newValueList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RimPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case RimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case RimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case RimPackage.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case RimPackage.DOCUMENT_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case RimPackage.DOCUMENT_ROOT__AUDITABLE_EVENT:
				return basicSetAuditableEvent(null, msgs);
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE:
				return basicSetClassificationNode(null, msgs);
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME:
				return basicSetClassificationScheme(null, msgs);
			case RimPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case RimPackage.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return basicSetEmailAddress(null, msgs);
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER:
				return basicSetExternalIdentifier(null, msgs);
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_LINK:
				return basicSetExternalLink(null, msgs);
			case RimPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT:
				return basicSetExtrinsicObject(null, msgs);
			case RimPackage.DOCUMENT_ROOT__FAX_NUMBER:
				return basicSetFaxNumber(null, msgs);
			case RimPackage.DOCUMENT_ROOT__INTERNATIONAL_STRING:
				return basicSetInternationalString(null, msgs);
			case RimPackage.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST:
				return basicSetLeafRegistryObjectList(null, msgs);
			case RimPackage.DOCUMENT_ROOT__LOCALIZED_STRING:
				return basicSetLocalizedString(null, msgs);
			case RimPackage.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER:
				return basicSetMobileTelephoneNumber(null, msgs);
			case RimPackage.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF:
				return basicSetObjectRef(null, msgs);
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF_LIST:
				return basicSetObjectRefList(null, msgs);
			case RimPackage.DOCUMENT_ROOT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case RimPackage.DOCUMENT_ROOT__PAGER_NUMBER:
				return basicSetPagerNumber(null, msgs);
			case RimPackage.DOCUMENT_ROOT__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case RimPackage.DOCUMENT_ROOT__POSTAL_ADDRESS:
				return basicSetPostalAddress(null, msgs);
			case RimPackage.DOCUMENT_ROOT__REGISTRY_ENTRY:
				return basicSetRegistryEntry(null, msgs);
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT:
				return basicSetRegistryObject(null, msgs);
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST:
				return basicSetRegistryObjectList(null, msgs);
			case RimPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE:
				return basicSetRegistryPackage(null, msgs);
			case RimPackage.DOCUMENT_ROOT__SERVICE:
				return basicSetService(null, msgs);
			case RimPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				return basicSetServiceBinding(null, msgs);
			case RimPackage.DOCUMENT_ROOT__SLOT:
				return basicSetSlot(null, msgs);
			case RimPackage.DOCUMENT_ROOT__SPECIFICATION_LINK:
				return basicSetSpecificationLink(null, msgs);
			case RimPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				return basicSetTelephoneNumber(null, msgs);
			case RimPackage.DOCUMENT_ROOT__USAGE_DESCRIPTION:
				return basicSetUsageDescription(null, msgs);
			case RimPackage.DOCUMENT_ROOT__USER:
				return basicSetUser(null, msgs);
			case RimPackage.DOCUMENT_ROOT__VALUE_LIST:
				return basicSetValueList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RimPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case RimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case RimPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case RimPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation();
			case RimPackage.DOCUMENT_ROOT__AUDITABLE_EVENT:
				return getAuditableEvent();
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return getClassification();
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE:
				return getClassificationNode();
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME:
				return getClassificationScheme();
			case RimPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case RimPackage.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return getEmailAddress();
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_LINK:
				return getExternalLink();
			case RimPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT:
				return getExtrinsicObject();
			case RimPackage.DOCUMENT_ROOT__FAX_NUMBER:
				return getFaxNumber();
			case RimPackage.DOCUMENT_ROOT__INTERNATIONAL_STRING:
				return getInternationalString();
			case RimPackage.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST:
				return getLeafRegistryObjectList();
			case RimPackage.DOCUMENT_ROOT__LOCALIZED_STRING:
				return getLocalizedString();
			case RimPackage.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER:
				return getMobileTelephoneNumber();
			case RimPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF:
				return getObjectRef();
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF_LIST:
				return getObjectRefList();
			case RimPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case RimPackage.DOCUMENT_ROOT__PAGER_NUMBER:
				return getPagerNumber();
			case RimPackage.DOCUMENT_ROOT__PERSON_NAME:
				return getPersonName();
			case RimPackage.DOCUMENT_ROOT__POSTAL_ADDRESS:
				return getPostalAddress();
			case RimPackage.DOCUMENT_ROOT__REGISTRY_ENTRY:
				return getRegistryEntry();
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT:
				return getRegistryObject();
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST:
				return getRegistryObjectList();
			case RimPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE:
				return getRegistryPackage();
			case RimPackage.DOCUMENT_ROOT__SERVICE:
				return getService();
			case RimPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				return getServiceBinding();
			case RimPackage.DOCUMENT_ROOT__SLOT:
				return getSlot();
			case RimPackage.DOCUMENT_ROOT__SPECIFICATION_LINK:
				return getSpecificationLink();
			case RimPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case RimPackage.DOCUMENT_ROOT__USAGE_DESCRIPTION:
				return getUsageDescription();
			case RimPackage.DOCUMENT_ROOT__USAGE_PARAMETER:
				return getUsageParameter();
			case RimPackage.DOCUMENT_ROOT__USER:
				return getUser();
			case RimPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case RimPackage.DOCUMENT_ROOT__VALUE_LIST:
				return getValueList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RimPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((PostalAddressType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((AssociationType1)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__AUDITABLE_EVENT:
				setAuditableEvent((AuditableEventType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification((ClassificationType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE:
				setClassificationNode((ClassificationNodeType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME:
				setClassificationScheme((ClassificationSchemeType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((InternationalStringType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__EMAIL_ADDRESS:
				setEmailAddress((EmailAddressType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER:
				setExternalIdentifier((ExternalIdentifierType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_LINK:
				setExternalLink((ExternalLinkType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT:
				setExtrinsicObject((ExtrinsicObjectType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__FAX_NUMBER:
				setFaxNumber((TelephoneNumberType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__INTERNATIONAL_STRING:
				setInternationalString((InternationalStringType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST:
				setLeafRegistryObjectList((LeafRegistryObjectListType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__LOCALIZED_STRING:
				setLocalizedString((LocalizedStringType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER:
				setMobileTelephoneNumber((TelephoneNumberType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__NAME:
				setName((InternationalStringType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF:
				setObjectRef((ObjectRefType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__PAGER_NUMBER:
				setPagerNumber((TelephoneNumberType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__POSTAL_ADDRESS:
				setPostalAddress((PostalAddressType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_ENTRY:
				setRegistryEntry((RegistryEntryType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT:
				setRegistryObject((RegistryObjectType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE:
				setRegistryPackage((RegistryPackageType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				setServiceBinding((ServiceBindingType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__SLOT:
				setSlot((SlotType1)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__SPECIFICATION_LINK:
				setSpecificationLink((SpecificationLinkType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				setTelephoneNumber((TelephoneNumberType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__USAGE_DESCRIPTION:
				setUsageDescription((InternationalStringType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__USAGE_PARAMETER:
				setUsageParameter((String)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__USER:
				setUser((UserType)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__VALUE:
				setValue((String)newValue);
				return;
			case RimPackage.DOCUMENT_ROOT__VALUE_LIST:
				setValueList((ValueListType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RimPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case RimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case RimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case RimPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((PostalAddressType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((AssociationType1)null);
				return;
			case RimPackage.DOCUMENT_ROOT__AUDITABLE_EVENT:
				setAuditableEvent((AuditableEventType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification((ClassificationType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE:
				setClassificationNode((ClassificationNodeType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME:
				setClassificationScheme((ClassificationSchemeType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((InternationalStringType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__EMAIL_ADDRESS:
				setEmailAddress((EmailAddressType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER:
				setExternalIdentifier((ExternalIdentifierType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_LINK:
				setExternalLink((ExternalLinkType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT:
				setExtrinsicObject((ExtrinsicObjectType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__FAX_NUMBER:
				setFaxNumber((TelephoneNumberType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__INTERNATIONAL_STRING:
				setInternationalString((InternationalStringType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST:
				setLeafRegistryObjectList((LeafRegistryObjectListType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__LOCALIZED_STRING:
				setLocalizedString((LocalizedStringType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER:
				setMobileTelephoneNumber((TelephoneNumberType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__NAME:
				setName((InternationalStringType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF:
				setObjectRef((ObjectRefType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF_LIST:
				setObjectRefList((ObjectRefListType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__PAGER_NUMBER:
				setPagerNumber((TelephoneNumberType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__POSTAL_ADDRESS:
				setPostalAddress((PostalAddressType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_ENTRY:
				setRegistryEntry((RegistryEntryType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT:
				setRegistryObject((RegistryObjectType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST:
				setRegistryObjectList((RegistryObjectListType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE:
				setRegistryPackage((RegistryPackageType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				setServiceBinding((ServiceBindingType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__SLOT:
				setSlot((SlotType1)null);
				return;
			case RimPackage.DOCUMENT_ROOT__SPECIFICATION_LINK:
				setSpecificationLink((SpecificationLinkType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				setTelephoneNumber((TelephoneNumberType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__USAGE_DESCRIPTION:
				setUsageDescription((InternationalStringType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__USAGE_PARAMETER:
				setUsageParameter(USAGE_PARAMETER_EDEFAULT);
				return;
			case RimPackage.DOCUMENT_ROOT__USER:
				setUser((UserType)null);
				return;
			case RimPackage.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RimPackage.DOCUMENT_ROOT__VALUE_LIST:
				setValueList((ValueListType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RimPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case RimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case RimPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case RimPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case RimPackage.DOCUMENT_ROOT__AUDITABLE_EVENT:
				return getAuditableEvent() != null;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return getClassification() != null;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_NODE:
				return getClassificationNode() != null;
			case RimPackage.DOCUMENT_ROOT__CLASSIFICATION_SCHEME:
				return getClassificationScheme() != null;
			case RimPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case RimPackage.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return getEmailAddress() != null;
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier() != null;
			case RimPackage.DOCUMENT_ROOT__EXTERNAL_LINK:
				return getExternalLink() != null;
			case RimPackage.DOCUMENT_ROOT__EXTRINSIC_OBJECT:
				return getExtrinsicObject() != null;
			case RimPackage.DOCUMENT_ROOT__FAX_NUMBER:
				return getFaxNumber() != null;
			case RimPackage.DOCUMENT_ROOT__INTERNATIONAL_STRING:
				return getInternationalString() != null;
			case RimPackage.DOCUMENT_ROOT__LEAF_REGISTRY_OBJECT_LIST:
				return getLeafRegistryObjectList() != null;
			case RimPackage.DOCUMENT_ROOT__LOCALIZED_STRING:
				return getLocalizedString() != null;
			case RimPackage.DOCUMENT_ROOT__MOBILE_TELEPHONE_NUMBER:
				return getMobileTelephoneNumber() != null;
			case RimPackage.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF:
				return getObjectRef() != null;
			case RimPackage.DOCUMENT_ROOT__OBJECT_REF_LIST:
				return getObjectRefList() != null;
			case RimPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization() != null;
			case RimPackage.DOCUMENT_ROOT__PAGER_NUMBER:
				return getPagerNumber() != null;
			case RimPackage.DOCUMENT_ROOT__PERSON_NAME:
				return getPersonName() != null;
			case RimPackage.DOCUMENT_ROOT__POSTAL_ADDRESS:
				return getPostalAddress() != null;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_ENTRY:
				return getRegistryEntry() != null;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT:
				return getRegistryObject() != null;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_OBJECT_LIST:
				return getRegistryObjectList() != null;
			case RimPackage.DOCUMENT_ROOT__REGISTRY_PACKAGE:
				return getRegistryPackage() != null;
			case RimPackage.DOCUMENT_ROOT__SERVICE:
				return getService() != null;
			case RimPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				return getServiceBinding() != null;
			case RimPackage.DOCUMENT_ROOT__SLOT:
				return getSlot() != null;
			case RimPackage.DOCUMENT_ROOT__SPECIFICATION_LINK:
				return getSpecificationLink() != null;
			case RimPackage.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				return getTelephoneNumber() != null;
			case RimPackage.DOCUMENT_ROOT__USAGE_DESCRIPTION:
				return getUsageDescription() != null;
			case RimPackage.DOCUMENT_ROOT__USAGE_PARAMETER:
				return USAGE_PARAMETER_EDEFAULT == null ? getUsageParameter() != null : !USAGE_PARAMETER_EDEFAULT.equals(getUsageParameter());
			case RimPackage.DOCUMENT_ROOT__USER:
				return getUser() != null;
			case RimPackage.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case RimPackage.DOCUMENT_ROOT__VALUE_LIST:
				return getValueList() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
