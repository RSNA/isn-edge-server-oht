/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassificationType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Classification is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *         A Classification specifies references to two registry entrys.
 *         The classifiedObject is id of the Object being classified.
 *         The classificationNode is id of the ClassificationNode classying the object
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationNode <em>Classification Node</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationScheme <em>Classification Scheme</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassifiedObject <em>Classified Object</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getNodeRepresentation <em>Node Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getClassificationType()
 * @model extendedMetaData="name='ClassificationType' kind='elementOnly'"
 * @generated
 */
public interface ClassificationType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>Classification Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Node</em>' attribute.
	 * @see #setClassificationNode(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getClassificationType_ClassificationNode()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='classificationNode'"
	 * @generated
	 */
	String getClassificationNode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationNode <em>Classification Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Node</em>' attribute.
	 * @see #getClassificationNode()
	 * @generated
	 */
	void setClassificationNode(String value);

	/**
	 * Returns the value of the '<em><b>Classification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Scheme</em>' attribute.
	 * @see #setClassificationScheme(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getClassificationType_ClassificationScheme()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI"
	 *        extendedMetaData="kind='attribute' name='classificationScheme'"
	 * @generated
	 */
	String getClassificationScheme();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassificationScheme <em>Classification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Scheme</em>' attribute.
	 * @see #getClassificationScheme()
	 * @generated
	 */
	void setClassificationScheme(String value);

	/**
	 * Returns the value of the '<em><b>Classified Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Object</em>' attribute.
	 * @see #setClassifiedObject(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getClassificationType_ClassifiedObject()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.ReferenceURI" required="true"
	 *        extendedMetaData="kind='attribute' name='classifiedObject'"
	 * @generated
	 */
	String getClassifiedObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getClassifiedObject <em>Classified Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified Object</em>' attribute.
	 * @see #getClassifiedObject()
	 * @generated
	 */
	void setClassifiedObject(String value);

	/**
	 * Returns the value of the '<em><b>Node Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Representation</em>' attribute.
	 * @see #setNodeRepresentation(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getClassificationType_NodeRepresentation()
	 * @model unique="false" dataType="org.openhealthtools.ihe.common.ebxml._3._0.rim.LongName"
	 *        extendedMetaData="kind='attribute' name='nodeRepresentation'"
	 * @generated
	 */
	String getNodeRepresentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ClassificationType#getNodeRepresentation <em>Node Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Representation</em>' attribute.
	 * @see #getNodeRepresentation()
	 * @generated
	 */
	void setNodeRepresentation(String value);

} // ClassificationType
