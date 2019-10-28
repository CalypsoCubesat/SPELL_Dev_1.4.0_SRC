/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>yield stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.yield_stmt#getYield_expr <em>Yield expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getyield_stmt()
 * @model
 * @generated
 */
public interface yield_stmt extends flow_stmt {
	/**
	 * Returns the value of the '<em><b>Yield expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield expr</em>' containment reference.
	 * @see #setYield_expr(yield_expr)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getyield_stmt_Yield_expr()
	 * @model containment="true"
	 * @generated
	 */
	yield_expr getYield_expr();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.yield_stmt#getYield_expr <em>Yield expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield expr</em>' containment reference.
	 * @see #getYield_expr()
	 * @generated
	 */
	void setYield_expr(yield_expr value);

} // yield_stmt
