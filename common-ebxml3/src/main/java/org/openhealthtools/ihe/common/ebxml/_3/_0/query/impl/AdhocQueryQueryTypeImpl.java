/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdhocQueryQueryTypeImpl.java,v 1.1 2006/10/19 20:16:26 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adhoc Query Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryQueryTypeImpl#getQueryExpressionBranch <em>Query Expression Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdhocQueryQueryTypeImpl extends RegistryObjectQueryTypeImpl implements AdhocQueryQueryType {
	/**
	 * The cached value of the '{@link #getQueryExpressionBranch() <em>Query Expression Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryExpressionBranch()
	 * @generated
	 * @ordered
	 */
	protected QueryExpressionBranchType queryExpressionBranch = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdhocQueryQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ADHOC_QUERY_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryExpressionBranchType getQueryExpressionBranch() {
		return queryExpressionBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryExpressionBranch(QueryExpressionBranchType newQueryExpressionBranch, NotificationChain msgs) {
		QueryExpressionBranchType oldQueryExpressionBranch = queryExpressionBranch;
		queryExpressionBranch = newQueryExpressionBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH, oldQueryExpressionBranch, newQueryExpressionBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryExpressionBranch(QueryExpressionBranchType newQueryExpressionBranch) {
		if (newQueryExpressionBranch != queryExpressionBranch) {
			NotificationChain msgs = null;
			if (queryExpressionBranch != null)
				msgs = ((InternalEObject)queryExpressionBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH, null, msgs);
			if (newQueryExpressionBranch != null)
				msgs = ((InternalEObject)newQueryExpressionBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH, null, msgs);
			msgs = basicSetQueryExpressionBranch(newQueryExpressionBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH, newQueryExpressionBranch, newQueryExpressionBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH:
				return basicSetQueryExpressionBranch(null, msgs);
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
			case QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH:
				return getQueryExpressionBranch();
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
			case QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH:
				setQueryExpressionBranch((QueryExpressionBranchType)newValue);
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
			case QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH:
				setQueryExpressionBranch((QueryExpressionBranchType)null);
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
			case QueryPackage.ADHOC_QUERY_QUERY_TYPE__QUERY_EXPRESSION_BRANCH:
				return queryExpressionBranch != null;
		}
		return super.eIsSet(featureID);
	}

} //AdhocQueryQueryTypeImpl
