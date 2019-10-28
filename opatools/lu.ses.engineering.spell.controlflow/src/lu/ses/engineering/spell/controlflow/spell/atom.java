/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#isRoundBracket <em>Round Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#getYield_or_testlist_comp <em>Yield or testlist comp</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#isSquareBracket <em>Square Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#getListmaker <em>Listmaker</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#isCurlyBracket <em>Curly Bracket</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#getDictorsetmaker <em>Dictorsetmaker</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#getTestlist1 <em>Testlist1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.atom#getStrings <em>Strings</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom()
 * @model
 * @generated
 */
public interface atom extends power {
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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_RoundBracket()
	 * @model
	 * @generated
	 */
	boolean isRoundBracket();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#isRoundBracket <em>Round Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Bracket</em>' attribute.
	 * @see #isRoundBracket()
	 * @generated
	 */
	void setRoundBracket(boolean value);

	/**
	 * Returns the value of the '<em><b>Yield or testlist comp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield or testlist comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield or testlist comp</em>' containment reference.
	 * @see #setYield_or_testlist_comp(yield_or_testlist_comp)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_Yield_or_testlist_comp()
	 * @model containment="true"
	 * @generated
	 */
	yield_or_testlist_comp getYield_or_testlist_comp();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#getYield_or_testlist_comp <em>Yield or testlist comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield or testlist comp</em>' containment reference.
	 * @see #getYield_or_testlist_comp()
	 * @generated
	 */
	void setYield_or_testlist_comp(yield_or_testlist_comp value);

	/**
	 * Returns the value of the '<em><b>Square Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Square Bracket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square Bracket</em>' attribute.
	 * @see #setSquareBracket(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_SquareBracket()
	 * @model
	 * @generated
	 */
	boolean isSquareBracket();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#isSquareBracket <em>Square Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Square Bracket</em>' attribute.
	 * @see #isSquareBracket()
	 * @generated
	 */
	void setSquareBracket(boolean value);

	/**
	 * Returns the value of the '<em><b>Listmaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listmaker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listmaker</em>' containment reference.
	 * @see #setListmaker(listmaker)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_Listmaker()
	 * @model containment="true"
	 * @generated
	 */
	listmaker getListmaker();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#getListmaker <em>Listmaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listmaker</em>' containment reference.
	 * @see #getListmaker()
	 * @generated
	 */
	void setListmaker(listmaker value);

	/**
	 * Returns the value of the '<em><b>Curly Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curly Bracket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curly Bracket</em>' attribute.
	 * @see #setCurlyBracket(boolean)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_CurlyBracket()
	 * @model
	 * @generated
	 */
	boolean isCurlyBracket();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#isCurlyBracket <em>Curly Bracket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curly Bracket</em>' attribute.
	 * @see #isCurlyBracket()
	 * @generated
	 */
	void setCurlyBracket(boolean value);

	/**
	 * Returns the value of the '<em><b>Dictorsetmaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictorsetmaker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictorsetmaker</em>' containment reference.
	 * @see #setDictorsetmaker(dictorsetmaker)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_Dictorsetmaker()
	 * @model containment="true"
	 * @generated
	 */
	dictorsetmaker getDictorsetmaker();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#getDictorsetmaker <em>Dictorsetmaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictorsetmaker</em>' containment reference.
	 * @see #getDictorsetmaker()
	 * @generated
	 */
	void setDictorsetmaker(dictorsetmaker value);

	/**
	 * Returns the value of the '<em><b>Testlist1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testlist1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testlist1</em>' containment reference.
	 * @see #setTestlist1(testlist1)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_Testlist1()
	 * @model containment="true"
	 * @generated
	 */
	testlist1 getTestlist1();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#getTestlist1 <em>Testlist1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testlist1</em>' containment reference.
	 * @see #getTestlist1()
	 * @generated
	 */
	void setTestlist1(testlist1 value);

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
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.atom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Strings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strings</em>' attribute list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getatom_Strings()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStrings();

} // atom
