/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list for</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.list_for#getExprlist <em>Exprlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.list_for#getTestlist_safe <em>Testlist safe</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getlist_for()
 * @model
 * @generated
 */
public interface list_for extends list_iter {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getlist_for_Exprlist()
	 * @model containment="true"
	 * @generated
	 */
	exprlist getExprlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.list_for#getExprlist <em>Exprlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exprlist</em>' containment reference.
	 * @see #getExprlist()
	 * @generated
	 */
	void setExprlist(exprlist value);

	/**
	 * Returns the value of the '<em><b>Testlist safe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testlist safe</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testlist safe</em>' containment reference.
	 * @see #setTestlist_safe(testlist_safe)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getlist_for_Testlist_safe()
	 * @model containment="true"
	 * @generated
	 */
	testlist_safe getTestlist_safe();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.list_for#getTestlist_safe <em>Testlist safe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testlist safe</em>' containment reference.
	 * @see #getTestlist_safe()
	 * @generated
	 */
	void setTestlist_safe(testlist_safe value);

} // list_for
