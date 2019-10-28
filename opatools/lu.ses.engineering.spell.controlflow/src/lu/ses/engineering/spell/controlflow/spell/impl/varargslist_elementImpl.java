/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.fpdef;
import lu.ses.engineering.spell.controlflow.spell.test;
import lu.ses.engineering.spell.controlflow.spell.varargslist_element;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>varargslist element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslist_elementImpl#getFpdef <em>Fpdef</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslist_elementImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class varargslist_elementImpl extends SpellElementImpl implements varargslist_element {
	/**
	 * The cached value of the '{@link #getFpdef() <em>Fpdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpdef()
	 * @generated
	 * @ordered
	 */
	protected fpdef fpdef;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected varargslist_elementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.VARARGSLIST_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fpdef getFpdef() {
		return fpdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFpdef(fpdef newFpdef, NotificationChain msgs) {
		fpdef oldFpdef = fpdef;
		fpdef = newFpdef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST_ELEMENT__FPDEF, oldFpdef, newFpdef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFpdef(fpdef newFpdef) {
		if (newFpdef != fpdef) {
			NotificationChain msgs = null;
			if (fpdef != null)
				msgs = ((InternalEObject)fpdef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.VARARGSLIST_ELEMENT__FPDEF, null, msgs);
			if (newFpdef != null)
				msgs = ((InternalEObject)newFpdef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.VARARGSLIST_ELEMENT__FPDEF, null, msgs);
			msgs = basicSetFpdef(newFpdef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST_ELEMENT__FPDEF, newFpdef, newFpdef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST_ELEMENT__TEST, oldTest, newTest);
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
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.VARARGSLIST_ELEMENT__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.VARARGSLIST_ELEMENT__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST_ELEMENT__TEST, newTest, newTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.VARARGSLIST_ELEMENT__FPDEF:
				return basicSetFpdef(null, msgs);
			case SpellPackage.VARARGSLIST_ELEMENT__TEST:
				return basicSetTest(null, msgs);
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
			case SpellPackage.VARARGSLIST_ELEMENT__FPDEF:
				return getFpdef();
			case SpellPackage.VARARGSLIST_ELEMENT__TEST:
				return getTest();
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
			case SpellPackage.VARARGSLIST_ELEMENT__FPDEF:
				setFpdef((fpdef)newValue);
				return;
			case SpellPackage.VARARGSLIST_ELEMENT__TEST:
				setTest((test)newValue);
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
			case SpellPackage.VARARGSLIST_ELEMENT__FPDEF:
				setFpdef((fpdef)null);
				return;
			case SpellPackage.VARARGSLIST_ELEMENT__TEST:
				setTest((test)null);
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
			case SpellPackage.VARARGSLIST_ELEMENT__FPDEF:
				return fpdef != null;
			case SpellPackage.VARARGSLIST_ELEMENT__TEST:
				return test != null;
		}
		return super.eIsSet(featureID);
	}

} //varargslist_elementImpl
