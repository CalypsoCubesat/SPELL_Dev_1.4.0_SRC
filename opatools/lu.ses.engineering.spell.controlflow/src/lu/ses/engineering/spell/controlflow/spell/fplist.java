/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fplist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.fplist#getDef1 <em>Def1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.fplist#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.fplist#isOptionalSemicolon <em>Optional Semicolon</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfplist()
 * @model
 * @generated
 */
public interface fplist extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Def1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def1</em>' containment reference.
	 * @see #setDef1(fpdef)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfplist_Def1()
	 * @model containment="true"
	 * @generated
	 */
	fpdef getDef1();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.fplist#getDef1 <em>Def1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def1</em>' containment reference.
	 * @see #getDef1()
	 * @generated
	 */
	void setDef1(fpdef value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.fpdef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfplist_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<fpdef> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Optional Semicolon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Semicolon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Semicolon</em>' attribute.
	 * @see #setOptionalSemicolon(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfplist_OptionalSemicolon()
	 * @model
	 * @generated
	 */
	boolean isOptionalSemicolon();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.fplist#isOptionalSemicolon <em>Optional Semicolon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Semicolon</em>' attribute.
	 * @see #isOptionalSemicolon()
	 * @generated
	 */
	void setOptionalSemicolon(boolean value);

} // fplist
