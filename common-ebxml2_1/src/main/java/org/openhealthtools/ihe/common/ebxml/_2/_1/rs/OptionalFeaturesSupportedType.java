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
 * $Id: OptionalFeaturesSupportedType.java,v 1.1 2006/06/27 23:18:08 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Features Supported Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isXQuery <em>XQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getOptionalFeaturesSupportedType()
 * @model extendedMetaData="name='OptionalFeaturesSupported_._type' kind='empty'"
 * @generated
 */
public interface OptionalFeaturesSupportedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sql Query</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Query</em>' attribute.
	 * @see #isSetSqlQuery()
	 * @see #unsetSqlQuery()
	 * @see #setSqlQuery(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getOptionalFeaturesSupportedType_SqlQuery()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='sqlQuery'"
	 * @generated
	 */
	boolean isSqlQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isSqlQuery <em>Sql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Query</em>' attribute.
	 * @see #isSetSqlQuery()
	 * @see #unsetSqlQuery()
	 * @see #isSqlQuery()
	 * @generated
	 */
	void setSqlQuery(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isSqlQuery <em>Sql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSqlQuery()
	 * @see #isSqlQuery()
	 * @see #setSqlQuery(boolean)
	 * @generated
	 */
	void unsetSqlQuery();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isSqlQuery <em>Sql Query</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sql Query</em>' attribute is set.
	 * @see #unsetSqlQuery()
	 * @see #isSqlQuery()
	 * @see #setSqlQuery(boolean)
	 * @generated
	 */
	boolean isSetSqlQuery();

	/**
	 * Returns the value of the '<em><b>XQuery</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuery</em>' attribute.
	 * @see #isSetXQuery()
	 * @see #unsetXQuery()
	 * @see #setXQuery(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rs.RegistryPackage#getOptionalFeaturesSupportedType_XQuery()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='xQuery'"
	 * @generated
	 */
	boolean isXQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isXQuery <em>XQuery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuery</em>' attribute.
	 * @see #isSetXQuery()
	 * @see #unsetXQuery()
	 * @see #isXQuery()
	 * @generated
	 */
	void setXQuery(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isXQuery <em>XQuery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXQuery()
	 * @see #isXQuery()
	 * @see #setXQuery(boolean)
	 * @generated
	 */
	void unsetXQuery();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rs.OptionalFeaturesSupportedType#isXQuery <em>XQuery</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XQuery</em>' attribute is set.
	 * @see #unsetXQuery()
	 * @see #isXQuery()
	 * @see #setXQuery(boolean)
	 * @generated
	 */
	boolean isSetXQuery();

} // OptionalFeaturesSupportedType
