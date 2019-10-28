/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>import as names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_as_names#getImports <em>Imports</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_as_names#isOptionalComma <em>Optional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_as_names()
 * @model
 * @generated
 */
public interface import_as_names extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.import_as_name}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_as_names_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<import_as_name> getImports();

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_as_names_OptionalComma()
	 * @model
	 * @generated
	 */
	boolean isOptionalComma();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.import_as_names#isOptionalComma <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Comma</em>' attribute.
	 * @see #isOptionalComma()
	 * @generated
	 */
	void setOptionalComma(boolean value);

} // import_as_names
