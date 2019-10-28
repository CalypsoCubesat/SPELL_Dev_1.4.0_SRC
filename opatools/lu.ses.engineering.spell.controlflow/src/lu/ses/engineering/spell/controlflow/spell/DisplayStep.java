/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep#getId <em>Id</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getDisplayStep()
 * @model
 * @generated
 */
public interface DisplayStep extends power {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(arith_expr)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getDisplayStep_Id()
	 * @model containment="true"
	 * @generated
	 */
	arith_expr getId();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(arith_expr value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getDisplayStep_Description()
	 * @model containment="true"
	 * @generated
	 */
	arith_expr getDescription();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(arith_expr value);

} // DisplayStep
