/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>comp for</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.comp_for#getExprlist <em>Exprlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.comp_for#getOr_test <em>Or test</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getcomp_for()
 * @model
 * @generated
 */
public interface comp_for extends comp_iter {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getcomp_for_Exprlist()
	 * @model containment="true"
	 * @generated
	 */
	exprlist getExprlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.comp_for#getExprlist <em>Exprlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exprlist</em>' containment reference.
	 * @see #getExprlist()
	 * @generated
	 */
	void setExprlist(exprlist value);

	/**
	 * Returns the value of the '<em><b>Or test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or test</em>' containment reference.
	 * @see #setOr_test(or_test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getcomp_for_Or_test()
	 * @model containment="true"
	 * @generated
	 */
	or_test getOr_test();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.comp_for#getOr_test <em>Or test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or test</em>' containment reference.
	 * @see #getOr_test()
	 * @generated
	 */
	void setOr_test(or_test value);

} // comp_for
