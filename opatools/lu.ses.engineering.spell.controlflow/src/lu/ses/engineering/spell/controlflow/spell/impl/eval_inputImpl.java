/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.eval_input;
import lu.ses.engineering.spell.controlflow.spell.testlist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>eval input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.eval_inputImpl#getTestlist <em>Testlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class eval_inputImpl extends python_inputImpl implements eval_input {
	/**
	 * The cached value of the '{@link #getTestlist() <em>Testlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestlist()
	 * @generated
	 * @ordered
	 */
	protected testlist testlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected eval_inputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.EVAL_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist getTestlist() {
		return testlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestlist(testlist newTestlist, NotificationChain msgs) {
		testlist oldTestlist = testlist;
		testlist = newTestlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.EVAL_INPUT__TESTLIST, oldTestlist, newTestlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestlist(testlist newTestlist) {
		if (newTestlist != testlist) {
			NotificationChain msgs = null;
			if (testlist != null)
				msgs = ((InternalEObject)testlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EVAL_INPUT__TESTLIST, null, msgs);
			if (newTestlist != null)
				msgs = ((InternalEObject)newTestlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.EVAL_INPUT__TESTLIST, null, msgs);
			msgs = basicSetTestlist(newTestlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.EVAL_INPUT__TESTLIST, newTestlist, newTestlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.EVAL_INPUT__TESTLIST:
				return basicSetTestlist(null, msgs);
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
			case SpellPackage.EVAL_INPUT__TESTLIST:
				return getTestlist();
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
			case SpellPackage.EVAL_INPUT__TESTLIST:
				setTestlist((testlist)newValue);
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
			case SpellPackage.EVAL_INPUT__TESTLIST:
				setTestlist((testlist)null);
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
			case SpellPackage.EVAL_INPUT__TESTLIST:
				return testlist != null;
		}
		return super.eIsSet(featureID);
	}

} //eval_inputImpl
