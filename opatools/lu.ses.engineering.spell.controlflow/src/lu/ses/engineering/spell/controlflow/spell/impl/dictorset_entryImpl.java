/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.dictorset_entry;
import lu.ses.engineering.spell.controlflow.spell.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dictorset entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorset_entryImpl#getTest1 <em>Test1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorset_entryImpl#getTest2 <em>Test2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dictorset_entryImpl extends SpellElementImpl implements dictorset_entry {
	/**
	 * The cached value of the '{@link #getTest1() <em>Test1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest1()
	 * @generated
	 * @ordered
	 */
	protected test test1;

	/**
	 * The cached value of the '{@link #getTest2() <em>Test2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest2()
	 * @generated
	 * @ordered
	 */
	protected test test2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dictorset_entryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.DICTORSET_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getTest1() {
		return test1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest1(test newTest1, NotificationChain msgs) {
		test oldTest1 = test1;
		test1 = newTest1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.DICTORSET_ENTRY__TEST1, oldTest1, newTest1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest1(test newTest1) {
		if (newTest1 != test1) {
			NotificationChain msgs = null;
			if (test1 != null)
				msgs = ((InternalEObject)test1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DICTORSET_ENTRY__TEST1, null, msgs);
			if (newTest1 != null)
				msgs = ((InternalEObject)newTest1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DICTORSET_ENTRY__TEST1, null, msgs);
			msgs = basicSetTest1(newTest1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DICTORSET_ENTRY__TEST1, newTest1, newTest1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getTest2() {
		return test2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest2(test newTest2, NotificationChain msgs) {
		test oldTest2 = test2;
		test2 = newTest2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.DICTORSET_ENTRY__TEST2, oldTest2, newTest2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest2(test newTest2) {
		if (newTest2 != test2) {
			NotificationChain msgs = null;
			if (test2 != null)
				msgs = ((InternalEObject)test2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DICTORSET_ENTRY__TEST2, null, msgs);
			if (newTest2 != null)
				msgs = ((InternalEObject)newTest2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DICTORSET_ENTRY__TEST2, null, msgs);
			msgs = basicSetTest2(newTest2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DICTORSET_ENTRY__TEST2, newTest2, newTest2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.DICTORSET_ENTRY__TEST1:
				return basicSetTest1(null, msgs);
			case SpellPackage.DICTORSET_ENTRY__TEST2:
				return basicSetTest2(null, msgs);
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
			case SpellPackage.DICTORSET_ENTRY__TEST1:
				return getTest1();
			case SpellPackage.DICTORSET_ENTRY__TEST2:
				return getTest2();
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
			case SpellPackage.DICTORSET_ENTRY__TEST1:
				setTest1((test)newValue);
				return;
			case SpellPackage.DICTORSET_ENTRY__TEST2:
				setTest2((test)newValue);
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
			case SpellPackage.DICTORSET_ENTRY__TEST1:
				setTest1((test)null);
				return;
			case SpellPackage.DICTORSET_ENTRY__TEST2:
				setTest2((test)null);
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
			case SpellPackage.DICTORSET_ENTRY__TEST1:
				return test1 != null;
			case SpellPackage.DICTORSET_ENTRY__TEST2:
				return test2 != null;
		}
		return super.eIsSet(featureID);
	}

} //dictorset_entryImpl
