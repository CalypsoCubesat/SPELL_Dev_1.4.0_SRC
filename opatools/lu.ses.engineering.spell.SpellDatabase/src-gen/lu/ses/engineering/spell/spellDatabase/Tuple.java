/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.Tuple#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends ComplexValue
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link lu.ses.engineering.spell.spellDatabase.DatabaseValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getTuple_Values()
   * @model containment="true"
   * @generated
   */
  EList<DatabaseValue> getValues();

} // Tuple
