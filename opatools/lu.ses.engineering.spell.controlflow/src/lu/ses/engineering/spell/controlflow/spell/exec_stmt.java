/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exec stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.exec_stmt#getExpr <em>Expr</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.exec_stmt#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexec_stmt()
 * @model
 * @generated
 */
public interface exec_stmt extends small_stmt {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(expr)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexec_stmt_Expr()
	 * @model containment="true"
	 * @generated
	 */
	expr getExpr();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.exec_stmt#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(expr value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexec_stmt_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<test> getTests();

} // exec_stmt
