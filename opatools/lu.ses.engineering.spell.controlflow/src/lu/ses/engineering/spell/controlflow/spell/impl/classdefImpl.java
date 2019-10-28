/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.classdef;
import lu.ses.engineering.spell.controlflow.spell.suite;
import lu.ses.engineering.spell.controlflow.spell.testlist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>classdef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl#isRoundBrackets <em>Round Brackets</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl#getTestlist <em>Testlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class classdefImpl extends compound_stmtImpl implements classdef {
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
	 * The default value of the '{@link #isRoundBrackets() <em>Round Brackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundBrackets()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUND_BRACKETS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoundBrackets() <em>Round Brackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundBrackets()
	 * @generated
	 * @ordered
	 */
	protected boolean roundBrackets = ROUND_BRACKETS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestlist() <em>Testlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestlist()
	 * @generated
	 * @ordered
	 */
	protected testlist testlist;

	/**
	 * The cached value of the '{@link #getSuite() <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuite()
	 * @generated
	 * @ordered
	 */
	protected suite suite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected classdefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.CLASSDEF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.CLASSDEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoundBrackets() {
		return roundBrackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundBrackets(boolean newRoundBrackets) {
		boolean oldRoundBrackets = roundBrackets;
		roundBrackets = newRoundBrackets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.CLASSDEF__ROUND_BRACKETS, oldRoundBrackets, roundBrackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist getTestlist() {
		return testlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestlist(testlist newTestlist, NotificationChain msgs) {
		testlist oldTestlist = testlist;
		testlist = newTestlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.CLASSDEF__TESTLIST, oldTestlist, newTestlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestlist(testlist newTestlist) {
		if (newTestlist != testlist) {
			NotificationChain msgs = null;
			if (testlist != null)
				msgs = ((InternalEObject)testlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.CLASSDEF__TESTLIST, null, msgs);
			if (newTestlist != null)
				msgs = ((InternalEObject)newTestlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.CLASSDEF__TESTLIST, null, msgs);
			msgs = basicSetTestlist(newTestlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.CLASSDEF__TESTLIST, newTestlist, newTestlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public suite getSuite() {
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuite(suite newSuite, NotificationChain msgs) {
		suite oldSuite = suite;
		suite = newSuite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.CLASSDEF__SUITE, oldSuite, newSuite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuite(suite newSuite) {
		if (newSuite != suite) {
			NotificationChain msgs = null;
			if (suite != null)
				msgs = ((InternalEObject)suite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.CLASSDEF__SUITE, null, msgs);
			if (newSuite != null)
				msgs = ((InternalEObject)newSuite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.CLASSDEF__SUITE, null, msgs);
			msgs = basicSetSuite(newSuite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.CLASSDEF__SUITE, newSuite, newSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.CLASSDEF__TESTLIST:
				return basicSetTestlist(null, msgs);
			case SpellPackage.CLASSDEF__SUITE:
				return basicSetSuite(null, msgs);
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
			case SpellPackage.CLASSDEF__NAME:
				return getName();
			case SpellPackage.CLASSDEF__ROUND_BRACKETS:
				return isRoundBrackets();
			case SpellPackage.CLASSDEF__TESTLIST:
				return getTestlist();
			case SpellPackage.CLASSDEF__SUITE:
				return getSuite();
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
			case SpellPackage.CLASSDEF__NAME:
				setName((String)newValue);
				return;
			case SpellPackage.CLASSDEF__ROUND_BRACKETS:
				setRoundBrackets((Boolean)newValue);
				return;
			case SpellPackage.CLASSDEF__TESTLIST:
				setTestlist((testlist)newValue);
				return;
			case SpellPackage.CLASSDEF__SUITE:
				setSuite((suite)newValue);
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
			case SpellPackage.CLASSDEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpellPackage.CLASSDEF__ROUND_BRACKETS:
				setRoundBrackets(ROUND_BRACKETS_EDEFAULT);
				return;
			case SpellPackage.CLASSDEF__TESTLIST:
				setTestlist((testlist)null);
				return;
			case SpellPackage.CLASSDEF__SUITE:
				setSuite((suite)null);
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
			case SpellPackage.CLASSDEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpellPackage.CLASSDEF__ROUND_BRACKETS:
				return roundBrackets != ROUND_BRACKETS_EDEFAULT;
			case SpellPackage.CLASSDEF__TESTLIST:
				return testlist != null;
			case SpellPackage.CLASSDEF__SUITE:
				return suite != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", roundBrackets: ");
		result.append(roundBrackets);
		result.append(')');
		return result.toString();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	@Override
	public EList<SpellElement> addControlFlowInformation() {
		getAlternativeNextStatements().add(suite);
		EList<SpellElement> flowInformation = suite.addControlFlowInformation();
		for (SpellElement spellElement : flowInformation) {
			//spellElement.getAlternativeNextStatements().add(this);			
		}
		return super.addControlFlowInformation();
	}
} //classdefImpl
