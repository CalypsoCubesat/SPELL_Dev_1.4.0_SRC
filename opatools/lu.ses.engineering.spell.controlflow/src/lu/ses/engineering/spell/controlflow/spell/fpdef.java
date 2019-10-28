/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fpdef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.fpdef#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.fpdef#getFplist <em>Fplist</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfpdef()
 * @model
 * @generated
 */
public interface fpdef extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfpdef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.fpdef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fplist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fplist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fplist</em>' containment reference.
	 * @see #setFplist(fplist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getfpdef_Fplist()
	 * @model containment="true"
	 * @generated
	 */
	fplist getFplist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.fpdef#getFplist <em>Fplist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fplist</em>' containment reference.
	 * @see #getFplist()
	 * @generated
	 */
	void setFplist(fplist value);

} // fpdef
