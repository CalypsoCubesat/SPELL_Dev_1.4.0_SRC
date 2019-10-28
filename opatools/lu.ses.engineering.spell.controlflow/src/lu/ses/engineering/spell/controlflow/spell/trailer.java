/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>trailer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.trailer#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.trailer#getArglist <em>Arglist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.trailer#isSquareBracket <em>Square Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.trailer#getSubscriptlist <em>Subscriptlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.trailer#getDotName <em>Dot Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettrailer()
 * @model
 * @generated
 */
public interface trailer extends SpellElement {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettrailer_RoundBracket()
	 * @model
	 * @generated
	 */
	boolean isRoundBracket();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.trailer#isRoundBracket <em>Round Bracket</em>}' attribute.
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettrailer_Arglist()
	 * @model containment="true"
	 * @generated
	 */
	arglist getArglist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.trailer#getArglist <em>Arglist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arglist</em>' containment reference.
	 * @see #getArglist()
	 * @generated
	 */
	void setArglist(arglist value);

	/**
	 * Returns the value of the '<em><b>Square Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Square Bracket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square Bracket</em>' attribute.
	 * @see #setSquareBracket(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettrailer_SquareBracket()
	 * @model
	 * @generated
	 */
	boolean isSquareBracket();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.trailer#isSquareBracket <em>Square Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Square Bracket</em>' attribute.
	 * @see #isSquareBracket()
	 * @generated
	 */
	void setSquareBracket(boolean value);

	/**
	 * Returns the value of the '<em><b>Subscriptlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriptlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptlist</em>' containment reference.
	 * @see #setSubscriptlist(subscriptlist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettrailer_Subscriptlist()
	 * @model containment="true"
	 * @generated
	 */
	subscriptlist getSubscriptlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.trailer#getSubscriptlist <em>Subscriptlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriptlist</em>' containment reference.
	 * @see #getSubscriptlist()
	 * @generated
	 */
	void setSubscriptlist(subscriptlist value);

	/**
	 * Returns the value of the '<em><b>Dot Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dot Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot Name</em>' attribute.
	 * @see #setDotName(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettrailer_DotName()
	 * @model
	 * @generated
	 */
	String getDotName();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.trailer#getDotName <em>Dot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot Name</em>' attribute.
	 * @see #getDotName()
	 * @generated
	 */
	void setDotName(String value);

} // trailer
