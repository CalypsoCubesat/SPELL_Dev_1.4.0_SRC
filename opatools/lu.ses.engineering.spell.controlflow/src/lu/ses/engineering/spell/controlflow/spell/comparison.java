/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.comparison#getComp_op <em>Comp op</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getcomparison()
 * @model
 * @generated
 */
public interface comparison extends not_test {
	/**
	 * Returns the value of the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp op</em>' attribute.
	 * @see #setComp_op(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getcomparison_Comp_op()
	 * @model
	 * @generated
	 */
	String getComp_op();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.comparison#getComp_op <em>Comp op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp op</em>' attribute.
	 * @see #getComp_op()
	 * @generated
	 */
	void setComp_op(String value);

} // comparison
