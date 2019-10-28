/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spell Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.SpellDatabase#getDatabaseEntry <em>Database Entry</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getSpellDatabase()
 * @model
 * @generated
 */
public interface SpellDatabase extends EObject
{
  /**
   * Returns the value of the '<em><b>Database Entry</b></em>' containment reference list.
   * The list contents are of type {@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database Entry</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database Entry</em>' containment reference list.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getSpellDatabase_DatabaseEntry()
   * @model containment="true"
   * @generated
   */
  EList<DatabaseEntry> getDatabaseEntry();

} // SpellDatabase
