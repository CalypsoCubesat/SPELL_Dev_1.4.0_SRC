/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>arglist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.arglist#getArguments <em>Arguments</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.arglist#getArgument <em>Argument</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.arglist#isOptionalComma <em>Optional Comma</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot1_test <em>Dot1 test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot1_arguments <em>Dot1 arguments</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot2_test <em>Dot2 test</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getarglist()
 * @model
 * @generated
 */
public interface arglist extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getarglist_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(argument)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getarglist_Argument()
	 * @model containment="true"
	 * @generated
	 */
	argument getArgument();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(argument value);

	/**
	 * Returns the value of the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Comma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Comma</em>' attribute.
	 * @see #setOptionalComma(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getarglist_OptionalComma()
	 * @model
	 * @generated
	 */
	boolean isOptionalComma();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.arglist#isOptionalComma <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Comma</em>' attribute.
	 * @see #isOptionalComma()
	 * @generated
	 */
	void setOptionalComma(boolean value);

	/**
	 * Returns the value of the '<em><b>Dot1 test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dot1 test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot1 test</em>' containment reference.
	 * @see #setDot1_test(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getarglist_Dot1_test()
	 * @model containment="true"
	 * @generated
	 */
	test getDot1_test();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot1_test <em>Dot1 test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot1 test</em>' containment reference.
	 * @see #getDot1_test()
	 * @generated
	 */
	void setDot1_test(test value);

	/**
	 * Returns the value of the '<em><b>Dot1 arguments</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dot1 arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot1 arguments</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getarglist_Dot1_arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<argument> getDot1_arguments();

	/**
	 * Returns the value of the '<em><b>Dot2 test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dot2 test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot2 test</em>' containment reference.
	 * @see #setDot2_test(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getarglist_Dot2_test()
	 * @model containment="true"
	 * @generated
	 */
	test getDot2_test();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot2_test <em>Dot2 test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot2 test</em>' containment reference.
	 * @see #getDot2_test()
	 * @generated
	 */
	void setDot2_test(test value);

} // arglist
