/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.import_as_names;
import lu.ses.engineering.spell.controlflow.spell.import_from;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>import from</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl#getDots <em>Dots</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl#getDotted_name <em>Dotted name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl#getDots2 <em>Dots2</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl#getImport_as_names <em>Import as names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class import_fromImpl extends import_stmtImpl implements import_from {
	/**
	 * The cached value of the '{@link #getDots() <em>Dots</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dots;

	/**
	 * The default value of the '{@link #getDotted_name() <em>Dotted name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDotted_name()
	 * @generated
	 * @ordered
	 */
	protected static final String DOTTED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDotted_name() <em>Dotted name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDotted_name()
	 * @generated
	 * @ordered
	 */
	protected String dotted_name = DOTTED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDots2() <em>Dots2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dots2;

	/**
	 * The default value of the '{@link #isRoundBracket() <em>Round Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundBracket()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUND_BRACKET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoundBracket() <em>Round Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundBracket()
	 * @generated
	 * @ordered
	 */
	protected boolean roundBracket = ROUND_BRACKET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport_as_names() <em>Import as names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_as_names()
	 * @generated
	 * @ordered
	 */
	protected import_as_names import_as_names;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected import_fromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.IMPORT_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDots() {
		if (dots == null) {
			dots = new EDataTypeEList<String>(String.class, this, SpellPackage.IMPORT_FROM__DOTS);
		}
		return dots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDotted_name() {
		return dotted_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDotted_name(String newDotted_name) {
		String oldDotted_name = dotted_name;
		dotted_name = newDotted_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.IMPORT_FROM__DOTTED_NAME, oldDotted_name, dotted_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDots2() {
		if (dots2 == null) {
			dots2 = new EDataTypeEList<String>(String.class, this, SpellPackage.IMPORT_FROM__DOTS2);
		}
		return dots2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoundBracket() {
		return roundBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundBracket(boolean newRoundBracket) {
		boolean oldRoundBracket = roundBracket;
		roundBracket = newRoundBracket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.IMPORT_FROM__ROUND_BRACKET, oldRoundBracket, roundBracket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public import_as_names getImport_as_names() {
		return import_as_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport_as_names(import_as_names newImport_as_names, NotificationChain msgs) {
		import_as_names oldImport_as_names = import_as_names;
		import_as_names = newImport_as_names;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES, oldImport_as_names, newImport_as_names);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport_as_names(import_as_names newImport_as_names) {
		if (newImport_as_names != import_as_names) {
			NotificationChain msgs = null;
			if (import_as_names != null)
				msgs = ((InternalEObject)import_as_names).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES, null, msgs);
			if (newImport_as_names != null)
				msgs = ((InternalEObject)newImport_as_names).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES, null, msgs);
			msgs = basicSetImport_as_names(newImport_as_names, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES, newImport_as_names, newImport_as_names));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES:
				return basicSetImport_as_names(null, msgs);
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
			case SpellPackage.IMPORT_FROM__DOTS:
				return getDots();
			case SpellPackage.IMPORT_FROM__DOTTED_NAME:
				return getDotted_name();
			case SpellPackage.IMPORT_FROM__DOTS2:
				return getDots2();
			case SpellPackage.IMPORT_FROM__ROUND_BRACKET:
				return isRoundBracket();
			case SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES:
				return getImport_as_names();
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
			case SpellPackage.IMPORT_FROM__DOTS:
				getDots().clear();
				getDots().addAll((Collection<? extends String>)newValue);
				return;
			case SpellPackage.IMPORT_FROM__DOTTED_NAME:
				setDotted_name((String)newValue);
				return;
			case SpellPackage.IMPORT_FROM__DOTS2:
				getDots2().clear();
				getDots2().addAll((Collection<? extends String>)newValue);
				return;
			case SpellPackage.IMPORT_FROM__ROUND_BRACKET:
				setRoundBracket((Boolean)newValue);
				return;
			case SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES:
				setImport_as_names((import_as_names)newValue);
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
			case SpellPackage.IMPORT_FROM__DOTS:
				getDots().clear();
				return;
			case SpellPackage.IMPORT_FROM__DOTTED_NAME:
				setDotted_name(DOTTED_NAME_EDEFAULT);
				return;
			case SpellPackage.IMPORT_FROM__DOTS2:
				getDots2().clear();
				return;
			case SpellPackage.IMPORT_FROM__ROUND_BRACKET:
				setRoundBracket(ROUND_BRACKET_EDEFAULT);
				return;
			case SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES:
				setImport_as_names((import_as_names)null);
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
			case SpellPackage.IMPORT_FROM__DOTS:
				return dots != null && !dots.isEmpty();
			case SpellPackage.IMPORT_FROM__DOTTED_NAME:
				return DOTTED_NAME_EDEFAULT == null ? dotted_name != null : !DOTTED_NAME_EDEFAULT.equals(dotted_name);
			case SpellPackage.IMPORT_FROM__DOTS2:
				return dots2 != null && !dots2.isEmpty();
			case SpellPackage.IMPORT_FROM__ROUND_BRACKET:
				return roundBracket != ROUND_BRACKET_EDEFAULT;
			case SpellPackage.IMPORT_FROM__IMPORT_AS_NAMES:
				return import_as_names != null;
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
		result.append(" (dots: ");
		result.append(dots);
		result.append(", dotted_name: ");
		result.append(dotted_name);
		result.append(", dots2: ");
		result.append(dots2);
		result.append(", roundBracket: ");
		result.append(roundBracket);
		result.append(')');
		return result.toString();
	}

} //import_fromImpl
