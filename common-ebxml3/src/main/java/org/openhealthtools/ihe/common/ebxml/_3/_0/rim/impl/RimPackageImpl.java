/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimPackageImpl.java,v 1.1 2006/10/19 20:16:03 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.impl;

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


import org.openhealthtools.ihe.common.ebxml._3._0.rim.ActionType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ConformanceProfileType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimFactory;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.UserType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.util.RimValidator;

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
	private EClass actionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adhocQueryTypeEClass = null;

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
	private EClass federationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableTypeEClass = null;

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
	private EClass localizedStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notifyActionTypeEClass = null;

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
	private EClass personTypeEClass = null;

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
	private EClass queryExpressionTypeEClass = null;

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
	private EClass registryTypeEClass = null;

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
	private EClass slotListTypeEClass = null;

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
	private EClass subscriptionTypeEClass = null;

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
	private EClass versionInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conformanceProfileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conformanceProfileTypeObjectEDataType = null;

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
	private EDataType referenceURIEDataType = null;

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#eNS_URI
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
	public EClass getActionType() {
		return actionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdhocQueryType() {
		return adhocQueryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdhocQueryType_QueryExpression() {
		return (EReference)adhocQueryTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAssociationType1_SourceObject() {
		return (EAttribute)associationType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationType1_TargetObject() {
		return (EAttribute)associationType1EClass.getEStructuralFeatures().get(2);
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
	public EReference getAuditableEventType_AffectedObjects() {
		return (EReference)auditableEventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_EventType() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_RequestId() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_Timestamp() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditableEventType_User() {
		return (EAttribute)auditableEventTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_Action() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdhocQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Identifiable() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Association() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditableEvent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Classification() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationNode() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassificationScheme() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmailAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalIdentifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalLink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtrinsicObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Federation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InternationalString() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalizedString() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Name() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Notification() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NotifyAction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectRef() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectRefList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Organization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Person() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PostalAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryExpression() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Registry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryObjectList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegistryPackage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Service() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Slot() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SlotList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpecificationLink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Subscription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsageDescription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UsageParameter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_User() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
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
	public EAttribute getEmailAddressType_Address() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_Type() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getExtrinsicObjectType_ContentVersionInfo() {
		return (EReference)extrinsicObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrinsicObjectType_IsOpaque() {
		return (EAttribute)extrinsicObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrinsicObjectType_MimeType() {
		return (EAttribute)extrinsicObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationType() {
		return federationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationType_ReplicationSyncLatency() {
		return (EAttribute)federationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableType() {
		return identifiableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiableType_Slot() {
		return (EReference)identifiableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableType_Home() {
		return (EAttribute)identifiableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableType_Id() {
		return (EAttribute)identifiableTypeEClass.getEStructuralFeatures().get(2);
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
	public EClass getNotificationType() {
		return notificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationType_RegistryObjectList() {
		return (EReference)notificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationType_Subscription() {
		return (EAttribute)notificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotifyActionType() {
		return notifyActionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotifyActionType_EndPoint() {
		return (EAttribute)notifyActionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotifyActionType_NotificationOption() {
		return (EAttribute)notifyActionTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getObjectRefType_CreateReplica() {
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
	public EReference getOrganizationType_EmailAddress() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_Parent() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_PrimaryContact() {
		return (EAttribute)organizationTypeEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getPersonNameType_FirstName() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_LastName() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_MiddleName() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonType() {
		return personTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_Address() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonName() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_TelephoneNumber() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_EmailAddress() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getPostalAddressType_City() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_Country() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_PostalCode() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_StateOrProvince() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_Street() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddressType_StreetNumber() {
		return (EAttribute)postalAddressTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryExpressionType() {
		return queryExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryExpressionType_Mixed() {
		return (EAttribute)queryExpressionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryExpressionType_Any() {
		return (EAttribute)queryExpressionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryExpressionType_QueryLanguage() {
		return (EAttribute)queryExpressionTypeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getRegistryObjectListType_IdentifiableGroup() {
		return (EAttribute)registryObjectListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistryObjectListType_Identifiable() {
		return (EReference)registryObjectListTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getRegistryObjectType_VersionInfo() {
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
	public EAttribute getRegistryObjectType_Lid() {
		return (EAttribute)registryObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryObjectType_ObjectType() {
		return (EAttribute)registryObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryObjectType_Status() {
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
	public EClass getRegistryType() {
		return registryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryType_CatalogingLatency() {
		return (EAttribute)registryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryType_ConformanceProfile() {
		return (EAttribute)registryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryType_Operator() {
		return (EAttribute)registryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryType_ReplicationSyncLatency() {
		return (EAttribute)registryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryType_SpecificationVersion() {
		return (EAttribute)registryTypeEClass.getEStructuralFeatures().get(4);
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
	public EClass getSlotListType() {
		return slotListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotListType_Slot() {
		return (EReference)slotListTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getSpecificationLinkType_ServiceBinding() {
		return (EAttribute)specificationLinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationLinkType_SpecificationObject() {
		return (EAttribute)specificationLinkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionType() {
		return subscriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionType_ActionGroup() {
		return (EAttribute)subscriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionType_Action() {
		return (EReference)subscriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionType_EndTime() {
		return (EAttribute)subscriptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionType_NotificationInterval() {
		return (EAttribute)subscriptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionType_Selector() {
		return (EAttribute)subscriptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionType_StartTime() {
		return (EAttribute)subscriptionTypeEClass.getEStructuralFeatures().get(5);
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
	public EClass getUserType() {
		return userTypeEClass;
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
	public EClass getVersionInfoType() {
		return versionInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInfoType_Comment() {
		return (EAttribute)versionInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInfoType_VersionName() {
		return (EAttribute)versionInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConformanceProfileType() {
		return conformanceProfileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConformanceProfileTypeObject() {
		return conformanceProfileTypeObjectEDataType;
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
	public EDataType getReferenceURI() {
		return referenceURIEDataType;
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
		actionTypeEClass = createEClass(ACTION_TYPE);

		adhocQueryTypeEClass = createEClass(ADHOC_QUERY_TYPE);
		createEReference(adhocQueryTypeEClass, ADHOC_QUERY_TYPE__QUERY_EXPRESSION);

		associationType1EClass = createEClass(ASSOCIATION_TYPE1);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__ASSOCIATION_TYPE);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__SOURCE_OBJECT);
		createEAttribute(associationType1EClass, ASSOCIATION_TYPE1__TARGET_OBJECT);

		auditableEventTypeEClass = createEClass(AUDITABLE_EVENT_TYPE);
		createEReference(auditableEventTypeEClass, AUDITABLE_EVENT_TYPE__AFFECTED_OBJECTS);
		createEAttribute(auditableEventTypeEClass, AUDITABLE_EVENT_TYPE__EVENT_TYPE);
		createEAttribute(auditableEventTypeEClass, AUDITABLE_EVENT_TYPE__REQUEST_ID);
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADHOC_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDENTIFIABLE);
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEDERATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERNATIONAL_STRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCALIZED_STRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOTIFICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOTIFY_ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_REF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_REF_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSON);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSON_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POSTAL_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QUERY_EXPRESSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_OBJECT_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGISTRY_PACKAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SLOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SLOT_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIFICATION_LINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBSCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TELEPHONE_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USAGE_DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USAGE_PARAMETER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_LIST);

		emailAddressTypeEClass = createEClass(EMAIL_ADDRESS_TYPE);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__ADDRESS);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__TYPE);

		externalIdentifierTypeEClass = createEClass(EXTERNAL_IDENTIFIER_TYPE);
		createEAttribute(externalIdentifierTypeEClass, EXTERNAL_IDENTIFIER_TYPE__IDENTIFICATION_SCHEME);
		createEAttribute(externalIdentifierTypeEClass, EXTERNAL_IDENTIFIER_TYPE__REGISTRY_OBJECT);
		createEAttribute(externalIdentifierTypeEClass, EXTERNAL_IDENTIFIER_TYPE__VALUE);

		externalLinkTypeEClass = createEClass(EXTERNAL_LINK_TYPE);
		createEAttribute(externalLinkTypeEClass, EXTERNAL_LINK_TYPE__EXTERNAL_URI);

		extrinsicObjectTypeEClass = createEClass(EXTRINSIC_OBJECT_TYPE);
		createEReference(extrinsicObjectTypeEClass, EXTRINSIC_OBJECT_TYPE__CONTENT_VERSION_INFO);
		createEAttribute(extrinsicObjectTypeEClass, EXTRINSIC_OBJECT_TYPE__IS_OPAQUE);
		createEAttribute(extrinsicObjectTypeEClass, EXTRINSIC_OBJECT_TYPE__MIME_TYPE);

		federationTypeEClass = createEClass(FEDERATION_TYPE);
		createEAttribute(federationTypeEClass, FEDERATION_TYPE__REPLICATION_SYNC_LATENCY);

		identifiableTypeEClass = createEClass(IDENTIFIABLE_TYPE);
		createEReference(identifiableTypeEClass, IDENTIFIABLE_TYPE__SLOT);
		createEAttribute(identifiableTypeEClass, IDENTIFIABLE_TYPE__HOME);
		createEAttribute(identifiableTypeEClass, IDENTIFIABLE_TYPE__ID);

		internationalStringTypeEClass = createEClass(INTERNATIONAL_STRING_TYPE);
		createEAttribute(internationalStringTypeEClass, INTERNATIONAL_STRING_TYPE__GROUP);
		createEReference(internationalStringTypeEClass, INTERNATIONAL_STRING_TYPE__LOCALIZED_STRING);

		localizedStringTypeEClass = createEClass(LOCALIZED_STRING_TYPE);
		createEAttribute(localizedStringTypeEClass, LOCALIZED_STRING_TYPE__CHARSET);
		createEAttribute(localizedStringTypeEClass, LOCALIZED_STRING_TYPE__LANG);
		createEAttribute(localizedStringTypeEClass, LOCALIZED_STRING_TYPE__VALUE);

		notificationTypeEClass = createEClass(NOTIFICATION_TYPE);
		createEReference(notificationTypeEClass, NOTIFICATION_TYPE__REGISTRY_OBJECT_LIST);
		createEAttribute(notificationTypeEClass, NOTIFICATION_TYPE__SUBSCRIPTION);

		notifyActionTypeEClass = createEClass(NOTIFY_ACTION_TYPE);
		createEAttribute(notifyActionTypeEClass, NOTIFY_ACTION_TYPE__END_POINT);
		createEAttribute(notifyActionTypeEClass, NOTIFY_ACTION_TYPE__NOTIFICATION_OPTION);

		objectRefListTypeEClass = createEClass(OBJECT_REF_LIST_TYPE);
		createEAttribute(objectRefListTypeEClass, OBJECT_REF_LIST_TYPE__GROUP);
		createEReference(objectRefListTypeEClass, OBJECT_REF_LIST_TYPE__OBJECT_REF);

		objectRefTypeEClass = createEClass(OBJECT_REF_TYPE);
		createEAttribute(objectRefTypeEClass, OBJECT_REF_TYPE__CREATE_REPLICA);

		organizationTypeEClass = createEClass(ORGANIZATION_TYPE);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__ADDRESS);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__TELEPHONE_NUMBER);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__EMAIL_ADDRESS);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__PARENT);
		createEAttribute(organizationTypeEClass, ORGANIZATION_TYPE__PRIMARY_CONTACT);

		personNameTypeEClass = createEClass(PERSON_NAME_TYPE);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__FIRST_NAME);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__LAST_NAME);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__MIDDLE_NAME);

		personTypeEClass = createEClass(PERSON_TYPE);
		createEReference(personTypeEClass, PERSON_TYPE__ADDRESS);
		createEReference(personTypeEClass, PERSON_TYPE__PERSON_NAME);
		createEReference(personTypeEClass, PERSON_TYPE__TELEPHONE_NUMBER);
		createEReference(personTypeEClass, PERSON_TYPE__EMAIL_ADDRESS);

		postalAddressTypeEClass = createEClass(POSTAL_ADDRESS_TYPE);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__CITY);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__COUNTRY);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__POSTAL_CODE);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__STATE_OR_PROVINCE);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__STREET);
		createEAttribute(postalAddressTypeEClass, POSTAL_ADDRESS_TYPE__STREET_NUMBER);

		queryExpressionTypeEClass = createEClass(QUERY_EXPRESSION_TYPE);
		createEAttribute(queryExpressionTypeEClass, QUERY_EXPRESSION_TYPE__MIXED);
		createEAttribute(queryExpressionTypeEClass, QUERY_EXPRESSION_TYPE__ANY);
		createEAttribute(queryExpressionTypeEClass, QUERY_EXPRESSION_TYPE__QUERY_LANGUAGE);

		registryObjectListTypeEClass = createEClass(REGISTRY_OBJECT_LIST_TYPE);
		createEAttribute(registryObjectListTypeEClass, REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE_GROUP);
		createEReference(registryObjectListTypeEClass, REGISTRY_OBJECT_LIST_TYPE__IDENTIFIABLE);

		registryObjectTypeEClass = createEClass(REGISTRY_OBJECT_TYPE);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__NAME);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__DESCRIPTION);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__VERSION_INFO);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__CLASSIFICATION);
		createEReference(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__EXTERNAL_IDENTIFIER);
		createEAttribute(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__LID);
		createEAttribute(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__OBJECT_TYPE);
		createEAttribute(registryObjectTypeEClass, REGISTRY_OBJECT_TYPE__STATUS);

		registryPackageTypeEClass = createEClass(REGISTRY_PACKAGE_TYPE);
		createEReference(registryPackageTypeEClass, REGISTRY_PACKAGE_TYPE__REGISTRY_OBJECT_LIST);

		registryTypeEClass = createEClass(REGISTRY_TYPE);
		createEAttribute(registryTypeEClass, REGISTRY_TYPE__CATALOGING_LATENCY);
		createEAttribute(registryTypeEClass, REGISTRY_TYPE__CONFORMANCE_PROFILE);
		createEAttribute(registryTypeEClass, REGISTRY_TYPE__OPERATOR);
		createEAttribute(registryTypeEClass, REGISTRY_TYPE__REPLICATION_SYNC_LATENCY);
		createEAttribute(registryTypeEClass, REGISTRY_TYPE__SPECIFICATION_VERSION);

		serviceBindingTypeEClass = createEClass(SERVICE_BINDING_TYPE);
		createEReference(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__SPECIFICATION_LINK);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__ACCESS_URI);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__SERVICE);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__TARGET_BINDING);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEReference(serviceTypeEClass, SERVICE_TYPE__SERVICE_BINDING);

		slotListTypeEClass = createEClass(SLOT_LIST_TYPE);
		createEReference(slotListTypeEClass, SLOT_LIST_TYPE__SLOT);

		slotType1EClass = createEClass(SLOT_TYPE1);
		createEReference(slotType1EClass, SLOT_TYPE1__VALUE_LIST);
		createEAttribute(slotType1EClass, SLOT_TYPE1__NAME);
		createEAttribute(slotType1EClass, SLOT_TYPE1__SLOT_TYPE);

		specificationLinkTypeEClass = createEClass(SPECIFICATION_LINK_TYPE);
		createEReference(specificationLinkTypeEClass, SPECIFICATION_LINK_TYPE__USAGE_DESCRIPTION);
		createEAttribute(specificationLinkTypeEClass, SPECIFICATION_LINK_TYPE__USAGE_PARAMETER);
		createEAttribute(specificationLinkTypeEClass, SPECIFICATION_LINK_TYPE__SERVICE_BINDING);
		createEAttribute(specificationLinkTypeEClass, SPECIFICATION_LINK_TYPE__SPECIFICATION_OBJECT);

		subscriptionTypeEClass = createEClass(SUBSCRIPTION_TYPE);
		createEAttribute(subscriptionTypeEClass, SUBSCRIPTION_TYPE__ACTION_GROUP);
		createEReference(subscriptionTypeEClass, SUBSCRIPTION_TYPE__ACTION);
		createEAttribute(subscriptionTypeEClass, SUBSCRIPTION_TYPE__END_TIME);
		createEAttribute(subscriptionTypeEClass, SUBSCRIPTION_TYPE__NOTIFICATION_INTERVAL);
		createEAttribute(subscriptionTypeEClass, SUBSCRIPTION_TYPE__SELECTOR);
		createEAttribute(subscriptionTypeEClass, SUBSCRIPTION_TYPE__START_TIME);

		telephoneNumberListTypeEClass = createEClass(TELEPHONE_NUMBER_LIST_TYPE);
		createEReference(telephoneNumberListTypeEClass, TELEPHONE_NUMBER_LIST_TYPE__TELEPHONE_NUMBER);

		telephoneNumberTypeEClass = createEClass(TELEPHONE_NUMBER_TYPE);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__AREA_CODE);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__COUNTRY_CODE);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__EXTENSION);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__NUMBER);
		createEAttribute(telephoneNumberTypeEClass, TELEPHONE_NUMBER_TYPE__PHONE_TYPE);

		userTypeEClass = createEClass(USER_TYPE);

		valueListTypeEClass = createEClass(VALUE_LIST_TYPE);
		createEAttribute(valueListTypeEClass, VALUE_LIST_TYPE__GROUP);
		createEAttribute(valueListTypeEClass, VALUE_LIST_TYPE__VALUE);

		versionInfoTypeEClass = createEClass(VERSION_INFO_TYPE);
		createEAttribute(versionInfoTypeEClass, VERSION_INFO_TYPE__COMMENT);
		createEAttribute(versionInfoTypeEClass, VERSION_INFO_TYPE__VERSION_NAME);

		// Create enums
		conformanceProfileTypeEEnum = createEEnum(CONFORMANCE_PROFILE_TYPE);

		// Create data types
		conformanceProfileTypeObjectEDataType = createEDataType(CONFORMANCE_PROFILE_TYPE_OBJECT);
		freeFormTextEDataType = createEDataType(FREE_FORM_TEXT);
		longNameEDataType = createEDataType(LONG_NAME);
		referenceURIEDataType = createEDataType(REFERENCE_URI);
		shortNameEDataType = createEDataType(SHORT_NAME);
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
		adhocQueryTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		associationType1EClass.getESuperTypes().add(this.getRegistryObjectType());
		auditableEventTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		classificationNodeTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		classificationSchemeTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		classificationTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		externalIdentifierTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		externalLinkTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		extrinsicObjectTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		federationTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		notificationTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		notifyActionTypeEClass.getESuperTypes().add(this.getActionType());
		objectRefTypeEClass.getESuperTypes().add(this.getIdentifiableType());
		organizationTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		personTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		registryObjectTypeEClass.getESuperTypes().add(this.getIdentifiableType());
		registryPackageTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		registryTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		serviceBindingTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		serviceTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		specificationLinkTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		subscriptionTypeEClass.getESuperTypes().add(this.getRegistryObjectType());
		userTypeEClass.getESuperTypes().add(this.getPersonType());

		// Initialize classes and features; add operations and parameters
		initEClass(actionTypeEClass, ActionType.class, "ActionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adhocQueryTypeEClass, AdhocQueryType.class, "AdhocQueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdhocQueryType_QueryExpression(), this.getQueryExpressionType(), null, "queryExpression", null, 0, 1, AdhocQueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationType1EClass, AssociationType1.class, "AssociationType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationType1_AssociationType(), this.getReferenceURI(), "associationType", null, 1, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationType1_SourceObject(), this.getReferenceURI(), "sourceObject", null, 1, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationType1_TargetObject(), this.getReferenceURI(), "targetObject", null, 1, 1, AssociationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableEventTypeEClass, AuditableEventType.class, "AuditableEventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuditableEventType_AffectedObjects(), this.getObjectRefListType(), null, "affectedObjects", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditableEventType_EventType(), this.getReferenceURI(), "eventType", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditableEventType_RequestId(), this.getReferenceURI(), "requestId", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditableEventType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditableEventType_User(), this.getReferenceURI(), "user", null, 1, 1, AuditableEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationNodeTypeEClass, ClassificationNodeType.class, "ClassificationNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationNodeType_ClassificationNode(), this.getClassificationNodeType(), null, "classificationNode", null, 0, -1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationNodeType_Code(), this.getLongName(), "code", null, 0, 1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationNodeType_Parent(), this.getReferenceURI(), "parent", null, 0, 1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationNodeType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, ClassificationNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationSchemeTypeEClass, ClassificationSchemeType.class, "ClassificationSchemeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationSchemeType_ClassificationNode(), this.getClassificationNodeType(), null, "classificationNode", null, 0, -1, ClassificationSchemeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationSchemeType_IsInternal(), theXMLTypePackage.getBoolean(), "isInternal", null, 1, 1, ClassificationSchemeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationSchemeType_NodeType(), this.getReferenceURI(), "nodeType", null, 1, 1, ClassificationSchemeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationTypeEClass, ClassificationType.class, "ClassificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationType_ClassificationNode(), this.getReferenceURI(), "classificationNode", null, 0, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationType_ClassificationScheme(), this.getReferenceURI(), "classificationScheme", null, 0, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationType_ClassifiedObject(), this.getReferenceURI(), "classifiedObject", null, 1, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassificationType_NodeRepresentation(), this.getLongName(), "nodeRepresentation", null, 0, 1, ClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Action(), this.getActionType(), null, "action", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getPostalAddressType(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdhocQuery(), this.getAdhocQueryType(), null, "adhocQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObject(), this.getRegistryObjectType(), null, "registryObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Identifiable(), this.getIdentifiableType(), null, "identifiable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
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
		initEReference(getDocumentRoot_Federation(), this.getFederationType(), null, "federation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InternationalString(), this.getInternationalStringType(), null, "internationalString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocalizedString(), this.getLocalizedStringType(), null, "localizedString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Name(), this.getInternationalStringType(), null, "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Notification(), this.getNotificationType(), null, "notification", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NotifyAction(), this.getNotifyActionType(), null, "notifyAction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectRef(), this.getObjectRefType(), null, "objectRef", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectRefList(), this.getObjectRefListType(), null, "objectRefList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Organization(), this.getOrganizationType(), null, "organization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Person(), this.getPersonType(), null, "person", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PersonName(), this.getPersonNameType(), null, "personName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PostalAddress(), this.getPostalAddressType(), null, "postalAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_QueryExpression(), this.getQueryExpressionType(), null, "queryExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Registry(), this.getRegistryType(), null, "registry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryObjectList(), this.getRegistryObjectListType(), null, "registryObjectList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegistryPackage(), this.getRegistryPackageType(), null, "registryPackage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Service(), this.getServiceType(), null, "service", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceBinding(), this.getServiceBindingType(), null, "serviceBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Slot(), this.getSlotType1(), null, "slot", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SlotList(), this.getSlotListType(), null, "slotList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpecificationLink(), this.getSpecificationLinkType(), null, "specificationLink", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Subscription(), this.getSubscriptionType(), null, "subscription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UsageDescription(), this.getInternationalStringType(), null, "usageDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UsageParameter(), this.getFreeFormText(), "usageParameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_User(), this.getUserType(), null, "user", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Value(), this.getLongName(), "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValueList(), this.getValueListType(), null, "valueList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emailAddressTypeEClass, EmailAddressType.class, "EmailAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailAddressType_Address(), this.getShortName(), "address", null, 1, 1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressType_Type(), this.getString32(), "type", null, 0, 1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalIdentifierTypeEClass, ExternalIdentifierType.class, "ExternalIdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalIdentifierType_IdentificationScheme(), this.getReferenceURI(), "identificationScheme", null, 1, 1, ExternalIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalIdentifierType_RegistryObject(), this.getReferenceURI(), "registryObject", null, 1, 1, ExternalIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalIdentifierType_Value(), this.getLongName(), "value", null, 1, 1, ExternalIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalLinkTypeEClass, ExternalLinkType.class, "ExternalLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalLinkType_ExternalURI(), theXMLTypePackage.getAnyURI(), "externalURI", null, 1, 1, ExternalLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extrinsicObjectTypeEClass, ExtrinsicObjectType.class, "ExtrinsicObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtrinsicObjectType_ContentVersionInfo(), this.getVersionInfoType(), null, "contentVersionInfo", null, 0, 1, ExtrinsicObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrinsicObjectType_IsOpaque(), theXMLTypePackage.getBoolean(), "isOpaque", "false", 0, 1, ExtrinsicObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrinsicObjectType_MimeType(), this.getLongName(), "mimeType", "application/octet-stream", 0, 1, ExtrinsicObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(federationTypeEClass, FederationType.class, "FederationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFederationType_ReplicationSyncLatency(), theXMLTypePackage.getDuration(), "replicationSyncLatency", "P1D", 0, 1, FederationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableTypeEClass, IdentifiableType.class, "IdentifiableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiableType_Slot(), this.getSlotType1(), null, "slot", null, 0, -1, IdentifiableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiableType_Home(), theXMLTypePackage.getAnyURI(), "home", null, 0, 1, IdentifiableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiableType_Id(), theXMLTypePackage.getAnyURI(), "id", null, 1, 1, IdentifiableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internationalStringTypeEClass, InternationalStringType.class, "InternationalStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternationalStringType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, InternationalStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternationalStringType_LocalizedString(), this.getLocalizedStringType(), null, "localizedString", null, 0, -1, InternationalStringType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(localizedStringTypeEClass, LocalizedStringType.class, "LocalizedStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalizedStringType_Charset(), theXMLTypePackage.getAnySimpleType(), "charset", "UTF-8", 0, 1, LocalizedStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalizedStringType_Lang(), theXMLNamespacePackage.getLangType(), "lang", "en-US", 0, 1, LocalizedStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalizedStringType_Value(), this.getFreeFormText(), "value", null, 1, 1, LocalizedStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationTypeEClass, NotificationType.class, "NotificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotificationType_RegistryObjectList(), this.getRegistryObjectListType(), null, "registryObjectList", null, 1, 1, NotificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationType_Subscription(), this.getReferenceURI(), "subscription", null, 1, 1, NotificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notifyActionTypeEClass, NotifyActionType.class, "NotifyActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotifyActionType_EndPoint(), theXMLTypePackage.getAnyURI(), "endPoint", null, 1, 1, NotifyActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotifyActionType_NotificationOption(), this.getReferenceURI(), "notificationOption", "urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs", 0, 1, NotifyActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRefListTypeEClass, ObjectRefListType.class, "ObjectRefListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectRefListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ObjectRefListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectRefListType_ObjectRef(), this.getObjectRefType(), null, "objectRef", null, 0, -1, ObjectRefListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(objectRefTypeEClass, ObjectRefType.class, "ObjectRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectRefType_CreateReplica(), theXMLTypePackage.getBoolean(), "createReplica", "false", 0, 1, ObjectRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationTypeEClass, OrganizationType.class, "OrganizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationType_Address(), this.getPostalAddressType(), null, "address", null, 0, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 0, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_EmailAddress(), this.getEmailAddressType(), null, "emailAddress", null, 0, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_Parent(), this.getReferenceURI(), "parent", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationType_PrimaryContact(), this.getReferenceURI(), "primaryContact", null, 0, 1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personNameTypeEClass, PersonNameType.class, "PersonNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonNameType_FirstName(), this.getShortName(), "firstName", null, 0, 1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameType_LastName(), this.getShortName(), "lastName", null, 0, 1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameType_MiddleName(), this.getShortName(), "middleName", null, 0, 1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personTypeEClass, PersonType.class, "PersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonType_Address(), this.getPostalAddressType(), null, "address", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_PersonName(), this.getPersonNameType(), null, "personName", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_EmailAddress(), this.getEmailAddressType(), null, "emailAddress", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalAddressTypeEClass, PostalAddressType.class, "PostalAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostalAddressType_City(), this.getShortName(), "city", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_Country(), this.getShortName(), "country", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_PostalCode(), this.getShortName(), "postalCode", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_StateOrProvince(), this.getShortName(), "stateOrProvince", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_Street(), this.getShortName(), "street", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddressType_StreetNumber(), this.getString32(), "streetNumber", null, 0, 1, PostalAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryExpressionTypeEClass, QueryExpressionType.class, "QueryExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryExpressionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, QueryExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryExpressionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, QueryExpressionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryExpressionType_QueryLanguage(), this.getReferenceURI(), "queryLanguage", null, 1, 1, QueryExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryObjectListTypeEClass, RegistryObjectListType.class, "RegistryObjectListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryObjectListType_IdentifiableGroup(), ecorePackage.getEFeatureMapEntry(), "identifiableGroup", null, 0, -1, RegistryObjectListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectListType_Identifiable(), this.getIdentifiableType(), null, "identifiable", null, 0, -1, RegistryObjectListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(registryObjectTypeEClass, RegistryObjectType.class, "RegistryObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryObjectType_Name(), this.getInternationalStringType(), null, "name", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_Description(), this.getInternationalStringType(), null, "description", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_VersionInfo(), this.getVersionInfoType(), null, "versionInfo", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_Classification(), this.getClassificationType(), null, "classification", null, 0, -1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistryObjectType_ExternalIdentifier(), this.getExternalIdentifierType(), null, "externalIdentifier", null, 0, -1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryObjectType_Lid(), theXMLTypePackage.getAnyURI(), "lid", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryObjectType_ObjectType(), this.getReferenceURI(), "objectType", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryObjectType_Status(), this.getReferenceURI(), "status", null, 0, 1, RegistryObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryPackageTypeEClass, RegistryPackageType.class, "RegistryPackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistryPackageType_RegistryObjectList(), this.getRegistryObjectListType(), null, "registryObjectList", null, 0, 1, RegistryPackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryTypeEClass, RegistryType.class, "RegistryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryType_CatalogingLatency(), theXMLTypePackage.getDuration(), "catalogingLatency", "P1D", 0, 1, RegistryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryType_ConformanceProfile(), this.getConformanceProfileType(), "conformanceProfile", "registryLite", 0, 1, RegistryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryType_Operator(), this.getReferenceURI(), "operator", null, 1, 1, RegistryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryType_ReplicationSyncLatency(), theXMLTypePackage.getDuration(), "replicationSyncLatency", "P1D", 0, 1, RegistryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistryType_SpecificationVersion(), theXMLTypePackage.getString(), "specificationVersion", null, 1, 1, RegistryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBindingTypeEClass, ServiceBindingType.class, "ServiceBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBindingType_SpecificationLink(), this.getSpecificationLinkType(), null, "specificationLink", null, 0, -1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_AccessURI(), theXMLTypePackage.getAnyURI(), "accessURI", null, 0, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_Service(), this.getReferenceURI(), "service", null, 1, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_TargetBinding(), this.getReferenceURI(), "targetBinding", null, 0, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceType_ServiceBinding(), this.getServiceBindingType(), null, "serviceBinding", null, 0, -1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotListTypeEClass, SlotListType.class, "SlotListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotListType_Slot(), this.getSlotType1(), null, "slot", null, 0, -1, SlotListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotType1EClass, SlotType1.class, "SlotType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotType1_ValueList(), this.getValueListType(), null, "valueList", null, 1, 1, SlotType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType1_Name(), this.getLongName(), "name", null, 1, 1, SlotType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType1_SlotType(), this.getReferenceURI(), "slotType", null, 0, 1, SlotType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationLinkTypeEClass, SpecificationLinkType.class, "SpecificationLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationLinkType_UsageDescription(), this.getInternationalStringType(), null, "usageDescription", null, 0, 1, SpecificationLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationLinkType_UsageParameter(), this.getFreeFormText(), "usageParameter", null, 0, -1, SpecificationLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationLinkType_ServiceBinding(), this.getReferenceURI(), "serviceBinding", null, 1, 1, SpecificationLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationLinkType_SpecificationObject(), this.getReferenceURI(), "specificationObject", null, 1, 1, SpecificationLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionTypeEClass, SubscriptionType.class, "SubscriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscriptionType_ActionGroup(), ecorePackage.getEFeatureMapEntry(), "actionGroup", null, 0, -1, SubscriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscriptionType_Action(), this.getActionType(), null, "action", null, 0, -1, SubscriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionType_EndTime(), theXMLTypePackage.getDateTime(), "endTime", null, 0, 1, SubscriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionType_NotificationInterval(), theXMLTypePackage.getDuration(), "notificationInterval", null, 0, 1, SubscriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionType_Selector(), this.getReferenceURI(), "selector", null, 1, 1, SubscriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionType_StartTime(), theXMLTypePackage.getDateTime(), "startTime", null, 0, 1, SubscriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telephoneNumberListTypeEClass, TelephoneNumberListType.class, "TelephoneNumberListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelephoneNumberListType_TelephoneNumber(), this.getTelephoneNumberType(), null, "telephoneNumber", null, 0, -1, TelephoneNumberListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telephoneNumberTypeEClass, TelephoneNumberType.class, "TelephoneNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelephoneNumberType_AreaCode(), this.getString8(), "areaCode", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_CountryCode(), this.getString8(), "countryCode", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_Extension(), this.getString8(), "extension", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_Number(), this.getString16(), "number", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType_PhoneType(), this.getString32(), "phoneType", null, 0, 1, TelephoneNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTypeEClass, UserType.class, "UserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueListTypeEClass, ValueListType.class, "ValueListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ValueListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueListType_Value(), this.getLongName(), "value", null, 0, -1, ValueListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(versionInfoTypeEClass, VersionInfoType.class, "VersionInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionInfoType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, VersionInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInfoType_VersionName(), this.getString16(), "versionName", "1.1", 0, 1, VersionInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conformanceProfileTypeEEnum, ConformanceProfileType.class, "ConformanceProfileType");
		addEEnumLiteral(conformanceProfileTypeEEnum, ConformanceProfileType.REGISTRY_FULL_LITERAL);
		addEEnumLiteral(conformanceProfileTypeEEnum, ConformanceProfileType.REGISTRY_LITE_LITERAL);

		// Initialize data types
		initEDataType(conformanceProfileTypeObjectEDataType, ConformanceProfileType.class, "ConformanceProfileTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(freeFormTextEDataType, String.class, "FreeFormText", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longNameEDataType, String.class, "LongName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(referenceURIEDataType, String.class, "ReferenceURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shortNameEDataType, String.class, "ShortName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		  (actionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActionType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (adhocQueryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AdhocQueryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAdhocQueryType_QueryExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "QueryExpression",
			 "namespace", "##targetNamespace"
		   });			
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
		  (getAuditableEventType_AffectedObjects(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "affectedObjects",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditableEventType_EventType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventType"
		   });		
		addAnnotation
		  (getAuditableEventType_RequestId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "requestId"
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
		  (conformanceProfileTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "conformanceProfile_._type"
		   });		
		addAnnotation
		  (conformanceProfileTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "conformanceProfile_._type:Object",
			 "baseType", "conformanceProfile_._type"
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
		  (getDocumentRoot_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace"
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
		  (getDocumentRoot_AdhocQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdhocQuery",
			 "namespace", "##targetNamespace",
			 "affiliation", "RegistryObject"
		   });		
		addAnnotation
		  (getDocumentRoot_RegistryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObject",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_Identifiable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Identifiable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Association(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Association",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_AuditableEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditableEvent",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_Classification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Classification",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationNode",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassificationScheme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassificationScheme",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalLink",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_ExtrinsicObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtrinsicObject",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_Federation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Federation",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
		  (getDocumentRoot_LocalizedString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalizedString",
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
		  (getDocumentRoot_Notification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Notification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NotifyAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NotifyAction",
			 "namespace", "##targetNamespace",
			 "affiliation", "Action"
		   });		
		addAnnotation
		  (getDocumentRoot_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectRef",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_Person(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Person",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
		  (getDocumentRoot_QueryExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "QueryExpression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Registry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Registry",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBinding",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
		  (getDocumentRoot_SlotList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SlotList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpecificationLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpecificationLink",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
		   });		
		addAnnotation
		  (getDocumentRoot_Subscription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Subscription",
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
			 "namespace", "##targetNamespace",
			 "affiliation", "Identifiable"
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
			 "kind", "empty"
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
		  (getExtrinsicObjectType_ContentVersionInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ContentVersionInfo",
			 "namespace", "##targetNamespace"
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
		  (federationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FederationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFederationType_ReplicationSyncLatency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "replicationSyncLatency"
		   });		
		addAnnotation
		  (freeFormTextEDataType, 
		   source, 
		   new String[] {
			 "name", "FreeFormText",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "1024"
		   });			
		addAnnotation
		  (identifiableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IdentifiableType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIdentifiableType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIdentifiableType_Home(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "home"
		   });		
		addAnnotation
		  (getIdentifiableType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
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
			 "maxLength", "256"
		   });			
		addAnnotation
		  (notificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NotificationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotificationType_RegistryObjectList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistryObjectList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNotificationType_Subscription(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subscription"
		   });			
		addAnnotation
		  (notifyActionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NotifyActionType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNotifyActionType_EndPoint(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endPoint"
		   });		
		addAnnotation
		  (getNotifyActionType_NotificationOption(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "notificationOption"
		   });		
		addAnnotation
		  (objectRefListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ObjectRefListType",
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
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getObjectRefType_CreateReplica(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "createReplica"
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
		  (getOrganizationType_EmailAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddress",
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
			 "kind", "empty"
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
		  (personTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersonType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonType_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonType_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TelephoneNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonType_EmailAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmailAddress",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (postalAddressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PostalAddressType",
			 "kind", "empty"
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
		  (queryExpressionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "QueryExpressionType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getQueryExpressionType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getQueryExpressionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getQueryExpressionType_QueryLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "queryLanguage"
		   });			
		addAnnotation
		  (referenceURIEDataType, 
		   source, 
		   new String[] {
			 "name", "referenceURI",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (registryObjectListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryObjectListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryObjectListType_IdentifiableGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Identifiable:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegistryObjectListType_Identifiable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Identifiable",
			 "namespace", "##targetNamespace",
			 "group", "Identifiable:group"
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
		  (getRegistryObjectType_VersionInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VersionInfo",
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
		  (getRegistryObjectType_Lid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lid"
		   });		
		addAnnotation
		  (getRegistryObjectType_ObjectType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "objectType"
		   });		
		addAnnotation
		  (getRegistryObjectType_Status(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "status"
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
		  (registryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegistryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegistryType_CatalogingLatency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalogingLatency"
		   });		
		addAnnotation
		  (getRegistryType_ConformanceProfile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conformanceProfile"
		   });		
		addAnnotation
		  (getRegistryType_Operator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "operator"
		   });		
		addAnnotation
		  (getRegistryType_ReplicationSyncLatency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "replicationSyncLatency"
		   });		
		addAnnotation
		  (getRegistryType_SpecificationVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specificationVersion"
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
		  (slotListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SlotListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSlotListType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slot",
			 "namespace", "##targetNamespace"
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
		  (getSpecificationLinkType_ServiceBinding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serviceBinding"
		   });		
		addAnnotation
		  (getSpecificationLinkType_SpecificationObject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specificationObject"
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
		  (subscriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SubscriptionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubscriptionType_ActionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Action:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubscriptionType_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace",
			 "group", "Action:group"
		   });		
		addAnnotation
		  (getSubscriptionType_EndTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endTime"
		   });		
		addAnnotation
		  (getSubscriptionType_NotificationInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "notificationInterval"
		   });		
		addAnnotation
		  (getSubscriptionType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });		
		addAnnotation
		  (getSubscriptionType_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startTime"
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
		  (userTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UserType",
			 "kind", "elementOnly"
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
		addAnnotation
		  (versionInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VersionInfoType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getVersionInfoType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment"
		   });		
		addAnnotation
		  (getVersionInfoType_VersionName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "versionName"
		   });
	}

} //RimPackageImpl
