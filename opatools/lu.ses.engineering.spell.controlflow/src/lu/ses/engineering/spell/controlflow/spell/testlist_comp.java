/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>testlist comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getComp_for <em>Comp for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getAdditionalTests <em>Additional Tests</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#isOptionalComma <em>Optional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_comp()
 * @model
 * @generated
 */
public interface testlist_comp extends yield_or_testlist_comp {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_comp_Test()
	 * @model containment="true"
	 * @generated
	 */
	test getTest();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(test value);

	/**
	 * Returns the value of the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp for</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp for</em>' containment reference.
	 * @see #setComp_for(comp_for)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_comp_Comp_for()
	 * @model containment="true"
	 * @generated
	 */
	comp_for getComp_for();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getComp_for <em>Comp for</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp for</em>' containment reference.
	 * @see #getComp_for()
	 * @generated
	 */
	void setComp_for(comp_for value);

	/**
	 * Returns the value of the '<em><b>Additional Tests</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Tests</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_comp_AdditionalTests()
	 * @model containment="true"
	 * @generated
	 */
	EList<test> getAdditionalTests();

	/**
	 * Returns the value of the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Comma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Comma</em>' attribute.
	 * @see #setOptionalComma(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_comp_OptionalComma()
	 * @model
	 * @generated
	 */
	boolean isOptionalComma();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#isOptionalComma <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Comma</em>' attribute.
	 * @see #isOptionalComma()
	 * @generated
	 */
	void setOptionalComma(boolean value);

} // testlist_comp
