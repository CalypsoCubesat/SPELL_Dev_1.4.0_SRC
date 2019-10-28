/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.yield_expr;
import lu.ses.engineering.spell.controlflow.spell.yield_stmt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>yield stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_stmtImpl#getYield_expr <em>Yield expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class yield_stmtImpl extends flow_stmtImpl implements yield_stmt {
	/**
	 * The cached value of the '{@link #getYield_expr() <em>Yield expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYield_expr()
	 * @generated
	 * @ordered
	 */
	protected yield_expr yield_expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected yield_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.YIELD_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yield_expr getYield_expr() {
		return yield_expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYield_expr(yield_expr newYield_expr, NotificationChain msgs) {
		yield_expr oldYield_expr = yield_expr;
		yield_expr = newYield_expr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.YIELD_STMT__YIELD_EXPR, oldYield_expr, newYield_expr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYield_expr(yield_expr newYield_expr) {
		if (newYield_expr != yield_expr) {
			NotificationChain msgs = null;
			if (yield_expr != null)
				msgs = ((InternalEObject)yield_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.YIELD_STMT__YIELD_EXPR, null, msgs);
			if (newYield_expr != null)
				msgs = ((InternalEObject)newYield_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.YIELD_STMT__YIELD_EXPR, null, msgs);
			msgs = basicSetYield_expr(newYield_expr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.YIELD_STMT__YIELD_EXPR, newYield_expr, newYield_expr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.YIELD_STMT__YIELD_EXPR:
				return basicSetYield_expr(null, msgs);
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
			case SpellPackage.YIELD_STMT__YIELD_EXPR:
				return getYield_expr();
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
			case SpellPackage.YIELD_STMT__YIELD_EXPR:
				setYield_expr((yield_expr)newValue);
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
			case SpellPackage.YIELD_STMT__YIELD_EXPR:
				setYield_expr((yield_expr)null);
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
			case SpellPackage.YIELD_STMT__YIELD_EXPR:
				return yield_expr != null;
		}
		return super.eIsSet(featureID);
	}

} //yield_stmtImpl
