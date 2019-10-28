/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>decorated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.decorated#getDecorators <em>Decorators</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.decorated#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorated()
 * @model
 * @generated
 */
public interface decorated extends compound_stmt {
	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' containment reference.
	 * @see #setDecorators(decorators)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorated_Decorators()
	 * @model containment="true"
	 * @generated
	 */
	decorators getDecorators();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.decorated#getDecorators <em>Decorators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorators</em>' containment reference.
	 * @see #getDecorators()
	 * @generated
	 */
	void setDecorators(decorators value);

	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(compound_stmt)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorated_Def()
	 * @model containment="true"
	 * @generated
	 */
	compound_stmt getDef();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.decorated#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(compound_stmt value);

} // decorated
