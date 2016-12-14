/**
 * <copyright>
 * </copyright>
 *
 * $Id: SlotType1.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getValueList <em>Value List</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getSlotType <em>Slot Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSlotType1()
 * @model extendedMetaData="name='SlotType1' kind='elementOnly'"
 * @generated
 */
public interface SlotType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value List</em>' containment reference.
	 * @see #setValueList(ValueListType)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSlotType1_ValueList()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='ValueList' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueListType getValueList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getValueList <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value List</em>' containment reference.
	 * @see #getValueList()
	 * @generated
	 */
	void setValueList(ValueListType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSlotType1_Name()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.LongName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Slot Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Type</em>' attribute.
	 * @see #setSlotType(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getSlotType1_SlotType()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='slotType'"
	 * @generated
	 */
	String getSlotType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.SlotType1#getSlotType <em>Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Type</em>' attribute.
	 * @see #getSlotType()
	 * @generated
	 */
	void setSlotType(String value);

} // SlotType1
