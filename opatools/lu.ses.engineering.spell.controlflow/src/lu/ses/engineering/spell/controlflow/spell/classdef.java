/**
 */
package lu.ses.engineering.spell.controlflow.spell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>classdef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.classdef#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.classdef#isRoundBrackets <em>Round Brackets</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.classdef#getTestlist <em>Testlist</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.classdef#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getclassdef()
 * @model
 * @generated
 */
public interface classdef extends compound_stmt {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getclassdef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.classdef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Round Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Brackets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Brackets</em>' attribute.
	 * @see #setRoundBrackets(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getclassdef_RoundBrackets()
	 * @model
	 * @generated
	 */
	boolean isRoundBrackets();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.classdef#isRoundBrackets <em>Round Brackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Brackets</em>' attribute.
	 * @see #isRoundBrackets()
	 * @generated
	 */
	void setRoundBrackets(boolean value);

	/**
	 * Returns the value of the '<em><b>Testlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testlist</em>' containment reference.
	 * @see #setTestlist(testlist)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getclassdef_Testlist()
	 * @model containment="true"
	 * @generated
	 */
	testlist getTestlist();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.classdef#getTestlist <em>Testlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testlist</em>' containment reference.
	 * @see #getTestlist()
	 * @generated
	 */
	void setTestlist(testlist value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getclassdef_Suite()
	 * @model containment="true"
	 * @generated
	 */
	suite getSuite();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.classdef#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(suite value);

} // classdef
