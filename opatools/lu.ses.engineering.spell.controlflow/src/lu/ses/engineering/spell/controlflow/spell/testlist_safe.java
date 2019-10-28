/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>testlist safe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.testlist_safe#getOld_test <em>Old test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.testlist_safe#isOptionalComa <em>Optional Coma</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_safe()
 * @model
 * @generated
 */
public interface testlist_safe extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Old test</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old test</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old test</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_safe_Old_test()
	 * @model containment="true"
	 * @generated
	 */
	EList<test> getOld_test();

	/**
	 * Returns the value of the '<em><b>Optional Coma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Coma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Coma</em>' attribute.
	 * @see #setOptionalComa(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettestlist_safe_OptionalComa()
	 * @model
	 * @generated
	 */
	boolean isOptionalComa();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.testlist_safe#isOptionalComa <em>Optional Coma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Coma</em>' attribute.
	 * @see #isOptionalComa()
	 * @generated
	 */
	void setOptionalComa(boolean value);

} // testlist_safe
