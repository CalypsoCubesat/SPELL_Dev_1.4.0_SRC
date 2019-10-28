/**
 */
package lu.ses.engineering.spell.spellDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Astrium Spell Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumSpellDatabase()
 * @model
 * @generated
 */
public interface AstriumSpellDatabase extends SpellDatabase
{
  /**
   * Returns the value of the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' containment reference.
   * @see #setDatabase(AstriumDatabase)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumSpellDatabase_Database()
   * @model containment="true"
   * @generated
   */
  AstriumDatabase getDatabase();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase#getDatabase <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' containment reference.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(AstriumDatabase value);

} // AstriumSpellDatabase
