/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.simple_stmt;
import lu.ses.engineering.spell.controlflow.spell.small_stmt;
import lu.ses.engineering.spell.controlflow.spell.stmt;
import lu.ses.engineering.spell.controlflow.spell.suite;

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
 * An implementation of the model object '<em><b>simple stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.simple_stmtImpl#getStmts <em>Stmts</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.simple_stmtImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.simple_stmtImpl#isAdditionalComma <em>Additional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_stmtImpl extends stmtImpl implements simple_stmt {
	/**
	 * The cached value of the '{@link #getStmts() <em>Stmts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStmts()
	 * @generated
	 * @ordered
	 */
	protected EList<stmt> stmts;

	/**
	 * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStmt()
	 * @generated
	 * @ordered
	 */
	protected EList<small_stmt> stmt;

	/**
	 * The default value of the '{@link #isAdditionalComma() <em>Additional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalComma()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADDITIONAL_COMMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdditionalComma() <em>Additional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalComma()
	 * @generated
	 * @ordered
	 */
	protected boolean additionalComma = ADDITIONAL_COMMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected simple_stmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.SIMPLE_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<stmt> getStmts() {
		if (stmts == null) {
			stmts = new EObjectContainmentEList<stmt>(stmt.class, this, SpellPackage.SIMPLE_STMT__STMTS);
		}
		return stmts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<small_stmt> getStmt() {
		if (stmt == null) {
			stmt = new EObjectContainmentEList<small_stmt>(small_stmt.class, this, SpellPackage.SIMPLE_STMT__STMT);
		}
		return stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdditionalComma() {
		return additionalComma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalComma(boolean newAdditionalComma) {
		boolean oldAdditionalComma = additionalComma;
		additionalComma = newAdditionalComma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.SIMPLE_STMT__ADDITIONAL_COMMA, oldAdditionalComma, additionalComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.SIMPLE_STMT__STMTS:
				return ((InternalEList<?>)getStmts()).basicRemove(otherEnd, msgs);
			case SpellPackage.SIMPLE_STMT__STMT:
				return ((InternalEList<?>)getStmt()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.SIMPLE_STMT__STMTS:
				return getStmts();
			case SpellPackage.SIMPLE_STMT__STMT:
				return getStmt();
			case SpellPackage.SIMPLE_STMT__ADDITIONAL_COMMA:
				return isAdditionalComma();
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
			case SpellPackage.SIMPLE_STMT__STMTS:
				getStmts().clear();
				getStmts().addAll((Collection<? extends stmt>)newValue);
				return;
			case SpellPackage.SIMPLE_STMT__STMT:
				getStmt().clear();
				getStmt().addAll((Collection<? extends small_stmt>)newValue);
				return;
			case SpellPackage.SIMPLE_STMT__ADDITIONAL_COMMA:
				setAdditionalComma((Boolean)newValue);
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
			case SpellPackage.SIMPLE_STMT__STMTS:
				getStmts().clear();
				return;
			case SpellPackage.SIMPLE_STMT__STMT:
				getStmt().clear();
				return;
			case SpellPackage.SIMPLE_STMT__ADDITIONAL_COMMA:
				setAdditionalComma(ADDITIONAL_COMMA_EDEFAULT);
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
			case SpellPackage.SIMPLE_STMT__STMTS:
				return stmts != null && !stmts.isEmpty();
			case SpellPackage.SIMPLE_STMT__STMT:
				return stmt != null && !stmt.isEmpty();
			case SpellPackage.SIMPLE_STMT__ADDITIONAL_COMMA:
				return additionalComma != ADDITIONAL_COMMA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == suite.class) {
			switch (derivedFeatureID) {
				case SpellPackage.SIMPLE_STMT__STMTS: return SpellPackage.SUITE__STMTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == suite.class) {
			switch (baseFeatureID) {
				case SpellPackage.SUITE__STMTS: return SpellPackage.SIMPLE_STMT__STMTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (additionalComma: ");
		result.append(additionalComma);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	@Override
	public EList<SpellElement> addControlFlowInformation() {
	
		return updateNextStatements(getStmt());
		
	}
} //simple_stmtImpl
