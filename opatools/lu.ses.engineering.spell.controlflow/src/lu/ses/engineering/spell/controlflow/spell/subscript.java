/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>subscript</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript1 <em>Subscript1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript2 <em>Subscript2</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSliceop <em>Sliceop</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsubscript()
 * @model
 * @generated
 */
public interface subscript extends SpellElement {
	/**
	 * Returns the value of the '<em><b>Subscript1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscript1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript1</em>' containment reference.
	 * @see #setSubscript1(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsubscript_Subscript1()
	 * @model containment="true"
	 * @generated
	 */
	test getSubscript1();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript1 <em>Subscript1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscript1</em>' containment reference.
	 * @see #getSubscript1()
	 * @generated
	 */
	void setSubscript1(test value);

	/**
	 * Returns the value of the '<em><b>Subscript2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscript2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript2</em>' containment reference.
	 * @see #setSubscript2(test)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsubscript_Subscript2()
	 * @model containment="true"
	 * @generated
	 */
	test getSubscript2();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript2 <em>Subscript2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscript2</em>' containment reference.
	 * @see #getSubscript2()
	 * @generated
	 */
	void setSubscript2(test value);

	/**
	 * Returns the value of the '<em><b>Sliceop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sliceop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sliceop</em>' containment reference.
	 * @see #setSliceop(sliceop)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsubscript_Sliceop()
	 * @model containment="true"
	 * @generated
	 */
	sliceop getSliceop();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSliceop <em>Sliceop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sliceop</em>' containment reference.
	 * @see #getSliceop()
	 * @generated
	 */
	void setSliceop(sliceop value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getsubscript_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // subscript
