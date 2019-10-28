/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>global stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.global_stmt#getGlobals <em>Globals</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getglobal_stmt()
 * @model
 * @generated
 */
public interface global_stmt extends small_stmt {
	/**
	 * Returns the value of the '<em><b>Globals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globals</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globals</em>' attribute list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getglobal_stmt_Globals()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getGlobals();

} // global_stmt
