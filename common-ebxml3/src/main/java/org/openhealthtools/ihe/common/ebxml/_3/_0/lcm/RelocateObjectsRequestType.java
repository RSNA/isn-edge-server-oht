/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelocateObjectsRequestType.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relocate Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getSourceRegistry <em>Source Registry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getDestinationRegistry <em>Destination Registry</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtSource <em>Owner At Source</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtDestination <em>Owner At Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRelocateObjectsRequestType()
 * @model extendedMetaData="name='RelocateObjectsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface RelocateObjectsRequestType extends RegistryRequestType {
	/**
	 * Returns the value of the '<em><b>Adhoc Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adhoc Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adhoc Query</em>' containment reference.
	 * @see #setAdhocQuery(AdhocQueryType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRelocateObjectsRequestType_AdhocQuery()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='AdhocQuery' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	AdhocQueryType getAdhocQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getAdhocQuery <em>Adhoc Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query</em>' containment reference.
	 * @see #getAdhocQuery()
	 * @generated
	 */
	void setAdhocQuery(AdhocQueryType value);

	/**
	 * Returns the value of the '<em><b>Source Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Registry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Registry</em>' containment reference.
	 * @see #setSourceRegistry(ObjectRefType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRelocateObjectsRequestType_SourceRegistry()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='SourceRegistry' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefType getSourceRegistry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getSourceRegistry <em>Source Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Registry</em>' containment reference.
	 * @see #getSourceRegistry()
	 * @generated
	 */
	void setSourceRegistry(ObjectRefType value);

	/**
	 * Returns the value of the '<em><b>Destination Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Registry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Registry</em>' containment reference.
	 * @see #setDestinationRegistry(ObjectRefType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRelocateObjectsRequestType_DestinationRegistry()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='DestinationRegistry' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefType getDestinationRegistry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getDestinationRegistry <em>Destination Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Registry</em>' containment reference.
	 * @see #getDestinationRegistry()
	 * @generated
	 */
	void setDestinationRegistry(ObjectRefType value);

	/**
	 * Returns the value of the '<em><b>Owner At Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner At Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner At Source</em>' containment reference.
	 * @see #setOwnerAtSource(ObjectRefType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRelocateObjectsRequestType_OwnerAtSource()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='OwnerAtSource' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefType getOwnerAtSource();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtSource <em>Owner At Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner At Source</em>' containment reference.
	 * @see #getOwnerAtSource()
	 * @generated
	 */
	void setOwnerAtSource(ObjectRefType value);

	/**
	 * Returns the value of the '<em><b>Owner At Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner At Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner At Destination</em>' containment reference.
	 * @see #setOwnerAtDestination(ObjectRefType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getRelocateObjectsRequestType_OwnerAtDestination()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='OwnerAtDestination' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefType getOwnerAtDestination();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.RelocateObjectsRequestType#getOwnerAtDestination <em>Owner At Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner At Destination</em>' containment reference.
	 * @see #getOwnerAtDestination()
	 * @generated
	 */
	void setOwnerAtDestination(ObjectRefType value);

} // RelocateObjectsRequestType
