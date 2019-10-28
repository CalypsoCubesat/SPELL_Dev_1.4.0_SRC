/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.testlist;
import lu.ses.engineering.spell.controlflow.spell.yield_expr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>yield expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_exprImpl#getTestlist <em>Testlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class yield_exprImpl extends yield_or_testlistImpl implements yield_expr {
	/**
	 * The cached value of the '{@link #getTestlist() <em>Testlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestlist()
	 * @generated
	 * @ordered
	 */
	protected testlist testlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected yield_exprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.YIELD_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist getTestlist() {
		return testlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestlist(testlist newTestlist, NotificationChain msgs) {
		testlist oldTestlist = testlist;
		testlist = newTestlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.YIELD_EXPR__TESTLIST, oldTestlist, newTestlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestlist(testlist newTestlist) {
		if (newTestlist != testlist) {
			NotificationChain msgs = null;
			if (testlist != null)
				msgs = ((InternalEObject)testlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.YIELD_EXPR__TESTLIST, null, msgs);
			if (newTestlist != null)
				msgs = ((InternalEObject)newTestlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.YIELD_EXPR__TESTLIST, null, msgs);
			msgs = basicSetTestlist(newTestlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.YIELD_EXPR__TESTLIST, newTestlist, newTestlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.YIELD_EXPR__TESTLIST:
				return basicSetTestlist(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpellPackage.YIELD_EXPR__TESTLIST:
				return getTestlist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpellPackage.YIELD_EXPR__TESTLIST:
				setTestlist((testlist)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpellPackage.YIELD_EXPR__TESTLIST:
				setTestlist((testlist)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpellPackage.YIELD_EXPR__TESTLIST:
				return testlist != null;
		}
		return super.eIsSet(featureID);
	}

} //yield_exprImpl
