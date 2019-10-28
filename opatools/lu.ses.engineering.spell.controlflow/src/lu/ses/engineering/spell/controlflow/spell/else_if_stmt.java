/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>else if stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getelse_if_stmt()
 * @model
 * @generated
 */
public interface else_if_stmt extends SpellElement {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getelse_if_stmt_Test()
	 * @model containment="true"
	 * @generated
	 */
	test getTest();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getTest <em>Test</em>}' containment reference.
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getelse_if_stmt_Suite()
	 * @model containment="true"
	 * @generated
	 */
	suite getSuite();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(suite value);

} // else_if_stmt
