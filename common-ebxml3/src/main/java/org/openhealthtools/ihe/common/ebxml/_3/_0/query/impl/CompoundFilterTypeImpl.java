/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompoundFilterTypeImpl.java,v 1.1 2006/10/19 20:16:24 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.CompoundFilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.FilterType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.LogicalOperatorType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.CompoundFilterTypeImpl#getLeftFilter <em>Left Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.CompoundFilterTypeImpl#getRightFilter <em>Right Filter</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.CompoundFilterTypeImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundFilterTypeImpl extends FilterTypeImpl implements CompoundFilterType {
	/**
	 * The cached value of the '{@link #getLeftFilter() <em>Left Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType leftFilter = null;

	/**
	 * The cached value of the '{@link #getRightFilter() <em>Right Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType rightFilter = null;

	/**
	 * The default value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperatorType LOGICAL_OPERATOR_EDEFAULT = LogicalOperatorType.AND_LITERAL;

	/**
	 * The cached value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperatorType logicalOperator = LOGICAL_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Logical Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logicalOperatorESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundFilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.COMPOUND_FILTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getLeftFilter() {
		return leftFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftFilter(FilterType newLeftFilter, NotificationChain msgs) {
		FilterType oldLeftFilter = leftFilter;
		leftFilter = newLeftFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER, oldLeftFilter, newLeftFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftFilter(FilterType newLeftFilter) {
		if (newLeftFilter != leftFilter) {
			NotificationChain msgs = null;
			if (leftFilter != null)
				msgs = ((InternalEObject)leftFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER, null, msgs);
			if (newLeftFilter != null)
				msgs = ((InternalEObject)newLeftFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER, null, msgs);
			msgs = basicSetLeftFilter(newLeftFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER, newLeftFilter, newLeftFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getRightFilter() {
		return rightFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightFilter(FilterType newRightFilter, NotificationChain msgs) {
		FilterType oldRightFilter = rightFilter;
		rightFilter = newRightFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER, oldRightFilter, newRightFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightFilter(FilterType newRightFilter) {
		if (newRightFilter != rightFilter) {
			NotificationChain msgs = null;
			if (rightFilter != null)
				msgs = ((InternalEObject)rightFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER, null, msgs);
			if (newRightFilter != null)
				msgs = ((InternalEObject)newRightFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER, null, msgs);
			msgs = basicSetRightFilter(newRightFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER, newRightFilter, newRightFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType getLogicalOperator() {
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperator(LogicalOperatorType newLogicalOperator) {
		LogicalOperatorType oldLogicalOperator = logicalOperator;
		logicalOperator = newLogicalOperator == null ? LOGICAL_OPERATOR_EDEFAULT : newLogicalOperator;
		boolean oldLogicalOperatorESet = logicalOperatorESet;
		logicalOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR, oldLogicalOperator, logicalOperator, !oldLogicalOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogicalOperator() {
		LogicalOperatorType oldLogicalOperator = logicalOperator;
		boolean oldLogicalOperatorESet = logicalOperatorESet;
		logicalOperator = LOGICAL_OPERATOR_EDEFAULT;
		logicalOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR, oldLogicalOperator, LOGICAL_OPERATOR_EDEFAULT, oldLogicalOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogicalOperator() {
		return logicalOperatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER:
				return basicSetLeftFilter(null, msgs);
			case QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER:
				return basicSetRightFilter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER:
				return getLeftFilter();
			case QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER:
				return getRightFilter();
			case QueryPackage.COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR:
				return getLogicalOperator();
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
			case QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER:
				setLeftFilter((FilterType)newValue);
				return;
			case QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER:
				setRightFilter((FilterType)newValue);
				return;
			case QueryPackage.COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR:
				setLogicalOperator((LogicalOperatorType)newValue);
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
			case QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER:
				setLeftFilter((FilterType)null);
				return;
			case QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER:
				setRightFilter((FilterType)null);
				return;
			case QueryPackage.COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR:
				unsetLogicalOperator();
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
			case QueryPackage.COMPOUND_FILTER_TYPE__LEFT_FILTER:
				return leftFilter != null;
			case QueryPackage.COMPOUND_FILTER_TYPE__RIGHT_FILTER:
				return rightFilter != null;
			case QueryPackage.COMPOUND_FILTER_TYPE__LOGICAL_OPERATOR:
				return isSetLogicalOperator();
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
		result.append(" (logicalOperator: ");
		if (logicalOperatorESet) result.append(logicalOperator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CompoundFilterTypeImpl
