/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>not test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.not_test#getNot <em>Not</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.not_test#getComparison <em>Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getnot_test()
 * @model
 * @generated
 */
public interface not_test extends and_test {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getnot_test_Not()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getNot();

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference.
	 * @see #setComparison(comparison)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getnot_test_Comparison()
	 * @model containment="true"
	 * @generated
	 */
	comparison getComparison();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.not_test#getComparison <em>Comparison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' containment reference.
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(comparison value);

} // not_test
