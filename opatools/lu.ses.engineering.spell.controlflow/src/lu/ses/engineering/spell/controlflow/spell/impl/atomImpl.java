/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.atom;
import lu.ses.engineering.spell.controlflow.spell.dictorsetmaker;
import lu.ses.engineering.spell.controlflow.spell.listmaker;
import lu.ses.engineering.spell.controlflow.spell.testlist1;
import lu.ses.engineering.spell.controlflow.spell.yield_or_testlist_comp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#getYield_or_testlist_comp <em>Yield or testlist comp</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#isSquareBracket <em>Square Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#getListmaker <em>Listmaker</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#isCurlyBracket <em>Curly Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#getDictorsetmaker <em>Dictorsetmaker</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#getTestlist1 <em>Testlist1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl#getStrings <em>Strings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class atomImpl extends powerImpl implements atom {
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
	 * The cached value of the '{@link #getYield_or_testlist_comp() <em>Yield or testlist comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYield_or_testlist_comp()
	 * @generated
	 * @ordered
	 */
	protected yield_or_testlist_comp yield_or_testlist_comp;

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
	 * The cached value of the '{@link #getListmaker() <em>Listmaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListmaker()
	 * @generated
	 * @ordered
	 */
	protected listmaker listmaker;

	/**
	 * The default value of the '{@link #isCurlyBracket() <em>Curly Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurlyBracket()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURLY_BRACKET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurlyBracket() <em>Curly Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurlyBracket()
	 * @generated
	 * @ordered
	 */
	protected boolean curlyBracket = CURLY_BRACKET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDictorsetmaker() <em>Dictorsetmaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictorsetmaker()
	 * @generated
	 * @ordered
	 */
	protected dictorsetmaker dictorsetmaker;

	/**
	 * The cached value of the '{@link #getTestlist1() <em>Testlist1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestlist1()
	 * @generated
	 * @ordered
	 */
	protected testlist1 testlist1;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStrings() <em>Strings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> strings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected atomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.ATOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__ROUND_BRACKET, oldRoundBracket, roundBracket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yield_or_testlist_comp getYield_or_testlist_comp() {
		return yield_or_testlist_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYield_or_testlist_comp(yield_or_testlist_comp newYield_or_testlist_comp, NotificationChain msgs) {
		yield_or_testlist_comp oldYield_or_testlist_comp = yield_or_testlist_comp;
		yield_or_testlist_comp = newYield_or_testlist_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP, oldYield_or_testlist_comp, newYield_or_testlist_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYield_or_testlist_comp(yield_or_testlist_comp newYield_or_testlist_comp) {
		if (newYield_or_testlist_comp != yield_or_testlist_comp) {
			NotificationChain msgs = null;
			if (yield_or_testlist_comp != null)
				msgs = ((InternalEObject)yield_or_testlist_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP, null, msgs);
			if (newYield_or_testlist_comp != null)
				msgs = ((InternalEObject)newYield_or_testlist_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP, null, msgs);
			msgs = basicSetYield_or_testlist_comp(newYield_or_testlist_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP, newYield_or_testlist_comp, newYield_or_testlist_comp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__SQUARE_BRACKET, oldSquareBracket, squareBracket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listmaker getListmaker() {
		return listmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListmaker(listmaker newListmaker, NotificationChain msgs) {
		listmaker oldListmaker = listmaker;
		listmaker = newListmaker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__LISTMAKER, oldListmaker, newListmaker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListmaker(listmaker newListmaker) {
		if (newListmaker != listmaker) {
			NotificationChain msgs = null;
			if (listmaker != null)
				msgs = ((InternalEObject)listmaker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__LISTMAKER, null, msgs);
			if (newListmaker != null)
				msgs = ((InternalEObject)newListmaker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__LISTMAKER, null, msgs);
			msgs = basicSetListmaker(newListmaker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__LISTMAKER, newListmaker, newListmaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurlyBracket() {
		return curlyBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurlyBracket(boolean newCurlyBracket) {
		boolean oldCurlyBracket = curlyBracket;
		curlyBracket = newCurlyBracket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__CURLY_BRACKET, oldCurlyBracket, curlyBracket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dictorsetmaker getDictorsetmaker() {
		return dictorsetmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictorsetmaker(dictorsetmaker newDictorsetmaker, NotificationChain msgs) {
		dictorsetmaker oldDictorsetmaker = dictorsetmaker;
		dictorsetmaker = newDictorsetmaker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__DICTORSETMAKER, oldDictorsetmaker, newDictorsetmaker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictorsetmaker(dictorsetmaker newDictorsetmaker) {
		if (newDictorsetmaker != dictorsetmaker) {
			NotificationChain msgs = null;
			if (dictorsetmaker != null)
				msgs = ((InternalEObject)dictorsetmaker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__DICTORSETMAKER, null, msgs);
			if (newDictorsetmaker != null)
				msgs = ((InternalEObject)newDictorsetmaker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__DICTORSETMAKER, null, msgs);
			msgs = basicSetDictorsetmaker(newDictorsetmaker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__DICTORSETMAKER, newDictorsetmaker, newDictorsetmaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist1 getTestlist1() {
		return testlist1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestlist1(testlist1 newTestlist1, NotificationChain msgs) {
		testlist1 oldTestlist1 = testlist1;
		testlist1 = newTestlist1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__TESTLIST1, oldTestlist1, newTestlist1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestlist1(testlist1 newTestlist1) {
		if (newTestlist1 != testlist1) {
			NotificationChain msgs = null;
			if (testlist1 != null)
				msgs = ((InternalEObject)testlist1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__TESTLIST1, null, msgs);
			if (newTestlist1 != null)
				msgs = ((InternalEObject)newTestlist1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ATOM__TESTLIST1, null, msgs);
			msgs = basicSetTestlist1(newTestlist1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__TESTLIST1, newTestlist1, newTestlist1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ATOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStrings() {
		if (strings == null) {
			strings = new EDataTypeEList<String>(String.class, this, SpellPackage.ATOM__STRINGS);
		}
		return strings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP:
				return basicSetYield_or_testlist_comp(null, msgs);
			case SpellPackage.ATOM__LISTMAKER:
				return basicSetListmaker(null, msgs);
			case SpellPackage.ATOM__DICTORSETMAKER:
				return basicSetDictorsetmaker(null, msgs);
			case SpellPackage.ATOM__TESTLIST1:
				return basicSetTestlist1(null, msgs);
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
			case SpellPackage.ATOM__ROUND_BRACKET:
				return isRoundBracket();
			case SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP:
				return getYield_or_testlist_comp();
			case SpellPackage.ATOM__SQUARE_BRACKET:
				return isSquareBracket();
			case SpellPackage.ATOM__LISTMAKER:
				return getListmaker();
			case SpellPackage.ATOM__CURLY_BRACKET:
				return isCurlyBracket();
			case SpellPackage.ATOM__DICTORSETMAKER:
				return getDictorsetmaker();
			case SpellPackage.ATOM__TESTLIST1:
				return getTestlist1();
			case SpellPackage.ATOM__NAME:
				return getName();
			case SpellPackage.ATOM__STRINGS:
				return getStrings();
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
			case SpellPackage.ATOM__ROUND_BRACKET:
				setRoundBracket((Boolean)newValue);
				return;
			case SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP:
				setYield_or_testlist_comp((yield_or_testlist_comp)newValue);
				return;
			case SpellPackage.ATOM__SQUARE_BRACKET:
				setSquareBracket((Boolean)newValue);
				return;
			case SpellPackage.ATOM__LISTMAKER:
				setListmaker((listmaker)newValue);
				return;
			case SpellPackage.ATOM__CURLY_BRACKET:
				setCurlyBracket((Boolean)newValue);
				return;
			case SpellPackage.ATOM__DICTORSETMAKER:
				setDictorsetmaker((dictorsetmaker)newValue);
				return;
			case SpellPackage.ATOM__TESTLIST1:
				setTestlist1((testlist1)newValue);
				return;
			case SpellPackage.ATOM__NAME:
				setName((String)newValue);
				return;
			case SpellPackage.ATOM__STRINGS:
				getStrings().clear();
				getStrings().addAll((Collection<? extends String>)newValue);
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
			case SpellPackage.ATOM__ROUND_BRACKET:
				setRoundBracket(ROUND_BRACKET_EDEFAULT);
				return;
			case SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP:
				setYield_or_testlist_comp((yield_or_testlist_comp)null);
				return;
			case SpellPackage.ATOM__SQUARE_BRACKET:
				setSquareBracket(SQUARE_BRACKET_EDEFAULT);
				return;
			case SpellPackage.ATOM__LISTMAKER:
				setListmaker((listmaker)null);
				return;
			case SpellPackage.ATOM__CURLY_BRACKET:
				setCurlyBracket(CURLY_BRACKET_EDEFAULT);
				return;
			case SpellPackage.ATOM__DICTORSETMAKER:
				setDictorsetmaker((dictorsetmaker)null);
				return;
			case SpellPackage.ATOM__TESTLIST1:
				setTestlist1((testlist1)null);
				return;
			case SpellPackage.ATOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpellPackage.ATOM__STRINGS:
				getStrings().clear();
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
			case SpellPackage.ATOM__ROUND_BRACKET:
				return roundBracket != ROUND_BRACKET_EDEFAULT;
			case SpellPackage.ATOM__YIELD_OR_TESTLIST_COMP:
				return yield_or_testlist_comp != null;
			case SpellPackage.ATOM__SQUARE_BRACKET:
				return squareBracket != SQUARE_BRACKET_EDEFAULT;
			case SpellPackage.ATOM__LISTMAKER:
				return listmaker != null;
			case SpellPackage.ATOM__CURLY_BRACKET:
				return curlyBracket != CURLY_BRACKET_EDEFAULT;
			case SpellPackage.ATOM__DICTORSETMAKER:
				return dictorsetmaker != null;
			case SpellPackage.ATOM__TESTLIST1:
				return testlist1 != null;
			case SpellPackage.ATOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpellPackage.ATOM__STRINGS:
				return strings != null && !strings.isEmpty();
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
		result.append(", curlyBracket: ");
		result.append(curlyBracket);
		result.append(", name: ");
		result.append(name);
		result.append(", strings: ");
		result.append(strings);
		result.append(')');
		return result.toString();
	}

} //atomImpl
