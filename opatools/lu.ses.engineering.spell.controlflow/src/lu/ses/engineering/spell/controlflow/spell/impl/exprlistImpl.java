/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.expr;
import lu.ses.engineering.spell.controlflow.spell.exprlist;

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
 * An implementation of the model object '<em><b>exprlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.exprlistImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.exprlistImpl#isOptionalComma <em>Optional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class exprlistImpl extends SpellElementImpl implements exprlist {
	/**
	 * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprs()
	 * @generated
	 * @ordered
	 */
	protected EList<expr> exprs;

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
	protected exprlistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.EXPRLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<expr> getExprs() {
		if (exprs == null) {
			exprs = new EObjectContainmentEList<expr>(expr.class, this, SpellPackage.EXPRLIST__EXPRS);
		}
		return exprs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.EXPRLIST__OPTIONAL_COMMA, oldOptionalComma, optionalComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.EXPRLIST__EXPRS:
				return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.EXPRLIST__EXPRS:
				return getExprs();
			case SpellPackage.EXPRLIST__OPTIONAL_COMMA:
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
			case SpellPackage.EXPRLIST__EXPRS:
				getExprs().clear();
				getExprs().addAll((Collection<? extends expr>)newValue);
				return;
			case SpellPackage.EXPRLIST__OPTIONAL_COMMA:
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
			case SpellPackage.EXPRLIST__EXPRS:
				getExprs().clear();
				return;
			case SpellPackage.EXPRLIST__OPTIONAL_COMMA:
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
			case SpellPackage.EXPRLIST__EXPRS:
				return exprs != null && !exprs.isEmpty();
			case SpellPackage.EXPRLIST__OPTIONAL_COMMA:
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

} //exprlistImpl
