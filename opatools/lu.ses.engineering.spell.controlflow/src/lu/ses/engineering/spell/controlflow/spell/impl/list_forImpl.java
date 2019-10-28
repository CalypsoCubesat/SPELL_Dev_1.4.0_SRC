/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.exprlist;
import lu.ses.engineering.spell.controlflow.spell.list_for;
import lu.ses.engineering.spell.controlflow.spell.testlist_safe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>list for</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.list_forImpl#getExprlist <em>Exprlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.list_forImpl#getTestlist_safe <em>Testlist safe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class list_forImpl extends list_iterImpl implements list_for {
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
	 * The cached value of the '{@link #getTestlist_safe() <em>Testlist safe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestlist_safe()
	 * @generated
	 * @ordered
	 */
	protected testlist_safe testlist_safe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected list_forImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.LIST_FOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.LIST_FOR__EXPRLIST, oldExprlist, newExprlist);
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
				msgs = ((InternalEObject)exprlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LIST_FOR__EXPRLIST, null, msgs);
			if (newExprlist != null)
				msgs = ((InternalEObject)newExprlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LIST_FOR__EXPRLIST, null, msgs);
			msgs = basicSetExprlist(newExprlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.LIST_FOR__EXPRLIST, newExprlist, newExprlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist_safe getTestlist_safe() {
		return testlist_safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestlist_safe(testlist_safe newTestlist_safe, NotificationChain msgs) {
		testlist_safe oldTestlist_safe = testlist_safe;
		testlist_safe = newTestlist_safe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.LIST_FOR__TESTLIST_SAFE, oldTestlist_safe, newTestlist_safe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestlist_safe(testlist_safe newTestlist_safe) {
		if (newTestlist_safe != testlist_safe) {
			NotificationChain msgs = null;
			if (testlist_safe != null)
				msgs = ((InternalEObject)testlist_safe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LIST_FOR__TESTLIST_SAFE, null, msgs);
			if (newTestlist_safe != null)
				msgs = ((InternalEObject)newTestlist_safe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LIST_FOR__TESTLIST_SAFE, null, msgs);
			msgs = basicSetTestlist_safe(newTestlist_safe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.LIST_FOR__TESTLIST_SAFE, newTestlist_safe, newTestlist_safe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.LIST_FOR__EXPRLIST:
				return basicSetExprlist(null, msgs);
			case SpellPackage.LIST_FOR__TESTLIST_SAFE:
				return basicSetTestlist_safe(null, msgs);
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
			case SpellPackage.LIST_FOR__EXPRLIST:
				return getExprlist();
			case SpellPackage.LIST_FOR__TESTLIST_SAFE:
				return getTestlist_safe();
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
			case SpellPackage.LIST_FOR__EXPRLIST:
				setExprlist((exprlist)newValue);
				return;
			case SpellPackage.LIST_FOR__TESTLIST_SAFE:
				setTestlist_safe((testlist_safe)newValue);
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
			case SpellPackage.LIST_FOR__EXPRLIST:
				setExprlist((exprlist)null);
				return;
			case SpellPackage.LIST_FOR__TESTLIST_SAFE:
				setTestlist_safe((testlist_safe)null);
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
			case SpellPackage.LIST_FOR__EXPRLIST:
				return exprlist != null;
			case SpellPackage.LIST_FOR__TESTLIST_SAFE:
				return testlist_safe != null;
		}
		return super.eIsSet(featureID);
	}

} //list_forImpl
