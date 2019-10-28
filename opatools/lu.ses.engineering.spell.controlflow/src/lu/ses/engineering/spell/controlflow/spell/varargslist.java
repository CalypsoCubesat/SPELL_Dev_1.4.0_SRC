/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>varargslist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getVarargs1 <em>Varargs1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot1Name <em>Dot1 Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot2Name <em>Dot2 Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot3Name <em>Dot3 Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getVararg2 <em>Vararg2</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getVarargs3 <em>Varargs3</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.varargslist#isAdditionalComma <em>Additional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist()
 * @model
 * @generated
 */
public interface varargslist extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Varargs1</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.varargslist_element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varargs1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs1</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_Varargs1()
	 * @model containment="true"
	 * @generated
	 */
	EList<varargslist_element> getVarargs1();

	/**
	 * Returns the value of the '<em><b>Dot1 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dot1 Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot1 Name</em>' attribute.
	 * @see #setDot1Name(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_Dot1Name()
	 * @model
	 * @generated
	 */
	String getDot1Name();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot1Name <em>Dot1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot1 Name</em>' attribute.
	 * @see #getDot1Name()
	 * @generated
	 */
	void setDot1Name(String value);

	/**
	 * Returns the value of the '<em><b>Dot2 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dot2 Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot2 Name</em>' attribute.
	 * @see #setDot2Name(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_Dot2Name()
	 * @model
	 * @generated
	 */
	String getDot2Name();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot2Name <em>Dot2 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot2 Name</em>' attribute.
	 * @see #getDot2Name()
	 * @generated
	 */
	void setDot2Name(String value);

	/**
	 * Returns the value of the '<em><b>Dot3 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dot3 Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot3 Name</em>' attribute.
	 * @see #setDot3Name(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_Dot3Name()
	 * @model
	 * @generated
	 */
	String getDot3Name();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot3Name <em>Dot3 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot3 Name</em>' attribute.
	 * @see #getDot3Name()
	 * @generated
	 */
	void setDot3Name(String value);

	/**
	 * Returns the value of the '<em><b>Vararg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vararg2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vararg2</em>' containment reference.
	 * @see #setVararg2(varargslist_element)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_Vararg2()
	 * @model containment="true"
	 * @generated
	 */
	varargslist_element getVararg2();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getVararg2 <em>Vararg2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vararg2</em>' containment reference.
	 * @see #getVararg2()
	 * @generated
	 */
	void setVararg2(varargslist_element value);

	/**
	 * Returns the value of the '<em><b>Varargs3</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.varargslist_element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varargs3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs3</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_Varargs3()
	 * @model containment="true"
	 * @generated
	 */
	EList<varargslist_element> getVarargs3();

	/**
	 * Returns the value of the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Comma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Comma</em>' attribute.
	 * @see #setAdditionalComma(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getvarargslist_AdditionalComma()
	 * @model
	 * @generated
	 */
	boolean isAdditionalComma();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#isAdditionalComma <em>Additional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Comma</em>' attribute.
	 * @see #isAdditionalComma()
	 * @generated
	 */
	void setAdditionalComma(boolean value);

} // varargslist
