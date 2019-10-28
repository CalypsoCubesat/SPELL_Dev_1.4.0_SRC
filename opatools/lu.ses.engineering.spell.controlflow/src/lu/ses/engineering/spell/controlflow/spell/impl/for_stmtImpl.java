/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.exprlist;
import lu.ses.engineering.spell.controlflow.spell.for_stmt;
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
 * An implementation of the model object '<em><b>for stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl#getExprlist <em>Exprlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl#getTestlist <em>Testlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl#getSuite <em>Suite</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class for_stmtImpl extends compound_stmtImpl implements for_stmt {
	/**
	 * The cached value of the '{@link #getExprlist() <em>Exprlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprlist()
	 * @generated
	 * @ordered
	 */
	protected exprlist exprlist;

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
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected suite else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected for_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.FOR_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exprlist getExprlist() {
		return exprlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExprlist(exprlist newExprlist, NotificationChain msgs) {
		exprlist oldExprlist = exprlist;
		exprlist = newExprlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__EXPRLIST, oldExprlist, newExprlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExprlist(exprlist newExprlist) {
		if (newExprlist != exprlist) {
			NotificationChain msgs = null;
			if (exprlist != null)
				msgs = ((InternalEObject)exprlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__EXPRLIST, null, msgs);
			if (newExprlist != null)
				msgs = ((InternalEObject)newExprlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__EXPRLIST, null, msgs);
			msgs = basicSetExprlist(newExprlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__EXPRLIST, newExprlist, newExprlist));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__TESTLIST, oldTestlist, newTestlist);
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
				msgs = ((InternalEObject)testlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__TESTLIST, null, msgs);
			if (newTestlist != null)
				msgs = ((InternalEObject)newTestlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__TESTLIST, null, msgs);
			msgs = basicSetTestlist(newTestlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__TESTLIST, newTestlist, newTestlist));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__SUITE, oldSuite, newSuite);
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
				msgs = ((InternalEObject)suite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__SUITE, null, msgs);
			if (newSuite != null)
				msgs = ((InternalEObject)newSuite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__SUITE, null, msgs);
			msgs = basicSetSuite(newSuite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__SUITE, newSuite, newSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public suite getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(suite newElse, NotificationChain msgs) {
		suite oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(suite newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.FOR_STMT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.FOR_STMT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.FOR_STMT__EXPRLIST:
				return basicSetExprlist(null, msgs);
			case SpellPackage.FOR_STMT__TESTLIST:
				return basicSetTestlist(null, msgs);
			case SpellPackage.FOR_STMT__SUITE:
				return basicSetSuite(null, msgs);
			case SpellPackage.FOR_STMT__ELSE:
				return basicSetElse(null, msgs);
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
			case SpellPackage.FOR_STMT__EXPRLIST:
				return getExprlist();
			case SpellPackage.FOR_STMT__TESTLIST:
				return getTestlist();
			case SpellPackage.FOR_STMT__SUITE:
				return getSuite();
			case SpellPackage.FOR_STMT__ELSE:
				return getElse();
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
			case SpellPackage.FOR_STMT__EXPRLIST:
				setExprlist((exprlist)newValue);
				return;
			case SpellPackage.FOR_STMT__TESTLIST:
				setTestlist((testlist)newValue);
				return;
			case SpellPackage.FOR_STMT__SUITE:
				setSuite((suite)newValue);
				return;
			case SpellPackage.FOR_STMT__ELSE:
				setElse((suite)newValue);
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
			case SpellPackage.FOR_STMT__EXPRLIST:
				setExprlist((exprlist)null);
				return;
			case SpellPackage.FOR_STMT__TESTLIST:
				setTestlist((testlist)null);
				return;
			case SpellPackage.FOR_STMT__SUITE:
				setSuite((suite)null);
				return;
			case SpellPackage.FOR_STMT__ELSE:
				setElse((suite)null);
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
			case SpellPackage.FOR_STMT__EXPRLIST:
				return exprlist != null;
			case SpellPackage.FOR_STMT__TESTLIST:
				return testlist != null;
			case SpellPackage.FOR_STMT__SUITE:
				return suite != null;
			case SpellPackage.FOR_STMT__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
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
		if (getElse() != null){
			getAlternativeNextStatements().add(getElse());
			flowInformation = getElse().addControlFlowInformation();
			for (SpellElement spellElement : flowInformation) {
				//spellElement.getAlternativeNextStatements().add(this);			
			}
		}
		return super.addControlFlowInformation();
	}
} //for_stmtImpl
