/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>lambdef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.lambdef#getVarargslist <em>Varargslist</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getlambdef()
 * @model
 * @generated
 */
public interface lambdef extends test {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getlambdef_Varargslist()
	 * @model containment="true"
	 * @generated
	 */
	varargslist getVarargslist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.lambdef#getVarargslist <em>Varargslist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargslist</em>' containment reference.
	 * @see #getVarargslist()
	 * @generated
	 */
	void setVarargslist(varargslist value);

} // lambdef
