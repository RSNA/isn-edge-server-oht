/**
 * <copyright>
 * </copyright>
 *
 * $Id: AcceptObjectsRequestType.java,v 1.1 2006/10/19 20:16:02 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.lcm;

import org.openhealthtools.ihe.common.ebxml._3._0.rs.RegistryRequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Objects Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType#getCorrelationId <em>Correlation Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getAcceptObjectsRequestType()
 * @model extendedMetaData="name='AcceptObjectsRequest_._type' kind='elementOnly'"
 * @generated
 */
public interface AcceptObjectsRequestType extends RegistryRequestType {
	/**
	 * Returns the value of the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Id</em>' attribute.
	 * @see #setCorrelationId(String)
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.lcm.LCMPackage#getAcceptObjectsRequestType_CorrelationId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='correlationId'"
	 * @generated
	 */
	String getCorrelationId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.ihe.common.ebxml._3._0.lcm.AcceptObjectsRequestType#getCorrelationId <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Id</em>' attribute.
	 * @see #getCorrelationId()
	 * @generated
	 */
	void setCorrelationId(String value);

} // AcceptObjectsRequestType
