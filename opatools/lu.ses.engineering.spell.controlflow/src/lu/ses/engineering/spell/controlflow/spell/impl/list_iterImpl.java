/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.list_iter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>list iter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.list_iterImpl#getList_iter <em>List iter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class list_iterImpl extends SpellElementImpl implements list_iter {
	/**
	 * The cached value of the '{@link #getList_iter() <em>List iter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList_iter()
	 * @generated
	 * @ordered
	 */
	protected list_iter list_iter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected list_iterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.LIST_ITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public list_iter getList_iter() {
		return list_iter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList_iter(list_iter newList_iter, NotificationChain msgs) {
		list_iter oldList_iter = list_iter;
		list_iter = newList_iter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.LIST_ITER__LIST_ITER, oldList_iter, newList_iter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList_iter(list_iter newList_iter) {
		if (newList_iter != list_iter) {
			NotificationChain msgs = null;
			if (list_iter != null)
				msgs = ((InternalEObject)list_iter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LIST_ITER__LIST_ITER, null, msgs);
			if (newList_iter != null)
				msgs = ((InternalEObject)newList_iter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.LIST_ITER__LIST_ITER, null, msgs);
			msgs = basicSetList_iter(newList_iter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.LIST_ITER__LIST_ITER, newList_iter, newList_iter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.LIST_ITER__LIST_ITER:
				return basicSetList_iter(null, msgs);
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
			case SpellPackage.LIST_ITER__LIST_ITER:
				return getList_iter();
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
			case SpellPackage.LIST_ITER__LIST_ITER:
				setList_iter((list_iter)newValue);
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
			case SpellPackage.LIST_ITER__LIST_ITER:
				setList_iter((list_iter)null);
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
			case SpellPackage.LIST_ITER__LIST_ITER:
				return list_iter != null;
		}
		return super.eIsSet(featureID);
	}

} //list_iterImpl
