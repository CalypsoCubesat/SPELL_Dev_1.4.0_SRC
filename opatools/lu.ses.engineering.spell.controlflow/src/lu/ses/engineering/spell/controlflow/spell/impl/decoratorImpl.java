/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.arglist;
import lu.ses.engineering.spell.controlflow.spell.decorator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratorImpl#getDotted_name <em>Dotted name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratorImpl#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratorImpl#getArglist <em>Arglist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class decoratorImpl extends SpellElementImpl implements decorator {
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
	 * The cached value of the '{@link #getArglist() <em>Arglist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArglist()
	 * @generated
	 * @ordered
	 */
	protected arglist arglist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.DECORATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DECORATOR__DOTTED_NAME, oldDotted_name, dotted_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DECORATOR__ROUND_BRACKET, oldRoundBracket, roundBracket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arglist getArglist() {
		return arglist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArglist(arglist newArglist, NotificationChain msgs) {
		arglist oldArglist = arglist;
		arglist = newArglist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.DECORATOR__ARGLIST, oldArglist, newArglist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArglist(arglist newArglist) {
		if (newArglist != arglist) {
			NotificationChain msgs = null;
			if (arglist != null)
				msgs = ((InternalEObject)arglist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DECORATOR__ARGLIST, null, msgs);
			if (newArglist != null)
				msgs = ((InternalEObject)newArglist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.DECORATOR__ARGLIST, null, msgs);
			msgs = basicSetArglist(newArglist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.DECORATOR__ARGLIST, newArglist, newArglist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.DECORATOR__ARGLIST:
				return basicSetArglist(null, msgs);
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
			case SpellPackage.DECORATOR__DOTTED_NAME:
				return getDotted_name();
			case SpellPackage.DECORATOR__ROUND_BRACKET:
				return isRoundBracket();
			case SpellPackage.DECORATOR__ARGLIST:
				return getArglist();
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
			case SpellPackage.DECORATOR__DOTTED_NAME:
				setDotted_name((String)newValue);
				return;
			case SpellPackage.DECORATOR__ROUND_BRACKET:
				setRoundBracket((Boolean)newValue);
				return;
			case SpellPackage.DECORATOR__ARGLIST:
				setArglist((arglist)newValue);
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
			case SpellPackage.DECORATOR__DOTTED_NAME:
				setDotted_name(DOTTED_NAME_EDEFAULT);
				return;
			case SpellPackage.DECORATOR__ROUND_BRACKET:
				setRoundBracket(ROUND_BRACKET_EDEFAULT);
				return;
			case SpellPackage.DECORATOR__ARGLIST:
				setArglist((arglist)null);
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
			case SpellPackage.DECORATOR__DOTTED_NAME:
				return DOTTED_NAME_EDEFAULT == null ? dotted_name != null : !DOTTED_NAME_EDEFAULT.equals(dotted_name);
			case SpellPackage.DECORATOR__ROUND_BRACKET:
				return roundBracket != ROUND_BRACKET_EDEFAULT;
			case SpellPackage.DECORATOR__ARGLIST:
				return arglist != null;
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
		result.append(" (dotted_name: ");
		result.append(dotted_name);
		result.append(", roundBracket: ");
		result.append(roundBracket);
		result.append(')');
		return result.toString();
	}

} //decoratorImpl
