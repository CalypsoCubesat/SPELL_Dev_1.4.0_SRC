/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list if</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.list_if#getOld_test <em>Old test</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getlist_if()
 * @model
 * @generated
 */
public interface list_if extends list_iter {
	/**
	 * Returns the value of the '<em><b>Old test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old test</em>' containment reference.
	 * @see #setOld_test(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getlist_if_Old_test()
	 * @model containment="true"
	 * @generated
	 */
	test getOld_test();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.list_if#getOld_test <em>Old test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old test</em>' containment reference.
	 * @see #getOld_test()
	 * @generated
	 */
	void setOld_test(test value);

} // list_if
