/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.factor#getFactor <em>Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfactor()
 * @model
 * @generated
 */
public interface factor extends term {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(factor)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfactor_Factor()
	 * @model containment="true"
	 * @generated
	 */
	factor getFactor();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.factor#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(factor value);

} // factor
