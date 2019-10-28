/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.test;
import lu.ses.engineering.spell.controlflow.spell.testlist_safe;

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
 * An implementation of the model object '<em><b>testlist safe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_safeImpl#getOld_test <em>Old test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_safeImpl#isOptionalComa <em>Optional Coma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class testlist_safeImpl extends SpellElementImpl implements testlist_safe {
	/**
	 * The cached value of the '{@link #getOld_test() <em>Old test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOld_test()
	 * @generated
	 * @ordered
	 */
	protected EList<test> old_test;

	/**
	 * The default value of the '{@link #isOptionalComa() <em>Optional Coma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalComa()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_COMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptionalComa() <em>Optional Coma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalComa()
	 * @generated
	 * @ordered
	 */
	protected boolean optionalComa = OPTIONAL_COMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected testlist_safeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.TESTLIST_SAFE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<test> getOld_test() {
		if (old_test == null) {
			old_test = new EObjectContainmentEList<test>(test.class, this, SpellPackage.TESTLIST_SAFE__OLD_TEST);
		}
		return old_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionalComa() {
		return optionalComa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalComa(boolean newOptionalComa) {
		boolean oldOptionalComa = optionalComa;
		optionalComa = newOptionalComa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TESTLIST_SAFE__OPTIONAL_COMA, oldOptionalComa, optionalComa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.TESTLIST_SAFE__OLD_TEST:
				return ((InternalEList<?>)getOld_test()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.TESTLIST_SAFE__OLD_TEST:
				return getOld_test();
			case SpellPackage.TESTLIST_SAFE__OPTIONAL_COMA:
				return isOptionalComa();
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
			case SpellPackage.TESTLIST_SAFE__OLD_TEST:
				getOld_test().clear();
				getOld_test().addAll((Collection<? extends test>)newValue);
				return;
			case SpellPackage.TESTLIST_SAFE__OPTIONAL_COMA:
				setOptionalComa((Boolean)newValue);
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
			case SpellPackage.TESTLIST_SAFE__OLD_TEST:
				getOld_test().clear();
				return;
			case SpellPackage.TESTLIST_SAFE__OPTIONAL_COMA:
				setOptionalComa(OPTIONAL_COMA_EDEFAULT);
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
			case SpellPackage.TESTLIST_SAFE__OLD_TEST:
				return old_test != null && !old_test.isEmpty();
			case SpellPackage.TESTLIST_SAFE__OPTIONAL_COMA:
				return optionalComa != OPTIONAL_COMA_EDEFAULT;
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
		result.append(" (optionalComa: ");
		result.append(optionalComa);
		result.append(')');
		return result.toString();
	}

} //testlist_safeImpl
