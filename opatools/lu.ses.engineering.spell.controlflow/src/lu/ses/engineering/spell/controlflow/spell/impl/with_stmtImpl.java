/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.suite;
import lu.ses.engineering.spell.controlflow.spell.with_item;
import lu.ses.engineering.spell.controlflow.spell.with_stmt;

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
 * An implementation of the model object '<em><b>with stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.with_stmtImpl#getWith_item <em>With item</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.with_stmtImpl#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class with_stmtImpl extends compound_stmtImpl implements with_stmt {
	/**
	 * The cached value of the '{@link #getWith_item() <em>With item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith_item()
	 * @generated
	 * @ordered
	 */
	protected EList<with_item> with_item;

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
	protected with_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.WITH_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<with_item> getWith_item() {
		if (with_item == null) {
			with_item = new EObjectContainmentEList<with_item>(with_item.class, this, SpellPackage.WITH_STMT__WITH_ITEM);
		}
		return with_item;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.WITH_STMT__SUITE, oldSuite, newSuite);
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
				msgs = ((InternalEObject)suite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.WITH_STMT__SUITE, null, msgs);
			if (newSuite != null)
				msgs = ((InternalEObject)newSuite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.WITH_STMT__SUITE, null, msgs);
			msgs = basicSetSuite(newSuite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.WITH_STMT__SUITE, newSuite, newSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.WITH_STMT__WITH_ITEM:
				return ((InternalEList<?>)getWith_item()).basicRemove(otherEnd, msgs);
			case SpellPackage.WITH_STMT__SUITE:
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
			case SpellPackage.WITH_STMT__WITH_ITEM:
				return getWith_item();
			case SpellPackage.WITH_STMT__SUITE:
				return getSuite();
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
			case SpellPackage.WITH_STMT__WITH_ITEM:
				getWith_item().clear();
				getWith_item().addAll((Collection<? extends with_item>)newValue);
				return;
			case SpellPackage.WITH_STMT__SUITE:
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
			case SpellPackage.WITH_STMT__WITH_ITEM:
				getWith_item().clear();
				return;
			case SpellPackage.WITH_STMT__SUITE:
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
			case SpellPackage.WITH_STMT__WITH_ITEM:
				return with_item != null && !with_item.isEmpty();
			case SpellPackage.WITH_STMT__SUITE:
				return suite != null;
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
		return super.addControlFlowInformation();
	}
} //with_stmtImpl
