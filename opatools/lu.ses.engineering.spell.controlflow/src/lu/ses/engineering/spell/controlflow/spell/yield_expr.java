/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>yield expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.yield_expr#getTestlist <em>Testlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getyield_expr()
 * @model
 * @generated
 */
public interface yield_expr extends yield_or_testlist, yield_or_testlist_comp {
	/**
	 * Returns the value of the '<em><b>Testlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testlist</em>' containment reference.
	 * @see #setTestlist(testlist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getyield_expr_Testlist()
	 * @model containment="true"
	 * @generated
	 */
	testlist getTestlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.yield_expr#getTestlist <em>Testlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testlist</em>' containment reference.
	 * @see #getTestlist()
	 * @generated
	 */
	void setTestlist(testlist value);

} // yield_expr
