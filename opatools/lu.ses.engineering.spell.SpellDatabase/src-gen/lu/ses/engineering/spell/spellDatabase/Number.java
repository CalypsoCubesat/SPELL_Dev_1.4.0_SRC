/**
 */
package lu.ses.engineering.spell.spellDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.Number#getValInt <em>Val Int</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.Number#getValStr <em>Val Str</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends Atom
{
  /**
   * Returns the value of the '<em><b>Val Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Int</em>' attribute.
   * @see #setValInt(int)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getNumber_ValInt()
   * @model
   * @generated
   */
  int getValInt();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.Number#getValInt <em>Val Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Int</em>' attribute.
   * @see #getValInt()
   * @generated
   */
  void setValInt(int value);

  /**
   * Returns the value of the '<em><b>Val Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Str</em>' attribute.
   * @see #setValStr(String)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getNumber_ValStr()
   * @model
   * @generated
   */
  String getValStr();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.Number#getValStr <em>Val Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Str</em>' attribute.
   * @see #getValStr()
   * @generated
   */
  void setValStr(String value);

} // Number
