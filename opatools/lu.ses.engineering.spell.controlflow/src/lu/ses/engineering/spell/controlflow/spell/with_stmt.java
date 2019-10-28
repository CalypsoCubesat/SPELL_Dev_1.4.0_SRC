/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>with stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.with_stmt#getWith_item <em>With item</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.with_stmt#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getwith_stmt()
 * @model
 * @generated
 */
public interface with_stmt extends compound_stmt {
	/**
	 * Returns the value of the '<em><b>With item</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.with_item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With item</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getwith_stmt_With_item()
	 * @model containment="true"
	 * @generated
	 */
	EList<with_item> getWith_item();

	/**
	 * Returns the value of the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suite</em>' containment reference.
	 * @see #setSuite(suite)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getwith_stmt_Suite()
	 * @model containment="true"
	 * @generated
	 */
	suite getSuite();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.with_stmt#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(suite value);

} // with_stmt
