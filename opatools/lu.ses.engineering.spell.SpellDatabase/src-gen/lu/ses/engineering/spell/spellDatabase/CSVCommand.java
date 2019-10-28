/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.CSVCommand#getCommand <em>Command</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.CSVCommand#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVCommand()
 * @model
 * @generated
 */
public interface CSVCommand extends CSVEntry
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see #setCommand(String)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVCommand_Command()
   * @model
   * @generated
   */
  String getCommand();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.CSVCommand#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see #getCommand()
   * @generated
   */
  void setCommand(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link lu.ses.engineering.spell.spellDatabase.TCArgs}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVCommand_Args()
   * @model containment="true"
   * @generated
   */
  EList<TCArgs> getArgs();

} // CSVCommand
