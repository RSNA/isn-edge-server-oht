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
 * $Id: PostalAddressType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * Mapping of the same named interface in ebRIM.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCity <em>City</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreet <em>Street</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreetNumber <em>Street Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType()
 * @model extendedMetaData="name='PostalAddressType' kind='elementOnly'"
 * @generated
 */
public interface PostalAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_Slot()
	 * @model type="org.openhealthtools.ihe.common.ebxml._2._1.rim.SlotType1" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getSlot();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_City()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='city'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_Country()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='country'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_PostalCode()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='postalCode'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Or Province</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #setStateOrProvince(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_StateOrProvince()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='stateOrProvince'"
	 * @generated
	 */
	String getStateOrProvince();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #getStateOrProvince()
	 * @generated
	 */
	void setStateOrProvince(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_Street()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='street'"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Number</em>' attribute.
	 * @see #setStreetNumber(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getPostalAddressType_StreetNumber()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.String32"
	 *        extendedMetaData="kind='attribute' name='streetNumber'"
	 * @generated
	 */
	String getStreetNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.PostalAddressType#getStreetNumber <em>Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Number</em>' attribute.
	 * @see #getStreetNumber()
	 * @generated
	 */
	void setStreetNumber(String value);

} // PostalAddressType
