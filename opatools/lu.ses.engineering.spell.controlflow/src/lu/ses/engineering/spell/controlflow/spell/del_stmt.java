/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>del stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.del_stmt#getExprlist <em>Exprlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdel_stmt()
 * @model
 * @generated
 */
public interface del_stmt extends small_stmt {
	/**
	 * Returns the value of the '<em><b>Exprlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exprlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprlist</em>' containment reference.
	 * @see #setExprlist(exprlist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdel_stmt_Exprlist()
	 * @model containment="true"
	 * @generated
	 */
	exprlist getExprlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.del_stmt#getExprlist <em>Exprlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exprlist</em>' containment reference.
	 * @see #getExprlist()
	 * @generated
	 */
	void setExprlist(exprlist value);

} // del_stmt