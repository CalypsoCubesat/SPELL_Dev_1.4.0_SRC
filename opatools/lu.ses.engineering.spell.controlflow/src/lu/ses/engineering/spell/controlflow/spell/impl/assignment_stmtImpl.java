/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.assignment_stmt;
import lu.ses.engineering.spell.controlflow.spell.expr_stmt;
import lu.ses.engineering.spell.controlflow.spell.testlist;
import lu.ses.engineering.spell.controlflow.spell.yield_or_testlist;

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
 * An implementation of the model object '<em><b>assignment stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl#getRight <em>Right</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class assignment_stmtImpl extends small_stmtImpl implements assignment_stmt {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected testlist left;

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
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected yield_or_testlist right;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<yield_or_testlist> assignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected assignment_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.ASSIGNMENT_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(testlist newLeft, NotificationChain msgs) {
		testlist oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ASSIGNMENT_STMT__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(testlist newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ASSIGNMENT_STMT__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ASSIGNMENT_STMT__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ASSIGNMENT_STMT__LEFT, newLeft, newLeft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ASSIGNMENT_STMT__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yield_or_testlist getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(yield_or_testlist newRight, NotificationChain msgs) {
		yield_or_testlist oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ASSIGNMENT_STMT__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(yield_or_testlist newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ASSIGNMENT_STMT__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ASSIGNMENT_STMT__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ASSIGNMENT_STMT__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<yield_or_testlist> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectContainmentEList<yield_or_testlist>(yield_or_testlist.class, this, SpellPackage.ASSIGNMENT_STMT__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.ASSIGNMENT_STMT__LEFT:
				return basicSetLeft(null, msgs);
			case SpellPackage.ASSIGNMENT_STMT__RIGHT:
				return basicSetRight(null, msgs);
			case SpellPackage.ASSIGNMENT_STMT__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.ASSIGNMENT_STMT__LEFT:
				return getLeft();
			case SpellPackage.ASSIGNMENT_STMT__SYMBOL:
				return getSymbol();
			case SpellPackage.ASSIGNMENT_STMT__RIGHT:
				return getRight();
			case SpellPackage.ASSIGNMENT_STMT__ASSIGNMENTS:
				return getAssignments();
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
			case SpellPackage.ASSIGNMENT_STMT__LEFT:
				setLeft((testlist)newValue);
				return;
			case SpellPackage.ASSIGNMENT_STMT__SYMBOL:
				setSymbol((String)newValue);
				return;
			case SpellPackage.ASSIGNMENT_STMT__RIGHT:
				setRight((yield_or_testlist)newValue);
				return;
			case SpellPackage.ASSIGNMENT_STMT__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends yield_or_testlist>)newValue);
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
			case SpellPackage.ASSIGNMENT_STMT__LEFT:
				setLeft((testlist)null);
				return;
			case SpellPackage.ASSIGNMENT_STMT__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case SpellPackage.ASSIGNMENT_STMT__RIGHT:
				setRight((yield_or_testlist)null);
				return;
			case SpellPackage.ASSIGNMENT_STMT__ASSIGNMENTS:
				getAssignments().clear();
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
			case SpellPackage.ASSIGNMENT_STMT__LEFT:
				return left != null;
			case SpellPackage.ASSIGNMENT_STMT__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case SpellPackage.ASSIGNMENT_STMT__RIGHT:
				return right != null;
			case SpellPackage.ASSIGNMENT_STMT__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
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
		if (baseClass == expr_stmt.class) {
			switch (derivedFeatureID) {
				case SpellPackage.ASSIGNMENT_STMT__LEFT: return SpellPackage.EXPR_STMT__LEFT;
				case SpellPackage.ASSIGNMENT_STMT__SYMBOL: return SpellPackage.EXPR_STMT__SYMBOL;
				case SpellPackage.ASSIGNMENT_STMT__RIGHT: return SpellPackage.EXPR_STMT__RIGHT;
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
		if (baseClass == expr_stmt.class) {
			switch (baseFeatureID) {
				case SpellPackage.EXPR_STMT__LEFT: return SpellPackage.ASSIGNMENT_STMT__LEFT;
				case SpellPackage.EXPR_STMT__SYMBOL: return SpellPackage.ASSIGNMENT_STMT__SYMBOL;
				case SpellPackage.EXPR_STMT__RIGHT: return SpellPackage.ASSIGNMENT_STMT__RIGHT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //assignment_stmtImpl
