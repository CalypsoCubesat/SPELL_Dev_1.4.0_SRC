/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.del_stmt;
import lu.ses.engineering.spell.controlflow.spell.exprlist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>del stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.del_stmtImpl#getExprlist <em>Exprlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class del_stmtImpl extends small_stmtImpl implements del_stmt {
	/**
	 * The cached value of the '{@link #getExprlist() <em>Exprlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprlist()
	 * @generated
	 * @ordered
	 */
	protected exprlist exprlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected del_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.DEL_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exprlist getExprlist() {
		return exprlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExprlist(exprlist newExprlist, NotificationChain msgs) {
		exprlist oldExprlist = exprlist;
		exprlist = newExprlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.DEL_STMT__EXPRLIST, oldExprlist, newExprlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExprlist(exprlist newExprlist) {
		if (newExprlist != exprlist) {
			NotificationChain msgs = null;
			if (exprlist != null)
				msgs = ((InternalEObject)exprlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DEL_STMT__EXPRLIST, null, msgs);
			if (newExprlist != null)
				msgs = ((InternalEObject)newExprlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DEL_STMT__EXPRLIST, null, msgs);
			msgs = basicSetExprlist(newExprlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DEL_STMT__EXPRLIST, newExprlist, newExprlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.DEL_STMT__EXPRLIST:
				return basicSetExprlist(null, msgs);
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
			case SpellPackage.DEL_STMT__EXPRLIST:
				return getExprlist();
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
			case SpellPackage.DEL_STMT__EXPRLIST:
				setExprlist((exprlist)newValue);
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
			case SpellPackage.DEL_STMT__EXPRLIST:
				setExprlist((exprlist)null);
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
			case SpellPackage.DEL_STMT__EXPRLIST:
				return exprlist != null;
		}
		return super.eIsSet(featureID);
	}

} //del_stmtImpl
