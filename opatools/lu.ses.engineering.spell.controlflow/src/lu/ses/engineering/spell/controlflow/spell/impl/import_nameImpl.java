/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.dotted_as_names;
import lu.ses.engineering.spell.controlflow.spell.import_name;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>import name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.import_nameImpl#getDotted_as_names <em>Dotted as names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class import_nameImpl extends import_stmtImpl implements import_name {
	/**
	 * The cached value of the '{@link #getDotted_as_names() <em>Dotted as names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDotted_as_names()
	 * @generated
	 * @ordered
	 */
	protected dotted_as_names dotted_as_names;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected import_nameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.IMPORT_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dotted_as_names getDotted_as_names() {
		return dotted_as_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDotted_as_names(dotted_as_names newDotted_as_names, NotificationChain msgs) {
		dotted_as_names oldDotted_as_names = dotted_as_names;
		dotted_as_names = newDotted_as_names;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES, oldDotted_as_names, newDotted_as_names);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDotted_as_names(dotted_as_names newDotted_as_names) {
		if (newDotted_as_names != dotted_as_names) {
			NotificationChain msgs = null;
			if (dotted_as_names != null)
				msgs = ((InternalEObject)dotted_as_names).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES, null, msgs);
			if (newDotted_as_names != null)
				msgs = ((InternalEObject)newDotted_as_names).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES, null, msgs);
			msgs = basicSetDotted_as_names(newDotted_as_names, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES, newDotted_as_names, newDotted_as_names));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES:
				return basicSetDotted_as_names(null, msgs);
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
			case SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES:
				return getDotted_as_names();
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
			case SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES:
				setDotted_as_names((dotted_as_names)newValue);
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
			case SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES:
				setDotted_as_names((dotted_as_names)null);
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
			case SpellPackage.IMPORT_NAME__DOTTED_AS_NAMES:
				return dotted_as_names != null;
		}
		return super.eIsSet(featureID);
	}

} //import_nameImpl
