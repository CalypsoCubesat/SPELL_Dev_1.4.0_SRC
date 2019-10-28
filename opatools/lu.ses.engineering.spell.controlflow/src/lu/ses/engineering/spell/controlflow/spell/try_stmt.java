/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>try stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getSuite <em>Suite</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getExcept_clause <em>Except clause</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getElse <em>Else</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getFinally <em>Finally</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettry_stmt()
 * @model
 * @generated
 */
public interface try_stmt extends compound_stmt {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettry_stmt_Suite()
	 * @model containment="true"
	 * @generated
	 */
	suite getSuite();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(suite value);

	/**
	 * Returns the value of the '<em><b>Except clause</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.except_clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Except clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Except clause</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettry_stmt_Except_clause()
	 * @model containment="true"
	 * @generated
	 */
	EList<except_clause> getExcept_clause();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(suite)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettry_stmt_Else()
	 * @model containment="true"
	 * @generated
	 */
	suite getElse();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(suite value);

	/**
	 * Returns the value of the '<em><b>Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finally</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally</em>' containment reference.
	 * @see #setFinally(suite)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#gettry_stmt_Finally()
	 * @model containment="true"
	 * @generated
	 */
	suite getFinally();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getFinally <em>Finally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally</em>' containment reference.
	 * @see #getFinally()
	 * @generated
	 */
	void setFinally(suite value);

} // try_stmt
