/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.parameters#getVarargslist <em>Varargslist</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getparameters()
 * @model
 * @generated
 */
public interface parameters extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Varargslist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varargslist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargslist</em>' containment reference.
	 * @see #setVarargslist(varargslist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getparameters_Varargslist()
	 * @model containment="true"
	 * @generated
	 */
	varargslist getVarargslist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.parameters#getVarargslist <em>Varargslist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargslist</em>' containment reference.
	 * @see #getVarargslist()
	 * @generated
	 */
	void setVarargslist(varargslist value);

} // parameters
