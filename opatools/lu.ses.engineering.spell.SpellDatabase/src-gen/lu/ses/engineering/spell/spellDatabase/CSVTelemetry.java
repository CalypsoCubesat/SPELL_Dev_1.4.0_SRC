/**
 */
package lu.ses.engineering.spell.spellDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Telemetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.CSVTelemetry#getTmArg <em>Tm Arg</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVTelemetry()
 * @model
 * @generated
 */
public interface CSVTelemetry extends CSVEntry
{
  /**
   * Returns the value of the '<em><b>Tm Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tm Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tm Arg</em>' containment reference.
   * @see #setTmArg(TCArgs)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getCSVTelemetry_TmArg()
   * @model containment="true"
   * @generated
   */
  TCArgs getTmArg();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.CSVTelemetry#getTmArg <em>Tm Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tm Arg</em>' containment reference.
   * @see #getTmArg()
   * @generated
   */
  void setTmArg(TCArgs value);

} // CSVTelemetry
