/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.CSVFile#getCsvEntries <em>Csv Entries</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVFile()
 * @model
 * @generated
 */
public interface CSVFile extends SpellDatabase
{
  /**
   * Returns the value of the '<em><b>Csv Entries</b></em>' containment reference list.
   * The list contents are of type {@link lu.ses.engineering.spell.spellDatabase.CSVEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Csv Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Csv Entries</em>' containment reference list.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVFile_CsvEntries()
   * @model containment="true"
   * @generated
   */
  EList<CSVEntry> getCsvEntries();

} // CSVFile
