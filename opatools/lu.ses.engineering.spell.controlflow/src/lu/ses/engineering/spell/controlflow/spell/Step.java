/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.Step#getId <em>Id</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.Step#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends power {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(atom)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getStep_Id()
	 * @model containment="true"
	 * @generated
	 */
	atom getId();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.Step#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(atom value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(arith_expr)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getStep_Description()
	 * @model containment="true"
	 * @generated
	 */
	arith_expr getDescription();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.Step#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(arith_expr value);

} // Step
