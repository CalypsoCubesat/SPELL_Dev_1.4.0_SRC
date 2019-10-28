/**
 */
package lu.ses.engineering.spell.spellDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Spell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.CSVSpell#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVSpell()
 * @model
 * @generated
 */
public interface CSVSpell extends CSVEntry
{
  /**
   * Returns the value of the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd</em>' containment reference.
   * @see #setCmd(SpellCommand)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVSpell_Cmd()
   * @model containment="true"
   * @generated
   */
  SpellCommand getCmd();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.CSVSpell#getCmd <em>Cmd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd</em>' containment reference.
   * @see #getCmd()
   * @generated
   */
  void setCmd(SpellCommand value);

} // CSVSpell
