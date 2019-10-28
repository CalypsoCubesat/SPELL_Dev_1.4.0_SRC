/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.simple_stmt#getStmt <em>Stmt</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.simple_stmt#isAdditionalComma <em>Additional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsimple_stmt()
 * @model
 * @generated
 */
public interface simple_stmt extends stmt, suite {
	/**
	 * Returns the value of the '<em><b>Stmt</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.small_stmt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmt</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsimple_stmt_Stmt()
	 * @model containment="true"
	 * @generated
	 */
	EList<small_stmt> getStmt();

	/**
	 * Returns the value of the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Comma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Comma</em>' attribute.
	 * @see #setAdditionalComma(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsimple_stmt_AdditionalComma()
	 * @model
	 * @generated
	 */
	boolean isAdditionalComma();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.simple_stmt#isAdditionalComma <em>Additional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Comma</em>' attribute.
	 * @see #isAdditionalComma()
	 * @generated
	 */
	void setAdditionalComma(boolean value);

} // simple_stmt
