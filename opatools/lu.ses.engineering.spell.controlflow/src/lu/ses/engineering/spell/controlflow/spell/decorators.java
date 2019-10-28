/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>decorators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.decorators#getDecorators <em>Decorators</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorators()
 * @model
 * @generated
 */
public interface decorators extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.decorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdecorators_Decorators()
	 * @model containment="true"
	 * @generated
	 */
	EList<decorator> getDecorators();

} // decorators
