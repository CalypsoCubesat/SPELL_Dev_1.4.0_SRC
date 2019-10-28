/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.test#getIf_test <em>If test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.test#getIf_else_test <em>If else test</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettest()
 * @model
 * @generated
 */
public interface test extends testlist, argument {
	/**
	 * Returns the value of the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If test</em>' containment reference.
	 * @see #setIf_test(or_test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettest_If_test()
	 * @model containment="true"
	 * @generated
	 */
	or_test getIf_test();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.test#getIf_test <em>If test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If test</em>' containment reference.
	 * @see #getIf_test()
	 * @generated
	 */
	void setIf_test(or_test value);

	/**
	 * Returns the value of the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If else test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If else test</em>' containment reference.
	 * @see #setIf_else_test(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettest_If_else_test()
	 * @model containment="true"
	 * @generated
	 */
	test getIf_else_test();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.test#getIf_else_test <em>If else test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If else test</em>' containment reference.
	 * @see #getIf_else_test()
	 * @generated
	 */
	void setIf_else_test(test value);

} // test
