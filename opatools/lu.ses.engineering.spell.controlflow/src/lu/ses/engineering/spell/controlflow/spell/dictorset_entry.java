/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dictorset entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest1 <em>Test1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest2 <em>Test2</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorset_entry()
 * @model
 * @generated
 */
public interface dictorset_entry extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Test1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test1</em>' containment reference.
	 * @see #setTest1(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorset_entry_Test1()
	 * @model containment="true"
	 * @generated
	 */
	test getTest1();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest1 <em>Test1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test1</em>' containment reference.
	 * @see #getTest1()
	 * @generated
	 */
	void setTest1(test value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorset_entry_Test2()
	 * @model containment="true"
	 * @generated
	 */
	test getTest2();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest2 <em>Test2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test2</em>' containment reference.
	 * @see #getTest2()
	 * @generated
	 */
	void setTest2(test value);

} // dictorset_entry
