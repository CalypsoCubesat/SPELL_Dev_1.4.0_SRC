/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.list_for;
import lu.ses.engineering.spell.controlflow.spell.listmaker;
import lu.ses.engineering.spell.controlflow.spell.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>listmaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl#getList_for <em>List for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl#getAdditionalTests <em>Additional Tests</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl#isOptionalComma <em>Optional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class listmakerImpl extends SpellElementImpl implements listmaker {
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
	 * The cached value of the '{@link #getList_for() <em>List for</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList_for()
	 * @generated
	 * @ordered
	 */
	protected list_for list_for;

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
	protected listmakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.LISTMAKER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.LISTMAKER__TEST, oldTest, newTest);
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
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LISTMAKER__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LISTMAKER__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.LISTMAKER__TEST, newTest, newTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public list_for getList_for() {
		return list_for;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList_for(list_for newList_for, NotificationChain msgs) {
		list_for oldList_for = list_for;
		list_for = newList_for;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.LISTMAKER__LIST_FOR, oldList_for, newList_for);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList_for(list_for newList_for) {
		if (newList_for != list_for) {
			NotificationChain msgs = null;
			if (list_for != null)
				msgs = ((InternalEObject)list_for).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LISTMAKER__LIST_FOR, null, msgs);
			if (newList_for != null)
				msgs = ((InternalEObject)newList_for).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LISTMAKER__LIST_FOR, null, msgs);
			msgs = basicSetList_for(newList_for, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.LISTMAKER__LIST_FOR, newList_for, newList_for));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<test> getAdditionalTests() {
		if (additionalTests == null) {
			additionalTests = new EObjectContainmentEList<test>(test.class, this, SpellPackage.LISTMAKER__ADDITIONAL_TESTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.LISTMAKER__OPTIONAL_COMMA, oldOptionalComma, optionalComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.LISTMAKER__TEST:
				return basicSetTest(null, msgs);
			case SpellPackage.LISTMAKER__LIST_FOR:
				return basicSetList_for(null, msgs);
			case SpellPackage.LISTMAKER__ADDITIONAL_TESTS:
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
			case SpellPackage.LISTMAKER__TEST:
				return getTest();
			case SpellPackage.LISTMAKER__LIST_FOR:
				return getList_for();
			case SpellPackage.LISTMAKER__ADDITIONAL_TESTS:
				return getAdditionalTests();
			case SpellPackage.LISTMAKER__OPTIONAL_COMMA:
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
			case SpellPackage.LISTMAKER__TEST:
				setTest((test)newValue);
				return;
			case SpellPackage.LISTMAKER__LIST_FOR:
				setList_for((list_for)newValue);
				return;
			case SpellPackage.LISTMAKER__ADDITIONAL_TESTS:
				getAdditionalTests().clear();
				getAdditionalTests().addAll((Collection<? extends test>)newValue);
				return;
			case SpellPackage.LISTMAKER__OPTIONAL_COMMA:
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
			case SpellPackage.LISTMAKER__TEST:
				setTest((test)null);
				return;
			case SpellPackage.LISTMAKER__LIST_FOR:
				setList_for((list_for)null);
				return;
			case SpellPackage.LISTMAKER__ADDITIONAL_TESTS:
				getAdditionalTests().clear();
				return;
			case SpellPackage.LISTMAKER__OPTIONAL_COMMA:
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
			case SpellPackage.LISTMAKER__TEST:
				return test != null;
			case SpellPackage.LISTMAKER__LIST_FOR:
				return list_for != null;
			case SpellPackage.LISTMAKER__ADDITIONAL_TESTS:
				return additionalTests != null && !additionalTests.isEmpty();
			case SpellPackage.LISTMAKER__OPTIONAL_COMMA:
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

} //listmakerImpl
