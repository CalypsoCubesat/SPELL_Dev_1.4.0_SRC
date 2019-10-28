/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>import from</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_from#getDots <em>Dots</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_from#getDotted_name <em>Dotted name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_from#getDots2 <em>Dots2</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_from#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.import_from#getImport_as_names <em>Import as names</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_from()
 * @model
 * @generated
 */
public interface import_from extends import_stmt {
	/**
	 * Returns the value of the '<em><b>Dots</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dots</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dots</em>' attribute list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_from_Dots()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDots();

	/**
	 * Returns the value of the '<em><b>Dotted name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dotted name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dotted name</em>' attribute.
	 * @see #setDotted_name(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_from_Dotted_name()
	 * @model
	 * @generated
	 */
	String getDotted_name();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.import_from#getDotted_name <em>Dotted name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dotted name</em>' attribute.
	 * @see #getDotted_name()
	 * @generated
	 */
	void setDotted_name(String value);

	/**
	 * Returns the value of the '<em><b>Dots2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dots2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dots2</em>' attribute list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_from_Dots2()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDots2();

	/**
	 * Returns the value of the '<em><b>Round Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Bracket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Bracket</em>' attribute.
	 * @see #setRoundBracket(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_from_RoundBracket()
	 * @model
	 * @generated
	 */
	boolean isRoundBracket();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.import_from#isRoundBracket <em>Round Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Bracket</em>' attribute.
	 * @see #isRoundBracket()
	 * @generated
	 */
	void setRoundBracket(boolean value);

	/**
	 * Returns the value of the '<em><b>Import as names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import as names</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import as names</em>' containment reference.
	 * @see #setImport_as_names(import_as_names)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getimport_from_Import_as_names()
	 * @model containment="true"
	 * @generated
	 */
	import_as_names getImport_as_names();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.import_from#getImport_as_names <em>Import as names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import as names</em>' containment reference.
	 * @see #getImport_as_names()
	 * @generated
	 */
	void setImport_as_names(import_as_names value);

} // import_from
