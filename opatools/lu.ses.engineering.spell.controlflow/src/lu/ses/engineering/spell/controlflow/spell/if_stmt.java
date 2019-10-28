/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>if stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getSuite <em>Suite</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getElse_if_stmts <em>Else if stmts</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getif_stmt()
 * @model
 * @generated
 */
public interface if_stmt extends compound_stmt {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getif_stmt_Test()
	 * @model containment="true"
	 * @generated
	 */
	test getTest();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(test value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getif_stmt_Suite()
	 * @model containment="true"
	 * @generated
	 */
	suite getSuite();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(suite value);

	/**
	 * Returns the value of the '<em><b>Else if stmts</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else if stmts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else if stmts</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getif_stmt_Else_if_stmts()
	 * @model containment="true"
	 * @generated
	 */
	EList<else_if_stmt> getElse_if_stmts();

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getif_stmt_Else()
	 * @model containment="true"
	 * @generated
	 */
	suite getElse();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(suite value);

} // if_stmt
