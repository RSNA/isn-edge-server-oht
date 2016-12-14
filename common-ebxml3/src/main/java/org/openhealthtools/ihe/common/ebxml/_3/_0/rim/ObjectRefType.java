/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectRefType.java,v 1.1 2006/10/19 20:16:11 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Use to reference an Object by its id.
 *         Specifies the id attribute of the object as its id attribute.
 *         id attribute in ObjectAttributes is exactly the same syntax and semantics as
 *         id attribute in RegistryObject.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType#isCreateReplica <em>Create Replica</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getObjectRefType()
 * @model extendedMetaData="name='ObjectRefType' kind='elementOnly'"
 * @generated
 */
public interface ObjectRefType extends IdentifiableType {
	/**
	 * Returns the value of the '<em><b>Create Replica</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Replica</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Replica</em>' attribute.
	 * @see #isSetCreateReplica()
	 * @see #unsetCreateReplica()
	 * @see #setCreateReplica(boolean)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getObjectRefType_CreateReplica()
	 * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='createReplica'"
	 * @generated
	 */
	boolean isCreateReplica();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType#isCreateReplica <em>Create Replica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Replica</em>' attribute.
	 * @see #isSetCreateReplica()
	 * @see #unsetCreateReplica()
	 * @see #isCreateReplica()
	 * @generated
	 */
	void setCreateReplica(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType#isCreateReplica <em>Create Replica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateReplica()
	 * @see #isCreateReplica()
	 * @see #setCreateReplica(boolean)
	 * @generated
	 */
	void unsetCreateReplica();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ObjectRefType#isCreateReplica <em>Create Replica</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Replica</em>' attribute is set.
	 * @see #unsetCreateReplica()
	 * @see #isCreateReplica()
	 * @see #setCreateReplica(boolean)
	 * @generated
	 */
	boolean isSetCreateReplica();

} // ObjectRefType
