/**
 */
package lu.ses.engineering.spell.spellDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.Lambda_Stmt#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getLambda_Stmt()
 * @model
 * @generated
 */
public interface Lambda_Stmt extends Atom
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute.
   * @see #setVariables(String)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getLambda_Stmt_Variables()
   * @model
   * @generated
   */
  String getVariables();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.Lambda_Stmt#getVariables <em>Variables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' attribute.
   * @see #getVariables()
   * @generated
   */
  void setVariables(String value);

} // Lambda_Stmt
