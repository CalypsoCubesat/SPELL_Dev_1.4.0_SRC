/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getKey <em>Key</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDictionaryEntry()
 * @model
 * @generated
 */
public interface DictionaryEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(DatabaseValue)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDictionaryEntry_Key()
   * @model containment="true"
   * @generated
   */
  DatabaseValue getKey();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(DatabaseValue value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(DatabaseValue)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDictionaryEntry_Value()
   * @model containment="true"
   * @generated
   */
  DatabaseValue getValue();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DatabaseValue value);

} // DictionaryEntry
