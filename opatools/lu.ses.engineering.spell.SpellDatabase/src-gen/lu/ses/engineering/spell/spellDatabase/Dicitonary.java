/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dicitonary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.Dicitonary#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDicitonary()
 * @model
 * @generated
 */
public interface Dicitonary extends Dictionary
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDicitonary_Entries()
   * @model containment="true"
   * @generated
   */
  EList<DictionaryEntry> getEntries();

} // Dicitonary
