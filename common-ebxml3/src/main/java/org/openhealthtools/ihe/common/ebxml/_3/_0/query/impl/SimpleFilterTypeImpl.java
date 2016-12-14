/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleFilterTypeImpl.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.ComparatorType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.SimpleFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SimpleFilterTypeImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.SimpleFilterTypeImpl#getDomainAttribute <em>Domain Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SimpleFilterTypeImpl extends FilterTypeImpl implements SimpleFilterType {
	/**
	 * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparatorType COMPARATOR_EDEFAULT = ComparatorType.LE_LITERAL;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected ComparatorType comparator = COMPARATOR_EDEFAULT;

	/**
	 * This is true if the Comparator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comparatorESet = false;

	/**
	 * The default value of the '{@link #getDomainAttribute() <em>Domain Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainAttribute() <em>Domain Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAttribute()
	 * @generated
	 * @ordered
	 */
	protected String domainAttribute = DOMAIN_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleFilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SIMPLE_FILTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparatorType getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparator(ComparatorType newComparator) {
		ComparatorType oldComparator = comparator;
		comparator = newComparator == null ? COMPARATOR_EDEFAULT : newComparator;
		boolean oldComparatorESet = comparatorESet;
		comparatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_FILTER_TYPE__COMPARATOR, oldComparator, comparator, !oldComparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComparator() {
		ComparatorType oldComparator = comparator;
		boolean oldComparatorESet = comparatorESet;
		comparator = COMPARATOR_EDEFAULT;
		comparatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.SIMPLE_FILTER_TYPE__COMPARATOR, oldComparator, COMPARATOR_EDEFAULT, oldComparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComparator() {
		return comparatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainAttribute() {
		return domainAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainAttribute(String newDomainAttribute) {
		String oldDomainAttribute = domainAttribute;
		domainAttribute = newDomainAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE, oldDomainAttribute, domainAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.SIMPLE_FILTER_TYPE__COMPARATOR:
				return getComparator();
			case QueryPackage.SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE:
				return getDomainAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.SIMPLE_FILTER_TYPE__COMPARATOR:
				setComparator((ComparatorType)newValue);
				return;
			case QueryPackage.SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE:
				setDomainAttribute((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryPackage.SIMPLE_FILTER_TYPE__COMPARATOR:
				unsetComparator();
				return;
			case QueryPackage.SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE:
				setDomainAttribute(DOMAIN_ATTRIBUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryPackage.SIMPLE_FILTER_TYPE__COMPARATOR:
				return isSetComparator();
			case QueryPackage.SIMPLE_FILTER_TYPE__DOMAIN_ATTRIBUTE:
				return DOMAIN_ATTRIBUTE_EDEFAULT == null ? domainAttribute != null : !DOMAIN_ATTRIBUTE_EDEFAULT.equals(domainAttribute);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comparator: ");
		if (comparatorESet) result.append(comparator); else result.append("<unset>");
		result.append(", domainAttribute: ");
		result.append(domainAttribute);
		result.append(')');
		return result.toString();
	}

} //SimpleFilterTypeImpl
