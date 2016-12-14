/**
 * <copyright>
 * </copyright>
 *
 * $Id: RimAdapterFactory.java,v 1.1 2006/10/19 20:16:38 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.ihe.common.ebxml._3._0.rim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage
 * @generated
 */
public class RimAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RimPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RimSwitch modelSwitch =
		new RimSwitch() {
			public Object caseActionType(ActionType object) {
				return createActionTypeAdapter();
			}
			public Object caseAdhocQueryType(AdhocQueryType object) {
				return createAdhocQueryTypeAdapter();
			}
			public Object caseAssociationType1(AssociationType1 object) {
				return createAssociationType1Adapter();
			}
			public Object caseAuditableEventType(AuditableEventType object) {
				return createAuditableEventTypeAdapter();
			}
			public Object caseClassificationNodeType(ClassificationNodeType object) {
				return createClassificationNodeTypeAdapter();
			}
			public Object caseClassificationSchemeType(ClassificationSchemeType object) {
				return createClassificationSchemeTypeAdapter();
			}
			public Object caseClassificationType(ClassificationType object) {
				return createClassificationTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseEmailAddressType(EmailAddressType object) {
				return createEmailAddressTypeAdapter();
			}
			public Object caseExternalIdentifierType(ExternalIdentifierType object) {
				return createExternalIdentifierTypeAdapter();
			}
			public Object caseExternalLinkType(ExternalLinkType object) {
				return createExternalLinkTypeAdapter();
			}
			public Object caseExtrinsicObjectType(ExtrinsicObjectType object) {
				return createExtrinsicObjectTypeAdapter();
			}
			public Object caseFederationType(FederationType object) {
				return createFederationTypeAdapter();
			}
			public Object caseIdentifiableType(IdentifiableType object) {
				return createIdentifiableTypeAdapter();
			}
			public Object caseInternationalStringType(InternationalStringType object) {
				return createInternationalStringTypeAdapter();
			}
			public Object caseLocalizedStringType(LocalizedStringType object) {
				return createLocalizedStringTypeAdapter();
			}
			public Object caseNotificationType(NotificationType object) {
				return createNotificationTypeAdapter();
			}
			public Object caseNotifyActionType(NotifyActionType object) {
				return createNotifyActionTypeAdapter();
			}
			public Object caseObjectRefListType(ObjectRefListType object) {
				return createObjectRefListTypeAdapter();
			}
			public Object caseObjectRefType(ObjectRefType object) {
				return createObjectRefTypeAdapter();
			}
			public Object caseOrganizationType(OrganizationType object) {
				return createOrganizationTypeAdapter();
			}
			public Object casePersonNameType(PersonNameType object) {
				return createPersonNameTypeAdapter();
			}
			public Object casePersonType(PersonType object) {
				return createPersonTypeAdapter();
			}
			public Object casePostalAddressType(PostalAddressType object) {
				return createPostalAddressTypeAdapter();
			}
			public Object caseQueryExpressionType(QueryExpressionType object) {
				return createQueryExpressionTypeAdapter();
			}
			public Object caseRegistryObjectListType(RegistryObjectListType object) {
				return createRegistryObjectListTypeAdapter();
			}
			public Object caseRegistryObjectType(RegistryObjectType object) {
				return createRegistryObjectTypeAdapter();
			}
			public Object caseRegistryPackageType(RegistryPackageType object) {
				return createRegistryPackageTypeAdapter();
			}
			public Object caseRegistryType(RegistryType object) {
				return createRegistryTypeAdapter();
			}
			public Object caseServiceBindingType(ServiceBindingType object) {
				return createServiceBindingTypeAdapter();
			}
			public Object caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			public Object caseSlotListType(SlotListType object) {
				return createSlotListTypeAdapter();
			}
			public Object caseSlotType1(SlotType1 object) {
				return createSlotType1Adapter();
			}
			public Object caseSpecificationLinkType(SpecificationLinkType object) {
				return createSpecificationLinkTypeAdapter();
			}
			public Object caseSubscriptionType(SubscriptionType object) {
				return createSubscriptionTypeAdapter();
			}
			public Object caseTelephoneNumberListType(TelephoneNumberListType object) {
				return createTelephoneNumberListTypeAdapter();
			}
			public Object caseTelephoneNumberType(TelephoneNumberType object) {
				return createTelephoneNumberTypeAdapter();
			}
			public Object caseUserType(UserType object) {
				return createUserTypeAdapter();
			}
			public Object caseValueListType(ValueListType object) {
				return createValueListTypeAdapter();
			}
			public Object caseVersionInfoType(VersionInfoType object) {
				return createVersionInfoTypeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ActionType
	 * @generated
	 */
	public Adapter createActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType <em>Adhoc Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType
	 * @generated
	 */
	public Adapter createAdhocQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1 <em>Association Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AssociationType1
	 * @generated
	 */
	public Adapter createAssociationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType <em>Auditable Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.AuditableEventType
	 * @generated
	 */
	public Adapter createAuditableEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType <em>Classification Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationNodeType
	 * @generated
	 */
	public Adapter createClassificationNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType <em>Classification Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationSchemeType
	 * @generated
	 */
	public Adapter createClassificationSchemeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType <em>Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType
	 * @generated
	 */
	public Adapter createClassificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType <em>Email Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.EmailAddressType
	 * @generated
	 */
	public Adapter createEmailAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType <em>External Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalIdentifierType
	 * @generated
	 */
	public Adapter createExternalIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType <em>External Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType
	 * @generated
	 */
	public Adapter createExternalLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType <em>Extrinsic Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ExtrinsicObjectType
	 * @generated
	 */
	public Adapter createExtrinsicObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType <em>Federation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.FederationType
	 * @generated
	 */
	public Adapter createFederationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType <em>Identifiable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.IdentifiableType
	 * @generated
	 */
	public Adapter createIdentifiableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType <em>International String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.InternationalStringType
	 * @generated
	 */
	public Adapter createInternationalStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType <em>Localized String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.LocalizedStringType
	 * @generated
	 */
	public Adapter createLocalizedStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotificationType
	 * @generated
	 */
	public Adapter createNotificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType <em>Notify Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.NotifyActionType
	 * @generated
	 */
	public Adapter createNotifyActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType <em>Object Ref List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefListType
	 * @generated
	 */
	public Adapter createObjectRefListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType <em>Object Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType
	 * @generated
	 */
	public Adapter createObjectRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.OrganizationType
	 * @generated
	 */
	public Adapter createOrganizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonNameType
	 * @generated
	 */
	public Adapter createPersonNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PersonType
	 * @generated
	 */
	public Adapter createPersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType <em>Postal Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.PostalAddressType
	 * @generated
	 */
	public Adapter createPostalAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType <em>Query Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.QueryExpressionType
	 * @generated
	 */
	public Adapter createQueryExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType <em>Registry Object List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType
	 * @generated
	 */
	public Adapter createRegistryObjectListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType <em>Registry Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectType
	 * @generated
	 */
	public Adapter createRegistryObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType <em>Registry Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryPackageType
	 * @generated
	 */
	public Adapter createRegistryPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType <em>Registry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryType
	 * @generated
	 */
	public Adapter createRegistryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType <em>Service Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceBindingType
	 * @generated
	 */
	public Adapter createServiceBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType <em>Slot List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotListType
	 * @generated
	 */
	public Adapter createSlotListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1 <em>Slot Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1
	 * @generated
	 */
	public Adapter createSlotType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType <em>Specification Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SpecificationLinkType
	 * @generated
	 */
	public Adapter createSpecificationLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType <em>Subscription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.SubscriptionType
	 * @generated
	 */
	public Adapter createSubscriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType <em>Telephone Number List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberListType
	 * @generated
	 */
	public Adapter createTelephoneNumberListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType <em>Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.TelephoneNumberType
	 * @generated
	 */
	public Adapter createTelephoneNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.UserType
	 * @generated
	 */
	public Adapter createUserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType <em>Value List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.ValueListType
	 * @generated
	 */
	public Adapter createValueListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType <em>Version Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.VersionInfoType
	 * @generated
	 */
	public Adapter createVersionInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RimAdapterFactory
