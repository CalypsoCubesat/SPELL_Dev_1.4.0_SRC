/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>single input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.single_input#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsingle_input()
 * @model
 * @generated
 */
public interface single_input extends python_input {
	/**
	 * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmt</em>' containment reference.
	 * @see #setStmt(stmt)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsingle_input_Stmt()
	 * @model containment="true"
	 * @generated
	 */
	stmt getStmt();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.single_input#getStmt <em>Stmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stmt</em>' containment reference.
	 * @see #getStmt()
	 * @generated
	 */
	void setStmt(stmt value);

} // single_input
