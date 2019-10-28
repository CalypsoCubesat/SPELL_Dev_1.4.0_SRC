/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>return stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.return_stmt#getTestlist <em>Testlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getreturn_stmt()
 * @model
 * @generated
 */
public interface return_stmt extends flow_stmt {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getreturn_stmt_Testlist()
	 * @model containment="true"
	 * @generated
	 */
	testlist getTestlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.return_stmt#getTestlist <em>Testlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testlist</em>' containment reference.
	 * @see #getTestlist()
	 * @generated
	 */
	void setTestlist(testlist value);

} // return_stmt
