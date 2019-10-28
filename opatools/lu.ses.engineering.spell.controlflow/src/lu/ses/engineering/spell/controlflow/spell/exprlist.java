/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exprlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.exprlist#getExprs <em>Exprs</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.exprlist#isOptionalComma <em>Optional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexprlist()
 * @model
 * @generated
 */
public interface exprlist extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.expr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexprlist_Exprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<expr> getExprs();

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getexprlist_OptionalComma()
	 * @model
	 * @generated
	 */
	boolean isOptionalComma();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.exprlist#isOptionalComma <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Comma</em>' attribute.
	 * @see #isOptionalComma()
	 * @generated
	 */
	void setOptionalComma(boolean value);

} // exprlist
