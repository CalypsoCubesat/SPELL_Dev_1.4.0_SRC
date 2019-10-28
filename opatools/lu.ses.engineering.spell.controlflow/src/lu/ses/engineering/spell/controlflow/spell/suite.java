/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.suite#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsuite()
 * @model
 * @generated
 */
public interface suite extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.stmt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmts</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsuite_Stmts()
	 * @model containment="true"
	 * @generated
	 */
	EList<stmt> getStmts();

} // suite
