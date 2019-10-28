/**
 */
package lu.ses.engineering.spell.spellDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Astrium Header Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumHeaderComment()
 * @model
 * @generated
 */
public interface AstriumHeaderComment extends AstriumHeaderEntry
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumHeaderComment_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

} // AstriumHeaderComment
