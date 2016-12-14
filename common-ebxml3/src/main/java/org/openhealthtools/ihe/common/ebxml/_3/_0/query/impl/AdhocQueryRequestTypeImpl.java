/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdhocQueryRequestTypeImpl.java,v 1.1 2006/10/19 20:16:25 sknoop Exp $
 */
package org.openhealthtools.ihe.common.ebxml._3._0.query.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;



import org.openhealthtools.ihe.common.ebxml._3._0.query.AdhocQueryRequestType;
import org.openhealthtools.ihe.common.ebxml._3._0.query.QueryPackage;
import org.openhealthtools.ihe.common.ebxml._3._0.query.ResponseOptionType;
import org.openhealthtools.ihe.common.ebxml._3._0.rim.AdhocQueryType;
import org.openhealthtools.ihe.common.ebxml._3._0.rs.impl.RegistryRequestTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adhoc Query Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl#getResponseOption <em>Response Option</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl#getAdhocQuery <em>Adhoc Query</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl#isFederated <em>Federated</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl#getFederation <em>Federation</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl#getMaxResults <em>Max Results</em>}</li>
 *   <li>{@link org.openhealthtools.ihe.common.ebxml._3._0.query.impl.AdhocQueryRequestTypeImpl#getStartIndex <em>Start Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdhocQueryRequestTypeImpl extends RegistryRequestTypeImpl implements AdhocQueryRequestType {
	/**
	 * The cached value of the '{@link #getResponseOption() <em>Response Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseOption()
	 * @generated
	 * @ordered
	 */
	protected ResponseOptionType responseOption = null;

	/**
	 * The cached value of the '{@link #getAdhocQuery() <em>Adhoc Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdhocQuery()
	 * @generated
	 * @ordered
	 */
	protected AdhocQueryType adhocQuery = null;

	/**
	 * The default value of the '{@link #isFederated() <em>Federated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFederated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FEDERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFederated() <em>Federated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFederated()
	 * @generated
	 * @ordered
	 */
	protected boolean federated = FEDERATED_EDEFAULT;

	/**
	 * This is true if the Federated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean federatedESet = false;

	/**
	 * The default value of the '{@link #getFederation() <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederation()
	 * @generated
	 * @ordered
	 */
	protected static final String FEDERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFederation() <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederation()
	 * @generated
	 * @ordered
	 */
	protected String federation = FEDERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxResults() <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResults()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_RESULTS_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getMaxResults() <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResults()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxResults = MAX_RESULTS_EDEFAULT;

	/**
	 * This is true if the Max Results attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxResultsESet = false;

	/**
	 * The default value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_INDEX_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startIndex = START_INDEX_EDEFAULT;

	/**
	 * This is true if the Start Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startIndexESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdhocQueryRequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ADHOC_QUERY_REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOptionType getResponseOption() {
		return responseOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseOption(ResponseOptionType newResponseOption, NotificationChain msgs) {
		ResponseOptionType oldResponseOption = responseOption;
		responseOption = newResponseOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, oldResponseOption, newResponseOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseOption(ResponseOptionType newResponseOption) {
		if (newResponseOption != responseOption) {
			NotificationChain msgs = null;
			if (responseOption != null)
				msgs = ((InternalEObject)responseOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, null, msgs);
			if (newResponseOption != null)
				msgs = ((InternalEObject)newResponseOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, null, msgs);
			msgs = basicSetResponseOption(newResponseOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION, newResponseOption, newResponseOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdhocQueryType getAdhocQuery() {
		return adhocQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdhocQuery(AdhocQueryType newAdhocQuery, NotificationChain msgs) {
		AdhocQueryType oldAdhocQuery = adhocQuery;
		adhocQuery = newAdhocQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY, oldAdhocQuery, newAdhocQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdhocQuery(AdhocQueryType newAdhocQuery) {
		if (newAdhocQuery != adhocQuery) {
			NotificationChain msgs = null;
			if (adhocQuery != null)
				msgs = ((InternalEObject)adhocQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			if (newAdhocQuery != null)
				msgs = ((InternalEObject)newAdhocQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY, null, msgs);
			msgs = basicSetAdhocQuery(newAdhocQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY, newAdhocQuery, newAdhocQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFederated() {
		return federated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederated(boolean newFederated) {
		boolean oldFederated = federated;
		federated = newFederated;
		boolean oldFederatedESet = federatedESet;
		federatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATED, oldFederated, federated, !oldFederatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFederated() {
		boolean oldFederated = federated;
		boolean oldFederatedESet = federatedESet;
		federated = FEDERATED_EDEFAULT;
		federatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATED, oldFederated, FEDERATED_EDEFAULT, oldFederatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFederated() {
		return federatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFederation() {
		return federation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederation(String newFederation) {
		String oldFederation = federation;
		federation = newFederation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATION, oldFederation, federation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxResults() {
		return maxResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResults(BigInteger newMaxResults) {
		BigInteger oldMaxResults = maxResults;
		maxResults = newMaxResults;
		boolean oldMaxResultsESet = maxResultsESet;
		maxResultsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS, oldMaxResults, maxResults, !oldMaxResultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxResults() {
		BigInteger oldMaxResults = maxResults;
		boolean oldMaxResultsESet = maxResultsESet;
		maxResults = MAX_RESULTS_EDEFAULT;
		maxResultsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS, oldMaxResults, MAX_RESULTS_EDEFAULT, oldMaxResultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxResults() {
		return maxResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartIndex() {
		return startIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndex(BigInteger newStartIndex) {
		BigInteger oldStartIndex = startIndex;
		startIndex = newStartIndex;
		boolean oldStartIndexESet = startIndexESet;
		startIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__START_INDEX, oldStartIndex, startIndex, !oldStartIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartIndex() {
		BigInteger oldStartIndex = startIndex;
		boolean oldStartIndexESet = startIndexESet;
		startIndex = START_INDEX_EDEFAULT;
		startIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QueryPackage.ADHOC_QUERY_REQUEST_TYPE__START_INDEX, oldStartIndex, START_INDEX_EDEFAULT, oldStartIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartIndex() {
		return startIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				return basicSetResponseOption(null, msgs);
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY:
				return basicSetAdhocQuery(null, msgs);
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				return getResponseOption();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY:
				return getAdhocQuery();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATED:
				return isFederated() ? Boolean.TRUE : Boolean.FALSE;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATION:
				return getFederation();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS:
				return getMaxResults();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__START_INDEX:
				return getStartIndex();
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATED:
				setFederated(((Boolean)newValue).booleanValue());
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATION:
				setFederation((String)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS:
				setMaxResults((BigInteger)newValue);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__START_INDEX:
				setStartIndex((BigInteger)newValue);
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				setResponseOption((ResponseOptionType)null);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY:
				setAdhocQuery((AdhocQueryType)null);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATED:
				unsetFederated();
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATION:
				setFederation(FEDERATION_EDEFAULT);
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS:
				unsetMaxResults();
				return;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__START_INDEX:
				unsetStartIndex();
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
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__RESPONSE_OPTION:
				return responseOption != null;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__ADHOC_QUERY:
				return adhocQuery != null;
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATED:
				return isSetFederated();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__FEDERATION:
				return FEDERATION_EDEFAULT == null ? federation != null : !FEDERATION_EDEFAULT.equals(federation);
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__MAX_RESULTS:
				return isSetMaxResults();
			case QueryPackage.ADHOC_QUERY_REQUEST_TYPE__START_INDEX:
				return isSetStartIndex();
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
		result.append(" (federated: ");
		if (federatedESet) result.append(federated); else result.append("<unset>");
		result.append(", federation: ");
		result.append(federation);
		result.append(", maxResults: ");
		if (maxResultsESet) result.append(maxResults); else result.append("<unset>");
		result.append(", startIndex: ");
		if (startIndexESet) result.append(startIndex); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AdhocQueryRequestTypeImpl
