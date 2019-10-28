/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.comp_for;
import lu.ses.engineering.spell.controlflow.spell.test;
import lu.ses.engineering.spell.controlflow.spell.testlist_comp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>testlist comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl#getComp_for <em>Comp for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl#getAdditionalTests <em>Additional Tests</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl#isOptionalComma <em>Optional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class testlist_compImpl extends yield_or_testlist_compImpl implements testlist_comp {
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
	 * The cached value of the '{@link #getAdditionalTests() <em>Additional Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTests()
	 * @generated
	 * @ordered
	 */
	protected EList<test> additionalTests;

	/**
	 * The default value of the '{@link #isOptionalComma() <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalComma()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_COMMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptionalComma() <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalComma()
	 * @generated
	 * @ordered
	 */
	protected boolean optionalComma = OPTIONAL_COMMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected testlist_compImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.TESTLIST_COMP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TESTLIST_COMP__TEST, oldTest, newTest);
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
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TESTLIST_COMP__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TESTLIST_COMP__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TESTLIST_COMP__TEST, newTest, newTest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TESTLIST_COMP__COMP_FOR, oldComp_for, newComp_for);
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
				msgs = ((InternalEObject)comp_for).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TESTLIST_COMP__COMP_FOR, null, msgs);
			if (newComp_for != null)
				msgs = ((InternalEObject)newComp_for).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TESTLIST_COMP__COMP_FOR, null, msgs);
			msgs = basicSetComp_for(newComp_for, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TESTLIST_COMP__COMP_FOR, newComp_for, newComp_for));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<test> getAdditionalTests() {
		if (additionalTests == null) {
			additionalTests = new EObjectContainmentEList<test>(test.class, this, SpellPackage.TESTLIST_COMP__ADDITIONAL_TESTS);
		}
		return additionalTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionalComma() {
		return optionalComma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalComma(boolean newOptionalComma) {
		boolean oldOptionalComma = optionalComma;
		optionalComma = newOptionalComma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TESTLIST_COMP__OPTIONAL_COMMA, oldOptionalComma, optionalComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.TESTLIST_COMP__TEST:
				return basicSetTest(null, msgs);
			case SpellPackage.TESTLIST_COMP__COMP_FOR:
				return basicSetComp_for(null, msgs);
			case SpellPackage.TESTLIST_COMP__ADDITIONAL_TESTS:
				return ((InternalEList<?>)getAdditionalTests()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.TESTLIST_COMP__TEST:
				return getTest();
			case SpellPackage.TESTLIST_COMP__COMP_FOR:
				return getComp_for();
			case SpellPackage.TESTLIST_COMP__ADDITIONAL_TESTS:
				return getAdditionalTests();
			case SpellPackage.TESTLIST_COMP__OPTIONAL_COMMA:
				return isOptionalComma();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpellPackage.TESTLIST_COMP__TEST:
				setTest((test)newValue);
				return;
			case SpellPackage.TESTLIST_COMP__COMP_FOR:
				setComp_for((comp_for)newValue);
				return;
			case SpellPackage.TESTLIST_COMP__ADDITIONAL_TESTS:
				getAdditionalTests().clear();
				getAdditionalTests().addAll((Collection<? extends test>)newValue);
				return;
			case SpellPackage.TESTLIST_COMP__OPTIONAL_COMMA:
				setOptionalComma((Boolean)newValue);
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
			case SpellPackage.TESTLIST_COMP__TEST:
				setTest((test)null);
				return;
			case SpellPackage.TESTLIST_COMP__COMP_FOR:
				setComp_for((comp_for)null);
				return;
			case SpellPackage.TESTLIST_COMP__ADDITIONAL_TESTS:
				getAdditionalTests().clear();
				return;
			case SpellPackage.TESTLIST_COMP__OPTIONAL_COMMA:
				setOptionalComma(OPTIONAL_COMMA_EDEFAULT);
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
			case SpellPackage.TESTLIST_COMP__TEST:
				return test != null;
			case SpellPackage.TESTLIST_COMP__COMP_FOR:
				return comp_for != null;
			case SpellPackage.TESTLIST_COMP__ADDITIONAL_TESTS:
				return additionalTests != null && !additionalTests.isEmpty();
			case SpellPackage.TESTLIST_COMP__OPTIONAL_COMMA:
				return optionalComma != OPTIONAL_COMMA_EDEFAULT;
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
		result.append(" (optionalComma: ");
		result.append(optionalComma);
		result.append(')');
		return result.toString();
	}

} //testlist_compImpl
