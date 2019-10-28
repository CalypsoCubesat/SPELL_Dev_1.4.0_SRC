/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.atom;
import lu.ses.engineering.spell.controlflow.spell.factor;
import lu.ses.engineering.spell.controlflow.spell.power;
import lu.ses.engineering.spell.controlflow.spell.trailer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.powerImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.powerImpl#getTrailer <em>Trailer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class powerImpl extends factorImpl implements power {
	/**
	 * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtom()
	 * @generated
	 * @ordered
	 */
	protected atom atom;

	/**
	 * The cached value of the '{@link #getTrailer() <em>Trailer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailer()
	 * @generated
	 * @ordered
	 */
	protected EList<trailer> trailer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected powerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.POWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public atom getAtom() {
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtom(atom newAtom, NotificationChain msgs) {
		atom oldAtom = atom;
		atom = newAtom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.POWER__ATOM, oldAtom, newAtom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtom(atom newAtom) {
		if (newAtom != atom) {
			NotificationChain msgs = null;
			if (atom != null)
				msgs = ((InternalEObject)atom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.POWER__ATOM, null, msgs);
			if (newAtom != null)
				msgs = ((InternalEObject)newAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.POWER__ATOM, null, msgs);
			msgs = basicSetAtom(newAtom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.POWER__ATOM, newAtom, newAtom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<trailer> getTrailer() {
		if (trailer == null) {
			trailer = new EObjectContainmentEList<trailer>(trailer.class, this, SpellPackage.POWER__TRAILER);
		}
		return trailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.POWER__ATOM:
				return basicSetAtom(null, msgs);
			case SpellPackage.POWER__TRAILER:
				return ((InternalEList<?>)getTrailer()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.POWER__ATOM:
				return getAtom();
			case SpellPackage.POWER__TRAILER:
				return getTrailer();
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
			case SpellPackage.POWER__ATOM:
				setAtom((atom)newValue);
				return;
			case SpellPackage.POWER__TRAILER:
				getTrailer().clear();
				getTrailer().addAll((Collection<? extends trailer>)newValue);
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
			case SpellPackage.POWER__ATOM:
				setAtom((atom)null);
				return;
			case SpellPackage.POWER__TRAILER:
				getTrailer().clear();
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
			case SpellPackage.POWER__ATOM:
				return atom != null;
			case SpellPackage.POWER__TRAILER:
				return trailer != null && !trailer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //powerImpl
