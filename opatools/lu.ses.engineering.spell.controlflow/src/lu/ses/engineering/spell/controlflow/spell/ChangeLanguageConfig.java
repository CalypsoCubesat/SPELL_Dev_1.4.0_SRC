/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Language Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getStatement <em>Statement</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getChangeLanguageConfig()
 * @model
 * @generated
 */
public interface ChangeLanguageConfig extends power {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getChangeLanguageConfig_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference.
	 * @see #setArgs(arglist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getChangeLanguageConfig_Args()
	 * @model containment="true"
	 * @generated
	 */
	arglist getArgs();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getArgs <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' containment reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(arglist value);

} // ChangeLanguageConfig
