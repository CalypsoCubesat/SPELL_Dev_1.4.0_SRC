/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.fpdef;
import lu.ses.engineering.spell.controlflow.spell.fplist;

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
 * An implementation of the model object '<em><b>fplist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.fplistImpl#getDef1 <em>Def1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.fplistImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.fplistImpl#isOptionalSemicolon <em>Optional Semicolon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fplistImpl extends SpellElementImpl implements fplist {
	/**
	 * The cached value of the '{@link #getDef1() <em>Def1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef1()
	 * @generated
	 * @ordered
	 */
	protected fpdef def1;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<fpdef> definitions;

	/**
	 * The default value of the '{@link #isOptionalSemicolon() <em>Optional Semicolon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalSemicolon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_SEMICOLON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptionalSemicolon() <em>Optional Semicolon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalSemicolon()
	 * @generated
	 * @ordered
	 */
	protected boolean optionalSemicolon = OPTIONAL_SEMICOLON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected fplistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.FPLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fpdef getDef1() {
		return def1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef1(fpdef newDef1, NotificationChain msgs) {
		fpdef oldDef1 = def1;
		def1 = newDef1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.FPLIST__DEF1, oldDef1, newDef1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef1(fpdef newDef1) {
		if (newDef1 != def1) {
			NotificationChain msgs = null;
			if (def1 != null)
				msgs = ((InternalEObject)def1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FPLIST__DEF1, null, msgs);
			if (newDef1 != null)
				msgs = ((InternalEObject)newDef1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FPLIST__DEF1, null, msgs);
			msgs = basicSetDef1(newDef1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.FPLIST__DEF1, newDef1, newDef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fpdef> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<fpdef>(fpdef.class, this, SpellPackage.FPLIST__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionalSemicolon() {
		return optionalSemicolon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalSemicolon(boolean newOptionalSemicolon) {
		boolean oldOptionalSemicolon = optionalSemicolon;
		optionalSemicolon = newOptionalSemicolon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.FPLIST__OPTIONAL_SEMICOLON, oldOptionalSemicolon, optionalSemicolon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.FPLIST__DEF1:
				return basicSetDef1(null, msgs);
			case SpellPackage.FPLIST__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.FPLIST__DEF1:
				return getDef1();
			case SpellPackage.FPLIST__DEFINITIONS:
				return getDefinitions();
			case SpellPackage.FPLIST__OPTIONAL_SEMICOLON:
				return isOptionalSemicolon();
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
			case SpellPackage.FPLIST__DEF1:
				setDef1((fpdef)newValue);
				return;
			case SpellPackage.FPLIST__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends fpdef>)newValue);
				return;
			case SpellPackage.FPLIST__OPTIONAL_SEMICOLON:
				setOptionalSemicolon((Boolean)newValue);
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
			case SpellPackage.FPLIST__DEF1:
				setDef1((fpdef)null);
				return;
			case SpellPackage.FPLIST__DEFINITIONS:
				getDefinitions().clear();
				return;
			case SpellPackage.FPLIST__OPTIONAL_SEMICOLON:
				setOptionalSemicolon(OPTIONAL_SEMICOLON_EDEFAULT);
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
			case SpellPackage.FPLIST__DEF1:
				return def1 != null;
			case SpellPackage.FPLIST__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case SpellPackage.FPLIST__OPTIONAL_SEMICOLON:
				return optionalSemicolon != OPTIONAL_SEMICOLON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (optionalSemicolon: ");
		result.append(optionalSemicolon);
		result.append(')');
		return result.toString();
	}

} //fplistImpl
