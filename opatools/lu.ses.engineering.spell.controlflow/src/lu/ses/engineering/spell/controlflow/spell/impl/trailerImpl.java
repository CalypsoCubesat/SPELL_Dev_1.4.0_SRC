/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.arglist;
import lu.ses.engineering.spell.controlflow.spell.subscriptlist;
import lu.ses.engineering.spell.controlflow.spell.trailer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>trailer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl#getArglist <em>Arglist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl#isSquareBracket <em>Square Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl#getSubscriptlist <em>Subscriptlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl#getDotName <em>Dot Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class trailerImpl extends SpellElementImpl implements trailer {
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
	 * The default value of the '{@link #isSquareBracket() <em>Square Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSquareBracket()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SQUARE_BRACKET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSquareBracket() <em>Square Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSquareBracket()
	 * @generated
	 * @ordered
	 */
	protected boolean squareBracket = SQUARE_BRACKET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscriptlist() <em>Subscriptlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptlist()
	 * @generated
	 * @ordered
	 */
	protected subscriptlist subscriptlist;

	/**
	 * The default value of the '{@link #getDotName() <em>Dot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDotName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDotName() <em>Dot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDotName()
	 * @generated
	 * @ordered
	 */
	protected String dotName = DOT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected trailerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.TRAILER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRAILER__ROUND_BRACKET, oldRoundBracket, roundBracket));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TRAILER__ARGLIST, oldArglist, newArglist);
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
				msgs = ((InternalEObject)arglist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRAILER__ARGLIST, null, msgs);
			if (newArglist != null)
				msgs = ((InternalEObject)newArglist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRAILER__ARGLIST, null, msgs);
			msgs = basicSetArglist(newArglist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRAILER__ARGLIST, newArglist, newArglist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSquareBracket() {
		return squareBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSquareBracket(boolean newSquareBracket) {
		boolean oldSquareBracket = squareBracket;
		squareBracket = newSquareBracket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRAILER__SQUARE_BRACKET, oldSquareBracket, squareBracket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subscriptlist getSubscriptlist() {
		return subscriptlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptlist(subscriptlist newSubscriptlist, NotificationChain msgs) {
		subscriptlist oldSubscriptlist = subscriptlist;
		subscriptlist = newSubscriptlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TRAILER__SUBSCRIPTLIST, oldSubscriptlist, newSubscriptlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptlist(subscriptlist newSubscriptlist) {
		if (newSubscriptlist != subscriptlist) {
			NotificationChain msgs = null;
			if (subscriptlist != null)
				msgs = ((InternalEObject)subscriptlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRAILER__SUBSCRIPTLIST, null, msgs);
			if (newSubscriptlist != null)
				msgs = ((InternalEObject)newSubscriptlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRAILER__SUBSCRIPTLIST, null, msgs);
			msgs = basicSetSubscriptlist(newSubscriptlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRAILER__SUBSCRIPTLIST, newSubscriptlist, newSubscriptlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDotName() {
		return dotName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDotName(String newDotName) {
		String oldDotName = dotName;
		dotName = newDotName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRAILER__DOT_NAME, oldDotName, dotName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.TRAILER__ARGLIST:
				return basicSetArglist(null, msgs);
			case SpellPackage.TRAILER__SUBSCRIPTLIST:
				return basicSetSubscriptlist(null, msgs);
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
			case SpellPackage.TRAILER__ROUND_BRACKET:
				return isRoundBracket();
			case SpellPackage.TRAILER__ARGLIST:
				return getArglist();
			case SpellPackage.TRAILER__SQUARE_BRACKET:
				return isSquareBracket();
			case SpellPackage.TRAILER__SUBSCRIPTLIST:
				return getSubscriptlist();
			case SpellPackage.TRAILER__DOT_NAME:
				return getDotName();
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
			case SpellPackage.TRAILER__ROUND_BRACKET:
				setRoundBracket((Boolean)newValue);
				return;
			case SpellPackage.TRAILER__ARGLIST:
				setArglist((arglist)newValue);
				return;
			case SpellPackage.TRAILER__SQUARE_BRACKET:
				setSquareBracket((Boolean)newValue);
				return;
			case SpellPackage.TRAILER__SUBSCRIPTLIST:
				setSubscriptlist((subscriptlist)newValue);
				return;
			case SpellPackage.TRAILER__DOT_NAME:
				setDotName((String)newValue);
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
			case SpellPackage.TRAILER__ROUND_BRACKET:
				setRoundBracket(ROUND_BRACKET_EDEFAULT);
				return;
			case SpellPackage.TRAILER__ARGLIST:
				setArglist((arglist)null);
				return;
			case SpellPackage.TRAILER__SQUARE_BRACKET:
				setSquareBracket(SQUARE_BRACKET_EDEFAULT);
				return;
			case SpellPackage.TRAILER__SUBSCRIPTLIST:
				setSubscriptlist((subscriptlist)null);
				return;
			case SpellPackage.TRAILER__DOT_NAME:
				setDotName(DOT_NAME_EDEFAULT);
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
			case SpellPackage.TRAILER__ROUND_BRACKET:
				return roundBracket != ROUND_BRACKET_EDEFAULT;
			case SpellPackage.TRAILER__ARGLIST:
				return arglist != null;
			case SpellPackage.TRAILER__SQUARE_BRACKET:
				return squareBracket != SQUARE_BRACKET_EDEFAULT;
			case SpellPackage.TRAILER__SUBSCRIPTLIST:
				return subscriptlist != null;
			case SpellPackage.TRAILER__DOT_NAME:
				return DOT_NAME_EDEFAULT == null ? dotName != null : !DOT_NAME_EDEFAULT.equals(dotName);
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
		result.append(" (roundBracket: ");
		result.append(roundBracket);
		result.append(", squareBracket: ");
		result.append(squareBracket);
		result.append(", dotName: ");
		result.append(dotName);
		result.append(')');
		return result.toString();
	}

} //trailerImpl
