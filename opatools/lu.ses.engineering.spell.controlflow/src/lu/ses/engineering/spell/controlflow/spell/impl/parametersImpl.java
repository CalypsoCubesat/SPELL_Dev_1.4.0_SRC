/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.parameters;
import lu.ses.engineering.spell.controlflow.spell.varargslist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.parametersImpl#getVarargslist <em>Varargslist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class parametersImpl extends SpellElementImpl implements parameters {
	/**
	 * The cached value of the '{@link #getVarargslist() <em>Varargslist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargslist()
	 * @generated
	 * @ordered
	 */
	protected varargslist varargslist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected parametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public varargslist getVarargslist() {
		return varargslist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarargslist(varargslist newVarargslist, NotificationChain msgs) {
		varargslist oldVarargslist = varargslist;
		varargslist = newVarargslist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.PARAMETERS__VARARGSLIST, oldVarargslist, newVarargslist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargslist(varargslist newVarargslist) {
		if (newVarargslist != varargslist) {
			NotificationChain msgs = null;
			if (varargslist != null)
				msgs = ((InternalEObject)varargslist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.PARAMETERS__VARARGSLIST, null, msgs);
			if (newVarargslist != null)
				msgs = ((InternalEObject)newVarargslist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.PARAMETERS__VARARGSLIST, null, msgs);
			msgs = basicSetVarargslist(newVarargslist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.PARAMETERS__VARARGSLIST, newVarargslist, newVarargslist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.PARAMETERS__VARARGSLIST:
				return basicSetVarargslist(null, msgs);
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
			case SpellPackage.PARAMETERS__VARARGSLIST:
				return getVarargslist();
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
			case SpellPackage.PARAMETERS__VARARGSLIST:
				setVarargslist((varargslist)newValue);
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
			case SpellPackage.PARAMETERS__VARARGSLIST:
				setVarargslist((varargslist)null);
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
			case SpellPackage.PARAMETERS__VARARGSLIST:
				return varargslist != null;
		}
		return super.eIsSet(featureID);
	}

} //parametersImpl