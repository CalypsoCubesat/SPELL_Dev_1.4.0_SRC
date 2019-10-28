/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>import name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_name#getDotted_as_names <em>Dotted as names</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_name()
 * @model
 * @generated
 */
public interface import_name extends import_stmt {
	/**
	 * Returns the value of the '<em><b>Dotted as names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dotted as names</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dotted as names</em>' containment reference.
	 * @see #setDotted_as_names(dotted_as_names)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_name_Dotted_as_names()
	 * @model containment="true"
	 * @generated
	 */
	dotted_as_names getDotted_as_names();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.import_name#getDotted_as_names <em>Dotted as names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dotted as names</em>' containment reference.
	 * @see #getDotted_as_names()
	 * @generated
	 */
	void setDotted_as_names(dotted_as_names value);

} // import_name
