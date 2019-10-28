/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.sliceop;
import lu.ses.engineering.spell.controlflow.spell.subscript;
import lu.ses.engineering.spell.controlflow.spell.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>subscript</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl#getSubscript1 <em>Subscript1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl#getSubscript2 <em>Subscript2</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl#getSliceop <em>Sliceop</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class subscriptImpl extends SpellElementImpl implements subscript {
	/**
	 * The cached value of the '{@link #getSubscript1() <em>Subscript1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscript1()
	 * @generated
	 * @ordered
	 */
	protected test subscript1;

	/**
	 * The cached value of the '{@link #getSubscript2() <em>Subscript2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscript2()
	 * @generated
	 * @ordered
	 */
	protected test subscript2;

	/**
	 * The cached value of the '{@link #getSliceop() <em>Sliceop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceop()
	 * @generated
	 * @ordered
	 */
	protected sliceop sliceop;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected subscriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.SUBSCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getSubscript1() {
		return subscript1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscript1(test newSubscript1, NotificationChain msgs) {
		test oldSubscript1 = subscript1;
		subscript1 = newSubscript1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.SUBSCRIPT__SUBSCRIPT1, oldSubscript1, newSubscript1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscript1(test newSubscript1) {
		if (newSubscript1 != subscript1) {
			NotificationChain msgs = null;
			if (subscript1 != null)
				msgs = ((InternalEObject)subscript1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SUBSCRIPT__SUBSCRIPT1, null, msgs);
			if (newSubscript1 != null)
				msgs = ((InternalEObject)newSubscript1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SUBSCRIPT__SUBSCRIPT1, null, msgs);
			msgs = basicSetSubscript1(newSubscript1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.SUBSCRIPT__SUBSCRIPT1, newSubscript1, newSubscript1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getSubscript2() {
		return subscript2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscript2(test newSubscript2, NotificationChain msgs) {
		test oldSubscript2 = subscript2;
		subscript2 = newSubscript2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.SUBSCRIPT__SUBSCRIPT2, oldSubscript2, newSubscript2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscript2(test newSubscript2) {
		if (newSubscript2 != subscript2) {
			NotificationChain msgs = null;
			if (subscript2 != null)
				msgs = ((InternalEObject)subscript2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SUBSCRIPT__SUBSCRIPT2, null, msgs);
			if (newSubscript2 != null)
				msgs = ((InternalEObject)newSubscript2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SUBSCRIPT__SUBSCRIPT2, null, msgs);
			msgs = basicSetSubscript2(newSubscript2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.SUBSCRIPT__SUBSCRIPT2, newSubscript2, newSubscript2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sliceop getSliceop() {
		return sliceop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceop(sliceop newSliceop, NotificationChain msgs) {
		sliceop oldSliceop = sliceop;
		sliceop = newSliceop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.SUBSCRIPT__SLICEOP, oldSliceop, newSliceop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSliceop(sliceop newSliceop) {
		if (newSliceop != sliceop) {
			NotificationChain msgs = null;
			if (sliceop != null)
				msgs = ((InternalEObject)sliceop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SUBSCRIPT__SLICEOP, null, msgs);
			if (newSliceop != null)
				msgs = ((InternalEObject)newSliceop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SUBSCRIPT__SLICEOP, null, msgs);
			msgs = basicSetSliceop(newSliceop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.SUBSCRIPT__SLICEOP, newSliceop, newSliceop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.SUBSCRIPT__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.SUBSCRIPT__SUBSCRIPT1:
				return basicSetSubscript1(null, msgs);
			case SpellPackage.SUBSCRIPT__SUBSCRIPT2:
				return basicSetSubscript2(null, msgs);
			case SpellPackage.SUBSCRIPT__SLICEOP:
				return basicSetSliceop(null, msgs);
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
			case SpellPackage.SUBSCRIPT__SUBSCRIPT1:
				return getSubscript1();
			case SpellPackage.SUBSCRIPT__SUBSCRIPT2:
				return getSubscript2();
			case SpellPackage.SUBSCRIPT__SLICEOP:
				return getSliceop();
			case SpellPackage.SUBSCRIPT__SYMBOL:
				return getSymbol();
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
			case SpellPackage.SUBSCRIPT__SUBSCRIPT1:
				setSubscript1((test)newValue);
				return;
			case SpellPackage.SUBSCRIPT__SUBSCRIPT2:
				setSubscript2((test)newValue);
				return;
			case SpellPackage.SUBSCRIPT__SLICEOP:
				setSliceop((sliceop)newValue);
				return;
			case SpellPackage.SUBSCRIPT__SYMBOL:
				setSymbol((String)newValue);
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
			case SpellPackage.SUBSCRIPT__SUBSCRIPT1:
				setSubscript1((test)null);
				return;
			case SpellPackage.SUBSCRIPT__SUBSCRIPT2:
				setSubscript2((test)null);
				return;
			case SpellPackage.SUBSCRIPT__SLICEOP:
				setSliceop((sliceop)null);
				return;
			case SpellPackage.SUBSCRIPT__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
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
			case SpellPackage.SUBSCRIPT__SUBSCRIPT1:
				return subscript1 != null;
			case SpellPackage.SUBSCRIPT__SUBSCRIPT2:
				return subscript2 != null;
			case SpellPackage.SUBSCRIPT__SLICEOP:
				return sliceop != null;
			case SpellPackage.SUBSCRIPT__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
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
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //subscriptImpl
