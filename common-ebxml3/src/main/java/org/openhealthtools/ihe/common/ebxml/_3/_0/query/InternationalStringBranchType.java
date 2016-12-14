/**
 * <copyright>
 * </copyright>
 *
 * $Id: InternationalStringBranchType.java,v 1.1 2006/10/19 20:16:09 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>International String Branch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.InternationalStringBranchType#getLocalizedStringFilter <em>Localized String Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getInternationalStringBranchType()
 * @model extendedMetaData="name='InternationalStringBranchType' kind='elementOnly'"
 * @generated
 */
public interface InternationalStringBranchType extends BranchType {
	/**
	 * Returns the value of the '<em><b>Localized String Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localized String Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized String Filter</em>' containment reference list.
	 * @see org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage#getInternationalStringBranchType_LocalizedStringFilter()
	 * @model type="org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='LocalizedStringFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getLocalizedStringFilter();

} // InternationalStringBranchType
