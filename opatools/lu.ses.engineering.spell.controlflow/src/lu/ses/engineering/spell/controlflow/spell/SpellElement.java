/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getNextStatements <em>Next Statements</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getPrevStatements <em>Prev Statements</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativeNextStatements <em>Alternative Next Statements</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativePrevStatements <em>Alternative Prev Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getSpellElement()
 * @model
 * @generated
 */
public interface SpellElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Next Statements</b></em>' reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.SpellElement}.
	 * It is bidirectional and its opposite is '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getPrevStatements <em>Prev Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Statements</em>' reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getSpellElement_NextStatements()
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getPrevStatements
	 * @model opposite="prevStatements"
	 * @generated
	 */
	EList<SpellElement> getNextStatements();

	/**
	 * Returns the value of the '<em><b>Prev Statements</b></em>' reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.SpellElement}.
	 * It is bidirectional and its opposite is '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getNextStatements <em>Next Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Statements</em>' reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getSpellElement_PrevStatements()
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getNextStatements
	 * @model opposite="nextStatements"
	 * @generated
	 */
	EList<SpellElement> getPrevStatements();

	/**
	 * Returns the value of the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.SpellElement}.
	 * It is bidirectional and its opposite is '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativePrevStatements <em>Alternative Prev Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Next Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Next Statements</em>' reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getSpellElement_AlternativeNextStatements()
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativePrevStatements
	 * @model opposite="alternativePrevStatements"
	 * @generated
	 */
	EList<SpellElement> getAlternativeNextStatements();

	/**
	 * Returns the value of the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.SpellElement}.
	 * It is bidirectional and its opposite is '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativeNextStatements <em>Alternative Next Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Prev Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Prev Statements</em>' reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getSpellElement_AlternativePrevStatements()
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativeNextStatements
	 * @model opposite="alternativeNextStatements"
	 * @generated
	 */
	EList<SpellElement> getAlternativePrevStatements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.BasicEList<SpellElement> list = new org.eclipse.emf.common.util.BasicEList<SpellElement>();\r\nlist.add(this);\r\nreturn list;'"
	 * @generated
	 */
	EList<SpellElement> addControlFlowInformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='getNextStatements().clear();\r\ngetAlternativeNextStatements().clear();\r\nfor (org.eclipse.emf.ecore.EObject eObj : eContents()){\r\n\tSpellElement ele = (SpellElement)eObj;\r\n\tele.clearControlFlowInformation();\r\n}'"
	 * @generated
	 */
	void clearControlFlowInformation();
} // SpellElement
