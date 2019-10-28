/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;
import lu.ses.engineering.spell.controlflow.spell.GetTM;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.arglist;
import lu.ses.engineering.spell.controlflow.spell.test;

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
 * An implementation of the model object '<em><b>Get TM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.GetTMImpl#getTm <em>Tm</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.GetTMImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetTMImpl extends powerImpl implements GetTM {
	/**
	 * The cached value of the '{@link #getTm() <em>Tm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTm()
	 * @generated
	 * @ordered
	 */
	protected test tm;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<arglist> args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetTMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.GET_TM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getTm() {
		return tm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTm(test newTm, NotificationChain msgs) {
		test oldTm = tm;
		tm = newTm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.GET_TM__TM, oldTm, newTm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTm(test newTm) {
		if (newTm != tm) {
			NotificationChain msgs = null;
			if (tm != null)
				msgs = ((InternalEObject)tm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.GET_TM__TM, null, msgs);
			if (newTm != null)
				msgs = ((InternalEObject)newTm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.GET_TM__TM, null, msgs);
			msgs = basicSetTm(newTm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.GET_TM__TM, newTm, newTm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<arglist> getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList<arglist>(arglist.class, this, SpellPackage.GET_TM__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.GET_TM__TM:
				return basicSetTm(null, msgs);
			case SpellPackage.GET_TM__ARGS:
				return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.GET_TM__TM:
				return getTm();
			case SpellPackage.GET_TM__ARGS:
				return getArgs();
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
			case SpellPackage.GET_TM__TM:
				setTm((test)newValue);
				return;
			case SpellPackage.GET_TM__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends arglist>)newValue);
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
			case SpellPackage.GET_TM__TM:
				setTm((test)null);
				return;
			case SpellPackage.GET_TM__ARGS:
				getArgs().clear();
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
			case SpellPackage.GET_TM__TM:
				return tm != null;
			case SpellPackage.GET_TM__ARGS:
				return args != null && !args.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GetTMImpl
