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
 * $Id: AssociationType1.java,v 1.1 2006/06/27 23:18:01 esmith Exp $
 */
package org.openhealthtools.ihe.common.ebxml._2._1.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * Association is the mapping of the same named interface in ebRIM.
 * It extends RegistryObject.
 * 
 * An Association specifies references to two previously submitted
 * registry entrys.
 * 
 * The sourceObject is id of the sourceObject in association
 * The targetObject is id of the targetObject in association
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedBySourceOwner <em>Is Confirmed By Source Owner</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedByTargetOwner <em>Is Confirmed By Target Owner</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getTargetObject <em>Target Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAssociationType1()
 * @model extendedMetaData="name='AssociationType1' kind='elementOnly'"
 * @generated
 */
public interface AssociationType1 extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' attribute.
	 * @see #setAssociationType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAssociationType1_AssociationType()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._2._1.rim.LongName" required="true"
	 *        extendedMetaData="kind='attribute' name='associationType'"
	 * @generated
	 */
	String getAssociationType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getAssociationType <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' attribute.
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(String value);

	/**
	 * Returns the value of the '<em><b>Is Confirmed By Source Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Confirmed By Source Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Confirmed By Source Owner</em>' attribute.
	 * @see #isSetIsConfirmedBySourceOwner()
	 * @see #unsetIsConfirmedBySourceOwner()
	 * @see #setIsConfirmedBySourceOwner(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAssociationType1_IsConfirmedBySourceOwner()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isConfirmedBySourceOwner'"
	 * @generated
	 */
	boolean isIsConfirmedBySourceOwner();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedBySourceOwner <em>Is Confirmed By Source Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Confirmed By Source Owner</em>' attribute.
	 * @see #isSetIsConfirmedBySourceOwner()
	 * @see #unsetIsConfirmedBySourceOwner()
	 * @see #isIsConfirmedBySourceOwner()
	 * @generated
	 */
	void setIsConfirmedBySourceOwner(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedBySourceOwner <em>Is Confirmed By Source Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConfirmedBySourceOwner()
	 * @see #isIsConfirmedBySourceOwner()
	 * @see #setIsConfirmedBySourceOwner(boolean)
	 * @generated
	 */
	void unsetIsConfirmedBySourceOwner();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedBySourceOwner <em>Is Confirmed By Source Owner</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Confirmed By Source Owner</em>' attribute is set.
	 * @see #unsetIsConfirmedBySourceOwner()
	 * @see #isIsConfirmedBySourceOwner()
	 * @see #setIsConfirmedBySourceOwner(boolean)
	 * @generated
	 */
	boolean isSetIsConfirmedBySourceOwner();

	/**
	 * Returns the value of the '<em><b>Is Confirmed By Target Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Confirmed By Target Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Confirmed By Target Owner</em>' attribute.
	 * @see #isSetIsConfirmedByTargetOwner()
	 * @see #unsetIsConfirmedByTargetOwner()
	 * @see #setIsConfirmedByTargetOwner(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAssociationType1_IsConfirmedByTargetOwner()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isConfirmedByTargetOwner'"
	 * @generated
	 */
	boolean isIsConfirmedByTargetOwner();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedByTargetOwner <em>Is Confirmed By Target Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Confirmed By Target Owner</em>' attribute.
	 * @see #isSetIsConfirmedByTargetOwner()
	 * @see #unsetIsConfirmedByTargetOwner()
	 * @see #isIsConfirmedByTargetOwner()
	 * @generated
	 */
	void setIsConfirmedByTargetOwner(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedByTargetOwner <em>Is Confirmed By Target Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConfirmedByTargetOwner()
	 * @see #isIsConfirmedByTargetOwner()
	 * @see #setIsConfirmedByTargetOwner(boolean)
	 * @generated
	 */
	void unsetIsConfirmedByTargetOwner();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#isIsConfirmedByTargetOwner <em>Is Confirmed By Target Owner</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Confirmed By Target Owner</em>' attribute is set.
	 * @see #unsetIsConfirmedByTargetOwner()
	 * @see #isIsConfirmedByTargetOwner()
	 * @see #setIsConfirmedByTargetOwner(boolean)
	 * @generated
	 */
	boolean isSetIsConfirmedByTargetOwner();

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object</em>' attribute.
	 * @see #setSourceObject(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAssociationType1_SourceObject()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='sourceObject'"
	 * @generated
	 */
	String getSourceObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getSourceObject <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' attribute.
	 * @see #getSourceObject()
	 * @generated
	 */
	void setSourceObject(String value);

	/**
	 * Returns the value of the '<em><b>Target Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Object</em>' attribute.
	 * @see #setTargetObject(String)
	 * @see org.openhealthtools.ihe.common.ebxml._2._1.rim.RimPackage#getAssociationType1_TargetObject()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='targetObject'"
	 * @generated
	 */
	String getTargetObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._2._1.rim.AssociationType1#getTargetObject <em>Target Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Object</em>' attribute.
	 * @see #getTargetObject()
	 * @generated
	 */
	void setTargetObject(String value);

} // AssociationType1
