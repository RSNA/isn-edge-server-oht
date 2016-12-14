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
 * $Id: RegistryEntryType.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getExpiration <em>Expiration</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStability <em>Stability</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getUserVersion <em>User Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getRegistryEntryType()
 * @model extendedMetaData="name='RegistryEntryType' kind='elementOnly'"
 * @generated
 */
public interface RegistryEntryType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration</em>' attribute.
	 * @see #setExpiration(Object)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getRegistryEntryType_Expiration()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='expiration'"
	 * @generated
	 */
	Object getExpiration();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getExpiration <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration</em>' attribute.
	 * @see #getExpiration()
	 * @generated
	 */
	void setExpiration(Object value);

	/**
	 * Returns the value of the '<em><b>Major Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Version</em>' attribute.
	 * @see #isSetMajorVersion()
	 * @see #unsetMajorVersion()
	 * @see #setMajorVersion(BigInteger)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getRegistryEntryType_MajorVersion()
	 * @model default="1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='majorVersion'"
	 * @generated
	 */
	BigInteger getMajorVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version</em>' attribute.
	 * @see #isSetMajorVersion()
	 * @see #unsetMajorVersion()
	 * @see #getMajorVersion()
	 * @generated
	 */
	void setMajorVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMajorVersion()
	 * @see #getMajorVersion()
	 * @see #setMajorVersion(BigInteger)
	 * @generated
	 */
	void unsetMajorVersion();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMajorVersion <em>Major Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Major Version</em>' attribute is set.
	 * @see #unsetMajorVersion()
	 * @see #getMajorVersion()
	 * @see #setMajorVersion(BigInteger)
	 * @generated
	 */
	boolean isSetMajorVersion();

	/**
	 * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor Version</em>' attribute.
	 * @see #isSetMinorVersion()
	 * @see #unsetMinorVersion()
	 * @see #setMinorVersion(BigInteger)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getRegistryEntryType_MinorVersion()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='minorVersion'"
	 * @generated
	 */
	BigInteger getMinorVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version</em>' attribute.
	 * @see #isSetMinorVersion()
	 * @see #unsetMinorVersion()
	 * @see #getMinorVersion()
	 * @generated
	 */
	void setMinorVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinorVersion()
	 * @see #getMinorVersion()
	 * @see #setMinorVersion(BigInteger)
	 * @generated
	 */
	void unsetMinorVersion();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getMinorVersion <em>Minor Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minor Version</em>' attribute is set.
	 * @see #unsetMinorVersion()
	 * @see #getMinorVersion()
	 * @see #setMinorVersion(BigInteger)
	 * @generated
	 */
	boolean isSetMinorVersion();

	/**
	 * Returns the value of the '<em><b>Stability</b></em>' attribute.
	 * The default value is <code>"Dynamic"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stability</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
	 * @see #isSetStability()
	 * @see #unsetStability()
	 * @see #setStability(StabilityType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getRegistryEntryType_Stability()
	 * @model default="Dynamic" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stability'"
	 * @generated
	 */
	StabilityType getStability();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStability <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stability</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StabilityType
	 * @see #isSetStability()
	 * @see #unsetStability()
	 * @see #getStability()
	 * @generated
	 */
	void setStability(StabilityType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStability <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStability()
	 * @see #getStability()
	 * @see #setStability(StabilityType)
	 * @generated
	 */
	void unsetStability();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStability <em>Stability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stability</em>' attribute is set.
	 * @see #unsetStability()
	 * @see #getStability()
	 * @see #setStability(StabilityType)
	 * @generated
	 */
	boolean isSetStability();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"Submitted"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(StatusType)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getRegistryEntryType_Status()
	 * @model default="Submitted" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>User Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Version</em>' attribute.
	 * @see #setUserVersion(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getRegistryEntryType_UserVersion()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.ShortName"
	 *        extendedMetaData="kind='attribute' name='userVersion'"
	 * @generated
	 */
	String getUserVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.RegistryEntryType#getUserVersion <em>User Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Version</em>' attribute.
	 * @see #getUserVersion()
	 * @generated
	 */
	void setUserVersion(String value);

} // RegistryEntryType
