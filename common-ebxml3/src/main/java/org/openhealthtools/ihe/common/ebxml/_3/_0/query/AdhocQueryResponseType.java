/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdhocQueryResponseType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import java.math.BigInteger;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.RegistryObjectListType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryResponseType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adhoc Query Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getRegistryObjectList <em>Registry Object List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getTotalResultCount <em>Total Result Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryResponseType()
 * @model extendedMetaData="name='AdhocQueryResponse_._type' kind='elementOnly'"
 * @generated
 */
public interface AdhocQueryResponseType extends RegistryResponseType {
	/**
	 * Returns the value of the '<em><b>Registry Object List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Object List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Object List</em>' containment reference.
	 * @see #setRegistryObjectList(RegistryObjectListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryResponseType_RegistryObjectList()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='RegistryObjectList' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	RegistryObjectListType getRegistryObjectList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getRegistryObjectList <em>Registry Object List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Object List</em>' containment reference.
	 * @see #getRegistryObjectList()
	 * @generated
	 */
	void setRegistryObjectList(RegistryObjectListType value);

	/**
	 * Returns the value of the '<em><b>Start Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Index</em>' attribute.
	 * @see #isSetStartIndex()
	 * @see #unsetStartIndex()
	 * @see #setStartIndex(BigInteger)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryResponseType_StartIndex()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='startIndex'"
	 * @generated
	 */
	BigInteger getStartIndex();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getStartIndex <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Index</em>' attribute.
	 * @see #isSetStartIndex()
	 * @see #unsetStartIndex()
	 * @see #getStartIndex()
	 * @generated
	 */
	void setStartIndex(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getStartIndex <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartIndex()
	 * @see #getStartIndex()
	 * @see #setStartIndex(BigInteger)
	 * @generated
	 */
	void unsetStartIndex();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getStartIndex <em>Start Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Index</em>' attribute is set.
	 * @see #unsetStartIndex()
	 * @see #getStartIndex()
	 * @see #setStartIndex(BigInteger)
	 * @generated
	 */
	boolean isSetStartIndex();

	/**
	 * Returns the value of the '<em><b>Total Result Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Result Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Result Count</em>' attribute.
	 * @see #setTotalResultCount(BigInteger)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryResponseType_TotalResultCount()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='totalResultCount'"
	 * @generated
	 */
	BigInteger getTotalResultCount();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryResponseType#getTotalResultCount <em>Total Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Result Count</em>' attribute.
	 * @see #getTotalResultCount()
	 * @generated
	 */
	void setTotalResultCount(BigInteger value);

} // AdhocQueryResponseType
