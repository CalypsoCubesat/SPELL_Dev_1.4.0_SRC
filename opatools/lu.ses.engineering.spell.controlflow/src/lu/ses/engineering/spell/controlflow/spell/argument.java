/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.argument#getTest <em>Test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.argument#getComp_for <em>Comp for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.argument#getTest2 <em>Test2</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getargument()
 * @model
 * @generated
 */
public interface argument extends SpellElement {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getargument_Test()
	 * @model containment="true"
	 * @generated
	 */
	test getTest();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.argument#getTest <em>Test</em>}' containment reference.
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getargument_Comp_for()
	 * @model containment="true"
	 * @generated
	 */
	comp_for getComp_for();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.argument#getComp_for <em>Comp for</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp for</em>' containment reference.
	 * @see #getComp_for()
	 * @generated
	 */
	void setComp_for(comp_for value);

	/**
	 * Returns the value of the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test2</em>' containment reference.
	 * @see #setTest2(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getargument_Test2()
	 * @model containment="true"
	 * @generated
	 */
	test getTest2();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.argument#getTest2 <em>Test2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test2</em>' containment reference.
	 * @see #getTest2()
	 * @generated
	 */
	void setTest2(test value);

} // argument
