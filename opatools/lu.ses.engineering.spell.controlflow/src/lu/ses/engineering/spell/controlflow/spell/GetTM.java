/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get TM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.GetTM#getTm <em>Tm</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.GetTM#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGetTM()
 * @model
 * @generated
 */
public interface GetTM extends power {
	/**
	 * Returns the value of the '<em><b>Tm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm</em>' containment reference.
	 * @see #setTm(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGetTM_Tm()
	 * @model containment="true"
	 * @generated
	 */
	test getTm();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.GetTM#getTm <em>Tm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm</em>' containment reference.
	 * @see #getTm()
	 * @generated
	 */
	void setTm(test value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.arglist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getGetTM_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<arglist> getArgs();

} // GetTM
