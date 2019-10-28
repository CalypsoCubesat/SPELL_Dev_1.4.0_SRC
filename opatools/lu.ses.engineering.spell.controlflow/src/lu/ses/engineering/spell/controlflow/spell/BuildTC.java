/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build TC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getCommand <em>Command</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getVerify <em>Verify</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getArguments <em>Arguments</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getValues <em>Values</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getBuildTC()
 * @model
 * @generated
 */
public interface BuildTC extends power {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(arglist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getBuildTC_Command()
	 * @model containment="true"
	 * @generated
	 */
	arglist getCommand();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(arglist value);

	/**
	 * Returns the value of the '<em><b>Verify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify</em>' containment reference.
	 * @see #setVerify(arglist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getBuildTC_Verify()
	 * @model containment="true"
	 * @generated
	 */
	arglist getVerify();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getVerify <em>Verify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify</em>' containment reference.
	 * @see #getVerify()
	 * @generated
	 */
	void setVerify(arglist value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getBuildTC_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<test> getArguments();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getBuildTC_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<test> getValues();

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.arglist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getBuildTC_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<arglist> getArgs();

} // BuildTC
