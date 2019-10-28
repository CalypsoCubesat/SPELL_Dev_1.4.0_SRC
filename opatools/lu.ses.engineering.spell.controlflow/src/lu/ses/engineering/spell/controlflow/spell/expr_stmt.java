/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expr stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getLeft <em>Left</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexpr_stmt()
 * @model
 * @generated
 */
public interface expr_stmt extends small_stmt {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(testlist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexpr_stmt_Left()
	 * @model containment="true"
	 * @generated
	 */
	testlist getLeft();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(testlist value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexpr_stmt_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(yield_or_testlist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexpr_stmt_Right()
	 * @model containment="true"
	 * @generated
	 */
	yield_or_testlist getRight();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(yield_or_testlist value);

} // expr_stmt
