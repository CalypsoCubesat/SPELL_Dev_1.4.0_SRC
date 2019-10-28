/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.else_if_stmt;
import lu.ses.engineering.spell.controlflow.spell.if_stmt;
import lu.ses.engineering.spell.controlflow.spell.suite;
import lu.ses.engineering.spell.controlflow.spell.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>if stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl#getSuite <em>Suite</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl#getElse_if_stmts <em>Else if stmts</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class if_stmtImpl extends compound_stmtImpl implements if_stmt {
	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected test test;

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
	 * The cached value of the '{@link #getElse_if_stmts() <em>Else if stmts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse_if_stmts()
	 * @generated
	 * @ordered
	 */
	protected EList<else_if_stmt> else_if_stmts;

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
	protected if_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.IF_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest(test newTest, NotificationChain msgs) {
		test oldTest = test;
		test = newTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.IF_STMT__TEST, oldTest, newTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(test newTest) {
		if (newTest != test) {
			NotificationChain msgs = null;
			if (test != null)
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IF_STMT__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IF_STMT__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.IF_STMT__TEST, newTest, newTest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.IF_STMT__SUITE, oldSuite, newSuite);
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
				msgs = ((InternalEObject)suite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IF_STMT__SUITE, null, msgs);
			if (newSuite != null)
				msgs = ((InternalEObject)newSuite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IF_STMT__SUITE, null, msgs);
			msgs = basicSetSuite(newSuite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.IF_STMT__SUITE, newSuite, newSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<else_if_stmt> getElse_if_stmts() {
		if (else_if_stmts == null) {
			else_if_stmts = new EObjectContainmentEList<else_if_stmt>(else_if_stmt.class, this, SpellPackage.IF_STMT__ELSE_IF_STMTS);
		}
		return else_if_stmts;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.IF_STMT__ELSE, oldElse, newElse);
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
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IF_STMT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.IF_STMT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.IF_STMT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.IF_STMT__TEST:
				return basicSetTest(null, msgs);
			case SpellPackage.IF_STMT__SUITE:
				return basicSetSuite(null, msgs);
			case SpellPackage.IF_STMT__ELSE_IF_STMTS:
				return ((InternalEList<?>)getElse_if_stmts()).basicRemove(otherEnd, msgs);
			case SpellPackage.IF_STMT__ELSE:
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
			case SpellPackage.IF_STMT__TEST:
				return getTest();
			case SpellPackage.IF_STMT__SUITE:
				return getSuite();
			case SpellPackage.IF_STMT__ELSE_IF_STMTS:
				return getElse_if_stmts();
			case SpellPackage.IF_STMT__ELSE:
				return getElse();
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
			case SpellPackage.IF_STMT__TEST:
				setTest((test)newValue);
				return;
			case SpellPackage.IF_STMT__SUITE:
				setSuite((suite)newValue);
				return;
			case SpellPackage.IF_STMT__ELSE_IF_STMTS:
				getElse_if_stmts().clear();
				getElse_if_stmts().addAll((Collection<? extends else_if_stmt>)newValue);
				return;
			case SpellPackage.IF_STMT__ELSE:
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
			case SpellPackage.IF_STMT__TEST:
				setTest((test)null);
				return;
			case SpellPackage.IF_STMT__SUITE:
				setSuite((suite)null);
				return;
			case SpellPackage.IF_STMT__ELSE_IF_STMTS:
				getElse_if_stmts().clear();
				return;
			case SpellPackage.IF_STMT__ELSE:
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
			case SpellPackage.IF_STMT__TEST:
				return test != null;
			case SpellPackage.IF_STMT__SUITE:
				return suite != null;
			case SpellPackage.IF_STMT__ELSE_IF_STMTS:
				return else_if_stmts != null && !else_if_stmts.isEmpty();
			case SpellPackage.IF_STMT__ELSE:
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
		//getAlternativeNextStatements().add(suite);
		EList<SpellElement> flowInformation = suite.addControlFlowInformation();
		
		getAlternativeNextStatements().add(suite);
				
		
		if (!getElse_if_stmts().isEmpty()){
			for (else_if_stmt elseif : getElse_if_stmts()) {
				//getAlternativeNextStatements().add(elseif.getSuite());
				flowInformation = elseif.getSuite().addControlFlowInformation();
				
				getAlternativeNextStatements().add(elseif.getSuite());
				
			}
		}
		if (getElse() != null){
			//getAlternativeNextStatements().add(getElse());
			flowInformation = getElse().addControlFlowInformation();
			getAlternativeNextStatements().add(getElse());
		}
		return super.addControlFlowInformation();
	}
} //if_stmtImpl
