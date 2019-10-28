/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dotted as names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_names#getDotted_names <em>Dotted names</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdotted_as_names()
 * @model
 * @generated
 */
public interface dotted_as_names extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Dotted names</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.dotted_as_name}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dotted names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dotted names</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdotted_as_names_Dotted_names()
	 * @model containment="true"
	 * @generated
	 */
	EList<dotted_as_name> getDotted_names();

} // dotted_as_names
