/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.dotted_as_name;
import lu.ses.engineering.spell.controlflow.spell.dotted_as_names;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dotted as names</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_namesImpl#getDotted_names <em>Dotted names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dotted_as_namesImpl extends SpellElementImpl implements dotted_as_names {
	/**
	 * The cached value of the '{@link #getDotted_names() <em>Dotted names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDotted_names()
	 * @generated
	 * @ordered
	 */
	protected EList<dotted_as_name> dotted_names;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dotted_as_namesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.DOTTED_AS_NAMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<dotted_as_name> getDotted_names() {
		if (dotted_names == null) {
			dotted_names = new EObjectContainmentEList<dotted_as_name>(dotted_as_name.class, this, SpellPackage.DOTTED_AS_NAMES__DOTTED_NAMES);
		}
		return dotted_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.DOTTED_AS_NAMES__DOTTED_NAMES:
				return ((InternalEList<?>)getDotted_names()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.DOTTED_AS_NAMES__DOTTED_NAMES:
				return getDotted_names();
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
			case SpellPackage.DOTTED_AS_NAMES__DOTTED_NAMES:
				getDotted_names().clear();
				getDotted_names().addAll((Collection<? extends dotted_as_name>)newValue);
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
			case SpellPackage.DOTTED_AS_NAMES__DOTTED_NAMES:
				getDotted_names().clear();
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
			case SpellPackage.DOTTED_AS_NAMES__DOTTED_NAMES:
				return dotted_names != null && !dotted_names.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //dotted_as_namesImpl
