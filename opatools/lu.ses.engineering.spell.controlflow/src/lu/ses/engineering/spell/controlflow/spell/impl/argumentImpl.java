/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.argument;
import lu.ses.engineering.spell.controlflow.spell.comp_for;
import lu.ses.engineering.spell.controlflow.spell.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.argumentImpl#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.argumentImpl#getComp_for <em>Comp for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.argumentImpl#getTest2 <em>Test2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class argumentImpl extends SpellElementImpl implements argument {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected argumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.ARGUMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ARGUMENT__TEST, oldTest, newTest);
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
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGUMENT__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGUMENT__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ARGUMENT__TEST, newTest, newTest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ARGUMENT__COMP_FOR, oldComp_for, newComp_for);
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
				msgs = ((InternalEObject)comp_for).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGUMENT__COMP_FOR, null, msgs);
			if (newComp_for != null)
				msgs = ((InternalEObject)newComp_for).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGUMENT__COMP_FOR, null, msgs);
			msgs = basicSetComp_for(newComp_for, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ARGUMENT__COMP_FOR, newComp_for, newComp_for));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ARGUMENT__TEST2, oldTest2, newTest2);
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
				msgs = ((InternalEObject)test2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGUMENT__TEST2, null, msgs);
			if (newTest2 != null)
				msgs = ((InternalEObject)newTest2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGUMENT__TEST2, null, msgs);
			msgs = basicSetTest2(newTest2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ARGUMENT__TEST2, newTest2, newTest2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.ARGUMENT__TEST:
				return basicSetTest(null, msgs);
			case SpellPackage.ARGUMENT__COMP_FOR:
				return basicSetComp_for(null, msgs);
			case SpellPackage.ARGUMENT__TEST2:
				return basicSetTest2(null, msgs);
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
			case SpellPackage.ARGUMENT__TEST:
				return getTest();
			case SpellPackage.ARGUMENT__COMP_FOR:
				return getComp_for();
			case SpellPackage.ARGUMENT__TEST2:
				return getTest2();
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
			case SpellPackage.ARGUMENT__TEST:
				setTest((test)newValue);
				return;
			case SpellPackage.ARGUMENT__COMP_FOR:
				setComp_for((comp_for)newValue);
				return;
			case SpellPackage.ARGUMENT__TEST2:
				setTest2((test)newValue);
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
			case SpellPackage.ARGUMENT__TEST:
				setTest((test)null);
				return;
			case SpellPackage.ARGUMENT__COMP_FOR:
				setComp_for((comp_for)null);
				return;
			case SpellPackage.ARGUMENT__TEST2:
				setTest2((test)null);
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
			case SpellPackage.ARGUMENT__TEST:
				return test != null;
			case SpellPackage.ARGUMENT__COMP_FOR:
				return comp_for != null;
			case SpellPackage.ARGUMENT__TEST2:
				return test2 != null;
		}
		return super.eIsSet(featureID);
	}

} //argumentImpl
