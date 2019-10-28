/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.argument;
import lu.ses.engineering.spell.controlflow.spell.comp_for;
import lu.ses.engineering.spell.controlflow.spell.or_test;
import lu.ses.engineering.spell.controlflow.spell.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testImpl#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testImpl#getComp_for <em>Comp for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testImpl#getTest2 <em>Test2</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testImpl#getIf_test <em>If test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testImpl#getIf_else_test <em>If else test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class testImpl extends testlistImpl implements test {
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
	 * The cached value of the '{@link #getComp_for() <em>Comp for</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_for()
	 * @generated
	 * @ordered
	 */
	protected comp_for comp_for;

	/**
	 * The cached value of the '{@link #getTest2() <em>Test2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest2()
	 * @generated
	 * @ordered
	 */
	protected test test2;

	/**
	 * The cached value of the '{@link #getIf_test() <em>If test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_test()
	 * @generated
	 * @ordered
	 */
	protected or_test if_test;

	/**
	 * The cached value of the '{@link #getIf_else_test() <em>If else test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_else_test()
	 * @generated
	 * @ordered
	 */
	protected test if_else_test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected testImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.TEST;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__TEST, oldTest, newTest);
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
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__TEST, newTest, newTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comp_for getComp_for() {
		return comp_for;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComp_for(comp_for newComp_for, NotificationChain msgs) {
		comp_for oldComp_for = comp_for;
		comp_for = newComp_for;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__COMP_FOR, oldComp_for, newComp_for);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp_for(comp_for newComp_for) {
		if (newComp_for != comp_for) {
			NotificationChain msgs = null;
			if (comp_for != null)
				msgs = ((InternalEObject)comp_for).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__COMP_FOR, null, msgs);
			if (newComp_for != null)
				msgs = ((InternalEObject)newComp_for).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__COMP_FOR, null, msgs);
			msgs = basicSetComp_for(newComp_for, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__COMP_FOR, newComp_for, newComp_for));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getTest2() {
		return test2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest2(test newTest2, NotificationChain msgs) {
		test oldTest2 = test2;
		test2 = newTest2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__TEST2, oldTest2, newTest2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest2(test newTest2) {
		if (newTest2 != test2) {
			NotificationChain msgs = null;
			if (test2 != null)
				msgs = ((InternalEObject)test2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__TEST2, null, msgs);
			if (newTest2 != null)
				msgs = ((InternalEObject)newTest2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__TEST2, null, msgs);
			msgs = basicSetTest2(newTest2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__TEST2, newTest2, newTest2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public or_test getIf_test() {
		return if_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf_test(or_test newIf_test, NotificationChain msgs) {
		or_test oldIf_test = if_test;
		if_test = newIf_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__IF_TEST, oldIf_test, newIf_test);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_test(or_test newIf_test) {
		if (newIf_test != if_test) {
			NotificationChain msgs = null;
			if (if_test != null)
				msgs = ((InternalEObject)if_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__IF_TEST, null, msgs);
			if (newIf_test != null)
				msgs = ((InternalEObject)newIf_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__IF_TEST, null, msgs);
			msgs = basicSetIf_test(newIf_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__IF_TEST, newIf_test, newIf_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getIf_else_test() {
		return if_else_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf_else_test(test newIf_else_test, NotificationChain msgs) {
		test oldIf_else_test = if_else_test;
		if_else_test = newIf_else_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__IF_ELSE_TEST, oldIf_else_test, newIf_else_test);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_else_test(test newIf_else_test) {
		if (newIf_else_test != if_else_test) {
			NotificationChain msgs = null;
			if (if_else_test != null)
				msgs = ((InternalEObject)if_else_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__IF_ELSE_TEST, null, msgs);
			if (newIf_else_test != null)
				msgs = ((InternalEObject)newIf_else_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TEST__IF_ELSE_TEST, null, msgs);
			msgs = basicSetIf_else_test(newIf_else_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TEST__IF_ELSE_TEST, newIf_else_test, newIf_else_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.TEST__TEST:
				return basicSetTest(null, msgs);
			case SpellPackage.TEST__COMP_FOR:
				return basicSetComp_for(null, msgs);
			case SpellPackage.TEST__TEST2:
				return basicSetTest2(null, msgs);
			case SpellPackage.TEST__IF_TEST:
				return basicSetIf_test(null, msgs);
			case SpellPackage.TEST__IF_ELSE_TEST:
				return basicSetIf_else_test(null, msgs);
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
			case SpellPackage.TEST__TEST:
				return getTest();
			case SpellPackage.TEST__COMP_FOR:
				return getComp_for();
			case SpellPackage.TEST__TEST2:
				return getTest2();
			case SpellPackage.TEST__IF_TEST:
				return getIf_test();
			case SpellPackage.TEST__IF_ELSE_TEST:
				return getIf_else_test();
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
			case SpellPackage.TEST__TEST:
				setTest((test)newValue);
				return;
			case SpellPackage.TEST__COMP_FOR:
				setComp_for((comp_for)newValue);
				return;
			case SpellPackage.TEST__TEST2:
				setTest2((test)newValue);
				return;
			case SpellPackage.TEST__IF_TEST:
				setIf_test((or_test)newValue);
				return;
			case SpellPackage.TEST__IF_ELSE_TEST:
				setIf_else_test((test)newValue);
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
			case SpellPackage.TEST__TEST:
				setTest((test)null);
				return;
			case SpellPackage.TEST__COMP_FOR:
				setComp_for((comp_for)null);
				return;
			case SpellPackage.TEST__TEST2:
				setTest2((test)null);
				return;
			case SpellPackage.TEST__IF_TEST:
				setIf_test((or_test)null);
				return;
			case SpellPackage.TEST__IF_ELSE_TEST:
				setIf_else_test((test)null);
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
			case SpellPackage.TEST__TEST:
				return test != null;
			case SpellPackage.TEST__COMP_FOR:
				return comp_for != null;
			case SpellPackage.TEST__TEST2:
				return test2 != null;
			case SpellPackage.TEST__IF_TEST:
				return if_test != null;
			case SpellPackage.TEST__IF_ELSE_TEST:
				return if_else_test != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == argument.class) {
			switch (derivedFeatureID) {
				case SpellPackage.TEST__TEST: return SpellPackage.ARGUMENT__TEST;
				case SpellPackage.TEST__COMP_FOR: return SpellPackage.ARGUMENT__COMP_FOR;
				case SpellPackage.TEST__TEST2: return SpellPackage.ARGUMENT__TEST2;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == argument.class) {
			switch (baseFeatureID) {
				case SpellPackage.ARGUMENT__TEST: return SpellPackage.TEST__TEST;
				case SpellPackage.ARGUMENT__COMP_FOR: return SpellPackage.TEST__COMP_FOR;
				case SpellPackage.ARGUMENT__TEST2: return SpellPackage.TEST__TEST2;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //testImpl
