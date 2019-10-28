/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.else_if_stmt;
import lu.ses.engineering.spell.controlflow.spell.except_clause;
import lu.ses.engineering.spell.controlflow.spell.suite;
import lu.ses.engineering.spell.controlflow.spell.try_stmt;

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
 * An implementation of the model object '<em><b>try stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl#getSuite <em>Suite</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl#getExcept_clause <em>Except clause</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl#getElse <em>Else</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl#getFinally <em>Finally</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class try_stmtImpl extends compound_stmtImpl implements try_stmt {
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
	 * The cached value of the '{@link #getExcept_clause() <em>Except clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcept_clause()
	 * @generated
	 * @ordered
	 */
	protected EList<except_clause> except_clause;

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
	 * The cached value of the '{@link #getFinally() <em>Finally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinally()
	 * @generated
	 * @ordered
	 */
	protected suite finally_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected try_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.TRY_STMT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TRY_STMT__SUITE, oldSuite, newSuite);
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
				msgs = ((InternalEObject)suite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRY_STMT__SUITE, null, msgs);
			if (newSuite != null)
				msgs = ((InternalEObject)newSuite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRY_STMT__SUITE, null, msgs);
			msgs = basicSetSuite(newSuite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRY_STMT__SUITE, newSuite, newSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<except_clause> getExcept_clause() {
		if (except_clause == null) {
			except_clause = new EObjectContainmentEList<except_clause>(except_clause.class, this, SpellPackage.TRY_STMT__EXCEPT_CLAUSE);
		}
		return except_clause;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TRY_STMT__ELSE, oldElse, newElse);
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
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRY_STMT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRY_STMT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRY_STMT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public suite getFinally() {
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinally(suite newFinally, NotificationChain msgs) {
		suite oldFinally = finally_;
		finally_ = newFinally;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.TRY_STMT__FINALLY, oldFinally, newFinally);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinally(suite newFinally) {
		if (newFinally != finally_) {
			NotificationChain msgs = null;
			if (finally_ != null)
				msgs = ((InternalEObject)finally_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRY_STMT__FINALLY, null, msgs);
			if (newFinally != null)
				msgs = ((InternalEObject)newFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.TRY_STMT__FINALLY, null, msgs);
			msgs = basicSetFinally(newFinally, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.TRY_STMT__FINALLY, newFinally, newFinally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.TRY_STMT__SUITE:
				return basicSetSuite(null, msgs);
			case SpellPackage.TRY_STMT__EXCEPT_CLAUSE:
				return ((InternalEList<?>)getExcept_clause()).basicRemove(otherEnd, msgs);
			case SpellPackage.TRY_STMT__ELSE:
				return basicSetElse(null, msgs);
			case SpellPackage.TRY_STMT__FINALLY:
				return basicSetFinally(null, msgs);
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
			case SpellPackage.TRY_STMT__SUITE:
				return getSuite();
			case SpellPackage.TRY_STMT__EXCEPT_CLAUSE:
				return getExcept_clause();
			case SpellPackage.TRY_STMT__ELSE:
				return getElse();
			case SpellPackage.TRY_STMT__FINALLY:
				return getFinally();
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
			case SpellPackage.TRY_STMT__SUITE:
				setSuite((suite)newValue);
				return;
			case SpellPackage.TRY_STMT__EXCEPT_CLAUSE:
				getExcept_clause().clear();
				getExcept_clause().addAll((Collection<? extends except_clause>)newValue);
				return;
			case SpellPackage.TRY_STMT__ELSE:
				setElse((suite)newValue);
				return;
			case SpellPackage.TRY_STMT__FINALLY:
				setFinally((suite)newValue);
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
			case SpellPackage.TRY_STMT__SUITE:
				setSuite((suite)null);
				return;
			case SpellPackage.TRY_STMT__EXCEPT_CLAUSE:
				getExcept_clause().clear();
				return;
			case SpellPackage.TRY_STMT__ELSE:
				setElse((suite)null);
				return;
			case SpellPackage.TRY_STMT__FINALLY:
				setFinally((suite)null);
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
			case SpellPackage.TRY_STMT__SUITE:
				return suite != null;
			case SpellPackage.TRY_STMT__EXCEPT_CLAUSE:
				return except_clause != null && !except_clause.isEmpty();
			case SpellPackage.TRY_STMT__ELSE:
				return else_ != null;
			case SpellPackage.TRY_STMT__FINALLY:
				return finally_ != null;
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
		if (!getExcept_clause().isEmpty()){
			for (except_clause elseif : getExcept_clause()) {
				getAlternativeNextStatements().add(elseif.getSuite());
				flowInformation = elseif.getSuite().addControlFlowInformation();
				for (SpellElement spellElement : flowInformation) {
					//spellElement.getAlternativeNextStatements().add(this);			
				}
			}
		}
		if (getElse() != null){
			getAlternativeNextStatements().add(getElse());
			flowInformation = getElse().addControlFlowInformation();
			for (SpellElement spellElement : flowInformation) {
				//spellElement.getAlternativeNextStatements().add(this);			
			}
		}
		if (getFinally() != null){
			getAlternativeNextStatements().add(getFinally());
			flowInformation = getFinally().addControlFlowInformation();
			for (SpellElement spellElement : flowInformation) {
				//spellElement.getAlternativeNextStatements().add(this);			
			}
		}
		return super.addControlFlowInformation();
	}
	
} //try_stmtImpl
