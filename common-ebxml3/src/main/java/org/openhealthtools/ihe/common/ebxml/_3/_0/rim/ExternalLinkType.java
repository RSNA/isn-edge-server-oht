/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalLinkType.java,v 1.1 2006/10/19 20:16:10 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.rim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         ExternalLink is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType#getExternalURI <em>External URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getExternalLinkType()
 * @model extendedMetaData="name='ExternalLinkType' kind='elementOnly'"
 * @generated
 */
public interface ExternalLinkType extends RegistryObjectType {
	/**
	 * Returns the value of the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External URI</em>' attribute.
	 * @see #setExternalURI(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.rim.RimPackage#getExternalLinkType_ExternalURI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='externalURI'"
	 * @generated
	 */
	String getExternalURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.rim.ExternalLinkType#getExternalURI <em>External URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External URI</em>' attribute.
	 * @see #getExternalURI()
	 * @generated
	 */
	void setExternalURI(String value);

} // ExternalLinkType
