/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl#getNextStatements <em>Next Statements</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl#getPrevStatements <em>Prev Statements</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl#getAlternativeNextStatements <em>Alternative Next Statements</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl#getAlternativePrevStatements <em>Alternative Prev Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellElementImpl extends MinimalEObjectImpl.Container implements SpellElement {
	/**
	 * The cached value of the '{@link #getNextStatements() <em>Next Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<SpellElement> nextStatements;
	/**
	 * The cached value of the '{@link #getPrevStatements() <em>Prev Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<SpellElement> prevStatements;

	/**
	 * The cached value of the '{@link #getAlternativeNextStatements() <em>Alternative Next Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeNextStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<SpellElement> alternativeNextStatements;

	/**
	 * The cached value of the '{@link #getAlternativePrevStatements() <em>Alternative Prev Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativePrevStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<SpellElement> alternativePrevStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpellElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.SPELL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpellElement> getNextStatements() {
		if (nextStatements == null) {
			nextStatements = new EObjectWithInverseResolvingEList.ManyInverse<SpellElement>(SpellElement.class, this, SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS, SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS);
		}
		return nextStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpellElement> getPrevStatements() {
		if (prevStatements == null) {
			prevStatements = new EObjectWithInverseResolvingEList.ManyInverse<SpellElement>(SpellElement.class, this, SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS, SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS);
		}
		return prevStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpellElement> getAlternativeNextStatements() {
		if (alternativeNextStatements == null) {
			alternativeNextStatements = new EObjectWithInverseResolvingEList.ManyInverse<SpellElement>(SpellElement.class, this, SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS, SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS);
		}
		return alternativeNextStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpellElement> getAlternativePrevStatements() {
		if (alternativePrevStatements == null) {
			alternativePrevStatements = new EObjectWithInverseResolvingEList.ManyInverse<SpellElement>(SpellElement.class, this, SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS, SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS);
		}
		return alternativePrevStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpellElement> addControlFlowInformation() {
		org.eclipse.emf.common.util.BasicEList<SpellElement> list = new org.eclipse.emf.common.util.BasicEList<SpellElement>();
		list.add(this);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearControlFlowInformation() {
		getNextStatements().clear();
		getAlternativeNextStatements().clear();
		for (org.eclipse.emf.ecore.EObject eObj : eContents()){
			SpellElement ele = (SpellElement)eObj;
			ele.clearControlFlowInformation();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextStatements()).basicAdd(otherEnd, msgs);
			case SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrevStatements()).basicAdd(otherEnd, msgs);
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeNextStatements()).basicAdd(otherEnd, msgs);
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativePrevStatements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS:
				return ((InternalEList<?>)getNextStatements()).basicRemove(otherEnd, msgs);
			case SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS:
				return ((InternalEList<?>)getPrevStatements()).basicRemove(otherEnd, msgs);
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS:
				return ((InternalEList<?>)getAlternativeNextStatements()).basicRemove(otherEnd, msgs);
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS:
				return ((InternalEList<?>)getAlternativePrevStatements()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS:
				return getNextStatements();
			case SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS:
				return getPrevStatements();
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS:
				return getAlternativeNextStatements();
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS:
				return getAlternativePrevStatements();
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
			case SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS:
				getNextStatements().clear();
				getNextStatements().addAll((Collection<? extends SpellElement>)newValue);
				return;
			case SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS:
				getPrevStatements().clear();
				getPrevStatements().addAll((Collection<? extends SpellElement>)newValue);
				return;
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS:
				getAlternativeNextStatements().clear();
				getAlternativeNextStatements().addAll((Collection<? extends SpellElement>)newValue);
				return;
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS:
				getAlternativePrevStatements().clear();
				getAlternativePrevStatements().addAll((Collection<? extends SpellElement>)newValue);
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
			case SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS:
				getNextStatements().clear();
				return;
			case SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS:
				getPrevStatements().clear();
				return;
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS:
				getAlternativeNextStatements().clear();
				return;
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS:
				getAlternativePrevStatements().clear();
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
			case SpellPackage.SPELL_ELEMENT__NEXT_STATEMENTS:
				return nextStatements != null && !nextStatements.isEmpty();
			case SpellPackage.SPELL_ELEMENT__PREV_STATEMENTS:
				return prevStatements != null && !prevStatements.isEmpty();
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS:
				return alternativeNextStatements != null && !alternativeNextStatements.isEmpty();
			case SpellPackage.SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS:
				return alternativePrevStatements != null && !alternativePrevStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	protected EList<SpellElement> updateNextStatements(SpellElement... statements){
		return updateNextStatements(Arrays.asList(statements));		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	protected EList<SpellElement> updateNextStatements(java.util.List<? extends SpellElement> statements){
		
		EList<SpellElement> prevStmts = new BasicEList<SpellElement>();

		if (!statements.isEmpty()){
			
			prevStmts.add(this);

			for (SpellElement nextStmt : statements) {
				
				for (SpellElement spellElement : prevStmts) {
					spellElement.getNextStatements().add(nextStmt);			
				}

				prevStmts = nextStmt.addControlFlowInformation();
				if (prevStmts.isEmpty()){
					prevStmts.add(nextStmt);
				}
			}			
			
		}

		if (prevStmts.isEmpty() && statements.isEmpty()){
			prevStmts.add(this);
		}
			
		return prevStmts;
	}
	
	
	

} //SpellElementImpl
