/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>varargslist element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element#getFpdef <em>Fpdef</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_element()
 * @model
 * @generated
 */
public interface varargslist_element extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Fpdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fpdef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fpdef</em>' containment reference.
	 * @see #setFpdef(fpdef)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_element_Fpdef()
	 * @model containment="true"
	 * @generated
	 */
	fpdef getFpdef();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element#getFpdef <em>Fpdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fpdef</em>' containment reference.
	 * @see #getFpdef()
	 * @generated
	 */
	void setFpdef(fpdef value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_element_Test()
	 * @model containment="true"
	 * @generated
	 */
	test getTest();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(test value);

} // varargslist_element
