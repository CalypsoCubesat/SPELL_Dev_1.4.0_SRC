/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>testlist1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.testlist1#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist1()
 * @model
 * @generated
 */
public interface testlist1 extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist1_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<test> getTests();

} // testlist1
