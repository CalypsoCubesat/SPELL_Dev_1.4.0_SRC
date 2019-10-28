/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.comp_for;
import lu.ses.engineering.spell.controlflow.spell.dictorset_entry;
import lu.ses.engineering.spell.controlflow.spell.dictorsetmaker;
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
 * An implementation of the model object '<em><b>dictorsetmaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl#getComp_for <em>Comp for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl#isOptionalComma <em>Optional Comma</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dictorsetmakerImpl extends SpellElementImpl implements dictorsetmaker {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<dictorset_entry> entries;

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
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<test> tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dictorsetmakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.DICTORSETMAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<dictorset_entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<dictorset_entry>(dictorset_entry.class, this, SpellPackage.DICTORSETMAKER__ENTRIES);
		}
		return entries;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.DICTORSETMAKER__COMP_FOR, oldComp_for, newComp_for);
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
				msgs = ((InternalEObject)comp_for).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DICTORSETMAKER__COMP_FOR, null, msgs);
			if (newComp_for != null)
				msgs = ((InternalEObject)newComp_for).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DICTORSETMAKER__COMP_FOR, null, msgs);
			msgs = basicSetComp_for(newComp_for, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DICTORSETMAKER__COMP_FOR, newComp_for, newComp_for));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DICTORSETMAKER__OPTIONAL_COMMA, oldOptionalComma, optionalComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<test> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<test>(test.class, this, SpellPackage.DICTORSETMAKER__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.DICTORSETMAKER__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case SpellPackage.DICTORSETMAKER__COMP_FOR:
				return basicSetComp_for(null, msgs);
			case SpellPackage.DICTORSETMAKER__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.DICTORSETMAKER__ENTRIES:
				return getEntries();
			case SpellPackage.DICTORSETMAKER__COMP_FOR:
				return getComp_for();
			case SpellPackage.DICTORSETMAKER__OPTIONAL_COMMA:
				return isOptionalComma();
			case SpellPackage.DICTORSETMAKER__TESTS:
				return getTests();
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
			case SpellPackage.DICTORSETMAKER__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends dictorset_entry>)newValue);
				return;
			case SpellPackage.DICTORSETMAKER__COMP_FOR:
				setComp_for((comp_for)newValue);
				return;
			case SpellPackage.DICTORSETMAKER__OPTIONAL_COMMA:
				setOptionalComma((Boolean)newValue);
				return;
			case SpellPackage.DICTORSETMAKER__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends test>)newValue);
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
			case SpellPackage.DICTORSETMAKER__ENTRIES:
				getEntries().clear();
				return;
			case SpellPackage.DICTORSETMAKER__COMP_FOR:
				setComp_for((comp_for)null);
				return;
			case SpellPackage.DICTORSETMAKER__OPTIONAL_COMMA:
				setOptionalComma(OPTIONAL_COMMA_EDEFAULT);
				return;
			case SpellPackage.DICTORSETMAKER__TESTS:
				getTests().clear();
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
			case SpellPackage.DICTORSETMAKER__ENTRIES:
				return entries != null && !entries.isEmpty();
			case SpellPackage.DICTORSETMAKER__COMP_FOR:
				return comp_for != null;
			case SpellPackage.DICTORSETMAKER__OPTIONAL_COMMA:
				return optionalComma != OPTIONAL_COMMA_EDEFAULT;
			case SpellPackage.DICTORSETMAKER__TESTS:
				return tests != null && !tests.isEmpty();
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

} //dictorsetmakerImpl
