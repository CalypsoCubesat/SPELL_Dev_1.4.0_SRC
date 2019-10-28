/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dictorsetmaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getEntries <em>Entries</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getComp_for <em>Comp for</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#isOptionalComma <em>Optional Comma</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorsetmaker()
 * @model
 * @generated
 */
public interface dictorsetmaker extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorsetmaker_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<dictorset_entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp for</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp for</em>' containment reference.
	 * @see #setComp_for(comp_for)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorsetmaker_Comp_for()
	 * @model containment="true"
	 * @generated
	 */
	comp_for getComp_for();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getComp_for <em>Comp for</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp for</em>' containment reference.
	 * @see #getComp_for()
	 * @generated
	 */
	void setComp_for(comp_for value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorsetmaker_OptionalComma()
	 * @model
	 * @generated
	 */
	boolean isOptionalComma();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#isOptionalComma <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Comma</em>' attribute.
	 * @see #isOptionalComma()
	 * @generated
	 */
	void setOptionalComma(boolean value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getdictorsetmaker_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<test> getTests();

} // dictorsetmaker
