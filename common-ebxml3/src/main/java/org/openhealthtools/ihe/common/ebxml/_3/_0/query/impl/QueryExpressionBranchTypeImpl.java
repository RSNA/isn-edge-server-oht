/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryExpressionBranchTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.ihe.common.ebxml._3._0.query.ClassificationNodeQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryExpressionBranchType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Branch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.QueryExpressionBranchTypeImpl#getQueryLanguageQuery <em>Query Language Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryExpressionBranchTypeImpl extends BranchTypeImpl implements QueryExpressionBranchType {
	/**
	 * The cached value of the '{@link #getQueryLanguageQuery() <em>Query Language Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguageQuery()
	 * @generated
	 * @ordered
	 */
	protected ClassificationNodeQueryType queryLanguageQuery = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryExpressionBranchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_EXPRESSION_BRANCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationNodeQueryType getQueryLanguageQuery() {
		return queryLanguageQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryLanguageQuery(ClassificationNodeQueryType newQueryLanguageQuery, NotificationChain msgs) {
		ClassificationNodeQueryType oldQueryLanguageQuery = queryLanguageQuery;
		queryLanguageQuery = newQueryLanguageQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY, oldQueryLanguageQuery, newQueryLanguageQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryLanguageQuery(ClassificationNodeQueryType newQueryLanguageQuery) {
		if (newQueryLanguageQuery != queryLanguageQuery) {
			NotificationChain msgs = null;
			if (queryLanguageQuery != null)
				msgs = ((InternalEObject)queryLanguageQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY, null, msgs);
			if (newQueryLanguageQuery != null)
				msgs = ((InternalEObject)newQueryLanguageQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY, null, msgs);
			msgs = basicSetQueryLanguageQuery(newQueryLanguageQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY, newQueryLanguageQuery, newQueryLanguageQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY:
				return basicSetQueryLanguageQuery(null, msgs);
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
			case QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY:
				return getQueryLanguageQuery();
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
			case QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY:
				setQueryLanguageQuery((ClassificationNodeQueryType)newValue);
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
			case QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY:
				setQueryLanguageQuery((ClassificationNodeQueryType)null);
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
			case QueryPackage.QUERY_EXPRESSION_BRANCH_TYPE__QUERY_LANGUAGE_QUERY:
				return queryLanguageQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryExpressionBranchTypeImpl
