/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.Goto#getVariable <em>Variable</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.Goto#getTarget <em>Target</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.Goto#getExpr <em>Expr</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.Goto#getHash <em>Hash</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGoto()
 * @model
 * @generated
 */
public interface Goto extends power {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGoto_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGoto_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGoto_Expr()
	 * @model containment="true"
	 * @generated
	 */
	test getExpr();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(test value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGoto_Hash()
	 * @model transient="true"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

} // Goto
