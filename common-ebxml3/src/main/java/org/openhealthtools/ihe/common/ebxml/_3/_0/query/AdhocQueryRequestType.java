/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdhocQueryRequestType.java,v 1.1 2006/10/19 20:16:08 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import java.math.BigInteger;


import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adhoc Query Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#isFederated <em>Federated</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getFederation <em>Federation</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getMaxResults <em>Max Results</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getStartIndex <em>Start Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryRequestType()
 * @model extendedMetaData="name='AdhocQueryRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface AdhocQueryRequestType extends RegistryRequestType {
	/**
	 * Returns the value of the '<em><b>Response Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Option</em>' containment reference.
	 * @see #setResponseOption(ResponseOptionType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryRequestType_ResponseOption()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='ResponseOption' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseOptionType getResponseOption();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getResponseOption <em>Response Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Option</em>' containment reference.
	 * @see #getResponseOption()
	 * @generated
	 */
	void setResponseOption(ResponseOptionType value);

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryRequestType_AdhocQuery()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='AdhocQuery' namespace='urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0'"
	 * @generated
	 */
	AdhocQueryType getAdhocQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getAdhocQuery <em>Adhoc Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adhoc Query</em>' containment reference.
	 * @see #getAdhocQuery()
	 * @generated
	 */
	void setAdhocQuery(AdhocQueryType value);

	/**
	 * Returns the value of the '<em><b>Federated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federated</em>' attribute.
	 * @see #isSetFederated()
	 * @see #unsetFederated()
	 * @see #setFederated(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryRequestType_Federated()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='federated'"
	 * @generated
	 */
	boolean isFederated();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#isFederated <em>Federated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federated</em>' attribute.
	 * @see #isSetFederated()
	 * @see #unsetFederated()
	 * @see #isFederated()
	 * @generated
	 */
	void setFederated(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#isFederated <em>Federated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFederated()
	 * @see #isFederated()
	 * @see #setFederated(boolean)
	 * @generated
	 */
	void unsetFederated();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#isFederated <em>Federated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Federated</em>' attribute is set.
	 * @see #unsetFederated()
	 * @see #isFederated()
	 * @see #setFederated(boolean)
	 * @generated
	 */
	boolean isSetFederated();

	/**
	 * Returns the value of the '<em><b>Federation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation</em>' attribute.
	 * @see #setFederation(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryRequestType_Federation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='federation'"
	 * @generated
	 */
	String getFederation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getFederation <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation</em>' attribute.
	 * @see #getFederation()
	 * @generated
	 */
	void setFederation(String value);

	/**
	 * Returns the value of the '<em><b>Max Results</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Results</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Results</em>' attribute.
	 * @see #isSetMaxResults()
	 * @see #unsetMaxResults()
	 * @see #setMaxResults(BigInteger)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryRequestType_MaxResults()
	 * @model default="-1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='maxResults'"
	 * @generated
	 */
	BigInteger getMaxResults();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getMaxResults <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Results</em>' attribute.
	 * @see #isSetMaxResults()
	 * @see #unsetMaxResults()
	 * @see #getMaxResults()
	 * @generated
	 */
	void setMaxResults(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getMaxResults <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResults()
	 * @see #getMaxResults()
	 * @see #setMaxResults(BigInteger)
	 * @generated
	 */
	void unsetMaxResults();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getMaxResults <em>Max Results</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Results</em>' attribute is set.
	 * @see #unsetMaxResults()
	 * @see #getMaxResults()
	 * @see #setMaxResults(BigInteger)
	 * @generated
	 */
	boolean isSetMaxResults();

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
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getAdhocQueryRequestType_StartIndex()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='startIndex'"
	 * @generated
	 */
	BigInteger getStartIndex();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getStartIndex <em>Start Index</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getStartIndex <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartIndex()
	 * @see #getStartIndex()
	 * @see #setStartIndex(BigInteger)
	 * @generated
	 */
	void unsetStartIndex();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType#getStartIndex <em>Start Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Index</em>' attribute is set.
	 * @see #unsetStartIndex()
	 * @see #getStartIndex()
	 * @see #setStartIndex(BigInteger)
	 * @generated
	 */
	boolean isSetStartIndex();

} // AdhocQueryRequestType
