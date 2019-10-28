/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.comp_for;
import lu.ses.engineering.spell.controlflow.spell.exprlist;
import lu.ses.engineering.spell.controlflow.spell.or_test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>comp for</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_forImpl#getExprlist <em>Exprlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_forImpl#getOr_test <em>Or test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class comp_forImpl extends comp_iterImpl implements comp_for {
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
	 * The cached value of the '{@link #getOr_test() <em>Or test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr_test()
	 * @generated
	 * @ordered
	 */
	protected or_test or_test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected comp_forImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.COMP_FOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.COMP_FOR__EXPRLIST, oldExprlist, newExprlist);
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
				msgs = ((InternalEObject)exprlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.COMP_FOR__EXPRLIST, null, msgs);
			if (newExprlist != null)
				msgs = ((InternalEObject)newExprlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.COMP_FOR__EXPRLIST, null, msgs);
			msgs = basicSetExprlist(newExprlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.COMP_FOR__EXPRLIST, newExprlist, newExprlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public or_test getOr_test() {
		return or_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr_test(or_test newOr_test, NotificationChain msgs) {
		or_test oldOr_test = or_test;
		or_test = newOr_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.COMP_FOR__OR_TEST, oldOr_test, newOr_test);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr_test(or_test newOr_test) {
		if (newOr_test != or_test) {
			NotificationChain msgs = null;
			if (or_test != null)
				msgs = ((InternalEObject)or_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.COMP_FOR__OR_TEST, null, msgs);
			if (newOr_test != null)
				msgs = ((InternalEObject)newOr_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.COMP_FOR__OR_TEST, null, msgs);
			msgs = basicSetOr_test(newOr_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.COMP_FOR__OR_TEST, newOr_test, newOr_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.COMP_FOR__EXPRLIST:
				return basicSetExprlist(null, msgs);
			case SpellPackage.COMP_FOR__OR_TEST:
				return basicSetOr_test(null, msgs);
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
			case SpellPackage.COMP_FOR__EXPRLIST:
				return getExprlist();
			case SpellPackage.COMP_FOR__OR_TEST:
				return getOr_test();
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
			case SpellPackage.COMP_FOR__EXPRLIST:
				setExprlist((exprlist)newValue);
				return;
			case SpellPackage.COMP_FOR__OR_TEST:
				setOr_test((or_test)newValue);
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
			case SpellPackage.COMP_FOR__EXPRLIST:
				setExprlist((exprlist)null);
				return;
			case SpellPackage.COMP_FOR__OR_TEST:
				setOr_test((or_test)null);
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
			case SpellPackage.COMP_FOR__EXPRLIST:
				return exprlist != null;
			case SpellPackage.COMP_FOR__OR_TEST:
				return or_test != null;
		}
		return super.eIsSet(featureID);
	}

} //comp_forImpl
