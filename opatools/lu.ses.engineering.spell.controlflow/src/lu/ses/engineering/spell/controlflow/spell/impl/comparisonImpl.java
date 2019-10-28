/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.comparison;
import lu.ses.engineering.spell.controlflow.spell.expr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.comparisonImpl#getComp_op <em>Comp op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class comparisonImpl extends not_testImpl implements comparison {
	/**
	 * The default value of the '{@link #getComp_op() <em>Comp op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_op()
	 * @generated
	 * @ordered
	 */
	protected static final String COMP_OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComp_op() <em>Comp op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_op()
	 * @generated
	 * @ordered
	 */
	protected String comp_op = COMP_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected comparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComp_op() {
		return comp_op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp_op(String newComp_op) {
		String oldComp_op = comp_op;
		comp_op = newComp_op;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.COMPARISON__COMP_OP, oldComp_op, comp_op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpellPackage.COMPARISON__COMP_OP:
				return getComp_op();
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
			case SpellPackage.COMPARISON__COMP_OP:
				setComp_op((String)newValue);
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
			case SpellPackage.COMPARISON__COMP_OP:
				setComp_op(COMP_OP_EDEFAULT);
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
			case SpellPackage.COMPARISON__COMP_OP:
				return COMP_OP_EDEFAULT == null ? comp_op != null : !COMP_OP_EDEFAULT.equals(comp_op);
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
		result.append(" (comp_op: ");
		result.append(comp_op);
		result.append(')');
		return result.toString();
	}

} //comparisonImpl
