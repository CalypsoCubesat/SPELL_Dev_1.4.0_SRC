/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.comp_iter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>comp iter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_iterImpl#getComp_iter <em>Comp iter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class comp_iterImpl extends SpellElementImpl implements comp_iter {
	/**
	 * The cached value of the '{@link #getComp_iter() <em>Comp iter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_iter()
	 * @generated
	 * @ordered
	 */
	protected comp_iter comp_iter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected comp_iterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.COMP_ITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comp_iter getComp_iter() {
		return comp_iter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComp_iter(comp_iter newComp_iter, NotificationChain msgs) {
		comp_iter oldComp_iter = comp_iter;
		comp_iter = newComp_iter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.COMP_ITER__COMP_ITER, oldComp_iter, newComp_iter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp_iter(comp_iter newComp_iter) {
		if (newComp_iter != comp_iter) {
			NotificationChain msgs = null;
			if (comp_iter != null)
				msgs = ((InternalEObject)comp_iter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.COMP_ITER__COMP_ITER, null, msgs);
			if (newComp_iter != null)
				msgs = ((InternalEObject)newComp_iter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.COMP_ITER__COMP_ITER, null, msgs);
			msgs = basicSetComp_iter(newComp_iter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.COMP_ITER__COMP_ITER, newComp_iter, newComp_iter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.COMP_ITER__COMP_ITER:
				return basicSetComp_iter(null, msgs);
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
			case SpellPackage.COMP_ITER__COMP_ITER:
				return getComp_iter();
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
			case SpellPackage.COMP_ITER__COMP_ITER:
				setComp_iter((comp_iter)newValue);
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
			case SpellPackage.COMP_ITER__COMP_ITER:
				setComp_iter((comp_iter)null);
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
			case SpellPackage.COMP_ITER__COMP_ITER:
				return comp_iter != null;
		}
		return super.eIsSet(featureID);
	}

} //comp_iterImpl
