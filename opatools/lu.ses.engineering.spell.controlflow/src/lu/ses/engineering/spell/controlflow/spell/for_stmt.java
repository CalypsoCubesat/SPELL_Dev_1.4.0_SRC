/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getExprlist <em>Exprlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getTestlist <em>Testlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getSuite <em>Suite</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfor_stmt()
 * @model
 * @generated
 */
public interface for_stmt extends compound_stmt {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfor_stmt_Exprlist()
	 * @model containment="true"
	 * @generated
	 */
	exprlist getExprlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getExprlist <em>Exprlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exprlist</em>' containment reference.
	 * @see #getExprlist()
	 * @generated
	 */
	void setExprlist(exprlist value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfor_stmt_Testlist()
	 * @model containment="true"
	 * @generated
	 */
	testlist getTestlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getTestlist <em>Testlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testlist</em>' containment reference.
	 * @see #getTestlist()
	 * @generated
	 */
	void setTestlist(testlist value);

	/**
	 * Returns the value of the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suite</em>' containment reference.
	 * @see #setSuite(suite)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfor_stmt_Suite()
	 * @model containment="true"
	 * @generated
	 */
	suite getSuite();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(suite value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(suite)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfor_stmt_Else()
	 * @model containment="true"
	 * @generated
	 */
	suite getElse();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(suite value);

} // for_stmt
