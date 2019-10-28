/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.except_clause;
import lu.ses.engineering.spell.controlflow.spell.suite;
import lu.ses.engineering.spell.controlflow.spell.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>except clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl#getNext_test <em>Next test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class except_clauseImpl extends SpellElementImpl implements except_clause {
	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected test test;

	/**
	 * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign()
	 * @generated
	 * @ordered
	 */
	protected String sign = SIGN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext_test() <em>Next test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext_test()
	 * @generated
	 * @ordered
	 */
	protected test next_test;

	/**
	 * The cached value of the '{@link #getSuite() <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuite()
	 * @generated
	 * @ordered
	 */
	protected suite suite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected except_clauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.EXCEPT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest(test newTest, NotificationChain msgs) {
		test oldTest = test;
		test = newTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.EXCEPT_CLAUSE__TEST, oldTest, newTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(test newTest) {
		if (newTest != test) {
			NotificationChain msgs = null;
			if (test != null)
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EXCEPT_CLAUSE__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EXCEPT_CLAUSE__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.EXCEPT_CLAUSE__TEST, newTest, newTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSign(String newSign) {
		String oldSign = sign;
		sign = newSign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.EXCEPT_CLAUSE__SIGN, oldSign, sign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getNext_test() {
		return next_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext_test(test newNext_test, NotificationChain msgs) {
		test oldNext_test = next_test;
		next_test = newNext_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.EXCEPT_CLAUSE__NEXT_TEST, oldNext_test, newNext_test);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext_test(test newNext_test) {
		if (newNext_test != next_test) {
			NotificationChain msgs = null;
			if (next_test != null)
				msgs = ((InternalEObject)next_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EXCEPT_CLAUSE__NEXT_TEST, null, msgs);
			if (newNext_test != null)
				msgs = ((InternalEObject)newNext_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EXCEPT_CLAUSE__NEXT_TEST, null, msgs);
			msgs = basicSetNext_test(newNext_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.EXCEPT_CLAUSE__NEXT_TEST, newNext_test, newNext_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public suite getSuite() {
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuite(suite newSuite, NotificationChain msgs) {
		suite oldSuite = suite;
		suite = newSuite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.EXCEPT_CLAUSE__SUITE, oldSuite, newSuite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuite(suite newSuite) {
		if (newSuite != suite) {
			NotificationChain msgs = null;
			if (suite != null)
				msgs = ((InternalEObject)suite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EXCEPT_CLAUSE__SUITE, null, msgs);
			if (newSuite != null)
				msgs = ((InternalEObject)newSuite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EXCEPT_CLAUSE__SUITE, null, msgs);
			msgs = basicSetSuite(newSuite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.EXCEPT_CLAUSE__SUITE, newSuite, newSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.EXCEPT_CLAUSE__TEST:
				return basicSetTest(null, msgs);
			case SpellPackage.EXCEPT_CLAUSE__NEXT_TEST:
				return basicSetNext_test(null, msgs);
			case SpellPackage.EXCEPT_CLAUSE__SUITE:
				return basicSetSuite(null, msgs);
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
			case SpellPackage.EXCEPT_CLAUSE__TEST:
				return getTest();
			case SpellPackage.EXCEPT_CLAUSE__SIGN:
				return getSign();
			case SpellPackage.EXCEPT_CLAUSE__NEXT_TEST:
				return getNext_test();
			case SpellPackage.EXCEPT_CLAUSE__SUITE:
				return getSuite();
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
			case SpellPackage.EXCEPT_CLAUSE__TEST:
				setTest((test)newValue);
				return;
			case SpellPackage.EXCEPT_CLAUSE__SIGN:
				setSign((String)newValue);
				return;
			case SpellPackage.EXCEPT_CLAUSE__NEXT_TEST:
				setNext_test((test)newValue);
				return;
			case SpellPackage.EXCEPT_CLAUSE__SUITE:
				setSuite((suite)newValue);
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
			case SpellPackage.EXCEPT_CLAUSE__TEST:
				setTest((test)null);
				return;
			case SpellPackage.EXCEPT_CLAUSE__SIGN:
				setSign(SIGN_EDEFAULT);
				return;
			case SpellPackage.EXCEPT_CLAUSE__NEXT_TEST:
				setNext_test((test)null);
				return;
			case SpellPackage.EXCEPT_CLAUSE__SUITE:
				setSuite((suite)null);
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
			case SpellPackage.EXCEPT_CLAUSE__TEST:
				return test != null;
			case SpellPackage.EXCEPT_CLAUSE__SIGN:
				return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
			case SpellPackage.EXCEPT_CLAUSE__NEXT_TEST:
				return next_test != null;
			case SpellPackage.EXCEPT_CLAUSE__SUITE:
				return suite != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sign: ");
		result.append(sign);
		result.append(')');
		return result.toString();
	}

} //except_clauseImpl
