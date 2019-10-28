/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>comp if</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.comp_if#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getcomp_if()
 * @model
 * @generated
 */
public interface comp_if extends comp_iter {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getcomp_if_Test()
	 * @model containment="true"
	 * @generated
	 */
	test getTest();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.comp_if#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(test value);

} // comp_if
