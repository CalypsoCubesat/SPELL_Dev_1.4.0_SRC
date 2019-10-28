/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.decorator#getDotted_name <em>Dotted name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.decorator#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.decorator#getArglist <em>Arglist</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorator()
 * @model
 * @generated
 */
public interface decorator extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Dotted name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dotted name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dotted name</em>' attribute.
	 * @see #setDotted_name(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorator_Dotted_name()
	 * @model
	 * @generated
	 */
	String getDotted_name();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.decorator#getDotted_name <em>Dotted name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dotted name</em>' attribute.
	 * @see #getDotted_name()
	 * @generated
	 */
	void setDotted_name(String value);

	/**
	 * Returns the value of the '<em><b>Round Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Bracket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Bracket</em>' attribute.
	 * @see #setRoundBracket(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorator_RoundBracket()
	 * @model
	 * @generated
	 */
	boolean isRoundBracket();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.decorator#isRoundBracket <em>Round Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Bracket</em>' attribute.
	 * @see #isRoundBracket()
	 * @generated
	 */
	void setRoundBracket(boolean value);

	/**
	 * Returns the value of the '<em><b>Arglist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arglist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arglist</em>' containment reference.
	 * @see #setArglist(arglist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorator_Arglist()
	 * @model containment="true"
	 * @generated
	 */
	arglist getArglist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.decorator#getArglist <em>Arglist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arglist</em>' containment reference.
	 * @see #getArglist()
	 * @generated
	 */
	void setArglist(arglist value);

} // decorator
